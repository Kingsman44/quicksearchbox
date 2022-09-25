package com.android.p247a.p249b.p252b;

import com.android.p247a.p254c.C5010a;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* renamed from: com.android.a.b.b.a */
/* compiled from: PG */
public final class C5000a implements C5010a {

    /* renamed from: a */
    private final ByteBuffer f15845a;

    public C5000a(ByteBuffer byteBuffer) {
        this.f15845a = byteBuffer;
    }

    /* renamed from: a */
    public final void mo9925a(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        try {
            this.f15845a.put(byteBuffer);
        } catch (BufferOverflowException e) {
            throw new IOException("Insufficient space in output buffer for " + remaining + " bytes", e);
        }
    }

    /* renamed from: b */
    public final void mo9926b(byte[] bArr, int i, int i2) {
        try {
            this.f15845a.put(bArr, 0, i2);
        } catch (BufferOverflowException e) {
            throw new IOException("Insufficient space in output buffer for " + i2 + " bytes", e);
        }
    }
}
