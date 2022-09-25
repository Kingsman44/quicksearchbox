package com.google.android.libraries.search.assistant.appactions.p2501a;

import java.util.ArrayList;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.appactions.actionsservice.ActionsServiceSessionImpl$parallelMap$2", mo61344c = "ActionsServiceSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.appactions.a.i */
/* compiled from: PG */
final class C32450i extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ Iterable f86947a;

    /* renamed from: b */
    final /* synthetic */ C69630p f86948b;

    /* renamed from: c */
    private /* synthetic */ Object f86949c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32450i(Iterable iterable, C69630p pVar, C69577g gVar) {
        super(2, gVar);
        this.f86947a = iterable;
        this.f86948b = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32450i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71422aw awVar = (C71422aw) this.f86949c;
        Iterable<Object> iterable = this.f86947a;
        C69630p pVar = this.f86948b;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(iterable, 10));
        for (Object hVar : iterable) {
            arrayList.add(C71803m.m105042c(awVar, (C69585o) null, (C71424ay) null, new C32449h(pVar, hVar, (C69577g) null), 3));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C32450i iVar = new C32450i(this.f86947a, this.f86948b, gVar);
        iVar.f86949c = obj;
        return iVar;
    }
}
