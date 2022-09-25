package com.android.launcher3.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.launcher3.FolderInfo;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.MainThreadExecutor;
import com.android.launcher3.PackageSessionCommitReceiver;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.Utilities;
import com.android.launcher3.compat.LauncherActivityInfoCompat;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.compat.UserManagerCompat;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
public final class ManagedProfileHeuristic {
    private final boolean mAddIconsToHomescreen;
    public final Context mContext;
    private ArrayList mHomescreenApps;
    private final LauncherModel mModel = LauncherAppState.getInstance().mModel;
    public final String mPackageSetKey;
    public final SharedPreferences mPrefs;
    public HashMap mShortcutToInstallTimeMap;
    public final UserHandleCompat mUser;
    private final long mUserCreationTime;
    private final long mUserSerial;
    private ArrayList mWorkFolderApps;

    private ManagedProfileHeuristic(Context context, UserHandleCompat userHandleCompat) {
        this.mContext = context;
        this.mUser = userHandleCompat;
        UserManagerCompat instance = UserManagerCompat.getInstance(context);
        long serialNumberForUser = instance.getSerialNumberForUser(userHandleCompat);
        this.mUserSerial = serialNumberForUser;
        this.mUserCreationTime = instance.getUserCreationTime(userHandleCompat);
        this.mPackageSetKey = "installed_packages_for_user_" + serialNumberForUser;
        boolean z = false;
        this.mPrefs = context.getSharedPreferences("com.android.launcher3.managedusers.prefs", 0);
        this.mAddIconsToHomescreen = (!Utilities.ATLEAST_O || PackageSessionCommitReceiver.isEnabled(context)) ? true : z;
    }

    public static ManagedProfileHeuristic get(Context context, UserHandleCompat userHandleCompat) {
        if (!Utilities.ATLEAST_LOLLIPOP || UserHandleCompat.myUserHandle().equals(userHandleCompat)) {
            return null;
        }
        return new ManagedProfileHeuristic(context, userHandleCompat);
    }

    public static void processAllUsers(List list, Context context) {
        if (Utilities.ATLEAST_LOLLIPOP) {
            UserManagerCompat instance = UserManagerCompat.getInstance(context);
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long serialNumberForUser = instance.getSerialNumberForUser((UserHandleCompat) it.next());
                hashSet.add("installed_packages_for_user_" + serialNumberForUser);
                hashSet.add("user_folder_" + serialNumberForUser);
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.android.launcher3.managedusers.prefs", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String next : sharedPreferences.getAll().keySet()) {
                if (!hashSet.contains(next)) {
                    edit.remove(next);
                }
            }
            edit.apply();
        }
    }

    private final void saveWorkFolderShortcuts(long j, int i) {
        ArrayList arrayList = this.mWorkFolderApps;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            ItemInfo itemInfo = (ItemInfo) arrayList.get(i2);
            itemInfo.rank = i;
            LauncherModel.addItemToDatabase(this.mContext, itemInfo, j, 0, 0, 0);
            i2++;
            i++;
        }
    }

    private final void sortList(ArrayList arrayList) {
        Collections.sort(arrayList, new Comparator() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                long j;
                Long l = (Long) ManagedProfileHeuristic.this.mShortcutToInstallTimeMap.get((ShortcutInfo) obj);
                Long l2 = (Long) ManagedProfileHeuristic.this.mShortcutToInstallTimeMap.get((ShortcutInfo) obj2);
                long j2 = 0;
                if (l == null) {
                    j = 0;
                } else {
                    j = l.longValue();
                }
                if (l2 != null) {
                    j2 = l2.longValue();
                }
                return Utilities.longCompare(j, j2);
            }
        });
    }

    public final void finalizeAdditions(boolean z) {
        final FolderInfo folderInfo;
        if (!this.mWorkFolderApps.isEmpty()) {
            sortList(this.mWorkFolderApps);
            String str = "user_folder_" + this.mUserSerial;
            if (!this.mAddIconsToHomescreen) {
                if (!this.mPrefs.contains(str)) {
                    this.mPrefs.edit().putLong(str, -1).apply();
                }
            } else if (this.mPrefs.contains(str)) {
                long j = this.mPrefs.getLong(str, 0);
                Long valueOf = Long.valueOf(j);
                synchronized (LauncherModel.sBgLock) {
                    folderInfo = (FolderInfo) LauncherModel.sBgFolders.get(valueOf.longValue());
                }
                if (folderInfo == null || !folderInfo.hasOption(2)) {
                    this.mHomescreenApps.addAll(this.mWorkFolderApps);
                } else {
                    saveWorkFolderShortcuts(j, folderInfo.contents.size());
                    final ArrayList arrayList = this.mWorkFolderApps;
                    new MainThreadExecutor().execute(new Runnable() {
                        public final void run() {
                            ArrayList arrayList = arrayList;
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                folderInfo.add((ShortcutInfo) arrayList.get(i));
                            }
                        }
                    });
                }
            } else {
                FolderInfo folderInfo2 = new FolderInfo();
                folderInfo2.title = this.mContext.getText(R.string.work_folder_name);
                folderInfo2.setOption(2, true, (Context) null);
                ArrayList arrayList2 = this.mWorkFolderApps;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    folderInfo2.add((ShortcutInfo) arrayList2.get(i));
                }
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add(folderInfo2);
                this.mModel.addAndBindAddedWorkspaceItems(this.mContext, arrayList3);
                this.mPrefs.edit().putLong("user_folder_" + this.mUserSerial, folderInfo2.f16556id).apply();
                saveWorkFolderShortcuts(folderInfo2.f16556id, 0);
            }
        }
        if (z && !this.mHomescreenApps.isEmpty() && this.mAddIconsToHomescreen) {
            sortList(this.mHomescreenApps);
            this.mModel.addAndBindAddedWorkspaceItems(this.mContext, this.mHomescreenApps);
        }
    }

    public final boolean getUserApps(HashSet hashSet) {
        Set<String> stringSet = this.mPrefs.getStringSet(this.mPackageSetKey, (Set) null);
        if (stringSet == null) {
            return false;
        }
        hashSet.addAll(stringSet);
        return true;
    }

    public final void initVars() {
        this.mHomescreenApps = new ArrayList();
        this.mWorkFolderApps = new ArrayList();
        this.mShortcutToInstallTimeMap = new HashMap();
    }

    public final void markForAddition(LauncherActivityInfoCompat launcherActivityInfoCompat, long j) {
        ArrayList arrayList;
        if (j <= this.mUserCreationTime + 28800000) {
            arrayList = this.mWorkFolderApps;
        } else {
            arrayList = this.mHomescreenApps;
        }
        ShortcutInfo shortcutInfo = new ShortcutInfo(launcherActivityInfoCompat, this.mContext);
        this.mShortcutToInstallTimeMap.put(shortcutInfo, Long.valueOf(j));
        arrayList.add(shortcutInfo);
    }
}
