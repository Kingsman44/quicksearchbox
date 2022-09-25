package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public abstract class AbstractBundleable implements Parcelable {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo117436a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo117437b(Bundle bundle);

    public final int describeContents() {
        return 0;
    }

    public String toString() {
        Bundle bundle = new Bundle();
        mo117437b(bundle);
        return bundle.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLEABLE_CLASS_NAME", getClass().getName());
        mo117437b(bundle);
        parcel.writeBundle(bundle);
    }
}
