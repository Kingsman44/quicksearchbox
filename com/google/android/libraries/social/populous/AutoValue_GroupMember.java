package com.google.android.libraries.social.populous;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class AutoValue_GroupMember extends C$AutoValue_GroupMember implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42561l();

    /* renamed from: c */
    private static final ClassLoader f110338c = AutoValue_GroupMember.class.getClassLoader();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoValue_GroupMember(Parcel parcel) {
        super(new int[]{1, 2}[parcel.readInt()], parcel.readByte() == 1 ? (Person) parcel.readParcelable(f110338c) : null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110330b - 1);
        parcel.writeByte(this.f110329a == null ? (byte) 0 : 1);
        Person person = this.f110329a;
        if (person != null) {
            parcel.writeParcelable(person, 0);
        }
    }

    public AutoValue_GroupMember(int i, Person person) {
        super(i, person);
    }
}
