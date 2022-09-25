package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.widget.SeekBar;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.by */
/* compiled from: PG */
final class C108254by implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ DiscreteSliderSettingCard f301148a;

    public C108254by(DiscreteSliderSettingCard discreteSliderSettingCard) {
        this.f301148a = discreteSliderSettingCard;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f301148a.f300891c = i;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        DiscreteSliderSettingCard discreteSliderSettingCard = this.f301148a;
        int i = discreteSliderSettingCard.f300891c;
        if (i >= 0) {
            discreteSliderSettingCard.f301432i.mo83087h(Float.toString(((Float) discreteSliderSettingCard.f300890b.get(i)).floatValue()));
            this.f301148a.mo96540d();
        }
    }
}
