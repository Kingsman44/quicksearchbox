package com.google.android.apps.gsa.assistant.settings.features.p5710az;

import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.EditText;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.assistant.p3861at.ago;
import com.google.assistant.p3861at.agp;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.az.c */
/* compiled from: PG */
public final /* synthetic */ class C72970c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C72975d f193609a;

    public /* synthetic */ C72970c(C72975d dVar) {
        this.f193609a = dVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C72975d dVar = this.f193609a;
        Dialog dialog = dVar.f193613a.getDialog();
        dialog.getClass();
        EditText editText = (EditText) dialog.findViewById(R.id.add_custom_salsa_edit_text);
        ago ago = (ago) agp.f129237k.createBuilder();
        String obj = editText.getText().toString();
        ago.copyOnWrite();
        agp agp = (agp) ago.instance;
        obj.getClass();
        agp.f129239a |= 1;
        agp.f129240b = obj;
        String obj2 = editText.getText().toString();
        ago.copyOnWrite();
        agp agp2 = (agp) ago.instance;
        obj2.getClass();
        agp2.f129239a |= 512;
        agp2.f129248j = obj2;
        String obj3 = editText.getText().toString();
        ago.copyOnWrite();
        agp agp3 = (agp) ago.instance;
        obj3.getClass();
        agp3.f129239a |= 16;
        agp3.f129244f = obj3;
        ago.copyOnWrite();
        agp agp4 = (agp) ago.instance;
        agp4.f129241c = 2;
        agp4.f129239a = 2 | agp4.f129239a;
        String x = dVar.f193614b.mo79758x(C90082eg.f250039cw);
        ago.copyOnWrite();
        agp agp5 = (agp) ago.instance;
        x.getClass();
        agp5.f129239a |= 4;
        agp5.f129242d = x;
        C47393f.m84235f(new n((agp) ago.build()), dVar.f193613a);
    }
}
