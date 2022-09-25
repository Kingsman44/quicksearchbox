package com.android.datetimepicker.date;

import android.app.DatePickerDialog;
import android.widget.DatePicker;

/* renamed from: com.android.datetimepicker.date.f */
/* compiled from: PG */
public final class C5083f implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a */
    private final C5084g f16236a;

    public C5083f(C5084g gVar) {
        this.f16236a = gVar;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.f16236a.mo10090a(i, i2, i3);
    }
}
