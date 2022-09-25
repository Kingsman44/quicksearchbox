package androidx.media3.common;

import androidx.media3.common.p136b.C2601a;
import java.util.Arrays;

/* renamed from: androidx.media3.common.br */
/* compiled from: PG */
public final class C2656br implements C2668l {

    /* renamed from: a */
    public final int f7401a;

    /* renamed from: b */
    public final C2652bn f7402b;

    /* renamed from: c */
    public final boolean[] f7403c;

    /* renamed from: d */
    private final boolean f7404d;

    /* renamed from: e */
    private final int[] f7405e;

    public C2656br(C2652bn bnVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = bnVar.f7354a;
        this.f7401a = i;
        boolean z2 = true;
        C2601a.m6830b(i == iArr.length && i == zArr.length);
        this.f7402b = bnVar;
        this.f7404d = (!z || i <= 1) ? false : z2;
        this.f7405e = (int[]) iArr.clone();
        this.f7403c = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2656br brVar = (C2656br) obj;
            return this.f7404d == brVar.f7404d && this.f7402b.equals(brVar.f7402b) && Arrays.equals(this.f7405e, brVar.f7405e) && Arrays.equals(this.f7403c, brVar.f7403c);
        }
    }

    public final int hashCode() {
        return (((((this.f7402b.hashCode() * 31) + (this.f7404d ? 1 : 0)) * 31) + Arrays.hashCode(this.f7405e)) * 31) + Arrays.hashCode(this.f7403c);
    }
}
