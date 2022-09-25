package com.bumptech.glide.load.p299c.p305f;

import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p299c.p301b.C5881c;
import com.bumptech.glide.load.p299c.p304e.C5900e;
import com.bumptech.glide.p291h.C5615b;
import com.bumptech.glide.p291h.C5616c;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.c.f.d */
/* compiled from: PG */
public final class C5914d implements C5915e {
    /* renamed from: a */
    public final C5679av mo12371a(C5679av avVar, C5960s sVar) {
        byte[] bArr;
        ByteBuffer b = ((C5900e) avVar.mo12160c()).mo12351b();
        int i = C5616c.f16951a;
        C5615b bVar = null;
        if (!b.isReadOnly() && b.hasArray()) {
            bVar = new C5615b(b.array(), b.arrayOffset(), b.limit());
        }
        if (bVar != null && bVar.f16948a == 0 && bVar.f16949b == bVar.f16950c.length) {
            bArr = b.array();
        } else {
            ByteBuffer asReadOnlyBuffer = b.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer.limit()];
            C5616c.m14583d(asReadOnlyBuffer);
            asReadOnlyBuffer.get(bArr2);
            bArr = bArr2;
        }
        return new C5881c(bArr);
    }
}
