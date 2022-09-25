package com.google.android.gms.reminders.model;

import com.google.android.gms.common.internal.C143919bh;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.reminders.model.m */
/* compiled from: PG */
public final class C145841m {

    /* renamed from: a */
    public Integer f394383a;

    /* renamed from: b */
    private List f394384b;

    /* renamed from: c */
    private Integer f394385c;

    /* renamed from: a */
    public final MonthlyPattern mo122211a() {
        return new MonthlyPatternEntity(this.f394384b, this.f394385c, this.f394383a, true);
    }

    /* renamed from: b */
    public final void mo122212b(Integer... numArr) {
        if (this.f394384b == null) {
            this.f394384b = new ArrayList();
        }
        for (int i = 0; i <= 0; i++) {
            this.f394384b.add(numArr[i]);
        }
    }

    /* renamed from: c */
    public final void mo122213c(Integer num) {
        boolean z = true;
        if (!(num.intValue() == 1 || num.intValue() == 2 || num.intValue() == 3 || num.intValue() == 4 || num.intValue() == 5 || num.intValue() == 6 || num.intValue() == 7)) {
            z = false;
        }
        C143919bh.m233960c(z, "Invalid constant for Weekday. Use value in ModelConstants");
        this.f394385c = num;
    }
}
