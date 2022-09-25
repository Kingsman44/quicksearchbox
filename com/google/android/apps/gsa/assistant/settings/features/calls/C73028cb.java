package com.google.android.apps.gsa.assistant.settings.features.calls;

import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.calls.cb */
/* compiled from: PG */
public final /* synthetic */ class C73028cb implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ cr f193675a;

    /* renamed from: b */
    public final /* synthetic */ C73042o f193676b;

    public /* synthetic */ C73028cb(cr crVar, C73042o oVar) {
        this.f193675a = crVar;
        this.f193676b = oVar;
    }

    public final void onClick(View view) {
        cr crVar = this.f193675a;
        C73042o oVar = this.f193676b;
        Dialog dialog = new Dialog(oVar.f12738j);
        dialog.setContentView(R.layout.calls_edit_phone_number_dialog);
        dialog.findViewById(R.id.calls_change_phone_number).setOnClickListener(new C73025by(crVar, dialog, oVar));
        dialog.findViewById(R.id.calls_use_unlisted_number).setOnClickListener(new C73026bz(crVar, oVar, dialog));
        ((Button) dialog.findViewById(R.id.cancel_button)).setOnClickListener(new C73027ca(dialog));
        dialog.show();
    }
}
