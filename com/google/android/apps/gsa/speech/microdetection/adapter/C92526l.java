package com.google.android.apps.gsa.speech.microdetection.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.speech.microdetection.adapter.VoiceInteractionServiceAlwaysOnHotwordAdapter;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.adapter.l */
/* compiled from: PG */
final class C92526l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new VoiceInteractionServiceAlwaysOnHotwordAdapter.ManageActionResultCallback(parcel.readInt(), (C92517c) parcel.readParcelable(C92517c.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new VoiceInteractionServiceAlwaysOnHotwordAdapter.ManageActionResultCallback[i];
    }
}
