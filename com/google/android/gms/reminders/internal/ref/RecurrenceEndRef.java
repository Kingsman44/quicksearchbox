package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145846r;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.RecurrenceEnd;
import com.google.android.gms.reminders.model.RecurrenceEndEntity;

/* compiled from: PG */
public class RecurrenceEndRef extends C145815a implements RecurrenceEnd {

    /* renamed from: f */
    private boolean f394197f = false;

    /* renamed from: g */
    private DateTimeRef f394198g;

    /* renamed from: h */
    private boolean f394199h = false;

    /* renamed from: i */
    private DateTimeRef f394200i;

    public RecurrenceEndRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: l */
    public static boolean m237211l(DataHolder dataHolder, int i, int i2, String str) {
        return DateTimeRef.m237173q(dataHolder, i, i2, str.concat("recurrence_end_")) && dataHolder.mo119320d(m237273v(str, "recurrence_end_num_occurrences"), i, i2) && dataHolder.mo119320d(m237273v(str, "recurrence_end_auto_renew"), i, i2) && DateTimeRef.m237173q(dataHolder, i, i2, str.concat("recurrence_end_auto_renew_until_"));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceEnd)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return RecurrenceEndEntity.m237434c(this, (RecurrenceEnd) obj);
    }

    /* renamed from: h */
    public final DateTime mo122033h() {
        if (!this.f394199h) {
            this.f394199h = true;
            if (DateTimeRef.m237173q(this.f389974a, this.f389975b, this.f394234e, this.f394233d.concat("recurrence_end_auto_renew_until_"))) {
                this.f394200i = null;
            } else {
                this.f394200i = new DateTimeRef(this.f389974a, this.f389975b, this.f394233d.concat("recurrence_end_auto_renew_until_"));
            }
        }
        return this.f394200i;
    }

    public final int hashCode() {
        return RecurrenceEndEntity.m237433b(this);
    }

    /* renamed from: i */
    public final DateTime mo122034i() {
        if (!this.f394197f) {
            this.f394197f = true;
            if (DateTimeRef.m237173q(this.f389974a, this.f389975b, this.f394234e, this.f394233d.concat("recurrence_end_"))) {
                this.f394198g = null;
            } else {
                this.f394198g = new DateTimeRef(this.f389974a, this.f389975b, this.f394233d.concat("recurrence_end_"));
            }
        }
        return this.f394198g;
    }

    /* renamed from: j */
    public final Boolean mo122035j() {
        return Boolean.valueOf(mo119330d(mo122100u("recurrence_end_auto_renew")));
    }

    /* renamed from: k */
    public final Integer mo122036k() {
        return mo122098s(mo122100u("recurrence_end_num_occurrences"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145846r.m237596a(new RecurrenceEndEntity(this), parcel, i);
    }
}
