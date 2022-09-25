package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116423b;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.k */
/* compiled from: PG */
public final /* synthetic */ class C116458k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Interstitial f322914a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f322915b;

    /* renamed from: c */
    public final /* synthetic */ EditText f322916c;

    public /* synthetic */ C116458k(Interstitial interstitial, AlertDialog alertDialog, EditText editText) {
        this.f322914a = interstitial;
        this.f322915b = alertDialog;
        this.f322916c = editText;
    }

    public final void onClick(View view) {
        Interstitial interstitial = this.f322914a;
        AlertDialog alertDialog = this.f322915b;
        EditText editText = this.f322916c;
        alertDialog.dismiss();
        String trim = editText.getText().toString().replaceAll("[\t\r\n]", BuildConfig.FLAVOR).trim();
        for (C116424c cVar : interstitial.f322861c) {
            if (cVar.f322820d.equalsIgnoreCase(trim)) {
                interstitial.f322868j.f322941a.mo102717j(cVar, false);
                return;
            }
        }
        C116423b bVar = (C116423b) C116424c.f322815o.createBuilder();
        bVar.copyOnWrite();
        trim.getClass();
        ((C116424c) bVar.instance).f322820d = trim;
        interstitial.f322868j.f322941a.mo102717j((C116424c) bVar.build(), true);
    }
}
