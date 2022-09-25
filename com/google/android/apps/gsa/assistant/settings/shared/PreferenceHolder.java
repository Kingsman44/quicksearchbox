package com.google.android.apps.gsa.assistant.settings.shared;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.googlequicksearchbox.R;

@ProguardMustNotDelete
/* compiled from: PG */
public class PreferenceHolder extends PreferenceGroup {
    public PreferenceHolder(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: U */
    public final boolean mo8354U() {
        return false;
    }

    /* renamed from: k */
    public final boolean mo8324k() {
        return !super.mo8354U();
    }

    public PreferenceHolder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceHolder(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceHolder(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f12718D = R.layout.assistant_preference_holder;
    }
}
