package com.google.android.apps.gsa.staticplugins.bisto.p7491i;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63136b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.i.a */
/* compiled from: PG */
public final /* synthetic */ class C95459a implements C58817ah {
    public final Object apply(Object obj) {
        byte[] bArr = (byte[]) obj;
        boolean z = false;
        if (bArr == null) {
            ((C59052c) ((C59052c) C95465g.f267135a.mo56226d()).mo56372aa(15067)).mo56386p("Data received is null.");
        } else {
            try {
                C63136b bVar = (C63136b) C62942bv.parseFrom((C62942bv) C63136b.f170492a, bArr, C62921ba.m95368a());
                z = true;
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) C95465g.f267135a.mo56226d()).mo56382g(e)).mo56372aa(15066)).mo56386p("Error parsing proto.");
            }
        }
        return Boolean.valueOf(z);
    }
}
