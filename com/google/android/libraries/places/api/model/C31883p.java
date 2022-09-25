package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;

/* renamed from: com.google.android.libraries.places.api.model.p */
/* compiled from: PG */
final class C31883p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        return new AutoValue_Place(parcel.readInt() == 0 ? parcel.readString() : null, (AddressComponents) parcel2.readParcelable(Place.class.getClassLoader()), (Place.BusinessStatus) parcel2.readParcelable(Place.class.getClassLoader()), parcel2.readArrayList(Place.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, (LatLng) parcel2.readParcelable(Place.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, (OpeningHours) parcel2.readParcelable(Place.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel2.readArrayList(Place.class.getClassLoader()), (PlusCode) parcel2.readParcelable(Place.class.getClassLoader()), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Double.valueOf(parcel.readDouble()) : null, parcel2.readArrayList(Place.class.getClassLoader()), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, (LatLngBounds) parcel2.readParcelable(Place.class.getClassLoader()), (Uri) parcel2.readParcelable(Place.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_Place[i];
    }
}
