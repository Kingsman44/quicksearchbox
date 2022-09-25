package com.google.android.gms.reminders.model;

/* renamed from: com.google.android.gms.reminders.model.s */
/* compiled from: PG */
public final class C145847s {

    /* renamed from: a */
    public String f394394a;

    /* renamed from: b */
    public Boolean f394395b;

    /* renamed from: c */
    private Recurrence f394396c;

    /* renamed from: a */
    public final RecurrenceInfo mo122222a() {
        return new RecurrenceInfoEntity(this.f394396c, this.f394394a, this.f394395b, (Boolean) null, true);
    }

    /* renamed from: b */
    public final void mo122223b(Recurrence recurrence) {
        this.f394396c = recurrence != null ? (Recurrence) recurrence.mo119345a() : null;
    }
}
