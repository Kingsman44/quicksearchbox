package org.p5623b.p5624a;

import java.util.Arrays;
import org.p5623b.p5629b.C72123b;
import org.p5623b.p5629b.C72131f;

/* renamed from: org.b.a.bp */
/* compiled from: PG */
public final class C72063bp extends C72108u implements C72017ac {

    /* renamed from: a */
    private final byte[] f191861a;

    public C72063bp(byte[] bArr) {
        this.f191861a = bArr;
    }

    /* renamed from: a */
    public final int mo63217a() {
        return C72090ch.m105544a(this.f191861a.length) + 1 + this.f191861a.length;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        sVar.mo63301e(z, 26, this.f191861a);
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72063bp)) {
            return false;
        }
        return Arrays.equals(this.f191861a, ((C72063bp) uVar).f191861a);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return false;
    }

    /* renamed from: e */
    public final String mo63226e() {
        return C72131f.m105663a(this.f191861a);
    }

    public final int hashCode() {
        return C72123b.m105659a(this.f191861a);
    }

    public final String toString() {
        return C72131f.m105663a(this.f191861a);
    }
}
