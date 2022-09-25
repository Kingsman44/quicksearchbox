package com.google.apps.tiktok.cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.tiktok.cache.ParcelableKeyValueStore;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.apps.tiktok.cache.ag */
/* compiled from: PG */
final class C46369ag implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelableKeyValueStore.ParcelableEntry((ProtoParsers.ParcelableProto) parcel.readParcelable(ProtoParsers.ParcelableProto.class.getClassLoader()), (ProtoParsers.ParcelableProto) parcel.readParcelable(ProtoParsers.ParcelableProto.class.getClassLoader()), parcel.readLong());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableKeyValueStore.ParcelableEntry[i];
    }
}
