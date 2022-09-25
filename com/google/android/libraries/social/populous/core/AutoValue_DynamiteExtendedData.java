package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.DynamiteExtendedData;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45657c;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45659e;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45661g;

/* compiled from: PG */
public final class AutoValue_DynamiteExtendedData extends C$AutoValue_DynamiteExtendedData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42361v();

    /* renamed from: i */
    private static final ClassLoader f110682i = AutoValue_DynamiteExtendedData.class.getClassLoader();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoValue_DynamiteExtendedData(Parcel parcel) {
        super(C45657c.m81353a(parcel.readInt()), C45659e.m81354a(parcel.readInt()), C45661g.m81355a(parcel.readInt()), parcel.readByte() == 1 ? Long.valueOf(parcel.readLong()) : null, parcel.readByte() == 1 ? parcel.readString() : null, parcel.readByte() == 1 ? parcel.readString() : null, parcel.readByte() == 1 ? parcel.readString() : null, parcel.readByte() == 1 ? (DynamiteExtendedData.OrganizationInfo) parcel.readParcelable(f110682i) : null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110623f - 1);
        parcel.writeInt(this.f110624g - 1);
        parcel.writeInt(this.f110625h - 1);
        byte b = 1;
        parcel.writeByte(this.f110618a == null ? (byte) 0 : 1);
        Long l = this.f110618a;
        if (l != null) {
            parcel.writeLong(l.longValue());
        }
        parcel.writeByte(this.f110619b == null ? (byte) 0 : 1);
        String str = this.f110619b;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeByte(this.f110620c == null ? (byte) 0 : 1);
        String str2 = this.f110620c;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeByte(this.f110621d == null ? (byte) 0 : 1);
        String str3 = this.f110621d;
        if (str3 != null) {
            parcel.writeString(str3);
        }
        if (this.f110622e == null) {
            b = 0;
        }
        parcel.writeByte(b);
        DynamiteExtendedData.OrganizationInfo organizationInfo = this.f110622e;
        if (organizationInfo != null) {
            parcel.writeParcelable(organizationInfo, 0);
        }
    }

    public AutoValue_DynamiteExtendedData(int i, int i2, int i3, Long l, String str, String str2, String str3, DynamiteExtendedData.OrganizationInfo organizationInfo) {
        super(i, i2, i3, l, str, str2, str3, organizationInfo);
    }
}
