package com.google.android.libraries.performance.primes.p2399d;

import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.performance.primes.d.a */
/* compiled from: PG */
public final class C31230a {

    /* renamed from: a */
    public static volatile boolean f84140a;

    /* renamed from: b */
    private static volatile ActivityManager f84141b;

    private C31230a() {
    }

    /* renamed from: a */
    public static ActivityManager m58229a(Context context) {
        if (f84141b == null) {
            synchronized (C31230a.class) {
                if (f84141b == null) {
                    Object systemService = context.getSystemService("activity");
                    systemService.getClass();
                    f84141b = (ActivityManager) systemService;
                }
            }
        }
        return f84141b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r2 != null) goto L_0x002b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037 A[SYNTHETIC, Splitter:B:16:0x0037] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m58230b(int r5) {
        /*
            java.lang.String r0 = "/proc/"
            r1 = 0
            if (r5 <= 0) goto L_0x0040
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003b, all -> 0x0034 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ IOException -> 0x003b, all -> 0x0034 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003b, all -> 0x0034 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x003b, all -> 0x0034 }
            r4.append(r5)     // Catch:{ IOException -> 0x003b, all -> 0x0034 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ IOException -> 0x003b, all -> 0x0034 }
            java.lang.String r5 = r4.toString()     // Catch:{ IOException -> 0x003b, all -> 0x0034 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x003b, all -> 0x0034 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x003b, all -> 0x0034 }
            java.lang.String r5 = r2.readLine()     // Catch:{ IOException -> 0x0032, all -> 0x002f }
            r5.getClass()
            java.lang.String r1 = r5.trim()     // Catch:{ IOException -> 0x0032, all -> 0x002f }
        L_0x002b:
            r2.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0040
        L_0x002f:
            r5 = move-exception
            r1 = r2
            goto L_0x0035
        L_0x0032:
            goto L_0x003d
        L_0x0034:
            r5 = move-exception
        L_0x0035:
            if (r1 == 0) goto L_0x003a
            r1.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            throw r5
        L_0x003b:
            r2 = r1
        L_0x003d:
            if (r2 == 0) goto L_0x0040
            goto L_0x002b
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.p2399d.C31230a.m58230b(int):java.lang.String");
    }

    /* renamed from: d */
    public static boolean m58232d(Context context) {
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        return ((PowerManager) systemService).isInteractive();
    }

    /* renamed from: c */
    public static boolean m58231c(Context context) {
        if (f84140a) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = m58229a(context).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == Process.myPid()) {
                        if (next.importance == 100) {
                            return true;
                        }
                    }
                }
            }
        } else {
            Object systemService = context.getSystemService("activity");
            systemService.getClass();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses2 = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses2 != null) {
                String packageName = context.getPackageName();
                String concat = String.valueOf(packageName).concat(":");
                for (ActivityManager.RunningAppProcessInfo next2 : runningAppProcesses2) {
                    if (next2.importance == 100 && (next2.processName.equals(packageName) || next2.processName.startsWith(concat))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
