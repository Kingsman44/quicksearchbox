package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119052h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.am */
/* compiled from: PG */
final class C106333am extends C57975a {

    /* renamed from: a */
    final /* synthetic */ C22871g f296651a;

    /* renamed from: b */
    final /* synthetic */ C119052h f296652b;

    public C106333am(C22871g gVar, C119052h hVar) {
        this.f296651a = gVar;
        this.f296652b = hVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        this.f296651a.mo28212l("ContextualCardData#onNext", new C106332al(this.f296652b, (C63088z) obj));
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        C59104x c = C106334an.f296653a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VoiceResultModule");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(25309)).mo56386p("Failed to add contextual card data in VoiceResult");
    }
}
