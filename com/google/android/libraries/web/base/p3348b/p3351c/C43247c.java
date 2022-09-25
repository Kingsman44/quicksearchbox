package com.google.android.libraries.web.base.p3348b.p3351c;

import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.web.base.internal.requirements.RequestRequirementsModel$onLoadRequestRequirements$1$1", mo61344c = "RequestRequirementsModel.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.web.base.b.c.c */
/* compiled from: PG */
final class C43247c extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ int f113015a;

    /* renamed from: b */
    /* synthetic */ int f113016b;

    public C43247c(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        C43247c cVar = new C43247c((C69577g) obj3);
        cVar.f113015a = intValue;
        cVar.f113016b = intValue2;
        return cVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        return new Integer(this.f113015a + this.f113016b);
    }
}
