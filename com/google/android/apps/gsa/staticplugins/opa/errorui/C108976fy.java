package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.app.TimePickerDialog;
import android.text.format.DateFormat;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.fy */
/* compiled from: PG */
final class C108976fy implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C108980gb f303023a;

    public C108976fy(C108980gb gbVar) {
        this.f303023a = gbVar;
    }

    public final void onClick(View view) {
        this.f303023a.f303048m = new TimePickerDialog(this.f303023a.f303054s, new C108975fx(this), this.f303023a.f303047l.get(11), this.f303023a.f303047l.get(12), DateFormat.is24HourFormat(this.f303023a.f303053r));
        this.f303023a.f303048m.show();
    }
}
