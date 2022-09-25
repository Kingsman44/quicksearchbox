package org.p5623b.p5624a;

import java.util.Arrays;
import org.p5623b.p5629b.C72123b;
import org.p5623b.p5629b.C72131f;

/* renamed from: org.b.a.bm */
/* compiled from: PG */
public final class C72060bm extends C72108u implements C72017ac {

    /* renamed from: a */
    public final byte[] f191857a;

    public C72060bm(byte[] bArr) {
        this.f191857a = bArr;
    }

    /* renamed from: i */
    public static C72060bm m105466i(Object obj) {
        if (obj == null || (obj instanceof C72060bm)) {
            return (C72060bm) obj;
        }
        try {
            return (C72060bm) m105626q((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: ".concat(String.valueOf(e.toString())));
        }
    }

    /* renamed from: a */
    public final int mo63217a() {
        return C72090ch.m105544a(this.f191857a.length) + 1 + this.f191857a.length;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        sVar.mo63301e(z, 12, this.f191857a);
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72060bm)) {
            return false;
        }
        return Arrays.equals(this.f191857a, ((C72060bm) uVar).f191857a);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return false;
    }

    /* renamed from: e */
    public final String mo63226e() {
        return C72131f.m105664b(this.f191857a);
    }

    public final int hashCode() {
        return C72123b.m105659a(this.f191857a);
    }

    public final String toString() {
        return C72131f.m105664b(this.f191857a);
    }
}
