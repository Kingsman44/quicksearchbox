package org.p5623b.p5624a;

import java.util.Arrays;
import org.p5623b.p5629b.C72123b;

/* renamed from: org.b.a.o */
/* compiled from: PG */
final class C72102o {

    /* renamed from: a */
    private final int f191929a;

    /* renamed from: b */
    private final byte[] f191930b;

    public C72102o(byte[] bArr) {
        this.f191929a = C72123b.m105659a(bArr);
        this.f191930b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C72102o) {
            return Arrays.equals(this.f191930b, ((C72102o) obj).f191930b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f191929a;
    }
}
