package org.p5623b.p5624a;

import java.io.IOException;
import java.util.Arrays;
import org.p5623b.p5629b.C72123b;

/* renamed from: org.b.a.bn */
/* compiled from: PG */
public final class C72061bn extends C72108u implements C72017ac {

    /* renamed from: a */
    private static final char[] f191858a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private final byte[] f191859b;

    public C72061bn(byte[] bArr) {
        this.f191859b = C72123b.m105660b(bArr);
    }

    /* renamed from: a */
    public final int mo63217a() {
        return C72090ch.m105544a(this.f191859b.length) + 1 + this.f191859b.length;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        sVar.mo63301e(z, 28, this.f191859b);
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72061bn)) {
            return false;
        }
        return Arrays.equals(this.f191859b, ((C72061bn) uVar).f191859b);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return false;
    }

    /* renamed from: e */
    public final String mo63226e() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] o = mo63293o();
            for (int i = 0; i != o.length; i++) {
                char[] cArr = f191858a;
                stringBuffer.append(cArr[(o[i] >>> 4) & 15]);
                stringBuffer.append(cArr[o[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new C72107t("internal error encoding UniversalString");
        }
    }

    public final int hashCode() {
        return C72123b.m105659a(this.f191859b);
    }

    public final String toString() {
        return mo63226e();
    }
}
