package com.google.android.libraries.accessibility.voiceaccess.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.accessibility.voiceaccess.api.p10973a.C147336b;

/* compiled from: PG */
public class VoiceAccessClientEventData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C147347e();

    /* renamed from: a */
    public final C147336b f397724a;

    public VoiceAccessClientEventData(C147336b bVar) {
        this.f397724a = bVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f397724a.toByteArray());
    }
}
