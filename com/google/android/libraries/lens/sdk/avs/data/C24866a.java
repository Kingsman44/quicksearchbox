package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.a */
/* compiled from: PG */
final class C24866a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C58974d dVar = AppFlowEvent.f67919a;
        C24886u uVar = C24886u.f67966f;
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            uVar = (C24886u) C62942bv.parseFrom((C62942bv) C24886u.f67966f, bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) AppFlowEvent.f67919a.mo56226d()).mo56382g(e)).mo56372aa(48918)).mo56386p("Could not parse AppFlowEvent from parcel");
        }
        return new AppFlowEvent(uVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AppFlowEvent[i];
    }
}
