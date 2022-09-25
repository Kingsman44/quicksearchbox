package com.google.android.apps.gsa.search.shared.multiuser;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.C91037g;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.shared.multiuser.u */
/* compiled from: PG */
public final class C87618u {

    /* renamed from: f */
    private static final C59071e f236685f = C59071e.m91332i("com.google.android.apps.gsa.search.shared.multiuser.u");

    /* renamed from: a */
    public final Object f236686a = new Object();

    /* renamed from: b */
    public final Set f236687b = new HashSet();

    /* renamed from: c */
    public final Context f236688c;

    /* renamed from: d */
    public C91037g f236689d;

    /* renamed from: e */
    protected int f236690e = 0;

    /* renamed from: g */
    private final C90931ca f236691g;

    /* renamed from: h */
    private C87613p f236692h;

    /* renamed from: i */
    private C60870cx f236693i;

    /* renamed from: j */
    private int f236694j = 1;

    public C87618u(Context context, C90931ca caVar) {
        this.f236688c = context;
        this.f236691g = caVar;
    }

    /* renamed from: a */
    public final C87613p mo81753a() {
        C87613p pVar;
        synchronized (this.f236686a) {
            pVar = this.f236692h;
        }
        return pVar;
    }

    /* renamed from: b */
    public final void mo81754b() {
        C60870cx cxVar = this.f236693i;
        if (cxVar != null && !cxVar.isDone()) {
            this.f236693i.cancel(true);
        }
        this.f236693i = null;
        this.f236690e = 0;
    }

    /* renamed from: c */
    public final void mo81755c() {
        synchronized (this.f236686a) {
            this.f236689d = null;
            this.f236692h = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0109 A[Catch:{ Exception -> 0x00f4 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo81756d() {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f236686a
            monitor-enter(r0)
            com.google.android.apps.gsa.shared.util.g r1 = r14.f236689d     // Catch:{ all -> 0x012c }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0125
            com.google.android.apps.gsa.search.shared.multiuser.t r1 = new com.google.android.apps.gsa.search.shared.multiuser.t     // Catch:{ all -> 0x012c }
            r1.<init>(r14)     // Catch:{ all -> 0x012c }
            android.content.Context r4 = r14.f236688c     // Catch:{ all -> 0x012c }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x012c }
            r5.<init>()     // Catch:{ all -> 0x012c }
            java.lang.Object r6 = r14.f236686a     // Catch:{ all -> 0x012c }
            monitor-enter(r6)     // Catch:{ all -> 0x012c }
            int r7 = r14.f236694j     // Catch:{ all -> 0x0122 }
            r8 = 4
            r9 = 0
            if (r7 == r8) goto L_0x0103
            r10 = 5
            if (r7 != r10) goto L_0x0023
            goto L_0x0103
        L_0x0023:
            if (r7 != r3) goto L_0x006b
            com.google.android.apps.gsa.shared.util.UserHandleCompat r7 = com.google.android.apps.gsa.shared.util.UserHandleCompat.m148154a()     // Catch:{ all -> 0x0122 }
            boolean r7 = com.google.android.apps.gsa.shared.util.C90771bo.m148273b(r4, r7)     // Catch:{ all -> 0x0122 }
            if (r7 == 0) goto L_0x0049
            com.google.common.f.e r1 = f236685f     // Catch:{ all -> 0x0122 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x0122 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0122 }
            r4 = 9660(0x25bc, float:1.3537E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r4)     // Catch:{ all -> 0x0122 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0122 }
            java.lang.String r4 = "#initialize: Trying to bind in work process."
            r1.mo56386p(r4)     // Catch:{ all -> 0x0122 }
            r14.f236694j = r10     // Catch:{ all -> 0x0122 }
            monitor-exit(r6)     // Catch:{ all -> 0x0122 }
            goto L_0x0104
        L_0x0049:
            com.google.android.apps.gsa.shared.util.UserHandleCompat r7 = com.google.android.apps.gsa.shared.util.UserHandleCompat.m148154a()     // Catch:{ all -> 0x0122 }
            boolean r7 = r7.mo85068b()     // Catch:{ all -> 0x0122 }
            if (r7 != 0) goto L_0x0058
            r14.f236694j = r8     // Catch:{ all -> 0x0122 }
            monitor-exit(r6)     // Catch:{ all -> 0x0122 }
            goto L_0x0104
        L_0x0058:
            java.lang.String r7 = "activity"
            java.lang.Object r7 = r4.getSystemService(r7)     // Catch:{ all -> 0x0122 }
            android.app.ActivityManager r7 = (android.app.ActivityManager) r7     // Catch:{ all -> 0x0122 }
            boolean r7 = r7.isLowRamDevice()     // Catch:{ all -> 0x0122 }
            if (r7 == 0) goto L_0x006b
            r14.f236694j = r8     // Catch:{ all -> 0x0122 }
            monitor-exit(r6)     // Catch:{ all -> 0x0122 }
            goto L_0x0104
        L_0x006b:
            java.util.List r7 = com.google.android.apps.gsa.shared.util.C90771bo.m148272a(r4)     // Catch:{ all -> 0x0122 }
            r5.addAll(r7)     // Catch:{ all -> 0x0122 }
            boolean r7 = r5.isEmpty()     // Catch:{ all -> 0x0122 }
            r10 = 3
            if (r7 == 0) goto L_0x007e
            r14.f236694j = r10     // Catch:{ all -> 0x0122 }
            monitor-exit(r6)     // Catch:{ all -> 0x0122 }
            goto L_0x0104
        L_0x007e:
            r7 = 2
            r14.f236694j = r7     // Catch:{ all -> 0x0122 }
            monitor-exit(r6)     // Catch:{ all -> 0x0122 }
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x012c }
            r6 = r6 ^ r3
            com.google.common.base.C58838bb.m90883r(r6)     // Catch:{ all -> 0x012c }
            int r6 = r5.size()     // Catch:{ all -> 0x012c }
            if (r6 <= r3) goto L_0x009d
            com.google.common.f.e r6 = f236685f     // Catch:{ all -> 0x012c }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x012c }
            java.lang.String r11 = "Can't support multiple work profiles, picking first."
            r12 = 9666(0x25c2, float:1.3545E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r12)).mo56386p(r11)     // Catch:{ all -> 0x012c }
        L_0x009d:
            java.lang.Object r5 = r5.get(r2)     // Catch:{ all -> 0x012c }
            com.google.android.apps.gsa.shared.util.UserHandleCompat r5 = (com.google.android.apps.gsa.shared.util.UserHandleCompat) r5     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "launcherapps"
            java.lang.Object r6 = r4.getSystemService(r6)     // Catch:{ all -> 0x012c }
            android.content.pm.LauncherApps r6 = (android.content.pm.LauncherApps) r6     // Catch:{ all -> 0x012c }
            java.lang.String r11 = "com.google.android.googlequicksearchbox"
            android.os.UserHandle r12 = r5.f253767a     // Catch:{ all -> 0x012c }
            boolean r6 = r6.isPackageEnabled(r11, r12)     // Catch:{ all -> 0x012c }
            if (r6 != 0) goto L_0x00b6
            goto L_0x0104
        L_0x00b6:
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x012c }
            r6.<init>()     // Catch:{ all -> 0x012c }
            android.content.Context r11 = r4.getApplicationContext()     // Catch:{ all -> 0x012c }
            java.lang.String r12 = "com.google.android.apps.gsa.search.shared.multiuser.WorkDataService"
            r6.setClassName(r11, r12)     // Catch:{ all -> 0x012c }
            java.lang.Class r11 = r4.getClass()     // Catch:{ Exception -> 0x00f4 }
            java.lang.Class[] r12 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x00f4 }
            java.lang.Class<android.content.Intent> r13 = android.content.Intent.class
            r12[r2] = r13     // Catch:{ Exception -> 0x00f4 }
            java.lang.Class<android.content.ServiceConnection> r13 = android.content.ServiceConnection.class
            r12[r3] = r13     // Catch:{ Exception -> 0x00f4 }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00f4 }
            r12[r7] = r13     // Catch:{ Exception -> 0x00f4 }
            java.lang.Class<android.os.UserHandle> r13 = android.os.UserHandle.class
            r12[r10] = r13     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r13 = "bindServiceAsUser"
            java.lang.reflect.Method r11 = r11.getMethod(r13, r12)     // Catch:{ Exception -> 0x00f4 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x00f4 }
            r8[r2] = r6     // Catch:{ Exception -> 0x00f4 }
            r8[r3] = r1     // Catch:{ Exception -> 0x00f4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00f4 }
            r8[r7] = r6     // Catch:{ Exception -> 0x00f4 }
            android.os.UserHandle r5 = r5.f253767a     // Catch:{ Exception -> 0x00f4 }
            r8[r10] = r5     // Catch:{ Exception -> 0x00f4 }
            r11.invoke(r4, r8)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x0105
        L_0x00f4:
            r1 = move-exception
            com.google.common.f.e r4 = f236685f     // Catch:{ all -> 0x012c }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "Can't bind service."
            r6 = 9662(0x25be, float:1.354E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r1)).mo56372aa(r6)).mo56386p(r5)     // Catch:{ all -> 0x012c }
            goto L_0x0104
        L_0x0103:
            monitor-exit(r6)     // Catch:{ all -> 0x0122 }
        L_0x0104:
            r1 = r9
        L_0x0105:
            r14.f236689d = r1     // Catch:{ all -> 0x012c }
            if (r1 == 0) goto L_0x0125
            com.google.android.apps.gsa.search.shared.multiuser.p r4 = new com.google.android.apps.gsa.search.shared.multiuser.p     // Catch:{ all -> 0x012c }
            com.google.common.util.concurrent.SettableFuture r1 = r1.f254285b     // Catch:{ all -> 0x012c }
            com.google.android.apps.gsa.shared.util.c.ca r5 = r14.f236691g     // Catch:{ all -> 0x012c }
            r4.<init>(r1, r5)     // Catch:{ all -> 0x012c }
            r14.f236692h = r4     // Catch:{ all -> 0x012c }
            com.google.android.apps.gsa.search.shared.multiuser.q r1 = new com.google.android.apps.gsa.search.shared.multiuser.q     // Catch:{ all -> 0x012c }
            r1.<init>(r14)     // Catch:{ all -> 0x012c }
            r6 = 6000(0x1770, double:2.9644E-320)
            com.google.common.util.concurrent.cx r1 = r5.mo85137b(r1, r6)     // Catch:{ all -> 0x012c }
            r14.f236693i = r1     // Catch:{ all -> 0x012c }
            goto L_0x0125
        L_0x0122:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0122 }
            throw r1     // Catch:{ all -> 0x012c }
        L_0x0125:
            com.google.android.apps.gsa.shared.util.g r1 = r14.f236689d     // Catch:{ all -> 0x012c }
            if (r1 == 0) goto L_0x012a
            r2 = 1
        L_0x012a:
            monitor-exit(r0)     // Catch:{ all -> 0x012c }
            return r2
        L_0x012c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x012c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.multiuser.C87618u.mo81756d():boolean");
    }
}
