package com.google.ads.interactivemedia.p367v3.internal;

import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ra */
/* compiled from: PG */
public abstract class C7245ra {
    /* renamed from: a */
    public final C7243qz mo16355a(C7024iw iwVar) {
        ByteBuffer byteBuffer = iwVar.f22515b;
        ary.m19467t(byteBuffer);
        boolean z = false;
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        }
        ary.m19462o(z);
        if (iwVar.mo16031b()) {
            return null;
        }
        return mo16356b(byteBuffer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C7243qz mo16356b(ByteBuffer byteBuffer);
}
