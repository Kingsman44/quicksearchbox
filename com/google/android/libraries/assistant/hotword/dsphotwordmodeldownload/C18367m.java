package com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* renamed from: com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.m */
/* compiled from: PG */
final class C18367m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_DspModelInformation(parcel.readString(), parcel.readInt(), parcel.readInt(), UUID.fromString(parcel.readString()), parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DspModelInformation[i];
    }
}
