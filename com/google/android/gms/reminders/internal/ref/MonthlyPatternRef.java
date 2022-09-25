package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145842n;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.android.gms.reminders.model.MonthlyPatternEntity;
import java.util.List;

/* compiled from: PG */
public class MonthlyPatternRef extends C145815a implements MonthlyPattern {
    public MonthlyPatternRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: k */
    public static boolean m237206k(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo119320d(m237273v(str, "monthly_pattern_month_day"), i, i2) && dataHolder.mo119320d(m237273v(str, "monthly_pattern_week_day"), i, i2) && dataHolder.mo119320d(m237273v(str, "monthly_pattern_week_day_number"), i, i2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MonthlyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return MonthlyPatternEntity.m237415c(this, (MonthlyPattern) obj);
    }

    /* renamed from: h */
    public final Integer mo122028h() {
        return mo122098s(mo122100u("monthly_pattern_week_day"));
    }

    public final int hashCode() {
        return MonthlyPatternEntity.m237414b(this);
    }

    /* renamed from: i */
    public final Integer mo122029i() {
        return mo122098s(mo122100u("monthly_pattern_week_day_number"));
    }

    /* renamed from: j */
    public final List mo122030j() {
        return mo122101w(mo122100u("monthly_pattern_month_day"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145842n.m237591a(new MonthlyPatternEntity(this), parcel);
    }
}
