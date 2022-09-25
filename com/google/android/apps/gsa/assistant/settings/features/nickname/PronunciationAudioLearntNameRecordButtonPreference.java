package com.google.android.apps.gsa.assistant.settings.features.nickname;

import android.content.Context;
import android.widget.Button;
import androidx.preference.C3998ax;
import androidx.preference.Preference;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class PronunciationAudioLearntNameRecordButtonPreference extends Preference {

    /* renamed from: a */
    public int f194067a = -1;

    public PronunciationAudioLearntNameRecordButtonPreference(Context context) {
        super(context);
        this.f12718D = R.layout.pronunciation_audio_learnt_name_record_button;
        this.f12751w = false;
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        int i;
        super.mo8313a(axVar);
        Button button = (Button) axVar.mo8435a(R.id.record);
        if (!(button == null || (i = this.f194067a) == -1)) {
            button.setText(i);
        }
        axVar.f12846c = false;
        axVar.f12847d = false;
    }
}
