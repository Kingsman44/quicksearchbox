package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9538d.C127170c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129855b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129935bj;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129936bk;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129939bn;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129940bo;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129942bq;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.i */
/* compiled from: PG */
final class C129997i implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C129868c f356516a;

    public C129997i(C129868c cVar) {
        this.f356516a = cVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C127170c cVar = (C127170c) obj;
        if (cVar != null && !cVar.mo107982c()) {
            C129855b bVar = this.f356516a.f356287n;
            C129939bn bnVar = (C129939bn) C129940bo.f356407c.createBuilder();
            C69664n.m101060f(bnVar, "newBuilder()");
            C129942bq a = C69664n.m101061g(bnVar, "builder");
            C129935bj bjVar = (C129935bj) C129936bk.f356397d.createBuilder();
            C69664n.m101060f(bjVar, "newBuilder()");
            C69664n.m101061g(bjVar, "builder");
            String str = cVar.f350108b.f333869c;
            C69664n.m101060f(str, "state.language");
            C69664n.m101061g(str, "value");
            bjVar.copyOnWrite();
            C129936bk bkVar = (C129936bk) bjVar.instance;
            str.getClass();
            bkVar.f356399a |= 1;
            bkVar.f356401c = str;
            C62942bv build = bjVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C129936bk bkVar2 = (C129936bk) build;
            C69664n.m101061g(bkVar2, "value");
            C129939bn bnVar2 = a.f356411a;
            bnVar2.copyOnWrite();
            C129940bo boVar = (C129940bo) bnVar2.instance;
            bkVar2.getClass();
            boVar.f356410b = bkVar2;
            boVar.f356409a = 5;
            bVar.mo109296b(a.mo109348a());
        }
    }
}
