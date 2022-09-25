package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.widget.SeekBar;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DeviceSettingsArgument;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.do */
/* compiled from: PG */
final class C93618do implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ SliderSettingsArgumentView f261354a;

    public C93618do(SliderSettingsArgumentView sliderSettingsArgumentView) {
        this.f261354a = sliderSettingsArgumentView;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f261354a.f261096b = i;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        SliderSettingsArgumentView sliderSettingsArgumentView = this.f261354a;
        int i = sliderSettingsArgumentView.f261096b;
        if (i >= 0) {
            ((DeviceSettingsArgument) sliderSettingsArgumentView.f261447m).mo81297b(i);
            this.f261354a.f261444j.mo88007d();
        }
    }
}
