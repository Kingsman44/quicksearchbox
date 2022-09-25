package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.shared;

import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.shared.b */
/* compiled from: PG */
public final /* synthetic */ class C109858b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C109859c f306104a;

    public /* synthetic */ C109858b(C109859c cVar) {
        this.f306104a = cVar;
    }

    public final void onClick(View view) {
        C109859c cVar = this.f306104a;
        if (cVar.f306106a) {
            cVar.f306107b.setImageResource(R.drawable.quantum_ic_keyboard_arrow_down_grey600_24);
            ((TextView) cVar.findViewById(R.id.consent_content_additional_text)).setVisibility(8);
        } else {
            cVar.f306107b.setImageResource(R.drawable.quantum_ic_keyboard_arrow_up_grey600_24);
            ((TextView) cVar.findViewById(R.id.consent_content_additional_text)).setVisibility(0);
        }
        cVar.f306106a = !cVar.f306106a;
    }
}
