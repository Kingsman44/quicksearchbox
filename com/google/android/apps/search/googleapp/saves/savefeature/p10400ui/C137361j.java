package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.widget.Button;
import android.widget.EditText;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10401a.C137305c;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.j */
/* compiled from: PG */
public final /* synthetic */ class C137361j implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C137365n f373637a;

    /* renamed from: b */
    public final /* synthetic */ EditText f373638b;

    public /* synthetic */ C137361j(C137365n nVar, EditText editText) {
        this.f373637a = nVar;
        this.f373638b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C137365n nVar = this.f373637a;
        EditText editText = this.f373638b;
        Button button = ((C0392m) nVar.f373643a.requireDialog()).f1349a.f1110j;
        nVar.f373645c.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(button));
        C47393f.m84237h(new C137305c(editText.getText().toString().replaceAll("[\t\r\n]", BuildConfig.FLAVOR).trim()), button);
    }
}
