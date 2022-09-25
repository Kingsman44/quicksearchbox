package com.google.android.libraries.web.webview.contrib.setup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* renamed from: com.google.android.libraries.web.webview.contrib.setup.a */
/* compiled from: PG */
final class C44382a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_WebViewSetupFeature((WebFeatureConfig) parcel.readParcelable(WebViewSetupFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_WebViewSetupFeature[i];
    }
}
