package com.google.android.libraries.social.peoplekit.common.dataservice;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class PeopleKitExternalEntityKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42104n();

    /* renamed from: a */
    public final int f110041a;

    /* renamed from: b */
    public final String f110042b;

    public PeopleKitExternalEntityKey(int i, String str) {
        this.f110041a = i;
        this.f110042b = str;
    }

    public PeopleKitExternalEntityKey(Parcel parcel) {
        this.f110041a = parcel.readInt();
        this.f110042b = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PeopleKitExternalEntityKey) {
            PeopleKitExternalEntityKey peopleKitExternalEntityKey = (PeopleKitExternalEntityKey) obj;
            if (this.f110041a != peopleKitExternalEntityKey.f110041a || !this.f110042b.equals(peopleKitExternalEntityKey.f110042b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        int i = this.f110041a;
        String str = this.f110042b;
        return i + ":" + str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110041a);
        parcel.writeString(this.f110042b);
    }
}
