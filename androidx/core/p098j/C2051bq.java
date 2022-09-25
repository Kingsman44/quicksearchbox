package androidx.core.p098j;

import android.view.View;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69571i;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5482l.C69733m;

@C69567e(mo61343b = "androidx.core.view.ViewKt$allViews$1", mo61344c = "View.kt", mo61345d = "invokeSuspend", mo61346e = {414, 416})
/* renamed from: androidx.core.j.bq */
/* compiled from: PG */
public final class C2051bq extends C69571i implements C69630p {

    /* renamed from: a */
    int f5958a;

    /* renamed from: b */
    final /* synthetic */ View f5959b;

    /* renamed from: c */
    private /* synthetic */ Object f5960c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2051bq(View view, C69577g gVar) {
        super(gVar);
        this.f5959b = view;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C2051bq) mo5194c((C69733m) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: h.l.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r4) {
        /*
            r3 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r3.f5958a
            r2 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 == r2) goto L_0x000d
            p5462h.C69714l.m101134b(r4)
            goto L_0x0042
        L_0x000d:
            java.lang.Object r1 = r3.f5960c
            h.l.m r1 = (p5462h.p5482l.C69733m) r1
            p5462h.C69714l.m101134b(r4)
            goto L_0x0029
        L_0x0015:
            p5462h.C69714l.m101134b(r4)
            java.lang.Object r4 = r3.f5960c
            r1 = r4
            h.l.m r1 = (p5462h.p5482l.C69733m) r1
            android.view.View r4 = r3.f5959b
            r3.f5960c = r1
            r3.f5958a = r2
            java.lang.Object r4 = r1.mo61426a(r4, r3)
            if (r4 == r0) goto L_0x0045
        L_0x0029:
            android.view.View r4 = r3.f5959b
            boolean r2 = r4 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0042
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            h.l.k r4 = androidx.core.p098j.C2050bp.m5610b(r4)
            r2 = 0
            r3.f5960c = r2
            r2 = 2
            r3.f5958a = r2
            java.lang.Object r4 = r1.mo61429d(r4, r3)
            if (r4 != r0) goto L_0x0042
            return r0
        L_0x0042:
            h.q r4 = p5462h.C69788q.f186170a
            return r4
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p098j.C2051bq.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C2051bq bqVar = new C2051bq(this.f5959b, gVar);
        bqVar.f5960c = obj;
        return bqVar;
    }
}
