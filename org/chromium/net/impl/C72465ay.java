package org.chromium.net.impl;

import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: org.chromium.net.impl.ay */
/* compiled from: PG */
final class C72465ay implements C72500cf {

    /* renamed from: a */
    final /* synthetic */ boolean f192824a;

    /* renamed from: b */
    final /* synthetic */ C72470bc f192825b;

    public C72465ay(C72470bc bcVar, boolean z) {
        this.f192825b = bcVar;
        this.f192824a = z;
    }

    /* renamed from: a */
    public final void mo64214a() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f192825b.f192832c.flip();
        C72470bc bcVar = this.f192825b;
        long j = bcVar.f192833d;
        if (j == -1 || j - bcVar.f192834e >= ((long) bcVar.f192832c.remaining())) {
            C72470bc bcVar2 = this.f192825b;
            bcVar2.f192834e += (long) bcVar2.mo64215a(bcVar2.f192832c);
            C72470bc bcVar3 = this.f192825b;
            long j2 = bcVar3.f192834e;
            long j3 = bcVar3.f192833d;
            if (j2 >= j3) {
                if (j3 == -1) {
                    if (this.f192824a) {
                        j3 = -1;
                    }
                }
                if (j3 == -1) {
                    bcVar3.mo64219e();
                    return;
                } else if (j3 == j2) {
                    bcVar3.mo64219e();
                    return;
                } else {
                    Locale locale = Locale.getDefault();
                    C72470bc bcVar4 = this.f192825b;
                    bcVar3.mo64221g(new IllegalArgumentException(String.format(locale, "Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(bcVar4.f192834e), Long.valueOf(bcVar4.f192833d)})));
                    return;
                }
            }
            ByteBuffer byteBuffer2 = (ByteBuffer) bcVar3.f192832c.clear();
            this.f192825b.f192830a.set(0);
            this.f192825b.mo64218d(new C72464ax(this));
            return;
        }
        C72470bc bcVar5 = this.f192825b;
        Locale locale2 = Locale.getDefault();
        C72470bc bcVar6 = this.f192825b;
        bcVar5.mo64221g(new IllegalArgumentException(String.format(locale2, "Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(bcVar6.f192834e + ((long) bcVar6.f192832c.remaining())), Long.valueOf(this.f192825b.f192833d)})));
    }
}
