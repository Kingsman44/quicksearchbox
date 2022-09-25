package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
final class AutoValue_AutocompletePrediction extends C$AutoValue_AutocompletePrediction {
    public static final Parcelable.Creator CREATOR = new C31876i();

    public AutoValue_AutocompletePrediction(String str, Integer num, List list, String str2, String str3, String str4, List list2, List list3, List list4) {
        super(str, num, list, str2, str3, str4, list2, list3, list4);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f85506a);
        if (this.f85507b == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.f85507b.intValue());
        }
        parcel.writeList(this.f85508c);
        parcel.writeString(this.f85509d);
        parcel.writeString(this.f85510e);
        parcel.writeString(this.f85511f);
        parcel.writeList(this.f85512g);
        parcel.writeList(this.f85513h);
        parcel.writeList(this.f85514i);
    }
}
