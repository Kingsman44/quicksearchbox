package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;

/* renamed from: com.google.android.material.datepicker.ap */
/* compiled from: PG */
final class C44620ap extends C44634g {

    /* renamed from: d */
    final /* synthetic */ C44617am f116263d;

    /* renamed from: e */
    final /* synthetic */ SingleDateSelector f116264e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44620ap(SingleDateSelector singleDateSelector, String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, C44617am amVar) {
        super(str, dateFormat, textInputLayout, calendarConstraints);
        this.f116264e = singleDateSelector;
        this.f116263d = amVar;
    }

    /* renamed from: a */
    public final void mo47860a() {
        this.f116263d.mo47835a();
    }

    /* renamed from: b */
    public final void mo47861b(Long l) {
        if (l == null) {
            this.f116264e.f116205a = null;
        } else {
            this.f116264e.f116205a = Long.valueOf(l.longValue());
        }
        this.f116263d.mo47836b(this.f116264e.f116205a);
    }
}
