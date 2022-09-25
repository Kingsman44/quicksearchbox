package org.chromium.net.impl;

import java.nio.ByteBuffer;

/* renamed from: org.chromium.net.impl.bb */
/* compiled from: PG */
final class C72469bb implements C72500cf {

    /* renamed from: a */
    final /* synthetic */ boolean f192828a;

    /* renamed from: b */
    final /* synthetic */ C72470bc f192829b;

    public C72469bb(C72470bc bcVar, boolean z) {
        this.f192829b = bcVar;
        this.f192828a = z;
    }

    /* renamed from: a */
    public final void mo64214a() {
        C72470bc bcVar = this.f192829b;
        bcVar.f192833d = ((C72520cz) bcVar.f192831b).f192966a.getLength();
        C72470bc bcVar2 = this.f192829b;
        long j = bcVar2.f192833d;
        if (j == 0) {
            bcVar2.mo64219e();
            return;
        }
        if (j <= 0 || j >= 8192) {
            bcVar2.f192832c = ByteBuffer.allocateDirect(8192);
        } else {
            bcVar2.f192832c = ByteBuffer.allocateDirect(((int) j) + 1);
        }
        C72470bc bcVar3 = this.f192829b;
        long j2 = bcVar3.f192833d;
        if (j2 > 0) {
            ((C72496cb) bcVar3).f192882f.setFixedLengthStreamingMode(j2);
        } else {
            ((C72496cb) bcVar3).f192882f.setChunkedStreamingMode(8192);
        }
        if (this.f192828a) {
            this.f192829b.mo64222h();
            return;
        }
        this.f192829b.f192830a.set(1);
        C72470bc bcVar4 = this.f192829b;
        ((C72520cz) bcVar4.f192831b).f192966a.rewind(bcVar4);
    }
}
