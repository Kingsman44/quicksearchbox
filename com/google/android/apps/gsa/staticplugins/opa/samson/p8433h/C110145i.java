package com.google.android.apps.gsa.staticplugins.opa.samson.p8433h;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.h.i */
/* compiled from: PG */
public final /* synthetic */ class C110145i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110161y f306916a;

    public /* synthetic */ C110145i(C110161y yVar) {
        this.f306916a = yVar;
    }

    public final void onClick(View view) {
        C110161y yVar = this.f306916a;
        C87565h hVar = new C87565h();
        hVar.f236507K = true;
        hVar.f236560f = 2;
        boolean z = yVar.f306963m;
        hVar.f236501E = z;
        if (z) {
            hVar.f236523a = "and.opa.cham";
            hVar.f236556b = e.ao;
        }
        if (!yVar.f306961k.mo79746e(C90126fx.f251313gU)) {
            hVar.f236503G = true;
            hVar.f236500D = true;
            Bundle a = hVar.mo81685a();
            if (yVar.f306960j.mo56113h()) {
                yVar.f306939G.mo98297a(true);
                ((C87568k) yVar.f306960j.mo56107c()).mo81688b(yVar.f306953c, a);
                return;
            }
            return;
        }
        Intent t = C87566i.m142321t(yVar.f306953c, hVar);
        t.setAction("com.google.android.googlequicksearchbox.action.CLASSIC_GSA_VOICE_SEARCH");
        yVar.f306953c.startActivity(t);
    }
}
