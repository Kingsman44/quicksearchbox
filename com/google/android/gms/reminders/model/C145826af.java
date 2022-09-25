package com.google.android.gms.reminders.model;

import com.google.android.gms.common.internal.C143919bh;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.reminders.model.af */
/* compiled from: PG */
public final class C145826af {

    /* renamed from: a */
    private List f394361a;

    /* renamed from: a */
    public final WeeklyPattern mo122182a() {
        return new WeeklyPatternEntity(this.f394361a, true);
    }

    /* renamed from: b */
    public final void mo122183b(Integer... numArr) {
        if (this.f394361a == null) {
            this.f394361a = new ArrayList();
        }
        for (int i = 0; i <= 0; i++) {
            Integer num = numArr[i];
            boolean z = true;
            if (!(num == null || num.intValue() == 1 || num.intValue() == 2 || num.intValue() == 3 || num.intValue() == 4 || num.intValue() == 5 || num.intValue() == 6 || num.intValue() == 7)) {
                z = false;
            }
            C143919bh.m233960c(z, "Invalid constant for Weekday. Use value in ModelConstants");
            this.f394361a.add(num);
        }
    }
}
