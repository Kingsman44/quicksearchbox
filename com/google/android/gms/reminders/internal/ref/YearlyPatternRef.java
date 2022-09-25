package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145829ai;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.android.gms.reminders.model.YearlyPattern;
import com.google.android.gms.reminders.model.YearlyPatternEntity;
import java.util.List;

/* compiled from: PG */
public class YearlyPatternRef extends C145815a implements YearlyPattern {

    /* renamed from: f */
    private boolean f394231f = false;

    /* renamed from: g */
    private MonthlyPatternRef f394232g;

    public YearlyPatternRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: j */
    public static boolean m237269j(DataHolder dataHolder, int i, int i2, String str) {
        return MonthlyPatternRef.m237206k(dataHolder, i, i2, str.concat("yearly_pattern_")) && dataHolder.mo119320d(m237273v(str, "yearly_pattern_year_month"), i, i2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YearlyPattern)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return YearlyPatternEntity.m237551c(this, (YearlyPattern) obj);
    }

    /* renamed from: h */
    public final MonthlyPattern mo122094h() {
        if (!this.f394231f) {
            this.f394231f = true;
            if (MonthlyPatternRef.m237206k(this.f389974a, this.f389975b, this.f394234e, this.f394233d.concat("yearly_pattern_"))) {
                this.f394232g = null;
            } else {
                this.f394232g = new MonthlyPatternRef(this.f389974a, this.f389975b, this.f394233d.concat("yearly_pattern_"));
            }
        }
        return this.f394232g;
    }

    public final int hashCode() {
        return YearlyPatternEntity.m237550b(this);
    }

    /* renamed from: i */
    public final List mo122095i() {
        return mo122101w(mo122100u("yearly_pattern_year_month"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145829ai.m237574a(new YearlyPatternEntity(this), parcel, i);
    }
}
