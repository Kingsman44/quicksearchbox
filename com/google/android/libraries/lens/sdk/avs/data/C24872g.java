package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.g */
/* compiled from: PG */
final class C24872g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C58974d dVar = LensAppFlowEventMetadata.f67921a;
        C59898bg bgVar = C59898bg.f161866v;
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            bgVar = (C59898bg) C62942bv.parseFrom((C62942bv) C59898bg.f161866v, bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) LensAppFlowEventMetadata.f67921a.mo56226d()).mo56382g(e)).mo56372aa(48919)).mo56386p("Could not parse LensAppFlowEventMetadata from parcel");
        }
        return new LensAppFlowEventMetadata(bgVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LensAppFlowEventMetadata[i];
    }
}
