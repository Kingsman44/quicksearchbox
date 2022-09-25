package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
final class AutoValue_AddressComponent extends C$AutoValue_AddressComponent {
    public static final Parcelable.Creator CREATOR = new C31874g();

    public AutoValue_AddressComponent(String str, String str2, List list) {
        super(str, str2, list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f85502a);
        if (this.f85503b == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f85503b);
        }
        parcel.writeList(this.f85504c);
    }
}
