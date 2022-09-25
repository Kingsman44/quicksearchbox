package p5488io.grpc.p5526f;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5584j.C71788b;
import p5488io.grpc.C70704ei;

/* renamed from: io.grpc.f.ab */
/* compiled from: PG */
final class C70725ab implements C71588o {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f188468a;

    /* renamed from: b */
    final /* synthetic */ C71788b f188469b;

    /* renamed from: c */
    final /* synthetic */ C70756v f188470c;

    /* renamed from: d */
    final /* synthetic */ C70704ei f188471d;

    public C70725ab(AtomicBoolean atomicBoolean, C71788b bVar, C70756v vVar, C70704ei eiVar) {
        this.f188468a = atomicBoolean;
        this.f188469b = bVar;
        this.f188470c = vVar;
        this.f188471d = eiVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a5, code lost:
        if (r10.mo62437a(r0) != r1) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo20883a(java.lang.Object r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p5488io.grpc.p5526f.C70724aa
            if (r0 == 0) goto L_0x0013
            r0 = r10
            io.grpc.f.aa r0 = (p5488io.grpc.p5526f.C70724aa) r0
            int r1 = r0.f188467g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f188467g = r1
            goto L_0x0018
        L_0x0013:
            io.grpc.f.aa r0 = new io.grpc.f.aa
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f188465e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f188467g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x005b
            if (r2 == r5) goto L_0x004b
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r9 = r0.f188463c
            io.grpc.ei r9 = (p5488io.grpc.C70704ei) r9
            java.lang.Object r1 = r0.f188462b
            kotlinx.coroutines.j.b r1 = (kotlinx.coroutines.p5584j.C71788b) r1
            java.lang.Object r0 = r0.f188461a
            p5462h.C69714l.m101134b(r10)
            goto L_0x00bc
        L_0x0039:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0041:
            java.lang.Object r9 = r0.f188462b
            java.lang.Object r2 = r0.f188461a
            io.grpc.f.ab r2 = (p5488io.grpc.p5526f.C70725ab) r2
            p5462h.C69714l.m101134b(r10)
            goto L_0x00a7
        L_0x004b:
            java.lang.Object r9 = r0.f188464d
            java.lang.Object r2 = r0.f188463c
            kotlinx.coroutines.j.b r2 = (kotlinx.coroutines.p5584j.C71788b) r2
            java.lang.Object r5 = r0.f188462b
            java.lang.Object r7 = r0.f188461a
            io.grpc.f.ab r7 = (p5488io.grpc.p5526f.C70725ab) r7
            p5462h.C69714l.m101134b(r10)
            goto L_0x007e
        L_0x005b:
            p5462h.C69714l.m101134b(r10)
            java.util.concurrent.atomic.AtomicBoolean r10 = r8.f188468a
            r2 = 0
            boolean r10 = r10.compareAndSet(r2, r5)
            if (r10 == 0) goto L_0x0094
            kotlinx.coroutines.j.b r2 = r8.f188469b
            io.grpc.ei r10 = r8.f188471d
            r0.f188461a = r8
            r0.f188462b = r9
            r0.f188463c = r2
            r0.f188464d = r10
            r0.f188467g = r5
            java.lang.Object r5 = r2.mo63025b(r6, r0)
            if (r5 == r1) goto L_0x0093
            r7 = r8
            r5 = r9
            r9 = r10
        L_0x007e:
            io.grpc.de r10 = new io.grpc.de     // Catch:{ all -> 0x008e }
            r10.<init>()     // Catch:{ all -> 0x008e }
            io.grpc.ei r9 = (p5488io.grpc.C70704ei) r9     // Catch:{ all -> 0x008e }
            r9.mo58113b(r10)     // Catch:{ all -> 0x008e }
            r2.mo63026c(r6)
            r9 = r5
            r2 = r7
            goto L_0x0095
        L_0x008e:
            r9 = move-exception
            r2.mo63026c(r6)
            throw r9
        L_0x0093:
            return r1
        L_0x0094:
            r2 = r8
        L_0x0095:
            io.grpc.f.v r10 = r2.f188470c
            r0.f188461a = r2
            r0.f188462b = r9
            r0.f188463c = r6
            r0.f188464d = r6
            r0.f188467g = r4
            java.lang.Object r10 = r10.mo62437a(r0)
            if (r10 == r1) goto L_0x00ca
        L_0x00a7:
            kotlinx.coroutines.j.b r10 = r2.f188469b
            io.grpc.ei r2 = r2.f188471d
            r0.f188461a = r9
            r0.f188462b = r10
            r0.f188463c = r2
            r0.f188467g = r3
            java.lang.Object r0 = r10.mo63025b(r6, r0)
            if (r0 == r1) goto L_0x00ca
            r0 = r9
            r1 = r10
            r9 = r2
        L_0x00bc:
            r9.mo61743e(r0)     // Catch:{ all -> 0x00c5 }
            r1.mo63026c(r6)
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x00c5:
            r9 = move-exception
            r1.mo63026c(r6)
            throw r9
        L_0x00ca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5526f.C70725ab.mo20883a(java.lang.Object, h.c.g):java.lang.Object");
    }
}
