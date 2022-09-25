package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.C67620g;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.v.a.m.w */
/* compiled from: PG */
public final class C67893w implements C67620g {

    /* renamed from: a */
    private static final byte[] f184063a = new byte[0];

    /* renamed from: b */
    private final C67894x f184064b;

    /* renamed from: c */
    private final String f184065c;

    /* renamed from: d */
    private final byte[] f184066d;

    /* renamed from: e */
    private final C67891u f184067e;

    /* renamed from: f */
    private final int f184068f;

    public C67893w(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, C67891u uVar) {
        C67836ai.m98004e(eCPublicKey);
        this.f184064b = new C67894x(eCPublicKey);
        this.f184066d = bArr;
        this.f184065c = str;
        this.f184068f = i;
        this.f184067e = uVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x017e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo59927a(byte[] r10, byte[] r11) {
        /*
            r9 = this;
            com.google.v.a.m.x r0 = r9.f184064b
            java.lang.String r1 = r9.f184065c
            byte[] r2 = r9.f184066d
            com.google.v.a.m.u r3 = r9.f184067e
            com.google.v.a.d.l r3 = (com.google.p5238v.p5239a.p5246d.C67582l) r3
            int r3 = r3.f183503b
            int r4 = r9.f184068f
            java.security.interfaces.ECPublicKey r5 = r0.f184069a
            java.security.spec.ECParameterSpec r5 = r5.getParams()
            java.security.KeyPair r5 = com.google.p5238v.p5239a.p5259m.C67836ai.m98002c(r5)
            java.security.PublicKey r6 = r5.getPublic()
            java.security.interfaces.ECPublicKey r6 = (java.security.interfaces.ECPublicKey) r6
            java.security.PrivateKey r5 = r5.getPrivate()
            java.security.interfaces.ECPrivateKey r5 = (java.security.interfaces.ECPrivateKey) r5
            java.security.interfaces.ECPublicKey r0 = r0.f184069a
            byte[] r0 = com.google.p5238v.p5239a.p5259m.C67836ai.m98007h(r5, r0)
            java.security.spec.ECParameterSpec r5 = r6.getParams()
            java.security.spec.EllipticCurve r5 = r5.getCurve()
            java.security.spec.ECPoint r6 = r6.getW()
            byte[] r4 = com.google.p5238v.p5239a.p5259m.C67836ai.m98012m(r5, r4, r6)
            r5 = 2
            byte[][] r5 = new byte[r5][]
            r6 = 0
            r5[r6] = r4
            r7 = 1
            r5[r7] = r0
            byte[] r0 = com.google.p5238v.p5239a.p5259m.C67886p.m98135c(r5)
            byte[] r11 = com.google.p5238v.p5239a.p5259m.C67850aw.m98042a(r1, r0, r2, r11, r3)
            com.google.v.a.n.a r0 = com.google.p5238v.p5239a.p5260n.C67898a.m98152a(r4)
            com.google.v.a.n.a r11 = com.google.p5238v.p5239a.p5260n.C67898a.m98152a(r11)
            com.google.v.a.m.u r1 = r9.f184067e
            byte[] r11 = r11.mo60031b()
            int r2 = r11.length
            com.google.v.a.d.l r1 = (com.google.p5238v.p5239a.p5246d.C67582l) r1
            int r3 = r1.f183503b
            if (r2 != r3) goto L_0x01a2
            java.lang.String r2 = r1.f183502a
            java.lang.String r3 = com.google.p5238v.p5239a.p5240a.C67487a.f183423b
            boolean r2 = r2.equals(r3)
            r3 = 0
            if (r2 == 0) goto L_0x009c
            com.google.v.a.j.aj r2 = com.google.p5238v.p5239a.p5255j.C67653aj.f183608c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.v.a.j.ai r2 = (com.google.p5238v.p5239a.p5255j.C67652ai) r2
            com.google.v.a.j.aj r4 = r1.f183504c
            r2.mergeFrom(r4)
            int r4 = r1.f183503b
            com.google.protobuf.z r11 = com.google.protobuf.C63088z.m96142D(r11, r6, r4)
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.v.a.j.aj r4 = (com.google.p5238v.p5239a.p5255j.C67653aj) r4
            r4.f183611b = r11
            com.google.protobuf.bv r11 = r2.build()
            com.google.v.a.j.aj r11 = (com.google.p5238v.p5239a.p5255j.C67653aj) r11
            java.lang.String r1 = r1.f183502a
            java.lang.Class<com.google.v.a.a> r2 = com.google.p5238v.p5239a.C67486a.class
            java.lang.Object r11 = com.google.p5238v.p5239a.C67539aj.m97631f(r1, r11, r2)
            com.google.v.a.a r11 = (com.google.p5238v.p5239a.C67486a) r11
        L_0x0097:
            r8 = r3
            r3 = r11
            r11 = r8
            goto L_0x0175
        L_0x009c:
            java.lang.String r2 = r1.f183502a
            java.lang.String r4 = com.google.p5238v.p5239a.p5240a.C67487a.f183422a
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x013f
            int r2 = r1.f183506e
            byte[] r2 = java.util.Arrays.copyOfRange(r11, r6, r2)
            int r4 = r1.f183506e
            int r5 = r1.f183503b
            byte[] r11 = java.util.Arrays.copyOfRange(r11, r4, r5)
            com.google.v.a.j.r r4 = com.google.p5238v.p5239a.p5255j.C67778r.f183882d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.v.a.j.q r4 = (com.google.p5238v.p5239a.p5255j.C67777q) r4
            com.google.v.a.j.h r5 = r1.f183505d
            com.google.v.a.j.r r5 = r5.f183861b
            if (r5 != 0) goto L_0x00c4
            com.google.v.a.j.r r5 = com.google.p5238v.p5239a.p5255j.C67778r.f183882d
        L_0x00c4:
            r4.mergeFrom(r5)
            com.google.protobuf.z r2 = com.google.protobuf.C63088z.m96139A(r2)
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.v.a.j.r r5 = (com.google.p5238v.p5239a.p5255j.C67778r) r5
            r5.f183886c = r2
            com.google.protobuf.bv r2 = r4.build()
            com.google.v.a.j.r r2 = (com.google.p5238v.p5239a.p5255j.C67778r) r2
            com.google.v.a.j.cf r4 = com.google.p5238v.p5239a.p5255j.C67703cf.f183701d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.v.a.j.ce r4 = (com.google.p5238v.p5239a.p5255j.C67702ce) r4
            com.google.v.a.j.h r5 = r1.f183505d
            com.google.v.a.j.cf r5 = r5.f183862c
            if (r5 != 0) goto L_0x00ea
            com.google.v.a.j.cf r5 = com.google.p5238v.p5239a.p5255j.C67703cf.f183701d
        L_0x00ea:
            r4.mergeFrom(r5)
            com.google.protobuf.z r11 = com.google.protobuf.C63088z.m96139A(r11)
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.v.a.j.cf r5 = (com.google.p5238v.p5239a.p5255j.C67703cf) r5
            r5.f183705c = r11
            com.google.protobuf.bv r11 = r4.build()
            com.google.v.a.j.cf r11 = (com.google.p5238v.p5239a.p5255j.C67703cf) r11
            com.google.v.a.j.h r4 = com.google.p5238v.p5239a.p5255j.C67768h.f183858d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.v.a.j.g r4 = (com.google.p5238v.p5239a.p5255j.C67767g) r4
            com.google.v.a.j.h r5 = r1.f183505d
            int r5 = r5.f183860a
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.v.a.j.h r6 = (com.google.p5238v.p5239a.p5255j.C67768h) r6
            r6.f183860a = r5
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.v.a.j.h r5 = (com.google.p5238v.p5239a.p5255j.C67768h) r5
            r2.getClass()
            r5.f183861b = r2
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.v.a.j.h r2 = (com.google.p5238v.p5239a.p5255j.C67768h) r2
            r11.getClass()
            r2.f183862c = r11
            com.google.protobuf.bv r11 = r4.build()
            com.google.v.a.j.h r11 = (com.google.p5238v.p5239a.p5255j.C67768h) r11
            java.lang.String r1 = r1.f183502a
            java.lang.Class<com.google.v.a.a> r2 = com.google.p5238v.p5239a.C67486a.class
            java.lang.Object r11 = com.google.p5238v.p5239a.C67539aj.m97631f(r1, r11, r2)
            com.google.v.a.a r11 = (com.google.p5238v.p5239a.C67486a) r11
            goto L_0x0097
        L_0x013f:
            java.lang.String r2 = r1.f183502a
            java.lang.String r4 = com.google.p5238v.p5239a.p5245c.C67549d.f183463a
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x019a
            com.google.v.a.j.ar r2 = com.google.p5238v.p5239a.p5255j.C67661ar.f183622c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.v.a.j.aq r2 = (com.google.p5238v.p5239a.p5255j.C67660aq) r2
            com.google.v.a.j.ar r4 = r1.f183507f
            r2.mergeFrom(r4)
            int r4 = r1.f183503b
            com.google.protobuf.z r11 = com.google.protobuf.C63088z.m96142D(r11, r6, r4)
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.v.a.j.ar r4 = (com.google.p5238v.p5239a.p5255j.C67661ar) r4
            r4.f183625b = r11
            com.google.protobuf.bv r11 = r2.build()
            com.google.v.a.j.ar r11 = (com.google.p5238v.p5239a.p5255j.C67661ar) r11
            java.lang.String r1 = r1.f183502a
            java.lang.Class<com.google.v.a.e> r2 = com.google.p5238v.p5239a.C67583e.class
            java.lang.Object r11 = com.google.p5238v.p5239a.C67539aj.m97631f(r1, r11, r2)
            com.google.v.a.e r11 = (com.google.p5238v.p5239a.C67583e) r11
        L_0x0175:
            byte[] r1 = f184063a
            if (r3 == 0) goto L_0x017e
            byte[] r10 = r3.mo59878b(r10, r1)
            goto L_0x0182
        L_0x017e:
            byte[] r10 = r11.mo59916a(r10, r1)
        L_0x0182:
            byte[] r11 = r0.mo60031b()
            int r0 = r11.length
            int r1 = r10.length
            int r0 = r0 + r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteBuffer r11 = r0.put(r11)
            java.nio.ByteBuffer r10 = r11.put(r10)
            byte[] r10 = r10.array()
            return r10
        L_0x019a:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "unknown DEM key type"
            r10.<init>(r11)
            throw r10
        L_0x01a2:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "Symmetric key has incorrect length"
            r10.<init>(r11)
            goto L_0x01ab
        L_0x01aa:
            throw r10
        L_0x01ab:
            goto L_0x01aa
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5238v.p5239a.p5259m.C67893w.mo59927a(byte[], byte[]):byte[]");
    }
}
