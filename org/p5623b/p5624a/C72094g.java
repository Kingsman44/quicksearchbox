package org.p5623b.p5624a;

import java.util.Arrays;
import org.p5623b.p5629b.C72123b;

/* renamed from: org.b.a.g */
/* compiled from: PG */
public final class C72094g extends C72108u {

    /* renamed from: a */
    public static final C72094g[] f191915a = new C72094g[12];

    /* renamed from: b */
    private final byte[] f191916b;

    public C72094g(byte[] bArr) {
        if (C72099l.m105582l(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        } else if ((bArr[0] & 128) == 0) {
            this.f191916b = C72123b.m105660b(bArr);
            C72099l.m105580e(bArr);
        } else {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
    }

    /* renamed from: a */
    public final int mo63217a() {
        return C72090ch.m105544a(this.f191916b.length) + 1 + this.f191916b.length;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        sVar.mo63301e(z, 10, this.f191916b);
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72094g)) {
            return false;
        }
        return Arrays.equals(this.f191916b, ((C72094g) uVar).f191916b);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return false;
    }

    public final int hashCode() {
        return C72123b.m105659a(this.f191916b);
    }
}
