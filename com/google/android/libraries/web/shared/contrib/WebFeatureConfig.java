package com.google.android.libraries.web.shared.contrib;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.keys.ParcelableCallbackKeyMultimap;
import com.google.common.p4522b.C58528ij;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class WebFeatureConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C44087e();

    /* renamed from: a */
    public final boolean f114757a;

    /* renamed from: b */
    public final Set f114758b;

    /* renamed from: c */
    public final boolean f114759c;

    /* renamed from: d */
    public final boolean f114760d;

    /* renamed from: e */
    private final ParcelableCallbackKeyMultimap f114761e;

    public WebFeatureConfig(boolean z, Set set, boolean z2, boolean z3, ParcelableCallbackKeyMultimap parcelableCallbackKeyMultimap) {
        C69664n.m101061g(set, "postMessageConfigs");
        C69664n.m101061g(parcelableCallbackKeyMultimap, "callbackKeys");
        this.f114757a = z;
        this.f114758b = set;
        this.f114759c = z2;
        this.f114760d = z3;
        this.f114761e = parcelableCallbackKeyMultimap;
    }

    /* renamed from: a */
    public final Set mo47049a(Class cls) {
        C58528ij a = this.f114761e.mo47067a(cls);
        C69664n.m101060f(a, "callbackKeys.getKeys(callbackClass)");
        return a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebFeatureConfig)) {
            return false;
        }
        WebFeatureConfig webFeatureConfig = (WebFeatureConfig) obj;
        return this.f114757a == webFeatureConfig.f114757a && C69664n.m101066l(this.f114758b, webFeatureConfig.f114758b) && this.f114759c == webFeatureConfig.f114759c && this.f114760d == webFeatureConfig.f114760d && C69664n.m101066l(this.f114761e, webFeatureConfig.f114761e);
    }

    public final int hashCode() {
        return ((((((((this.f114757a ? 1 : 0) * true) + this.f114758b.hashCode()) * 31) + (this.f114759c ? 1 : 0)) * 31) + (this.f114760d ? 1 : 0)) * 31) + this.f114761e.hashCode();
    }

    public final String toString() {
        boolean z = this.f114757a;
        Set set = this.f114758b;
        boolean z2 = this.f114759c;
        boolean z3 = this.f114760d;
        ParcelableCallbackKeyMultimap parcelableCallbackKeyMultimap = this.f114761e;
        return "WebFeatureConfig(isDisabledInIncognito=" + z + ", postMessageConfigs=" + set + ", isDisabledInWebView=" + z2 + ", isDisabledInWebLayer=" + z3 + ", callbackKeys=" + parcelableCallbackKeyMultimap + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C69664n.m101061g(parcel, "out");
        parcel.writeInt(this.f114757a ? 1 : 0);
        Set<Parcelable> set = this.f114758b;
        parcel.writeInt(set.size());
        for (Parcelable writeParcelable : set) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeInt(this.f114759c ? 1 : 0);
        parcel.writeInt(this.f114760d ? 1 : 0);
        parcel.writeParcelable(this.f114761e, i);
    }
}
