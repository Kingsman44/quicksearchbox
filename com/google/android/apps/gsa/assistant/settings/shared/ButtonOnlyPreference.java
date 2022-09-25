package com.google.android.apps.gsa.assistant.settings.shared;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.preference.C3998ax;
import androidx.preference.Preference;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.googlequicksearchbox.R;

@ProguardMustNotDelete
/* compiled from: PG */
public class ButtonOnlyPreference extends Preference {
    public ButtonOnlyPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12718D = R.layout.assistant_settings_button_preference;
        this.f12751w = false;
        mo8360aa();
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        axVar.itemView.setOnClickListener((View.OnClickListener) null);
        ((Button) axVar.mo8435a(16908310)).setOnClickListener(new C73759n(this));
        axVar.f12846c = true;
        axVar.f12847d = true;
    }
}
