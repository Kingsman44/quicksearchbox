package com.google.p5238v.p5239a.p5240a.p5241a;

import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import com.google.p5238v.p5239a.p5259m.C67886p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* renamed from: com.google.v.a.a.a.g */
/* compiled from: PG */
public abstract class C67494g {

    /* renamed from: a */
    private final C67492e f183430a;

    /* renamed from: b */
    private final C67492e f183431b;

    public C67494g(byte[] bArr) {
        if (C67543a.m97645a(1)) {
            this.f183430a = mo59885a(bArr, 1);
            this.f183431b = mo59885a(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    /* renamed from: d */
    private final byte[] m97498d(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.f183431b.mo59883c(bArr, 0).get(bArr2);
        return bArr2;
    }

    /* renamed from: e */
    private static byte[] m97499e(byte[] bArr, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i2 = i == 0 ? remaining : (remaining + 16) - i;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(0);
        order.put(byteBuffer);
        order.position(i2);
        order.putLong(0);
        order.putLong((long) remaining);
        return order.array();
    }

    /* renamed from: a */
    public abstract C67492e mo59885a(byte[] bArr, int i);

    /* renamed from: b */
    public final void mo59886b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int remaining = byteBuffer.remaining();
        int length = bArr2.length;
        if (remaining >= length + 16) {
            int position = byteBuffer.position();
            C67492e eVar = this.f183430a;
            if (byteBuffer.remaining() >= length) {
                eVar.mo59884d(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
                byteBuffer.position(position);
                byteBuffer.limit(byteBuffer.limit() - 16);
                byte[] a = C67497j.m97506a(m97498d(bArr), m97499e(bArr3, byteBuffer));
                byteBuffer.limit(byteBuffer.limit() + 16);
                byteBuffer.put(a);
                return;
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: c */
    public final byte[] mo59887c(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            try {
                if (C67886p.m98134b(C67497j.m97506a(m97498d(bArr), m97499e(bArr2, byteBuffer)), bArr3)) {
                    byteBuffer.position(position);
                    C67492e eVar = this.f183430a;
                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                    eVar.mo59884d(bArr, allocate, byteBuffer);
                    return allocate.array();
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }
}
