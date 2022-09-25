package com.google.android.gms.reminders.model;

/* renamed from: com.google.android.gms.reminders.model.f */
/* compiled from: PG */
public final class C145834f {

    /* renamed from: a */
    public Integer f394367a;

    /* renamed from: b */
    public Integer f394368b;

    /* renamed from: c */
    public Integer f394369c;

    /* renamed from: d */
    public Time f394370d;

    /* renamed from: e */
    public Integer f394371e;

    /* renamed from: f */
    public Long f394372f;

    /* renamed from: g */
    public Boolean f394373g;

    /* renamed from: h */
    public Boolean f394374h;

    /* renamed from: i */
    private Integer f394375i;

    public C145834f() {
    }

    public C145834f(DateTime dateTime) {
        this.f394367a = dateTime.mo121999o();
        this.f394368b = dateTime.mo121997m();
        this.f394369c = dateTime.mo121996l();
        this.f394370d = dateTime.mo121992h() == null ? null : new TimeEntity(dateTime.mo121992h());
        this.f394371e = dateTime.mo121998n();
        this.f394375i = dateTime.mo121995k();
        this.f394372f = dateTime.mo122000p();
        this.f394373g = dateTime.mo121994j();
        this.f394374h = dateTime.mo121993i();
    }

    /* renamed from: a */
    public final DateTime mo122198a() {
        return new DateTimeEntity(this.f394367a, this.f394368b, this.f394369c, this.f394370d, this.f394371e, this.f394375i, this.f394372f, this.f394373g, this.f394374h, true);
    }
}
