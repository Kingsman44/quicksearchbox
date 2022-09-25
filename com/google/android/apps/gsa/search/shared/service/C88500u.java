package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.search.shared.service.u */
/* compiled from: PG */
final class C88500u implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new OnTranscriptionUpdateEventParcelable(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OnTranscriptionUpdateEventParcelable[i];
    }
}
