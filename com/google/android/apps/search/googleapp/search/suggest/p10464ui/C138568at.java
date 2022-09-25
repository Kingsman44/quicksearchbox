package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import com.google.android.apps.search.googleapp.search.suggest.C138016ah;
import com.google.android.apps.search.googleapp.search.suggest.C138019ak;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138057n;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10465a.C138545a;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138590o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.at */
/* compiled from: PG */
final class C138568at implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C138558am f376895a;

    public C138568at(C138558am amVar) {
        this.f376895a = amVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C138558am amVar = this.f376895a;
        amVar.f376875p.mo33853c(C28442l.m53139e().mo33894a(), C28485y.m53234a(amVar.mo114323a()));
        C138019ak akVar = ((C138590o) bVar).f376926a;
        C138545a aVar = amVar.f376854A;
        C138030av avVar = akVar.f375493b;
        if (avVar == null) {
            avVar = C138030av.f375536m;
        }
        C69664n.m101061g(avVar, "suggestion");
        if (aVar.f376827f.mo50378a(avVar) != null) {
            C138016ah ahVar = (C138016ah) C138019ak.f375490i.createBuilder();
            ahVar.copyOnWrite();
            C138019ak akVar2 = (C138019ak) ahVar.instance;
            akVar2.f375494c = 2;
            akVar2.f375492a = 2 | akVar2.f375492a;
            C138030av avVar2 = akVar.f375493b;
            if (avVar2 == null) {
                avVar2 = C138030av.f375536m;
            }
            ahVar.copyOnWrite();
            C138019ak akVar3 = (C138019ak) ahVar.instance;
            avVar2.getClass();
            akVar3.f375493b = avVar2;
            akVar3.f375492a |= 1;
            String string = amVar.f376861b.getContext().getString(R.string.googleapp_suggestion_history_deletion_in_progress_message);
            ahVar.copyOnWrite();
            C138019ak akVar4 = (C138019ak) ahVar.instance;
            string.getClass();
            akVar4.f375492a |= 4;
            akVar4.f375495d = string;
            akVar = (C138019ak) ahVar.build();
        }
        C138016ah ahVar2 = (C138016ah) akVar.toBuilder();
        String d = amVar.f376854A.mo114315d();
        ahVar2.copyOnWrite();
        C138019ak akVar5 = (C138019ak) ahVar2.instance;
        akVar5.f375492a |= 64;
        akVar5.f375499h = d;
        AccountId accountId = amVar.f376863d;
        C138613o oVar = new C138613o();
        C68324h.m98669f(oVar);
        C47247a.m84047b(oVar, accountId);
        C47243l.m84039a(oVar, (C138019ak) ahVar2.build());
        oVar.showNow(amVar.f376861b.getChildFragmentManager(), "suggestionDialog");
        C138057n nVar = amVar.f376873n;
        nVar.f375630a.mo114108f(Duration.ofNanos(nVar.f375631b.mo26872d()), "AGA");
        return C47392e.f123115a;
    }
}
