package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.rendering.widgets.ActionsServiceSessionImpl$1", mo61344c = "ActionsServiceSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {80})
/* renamed from: com.google.android.apps.search.assistant.platform.g.a.i */
/* compiled from: PG */
final class C120953i extends C69572j implements C69630p {

    /* renamed from: a */
    int f336290a;

    /* renamed from: b */
    final /* synthetic */ C120917am f336291b;

    /* renamed from: c */
    private /* synthetic */ Object f336292c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120953i(C120917am amVar, C69577g gVar) {
        super(2, gVar);
        this.f336291b = amVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120953i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f336290a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f336292c;
            C120917am amVar = this.f336291b;
            C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C120955k(amVar, (C69577g) null), 3);
            C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C120957m(amVar, (C69577g) null), 3);
            C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C120959o(amVar, (C69577g) null), 3);
            C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C120961q(amVar, (C69577g) null), 3);
            C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C120963s(amVar, (C69577g) null), 3);
            C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C120965u(amVar, (C69577g) null), 3);
            C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C120967w(amVar, (C69577g) null), 3);
            C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C120969y(amVar, (C69577g) null), 3);
            C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C120970z(amVar, (C69577g) null), 3);
            C120917am amVar2 = this.f336291b;
            C69585o oVar = amVar2.f336181b;
            C120952h hVar = new C120952h(amVar2, (C69577g) null);
            this.f336290a = 1;
            if (C71803m.m105040a(oVar, hVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120953i iVar = new C120953i(this.f336291b, gVar);
        iVar.f336292c = obj;
        return iVar;
    }
}
