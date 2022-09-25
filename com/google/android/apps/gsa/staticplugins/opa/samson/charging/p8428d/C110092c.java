package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.c */
/* compiled from: PG */
public final /* synthetic */ class C110092c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110093d f306730a;

    /* renamed from: b */
    public final /* synthetic */ e f306731b;

    public /* synthetic */ C110092c(C110093d dVar, e eVar) {
        this.f306730a = dVar;
        this.f306731b = eVar;
    }

    public final void onClick(View view) {
        C110093d dVar = this.f306730a;
        e eVar = this.f306731b;
        C87565h hVar = new C87565h();
        hVar.f236507K = true;
        hVar.f236560f = 2;
        hVar.f236523a = "and.opa.cham";
        hVar.f236556b = eVar;
        if (!dVar.f306733b.mo79746e(C90126fx.f251313gU)) {
            hVar.f236501E = true;
            hVar.f236503G = true;
            Bundle a = hVar.mo81685a();
            if (dVar.f306734c.mo56113h()) {
                dVar.f306735d.mo98297a(true);
                ((C87568k) dVar.f306734c.mo56107c()).mo81688b(dVar.f306732a, a);
                return;
            }
            return;
        }
        Intent t = C87566i.m142321t(dVar.f306732a, hVar);
        t.setAction("com.google.android.googlequicksearchbox.action.CLASSIC_GSA_VOICE_SEARCH");
        dVar.f306732a.startActivity(t);
    }
}
