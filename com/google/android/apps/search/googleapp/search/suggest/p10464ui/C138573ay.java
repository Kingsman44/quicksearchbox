package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.text.TextUtils;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138068y;
import com.google.android.apps.search.googleapp.search.suggest.p10453e.C138080b;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138585j;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.ay */
/* compiled from: PG */
final class C138573ay implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C138558am f376900a;

    public C138573ay(C138558am amVar) {
        this.f376900a = amVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C138585j jVar = (C138585j) bVar;
        C138558am amVar = this.f376900a;
        if (TextUtils.equals(C138080b.m224415a(jVar.f376916a.toString()), C138080b.m224415a(amVar.f376854A.mo114315d()))) {
            return C47392e.f123115a;
        }
        if (jVar.f376918c) {
            C138068y yVar = amVar.f376868i;
            Duration ofMillis = Duration.ofMillis(yVar.f375645a.mo26871c());
            yVar.f375653i = ofMillis;
            if (yVar.f375654j.isZero()) {
                yVar.f375654j = ofMillis;
            }
        }
        amVar.mo114335m(jVar.f376916a.toString(), jVar.f376917b);
        return C47392e.f123116b;
    }
}
