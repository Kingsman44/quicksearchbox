package com.google.p5238v.p5239a.p5246d.p5247a;

import com.google.p5238v.p5239a.p5259m.C67838ak;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.v.a.d.a.c */
/* compiled from: PG */
final class C67556c {

    /* renamed from: a */
    private final String f183467a;

    public C67556c(String str) {
        this.f183467a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo59921a() {
        return Mac.getInstance(this.f183467a).getMacLength();
    }

    /* renamed from: b */
    public final byte[] mo59922b(byte[] bArr, byte[] bArr2, int i) {
        Mac mac = (Mac) C67838ak.f183949b.mo59993a(this.f183467a);
        if (i <= mac.getMacLength() * PrivateKeyType.INVALID) {
            byte[] bArr3 = new byte[i];
            mac.init(new SecretKeySpec(bArr, this.f183467a));
            byte[] bArr4 = new byte[0];
            int i2 = 1;
            int i3 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i2);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i4 = i3 + length;
                if (i4 < i) {
                    System.arraycopy(bArr4, 0, bArr3, i3, length);
                    i2++;
                    i3 = i4;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    /* renamed from: c */
    public final byte[] mo59923c(byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) C67838ak.f183949b.mo59993a(this.f183467a);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.f183467a));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.f183467a));
        }
        return mac.doFinal(bArr);
    }

    /* renamed from: e */
    public final byte[] mo59925e(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        return mo59922b(mo59923c(C67569p.m97707e("eae_prk", bArr, bArr3), (byte[]) null), C67569p.m97708f("shared_secret", bArr2, bArr3, i), i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo59924d() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f183467a
            int r1 = r0.hashCode()
            r2 = 984523022(0x3aaea10e, float:0.0013323145)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = 984524074(0x3aaea52a, float:0.0013324369)
            if (r1 == r2) goto L_0x0022
            r2 = 984525777(0x3aaeabd1, float:0.0013326352)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "HmacSha512"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "HmacSha384"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "HmacSha256"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x004b
            if (r0 == r4) goto L_0x0048
            if (r0 != r3) goto L_0x0040
            byte[] r0 = com.google.p5238v.p5239a.p5246d.p5247a.C67569p.f183489h
            return r0
        L_0x0040:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE KDF ID"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            byte[] r0 = com.google.p5238v.p5239a.p5246d.p5247a.C67569p.f183488g
            return r0
        L_0x004b:
            byte[] r0 = com.google.p5238v.p5239a.p5246d.p5247a.C67569p.f183487f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5238v.p5239a.p5246d.p5247a.C67556c.mo59924d():byte[]");
    }
}
