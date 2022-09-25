package com.google.android.enterprise.connectedapps.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public interface Bundler extends Parcelable {
    /* renamed from: a */
    Object mo86969a(Bundle bundle, String str, BundlerType bundlerType);

    /* renamed from: b */
    Object mo86970b(Parcel parcel, BundlerType bundlerType);

    /* renamed from: c */
    void mo86971c(Bundle bundle, String str, Object obj, BundlerType bundlerType);

    /* renamed from: d */
    void mo86972d(Parcel parcel, Object obj, BundlerType bundlerType, int i);
}
