package com.google.android.apps.gsa.assistant.settings.features.people;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50202oi;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.people.x */
/* compiled from: PG */
public final /* synthetic */ class C73475x implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ba f194486a;

    public /* synthetic */ C73475x(ba baVar) {
        this.f194486a = baVar;
    }

    public final void onClick(View view) {
        ba baVar = this.f194486a;
        baVar.H = 0;
        baVar.I = 0;
        baVar.G = 0;
        if (baVar.v == 0) {
            db dbVar = baVar.J;
            dbVar.copyOnWrite();
            dl dlVar = dbVar.instance;
            dl dlVar2 = dl.M;
            dlVar.u = null;
            dlVar.a &= -2049;
        } else {
            db dbVar2 = baVar.J;
            C50202oi oiVar = C50202oi.f130501h;
            dbVar2.copyOnWrite();
            dl dlVar3 = dbVar2.instance;
            dl dlVar4 = dl.M;
            oiVar.getClass();
            dlVar3.u = oiVar;
            dlVar3.a |= 2048;
        }
        baVar.g();
        baVar.j.findViewById(R.id.assistant_settings_people_birthday_clear_button).setVisibility(8);
    }
}
