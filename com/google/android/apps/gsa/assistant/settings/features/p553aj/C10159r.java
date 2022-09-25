package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.app.AlertDialog;
import android.widget.CompoundButton;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.r */
/* compiled from: PG */
public final /* synthetic */ class C10159r implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10166y f34545a;

    public /* synthetic */ C10159r(C10166y yVar) {
        this.f34545a = yVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C10166y yVar = this.f34545a;
        C58976aa aaVar = C58975e.f156826a;
        if (!z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(yVar.f34562j);
            builder.setTitle(R.string.personalization_confirmation_dialog_title).setMessage(R.string.personalization_confirmation_dialog_message).setOnDismissListener(new C10154m(yVar)).setPositiveButton(R.string.personalization_confirmation_dialog_turn_off, new C10165x(yVar)).setNegativeButton(R.string.personalization_confirmation_dialog_cancel, new C10164w(yVar));
            builder.create().show();
            return;
        }
        if (yVar.f34567o) {
            yVar.f34567o = false;
            yVar.f34565m.b(false);
        }
        yVar.mo18308f(true);
        if (yVar.f34568p) {
            yVar.f34566n.a();
        }
    }
}
