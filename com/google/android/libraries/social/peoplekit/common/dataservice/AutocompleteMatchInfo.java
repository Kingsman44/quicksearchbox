package com.google.android.libraries.social.peoplekit.common.dataservice;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class AutocompleteMatchInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42091a();

    /* renamed from: a */
    public final int f110029a;

    /* renamed from: b */
    public final int f110030b;

    public AutocompleteMatchInfo(int i, int i2) {
        this.f110029a = i;
        this.f110030b = i2;
    }

    public AutocompleteMatchInfo(Parcel parcel) {
        this.f110029a = parcel.readInt();
        this.f110030b = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AutocompleteMatchInfo) {
            AutocompleteMatchInfo autocompleteMatchInfo = (AutocompleteMatchInfo) obj;
            if (this.f110029a == autocompleteMatchInfo.f110029a && this.f110030b == autocompleteMatchInfo.f110030b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        int i = this.f110029a;
        int i2 = this.f110030b;
        return i + ":" + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110029a);
        parcel.writeInt(this.f110030b);
    }
}
