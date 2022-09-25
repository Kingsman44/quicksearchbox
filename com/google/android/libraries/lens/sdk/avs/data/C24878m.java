package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.m */
/* compiled from: PG */
final class C24878m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C58974d dVar = RenderableGleam.f67923a;
        C25308ap apVar = C25308ap.f68839y;
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            apVar = (C25308ap) C62942bv.parseFrom((C62942bv) C25308ap.f68839y, bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) RenderableGleam.f67923a.mo56226d()).mo56382g(e)).mo56372aa(48920)).mo56386p("Could not parse RenderableGleamProto from parcel");
        }
        return new RenderableGleam(apVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RenderableGleam[i];
    }
}
