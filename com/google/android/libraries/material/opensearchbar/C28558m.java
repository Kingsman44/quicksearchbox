package com.google.android.libraries.material.opensearchbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;

/* renamed from: com.google.android.libraries.material.opensearchbar.m */
/* compiled from: PG */
final class C28558m implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new OpenSearchView.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OpenSearchView.SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new OpenSearchView.SavedState(parcel, classLoader);
    }
}
