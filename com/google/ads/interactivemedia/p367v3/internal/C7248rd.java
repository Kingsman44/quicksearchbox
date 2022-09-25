package com.google.ads.interactivemedia.p367v3.internal;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.rd */
/* compiled from: PG */
public final class C7248rd extends C7245ra {
    /* renamed from: c */
    public static final C7247rc m21690c(aee aee) {
        String H = aee.mo14544H();
        ary.m19467t(H);
        String H2 = aee.mo14544H();
        ary.m19467t(H2);
        return new C7247rc(H, H2, aee.mo14566t(), aee.mo14566t(), Arrays.copyOfRange(aee.mo14555i(), aee.mo14553g(), aee.mo14551e()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C7243qz mo16356b(ByteBuffer byteBuffer) {
        return new C7243qz(m21690c(new aee(byteBuffer.array(), byteBuffer.limit())));
    }
}
