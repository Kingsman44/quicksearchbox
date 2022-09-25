package com.google.p5238v.p5239a;

import com.google.p386ak.C8398n;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: com.google.v.a.h */
/* compiled from: PG */
public final class C67637h implements C67906v {

    /* renamed from: a */
    public static final Charset f183584a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final InputStream f183585b;

    public C67637h(InputStream inputStream) {
        this.f183585b = inputStream;
    }

    /* renamed from: b */
    private static int m97827b(C8398n nVar) {
        long b = nVar.mo17152b();
        if (b <= 4294967295L && b >= -2147483648L) {
            return (int) nVar.mo17152b();
        }
        throw new IOException("invalid key id");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02f9, code lost:
        if (r5 == 1) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02fc, code lost:
        if (r5 == 2) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02ff, code lost:
        if (r5 == 3) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0302, code lost:
        if (r5 == 4) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0304, code lost:
        r5 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0307, code lost:
        r5 = r24 + 1;
        r3[r24] = (byte) (r23 >> 10);
        r24 = r5 + 1;
        r3[r5] = (byte) (r23 >> 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0316, code lost:
        r5 = r24 + 1;
        r3[r24] = (byte) (r23 >> 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x031d, code lost:
        if (r5 != r15) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0321, code lost:
        r6 = new byte[r5];
        java.lang.System.arraycopy(r3, 0, r6, 0, r5);
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0328, code lost:
        r5 = (com.google.p5238v.p5239a.p5255j.C67719cv) com.google.p5238v.p5239a.p5255j.C67721cx.f183740d.createBuilder();
        r6 = r7.mo17166a("typeUrl").mo17154d();
        r5.copyOnWrite();
        r6.getClass();
        ((com.google.p5238v.p5239a.p5255j.C67721cx) r5.instance).f183742a = r6;
        r3 = com.google.protobuf.C63088z.m96139A(r3);
        r5.copyOnWrite();
        ((com.google.p5238v.p5239a.p5255j.C67721cx) r5.instance).f183743b = r3;
        r3 = r7.mo17166a("keyMaterialType").mo17154d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x035d, code lost:
        switch(r3.hashCode()) {
            case -1881281466: goto L_0x037f;
            case -1609477353: goto L_0x0375;
            case 249237018: goto L_0x036b;
            case 1534613202: goto L_0x0361;
            default: goto L_0x0360;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0367, code lost:
        if (r3.equals("ASYMMETRIC_PUBLIC") == false) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0369, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0371, code lost:
        if (r3.equals("ASYMMETRIC_PRIVATE") == false) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0373, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x037b, code lost:
        if (r3.equals("SYMMETRIC") == false) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x037d, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0385, code lost:
        if (r3.equals("REMOTE") == false) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0387, code lost:
        r7 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0389, code lost:
        r7 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x038a, code lost:
        if (r7 == 0) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x038d, code lost:
        if (r7 == 1) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0390, code lost:
        if (r7 == 2) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0393, code lost:
        if (r7 != 3) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        r3 = com.google.p5238v.p5239a.p5255j.C67720cw.REMOTE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03a7, code lost:
        throw new com.google.p386ak.C8402r("unknown key material type: ".concat(java.lang.String.valueOf(r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03a8, code lost:
        r3 = com.google.p5238v.p5239a.p5255j.C67720cw.ASYMMETRIC_PUBLIC;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03ab, code lost:
        r3 = com.google.p5238v.p5239a.p5255j.C67720cw.ASYMMETRIC_PRIVATE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03ae, code lost:
        r3 = com.google.p5238v.p5239a.p5255j.C67720cw.SYMMETRIC;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03b0, code lost:
        r5.copyOnWrite();
        ((com.google.p5238v.p5239a.p5255j.C67721cx) r5.instance).f183744c = r3.getNumber();
        r3 = (com.google.p5238v.p5239a.p5255j.C67721cx) r5.build();
        r14.copyOnWrite();
        r3.getClass();
        ((com.google.p5238v.p5239a.p5255j.C67728dd) r14.instance).f183756a = r3;
        r12.mo59976a((com.google.p5238v.p5239a.p5255j.C67728dd) r14.build());
        r10 = r10 + 1;
        r7 = r16;
        r3 = r19;
        r5 = r22;
        r6 = r25;
        r8 = r26;
     */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03ee A[Catch:{ r | IllegalStateException -> 0x0415, all -> 0x0412 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fd A[Catch:{ r | IllegalStateException -> 0x0415, all -> 0x0412 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0154 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0179 A[Catch:{ r | IllegalStateException -> 0x0415, all -> 0x0412 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01a8 A[Catch:{ r | IllegalStateException -> 0x0415, all -> 0x0412 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p5238v.p5239a.p5255j.C67729de mo59915a() {
        /*
            r28 = this;
            r1 = r28
            java.lang.String r2 = "keyMaterialType"
            java.lang.String r3 = "value"
            java.lang.String r4 = "typeUrl"
            java.lang.String r5 = "outputPrefixType"
            java.lang.String r6 = "keyId"
            java.lang.String r7 = "status"
            java.lang.String r8 = "keyData"
            java.lang.String r9 = "primaryKeyId"
            com.google.ak.d.a r10 = new com.google.ak.d.a     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.io.StringReader r11 = new java.io.StringReader     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r12 = new java.lang.String     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.io.InputStream r13 = r1.f183585b     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            byte[] r13 = com.google.p5238v.p5239a.C67541al.m97643c(r13)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.nio.charset.Charset r14 = f183584a     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r12.<init>(r13, r14)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r11.<init>(r12)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r10.<init>(r11)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r11 = 0
            r10.f29216a = r11     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.ak.n r10 = com.google.p386ak.p388b.C8343aq.m23114a(r10)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.ak.q r10 = r10.mo17161g()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.ak.b.ak r12 = r10.f29255a     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r13 = "key"
            boolean r12 = r12.containsKey(r13)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            if (r12 == 0) goto L_0x040a
            com.google.ak.l r12 = r10.mo17172k()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r12 = r12.mo17151a()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            if (r12 == 0) goto L_0x040a
            com.google.v.a.j.de r12 = com.google.p5238v.p5239a.p5255j.C67729de.f183760c     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.v.a.j.db r12 = (com.google.p5238v.p5239a.p5255j.C67726db) r12     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.ak.b.ak r13 = r10.f29255a     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            boolean r13 = r13.containsKey(r9)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            if (r13 == 0) goto L_0x0069
            com.google.ak.n r9 = r10.mo17166a(r9)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r9 = m97827b(r9)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r12.copyOnWrite()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.protobuf.bv r13 = r12.instance     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.v.a.j.de r13 = (com.google.p5238v.p5239a.p5255j.C67729de) r13     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r13.f183762a = r9     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
        L_0x0069:
            com.google.ak.l r9 = r10.mo17172k()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r10 = 0
        L_0x006e:
            int r13 = r9.mo17151a()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            if (r10 >= r13) goto L_0x03fe
            com.google.ak.n r13 = r9.mo17153c(r10)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.ak.q r13 = r13.mo17161g()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.ak.b.ak r14 = r13.f29255a     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            boolean r14 = r14.containsKey(r8)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            if (r14 == 0) goto L_0x03f6
            com.google.ak.b.ak r14 = r13.f29255a     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            boolean r14 = r14.containsKey(r7)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            if (r14 == 0) goto L_0x03f6
            com.google.ak.b.ak r14 = r13.f29255a     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            boolean r14 = r14.containsKey(r6)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            if (r14 == 0) goto L_0x03f6
            com.google.ak.b.ak r14 = r13.f29255a     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            boolean r14 = r14.containsKey(r5)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            if (r14 == 0) goto L_0x03f6
            com.google.v.a.j.dd r14 = com.google.p5238v.p5239a.p5255j.C67728dd.f183754e     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.protobuf.bn r14 = r14.createBuilder()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.v.a.j.dc r14 = (com.google.p5238v.p5239a.p5255j.C67727dc) r14     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.ak.n r15 = r13.mo17166a(r7)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r15 = r15.mo17154d()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r11 = r15.hashCode()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r16 = r7
            r7 = -891611359(0xffffffffcadb1721, float:-7179152.5)
            if (r11 == r7) goto L_0x00d6
            r7 = 478389753(0x1c83a5f9, float:8.711756E-22)
            if (r11 == r7) goto L_0x00cc
            r7 = 1053567612(0x3ecc2a7c, float:0.39876163)
            if (r11 == r7) goto L_0x00c2
            goto L_0x00e0
        L_0x00c2:
            java.lang.String r7 = "DISABLED"
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L_0x00e0
            r7 = 1
            goto L_0x00e1
        L_0x00cc:
            java.lang.String r7 = "DESTROYED"
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L_0x00e0
            r7 = 2
            goto L_0x00e1
        L_0x00d6:
            java.lang.String r7 = "ENABLED"
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L_0x00e0
            r7 = 0
            goto L_0x00e1
        L_0x00e0:
            r7 = -1
        L_0x00e1:
            if (r7 == 0) goto L_0x00fd
            r11 = 1
            if (r7 == r11) goto L_0x00fb
            r11 = 2
            if (r7 != r11) goto L_0x00eb
            r7 = 5
            goto L_0x00fe
        L_0x00eb:
            com.google.ak.r r2 = new com.google.ak.r     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r3 = "unknown status: "
            java.lang.String r4 = java.lang.String.valueOf(r15)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r2.<init>((java.lang.String) r3)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            throw r2     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
        L_0x00fb:
            r7 = 4
            goto L_0x00fe
        L_0x00fd:
            r7 = 3
        L_0x00fe:
            r14.copyOnWrite()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.protobuf.bv r11 = r14.instance     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.v.a.j.dd r11 = (com.google.p5238v.p5239a.p5255j.C67728dd) r11     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r7 = com.google.p5238v.p5239a.p5255j.C67722cy.m97848a(r7)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r11.f183757b = r7     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.ak.n r7 = r13.mo17166a(r6)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r7 = m97827b(r7)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r14.copyOnWrite()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.protobuf.bv r11 = r14.instance     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.v.a.j.dd r11 = (com.google.p5238v.p5239a.p5255j.C67728dd) r11     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r11.f183758c = r7     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.ak.n r7 = r13.mo17166a(r5)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r7 = r7.mo17154d()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r11 = r7.hashCode()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            switch(r11) {
                case -2053249079: goto L_0x014a;
                case 80904: goto L_0x0140;
                case 2575090: goto L_0x0136;
                case 1761684556: goto L_0x012c;
                default: goto L_0x012b;
            }
        L_0x012b:
            goto L_0x0154
        L_0x012c:
            java.lang.String r11 = "CRUNCHY"
            boolean r11 = r7.equals(r11)
            if (r11 == 0) goto L_0x0154
            r11 = 3
            goto L_0x0155
        L_0x0136:
            java.lang.String r11 = "TINK"
            boolean r11 = r7.equals(r11)
            if (r11 == 0) goto L_0x0154
            r11 = 0
            goto L_0x0155
        L_0x0140:
            java.lang.String r11 = "RAW"
            boolean r11 = r7.equals(r11)
            if (r11 == 0) goto L_0x0154
            r11 = 1
            goto L_0x0155
        L_0x014a:
            java.lang.String r11 = "LEGACY"
            boolean r11 = r7.equals(r11)
            if (r11 == 0) goto L_0x0154
            r11 = 2
            goto L_0x0155
        L_0x0154:
            r11 = -1
        L_0x0155:
            if (r11 == 0) goto L_0x0179
            r15 = 1
            if (r11 == r15) goto L_0x0176
            r15 = 2
            if (r11 == r15) goto L_0x0173
            r15 = 3
            if (r11 != r15) goto L_0x0163
            com.google.v.a.j.dr r7 = com.google.p5238v.p5239a.p5255j.C67742dr.CRUNCHY     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            goto L_0x017b
        L_0x0163:
            com.google.ak.r r2 = new com.google.ak.r     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r3 = "unknown output prefix type: "
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r2.<init>((java.lang.String) r3)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            throw r2     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
        L_0x0173:
            com.google.v.a.j.dr r7 = com.google.p5238v.p5239a.p5255j.C67742dr.LEGACY     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            goto L_0x017b
        L_0x0176:
            com.google.v.a.j.dr r7 = com.google.p5238v.p5239a.p5255j.C67742dr.RAW     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            goto L_0x017b
        L_0x0179:
            com.google.v.a.j.dr r7 = com.google.p5238v.p5239a.p5255j.C67742dr.TINK     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
        L_0x017b:
            r14.copyOnWrite()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.protobuf.bv r11 = r14.instance     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.v.a.j.dd r11 = (com.google.p5238v.p5239a.p5255j.C67728dd) r11     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r7 = r7.getNumber()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r11.f183759d = r7     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.ak.b.ak r7 = r13.f29255a     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.ak.q r7 = (com.google.p386ak.C8401q) r7     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.ak.b.ak r11 = r7.f29255a     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            boolean r11 = r11.containsKey(r4)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            if (r11 == 0) goto L_0x03ee
            com.google.ak.b.ak r11 = r7.f29255a     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            boolean r11 = r11.containsKey(r3)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            if (r11 == 0) goto L_0x03ee
            com.google.ak.b.ak r11 = r7.f29255a     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            boolean r11 = r11.containsKey(r2)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            if (r11 == 0) goto L_0x03ee
            com.google.ak.n r11 = r7.mo17166a(r3)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r11 = r11.mo17154d()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.nio.charset.Charset r13 = com.google.p5238v.p5239a.p5259m.C67885o.f184053a     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            byte[] r11 = r11.getBytes(r13)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r13 = r11.length     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int[] r15 = com.google.p5238v.p5239a.p5259m.C67884n.f184052a     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r15 = r13 * 3
            r18 = 4
            int r15 = r15 / 4
            r19 = r3
            byte[] r3 = new byte[r15]     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int[] r20 = com.google.p5238v.p5239a.p5259m.C67884n.f184052a     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r22 = r5
            r5 = 0
            r21 = 0
            r23 = 0
            r24 = 0
        L_0x01ce:
            if (r5 >= r13) goto L_0x02f1
            if (r21 != 0) goto L_0x022e
        L_0x01d2:
            r25 = r6
            int r6 = r5 + 4
            if (r6 > r13) goto L_0x0224
            r21 = r6
            byte r6 = r11[r5]     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r20[r6]     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r6 = r6 << 18
            int r23 = r5 + 1
            r26 = r8
            byte r8 = r11[r23]     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r20[r8]     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r8 = r8 << 12
            r6 = r6 | r8
            int r8 = r5 + 2
            byte r8 = r11[r8]     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r20[r8]     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r8 = r8 << 6
            r6 = r6 | r8
            int r8 = r5 + 3
            byte r8 = r11[r8]     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r20[r8]     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r6 = r6 | r8
            if (r6 < 0) goto L_0x0221
            int r5 = r24 + 2
            byte r8 = (byte) r6     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r3[r5] = r8     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r5 = r24 + 1
            int r8 = r6 >> 8
            byte r8 = (byte) r8     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r3[r5] = r8     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r5 = r6 >> 16
            byte r5 = (byte) r5     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r3[r24] = r5     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r24 = r24 + 3
            r23 = r6
            r5 = r21
            r6 = r25
            r8 = r26
            goto L_0x01d2
        L_0x0221:
            r23 = r6
            goto L_0x0226
        L_0x0224:
            r26 = r8
        L_0x0226:
            if (r5 < r13) goto L_0x022c
            r5 = 0
            r8 = -1
            goto L_0x02f8
        L_0x022c:
            r6 = 0
            goto L_0x0234
        L_0x022e:
            r25 = r6
            r26 = r8
            r6 = r21
        L_0x0234:
            int r8 = r5 + 1
            byte r5 = r11[r5]     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r20[r5]     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r21 = r8
            if (r6 == 0) goto L_0x02dd
            r8 = 1
            if (r6 == r8) goto L_0x02c5
            r8 = 2
            if (r6 == r8) goto L_0x02a4
            r8 = 3
            if (r6 == r8) goto L_0x0261
            r8 = 4
            if (r6 == r8) goto L_0x0257
            r8 = 5
            if (r6 == r8) goto L_0x0252
            r8 = -1
            goto L_0x02e7
        L_0x0252:
            r8 = -1
            if (r5 != r8) goto L_0x03e6
            goto L_0x02e7
        L_0x0257:
            r8 = -2
            if (r5 != r8) goto L_0x025c
            goto L_0x02cc
        L_0x025c:
            r8 = -1
            if (r5 != r8) goto L_0x03e6
            goto L_0x02e7
        L_0x0261:
            if (r5 < 0) goto L_0x0285
            int r6 = r23 << 6
            r5 = r5 | r6
            int r6 = r24 + 2
            byte r8 = (byte) r5     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r3[r6] = r8     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r6 = r24 + 1
            int r8 = r5 >> 8
            byte r8 = (byte) r8     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r3[r6] = r8     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r6 = r5 >> 16
            byte r6 = (byte) r6     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r3[r24] = r6     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r24 = r24 + 3
            r23 = r5
            r5 = r21
            r6 = r25
            r8 = r26
            r21 = 0
            goto L_0x01ce
        L_0x0285:
            r8 = -2
            if (r5 != r8) goto L_0x02a0
            int r5 = r24 + 1
            int r6 = r23 >> 2
            byte r6 = (byte) r6     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r3[r5] = r6     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r5 = r23 >> 10
            byte r5 = (byte) r5     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r3[r24] = r5     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r24 = r24 + 2
            r5 = r21
            r6 = r25
            r8 = r26
            r21 = 5
            goto L_0x01ce
        L_0x02a0:
            r8 = -1
            if (r5 != r8) goto L_0x03e6
            goto L_0x02e7
        L_0x02a4:
            if (r5 < 0) goto L_0x02ab
            int r8 = r23 << 6
            r23 = r8 | r5
            goto L_0x02cc
        L_0x02ab:
            r8 = -2
            if (r5 != r8) goto L_0x02c1
            int r5 = r24 + 1
            int r6 = r23 >> 4
            byte r6 = (byte) r6     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r3[r24] = r6     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r24 = r5
            r5 = r21
            r6 = r25
            r8 = r26
            r21 = 4
            goto L_0x01ce
        L_0x02c1:
            r8 = -1
            if (r5 != r8) goto L_0x03e6
            goto L_0x02e7
        L_0x02c5:
            r8 = -1
            if (r5 < 0) goto L_0x02da
            int r17 = r23 << 6
            r23 = r17 | r5
        L_0x02cc:
            int r5 = r6 + 1
            r6 = r25
            r8 = r26
            r27 = r21
            r21 = r5
            r5 = r27
            goto L_0x01ce
        L_0x02da:
            if (r5 != r8) goto L_0x03e6
            goto L_0x02e7
        L_0x02dd:
            r8 = -1
            if (r5 < 0) goto L_0x02e5
            int r6 = r6 + 1
            r23 = r5
            goto L_0x02e7
        L_0x02e5:
            if (r5 != r8) goto L_0x03e6
        L_0x02e7:
            r5 = r21
            r8 = r26
            r21 = r6
            r6 = r25
            goto L_0x01ce
        L_0x02f1:
            r25 = r6
            r26 = r8
            r8 = -1
            r5 = r21
        L_0x02f8:
            r6 = 1
            if (r5 == r6) goto L_0x03e6
            r6 = 2
            if (r5 == r6) goto L_0x0316
            r6 = 3
            if (r5 == r6) goto L_0x0307
            r6 = 4
            if (r5 == r6) goto L_0x03e6
        L_0x0304:
            r5 = r24
            goto L_0x031d
        L_0x0307:
            int r5 = r24 + 1
            int r6 = r23 >> 10
            byte r6 = (byte) r6     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r3[r24] = r6     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r24 = r5 + 1
            int r6 = r23 >> 2
            byte r6 = (byte) r6     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r3[r5] = r6     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            goto L_0x0304
        L_0x0316:
            int r5 = r24 + 1
            int r6 = r23 >> 4
            byte r6 = (byte) r6     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r3[r24] = r6     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
        L_0x031d:
            if (r5 != r15) goto L_0x0321
            r11 = 0
            goto L_0x0328
        L_0x0321:
            byte[] r6 = new byte[r5]     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r11 = 0
            java.lang.System.arraycopy(r3, r11, r6, r11, r5)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r3 = r6
        L_0x0328:
            com.google.v.a.j.cx r5 = com.google.p5238v.p5239a.p5255j.C67721cx.f183740d     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.v.a.j.cv r5 = (com.google.p5238v.p5239a.p5255j.C67719cv) r5     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.ak.n r6 = r7.mo17166a(r4)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r6 = r6.mo17154d()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r5.copyOnWrite()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.protobuf.bv r13 = r5.instance     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.v.a.j.cx r13 = (com.google.p5238v.p5239a.p5255j.C67721cx) r13     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r6.getClass()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r13.f183742a = r6     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.protobuf.z r3 = com.google.protobuf.C63088z.m96139A(r3)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r5.copyOnWrite()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.v.a.j.cx r6 = (com.google.p5238v.p5239a.p5255j.C67721cx) r6     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r6.f183743b = r3     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.ak.n r3 = r7.mo17166a(r2)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r3 = r3.mo17154d()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r6 = r3.hashCode()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            switch(r6) {
                case -1881281466: goto L_0x037f;
                case -1609477353: goto L_0x0375;
                case 249237018: goto L_0x036b;
                case 1534613202: goto L_0x0361;
                default: goto L_0x0360;
            }
        L_0x0360:
            goto L_0x0389
        L_0x0361:
            java.lang.String r6 = "ASYMMETRIC_PUBLIC"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x0389
            r7 = 2
            goto L_0x038a
        L_0x036b:
            java.lang.String r6 = "ASYMMETRIC_PRIVATE"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x0389
            r7 = 1
            goto L_0x038a
        L_0x0375:
            java.lang.String r6 = "SYMMETRIC"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x0389
            r7 = 0
            goto L_0x038a
        L_0x037f:
            java.lang.String r6 = "REMOTE"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x0389
            r7 = 3
            goto L_0x038a
        L_0x0389:
            r7 = -1
        L_0x038a:
            if (r7 == 0) goto L_0x03ae
            r6 = 1
            if (r7 == r6) goto L_0x03ab
            r6 = 2
            if (r7 == r6) goto L_0x03a8
            r6 = 3
            if (r7 != r6) goto L_0x0398
            com.google.v.a.j.cw r3 = com.google.p5238v.p5239a.p5255j.C67720cw.REMOTE     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            goto L_0x03b0
        L_0x0398:
            com.google.ak.r r2 = new com.google.ak.r     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r4 = "unknown key material type: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r3 = r4.concat(r3)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r2.<init>((java.lang.String) r3)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            throw r2     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
        L_0x03a8:
            com.google.v.a.j.cw r3 = com.google.p5238v.p5239a.p5255j.C67720cw.ASYMMETRIC_PUBLIC     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            goto L_0x03b0
        L_0x03ab:
            com.google.v.a.j.cw r3 = com.google.p5238v.p5239a.p5255j.C67720cw.ASYMMETRIC_PRIVATE     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            goto L_0x03b0
        L_0x03ae:
            com.google.v.a.j.cw r3 = com.google.p5238v.p5239a.p5255j.C67720cw.SYMMETRIC     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
        L_0x03b0:
            r5.copyOnWrite()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.v.a.j.cx r6 = (com.google.p5238v.p5239a.p5255j.C67721cx) r6     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r3 = r3.getNumber()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r6.f183744c = r3     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.protobuf.bv r3 = r5.build()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.v.a.j.cx r3 = (com.google.p5238v.p5239a.p5255j.C67721cx) r3     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r14.copyOnWrite()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.protobuf.bv r5 = r14.instance     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.v.a.j.dd r5 = (com.google.p5238v.p5239a.p5255j.C67728dd) r5     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r3.getClass()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r5.f183756a = r3     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.protobuf.bv r3 = r14.build()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.v.a.j.dd r3 = (com.google.p5238v.p5239a.p5255j.C67728dd) r3     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            r12.mo59976a(r3)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            int r10 = r10 + 1
            r7 = r16
            r3 = r19
            r5 = r22
            r6 = r25
            r8 = r26
            goto L_0x006e
        L_0x03e6:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r3 = "bad base-64"
            r2.<init>(r3)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            throw r2     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
        L_0x03ee:
            com.google.ak.r r2 = new com.google.ak.r     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r3 = "invalid keyData"
            r2.<init>((java.lang.String) r3)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            throw r2     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
        L_0x03f6:
            com.google.ak.r r2 = new com.google.ak.r     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r3 = "invalid key"
            r2.<init>((java.lang.String) r3)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            throw r2     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
        L_0x03fe:
            com.google.protobuf.bv r2 = r12.build()     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            com.google.v.a.j.de r2 = (com.google.p5238v.p5239a.p5255j.C67729de) r2     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.io.InputStream r3 = r1.f183585b
            r3.close()
            return r2
        L_0x040a:
            com.google.ak.r r2 = new com.google.ak.r     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            java.lang.String r3 = "invalid keyset"
            r2.<init>((java.lang.String) r3)     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
            throw r2     // Catch:{ r -> 0x0417, IllegalStateException -> 0x0415 }
        L_0x0412:
            r0 = move-exception
            r2 = r0
            goto L_0x041f
        L_0x0415:
            r0 = move-exception
            goto L_0x0418
        L_0x0417:
            r0 = move-exception
        L_0x0418:
            r2 = r0
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0412 }
            r3.<init>(r2)     // Catch:{ all -> 0x0412 }
            throw r3     // Catch:{ all -> 0x0412 }
        L_0x041f:
            java.io.InputStream r3 = r1.f183585b
            r3.close()
            goto L_0x0426
        L_0x0425:
            throw r2
        L_0x0426:
            goto L_0x0425
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5238v.p5239a.C67637h.mo59915a():com.google.v.a.j.de");
    }
}
