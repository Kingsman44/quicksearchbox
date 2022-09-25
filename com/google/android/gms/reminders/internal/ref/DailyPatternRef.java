package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145833e;
import com.google.android.gms.reminders.model.DailyPattern;
import com.google.android.gms.reminders.model.DailyPatternEntity;
import com.google.android.gms.reminders.model.Time;

/* compiled from: PG */
public class DailyPatternRef extends C145815a implements DailyPattern {

    /* renamed from: f */
    private boolean f394185f = false;

    /* renamed from: g */
    private TimeRef f394186g;

    public DailyPatternRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: k */
    public static boolean m237168k(DataHolder dataHolder, int i, int i2, String str) {
        return TimeRef.m237261k(dataHolder, i, i2, str.concat("daily_pattern_")) && dataHolder.mo119320d(m237273v(str, "daily_pattern_period"), i, i2) && dataHolder.mo119320d(m237273v(str, "daily_pattern_all_day"), i, i2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DailyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return DailyPatternEntity.m237333c(this, (DailyPattern) obj);
    }

    /* renamed from: h */
    public final Time mo121987h() {
        if (!this.f394185f) {
            this.f394185f = true;
            if (TimeRef.m237261k(this.f389974a, this.f389975b, this.f394234e, this.f394233d.concat("daily_pattern_"))) {
                this.f394186g = null;
            } else {
                this.f394186g = new TimeRef(this.f389974a, this.f389975b, this.f394233d.concat("daily_pattern_"));
            }
        }
        return this.f394186g;
    }

    public final int hashCode() {
        return DailyPatternEntity.m237332b(this);
    }

    /* renamed from: i */
    public final Boolean mo121988i() {
        return Boolean.valueOf(mo119330d(mo122100u("daily_pattern_all_day")));
    }

    /* renamed from: j */
    public final Integer mo121989j() {
        return mo122098s(mo122100u("daily_pattern_period"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145833e.m237579a(new DailyPatternEntity(this), parcel, i);
    }
}
