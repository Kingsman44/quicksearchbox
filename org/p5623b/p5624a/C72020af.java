package org.p5623b.p5624a;

/* renamed from: org.b.a.af */
/* compiled from: PG */
public final class C72020af extends C72013a {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C72020af(int r5, org.p5623b.p5624a.C72093f r6) {
        /*
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
        L_0x0006:
            int r2 = r6.f191912b
            if (r1 == r2) goto L_0x002d
            org.b.a.e r2 = r6.mo63278a(r1)     // Catch:{ IOException -> 0x001c }
            org.b.a.n r2 = (org.p5623b.p5624a.C72101n) r2     // Catch:{ IOException -> 0x001c }
            java.lang.String r3 = "BER"
            byte[] r2 = r2.mo63294p(r3)     // Catch:{ IOException -> 0x001c }
            r0.write(r2)     // Catch:{ IOException -> 0x001c }
            int r1 = r1 + 1
            goto L_0x0006
        L_0x001c:
            r5 = move-exception
            org.b.a.t r6 = new org.b.a.t
            java.lang.String r0 = "malformed object: "
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = r0.concat(r1)
            r6.<init>(r0, r5)
            throw r6
        L_0x002d:
            byte[] r6 = r0.toByteArray()
            r0 = 1
            r4.<init>(r0, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5623b.p5624a.C72020af.<init>(int, org.b.a.f):void");
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        int i = true != this.f191747a ? 64 : 96;
        int i2 = this.f191748b;
        byte[] bArr = this.f191749c;
        sVar.mo63306k(z, i, i2);
        sVar.f191935a.write(128);
        sVar.f191935a.write(bArr, 0, bArr.length);
        sVar.f191935a.write(0);
        sVar.f191935a.write(0);
    }
}
