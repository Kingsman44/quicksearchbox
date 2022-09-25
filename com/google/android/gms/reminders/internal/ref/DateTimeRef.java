package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145835g;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.Time;

/* compiled from: PG */
public class DateTimeRef extends C145815a implements DateTime {

    /* renamed from: f */
    private boolean f394187f = false;

    /* renamed from: g */
    private TimeRef f394188g;

    public DateTimeRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: q */
    public static boolean m237173q(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo119320d(m237273v(str, "year"), i, i2) && dataHolder.mo119320d(m237273v(str, "month"), i, i2) && dataHolder.mo119320d(m237273v(str, "day"), i, i2) && TimeRef.m237261k(dataHolder, i, i2, str) && dataHolder.mo119320d(m237273v(str, "period"), i, i2) && dataHolder.mo119320d(m237273v(str, "date_range"), i, i2) && dataHolder.mo119320d(m237273v(str, "absolute_time_ms"), i, i2) && dataHolder.mo119320d(m237273v(str, "unspecified_future_time"), i, i2) && dataHolder.mo119320d(m237273v(str, "all_day"), i, i2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DateTime)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return DateTimeEntity.m237349c(this, (DateTime) obj);
    }

    /* renamed from: h */
    public final Time mo121992h() {
        if (!this.f394187f) {
            this.f394187f = true;
            if (TimeRef.m237261k(this.f389974a, this.f389975b, this.f394234e, this.f394233d)) {
                this.f394188g = null;
            } else {
                this.f394188g = new TimeRef(this.f389974a, this.f389975b, this.f394233d);
            }
        }
        return this.f394188g;
    }

    public final int hashCode() {
        return DateTimeEntity.m237348b(this);
    }

    /* renamed from: i */
    public final Boolean mo121993i() {
        return Boolean.valueOf(mo119330d(mo122100u("all_day")));
    }

    /* renamed from: j */
    public final Boolean mo121994j() {
        return Boolean.valueOf(mo119330d(mo122100u("unspecified_future_time")));
    }

    /* renamed from: k */
    public final Integer mo121995k() {
        return mo122098s(mo122100u("date_range"));
    }

    /* renamed from: l */
    public final Integer mo121996l() {
        return mo122098s(mo122100u("day"));
    }

    /* renamed from: m */
    public final Integer mo121997m() {
        return mo122098s(mo122100u("month"));
    }

    /* renamed from: n */
    public final Integer mo121998n() {
        return mo122098s(mo122100u("period"));
    }

    /* renamed from: o */
    public final Integer mo121999o() {
        return mo122098s(mo122100u("year"));
    }

    /* renamed from: p */
    public final Long mo122000p() {
        return mo122099t(mo122100u("absolute_time_ms"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145835g.m237581a(new DateTimeEntity(this), parcel, i);
    }
}
