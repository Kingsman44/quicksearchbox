package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138057n;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138582g;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4552o.aod;
import com.google.common.p4552o.apd;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.bc */
/* compiled from: PG */
final class C138594bc implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C138558am f376931a;

    public C138594bc(C138558am amVar) {
        this.f376931a = amVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C138558am amVar = this.f376931a;
        amVar.f376875p.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(amVar.mo114323a()));
        amVar.f376868i.mo114119i(((C138582g) bVar).f376913b);
        apd b = amVar.f376868i.mo114113b(amVar.f376854A.mo114315d(), aod.CLICKED_SUGGESTION);
        C138057n nVar = amVar.f376873n;
        nVar.f375630a.mo114110h(b, Duration.ofNanos(nVar.f375631b.mo26872d()), "AGA");
        amVar.f376864e.mo114047c(amVar.f376868i.mo114115d(Optional.empty()), aod.CLICKED_SUGGESTION);
        return C47392e.f123116b;
    }
}
