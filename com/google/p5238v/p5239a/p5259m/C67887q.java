package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.p5240a.p5241a.C67493f;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.v.a.m.q */
/* compiled from: PG */
public final class C67887q implements C67486a {

    /* renamed from: a */
    private final C67493f f184054a;

    public C67887q(byte[] bArr) {
        this.f184054a = new C67493f(bArr);
    }

    /* renamed from: a */
    public final byte[] mo59877a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.f184054a.mo59887c(ByteBuffer.wrap(bArr, 12, length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo59878b(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] a = C67859be.m98062a(12);
        allocate.put(a);
        this.f184054a.mo59886b(allocate, a, bArr, bArr2);
        return allocate.array();
    }
}
