package com.google.android.libraries.search.assistant.p2705n.p2706a;

import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p5488io.grpc.C70293cv;

/* renamed from: com.google.android.libraries.search.assistant.n.a.b */
/* compiled from: PG */
final class C34828b implements C70293cv {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23994a(byte[] bArr) {
        try {
            return C34819a.m63579b((C34834b) C62942bv.parseFrom((C62942bv) C34834b.f92401c, bArr, C62921ba.m95368a()));
        } catch (C62974ct e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ byte[] mo23995b(Object obj) {
        return ((C34819a) obj).mo39521d().toByteArray();
    }
}
