package com.google.android.libraries.accessibility.voiceaccess.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.accessibility.voiceaccess.api.p10973a.C147339e;

/* compiled from: PG */
public class VoiceAccessServiceEventData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C147348f();

    /* renamed from: a */
    public final C147339e f397725a;

    public VoiceAccessServiceEventData(C147339e eVar) {
        this.f397725a = eVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f397725a.toByteArray());
    }
}
