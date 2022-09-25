package com.google.android.libraries.assistant.auto.tng.assistant.p885e.p886a;

import com.google.android.libraries.search.assistant.appactions.p2501a.C32433a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.assistant.auto.tng.assistant.thirdpartydataservice.impl.RemoteActionsDataServiceImpl$subscribeToFlow$1", mo61344c = "RemoteActionsDataServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.e.a.n */
/* compiled from: PG */
final class C13095n extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C32433a f40611a;

    /* renamed from: b */
    final /* synthetic */ C13097p f40612b;

    /* renamed from: c */
    private /* synthetic */ Object f40613c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13095n(C32433a aVar, C13097p pVar, C69577g gVar) {
        super(2, gVar);
        this.f40611a = aVar;
        this.f40612b = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C13095n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71422aw awVar = (C71422aw) this.f40613c;
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C13085d(this.f40611a, this.f40612b, (C69577g) null), 3);
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C13088g(this.f40611a, this.f40612b, (C69577g) null), 3);
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C13090i(this.f40611a, this.f40612b, (C69577g) null), 3);
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C13093l(this.f40611a, this.f40612b, (C69577g) null), 3);
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C13094m(this.f40611a, this.f40612b, (C69577g) null), 3);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C13095n nVar = new C13095n(this.f40611a, this.f40612b, gVar);
        nVar.f40613c = obj;
        return nVar;
    }
}
