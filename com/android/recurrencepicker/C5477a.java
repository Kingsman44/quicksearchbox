package com.android.recurrencepicker;

import android.widget.CompoundButton;

/* renamed from: com.android.recurrencepicker.a */
/* compiled from: PG */
final class C5477a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ RecurrencePickerBaseDialog f16613a;

    public C5477a(RecurrencePickerBaseDialog recurrencePickerBaseDialog) {
        this.f16613a = recurrencePickerBaseDialog;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        RecurrencePickerBaseDialog recurrencePickerBaseDialog = this.f16613a;
        recurrencePickerBaseDialog.f16578b.f16601a = z ? 1 : 0;
        recurrencePickerBaseDialog.mo11793d();
    }
}
