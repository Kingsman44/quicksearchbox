package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145825ae;
import com.google.android.gms.reminders.model.Time;
import com.google.android.gms.reminders.model.TimeEntity;

/* compiled from: PG */
public class TimeRef extends C145815a implements Time {
    public TimeRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: k */
    public static boolean m237261k(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo119320d(m237273v(str, "hour"), i, i2) && dataHolder.mo119320d(m237273v(str, "minute"), i, i2) && dataHolder.mo119320d(m237273v(str, "second"), i, i2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Time)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return TimeEntity.m237536c(this, (Time) obj);
    }

    /* renamed from: h */
    public final Integer mo122086h() {
        return mo122098s(mo122100u("hour"));
    }

    public final int hashCode() {
        return TimeEntity.m237535b(this);
    }

    /* renamed from: i */
    public final Integer mo122087i() {
        return mo122098s(mo122100u("minute"));
    }

    /* renamed from: j */
    public final Integer mo122088j() {
        return mo122098s(mo122100u("second"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145825ae.m237568a(new TimeEntity(this), parcel);
    }
}
