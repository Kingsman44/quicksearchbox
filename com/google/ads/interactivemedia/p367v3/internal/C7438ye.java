package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ye */
/* compiled from: PG */
final class C7438ye implements abx {

    /* renamed from: a */
    private final abx f24375a;

    /* renamed from: b */
    private final byte[] f24376b;

    /* renamed from: c */
    private final byte[] f24377c;

    /* renamed from: d */
    private CipherInputStream f24378d;

    public C7438ye(abx abx, byte[] bArr, byte[] bArr2) {
        this.f24375a = abx;
        this.f24376b = bArr;
        this.f24377c = bArr2;
    }

    /* renamed from: a */
    public final int mo14388a(byte[] bArr, int i, int i2) {
        ary.m19467t(this.f24378d);
        int read = this.f24378d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    /* renamed from: b */
    public final void mo14402b(adh adh) {
        ary.m19467t(adh);
        this.f24375a.mo14402b(adh);
    }

    /* renamed from: c */
    public final long mo14389c(acb acb) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.f24376b, "AES"), new IvParameterSpec(this.f24377c));
                abz abz = new abz(this.f24375a, acb);
                this.f24378d = new CipherInputStream(abz, instance);
                abz.mo14409a();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: d */
    public final Uri mo14390d() {
        return this.f24375a.mo14390d();
    }

    /* renamed from: e */
    public final Map mo14403e() {
        return this.f24375a.mo14403e();
    }

    /* renamed from: f */
    public final void mo14391f() {
        if (this.f24378d != null) {
            this.f24378d = null;
            this.f24375a.mo14391f();
        }
    }
}
