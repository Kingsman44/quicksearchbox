package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.C67909y;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.v.a.m.aj */
/* compiled from: PG */
public final class C67837aj implements C67486a {

    /* renamed from: a */
    private final C67851ax f183945a;

    /* renamed from: b */
    private final C67909y f183946b;

    /* renamed from: c */
    private final int f183947c;

    public C67837aj(C67851ax axVar, C67909y yVar, int i) {
        this.f183945a = axVar;
        this.f183946b = yVar;
        this.f183947c = i;
    }

    /* renamed from: a */
    public final byte[] mo59877a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f183947c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.f183947c, length);
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0).array(), 8);
            this.f183946b.mo59961a(copyOfRange2, C67886p.m98135c(bArr2, copyOfRange, copyOf));
            return this.f183945a.mo59995a(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo59878b(byte[] bArr, byte[] bArr2) {
        byte[] b = this.f183945a.mo59996b(bArr);
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0).array(), 8);
        return C67886p.m98135c(b, this.f183946b.mo59962b(C67886p.m98135c(bArr2, b, copyOf)));
    }
}
