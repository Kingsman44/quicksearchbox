package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import com.google.android.apps.search.googleapp.p10527u.C139760a;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138579d;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4552o.aod;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.bf */
/* compiled from: PG */
final class C138597bf implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C138558am f376933a;

    public C138597bf(C138558am amVar) {
        this.f376933a = amVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C138558am amVar = this.f376933a;
        amVar.f376868i.mo114119i(((C138579d) bVar).f376909a);
        amVar.f376873n.mo114102a(amVar.f376868i.mo114113b(amVar.f376854A.mo114315d(), aod.CLICKED_SUGGESTION));
        amVar.f376864e.mo114047c(amVar.f376868i.mo114115d(Optional.empty()), aod.CLICKED_SUGGESTION);
        C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
        C139779t tVar = C139779t.HOME_SCREEN;
        fVar.copyOnWrite();
        C139767h hVar = (C139767h) fVar.instance;
        hVar.f379872b = tVar.f379907i;
        hVar.f379871a |= 1;
        fVar.copyOnWrite();
        C139767h hVar2 = (C139767h) fVar.instance;
        hVar2.f379871a |= 2;
        hVar2.f379873c = true;
        return C47392e.m84229a(new C139760a((C139767h) fVar.build()));
    }
}
