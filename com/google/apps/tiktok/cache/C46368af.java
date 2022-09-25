package com.google.apps.tiktok.cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.tiktok.cache.ParcelableKeyValueStore;

/* renamed from: com.google.apps.tiktok.cache.af */
/* compiled from: PG */
final class C46368af implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        ParcelableKeyValueStore.ParcelableEntry[] parcelableEntryArr = new ParcelableKeyValueStore.ParcelableEntry[readInt];
        for (int i = 0; i < readInt; i++) {
            parcelableEntryArr[i] = (ParcelableKeyValueStore.ParcelableEntry) parcel.readParcelable(ParcelableKeyValueStore.ParcelableEntry.class.getClassLoader());
        }
        return new ParcelableKeyValueStore(parcelableEntryArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableKeyValueStore[i];
    }
}
