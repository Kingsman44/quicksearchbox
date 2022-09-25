package org.p5623b.p5624a;

import java.util.Arrays;
import org.p5623b.p5629b.C72123b;
import org.p5623b.p5629b.C72131f;

/* renamed from: org.b.a.bo */
/* compiled from: PG */
public final class C72062bo extends C72108u implements C72017ac {

    /* renamed from: a */
    private final byte[] f191860a;

    public C72062bo(byte[] bArr) {
        this.f191860a = C72123b.m105660b(bArr);
    }

    /* renamed from: a */
    public final int mo63217a() {
        return C72090ch.m105544a(this.f191860a.length) + 1 + this.f191860a.length;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        sVar.mo63301e(z, 21, this.f191860a);
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72062bo)) {
            return false;
        }
        return Arrays.equals(this.f191860a, ((C72062bo) uVar).f191860a);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return false;
    }

    /* renamed from: e */
    public final String mo63226e() {
        return C72131f.m105663a(this.f191860a);
    }

    public final int hashCode() {
        return C72123b.m105659a(this.f191860a);
    }
}
