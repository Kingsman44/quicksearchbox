package com.google.android.gms.reminders.model;

/* renamed from: com.google.android.gms.reminders.model.d */
/* compiled from: PG */
public final class C145832d {

    /* renamed from: a */
    public Integer f394364a;

    /* renamed from: b */
    public Boolean f394365b;

    /* renamed from: c */
    private Time f394366c;

    /* renamed from: a */
    public final DailyPattern mo122194a() {
        return new DailyPatternEntity(this.f394366c, this.f394364a, this.f394365b, true);
    }

    /* renamed from: b */
    public final void mo122195b(Time time) {
        if (time == null) {
            time = null;
        }
        this.f394366c = time;
    }
}
