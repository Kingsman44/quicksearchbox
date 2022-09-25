package com.google.android.libraries.places.widget.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.common.p4522b.C58485gu;

/* compiled from: PG */
public final class AutoValue_AutocompleteOptions extends C$AutoValue_AutocompleteOptions {
    public static final Parcelable.Creator CREATOR = new C31914b();

    public AutoValue_AutocompleteOptions(AutocompleteActivityMode autocompleteActivityMode, C58485gu guVar, AutocompleteActivityOrigin autocompleteActivityOrigin, String str, String str2, LocationBias locationBias, LocationRestriction locationRestriction, C58485gu guVar2, TypeFilter typeFilter, C58485gu guVar3, int i, int i2) {
        super(autocompleteActivityMode, guVar, autocompleteActivityOrigin, str, str2, locationBias, locationRestriction, guVar2, typeFilter, guVar3, i, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f85811a, i);
        parcel.writeList(this.f85812b);
        parcel.writeParcelable(this.f85813c, i);
        if (this.f85814d == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f85814d);
        }
        if (this.f85815e == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f85815e);
        }
        parcel.writeParcelable(this.f85816f, i);
        parcel.writeParcelable(this.f85817g, i);
        parcel.writeList(this.f85818h);
        parcel.writeParcelable(this.f85819i, i);
        parcel.writeList(this.f85820j);
        parcel.writeInt(this.f85821k);
        parcel.writeInt(this.f85822l);
    }
}
