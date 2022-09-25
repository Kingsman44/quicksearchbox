package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83992d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.aa */
/* compiled from: PG */
public final /* synthetic */ class C108539aa implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108542ad f301959a;

    public /* synthetic */ C108539aa(C108542ad adVar) {
        this.f301959a = adVar;
    }

    public final void onClick(View view) {
        C108542ad adVar = this.f301959a;
        if (adVar.f301971f.mo77447a().isEmpty()) {
            adVar.mo77318iT().mo77312a();
            return;
        }
        C83992d dVar = (C83992d) adVar.f301971f.mo77447a().get(0);
        if (dVar instanceof C108541ac) {
            C108541ac acVar = (C108541ac) dVar;
            String str = acVar.f301963b;
            if (!adVar.f301969d.f302229b.contains(str)) {
                String str2 = acVar.f301962a;
                new AlertDialog.Builder(adVar.getActivity()).setTitle(R.string.warning_unsupported_music_provider_dialog_title).setMessage(adVar.getActivity().getString(R.string.warning_unsupported_music_provider_dialog_message, new Object[]{str2})).setPositiveButton(adVar.getActivity().getString(R.string.warning_unsupported_music_provider_dialog_positive_button_text), new C108540ab(adVar, str)).setNegativeButton(R.string.warning_unsupported_music_provider_dialog_negative_button_text, (DialogInterface.OnClickListener) null).create().show();
                return;
            }
            adVar.mo96977e(str);
            return;
        }
        C59104x c = C108542ad.f301967b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DefaultMediaSelection");
        ((C59052c) ((C59052c) c).mo56372aa(24119)).mo56389s("Unknown type item was selected: %s", dVar);
    }
}
