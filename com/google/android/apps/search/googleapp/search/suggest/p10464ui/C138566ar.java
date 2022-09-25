package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import com.google.android.apps.search.googleapp.search.suggest.C138125g;
import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138057n;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138068y;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138586k;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4552o.aod;
import com.google.common.p4552o.apd;
import com.google.protobuf.C62942bv;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.ar */
/* compiled from: PG */
final class C138566ar implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C138558am f376893a;

    public C138566ar(C138558am amVar) {
        this.f376893a = amVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C138586k kVar = (C138586k) bVar;
        C138558am amVar = this.f376893a;
        apd b = amVar.f376868i.mo114113b(amVar.f376854A.mo114315d(), aod.ENTER_KEY);
        amVar.f376864e.mo114047c(amVar.f376868i.mo114115d(Optional.empty()), aod.ENTER_KEY);
        C138057n nVar = amVar.f376873n;
        nVar.f375630a.mo114107e(b, Duration.ofNanos(nVar.f375631b.mo26872d()), "AGA");
        C69664n.m101061g(b, "searchboxStats");
        C138125g gVar = (C138125g) kVar.f376920b.toBuilder();
        gVar.mo114160b(C138068y.m224389e(b));
        C62942bv build = gVar.build();
        C69664n.m101060f(build, "queryCommitData.toBuilde…       )\n        .build()");
        C138127i iVar = (C138127i) build;
        String str = kVar.f376919a;
        C69664n.m101061g(str, "query");
        C69664n.m101061g(iVar, "queryCommitData");
        return C47392e.m84229a(new C138586k(str, iVar));
    }
}
