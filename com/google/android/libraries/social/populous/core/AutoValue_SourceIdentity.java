package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.p4431a.C57878d;

/* compiled from: PG */
public final class AutoValue_SourceIdentity extends C$AutoValue_SourceIdentity implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42260am();

    static {
        AutoValue_SourceIdentity.class.getClassLoader();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoValue_SourceIdentity(Parcel parcel) {
        super(C57878d.m88555a(parcel.readInt()), parcel.readByte() == 1 ? parcel.readString() : null, parcel.readByte() == 1 ? parcel.readString() : null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110678c - 1);
        byte b = 0;
        parcel.writeByte(this.f110676a == null ? (byte) 0 : 1);
        String str = this.f110676a;
        if (str != null) {
            parcel.writeString(str);
        }
        if (this.f110677b != null) {
            b = 1;
        }
        parcel.writeByte(b);
        String str2 = this.f110677b;
        if (str2 != null) {
            parcel.writeString(str2);
        }
    }

    public AutoValue_SourceIdentity(int i, String str, String str2) {
        super(i, str, str2);
    }
}
