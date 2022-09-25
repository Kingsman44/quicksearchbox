package org.p5623b.p5624a;

import java.util.Arrays;
import org.p5623b.p5629b.C72123b;
import org.p5623b.p5629b.C72131f;

/* renamed from: org.b.a.bk */
/* compiled from: PG */
public final class C72058bk extends C72108u implements C72017ac {

    /* renamed from: a */
    private final byte[] f191856a;

    public C72058bk(byte[] bArr) {
        this.f191856a = C72123b.m105660b(bArr);
    }

    /* renamed from: a */
    public final int mo63217a() {
        return C72090ch.m105544a(this.f191856a.length) + 1 + this.f191856a.length;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        sVar.mo63301e(z, 20, this.f191856a);
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72058bk)) {
            return false;
        }
        return Arrays.equals(this.f191856a, ((C72058bk) uVar).f191856a);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return false;
    }

    /* renamed from: e */
    public final String mo63226e() {
        return C72131f.m105663a(this.f191856a);
    }

    public final int hashCode() {
        return C72123b.m105659a(this.f191856a);
    }

    public final String toString() {
        return C72131f.m105663a(this.f191856a);
    }
}
