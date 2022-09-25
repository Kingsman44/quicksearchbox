package com.google.android.apps.search.googleapp.discover.p10166a;

import com.google.common.p4522b.C58485gu;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57246ba;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.actions.ActionApi$processThereAndBackAgain$1", mo61344c = "ActionApi.kt", mo61345d = "invokeSuspend", mo61346e = {206})
/* renamed from: com.google.android.apps.search.googleapp.discover.a.a */
/* compiled from: PG */
public final class C133934a extends C69572j implements C69630p {

    /* renamed from: a */
    int f364780a;

    /* renamed from: b */
    final /* synthetic */ C133939b f364781b;

    /* renamed from: c */
    final /* synthetic */ C57246ba f364782c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133934a(C133939b bVar, C57246ba baVar, C69577g gVar) {
        super(2, gVar);
        this.f364781b = bVar;
        this.f364782c = baVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C133934a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f364780a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C133991e eVar = this.f364781b.f364793b;
            C58485gu n = C58485gu.m89846n(this.f364782c);
            C69664n.m101060f(n, "of(feedAction)");
            this.f364780a = 1;
            if (eVar.mo111510a(n, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C133934a(this.f364781b, this.f364782c, gVar);
    }
}
