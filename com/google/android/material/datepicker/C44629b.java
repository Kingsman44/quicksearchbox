package com.google.android.material.datepicker;

import android.os.Bundle;
import com.google.android.material.datepicker.CalendarConstraints;

/* renamed from: com.google.android.material.datepicker.b */
/* compiled from: PG */
public final class C44629b {

    /* renamed from: a */
    static final long f116270a = C44625au.m79080a(Month.m79035e(1900, 0).f116203f);

    /* renamed from: b */
    static final long f116271b = C44625au.m79080a(Month.m79035e(2100, 11).f116203f);

    /* renamed from: c */
    public static final /* synthetic */ int f116272c = 0;

    /* renamed from: a */
    public static final CalendarConstraints m79088a(long j, long j2, Long l, int i, CalendarConstraints.DateValidator dateValidator) {
        Month month;
        Bundle bundle = new Bundle();
        bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", dateValidator);
        Month d = Month.m79034d(j);
        Month d2 = Month.m79034d(j2);
        CalendarConstraints.DateValidator dateValidator2 = (CalendarConstraints.DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        if (l == null) {
            month = null;
        } else {
            month = Month.m79034d(l.longValue());
        }
        return new CalendarConstraints(d, d2, dateValidator2, month, i);
    }
}
