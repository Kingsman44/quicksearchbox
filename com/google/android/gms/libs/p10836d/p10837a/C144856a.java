package com.google.android.gms.libs.p10836d.p10837a;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.libs.d.a.a */
/* compiled from: PG */
public final class C144856a {

    /* renamed from: a */
    private static final Method f391706a;

    /* renamed from: b */
    private static final Method f391707b;

    static {
        Method method;
        Method method2 = null;
        try {
            method = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, String.class, Integer.TYPE, String.class});
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            method = null;
        }
        f391706a = method;
        try {
            method2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        f391707b = method2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m235444a(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            r0.getClass()
            java.lang.reflect.Method r1 = f391706a
            if (r1 == 0) goto L_0x0070
            java.lang.String r1 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = r5.checkSelfPermission(r1)
            if (r5 == 0) goto L_0x0018
            goto L_0x0070
        L_0x0018:
            java.lang.reflect.Method r5 = f391707b
            r1 = 0
            if (r5 == 0) goto L_0x003f
            java.lang.Class<android.os.UserHandle> r2 = android.os.UserHandle.class
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException -> 0x0030, InvocationTargetException -> 0x002e }
            java.lang.Object r5 = r5.invoke(r2, r3)     // Catch:{ IllegalAccessException -> 0x0030, InvocationTargetException -> 0x002e }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException -> 0x0030, InvocationTargetException -> 0x002e }
            if (r5 == 0) goto L_0x003f
            int r5 = r5.intValue()     // Catch:{ IllegalAccessException -> 0x0030, InvocationTargetException -> 0x002e }
            goto L_0x0040
        L_0x002e:
            r5 = move-exception
            goto L_0x0031
        L_0x0030:
            r5 = move-exception
        L_0x0031:
            r2 = 6
            java.lang.String r3 = "JobSchedulerCompat"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L_0x003f
            java.lang.String r2 = "myUserId invocation illegal"
            android.util.Log.e(r3, r2, r5)
        L_0x003f:
            r5 = 0
        L_0x0040:
            java.lang.reflect.Method r2 = f391706a
            java.lang.String r3 = "com.google.android.gms"
            if (r2 == 0) goto L_0x006c
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x0066, InvocationTargetException -> 0x0064 }
            r4[r1] = r6     // Catch:{ IllegalAccessException -> 0x0066, InvocationTargetException -> 0x0064 }
            r1 = 1
            r4[r1] = r3     // Catch:{ IllegalAccessException -> 0x0066, InvocationTargetException -> 0x0064 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalAccessException -> 0x0066, InvocationTargetException -> 0x0064 }
            r1 = 2
            r4[r1] = r5     // Catch:{ IllegalAccessException -> 0x0066, InvocationTargetException -> 0x0064 }
            r5 = 3
            r4[r5] = r7     // Catch:{ IllegalAccessException -> 0x0066, InvocationTargetException -> 0x0064 }
            java.lang.Object r5 = r2.invoke(r0, r4)     // Catch:{ IllegalAccessException -> 0x0066, InvocationTargetException -> 0x0064 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException -> 0x0066, InvocationTargetException -> 0x0064 }
            if (r5 == 0) goto L_0x0063
            r5.intValue()     // Catch:{ IllegalAccessException -> 0x0066, InvocationTargetException -> 0x0064 }
        L_0x0063:
            return
        L_0x0064:
            r5 = move-exception
            goto L_0x0067
        L_0x0066:
            r5 = move-exception
        L_0x0067:
            java.lang.String r1 = "error calling scheduleAsPackage"
            android.util.Log.e(r7, r1, r5)
        L_0x006c:
            r0.schedule(r6)
            return
        L_0x0070:
            r0.schedule(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.libs.p10836d.p10837a.C144856a.m235444a(android.content.Context, android.app.job.JobInfo, java.lang.String):void");
    }
}
