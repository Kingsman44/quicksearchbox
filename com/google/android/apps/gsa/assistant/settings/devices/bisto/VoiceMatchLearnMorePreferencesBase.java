package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.C3998ax;
import androidx.preference.Preference;

/* compiled from: PG */
public class VoiceMatchLearnMorePreferencesBase extends Preference {
    public VoiceMatchLearnMorePreferencesBase(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        TextView textView = (TextView) axVar.mo8435a(16908304);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setClickable(true);
    }

    public VoiceMatchLearnMorePreferencesBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMatchLearnMorePreferencesBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VoiceMatchLearnMorePreferencesBase(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
