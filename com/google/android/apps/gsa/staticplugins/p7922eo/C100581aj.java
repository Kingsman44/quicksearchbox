package com.google.android.apps.gsa.staticplugins.p7922eo;

import android.content.Context;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119053i;
import com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6519al.p6743l.C85516a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.speech.audio.C92214y;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.aj */
/* compiled from: PG */
final class C100581aj implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C85422c f281221a;

    /* renamed from: b */
    final /* synthetic */ Query f281222b;

    /* renamed from: c */
    final /* synthetic */ ClientConfig f281223c;

    /* renamed from: d */
    final /* synthetic */ C100585an f281224d;

    public C100581aj(C100585an anVar, C85422c cVar, Query query, ClientConfig clientConfig) {
        this.f281224d = anVar;
        this.f281221a = cVar;
        this.f281222b = query;
        this.f281223c = clientConfig;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C58887cx.m90979f(th, Error.class);
        C59104x c = C100585an.f281229a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VSWorkerHelper");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(33694)).mo56386p("Failed to get VoiceResult");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C119053i iVar = (C119053i) obj;
        C58976aa aaVar = C58975e.f156826a;
        C100585an anVar = this.f281224d;
        C100604bf bfVar = anVar.f281261w;
        C85422c cVar = this.f281221a;
        Query query = this.f281222b;
        ClientConfig clientConfig = this.f281223c;
        C100626w wVar = new C100626w(anVar);
        cVar.getClass();
        query.getClass();
        clientConfig.getClass();
        C85516a aVar = (C85516a) bfVar.f281308a.mo17428b();
        aVar.getClass();
        C22871g gVar = (C22871g) bfVar.f281309b.mo17428b();
        gVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) bfVar.f281310c).f184585a);
        a.getClass();
        Context context = (Context) bfVar.f281311d.mo17428b();
        context.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) bfVar.f281312e).f184585a);
        a2.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) bfVar.f281313f).f184585a);
        a3.getClass();
        C86124t tVar = (C86124t) bfVar.f281314g.mo17428b();
        tVar.getClass();
        C92214y yVar = (C92214y) bfVar.f281315h.mo17428b();
        yVar.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) bfVar.f281316i).f184585a);
        a4.getClass();
        C85710c cVar2 = (C85710c) bfVar.f281317j.mo17428b();
        cVar2.getClass();
        C100603be beVar = new C100603be(cVar, query, clientConfig, wVar, aVar, gVar, a, context, a2, a3, tVar, yVar, a4, cVar2);
        beVar.f281294b.mo28211k(iVar.f332140a.f332131l.f232931a, "Obtained suppress results signal.", new C100594aw(beVar));
        beVar.f281294b.mo28211k(iVar.f332140a.f332125f.f232931a, "Obtained recognized text.", new C100595ax(beVar));
        beVar.f281294b.mo28211k(iVar.f332140a.f332124e.f232931a, "Obtained noSpeechDetectedDone.", new C100601bc(beVar, iVar));
        beVar.f281294b.mo28211k(iVar.f332140a.f332122c.f232931a, "Obtained tts result.", new C100596ay(beVar));
        beVar.f281294b.mo28211k(iVar.f332140a.f332120a.f232931a, "Obtained SearchResult.", new C100599ba(beVar, iVar));
        beVar.f281294b.mo28211k(iVar.f332140a.f332133n.f232931a, "Obtained limited connectivity signal.", new C100602bd(beVar));
        beVar.mo91987a(iVar.f332140a.f332126g.f232931a, new C100586ao(beVar), "audio capture cancelled");
        beVar.mo91987a(iVar.f332140a.f332127h.f232931a, new C100587ap(beVar), "audio capture started");
        beVar.mo91987a(iVar.f332140a.f332130k.f232931a, new C100588aq(beVar), "no speech detected");
        beVar.mo91987a(iVar.f332140a.f332128i.f232931a, new C100589ar(beVar), "audio capture stopped");
        beVar.mo91987a(iVar.mo104102a(), new C100590as(beVar), "embedded recognizer has recognized query");
        beVar.mo91987a(iVar.f332140a.f332129j.f232931a, new C100591at(beVar), "start of speech detected");
        iVar.f332140a.f332137r.mo20440jJ(new C100592au(beVar));
    }
}
