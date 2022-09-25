package com.android.p247a.p249b.p252b;

/* renamed from: com.android.a.b.b.e */
/* compiled from: PG */
public final class C5004e {

    /* renamed from: a */
    public final Object f15852a;

    /* renamed from: b */
    public final Object f15853b;

    public C5004e(Object obj, Object obj2) {
        this.f15852a = obj;
        this.f15853b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5004e eVar = (C5004e) obj;
        Object obj2 = this.f15852a;
        if (obj2 == null) {
            if (eVar.f15852a != null) {
                return false;
            }
        } else if (!obj2.equals(eVar.f15852a)) {
            return false;
        }
        Object obj3 = this.f15853b;
        Object obj4 = eVar.f15853b;
        if (obj3 == null) {
            if (obj4 != null) {
                return false;
            }
        } else if (!obj3.equals(obj4)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        Object obj = this.f15852a;
        int i2 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i3 = (i + 31) * 31;
        Object obj2 = this.f15853b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i3 + i2;
    }
}
