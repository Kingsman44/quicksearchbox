package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.p9820a.p9821a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129460g;
import com.google.apps.tiktok.dataservice.C46688af;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.input.control.dataservice.impl.InputPlateFeatureDataSource$fetchAndStoreData$1", mo61344c = "InputPlateFeatureDataSource.kt", mo61345d = "invokeSuspend", mo61346e = {55})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.a.a.f */
/* compiled from: PG */
final class C129452f extends C69572j implements C69630p {

    /* renamed from: a */
    Object f355433a;

    /* renamed from: b */
    int f355434b;

    /* renamed from: c */
    final /* synthetic */ C129454h f355435c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129452f(C129454h hVar, C69577g gVar) {
        super(2, gVar);
        this.f355435c = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129452f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f355434b != 0) {
            obj2 = this.f355433a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C129454h hVar = this.f355435c;
            C129448b bVar = hVar.f355439c;
            this.f355433a = bVar;
            this.f355434b = 1;
            obj = hVar.mo109039d(this);
            if (obj == aVar) {
                return aVar;
            }
            obj2 = bVar;
        }
        C129460g gVar = (C129460g) obj;
        C69664n.m101061g(gVar, "value");
        C129448b bVar2 = (C129448b) obj2;
        bVar2.f355424b = C46688af.m83205b(gVar, bVar2.f355423a.mo26870b());
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129452f(this.f355435c, gVar);
    }
}
