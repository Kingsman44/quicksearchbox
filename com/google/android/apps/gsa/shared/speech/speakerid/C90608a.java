package com.google.android.apps.gsa.shared.speech.speakerid;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.shared.speech.speakerid.a */
/* compiled from: PG */
final class C90608a implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SpeakerIdModel(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SpeakerIdModel[i];
    }
}
