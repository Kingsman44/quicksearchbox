package com.google.p5238v.p5239a.p5246d.p5247a;

import com.google.p5238v.p5239a.p5240a.p5241a.C67493f;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.v.a.d.a.b */
/* compiled from: PG */
final class C67555b implements C67557d {
    /* renamed from: a */
    public final int mo59917a() {
        return 32;
    }

    /* renamed from: b */
    public final int mo59918b() {
        return 12;
    }

    /* renamed from: c */
    public final byte[] mo59919c() {
        return C67569p.f183492k;
    }

    /* renamed from: d */
    public final byte[] mo59920d(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            C67493f fVar = new C67493f(bArr);
            int length = bArr3.length;
            if (length <= 2147483631) {
                ByteBuffer allocate = ByteBuffer.allocate(length + 16);
                fVar.mo59886b(allocate, bArr2, bArr3, bArr4);
                return allocate.array();
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }
}
