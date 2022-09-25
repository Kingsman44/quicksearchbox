package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.rendering.widgets.ActionsServiceSessionImpl$parallelMap$2", mo61344c = "ActionsServiceSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.g.a.ae */
/* compiled from: PG */
final class C120909ae extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ Iterable f336155a;

    /* renamed from: b */
    final /* synthetic */ C69630p f336156b;

    /* renamed from: c */
    private /* synthetic */ Object f336157c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120909ae(Iterable iterable, C69630p pVar, C69577g gVar) {
        super(2, gVar);
        this.f336155a = iterable;
        this.f336156b = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120909ae) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71422aw awVar = (C71422aw) this.f336157c;
        Iterable<Object> iterable = this.f336155a;
        C69630p pVar = this.f336156b;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(iterable, 10));
        for (Object adVar : iterable) {
            arrayList.add(C71803m.m105042c(awVar, (C69585o) null, (C71424ay) null, new C120908ad(pVar, adVar, (C69577g) null), 3));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120909ae aeVar = new C120909ae(this.f336155a, this.f336156b, gVar);
        aeVar.f336157c = obj;
        return aeVar;
    }
}
