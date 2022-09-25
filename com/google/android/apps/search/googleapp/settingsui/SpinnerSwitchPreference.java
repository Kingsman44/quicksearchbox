package com.google.android.apps.search.googleapp.settingsui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.Switch;
import androidx.preference.C3998ax;
import androidx.preference.SwitchPreference;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class SpinnerSwitchPreference extends SwitchPreference {

    /* renamed from: c */
    public boolean f378423c;

    /* renamed from: d */
    public boolean f378424d = true;

    public SpinnerSwitchPreference(Context context) {
        super(context, (AttributeSet) null);
        this.f12719E = R.layout.googleapp_progress_spinner_switch;
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        Switch switchR = (Switch) axVar.mo8435a(16908352);
        ProgressBar progressBar = (ProgressBar) axVar.mo8435a(R.id.googleapp_setting_progress_spinner);
        if (this.f378423c) {
            switchR.setVisibility(4);
            progressBar.setVisibility(0);
        } else {
            switchR.setVisibility(0);
            progressBar.setVisibility(4);
        }
        if (!this.f378424d) {
            switchR.jumpDrawablesToCurrentState();
            this.f378424d = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo8315c() {
        if (!this.f378423c) {
            super.mo8315c();
        }
    }

    public SpinnerSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12719E = R.layout.googleapp_progress_spinner_switch;
    }
}
