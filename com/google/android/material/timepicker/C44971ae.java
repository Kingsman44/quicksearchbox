package com.google.android.material.timepicker;

import com.google.android.googlequicksearchbox.R;
import com.google.android.material.button.C44577g;

/* renamed from: com.google.android.material.timepicker.ae */
/* compiled from: PG */
public final /* synthetic */ class C44971ae implements C44577g {

    /* renamed from: a */
    public final /* synthetic */ TimePickerView f117541a;

    public /* synthetic */ C44971ae(TimePickerView timePickerView) {
        this.f117541a = timePickerView;
    }

    /* renamed from: a */
    public final void mo47592a(int i, boolean z) {
        C44976aj ajVar;
        TimePickerView timePickerView = this.f117541a;
        if (z && (ajVar = timePickerView.f117523f) != null) {
            ((C44997u) ajVar).f117591b.mo48634f(i == R.id.material_clock_period_pm_button ? 1 : 0);
        }
    }
}
