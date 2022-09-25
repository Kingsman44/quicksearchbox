package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.view.View;
import android.widget.RadioButton;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.du */
/* compiled from: PG */
public final /* synthetic */ class C108918du implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108925ea f302842a;

    public /* synthetic */ C108918du(C108925ea eaVar) {
        this.f302842a = eaVar;
    }

    public final void onClick(View view) {
        C108925ea eaVar = this.f302842a;
        RadioButton radioButton = (RadioButton) eaVar.f302864m.findViewById(R.id.personal_response_radio_group).findViewById(R.id.allow_personal_response);
        RadioButton radioButton2 = (RadioButton) eaVar.f302864m.findViewById(R.id.personal_response_radio_group).findViewById(R.id.disallow_personal_response);
        boolean isChecked = radioButton.isChecked();
        if (isChecked) {
            C89994f fVar = eaVar.f302855d;
            EventForDump.m147676e(5, "enable personal response");
            fVar.mo83837C(true);
        } else {
            C89994f fVar2 = eaVar.f302855d;
            EventForDump.m147676e(5, "disable personal response");
            fVar2.mo83837C(false);
        }
        int i = true != isChecked ? 69288 : 69287;
        if (true != isChecked) {
            radioButton = radioButton2;
        }
        C28292j jVar = new C28292j(i);
        jVar.mo33795i(5);
        C28295m.m52919e(radioButton, jVar);
        C89949q.m146521e(C28285c.m52881h(4, C28295m.m52916b(radioButton), eaVar.getView()), false);
        eaVar.mo77318iT().mo77312a();
    }
}
