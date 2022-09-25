package com.google.common.p4575r;

import com.google.common.base.C58838bb;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.common.r.m */
/* compiled from: PG */
final class C60756m extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final int[] f164799a;

    /* renamed from: b */
    final int f164800b;

    /* renamed from: c */
    final int f164801c;

    public C60756m(int[] iArr, int i, int i2) {
        this.f164799a = iArr;
        this.f164800b = i;
        this.f164801c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && C60757n.m92745f(this.f164799a, ((Integer) obj).intValue(), this.f164800b, this.f164801c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C60756m)) {
            return super.equals(obj);
        }
        C60756m mVar = (C60756m) obj;
        int i = this.f164801c - this.f164800b;
        if (mVar.f164801c - mVar.f164800b != i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f164799a[this.f164800b + i2] != mVar.f164799a[mVar.f164800b + i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        C58838bb.m90861B(i, this.f164801c - this.f164800b, "index");
        return Integer.valueOf(this.f164799a[this.f164800b + i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f164800b; i2 < this.f164801c; i2++) {
            i = (i * 31) + this.f164799a[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int f;
        if (!(obj instanceof Integer) || (f = C60757n.m92745f(this.f164799a, ((Integer) obj).intValue(), this.f164800b, this.f164801c)) < 0) {
            return -1;
        }
        return f - this.f164800b;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f164799a;
            int intValue = ((Integer) obj).intValue();
            int i = this.f164800b;
            int i2 = this.f164801c - 1;
            while (true) {
                if (i2 >= i) {
                    if (iArr[i2] == intValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.f164800b;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        C58838bb.m90861B(i, this.f164801c - this.f164800b, "index");
        int[] iArr = this.f164799a;
        int i2 = this.f164800b + i;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    public final int size() {
        return this.f164801c - this.f164800b;
    }

    public final List subList(int i, int i2) {
        C58838bb.m90882q(i, i2, this.f164801c - this.f164800b);
        if (i == i2) {
            return Collections.emptyList();
        }
        int[] iArr = this.f164799a;
        int i3 = this.f164800b;
        return new C60756m(iArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f164801c - this.f164800b) * 5);
        sb.append('[');
        sb.append(this.f164799a[this.f164800b]);
        int i = this.f164800b;
        while (true) {
            i++;
            if (i < this.f164801c) {
                sb.append(", ");
                sb.append(this.f164799a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
