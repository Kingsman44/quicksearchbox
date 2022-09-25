package com.google.android.libraries.p1635au;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.au.p */
/* compiled from: PG */
public final class C19579p implements Application.ActivityLifecycleCallbacks, C19575l {

    /* renamed from: h */
    private static final long f54499h = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a */
    public final ScheduledExecutorService f54500a;

    /* renamed from: b */
    public long f54501b;

    /* renamed from: c */
    public final long f54502c;

    /* renamed from: d */
    public final AtomicLong f54503d = new AtomicLong(0);

    /* renamed from: e */
    public ScheduledFuture f54504e;

    /* renamed from: f */
    protected final Object f54505f;

    /* renamed from: g */
    public C19566c f54506g;

    /* renamed from: i */
    private final C19576m f54507i;

    private C19579p(C19566c cVar, ScheduledExecutorService scheduledExecutorService, C19576m mVar) {
        this.f54506g = cVar;
        this.f54500a = scheduledExecutorService;
        this.f54507i = mVar;
        this.f54501b = 100;
        this.f54502c = f54499h;
        this.f54505f = new Object();
    }

    /* renamed from: c */
    public static C19579p m37339c(C19566c cVar, ScheduledExecutorService scheduledExecutorService, C19576m mVar, Application application) {
        C19579p pVar = new C19579p(cVar, scheduledExecutorService, mVar);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(pVar);
        }
        mVar.f54496c = pVar;
        return pVar;
    }

    /* renamed from: a */
    public final void mo24836a() {
        synchronized (this.f54505f) {
            ScheduledFuture scheduledFuture = this.f54504e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f54504e = null;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v8, types: [com.google.frameworks.client.b.l] */
    /* JADX WARNING: CFG modification limit reached, blocks count: 192 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24837b() {
        /*
            r19 = this;
            r1 = r19
            java.util.concurrent.atomic.AtomicLong r0 = r1.f54503d
            r2 = 0
            r0.set(r2)
            com.google.android.libraries.au.c r0 = r1.f54506g
            com.google.android.libraries.au.m r2 = r1.f54507i
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Object r4 = r2.f54495b
            monitor-enter(r4)
            java.util.Map r2 = r2.f54494a     // Catch:{ all -> 0x0269 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0269 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0269 }
        L_0x001f:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0269 }
            r6 = 0
            if (r5 == 0) goto L_0x005a
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0269 }
            com.google.android.libraries.au.k r5 = (com.google.android.libraries.p1635au.C19574k) r5     // Catch:{ all -> 0x0269 }
            com.google.android.libraries.au.h[] r8 = r5.f54487c     // Catch:{ all -> 0x0269 }
            int r8 = r8.length     // Catch:{ all -> 0x0269 }
            if (r8 <= 0) goto L_0x0034
            r7 = 10
            goto L_0x0035
        L_0x0034:
            r7 = 1
        L_0x0035:
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0269 }
            r8.<init>(r7)     // Catch:{ all -> 0x0269 }
            com.google.android.libraries.au.j r7 = new com.google.android.libraries.au.j     // Catch:{ all -> 0x0269 }
            java.lang.String r9 = r5.f54486b     // Catch:{ all -> 0x0269 }
            com.google.android.libraries.au.h[] r10 = r5.f54487c     // Catch:{ all -> 0x0269 }
            r7.<init>(r9, r10)     // Catch:{ all -> 0x0269 }
            java.lang.Object r9 = r5.f54485a     // Catch:{ all -> 0x0269 }
            monitor-enter(r9)     // Catch:{ all -> 0x0269 }
            java.util.HashMap r10 = r5.f54489e     // Catch:{ all -> 0x0057 }
            r7.f54483c = r10     // Catch:{ all -> 0x0057 }
            int r10 = r5.f54490f     // Catch:{ all -> 0x0057 }
            r7.f54484d = r10     // Catch:{ all -> 0x0057 }
            r5.f54489e = r8     // Catch:{ all -> 0x0057 }
            r5.f54490f = r6     // Catch:{ all -> 0x0057 }
            monitor-exit(r9)     // Catch:{ all -> 0x0057 }
            r3.add(r7)     // Catch:{ all -> 0x0269 }
            goto L_0x001f
        L_0x0057:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0057 }
            throw r0     // Catch:{ all -> 0x0269 }
        L_0x005a:
            monitor-exit(r4)     // Catch:{ all -> 0x0269 }
            com.google.n.a.b r2 = com.google.p4724n.p4725a.C62720b.f169392b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.n.a.a r2 = (com.google.p4724n.p4725a.C62719a) r2
            int r4 = r3.size()
            r5 = 0
        L_0x0068:
            r8 = 0
            if (r5 >= r4) goto L_0x0234
            java.lang.Object r9 = r3.get(r5)
            com.google.android.libraries.au.j r9 = (com.google.android.libraries.p1635au.C19573j) r9
            int r10 = r9.f54484d
            if (r10 != 0) goto L_0x007c
            r17 = r3
            r18 = r4
            r4 = 1
            goto L_0x020d
        L_0x007c:
            com.google.frameworks.client.b.l r8 = com.google.frameworks.client.p4630b.C61329l.f165858e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.frameworks.client.b.e r8 = (com.google.frameworks.client.p4630b.C61322e) r8
            java.lang.String r10 = r9.f54481a
            long r10 = com.google.android.libraries.p1635au.C19576m.m37334a(r10)
            r8.copyOnWrite()
            com.google.protobuf.bv r12 = r8.instance
            com.google.frameworks.client.b.l r12 = (com.google.frameworks.client.p4630b.C61329l) r12
            int r13 = r12.f165860a
            r14 = 2
            r13 = r13 | r14
            r12.f165860a = r13
            r12.f165861b = r10
            com.google.android.libraries.au.h[] r10 = r9.f54482b
            int r11 = r10.length
            r12 = 0
        L_0x009d:
            if (r12 >= r11) goto L_0x00c6
            r13 = r10[r12]
            java.lang.String r13 = r13.f54479a
            long r14 = com.google.android.libraries.p1635au.C19576m.m37334a(r13)
            r8.copyOnWrite()
            com.google.protobuf.bv r13 = r8.instance
            com.google.frameworks.client.b.l r13 = (com.google.frameworks.client.p4630b.C61329l) r13
            com.google.protobuf.ck r6 = r13.f165862c
            boolean r16 = r6.mo58948c()
            if (r16 != 0) goto L_0x00bc
            com.google.protobuf.ck r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62964ck) r6)
            r13.f165862c = r6
        L_0x00bc:
            com.google.protobuf.ck r6 = r13.f165862c
            r6.mo58929f(r14)
            int r12 = r12 + 1
            r6 = 0
            r14 = 2
            goto L_0x009d
        L_0x00c6:
            java.util.Map r6 = r9.f54483c
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x00d0:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x0201
            java.lang.Object r10 = r6.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            com.google.frameworks.client.b.k r11 = com.google.frameworks.client.p4630b.C61328k.f165853d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.frameworks.client.b.f r11 = (com.google.frameworks.client.p4630b.C61323f) r11
            java.lang.Object r12 = r10.getKey()
            com.google.android.libraries.au.a r12 = (com.google.android.libraries.p1635au.C19564a) r12
            java.lang.Object r10 = r10.getValue()
            com.google.android.libraries.au.b r10 = (com.google.android.libraries.p1635au.C19565b) r10
            com.google.android.libraries.au.h[] r13 = r9.f54482b
            int r13 = r13.length
            if (r13 <= 0) goto L_0x01bc
            java.lang.String r13 = r9.f54481a
            java.util.ArrayList r14 = new java.util.ArrayList
            java.lang.Object[] r15 = r12.f54471c
            int r15 = r15.length
            r14.<init>(r15)
            r15 = 0
        L_0x0100:
            java.lang.Object[] r7 = r12.f54471c
            int r7 = r7.length
            if (r15 >= r7) goto L_0x019d
            com.google.frameworks.client.b.h r7 = com.google.frameworks.client.p4630b.C61325h.f165845c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.frameworks.client.b.g r7 = (com.google.frameworks.client.p4630b.C61324g) r7
            java.lang.Object[] r1 = r12.f54471c
            r1 = r1[r15]
            r17 = r3
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x012b
            java.lang.String r1 = (java.lang.String) r1
            r7.copyOnWrite()
            com.google.protobuf.bv r3 = r7.instance
            com.google.frameworks.client.b.h r3 = (com.google.frameworks.client.p4630b.C61325h) r3
            r1.getClass()
            r18 = r4
            r4 = 1
            r3.f165847a = r4
            r3.f165848b = r1
            goto L_0x0163
        L_0x012b:
            r18 = r4
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x0148
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r3 = r7.instance
            com.google.frameworks.client.b.h r3 = (com.google.frameworks.client.p4630b.C61325h) r3
            r4 = 2
            r3.f165847a = r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.f165848b = r1
            goto L_0x0163
        L_0x0148:
            r4 = 2
            boolean r3 = r1 instanceof java.lang.Boolean
            if (r3 == 0) goto L_0x0175
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r3 = r7.instance
            com.google.frameworks.client.b.h r3 = (com.google.frameworks.client.p4630b.C61325h) r3
            r4 = 3
            r3.f165847a = r4
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.f165848b = r1
        L_0x0163:
            com.google.protobuf.bv r1 = r7.build()
            com.google.frameworks.client.b.h r1 = (com.google.frameworks.client.p4630b.C61325h) r1
            r14.add(r1)
            int r15 = r15 + 1
            r1 = r19
            r3 = r17
            r4 = r18
            goto L_0x0100
        L_0x0175:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Metric "
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r3 = " has field "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = " with an unexpected value: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x019d:
            r17 = r3
            r18 = r4
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.frameworks.client.b.k r1 = (com.google.frameworks.client.p4630b.C61328k) r1
            com.google.protobuf.cq r3 = r1.f165856b
            boolean r4 = r3.mo58948c()
            if (r4 != 0) goto L_0x01b6
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)
            r1.f165856b = r3
        L_0x01b6:
            com.google.protobuf.cq r1 = r1.f165856b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r14, (java.util.List) r1)
            goto L_0x01c0
        L_0x01bc:
            r17 = r3
            r18 = r4
        L_0x01c0:
            com.google.frameworks.client.b.j r1 = r10.mo24820a()
            r11.copyOnWrite()
            com.google.protobuf.bv r3 = r11.instance
            com.google.frameworks.client.b.k r3 = (com.google.frameworks.client.p4630b.C61328k) r3
            r1.getClass()
            r3.f165857c = r1
            int r1 = r3.f165855a
            r4 = 1
            r1 = r1 | r4
            r3.f165855a = r1
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.frameworks.client.b.l r1 = (com.google.frameworks.client.p4630b.C61329l) r1
            com.google.protobuf.bv r3 = r11.build()
            com.google.frameworks.client.b.k r3 = (com.google.frameworks.client.p4630b.C61328k) r3
            r3.getClass()
            com.google.protobuf.cq r7 = r1.f165863d
            boolean r10 = r7.mo58948c()
            if (r10 != 0) goto L_0x01f4
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)
            r1.f165863d = r7
        L_0x01f4:
            com.google.protobuf.cq r1 = r1.f165863d
            r1.add(r3)
            r1 = r19
            r3 = r17
            r4 = r18
            goto L_0x00d0
        L_0x0201:
            r17 = r3
            r18 = r4
            r4 = 1
            com.google.protobuf.bv r1 = r8.build()
            r8 = r1
            com.google.frameworks.client.b.l r8 = (com.google.frameworks.client.p4630b.C61329l) r8
        L_0x020d:
            if (r8 == 0) goto L_0x0229
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.n.a.b r1 = (com.google.p4724n.p4725a.C62720b) r1
            com.google.protobuf.cq r3 = r1.f169394a
            boolean r6 = r3.mo58948c()
            if (r6 != 0) goto L_0x0224
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)
            r1.f169394a = r3
        L_0x0224:
            com.google.protobuf.cq r1 = r1.f169394a
            r1.add(r8)
        L_0x0229:
            int r5 = r5 + 1
            r1 = r19
            r3 = r17
            r4 = r18
            r6 = 0
            goto L_0x0068
        L_0x0234:
            com.google.protobuf.bv r1 = r2.build()
            com.google.n.a.b r1 = (com.google.p4724n.p4725a.C62720b) r1
            com.google.protobuf.cq r2 = r1.f169394a
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0243
            goto L_0x0263
        L_0x0243:
            com.google.android.gms.clearcut.k r2 = r0.f54473a
            com.google.android.gms.clearcut.j r8 = r2.mo118999d(r1)
            java.lang.String r1 = r0.f54474b
            r8.f389471m = r1
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f54475c
            java.util.Iterator r0 = r0.iterator()
        L_0x0253:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0263
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r8.mo118994c(r1)
            goto L_0x0253
        L_0x0263:
            if (r8 == 0) goto L_0x0268
            r8.mo118992a()
        L_0x0268:
            return
        L_0x0269:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0269 }
            goto L_0x026d
        L_0x026c:
            throw r0
        L_0x026d:
            goto L_0x026c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p1635au.C19579p.mo24837b():void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        synchronized (this.f54505f) {
            mo24837b();
            mo24836a();
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
