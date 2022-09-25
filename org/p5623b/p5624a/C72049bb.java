package org.p5623b.p5624a;

import java.util.Arrays;
import org.p5623b.p5629b.C72123b;
import org.p5623b.p5629b.C72131f;

/* renamed from: org.b.a.bb */
/* compiled from: PG */
public final class C72049bb extends C72108u implements C72017ac {

    /* renamed from: a */
    private final byte[] f191849a;

    public C72049bb(byte[] bArr) {
        this.f191849a = bArr;
    }

    /* renamed from: a */
    public final int mo63217a() {
        return C72090ch.m105544a(this.f191849a.length) + 1 + this.f191849a.length;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        sVar.mo63301e(z, 18, this.f191849a);
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72049bb)) {
            return false;
        }
        return Arrays.equals(this.f191849a, ((C72049bb) uVar).f191849a);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return false;
    }

    /* renamed from: e */
    public final String mo63226e() {
        return C72131f.m105663a(this.f191849a);
    }

    public final int hashCode() {
        return C72123b.m105659a(this.f191849a);
    }

    public final String toString() {
        return C72131f.m105663a(this.f191849a);
    }
}
