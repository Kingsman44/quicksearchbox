package org.p5623b.p5624a;

import java.util.Arrays;
import org.p5623b.p5629b.C72123b;
import org.p5623b.p5629b.C72131f;

/* renamed from: org.b.a.ae */
/* compiled from: PG */
public final class C72019ae extends C72108u {

    /* renamed from: a */
    public byte[] f191775a;

    public C72019ae(byte[] bArr) {
        if (bArr.length >= 2) {
            this.f191775a = bArr;
            if (!m105334e(0) || !m105334e(1)) {
                throw new IllegalArgumentException("illegal characters in UTCTime string");
            }
            return;
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r3 = r0[r3];
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m105334e(int r3) {
        /*
            r2 = this;
            byte[] r0 = r2.f191775a
            int r1 = r0.length
            if (r1 <= r3) goto L_0x0011
            byte r3 = r0[r3]
            r0 = 48
            if (r3 < r0) goto L_0x0011
            r0 = 57
            if (r3 > r0) goto L_0x0011
            r3 = 1
            return r3
        L_0x0011:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5623b.p5624a.C72019ae.m105334e(int):boolean");
    }

    /* renamed from: a */
    public final int mo63217a() {
        int length = this.f191775a.length;
        return C72090ch.m105544a(length) + 1 + length;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        sVar.mo63301e(z, 23, this.f191775a);
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72019ae)) {
            return false;
        }
        return Arrays.equals(this.f191775a, ((C72019ae) uVar).f191775a);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return false;
    }

    public final int hashCode() {
        return C72123b.m105659a(this.f191775a);
    }

    public final String toString() {
        return C72131f.m105663a(this.f191775a);
    }
}
