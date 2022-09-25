package kotlinx.coroutines;

import kotlinx.coroutines.p5582h.C71768h;
import kotlinx.coroutines.p5582h.C71771k;
import p5462h.C69465a;
import p5462h.p5466c.C69577g;

/* renamed from: kotlinx.coroutines.bl */
/* compiled from: PG */
public abstract class C71611bl extends C71768h {

    /* renamed from: f */
    public int f191046f;

    public C71611bl(int i) {
        super(0, C71771k.f191284e);
        this.f191046f = i;
    }

    /* renamed from: C */
    public final void mo62831C(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C69465a.m100953a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            C71417ar.m104192b(mo62836t().mo61340lY(), new C71425az("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    /* renamed from: o */
    public Object mo62832o(Object obj) {
        return obj;
    }

    /* renamed from: p */
    public abstract Object mo62833p();

    /* JADX WARNING: type inference failed for: r1v6, types: [h.c.g, h.c.b.a.d] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (r3.mo62990T() != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        if (r3.mo62990T() != false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            boolean r0 = kotlinx.coroutines.C71600ba.f191036a
            h.c.g r0 = r9.mo62836t()     // Catch:{ all -> 0x009c }
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            p5462h.p5473f.p5475b.C69664n.m101059e(r0, r1)     // Catch:{ all -> 0x009c }
            kotlinx.coroutines.e.j r0 = (kotlinx.coroutines.p5579e.C71728j) r0     // Catch:{ all -> 0x009c }
            h.c.g r1 = r0.f191203b     // Catch:{ all -> 0x009c }
            java.lang.Object r0 = r0.f191205d     // Catch:{ all -> 0x009c }
            h.c.o r2 = r1.mo61340lY()     // Catch:{ all -> 0x009c }
            java.lang.Object r0 = kotlinx.coroutines.p5579e.C71715aw.m104856b(r2, r0)     // Catch:{ all -> 0x009c }
            kotlinx.coroutines.e.ap r3 = kotlinx.coroutines.p5579e.C71715aw.f191181a     // Catch:{ all -> 0x009c }
            r4 = 0
            if (r0 == r3) goto L_0x0023
            kotlinx.coroutines.ec r3 = kotlinx.coroutines.C71405al.m104172c(r1, r2, r0)     // Catch:{ all -> 0x009c }
            goto L_0x0024
        L_0x0023:
            r3 = r4
        L_0x0024:
            h.c.o r5 = r1.mo61340lY()     // Catch:{ all -> 0x008f }
            java.lang.Object r6 = r9.mo62833p()     // Catch:{ all -> 0x008f }
            java.lang.Throwable r7 = r9.mo62835s(r6)     // Catch:{ all -> 0x008f }
            if (r7 != 0) goto L_0x0043
            int r8 = r9.f191046f     // Catch:{ all -> 0x008f }
            boolean r8 = kotlinx.coroutines.C71612bm.m104562b(r8)     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x0043
            kotlinx.coroutines.co r8 = kotlinx.coroutines.C71643cp.f191083c     // Catch:{ all -> 0x008f }
            h.c.l r5 = r5.get(r8)     // Catch:{ all -> 0x008f }
            kotlinx.coroutines.cp r5 = (kotlinx.coroutines.C71643cp) r5     // Catch:{ all -> 0x008f }
            goto L_0x0044
        L_0x0043:
            r5 = r4
        L_0x0044:
            if (r5 == 0) goto L_0x0063
            boolean r8 = r5.mo62867mj()     // Catch:{ all -> 0x008f }
            if (r8 != 0) goto L_0x0063
            java.util.concurrent.CancellationException r5 = r5.mo62870p()     // Catch:{ all -> 0x008f }
            r9.mo62837w(r6, r5)     // Catch:{ all -> 0x008f }
            boolean r6 = kotlinx.coroutines.C71600ba.f191037b     // Catch:{ all -> 0x008f }
            if (r6 == 0) goto L_0x005b
            java.lang.Throwable r5 = kotlinx.coroutines.p5579e.C71707ao.m104840a(r5, r1)     // Catch:{ all -> 0x008f }
        L_0x005b:
            java.lang.Object r5 = p5462h.C69714l.m101133a(r5)     // Catch:{ all -> 0x008f }
            r1.mo61338mb(r5)     // Catch:{ all -> 0x008f }
            goto L_0x0074
        L_0x0063:
            if (r7 == 0) goto L_0x006d
            java.lang.Object r5 = p5462h.C69714l.m101133a(r7)     // Catch:{ all -> 0x008f }
            r1.mo61338mb(r5)     // Catch:{ all -> 0x008f }
            goto L_0x0074
        L_0x006d:
            java.lang.Object r5 = r9.mo62832o(r6)     // Catch:{ all -> 0x008f }
            r1.mo61338mb(r5)     // Catch:{ all -> 0x008f }
        L_0x0074:
            if (r3 == 0) goto L_0x007c
            boolean r1 = r3.mo62990T()     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x007f
        L_0x007c:
            kotlinx.coroutines.p5579e.C71715aw.m104857c(r2, r0)     // Catch:{ all -> 0x009c }
        L_0x007f:
            h.q r0 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x0082 }
            goto L_0x0087
        L_0x0082:
            r0 = move-exception
            java.lang.Object r0 = p5462h.C69714l.m101133a(r0)
        L_0x0087:
            java.lang.Throwable r0 = p5462h.C69702k.m101124a(r0)
            r9.mo62831C(r4, r0)
            return
        L_0x008f:
            r1 = move-exception
            if (r3 == 0) goto L_0x0098
            boolean r3 = r3.mo62990T()     // Catch:{ all -> 0x009c }
            if (r3 == 0) goto L_0x009b
        L_0x0098:
            kotlinx.coroutines.p5579e.C71715aw.m104857c(r2, r0)     // Catch:{ all -> 0x009c }
        L_0x009b:
            throw r1     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            h.q r1 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x00a0 }
            goto L_0x00a5
        L_0x00a0:
            r1 = move-exception
            java.lang.Object r1 = p5462h.C69714l.m101133a(r1)
        L_0x00a5:
            java.lang.Throwable r1 = p5462h.C69702k.m101124a(r1)
            r9.mo62831C(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71611bl.run():void");
    }

    /* renamed from: s */
    public Throwable mo62835s(Object obj) {
        C71396ac acVar = obj instanceof C71396ac ? (C71396ac) obj : null;
        if (acVar != null) {
            return acVar.f190604b;
        }
        return null;
    }

    /* renamed from: t */
    public abstract C69577g mo62836t();

    /* renamed from: w */
    public void mo62837w(Object obj, Throwable th) {
        throw null;
    }
}
