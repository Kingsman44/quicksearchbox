package androidx.preference;

import android.widget.SeekBar;

/* renamed from: androidx.preference.az */
/* compiled from: PG */
final class C4000az implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ SeekBarPreference f12862a;

    public C4000az(SeekBarPreference seekBarPreference) {
        this.f12862a = seekBarPreference;
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f12862a.f12770c = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f12862a.f12770c = false;
        int progress = seekBar.getProgress();
        SeekBarPreference seekBarPreference = this.f12862a;
        if (progress + seekBarPreference.f12769b != seekBarPreference.f12768a) {
            seekBarPreference.mo8386l(seekBar);
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            SeekBarPreference seekBarPreference = this.f12862a;
            if (seekBarPreference.f12773f || !seekBarPreference.f12770c) {
                seekBarPreference.mo8386l(seekBar);
                return;
            }
        }
        SeekBarPreference seekBarPreference2 = this.f12862a;
        seekBarPreference2.mo8387o(i + seekBarPreference2.f12769b);
    }
}
