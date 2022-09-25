package com.google.android.apps.gsa.search.core.webview;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebView;

/* renamed from: com.google.android.apps.gsa.search.core.webview.c */
/* compiled from: PG */
final class C87257c implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_GsaWebViewContainer((WebView) null, parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GsaWebViewContainer[i];
    }
}
