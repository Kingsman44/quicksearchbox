package com.google.android.apps.gsa.search.core.p6809l;

import android.app.ActivityManager;
import android.content.Context;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.l.j */
/* compiled from: PG */
public final class C86161j {

    /* renamed from: a */
    private final Context f232850a;

    /* renamed from: b */
    private final ActivityManager f232851b;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x004e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0021 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo79804a() {
        /*
            r6 = this;
            android.content.Context r0 = r6.f232850a
            java.lang.String r1 = "android.permission.GET_TASKS"
            boolean r0 = com.google.android.apps.gsa.shared.util.permissions.C91077d.m148794e(r0, r1)
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0052
            android.content.Context r0 = r6.f232850a
            java.lang.String r3 = "android.permission.REAL_GET_TASKS"
            boolean r0 = com.google.android.apps.gsa.shared.util.permissions.C91077d.m148794e(r0, r3)
            if (r0 == 0) goto L_0x0017
            goto L_0x0052
        L_0x0017:
            android.app.ActivityManager r0 = r6.f232851b
            java.util.List r0 = r0.getRunningAppProcesses()
            java.util.Iterator r0 = r0.iterator()
        L_0x0021:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0051
            java.lang.Object r3 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3
            int r4 = r3.importance
            r5 = 100
            if (r4 != r5) goto L_0x0021
            java.lang.String r3 = r3.processName
            if (r3 != 0) goto L_0x0039
        L_0x0037:
            r3 = r2
            goto L_0x0048
        L_0x0039:
            r4 = 58
            int r4 = r3.indexOf(r4)
            if (r4 < 0) goto L_0x0048
            if (r4 != 0) goto L_0x0044
            goto L_0x0037
        L_0x0044:
            java.lang.String r3 = r3.substring(r1, r4)
        L_0x0048:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0021
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2 = r3
        L_0x0051:
            return r2
        L_0x0052:
            android.app.ActivityManager r0 = r6.f232851b
            r3 = 1
            java.util.List r0 = r0.getRunningTasks(r3)
            if (r0 == 0) goto L_0x006f
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0062
            goto L_0x006f
        L_0x0062:
            java.lang.Object r0 = r0.get(r1)
            android.app.ActivityManager$RunningTaskInfo r0 = (android.app.ActivityManager.RunningTaskInfo) r0
            android.content.ComponentName r0 = r0.topActivity
            java.lang.String r0 = r0.getPackageName()
            return r0
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6809l.C86161j.mo79804a():java.lang.String");
    }

    /* renamed from: b */
    public final String mo79805b(String str) {
        List<ActivityManager.RunningTaskInfo> runningTasks = this.f232851b.getRunningTasks(1);
        if (runningTasks == null || runningTasks.isEmpty()) {
            return null;
        }
        ActivityManager.RunningTaskInfo runningTaskInfo = runningTasks.get(0);
        if (runningTaskInfo.topActivity.getPackageName().equals(str)) {
            return runningTaskInfo.topActivity.getClassName();
        }
        return null;
    }

    public C86161j(Context context, ActivityManager activityManager) {
        context.getClass();
        this.f232850a = context;
        context.getPackageManager();
        this.f232851b = activityManager;
    }
}
