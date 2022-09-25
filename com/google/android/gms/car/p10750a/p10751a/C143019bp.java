package com.google.android.gms.car.p10750a.p10751a;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.car.C143121be;
import com.google.android.gms.car.C143196dm;
import com.google.android.gms.car.C143198do;
import com.google.android.gms.car.p10750a.C142974a;
import com.google.android.gms.car.p10750a.C143082b;
import com.google.android.gms.car.p10750a.C143087g;
import com.google.android.gms.car.p10750a.p10751a.p10752a.C142976a;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.p4624a.p4625a.C61301b;

/* renamed from: com.google.android.gms.car.a.a.bp */
/* compiled from: PG */
public final class C143019bp extends C143121be {

    /* renamed from: b */
    public final Context f388072b;

    /* renamed from: c */
    public final C143196dm f388073c;

    /* renamed from: d */
    public final C143198do f388074d;

    /* renamed from: e */
    public final C143082b f388075e;

    /* renamed from: f */
    public final Looper f388076f;

    /* renamed from: g */
    public final Object f388077g = new Object();

    /* renamed from: h */
    private final C60870cx f388078h;

    /* renamed from: i */
    private volatile C60870cx f388079i;

    /* renamed from: j */
    private volatile int f388080j;

    /* renamed from: k */
    private volatile boolean f388081k;

    /* renamed from: l */
    private volatile boolean f388082l;

    public C143019bp(Context context, C143196dm dmVar, C143198do doVar, C143082b bVar, Looper looper, int i) {
        super(4);
        C60870cx h = C60856cj.m92899h(new C143087g("Token not connected."));
        this.f388078h = h;
        this.f388079i = h;
        this.f388080j = 0;
        this.f388081k = false;
        this.f388082l = false;
        this.f388072b = context;
        this.f388073c = dmVar;
        this.f388074d = doVar;
        this.f388075e = bVar;
        this.f388076f = looper;
    }

    /* renamed from: a */
    public final C142974a mo117963a() {
        C143000ax axVar;
        synchronized (this.f388077g) {
            C58838bb.m90883r(mo117964b());
            axVar = (C143000ax) C60856cj.m92910s(this.f388079i);
        }
        return axVar;
    }

    /* renamed from: b */
    public final boolean mo117964b() {
        boolean a;
        synchronized (this.f388077g) {
            a = C142976a.m231924a(this.f388079i);
        }
        return a;
    }

    /* renamed from: c */
    public final void mo117965c() {
        mo117968f();
    }

    /* renamed from: d */
    public final void mo117966d() {
        synchronized (this.f388077g) {
            if (this.f388081k) {
                if (C143316a.m232515e("CAR.TOKEN", 4)) {
                    C143316a.m232513c("CAR.TOKEN", (Throwable) null, "Will disconnect after connection callbacks finish running.");
                }
                this.f388082l = true;
                return;
            }
            int i = this.f388080j;
            if (C143316a.m232515e("CAR.TOKEN", 4)) {
                C143316a.m232514d(4, "CAR.TOKEN", (Throwable) null, "Disconnecting %s (cx attempt: %s).", C61301b.m93812a(this), C61301b.m93812a(Integer.valueOf(i)));
            }
            C60856cj.m92911t(this.f388079i, new C143018bo(this, i), C60826bg.f164896a);
            if (!this.f388079i.isDone()) {
                C143316a.m232514d(5, "CAR.TOKEN", (Throwable) null, "Client connection future not done, canceling.", new Object[0]);
                this.f388079i.cancel(false);
            }
            this.f388079i = this.f388078h;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r4.f388073c.mo20041a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        r1 = r4.f388077g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.f388081k = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        if (r4.f388082l == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001e, code lost:
        r4.f388082l = false;
        mo117966d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0024, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0028, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002b, code lost:
        monitor-enter(r4.f388077g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r4.f388081k = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0030, code lost:
        if (r4.f388082l != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0032, code lost:
        r4.f388082l = false;
        mo117966d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0038, code lost:
        throw r1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117967e() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f388077g
            monitor-enter(r0)
            boolean r1 = r4.mo117964b()     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x000b:
            r1 = 1
            r4.f388081k = r1     // Catch:{ all -> 0x003c }
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            r0 = 0
            com.google.android.gms.car.dm r1 = r4.f388073c     // Catch:{ all -> 0x0028 }
            r1.mo20041a()     // Catch:{ all -> 0x0028 }
            java.lang.Object r1 = r4.f388077g
            monitor-enter(r1)
            r4.f388081k = r0     // Catch:{ all -> 0x0025 }
            boolean r2 = r4.f388082l     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0023
            r4.f388082l = r0     // Catch:{ all -> 0x0025 }
            r4.mo117966d()     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            throw r0
        L_0x0028:
            r1 = move-exception
            java.lang.Object r2 = r4.f388077g
            monitor-enter(r2)
            r4.f388081k = r0     // Catch:{ all -> 0x0039 }
            boolean r3 = r4.f388082l     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x0037
            r4.f388082l = r0     // Catch:{ all -> 0x0039 }
            r4.mo117966d()     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0039 }
            throw r1
        L_0x0039:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0039 }
            throw r0
        L_0x003c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.p10750a.p10751a.C143019bp.mo117967e():void");
    }

    /* renamed from: f */
    public final void mo117968f() {
        synchronized (this.f388077g) {
            C60870cx cxVar = this.f388079i;
            if (cxVar.isDone() && !C142976a.m231924a(cxVar)) {
                C143011bh bhVar = new C143011bh(this.f388072b, new C143014bk(this), new C143015bl(this));
                Looper.getMainLooper();
                C143000ax axVar = new C143000ax(bhVar, this.f388076f);
                int i = this.f388080j + 1;
                this.f388080j = i;
                if (C143316a.m232515e("CAR.TOKEN", 4)) {
                    C143316a.m232514d(4, "CAR.TOKEN", (Throwable) null, "Connecting %s using %s (cx attempt %s)", C61301b.m93812a(this), C61301b.m93812a(axVar), C61301b.m93812a(Integer.valueOf(i)));
                }
                this.f388079i = C60922j.m93044g(C60838bs.m92859i(axVar.f388040h), new C143012bi(axVar), C60826bg.f164896a);
                C60856cj.m92911t(C60838bs.m92859i(this.f388079i), new C143017bn(this, axVar, i), C60826bg.f164896a);
            } else if (this.f388082l) {
                new C144861c(this.f388076f).post(new C143013bj(this));
            }
            this.f388082l = false;
        }
    }
}
