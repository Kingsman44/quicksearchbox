package com.google.android.libraries.web.webview.contrib.stuckjs;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.web.webview.contrib.stuckjs.a */
/* compiled from: PG */
final class C44389a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_StuckJsFeature(parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_StuckJsFeature[i];
    }
}
