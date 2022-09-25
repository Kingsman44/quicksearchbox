package com.google.android.apps.gsa.assistant.settings.features.nickname;

import android.content.Context;
import android.widget.Button;
import androidx.preference.C3998ax;
import androidx.preference.Preference;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class PronunciationNamePlayButtonPreference extends Preference {

    /* renamed from: a */
    public boolean f194068a = true;

    public PronunciationNamePlayButtonPreference(Context context) {
        super(context);
        this.f12718D = R.layout.pronunciation_name_play_button;
        this.f12751w = false;
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        Button button = (Button) axVar.mo8435a(R.id.play);
        if (button != null) {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f194068a) {
                button.setAlpha(1.0f);
            } else {
                button.setAlpha(0.3f);
            }
        }
        axVar.f12846c = false;
    }
}
