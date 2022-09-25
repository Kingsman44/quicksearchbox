package com.google.common.p4575r;

import com.google.common.base.C58838bb;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.common.r.l */
/* compiled from: PG */
public final class C60755l implements Serializable {

    /* renamed from: a */
    public static final C60755l f164796a = new C60755l(new int[0], 0);

    /* renamed from: b */
    public final int[] f164797b;

    /* renamed from: c */
    public final int f164798c;

    public C60755l(int[] iArr, int i) {
        this.f164797b = iArr;
        this.f164798c = i;
    }

    /* renamed from: b */
    public static C60754k m92735b() {
        return new C60754k(10);
    }

    /* renamed from: c */
    public static C60754k m92736c(int i) {
        C58838bb.m90871f(i >= 0, "Invalid initialCapacity: %s", i);
        return new C60754k(i);
    }

    /* renamed from: a */
    public final int mo57181a(int i) {
        C58838bb.m90861B(i, this.f164798c, "index");
        return this.f164797b[i];
    }

    /* renamed from: d */
    public final boolean mo57182d() {
        return this.f164798c == 0;
    }

    /* renamed from: e */
    public final int[] mo57183e() {
        return Arrays.copyOfRange(this.f164797b, 0, this.f164798c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C60755l)) {
            return false;
        }
        C60755l lVar = (C60755l) obj;
        if (this.f164798c != lVar.f164798c) {
            return false;
        }
        for (int i = 0; i < this.f164798c; i++) {
            if (mo57181a(i) != lVar.mo57181a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f164798c; i2++) {
            i = (i * 31) + this.f164797b[i2];
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return mo57182d() ? f164796a : this;
    }

    public final String toString() {
        if (mo57182d()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(this.f164798c * 5);
        sb.append('[');
        sb.append(this.f164797b[0]);
        for (int i = 1; i < this.f164798c; i++) {
            sb.append(", ");
            sb.append(this.f164797b[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        if (this.f164798c >= this.f164797b.length) {
            return this;
        }
        int[] e = mo57183e();
        return new C60755l(e, e.length);
    }
}
