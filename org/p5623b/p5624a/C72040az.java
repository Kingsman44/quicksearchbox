package org.p5623b.p5624a;

import java.util.Arrays;
import org.p5623b.p5629b.C72123b;
import org.p5623b.p5629b.C72131f;

/* renamed from: org.b.a.az */
/* compiled from: PG */
public final class C72040az extends C72108u implements C72017ac {

    /* renamed from: a */
    private final byte[] f191795a;

    public C72040az(byte[] bArr) {
        this.f191795a = bArr;
    }

    /* renamed from: a */
    public final int mo63217a() {
        return C72090ch.m105544a(this.f191795a.length) + 1 + this.f191795a.length;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        sVar.mo63301e(z, 22, this.f191795a);
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72040az)) {
            return false;
        }
        return Arrays.equals(this.f191795a, ((C72040az) uVar).f191795a);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return false;
    }

    /* renamed from: e */
    public final String mo63226e() {
        return C72131f.m105663a(this.f191795a);
    }

    public final int hashCode() {
        return C72123b.m105659a(this.f191795a);
    }

    public final String toString() {
        return C72131f.m105663a(this.f191795a);
    }
}
