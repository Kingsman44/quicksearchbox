package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145827ag;
import com.google.android.gms.reminders.model.WeeklyPattern;
import com.google.android.gms.reminders.model.WeeklyPatternEntity;
import java.util.List;

/* compiled from: PG */
public class WeeklyPatternRef extends C145815a implements WeeklyPattern {
    public WeeklyPatternRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: i */
    public static boolean m237266i(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo119320d(m237273v(str, "weekly_pattern_weekday"), i, i2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WeeklyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return WeeklyPatternEntity.m237544c(this, (WeeklyPattern) obj);
    }

    /* renamed from: h */
    public final List mo122091h() {
        return mo122101w(mo122100u("weekly_pattern_weekday"));
    }

    public final int hashCode() {
        return WeeklyPatternEntity.m237543b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145827ag.m237571a(new WeeklyPatternEntity((WeeklyPattern) this), parcel);
    }
}
