package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.lens.common.text.C24137m;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.n */
/* compiled from: PG */
final class C24879n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C58974d dVar = RenderableParagraph.f67925a;
        C24137m mVar = C24137m.f65898g;
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            mVar = (C24137m) C62942bv.parseFrom((C62942bv) C24137m.f65898g, bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) RenderableParagraph.f67925a.mo56226d()).mo56382g(e)).mo56372aa(48921)).mo56386p("Could not parse lens.common.text.RenderableParagraph from parcel");
        }
        return new RenderableParagraph(mVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RenderableParagraph[i];
    }
}
