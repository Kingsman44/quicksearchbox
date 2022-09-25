package androidx.preference;

import android.widget.CompoundButton;

/* renamed from: androidx.preference.bc */
/* compiled from: PG */
final class C4004bc implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ SwitchPreference f12864a;

    public C4004bc(SwitchPreference switchPreference) {
        this.f12864a = switchPreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.f12864a.mo8351R(Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.f12864a.mo8391j(z);
        }
    }
}
