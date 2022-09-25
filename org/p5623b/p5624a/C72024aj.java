package org.p5623b.p5624a;

import java.util.Enumeration;
import java.util.Vector;

/* renamed from: org.b.a.aj */
/* compiled from: PG */
public final class C72024aj extends C72104q {

    /* renamed from: b */
    public final C72104q[] f191781b;

    public C72024aj(byte[] bArr) {
        super(bArr);
        this.f191781b = null;
    }

    /* renamed from: a */
    public final int mo63217a() {
        Enumeration l = mo63237l();
        int i = 0;
        while (l.hasMoreElements()) {
            i += ((C72092e) l.nextElement()).mo63233g().mo63217a();
        }
        return i + 4;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        Enumeration l = mo63237l();
        if (z) {
            sVar.f191935a.write(36);
        }
        sVar.f191935a.write(128);
        sVar.mo63300d(l);
        sVar.f191935a.write(0);
        sVar.f191935a.write(0);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return true;
    }

    /* renamed from: k */
    public final byte[] mo63236k() {
        return this.f191934a;
    }

    /* renamed from: l */
    public final Enumeration mo63237l() {
        if (this.f191781b != null) {
            return new C72023ai(this);
        }
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            byte[] bArr = this.f191934a;
            int length = bArr.length;
            if (i >= length) {
                return vector.elements();
            }
            int i2 = i + 1000;
            if (i2 <= length) {
                length = i2;
            }
            int i3 = length - i;
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            vector.addElement(new C72050bc(bArr2));
            i = i2;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C72024aj(org.p5623b.p5624a.C72104q[] r4) {
        /*
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
        L_0x0006:
            int r2 = r4.length
            if (r1 == r2) goto L_0x0044
            r2 = r4[r1]     // Catch:{ ClassCastException -> 0x002a, IOException -> 0x0015 }
            org.b.a.bc r2 = (org.p5623b.p5624a.C72050bc) r2     // Catch:{ ClassCastException -> 0x002a, IOException -> 0x0015 }
            byte[] r2 = r2.f191934a     // Catch:{ ClassCastException -> 0x002a, IOException -> 0x0015 }
            r0.write(r2)     // Catch:{ ClassCastException -> 0x002a, IOException -> 0x0015 }
            int r1 = r1 + 1
            goto L_0x0006
        L_0x0015:
            r4 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "exception converting octets "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r4 = r4[r1]
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = " found in input should only contain DEROctetString"
            java.lang.String r4 = r4.concat(r1)
            r0.<init>(r4)
            throw r0
        L_0x0044:
            byte[] r0 = r0.toByteArray()
            r3.<init>(r0)
            r3.f191781b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5623b.p5624a.C72024aj.<init>(org.b.a.q[]):void");
    }
}
