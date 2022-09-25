package com.google.android.libraries.material.opensearchbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.material.opensearchbar.OpenSearchBar;

/* renamed from: com.google.android.libraries.material.opensearchbar.a */
/* compiled from: PG */
final class C28545a implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new OpenSearchBar.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OpenSearchBar.SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new OpenSearchBar.SavedState(parcel, classLoader);
    }
}
