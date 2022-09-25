package com.google.android.libraries.directboot;

import android.content.Context;
import android.os.UserManager;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.directboot.d */
/* compiled from: PG */
public final class C20674d {

    /* renamed from: a */
    public static final /* synthetic */ int f57955a = 0;

    /* renamed from: b */
    private static UserManager f57956b = null;

    /* renamed from: c */
    private static volatile boolean f57957c = false;

    /* renamed from: d */
    private static boolean f57958d = false;

    private C20674d() {
    }

    /* renamed from: a */
    public static Context m38852a(Context context) {
        if (context.isDeviceProtectedStorage()) {
            return context;
        }
        return context.createDeviceProtectedStorageContext();
    }

    /* renamed from: b */
    public static C60870cx m38853b(Context context, Runnable runnable) {
        if (!m38856e(context)) {
            return C2169h.m6027a(new C20671a(runnable, context));
        }
        runnable.run();
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public static synchronized void m38854c() {
        synchronized (C20674d.class) {
            f57958d = true;
        }
    }

    /* renamed from: d */
    public static boolean m38855d(Context context) {
        return !m38857f(context);
    }

    /* renamed from: e */
    public static boolean m38856e(Context context) {
        return m38857f(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006f, code lost:
        if (r3 == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0071, code lost:
        f57956b = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0078, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0075 A[Catch:{ NullPointerException -> 0x0062 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m38857f(android.content.Context r8) {
        /*
            boolean r0 = f57957c
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Class<com.google.android.libraries.directboot.d> r0 = com.google.android.libraries.directboot.C20674d.class
            monitor-enter(r0)
            boolean r2 = f57957c     // Catch:{ all -> 0x0079 }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            return r1
        L_0x000f:
            boolean r2 = f57958d     // Catch:{ all -> 0x0079 }
            r3 = 0
            if (r2 == 0) goto L_0x0037
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x0079 }
            r2.<init>()     // Catch:{ all -> 0x0079 }
            java.lang.Class<com.google.android.libraries.directboot.DirectBootHelperService> r4 = com.google.android.libraries.directboot.DirectBootHelperService.class
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0079 }
            android.content.Intent r2 = r2.setClassName(r8, r4)     // Catch:{ all -> 0x0079 }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ all -> 0x0079 }
            r4 = 268435968(0x10000200, float:2.524509E-29)
            java.util.List r8 = r8.queryIntentServices(r2, r4)     // Catch:{ all -> 0x0079 }
            if (r8 == 0) goto L_0x0073
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0079 }
            if (r8 != 0) goto L_0x0073
            goto L_0x004e
        L_0x0037:
            r2 = 1
        L_0x0038:
            r4 = 2
            r5 = 0
            if (r2 > r4) goto L_0x006f
            android.os.UserManager r4 = f57956b     // Catch:{ all -> 0x0079 }
            if (r4 != 0) goto L_0x004a
            java.lang.Class<android.os.UserManager> r4 = android.os.UserManager.class
            java.lang.Object r4 = r8.getSystemService(r4)     // Catch:{ all -> 0x0079 }
            android.os.UserManager r4 = (android.os.UserManager) r4     // Catch:{ all -> 0x0079 }
            f57956b = r4     // Catch:{ all -> 0x0079 }
        L_0x004a:
            android.os.UserManager r4 = f57956b     // Catch:{ all -> 0x0079 }
            if (r4 != 0) goto L_0x0050
        L_0x004e:
            r3 = 1
            goto L_0x0073
        L_0x0050:
            boolean r6 = r4.isUserUnlocked()     // Catch:{ NullPointerException -> 0x0062 }
            if (r6 != 0) goto L_0x0060
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch:{ NullPointerException -> 0x0062 }
            boolean r8 = r4.isUserRunning(r6)     // Catch:{ NullPointerException -> 0x0062 }
            if (r8 != 0) goto L_0x006f
        L_0x0060:
            r3 = 1
            goto L_0x006f
        L_0x0062:
            r4 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            android.util.Log.w(r6, r7, r4)     // Catch:{ all -> 0x0079 }
            f57956b = r5     // Catch:{ all -> 0x0079 }
            int r2 = r2 + 1
            goto L_0x0038
        L_0x006f:
            if (r3 == 0) goto L_0x0073
            f57956b = r5     // Catch:{ all -> 0x0079 }
        L_0x0073:
            if (r3 == 0) goto L_0x0077
            f57957c = r1     // Catch:{ all -> 0x0079 }
        L_0x0077:
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            return r3
        L_0x0079:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            goto L_0x007d
        L_0x007c:
            throw r8
        L_0x007d:
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.directboot.C20674d.m38857f(android.content.Context):boolean");
    }
}
