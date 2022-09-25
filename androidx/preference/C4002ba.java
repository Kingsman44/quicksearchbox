package androidx.preference;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;

/* renamed from: androidx.preference.ba */
/* compiled from: PG */
final class C4002ba implements View.OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ SeekBarPreference f12863a;

    public C4002ba(SeekBarPreference seekBarPreference) {
        this.f12863a = seekBarPreference;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.f12863a;
        if ((!seekBarPreference.f12772e && (i == 21 || i == 22)) || i == 23 || i == 66) {
            return false;
        }
        SeekBar seekBar = seekBarPreference.f12771d;
        if (seekBar != null) {
            return seekBar.onKeyDown(i, keyEvent);
        }
        Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
        return false;
    }
}
