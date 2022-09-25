package com.google.android.material.timepicker;

/* renamed from: com.google.android.material.timepicker.l */
/* compiled from: PG */
public final class C44988l {

    /* renamed from: a */
    public TimeModel f117552a = new TimeModel(0);

    /* renamed from: b */
    public Integer f117553b;

    /* renamed from: a */
    public final void mo48652a() {
        this.f117553b = 0;
    }

    /* renamed from: b */
    public final void mo48653b(int i) {
        TimeModel timeModel = this.f117552a;
        int i2 = timeModel.f117514d;
        int i3 = timeModel.f117515e;
        TimeModel timeModel2 = new TimeModel(i);
        this.f117552a = timeModel2;
        timeModel2.f117515e = i3 % 60;
        timeModel2.mo48632e(i2);
    }
}
