package com.google.android.gms.reminders.model;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.reminders.model.j */
/* compiled from: PG */
public final class C145838j {

    /* renamed from: a */
    public Double f394376a;

    /* renamed from: b */
    public Double f394377b;

    /* renamed from: c */
    public String f394378c;

    /* renamed from: d */
    public Integer f394379d;

    /* renamed from: e */
    public FeatureIdProto f394380e;

    /* renamed from: f */
    public String f394381f;

    /* renamed from: g */
    private Integer f394382g;

    /* renamed from: a */
    public final Location mo122205a() {
        return new LocationEntity(this.f394376a, this.f394377b, this.f394378c, this.f394379d, this.f394382g, this.f394380e, this.f394381f, (Address) null, (String) null, true);
    }

    /* renamed from: b */
    public final void mo122206b(Integer num) {
        boolean z = true;
        if (!(num.intValue() == 1 || num.intValue() == 2 || num.intValue() == 3)) {
            z = false;
        }
        C143919bh.m233960c(z, "Invalid constant for LocationType. Use value in ModelConstants");
        this.f394382g = num;
    }
}
