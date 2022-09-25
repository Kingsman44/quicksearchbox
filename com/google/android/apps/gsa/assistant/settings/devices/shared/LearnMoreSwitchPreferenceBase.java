package com.google.android.apps.gsa.assistant.settings.devices.shared;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.C3998ax;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public abstract class LearnMoreSwitchPreferenceBase extends SwitchPreferenceCompat {
    public LearnMoreSwitchPreferenceBase(Context context) {
        super(context);
    }

    /* renamed from: Y */
    public final void mo8358Y(Object obj) {
        mo8346M(mo17869ag());
        String string = this.f12738j.getString(R.string.personal_info_and_suggestions_learn_more);
        String string2 = this.f12738j.getString(mo17868af(), new Object[]{string});
        String string3 = this.f12738j.getString(mo17867ae());
        SpannableString spannableString = new SpannableString(string2);
        int indexOf = spannableString.toString().indexOf(string);
        spannableString.setSpan(new C9731d(this.f12738j, string3), indexOf, string.length() + indexOf, 33);
        mo8329n(spannableString);
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        TextView textView = (TextView) axVar.mo8435a(16908304);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setClickable(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public abstract int mo17867ae();

    /* access modifiers changed from: protected */
    /* renamed from: af */
    public abstract int mo17868af();

    /* access modifiers changed from: protected */
    /* renamed from: ag */
    public abstract int mo17869ag();

    public LearnMoreSwitchPreferenceBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LearnMoreSwitchPreferenceBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LearnMoreSwitchPreferenceBase(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
