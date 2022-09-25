package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: androidx.core.graphics.c */
/* compiled from: PG */
public final class C1926c {

    /* renamed from: a */
    public static final C1926c f5820a = new C1926c(0, 0, 0, 0);

    /* renamed from: b */
    public final int f5821b;

    /* renamed from: c */
    public final int f5822c;

    /* renamed from: d */
    public final int f5823d;

    /* renamed from: e */
    public final int f5824e;

    private C1926c(int i, int i2, int i3, int i4) {
        this.f5821b = i;
        this.f5822c = i2;
        this.f5823d = i3;
        this.f5824e = i4;
    }

    /* renamed from: b */
    public static C1926c m5196b(C1926c cVar, C1926c cVar2) {
        return m5198d(Math.max(cVar.f5821b, cVar2.f5821b), Math.max(cVar.f5822c, cVar2.f5822c), Math.max(cVar.f5823d, cVar2.f5823d), Math.max(cVar.f5824e, cVar2.f5824e));
    }

    /* renamed from: c */
    public static C1926c m5197c(Rect rect) {
        return m5198d(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C1926c m5198d(int i, int i2, int i3, int i4) {
        if (i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else if (i4 == 0) {
                    return f5820a;
                } else {
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        return new C1926c(i, i2, i3, i4);
    }

    /* renamed from: e */
    public static C1926c m5199e(Insets insets) {
        return m5198d(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: a */
    public final Insets mo5069a() {
        return C1925b.m5195a(this.f5821b, this.f5822c, this.f5823d, this.f5824e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1926c cVar = (C1926c) obj;
        return this.f5824e == cVar.f5824e && this.f5821b == cVar.f5821b && this.f5823d == cVar.f5823d && this.f5822c == cVar.f5822c;
    }

    public final int hashCode() {
        return (((((this.f5821b * 31) + this.f5822c) * 31) + this.f5823d) * 31) + this.f5824e;
    }

    public final String toString() {
        return "Insets{left=" + this.f5821b + ", top=" + this.f5822c + ", right=" + this.f5823d + ", bottom=" + this.f5824e + '}';
    }
}
