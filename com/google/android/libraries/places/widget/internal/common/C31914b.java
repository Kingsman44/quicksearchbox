package com.google.android.libraries.places.widget.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.places.widget.internal.common.b */
/* compiled from: PG */
final class C31914b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_AutocompleteOptions((AutocompleteActivityMode) parcel.readParcelable(AutocompleteOptions.class.getClassLoader()), C58485gu.m89842j(parcel.readArrayList(Place.Field.class.getClassLoader())), (AutocompleteActivityOrigin) parcel.readParcelable(AutocompleteOptions.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (LocationBias) parcel.readParcelable(AutocompleteOptions.class.getClassLoader()), (LocationRestriction) parcel.readParcelable(AutocompleteOptions.class.getClassLoader()), C58485gu.m89842j(parcel.readArrayList(String.class.getClassLoader())), (TypeFilter) parcel.readParcelable(AutocompleteOptions.class.getClassLoader()), C58485gu.m89842j(parcel.readArrayList(String.class.getClassLoader())), parcel.readInt(), parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_AutocompleteOptions[i];
    }
}
