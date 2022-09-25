package com.google.android.apps.gsa.assistant.settings.features.car.preferences;

import android.content.Context;
import androidx.preference.C3998ax;
import androidx.preference.Preference;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class SectionHeaderPreference extends Preference {

    /* renamed from: a */
    public boolean f193746a;

    public SectionHeaderPreference(Context context, int i) {
        super(context);
        this.f12718D = R.layout.car_section_header_preference;
        this.f12751w = false;
        mo8346M(i);
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        axVar.mo8435a(R.id.top_divider).setVisibility(true != this.f193746a ? 8 : 0);
    }
}
