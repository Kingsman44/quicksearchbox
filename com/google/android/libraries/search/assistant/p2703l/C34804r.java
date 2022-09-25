package com.google.android.libraries.search.assistant.p2703l;

import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p5488io.grpc.C70293cv;

/* renamed from: com.google.android.libraries.search.assistant.l.r */
/* compiled from: PG */
final class C34804r implements C70293cv {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23994a(byte[] bArr) {
        try {
            return (C34793g) C62942bv.parseFrom((C62942bv) C34793g.f92320c, bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ byte[] mo23995b(Object obj) {
        return ((C34793g) obj).toByteArray();
    }
}
