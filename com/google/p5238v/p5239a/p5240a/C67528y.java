package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.C67539aj;
import com.google.p5238v.p5239a.p5255j.C67725da;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.a.y */
/* compiled from: PG */
public final class C67528y implements C67486a {

    /* renamed from: a */
    private static final byte[] f183436a = new byte[0];

    /* renamed from: b */
    private final C67725da f183437b;

    /* renamed from: c */
    private final C67486a f183438c;

    public C67528y(C67725da daVar, C67486a aVar) {
        this.f183437b = daVar;
        this.f183438c = aVar;
    }

    /* renamed from: a */
    public final byte[] mo59877a(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((C67486a) C67539aj.m97632g(this.f183437b.f183751a, this.f183438c.mo59877a(bArr3, f183436a), C67486a.class)).mo59877a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    /* renamed from: b */
    public final byte[] mo59878b(byte[] bArr, byte[] bArr2) {
        byte[] byteArray = C67539aj.m97628c(this.f183437b).toByteArray();
        byte[] b = this.f183438c.mo59878b(byteArray, f183436a);
        byte[] b2 = ((C67486a) C67539aj.m97632g(this.f183437b.f183751a, byteArray, C67486a.class)).mo59878b(bArr, bArr2);
        int length = b.length;
        return ByteBuffer.allocate(length + 4 + b2.length).putInt(length).put(b).put(b2).array();
    }
}
