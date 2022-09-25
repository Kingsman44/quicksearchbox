package com.google.android.libraries.search.assistant.p2697j.p2698a.p2699a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.coroutines.flow.data.DataFlowAdapterKt$dataFlowAdapter$3", mo61344c = "DataFlowAdapter.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.j.a.a.g */
/* compiled from: PG */
final class C34732g extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f92171a;

    /* renamed from: b */
    final /* synthetic */ String f92172b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34732g(String str, C69577g gVar) {
        super(2, gVar);
        this.f92172b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34732g) mo5194c(obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f92171a;
        C59052c cVar = (C59052c) C34733h.f92173a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "DataFlowAdapter");
        String str = this.f92172b;
        cVar.mo56379ah(new C59094n(50639));
        cVar.mo56354G("[%s] On new data value: %s.", str, obj2);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34732g gVar2 = new C34732g(this.f92172b, gVar);
        gVar2.f92171a = obj;
        return gVar2;
    }
}
