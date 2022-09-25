package com.google.p5238v.p5239a.p5259m;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.v.a.m.k */
/* compiled from: PG */
public final class C67881k extends C67852ay {

    /* renamed from: a */
    public final int f184042a;

    /* renamed from: b */
    private final int f184043b;

    /* renamed from: c */
    private final int f184044c;

    /* renamed from: d */
    private final String f184045d;

    /* renamed from: e */
    private final byte[] f184046e;

    public C67881k(byte[] bArr, String str, int i, int i2) {
        int length = bArr.length;
        if (length < 16 || length < i) {
            int max = Math.max(16, i);
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + max);
        }
        C67870bp.m98083a(i);
        if (i2 > this.f184042a + 24) {
            this.f184046e = Arrays.copyOf(bArr, length);
            this.f184045d = str;
            this.f184042a = i;
            this.f184043b = i2;
            this.f184044c = i2 - 16;
            return;
        }
        throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
    }

    /* renamed from: i */
    public static Cipher m98121i() {
        return (Cipher) C67838ak.f183948a.mo59993a("AES/GCM/NoPadding");
    }

    /* renamed from: j */
    public static GCMParameterSpec m98122j(byte[] bArr, long j, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        C67869bo.m98077b(allocate, j);
        allocate.put(z ? (byte) 1 : 0);
        return new GCMParameterSpec(128, allocate.array());
    }

    /* renamed from: c */
    public final int mo59997c() {
        return this.f184042a + 8;
    }

    /* renamed from: d */
    public final int mo59998d() {
        return this.f184043b;
    }

    /* renamed from: e */
    public final int mo59999e() {
        return this.f184042a + 8;
    }

    /* renamed from: f */
    public final int mo60000f() {
        return this.f184044c;
    }

    /* renamed from: g */
    public final /* synthetic */ C67865bk mo60001g() {
        return new C67879i(this);
    }

    /* renamed from: h */
    public final /* synthetic */ C67866bl mo60002h(byte[] bArr) {
        return new C67880j(this, bArr);
    }

    /* renamed from: k */
    public final SecretKeySpec mo60028k(byte[] bArr, byte[] bArr2) {
        return new SecretKeySpec(C67850aw.m98042a(this.f184045d, this.f184046e, bArr, bArr2, this.f184042a), "AES");
    }
}
