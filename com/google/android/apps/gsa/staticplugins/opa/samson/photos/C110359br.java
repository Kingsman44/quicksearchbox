package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.br */
/* compiled from: PG */
public final /* synthetic */ class C110359br implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110360bs f307584a;

    public /* synthetic */ C110359br(C110360bs bsVar) {
        this.f307584a = bsVar;
    }

    public final void onClick(View view) {
        C110360bs bsVar = this.f307584a;
        C87565h hVar = new C87565h();
        hVar.f236507K = true;
        hVar.f236560f = 2;
        if (bsVar.f307590f) {
            hVar.f236523a = "and.opa.cham";
            hVar.f236556b = e.ap;
        }
        if (!bsVar.f307586b.mo79746e(C90126fx.f251313gU)) {
            hVar.f236503G = true;
            hVar.f236500D = true;
            Bundle a = hVar.mo81685a();
            if (bsVar.f307587c.mo56113h()) {
                bsVar.f307588d.mo98297a(true);
                ((C87568k) bsVar.f307587c.mo56107c()).mo81688b(bsVar.f307589e.getContext(), a);
                return;
            }
            return;
        }
        Intent t = C87566i.m142321t(bsVar.f307585a, hVar);
        t.setAction("com.google.android.googlequicksearchbox.action.CLASSIC_GSA_VOICE_SEARCH");
        bsVar.f307585a.startActivity(t);
    }
}
