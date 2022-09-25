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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.rendering.widgets.ActionsServiceSessionImpl$collectResponses$8", mo61344c = "ActionsServiceSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {177})
/* renamed from: com.google.android.apps.search.assistant.platform.g.a.y */
/* compiled from: PG */
final class C120969y extends C69572j implements C69630p {

    /* renamed from: a */
    int f336314a;

    /* renamed from: b */
    final /* synthetic */ C120917am f336315b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120969y(C120917am amVar, C69577g gVar) {
        super(2, gVar);
        this.f336315b = amVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120969y) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f336314a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n a = C71536cm.m104383a(this.f336315b.f336192m);
            C120968x xVar = new C120968x(this.f336315b);
            this.f336314a = 1;
            if (a.mo38165mp(xVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120969y(this.f336315b, gVar);
    }
}
