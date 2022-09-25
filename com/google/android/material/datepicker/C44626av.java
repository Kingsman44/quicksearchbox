package com.google.android.material.datepicker;

import android.view.View;

/* renamed from: com.google.android.material.datepicker.av */
/* compiled from: PG */
final class C44626av implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f116266a;

    /* renamed from: b */
    final /* synthetic */ C44628ax f116267b;

    public C44626av(C44628ax axVar, int i) {
        this.f116267b = axVar;
        this.f116266a = i;
    }

    public final void onClick(View view) {
        Month e = Month.m79035e(this.f116266a, this.f116267b.f116269a.f116320c.f116199b);
        CalendarConstraints calendarConstraints = this.f116267b.f116269a.f116319b;
        if (e.compareTo(calendarConstraints.f116188a) < 0) {
            e = calendarConstraints.f116188a;
        } else if (e.compareTo(calendarConstraints.f116189b) > 0) {
            e = calendarConstraints.f116189b;
        }
        this.f116267b.f116269a.mo47882c(e);
        this.f116267b.f116269a.mo47883d(1);
    }
}
