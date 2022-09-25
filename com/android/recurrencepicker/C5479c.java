package com.android.recurrencepicker;

import com.android.recurrencepicker.RecurrencePickerBaseDialog;

/* renamed from: com.android.recurrencepicker.c */
/* compiled from: PG */
final class C5479c extends C5483g {

    /* renamed from: a */
    final /* synthetic */ RecurrencePickerBaseDialog f16615a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5479c(RecurrencePickerBaseDialog recurrencePickerBaseDialog) {
        super(recurrencePickerBaseDialog, 5, 730);
        this.f16615a = recurrencePickerBaseDialog;
    }

    /* renamed from: a */
    public final void mo11808a(int i) {
        RecurrencePickerBaseDialog recurrencePickerBaseDialog = this.f16615a;
        RecurrencePickerBaseDialog.RecurrenceModel recurrenceModel = recurrencePickerBaseDialog.f16578b;
        if (recurrenceModel.f16606f != i) {
            recurrenceModel.f16606f = i;
            recurrencePickerBaseDialog.mo11796g();
            this.f16615a.f16582f.requestLayout();
        }
    }
}
