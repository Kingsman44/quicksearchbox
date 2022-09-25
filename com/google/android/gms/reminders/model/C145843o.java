package com.google.android.gms.reminders.model;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.reminders.model.o */
/* compiled from: PG */
public final class C145843o {

    /* renamed from: a */
    public Integer f394386a;

    /* renamed from: b */
    public RecurrenceStart f394387b;

    /* renamed from: c */
    public RecurrenceEnd f394388c;

    /* renamed from: d */
    public DailyPattern f394389d;

    /* renamed from: e */
    public WeeklyPattern f394390e;

    /* renamed from: f */
    public MonthlyPattern f394391f;

    /* renamed from: g */
    public YearlyPattern f394392g;

    /* renamed from: h */
    private Integer f394393h;

    /* renamed from: a */
    public final Recurrence mo122216a() {
        return new RecurrenceEntity(this.f394393h, this.f394386a, this.f394387b, this.f394388c, this.f394389d, this.f394390e, this.f394391f, this.f394392g, true);
    }

    /* renamed from: b */
    public final void mo122217b(Integer num) {
        boolean z = true;
        if (!(num.intValue() == 0 || num.intValue() == 1 || num.intValue() == 2 || num.intValue() == 3)) {
            z = false;
        }
        C143919bh.m233960c(z, "Invalid constant for Frequency. Use value in ModelConstants");
        this.f394393h = num;
    }
}
