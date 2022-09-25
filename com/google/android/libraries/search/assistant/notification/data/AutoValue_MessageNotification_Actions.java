package com.google.android.libraries.search.assistant.notification.data;

import android.os.Parcel;
import android.os.Parcelable;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class AutoValue_MessageNotification_Actions extends C$AutoValue_MessageNotification_Actions {
    public static final Parcelable.Creator CREATOR = new C34887h();

    public AutoValue_MessageNotification_Actions(Optional optional, Optional optional2, Optional optional3) {
        super(optional, optional2, optional3);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C34895p.m63752b(this.f92492a, parcel);
        C34895p.m63752b(this.f92493b, parcel);
        parcel.writeParcelable((Parcelable) this.f92494c.orElse(null), 0);
    }
}
