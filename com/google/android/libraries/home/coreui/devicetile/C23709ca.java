package com.google.android.libraries.home.coreui.devicetile;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71608bi;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.home.coreui.devicetile.TouchBehavior$initialize$1$1", mo61344c = "TouchBehavior.kt", mo61345d = "invokeSuspend", mo61346e = {43})
/* renamed from: com.google.android.libraries.home.coreui.devicetile.ca */
/* compiled from: PG */
final class C23709ca extends C69572j implements C69630p {

    /* renamed from: a */
    int f64850a;

    /* renamed from: b */
    final /* synthetic */ C23711cc f64851b;

    /* renamed from: c */
    final /* synthetic */ C23656ab f64852c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23709ca(C23711cc ccVar, C23656ab abVar, C69577g gVar) {
        super(2, gVar);
        this.f64851b = ccVar;
        this.f64852c = abVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C23709ca) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f64850a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            this.f64850a = 1;
            if (C71608bi.m104551c(3000, this) == aVar) {
                return aVar;
            }
        }
        C23711cc ccVar = this.f64851b;
        ccVar.f64858d = false;
        this.f64852c.mo29006f(ccVar.mo29059c(), ccVar.f64859e);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C23709ca(this.f64851b, this.f64852c, gVar);
    }
}
