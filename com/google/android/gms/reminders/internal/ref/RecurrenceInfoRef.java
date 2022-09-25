package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145848t;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceInfo;
import com.google.android.gms.reminders.model.RecurrenceInfoEntity;

/* compiled from: PG */
public class RecurrenceInfoRef extends C145815a implements RecurrenceInfo {

    /* renamed from: f */
    private boolean f394201f = false;

    /* renamed from: g */
    private RecurrenceRef f394202g;

    public RecurrenceInfoRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return RecurrenceInfoEntity.m237458c(this, (RecurrenceInfo) obj);
    }

    /* renamed from: h */
    public final Recurrence mo122039h() {
        if (!this.f394201f) {
            this.f394201f = true;
            if (RecurrenceRef.m237222p(this.f389974a, this.f389975b, this.f394234e, this.f394233d)) {
                this.f394202g = null;
            } else {
                this.f394202g = new RecurrenceRef(this.f389974a, this.f389975b, this.f394233d);
            }
        }
        return this.f394202g;
    }

    public final int hashCode() {
        return RecurrenceInfoEntity.m237457b(this);
    }

    /* renamed from: i */
    public final Boolean mo122040i() {
        return Boolean.valueOf(mo119330d(mo122100u("recurrence_exceptional")));
    }

    /* renamed from: j */
    public final Boolean mo122041j() {
        return Boolean.valueOf(mo119330d(mo122100u("recurrence_master")));
    }

    /* renamed from: k */
    public final String mo122042k() {
        return mo119337kv(mo122100u("recurrence_id"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145848t.m237599a(new RecurrenceInfoEntity(this), parcel, i);
    }
}
