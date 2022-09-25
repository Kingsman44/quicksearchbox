package com.google.common.p4537i;

import java.util.zip.Checksum;

/* renamed from: com.google.common.i.h */
/* compiled from: PG */
final class C59283h extends C59270a {

    /* renamed from: a */
    private final Checksum f157408a;

    public C59283h(Checksum checksum) {
        checksum.getClass();
        this.f157408a = checksum;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo56740a(byte b) {
        this.f157408a.update(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo56747h(byte[] bArr, int i) {
        this.f157408a.update(bArr, 0, i);
    }

    /* renamed from: p */
    public final C59289n mo56758p() {
        return C59289n.m92111h((int) this.f157408a.getValue());
    }
}
