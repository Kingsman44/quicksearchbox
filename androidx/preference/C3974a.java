package androidx.preference;

import android.widget.CompoundButton;

/* renamed from: androidx.preference.a */
/* compiled from: PG */
final class C3974a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ CheckBoxPreference f12792a;

    public C3974a(CheckBoxPreference checkBoxPreference) {
        this.f12792a = checkBoxPreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.f12792a.mo8351R(Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.f12792a.mo8391j(z);
        }
    }
}
