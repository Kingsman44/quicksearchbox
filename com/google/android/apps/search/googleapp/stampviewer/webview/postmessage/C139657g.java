package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.g */
/* compiled from: PG */
final class C139657g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new AutoValue_AmpPostMessageConfig(z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_AmpPostMessageConfig[i];
    }
}
