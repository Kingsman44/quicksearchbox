package com.google.android.gms.reminders.model;

import com.google.android.gms.common.internal.C143919bh;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.reminders.model.ah */
/* compiled from: PG */
public final class C145828ah {

    /* renamed from: a */
    public MonthlyPattern f394362a;

    /* renamed from: b */
    private List f394363b;

    /* renamed from: a */
    public final YearlyPattern mo122186a() {
        return new YearlyPatternEntity(this.f394362a, this.f394363b, true);
    }

    /* renamed from: b */
    public final void mo122187b(Integer... numArr) {
        if (this.f394363b == null) {
            this.f394363b = new ArrayList();
        }
        for (int i = 0; i <= 0; i++) {
            Integer num = numArr[i];
            boolean z = true;
            if (!(num == null || num.intValue() == 1 || num.intValue() == 2 || num.intValue() == 3 || num.intValue() == 4 || num.intValue() == 5 || num.intValue() == 6 || num.intValue() == 7 || num.intValue() == 8 || num.intValue() == 9 || num.intValue() == 10 || num.intValue() == 11 || num.intValue() == 12)) {
                z = false;
            }
            C143919bh.m233960c(z, "Invalid constant for Month. Use value in ModelConstants");
            this.f394363b.add(num);
        }
    }
}
