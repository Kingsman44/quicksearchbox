package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.p5240a.p5241a.C67496i;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.v.a.m.br */
/* compiled from: PG */
public final class C67872br implements C67486a {

    /* renamed from: a */
    private final C67496i f184015a;

    public C67872br(byte[] bArr) {
        this.f184015a = new C67496i(bArr);
    }

    /* renamed from: a */
    public final byte[] mo59877a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.f184015a.mo59887c(ByteBuffer.wrap(bArr, 24, length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo59878b(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] a = C67859be.m98062a(24);
        allocate.put(a);
        this.f184015a.mo59886b(allocate, a, bArr, bArr2);
        return allocate.array();
    }
}
