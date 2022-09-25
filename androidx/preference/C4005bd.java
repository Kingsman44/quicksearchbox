package androidx.preference;

import android.widget.CompoundButton;

/* renamed from: androidx.preference.bd */
/* compiled from: PG */
final class C4005bd implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ SwitchPreferenceCompat f12865a;

    public C4005bd(SwitchPreferenceCompat switchPreferenceCompat) {
        this.f12865a = switchPreferenceCompat;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.f12865a.mo8351R(Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.f12865a.mo8391j(z);
        }
    }
}
