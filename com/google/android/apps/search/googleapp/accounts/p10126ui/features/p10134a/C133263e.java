package com.google.android.apps.search.googleapp.accounts.p10126ui.features.p10134a;

import android.view.View;
import android.widget.CheckBox;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.C133221d;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.C133231n;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.a.e */
/* compiled from: PG */
final class C133263e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C133262d f363208a;

    public C133263e(C133262d dVar) {
        this.f363208a = dVar;
    }

    public final void onClick(View view) {
        C133262d dVar = this.f363208a;
        CheckBox checkBox = (CheckBox) dVar.f363202b.requireDialog().findViewById(R.id.googleapp_interstitial_do_not_show_checkbox);
        if (checkBox != null && checkBox.isChecked()) {
            C133231n nVar = dVar.f363203c;
            nVar.f363133n.mo50787a(nVar.f363126g.mo46039a(new C133221d(), nVar.f363127h), C133231n.f363123d);
        }
        dVar.mo111056b();
    }
}
