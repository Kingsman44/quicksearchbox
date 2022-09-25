package org.p5623b.p5624a;

import org.chromium.net.PrivateKeyType;

/* renamed from: org.b.a.at */
/* compiled from: PG */
public final class C72034at extends C72041b {
    public C72034at(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: i */
    public static C72034at m105368i(Object obj) {
        if (obj == null || (obj instanceof C72034at)) {
            return (C72034at) obj;
        }
        if (obj instanceof C72065br) {
            C72065br brVar = (C72065br) obj;
            return new C72034at(brVar.f191798a, brVar.f191799b);
        } else if (obj instanceof byte[]) {
            try {
                return (C72034at) m105626q((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException("encoding error in getInstance: ".concat(String.valueOf(e.toString())));
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
    }

    /* renamed from: j */
    public static void m105369j(C72018ad adVar) {
        C72108u e = adVar.mo63227e();
        if (e instanceof C72034at) {
            m105368i(e);
            return;
        }
        byte[] k = C72104q.m105606i(e).mo63236k();
        int length = k.length;
        if (length > 0) {
            byte b = k[0];
            int i = length - 1;
            byte[] bArr = new byte[i];
            if (i != 0) {
                System.arraycopy(k, 1, bArr, 0, i);
            }
            new C72034at(bArr, b);
            return;
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    /* renamed from: a */
    public final int mo63217a() {
        return C72090ch.m105544a(this.f191798a.length + 1) + 1 + this.f191798a.length + 1;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        int i;
        byte[] bArr = this.f191798a;
        int length = bArr.length;
        if (!(length == 0 || (i = this.f191799b) == 0)) {
            int i2 = length - 1;
            byte b = bArr[i2];
            byte b2 = (byte) ((PrivateKeyType.INVALID << i) & b);
            if (b != b2) {
                if (z) {
                    sVar.f191935a.write(3);
                }
                sVar.mo63304h(i2 + 2);
                sVar.f191935a.write(i);
                sVar.f191935a.write(bArr, 0, i2);
                sVar.f191935a.write(b2);
                return;
            }
        }
        sVar.mo63307l(z, (byte) this.f191799b, bArr);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return false;
    }

    /* renamed from: f */
    public final C72108u mo63228f() {
        return this;
    }

    /* renamed from: h */
    public final C72108u mo63229h() {
        return this;
    }
}
