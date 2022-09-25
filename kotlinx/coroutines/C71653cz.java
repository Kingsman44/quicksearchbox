package kotlinx.coroutines;

import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69571i;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5482l.C69733m;

@C69567e(mo61343b = "kotlinx.coroutines.JobSupport$children$1", mo61344c = "JobSupport.kt", mo61345d = "invokeSuspend", mo61346e = {952, 954})
/* renamed from: kotlinx.coroutines.cz */
/* compiled from: PG */
final class C71653cz extends C69571i implements C69630p {

    /* renamed from: a */
    Object f191098a;

    /* renamed from: b */
    Object f191099b;

    /* renamed from: c */
    int f191100c;

    /* renamed from: d */
    final /* synthetic */ C71665da f191101d;

    /* renamed from: e */
    private /* synthetic */ Object f191102e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71653cz(C71665da daVar, C69577g gVar) {
        super(gVar);
        this.f191101d = daVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C71653cz) mo5194c((C69733m) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f191100c
            r2 = 1
            if (r1 == 0) goto L_0x001a
            if (r1 == r2) goto L_0x0016
            java.lang.Object r1 = r7.f191099b
            java.lang.Object r2 = r7.f191098a
            java.lang.Object r3 = r7.f191102e
            h.l.m r3 = (p5462h.p5482l.C69733m) r3
            p5462h.C69714l.m101134b(r8)
            r8 = r7
            goto L_0x0074
        L_0x0016:
            p5462h.C69714l.m101134b(r8)
            goto L_0x007f
        L_0x001a:
            p5462h.C69714l.m101134b(r8)
            java.lang.Object r8 = r7.f191102e
            h.l.m r8 = (p5462h.p5482l.C69733m) r8
            kotlinx.coroutines.da r1 = r7.f191101d
            java.lang.Object r1 = r1.mo62913mh()
            boolean r3 = r1 instanceof kotlinx.coroutines.C71814x
            if (r3 == 0) goto L_0x0038
            kotlinx.coroutines.x r1 = (kotlinx.coroutines.C71814x) r1
            kotlinx.coroutines.y r1 = r1.f191345a
            r7.f191100c = r2
            java.lang.Object r8 = r8.mo61426a(r1, r7)
            if (r8 != r0) goto L_0x007f
            return r0
        L_0x0038:
            boolean r2 = r1 instanceof kotlinx.coroutines.C71636ci
            if (r2 == 0) goto L_0x007f
            kotlinx.coroutines.ci r1 = (kotlinx.coroutines.C71636ci) r1
            kotlinx.coroutines.df r1 = r1.mo62840lS()
            if (r1 == 0) goto L_0x007f
            java.lang.Object r2 = r1.mo62941j()
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            p5462h.p5473f.p5475b.C69664n.m101059e(r2, r3)
            kotlinx.coroutines.e.ad r2 = (kotlinx.coroutines.p5579e.C71696ad) r2
            r3 = r8
            r8 = r7
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x0054:
            boolean r4 = p5462h.p5473f.p5475b.C69664n.m101066l(r1, r2)
            if (r4 != 0) goto L_0x007f
            boolean r4 = r1 instanceof kotlinx.coroutines.C71814x
            if (r4 == 0) goto L_0x0074
            r4 = r1
            kotlinx.coroutines.x r4 = (kotlinx.coroutines.C71814x) r4
            kotlinx.coroutines.y r4 = r4.f191345a
            r8.f191102e = r3
            r8.f191098a = r2
            r8.f191099b = r1
            r5 = 2
            r8.f191100c = r5
            java.lang.Object r4 = r3.mo61426a(r4, r8)
            if (r4 == r0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            return r0
        L_0x0074:
            kotlinx.coroutines.e.ad r1 = (kotlinx.coroutines.p5579e.C71696ad) r1
            java.lang.Object r1 = r1.mo62941j()
            kotlinx.coroutines.e.ad r1 = kotlinx.coroutines.p5579e.C71741w.m104908a(r1)
            goto L_0x0054
        L_0x007f:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71653cz.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C71653cz czVar = new C71653cz(this.f191101d, gVar);
        czVar.f191102e = obj;
        return czVar;
    }
}
