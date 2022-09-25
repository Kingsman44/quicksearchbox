package com.google.apps.tiktok.tracing.contrib.grpc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.tiktok.tracing.contrib.grpc.MetadataTracePropagation;

/* renamed from: com.google.apps.tiktok.tracing.contrib.grpc.a */
/* compiled from: PG */
final class C47676a implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MetadataTracePropagation.TraceReferencingDummyParcelable();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MetadataTracePropagation.TraceReferencingDummyParcelable[i];
    }
}
