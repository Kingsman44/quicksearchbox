package com.google.android.apps.gsa.velvet.p8863ui.settings;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.preference.PreferenceActivity;
import android.widget.CompoundButton;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.n */
/* compiled from: PG */
final class C118675n implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ PreferenceActivity.Header f331058a;

    /* renamed from: b */
    final /* synthetic */ C118678q f331059b;

    public C118675n(C118678q qVar, PreferenceActivity.Header header) {
        this.f331059b = qVar;
        this.f331058a = header;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean equals = this.f331058a.fragmentArguments.getString("LAUNCHER_PREF_KEY").equals("pref_show_predictions");
        if (z || !equals) {
            this.f331059b.mo103856a(this.f331058a, z);
            return;
        }
        C118678q qVar = this.f331059b;
        PreferenceActivity.Header header = this.f331058a;
        compoundButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        compoundButton.setChecked(true);
        compoundButton.setOnCheckedChangeListener(this);
        new AlertDialog.Builder(qVar.getContext()).setTitle(R.string.homescreen_settings_title_predictions_prompt).setMessage(R.string.homescreen_settings_msg_predictions_prompt).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.homescreen_settings_action_turn_off, new C118676o(qVar, compoundButton, this, header)).show();
    }
}
