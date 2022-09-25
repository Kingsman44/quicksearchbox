package kotlinx.coroutines.p5574b;

import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5474a.C69632r;

@C69567e(mo61343b = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", mo61344c = "Errors.kt", mo61345d = "invokeSuspend", mo61346e = {95})
/* renamed from: kotlinx.coroutines.b.an */
/* compiled from: PG */
final class C71483an extends C69572j implements C69632r {

    /* renamed from: a */
    int f190765a;

    /* renamed from: b */
    /* synthetic */ Object f190766b;

    /* renamed from: c */
    /* synthetic */ long f190767c;

    /* renamed from: d */
    final /* synthetic */ long f190768d;

    /* renamed from: e */
    final /* synthetic */ C69630p f190769e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71483an(long j, C69630p pVar, C69577g gVar) {
        super(4, gVar);
        this.f190768d = j;
        this.f190769e = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8479a(Object obj, Object obj2, Object obj3, Object obj4) {
        C71588o oVar = (C71588o) obj;
        long longValue = ((Number) obj3).longValue();
        C71483an anVar = new C71483an(this.f190768d, this.f190769e, (C69577g) obj4);
        anVar.f190766b = (Throwable) obj2;
        anVar.f190767c = longValue;
        return anVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (((java.lang.Boolean) r9).booleanValue() != false) goto L_0x002e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r8.f190765a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000c
            p5462h.C69714l.m101134b(r9)
            goto L_0x0024
        L_0x000c:
            p5462h.C69714l.m101134b(r9)
            java.lang.Object r9 = r8.f190766b
            long r4 = r8.f190767c
            long r6 = r8.f190768d
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x002d
            h.f.a.p r1 = r8.f190769e
            r8.f190765a = r2
            java.lang.Object r9 = r1.mo5192a(r9, r8)
            if (r9 != r0) goto L_0x0024
            return r0
        L_0x0024:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5574b.C71483an.mo5193b(java.lang.Object):java.lang.Object");
    }
}
