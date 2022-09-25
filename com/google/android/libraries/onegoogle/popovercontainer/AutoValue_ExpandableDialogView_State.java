package com.google.android.libraries.onegoogle.popovercontainer;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
final class AutoValue_ExpandableDialogView_State extends C$AutoValue_ExpandableDialogView_State {
    public static final Parcelable.Creator CREATOR = new C31025a();

    public AutoValue_ExpandableDialogView_State(boolean z, Parcelable parcelable) {
        super(z, parcelable);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f83537a ? 1 : 0);
        parcel.writeParcelable(this.f83538b, i);
    }
}
