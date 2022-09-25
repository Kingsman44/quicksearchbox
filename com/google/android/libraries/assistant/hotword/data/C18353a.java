package com.google.android.libraries.assistant.hotword.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;

/* renamed from: com.google.android.libraries.assistant.hotword.data.a */
/* compiled from: PG */
final class C18353a implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.readFloat();
        return new AutoValue_HotwordData(parcel.readString(), (SpeakerIdModel) parcel.readParcelable(SpeakerIdModel.class.getClassLoader()), parcel.createByteArray(), parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt(), parcel.readInt(), parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HotwordData[i];
    }
}
