package com.google.android.libraries.web.webview.contrib.intenturi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.contrib.intenturi.a */
/* compiled from: PG */
public final class C44374a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C69664n.m101061g(parcel, "parcel");
        return new IntentUriFeature((WebFeatureConfig) parcel.readParcelable(IntentUriFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new IntentUriFeature[i];
    }
}
