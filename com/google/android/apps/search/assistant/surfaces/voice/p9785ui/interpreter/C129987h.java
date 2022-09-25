package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129855b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129939bn;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129940bo;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129942bq;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.h */
/* compiled from: PG */
final class C129987h implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C129868c f356496a;

    public C129987h(C129868c cVar) {
        this.f356496a = cVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C119904w wVar = (C119904w) obj;
        if (wVar != null) {
            C129855b bVar = this.f356496a.f356287n;
            C129939bn bnVar = (C129939bn) C129940bo.f356407c.createBuilder();
            C69664n.m101060f(bnVar, "newBuilder()");
            C129942bq a = C69664n.m101061g(bnVar, "builder");
            C129939bn bnVar2 = a.f356411a;
            bnVar2.copyOnWrite();
            C129940bo boVar = (C129940bo) bnVar2.instance;
            boVar.f356410b = wVar;
            boVar.f356409a = 2;
            bVar.mo109296b(a.mo109348a());
        }
    }
}
