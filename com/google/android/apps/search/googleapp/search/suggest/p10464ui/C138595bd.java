package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import com.google.android.apps.search.googleapp.p10516t.p10521e.C139705e;
import com.google.android.apps.search.googleapp.search.suggest.C138022an;
import com.google.android.apps.search.googleapp.search.suggest.C138025aq;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137929ao;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138577b;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.C138509a;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.C138539k;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.C138540l;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.C138541m;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.C138522k;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.C138523l;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.aod;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.bd */
/* compiled from: PG */
final class C138595bd implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C138558am f376932a;

    public C138595bd(C138558am amVar) {
        this.f376932a = amVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C138577b bVar2 = (C138577b) bVar;
        C138558am amVar = this.f376932a;
        amVar.f376875p.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(amVar.mo114323a()));
        C138030av avVar = bVar2.f376907b;
        amVar.f376868i.mo114119i(avVar);
        try {
            if (bVar2.f376906a != null) {
                amVar.mo114326d().mo114407i();
                C138509a aVar = amVar.f376882w;
                C138522k kVar = new C138522k((C138523l) aVar, bVar2.f376906a, avVar);
                C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(kVar), ((C138523l) aVar).f376776b), "Failed to start activity for clicked app suggestion.", new Object[0]);
                C138541m mVar = ((C137929ao) amVar.f376864e).f375264f;
                C138025aq aqVar = avVar.f375548l;
                if (aqVar == null) {
                    aqVar = C138025aq.f375512e;
                }
                C138022an anVar = aqVar.f375516c;
                if (anVar == null) {
                    anVar = C138022an.f375501e;
                }
                if ((anVar.f375503a & 2) != 0) {
                    C138025aq aqVar2 = avVar.f375548l;
                    if (aqVar2 == null) {
                        aqVar2 = C138025aq.f375512e;
                    }
                    C138022an anVar2 = aqVar2.f375516c;
                    if (anVar2 == null) {
                        anVar2 = C138022an.f375501e;
                    }
                    UsageInfo usageInfo = new UsageInfo(new DocumentId("com.google.android.gms", "internal.3p:MobileApplication", anVar2.f375505c), mVar.f376809b.mo26870b());
                    C146006ab a = mVar.f376810c.mo117679a(usageInfo);
                    C146014aj ajVar = (C146014aj) a;
                    ajVar.mo122495n(C146013ai.f394700a, C138539k.f376806a);
                    C146014aj ajVar2 = (C146014aj) a;
                    ajVar2.mo122494m(C146013ai.f394700a, C138540l.f376807a);
                }
            } else {
                ((C58970a) ((C58970a) C138558am.f376853a.mo56225c()).mo56372aa(41271)).mo56386p("Cannot open empty Intent to handle app suggestion click.");
                amVar.mo114328f();
            }
        } catch (Exception e) {
            ((C58970a) ((C58970a) ((C58970a) C138558am.f376853a.mo56225c()).mo56382g(e)).mo56372aa(41272)).mo56389s("event.getIntent() = %s", bVar2.f376906a);
            amVar.mo114328f();
        }
        amVar.f376873n.mo114102a(amVar.f376868i.mo114113b(amVar.f376854A.mo114315d(), aod.CLICKED_SUGGESTION));
        if (C139705e.m227143a(amVar.f376854A.mo114313b()) && amVar.f376861b.getActivity() != null) {
            amVar.f376861b.getActivity().finish();
        }
        amVar.f376864e.mo114047c(amVar.f376868i.mo114115d(Optional.empty()), aod.CLICKED_SUGGESTION);
        return C47392e.f123115a;
    }
}
