package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.app.TimePickerDialog;
import android.widget.TimePicker;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.fx */
/* compiled from: PG */
final class C108975fx implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: a */
    final /* synthetic */ C108976fy f303022a;

    public C108975fx(C108976fy fyVar) {
        this.f303022a = fyVar;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        this.f303022a.f303023a.f303047l.set(11, i);
        this.f303022a.f303023a.f303047l.set(12, i2);
        this.f303022a.f303023a.mo97341j();
    }
}
