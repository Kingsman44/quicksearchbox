package com.google.common.p4575r;

import com.google.common.base.C58838bb;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.common.r.h */
/* compiled from: PG */
final class C60751h extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final float[] f164791a;

    /* renamed from: b */
    final int f164792b;

    /* renamed from: c */
    final int f164793c;

    public C60751h(float[] fArr, int i, int i2) {
        this.f164791a = fArr;
        this.f164792b = i;
        this.f164793c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Float) && C60752i.m92730d(this.f164791a, ((Float) obj).floatValue(), this.f164792b, this.f164793c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C60751h)) {
            return super.equals(obj);
        }
        C60751h hVar = (C60751h) obj;
        int i = this.f164793c - this.f164792b;
        if (hVar.f164793c - hVar.f164792b != i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f164791a[this.f164792b + i2] != hVar.f164791a[hVar.f164792b + i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        C58838bb.m90861B(i, this.f164793c - this.f164792b, "index");
        return Float.valueOf(this.f164791a[this.f164792b + i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f164792b; i2 < this.f164793c; i2++) {
            i = (i * 31) + Float.valueOf(this.f164791a[i2]).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int d;
        if (!(obj instanceof Float) || (d = C60752i.m92730d(this.f164791a, ((Float) obj).floatValue(), this.f164792b, this.f164793c)) < 0) {
            return -1;
        }
        return d - this.f164792b;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Float) {
            float[] fArr = this.f164791a;
            float floatValue = ((Float) obj).floatValue();
            int i = this.f164792b;
            int i2 = this.f164793c - 1;
            while (true) {
                if (i2 >= i) {
                    if (fArr[i2] == floatValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.f164792b;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Float f = (Float) obj;
        C58838bb.m90861B(i, this.f164793c - this.f164792b, "index");
        float[] fArr = this.f164791a;
        int i2 = this.f164792b + i;
        float f2 = fArr[i2];
        f.getClass();
        fArr[i2] = f.floatValue();
        return Float.valueOf(f2);
    }

    public final int size() {
        return this.f164793c - this.f164792b;
    }

    public final List subList(int i, int i2) {
        C58838bb.m90882q(i, i2, this.f164793c - this.f164792b);
        if (i == i2) {
            return Collections.emptyList();
        }
        float[] fArr = this.f164791a;
        int i3 = this.f164792b;
        return new C60751h(fArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f164793c - this.f164792b) * 12);
        sb.append('[');
        sb.append(this.f164791a[this.f164792b]);
        int i = this.f164792b;
        while (true) {
            i++;
            if (i < this.f164793c) {
                sb.append(", ");
                sb.append(this.f164791a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
