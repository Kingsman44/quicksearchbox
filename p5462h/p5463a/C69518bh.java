package p5462h.p5463a;

import java.util.Iterator;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69571i;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5482l.C69733m;

@C69567e(mo61343b = "kotlin.collections.SlidingWindowKt$windowedIterator$1", mo61344c = "SlidingWindow.kt", mo61345d = "invokeSuspend", mo61346e = {34, 40, 49, 55, 58})
/* renamed from: h.a.bh */
/* compiled from: PG */
public final class C69518bh extends C69571i implements C69630p {

    /* renamed from: a */
    Object f185930a;

    /* renamed from: b */
    int f185931b;

    /* renamed from: c */
    int f185932c;

    /* renamed from: d */
    final /* synthetic */ Iterator f185933d;

    /* renamed from: e */
    private /* synthetic */ Object f185934e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69518bh(Iterator it, C69577g gVar) {
        super(gVar);
        this.f185933d = it;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C69518bh) mo5194c((C69733m) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.util.Iterator} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* renamed from: b */
    public final java.lang.Object mo5193b(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r9.f185932c
            r2 = 1
            r3 = 3
            if (r1 == 0) goto L_0x001e
            if (r1 == r2) goto L_0x000f
            p5462h.C69714l.m101134b(r10)
            goto L_0x0074
        L_0x000f:
            int r1 = r9.f185931b
            java.lang.Object r4 = r9.f185930a
            java.lang.Object r5 = r9.f185934e
            h.l.m r5 = (p5462h.p5482l.C69733m) r5
            p5462h.C69714l.m101134b(r10)
            r7 = r9
            r10 = r1
            r6 = r5
            goto L_0x0057
        L_0x001e:
            p5462h.C69714l.m101134b(r10)
            java.lang.Object r10 = r9.f185934e
            h.l.m r10 = (p5462h.p5482l.C69733m) r10
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            java.util.Iterator r4 = r9.f185933d
            r5 = 0
            r7 = r9
            r6 = r10
            r10 = 0
        L_0x0030:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x005f
            java.lang.Object r8 = r4.next()
            if (r10 <= 0) goto L_0x003f
            int r10 = r10 + -1
            goto L_0x0030
        L_0x003f:
            r1.add(r8)
            int r8 = r1.size()
            if (r8 != r3) goto L_0x0030
            r7.f185934e = r6
            r7.f185930a = r4
            r7.f185931b = r5
            r7.f185932c = r2
            java.lang.Object r10 = r6.mo61426a(r1, r7)
            if (r10 == r0) goto L_0x005e
            r10 = r5
        L_0x0057:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            r5 = r10
            goto L_0x0030
        L_0x005e:
            return r0
        L_0x005f:
            boolean r10 = r1.isEmpty()
            if (r10 != 0) goto L_0x0074
            r10 = 0
            r7.f185934e = r10
            r7.f185930a = r10
            r10 = 2
            r7.f185932c = r10
            java.lang.Object r10 = r6.mo61426a(r1, r7)
            if (r10 != r0) goto L_0x0074
            return r0
        L_0x0074:
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p5462h.p5463a.C69518bh.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C69518bh bhVar = new C69518bh(this.f185933d, gVar);
        bhVar.f185934e = obj;
        return bhVar;
    }
}
