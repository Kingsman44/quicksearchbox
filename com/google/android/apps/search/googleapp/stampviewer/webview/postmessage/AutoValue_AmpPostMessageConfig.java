package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class AutoValue_AmpPostMessageConfig extends C$AutoValue_AmpPostMessageConfig {
    public static final Parcelable.Creator CREATOR = new C139657g();

    public AutoValue_AmpPostMessageConfig(boolean z) {
        super(z);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f379610a ? 1 : 0);
    }
}
