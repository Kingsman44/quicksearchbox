package com.google.apps.tiktok.tracing;

import android.util.SparseArray;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.apps.tiktok.tracing.ga */
/* compiled from: PG */
final class C47847ga implements Runnable {

    /* renamed from: a */
    public final C47786dv f123891a;

    /* renamed from: b */
    public final UUID f123892b;

    /* renamed from: c */
    public final boolean f123893c;

    /* renamed from: d */
    public final C47814ew f123894d;

    /* renamed from: e */
    public final AtomicReference f123895e;

    /* renamed from: f */
    public C60870cx f123896f;

    /* renamed from: g */
    int f123897g = 0;

    /* renamed from: h */
    private final C21370a f123898h;

    /* renamed from: i */
    private final int f123899i;

    /* renamed from: j */
    private final boolean f123900j;

    public C47847ga(C47786dv dvVar, UUID uuid, C47814ew ewVar, C47843fx fxVar, long j, boolean z, boolean z2, C21370a aVar) {
        this.f123891a = dvVar;
        this.f123892b = uuid;
        this.f123894d = ewVar;
        this.f123899i = (int) j;
        this.f123893c = z;
        this.f123900j = z2;
        this.f123898h = aVar;
        this.f123895e = new AtomicReference(fxVar);
    }

    /* renamed from: a */
    public final int mo51670a() {
        C21370a aVar = this.f123898h;
        return ((int) (this.f123900j ? aVar.mo26874f() : aVar.mo26871c())) - this.f123899i;
    }

    /* renamed from: b */
    public final C47845fz mo51671b() {
        int i;
        C47843fx fxVar = (C47843fx) this.f123895e.get();
        int i2 = 1;
        int i3 = fxVar.f123879d + 1;
        C47843fx[] fxVarArr = new C47843fx[i3];
        while (fxVar != null) {
            fxVarArr[fxVar.f123879d] = fxVar;
            fxVar = fxVar.f123880e;
        }
        C47811et etVar = (C47811et) this.f123894d.toBuilder();
        SparseArray sparseArray = new SparseArray(i3);
        C47843fx fxVar2 = null;
        for (int i4 = 0; i4 < i3; i4++) {
            C47843fx fxVar3 = fxVarArr[i4];
            C47559bj i5 = C47563bn.m84655i(C47569bt.f123458c, fxVar3.f123878c);
            if (i5.mo51420b() && ((C47518ad) i5.mo51419a()).mo51021a() && fxVar3.f123879d != 0) {
                fxVar2 = fxVar3;
            }
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < i3) {
            C47843fx fxVar4 = fxVarArr[i6];
            boolean z = this.f123893c;
            int a = fxVar4.mo51668a();
            if (!(fxVar2 == null || (i = fxVar2.f123879d) == 0)) {
                a = fxVar4.f123879d == 0 ? i : fxVar2.equals(fxVar4) ? -1 : fxVar4.mo51668a();
            }
            C47554be beVar = (C47554be) C47556bg.f123404j.createBuilder();
            String str = fxVar4.f123876a;
            beVar.copyOnWrite();
            C47556bg bgVar = (C47556bg) beVar.instance;
            str.getClass();
            bgVar.f123406a |= i2;
            bgVar.f123407b = str;
            int i8 = fxVar4.f123879d;
            beVar.copyOnWrite();
            C47556bg bgVar2 = (C47556bg) beVar.instance;
            bgVar2.f123406a |= 2;
            bgVar2.f123408c = i8;
            beVar.copyOnWrite();
            C47556bg bgVar3 = (C47556bg) beVar.instance;
            bgVar3.f123406a |= 4;
            bgVar3.f123409d = a;
            int i9 = fxVar4.f123877b;
            beVar.copyOnWrite();
            C47556bg bgVar4 = (C47556bg) beVar.instance;
            bgVar4.f123406a |= 8;
            C47843fx[] fxVarArr2 = fxVarArr;
            bgVar4.f123410e = (long) i9;
            int i10 = fxVar4.f123882g;
            beVar.copyOnWrite();
            C47556bg bgVar5 = (C47556bg) beVar.instance;
            int i11 = i10 - 1;
            if (i10 != 0) {
                bgVar5.f123414i = i11;
                bgVar5.f123406a |= 128;
                int i12 = fxVar4.f123881f;
                if (i12 != 0) {
                    beVar.copyOnWrite();
                    C47556bg bgVar6 = (C47556bg) beVar.instance;
                    bgVar6.f123406a |= 16;
                    bgVar6.f123411f = (long) (1073741823 & i12);
                    boolean z2 = (i12 & 1073741824) != 0;
                    beVar.copyOnWrite();
                    C47556bg bgVar7 = (C47556bg) beVar.instance;
                    bgVar7.f123406a |= 64;
                    bgVar7.f123413h = z2;
                }
                if (z) {
                    int i13 = fxVar4.get();
                    beVar.copyOnWrite();
                    C47556bg bgVar8 = (C47556bg) beVar.instance;
                    bgVar8.f123406a |= 32;
                    bgVar8.f123412g = i13;
                }
                C47556bg bgVar9 = (C47556bg) beVar.build();
                etVar.copyOnWrite();
                C47814ew ewVar = (C47814ew) etVar.instance;
                bgVar9.getClass();
                C62971cq cqVar = ewVar.f123835d;
                if (!cqVar.mo58948c()) {
                    ewVar.f123835d = C62942bv.mutableCopy(cqVar);
                }
                ewVar.f123835d.add(bgVar9);
                sparseArray.append(fxVar4.f123879d, fxVar4.f123878c);
                if (!fxVar4.mo51669b()) {
                    i7++;
                }
                i6++;
                fxVarArr = fxVarArr2;
                i2 = 1;
            } else {
                throw null;
            }
        }
        C47843fx[] fxVarArr3 = fxVarArr;
        if (this.f123897g != 0) {
            C47855o oVar = (C47855o) C47860t.f123928d.createBuilder();
            C47858r rVar = (C47858r) C47859s.f123924c.createBuilder();
            int i14 = this.f123897g;
            rVar.copyOnWrite();
            C47859s sVar = (C47859s) rVar.instance;
            sVar.f123926a |= 1;
            sVar.f123927b = i14;
            C47859s sVar2 = (C47859s) rVar.build();
            oVar.copyOnWrite();
            C47860t tVar = (C47860t) oVar.instance;
            sVar2.getClass();
            tVar.f123931b = sVar2;
            tVar.f123930a |= 1;
            C47860t tVar2 = (C47860t) oVar.build();
            etVar.copyOnWrite();
            C47814ew ewVar2 = (C47814ew) etVar.instance;
            tVar2.getClass();
            ewVar2.f123838g = tVar2;
            ewVar2.f123832a |= 16;
        }
        return new C47845fz(fxVarArr3[0].f123876a, this.f123892b, this.f123894d.f123837f, (C47814ew) etVar.build(), sparseArray, i7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0163, code lost:
        r3 = r3 - ((long) r0.f123779h);
        r1 = r0.f123775d.values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0175, code lost:
        if (r1.hasNext() == false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0177, code lost:
        r5 = (com.google.apps.tiktok.tracing.C47847ga) r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0183, code lost:
        if (r5.f123894d.f123837f >= r3) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0185, code lost:
        r6 = r0.f123774c.mo29164d(com.google.apps.tiktok.tracing.C47783ds.f123769a, 10, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0197, code lost:
        if (r0.f123776e.mo56113h() == false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0199, code lost:
        r7 = (com.google.apps.tiktok.p3671k.p3672a.p3673a.C47356a) r0.f123776e.mo56107c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01a1, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r5.mo51671b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01a5, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r7.mo51228a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01ad, code lost:
        p3186j$.util.Objects.requireNonNull(r5);
        r6.mo4106b(new com.google.apps.tiktok.tracing.C47784dt(r5), com.google.common.util.concurrent.C60826bg.f164896a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            com.google.apps.tiktok.tracing.dv r0 = r14.f123891a
            com.google.common.util.concurrent.cx r1 = r14.f123896f
            monitor-enter(r14)
            com.google.apps.tiktok.tracing.fz r2 = r14.mo51671b()     // Catch:{ all -> 0x01e9 }
            monitor-exit(r14)     // Catch:{ all -> 0x01e9 }
            java.util.concurrent.ConcurrentMap r3 = r0.f123775d
            java.util.UUID r4 = r2.f123885b
            java.lang.Object r3 = r3.remove(r4)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0018
            r3 = 1
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            com.google.common.base.C58838bb.m90883r(r3)
            r3 = r1
            com.google.common.util.concurrent.d r3 = (com.google.common.util.concurrent.C60873d) r3
            java.lang.Object r3 = r3.value
            boolean r3 = r3 instanceof com.google.common.util.concurrent.C60873d.C60875b
            if (r3 == 0) goto L_0x0147
            com.google.apps.tiktok.tracing.ew r1 = r2.f123887d
            com.google.apps.tiktok.tracing.t r1 = r1.f123838g
            if (r1 != 0) goto L_0x002d
            com.google.apps.tiktok.tracing.t r1 = com.google.apps.tiktok.tracing.C47860t.f123928d
        L_0x002d:
            com.google.android.libraries.f.a r3 = r0.f123773b
            long r6 = r3.mo26871c()
            long r8 = r2.f123886c
            long r6 = r6 - r8
            com.google.apps.tiktok.tracing.ew r3 = r2.f123887d
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.apps.tiktok.tracing.et r3 = (com.google.apps.tiktok.tracing.C47811et) r3
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.apps.tiktok.tracing.o r1 = (com.google.apps.tiktok.tracing.C47855o) r1
            com.google.apps.tiktok.tracing.q r8 = com.google.apps.tiktok.tracing.C47857q.f123919d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.apps.tiktok.tracing.p r8 = (com.google.apps.tiktok.tracing.C47856p) r8
            int r9 = r2.f123889f
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.apps.tiktok.tracing.q r10 = (com.google.apps.tiktok.tracing.C47857q) r10
            int r11 = r10.f123921a
            r11 = r11 | 2
            r10.f123921a = r11
            r10.f123923c = r9
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.apps.tiktok.tracing.q r9 = (com.google.apps.tiktok.tracing.C47857q) r9
            int r10 = r9.f123921a
            r4 = r4 | r10
            r9.f123921a = r4
            r9.f123922b = r6
            com.google.protobuf.bv r4 = r8.build()
            com.google.apps.tiktok.tracing.q r4 = (com.google.apps.tiktok.tracing.C47857q) r4
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.apps.tiktok.tracing.t r8 = (com.google.apps.tiktok.tracing.C47860t) r8
            r4.getClass()
            r8.f123932c = r4
            int r4 = r8.f123930a
            r4 = r4 | 2
            r8.f123930a = r4
            com.google.protobuf.bv r1 = r1.build()
            com.google.apps.tiktok.tracing.t r1 = (com.google.apps.tiktok.tracing.C47860t) r1
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.apps.tiktok.tracing.ew r4 = (com.google.apps.tiktok.tracing.C47814ew) r4
            r1.getClass()
            r4.f123838g = r1
            int r1 = r4.f123832a
            r1 = r1 | 16
            r4.f123832a = r1
            com.google.protobuf.bv r1 = r3.build()
            com.google.apps.tiktok.tracing.ew r1 = (com.google.apps.tiktok.tracing.C47814ew) r1
            com.google.protobuf.cq r3 = r1.f123835d
            int r3 = r3.size()
            int r3 = r3 + -1
            com.google.protobuf.cq r4 = r1.f123835d
            java.util.List r4 = com.google.common.p4522b.C58597ky.m90216g(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x00b3:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x00cb
            java.lang.Object r8 = r4.next()
            com.google.apps.tiktok.tracing.bg r8 = (com.google.apps.tiktok.tracing.C47556bg) r8
            int r9 = r8.f123406a
            r10 = r9 & 16
            if (r10 != 0) goto L_0x00b3
            r9 = r9 & 4
            if (r9 == 0) goto L_0x00b3
            int r3 = r8.f123408c
        L_0x00cb:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r8 = 0
        L_0x00d1:
            if (r3 < 0) goto L_0x010f
            com.google.protobuf.cq r9 = r1.f123835d
            java.lang.Object r9 = r9.get(r3)
            com.google.apps.tiktok.tracing.bg r9 = (com.google.apps.tiktok.tracing.C47556bg) r9
            long r10 = r9.f123410e
            int r11 = (int) r10
            java.lang.StackTraceElement r10 = new java.lang.StackTraceElement
            java.lang.String r12 = r9.f123407b
            int r9 = r9.f123406a
            r9 = r9 & 16
            if (r9 != 0) goto L_0x00eb
            java.lang.String r9 = " (Timed Out)"
            goto L_0x00ed
        L_0x00eb:
            java.lang.String r9 = ""
        L_0x00ed:
            java.lang.String r13 = "tk_trace"
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r9 = r12.concat(r9)
            java.lang.String r12 = "Started After"
            int r8 = r11 - r8
            int r8 = r8 / 1000
            r10.<init>(r13, r9, r12, r8)
            r4.add(r10)
            com.google.protobuf.cq r8 = r1.f123835d
            java.lang.Object r3 = r8.get(r3)
            com.google.apps.tiktok.tracing.bg r3 = (com.google.apps.tiktok.tracing.C47556bg) r3
            int r3 = r3.f123409d
            r8 = r11
            goto L_0x00d1
        L_0x010f:
            com.google.common.f.e r3 = com.google.apps.tiktok.tracing.C47786dv.f123772a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.apps.tiktok.tracing.fd r8 = new com.google.apps.tiktok.tracing.fd
            java.lang.StackTraceElement[] r5 = new java.lang.StackTraceElement[r5]
            java.lang.Object[] r4 = r4.toArray(r5)
            java.lang.StackTraceElement[] r4 = (java.lang.StackTraceElement[]) r4
            r5 = 0
            r8.<init>(r5, r4)
            com.google.common.f.x r3 = r3.mo56382g(r8)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r4 = 54785(0xd601, float:7.677E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.String r4 = "Trace %s timed out after %d ms. Complete trace: %s"
            java.lang.String r5 = r2.f123884a
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r3.mo56359L(r4, r5, r6, r1)
            android.util.SparseArray r3 = r2.f123888e
            java.lang.String r2 = r2.f123884a
            r0.mo51626e(r1, r3, r2)
            return
        L_0x0147:
            com.google.common.util.concurrent.C60856cj.m92909r(r1)     // Catch:{ ExecutionException -> 0x01c5 }
            long r3 = r2.f123886c     // Catch:{ ExecutionException -> 0x01c5 }
        L_0x014c:
            java.util.concurrent.atomic.AtomicLong r1 = r0.f123777f     // Catch:{ ExecutionException -> 0x01c5 }
            long r5 = r1.get()     // Catch:{ ExecutionException -> 0x01c5 }
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0157
            goto L_0x01bb
        L_0x0157:
            java.util.concurrent.atomic.AtomicLong r1 = r0.f123777f     // Catch:{ ExecutionException -> 0x01c5 }
            r7 = 300000(0x493e0, double:1.482197E-318)
            long r7 = r7 + r3
            boolean r1 = r1.compareAndSet(r5, r7)     // Catch:{ ExecutionException -> 0x01c5 }
            if (r1 == 0) goto L_0x014c
            int r1 = r0.f123779h     // Catch:{ ExecutionException -> 0x01c5 }
            long r5 = (long) r1     // Catch:{ ExecutionException -> 0x01c5 }
            long r3 = r3 - r5
            java.util.concurrent.ConcurrentMap r1 = r0.f123775d     // Catch:{ ExecutionException -> 0x01c5 }
            java.util.Collection r1 = r1.values()     // Catch:{ ExecutionException -> 0x01c5 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ ExecutionException -> 0x01c5 }
        L_0x0171:
            boolean r5 = r1.hasNext()     // Catch:{ ExecutionException -> 0x01c5 }
            if (r5 == 0) goto L_0x01bb
            java.lang.Object r5 = r1.next()     // Catch:{ ExecutionException -> 0x01c5 }
            com.google.apps.tiktok.tracing.ga r5 = (com.google.apps.tiktok.tracing.C47847ga) r5     // Catch:{ ExecutionException -> 0x01c5 }
            com.google.apps.tiktok.tracing.ew r6 = r5.f123894d     // Catch:{ ExecutionException -> 0x01c5 }
            long r6 = r6.f123837f     // Catch:{ ExecutionException -> 0x01c5 }
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x0171
            com.google.common.util.concurrent.db r6 = r0.f123774c     // Catch:{ ExecutionException -> 0x01c5 }
            com.google.apps.tiktok.tracing.ds r7 = com.google.apps.tiktok.tracing.C47783ds.f123769a     // Catch:{ ExecutionException -> 0x01c5 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x01c5 }
            r9 = 10
            com.google.common.util.concurrent.cz r6 = r6.mo29164d(r7, r9, r8)     // Catch:{ ExecutionException -> 0x01c5 }
            com.google.common.base.ax r7 = r0.f123776e     // Catch:{ ExecutionException -> 0x01c5 }
            boolean r7 = r7.mo56113h()     // Catch:{ ExecutionException -> 0x01c5 }
            if (r7 == 0) goto L_0x01ad
            com.google.common.base.ax r7 = r0.f123776e     // Catch:{ ExecutionException -> 0x01c5 }
            java.lang.Object r7 = r7.mo56107c()     // Catch:{ ExecutionException -> 0x01c5 }
            com.google.apps.tiktok.k.a.a.a r7 = (com.google.apps.tiktok.p3671k.p3672a.p3673a.C47356a) r7     // Catch:{ ExecutionException -> 0x01c5 }
            monitor-enter(r5)     // Catch:{ ExecutionException -> 0x01c5 }
            r5.mo51671b()     // Catch:{ all -> 0x01aa }
            monitor-exit(r5)     // Catch:{ all -> 0x01aa }
            r7.mo51228a()     // Catch:{ ExecutionException -> 0x01c5 }
            goto L_0x01ad
        L_0x01aa:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01aa }
            throw r0     // Catch:{ ExecutionException -> 0x01c5 }
        L_0x01ad:
            p3186j$.util.Objects.requireNonNull(r5)     // Catch:{ ExecutionException -> 0x01c5 }
            com.google.apps.tiktok.tracing.dt r7 = new com.google.apps.tiktok.tracing.dt     // Catch:{ ExecutionException -> 0x01c5 }
            r7.<init>(r5)     // Catch:{ ExecutionException -> 0x01c5 }
            com.google.common.util.concurrent.bg r5 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ ExecutionException -> 0x01c5 }
            r6.mo4106b(r7, r5)     // Catch:{ ExecutionException -> 0x01c5 }
            goto L_0x0171
        L_0x01bb:
            com.google.apps.tiktok.tracing.ew r1 = r2.f123887d     // Catch:{ ExecutionException -> 0x01c5 }
            android.util.SparseArray r3 = r2.f123888e     // Catch:{ ExecutionException -> 0x01c5 }
            java.lang.String r4 = r2.f123884a     // Catch:{ ExecutionException -> 0x01c5 }
            r0.mo51626e(r1, r3, r4)     // Catch:{ ExecutionException -> 0x01c5 }
            return
        L_0x01c5:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.apps.tiktok.tracing.C47786dv.f123772a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            java.lang.Throwable r0 = r0.getCause()
            com.google.common.f.x r0 = r1.mo56382g(r0)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 54784(0xd600, float:7.6769E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = "Trace %s failed collection"
            java.lang.String r2 = r2.f123884a
            r0.mo56389s(r1, r2)
            return
        L_0x01e9:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x01e9 }
            goto L_0x01ed
        L_0x01ec:
            throw r0
        L_0x01ed:
            goto L_0x01ec
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.tracing.C47847ga.run():void");
    }

    public final String toString() {
        C47845fz b;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            b = mo51671b();
        }
        String str = b.f123884a;
        return "UnfinishedTrace@" + hexString + "[" + str + "]";
    }
}
