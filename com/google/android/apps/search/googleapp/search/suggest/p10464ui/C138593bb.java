package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import com.google.android.apps.search.googleapp.search.C137451g;
import com.google.android.apps.search.googleapp.search.srp.p10435e.C137770au;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138057n;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138058o;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138591p;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.bb */
/* compiled from: PG */
final class C138593bb implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C138558am f376930a;

    public C138593bb(C138558am amVar) {
        this.f376930a = amVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C138591p pVar = (C138591p) bVar;
        C138558am amVar = this.f376930a;
        if (!amVar.f376885z) {
            return C47392e.f123115a;
        }
        C137451g gVar = amVar.f376859F;
        gVar.getClass();
        if (gVar.f373851a.mo113824y(pVar.f376927a, pVar.f376928b, C137770au.ON_TOUCH)) {
            C138057n nVar = amVar.f376873n;
            C138058o oVar = nVar.f375630a;
            Duration ofNanos = Duration.ofNanos(nVar.f375631b.mo26872d());
            C37215b bVar2 = oVar.f375634a;
            C37252a d = C37182a.f98184hs.mo40811d(ofNanos.toNanos());
            ((C37253b) d).mo40795s("surface", "AGA");
            bVar2.mo19974a(d);
        }
        return C47392e.f123115a;
    }
}
