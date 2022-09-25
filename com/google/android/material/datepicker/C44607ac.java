package com.google.android.material.datepicker;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.material.datepicker.ac */
/* compiled from: PG */
public final class C44607ac {

    /* renamed from: a */
    final DateSelector f116208a;

    /* renamed from: b */
    CalendarConstraints f116209b;

    /* renamed from: c */
    int f116210c = 0;

    /* renamed from: d */
    CharSequence f116211d = null;

    /* renamed from: e */
    public Object f116212e = null;

    private C44607ac(DateSelector dateSelector) {
        this.f116208a = dateSelector;
    }

    /* renamed from: a */
    public static C44607ac m79052a() {
        return new C44607ac(new SingleDateSelector());
    }

    /* renamed from: d */
    private static boolean m79053d(Month month, CalendarConstraints calendarConstraints) {
        return month.compareTo(calendarConstraints.f116188a) >= 0 && month.compareTo(calendarConstraints.f116189b) <= 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (m79053d(r1, r8.f116209b) == false) goto L_0x006c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.material.datepicker.C44608ad mo47838b() {
        /*
            r8 = this;
            com.google.android.material.datepicker.CalendarConstraints r0 = r8.f116209b
            if (r0 != 0) goto L_0x0019
            int r0 = com.google.android.material.datepicker.C44629b.f116272c
            long r1 = com.google.android.material.datepicker.C44629b.f116270a
            long r3 = com.google.android.material.datepicker.C44629b.f116271b
            com.google.android.material.datepicker.DateValidatorPointForward r7 = new com.google.android.material.datepicker.DateValidatorPointForward
            r5 = -9223372036854775808
            r7.<init>(r5)
            r5 = 0
            r6 = 0
            com.google.android.material.datepicker.CalendarConstraints r0 = com.google.android.material.datepicker.C44629b.m79088a(r1, r3, r5, r6, r7)
            r8.f116209b = r0
        L_0x0019:
            int r0 = r8.f116210c
            if (r0 != 0) goto L_0x0022
            r0 = 2132089531(0x7f151abb, float:1.9819376E38)
            r8.f116210c = r0
        L_0x0022:
            java.lang.Object r0 = r8.f116212e
            if (r0 == 0) goto L_0x003a
            com.google.android.material.datepicker.DateSelector r1 = r8.f116208a
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            long r2 = com.google.android.material.datepicker.C44625au.m79080a(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            com.google.android.material.datepicker.SingleDateSelector r1 = (com.google.android.material.datepicker.SingleDateSelector) r1
            r1.f116205a = r0
        L_0x003a:
            com.google.android.material.datepicker.CalendarConstraints r0 = r8.f116209b
            com.google.android.material.datepicker.Month r1 = r0.f116191d
            if (r1 != 0) goto L_0x007e
            com.google.android.material.datepicker.DateSelector r1 = r8.f116208a
            java.util.Collection r1 = r1.mo47802d()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x006c
            com.google.android.material.datepicker.DateSelector r1 = r8.f116208a
            java.util.Collection r1 = r1.mo47802d()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            com.google.android.material.datepicker.Month r1 = com.google.android.material.datepicker.Month.m79034d(r1)
            com.google.android.material.datepicker.CalendarConstraints r2 = r8.f116209b
            boolean r2 = m79053d(r1, r2)
            if (r2 != 0) goto L_0x007c
        L_0x006c:
            com.google.android.material.datepicker.Month r1 = com.google.android.material.datepicker.Month.m79036f()
            com.google.android.material.datepicker.CalendarConstraints r2 = r8.f116209b
            boolean r2 = m79053d(r1, r2)
            if (r2 != 0) goto L_0x007c
            com.google.android.material.datepicker.CalendarConstraints r1 = r8.f116209b
            com.google.android.material.datepicker.Month r1 = r1.f116188a
        L_0x007c:
            r0.f116191d = r1
        L_0x007e:
            com.google.android.material.datepicker.ad r0 = new com.google.android.material.datepicker.ad
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "OVERRIDE_THEME_RES_ID"
            r3 = 0
            r1.putInt(r2, r3)
            java.lang.String r2 = "DATE_SELECTOR_KEY"
            com.google.android.material.datepicker.DateSelector r4 = r8.f116208a
            r1.putParcelable(r2, r4)
            java.lang.String r2 = "CALENDAR_CONSTRAINTS_KEY"
            com.google.android.material.datepicker.CalendarConstraints r4 = r8.f116209b
            r1.putParcelable(r2, r4)
            java.lang.String r2 = "DAY_VIEW_DECORATOR_KEY"
            r4 = 0
            r1.putParcelable(r2, r4)
            java.lang.String r2 = "TITLE_TEXT_RES_ID_KEY"
            int r5 = r8.f116210c
            r1.putInt(r2, r5)
            java.lang.String r2 = "TITLE_TEXT_KEY"
            java.lang.CharSequence r5 = r8.f116211d
            r1.putCharSequence(r2, r5)
            java.lang.String r2 = "INPUT_MODE_KEY"
            r1.putInt(r2, r3)
            java.lang.String r2 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY"
            r1.putInt(r2, r3)
            java.lang.String r2 = "POSITIVE_BUTTON_TEXT_KEY"
            r1.putCharSequence(r2, r4)
            java.lang.String r2 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"
            r1.putInt(r2, r3)
            java.lang.String r2 = "NEGATIVE_BUTTON_TEXT_KEY"
            r1.putCharSequence(r2, r4)
            r0.setArguments(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C44607ac.mo47838b():com.google.android.material.datepicker.ad");
    }

    /* renamed from: c */
    public final void mo47839c() {
        this.f116211d = BuildConfig.FLAVOR;
        this.f116210c = 0;
    }
}
