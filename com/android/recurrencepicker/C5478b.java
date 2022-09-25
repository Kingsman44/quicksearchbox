package com.android.recurrencepicker;

/* renamed from: com.android.recurrencepicker.b */
/* compiled from: PG */
final class C5478b extends C5483g {

    /* renamed from: a */
    final /* synthetic */ RecurrencePickerBaseDialog f16614a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5478b(RecurrencePickerBaseDialog recurrencePickerBaseDialog) {
        super(recurrencePickerBaseDialog, 1, 99);
        this.f16614a = recurrencePickerBaseDialog;
    }

    /* renamed from: a */
    public final void mo11808a(int i) {
        RecurrencePickerBaseDialog recurrencePickerBaseDialog = this.f16614a;
        if (recurrencePickerBaseDialog.f16580d != -1 && recurrencePickerBaseDialog.f16579c.getText().toString().length() > 0) {
            RecurrencePickerBaseDialog recurrencePickerBaseDialog2 = this.f16614a;
            recurrencePickerBaseDialog2.f16578b.f16603c = i;
            recurrencePickerBaseDialog2.mo11797h();
            this.f16614a.f16579c.requestLayout();
        }
    }
}
