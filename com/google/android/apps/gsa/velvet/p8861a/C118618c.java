package com.google.android.apps.gsa.velvet.p8861a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.apps.gsa.shared.logger.C89838ab;
import com.google.android.libraries.gsa.p1864f.p1867b.C22814a;
import com.google.android.libraries.performance.primes.p2399d.C31230a;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59752ei;
import com.google.common.p4552o.C59753ej;
import java.lang.Thread;

/* renamed from: com.google.android.apps.gsa.velvet.a.c */
/* compiled from: PG */
public final class C118618c implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    static Thread.UncaughtExceptionHandler f330916a = null;

    /* renamed from: b */
    private static final C59071e f330917b = C59071e.m91332i("com.google.android.apps.gsa.velvet.a.c");

    /* renamed from: c */
    private final Context f330918c;

    /* renamed from: d */
    private final C118617b f330919d;

    /* renamed from: e */
    private final C58881cr f330920e;

    /* renamed from: f */
    private final C118616a f330921f;

    public C118618c(Context context, C58881cr crVar, C118617b bVar, C118616a aVar) {
        this.f330918c = context;
        this.f330919d = bVar;
        this.f330920e = crVar;
        this.f330921f = aVar;
    }

    /* renamed from: a */
    public static void m196918a(Context context, C58881cr crVar, C118617b bVar, C118616a aVar) {
        if (f330916a == null) {
            f330916a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new C118618c(context, crVar, bVar, aVar));
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: b */
    private final void m196919b() {
        SharedPreferences sharedPreferences = this.f330918c.getSharedPreferences("consecutive_crash_stats", 4);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("gsa_crashed_last_time", true);
        edit.putInt("consecutive_crash_count", sharedPreferences.getInt("consecutive_crash_count", 0) + 1);
        edit.commit();
    }

    /* renamed from: c */
    private final void m196920c(String str, String str2, Throwable th) {
        SharedPreferences sharedPreferences = this.f330918c.getSharedPreferences(str, 4);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(str2, sharedPreferences.getInt(str2, 0) + 1);
        edit.putString("last_seen_stack_trace", Base64.encodeToString(C22814a.m42630b((C59752ei) C59753ej.f161449e.createBuilder(), th, Integer.MAX_VALUE, Integer.MAX_VALUE).toByteArray(), 3));
        int i = C89838ab.f243165a;
        if (i != -1) {
            edit.putInt("last_seen_activity", i);
            edit.putLong("last_seen_activity_time_ms", SystemClock.elapsedRealtime() - C89838ab.f243166b);
        }
        if (C31230a.m58231c(this.f330919d.f330915a)) {
            String concat = str2.concat("_error_dialog_expected");
            edit.putInt(concat, sharedPreferences.getInt(concat, 0) + 1);
        }
        edit.commit();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:53|54|55|(2:57|67)(1:69)) */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r0 = com.google.common.p4526f.p4527a.C58975e.f156826a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        r0 = f330916a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011c, code lost:
        if (r0 != null) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011e, code lost:
        r0.uncaughtException(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0122, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0123, code lost:
        r1 = f330916a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0125, code lost:
        if (r1 != null) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0128, code lost:
        r1.uncaughtException(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0118 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            java.lang.String r0 = "VelvetExceptionHandler"
            com.google.android.apps.gsa.shared.s.a.a r1 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            com.google.android.apps.gsa.velvet.a.a r1 = r4.f330921f     // Catch:{ all -> 0x0041 }
            if (r1 != 0) goto L_0x0009
            goto L_0x0055
        L_0x0009:
            java.lang.Thread r2 = r1.f330914b     // Catch:{ all -> 0x0041 }
            if (r5 == r2) goto L_0x0055
            com.google.android.apps.gsa.shared.util.q.c r2 = com.google.android.apps.gsa.shared.util.p7180q.C91084c.DEFAULT     // Catch:{ all -> 0x0041 }
            com.google.common.base.cr r1 = r1.f330913a     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r1.mo6453a()     // Catch:{ all -> 0x0041 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x0055
            com.google.common.f.e r1 = f330917b     // Catch:{ all -> 0x0041 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0041 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0041 }
            r1.mo56378ag(r2, r0)     // Catch:{ all -> 0x0041 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0041 }
            com.google.common.f.x r1 = r1.mo56382g(r6)     // Catch:{ all -> 0x0041 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0041 }
            r2 = 34067(0x8513, float:4.7738E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0041 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "Suppressed exception on thread %s"
            java.lang.String r3 = r5.getName()     // Catch:{ all -> 0x0041 }
            r1.mo56389s(r2, r3)     // Catch:{ all -> 0x0041 }
            return
        L_0x0041:
            r1 = move-exception
            com.google.common.f.e r2 = f330917b
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r0)
            java.lang.String r0 = "UncaughtExceptionHandler failed. Processing original exception"
            r3 = 34068(0x8514, float:4.774E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r3)).mo56386p(r0)
        L_0x0055:
            com.google.android.apps.gsa.shared.util.q.c r0 = com.google.android.apps.gsa.shared.util.p7180q.C91084c.CRASH_REPORT     // Catch:{ all -> 0x0118 }
            com.google.common.base.cr r1 = r4.f330920e     // Catch:{ all -> 0x0118 }
            java.lang.Object r1 = r1.mo6453a()     // Catch:{ all -> 0x0118 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x0064
            goto L_0x007a
        L_0x0064:
            boolean r0 = r6 instanceof java.lang.OutOfMemoryError     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x007a
            android.content.Context r0 = r4.f330918c     // Catch:{ all -> 0x0118 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0118 }
            r1.<init>()     // Catch:{ all -> 0x0118 }
            android.content.Context r2 = r4.f330918c     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = "com.google.android.apps.gsa.silentfeedback.CrashloopReceiver"
            android.content.Intent r1 = r1.setClassName(r2, r3)     // Catch:{ all -> 0x0118 }
            r0.sendBroadcast(r1)     // Catch:{ all -> 0x0118 }
        L_0x007a:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0118 }
            r0 = r6
        L_0x007d:
            java.lang.String r1 = "uncaught_exception_handler_stats"
            if (r0 == 0) goto L_0x009d
            boolean r2 = r0 instanceof android.content.pm.PackageManager.NameNotFoundException     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x0098
            java.lang.String r2 = com.google.common.base.C58887cx.m90975b(r0)     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = "android.webkit.WebViewFactory.getFactoryClass"
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x0098
            java.lang.String r0 = "known_crash_count"
            r4.m196920c(r1, r0, r6)     // Catch:{ all -> 0x0118 }
            goto L_0x0110
        L_0x0098:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x0118 }
            goto L_0x007d
        L_0x009d:
            boolean r0 = r6 instanceof com.google.android.apps.gsa.shared.p7127q.C90458e     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = "event_bus_deadlock_count"
            r4.m196920c(r1, r0, r6)     // Catch:{ all -> 0x0118 }
            r4.m196919b()     // Catch:{ all -> 0x0118 }
            goto L_0x0110
        L_0x00aa:
            com.google.android.apps.gsa.shared.util.q.c r0 = com.google.android.apps.gsa.shared.util.p7180q.C91084c.SEARCH     // Catch:{ all -> 0x0118 }
            com.google.common.base.cr r2 = r4.f330920e     // Catch:{ all -> 0x0118 }
            java.lang.Object r2 = r2.mo6453a()     // Catch:{ all -> 0x0118 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x00cb
            if (r6 == 0) goto L_0x00cb
            java.lang.Throwable r0 = com.google.common.base.C58887cx.m90977d(r6)     // Catch:{ all -> 0x0118 }
            boolean r0 = r0 instanceof java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = "search_process_unsatisfied_link_error_crash_count"
            r4.m196920c(r1, r0, r6)     // Catch:{ all -> 0x0118 }
            r4.m196919b()     // Catch:{ all -> 0x0118 }
            goto L_0x0110
        L_0x00cb:
            com.google.android.apps.gsa.shared.util.q.c r0 = com.google.android.apps.gsa.shared.util.p7180q.C91084c.SEARCH     // Catch:{ all -> 0x0118 }
            com.google.common.base.cr r2 = r4.f330920e     // Catch:{ all -> 0x0118 }
            java.lang.Object r2 = r2.mo6453a()     // Catch:{ all -> 0x0118 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = "search_process_crash_count"
            r4.m196920c(r1, r0, r6)     // Catch:{ all -> 0x0118 }
            r4.m196919b()     // Catch:{ all -> 0x0118 }
            goto L_0x0110
        L_0x00e2:
            com.google.android.apps.gsa.shared.util.q.c r0 = com.google.android.apps.gsa.shared.util.p7180q.C91084c.DEFAULT     // Catch:{ all -> 0x0118 }
            com.google.common.base.cr r1 = r4.f330920e     // Catch:{ all -> 0x0118 }
            java.lang.Object r1 = r1.mo6453a()     // Catch:{ all -> 0x0118 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x00f8
            java.lang.String r0 = "default_process_uncaught_exception_handler_stats"
            java.lang.String r1 = "default_process_crash_count"
            r4.m196920c(r0, r1, r6)     // Catch:{ all -> 0x0118 }
            goto L_0x0110
        L_0x00f8:
            com.google.android.apps.gsa.shared.util.q.c r0 = com.google.android.apps.gsa.shared.util.p7180q.C91084c.INTERACTOR     // Catch:{ all -> 0x0118 }
            com.google.common.base.cr r1 = r4.f330920e     // Catch:{ all -> 0x0118 }
            java.lang.Object r1 = r1.mo6453a()     // Catch:{ all -> 0x0118 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = "interactor_process_uncaught_exception_handler_stats"
            java.lang.String r1 = "interactor_process_crash_count"
            r4.m196920c(r0, r1, r6)     // Catch:{ all -> 0x0118 }
            r4.m196919b()     // Catch:{ all -> 0x0118 }
        L_0x0110:
            java.lang.Thread$UncaughtExceptionHandler r0 = f330916a
            if (r0 == 0) goto L_0x0121
            r0.uncaughtException(r5, r6)
            return
        L_0x0118:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0122 }
            java.lang.Thread$UncaughtExceptionHandler r0 = f330916a
            if (r0 == 0) goto L_0x0121
            r0.uncaughtException(r5, r6)
        L_0x0121:
            return
        L_0x0122:
            r0 = move-exception
            java.lang.Thread$UncaughtExceptionHandler r1 = f330916a
            if (r1 != 0) goto L_0x0128
            goto L_0x012b
        L_0x0128:
            r1.uncaughtException(r5, r6)
        L_0x012b:
            goto L_0x012d
        L_0x012c:
            throw r0
        L_0x012d:
            goto L_0x012c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.velvet.p8861a.C118618c.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
