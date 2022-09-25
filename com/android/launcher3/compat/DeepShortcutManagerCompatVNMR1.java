package com.android.launcher3.compat;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.LauncherApps;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.UserHandle;
import android.util.Log;
import com.android.launcher3.InstallShortcutReceiver;
import com.android.launcher3.shortcuts.DeepShortcutKey;
import com.android.launcher3.shortcuts.ShortcutInfoCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public class DeepShortcutManagerCompatVNMR1 extends DeepShortcutManagerCompat {
    private final Context mContext;
    private final LauncherApps mLauncherApps;
    private boolean mWasLastCallSuccess;

    /* compiled from: PG */
    class ShortcutQuery {
        Object mShortcutQuery;
        Class mShortcutQueryClass;

        public ShortcutQuery(DeepShortcutManagerCompatVNMR1 deepShortcutManagerCompatVNMR1) {
            try {
                Class<?> cls = Class.forName("android.content.pm.LauncherApps$ShortcutQuery");
                this.mShortcutQueryClass = cls;
                this.mShortcutQuery = cls.newInstance();
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }

        public void setActivity(ComponentName componentName) {
            try {
                this.mShortcutQueryClass.getMethod("setActivity", new Class[]{ComponentName.class}).invoke(this.mShortcutQuery, new Object[]{componentName});
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        public void setPackage(String str) {
            try {
                this.mShortcutQueryClass.getMethod("setPackage", new Class[]{String.class}).invoke(this.mShortcutQuery, new Object[]{str});
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        public void setQueryFlags(int i) {
            try {
                this.mShortcutQueryClass.getMethod("setQueryFlags", new Class[]{Integer.TYPE}).invoke(this.mShortcutQuery, new Object[]{Integer.valueOf(i)});
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        public void setShortcutIds(List list) {
            try {
                this.mShortcutQueryClass.getMethod("setShortcutIds", new Class[]{List.class}).invoke(this.mShortcutQuery, new Object[]{list});
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    public DeepShortcutManagerCompatVNMR1(Context context) {
        this.mContext = context;
        this.mLauncherApps = (LauncherApps) context.getSystemService("launcherapps");
    }

    private List extractIds(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ShortcutInfoCompat) it.next()).getId());
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List query(int r5, java.lang.String r6, java.util.List r7, com.android.launcher3.compat.UserHandleCompat r8) {
        /*
            r4 = this;
            boolean r0 = com.android.launcher3.Utilities.ATLEAST_O
            com.android.launcher3.compat.DeepShortcutManagerCompatVNMR1$ShortcutQuery r0 = new com.android.launcher3.compat.DeepShortcutManagerCompatVNMR1$ShortcutQuery
            r0.<init>(r4)
            r0.setQueryFlags(r5)
            if (r6 == 0) goto L_0x0012
            r0.setPackage(r6)
            r0.setShortcutIds(r7)
        L_0x0012:
            r5 = 2
            r6 = 0
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ SecurityException -> 0x0050, IllegalStateException -> 0x004e, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x004a, NoSuchMethodException -> 0x0048 }
            java.lang.Class r1 = r0.mShortcutQueryClass     // Catch:{ SecurityException -> 0x0050, IllegalStateException -> 0x004e, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x004a, NoSuchMethodException -> 0x0048 }
            r7[r6] = r1     // Catch:{ SecurityException -> 0x0050, IllegalStateException -> 0x004e, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x004a, NoSuchMethodException -> 0x0048 }
            java.lang.Class<android.os.UserHandle> r1 = android.os.UserHandle.class
            r2 = 1
            r7[r2] = r1     // Catch:{ SecurityException -> 0x0050, IllegalStateException -> 0x004e, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x004a, NoSuchMethodException -> 0x0048 }
            java.lang.Class<android.content.pm.LauncherApps> r1 = android.content.pm.LauncherApps.class
            java.lang.String r3 = "getShortcuts"
            java.lang.reflect.Method r7 = r1.getMethod(r3, r7)     // Catch:{ SecurityException -> 0x0050, IllegalStateException -> 0x004e, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x004a, NoSuchMethodException -> 0x0048 }
            android.content.pm.LauncherApps r1 = r4.mLauncherApps     // Catch:{ SecurityException -> 0x0050, IllegalStateException -> 0x004e, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x004a, NoSuchMethodException -> 0x0048 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ SecurityException -> 0x0050, IllegalStateException -> 0x004e, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x004a, NoSuchMethodException -> 0x0048 }
            java.lang.Object r0 = r0.mShortcutQuery     // Catch:{ SecurityException -> 0x0050, IllegalStateException -> 0x004e, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x004a, NoSuchMethodException -> 0x0048 }
            r5[r6] = r0     // Catch:{ SecurityException -> 0x0050, IllegalStateException -> 0x004e, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x004a, NoSuchMethodException -> 0x0048 }
            android.os.UserHandle r8 = r8.getUser()     // Catch:{ SecurityException -> 0x0050, IllegalStateException -> 0x004e, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x004a, NoSuchMethodException -> 0x0048 }
            r5[r2] = r8     // Catch:{ SecurityException -> 0x0050, IllegalStateException -> 0x004e, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x004a, NoSuchMethodException -> 0x0048 }
            java.lang.Object r5 = r7.invoke(r1, r5)     // Catch:{ SecurityException -> 0x0050, IllegalStateException -> 0x004e, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x004a, NoSuchMethodException -> 0x0048 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ SecurityException -> 0x0050, IllegalStateException -> 0x004e, IllegalAccessException -> 0x004c, InvocationTargetException -> 0x004a, NoSuchMethodException -> 0x0048 }
            r4.mWasLastCallSuccess = r2     // Catch:{ SecurityException -> 0x0046, IllegalStateException -> 0x0044, IllegalAccessException -> 0x0042, InvocationTargetException -> 0x0040, NoSuchMethodException -> 0x003e }
            goto L_0x005c
        L_0x003e:
            r7 = move-exception
            goto L_0x0053
        L_0x0040:
            r7 = move-exception
            goto L_0x0053
        L_0x0042:
            r7 = move-exception
            goto L_0x0053
        L_0x0044:
            r7 = move-exception
            goto L_0x0053
        L_0x0046:
            r7 = move-exception
            goto L_0x0053
        L_0x0048:
            r5 = move-exception
            goto L_0x0051
        L_0x004a:
            r5 = move-exception
            goto L_0x0051
        L_0x004c:
            r5 = move-exception
            goto L_0x0051
        L_0x004e:
            r5 = move-exception
            goto L_0x0051
        L_0x0050:
            r5 = move-exception
        L_0x0051:
            r7 = r5
            r5 = 0
        L_0x0053:
            java.lang.String r8 = "DeepShortcutManager"
            java.lang.String r0 = "Failed to query for shortcuts"
            android.util.Log.e(r8, r0, r7)
            r4.mWasLastCallSuccess = r6
        L_0x005c:
            if (r5 != 0) goto L_0x0061
            java.util.List r5 = java.util.Collections.EMPTY_LIST
            return r5
        L_0x0061:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r5.size()
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x006e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0081
            java.lang.Object r7 = r5.next()
            com.android.launcher3.shortcuts.ShortcutInfoCompat r8 = new com.android.launcher3.shortcuts.ShortcutInfoCompat
            r8.<init>(r7)
            r6.add(r8)
            goto L_0x006e
        L_0x0081:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.compat.DeepShortcutManagerCompatVNMR1.query(int, java.lang.String, java.util.List, com.android.launcher3.compat.UserHandleCompat):java.util.List");
    }

    public Drawable getShortcutIconDrawable(ShortcutInfoCompat shortcutInfoCompat, int i) {
        Class<LauncherApps> cls = LauncherApps.class;
        try {
            Drawable drawable = (Drawable) cls.getMethod("getShortcutIconDrawable", new Class[]{shortcutInfoCompat.mShortcutInfoClass, Integer.TYPE}).invoke(this.mLauncherApps, new Object[]{shortcutInfoCompat.mShortcutInfo, Integer.valueOf(i)});
            this.mWasLastCallSuccess = true;
            return drawable;
        } catch (IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            Log.e("DeepShortcutManager", "Failed to get shortcut icon", e);
            this.mWasLastCallSuccess = false;
            return null;
        }
    }

    public boolean hasHostPermission() {
        try {
            return ((Boolean) LauncherApps.class.getMethod("hasShortcutHostPermission", new Class[0]).invoke(this.mLauncherApps, new Object[0])).booleanValue();
        } catch (IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            Log.e("DeepShortcutManager", "Failed to make shortcut manager call", e);
            return false;
        }
    }

    public void onShortcutsChanged(List list) {
    }

    public void pinShortcut(DeepShortcutKey deepShortcutKey) {
        String packageName = deepShortcutKey.componentName.getPackageName();
        String className = deepShortcutKey.componentName.getClassName();
        UserHandleCompat userHandleCompat = deepShortcutKey.user;
        List extractIds = extractIds(queryForPinnedShortcuts(packageName, userHandleCompat));
        extractIds.add(className);
        try {
            LauncherApps.class.getMethod("pinShortcuts", new Class[]{String.class, List.class, UserHandle.class}).invoke(this.mLauncherApps, new Object[]{packageName, extractIds, userHandleCompat.getUser()});
            this.mWasLastCallSuccess = true;
        } catch (IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            Log.w("DeepShortcutManager", "Failed to pin shortcut", e);
            this.mWasLastCallSuccess = false;
        }
    }

    public List queryForAllShortcuts(UserHandleCompat userHandleCompat) {
        return query(11, (String) null, (List) null, userHandleCompat);
    }

    public List queryForFullDetails(String str, List list, UserHandleCompat userHandleCompat) {
        return query(11, str, list, userHandleCompat);
    }

    public List queryForPinnedShortcuts(String str, UserHandleCompat userHandleCompat) {
        return query(2, str, (List) null, userHandleCompat);
    }

    public List queryForShortcutsContainer(String str, List list, UserHandleCompat userHandleCompat) {
        return query(9, str, list, userHandleCompat);
    }

    public void startShortcut(String str, String str2, Rect rect, Bundle bundle, UserHandleCompat userHandleCompat) {
        try {
            LauncherApps.class.getMethod("startShortcut", new Class[]{String.class, String.class, Rect.class, Bundle.class, UserHandle.class}).invoke(this.mLauncherApps, new Object[]{str, str2, rect, bundle, userHandleCompat.getUser()});
            this.mWasLastCallSuccess = true;
        } catch (IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            Log.e("DeepShortcutManager", "Failed to start shortcut", e);
            this.mWasLastCallSuccess = false;
        }
    }

    public void unpinShortcut(DeepShortcutKey deepShortcutKey) {
        if (!InstallShortcutReceiver.getPendingShortcuts(this.mContext).contains(deepShortcutKey)) {
            String packageName = deepShortcutKey.componentName.getPackageName();
            String className = deepShortcutKey.componentName.getClassName();
            UserHandleCompat userHandleCompat = deepShortcutKey.user;
            List extractIds = extractIds(queryForPinnedShortcuts(packageName, userHandleCompat));
            extractIds.remove(className);
            try {
                LauncherApps.class.getMethod("pinShortcuts", new Class[]{String.class, List.class, UserHandle.class}).invoke(this.mLauncherApps, new Object[]{packageName, extractIds, userHandleCompat.getUser()});
                this.mWasLastCallSuccess = true;
            } catch (IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                Log.w("DeepShortcutManager", "Failed to unpin shortcut", e);
                this.mWasLastCallSuccess = false;
            }
        }
    }

    public boolean wasLastCallSuccess() {
        return this.mWasLastCallSuccess;
    }
}
