package p5488io.grpc.p5526f;

import kotlinx.coroutines.p5573a.C71347aa;
import kotlinx.coroutines.p5573a.C71348ab;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5573a.C71392y;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: io.grpc.f.v */
/* compiled from: PG */
public final class C70756v {

    /* renamed from: a */
    private final C69615a f188555a;

    /* renamed from: b */
    private final C71389v f188556b = C71392y.m104158a(-1, (C71387t) null, 6);

    public C70756v(C69615a aVar) {
        this.f188555a = aVar;
    }

    /* renamed from: b */
    public final void mo62438b() {
        Object w = this.f188556b.mo62730w(C69788q.f186170a);
        if (w instanceof C71347aa) {
            Throwable b = C71348ab.m103984b(w);
            if (b == null) {
                throw new AssertionError("Should be impossible; a CONFLATED channel should never return false on offer");
            }
            throw b;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo62437a(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p5488io.grpc.p5526f.C70755u
            if (r0 == 0) goto L_0x0013
            r0 = r6
            io.grpc.f.u r0 = (p5488io.grpc.p5526f.C70755u) r0
            int r1 = r0.f188554d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f188554d = r1
            goto L_0x0018
        L_0x0013:
            io.grpc.f.u r0 = new io.grpc.f.u
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f188552b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f188554d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r2 = r0.f188551a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0035
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0031:
            p5462h.C69714l.m101134b(r6)
            r2 = r5
        L_0x0035:
            r6 = r2
            io.grpc.f.v r6 = (p5488io.grpc.p5526f.C70756v) r6
            h.f.a.a r4 = r6.f188555a
            java.lang.Object r4 = r4.mo5672a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x0054
            kotlinx.coroutines.a.v r6 = r6.f188556b
            r0.f188551a = r2
            r0.f188554d = r3
            java.lang.Object r6 = r6.mo62718c(r0)
            if (r6 == r1) goto L_0x0053
            goto L_0x0035
        L_0x0053:
            return r1
        L_0x0054:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5526f.C70756v.mo62437a(h.c.g):java.lang.Object");
    }
}
