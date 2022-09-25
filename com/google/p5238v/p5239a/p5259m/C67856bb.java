package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.p5254i.C67641a;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Mac;

/* renamed from: com.google.v.a.m.bb */
/* compiled from: PG */
public final class C67856bb implements C67641a {

    /* renamed from: a */
    public final String f183975a;

    /* renamed from: b */
    public final Key f183976b;

    /* renamed from: c */
    private final ThreadLocal f183977c;

    /* renamed from: d */
    private final int f183978d;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C67856bb(java.lang.String r6, java.security.Key r7) {
        /*
            r5 = this;
            r5.<init>()
            com.google.v.a.m.ba r0 = new com.google.v.a.m.ba
            r0.<init>(r5)
            r5.f183977c = r0
            r1 = 2
            boolean r2 = com.google.p5238v.p5239a.p5243b.p5244a.C67543a.m97645a(r1)
            if (r2 == 0) goto L_0x0090
            r5.f183975a = r6
            r5.f183976b = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r2 = 16
            if (r7 < r2) goto L_0x0088
            int r7 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 1
            switch(r7) {
                case -1823053428: goto L_0x0051;
                case 392315023: goto L_0x0047;
                case 392315118: goto L_0x003d;
                case 392316170: goto L_0x0033;
                case 392317873: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x005b
        L_0x0029:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            r7 = 4
            goto L_0x005c
        L_0x0033:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            r7 = 3
            goto L_0x005c
        L_0x003d:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            r7 = 2
            goto L_0x005c
        L_0x0047:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            r7 = 1
            goto L_0x005c
        L_0x0051:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            r7 = 0
            goto L_0x005c
        L_0x005b:
            r7 = -1
        L_0x005c:
            if (r7 == 0) goto L_0x0080
            if (r7 == r4) goto L_0x007b
            if (r7 == r1) goto L_0x0078
            if (r7 == r3) goto L_0x0075
            if (r7 != r2) goto L_0x0069
            r6 = 64
            goto L_0x007d
        L_0x0069:
            java.security.NoSuchAlgorithmException r7 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            java.lang.String r6 = r0.concat(r6)
            r7.<init>(r6)
            throw r7
        L_0x0075:
            r6 = 48
            goto L_0x007d
        L_0x0078:
            r6 = 32
            goto L_0x007d
        L_0x007b:
            r6 = 28
        L_0x007d:
            r5.f183978d = r6
            goto L_0x0084
        L_0x0080:
            r6 = 20
            r5.f183978d = r6
        L_0x0084:
            r0.get()
            return
        L_0x0088:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "key size too small, need at least 16 bytes"
            r6.<init>(r7)
            throw r6
        L_0x0090:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5238v.p5239a.p5259m.C67856bb.<init>(java.lang.String, java.security.Key):void");
    }

    /* renamed from: a */
    public final byte[] mo59969a(byte[] bArr, int i) {
        if (i <= this.f183978d) {
            ((Mac) this.f183977c.get()).update(bArr);
            return Arrays.copyOf(((Mac) this.f183977c.get()).doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
