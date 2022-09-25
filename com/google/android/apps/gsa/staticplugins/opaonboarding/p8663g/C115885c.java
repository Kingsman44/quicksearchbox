package com.google.android.apps.gsa.staticplugins.opaonboarding.p8663g;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.g.c */
/* compiled from: PG */
public final /* synthetic */ class C115885c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115891i f321338a;

    public /* synthetic */ C115885c(C115891i iVar) {
        this.f321338a = iVar;
    }

    public final void onClick(View view) {
        C115891i iVar = this.f321338a;
        C59104x b = C115891i.f321341b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PersonalResultsAlone");
        ((C59052c) ((C59052c) b).mo56372aa(30142)).mo56386p("Personal results are enabled.");
        iVar.f321343d = true;
        Activity activity = iVar.getActivity();
        if (activity != null) {
            C115894l lVar = iVar.f321342c;
            if (lVar.f321354b) {
                new AlertDialog.Builder(activity).setMessage(R.string.personal_results_enabled_explanation).setTitle(R.string.personal_results_enabled_title).setPositiveButton(R.string.personal_results_enabled_positive_button, new C115883a(iVar)).show();
            } else if (lVar.f321361i) {
                new AlertDialog.Builder(activity).setMessage(R.string.personal_results_enabled_explanation_voicematch_not_available).setNegativeButton(R.string.cancel_enable_personal_results_voicematch_not_available, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.continue_enable_personal_results_voicematch_not_available, new C115884b(iVar)).show().getButton(-2).setTextColor(iVar.getResources().getColor(R.color.agsa_color_on_background_variant));
            } else {
                iVar.mo102303e(true);
                iVar.mo102304g(true);
            }
        }
    }
}
