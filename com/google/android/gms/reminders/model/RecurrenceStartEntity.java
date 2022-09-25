package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: PG */
public class RecurrenceStartEntity extends AbstractSafeParcelable implements RecurrenceStart {
    public static final Parcelable.Creator CREATOR = new C145850v();

    /* renamed from: a */
    public final DateTimeEntity f394306a;

    public RecurrenceStartEntity(DateTime dateTime, boolean z) {
        DateTimeEntity dateTimeEntity;
        if (z) {
            this.f394306a = (DateTimeEntity) dateTime;
            return;
        }
        if (dateTime == null) {
            dateTimeEntity = null;
        } else {
            dateTimeEntity = new DateTimeEntity(dateTime);
        }
        this.f394306a = dateTimeEntity;
    }

    public RecurrenceStartEntity(DateTimeEntity dateTimeEntity) {
        this.f394306a = dateTimeEntity;
    }

    /* renamed from: b */
    public static int m237466b(RecurrenceStart recurrenceStart) {
        return Arrays.hashCode(new Object[]{recurrenceStart.mo122055h()});
    }

    /* renamed from: c */
    public static boolean m237467c(RecurrenceStart recurrenceStart, RecurrenceStart recurrenceStart2) {
        return C143912ba.m233950b(recurrenceStart.mo122055h(), recurrenceStart2.mo122055h());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceStart)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237467c(this, (RecurrenceStart) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final DateTime mo122055h() {
        return this.f394306a;
    }

    public final int hashCode() {
        return m237466b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145850v.m237601a(this, parcel, i);
    }

    public RecurrenceStartEntity(RecurrenceStart recurrenceStart) {
        this(recurrenceStart.mo122055h(), false);
    }
}
