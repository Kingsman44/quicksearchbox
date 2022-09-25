package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.p9820a.p9821a;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9538d.C127170c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129456c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129460g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129462i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129463j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129465l;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.input.control.dataservice.impl.InputPlateFeatureDataSource$loadData$1", mo61344c = "InputPlateFeatureDataSource.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.a.a.g */
/* compiled from: PG */
final class C129453g extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C129454h f355436a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129453g(C129454h hVar, C69577g gVar) {
        super(2, gVar);
        this.f355436a = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129453g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C46688af afVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C129454h hVar = this.f355436a;
        C58976aa aaVar = C58975e.f156826a;
        if (!((C127170c) hVar.f355440d.f350119a.f350103b.get()).mo107982c()) {
            C129456c cVar = (C129456c) C129463j.f355459c.createBuilder();
            C69664n.m101060f(cVar, "newBuilder()");
            C129465l a = C69664n.m101061g(cVar, "builder");
            C129462i iVar = C129462i.f355457a;
            C69664n.m101060f(iVar, "getDefaultInstance()");
            C69664n.m101061g(iVar, "value");
            C129456c cVar2 = a.f355464a;
            cVar2.copyOnWrite();
            C129463j jVar = (C129463j) cVar2.instance;
            iVar.getClass();
            jVar.f355462b = iVar;
            jVar.f355461a = 2;
            return C46688af.m83205b(a.mo109041a(), hVar.f355438b.mo26870b());
        }
        C46688af afVar2 = hVar.f355439c.f355424b;
        if (afVar2 != null) {
            C129456c cVar3 = (C129456c) C129463j.f355459c.createBuilder();
            C69664n.m101060f(cVar3, "newBuilder()");
            C129465l a2 = C69664n.m101061g(cVar3, "builder");
            Object f = afVar2.mo50739f();
            C69664n.m101060f(f, "data");
            C129460g gVar = (C129460g) f;
            C69664n.m101061g(gVar, "value");
            C129456c cVar4 = a2.f355464a;
            cVar4.copyOnWrite();
            C129463j jVar2 = (C129463j) cVar4.instance;
            gVar.getClass();
            jVar2.f355462b = gVar;
            jVar2.f355461a = 1;
            afVar = C46688af.m83205b(a2.mo109041a(), afVar2.mo50736a());
        } else {
            afVar = null;
        }
        return afVar == null ? C46688af.f121976a : afVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129453g(this.f355436a, gVar);
    }
}
