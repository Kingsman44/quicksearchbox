package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.v.a.m.c */
/* compiled from: PG */
public final class C67873c extends C67852ay {

    /* renamed from: a */
    public final int f184016a;

    /* renamed from: b */
    public final int f184017b;

    /* renamed from: c */
    private final String f184018c;

    /* renamed from: d */
    private final int f184019d;

    /* renamed from: e */
    private final int f184020e;

    /* renamed from: f */
    private final String f184021f;

    /* renamed from: g */
    private final byte[] f184022g;

    public C67873c(byte[] bArr, String str, int i, String str2, int i2, int i3) {
        if (C67543a.m97645a(1)) {
            int length = bArr.length;
            if (length < 16 || length < i) {
                int max = Math.max(16, i);
                throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + max);
            }
            C67870bp.m98083a(i);
            if (i2 < 10) {
                throw new InvalidAlgorithmParameterException("tag size too small " + i2);
            } else if ((!str2.equals("HmacSha1") || i2 <= 20) && ((!str2.equals("HmacSha256") || i2 <= 32) && (!str2.equals("HmacSha512") || i2 <= 64))) {
                int i4 = i3 - i2;
                if ((i4 - i) - 8 > 0) {
                    this.f184022g = Arrays.copyOf(bArr, length);
                    this.f184021f = str;
                    this.f184016a = i;
                    this.f184018c = str2;
                    this.f184017b = i2;
                    this.f184019d = i3;
                    this.f184020e = i4;
                    return;
                }
                throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
            } else {
                throw new InvalidAlgorithmParameterException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
        }
    }

    /* renamed from: i */
    public static Cipher m98093i() {
        return (Cipher) C67838ak.f183948a.mo59993a("AES/CTR/NoPadding");
    }

    /* renamed from: n */
    public static final byte[] m98094n(byte[] bArr, long j, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        C67869bo.m98077b(allocate, j);
        allocate.put(z ? (byte) 1 : 0);
        allocate.putInt(0);
        return allocate.array();
    }

    /* renamed from: c */
    public final int mo59997c() {
        return this.f184016a + 8;
    }

    /* renamed from: d */
    public final int mo59998d() {
        return this.f184019d;
    }

    /* renamed from: e */
    public final int mo59999e() {
        return this.f184016a + 8;
    }

    /* renamed from: f */
    public final int mo60000f() {
        return this.f184020e;
    }

    /* renamed from: g */
    public final /* synthetic */ C67865bk mo60001g() {
        return new C67827a(this);
    }

    /* renamed from: h */
    public final /* synthetic */ C67866bl mo60002h(byte[] bArr) {
        return new C67854b(this, bArr);
    }

    /* renamed from: j */
    public final Mac mo60021j() {
        return (Mac) C67838ak.f183949b.mo59993a(this.f184018c);
    }

    /* renamed from: k */
    public final SecretKeySpec mo60022k(byte[] bArr) {
        return new SecretKeySpec(bArr, this.f184016a, 32, this.f184018c);
    }

    /* renamed from: l */
    public final SecretKeySpec mo60023l(byte[] bArr) {
        return new SecretKeySpec(bArr, 0, this.f184016a, "AES");
    }

    /* renamed from: m */
    public final byte[] mo60024m(byte[] bArr, byte[] bArr2) {
        return C67850aw.m98042a(this.f184021f, this.f184022g, bArr, bArr2, this.f184016a + 32);
    }
}
