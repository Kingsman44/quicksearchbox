package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145850v;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.RecurrenceStart;
import com.google.android.gms.reminders.model.RecurrenceStartEntity;

/* compiled from: PG */
public class RecurrenceStartRef extends C145815a implements RecurrenceStart {

    /* renamed from: f */
    private boolean f394215f = false;

    /* renamed from: g */
    private DateTimeRef f394216g;

    public RecurrenceStartRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: i */
    public static boolean m237232i(DataHolder dataHolder, int i, int i2, String str) {
        return DateTimeRef.m237173q(dataHolder, i, i2, str.concat("recurrence_start_"));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceStart)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return RecurrenceStartEntity.m237467c(this, (RecurrenceStart) obj);
    }

    /* renamed from: h */
    public final DateTime mo122055h() {
        if (!this.f394215f) {
            this.f394215f = true;
            if (DateTimeRef.m237173q(this.f389974a, this.f389975b, this.f394234e, this.f394233d.concat("recurrence_start_"))) {
                this.f394216g = null;
            } else {
                this.f394216g = new DateTimeRef(this.f389974a, this.f389975b, this.f394233d.concat("recurrence_start_"));
            }
        }
        return this.f394216g;
    }

    public final int hashCode() {
        return RecurrenceStartEntity.m237466b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145850v.m237601a(new RecurrenceStartEntity((RecurrenceStart) this), parcel, i);
    }
}
