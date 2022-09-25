package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.widget.SeekBar;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DeviceSettingsArgument;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.en */
/* compiled from: PG */
final class C93644en implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ ValyrianSliderSettingsArgumentView f261411a;

    public C93644en(ValyrianSliderSettingsArgumentView valyrianSliderSettingsArgumentView) {
        this.f261411a = valyrianSliderSettingsArgumentView;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f261411a.f261113b = i;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        ValyrianSliderSettingsArgumentView valyrianSliderSettingsArgumentView = this.f261411a;
        int i = valyrianSliderSettingsArgumentView.f261113b;
        if (i >= 0) {
            ((DeviceSettingsArgument) valyrianSliderSettingsArgumentView.f261447m).mo81297b(i);
            this.f261411a.f261444j.mo88007d();
        }
    }
}
