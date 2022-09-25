package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.rendering.widgets.ActionsServiceSessionImpl$collectResponses$2", mo61344c = "ActionsServiceSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {161})
/* renamed from: com.google.android.apps.search.assistant.platform.g.a.m */
/* compiled from: PG */
final class C120957m extends C69572j implements C69630p {

    /* renamed from: a */
    int f336297a;

    /* renamed from: b */
    final /* synthetic */ C120917am f336298b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120957m(C120917am amVar, C69577g gVar) {
        super(2, gVar);
        this.f336298b = amVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120957m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f336297a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n a = C71536cm.m104383a(this.f336298b.f336186g);
            C120956l lVar = new C120956l(this.f336298b);
            this.f336297a = 1;
            if (a.mo38165mp(lVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120957m(this.f336298b, gVar);
    }
}
