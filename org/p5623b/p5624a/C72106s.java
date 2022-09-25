package org.p5623b.p5624a;

import java.io.OutputStream;
import java.util.Enumeration;

/* renamed from: org.b.a.s */
/* compiled from: PG */
public class C72106s {

    /* renamed from: a */
    public final OutputStream f191935a;

    public C72106s(OutputStream outputStream) {
        this.f191935a = outputStream;
    }

    /* renamed from: a */
    public static C72106s m105614a(OutputStream outputStream, String str) {
        if (str.equals("DER")) {
            return new C72052be(outputStream);
        }
        return str.equals("DL") ? new C72068bu(outputStream) : new C72106s(outputStream);
    }

    /* renamed from: b */
    public C72106s mo63252b() {
        return new C72068bu(this.f191935a);
    }

    /* renamed from: c */
    public C72052be mo63253c() {
        return new C72052be(this.f191935a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo63300d(Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            mo63254j(((C72092e) enumeration.nextElement()).mo63233g(), true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo63301e(boolean z, int i, byte[] bArr) {
        if (z) {
            this.f191935a.write(i);
        }
        int length = bArr.length;
        mo63304h(length);
        this.f191935a.write(bArr, 0, length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo63302f(boolean z, int i, int i2, byte[] bArr) {
        mo63306k(z, i, i2);
        int length = bArr.length;
        mo63304h(length);
        this.f191935a.write(bArr, 0, length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo63303g(boolean z, int i, C72092e[] eVarArr) {
        if (z) {
            this.f191935a.write(i);
        }
        this.f191935a.write(128);
        for (C72092e g : eVarArr) {
            mo63254j(g.mo63233g(), true);
        }
        this.f191935a.write(0);
        this.f191935a.write(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo63304h(int i) {
        if (i > 127) {
            int i2 = 1;
            int i3 = i;
            while (true) {
                i3 >>>= 8;
                if (i3 == 0) {
                    break;
                }
                i2++;
            }
            this.f191935a.write((byte) (i2 | 128));
            for (int i4 = (i2 - 1) * 8; i4 >= 0; i4 -= 8) {
                this.f191935a.write((byte) (i >> i4));
            }
            return;
        }
        this.f191935a.write((byte) i);
    }

    /* renamed from: i */
    public final void mo63305i(C72092e eVar) {
        mo63254j(eVar.mo63233g(), true);
    }

    /* renamed from: j */
    public void mo63254j(C72108u uVar, boolean z) {
        uVar.mo63218b(this, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo63306k(boolean z, int i, int i2) {
        if (z) {
            if (i2 < 31) {
                this.f191935a.write(i | i2);
                return;
            }
            this.f191935a.write(31 | i);
            if (i2 < 128) {
                this.f191935a.write(i2);
                return;
            }
            byte[] bArr = new byte[5];
            int i3 = 4;
            bArr[4] = (byte) (i2 & 127);
            do {
                i2 >>= 7;
                i3--;
                bArr[i3] = (byte) ((i2 & 127) | 128);
            } while (i2 > 127);
            this.f191935a.write(bArr, i3, 5 - i3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo63307l(boolean z, byte b, byte[] bArr) {
        if (z) {
            this.f191935a.write(3);
        }
        int length = bArr.length;
        mo63304h(length + 1);
        this.f191935a.write(b);
        this.f191935a.write(bArr, 0, length);
    }
}
