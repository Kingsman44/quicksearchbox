package com.google.android.libraries.social.populous.logging;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4522b.C58485gu;

/* compiled from: PG */
public final class AutoValue_LogEvent extends C$AutoValue_LogEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42572g();

    /* renamed from: j */
    private static final ClassLoader f111673j = AutoValue_LogEvent.class.getClassLoader();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoValue_LogEvent(Parcel parcel) {
        super(new int[]{1, 2, 3, 4, 5, 6, 7, 8}[parcel.readInt()], parcel.readByte() == 1 ? Long.valueOf(parcel.readLong()) : null, parcel.readLong(), parcel.readLong(), parcel.readByte() == 1 ? parcel.readString() : null, C58485gu.m89844l((LogEntity[]) parcel.createTypedArray(AutoValue_LogEntity.CREATOR)), parcel.readByte() == 1 ? Long.valueOf(parcel.readLong()) : null, ((Boolean) parcel.readValue(f111673j)).booleanValue(), parcel.readByte() == 1 ? Integer.valueOf(parcel.readInt()) : null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f111671i - 1);
        byte b = 1;
        parcel.writeByte(this.f111663a == null ? (byte) 0 : 1);
        Long l = this.f111663a;
        if (l != null) {
            parcel.writeLong(l.longValue());
        }
        parcel.writeLong(this.f111664b);
        parcel.writeLong(this.f111665c);
        parcel.writeByte(this.f111666d == null ? (byte) 0 : 1);
        String str = this.f111666d;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeTypedArray((AutoValue_LogEntity[]) this.f111667e.toArray(new AutoValue_LogEntity[0]), 0);
        parcel.writeByte(this.f111668f == null ? (byte) 0 : 1);
        Long l2 = this.f111668f;
        if (l2 != null) {
            parcel.writeLong(l2.longValue());
        }
        parcel.writeValue(Boolean.valueOf(this.f111669g));
        if (this.f111670h == null) {
            b = 0;
        }
        parcel.writeByte(b);
        Integer num = this.f111670h;
        if (num != null) {
            parcel.writeInt(num.intValue());
        }
    }

    public AutoValue_LogEvent(int i, Long l, long j, long j2, String str, C58485gu guVar, Long l2, boolean z, Integer num) {
        super(i, l, j, j2, str, guVar, l2, z, num);
    }
}
