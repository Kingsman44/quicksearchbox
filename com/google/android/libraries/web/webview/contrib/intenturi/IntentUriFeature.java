package com.google.android.libraries.web.webview.contrib.intenturi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.C44083a;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.common.p4522b.C58528ij;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class IntentUriFeature implements WebFeature {
    public static final Parcelable.Creator CREATOR = new C44374a();

    /* renamed from: a */
    private final WebFeatureConfig f115371a;

    public IntentUriFeature(WebFeatureConfig webFeatureConfig) {
        this.f115371a = webFeatureConfig;
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f115371a;
    }

    /* renamed from: b */
    public final /* synthetic */ C58528ij mo41577b() {
        return C44083a.m77834a();
    }

    /* renamed from: c */
    public final /* synthetic */ Class mo41578c() {
        return getClass();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntentUriFeature) && C69664n.m101066l(this.f115371a, ((IntentUriFeature) obj).f115371a);
    }

    public final int hashCode() {
        return this.f115371a.hashCode();
    }

    public final String toString() {
        WebFeatureConfig webFeatureConfig = this.f115371a;
        return "IntentUriFeature(config=" + webFeatureConfig + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C69664n.m101061g(parcel, "out");
        parcel.writeParcelable(this.f115371a, i);
    }
}
