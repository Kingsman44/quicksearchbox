package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: PG */
public class RecurrenceEndEntity extends AbstractSafeParcelable implements RecurrenceEnd {
    public static final Parcelable.Creator CREATOR = new C145846r();

    /* renamed from: a */
    public final DateTimeEntity f394290a;

    /* renamed from: b */
    public final Integer f394291b;

    /* renamed from: c */
    public final Boolean f394292c;

    /* renamed from: d */
    public final DateTimeEntity f394293d;

    public RecurrenceEndEntity(DateTime dateTime, Integer num, Boolean bool, DateTime dateTime2, boolean z) {
        DateTimeEntity dateTimeEntity;
        this.f394291b = num;
        this.f394292c = bool;
        if (z) {
            this.f394290a = (DateTimeEntity) dateTime;
            this.f394293d = (DateTimeEntity) dateTime2;
            return;
        }
        DateTimeEntity dateTimeEntity2 = null;
        if (dateTime == null) {
            dateTimeEntity = null;
        } else {
            dateTimeEntity = new DateTimeEntity(dateTime);
        }
        this.f394290a = dateTimeEntity;
        this.f394293d = dateTime2 != null ? new DateTimeEntity(dateTime2) : dateTimeEntity2;
    }

    public RecurrenceEndEntity(DateTimeEntity dateTimeEntity, Integer num, Boolean bool, DateTimeEntity dateTimeEntity2) {
        this.f394290a = dateTimeEntity;
        this.f394291b = num;
        this.f394292c = bool;
        this.f394293d = dateTimeEntity2;
    }

    /* renamed from: b */
    public static int m237433b(RecurrenceEnd recurrenceEnd) {
        return Arrays.hashCode(new Object[]{recurrenceEnd.mo122034i(), recurrenceEnd.mo122036k(), recurrenceEnd.mo122035j(), recurrenceEnd.mo122033h()});
    }

    /* renamed from: c */
    public static boolean m237434c(RecurrenceEnd recurrenceEnd, RecurrenceEnd recurrenceEnd2) {
        return C143912ba.m233950b(recurrenceEnd.mo122034i(), recurrenceEnd2.mo122034i()) && C143912ba.m233950b(recurrenceEnd.mo122036k(), recurrenceEnd2.mo122036k()) && C143912ba.m233950b(recurrenceEnd.mo122035j(), recurrenceEnd2.mo122035j()) && C143912ba.m233950b(recurrenceEnd.mo122033h(), recurrenceEnd2.mo122033h());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceEnd)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237434c(this, (RecurrenceEnd) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final DateTime mo122033h() {
        return this.f394293d;
    }

    public final int hashCode() {
        return m237433b(this);
    }

    /* renamed from: i */
    public final DateTime mo122034i() {
        return this.f394290a;
    }

    /* renamed from: j */
    public final Boolean mo122035j() {
        return this.f394292c;
    }

    /* renamed from: k */
    public final Integer mo122036k() {
        return this.f394291b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145846r.m237596a(this, parcel, i);
    }

    public RecurrenceEndEntity(RecurrenceEnd recurrenceEnd) {
        this(recurrenceEnd.mo122034i(), recurrenceEnd.mo122036k(), recurrenceEnd.mo122035j(), recurrenceEnd.mo122033h(), false);
    }
}
