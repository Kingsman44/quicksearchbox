package com.android.launcher3;

import android.appwidget.AppWidgetProviderInfo;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.MutableInt;
import android.util.Pair;
import com.android.launcher3.DeferredHandler;
import com.android.launcher3.compat.DeepShortcutManagerCompat;
import com.android.launcher3.compat.LauncherActivityInfoCompat;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.compat.UserManagerCompat;
import com.android.launcher3.model.WidgetsModel;
import com.android.launcher3.shortcuts.DeepShortcutKey;
import com.android.launcher3.shortcuts.ShortcutInfoCompat;
import com.android.launcher3.util.ComponentKey;
import com.android.launcher3.util.CursorIconInfo;
import com.android.launcher3.util.LongArrayMap;
import com.android.launcher3.util.ManagedProfileHeuristic;
import com.android.launcher3.util.MultiHashMap;
import com.android.launcher3.util.PackageManagerHelper;
import com.google.android.googlequicksearchbox.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public final class LauncherModel extends BroadcastReceiver implements LauncherAppsCompat.OnAppsChangedCallbackCompat {
    static final ArrayList mBindCompleteRunnables = new ArrayList();
    static final ArrayList mDeferredBindRunnables = new ArrayList();
    static final ArrayList sBgAppWidgets = new ArrayList();
    public static final LongArrayMap sBgFolders = new LongArrayMap();
    static final LongArrayMap sBgItemsIdMap = new LongArrayMap();
    public static final Object sBgLock = new Object();
    static final Map sBgPinnedShortcutCounts = new HashMap();
    static final ArrayList sBgWorkspaceItems = new ArrayList();
    static final ArrayList sBgWorkspaceScreens = new ArrayList();
    static final HashMap sPendingPackages = new HashMap();
    public static final Handler sWorker;
    public static final HandlerThread sWorkerThread;
    public boolean mAllAppsLoaded;
    final LauncherAppState mApp;
    public final AllAppsList mBgAllAppsList;
    public final MultiHashMap mBgDeepShortcutMap = new MultiHashMap();
    public final WidgetsModel mBgWidgetsModel;
    WeakReference mCallbacks;
    public final DeepShortcutManagerCompat mDeepShortcutManager;
    public boolean mDeepShortcutsLoaded;
    final DeferredHandler mHandler = new DeferredHandler();
    boolean mHasLoaderCompletedOnce;
    public boolean mHasShortcutHostPermission;
    public final IconCache mIconCache;
    boolean mIsLoaderTaskRunning;
    boolean mIsManagedHeuristicAppsUpdated;
    public final LauncherAppsCompat mLauncherApps;
    LoaderTask mLoaderTask;
    final Object mLock = new Object();
    public final boolean mOldContentProviderExists;
    public final Runnable mShortcutPermissionCheckRunnable = new Runnable() {
        public final void run() {
            LauncherModel launcherModel = LauncherModel.this;
            if (launcherModel.mDeepShortcutsLoaded) {
                boolean hasHostPermission = launcherModel.mDeepShortcutManager.hasHostPermission();
                LauncherModel launcherModel2 = LauncherModel.this;
                if (hasHostPermission != launcherModel2.mHasShortcutHostPermission) {
                    launcherModel2.mApp.reloadWorkspace();
                }
            }
        }
    };
    public final UserManagerCompat mUserManager;
    public boolean mWorkspaceLoaded;

    /* compiled from: PG */
    final class AppsAvailabilityCheck extends BroadcastReceiver {
        public AppsAvailabilityCheck() {
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (LauncherModel.sBgLock) {
                LauncherAppsCompat instance = LauncherAppsCompat.getInstance(LauncherAppState.sContext);
                PackageManager packageManager = context.getPackageManager();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : LauncherModel.sPendingPackages.entrySet()) {
                    UserHandleCompat userHandleCompat = (UserHandleCompat) entry.getKey();
                    arrayList.clear();
                    arrayList2.clear();
                    Iterator it = ((HashSet) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!instance.isPackageEnabledForProfile(str, userHandleCompat)) {
                            if (PackageManagerHelper.isAppEnabled(packageManager, str, 8192)) {
                                arrayList2.add(str);
                            } else {
                                Launcher.addDumpLog$ar$ds("Launcher.Model", "Package not found: " + str, (Exception) null);
                                arrayList.add(str);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        LauncherModel.sWorker.post(new PackageUpdatedTask(3, (String[]) arrayList.toArray(new String[arrayList.size()]), userHandleCompat));
                    }
                    if (!arrayList2.isEmpty()) {
                        LauncherModel.sWorker.post(new PackageUpdatedTask(4, (String[]) arrayList2.toArray(new String[arrayList2.size()]), userHandleCompat));
                    }
                }
                LauncherModel.sPendingPackages.clear();
            }
        }
    }

    /* compiled from: PG */
    public interface Callbacks {
        void bindAllApplications(ArrayList arrayList);

        void bindAppInfosRemoved(ArrayList arrayList);

        void bindAppWidget(LauncherAppWidgetInfo launcherAppWidgetInfo);

        void bindAppsAdded(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4);

        void bindAppsUpdated(ArrayList arrayList);

        void bindDeepShortcutMap(MultiHashMap multiHashMap);

        void bindFolders(LongArrayMap longArrayMap);

        void bindItems(ArrayList arrayList, int i, int i2, boolean z);

        void bindRestoreItemsChange(HashSet hashSet);

        void bindScreens(ArrayList arrayList);

        void bindSearchProviderChanged();

        void bindShortcutsChanged(ArrayList arrayList, ArrayList arrayList2, UserHandleCompat userHandleCompat);

        void bindWidgetsModel(WidgetsModel widgetsModel);

        void bindWidgetsRestored(ArrayList arrayList);

        void bindWorkspaceComponentsRemoved(HashSet hashSet, HashSet hashSet2, UserHandleCompat userHandleCompat);

        void finishBindingItems();

        int getCurrentWorkspaceScreen();

        boolean isAllAppsButtonRank(int i);

        void notifyWidgetProvidersChanged();

        void onPageBoundSynchronously(int i);

        boolean setLoadOnResume();

        void startBinding();
    }

    /* compiled from: PG */
    final class DeepShortcutsChangedTask implements Runnable {
        private final String mPackageName;
        private final List mShortcuts;
        private final UserHandleCompat mUser;

        public DeepShortcutsChangedTask(String str, List list, UserHandleCompat userHandleCompat) {
            this.mPackageName = str;
            this.mShortcuts = list;
            this.mUser = userHandleCompat;
        }

        public final void run() {
            LauncherModel.this.mDeepShortcutManager.onShortcutsChanged(this.mShortcuts);
            ArrayList arrayList = new ArrayList();
            MultiHashMap multiHashMap = new MultiHashMap();
            LongArrayMap.ValueIterator valueIterator = new LongArrayMap.ValueIterator();
            while (valueIterator.hasNext()) {
                ItemInfo itemInfo = (ItemInfo) valueIterator.next();
                if (itemInfo.itemType == 6) {
                    ShortcutInfo shortcutInfo = (ShortcutInfo) itemInfo;
                    if (shortcutInfo.getPromisedIntent().getPackage().equals(this.mPackageName) && shortcutInfo.user.equals(this.mUser)) {
                        multiHashMap.addToList(shortcutInfo.getDeepShortcutId(), shortcutInfo);
                    }
                }
            }
            LauncherAppState.getInstance();
            Context context = LauncherAppState.sContext;
            ArrayList arrayList2 = new ArrayList();
            if (!multiHashMap.isEmpty()) {
                for (ShortcutInfoCompat shortcutInfoCompat : LauncherModel.this.mDeepShortcutManager.queryForFullDetails(this.mPackageName, new ArrayList(multiHashMap.keySet()), this.mUser)) {
                    List<ShortcutInfo> list = (List) multiHashMap.remove(shortcutInfoCompat.getId());
                    try {
                        if (((Boolean) shortcutInfoCompat.mShortcutInfoClass.getMethod("isPinned", new Class[0]).invoke(shortcutInfoCompat.mShortcutInfo, new Object[0])).booleanValue()) {
                            for (ShortcutInfo shortcutInfo2 : list) {
                                shortcutInfo2.updateFromDeepShortcutInfo(shortcutInfoCompat, context);
                                arrayList2.add(shortcutInfo2);
                            }
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    arrayList.addAll(list);
                }
            }
            for (String str : multiHashMap.keySet()) {
                arrayList.addAll((Collection) multiHashMap.get(str));
            }
            LauncherModel.this.bindUpdatedShortcuts(arrayList2, arrayList, this.mUser);
            if (!arrayList.isEmpty()) {
                LauncherModel.deleteItemsFromDatabase(context, arrayList);
            }
            LauncherModel.this.updateDeepShortcutMap(this.mPackageName, this.mUser, this.mShortcuts);
            LauncherModel.this.bindDeepShortcuts();
        }
    }

    /* compiled from: PG */
    public interface ItemInfoFilter {
        boolean filterItem(ItemInfo itemInfo, ItemInfo itemInfo2, ComponentName componentName);
    }

    /* compiled from: PG */
    final class LoaderTask implements Runnable {
        public Context mContext;
        private int mFlags;
        boolean mIsLoadingAndBindingWorkspace;
        boolean mLoadAndBindStepFinished;
        public boolean mStopped;

        public LoaderTask(Context context, int i) {
            this.mContext = context;
            this.mFlags = i;
        }

        private final void bindWorkspaceItems(final Callbacks callbacks, ArrayList arrayList, ArrayList arrayList2, LongArrayMap longArrayMap, ArrayList arrayList3) {
            Callbacks callbacks2 = callbacks;
            ArrayList arrayList4 = arrayList3;
            boolean z = arrayList4 != null;
            int size = arrayList.size();
            final int i = 0;
            while (i < size) {
                int i2 = i + 6;
                final int i3 = i2 <= size ? 6 : size - i;
                final Callbacks callbacks3 = callbacks;
                final ArrayList arrayList5 = arrayList;
                C53585 r1 = new Runnable() {
                    public final void run() {
                        Callbacks tryGetCallbacks = LoaderTask.this.tryGetCallbacks(callbacks3);
                        if (tryGetCallbacks != null) {
                            ArrayList arrayList = arrayList5;
                            int i = i;
                            tryGetCallbacks.bindItems(arrayList, i, i3 + i, false);
                        }
                    }
                };
                if (z) {
                    synchronized (arrayList3) {
                        arrayList4.add(r1);
                    }
                } else {
                    LauncherModel.this.runOnMainThread(r1);
                }
                i = i2;
            }
            if (!longArrayMap.isEmpty()) {
                final LongArrayMap longArrayMap2 = longArrayMap;
                C53596 r12 = new Runnable() {
                    public final void run() {
                        Callbacks tryGetCallbacks = LoaderTask.this.tryGetCallbacks(callbacks);
                        if (tryGetCallbacks != null) {
                            tryGetCallbacks.bindFolders(longArrayMap2);
                        }
                    }
                };
                if (z) {
                    synchronized (arrayList3) {
                        arrayList4.add(r12);
                    }
                } else {
                    LauncherModel.this.runOnMainThread(r12);
                }
            }
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                final LauncherAppWidgetInfo launcherAppWidgetInfo = (LauncherAppWidgetInfo) arrayList2.get(i4);
                C53607 r4 = new Runnable() {
                    public final void run() {
                        Callbacks tryGetCallbacks = LoaderTask.this.tryGetCallbacks(callbacks);
                        if (tryGetCallbacks != null) {
                            tryGetCallbacks.bindAppWidget(launcherAppWidgetInfo);
                        }
                    }
                };
                if (z) {
                    arrayList4.add(r4);
                } else {
                    LauncherModel.this.runOnMainThread(r4);
                }
            }
        }

        private final boolean checkItemPlacement(LongArrayMap longArrayMap, ItemInfo itemInfo, ArrayList arrayList) {
            String str;
            int i;
            LongArrayMap longArrayMap2 = longArrayMap;
            ItemInfo itemInfo2 = itemInfo;
            InvariantDeviceProfile invariantDeviceProfile = LauncherAppState.getInstance().mInvariantDeviceProfile;
            int i2 = invariantDeviceProfile.numColumns;
            int i3 = invariantDeviceProfile.numRows;
            long j = itemInfo2.screenId;
            long j2 = itemInfo2.container;
            String str2 = "Error loading shortcut ";
            if (j2 == -101) {
                WeakReference weakReference = LauncherModel.this.mCallbacks;
                if (weakReference == null || ((Callbacks) weakReference.get()).isAllAppsButtonRank((int) itemInfo2.screenId)) {
                    String obj = itemInfo.toString();
                    long j3 = itemInfo2.screenId;
                    int i4 = itemInfo2.cellX;
                    int i5 = itemInfo2.cellY;
                    Log.e("Launcher.Model", "Error loading shortcut into hotseat " + obj + " into position (" + j3 + ":" + i4 + "," + i5 + ") occupied by all apps");
                    return false;
                }
                ItemInfo[][] itemInfoArr = (ItemInfo[][]) longArrayMap2.get(-101);
                long j4 = itemInfo2.screenId;
                int i6 = invariantDeviceProfile.numHotseatIcons;
                if (j4 >= ((long) i6)) {
                    String obj2 = itemInfo.toString();
                    long j5 = itemInfo2.screenId;
                    int i7 = invariantDeviceProfile.numHotseatIcons;
                    StringBuilder sb = new StringBuilder(str2);
                    sb.append(obj2);
                    sb.append(" into hotseat position ");
                    sb.append(j5);
                    sb.append(", position out of bounds: (0 to ");
                    sb.append(i7 - 1);
                    sb.append(")");
                    Log.e("Launcher.Model", sb.toString());
                    return false;
                } else if (itemInfoArr != null) {
                    ItemInfo[] itemInfoArr2 = itemInfoArr[(int) j4];
                    if (itemInfoArr2[0] != null) {
                        String obj3 = itemInfo.toString();
                        long j6 = itemInfo2.screenId;
                        int i8 = itemInfo2.cellX;
                        int i9 = itemInfo2.cellY;
                        String valueOf = String.valueOf(((ItemInfo[][]) longArrayMap2.get(-101))[(int) itemInfo2.screenId][0]);
                        Log.e("Launcher.Model", "Error loading shortcut into hotseat " + obj3 + " into position (" + j6 + ":" + i8 + "," + i9 + ") occupied by " + valueOf);
                        return false;
                    }
                    itemInfoArr2[0] = itemInfo2;
                    return true;
                } else {
                    int[] iArr = new int[2];
                    iArr[1] = 1;
                    iArr[0] = i6;
                    ItemInfo[][] itemInfoArr3 = (ItemInfo[][]) Array.newInstance(ItemInfo.class, iArr);
                    itemInfoArr3[(int) j4][0] = itemInfo2;
                    longArrayMap2.put(-101, itemInfoArr3);
                    return true;
                }
            } else {
                String str3 = str2;
                if (j2 != -100) {
                    return true;
                }
                if (!arrayList.contains(Long.valueOf(j))) {
                    return false;
                }
                if (!longArrayMap2.containsKey(itemInfo2.screenId)) {
                    int[] iArr2 = new int[2];
                    iArr2[1] = i3 + 1;
                    iArr2[0] = i2 + 1;
                    longArrayMap2.put(itemInfo2.screenId, (ItemInfo[][]) Array.newInstance(ItemInfo.class, iArr2));
                }
                ItemInfo[][] itemInfoArr4 = (ItemInfo[][]) longArrayMap2.get(itemInfo2.screenId);
                if ((itemInfo2.container != -100 || itemInfo2.cellX >= 0) && (i = itemInfo2.cellY) >= 0) {
                    int i10 = itemInfo2.cellX;
                    str = ")";
                    if (itemInfo2.spanX + i10 <= i2 && i + itemInfo2.spanY <= i3) {
                        while (true) {
                            int i11 = itemInfo2.cellX;
                            if (i10 < itemInfo2.spanX + i11) {
                                for (int i12 = itemInfo2.cellY; i12 < itemInfo2.cellY + itemInfo2.spanY; i12++) {
                                    if (itemInfoArr4[i10][i12] != null) {
                                        String obj4 = itemInfo.toString();
                                        long j7 = itemInfo2.screenId;
                                        String valueOf2 = String.valueOf(itemInfoArr4[i10][i12]);
                                        Log.e("Launcher.Model", str3 + obj4 + " into cell (" + j + "-" + j7 + ":" + i10 + "," + i12 + ") occupied by " + valueOf2);
                                        return false;
                                    }
                                    Object obj5 = ") occupied by ";
                                }
                                Object obj6 = ") occupied by ";
                                i10++;
                            } else {
                                while (i11 < itemInfo2.cellX + itemInfo2.spanX) {
                                    for (int i13 = itemInfo2.cellY; i13 < itemInfo2.cellY + itemInfo2.spanY; i13++) {
                                        itemInfoArr4[i11][i13] = itemInfo2;
                                    }
                                    i11++;
                                }
                                return true;
                            }
                        }
                    }
                } else {
                    str = ")";
                }
                String obj7 = itemInfo.toString();
                long j8 = itemInfo2.screenId;
                int i14 = itemInfo2.cellX;
                int i15 = itemInfo2.cellY;
                Log.e("Launcher.Model", str3 + obj7 + " into cell (" + j + "-" + j8 + ":" + i14 + "," + i15 + ") out of screen bounds ( " + i2 + "x" + i3 + str);
                return false;
            }
        }

        private static final void clearSBgDataStructures$ar$ds() {
            synchronized (LauncherModel.sBgLock) {
                LauncherModel.sBgWorkspaceItems.clear();
                LauncherModel.sBgAppWidgets.clear();
                LauncherModel.sBgFolders.clear();
                LauncherModel.sBgItemsIdMap.clear();
                LauncherModel.sBgWorkspaceScreens.clear();
                LauncherModel.sBgPinnedShortcutCounts.clear();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v0, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v1, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v3, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: com.android.launcher3.util.CursorIconInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v4, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v5, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v6, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v7, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v6, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v8, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v7, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v8, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v9, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v8, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v9, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v5, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v10, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v9, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v10, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v11, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v10, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v7, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v11, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v12, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v11, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v8, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v13, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v12, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v13, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v14, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v13, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v10, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v14, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v15, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v14, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v9, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v15, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v16, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v15, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v10, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v12, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v16, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v17, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v17, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v18, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v19, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v18, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v17, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v11, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: com.android.launcher3.util.LongArrayMap} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v19, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v18, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v17, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v21, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v20, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v19, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v18, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v22, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v19, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v23, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v20, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v21, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v22, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v21, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v15, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v20, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v23, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v22, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v16, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v21, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v25, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v24, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v23, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v17, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v22, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v25, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v24, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v18, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v25, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v28, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v8, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v40, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v26, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v20, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v21, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v22, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v36, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v47, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v38, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v39, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v41, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v42, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v43, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v24, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v26, resolved type: com.android.launcher3.util.CursorIconInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v39, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v45, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v34, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v52, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v50, resolved type: java.lang.CharSequence} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v25, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v27, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v28, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v29, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v39, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v54, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v30, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v26, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v26, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v40, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v34, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v55, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v31, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v27, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v41, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v35, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v56, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v31, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v10, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v28, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v32, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v29, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v43, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v37, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v60, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v33, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v30, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v44, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v38, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v61, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v34, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v31, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v32, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v39, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v62, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v35, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v32, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v46, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v40, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v63, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v33, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v36, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v11, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v41, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v47, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v36, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v64, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v34, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v35, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v37, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v12, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v42, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v37, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v38, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v35, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v49, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v38, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v43, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v39, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v36, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v50, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v39, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v44, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v37, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v40, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v64, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v51, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v40, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v65, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v41, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v38, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v41, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v39, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v52, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v42, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v47, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v67, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v40, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v43, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v67, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v42, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v68, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v44, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v41, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v42, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v45, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v70, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v43, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v46, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v71, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v45, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v13, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v52, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v72, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v46, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v48, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v14, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v53, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v15, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v43, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v16, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v17, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v18, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v55, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v56, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v35, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v57, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v36, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v59, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v44, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v81, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v58, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v60, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v45, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v82, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v59, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v38, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v60, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v61, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v62, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v65, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v46, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v20, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v63, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v47, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v98, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v68, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v64, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v48, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v99, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v69, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v70, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v21, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v22, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v23, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v72, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v74, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v66, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v50, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v24, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v49, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v106, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v67, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v51, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v50, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v69, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v53, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v71, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v55, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v51, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v56, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v52, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v73, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v57, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v74, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v58, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v53, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v59, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v60, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v54, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v61, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v62, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v55, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v63, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v64, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v78, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v65, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v102, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v47, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v56, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v79, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v80, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v66, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v48, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v57, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v111, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v49, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v25, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v80, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v50, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v26, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v51, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v27, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v84, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v83, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v53, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v69, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v58, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v85, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v84, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v119, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v54, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v70, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v59, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v86, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v85, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v71, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v86, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v72, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v120, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v57, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v60, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v61, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v58, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v87, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v73, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v121, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v59, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v88, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v74, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v122, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v62, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v17, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v89, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v75, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v123, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v60, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v91, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v76, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v126, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v61, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v63, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v65, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v92, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v91, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v77, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v130, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v62, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v64, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v67, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v93, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v92, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v78, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v94, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v93, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v131, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v63, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v65, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v95, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v132, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v64, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v66, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v65, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v95, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v81, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v134, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v96, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v135, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v82, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v66, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v97, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v136, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v83, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v67, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v18, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v84, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v137, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v68, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v67, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v19, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v20, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v21, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v85, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v138, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v69, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v68, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v22, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v23, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v24, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v25, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v56, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v27, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v28, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v29, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v8, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v30, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v9, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v31, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v100, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v143, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v86, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v70, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v71, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v101, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v87, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v144, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v69, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v102, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v145, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v88, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v72, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v103, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v146, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v89, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v73, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v70, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v110, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v147, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v90, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v74, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v71, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v61, resolved type: com.android.launcher3.LauncherModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v47, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v48, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v49, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v50, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v51, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v52, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v53, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v55, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v56, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v59, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v60, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v61, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v62, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v91, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v131, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v121, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v122, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v123, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v124, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v125, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v126, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v127, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v148, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v128, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v76, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v149, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v109, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v93, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v129, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v150, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v71, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v110, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v111, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v77, resolved type: com.android.launcher3.util.CursorIconInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v78, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v72, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v151, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v50, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v51, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v79, resolved type: com.android.launcher3.LauncherModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v130, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v79, resolved type: com.android.launcher3.util.CursorIconInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v152, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v74, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v153, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v76, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v113, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v94, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v131, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v77, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v95, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v78, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v115, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v96, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v79, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v135, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v136, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v137, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v138, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v139, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v140, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v141, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v142, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v143, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v144, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v145, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v146, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v147, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v148, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v149, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v152, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v153, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v155, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v157, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v154, resolved type: android.content.Intent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v155, resolved type: android.content.Intent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v136, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v137, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v138, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v139, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v140, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v113, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v114, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v115, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v119, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v98, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v99, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v100, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v101, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v102, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v103, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v104, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v105, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v106, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v107, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v108, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v109, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v110, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v112, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v113, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v114, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v83, resolved type: com.android.launcher3.LauncherModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v84, resolved type: com.android.launcher3.util.CursorIconInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v160, resolved type: android.content.Intent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v161, resolved type: android.content.Intent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v162, resolved type: android.content.Intent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v163, resolved type: android.content.Intent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v164, resolved type: android.content.Intent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v165, resolved type: android.content.Intent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v166, resolved type: android.content.Intent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v116, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v123, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v127, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v130, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v131, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v133, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v117, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v119, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v120, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v121, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v123, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v124, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v127, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v87, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v88, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v141, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v142, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v89, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v91, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v92, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v95, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v143, resolved type: com.android.launcher3.util.LongArrayMap} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v144, resolved type: com.android.launcher3.util.LongArrayMap} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v147, resolved type: com.android.launcher3.util.LongArrayMap} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v167, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v168, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v169, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v170, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v98, resolved type: com.android.launcher3.LauncherModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v131, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v103, resolved type: com.android.launcher3.util.CursorIconInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v106, resolved type: com.android.launcher3.util.CursorIconInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v132, resolved type: com.android.launcher3.ShortcutInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v133, resolved type: com.android.launcher3.ShortcutInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v134, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v99, resolved type: com.android.launcher3.LauncherModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v138, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v100, resolved type: com.android.launcher3.LauncherModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v138, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v158, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v139, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v159, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v141, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v160, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v121, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v143, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v162, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v103, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v104, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v164, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v124, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v105, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v165, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v106, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v166, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v107, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v108, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v144, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v109, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v169, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v110, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v138, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v142, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v145, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v149, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v150, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v154, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v155, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v156, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v157, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v158, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v159, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v160, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v161, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v172, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v174, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v175, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v177, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v178, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v180, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v181, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v183, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v184, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v54, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v55, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v58, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v59, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v186, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v187, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v188, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v189, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v192, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v163, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v113, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v114, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v115, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v153, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v116, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v117, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v118, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v119, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v120, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v121, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v122, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v123, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v124, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v125, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v126, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v127, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v128, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v129, resolved type: android.util.LongSparseArray} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v160, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v193, resolved type: android.content.Context} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v161, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v162, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v124, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v125, resolved type: android.content.pm.PackageManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v163, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v106, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v59, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v60, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v61, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v62, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v63, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v64, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v65, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v164, resolved type: java.lang.Object} */
        /* JADX WARNING: type inference failed for: r12v0, types: [com.android.launcher3.compat.LauncherAppsCompat] */
        /* JADX WARNING: type inference failed for: r7v0, types: [java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r5v0, types: [java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r26v0, types: [boolean] */
        /* JADX WARNING: type inference failed for: r47v2, types: [java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r27v6 */
        /* JADX WARNING: type inference failed for: r9v19, types: [java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r27v16 */
        /* JADX WARNING: type inference failed for: r8v40, types: [java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r7v44 */
        /* JADX WARNING: type inference failed for: r7v45 */
        /* JADX WARNING: type inference failed for: r21v34 */
        /* JADX WARNING: type inference failed for: r6v60 */
        /* JADX WARNING: type inference failed for: r6v69, types: [com.android.launcher3.compat.LauncherAppsCompat] */
        /* JADX WARNING: type inference failed for: r10v41, types: [java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r27v68 */
        /* JADX WARNING: type inference failed for: r27v70 */
        /* JADX WARNING: type inference failed for: r9v68, types: [java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r11v41, types: [java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r6v132 */
        /* JADX WARNING: type inference failed for: r6v133 */
        /* JADX WARNING: type inference failed for: r27v117 */
        /* JADX WARNING: type inference failed for: r27v118 */
        /* JADX WARNING: type inference failed for: r27v120 */
        /* JADX WARNING: type inference failed for: r27v122 */
        /* JADX WARNING: type inference failed for: r27v124 */
        /* JADX WARNING: type inference failed for: r27v125 */
        /* JADX WARNING: type inference failed for: r27v126 */
        /* JADX WARNING: type inference failed for: r27v128 */
        /* JADX WARNING: type inference failed for: r27v129 */
        /* JADX WARNING: type inference failed for: r27v132 */
        /* JADX WARNING: type inference failed for: r7v135 */
        /* JADX WARNING: type inference failed for: r7v136 */
        /* JADX WARNING: type inference failed for: r21v102 */
        /* JADX WARNING: type inference failed for: r6v152 */
        /* JADX WARNING: type inference failed for: r6v153 */
        /* JADX WARNING: type inference failed for: r27v158 */
        /* JADX WARNING: type inference failed for: r27v159 */
        /* JADX WARNING: Can't wrap try/catch for region: R(11:578|579|580|581|582|(1:586)|587|588|(3:590|591|(1:597))|598|(0)(0)) */
        /* JADX WARNING: Code restructure failed: missing block: B:459:0x0b4b, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:460:0x0b4c, code lost:
            r12 = r20;
            r6 = r21;
            r21 = r33;
            r33 = r47;
            r31 = r31;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:468:?, code lost:
            r31 = r31;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:776:0x1149, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:587:0x0db3 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:328:0x0857 A[Catch:{ URISyntaxException -> 0x083f, Exception -> 0x0829 }] */
        /* JADX WARNING: Removed duplicated region for block: B:329:0x085c A[Catch:{ URISyntaxException -> 0x083f, Exception -> 0x0829 }] */
        /* JADX WARNING: Removed duplicated region for block: B:331:0x0860 A[Catch:{ URISyntaxException -> 0x083f, Exception -> 0x0829 }] */
        /* JADX WARNING: Removed duplicated region for block: B:345:0x08c6  */
        /* JADX WARNING: Removed duplicated region for block: B:459:0x0b4b A[Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }, ExcHandler: Exception (e java.lang.Exception), PHI: r31 
          PHI: (r31v43 java.lang.String) = (r31v52 java.lang.String), (r31v132 java.lang.String) binds: [B:308:0x080a, B:312:0x0812] A[DONT_GENERATE, DONT_INLINE], Splitter:B:308:0x080a] */
        /* JADX WARNING: Removed duplicated region for block: B:486:0x0bc9  */
        /* JADX WARNING: Removed duplicated region for block: B:494:0x0be2  */
        /* JADX WARNING: Removed duplicated region for block: B:497:0x0be9 A[SYNTHETIC, Splitter:B:497:0x0be9] */
        /* JADX WARNING: Removed duplicated region for block: B:508:0x0c27 A[Catch:{ Exception -> 0x0c22 }] */
        /* JADX WARNING: Removed duplicated region for block: B:590:0x0db9 A[SYNTHETIC, Splitter:B:590:0x0db9] */
        /* JADX WARNING: Removed duplicated region for block: B:600:0x0ddf A[SYNTHETIC, Splitter:B:600:0x0ddf] */
        /* JADX WARNING: Removed duplicated region for block: B:660:0x0e8c A[Catch:{ Exception -> 0x0f47 }] */
        /* JADX WARNING: Removed duplicated region for block: B:661:0x0e98 A[Catch:{ Exception -> 0x0f47 }] */
        /* JADX WARNING: Removed duplicated region for block: B:792:0x0ecd A[SYNTHETIC] */
        /* JADX WARNING: Unknown variable types count: 11 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void loadWorkspace() {
            /*
                r59 = this;
                r1 = r59
                android.content.Context r2 = r1.mContext
                android.content.ContentResolver r9 = r2.getContentResolver()
                android.content.pm.PackageManager r10 = r2.getPackageManager()
                boolean r11 = r10.isSafeMode()
                com.android.launcher3.compat.LauncherAppsCompat r12 = com.android.launcher3.compat.LauncherAppsCompat.getInstance(r2)
                android.content.IntentFilter r3 = new android.content.IntentFilter
                java.lang.String r4 = "com.android.launcher3.SYSTEM_READY"
                r3.<init>(r4)
                r13 = 0
                android.content.Intent r14 = r2.registerReceiver(r13, r3)
                com.android.launcher3.LauncherAppState r3 = com.android.launcher3.LauncherAppState.getInstance()
                com.android.launcher3.InvariantDeviceProfile r3 = r3.mInvariantDeviceProfile
                int r4 = r3.numColumns
                int r3 = r3.numRows
                boolean r3 = com.android.launcher3.model.GridSizeMigrationTask.ENABLED
                r15 = 1
                if (r3 == 0) goto L_0x003c
                android.content.Context r3 = r1.mContext
                boolean r3 = com.android.launcher3.model.GridSizeMigrationTask.migrateGridIfNeeded(r3)
                if (r3 != 0) goto L_0x003c
                int r3 = r1.mFlags
                r3 = r3 | r15
                r1.mFlags = r3
            L_0x003c:
                int r3 = r1.mFlags
                r3 = r3 & r15
                if (r3 == 0) goto L_0x0055
                java.lang.String r3 = "Launcher.Model"
                java.lang.String r4 = "loadWorkspace: resetting launcher database"
                com.android.launcher3.Launcher.addDumpLog$ar$ds(r3, r4, r13)
                com.android.launcher3.LauncherProvider r3 = com.android.launcher3.LauncherAppState.getLauncherProvider()
                com.android.launcher3.LauncherProvider$DatabaseHelper r3 = r3.mOpenHelper
                android.database.sqlite.SQLiteDatabase r4 = r3.getWritableDatabase()
                r3.createEmptyDB(r4)
            L_0x0055:
                int r3 = r1.mFlags
                r8 = 2
                r3 = r3 & r8
                if (r3 == 0) goto L_0x007f
                java.lang.String r3 = "Launcher.Model"
                java.lang.String r4 = "loadWorkspace: migrating from launcher2"
                com.android.launcher3.Launcher.addDumpLog$ar$ds(r3, r4, r13)
                com.android.launcher3.LauncherProvider r3 = com.android.launcher3.LauncherAppState.getLauncherProvider()
                com.android.launcher3.LauncherProvider$DatabaseHelper r4 = r3.mOpenHelper
                android.database.sqlite.SQLiteDatabase r5 = r4.getWritableDatabase()
                android.content.Context r3 = r3.getContext()
                r6 = 2132090351(0x7f151def, float:1.982104E38)
                java.lang.String r3 = r3.getString(r6)
                android.net.Uri r3 = android.net.Uri.parse(r3)
                r4.migrateLauncher2Shortcuts(r5, r3)
                goto L_0x0088
            L_0x007f:
                com.android.launcher3.util.LongArrayMap r3 = com.android.launcher3.Launcher.sFolders
                com.android.launcher3.LauncherProvider r3 = com.android.launcher3.LauncherAppState.getLauncherProvider()
                r3.loadDefaultFavoritesIfNecessary()
            L_0x0088:
                java.lang.Object r16 = com.android.launcher3.LauncherModel.sBgLock
                monitor-enter(r16)
                clearSBgDataStructures$ar$ds()     // Catch:{ all -> 0x1152 }
                android.content.Context r3 = r1.mContext     // Catch:{ all -> 0x1152 }
                com.android.launcher3.compat.PackageInstallerCompat r3 = com.android.launcher3.compat.PackageInstallerCompat.getInstance(r3)     // Catch:{ all -> 0x1152 }
                java.util.HashMap r7 = r3.updateAndGetActiveSessionCache()     // Catch:{ all -> 0x1152 }
                java.util.ArrayList r3 = com.android.launcher3.LauncherModel.sBgWorkspaceScreens     // Catch:{ all -> 0x1152 }
                android.content.Context r4 = r1.mContext     // Catch:{ all -> 0x1152 }
                java.util.ArrayList r4 = com.android.launcher3.LauncherModel.loadWorkspaceScreensDb(r4)     // Catch:{ all -> 0x1152 }
                r3.addAll(r4)     // Catch:{ all -> 0x1152 }
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x1152 }
                r6.<init>()     // Catch:{ all -> 0x1152 }
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x1152 }
                r5.<init>()     // Catch:{ all -> 0x1152 }
                java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x1152 }
                r4.<init>()     // Catch:{ all -> 0x1152 }
                android.net.Uri r17 = com.android.launcher3.LauncherSettings$Favorites.CONTENT_URI     // Catch:{ all -> 0x1152 }
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r3 = r9
                r15 = r4
                r4 = r17
                r23 = r5
                r5 = r18
                r24 = r6
                r6 = r19
                r25 = r7
                r7 = r20
                r8 = r21
                android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x1152 }
                com.android.launcher3.util.LongArrayMap r4 = new com.android.launcher3.util.LongArrayMap     // Catch:{ all -> 0x1152 }
                r4.<init>()     // Catch:{ all -> 0x1152 }
                java.lang.String r5 = "_id"
                int r5 = r3.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x114a }
                java.lang.String r6 = "intent"
                int r6 = r3.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x114a }
                java.lang.String r7 = "container"
                int r7 = r3.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x114a }
                java.lang.String r8 = "itemType"
                int r8 = r3.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x114a }
                java.lang.String r13 = "appWidgetId"
                int r13 = r3.getColumnIndexOrThrow(r13)     // Catch:{ all -> 0x114a }
                r18 = r9
                java.lang.String r9 = "appWidgetProvider"
                int r9 = r3.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x114a }
                r19 = r14
                java.lang.String r14 = "screen"
                int r14 = r3.getColumnIndexOrThrow(r14)     // Catch:{ all -> 0x114a }
                r20 = r2
                java.lang.String r2 = "cellX"
                int r2 = r3.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x114a }
                r21 = r10
                java.lang.String r10 = "cellY"
                int r10 = r3.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x114a }
                r33 = r12
                java.lang.String r12 = "spanX"
                int r12 = r3.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x114a }
                r34 = r6
                java.lang.String r6 = "spanY"
                int r6 = r3.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x114a }
                r35 = r4
                java.lang.String r4 = "rank"
                int r4 = r3.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x114a }
                r36 = r4
                java.lang.String r4 = "restored"
                int r4 = r3.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x114a }
                r37 = r6
                java.lang.String r6 = "profileId"
                int r6 = r3.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x114a }
                r38 = r12
                java.lang.String r12 = "options"
                int r12 = r3.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x114a }
                r39 = r12
                com.android.launcher3.util.CursorIconInfo r12 = new com.android.launcher3.util.CursorIconInfo     // Catch:{ all -> 0x114a }
                r40 = r10
                android.content.Context r10 = r1.mContext     // Catch:{ all -> 0x114a }
                r12.<init>(r10, r3)     // Catch:{ all -> 0x114a }
                android.util.LongSparseArray r10 = new android.util.LongSparseArray     // Catch:{ all -> 0x114a }
                r10.<init>()     // Catch:{ all -> 0x114a }
                r41 = r12
                android.util.LongSparseArray r12 = new android.util.LongSparseArray     // Catch:{ all -> 0x114a }
                r12.<init>()     // Catch:{ all -> 0x114a }
                r42 = r2
                android.util.LongSparseArray r2 = new android.util.LongSparseArray     // Catch:{ all -> 0x114a }
                r2.<init>()     // Catch:{ all -> 0x114a }
                r43 = r14
                com.android.launcher3.LauncherModel r14 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x114a }
                com.android.launcher3.compat.UserManagerCompat r14 = r14.mUserManager     // Catch:{ all -> 0x114a }
                java.util.List r14 = r14.getUserProfiles()     // Catch:{ all -> 0x114a }
                java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x114a }
            L_0x0171:
                boolean r26 = r14.hasNext()     // Catch:{ all -> 0x114a }
                r44 = r11
                if (r26 == 0) goto L_0x01f5
                java.lang.Object r26 = r14.next()     // Catch:{ all -> 0x114a }
                r11 = r26
                com.android.launcher3.compat.UserHandleCompat r11 = (com.android.launcher3.compat.UserHandleCompat) r11     // Catch:{ all -> 0x114a }
                r26 = r14
                com.android.launcher3.LauncherModel r14 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x114a }
                com.android.launcher3.compat.UserManagerCompat r14 = r14.mUserManager     // Catch:{ all -> 0x114a }
                r45 = r5
                r46 = r6
                long r5 = r14.getSerialNumberForUser(r11)     // Catch:{ all -> 0x114a }
                r10.put(r5, r11)     // Catch:{ all -> 0x114a }
                com.android.launcher3.LauncherModel r14 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x114a }
                com.android.launcher3.compat.UserManagerCompat r14 = r14.mUserManager     // Catch:{ all -> 0x114a }
                boolean r14 = r14.isQuietModeEnabled(r11)     // Catch:{ all -> 0x114a }
                java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x114a }
                r12.put(r5, r14)     // Catch:{ all -> 0x114a }
                com.android.launcher3.LauncherModel r14 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x114a }
                com.android.launcher3.compat.UserManagerCompat r14 = r14.mUserManager     // Catch:{ all -> 0x114a }
                boolean r14 = r14.isUserUnlocked(r11)     // Catch:{ all -> 0x114a }
                if (r14 == 0) goto L_0x01dc
                r27 = r14
                com.android.launcher3.LauncherModel r14 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x114a }
                com.android.launcher3.compat.DeepShortcutManagerCompat r14 = r14.mDeepShortcutManager     // Catch:{ all -> 0x114a }
                r47 = r12
                r12 = 0
                java.util.List r11 = r14.queryForPinnedShortcuts(r12, r11)     // Catch:{ all -> 0x114a }
                com.android.launcher3.LauncherModel r12 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x114a }
                com.android.launcher3.compat.DeepShortcutManagerCompat r12 = r12.mDeepShortcutManager     // Catch:{ all -> 0x114a }
                boolean r12 = r12.wasLastCallSuccess()     // Catch:{ all -> 0x114a }
                if (r12 == 0) goto L_0x01da
                java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x114a }
            L_0x01c6:
                boolean r12 = r11.hasNext()     // Catch:{ all -> 0x114a }
                if (r12 == 0) goto L_0x01e0
                java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x114a }
                com.android.launcher3.shortcuts.ShortcutInfoCompat r12 = (com.android.launcher3.shortcuts.ShortcutInfoCompat) r12     // Catch:{ all -> 0x114a }
                com.android.launcher3.shortcuts.DeepShortcutKey r14 = com.android.launcher3.shortcuts.DeepShortcutKey.fromInfo(r12)     // Catch:{ all -> 0x114a }
                r15.put(r14, r12)     // Catch:{ all -> 0x114a }
                goto L_0x01c6
            L_0x01da:
                r11 = 0
                goto L_0x01e2
            L_0x01dc:
                r47 = r12
                r27 = r14
            L_0x01e0:
                r11 = r27
            L_0x01e2:
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x114a }
                r2.put(r5, r11)     // Catch:{ all -> 0x114a }
                r14 = r26
                r11 = r44
                r5 = r45
                r6 = r46
                r12 = r47
                goto L_0x0171
            L_0x01f5:
                r45 = r5
                r46 = r6
                r47 = r12
                r5 = 0
            L_0x01fc:
                boolean r6 = r1.mStopped     // Catch:{ all -> 0x114a }
                if (r6 != 0) goto L_0x0ffc
                boolean r6 = r3.moveToNext()     // Catch:{ all -> 0x114a }
                if (r6 == 0) goto L_0x0ffc
                int r6 = r3.getInt(r8)     // Catch:{ Exception -> 0x0f8d }
                int r12 = r3.getInt(r4)     // Catch:{ Exception -> 0x0f8d }
                if (r12 == 0) goto L_0x0212
                r12 = 1
                goto L_0x0213
            L_0x0212:
                r12 = 0
            L_0x0213:
                int r14 = r3.getInt(r7)     // Catch:{ Exception -> 0x0f8d }
                r27 = 8
                if (r6 == 0) goto L_0x0786
                r11 = 1
                if (r6 == r11) goto L_0x0786
                r11 = 2
                if (r6 == r11) goto L_0x0650
                r11 = 5
                r48 = r7
                r7 = 4
                if (r6 == r7) goto L_0x027d
                if (r6 == r11) goto L_0x027d
                r7 = 6
                r54 = r4
                r53 = r5
                r49 = r8
                r50 = r9
                r52 = r10
                if (r6 == r7) goto L_0x025e
                r12 = r20
                r27 = r21
                r8 = r25
                r21 = r33
                r6 = r35
                r9 = r36
                r25 = r40
                r26 = r41
                r7 = r43
                r55 = r46
                r33 = r47
                r46 = r13
                r47 = r23
                r13 = r24
                r40 = r37
                r37 = r38
                r23 = r45
                r24 = r2
                r45 = r15
                goto L_0x0ea4
            L_0x025e:
                r7 = r14
                r9 = r23
                r11 = r35
                r8 = r39
                r5 = r40
                r4 = r42
                r10 = r45
                r55 = r46
                r46 = r13
                r45 = r15
                r13 = r24
                r40 = r37
                r37 = r38
                r24 = r2
                r38 = r25
                goto L_0x0794
            L_0x027d:
                if (r6 != r11) goto L_0x0281
                r6 = 1
                goto L_0x0282
            L_0x0281:
                r6 = 0
            L_0x0282:
                int r7 = r3.getInt(r13)     // Catch:{ Exception -> 0x061a }
                r11 = r46
                r46 = r13
                long r12 = r3.getLong(r11)     // Catch:{ Exception -> 0x0602 }
                r49 = r8
                java.lang.String r8 = r3.getString(r9)     // Catch:{ Exception -> 0x05fe }
                r50 = r9
                r51 = r14
                r9 = r45
                r45 = r15
                long r14 = r3.getLong(r9)     // Catch:{ Exception -> 0x05d6 }
                java.lang.Object r12 = r10.get(r12)     // Catch:{ Exception -> 0x05d6 }
                com.android.launcher3.compat.UserHandleCompat r12 = (com.android.launcher3.compat.UserHandleCompat) r12     // Catch:{ Exception -> 0x05d6 }
                if (r12 != 0) goto L_0x0301
                java.lang.Long r6 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x02d9 }
                r13 = r24
                r13.add(r6)     // Catch:{ Exception -> 0x02d7 }
                r24 = r2
                r54 = r4
                r53 = r5
                r52 = r10
                r55 = r11
                r12 = r20
                r27 = r21
                r8 = r25
                r21 = r33
                r6 = r35
                r25 = r40
                r26 = r41
                r7 = r43
                r33 = r47
                r47 = r23
                r40 = r37
                r37 = r38
                r23 = r9
                goto L_0x07e2
            L_0x02d7:
                r0 = move-exception
                goto L_0x02dc
            L_0x02d9:
                r0 = move-exception
                r13 = r24
            L_0x02dc:
                r24 = r2
                r54 = r4
                r53 = r5
                r52 = r10
                r55 = r11
                r12 = r20
                r27 = r21
                r8 = r25
                r21 = r33
                r6 = r35
                r25 = r40
                r26 = r41
                r7 = r43
                r33 = r47
                r2 = r0
            L_0x02f9:
                r47 = r23
                r40 = r37
                r37 = r38
                goto L_0x0780
            L_0x0301:
                r13 = r24
                r24 = r2
                android.content.ComponentName r2 = android.content.ComponentName.unflattenFromString(r8)     // Catch:{ Exception -> 0x05b5 }
                r52 = r10
                int r10 = r3.getInt(r4)     // Catch:{ Exception -> 0x05a8 }
                r26 = r10 & 1
                r22 = 1
                r26 = r26 ^ 1
                r28 = r10 & 2
                if (r28 != 0) goto L_0x031c
                r28 = 1
                goto L_0x031e
            L_0x031c:
                r28 = 0
            L_0x031e:
                if (r5 != 0) goto L_0x0346
                r53 = r5
                android.content.Context r5 = r1.mContext     // Catch:{ Exception -> 0x032d }
                com.android.launcher3.compat.AppWidgetManagerCompat r5 = com.android.launcher3.compat.AppWidgetManagerCompat.getInstance(r5)     // Catch:{ Exception -> 0x032d }
                java.util.HashMap r5 = r5.getAllProvidersMap()     // Catch:{ Exception -> 0x032d }
                goto L_0x0348
            L_0x032d:
                r0 = move-exception
                r2 = r0
                r54 = r4
                r55 = r11
                r12 = r20
                r27 = r21
                r8 = r25
                r21 = r33
                r6 = r35
                r25 = r40
                r26 = r41
                r7 = r43
                r33 = r47
                goto L_0x02f9
            L_0x0346:
                r53 = r5
            L_0x0348:
                r54 = r4
                com.android.launcher3.util.ComponentKey r4 = new com.android.launcher3.util.ComponentKey     // Catch:{ Exception -> 0x0575 }
                r55 = r11
                android.content.ComponentName r11 = android.content.ComponentName.unflattenFromString(r8)     // Catch:{ Exception -> 0x0573 }
                r4.<init>(r11, r12)     // Catch:{ Exception -> 0x0573 }
                java.lang.Object r4 = r5.get(r4)     // Catch:{ Exception -> 0x0573 }
                android.appwidget.AppWidgetProviderInfo r4 = (android.appwidget.AppWidgetProviderInfo) r4     // Catch:{ Exception -> 0x0573 }
                boolean r11 = com.android.launcher3.LauncherModel.isValidProvider(r4)     // Catch:{ Exception -> 0x0573 }
                if (r44 != 0) goto L_0x039e
                if (r6 != 0) goto L_0x039e
                if (r28 == 0) goto L_0x039e
                if (r11 != 0) goto L_0x039e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03b9 }
                r2.<init>()     // Catch:{ Exception -> 0x03b9 }
                java.lang.String r4 = "Deleting widget that isn't installed anymore: id="
                r2.append(r4)     // Catch:{ Exception -> 0x03b9 }
                r2.append(r14)     // Catch:{ Exception -> 0x03b9 }
                java.lang.String r4 = " appWidgetId="
                r2.append(r4)     // Catch:{ Exception -> 0x03b9 }
                r2.append(r7)     // Catch:{ Exception -> 0x03b9 }
                java.lang.String r4 = "Launcher.Model"
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x03b9 }
                android.util.Log.e(r4, r2)     // Catch:{ Exception -> 0x03b9 }
                java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x03b9 }
                r13.add(r2)     // Catch:{ Exception -> 0x03b9 }
                r11 = r35
                r4 = r42
                r58 = r25
                r25 = r5
                r5 = r40
                r40 = r37
                r37 = r38
                r38 = r58
                goto L_0x0528
            L_0x039e:
                if (r11 == 0) goto L_0x03cd
                com.android.launcher3.LauncherAppWidgetInfo r2 = new com.android.launcher3.LauncherAppWidgetInfo     // Catch:{ Exception -> 0x03b9 }
                android.content.ComponentName r4 = r4.provider     // Catch:{ Exception -> 0x03b9 }
                r2.<init>(r7, r4)     // Catch:{ Exception -> 0x03b9 }
                r4 = r10 & -9
                if (r28 != 0) goto L_0x03b2
                if (r26 == 0) goto L_0x03af
                r11 = 4
                goto L_0x03b3
            L_0x03af:
                r11 = r4 & -3
                goto L_0x03b3
            L_0x03b2:
                r11 = r4
            L_0x03b3:
                r2.restoreStatus = r11     // Catch:{ Exception -> 0x03b9 }
                r11 = r25
                goto L_0x0462
            L_0x03b9:
                r0 = move-exception
                r2 = r0
                r11 = r35
                r4 = r42
                r58 = r25
                r25 = r5
                r5 = r40
                r40 = r37
                r37 = r38
                r38 = r58
                goto L_0x0589
            L_0x03cd:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0573 }
                r4.<init>()     // Catch:{ Exception -> 0x0573 }
                java.lang.String r11 = "Widget restore pending id="
                r4.append(r11)     // Catch:{ Exception -> 0x0573 }
                r4.append(r14)     // Catch:{ Exception -> 0x0573 }
                java.lang.String r11 = " appWidgetId="
                r4.append(r11)     // Catch:{ Exception -> 0x0573 }
                r4.append(r7)     // Catch:{ Exception -> 0x0573 }
                java.lang.String r11 = " status ="
                r4.append(r11)     // Catch:{ Exception -> 0x0573 }
                r4.append(r10)     // Catch:{ Exception -> 0x0573 }
                java.lang.String r11 = "Launcher.Model"
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0573 }
                android.util.Log.v(r11, r4)     // Catch:{ Exception -> 0x0573 }
                com.android.launcher3.LauncherAppWidgetInfo r4 = new com.android.launcher3.LauncherAppWidgetInfo     // Catch:{ Exception -> 0x0573 }
                r4.<init>(r7, r2)     // Catch:{ Exception -> 0x0573 }
                r4.restoreStatus = r10     // Catch:{ Exception -> 0x0573 }
                java.lang.String r7 = r2.getPackageName()     // Catch:{ Exception -> 0x0573 }
                r11 = r25
                java.lang.Object r7 = r11.get(r7)     // Catch:{ Exception -> 0x0563 }
                java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x0563 }
                r25 = r10 & 8
                if (r25 == 0) goto L_0x040b
                goto L_0x0457
            L_0x040b:
                if (r7 == 0) goto L_0x0424
                int r2 = r4.restoreStatus     // Catch:{ Exception -> 0x0414 }
                r2 = r2 | 8
                r4.restoreStatus = r2     // Catch:{ Exception -> 0x0414 }
                goto L_0x0457
            L_0x0414:
                r0 = move-exception
                r2 = r0
                r25 = r5
                r5 = r40
                r4 = r42
                r40 = r37
                r37 = r38
                r38 = r11
                goto L_0x04d7
            L_0x0424:
                if (r44 != 0) goto L_0x0457
                java.lang.String r4 = "Launcher.Model"
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0414 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0414 }
                r6.<init>()     // Catch:{ Exception -> 0x0414 }
                java.lang.String r7 = "Unrestored widget removed: "
                r6.append(r7)     // Catch:{ Exception -> 0x0414 }
                r6.append(r2)     // Catch:{ Exception -> 0x0414 }
                java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x0414 }
                r6 = 0
                com.android.launcher3.Launcher.addDumpLog$ar$ds(r4, r2, r6)     // Catch:{ Exception -> 0x0414 }
                java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0414 }
                r13.add(r2)     // Catch:{ Exception -> 0x0414 }
                r25 = r5
                r5 = r40
                r4 = r42
                r58 = r38
                r38 = r11
                r11 = r37
                r37 = r58
                goto L_0x04af
            L_0x0457:
                if (r7 != 0) goto L_0x045b
                r2 = 0
                goto L_0x045f
            L_0x045b:
                int r2 = r7.intValue()     // Catch:{ Exception -> 0x0563 }
            L_0x045f:
                r4.installProgress = r2     // Catch:{ Exception -> 0x0563 }
                r2 = r4
            L_0x0462:
                r2.f16556id = r14     // Catch:{ Exception -> 0x0563 }
                r4 = r43
                int r7 = r3.getInt(r4)     // Catch:{ Exception -> 0x055f }
                r43 = r4
                r25 = r5
                long r4 = (long) r7
                r2.screenId = r4     // Catch:{ Exception -> 0x055d }
                r4 = r42
                int r5 = r3.getInt(r4)     // Catch:{ Exception -> 0x0559 }
                r2.cellX = r5     // Catch:{ Exception -> 0x0559 }
                r5 = r40
                int r7 = r3.getInt(r5)     // Catch:{ Exception -> 0x0557 }
                r2.cellY = r7     // Catch:{ Exception -> 0x0557 }
                r7 = r38
                r38 = r11
                int r11 = r3.getInt(r7)     // Catch:{ Exception -> 0x054f }
                r2.spanX = r11     // Catch:{ Exception -> 0x054f }
                r11 = r37
                r37 = r7
                int r7 = r3.getInt(r11)     // Catch:{ Exception -> 0x054b }
                r2.spanY = r7     // Catch:{ Exception -> 0x054b }
                r2.user = r12     // Catch:{ Exception -> 0x054b }
                r7 = r51
                r12 = -100
                if (r7 == r12) goto L_0x04db
                r12 = -101(0xffffffffffffff9b, float:NaN)
                if (r7 == r12) goto L_0x04db
                java.lang.String r2 = "Launcher.Model"
                java.lang.String r6 = "Widget found where container != CONTAINER_DESKTOP nor CONTAINER_HOTSEAT - ignoring!"
                android.util.Log.e(r2, r6)     // Catch:{ Exception -> 0x04d3 }
                java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x04d3 }
                r13.add(r2)     // Catch:{ Exception -> 0x04d3 }
            L_0x04af:
                r42 = r4
                r40 = r5
                r2 = r24
                r5 = r25
                r25 = r38
                r15 = r45
                r7 = r48
                r8 = r49
                r10 = r52
                r4 = r54
                r45 = r9
                r24 = r13
                r38 = r37
                r13 = r46
                r9 = r50
                r46 = r55
                r37 = r11
                goto L_0x01fc
            L_0x04d3:
                r0 = move-exception
                r2 = r0
                r40 = r11
            L_0x04d7:
                r11 = r35
                goto L_0x0589
            L_0x04db:
                r40 = r11
                long r11 = (long) r7
                r2.container = r11     // Catch:{ Exception -> 0x0549 }
                java.util.ArrayList r7 = com.android.launcher3.LauncherModel.sBgWorkspaceScreens     // Catch:{ Exception -> 0x0549 }
                r11 = r35
                boolean r7 = r1.checkItemPlacement(r11, r2, r7)     // Catch:{ Exception -> 0x0547 }
                if (r7 != 0) goto L_0x04f2
                java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0547 }
                r13.add(r2)     // Catch:{ Exception -> 0x0547 }
                goto L_0x0528
            L_0x04f2:
                if (r6 != 0) goto L_0x051c
                android.content.ComponentName r6 = r2.providerName     // Catch:{ Exception -> 0x0547 }
                java.lang.String r6 = r6.flattenToString()     // Catch:{ Exception -> 0x0547 }
                boolean r7 = r6.equals(r8)     // Catch:{ Exception -> 0x0547 }
                if (r7 == 0) goto L_0x0504
                int r7 = r2.restoreStatus     // Catch:{ Exception -> 0x0547 }
                if (r7 == r10) goto L_0x051c
            L_0x0504:
                android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ Exception -> 0x0547 }
                r7.<init>()     // Catch:{ Exception -> 0x0547 }
                java.lang.String r8 = "appWidgetProvider"
                r7.put(r8, r6)     // Catch:{ Exception -> 0x0547 }
                java.lang.String r6 = "restored"
                int r8 = r2.restoreStatus     // Catch:{ Exception -> 0x0547 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0547 }
                r7.put(r6, r8)     // Catch:{ Exception -> 0x0547 }
                r1.updateItem(r14, r7)     // Catch:{ Exception -> 0x0547 }
            L_0x051c:
                com.android.launcher3.util.LongArrayMap r6 = com.android.launcher3.LauncherModel.sBgItemsIdMap     // Catch:{ Exception -> 0x0547 }
                long r7 = r2.f16556id     // Catch:{ Exception -> 0x0547 }
                r6.put(r7, r2)     // Catch:{ Exception -> 0x0547 }
                java.util.ArrayList r6 = com.android.launcher3.LauncherModel.sBgAppWidgets     // Catch:{ Exception -> 0x0547 }
                r6.add(r2)     // Catch:{ Exception -> 0x0547 }
            L_0x0528:
                r42 = r4
                r6 = r11
                r12 = r20
                r27 = r21
                r21 = r33
                r8 = r38
                r26 = r41
                r7 = r43
                r33 = r47
                r47 = r23
                r23 = r9
                r9 = r36
                r58 = r25
                r25 = r5
                r5 = r58
                goto L_0x0fca
            L_0x0547:
                r0 = move-exception
                goto L_0x0588
            L_0x0549:
                r0 = move-exception
                goto L_0x0570
            L_0x054b:
                r0 = move-exception
                r40 = r11
                goto L_0x0570
            L_0x054f:
                r0 = move-exception
                r11 = r35
                r40 = r37
                r37 = r7
                goto L_0x0588
            L_0x0557:
                r0 = move-exception
                goto L_0x056a
            L_0x0559:
                r0 = move-exception
                r5 = r40
                goto L_0x056a
            L_0x055d:
                r0 = move-exception
                goto L_0x0566
            L_0x055f:
                r0 = move-exception
                r43 = r4
                goto L_0x0564
            L_0x0563:
                r0 = move-exception
            L_0x0564:
                r25 = r5
            L_0x0566:
                r5 = r40
                r4 = r42
            L_0x056a:
                r40 = r37
                r37 = r38
                r38 = r11
            L_0x0570:
                r11 = r35
                goto L_0x0588
            L_0x0573:
                r0 = move-exception
                goto L_0x0578
            L_0x0575:
                r0 = move-exception
                r55 = r11
            L_0x0578:
                r11 = r35
                r4 = r42
                r58 = r25
                r25 = r5
                r5 = r40
                r40 = r37
                r37 = r38
                r38 = r58
            L_0x0588:
                r2 = r0
            L_0x0589:
                r42 = r4
                r6 = r11
                r12 = r20
                r27 = r21
                r21 = r33
                r8 = r38
                r26 = r41
                r7 = r43
                r33 = r47
                r47 = r23
                r23 = r9
                r9 = r36
                r58 = r25
                r25 = r5
                r5 = r58
                goto L_0x0fc3
            L_0x05a8:
                r0 = move-exception
                r53 = r5
                r5 = r40
                r40 = r37
                r37 = r38
                r2 = r0
                r54 = r4
                goto L_0x05c3
            L_0x05b5:
                r0 = move-exception
                r53 = r5
                r5 = r40
                r40 = r37
                r37 = r38
                r2 = r0
                r54 = r4
                r52 = r10
            L_0x05c3:
                r55 = r11
                r12 = r20
                r27 = r21
                r8 = r25
                r21 = r33
                r6 = r35
                r26 = r41
                r7 = r43
                r33 = r47
                goto L_0x05fa
            L_0x05d6:
                r0 = move-exception
                r53 = r5
                r13 = r24
                r5 = r40
                r40 = r37
                r37 = r38
                r24 = r2
                r54 = r4
                r52 = r10
                r55 = r11
                r12 = r20
                r27 = r21
                r8 = r25
                r21 = r33
                r6 = r35
                r26 = r41
                r7 = r43
                r33 = r47
                r2 = r0
            L_0x05fa:
                r25 = r5
                goto L_0x077e
            L_0x05fe:
                r0 = move-exception
                r53 = r5
                goto L_0x0607
            L_0x0602:
                r0 = move-exception
                r53 = r5
                r49 = r8
            L_0x0607:
                r50 = r9
                r13 = r24
                r5 = r40
                r40 = r37
                r37 = r38
                r24 = r2
                r54 = r4
                r52 = r10
                r55 = r11
                goto L_0x0633
            L_0x061a:
                r0 = move-exception
                r53 = r5
                r49 = r8
                r50 = r9
                r5 = r40
                r55 = r46
                r46 = r13
                r13 = r24
                r40 = r37
                r37 = r38
                r24 = r2
                r54 = r4
                r52 = r10
            L_0x0633:
                r12 = r20
                r27 = r21
                r8 = r25
                r21 = r33
                r6 = r35
                r9 = r36
                r26 = r41
                r7 = r43
                r33 = r47
                r2 = r0
                r25 = r5
                r47 = r23
                r23 = r45
                r45 = r15
                goto L_0x0fc1
            L_0x0650:
                r54 = r4
                r53 = r5
                r48 = r7
                r49 = r8
                r50 = r9
                r52 = r10
                r7 = r14
                r11 = r35
                r5 = r40
                r4 = r42
                r9 = r45
                r55 = r46
                r46 = r13
                r45 = r15
                r13 = r24
                r40 = r37
                r37 = r38
                r24 = r2
                r38 = r25
                long r14 = r3.getLong(r9)     // Catch:{ Exception -> 0x0769 }
                com.android.launcher3.util.LongArrayMap r2 = com.android.launcher3.LauncherModel.sBgFolders     // Catch:{ Exception -> 0x0769 }
                com.android.launcher3.FolderInfo r2 = com.android.launcher3.LauncherModel.findOrMakeFolder(r2, r14)     // Catch:{ Exception -> 0x0769 }
                r8 = r41
                int r6 = r8.titleIndex     // Catch:{ Exception -> 0x0765 }
                java.lang.String r6 = r3.getString(r6)     // Catch:{ Exception -> 0x0765 }
                r2.title = r6     // Catch:{ Exception -> 0x0765 }
                r2.f16556id = r14     // Catch:{ Exception -> 0x0765 }
                r41 = r8
                r10 = r9
                long r8 = (long) r7
                r2.container = r8     // Catch:{ Exception -> 0x0748 }
                r8 = r43
                int r6 = r3.getInt(r8)     // Catch:{ Exception -> 0x0744 }
                r43 = r8
                long r8 = (long) r6
                r2.screenId = r8     // Catch:{ Exception -> 0x0748 }
                int r6 = r3.getInt(r4)     // Catch:{ Exception -> 0x0748 }
                r2.cellX = r6     // Catch:{ Exception -> 0x0748 }
                int r6 = r3.getInt(r5)     // Catch:{ Exception -> 0x0748 }
                r2.cellY = r6     // Catch:{ Exception -> 0x0748 }
                r6 = 1
                r2.spanX = r6     // Catch:{ Exception -> 0x0748 }
                r2.spanY = r6     // Catch:{ Exception -> 0x0748 }
                r8 = r39
                int r6 = r3.getInt(r8)     // Catch:{ Exception -> 0x073b }
                r2.options = r6     // Catch:{ Exception -> 0x073b }
                java.util.ArrayList r6 = com.android.launcher3.LauncherModel.sBgWorkspaceScreens     // Catch:{ Exception -> 0x073b }
                boolean r6 = r1.checkItemPlacement(r11, r2, r6)     // Catch:{ Exception -> 0x073b }
                if (r6 != 0) goto L_0x06e1
                java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x073b }
                r13.add(r2)     // Catch:{ Exception -> 0x073b }
                r42 = r4
                r25 = r5
                r39 = r8
                r6 = r11
                r12 = r20
                r27 = r21
                r21 = r33
                r9 = r36
                r8 = r38
                r26 = r41
                r7 = r43
                r33 = r47
                r47 = r23
                r23 = r10
                goto L_0x0ea4
            L_0x06e1:
                r6 = -101(0xffffffffffffff9b, float:NaN)
                if (r7 == r6) goto L_0x06ea
                r6 = -100
                if (r7 == r6) goto L_0x06ea
                goto L_0x06ef
            L_0x06ea:
                java.util.ArrayList r6 = com.android.launcher3.LauncherModel.sBgWorkspaceItems     // Catch:{ Exception -> 0x073b }
                r6.add(r2)     // Catch:{ Exception -> 0x073b }
            L_0x06ef:
                if (r12 == 0) goto L_0x06fb
                java.lang.Long r6 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x073b }
                r9 = r23
                r9.add(r6)     // Catch:{ Exception -> 0x0728 }
                goto L_0x06fd
            L_0x06fb:
                r9 = r23
            L_0x06fd:
                com.android.launcher3.util.LongArrayMap r6 = com.android.launcher3.LauncherModel.sBgItemsIdMap     // Catch:{ Exception -> 0x0728 }
                long r14 = r2.f16556id     // Catch:{ Exception -> 0x0728 }
                r6.put(r14, r2)     // Catch:{ Exception -> 0x0728 }
                com.android.launcher3.util.LongArrayMap r6 = com.android.launcher3.LauncherModel.sBgFolders     // Catch:{ Exception -> 0x0728 }
                long r14 = r2.f16556id     // Catch:{ Exception -> 0x0728 }
                r6.put(r14, r2)     // Catch:{ Exception -> 0x0728 }
                r42 = r4
                r25 = r5
                r39 = r8
                r23 = r10
                r6 = r11
                r12 = r20
                r27 = r21
                r21 = r33
                r8 = r38
                r26 = r41
                r7 = r43
                r33 = r47
                r47 = r9
                r9 = r36
                goto L_0x0ea4
            L_0x0728:
                r0 = move-exception
                r2 = r0
                r42 = r4
                r25 = r5
                r39 = r8
                r23 = r10
                r6 = r11
                r12 = r20
                r27 = r21
                r21 = r33
                goto L_0x07f2
            L_0x073b:
                r0 = move-exception
                r2 = r0
                r42 = r4
                r25 = r5
                r39 = r8
                goto L_0x074e
            L_0x0744:
                r0 = move-exception
                r43 = r8
                goto L_0x0749
            L_0x0748:
                r0 = move-exception
            L_0x0749:
                r2 = r0
                r42 = r4
                r25 = r5
            L_0x074e:
                r6 = r11
                r12 = r20
                r27 = r21
                r21 = r33
                r9 = r36
                r8 = r38
                r26 = r41
                r7 = r43
                r33 = r47
                r47 = r23
                r23 = r10
                goto L_0x0fc1
            L_0x0765:
                r0 = move-exception
                r41 = r8
                goto L_0x076a
            L_0x0769:
                r0 = move-exception
            L_0x076a:
                r2 = r0
                r42 = r4
                r25 = r5
                r6 = r11
                r12 = r20
                r27 = r21
                r21 = r33
                r8 = r38
                r26 = r41
                r7 = r43
                r33 = r47
            L_0x077e:
                r47 = r23
            L_0x0780:
                r23 = r9
            L_0x0782:
                r9 = r36
                goto L_0x0fc1
            L_0x0786:
                r54 = r4
                r53 = r5
                r48 = r7
                r49 = r8
                r50 = r9
                r52 = r10
                goto L_0x025e
            L_0x0794:
                long r14 = r3.getLong(r10)     // Catch:{ Exception -> 0x0f70 }
                r39 = r8
                r2 = r34
                java.lang.String r8 = r3.getString(r2)     // Catch:{ Exception -> 0x0f68 }
                r34 = r2
                r23 = r10
                r2 = r55
                int r10 = r3.getInt(r2)     // Catch:{ Exception -> 0x0f60 }
                r35 = r11
                long r10 = (long) r10
                r55 = r2
                r2 = r52
                java.lang.Object r25 = r2.get(r10)     // Catch:{ Exception -> 0x0f50 }
                r52 = r2
                r2 = r25
                com.android.launcher3.compat.UserHandleCompat r2 = (com.android.launcher3.compat.UserHandleCompat) r2     // Catch:{ Exception -> 0x0f4e }
                r42 = r4
                r25 = r5
                r5 = r54
                int r4 = r3.getInt(r5)     // Catch:{ Exception -> 0x0f4a }
                if (r2 != 0) goto L_0x07fd
                java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x07e6 }
                r13.add(r2)     // Catch:{ Exception -> 0x07e6 }
                r54 = r5
                r12 = r20
                r27 = r21
                r21 = r33
                r6 = r35
                r8 = r38
                r26 = r41
                r7 = r43
                r33 = r47
                r47 = r9
            L_0x07e2:
                r9 = r36
                goto L_0x0f2b
            L_0x07e6:
                r0 = move-exception
                r2 = r0
                r54 = r5
                r12 = r20
                r27 = r21
                r21 = r33
                r6 = r35
            L_0x07f2:
                r8 = r38
                r26 = r41
                r7 = r43
                r33 = r47
                r47 = r9
                goto L_0x0782
            L_0x07fd:
                r54 = r5
                r5 = 0
                android.content.Intent r30 = android.content.Intent.parseUri(r8, r5)     // Catch:{ URISyntaxException -> 0x0ef5, Exception -> 0x0ef2 }
                android.content.ComponentName r5 = r30.getComponent()     // Catch:{ URISyntaxException -> 0x0ef5, Exception -> 0x0ef2 }
                if (r5 == 0) goto L_0x0b7f
                java.lang.String r31 = r5.getPackageName()     // Catch:{ URISyntaxException -> 0x0b65, Exception -> 0x0b4b }
                if (r31 == 0) goto L_0x0b7f
                r31 = r8
                java.lang.String r8 = r5.getPackageName()     // Catch:{ URISyntaxException -> 0x0b67, Exception -> 0x0b4b }
                r32 = r6
                r6 = r33
                boolean r8 = r6.isPackageEnabledForProfile(r8, r2)     // Catch:{ URISyntaxException -> 0x0b40, Exception -> 0x0b34 }
                if (r8 == 0) goto L_0x0853
                boolean r33 = r6.isActivityEnabledForProfile(r5, r2)     // Catch:{ URISyntaxException -> 0x083f, Exception -> 0x0829 }
                if (r33 == 0) goto L_0x0853
                r33 = 1
                goto L_0x0855
            L_0x0829:
                r0 = move-exception
                r2 = r0
                r12 = r20
                r27 = r21
                r8 = r38
                r26 = r41
                r7 = r43
                r33 = r47
                r21 = r6
                r47 = r9
                r6 = r35
                goto L_0x0782
            L_0x083f:
                r12 = r20
                r27 = r21
                r8 = r38
                r26 = r41
                r7 = r43
                r33 = r47
                r21 = r6
                r47 = r9
                r6 = r35
                goto L_0x0f09
            L_0x0853:
                r33 = 0
            L_0x0855:
                if (r8 == 0) goto L_0x085c
                java.lang.String r51 = r5.getPackageName()     // Catch:{ URISyntaxException -> 0x083f, Exception -> 0x0829 }
                goto L_0x085e
            L_0x085c:
                r51 = 0
            L_0x085e:
                if (r33 == 0) goto L_0x08c6
                if (r12 == 0) goto L_0x0869
                java.lang.Long r5 = java.lang.Long.valueOf(r14)     // Catch:{ URISyntaxException -> 0x083f, Exception -> 0x0829 }
                r9.add(r5)     // Catch:{ URISyntaxException -> 0x083f, Exception -> 0x0829 }
            L_0x0869:
                r5 = r47
                java.lang.Object r8 = r5.get(r10)     // Catch:{ URISyntaxException -> 0x08b0, Exception -> 0x0898 }
                java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ URISyntaxException -> 0x08b0, Exception -> 0x0898 }
                boolean r8 = r8.booleanValue()     // Catch:{ URISyntaxException -> 0x08b0, Exception -> 0x0898 }
                if (r8 == 0) goto L_0x0883
                r33 = r5
                r56 = r10
                r12 = r20
                r20 = r38
                r5 = 0
                r8 = 8
                goto L_0x088d
            L_0x0883:
                r33 = r5
                r56 = r10
                r12 = r20
                r20 = r38
                r5 = 0
                r8 = 0
            L_0x088d:
                r10 = 0
                r27 = 0
                r58 = r21
                r21 = r6
                r6 = r58
                goto L_0x0aed
            L_0x0898:
                r0 = move-exception
                r2 = r0
                r33 = r5
                r47 = r9
                r12 = r20
                r27 = r21
                r9 = r36
                r8 = r38
                r26 = r41
                r7 = r43
                r21 = r6
            L_0x08ac:
                r6 = r35
                goto L_0x0fc1
            L_0x08b0:
                r33 = r5
                r47 = r9
                r12 = r20
                r27 = r21
                r9 = r36
                r8 = r38
                r26 = r41
                r7 = r43
                r21 = r6
                r6 = r35
                goto L_0x0f0b
            L_0x08c6:
                r33 = r47
                if (r8 == 0) goto L_0x0971
                r8 = r4 & 2
                if (r8 == 0) goto L_0x0922
                java.lang.String r8 = r5.getPackageName()     // Catch:{ URISyntaxException -> 0x0918, Exception -> 0x090c }
                r12 = r21
                android.content.Intent r8 = r12.getLaunchIntentForPackage(r8)     // Catch:{ URISyntaxException -> 0x0905, Exception -> 0x08fc }
                if (r8 == 0) goto L_0x08f5
                r21 = r6
                android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ URISyntaxException -> 0x0907, Exception -> 0x08f3 }
                r6.<init>()     // Catch:{ URISyntaxException -> 0x0907, Exception -> 0x08f3 }
                r27 = r12
                java.lang.String r12 = "intent"
                r56 = r10
                r10 = 0
                java.lang.String r11 = r8.toUri(r10)     // Catch:{ URISyntaxException -> 0x091c, Exception -> 0x096f }
                r6.put(r12, r11)     // Catch:{ URISyntaxException -> 0x091c, Exception -> 0x096f }
                r1.updateItem(r14, r6)     // Catch:{ URISyntaxException -> 0x091c, Exception -> 0x096f }
                goto L_0x0929
            L_0x08f3:
                r0 = move-exception
                goto L_0x08ff
            L_0x08f5:
                r21 = r6
                r56 = r10
                r27 = r12
                goto L_0x0929
            L_0x08fc:
                r0 = move-exception
                r21 = r6
            L_0x08ff:
                r2 = r0
                r47 = r9
                r27 = r12
                goto L_0x0914
            L_0x0905:
                r21 = r6
            L_0x0907:
                r47 = r9
                r27 = r12
                goto L_0x091e
            L_0x090c:
                r0 = move-exception
                r27 = r21
                r21 = r6
            L_0x0911:
                r2 = r0
                r47 = r9
            L_0x0914:
                r12 = r20
                goto L_0x0b59
            L_0x0918:
                r27 = r21
                r21 = r6
            L_0x091c:
                r47 = r9
            L_0x091e:
                r12 = r20
                goto L_0x0b73
            L_0x0922:
                r56 = r10
                r27 = r21
                r21 = r6
                r8 = 0
            L_0x0929:
                if (r8 != 0) goto L_0x0959
                java.lang.String r2 = "Launcher.Model"
                java.lang.String r4 = r5.toString()     // Catch:{ URISyntaxException -> 0x091c, Exception -> 0x096f }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x091c, Exception -> 0x096f }
                r5.<init>()     // Catch:{ URISyntaxException -> 0x091c, Exception -> 0x096f }
                java.lang.String r6 = "Invalid component removed: "
                r5.append(r6)     // Catch:{ URISyntaxException -> 0x091c, Exception -> 0x096f }
                r5.append(r4)     // Catch:{ URISyntaxException -> 0x091c, Exception -> 0x096f }
                java.lang.String r4 = r5.toString()     // Catch:{ URISyntaxException -> 0x091c, Exception -> 0x096f }
                r5 = 0
                com.android.launcher3.Launcher.addDumpLog$ar$ds(r2, r4, r5)     // Catch:{ URISyntaxException -> 0x091c, Exception -> 0x096f }
                java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ URISyntaxException -> 0x091c, Exception -> 0x096f }
                r13.add(r2)     // Catch:{ URISyntaxException -> 0x091c, Exception -> 0x096f }
                r47 = r9
                r12 = r20
                r6 = r35
                r9 = r36
                r8 = r38
                goto L_0x0c1c
            L_0x0959:
                java.lang.Long r5 = java.lang.Long.valueOf(r14)     // Catch:{ URISyntaxException -> 0x091c, Exception -> 0x096f }
                r9.add(r5)     // Catch:{ URISyntaxException -> 0x091c, Exception -> 0x096f }
                r30 = r8
                r12 = r20
                r6 = r27
                r20 = r38
                r5 = 0
                r8 = 0
                r10 = 0
            L_0x096b:
                r27 = 0
                goto L_0x0aed
            L_0x096f:
                r0 = move-exception
                goto L_0x0911
            L_0x0971:
                r56 = r10
                r58 = r21
                r21 = r6
                r6 = r58
                if (r12 == 0) goto L_0x0a8d
                java.lang.String r8 = "Launcher.Model"
                java.lang.String r10 = r5.toString()     // Catch:{ URISyntaxException -> 0x0a89, Exception -> 0x0a84 }
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x0a89, Exception -> 0x0a84 }
                r11.<init>()     // Catch:{ URISyntaxException -> 0x0a89, Exception -> 0x0a84 }
                r27 = r12
                java.lang.String r12 = "package not yet restored: "
                r11.append(r12)     // Catch:{ URISyntaxException -> 0x0a89, Exception -> 0x0a84 }
                r11.append(r10)     // Catch:{ URISyntaxException -> 0x0a89, Exception -> 0x0a84 }
                java.lang.String r10 = r11.toString()     // Catch:{ URISyntaxException -> 0x0a89, Exception -> 0x0a84 }
                r11 = 0
                com.android.launcher3.Launcher.addDumpLog$ar$ds(r8, r10, r11)     // Catch:{ URISyntaxException -> 0x0a89, Exception -> 0x0a84 }
                r8 = r4 & 8
                if (r8 == 0) goto L_0x09a4
                r12 = r20
                r20 = r38
                r5 = 0
            L_0x09a1:
                r8 = 0
                goto L_0x0aa7
            L_0x09a4:
                java.lang.String r8 = r5.getPackageName()     // Catch:{ URISyntaxException -> 0x0a89, Exception -> 0x0a84 }
                r10 = r38
                boolean r8 = r10.containsKey(r8)     // Catch:{ URISyntaxException -> 0x0a80, Exception -> 0x0a7b }
                if (r8 == 0) goto L_0x09df
                r4 = r4 | 8
                android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ URISyntaxException -> 0x09d6, Exception -> 0x09cb }
                r5.<init>()     // Catch:{ URISyntaxException -> 0x09d6, Exception -> 0x09cb }
                java.lang.String r8 = "restored"
                java.lang.Integer r11 = java.lang.Integer.valueOf(r4)     // Catch:{ URISyntaxException -> 0x09d6, Exception -> 0x09cb }
                r5.put(r8, r11)     // Catch:{ URISyntaxException -> 0x09d6, Exception -> 0x09cb }
                r1.updateItem(r14, r5)     // Catch:{ URISyntaxException -> 0x09d6, Exception -> 0x09cb }
                r12 = r20
                r5 = 0
                r8 = 0
                r20 = r10
                goto L_0x0aa7
            L_0x09cb:
                r0 = move-exception
                r2 = r0
                r27 = r6
                r47 = r9
                r8 = r10
                r12 = r20
                goto L_0x0bab
            L_0x09d6:
                r27 = r6
                r47 = r9
                r8 = r10
                r12 = r20
                goto L_0x0bb6
            L_0x09df:
                r8 = r4 & 240(0xf0, float:3.36E-43)
                if (r8 == 0) goto L_0x0a50
                int r8 = r8 >> 4
                int r8 = com.android.launcher3.backup.BackupProtos$Favorite.TargetType.m14178a(r8)     // Catch:{ URISyntaxException -> 0x0a80, Exception -> 0x0a7b }
                if (r8 != 0) goto L_0x09ec
                r8 = 1
            L_0x09ec:
                com.android.launcher3.CommonAppTypeParser r11 = new com.android.launcher3.CommonAppTypeParser     // Catch:{ URISyntaxException -> 0x0a80, Exception -> 0x0a7b }
                r12 = r20
                r11.<init>(r14, r8, r12)     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                int r8 = r11.mResId     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                if (r8 != 0) goto L_0x09f8
                goto L_0x0a2d
            L_0x09f8:
                r8 = 0
                r11.parsedIntent = r8     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r11.parsedValues = r8     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                com.android.launcher3.CommonAppTypeParser$MyLayoutParser r8 = new com.android.launcher3.CommonAppTypeParser$MyLayoutParser     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r8.<init>()     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r8.parseValues()     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                android.content.ContentValues r8 = r11.parsedValues     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                if (r8 == 0) goto L_0x0a2d
                android.content.Intent r8 = r11.parsedIntent     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                if (r8 == 0) goto L_0x0a2d
                r8.getComponent()     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                android.content.ContentValues r5 = r11.parsedValues     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                java.lang.String r11 = "restored"
                r38 = r4
                r20 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r20)     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r5.put(r11, r4)     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r1.updateItem(r14, r5)     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r30 = r8
                r20 = r10
                r4 = r38
                r5 = 0
                r8 = 0
                r10 = 1
                goto L_0x096b
            L_0x0a2d:
                java.lang.String r2 = "Launcher.Model"
                java.lang.String r4 = r5.toString()     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r5.<init>()     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                java.lang.String r7 = "Unrestored package removed: "
                r5.append(r7)     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r5.append(r4)     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                java.lang.String r4 = r5.toString()     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r5 = 0
                com.android.launcher3.Launcher.addDumpLog$ar$ds(r2, r4, r5)     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r13.add(r2)     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                goto L_0x0a74
            L_0x0a50:
                r12 = r20
                java.lang.String r2 = "Launcher.Model"
                java.lang.String r4 = r5.toString()     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r5.<init>()     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                java.lang.String r7 = "Unrestored package removed: "
                r5.append(r7)     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r5.append(r4)     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                java.lang.String r4 = r5.toString()     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r5 = 0
                com.android.launcher3.Launcher.addDumpLog$ar$ds(r2, r4, r5)     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r13.add(r2)     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
            L_0x0a74:
                r27 = r6
                r47 = r9
                r8 = r10
                goto L_0x0c18
            L_0x0a7b:
                r0 = move-exception
                r12 = r20
                goto L_0x0b25
            L_0x0a80:
                r12 = r20
                goto L_0x0b2d
            L_0x0a84:
                r0 = move-exception
                r12 = r20
                goto L_0x0b54
            L_0x0a89:
                r12 = r20
                goto L_0x0b6f
            L_0x0a8d:
                r27 = r12
                r12 = r20
                r10 = r38
                r38 = r4
                java.lang.String r4 = r5.getPackageName()     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r8 = 8192(0x2000, float:1.14794E-41)
                boolean r4 = com.android.launcher3.util.PackageManagerHelper.isAppEnabled(r6, r4, r8)     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                if (r4 == 0) goto L_0x0aa9
                r20 = r10
                r4 = r38
                r5 = 1
                r8 = 2
            L_0x0aa7:
                r10 = 0
                goto L_0x0aed
            L_0x0aa9:
                if (r19 != 0) goto L_0x0afa
                java.lang.String r4 = "Launcher.Model"
                java.lang.String r8 = r5.toString()     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r11.<init>()     // Catch:{ URISyntaxException -> 0x0b2d, Exception -> 0x0b24 }
                r20 = r10
                java.lang.String r10 = "Invalid package: "
                r11.append(r10)     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                r11.append(r8)     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                java.lang.String r8 = " (check again later)"
                r11.append(r8)     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                java.lang.String r8 = r11.toString()     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                r10 = 0
                com.android.launcher3.Launcher.addDumpLog$ar$ds(r4, r8, r10)     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                java.util.HashMap r4 = com.android.launcher3.LauncherModel.sPendingPackages     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                java.lang.Object r4 = r4.get(r2)     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                java.util.HashSet r4 = (java.util.HashSet) r4     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                if (r4 != 0) goto L_0x0ae1
                java.util.HashSet r4 = new java.util.HashSet     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                r4.<init>()     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                java.util.HashMap r8 = com.android.launcher3.LauncherModel.sPendingPackages     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                r8.put(r2, r4)     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
            L_0x0ae1:
                java.lang.String r5 = r5.getPackageName()     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                r4.add(r5)     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                r4 = r38
                r5 = 1
                goto L_0x09a1
            L_0x0aed:
                r31 = r5
                r38 = r8
                r11 = r10
                r10 = r27
                r8 = r30
                r5 = r51
                goto L_0x0bc7
            L_0x0afa:
                r20 = r10
                java.lang.String r2 = "Launcher.Model"
                java.lang.String r4 = r5.toString()     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                r5.<init>()     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                java.lang.String r7 = "Invalid package removed: "
                r5.append(r7)     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                r5.append(r4)     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                java.lang.String r4 = r5.toString()     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                r5 = 0
                com.android.launcher3.Launcher.addDumpLog$ar$ds(r2, r4, r5)     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                r13.add(r2)     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                r27 = r6
                r47 = r9
                goto L_0x0c16
            L_0x0b24:
                r0 = move-exception
            L_0x0b25:
                r2 = r0
                r27 = r6
                r47 = r9
                r8 = r10
                goto L_0x0bab
            L_0x0b2d:
                r27 = r6
                r47 = r9
                r8 = r10
                goto L_0x0bb6
            L_0x0b34:
                r0 = move-exception
                r12 = r20
                r33 = r47
                r58 = r21
                r21 = r6
                r6 = r58
                goto L_0x0b54
            L_0x0b40:
                r12 = r20
                r33 = r47
                r58 = r21
                r21 = r6
                r6 = r58
                goto L_0x0b6f
            L_0x0b4b:
                r0 = move-exception
                r12 = r20
                r6 = r21
                r21 = r33
                r33 = r47
            L_0x0b54:
                r2 = r0
                r27 = r6
                r47 = r9
            L_0x0b59:
                r6 = r35
                r9 = r36
                r8 = r38
            L_0x0b5f:
                r26 = r41
            L_0x0b61:
                r7 = r43
                goto L_0x0fc1
            L_0x0b65:
                r31 = r8
            L_0x0b67:
                r12 = r20
                r6 = r21
                r21 = r33
                r33 = r47
            L_0x0b6f:
                r27 = r6
                r47 = r9
            L_0x0b73:
                r6 = r35
                r9 = r36
                r8 = r38
            L_0x0b79:
                r26 = r41
                r7 = r43
                goto L_0x0f0b
            L_0x0b7f:
                r32 = r6
                r31 = r8
                r56 = r10
                r27 = r12
                r12 = r20
                r6 = r21
                r21 = r33
                r20 = r38
                r33 = r47
                r38 = r4
                if (r5 != 0) goto L_0x0bbb
                java.lang.Long r4 = java.lang.Long.valueOf(r14)     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                r9.add(r4)     // Catch:{ URISyntaxException -> 0x0bb0, Exception -> 0x0ba3 }
                r8 = r30
                r4 = r38
                r5 = 0
                r10 = 0
                goto L_0x0bc2
            L_0x0ba3:
                r0 = move-exception
                r2 = r0
                r27 = r6
                r47 = r9
            L_0x0ba9:
                r8 = r20
            L_0x0bab:
                r6 = r35
                r9 = r36
                goto L_0x0b5f
            L_0x0bb0:
                r27 = r6
                r47 = r9
                r8 = r20
            L_0x0bb6:
                r6 = r35
                r9 = r36
                goto L_0x0b79
            L_0x0bbb:
                r10 = r27
                r8 = r30
                r4 = r38
                r5 = 0
            L_0x0bc2:
                r11 = 0
                r31 = 0
                r38 = 0
            L_0x0bc7:
                if (r7 < 0) goto L_0x0be2
                r51 = r7
                r47 = r9
                r9 = r36
                int r7 = r3.getInt(r9)     // Catch:{ Exception -> 0x0bd8 }
                r9 = 3
                if (r7 < r9) goto L_0x0be6
                r7 = 1
                goto L_0x0be7
            L_0x0bd8:
                r0 = move-exception
                r2 = r0
                r27 = r6
                r8 = r20
                r6 = r35
                goto L_0x0b5f
            L_0x0be2:
                r51 = r7
                r47 = r9
            L_0x0be6:
                r7 = 0
            L_0x0be7:
                if (r11 == 0) goto L_0x0c27
                com.android.launcher3.compat.UserHandleCompat r4 = com.android.launcher3.compat.UserHandleCompat.myUserHandle()     // Catch:{ Exception -> 0x0c22 }
                boolean r4 = r2.equals(r4)     // Catch:{ Exception -> 0x0c22 }
                if (r4 == 0) goto L_0x0c0d
                com.android.launcher3.LauncherModel r4 = com.android.launcher3.LauncherModel.this     // Catch:{ Exception -> 0x0c22 }
                r29 = 0
                r31 = 0
                r26 = r4
                r27 = r8
                r28 = r2
                r30 = r41
                r32 = r7
                com.android.launcher3.ShortcutInfo r2 = r26.getAppShortcutInfo(r27, r28, r29, r30, r31, r32)     // Catch:{ Exception -> 0x0c22 }
                r9 = r41
                r41 = r10
                goto L_0x0cee
            L_0x0c0d:
                java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0c22 }
                r13.add(r2)     // Catch:{ Exception -> 0x0c22 }
                r27 = r6
            L_0x0c16:
                r8 = r20
            L_0x0c18:
                r6 = r35
                r9 = r36
            L_0x0c1c:
                r26 = r41
            L_0x0c1e:
                r7 = r43
                goto L_0x0f2b
            L_0x0c22:
                r0 = move-exception
                r2 = r0
                r27 = r6
                goto L_0x0ba9
            L_0x0c27:
                if (r10 == 0) goto L_0x0cd4
                com.android.launcher3.compat.UserHandleCompat r5 = com.android.launcher3.compat.UserHandleCompat.myUserHandle()     // Catch:{ Exception -> 0x0c22 }
                boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x0c22 }
                if (r2 == 0) goto L_0x0cbf
                java.lang.String r2 = "Launcher.Model"
                java.lang.String r5 = "constructing info for partially restored package"
                r7 = 0
                com.android.launcher3.Launcher.addDumpLog$ar$ds(r2, r5, r7)     // Catch:{ Exception -> 0x0c22 }
                com.android.launcher3.LauncherModel r2 = com.android.launcher3.LauncherModel.this     // Catch:{ Exception -> 0x0c22 }
                com.android.launcher3.ShortcutInfo r5 = new com.android.launcher3.ShortcutInfo     // Catch:{ Exception -> 0x0c22 }
                r5.<init>()     // Catch:{ Exception -> 0x0c22 }
                com.android.launcher3.compat.UserHandleCompat r7 = com.android.launcher3.compat.UserHandleCompat.myUserHandle()     // Catch:{ Exception -> 0x0c22 }
                r5.user = r7     // Catch:{ Exception -> 0x0c22 }
                r9 = r41
                android.graphics.Bitmap r7 = r9.loadIcon(r3, r5)     // Catch:{ Exception -> 0x0cf2 }
                if (r7 != 0) goto L_0x0c5b
                com.android.launcher3.IconCache r7 = r2.mIconCache     // Catch:{ Exception -> 0x0cf2 }
                com.android.launcher3.compat.UserHandleCompat r11 = r5.user     // Catch:{ Exception -> 0x0cf2 }
                r41 = r10
                r10 = 0
                r7.getTitleAndIcon(r5, r8, r11, r10)     // Catch:{ Exception -> 0x0cf2 }
                goto L_0x0c5f
            L_0x0c5b:
                r41 = r10
                r5.mIcon = r7     // Catch:{ Exception -> 0x0cf2 }
            L_0x0c5f:
                r7 = r4 & 1
                if (r7 == 0) goto L_0x0c74
                java.lang.String r7 = r9.getTitle(r3)     // Catch:{ Exception -> 0x0cf2 }
                boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0cf2 }
                if (r10 != 0) goto L_0x0c86
                java.lang.String r7 = com.android.launcher3.Utilities.trim(r7)     // Catch:{ Exception -> 0x0cf2 }
                r5.title = r7     // Catch:{ Exception -> 0x0cf2 }
                goto L_0x0c86
            L_0x0c74:
                r7 = r4 & 2
                if (r7 == 0) goto L_0x0ca8
                java.lang.CharSequence r7 = r5.title     // Catch:{ Exception -> 0x0cf2 }
                boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0cf2 }
                if (r7 == 0) goto L_0x0c86
                java.lang.String r7 = r9.getTitle(r3)     // Catch:{ Exception -> 0x0cf2 }
                r5.title = r7     // Catch:{ Exception -> 0x0cf2 }
            L_0x0c86:
                com.android.launcher3.compat.UserManagerCompat r2 = r2.mUserManager     // Catch:{ Exception -> 0x0cf2 }
                java.lang.CharSequence r7 = r5.title     // Catch:{ Exception -> 0x0cf2 }
                com.android.launcher3.compat.UserHandleCompat r10 = r5.user     // Catch:{ Exception -> 0x0cf2 }
                java.lang.CharSequence r2 = r2.getBadgedLabelForUser(r7, r10)     // Catch:{ Exception -> 0x0cf2 }
                r5.contentDescription = r2     // Catch:{ Exception -> 0x0cf2 }
                r10 = r32
                r5.itemType = r10     // Catch:{ Exception -> 0x0cf2 }
                r5.promisedIntent = r8     // Catch:{ Exception -> 0x0cf2 }
                r5.status = r4     // Catch:{ Exception -> 0x0cf2 }
                android.content.ComponentName r2 = r8.getComponent()     // Catch:{ Exception -> 0x0cf2 }
                java.lang.String r2 = r2.getPackageName()     // Catch:{ Exception -> 0x0cf2 }
                android.content.Intent r8 = com.android.launcher3.LauncherModel.getMarketIntent(r2)     // Catch:{ Exception -> 0x0cf2 }
                r2 = r5
                goto L_0x0cee
            L_0x0ca8:
                java.security.InvalidParameterException r2 = new java.security.InvalidParameterException     // Catch:{ Exception -> 0x0cf2 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0cf2 }
                r5.<init>()     // Catch:{ Exception -> 0x0cf2 }
                java.lang.String r7 = "Invalid restoreType "
                r5.append(r7)     // Catch:{ Exception -> 0x0cf2 }
                r5.append(r4)     // Catch:{ Exception -> 0x0cf2 }
                java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0cf2 }
                r2.<init>(r4)     // Catch:{ Exception -> 0x0cf2 }
                throw r2     // Catch:{ Exception -> 0x0cf2 }
            L_0x0cbf:
                r9 = r41
                java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0cf2 }
                r13.add(r2)     // Catch:{ Exception -> 0x0cf2 }
                r27 = r6
            L_0x0cca:
                r26 = r9
                r8 = r20
                r6 = r35
                r9 = r36
                goto L_0x0c1e
            L_0x0cd4:
                r9 = r41
                r41 = r10
                r10 = r32
                if (r10 != 0) goto L_0x0d00
                com.android.launcher3.LauncherModel r4 = com.android.launcher3.LauncherModel.this     // Catch:{ Exception -> 0x0cf2 }
                r26 = r4
                r27 = r8
                r28 = r2
                r29 = r3
                r30 = r9
                r32 = r7
                com.android.launcher3.ShortcutInfo r2 = r26.getAppShortcutInfo(r27, r28, r29, r30, r31, r32)     // Catch:{ Exception -> 0x0cf2 }
            L_0x0cee:
                r10 = r56
                goto L_0x0ddd
            L_0x0cf2:
                r0 = move-exception
            L_0x0cf3:
                r2 = r0
            L_0x0cf4:
                r27 = r6
            L_0x0cf6:
                r26 = r9
                r8 = r20
                r6 = r35
                r9 = r36
                goto L_0x0b61
            L_0x0d00:
                r4 = 6
                if (r10 != r4) goto L_0x0d8b
                com.android.launcher3.shortcuts.DeepShortcutKey r4 = com.android.launcher3.shortcuts.DeepShortcutKey.fromIntent(r8, r2)     // Catch:{ Exception -> 0x0cf2 }
                r7 = r24
                r10 = r56
                java.lang.Object r5 = r7.get(r10)     // Catch:{ Exception -> 0x0d86 }
                java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ Exception -> 0x0d86 }
                boolean r5 = r5.booleanValue()     // Catch:{ Exception -> 0x0d86 }
                if (r5 == 0) goto L_0x0d69
                r5 = r45
                java.lang.Object r8 = r5.get(r4)     // Catch:{ Exception -> 0x0d62 }
                com.android.launcher3.shortcuts.ShortcutInfoCompat r8 = (com.android.launcher3.shortcuts.ShortcutInfoCompat) r8     // Catch:{ Exception -> 0x0d62 }
                if (r8 != 0) goto L_0x0d38
                java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0d2f }
                r13.add(r2)     // Catch:{ Exception -> 0x0d2f }
                r45 = r5
                r27 = r6
                r24 = r7
                goto L_0x0cca
            L_0x0d2f:
                r0 = move-exception
                r2 = r0
                r45 = r5
                r27 = r6
                r24 = r7
                goto L_0x0cf6
            L_0x0d38:
                r45 = r5
                com.android.launcher3.ShortcutInfo r5 = new com.android.launcher3.ShortcutInfo     // Catch:{ Exception -> 0x0d86 }
                r5.<init>((com.android.launcher3.shortcuts.ShortcutInfoCompat) r8, (android.content.Context) r12)     // Catch:{ Exception -> 0x0d86 }
                android.content.ComponentName r8 = r5.getTargetComponent()     // Catch:{ Exception -> 0x0d86 }
                java.lang.String r8 = r8.getPackageName()     // Catch:{ Exception -> 0x0d86 }
                r24 = r7
                com.android.launcher3.compat.LauncherAppsCompat r7 = com.android.launcher3.compat.LauncherAppsCompat.getInstance(r12)     // Catch:{ Exception -> 0x0cf2 }
                android.content.pm.ApplicationInfo r2 = r7.getApplicationInfo(r8, r2)     // Catch:{ Exception -> 0x0cf2 }
                if (r2 == 0) goto L_0x0d5f
                boolean r2 = com.android.launcher3.util.PackageManagerHelper.isAppSuspended(r2)     // Catch:{ Exception -> 0x0cf2 }
                if (r2 == 0) goto L_0x0d5f
                int r2 = r5.isDisabled     // Catch:{ Exception -> 0x0cf2 }
                r7 = 4
                r2 = r2 | r7
                r5.isDisabled = r2     // Catch:{ Exception -> 0x0cf2 }
            L_0x0d5f:
                android.content.Intent r8 = r5.intent     // Catch:{ Exception -> 0x0cf2 }
                goto L_0x0d80
            L_0x0d62:
                r0 = move-exception
                r24 = r7
                r2 = r0
                r45 = r5
                goto L_0x0cf4
            L_0x0d69:
                r24 = r7
                com.android.launcher3.ShortcutInfo r5 = new com.android.launcher3.ShortcutInfo     // Catch:{ Exception -> 0x0cf2 }
                r5.<init>()     // Catch:{ Exception -> 0x0cf2 }
                r5.user = r2     // Catch:{ Exception -> 0x0cf2 }
                r2 = 6
                r5.itemType = r2     // Catch:{ Exception -> 0x0cf2 }
                com.android.launcher3.LauncherModel r2 = com.android.launcher3.LauncherModel.this     // Catch:{ Exception -> 0x0cf2 }
                r2.loadInfoFromCursor(r5, r3, r9)     // Catch:{ Exception -> 0x0cf2 }
                int r2 = r5.isDisabled     // Catch:{ Exception -> 0x0cf2 }
                r2 = r2 | 32
                r5.isDisabled = r2     // Catch:{ Exception -> 0x0cf2 }
            L_0x0d80:
                r2 = r5
                r5 = 0
                com.android.launcher3.LauncherModel.incrementPinnedShortcutCount(r4, r5)     // Catch:{ Exception -> 0x0cf2 }
                goto L_0x0ddd
            L_0x0d86:
                r0 = move-exception
                r24 = r7
                goto L_0x0cf3
            L_0x0d8b:
                r2 = r45
                r10 = r56
                com.android.launcher3.LauncherModel r4 = com.android.launcher3.LauncherModel.this     // Catch:{ Exception -> 0x0ee1 }
                com.android.launcher3.ShortcutInfo r7 = new com.android.launcher3.ShortcutInfo     // Catch:{ Exception -> 0x0ee1 }
                r7.<init>()     // Catch:{ Exception -> 0x0ee1 }
                r45 = r2
                com.android.launcher3.compat.UserHandleCompat r2 = com.android.launcher3.compat.UserHandleCompat.myUserHandle()     // Catch:{ Exception -> 0x0ecb }
                r7.user = r2     // Catch:{ Exception -> 0x0ecb }
                r2 = 1
                r7.itemType = r2     // Catch:{ Exception -> 0x0ecb }
                r4.loadInfoFromCursor(r7, r3, r9)     // Catch:{ Exception -> 0x0ecb }
                r2 = 0
                android.content.pm.ApplicationInfo r4 = r6.getApplicationInfo(r5, r2)     // Catch:{ NameNotFoundException -> 0x0db3 }
                if (r4 == 0) goto L_0x0db3
                boolean r2 = com.android.launcher3.util.PackageManagerHelper.isAppSuspended(r4)     // Catch:{ NameNotFoundException -> 0x0db3 }
                if (r2 == 0) goto L_0x0db3
                r38 = r38 | 4
            L_0x0db3:
                java.lang.String r2 = r8.getAction()     // Catch:{ Exception -> 0x0ecb }
                if (r2 == 0) goto L_0x0ddc
                java.util.Set r2 = r8.getCategories()     // Catch:{ Exception -> 0x0cf2 }
                if (r2 == 0) goto L_0x0ddc
                java.lang.String r2 = r8.getAction()     // Catch:{ Exception -> 0x0cf2 }
                java.lang.String r4 = "android.intent.action.MAIN"
                boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x0cf2 }
                if (r2 == 0) goto L_0x0ddc
                java.util.Set r2 = r8.getCategories()     // Catch:{ Exception -> 0x0cf2 }
                java.lang.String r4 = "android.intent.category.LAUNCHER"
                boolean r2 = r2.contains(r4)     // Catch:{ Exception -> 0x0cf2 }
                if (r2 == 0) goto L_0x0ddc
                r2 = 270532608(0x10200000, float:3.1554436E-29)
                r8.addFlags(r2)     // Catch:{ Exception -> 0x0cf2 }
            L_0x0ddc:
                r2 = r7
            L_0x0ddd:
                if (r2 == 0) goto L_0x0ecd
                r2.f16556id = r14     // Catch:{ Exception -> 0x0ecb }
                r2.intent = r8     // Catch:{ Exception -> 0x0ecb }
                r27 = r6
                r4 = r51
                long r5 = (long) r4
                r2.container = r5     // Catch:{ Exception -> 0x0ec9 }
                r26 = r9
                r7 = r43
                int r9 = r3.getInt(r7)     // Catch:{ Exception -> 0x0ec2 }
                r28 = r5
                long r5 = (long) r9     // Catch:{ Exception -> 0x0ec2 }
                r2.screenId = r5     // Catch:{ Exception -> 0x0ec2 }
                r5 = r42
                int r6 = r3.getInt(r5)     // Catch:{ Exception -> 0x0ebe }
                r2.cellX = r6     // Catch:{ Exception -> 0x0ebe }
                r6 = r25
                int r9 = r3.getInt(r6)     // Catch:{ Exception -> 0x0eb8 }
                r2.cellY = r9     // Catch:{ Exception -> 0x0eb8 }
                r42 = r5
                r9 = r36
                int r5 = r3.getInt(r9)     // Catch:{ Exception -> 0x0eaf }
                r2.rank = r5     // Catch:{ Exception -> 0x0eaf }
                r5 = 1
                r2.spanX = r5     // Catch:{ Exception -> 0x0eaf }
                r2.spanY = r5     // Catch:{ Exception -> 0x0eaf }
                android.content.Intent r5 = r2.intent     // Catch:{ Exception -> 0x0eaf }
                r25 = r6
                java.lang.String r6 = "profile"
                r5.putExtra(r6, r10)     // Catch:{ Exception -> 0x0ead }
                android.content.Intent r5 = r2.promisedIntent     // Catch:{ Exception -> 0x0ead }
                if (r5 == 0) goto L_0x0e2f
                java.lang.String r6 = "profile"
                r5.putExtra(r6, r10)     // Catch:{ Exception -> 0x0e29 }
                goto L_0x0e2f
            L_0x0e29:
                r0 = move-exception
                r2 = r0
                r8 = r20
                goto L_0x08ac
            L_0x0e2f:
                int r5 = r2.isDisabled     // Catch:{ Exception -> 0x0ead }
                r5 = r5 | r38
                r2.isDisabled = r5     // Catch:{ Exception -> 0x0ead }
                if (r44 == 0) goto L_0x0e43
                boolean r5 = com.android.launcher3.Utilities.isSystemApp(r12, r8)     // Catch:{ Exception -> 0x0e29 }
                if (r5 != 0) goto L_0x0e43
                int r5 = r2.isDisabled     // Catch:{ Exception -> 0x0e29 }
                r6 = 1
                r5 = r5 | r6
                r2.isDisabled = r5     // Catch:{ Exception -> 0x0e29 }
            L_0x0e43:
                java.util.ArrayList r5 = com.android.launcher3.LauncherModel.sBgWorkspaceScreens     // Catch:{ Exception -> 0x0ead }
                r6 = r35
                boolean r5 = r1.checkItemPlacement(r6, r2, r5)     // Catch:{ Exception -> 0x0ea8 }
                if (r5 != 0) goto L_0x0e5d
                java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0e57 }
                r13.add(r2)     // Catch:{ Exception -> 0x0e57 }
                r8 = r20
                goto L_0x0ea4
            L_0x0e57:
                r0 = move-exception
                r2 = r0
                r8 = r20
                goto L_0x0fc1
            L_0x0e5d:
                if (r41 == 0) goto L_0x0e82
                android.content.ComponentName r5 = r2.getTargetComponent()     // Catch:{ Exception -> 0x0ea8 }
                if (r5 == 0) goto L_0x0e82
                java.lang.String r5 = r5.getPackageName()     // Catch:{ Exception -> 0x0ea8 }
                r8 = r20
                java.lang.Object r5 = r8.get(r5)     // Catch:{ Exception -> 0x0f47 }
                java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x0f47 }
                if (r5 == 0) goto L_0x0e7b
                int r5 = r5.intValue()     // Catch:{ Exception -> 0x0f47 }
                r2.setInstallProgress(r5)     // Catch:{ Exception -> 0x0f47 }
                goto L_0x0e84
            L_0x0e7b:
                int r5 = r2.status     // Catch:{ Exception -> 0x0f47 }
                r5 = r5 & -5
                r2.status = r5     // Catch:{ Exception -> 0x0f47 }
                goto L_0x0e84
            L_0x0e82:
                r8 = r20
            L_0x0e84:
                r5 = -101(0xffffffffffffff9b, float:NaN)
                if (r4 == r5) goto L_0x0e98
                r5 = -100
                if (r4 == r5) goto L_0x0e98
                com.android.launcher3.util.LongArrayMap r4 = com.android.launcher3.LauncherModel.sBgFolders     // Catch:{ Exception -> 0x0f47 }
                r10 = r28
                com.android.launcher3.FolderInfo r4 = com.android.launcher3.LauncherModel.findOrMakeFolder(r4, r10)     // Catch:{ Exception -> 0x0f47 }
                r4.add(r2)     // Catch:{ Exception -> 0x0f47 }
                goto L_0x0e9d
            L_0x0e98:
                java.util.ArrayList r4 = com.android.launcher3.LauncherModel.sBgWorkspaceItems     // Catch:{ Exception -> 0x0f47 }
                r4.add(r2)     // Catch:{ Exception -> 0x0f47 }
            L_0x0e9d:
                com.android.launcher3.util.LongArrayMap r4 = com.android.launcher3.LauncherModel.sBgItemsIdMap     // Catch:{ Exception -> 0x0f47 }
                long r10 = r2.f16556id     // Catch:{ Exception -> 0x0f47 }
                r4.put(r10, r2)     // Catch:{ Exception -> 0x0f47 }
            L_0x0ea4:
                r5 = r53
                goto L_0x0fca
            L_0x0ea8:
                r0 = move-exception
                r8 = r20
                goto L_0x0fc0
            L_0x0ead:
                r0 = move-exception
                goto L_0x0eb2
            L_0x0eaf:
                r0 = move-exception
                r25 = r6
            L_0x0eb2:
                r8 = r20
                r6 = r35
                goto L_0x0fc0
            L_0x0eb8:
                r0 = move-exception
                r42 = r5
                r25 = r6
                goto L_0x0ec3
            L_0x0ebe:
                r0 = move-exception
                r42 = r5
                goto L_0x0ec3
            L_0x0ec2:
                r0 = move-exception
            L_0x0ec3:
                r8 = r20
                r6 = r35
                goto L_0x0f8a
            L_0x0ec9:
                r0 = move-exception
                goto L_0x0ee6
            L_0x0ecb:
                r0 = move-exception
                goto L_0x0ee4
            L_0x0ecd:
                r27 = r6
                r26 = r9
                r8 = r20
                r6 = r35
                r9 = r36
                r7 = r43
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0f47 }
                java.lang.String r4 = "Unexpected null ShortcutInfo"
                r2.<init>(r4)     // Catch:{ Exception -> 0x0f47 }
                throw r2     // Catch:{ Exception -> 0x0f47 }
            L_0x0ee1:
                r0 = move-exception
                r45 = r2
            L_0x0ee4:
                r27 = r6
            L_0x0ee6:
                r26 = r9
                r8 = r20
                r6 = r35
                r9 = r36
                r7 = r43
                goto L_0x0fc0
            L_0x0ef2:
                r0 = move-exception
                goto L_0x0f57
            L_0x0ef5:
                r31 = r8
                r12 = r20
                r27 = r21
                r21 = r33
                r6 = r35
                r8 = r38
                r26 = r41
                r7 = r43
                r33 = r47
                r47 = r9
            L_0x0f09:
                r9 = r36
            L_0x0f0b:
                java.lang.String r2 = "Launcher.Model"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0f47 }
                r4.<init>()     // Catch:{ Exception -> 0x0f47 }
                java.lang.String r5 = "Invalid uri: "
                r4.append(r5)     // Catch:{ Exception -> 0x0f47 }
                r5 = r31
                r4.append(r5)     // Catch:{ Exception -> 0x0f47 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0f47 }
                r5 = 0
                com.android.launcher3.Launcher.addDumpLog$ar$ds(r2, r4, r5)     // Catch:{ Exception -> 0x0f47 }
                java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0f47 }
                r13.add(r2)     // Catch:{ Exception -> 0x0f47 }
            L_0x0f2b:
                r35 = r6
                r43 = r7
                r36 = r9
                r20 = r12
                r2 = r24
                r41 = r26
                r38 = r37
                r37 = r40
                r15 = r45
                r7 = r48
                r9 = r50
                r10 = r52
                r5 = r53
                goto L_0x0fe2
            L_0x0f47:
                r0 = move-exception
                goto L_0x0fc0
            L_0x0f4a:
                r0 = move-exception
                r54 = r5
                goto L_0x0f57
            L_0x0f4e:
                r0 = move-exception
                goto L_0x0f53
            L_0x0f50:
                r0 = move-exception
                r52 = r2
            L_0x0f53:
                r42 = r4
                r25 = r5
            L_0x0f57:
                r12 = r20
                r27 = r21
                r21 = r33
                r6 = r35
                goto L_0x0f80
            L_0x0f60:
                r0 = move-exception
                r55 = r2
                r42 = r4
                r25 = r5
                goto L_0x0f79
            L_0x0f68:
                r0 = move-exception
                r34 = r2
                r42 = r4
                r25 = r5
                goto L_0x0f77
            L_0x0f70:
                r0 = move-exception
                r42 = r4
                r25 = r5
                r39 = r8
            L_0x0f77:
                r23 = r10
            L_0x0f79:
                r6 = r11
                r12 = r20
                r27 = r21
                r21 = r33
            L_0x0f80:
                r8 = r38
                r26 = r41
                r7 = r43
                r33 = r47
                r47 = r9
            L_0x0f8a:
                r9 = r36
                goto L_0x0fc0
            L_0x0f8d:
                r0 = move-exception
                r54 = r4
                r53 = r5
                r48 = r7
                r49 = r8
                r50 = r9
                r52 = r10
                r12 = r20
                r27 = r21
                r8 = r25
                r21 = r33
                r6 = r35
                r9 = r36
                r25 = r40
                r26 = r41
                r7 = r43
                r55 = r46
                r33 = r47
                r46 = r13
                r47 = r23
                r13 = r24
                r40 = r37
                r37 = r38
                r23 = r45
                r24 = r2
                r45 = r15
            L_0x0fc0:
                r2 = r0
            L_0x0fc1:
                r5 = r53
            L_0x0fc3:
                java.lang.String r4 = "Launcher.Model"
                java.lang.String r10 = "Desktop items loading interrupted"
                com.android.launcher3.Launcher.addDumpLog$ar$ds(r4, r10, r2)     // Catch:{ all -> 0x114a }
            L_0x0fca:
                r35 = r6
                r43 = r7
                r36 = r9
                r20 = r12
                r2 = r24
                r41 = r26
                r38 = r37
                r37 = r40
                r15 = r45
                r7 = r48
                r9 = r50
                r10 = r52
            L_0x0fe2:
                r4 = r54
                r24 = r13
                r45 = r23
                r40 = r25
                r13 = r46
                r23 = r47
                r46 = r55
                r25 = r8
                r47 = r33
                r8 = r49
                r33 = r21
                r21 = r27
                goto L_0x01fc
            L_0x0ffc:
                r45 = r15
                r12 = r20
                r47 = r23
                r13 = r24
                if (r3 == 0) goto L_0x1009
                r3.close()     // Catch:{ all -> 0x1152 }
            L_0x1009:
                boolean r2 = r1.mStopped     // Catch:{ all -> 0x1152 }
                if (r2 == 0) goto L_0x1012
                clearSBgDataStructures$ar$ds()     // Catch:{ all -> 0x1152 }
                monitor-exit(r16)     // Catch:{ all -> 0x1152 }
                return
            L_0x1012:
                int r2 = r13.size()     // Catch:{ all -> 0x1152 }
                if (r2 <= 0) goto L_0x1058
                android.net.Uri r2 = com.android.launcher3.LauncherSettings$Favorites.CONTENT_URI     // Catch:{ all -> 0x1152 }
                java.lang.String r3 = "_id"
                java.lang.String r3 = com.android.launcher3.Utilities.createDbSelectionQuery(r3, r13)     // Catch:{ all -> 0x1152 }
                r4 = r18
                r5 = 0
                r4.delete(r2, r3, r5)     // Catch:{ all -> 0x1152 }
                com.android.launcher3.LauncherProvider r2 = com.android.launcher3.LauncherAppState.getLauncherProvider()     // Catch:{ all -> 0x1152 }
                java.util.List r2 = r2.deleteEmptyFolders()     // Catch:{ all -> 0x1152 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x1152 }
            L_0x1032:
                boolean r3 = r2.hasNext()     // Catch:{ all -> 0x1152 }
                if (r3 == 0) goto L_0x105a
                java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x1152 }
                java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x1152 }
                long r5 = r3.longValue()     // Catch:{ all -> 0x1152 }
                java.util.ArrayList r3 = com.android.launcher3.LauncherModel.sBgWorkspaceItems     // Catch:{ all -> 0x1152 }
                com.android.launcher3.util.LongArrayMap r7 = com.android.launcher3.LauncherModel.sBgFolders     // Catch:{ all -> 0x1152 }
                java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x1152 }
                r3.remove(r7)     // Catch:{ all -> 0x1152 }
                com.android.launcher3.util.LongArrayMap r3 = com.android.launcher3.LauncherModel.sBgFolders     // Catch:{ all -> 0x1152 }
                r3.remove(r5)     // Catch:{ all -> 0x1152 }
                com.android.launcher3.util.LongArrayMap r3 = com.android.launcher3.LauncherModel.sBgItemsIdMap     // Catch:{ all -> 0x1152 }
                r3.remove(r5)     // Catch:{ all -> 0x1152 }
                goto L_0x1032
            L_0x1058:
                r4 = r18
            L_0x105a:
                java.util.Set r2 = r45.keySet()     // Catch:{ all -> 0x1152 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x1152 }
            L_0x1062:
                boolean r3 = r2.hasNext()     // Catch:{ all -> 0x1152 }
                if (r3 == 0) goto L_0x1084
                java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x1152 }
                com.android.launcher3.shortcuts.DeepShortcutKey r3 = (com.android.launcher3.shortcuts.DeepShortcutKey) r3     // Catch:{ all -> 0x1152 }
                java.util.Map r5 = com.android.launcher3.LauncherModel.sBgPinnedShortcutCounts     // Catch:{ all -> 0x1152 }
                java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x1152 }
                android.util.MutableInt r5 = (android.util.MutableInt) r5     // Catch:{ all -> 0x1152 }
                if (r5 == 0) goto L_0x107c
                int r5 = r5.value     // Catch:{ all -> 0x1152 }
                if (r5 != 0) goto L_0x1062
            L_0x107c:
                com.android.launcher3.LauncherModel r5 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x1152 }
                com.android.launcher3.compat.DeepShortcutManagerCompat r5 = r5.mDeepShortcutManager     // Catch:{ all -> 0x1152 }
                r5.unpinShortcut(r3)     // Catch:{ all -> 0x1152 }
                goto L_0x1062
            L_0x1084:
                com.android.launcher3.util.LongArrayMap r2 = com.android.launcher3.LauncherModel.sBgFolders     // Catch:{ all -> 0x1152 }
                com.android.launcher3.util.LongArrayMap$ValueIterator r3 = new com.android.launcher3.util.LongArrayMap$ValueIterator     // Catch:{ all -> 0x1152 }
                r3.<init>()     // Catch:{ all -> 0x1152 }
            L_0x108b:
                boolean r2 = r3.hasNext()     // Catch:{ all -> 0x1152 }
                if (r2 == 0) goto L_0x10c3
                java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x1152 }
                com.android.launcher3.FolderInfo r2 = (com.android.launcher3.FolderInfo) r2     // Catch:{ all -> 0x1152 }
                java.util.ArrayList r5 = r2.contents     // Catch:{ all -> 0x1152 }
                java.util.Comparator r6 = com.android.launcher3.Folder.ITEM_POS_COMPARATOR     // Catch:{ all -> 0x1152 }
                java.util.Collections.sort(r5, r6)     // Catch:{ all -> 0x1152 }
                java.util.ArrayList r2 = r2.contents     // Catch:{ all -> 0x1152 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x1152 }
                r5 = 0
            L_0x10a5:
                boolean r6 = r2.hasNext()     // Catch:{ all -> 0x1152 }
                if (r6 == 0) goto L_0x108b
                java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x1152 }
                com.android.launcher3.ShortcutInfo r6 = (com.android.launcher3.ShortcutInfo) r6     // Catch:{ all -> 0x1152 }
                boolean r7 = r6.usingLowResIcon     // Catch:{ all -> 0x1152 }
                if (r7 == 0) goto L_0x10bd
                com.android.launcher3.LauncherModel r7 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x1152 }
                com.android.launcher3.IconCache r7 = r7.mIconCache     // Catch:{ all -> 0x1152 }
                r8 = 0
                r6.updateIcon(r7, r8)     // Catch:{ all -> 0x1152 }
            L_0x10bd:
                r6 = 1
                int r5 = r5 + r6
                r7 = 3
                if (r5 < r7) goto L_0x10a5
                goto L_0x108b
            L_0x10c3:
                int r2 = r47.size()     // Catch:{ all -> 0x1152 }
                if (r2 <= 0) goto L_0x10e6
                android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x1152 }
                r2.<init>()     // Catch:{ all -> 0x1152 }
                java.lang.String r3 = "restored"
                r5 = 0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1152 }
                r2.put(r3, r5)     // Catch:{ all -> 0x1152 }
                android.net.Uri r3 = com.android.launcher3.LauncherSettings$Favorites.CONTENT_URI     // Catch:{ all -> 0x1152 }
                java.lang.String r5 = "_id"
                r6 = r47
                java.lang.String r5 = com.android.launcher3.Utilities.createDbSelectionQuery(r5, r6)     // Catch:{ all -> 0x1152 }
                r6 = 0
                r4.update(r3, r2, r5, r6)     // Catch:{ all -> 0x1152 }
            L_0x10e6:
                if (r19 != 0) goto L_0x1104
                java.util.HashMap r2 = com.android.launcher3.LauncherModel.sPendingPackages     // Catch:{ all -> 0x1152 }
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x1152 }
                if (r2 != 0) goto L_0x1104
                com.android.launcher3.LauncherModel$AppsAvailabilityCheck r2 = new com.android.launcher3.LauncherModel$AppsAvailabilityCheck     // Catch:{ all -> 0x1152 }
                com.android.launcher3.LauncherModel r3 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x1152 }
                r2.<init>()     // Catch:{ all -> 0x1152 }
                android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch:{ all -> 0x1152 }
                java.lang.String r4 = "com.android.launcher3.SYSTEM_READY"
                r3.<init>(r4)     // Catch:{ all -> 0x1152 }
                android.os.Handler r4 = com.android.launcher3.LauncherModel.sWorker     // Catch:{ all -> 0x1152 }
                r5 = 0
                r12.registerReceiver(r2, r3, r5, r4)     // Catch:{ all -> 0x1152 }
            L_0x1104:
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x1152 }
                java.util.ArrayList r3 = com.android.launcher3.LauncherModel.sBgWorkspaceScreens     // Catch:{ all -> 0x1152 }
                r2.<init>(r3)     // Catch:{ all -> 0x1152 }
                com.android.launcher3.util.LongArrayMap r3 = com.android.launcher3.LauncherModel.sBgItemsIdMap     // Catch:{ all -> 0x1152 }
                com.android.launcher3.util.LongArrayMap$ValueIterator r4 = new com.android.launcher3.util.LongArrayMap$ValueIterator     // Catch:{ all -> 0x1152 }
                r4.<init>()     // Catch:{ all -> 0x1152 }
            L_0x1112:
                boolean r3 = r4.hasNext()     // Catch:{ all -> 0x1152 }
                if (r3 == 0) goto L_0x1136
                java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x1152 }
                com.android.launcher3.ItemInfo r3 = (com.android.launcher3.ItemInfo) r3     // Catch:{ all -> 0x1152 }
                long r5 = r3.screenId     // Catch:{ all -> 0x1152 }
                long r7 = r3.container     // Catch:{ all -> 0x1152 }
                r9 = -100
                int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r3 != 0) goto L_0x1112
                java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x1152 }
                boolean r5 = r2.contains(r3)     // Catch:{ all -> 0x1152 }
                if (r5 == 0) goto L_0x1112
                r2.remove(r3)     // Catch:{ all -> 0x1152 }
                goto L_0x1112
            L_0x1136:
                int r3 = r2.size()     // Catch:{ all -> 0x1152 }
                if (r3 == 0) goto L_0x1148
                java.util.ArrayList r3 = com.android.launcher3.LauncherModel.sBgWorkspaceScreens     // Catch:{ all -> 0x1152 }
                r3.removeAll(r2)     // Catch:{ all -> 0x1152 }
                com.android.launcher3.LauncherModel r2 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x1152 }
                java.util.ArrayList r3 = com.android.launcher3.LauncherModel.sBgWorkspaceScreens     // Catch:{ all -> 0x1152 }
                r2.updateWorkspaceScreenOrder(r12, r3)     // Catch:{ all -> 0x1152 }
            L_0x1148:
                monitor-exit(r16)     // Catch:{ all -> 0x1152 }
                return
            L_0x114a:
                r0 = move-exception
                r2 = r0
                if (r3 == 0) goto L_0x1151
                r3.close()     // Catch:{ all -> 0x1152 }
            L_0x1151:
                throw r2     // Catch:{ all -> 0x1152 }
            L_0x1152:
                r0 = move-exception
                r2 = r0
                monitor-exit(r16)     // Catch:{ all -> 0x1152 }
                goto L_0x1157
            L_0x1156:
                throw r2
            L_0x1157:
                goto L_0x1156
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherModel.LoaderTask.loadWorkspace():void");
        }

        private static final void sortWorkspaceItemsSpatially$ar$ds(ArrayList arrayList) {
            final InvariantDeviceProfile invariantDeviceProfile = LauncherAppState.getInstance().mInvariantDeviceProfile;
            Collections.sort(arrayList, new Comparator() {
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    ItemInfo itemInfo = (ItemInfo) obj;
                    ItemInfo itemInfo2 = (ItemInfo) obj2;
                    InvariantDeviceProfile invariantDeviceProfile = InvariantDeviceProfile.this;
                    int i = invariantDeviceProfile.numColumns;
                    int i2 = invariantDeviceProfile.numRows * i;
                    long j = (long) (i2 * 6);
                    long j2 = (long) i2;
                    return Utilities.longCompare((itemInfo.container * j) + (itemInfo.screenId * j2) + ((long) (itemInfo.cellY * i)) + ((long) itemInfo.cellX), (itemInfo2.container * j) + (itemInfo2.screenId * j2) + ((long) (itemInfo2.cellY * i)) + ((long) itemInfo2.cellX));
                }
            });
        }

        private final void updateItem(long j, ContentValues contentValues) {
            this.mContext.getContentResolver().update(LauncherSettings$Favorites.CONTENT_URI, contentValues, "_id= ?", new String[]{Long.toString(j)});
        }

        private final void waitForIdle() {
            synchronized (this) {
                LauncherModel.this.mHandler.post(new DeferredHandler.IdleRunnable(new Runnable() {
                    public final void run() {
                        synchronized (LoaderTask.this) {
                            LoaderTask loaderTask = LoaderTask.this;
                            loaderTask.mLoadAndBindStepFinished = true;
                            loaderTask.notify();
                        }
                    }
                }));
                while (!this.mStopped && !this.mLoadAndBindStepFinished) {
                    try {
                        wait(1000);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        public final void bindWorkspace(int i) {
            LongArrayMap clone;
            LongArrayMap clone2;
            long j;
            LongArrayMap longArrayMap;
            LongArrayMap longArrayMap2;
            LongArrayMap longArrayMap3;
            SystemClock.uptimeMillis();
            Callbacks callbacks = (Callbacks) LauncherModel.this.mCallbacks.get();
            if (callbacks == null) {
                Log.w("Launcher.Model", "LoaderTask running with no launcher");
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            synchronized (LauncherModel.sBgLock) {
                arrayList.addAll(LauncherModel.sBgWorkspaceItems);
                arrayList2.addAll(LauncherModel.sBgAppWidgets);
                arrayList3.addAll(LauncherModel.sBgWorkspaceScreens);
                clone = LauncherModel.sBgFolders.clone();
                clone2 = LauncherModel.sBgItemsIdMap.clone();
            }
            int i2 = i;
            boolean z = i2 != -1001;
            if (!z) {
                i2 = callbacks.getCurrentWorkspaceScreen();
            }
            if (i2 >= arrayList3.size()) {
                i2 = -1001;
            }
            if (i2 < 0) {
                j = -1;
            } else {
                j = ((Long) arrayList3.get(i2)).longValue();
            }
            LauncherModel.this.unbindWorkspaceItemsOnMainThread();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            LongArrayMap longArrayMap4 = new LongArrayMap();
            int i3 = i2;
            LongArrayMap longArrayMap5 = new LongArrayMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((ItemInfo) it.next()) == null) {
                    it.remove();
                }
            }
            boolean z2 = z;
            HashSet hashSet = new HashSet();
            ArrayList arrayList8 = arrayList3;
            Collections.sort(arrayList, new Comparator() {
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    return Utilities.longCompare(((ItemInfo) obj).container, ((ItemInfo) obj2).container);
                }
            });
            int size = arrayList.size();
            Callbacks callbacks2 = callbacks;
            int i4 = 0;
            while (i4 < size) {
                ArrayList arrayList9 = arrayList;
                ItemInfo itemInfo = (ItemInfo) arrayList.get(i4);
                LongArrayMap longArrayMap6 = longArrayMap4;
                long j2 = itemInfo.container;
                if (j2 == -100) {
                    if (itemInfo.screenId == j) {
                        arrayList4.add(itemInfo);
                        hashSet.add(Long.valueOf(itemInfo.f16556id));
                    } else {
                        arrayList5.add(itemInfo);
                    }
                } else if (j2 == -101) {
                    arrayList4.add(itemInfo);
                    hashSet.add(Long.valueOf(itemInfo.f16556id));
                } else if (hashSet.contains(Long.valueOf(j2))) {
                    arrayList4.add(itemInfo);
                    hashSet.add(Long.valueOf(itemInfo.f16556id));
                } else {
                    arrayList5.add(itemInfo);
                }
                i4++;
                longArrayMap4 = longArrayMap6;
                arrayList = arrayList9;
            }
            LongArrayMap longArrayMap7 = longArrayMap4;
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                LauncherAppWidgetInfo launcherAppWidgetInfo = (LauncherAppWidgetInfo) arrayList2.get(i5);
                if (launcherAppWidgetInfo != null) {
                    if (launcherAppWidgetInfo.container == -100 && launcherAppWidgetInfo.screenId == j) {
                        arrayList6.add(launcherAppWidgetInfo);
                    } else {
                        arrayList7.add(launcherAppWidgetInfo);
                    }
                }
            }
            int size3 = clone.size();
            int i6 = 0;
            while (i6 < size3) {
                long keyAt = clone.keyAt(i6);
                FolderInfo folderInfo = (FolderInfo) clone.valueAt(i6);
                ItemInfo itemInfo2 = (ItemInfo) clone2.get(keyAt);
                if (itemInfo2 == null || folderInfo == null) {
                    longArrayMap2 = clone;
                    longArrayMap = clone2;
                    longArrayMap3 = longArrayMap7;
                } else {
                    longArrayMap2 = clone;
                    longArrayMap = clone2;
                    if (itemInfo2.container == -100 && itemInfo2.screenId == j) {
                        longArrayMap3 = longArrayMap7;
                        longArrayMap3.put(keyAt, folderInfo);
                    } else {
                        longArrayMap3 = longArrayMap7;
                        longArrayMap5.put(keyAt, folderInfo);
                    }
                }
                i6++;
                longArrayMap7 = longArrayMap3;
                clone = longArrayMap2;
                clone2 = longArrayMap;
            }
            sortWorkspaceItemsSpatially$ar$ds(arrayList4);
            sortWorkspaceItemsSpatially$ar$ds(arrayList5);
            final Callbacks callbacks3 = callbacks2;
            LauncherModel.this.runOnMainThread(new Runnable() {
                public final void run() {
                    Callbacks tryGetCallbacks = LoaderTask.this.tryGetCallbacks(callbacks3);
                    if (tryGetCallbacks != null) {
                        tryGetCallbacks.startBinding();
                    }
                }
            });
            final ArrayList arrayList10 = arrayList8;
            LauncherModel.this.runOnMainThread(new Runnable() {
                public final void run() {
                    Callbacks tryGetCallbacks = LoaderTask.this.tryGetCallbacks(callbacks3);
                    if (tryGetCallbacks != null) {
                        tryGetCallbacks.bindScreens(arrayList10);
                    }
                }
            });
            bindWorkspaceItems(callbacks3, arrayList4, arrayList6, longArrayMap7, (ArrayList) null);
            if (z2) {
                final int i7 = i3;
                LauncherModel.this.runOnMainThread(new Runnable() {
                    public final void run() {
                        int i;
                        Callbacks tryGetCallbacks = LoaderTask.this.tryGetCallbacks(callbacks3);
                        if (tryGetCallbacks != null && (i = i7) != -1001) {
                            tryGetCallbacks.onPageBoundSynchronously(i);
                        }
                    }
                });
            }
            synchronized (LauncherModel.mDeferredBindRunnables) {
                LauncherModel.mDeferredBindRunnables.clear();
            }
            bindWorkspaceItems(callbacks3, arrayList5, arrayList7, longArrayMap5, z2 ? LauncherModel.mDeferredBindRunnables : null);
            C534910 r0 = new Runnable() {
                public final void run() {
                    Callbacks tryGetCallbacks = LoaderTask.this.tryGetCallbacks(callbacks3);
                    if (tryGetCallbacks != null) {
                        tryGetCallbacks.finishBindingItems();
                    }
                    LoaderTask.this.mIsLoadingAndBindingWorkspace = false;
                    if (!LauncherModel.mBindCompleteRunnables.isEmpty()) {
                        synchronized (LauncherModel.mBindCompleteRunnables) {
                            Iterator it = LauncherModel.mBindCompleteRunnables.iterator();
                            while (it.hasNext()) {
                                LauncherModel.runOnWorkerThread((Runnable) it.next());
                            }
                            LauncherModel.mBindCompleteRunnables.clear();
                        }
                    }
                }
            };
            if (z2) {
                synchronized (LauncherModel.mDeferredBindRunnables) {
                    LauncherModel.mDeferredBindRunnables.add(r0);
                }
                return;
            }
            LauncherModel.this.runOnMainThread(r0);
        }

        public final void onlyBindAllApps() {
            final Callbacks callbacks = (Callbacks) LauncherModel.this.mCallbacks.get();
            if (callbacks == null) {
                Log.w("Launcher.Model", "LoaderTask running with no launcher (onlyBindAllApps)");
                return;
            }
            final ArrayList arrayList = (ArrayList) LauncherModel.this.mBgAllAppsList.data.clone();
            LauncherModel.this.runOnMainThread(new Runnable() {
                public final void run() {
                    SystemClock.uptimeMillis();
                    Callbacks tryGetCallbacks = LoaderTask.this.tryGetCallbacks(callbacks);
                    if (tryGetCallbacks != null) {
                        tryGetCallbacks.bindAllApplications(arrayList);
                    }
                }
            });
        }

        /* JADX WARNING: type inference failed for: r2v1, types: [android.content.Context, com.android.launcher3.LauncherModel$LoaderTask] */
        /* JADX WARNING: type inference failed for: r2v5 */
        /* JADX WARNING: type inference failed for: r2v31 */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x022b, code lost:
            r21 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
            r2 = r4.getColumnIndex("rowid");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0233, code lost:
            r22 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
            r5 = r4.getColumnIndex("system_state");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x023f, code lost:
            if (r4.moveToNext() == false) goto L_0x02cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0241, code lost:
            r24 = r6;
            r6 = android.content.ComponentName.unflattenFromString(r4.getString(r6));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x024b, code lost:
            r25 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            if (r1.this$0.mWorkspaceLoaded != false) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
            r10 = (android.content.pm.PackageInfo) r13.get(r6.getPackageName());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x0257, code lost:
            if (r10 != null) goto L_0x0272;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x0261, code lost:
            if (r9.contains(r6.getPackageName()) != false) goto L_0x02c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x0263, code lost:
            r3.remove(r6, r0);
            r8.add(java.lang.Integer.valueOf(r4.getInt(r2)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x027a, code lost:
            if ((r10.applicationInfo.flags & 16777216) != 0) goto L_0x02c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x027c, code lost:
            r27 = r4.getLong(r7);
            r11 = r4.getInt(r15);
            r29 = r7;
            r7 = (com.android.launcher3.compat.LauncherActivityInfoCompat) r12.remove(r6);
            r23 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x0292, code lost:
            if (r11 != r10.versionCode) goto L_0x02a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            loadWorkspace();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x0298, code lost:
            if (r27 != r10.lastUpdateTime) goto L_0x02a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x02a4, code lost:
            if (android.text.TextUtils.equals(r3.mSystemState, r4.getString(r5)) != false) goto L_0x02ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a6, code lost:
            if (r7 != null) goto L_0x02b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x02a8, code lost:
            r3.remove(r6, r0);
            r8.add(java.lang.Integer.valueOf(r4.getInt(r2)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x02b7, code lost:
            r14.add(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ba, code lost:
            r9 = r23;
            r6 = r24;
            r10 = r25;
            r7 = r29;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x02c4, code lost:
            r6 = r24;
            r10 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ca, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            monitor-enter(r30);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x02cc, code lost:
            r25 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x02ce, code lost:
            if (r4 == null) goto L_0x02f6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d1, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x02d3, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x02d5, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d7, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x02d8, code lost:
            r21 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x02da, code lost:
            r22 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x02dc, code lost:
            r25 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x02df, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x02e0, code lost:
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x02e2, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e3, code lost:
            r21 = r2;
            r22 = r5;
            r25 = r10;
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
            android.util.Log.d("Launcher.IconCache", "Error reading icon cache", r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x02f1, code lost:
            if (r4 == null) goto L_0x02f6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f3, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x02fa, code lost:
            if (r8.isEmpty() != false) goto L_0x0308;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x02fc, code lost:
            r3.mIconDb.delete(com.android.launcher3.Utilities.createDbSelectionQuery("rowid", r8), (java.lang.String[]) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x030c, code lost:
            if (r12.isEmpty() == false) goto L_0x0314;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x0312, code lost:
            if (r14.isEmpty() != false) goto L_0x032e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x0314, code lost:
            r0 = new java.util.Stack();
            r0.addAll(r12.values());
            new com.android.launcher3.IconCache.SerializedIconUpdateTask(r25, r13, r0, r14).scheduleNext();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x032e, code lost:
            r2 = r21;
            r5 = r22;
            r4 = null;
            r6 = 2;
            r7 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0337, code lost:
            if (r4 != null) goto L_0x0339;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x0339, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x033c, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
            if (r1.mStopped == false) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x033d, code lost:
            monitor-enter(r30);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0340, code lost:
            if (r1.mStopped == false) goto L_0x0344;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0342, code lost:
            monitor-exit(r30);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0344, code lost:
            r1.this$0.mAllAppsLoaded = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0349, code lost:
            monitor-exit(r30);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            monitor-exit(r30);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x0354, code lost:
            onlyBindAllApps();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x0357, code lost:
            waitForIdle();
            r0 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x035e, code lost:
            if (r0.mDeepShortcutsLoaded != false) goto L_0x03b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x0360, code lost:
            r0.mBgDeepShortcutMap.clear();
            r0 = r1.this$0;
            r0.mHasShortcutHostPermission = r0.mDeepShortcutManager.hasHostPermission();
            r0 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x0373, code lost:
            if (r0.mHasShortcutHostPermission == false) goto L_0x03a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x0375, code lost:
            r0 = r0.mUserManager.getUserProfiles().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x0383, code lost:
            if (r0.hasNext() == false) goto L_0x03a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x0385, code lost:
            r2 = (com.android.launcher3.compat.UserHandleCompat) r0.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x0393, code lost:
            if (r1.this$0.mUserManager.isUserUnlocked(r2) == false) goto L_0x037f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
            r1.this$0.mWorkspaceLoaded = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x0395, code lost:
            r1.this$0.updateDeepShortcutMap((java.lang.String) null, r2, r1.this$0.mDeepShortcutManager.queryForAllShortcuts(r2));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x03a4, code lost:
            monitor-enter(r30);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a7, code lost:
            if (r1.mStopped == false) goto L_0x03ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x03a9, code lost:
            monitor-exit(r30);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x03ab, code lost:
            r1.this$0.mDeepShortcutsLoaded = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x03b0, code lost:
            monitor-exit(r30);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
            monitor-exit(r30);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x03b5, code lost:
            r1.this$0.bindDeepShortcuts();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:0x03ba, code lost:
            r2 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x03bb, code lost:
            r1.mContext = r2;
            r3 = r1.this$0.mLock;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x03c1, code lost:
            monitor-enter(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:?, code lost:
            r0 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x03c6, code lost:
            if (r0.mLoaderTask != r1) goto L_0x03ca;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x03c8, code lost:
            r0.mLoaderTask = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x03ca, code lost:
            r0.mIsLoaderTaskRunning = false;
            r0.mHasLoaderCompletedOnce = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x03d0, code lost:
            monitor-exit(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x03d1, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x002e, code lost:
            bindWorkspace(-1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
            if (r1.mStopped == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0037, code lost:
            r2 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
            waitForIdle();
            r0 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
            if (r0.mAllAppsLoaded != false) goto L_0x0354;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
            r0 = (com.android.launcher3.LauncherModel.Callbacks) r0.mCallbacks.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x004b, code lost:
            if (r0 != null) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
            android.util.Log.w("Launcher.Model", "LoaderTask running with no launcher (loadAllApps)");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0056, code lost:
            r5 = r1.this$0.mUserManager.getUserProfiles();
            r6 = r1.this$0.mBgAllAppsList;
            r6.data.clear();
            r6.added.clear();
            r6.removed.clear();
            r6.modified.clear();
            r6 = r5.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x007e, code lost:
            if (r6.hasNext() == false) goto L_0x00d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0080, code lost:
            r7 = (com.android.launcher3.compat.UserHandleCompat) r6.next();
            r14 = r1.this$0.mLauncherApps.getActivityList((java.lang.String) null, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
            if (r14 == null) goto L_0x00f6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
            if (r14.isEmpty() != false) goto L_0x00f6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0096, code lost:
            r15 = r1.this$0.mUserManager.isQuietModeEnabled(r7);
            r13 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a3, code lost:
            if (r13 >= r14.size()) goto L_0x00cb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a5, code lost:
            r8 = r1.this$0;
            r3 = r8;
            r8 = new com.android.launcher3.AppInfo(r1.mContext, (com.android.launcher3.compat.LauncherActivityInfoCompat) r14.get(r13), r7, r8.mIconCache, r15);
            r8.mBgAllAppsList.add(r3);
            r13 = r13 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
            r2 = com.android.launcher3.util.ManagedProfileHeuristic.get(r1.mContext, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d1, code lost:
            if (r2 == null) goto L_0x00d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d3, code lost:
            scheduleManagedHeuristicRunnable(r2, r7, r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d8, code lost:
            r2 = r1.this$0.mBgAllAppsList;
            r3 = r2.added;
            r2.added = new java.util.ArrayList();
            r1.this$0.mHandler.post(new com.android.launcher3.LauncherModel.LoaderTask.C535414(r1));
            com.android.launcher3.util.ManagedProfileHeuristic.processAllUsers(r5, r1.mContext);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f6, code lost:
            monitor-enter(r30);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f9, code lost:
            if (r1.mStopped == false) goto L_0x00fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fb, code lost:
            monitor-exit(r30);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fe, code lost:
            monitor-exit(r30);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ff, code lost:
            r2 = new java.util.HashSet();
            r3 = com.android.launcher3.LauncherModel.sBgLock;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0106, code lost:
            monitor-enter(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
            r5 = new com.android.launcher3.util.LongArrayMap.ValueIterator(com.android.launcher3.LauncherModel.sBgItemsIdMap);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x010e, code lost:
            r6 = 2;
            r7 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0114, code lost:
            if (r5.hasNext() == false) goto L_0x0150;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0116, code lost:
            r0 = (com.android.launcher3.ItemInfo) r5.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x011e, code lost:
            if ((r0 instanceof com.android.launcher3.ShortcutInfo) == false) goto L_0x013a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0120, code lost:
            r0 = (com.android.launcher3.ShortcutInfo) r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0126, code lost:
            if (r0.hasStatusFlag(3) == false) goto L_0x010e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x012c, code lost:
            if (r0.getTargetComponent() == null) goto L_0x010e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x012e, code lost:
            r2.add(r0.getTargetComponent().getPackageName());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x013c, code lost:
            if ((r0 instanceof com.android.launcher3.LauncherAppWidgetInfo) == false) goto L_0x010e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x013e, code lost:
            r0 = (com.android.launcher3.LauncherAppWidgetInfo) r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0144, code lost:
            if (r0.hasRestoreFlag(2) == false) goto L_0x010e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0146, code lost:
            r2.add(r0.providerName.getPackageName());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0150, code lost:
            monitor-exit(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0151, code lost:
            r3 = r1.this$0.mIconCache;
            r3.mWorkerHandler.removeCallbacksAndMessages(com.android.launcher3.IconCache.ICON_UPDATE_TOKEN);
            r3.updateSystemStateString();
            r5 = r3.mUserManager.getUserProfiles().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x016d, code lost:
            if (r5.hasNext() == false) goto L_0x033d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
            r0 = (com.android.launcher3.compat.UserHandleCompat) r5.next();
            r8 = r3.mLauncherApps.getActivityList(r4, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x017b, code lost:
            if (r8 == null) goto L_0x033d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0181, code lost:
            if (r8.isEmpty() == false) goto L_0x0185;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x018d, code lost:
            if (com.android.launcher3.compat.UserHandleCompat.myUserHandle().equals(r0) == false) goto L_0x0191;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x018f, code lost:
            r9 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x0191, code lost:
            r9 = java.util.Collections.emptySet();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x0195, code lost:
            r10 = r3.mUserManager.getSerialNumberForUser(r0);
            r12 = r3.mContext.getPackageManager();
            r13 = new java.util.HashMap();
            r12 = r12.getInstalledPackages(8192).iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b4, code lost:
            if (r12.hasNext() == false) goto L_0x01c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b6, code lost:
            r14 = r12.next();
            r13.put(r14.packageName, r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c2, code lost:
            r12 = new java.util.HashMap();
            r8 = r8.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x01cf, code lost:
            if (r8.hasNext() == false) goto L_0x01df;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d1, code lost:
            r14 = (com.android.launcher3.compat.LauncherActivityInfoCompat) r8.next();
            r12.put(r14.getComponentName(), r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x01df, code lost:
            r8 = new java.util.HashSet();
            r14 = new java.util.Stack();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
            r15 = r3.mIconDb;
            r4 = new java.lang.String[5];
            r4[0] = "rowid";
            r4[1] = "componentName";
            r4[r6] = "lastUpdated";
            r4[r7] = "version";
            r4[4] = "system_state";
            r4 = r15.query(r4, "profileId = ? ", new java.lang.String[]{java.lang.Long.toString(r10)});
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
            r6 = r4.getColumnIndex("componentName");
            r7 = r4.getColumnIndex("lastUpdated");
            r15 = r4.getColumnIndex("version");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
            r1.mIsLoadingAndBindingWorkspace = true;
         */
        /* JADX WARNING: Removed duplicated region for block: B:158:0x0339  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r30 = this;
                r1 = r30
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this
                java.lang.Object r2 = r0.mLock
                monitor-enter(r2)
                boolean r0 = r1.mStopped     // Catch:{ all -> 0x03d5 }
                if (r0 == 0) goto L_0x000d
                monitor-exit(r2)     // Catch:{ all -> 0x03d5 }
                return
            L_0x000d:
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x03d5 }
                r3 = 1
                r0.mIsLoaderTaskRunning = r3     // Catch:{ all -> 0x03d5 }
                monitor-exit(r2)     // Catch:{ all -> 0x03d5 }
                r1.mIsLoadingAndBindingWorkspace = r3
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this
                boolean r0 = r0.mWorkspaceLoaded
                if (r0 != 0) goto L_0x002e
                r30.loadWorkspace()
                monitor-enter(r30)
                boolean r0 = r1.mStopped     // Catch:{ all -> 0x002b }
                if (r0 == 0) goto L_0x0025
                monitor-exit(r30)     // Catch:{ all -> 0x002b }
                goto L_0x0032
            L_0x0025:
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x002b }
                r0.mWorkspaceLoaded = r3     // Catch:{ all -> 0x002b }
                monitor-exit(r30)     // Catch:{ all -> 0x002b }
                goto L_0x002e
            L_0x002b:
                r0 = move-exception
                monitor-exit(r30)     // Catch:{ all -> 0x002b }
                throw r0
            L_0x002e:
                r0 = -1
                r1.bindWorkspace(r0)
            L_0x0032:
                boolean r0 = r1.mStopped
                r4 = 0
                if (r0 == 0) goto L_0x003a
                r2 = r4
                goto L_0x03bb
            L_0x003a:
                r30.waitForIdle()
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this
                boolean r5 = r0.mAllAppsLoaded
                if (r5 != 0) goto L_0x0354
                java.lang.ref.WeakReference r0 = r0.mCallbacks
                java.lang.Object r0 = r0.get()
                com.android.launcher3.LauncherModel$Callbacks r0 = (com.android.launcher3.LauncherModel.Callbacks) r0
                if (r0 != 0) goto L_0x0056
                java.lang.String r0 = "Launcher.Model"
                java.lang.String r5 = "LoaderTask running with no launcher (loadAllApps)"
                android.util.Log.w(r0, r5)
                goto L_0x00f6
            L_0x0056:
                com.android.launcher3.LauncherModel r5 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.compat.UserManagerCompat r5 = r5.mUserManager
                java.util.List r5 = r5.getUserProfiles()
                com.android.launcher3.LauncherModel r6 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r6 = r6.mBgAllAppsList
                java.util.ArrayList r7 = r6.data
                r7.clear()
                java.util.ArrayList r7 = r6.added
                r7.clear()
                java.util.ArrayList r7 = r6.removed
                r7.clear()
                java.util.ArrayList r6 = r6.modified
                r6.clear()
                java.util.Iterator r6 = r5.iterator()
            L_0x007a:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x00d8
                java.lang.Object r7 = r6.next()
                com.android.launcher3.compat.UserHandleCompat r7 = (com.android.launcher3.compat.UserHandleCompat) r7
                com.android.launcher3.LauncherModel r8 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.compat.LauncherAppsCompat r8 = r8.mLauncherApps
                java.util.List r14 = r8.getActivityList(r4, r7)
                if (r14 == 0) goto L_0x00f6
                boolean r8 = r14.isEmpty()
                if (r8 != 0) goto L_0x00f6
                com.android.launcher3.LauncherModel r8 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.compat.UserManagerCompat r8 = r8.mUserManager
                boolean r15 = r8.isQuietModeEnabled(r7)
                r13 = 0
            L_0x009f:
                int r8 = r14.size()
                if (r13 >= r8) goto L_0x00cb
                java.lang.Object r8 = r14.get(r13)
                r10 = r8
                com.android.launcher3.compat.LauncherActivityInfoCompat r10 = (com.android.launcher3.compat.LauncherActivityInfoCompat) r10
                com.android.launcher3.LauncherModel r8 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r12 = r8.mBgAllAppsList
                com.android.launcher3.AppInfo r11 = new com.android.launcher3.AppInfo
                android.content.Context r9 = r1.mContext
                com.android.launcher3.IconCache r8 = r8.mIconCache
                r16 = r8
                r8 = r11
                r3 = r11
                r11 = r7
                r2 = r12
                r12 = r16
                r16 = r13
                r13 = r15
                r8.<init>(r9, r10, r11, r12, r13)
                r2.add(r3)
                int r13 = r16 + 1
                r3 = 1
                goto L_0x009f
            L_0x00cb:
                android.content.Context r2 = r1.mContext
                com.android.launcher3.util.ManagedProfileHeuristic r2 = com.android.launcher3.util.ManagedProfileHeuristic.get(r2, r7)
                if (r2 == 0) goto L_0x00d6
                r1.scheduleManagedHeuristicRunnable(r2, r7, r14)
            L_0x00d6:
                r3 = 1
                goto L_0x007a
            L_0x00d8:
                com.android.launcher3.LauncherModel r2 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r2 = r2.mBgAllAppsList
                java.util.ArrayList r3 = r2.added
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                r2.added = r6
                com.android.launcher3.LauncherModel r2 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.DeferredHandler r2 = r2.mHandler
                com.android.launcher3.LauncherModel$LoaderTask$14 r6 = new com.android.launcher3.LauncherModel$LoaderTask$14
                r6.<init>(r0, r3)
                r2.post(r6)
                android.content.Context r0 = r1.mContext
                com.android.launcher3.util.ManagedProfileHeuristic.processAllUsers(r5, r0)
            L_0x00f6:
                monitor-enter(r30)
                boolean r0 = r1.mStopped     // Catch:{ all -> 0x0351 }
                if (r0 == 0) goto L_0x00fe
                monitor-exit(r30)     // Catch:{ all -> 0x0351 }
                goto L_0x0357
            L_0x00fe:
                monitor-exit(r30)     // Catch:{ all -> 0x0351 }
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                java.lang.Object r3 = com.android.launcher3.LauncherModel.sBgLock
                monitor-enter(r3)
                com.android.launcher3.util.LongArrayMap r0 = com.android.launcher3.LauncherModel.sBgItemsIdMap     // Catch:{ all -> 0x034e }
                com.android.launcher3.util.LongArrayMap$ValueIterator r5 = new com.android.launcher3.util.LongArrayMap$ValueIterator     // Catch:{ all -> 0x034e }
                r5.<init>()     // Catch:{ all -> 0x034e }
            L_0x010e:
                boolean r0 = r5.hasNext()     // Catch:{ all -> 0x034e }
                r6 = 2
                r7 = 3
                if (r0 == 0) goto L_0x0150
                java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x034e }
                com.android.launcher3.ItemInfo r0 = (com.android.launcher3.ItemInfo) r0     // Catch:{ all -> 0x034e }
                boolean r8 = r0 instanceof com.android.launcher3.ShortcutInfo     // Catch:{ all -> 0x034e }
                if (r8 == 0) goto L_0x013a
                com.android.launcher3.ShortcutInfo r0 = (com.android.launcher3.ShortcutInfo) r0     // Catch:{ all -> 0x034e }
                boolean r6 = r0.hasStatusFlag(r7)     // Catch:{ all -> 0x034e }
                if (r6 == 0) goto L_0x010e
                android.content.ComponentName r6 = r0.getTargetComponent()     // Catch:{ all -> 0x034e }
                if (r6 == 0) goto L_0x010e
                android.content.ComponentName r0 = r0.getTargetComponent()     // Catch:{ all -> 0x034e }
                java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x034e }
                r2.add(r0)     // Catch:{ all -> 0x034e }
                goto L_0x010e
            L_0x013a:
                boolean r7 = r0 instanceof com.android.launcher3.LauncherAppWidgetInfo     // Catch:{ all -> 0x034e }
                if (r7 == 0) goto L_0x010e
                com.android.launcher3.LauncherAppWidgetInfo r0 = (com.android.launcher3.LauncherAppWidgetInfo) r0     // Catch:{ all -> 0x034e }
                boolean r6 = r0.hasRestoreFlag(r6)     // Catch:{ all -> 0x034e }
                if (r6 == 0) goto L_0x010e
                android.content.ComponentName r0 = r0.providerName     // Catch:{ all -> 0x034e }
                java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x034e }
                r2.add(r0)     // Catch:{ all -> 0x034e }
                goto L_0x010e
            L_0x0150:
                monitor-exit(r3)     // Catch:{ all -> 0x034e }
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.IconCache r3 = r0.mIconCache
                android.os.Handler r0 = r3.mWorkerHandler
                java.lang.Object r5 = com.android.launcher3.IconCache.ICON_UPDATE_TOKEN
                r0.removeCallbacksAndMessages(r5)
                r3.updateSystemStateString()
                com.android.launcher3.compat.UserManagerCompat r0 = r3.mUserManager
                java.util.List r0 = r0.getUserProfiles()
                java.util.Iterator r5 = r0.iterator()
            L_0x0169:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x033d
                java.lang.Object r0 = r5.next()
                com.android.launcher3.compat.UserHandleCompat r0 = (com.android.launcher3.compat.UserHandleCompat) r0
                com.android.launcher3.compat.LauncherAppsCompat r8 = r3.mLauncherApps
                java.util.List r8 = r8.getActivityList(r4, r0)
                if (r8 == 0) goto L_0x033d
                boolean r9 = r8.isEmpty()
                if (r9 == 0) goto L_0x0185
                goto L_0x033d
            L_0x0185:
                com.android.launcher3.compat.UserHandleCompat r9 = com.android.launcher3.compat.UserHandleCompat.myUserHandle()
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x0191
                r9 = r2
                goto L_0x0195
            L_0x0191:
                java.util.Set r9 = java.util.Collections.emptySet()
            L_0x0195:
                com.android.launcher3.compat.UserManagerCompat r10 = r3.mUserManager
                long r10 = r10.getSerialNumberForUser(r0)
                android.content.Context r12 = r3.mContext
                android.content.pm.PackageManager r12 = r12.getPackageManager()
                java.util.HashMap r13 = new java.util.HashMap
                r13.<init>()
                r14 = 8192(0x2000, float:1.14794E-41)
                java.util.List r12 = r12.getInstalledPackages(r14)
                java.util.Iterator r12 = r12.iterator()
            L_0x01b0:
                boolean r14 = r12.hasNext()
                if (r14 == 0) goto L_0x01c2
                java.lang.Object r14 = r12.next()
                android.content.pm.PackageInfo r14 = (android.content.pm.PackageInfo) r14
                java.lang.String r15 = r14.packageName
                r13.put(r15, r14)
                goto L_0x01b0
            L_0x01c2:
                java.util.HashMap r12 = new java.util.HashMap
                r12.<init>()
                java.util.Iterator r8 = r8.iterator()
            L_0x01cb:
                boolean r14 = r8.hasNext()
                if (r14 == 0) goto L_0x01df
                java.lang.Object r14 = r8.next()
                com.android.launcher3.compat.LauncherActivityInfoCompat r14 = (com.android.launcher3.compat.LauncherActivityInfoCompat) r14
                android.content.ComponentName r15 = r14.getComponentName()
                r12.put(r15, r14)
                goto L_0x01cb
            L_0x01df:
                java.util.HashSet r8 = new java.util.HashSet
                r8.<init>()
                java.util.Stack r14 = new java.util.Stack
                r14.<init>()
                com.android.launcher3.IconCache$IconDB r15 = r3.mIconDb     // Catch:{ SQLiteException -> 0x02e2, all -> 0x02df }
                r4 = 5
                java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x02e2, all -> 0x02df }
                java.lang.String r19 = "rowid"
                r18 = 0
                r4[r18] = r19     // Catch:{ SQLiteException -> 0x02e2, all -> 0x02df }
                java.lang.String r19 = "componentName"
                r17 = 1
                r4[r17] = r19     // Catch:{ SQLiteException -> 0x02e2, all -> 0x02df }
                java.lang.String r19 = "lastUpdated"
                r4[r6] = r19     // Catch:{ SQLiteException -> 0x02e2, all -> 0x02df }
                java.lang.String r19 = "version"
                r4[r7] = r19     // Catch:{ SQLiteException -> 0x02e2, all -> 0x02df }
                java.lang.String r19 = "system_state"
                r20 = 4
                r4[r20] = r19     // Catch:{ SQLiteException -> 0x02e2, all -> 0x02df }
                r6 = 1
                java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x02e2, all -> 0x02df }
                java.lang.String r6 = java.lang.Long.toString(r10)     // Catch:{ SQLiteException -> 0x02e2, all -> 0x02df }
                r18 = 0
                r7[r18] = r6     // Catch:{ SQLiteException -> 0x02e2, all -> 0x02df }
                java.lang.String r6 = "profileId = ? "
                android.database.Cursor r4 = r15.query(r4, r6, r7)     // Catch:{ SQLiteException -> 0x02e2, all -> 0x02df }
                java.lang.String r6 = "componentName"
                int r6 = r4.getColumnIndex(r6)     // Catch:{ SQLiteException -> 0x02d7 }
                java.lang.String r7 = "lastUpdated"
                int r7 = r4.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x02d7 }
                java.lang.String r15 = "version"
                int r15 = r4.getColumnIndex(r15)     // Catch:{ SQLiteException -> 0x02d7 }
                r21 = r2
                java.lang.String r2 = "rowid"
                int r2 = r4.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x02d3 }
                r22 = r5
                java.lang.String r5 = "system_state"
                int r5 = r4.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x02d1 }
            L_0x023b:
                boolean r23 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x02d1 }
                if (r23 == 0) goto L_0x02cc
                java.lang.String r23 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x02d1 }
                r24 = r6
                android.content.ComponentName r6 = android.content.ComponentName.unflattenFromString(r23)     // Catch:{ SQLiteException -> 0x02d1 }
                r25 = r10
                java.lang.String r10 = r6.getPackageName()     // Catch:{ SQLiteException -> 0x02ca }
                java.lang.Object r10 = r13.get(r10)     // Catch:{ SQLiteException -> 0x02ca }
                android.content.pm.PackageInfo r10 = (android.content.pm.PackageInfo) r10     // Catch:{ SQLiteException -> 0x02ca }
                if (r10 != 0) goto L_0x0272
                java.lang.String r10 = r6.getPackageName()     // Catch:{ SQLiteException -> 0x02ca }
                boolean r10 = r9.contains(r10)     // Catch:{ SQLiteException -> 0x02ca }
                if (r10 != 0) goto L_0x02c4
                r3.remove(r6, r0)     // Catch:{ SQLiteException -> 0x02ca }
                int r6 = r4.getInt(r2)     // Catch:{ SQLiteException -> 0x02ca }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x02ca }
                r8.add(r6)     // Catch:{ SQLiteException -> 0x02ca }
                goto L_0x02c4
            L_0x0272:
                android.content.pm.ApplicationInfo r11 = r10.applicationInfo     // Catch:{ SQLiteException -> 0x02ca }
                int r11 = r11.flags     // Catch:{ SQLiteException -> 0x02ca }
                r23 = 16777216(0x1000000, float:2.3509887E-38)
                r11 = r11 & r23
                if (r11 != 0) goto L_0x02c4
                long r27 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x02ca }
                int r11 = r4.getInt(r15)     // Catch:{ SQLiteException -> 0x02ca }
                java.lang.Object r23 = r12.remove(r6)     // Catch:{ SQLiteException -> 0x02ca }
                r29 = r7
                r7 = r23
                com.android.launcher3.compat.LauncherActivityInfoCompat r7 = (com.android.launcher3.compat.LauncherActivityInfoCompat) r7     // Catch:{ SQLiteException -> 0x02ca }
                r23 = r9
                int r9 = r10.versionCode     // Catch:{ SQLiteException -> 0x02ca }
                if (r11 != r9) goto L_0x02a6
                long r9 = r10.lastUpdateTime     // Catch:{ SQLiteException -> 0x02ca }
                int r11 = (r27 > r9 ? 1 : (r27 == r9 ? 0 : -1))
                if (r11 != 0) goto L_0x02a6
                java.lang.String r9 = r3.mSystemState     // Catch:{ SQLiteException -> 0x02ca }
                java.lang.String r10 = r4.getString(r5)     // Catch:{ SQLiteException -> 0x02ca }
                boolean r9 = android.text.TextUtils.equals(r9, r10)     // Catch:{ SQLiteException -> 0x02ca }
                if (r9 != 0) goto L_0x02ba
            L_0x02a6:
                if (r7 != 0) goto L_0x02b7
                r3.remove(r6, r0)     // Catch:{ SQLiteException -> 0x02ca }
                int r6 = r4.getInt(r2)     // Catch:{ SQLiteException -> 0x02ca }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x02ca }
                r8.add(r6)     // Catch:{ SQLiteException -> 0x02ca }
                goto L_0x02ba
            L_0x02b7:
                r14.add(r7)     // Catch:{ SQLiteException -> 0x02ca }
            L_0x02ba:
                r9 = r23
                r6 = r24
                r10 = r25
                r7 = r29
                goto L_0x023b
            L_0x02c4:
                r6 = r24
                r10 = r25
                goto L_0x023b
            L_0x02ca:
                r0 = move-exception
                goto L_0x02ea
            L_0x02cc:
                r25 = r10
                if (r4 == 0) goto L_0x02f6
                goto L_0x02f3
            L_0x02d1:
                r0 = move-exception
                goto L_0x02dc
            L_0x02d3:
                r0 = move-exception
                goto L_0x02da
            L_0x02d5:
                r0 = move-exception
                goto L_0x0337
            L_0x02d7:
                r0 = move-exception
                r21 = r2
            L_0x02da:
                r22 = r5
            L_0x02dc:
                r25 = r10
                goto L_0x02ea
            L_0x02df:
                r0 = move-exception
                r4 = 0
                goto L_0x0337
            L_0x02e2:
                r0 = move-exception
                r21 = r2
                r22 = r5
                r25 = r10
                r4 = 0
            L_0x02ea:
                java.lang.String r2 = "Launcher.IconCache"
                java.lang.String r5 = "Error reading icon cache"
                android.util.Log.d(r2, r5, r0)     // Catch:{ all -> 0x02d5 }
                if (r4 == 0) goto L_0x02f6
            L_0x02f3:
                r4.close()
            L_0x02f6:
                boolean r0 = r8.isEmpty()
                if (r0 != 0) goto L_0x0308
                com.android.launcher3.IconCache$IconDB r0 = r3.mIconDb
                java.lang.String r2 = "rowid"
                java.lang.String r2 = com.android.launcher3.Utilities.createDbSelectionQuery(r2, r8)
                r4 = 0
                r0.delete(r2, r4)
            L_0x0308:
                boolean r0 = r12.isEmpty()
                if (r0 == 0) goto L_0x0314
                boolean r0 = r14.isEmpty()
                if (r0 != 0) goto L_0x032e
            L_0x0314:
                java.util.Stack r0 = new java.util.Stack
                r0.<init>()
                java.util.Collection r2 = r12.values()
                r0.addAll(r2)
                com.android.launcher3.IconCache$SerializedIconUpdateTask r2 = new com.android.launcher3.IconCache$SerializedIconUpdateTask
                r8 = r2
                r9 = r3
                r10 = r25
                r12 = r13
                r13 = r0
                r8.<init>(r10, r12, r13, r14)
                r2.scheduleNext()
            L_0x032e:
                r2 = r21
                r5 = r22
                r4 = 0
                r6 = 2
                r7 = 3
                goto L_0x0169
            L_0x0337:
                if (r4 == 0) goto L_0x033c
                r4.close()
            L_0x033c:
                throw r0
            L_0x033d:
                monitor-enter(r30)
                boolean r0 = r1.mStopped     // Catch:{ all -> 0x034b }
                if (r0 == 0) goto L_0x0344
                monitor-exit(r30)     // Catch:{ all -> 0x034b }
                goto L_0x0357
            L_0x0344:
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x034b }
                r2 = 1
                r0.mAllAppsLoaded = r2     // Catch:{ all -> 0x034b }
                monitor-exit(r30)     // Catch:{ all -> 0x034b }
                goto L_0x0357
            L_0x034b:
                r0 = move-exception
                monitor-exit(r30)     // Catch:{ all -> 0x034b }
                throw r0
            L_0x034e:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x034e }
                throw r0
            L_0x0351:
                r0 = move-exception
                monitor-exit(r30)     // Catch:{ all -> 0x0351 }
                throw r0
            L_0x0354:
                r30.onlyBindAllApps()
            L_0x0357:
                r30.waitForIdle()
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this
                boolean r2 = r0.mDeepShortcutsLoaded
                if (r2 != 0) goto L_0x03b5
                com.android.launcher3.util.MultiHashMap r0 = r0.mBgDeepShortcutMap
                r0.clear()
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.compat.DeepShortcutManagerCompat r2 = r0.mDeepShortcutManager
                boolean r2 = r2.hasHostPermission()
                r0.mHasShortcutHostPermission = r2
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this
                boolean r2 = r0.mHasShortcutHostPermission
                if (r2 == 0) goto L_0x03a4
                com.android.launcher3.compat.UserManagerCompat r0 = r0.mUserManager
                java.util.List r0 = r0.getUserProfiles()
                java.util.Iterator r0 = r0.iterator()
            L_0x037f:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x03a4
                java.lang.Object r2 = r0.next()
                com.android.launcher3.compat.UserHandleCompat r2 = (com.android.launcher3.compat.UserHandleCompat) r2
                com.android.launcher3.LauncherModel r3 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.compat.UserManagerCompat r3 = r3.mUserManager
                boolean r3 = r3.isUserUnlocked(r2)
                if (r3 == 0) goto L_0x037f
                com.android.launcher3.LauncherModel r3 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.compat.DeepShortcutManagerCompat r3 = r3.mDeepShortcutManager
                java.util.List r3 = r3.queryForAllShortcuts(r2)
                com.android.launcher3.LauncherModel r4 = com.android.launcher3.LauncherModel.this
                r5 = 0
                r4.updateDeepShortcutMap(r5, r2, r3)
                goto L_0x037f
            L_0x03a4:
                monitor-enter(r30)
                boolean r0 = r1.mStopped     // Catch:{ all -> 0x03b2 }
                if (r0 == 0) goto L_0x03ab
                monitor-exit(r30)     // Catch:{ all -> 0x03b2 }
                goto L_0x03ba
            L_0x03ab:
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x03b2 }
                r2 = 1
                r0.mDeepShortcutsLoaded = r2     // Catch:{ all -> 0x03b2 }
                monitor-exit(r30)     // Catch:{ all -> 0x03b2 }
                goto L_0x03b5
            L_0x03b2:
                r0 = move-exception
                monitor-exit(r30)     // Catch:{ all -> 0x03b2 }
                throw r0
            L_0x03b5:
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this
                r0.bindDeepShortcuts()
            L_0x03ba:
                r2 = 0
            L_0x03bb:
                r1.mContext = r2
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this
                java.lang.Object r3 = r0.mLock
                monitor-enter(r3)
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x03d2 }
                com.android.launcher3.LauncherModel$LoaderTask r4 = r0.mLoaderTask     // Catch:{ all -> 0x03d2 }
                if (r4 != r1) goto L_0x03ca
                r0.mLoaderTask = r2     // Catch:{ all -> 0x03d2 }
            L_0x03ca:
                r2 = 0
                r0.mIsLoaderTaskRunning = r2     // Catch:{ all -> 0x03d2 }
                r2 = 1
                r0.mHasLoaderCompletedOnce = r2     // Catch:{ all -> 0x03d2 }
                monitor-exit(r3)     // Catch:{ all -> 0x03d2 }
                return
            L_0x03d2:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x03d2 }
                throw r0
            L_0x03d5:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x03d5 }
                goto L_0x03d9
            L_0x03d8:
                throw r0
            L_0x03d9:
                goto L_0x03d8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherModel.LoaderTask.run():void");
        }

        public final void scheduleManagedHeuristicRunnable(final ManagedProfileHeuristic managedProfileHeuristic, final UserHandleCompat userHandleCompat, final List list) {
            LauncherModel.this.mIsManagedHeuristicAppsUpdated = false;
            final C535112 r0 = new Runnable() {
                public final void run() {
                    if (LauncherModel.this.mIsManagedHeuristicAppsUpdated) {
                        LauncherModel.sWorker.post(new Runnable() {
                            public final void run() {
                                C535112 r0 = C535112.this;
                                List activityList = LauncherModel.this.mLauncherApps.getActivityList((String) null, userHandleCompat);
                                C535112 r1 = C535112.this;
                                LoaderTask.this.scheduleManagedHeuristicRunnable(managedProfileHeuristic, userHandleCompat, activityList);
                            }
                        });
                        return;
                    }
                    ManagedProfileHeuristic managedProfileHeuristic = managedProfileHeuristic;
                    List<LauncherActivityInfoCompat> list = list;
                    managedProfileHeuristic.initVars();
                    HashSet hashSet = new HashSet();
                    boolean userApps = managedProfileHeuristic.getUserApps(hashSet);
                    boolean z = false;
                    for (LauncherActivityInfoCompat launcherActivityInfoCompat : list) {
                        String packageName = launcherActivityInfoCompat.getComponentName().getPackageName();
                        if (!hashSet.contains(packageName)) {
                            hashSet.add(packageName);
                            managedProfileHeuristic.markForAddition(launcherActivityInfoCompat, launcherActivityInfoCompat.getFirstInstallTime());
                            z = true;
                        }
                    }
                    if (z) {
                        managedProfileHeuristic.mPrefs.edit().putStringSet(managedProfileHeuristic.mPackageSetKey, hashSet).apply();
                        managedProfileHeuristic.finalizeAdditions(userApps);
                    }
                }
            };
            LauncherModel.this.runOnMainThread(new Runnable() {
                public final void run() {
                    if (LoaderTask.this.mIsLoadingAndBindingWorkspace) {
                        synchronized (LauncherModel.mBindCompleteRunnables) {
                            LauncherModel.mBindCompleteRunnables.add(r0);
                        }
                        return;
                    }
                    LauncherModel.runOnWorkerThread(r0);
                }
            });
        }

        public final void stopLocked() {
            synchronized (this) {
                this.mStopped = true;
                notify();
            }
        }

        /* access modifiers changed from: package-private */
        public final Callbacks tryGetCallbacks(Callbacks callbacks) {
            synchronized (LauncherModel.this.mLock) {
                if (this.mStopped) {
                    return null;
                }
                WeakReference weakReference = LauncherModel.this.mCallbacks;
                if (weakReference == null) {
                    return null;
                }
                Callbacks callbacks2 = (Callbacks) weakReference.get();
                if (callbacks2 != callbacks) {
                    return null;
                }
                if (callbacks2 != null) {
                    return callbacks2;
                }
                Log.w("Launcher.Model", "no mCallbacks");
                return null;
            }
        }
    }

    /* compiled from: PG */
    final class PackageUpdatedTask implements Runnable {
        final int mOp;
        final String[] mPackages;
        final UserHandleCompat mUser;

        public PackageUpdatedTask(int i, String[] strArr, UserHandleCompat userHandleCompat) {
            this.mOp = i;
            this.mPackages = strArr;
            this.mUser = userHandleCompat;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v69, resolved type: com.android.launcher3.AppInfo} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x0495  */
        /* JADX WARNING: Removed duplicated region for block: B:193:0x050c  */
        /* JADX WARNING: Removed duplicated region for block: B:297:0x054d A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r21 = this;
                r1 = r21
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this
                boolean r2 = r0.mHasLoaderCompletedOnce
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                r2 = 1
                r0.mIsManagedHeuristicAppsUpdated = r2
                android.content.Context r0 = com.android.launcher3.LauncherAppState.sContext
                java.lang.String[] r3 = r1.mPackages
                int r4 = r3.length
                com.android.launcher3.util.FlagOp r5 = com.android.launcher3.util.FlagOp.NO_OP
                java.util.HashSet r6 = new java.util.HashSet
                java.util.List r7 = java.util.Arrays.asList(r3)
                r6.<init>(r7)
                com.android.launcher3.util.StringFilter$2 r7 = new com.android.launcher3.util.StringFilter$2
                r7.<init>(r6)
                int r6 = r1.mOp
                r9 = 2
                switch(r6) {
                    case 1: goto L_0x0247;
                    case 2: goto L_0x00ed;
                    case 3: goto L_0x0058;
                    case 4: goto L_0x0056;
                    case 5: goto L_0x003c;
                    case 6: goto L_0x003c;
                    default: goto L_0x0027;
                }
            L_0x0027:
                com.android.launcher3.compat.UserManagerCompat r2 = com.android.launcher3.compat.UserManagerCompat.getInstance(r0)
                com.android.launcher3.compat.UserHandleCompat r5 = r1.mUser
                boolean r2 = r2.isQuietModeEnabled(r5)
                r5 = 8
                if (r2 == 0) goto L_0x02e6
                com.android.launcher3.util.FlagOp$2 r2 = new com.android.launcher3.util.FlagOp$2
                r2.<init>(r5)
                goto L_0x02eb
            L_0x003c:
                r5 = 5
                r11 = 4
                if (r6 != r5) goto L_0x0046
                com.android.launcher3.util.FlagOp$2 r5 = new com.android.launcher3.util.FlagOp$2
                r5.<init>(r11)
                goto L_0x004b
            L_0x0046:
                com.android.launcher3.util.FlagOp$3 r5 = new com.android.launcher3.util.FlagOp$3
                r5.<init>(r11)
            L_0x004b:
                com.android.launcher3.LauncherModel r6 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r6 = r6.mBgAllAppsList
                com.android.launcher3.compat.UserHandleCompat r11 = r1.mUser
                r6.updatePackageFlags(r7, r11, r5)
                goto L_0x02fa
            L_0x0056:
                r5 = 0
                goto L_0x009b
            L_0x0058:
                com.android.launcher3.compat.UserHandleCompat r5 = r1.mUser
                com.android.launcher3.util.ManagedProfileHeuristic r5 = com.android.launcher3.util.ManagedProfileHeuristic.get(r0, r5)
                if (r5 == 0) goto L_0x008a
                java.lang.String[] r6 = r1.mPackages
                java.util.HashSet r11 = new java.util.HashSet
                r11.<init>()
                r5.getUserApps(r11)
                int r12 = r6.length
                r13 = 0
                r14 = 0
            L_0x006d:
                if (r13 >= r12) goto L_0x0079
                r15 = r6[r13]
                boolean r15 = r11.remove(r15)
                r14 = r14 | r15
                int r13 = r13 + 1
                goto L_0x006d
            L_0x0079:
                if (r14 == 0) goto L_0x008a
                android.content.SharedPreferences r6 = r5.mPrefs
                android.content.SharedPreferences$Editor r6 = r6.edit()
                java.lang.String r5 = r5.mPackageSetKey
                android.content.SharedPreferences$Editor r5 = r6.putStringSet(r5, r11)
                r5.apply()
            L_0x008a:
                r5 = 0
            L_0x008b:
                if (r5 >= r4) goto L_0x0056
                com.android.launcher3.LauncherModel r6 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.IconCache r6 = r6.mIconCache
                r11 = r3[r5]
                com.android.launcher3.compat.UserHandleCompat r12 = r1.mUser
                r6.removeIconsForPkg(r11, r12)
                int r5 = r5 + 1
                goto L_0x008b
            L_0x009b:
                if (r5 >= r4) goto L_0x00e6
                com.android.launcher3.LauncherModel r6 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r6 = r6.mBgAllAppsList
                r11 = r3[r5]
                com.android.launcher3.compat.UserHandleCompat r12 = r1.mUser
                java.util.ArrayList r13 = r6.data
                int r14 = r13.size()
            L_0x00ab:
                int r14 = r14 + -1
                if (r14 < 0) goto L_0x00d6
                java.lang.Object r15 = r13.get(r14)
                com.android.launcher3.AppInfo r15 = (com.android.launcher3.AppInfo) r15
                android.content.Intent r8 = r15.intent
                android.content.ComponentName r8 = r8.getComponent()
                com.android.launcher3.compat.UserHandleCompat r10 = r15.user
                boolean r10 = r10.equals(r12)
                if (r10 == 0) goto L_0x00d5
                java.lang.String r8 = r8.getPackageName()
                boolean r8 = r11.equals(r8)
                if (r8 == 0) goto L_0x00d5
                java.util.ArrayList r8 = r6.removed
                r8.add(r15)
                r13.remove(r14)
            L_0x00d5:
                goto L_0x00ab
            L_0x00d6:
                com.android.launcher3.LauncherModel r6 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.LauncherAppState r6 = r6.mApp
                com.android.launcher3.WidgetPreviewLoader r6 = r6.mWidgetCache
                r8 = r3[r5]
                com.android.launcher3.compat.UserHandleCompat r10 = r1.mUser
                r6.removePackage(r8, r10)
                int r5 = r5 + 1
                goto L_0x009b
            L_0x00e6:
                com.android.launcher3.util.FlagOp$2 r5 = new com.android.launcher3.util.FlagOp$2
                r5.<init>(r9)
                goto L_0x02fa
            L_0x00ed:
                r5 = 0
            L_0x00ee:
                if (r5 >= r4) goto L_0x023d
                com.android.launcher3.LauncherModel r6 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.IconCache r6 = r6.mIconCache
                r8 = r3[r5]
                com.android.launcher3.compat.UserHandleCompat r10 = r1.mUser
                r6.updateIconsForPkg(r8, r10)
                com.android.launcher3.LauncherModel r6 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r6 = r6.mBgAllAppsList
                r8 = r3[r5]
                com.android.launcher3.compat.UserHandleCompat r10 = r1.mUser
                com.android.launcher3.compat.LauncherAppsCompat r11 = com.android.launcher3.compat.LauncherAppsCompat.getInstance(r0)
                java.util.List r11 = r11.getActivityList(r8, r10)
                int r12 = r11.size()
                if (r12 <= 0) goto L_0x01ec
                java.util.ArrayList r12 = r6.data
                int r12 = r12.size()
                int r12 = r12 + -1
            L_0x0119:
                if (r12 < 0) goto L_0x0166
                java.util.ArrayList r13 = r6.data
                java.lang.Object r13 = r13.get(r12)
                com.android.launcher3.AppInfo r13 = (com.android.launcher3.AppInfo) r13
                android.content.Intent r14 = r13.intent
                android.content.ComponentName r14 = r14.getComponent()
                com.android.launcher3.compat.UserHandleCompat r15 = r13.user
                boolean r15 = r10.equals(r15)
                if (r15 == 0) goto L_0x0162
                java.lang.String r15 = r14.getPackageName()
                boolean r15 = r8.equals(r15)
                if (r15 == 0) goto L_0x0162
                java.util.Iterator r15 = r11.iterator()
            L_0x013f:
                boolean r16 = r15.hasNext()
                if (r16 == 0) goto L_0x0158
                java.lang.Object r16 = r15.next()
                com.android.launcher3.compat.LauncherActivityInfoCompat r16 = (com.android.launcher3.compat.LauncherActivityInfoCompat) r16
                android.content.ComponentName r9 = r16.getComponentName()
                boolean r9 = r9.equals(r14)
                if (r9 == 0) goto L_0x0156
                goto L_0x0162
            L_0x0156:
                r9 = 2
                goto L_0x013f
            L_0x0158:
                java.util.ArrayList r9 = r6.removed
                r9.add(r13)
                java.util.ArrayList r9 = r6.data
                r9.remove(r12)
            L_0x0162:
                int r12 = r12 + -1
                r9 = 2
                goto L_0x0119
            L_0x0166:
                java.util.Iterator r8 = r11.iterator()
            L_0x016a:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x01e9
                java.lang.Object r9 = r8.next()
                com.android.launcher3.compat.LauncherActivityInfoCompat r9 = (com.android.launcher3.compat.LauncherActivityInfoCompat) r9
                android.content.ComponentName r11 = r9.getComponentName()
                java.lang.String r11 = r11.getPackageName()
                android.content.ComponentName r12 = r9.getComponentName()
                java.lang.String r12 = r12.getClassName()
                java.util.ArrayList r13 = r6.data
                int r14 = r13.size()
                r15 = 0
            L_0x018d:
                if (r15 >= r14) goto L_0x01c6
                java.lang.Object r16 = r13.get(r15)
                r2 = r16
                com.android.launcher3.AppInfo r2 = (com.android.launcher3.AppInfo) r2
                r16 = r7
                android.content.Intent r7 = r2.intent
                android.content.ComponentName r7 = r7.getComponent()
                r17 = r8
                com.android.launcher3.compat.UserHandleCompat r8 = r2.user
                boolean r8 = r10.equals(r8)
                if (r8 == 0) goto L_0x01be
                java.lang.String r8 = r7.getPackageName()
                boolean r8 = r11.equals(r8)
                if (r8 == 0) goto L_0x01be
                java.lang.String r7 = r7.getClassName()
                boolean r7 = r12.equals(r7)
                if (r7 == 0) goto L_0x01be
                goto L_0x01cb
            L_0x01be:
                int r15 = r15 + 1
                r7 = r16
                r8 = r17
                r2 = 1
                goto L_0x018d
            L_0x01c6:
                r16 = r7
                r17 = r8
                r2 = 0
            L_0x01cb:
                if (r2 != 0) goto L_0x01d8
                com.android.launcher3.AppInfo r2 = new com.android.launcher3.AppInfo
                com.android.launcher3.IconCache r7 = r6.mIconCache
                r2.<init>(r0, r9, r10, r7)
                r6.add(r2)
                goto L_0x01e3
            L_0x01d8:
                com.android.launcher3.IconCache r7 = r6.mIconCache
                r8 = 1
                r7.getTitleAndIcon(r2, r9, r8)
                java.util.ArrayList r7 = r6.modified
                r7.add(r2)
            L_0x01e3:
                r7 = r16
                r8 = r17
                r2 = 1
                goto L_0x016a
            L_0x01e9:
                r16 = r7
                goto L_0x0228
            L_0x01ec:
                r16 = r7
                java.util.ArrayList r2 = r6.data
                int r2 = r2.size()
            L_0x01f4:
                int r2 = r2 + -1
                if (r2 < 0) goto L_0x0228
                java.util.ArrayList r7 = r6.data
                java.lang.Object r7 = r7.get(r2)
                com.android.launcher3.AppInfo r7 = (com.android.launcher3.AppInfo) r7
                android.content.Intent r9 = r7.intent
                android.content.ComponentName r9 = r9.getComponent()
                com.android.launcher3.compat.UserHandleCompat r11 = r7.user
                boolean r11 = r10.equals(r11)
                if (r11 == 0) goto L_0x0227
                java.lang.String r11 = r9.getPackageName()
                boolean r11 = r8.equals(r11)
                if (r11 == 0) goto L_0x0227
                java.util.ArrayList r11 = r6.removed
                r11.add(r7)
                com.android.launcher3.IconCache r7 = r6.mIconCache
                r7.remove(r9, r10)
                java.util.ArrayList r7 = r6.data
                r7.remove(r2)
            L_0x0227:
                goto L_0x01f4
            L_0x0228:
                com.android.launcher3.LauncherModel r2 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.LauncherAppState r2 = r2.mApp
                com.android.launcher3.WidgetPreviewLoader r2 = r2.mWidgetCache
                r6 = r3[r5]
                com.android.launcher3.compat.UserHandleCompat r7 = r1.mUser
                r2.removePackage(r6, r7)
                int r5 = r5 + 1
                r7 = r16
                r2 = 1
                r9 = 2
                goto L_0x00ee
            L_0x023d:
                r16 = r7
                com.android.launcher3.util.FlagOp$3 r5 = new com.android.launcher3.util.FlagOp$3
                r2 = 2
                r5.<init>(r2)
                goto L_0x02fa
            L_0x0247:
                r16 = r7
                r2 = 0
            L_0x024a:
                if (r2 >= r4) goto L_0x0285
                com.android.launcher3.LauncherModel r6 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.IconCache r6 = r6.mIconCache
                r7 = r3[r2]
                com.android.launcher3.compat.UserHandleCompat r8 = r1.mUser
                r6.updateIconsForPkg(r7, r8)
                com.android.launcher3.LauncherModel r6 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r6 = r6.mBgAllAppsList
                r7 = r3[r2]
                com.android.launcher3.compat.UserHandleCompat r8 = r1.mUser
                com.android.launcher3.compat.LauncherAppsCompat r9 = com.android.launcher3.compat.LauncherAppsCompat.getInstance(r0)
                java.util.List r7 = r9.getActivityList(r7, r8)
                java.util.Iterator r7 = r7.iterator()
            L_0x026b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x0282
                java.lang.Object r9 = r7.next()
                com.android.launcher3.compat.LauncherActivityInfoCompat r9 = (com.android.launcher3.compat.LauncherActivityInfoCompat) r9
                com.android.launcher3.AppInfo r10 = new com.android.launcher3.AppInfo
                com.android.launcher3.IconCache r11 = r6.mIconCache
                r10.<init>(r0, r9, r8, r11)
                r6.add(r10)
                goto L_0x026b
            L_0x0282:
                int r2 = r2 + 1
                goto L_0x024a
            L_0x0285:
                com.android.launcher3.compat.UserHandleCompat r2 = r1.mUser
                com.android.launcher3.util.ManagedProfileHeuristic r2 = com.android.launcher3.util.ManagedProfileHeuristic.get(r0, r2)
                if (r2 == 0) goto L_0x02e3
                java.lang.String[] r6 = r1.mPackages
                r2.initVars()
                java.util.HashSet r7 = new java.util.HashSet
                r7.<init>()
                boolean r8 = r2.getUserApps(r7)
                long r9 = java.lang.System.currentTimeMillis()
                android.content.Context r11 = r2.mContext
                com.android.launcher3.compat.LauncherAppsCompat r11 = com.android.launcher3.compat.LauncherAppsCompat.getInstance(r11)
                int r12 = r6.length
                r13 = 0
                r14 = 0
            L_0x02a8:
                if (r13 >= r12) goto L_0x02cf
                r15 = r6[r13]
                boolean r17 = r7.contains(r15)
                if (r17 != 0) goto L_0x02cc
                r7.add(r15)
                com.android.launcher3.compat.UserHandleCompat r14 = r2.mUser
                java.util.List r14 = r11.getActivityList(r15, r14)
                boolean r15 = r14.isEmpty()
                if (r15 != 0) goto L_0x02cb
                r15 = 0
                java.lang.Object r14 = r14.get(r15)
                com.android.launcher3.compat.LauncherActivityInfoCompat r14 = (com.android.launcher3.compat.LauncherActivityInfoCompat) r14
                r2.markForAddition(r14, r9)
            L_0x02cb:
                r14 = 1
            L_0x02cc:
                int r13 = r13 + 1
                goto L_0x02a8
            L_0x02cf:
                if (r14 == 0) goto L_0x02e3
                android.content.SharedPreferences r6 = r2.mPrefs
                android.content.SharedPreferences$Editor r6 = r6.edit()
                java.lang.String r9 = r2.mPackageSetKey
                android.content.SharedPreferences$Editor r6 = r6.putStringSet(r9, r7)
                r6.apply()
                r2.finalizeAdditions(r8)
            L_0x02e3:
                r7 = r16
                goto L_0x02fa
            L_0x02e6:
                com.android.launcher3.util.FlagOp$3 r2 = new com.android.launcher3.util.FlagOp$3
                r2.<init>(r5)
            L_0x02eb:
                r5 = r2
                com.android.launcher3.util.StringFilter$1 r7 = new com.android.launcher3.util.StringFilter$1
                r7.<init>()
                com.android.launcher3.LauncherModel r2 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r2 = r2.mBgAllAppsList
                com.android.launcher3.compat.UserHandleCompat r6 = r1.mUser
                r2.updatePackageFlags(r7, r6, r5)
            L_0x02fa:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                com.android.launcher3.LauncherModel r6 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r6 = r6.mBgAllAppsList
                java.util.ArrayList r6 = r6.added
                int r6 = r6.size()
                if (r6 <= 0) goto L_0x0320
                java.util.ArrayList r6 = new java.util.ArrayList
                com.android.launcher3.LauncherModel r8 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r8 = r8.mBgAllAppsList
                java.util.ArrayList r8 = r8.added
                r6.<init>(r8)
                com.android.launcher3.LauncherModel r8 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r8 = r8.mBgAllAppsList
                java.util.ArrayList r8 = r8.added
                r8.clear()
                goto L_0x0321
            L_0x0320:
                r6 = 0
            L_0x0321:
                com.android.launcher3.LauncherModel r8 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r8 = r8.mBgAllAppsList
                java.util.ArrayList r8 = r8.modified
                int r8 = r8.size()
                if (r8 <= 0) goto L_0x0342
                java.util.ArrayList r8 = new java.util.ArrayList
                com.android.launcher3.LauncherModel r9 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r9 = r9.mBgAllAppsList
                java.util.ArrayList r9 = r9.modified
                r8.<init>(r9)
                com.android.launcher3.LauncherModel r9 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r9 = r9.mBgAllAppsList
                java.util.ArrayList r9 = r9.modified
                r9.clear()
                goto L_0x0343
            L_0x0342:
                r8 = 0
            L_0x0343:
                com.android.launcher3.LauncherModel r9 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r9 = r9.mBgAllAppsList
                java.util.ArrayList r9 = r9.removed
                int r9 = r9.size()
                if (r9 <= 0) goto L_0x0361
                com.android.launcher3.LauncherModel r9 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r9 = r9.mBgAllAppsList
                java.util.ArrayList r9 = r9.removed
                r2.addAll(r9)
                com.android.launcher3.LauncherModel r9 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.AllAppsList r9 = r9.mBgAllAppsList
                java.util.ArrayList r9 = r9.removed
                r9.clear()
            L_0x0361:
                java.util.HashMap r9 = new java.util.HashMap
                r9.<init>()
                if (r6 == 0) goto L_0x0391
                com.android.launcher3.LauncherModel r10 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.LauncherModel$Callbacks r11 = r10.getCallback()
                boolean r12 = r6.isEmpty()
                if (r12 != 0) goto L_0x037c
                com.android.launcher3.LauncherModel$4 r12 = new com.android.launcher3.LauncherModel$4
                r12.<init>(r11, r6)
                com.android.launcher3.LauncherModel.runOnWorkerThread(r12)
            L_0x037c:
                int r10 = r6.size()
                r11 = 0
            L_0x0381:
                if (r11 >= r10) goto L_0x0391
                java.lang.Object r12 = r6.get(r11)
                com.android.launcher3.AppInfo r12 = (com.android.launcher3.AppInfo) r12
                android.content.ComponentName r13 = r12.componentName
                r9.put(r13, r12)
                int r11 = r11 + 1
                goto L_0x0381
            L_0x0391:
                if (r8 == 0) goto L_0x03ba
                com.android.launcher3.LauncherModel r6 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.LauncherModel$Callbacks r6 = r6.getCallback()
                int r10 = r8.size()
                r11 = 0
            L_0x039e:
                if (r11 >= r10) goto L_0x03ae
                java.lang.Object r12 = r8.get(r11)
                com.android.launcher3.AppInfo r12 = (com.android.launcher3.AppInfo) r12
                android.content.ComponentName r13 = r12.componentName
                r9.put(r13, r12)
                int r11 = r11 + 1
                goto L_0x039e
            L_0x03ae:
                com.android.launcher3.LauncherModel r10 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.DeferredHandler r10 = r10.mHandler
                com.android.launcher3.LauncherModel$PackageUpdatedTask$1 r11 = new com.android.launcher3.LauncherModel$PackageUpdatedTask$1
                r11.<init>(r6, r8)
                r10.post(r11)
            L_0x03ba:
                int r6 = r1.mOp
                r10 = 1
                if (r6 == r10) goto L_0x03c9
                com.android.launcher3.util.FlagOp r6 = com.android.launcher3.util.FlagOp.NO_OP
                if (r5 == r6) goto L_0x03c4
                goto L_0x03c9
            L_0x03c4:
                r20 = r2
                r15 = 0
                goto L_0x057f
            L_0x03c9:
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.lang.Object r12 = com.android.launcher3.LauncherModel.sBgLock
                monitor-enter(r12)
                com.android.launcher3.util.LongArrayMap r13 = com.android.launcher3.LauncherModel.sBgItemsIdMap     // Catch:{ all -> 0x065b }
                com.android.launcher3.util.LongArrayMap$ValueIterator r14 = new com.android.launcher3.util.LongArrayMap$ValueIterator     // Catch:{ all -> 0x065b }
                r14.<init>()     // Catch:{ all -> 0x065b }
            L_0x03e2:
                boolean r13 = r14.hasNext()     // Catch:{ all -> 0x065b }
                if (r13 == 0) goto L_0x0553
                java.lang.Object r13 = r14.next()     // Catch:{ all -> 0x065b }
                com.android.launcher3.ItemInfo r13 = (com.android.launcher3.ItemInfo) r13     // Catch:{ all -> 0x065b }
                boolean r15 = r13 instanceof com.android.launcher3.ShortcutInfo     // Catch:{ all -> 0x065b }
                if (r15 == 0) goto L_0x0510
                com.android.launcher3.compat.UserHandleCompat r15 = r1.mUser     // Catch:{ all -> 0x065b }
                com.android.launcher3.compat.UserHandleCompat r8 = r13.user     // Catch:{ all -> 0x065b }
                boolean r8 = r15.equals(r8)     // Catch:{ all -> 0x065b }
                if (r8 == 0) goto L_0x0510
                com.android.launcher3.ShortcutInfo r13 = (com.android.launcher3.ShortcutInfo) r13     // Catch:{ all -> 0x065b }
                android.content.Intent$ShortcutIconResource r8 = r13.iconResource     // Catch:{ all -> 0x065b }
                if (r8 == 0) goto L_0x041f
                java.lang.String r8 = r8.packageName     // Catch:{ all -> 0x065b }
                boolean r8 = r7.matches(r8)     // Catch:{ all -> 0x065b }
                if (r8 == 0) goto L_0x041f
                android.content.Intent$ShortcutIconResource r8 = r13.iconResource     // Catch:{ all -> 0x065b }
                java.lang.String r8 = r8.packageName     // Catch:{ all -> 0x065b }
                android.content.Intent$ShortcutIconResource r15 = r13.iconResource     // Catch:{ all -> 0x065b }
                java.lang.String r15 = r15.resourceName     // Catch:{ all -> 0x065b }
                android.graphics.Bitmap r8 = com.android.launcher3.Utilities.createIconBitmap((java.lang.String) r8, (java.lang.String) r15, (android.content.Context) r0)     // Catch:{ all -> 0x065b }
                if (r8 == 0) goto L_0x041f
                r13.mIcon = r8     // Catch:{ all -> 0x065b }
                r8 = 0
                r13.usingFallbackIcon = r8     // Catch:{ all -> 0x065b }
                r8 = 1
                goto L_0x0420
            L_0x041f:
                r8 = 0
            L_0x0420:
                android.content.ComponentName r15 = r13.getTargetComponent()     // Catch:{ all -> 0x065b }
                if (r15 == 0) goto L_0x04fb
                r17 = r8
                java.lang.String r8 = r15.getPackageName()     // Catch:{ all -> 0x065b }
                boolean r8 = r7.matches(r8)     // Catch:{ all -> 0x065b }
                if (r8 == 0) goto L_0x04f3
                java.lang.Object r8 = r9.get(r15)     // Catch:{ all -> 0x065b }
                com.android.launcher3.AppInfo r8 = (com.android.launcher3.AppInfo) r8     // Catch:{ all -> 0x065b }
                r18 = r8
                r8 = 3
                boolean r19 = r13.hasStatusFlag(r8)     // Catch:{ all -> 0x065b }
                if (r19 == 0) goto L_0x04b1
                r8 = 2
                boolean r17 = r13.hasStatusFlag(r8)     // Catch:{ all -> 0x065b }
                if (r17 == 0) goto L_0x048d
                android.content.pm.PackageManager r8 = r0.getPackageManager()     // Catch:{ all -> 0x065b }
                r19 = r14
                android.content.Intent r14 = new android.content.Intent     // Catch:{ all -> 0x065b }
                r20 = r2
                java.lang.String r2 = "android.intent.action.MAIN"
                r14.<init>(r2)     // Catch:{ all -> 0x065b }
                android.content.Intent r2 = r14.setComponent(r15)     // Catch:{ all -> 0x065b }
                java.lang.String r14 = "android.intent.category.LAUNCHER"
                android.content.Intent r2 = r2.addCategory(r14)     // Catch:{ all -> 0x065b }
                r14 = 65536(0x10000, float:9.18355E-41)
                android.content.pm.ResolveInfo r2 = r8.resolveActivity(r2, r14)     // Catch:{ all -> 0x065b }
                if (r2 != 0) goto L_0x0491
                java.lang.String r2 = r15.getPackageName()     // Catch:{ all -> 0x065b }
                android.content.Intent r2 = r8.getLaunchIntentForPackage(r2)     // Catch:{ all -> 0x065b }
                if (r2 == 0) goto L_0x047e
                android.content.ComponentName r8 = r2.getComponent()     // Catch:{ all -> 0x065b }
                java.lang.Object r8 = r9.get(r8)     // Catch:{ all -> 0x065b }
                com.android.launcher3.AppInfo r8 = (com.android.launcher3.AppInfo) r8     // Catch:{ all -> 0x065b }
                goto L_0x0480
            L_0x047e:
                r8 = r18
            L_0x0480:
                if (r2 == 0) goto L_0x0488
                if (r8 != 0) goto L_0x0485
                goto L_0x0488
            L_0x0485:
                r13.promisedIntent = r2     // Catch:{ all -> 0x065b }
                goto L_0x0493
            L_0x0488:
                r10.add(r13)     // Catch:{ all -> 0x065b }
                goto L_0x054d
            L_0x048d:
                r20 = r2
                r19 = r14
            L_0x0491:
                r8 = r18
            L_0x0493:
                if (r8 == 0) goto L_0x0499
                int r2 = r8.flags     // Catch:{ all -> 0x065b }
                r13.flags = r2     // Catch:{ all -> 0x065b }
            L_0x0499:
                android.content.Intent r2 = r13.promisedIntent     // Catch:{ all -> 0x065b }
                r13.intent = r2     // Catch:{ all -> 0x065b }
                r2 = 0
                r13.promisedIntent = r2     // Catch:{ all -> 0x065b }
                r15 = 0
                r13.status = r15     // Catch:{ all -> 0x065b }
                com.android.launcher3.LauncherModel r14 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x065b }
                com.android.launcher3.IconCache r14 = r14.mIconCache     // Catch:{ all -> 0x065b }
                boolean r2 = r13.shouldUseLowResIcon()     // Catch:{ all -> 0x065b }
                r13.updateIcon(r14, r2)     // Catch:{ all -> 0x065b }
                r17 = 1
                goto L_0x04b8
            L_0x04b1:
                r20 = r2
                r19 = r14
                r15 = 0
                r8 = r18
            L_0x04b8:
                if (r8 == 0) goto L_0x04e5
                java.lang.String r2 = "android.intent.action.MAIN"
                android.content.Intent r14 = r13.intent     // Catch:{ all -> 0x065b }
                java.lang.String r14 = r14.getAction()     // Catch:{ all -> 0x065b }
                boolean r2 = r2.equals(r14)     // Catch:{ all -> 0x065b }
                if (r2 == 0) goto L_0x04e5
                int r2 = r13.itemType     // Catch:{ all -> 0x065b }
                if (r2 != 0) goto L_0x04e5
                com.android.launcher3.LauncherModel r2 = com.android.launcher3.LauncherModel.this     // Catch:{ all -> 0x065b }
                com.android.launcher3.IconCache r2 = r2.mIconCache     // Catch:{ all -> 0x065b }
                boolean r14 = r13.shouldUseLowResIcon()     // Catch:{ all -> 0x065b }
                r13.updateIcon(r2, r14)     // Catch:{ all -> 0x065b }
                java.lang.CharSequence r2 = r8.title     // Catch:{ all -> 0x065b }
                java.lang.String r2 = com.android.launcher3.Utilities.trim(r2)     // Catch:{ all -> 0x065b }
                r13.title = r2     // Catch:{ all -> 0x065b }
                java.lang.CharSequence r2 = r8.contentDescription     // Catch:{ all -> 0x065b }
                r13.contentDescription = r2     // Catch:{ all -> 0x065b }
                r17 = 1
            L_0x04e5:
                int r2 = r13.isDisabled     // Catch:{ all -> 0x065b }
                int r8 = r5.apply(r2)     // Catch:{ all -> 0x065b }
                r13.isDisabled = r8     // Catch:{ all -> 0x065b }
                if (r8 == r2) goto L_0x04f8
                r8 = r17
                r2 = 1
                goto L_0x0503
            L_0x04f3:
                r20 = r2
                r19 = r14
                r15 = 0
            L_0x04f8:
                r8 = r17
                goto L_0x0502
            L_0x04fb:
                r20 = r2
                r17 = r8
                r19 = r14
                r15 = 0
            L_0x0502:
                r2 = 0
            L_0x0503:
                if (r8 != 0) goto L_0x0507
                if (r2 == 0) goto L_0x054d
            L_0x0507:
                r6.add(r13)     // Catch:{ all -> 0x065b }
                if (r8 == 0) goto L_0x054d
                com.android.launcher3.LauncherModel.updateItemInDatabase(r0, r13)     // Catch:{ all -> 0x065b }
                goto L_0x054d
            L_0x0510:
                r20 = r2
                r19 = r14
                r15 = 0
                boolean r2 = r13 instanceof com.android.launcher3.LauncherAppWidgetInfo     // Catch:{ all -> 0x065b }
                if (r2 == 0) goto L_0x054d
                int r2 = r1.mOp     // Catch:{ all -> 0x065b }
                r8 = 1
                if (r2 != r8) goto L_0x054d
                com.android.launcher3.LauncherAppWidgetInfo r13 = (com.android.launcher3.LauncherAppWidgetInfo) r13     // Catch:{ all -> 0x065b }
                com.android.launcher3.compat.UserHandleCompat r2 = r1.mUser     // Catch:{ all -> 0x065b }
                com.android.launcher3.compat.UserHandleCompat r8 = r13.user     // Catch:{ all -> 0x065b }
                boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x065b }
                if (r2 == 0) goto L_0x054d
                r2 = 2
                boolean r8 = r13.hasRestoreFlag(r2)     // Catch:{ all -> 0x065b }
                if (r8 == 0) goto L_0x054d
                android.content.ComponentName r2 = r13.providerName     // Catch:{ all -> 0x065b }
                java.lang.String r2 = r2.getPackageName()     // Catch:{ all -> 0x065b }
                boolean r2 = r7.matches(r2)     // Catch:{ all -> 0x065b }
                if (r2 == 0) goto L_0x054d
                int r2 = r13.restoreStatus     // Catch:{ all -> 0x065b }
                r2 = r2 & -11
                r13.restoreStatus = r2     // Catch:{ all -> 0x065b }
                r2 = r2 | 4
                r13.restoreStatus = r2     // Catch:{ all -> 0x065b }
                r11.add(r13)     // Catch:{ all -> 0x065b }
                com.android.launcher3.LauncherModel.updateItemInDatabase(r0, r13)     // Catch:{ all -> 0x065b }
            L_0x054d:
                r14 = r19
                r2 = r20
                goto L_0x03e2
            L_0x0553:
                r20 = r2
                r15 = 0
                monitor-exit(r12)     // Catch:{ all -> 0x065b }
                com.android.launcher3.LauncherModel r2 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.compat.UserHandleCompat r5 = r1.mUser
                r2.bindUpdatedShortcuts(r6, r10, r5)
                boolean r2 = r10.isEmpty()
                if (r2 != 0) goto L_0x0567
                com.android.launcher3.LauncherModel.deleteItemsFromDatabase(r0, r10)
            L_0x0567:
                boolean r2 = r11.isEmpty()
                if (r2 != 0) goto L_0x057f
                com.android.launcher3.LauncherModel r2 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.LauncherModel$Callbacks r2 = r2.getCallback()
                com.android.launcher3.LauncherModel r5 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.DeferredHandler r5 = r5.mHandler
                com.android.launcher3.LauncherModel$PackageUpdatedTask$2 r6 = new com.android.launcher3.LauncherModel$PackageUpdatedTask$2
                r6.<init>(r2, r11)
                r5.post(r6)
            L_0x057f:
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                java.util.HashSet r5 = new java.util.HashSet
                r5.<init>()
                int r6 = r1.mOp
                r7 = 3
                if (r6 != r7) goto L_0x0592
                java.util.Collections.addAll(r2, r3)
                goto L_0x05c1
            L_0x0592:
                r7 = 2
                if (r6 != r7) goto L_0x05c1
                r6 = 0
            L_0x0596:
                if (r6 >= r4) goto L_0x05aa
                r7 = r3[r6]
                com.android.launcher3.compat.UserHandleCompat r8 = r1.mUser
                boolean r7 = com.android.launcher3.LauncherModel.isPackageDisabled(r0, r7, r8)
                if (r7 == 0) goto L_0x05a7
                r7 = r3[r6]
                r2.add(r7)
            L_0x05a7:
                int r6 = r6 + 1
                goto L_0x0596
            L_0x05aa:
                int r3 = r20.size()
                r10 = 0
            L_0x05af:
                if (r10 >= r3) goto L_0x05c1
                r4 = r20
                java.lang.Object r6 = r4.get(r10)
                com.android.launcher3.AppInfo r6 = (com.android.launcher3.AppInfo) r6
                android.content.ComponentName r6 = r6.componentName
                r5.add(r6)
                int r10 = r10 + 1
                goto L_0x05af
            L_0x05c1:
                r4 = r20
                boolean r3 = r2.isEmpty()
                if (r3 == 0) goto L_0x05cf
                boolean r3 = r5.isEmpty()
                if (r3 != 0) goto L_0x0621
            L_0x05cf:
                java.util.Iterator r3 = r2.iterator()
            L_0x05d3:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x05e9
                java.lang.Object r6 = r3.next()
                java.lang.String r6 = (java.lang.String) r6
                com.android.launcher3.compat.UserHandleCompat r7 = r1.mUser
                java.util.ArrayList r6 = com.android.launcher3.LauncherModel.getItemsByPackageName(r6, r7)
                com.android.launcher3.LauncherModel.deleteItemsFromDatabase(r0, r6)
                goto L_0x05d3
            L_0x05e9:
                java.util.Iterator r3 = r5.iterator()
            L_0x05ed:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x060a
                java.lang.Object r6 = r3.next()
                android.content.ComponentName r6 = (android.content.ComponentName) r6
                com.android.launcher3.compat.UserHandleCompat r7 = r1.mUser
                com.android.launcher3.LauncherModel$21 r8 = new com.android.launcher3.LauncherModel$21
                r8.<init>(r6, r7)
                com.android.launcher3.util.LongArrayMap r6 = com.android.launcher3.LauncherModel.sBgItemsIdMap
                java.util.ArrayList r6 = com.android.launcher3.LauncherModel.filterItemInfos(r6, r8)
                com.android.launcher3.LauncherModel.deleteItemsFromDatabase(r0, r6)
                goto L_0x05ed
            L_0x060a:
                com.android.launcher3.compat.UserHandleCompat r3 = r1.mUser
                com.android.launcher3.InstallShortcutReceiver.removeFromInstallQueue(r0, r2, r3)
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.LauncherModel$Callbacks r0 = r0.getCallback()
                com.android.launcher3.LauncherModel r3 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.DeferredHandler r3 = r3.mHandler
                com.android.launcher3.LauncherModel$PackageUpdatedTask$3 r6 = new com.android.launcher3.LauncherModel$PackageUpdatedTask$3
                r6.<init>(r0, r2, r5)
                r3.post(r6)
            L_0x0621:
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L_0x0639
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.LauncherModel$Callbacks r0 = r0.getCallback()
                com.android.launcher3.LauncherModel r2 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.DeferredHandler r2 = r2.mHandler
                com.android.launcher3.LauncherModel$PackageUpdatedTask$4 r3 = new com.android.launcher3.LauncherModel$PackageUpdatedTask$4
                r3.<init>(r0, r4)
                r2.post(r3)
            L_0x0639:
                boolean r0 = com.android.launcher3.Utilities.ATLEAST_MARSHMALLOW
                if (r0 != 0) goto L_0x065a
                int r0 = r1.mOp
                r2 = 1
                if (r0 == r2) goto L_0x0648
                r2 = 3
                if (r0 == r2) goto L_0x0648
                r2 = 2
                if (r0 != r2) goto L_0x065a
            L_0x0648:
                com.android.launcher3.LauncherModel r0 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.LauncherModel$Callbacks r0 = r0.getCallback()
                com.android.launcher3.LauncherModel r2 = com.android.launcher3.LauncherModel.this
                com.android.launcher3.DeferredHandler r2 = r2.mHandler
                com.android.launcher3.LauncherModel$PackageUpdatedTask$5 r3 = new com.android.launcher3.LauncherModel$PackageUpdatedTask$5
                r3.<init>(r0)
                r2.post(r3)
            L_0x065a:
                return
            L_0x065b:
                r0 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x065b }
                goto L_0x065f
            L_0x065e:
                throw r0
            L_0x065f:
                goto L_0x065e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherModel.PackageUpdatedTask.run():void");
        }
    }

    /* compiled from: PG */
    final class UserLockStateChangedTask implements Runnable {
        private final UserHandleCompat mUser;

        public UserLockStateChangedTask(UserHandleCompat userHandleCompat) {
            this.mUser = userHandleCompat;
        }

        public final void run() {
            boolean isUserUnlocked = LauncherModel.this.mUserManager.isUserUnlocked(this.mUser);
            Context context = LauncherAppState.sContext;
            HashMap hashMap = new HashMap();
            if (isUserUnlocked) {
                List<ShortcutInfoCompat> queryForPinnedShortcuts = LauncherModel.this.mDeepShortcutManager.queryForPinnedShortcuts((String) null, this.mUser);
                if (LauncherModel.this.mDeepShortcutManager.wasLastCallSuccess()) {
                    for (ShortcutInfoCompat shortcutInfoCompat : queryForPinnedShortcuts) {
                        hashMap.put(DeepShortcutKey.fromInfo(shortcutInfoCompat), shortcutInfoCompat);
                    }
                } else {
                    isUserUnlocked = false;
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            LongArrayMap.ValueIterator valueIterator = new LongArrayMap.ValueIterator();
            while (valueIterator.hasNext()) {
                ItemInfo itemInfo = (ItemInfo) valueIterator.next();
                if (itemInfo.itemType == 6 && this.mUser.equals(itemInfo.user)) {
                    ShortcutInfo shortcutInfo = (ShortcutInfo) itemInfo;
                    if (isUserUnlocked) {
                        ShortcutInfoCompat shortcutInfoCompat2 = (ShortcutInfoCompat) hashMap.get(DeepShortcutKey.fromShortcutInfo(shortcutInfo));
                        if (shortcutInfoCompat2 == null) {
                            arrayList2.add(shortcutInfo);
                        } else {
                            shortcutInfo.isDisabled &= -33;
                            shortcutInfo.updateFromDeepShortcutInfo(shortcutInfoCompat2, context);
                        }
                    } else {
                        shortcutInfo.isDisabled |= 32;
                    }
                    arrayList.add(shortcutInfo);
                }
            }
            LauncherModel.this.bindUpdatedShortcuts(arrayList, arrayList2, this.mUser);
            if (!arrayList2.isEmpty()) {
                LauncherModel.deleteItemsFromDatabase(context, arrayList2);
            }
            Iterator it = LauncherModel.this.mBgDeepShortcutMap.keySet().iterator();
            while (it.hasNext()) {
                if (((ComponentKey) it.next()).user.equals(this.mUser)) {
                    it.remove();
                }
            }
            if (isUserUnlocked) {
                LauncherModel launcherModel = LauncherModel.this;
                UserHandleCompat userHandleCompat = this.mUser;
                launcherModel.updateDeepShortcutMap((String) null, userHandleCompat, launcherModel.mDeepShortcutManager.queryForAllShortcuts(userHandleCompat));
            }
            LauncherModel.this.bindDeepShortcuts();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("launcher-loader");
        sWorkerThread = handlerThread;
        handlerThread.start();
        sWorker = new Handler(handlerThread.getLooper());
    }

    public LauncherModel(LauncherAppState launcherAppState, IconCache iconCache, AppFilter appFilter, DeepShortcutManagerCompat deepShortcutManagerCompat) {
        Context context = LauncherAppState.sContext;
        String string = context.getString(R.string.old_launcher_provider_uri);
        String authority = Uri.parse(string).getAuthority();
        boolean z = false;
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.android.launcher2.settings", 0);
        ProviderInfo resolveContentProvider2 = context.getPackageManager().resolveContentProvider(authority, 0);
        Log.d("Launcher.Model", "Old launcher provider: ".concat(String.valueOf(string)));
        if (!(resolveContentProvider == null || resolveContentProvider2 == null)) {
            z = true;
        }
        this.mOldContentProviderExists = z;
        if (z) {
            Log.d("Launcher.Model", "Old launcher provider exists.");
        } else {
            Log.d("Launcher.Model", "Old launcher provider does not exist.");
        }
        this.mApp = launcherAppState;
        this.mBgAllAppsList = new AllAppsList(iconCache, appFilter);
        this.mBgWidgetsModel = new WidgetsModel(context, iconCache, appFilter);
        this.mIconCache = iconCache;
        this.mDeepShortcutManager = deepShortcutManagerCompat;
        this.mLauncherApps = LauncherAppsCompat.getInstance(context);
        this.mUserManager = UserManagerCompat.getInstance(context);
    }

    public static void addItemToDatabase(Context context, final ItemInfo itemInfo, long j, long j2, int i, int i2) {
        itemInfo.container = j;
        itemInfo.cellX = i;
        itemInfo.cellY = i2;
        if (!(context instanceof Launcher) || j2 >= 0 || j != -101) {
            itemInfo.screenId = j2;
        } else {
            itemInfo.screenId = (long) Launcher.getLauncher(context).mHotseat.getOrderInHotseat(i, i2);
        }
        final ContentValues contentValues = new ContentValues();
        final ContentResolver contentResolver = context.getContentResolver();
        itemInfo.onAddToDatabase(context, contentValues);
        long generateNewItemId = LauncherAppState.getLauncherProvider().mOpenHelper.generateNewItemId();
        itemInfo.f16556id = generateNewItemId;
        contentValues.put("_id", Long.valueOf(generateNewItemId));
        final StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        runOnWorkerThread(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r10 = this;
                    java.lang.String r0 = "adding item: "
                    android.content.ContentResolver r1 = r6
                    android.net.Uri r2 = com.android.launcher3.LauncherSettings$Favorites.CONTENT_URI
                    android.content.ContentValues r3 = r5
                    r1.insert(r2, r3)
                    java.lang.Object r1 = com.android.launcher3.LauncherModel.sBgLock
                    monitor-enter(r1)
                    com.android.launcher3.ItemInfo r2 = r4     // Catch:{ all -> 0x0090 }
                    long r3 = r2.f16556id     // Catch:{ all -> 0x0090 }
                    java.lang.StackTraceElement[] r5 = r3     // Catch:{ all -> 0x0090 }
                    com.android.launcher3.LauncherModel.checkItemInfoLocked(r3, r2, r5)     // Catch:{ all -> 0x0090 }
                    com.android.launcher3.util.LongArrayMap r2 = com.android.launcher3.LauncherModel.sBgItemsIdMap     // Catch:{ all -> 0x0090 }
                    com.android.launcher3.ItemInfo r3 = r4     // Catch:{ all -> 0x0090 }
                    long r4 = r3.f16556id     // Catch:{ all -> 0x0090 }
                    r2.put(r4, r3)     // Catch:{ all -> 0x0090 }
                    com.android.launcher3.ItemInfo r2 = r4     // Catch:{ all -> 0x0090 }
                    int r3 = r2.itemType     // Catch:{ all -> 0x0090 }
                    r4 = 6
                    r5 = 1
                    if (r3 == 0) goto L_0x0044
                    if (r3 == r5) goto L_0x0044
                    r6 = 2
                    if (r3 == r6) goto L_0x003b
                    r6 = 4
                    if (r3 == r6) goto L_0x0033
                    if (r3 == r4) goto L_0x0044
                    goto L_0x008e
                L_0x0033:
                    java.util.ArrayList r0 = com.android.launcher3.LauncherModel.sBgAppWidgets     // Catch:{ all -> 0x0090 }
                    com.android.launcher3.LauncherAppWidgetInfo r2 = (com.android.launcher3.LauncherAppWidgetInfo) r2     // Catch:{ all -> 0x0090 }
                    r0.add(r2)     // Catch:{ all -> 0x0090 }
                    goto L_0x008e
                L_0x003b:
                    com.android.launcher3.util.LongArrayMap r3 = com.android.launcher3.LauncherModel.sBgFolders     // Catch:{ all -> 0x0090 }
                    long r6 = r2.f16556id     // Catch:{ all -> 0x0090 }
                    com.android.launcher3.FolderInfo r2 = (com.android.launcher3.FolderInfo) r2     // Catch:{ all -> 0x0090 }
                    r3.put(r6, r2)     // Catch:{ all -> 0x0090 }
                L_0x0044:
                    com.android.launcher3.ItemInfo r2 = r4     // Catch:{ all -> 0x0090 }
                    long r6 = r2.container     // Catch:{ all -> 0x0090 }
                    r8 = -100
                    int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    if (r3 == 0) goto L_0x007a
                    r8 = -101(0xffffffffffffff9b, double:NaN)
                    int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    if (r3 != 0) goto L_0x0055
                    goto L_0x007a
                L_0x0055:
                    com.android.launcher3.util.LongArrayMap r2 = com.android.launcher3.LauncherModel.sBgFolders     // Catch:{ all -> 0x0090 }
                    boolean r2 = r2.containsKey(r6)     // Catch:{ all -> 0x0090 }
                    if (r2 != 0) goto L_0x007f
                    com.android.launcher3.ItemInfo r2 = r4     // Catch:{ all -> 0x0090 }
                    java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0090 }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0090 }
                    r3.<init>(r0)     // Catch:{ all -> 0x0090 }
                    r3.append(r2)     // Catch:{ all -> 0x0090 }
                    java.lang.String r0 = " to a folder that  doesn't exist"
                    r3.append(r0)     // Catch:{ all -> 0x0090 }
                    java.lang.String r0 = "Launcher.Model"
                    java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0090 }
                    android.util.Log.e(r0, r2)     // Catch:{ all -> 0x0090 }
                    goto L_0x007f
                L_0x007a:
                    java.util.ArrayList r0 = com.android.launcher3.LauncherModel.sBgWorkspaceItems     // Catch:{ all -> 0x0090 }
                    r0.add(r2)     // Catch:{ all -> 0x0090 }
                L_0x007f:
                    com.android.launcher3.ItemInfo r0 = r4     // Catch:{ all -> 0x0090 }
                    int r2 = r0.itemType     // Catch:{ all -> 0x0090 }
                    if (r2 != r4) goto L_0x008e
                    com.android.launcher3.ShortcutInfo r0 = (com.android.launcher3.ShortcutInfo) r0     // Catch:{ all -> 0x0090 }
                    com.android.launcher3.shortcuts.DeepShortcutKey r0 = com.android.launcher3.shortcuts.DeepShortcutKey.fromShortcutInfo(r0)     // Catch:{ all -> 0x0090 }
                    com.android.launcher3.LauncherModel.incrementPinnedShortcutCount(r0, r5)     // Catch:{ all -> 0x0090 }
                L_0x008e:
                    monitor-exit(r1)     // Catch:{ all -> 0x0090 }
                    return
                L_0x0090:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0090 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherModel.C532510.run():void");
            }
        });
    }

    static void addOrMoveItemInDatabase(Context context, ItemInfo itemInfo, long j, long j2, int i, int i2) {
        if (itemInfo.container == -1) {
            addItemToDatabase(context, itemInfo, j, j2, i, i2);
        } else {
            moveItemInDatabase(context, itemInfo, j, j2, i, i2);
        }
    }

    static void checkItemInfo(final ItemInfo itemInfo) {
        final StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        final long j = itemInfo.f16556id;
        runOnWorkerThread(new Runnable() {
            public final void run() {
                synchronized (LauncherModel.sBgLock) {
                    LauncherModel.checkItemInfoLocked(j, itemInfo, stackTrace);
                }
            }
        });
    }

    static void checkItemInfoLocked(long j, ItemInfo itemInfo, StackTraceElement[] stackTraceElementArr) {
        ItemInfo itemInfo2 = (ItemInfo) sBgItemsIdMap.get(j);
        if (itemInfo2 != null && itemInfo != itemInfo2) {
            if ((itemInfo2 instanceof ShortcutInfo) && (itemInfo instanceof ShortcutInfo)) {
                ShortcutInfo shortcutInfo = (ShortcutInfo) itemInfo2;
                ShortcutInfo shortcutInfo2 = (ShortcutInfo) itemInfo;
                if (shortcutInfo.title.toString().equals(shortcutInfo2.title.toString()) && shortcutInfo.intent.filterEquals(shortcutInfo2.intent) && shortcutInfo.f16556id == shortcutInfo2.f16556id && shortcutInfo.itemType == shortcutInfo2.itemType && shortcutInfo.container == shortcutInfo2.container && shortcutInfo.screenId == shortcutInfo2.screenId && shortcutInfo.cellX == shortcutInfo2.cellX && shortcutInfo.cellY == shortcutInfo2.cellY && shortcutInfo.spanX == shortcutInfo2.spanX && shortcutInfo.spanY == shortcutInfo2.spanY) {
                    int[] iArr = shortcutInfo2.dropPos;
                    return;
                }
            }
            String itemInfo3 = itemInfo != null ? itemInfo.toString() : "null";
            String itemInfo4 = itemInfo2.toString();
            RuntimeException runtimeException = new RuntimeException("item: " + itemInfo3 + "modelItem: " + itemInfo4 + "Error: ItemInfo passed to checkItemInfo doesn't match original");
            if (stackTraceElementArr != null) {
                runtimeException.setStackTrace(stackTraceElementArr);
            }
            throw runtimeException;
        }
    }

    public static void deleteFolderAndContentsFromDatabase(Context context, final FolderInfo folderInfo) {
        final ContentResolver contentResolver = context.getContentResolver();
        runOnWorkerThread(new Runnable() {
            public final void run() {
                contentResolver.delete(LauncherSettings$Favorites.getContentUri(folderInfo.f16556id), (String) null, (String[]) null);
                synchronized (LauncherModel.sBgLock) {
                    LauncherModel.sBgItemsIdMap.remove(folderInfo.f16556id);
                    LauncherModel.sBgFolders.remove(folderInfo.f16556id);
                    LauncherModel.sBgWorkspaceItems.remove(folderInfo);
                }
                ContentResolver contentResolver = contentResolver;
                Uri uri = LauncherSettings$Favorites.CONTENT_URI;
                long j = folderInfo.f16556id;
                contentResolver.delete(uri, "container=" + j, (String[]) null);
                synchronized (LauncherModel.sBgLock) {
                    Iterator it = folderInfo.contents.iterator();
                    while (it.hasNext()) {
                        LauncherModel.sBgItemsIdMap.remove(((ItemInfo) it.next()).f16556id);
                    }
                }
            }
        });
    }

    public static void deleteItemFromDatabase(Context context, ItemInfo itemInfo) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(itemInfo);
        deleteItemsFromDatabase(context, arrayList);
    }

    static void deleteItemsFromDatabase(Context context, final ArrayList arrayList) {
        final ContentResolver contentResolver = context.getContentResolver();
        runOnWorkerThread(new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
                if (r8 == 0) goto L_0x004c;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r12 = this;
                    java.util.ArrayList r0 = r2
                    int r1 = r0.size()
                    r2 = 0
                L_0x0007:
                    if (r2 >= r1) goto L_0x00cb
                    java.lang.Object r3 = r0.get(r2)
                    com.android.launcher3.ItemInfo r3 = (com.android.launcher3.ItemInfo) r3
                    long r4 = r3.f16556id
                    android.net.Uri r4 = com.android.launcher3.LauncherSettings$Favorites.getContentUri(r4)
                    android.content.ContentResolver r5 = r1
                    r6 = 0
                    r5.delete(r4, r6, r6)
                    java.lang.Object r4 = com.android.launcher3.LauncherModel.sBgLock
                    monitor-enter(r4)
                    int r5 = r3.itemType     // Catch:{ all -> 0x00c8 }
                    if (r5 == 0) goto L_0x00b7
                    r6 = 1
                    if (r5 == r6) goto L_0x00b7
                    r6 = 2
                    if (r5 == r6) goto L_0x0063
                    r6 = 4
                    if (r5 == r6) goto L_0x005a
                    r6 = 6
                    if (r5 == r6) goto L_0x0030
                    goto L_0x00bc
                L_0x0030:
                    r5 = r3
                    com.android.launcher3.ShortcutInfo r5 = (com.android.launcher3.ShortcutInfo) r5     // Catch:{ all -> 0x00c8 }
                    com.android.launcher3.shortcuts.DeepShortcutKey r5 = com.android.launcher3.shortcuts.DeepShortcutKey.fromShortcutInfo(r5)     // Catch:{ all -> 0x00c8 }
                    java.lang.Object r6 = com.android.launcher3.LauncherModel.sBgLock     // Catch:{ all -> 0x00c8 }
                    monitor-enter(r6)     // Catch:{ all -> 0x00c8 }
                    java.util.Map r7 = com.android.launcher3.LauncherModel.sBgPinnedShortcutCounts     // Catch:{ all -> 0x0057 }
                    java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x0057 }
                    android.util.MutableInt r7 = (android.util.MutableInt) r7     // Catch:{ all -> 0x0057 }
                    if (r7 == 0) goto L_0x004c
                    int r8 = r7.value     // Catch:{ all -> 0x0057 }
                    int r8 = r8 + -1
                    r7.value = r8     // Catch:{ all -> 0x0057 }
                    if (r8 != 0) goto L_0x0055
                L_0x004c:
                    com.android.launcher3.LauncherAppState r7 = com.android.launcher3.LauncherAppState.getInstance()     // Catch:{ all -> 0x0057 }
                    com.android.launcher3.compat.DeepShortcutManagerCompat r7 = r7.mDeepShortcutManager     // Catch:{ all -> 0x0057 }
                    r7.unpinShortcut(r5)     // Catch:{ all -> 0x0057 }
                L_0x0055:
                    monitor-exit(r6)     // Catch:{ all -> 0x0057 }
                    goto L_0x00b7
                L_0x0057:
                    r0 = move-exception
                    monitor-exit(r6)     // Catch:{ all -> 0x0057 }
                    throw r0     // Catch:{ all -> 0x00c8 }
                L_0x005a:
                    java.util.ArrayList r5 = com.android.launcher3.LauncherModel.sBgAppWidgets     // Catch:{ all -> 0x00c8 }
                    r6 = r3
                    com.android.launcher3.LauncherAppWidgetInfo r6 = (com.android.launcher3.LauncherAppWidgetInfo) r6     // Catch:{ all -> 0x00c8 }
                    r5.remove(r6)     // Catch:{ all -> 0x00c8 }
                    goto L_0x00bc
                L_0x0063:
                    com.android.launcher3.util.LongArrayMap r5 = com.android.launcher3.LauncherModel.sBgFolders     // Catch:{ all -> 0x00c8 }
                    long r6 = r3.f16556id     // Catch:{ all -> 0x00c8 }
                    r5.remove(r6)     // Catch:{ all -> 0x00c8 }
                    com.android.launcher3.util.LongArrayMap r5 = com.android.launcher3.LauncherModel.sBgItemsIdMap     // Catch:{ all -> 0x00c8 }
                    com.android.launcher3.util.LongArrayMap$ValueIterator r6 = new com.android.launcher3.util.LongArrayMap$ValueIterator     // Catch:{ all -> 0x00c8 }
                    r6.<init>()     // Catch:{ all -> 0x00c8 }
                L_0x0071:
                    boolean r5 = r6.hasNext()     // Catch:{ all -> 0x00c8 }
                    if (r5 == 0) goto L_0x00b1
                    java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x00c8 }
                    com.android.launcher3.ItemInfo r5 = (com.android.launcher3.ItemInfo) r5     // Catch:{ all -> 0x00c8 }
                    long r7 = r5.container     // Catch:{ all -> 0x00c8 }
                    long r9 = r3.f16556id     // Catch:{ all -> 0x00c8 }
                    int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                    if (r11 != 0) goto L_0x0071
                    java.lang.String r7 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00c8 }
                    java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00c8 }
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c8 }
                    r8.<init>()     // Catch:{ all -> 0x00c8 }
                    java.lang.String r9 = "deleting a folder ("
                    r8.append(r9)     // Catch:{ all -> 0x00c8 }
                    r8.append(r7)     // Catch:{ all -> 0x00c8 }
                    java.lang.String r7 = ") which still contains items ("
                    r8.append(r7)     // Catch:{ all -> 0x00c8 }
                    r8.append(r5)     // Catch:{ all -> 0x00c8 }
                    java.lang.String r5 = ")"
                    r8.append(r5)     // Catch:{ all -> 0x00c8 }
                    java.lang.String r5 = "Launcher.Model"
                    java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x00c8 }
                    android.util.Log.e(r5, r7)     // Catch:{ all -> 0x00c8 }
                    goto L_0x0071
                L_0x00b1:
                    java.util.ArrayList r5 = com.android.launcher3.LauncherModel.sBgWorkspaceItems     // Catch:{ all -> 0x00c8 }
                    r5.remove(r3)     // Catch:{ all -> 0x00c8 }
                    goto L_0x00bc
                L_0x00b7:
                    java.util.ArrayList r5 = com.android.launcher3.LauncherModel.sBgWorkspaceItems     // Catch:{ all -> 0x00c8 }
                    r5.remove(r3)     // Catch:{ all -> 0x00c8 }
                L_0x00bc:
                    com.android.launcher3.util.LongArrayMap r5 = com.android.launcher3.LauncherModel.sBgItemsIdMap     // Catch:{ all -> 0x00c8 }
                    long r6 = r3.f16556id     // Catch:{ all -> 0x00c8 }
                    r5.remove(r6)     // Catch:{ all -> 0x00c8 }
                    monitor-exit(r4)     // Catch:{ all -> 0x00c8 }
                    int r2 = r2 + 1
                    goto L_0x0007
                L_0x00c8:
                    r0 = move-exception
                    monitor-exit(r4)     // Catch:{ all -> 0x00c8 }
                    throw r0
                L_0x00cb:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherModel.C532712.run():void");
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        r1 = (com.android.launcher3.LauncherAppWidgetInfo) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.ArrayList filterItemInfos(java.lang.Iterable r7, com.android.launcher3.LauncherModel.ItemInfoFilter r8) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0009:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0067
            java.lang.Object r1 = r7.next()
            com.android.launcher3.ItemInfo r1 = (com.android.launcher3.ItemInfo) r1
            boolean r2 = r1 instanceof com.android.launcher3.ShortcutInfo
            r3 = 0
            if (r2 == 0) goto L_0x002c
            com.android.launcher3.ShortcutInfo r1 = (com.android.launcher3.ShortcutInfo) r1
            android.content.ComponentName r2 = r1.getTargetComponent()
            if (r2 == 0) goto L_0x0009
            boolean r2 = r8.filterItem(r3, r1, r2)
            if (r2 == 0) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x002c:
            boolean r2 = r1 instanceof com.android.launcher3.FolderInfo
            if (r2 == 0) goto L_0x0053
            com.android.launcher3.FolderInfo r1 = (com.android.launcher3.FolderInfo) r1
            java.util.ArrayList r2 = r1.contents
            int r3 = r2.size()
            r4 = 0
        L_0x0039:
            if (r4 >= r3) goto L_0x0009
            java.lang.Object r5 = r2.get(r4)
            com.android.launcher3.ShortcutInfo r5 = (com.android.launcher3.ShortcutInfo) r5
            android.content.ComponentName r6 = r5.getTargetComponent()
            if (r6 == 0) goto L_0x0050
            boolean r6 = r8.filterItem(r1, r5, r6)
            if (r6 == 0) goto L_0x0050
            r0.add(r5)
        L_0x0050:
            int r4 = r4 + 1
            goto L_0x0039
        L_0x0053:
            boolean r2 = r1 instanceof com.android.launcher3.LauncherAppWidgetInfo
            if (r2 == 0) goto L_0x0009
            com.android.launcher3.LauncherAppWidgetInfo r1 = (com.android.launcher3.LauncherAppWidgetInfo) r1
            android.content.ComponentName r2 = r1.providerName
            if (r2 == 0) goto L_0x0009
            boolean r2 = r8.filterItem(r3, r1, r2)
            if (r2 == 0) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x0067:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherModel.filterItemInfos(java.lang.Iterable, com.android.launcher3.LauncherModel$ItemInfoFilter):java.util.ArrayList");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: boolean[][]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean findNextAvailableIconSpaceInScreen(java.util.ArrayList r12, int[] r13, int r14, int r15) {
        /*
            com.android.launcher3.LauncherAppState r0 = com.android.launcher3.LauncherAppState.getInstance()
            com.android.launcher3.InvariantDeviceProfile r0 = r0.mInvariantDeviceProfile
            int r4 = r0.numColumns
            int r5 = r0.numRows
            r0 = 2
            int[] r0 = new int[r0]
            r1 = 1
            r0[r1] = r5
            r2 = 0
            r0[r2] = r4
            java.lang.Class r3 = java.lang.Boolean.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r0)
            r6 = r0
            boolean[][] r6 = (boolean[][]) r6
            if (r12 == 0) goto L_0x004f
            int r0 = r12.size()
        L_0x0022:
            if (r2 >= r0) goto L_0x004f
            java.lang.Object r3 = r12.get(r2)
            com.android.launcher3.ItemInfo r3 = (com.android.launcher3.ItemInfo) r3
            int r7 = r3.cellX
            int r8 = r3.spanX
            int r8 = r8 + r7
            int r9 = r3.cellY
            int r10 = r3.spanY
            int r9 = r9 + r10
        L_0x0034:
            if (r7 < 0) goto L_0x004c
            if (r7 >= r8) goto L_0x004c
            if (r7 >= r4) goto L_0x004c
            int r10 = r3.cellY
        L_0x003c:
            if (r10 < 0) goto L_0x0049
            if (r10 >= r9) goto L_0x0049
            if (r10 >= r5) goto L_0x0049
            r11 = r6[r7]
            r11[r10] = r1
            int r10 = r10 + 1
            goto L_0x003c
        L_0x0049:
            int r7 = r7 + 1
            goto L_0x0034
        L_0x004c:
            int r2 = r2 + 1
            goto L_0x0022
        L_0x004f:
            r1 = r13
            r2 = r14
            r3 = r15
            boolean r12 = com.android.launcher3.Utilities.findVacantCell(r1, r2, r3, r4, r5, r6)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.LauncherModel.findNextAvailableIconSpaceInScreen(java.util.ArrayList, int[], int, int):boolean");
    }

    static FolderInfo findOrMakeFolder(LongArrayMap longArrayMap, long j) {
        FolderInfo folderInfo = (FolderInfo) longArrayMap.get(j);
        if (folderInfo != null) {
            return folderInfo;
        }
        FolderInfo folderInfo2 = new FolderInfo();
        longArrayMap.put(j, folderInfo2);
        return folderInfo2;
    }

    public static ArrayList getItemsByPackageName(final String str, final UserHandleCompat userHandleCompat) {
        return filterItemInfos(sBgItemsIdMap, new ItemInfoFilter() {
            public final boolean filterItem(ItemInfo itemInfo, ItemInfo itemInfo2, ComponentName componentName) {
                return componentName.getPackageName().equals(str) && itemInfo2.user.equals(userHandleCompat);
            }
        });
    }

    static Intent getMarketIntent(String str) {
        return new Intent("android.intent.action.VIEW").setData(new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", str).build());
    }

    public static void incrementPinnedShortcutCount(DeepShortcutKey deepShortcutKey, boolean z) {
        synchronized (sBgLock) {
            Map map = sBgPinnedShortcutCounts;
            MutableInt mutableInt = (MutableInt) map.get(deepShortcutKey);
            if (mutableInt == null) {
                mutableInt = new MutableInt(1);
                map.put(deepShortcutKey, mutableInt);
            } else {
                mutableInt.value++;
            }
            if (z && mutableInt.value == 1) {
                LauncherAppState.getInstance().mDeepShortcutManager.pinShortcut(deepShortcutKey);
            }
        }
    }

    static boolean isPackageDisabled(Context context, String str, UserHandleCompat userHandleCompat) {
        return !LauncherAppsCompat.getInstance(context).isPackageEnabledForProfile(str, userHandleCompat);
    }

    public static boolean isValidPackage(Context context, String str, UserHandleCompat userHandleCompat) {
        if (str == null) {
            return false;
        }
        return LauncherAppsCompat.getInstance(context).isPackageEnabledForProfile(str, userHandleCompat);
    }

    public static boolean isValidPackageActivity(Context context, ComponentName componentName, UserHandleCompat userHandleCompat) {
        LauncherAppsCompat instance = LauncherAppsCompat.getInstance(context);
        if (!instance.isPackageEnabledForProfile(componentName.getPackageName(), userHandleCompat)) {
            return false;
        }
        return instance.isActivityEnabledForProfile(componentName, userHandleCompat);
    }

    static boolean isValidProvider(AppWidgetProviderInfo appWidgetProviderInfo) {
        return (appWidgetProviderInfo == null || appWidgetProviderInfo.provider == null || appWidgetProviderInfo.provider.getPackageName() == null) ? false : true;
    }

    public static ArrayList loadWorkspaceScreensDb(Context context) {
        Cursor query = context.getContentResolver().query(LauncherSettings$WorkspaceScreens.CONTENT_URI, (String[]) null, (String) null, (String[]) null, "screenRank");
        ArrayList arrayList = new ArrayList();
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
            while (query.moveToNext()) {
                arrayList.add(Long.valueOf(query.getLong(columnIndexOrThrow)));
            }
            query.close();
            return arrayList;
        } catch (Exception e) {
            String obj = e.toString();
            Launcher.addDumpLog$ar$ds("Launcher.Model", "Desktop items loading interrupted - invalid screens: " + obj, (Exception) null);
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    static void modifyItemInDatabase(Context context, ItemInfo itemInfo, long j, long j2, int i, int i2, int i3, int i4) {
        itemInfo.container = j;
        itemInfo.cellX = i;
        itemInfo.cellY = i2;
        itemInfo.spanX = i3;
        itemInfo.spanY = i4;
        if (!(context instanceof Launcher) || j2 >= 0 || j != -101) {
            itemInfo.screenId = j2;
        } else {
            itemInfo.screenId = (long) Launcher.getLauncher(context).mHotseat.getOrderInHotseat(i, i2);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("container", Long.valueOf(itemInfo.container));
        contentValues.put("cellX", Integer.valueOf(itemInfo.cellX));
        contentValues.put("cellY", Integer.valueOf(itemInfo.cellY));
        contentValues.put("rank", Integer.valueOf(itemInfo.rank));
        contentValues.put("spanX", Integer.valueOf(itemInfo.spanX));
        contentValues.put("spanY", Integer.valueOf(itemInfo.spanY));
        contentValues.put("screen", Long.valueOf(itemInfo.screenId));
        updateItemInDatabaseHelper$ar$ds(context, contentValues, itemInfo);
    }

    public static void moveItemInDatabase(Context context, ItemInfo itemInfo, long j, long j2, int i, int i2) {
        itemInfo.container = j;
        itemInfo.cellX = i;
        itemInfo.cellY = i2;
        if (!(context instanceof Launcher) || j2 >= 0 || j != -101) {
            itemInfo.screenId = j2;
        } else {
            itemInfo.screenId = (long) Launcher.getLauncher(context).mHotseat.getOrderInHotseat(i, i2);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("container", Long.valueOf(itemInfo.container));
        contentValues.put("cellX", Integer.valueOf(itemInfo.cellX));
        contentValues.put("cellY", Integer.valueOf(itemInfo.cellY));
        contentValues.put("rank", Integer.valueOf(itemInfo.rank));
        contentValues.put("screen", Long.valueOf(itemInfo.screenId));
        updateItemInDatabaseHelper$ar$ds(context, contentValues, itemInfo);
    }

    static void moveItemsInDatabase$ar$ds(Context context, final ArrayList arrayList, long j) {
        final ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ItemInfo itemInfo = (ItemInfo) arrayList.get(i);
            itemInfo.container = j;
            itemInfo.screenId = 0;
            ContentValues contentValues = new ContentValues();
            contentValues.put("container", Long.valueOf(itemInfo.container));
            contentValues.put("cellX", Integer.valueOf(itemInfo.cellX));
            contentValues.put("cellY", Integer.valueOf(itemInfo.cellY));
            contentValues.put("rank", Integer.valueOf(itemInfo.rank));
            contentValues.put("screen", Long.valueOf(itemInfo.screenId));
            arrayList2.add(contentValues);
        }
        final ContentResolver contentResolver = context.getContentResolver();
        final StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        runOnWorkerThread(new Runnable() {
            public final void run() {
                ArrayList arrayList = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ItemInfo itemInfo = (ItemInfo) arrayList.get(i);
                    long j = itemInfo.f16556id;
                    arrayList.add(ContentProviderOperation.newUpdate(LauncherSettings$Favorites.getContentUri(j)).withValues((ContentValues) arrayList2.get(i)).build());
                    LauncherModel.updateItemArrays(itemInfo, j, stackTrace);
                }
                try {
                    contentResolver.applyBatch("com.google.android.launcher.settings", arrayList);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void runOnWorkerThread(Runnable runnable) {
        if (sWorkerThread.getThreadId() == Process.myTid()) {
            runnable.run();
        } else {
            sWorker.post(runnable);
        }
    }

    private final void stopLoaderLocked() {
        LoaderTask loaderTask = this.mLoaderTask;
        if (loaderTask != null) {
            loaderTask.stopLocked();
        }
    }

    static void updateItemArrays(ItemInfo itemInfo, long j, StackTraceElement[] stackTraceElementArr) {
        synchronized (sBgLock) {
            checkItemInfoLocked(j, itemInfo, stackTraceElementArr);
            long j2 = itemInfo.container;
            if (!(j2 == -100 || j2 == -101 || sBgFolders.containsKey(j2))) {
                String valueOf = String.valueOf(itemInfo);
                long j3 = itemInfo.container;
                Log.e("Launcher.Model", "item: " + valueOf + " container being set to: " + j3 + ", not in the list of folders");
            }
            ItemInfo itemInfo2 = (ItemInfo) sBgItemsIdMap.get(j);
            if (itemInfo2 != null) {
                long j4 = itemInfo2.container;
                if (j4 == -100 || j4 == -101) {
                    int i = itemInfo2.itemType;
                    if (i == 0 || i == 1 || i == 2 || i == 6) {
                        ArrayList arrayList = sBgWorkspaceItems;
                        if (!arrayList.contains(itemInfo2)) {
                            arrayList.add(itemInfo2);
                        }
                    }
                }
            }
            sBgWorkspaceItems.remove(itemInfo2);
        }
    }

    public static void updateItemInDatabase(Context context, ItemInfo itemInfo) {
        ContentValues contentValues = new ContentValues();
        itemInfo.onAddToDatabase(context, contentValues);
        updateItemInDatabaseHelper$ar$ds(context, contentValues, itemInfo);
    }

    static void updateItemInDatabaseHelper$ar$ds(Context context, ContentValues contentValues, ItemInfo itemInfo) {
        final long j = itemInfo.f16556id;
        final Uri contentUri = LauncherSettings$Favorites.getContentUri(j);
        final ContentResolver contentResolver = context.getContentResolver();
        final StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        final ContentValues contentValues2 = contentValues;
        final ItemInfo itemInfo2 = itemInfo;
        runOnWorkerThread(new Runnable() {
            public final void run() {
                contentResolver.update(contentUri, contentValues2, (String) null, (String[]) null);
                LauncherModel.updateItemArrays(itemInfo2, j, stackTrace);
            }
        });
    }

    public final void addAndBindAddedWorkspaceItems(final Context context, final ArrayList arrayList) {
        final Callbacks callback = getCallback();
        if (!arrayList.isEmpty()) {
            runOnWorkerThread(new Runnable() {
                public final void run() {
                    int i;
                    int i2;
                    boolean z;
                    long j;
                    Iterator it;
                    LongArrayMap.ValueIterator valueIterator;
                    String str;
                    String str2;
                    final ArrayList arrayList = new ArrayList();
                    final ArrayList arrayList2 = new ArrayList();
                    ArrayList loadWorkspaceScreensDb = LauncherModel.loadWorkspaceScreensDb(context);
                    synchronized (LauncherModel.sBgLock) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ItemInfo itemInfo = (ItemInfo) it2.next();
                            int i3 = itemInfo.itemType;
                            int i4 = 1;
                            if (i3 == 0 || i3 == 1) {
                                Intent intent = itemInfo.getIntent();
                                UserHandleCompat userHandleCompat = itemInfo.user;
                                if (intent == null) {
                                    continue;
                                } else {
                                    if (intent.getComponent() != null) {
                                        String packageName = intent.getComponent().getPackageName();
                                        if (intent.getPackage() != null) {
                                            str = intent.toUri(0);
                                            str2 = new Intent(intent).setPackage((String) null).toUri(0);
                                        } else {
                                            str = new Intent(intent).setPackage(packageName).toUri(0);
                                            str2 = intent.toUri(0);
                                        }
                                    } else {
                                        str = intent.toUri(0);
                                        str2 = intent.toUri(0);
                                    }
                                    synchronized (LauncherModel.sBgLock) {
                                        LongArrayMap.ValueIterator valueIterator2 = new LongArrayMap.ValueIterator();
                                        while (valueIterator2.hasNext()) {
                                            ItemInfo itemInfo2 = (ItemInfo) valueIterator2.next();
                                            if (itemInfo2 instanceof ShortcutInfo) {
                                                ShortcutInfo shortcutInfo = (ShortcutInfo) itemInfo2;
                                                Intent intent2 = shortcutInfo.promisedIntent;
                                                if (intent2 == null) {
                                                    intent2 = shortcutInfo.intent;
                                                }
                                                if (intent2 != null && shortcutInfo.user.equals(userHandleCompat)) {
                                                    String uri = intent2.toUri(0);
                                                    if (str.equals(uri) || str2.equals(uri)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            int i5 = itemInfo.spanX;
                            int i6 = itemInfo.spanY;
                            LongSparseArray longSparseArray = new LongSparseArray();
                            synchronized (LauncherModel.sBgLock) {
                                LongArrayMap.ValueIterator valueIterator3 = new LongArrayMap.ValueIterator();
                                while (valueIterator3.hasNext()) {
                                    ItemInfo itemInfo3 = (ItemInfo) valueIterator3.next();
                                    int i7 = i6;
                                    if (itemInfo3.container == -100) {
                                        ArrayList arrayList3 = (ArrayList) longSparseArray.get(itemInfo3.screenId);
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                            valueIterator = valueIterator3;
                                            longSparseArray.put(itemInfo3.screenId, arrayList3);
                                        } else {
                                            valueIterator = valueIterator3;
                                        }
                                        arrayList3.add(itemInfo3);
                                        valueIterator3 = valueIterator;
                                    }
                                    i6 = i7;
                                }
                                i = i6;
                            }
                            int[] iArr = new int[2];
                            int size = loadWorkspaceScreensDb.size();
                            int i8 = !loadWorkspaceScreensDb.isEmpty();
                            if (i8 < size) {
                                j = ((Long) loadWorkspaceScreensDb.get(i8)).longValue();
                                i2 = i;
                                z = LauncherModel.findNextAvailableIconSpaceInScreen((ArrayList) longSparseArray.get(j), iArr, i5, i2);
                            } else {
                                i2 = i;
                                j = 0;
                                z = false;
                            }
                            if (!z) {
                                while (true) {
                                    if (i4 >= size) {
                                        break;
                                    }
                                    j = ((Long) loadWorkspaceScreensDb.get(i4)).longValue();
                                    it = it2;
                                    if (LauncherModel.findNextAvailableIconSpaceInScreen((ArrayList) longSparseArray.get(j), iArr, i5, i2)) {
                                        z = true;
                                        break;
                                    } else {
                                        i4++;
                                        it2 = it;
                                    }
                                }
                            }
                            it = it2;
                            if (!z) {
                                j = LauncherAppState.getLauncherProvider().mOpenHelper.generateNewScreenId();
                                Long valueOf = Long.valueOf(j);
                                loadWorkspaceScreensDb.add(valueOf);
                                arrayList2.add(valueOf);
                                if (!LauncherModel.findNextAvailableIconSpaceInScreen((ArrayList) longSparseArray.get(j), iArr, i5, i2)) {
                                    throw new RuntimeException("Can't find space to add the item");
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(j), iArr);
                            long longValue = ((Long) create.first).longValue();
                            int[] iArr2 = (int[]) create.second;
                            if (!(itemInfo instanceof ShortcutInfo) && !(itemInfo instanceof FolderInfo)) {
                                if (!(itemInfo instanceof LauncherAppWidgetInfo)) {
                                    if (itemInfo instanceof AppInfo) {
                                        itemInfo = new ShortcutInfo((AppInfo) itemInfo);
                                    } else {
                                        throw new RuntimeException("Unexpected info type");
                                    }
                                }
                            }
                            LauncherModel.addItemToDatabase(context, itemInfo, -100, longValue, iArr2[0], iArr2[1]);
                            arrayList.add(itemInfo);
                            it2 = it;
                        }
                    }
                    LauncherModel.this.updateWorkspaceScreenOrder(context, loadWorkspaceScreensDb);
                    if (!arrayList.isEmpty()) {
                        LauncherModel.this.runOnMainThread(new Runnable() {
                            public final void run() {
                                Callbacks callback = LauncherModel.this.getCallback();
                                if (callback == callback && callback != null) {
                                    ArrayList arrayList = new ArrayList();
                                    ArrayList arrayList2 = new ArrayList();
                                    if (!arrayList.isEmpty()) {
                                        ArrayList arrayList3 = arrayList;
                                        long j = ((ItemInfo) arrayList3.get(arrayList3.size() - 1)).screenId;
                                        ArrayList arrayList4 = arrayList;
                                        int size = arrayList4.size();
                                        for (int i = 0; i < size; i++) {
                                            ItemInfo itemInfo = (ItemInfo) arrayList4.get(i);
                                            if (itemInfo.screenId == j) {
                                                arrayList.add(itemInfo);
                                            } else {
                                                arrayList2.add(itemInfo);
                                            }
                                        }
                                    }
                                    callback.bindAppsAdded(arrayList2, arrayList2, arrayList, (ArrayList) null);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public final void bindDeepShortcuts() {
        final MultiHashMap clone = this.mBgDeepShortcutMap.clone();
        runOnMainThread(new Runnable() {
            public final void run() {
                Callbacks callback = LauncherModel.this.getCallback();
                if (callback != null) {
                    callback.bindDeepShortcutMap(clone);
                }
            }
        });
    }

    public final void bindUpdatedShortcuts(ArrayList arrayList, UserHandleCompat userHandleCompat) {
        bindUpdatedShortcuts(arrayList, new ArrayList(), userHandleCompat);
    }

    public final void bindWidgetsModel(final Callbacks callbacks, final WidgetsModel widgetsModel) {
        this.mHandler.post(new Runnable() {
            public final void run() {
                Callbacks callback = LauncherModel.this.getCallback();
                Callbacks callbacks = callbacks;
                if (callbacks == callback && callback != null) {
                    callbacks.bindWidgetsModel(widgetsModel);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void forceReload() {
        resetLoadedState$ar$ds(true);
        startLoaderFromBackground();
    }

    public final ShortcutInfo getAppShortcutInfo(Intent intent, UserHandleCompat userHandleCompat, Cursor cursor, CursorIconInfo cursorIconInfo, boolean z, boolean z2) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            Log.d("Launcher.Model", "Missing component found in getShortcutInfo");
            return null;
        }
        Intent intent2 = new Intent(intent.getAction(), (Uri) null);
        intent2.addCategory("android.intent.category.LAUNCHER");
        intent2.setComponent(component);
        LauncherActivityInfoCompat resolveActivity = this.mLauncherApps.resolveActivity(intent2, userHandleCompat);
        if (resolveActivity != null || z) {
            ShortcutInfo shortcutInfo = new ShortcutInfo();
            this.mIconCache.getTitleAndIcon(shortcutInfo, component, resolveActivity, userHandleCompat, false, z2);
            IconCache iconCache = this.mIconCache;
            if (iconCache.isDefaultIcon(shortcutInfo.getIcon(iconCache), userHandleCompat) && cursor != null) {
                Bitmap loadIcon = cursorIconInfo.loadIcon(cursor);
                if (loadIcon == null) {
                    loadIcon = this.mIconCache.getDefaultIcon(userHandleCompat);
                }
                shortcutInfo.mIcon = loadIcon;
            }
            if (resolveActivity != null && PackageManagerHelper.isAppSuspended(resolveActivity.getApplicationInfo())) {
                shortcutInfo.isDisabled = 4;
            }
            if (TextUtils.isEmpty(shortcutInfo.title) && cursor != null) {
                shortcutInfo.title = cursorIconInfo.getTitle(cursor);
            }
            if (shortcutInfo.title == null) {
                shortcutInfo.title = component.getClassName();
            }
            shortcutInfo.itemType = 0;
            shortcutInfo.user = userHandleCompat;
            shortcutInfo.contentDescription = this.mUserManager.getBadgedLabelForUser(shortcutInfo.title, shortcutInfo.user);
            if (resolveActivity != null) {
                shortcutInfo.flags = AppInfo.initFlags(resolveActivity);
            }
            return shortcutInfo;
        }
        Log.d("Launcher.Model", "Missing activity found in getShortcutInfo: ".concat(component.toString()));
        return null;
    }

    public final Callbacks getCallback() {
        WeakReference weakReference = this.mCallbacks;
        if (weakReference != null) {
            return (Callbacks) weakReference.get();
        }
        return null;
    }

    public final boolean isCurrentCallbacks(Callbacks callbacks) {
        WeakReference weakReference = this.mCallbacks;
        return weakReference != null && weakReference.get() == callbacks;
    }

    public final void loadInfoFromCursor(ShortcutInfo shortcutInfo, Cursor cursor, CursorIconInfo cursorIconInfo) {
        shortcutInfo.title = cursorIconInfo.getTitle(cursor);
        Bitmap loadIcon = cursorIconInfo.loadIcon(cursor, shortcutInfo);
        if (loadIcon == null) {
            loadIcon = this.mIconCache.getDefaultIcon(shortcutInfo.user);
            shortcutInfo.usingFallbackIcon = true;
        }
        shortcutInfo.mIcon = loadIcon;
    }

    public final void onPackageAdded(String str, UserHandleCompat userHandleCompat) {
        sWorker.post(new PackageUpdatedTask(1, new String[]{str}, userHandleCompat));
    }

    public final void onPackageChanged(String str, UserHandleCompat userHandleCompat) {
        sWorker.post(new PackageUpdatedTask(2, new String[]{str}, userHandleCompat));
    }

    public final void onPackageRemoved(String str, UserHandleCompat userHandleCompat) {
        sWorker.post(new PackageUpdatedTask(3, new String[]{str}, userHandleCompat));
    }

    public final void onPackagesAvailable(String[] strArr, UserHandleCompat userHandleCompat, boolean z) {
        sWorker.post(new PackageUpdatedTask(2, strArr, userHandleCompat));
    }

    public final void onPackagesSuspended(String[] strArr, UserHandleCompat userHandleCompat) {
        sWorker.post(new PackageUpdatedTask(5, strArr, userHandleCompat));
    }

    public final void onPackagesUnavailable(String[] strArr, UserHandleCompat userHandleCompat, boolean z) {
        if (!z) {
            sWorker.post(new PackageUpdatedTask(4, strArr, userHandleCompat));
        }
    }

    public final void onPackagesUnsuspended(String[] strArr, UserHandleCompat userHandleCompat) {
        sWorker.post(new PackageUpdatedTask(6, strArr, userHandleCompat));
    }

    public final void onReceive(Context context, Intent intent) {
        UserHandleCompat fromIntent;
        String action = intent.getAction();
        if ("android.intent.action.LOCALE_CHANGED".equals(action)) {
            forceReload();
        } else if ("android.search.action.GLOBAL_SEARCH_ACTIVITY_CHANGED".equals(action)) {
            Callbacks callback = getCallback();
            if (callback != null) {
                callback.bindSearchProviderChanged();
            }
        } else if (LauncherAppsCompat.ACTION_MANAGED_PROFILE_ADDED.equals(action) || LauncherAppsCompat.ACTION_MANAGED_PROFILE_REMOVED.equals(action)) {
            UserManagerCompat.getInstance(context).enableAndResetCache();
            forceReload();
        } else if ((LauncherAppsCompat.ACTION_MANAGED_PROFILE_AVAILABLE.equals(action) || LauncherAppsCompat.ACTION_MANAGED_PROFILE_UNAVAILABLE.equals(action) || LauncherAppsCompat.ACTION_MANAGED_PROFILE_UNLOCKED.equals(action)) && (fromIntent = UserHandleCompat.fromIntent(intent)) != null) {
            if (LauncherAppsCompat.ACTION_MANAGED_PROFILE_AVAILABLE.equals(action) || LauncherAppsCompat.ACTION_MANAGED_PROFILE_UNAVAILABLE.equals(action)) {
                sWorker.post(new PackageUpdatedTask(7, new String[0], fromIntent));
            }
            if (LauncherAppsCompat.ACTION_MANAGED_PROFILE_UNAVAILABLE.equals(action) || LauncherAppsCompat.ACTION_MANAGED_PROFILE_UNLOCKED.equals(action)) {
                sWorker.post(new UserLockStateChangedTask(fromIntent));
            }
        }
    }

    public final void onShortcutsChanged(String str, List list, UserHandleCompat userHandleCompat) {
        sWorker.post(new DeepShortcutsChangedTask(str, list, userHandleCompat));
    }

    public final void resetLoadedState$ar$ds(boolean z) {
        synchronized (this.mLock) {
            stopLoaderLocked();
            if (z) {
                this.mAllAppsLoaded = false;
            }
            this.mWorkspaceLoaded = false;
            this.mDeepShortcutsLoaded = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void runOnMainThread(Runnable runnable) {
        if (sWorkerThread.getThreadId() == Process.myTid()) {
            this.mHandler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public final void startLoader(int i, int i2) {
        InstallShortcutReceiver.mUseInstallQueue = true;
        synchronized (this.mLock) {
            ArrayList arrayList = mDeferredBindRunnables;
            synchronized (arrayList) {
                arrayList.clear();
            }
            WeakReference weakReference = this.mCallbacks;
            if (!(weakReference == null || weakReference.get() == null)) {
                stopLoaderLocked();
                LoaderTask loaderTask = new LoaderTask(LauncherAppState.sContext, i2);
                this.mLoaderTask = loaderTask;
                if (i == -1001 || !this.mAllAppsLoaded || !this.mWorkspaceLoaded || !this.mDeepShortcutsLoaded || this.mIsLoaderTaskRunning) {
                    sWorkerThread.setPriority(5);
                    sWorker.post(this.mLoaderTask);
                } else if (i != -1001) {
                    LauncherModel launcherModel = LauncherModel.this;
                    if (!launcherModel.mAllAppsLoaded || !launcherModel.mWorkspaceLoaded) {
                        throw new RuntimeException("Expecting AllApps and Workspace to be loaded");
                    }
                    synchronized (launcherModel.mLock) {
                        if (LauncherModel.this.mIsLoaderTaskRunning) {
                            throw new RuntimeException("Error! Background loading is already running");
                        }
                    }
                    DeferredHandler deferredHandler = LauncherModel.this.mHandler;
                    LinkedList linkedList = new LinkedList();
                    synchronized (deferredHandler.mQueue) {
                        linkedList.addAll(deferredHandler.mQueue);
                        deferredHandler.mQueue.clear();
                    }
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    loaderTask.bindWorkspace(i);
                    loaderTask.onlyBindAllApps();
                    LauncherModel.this.bindDeepShortcuts();
                } else {
                    throw new RuntimeException("Should not call runBindSynchronousPage() without valid page index");
                }
            }
        }
    }

    public final void startLoaderFromBackground() {
        Callbacks callback = getCallback();
        if (callback != null && !callback.setLoadOnResume()) {
            startLoader(-1001, 0);
        }
    }

    public final void stopLoader() {
        synchronized (this.mLock) {
            LoaderTask loaderTask = this.mLoaderTask;
            if (loaderTask != null) {
                loaderTask.stopLocked();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void unbindWorkspaceItemsOnMainThread() {
        final ArrayList arrayList = new ArrayList();
        synchronized (sBgLock) {
            arrayList.addAll(sBgWorkspaceItems);
            arrayList.addAll(sBgAppWidgets);
        }
        runOnMainThread(new Runnable() {
            public final void run() {
                ArrayList arrayList = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ItemInfo) arrayList.get(i)).unbind();
                }
            }
        });
    }

    public final void updateDeepShortcutMap(String str, UserHandleCompat userHandleCompat, List list) {
        if (str != null) {
            Iterator it = this.mBgDeepShortcutMap.keySet().iterator();
            while (it.hasNext()) {
                ComponentKey componentKey = (ComponentKey) it.next();
                if (componentKey.componentName.getPackageName().equals(str) && componentKey.user.equals(userHandleCompat)) {
                    it.remove();
                }
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ShortcutInfoCompat shortcutInfoCompat = (ShortcutInfoCompat) it2.next();
            if (shortcutInfoCompat.isEnabled() && (shortcutInfoCompat.isDeclaredInManifest() || shortcutInfoCompat.isDynamic())) {
                this.mBgDeepShortcutMap.addToList(new ComponentKey(shortcutInfoCompat.getActivity(), shortcutInfoCompat.getUserHandle()), shortcutInfoCompat.getId());
            }
        }
    }

    public final void updateWorkspaceScreenOrder(Context context, ArrayList arrayList) {
        final ArrayList arrayList2 = new ArrayList(arrayList);
        final ContentResolver contentResolver = context.getContentResolver();
        final Uri uri = LauncherSettings$WorkspaceScreens.CONTENT_URI;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).longValue() < 0) {
                it.remove();
            }
        }
        runOnWorkerThread(new Runnable() {
            public final void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ContentProviderOperation.newDelete(uri).build());
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_id", Long.valueOf(((Long) arrayList2.get(i)).longValue()));
                    contentValues.put("screenRank", Integer.valueOf(i));
                    arrayList.add(ContentProviderOperation.newInsert(uri).withValues(contentValues).build());
                }
                try {
                    contentResolver.applyBatch("com.google.android.launcher.settings", arrayList);
                    synchronized (LauncherModel.sBgLock) {
                        LauncherModel.sBgWorkspaceScreens.clear();
                        LauncherModel.sBgWorkspaceScreens.addAll(arrayList2);
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    public final void bindUpdatedShortcuts(ArrayList arrayList, ArrayList arrayList2, UserHandleCompat userHandleCompat) {
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            final Callbacks callback = getCallback();
            final ArrayList arrayList3 = arrayList;
            final ArrayList arrayList4 = arrayList2;
            final UserHandleCompat userHandleCompat2 = userHandleCompat;
            runOnMainThread(new Runnable() {
                public final void run() {
                    Callbacks callback = LauncherModel.this.getCallback();
                    if (callback != null && callback == callback) {
                        callback.bindShortcutsChanged(arrayList3, arrayList4, userHandleCompat2);
                    }
                }
            });
        }
    }
}
