package com.google.android.libraries.accessibility.voiceaccess.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.accessibility.voiceaccess.api.p10973a.C147339e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.accessibility.voiceaccess.api.f */
/* compiled from: PG */
final class C147348f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return new VoiceAccessServiceEventData((C147339e) C62942bv.parseFrom((C62942bv) C147339e.f397734c, parcel.createByteArray()));
        } catch (C62974ct e) {
            throw new RuntimeException("Failed to parse event data.", e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new VoiceAccessServiceEventData[i];
    }
}
