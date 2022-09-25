package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* compiled from: PG */
final class AutoValue_Place extends C$AutoValue_Place {
    public static final Parcelable.Creator CREATOR = new C31883p();

    public AutoValue_Place(String str, AddressComponents addressComponents, Place.BusinessStatus businessStatus, List list, String str2, LatLng latLng, String str3, OpeningHours openingHours, String str4, List list2, PlusCode plusCode, Integer num, Double d, List list3, Integer num2, Integer num3, LatLngBounds latLngBounds, Uri uri, String str5, Integer num4) {
        super(str, addressComponents, businessStatus, list, str2, latLng, str3, openingHours, str4, list2, plusCode, num, d, list3, num2, num3, latLngBounds, uri, str5, num4);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f85528a == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f85528a);
        }
        parcel.writeParcelable(this.f85529b, i);
        parcel.writeParcelable(this.f85530c, i);
        parcel.writeList(this.f85531d);
        if (this.f85532e == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f85532e);
        }
        parcel.writeParcelable(this.f85533f, i);
        if (this.f85534g == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f85534g);
        }
        parcel.writeParcelable(this.f85535h, i);
        if (this.f85536i == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f85536i);
        }
        parcel.writeList(this.f85537j);
        parcel.writeParcelable(this.f85538k, i);
        if (this.f85539l == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.f85539l.intValue());
        }
        if (this.f85540m == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(this.f85540m.doubleValue());
        }
        parcel.writeList(this.f85541n);
        if (this.f85542o == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.f85542o.intValue());
        }
        if (this.f85543p == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.f85543p.intValue());
        }
        parcel.writeParcelable(this.f85544q, i);
        parcel.writeParcelable(this.f85545r, i);
        if (this.f85546s == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f85546s);
        }
        if (this.f85547t == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeInt(this.f85547t.intValue());
    }
}
