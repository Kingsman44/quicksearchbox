package com.google.android.libraries.social.populous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.SourceIdentity;
import com.google.common.p4522b.C58485gu;

/* compiled from: PG */
public final class AutoValue_IdentityInfo extends C$AutoValue_IdentityInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42592m();

    static {
        AutoValue_IdentityInfo.class.getClassLoader();
    }

    public AutoValue_IdentityInfo(Parcel parcel) {
        super(C58485gu.m89844l((SourceIdentity[]) C58485gu.m89844l(parcel.readParcelableArray(SourceIdentity.class.getClassLoader())).toArray(new SourceIdentity[0])));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray((Parcelable[]) this.f110331a.toArray(new Parcelable[0]), 0);
    }

    public AutoValue_IdentityInfo(C58485gu guVar) {
        super(guVar);
    }
}
