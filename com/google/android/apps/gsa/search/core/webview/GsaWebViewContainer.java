package com.google.android.apps.gsa.search.core.webview;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebView;

/* compiled from: PG */
public abstract class GsaWebViewContainer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87257c();

    /* renamed from: a */
    public abstract WebView mo80858a();

    /* renamed from: b */
    public abstract String mo80859b();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mo80859b());
    }
}
