package com.google.android.libraries.accessibility.voiceaccess.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.accessibility.voiceaccess.api.p10973a.C147336b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.accessibility.voiceaccess.api.e */
/* compiled from: PG */
final class C147347e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return new VoiceAccessClientEventData((C147336b) C62942bv.parseFrom((C62942bv) C147336b.f397726f, parcel.createByteArray()));
        } catch (C62974ct e) {
            throw new RuntimeException("Failed to parse event data.", e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new VoiceAccessClientEventData[i];
    }
}
