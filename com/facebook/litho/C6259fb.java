package com.facebook.litho;

/* renamed from: com.facebook.litho.fb */
/* compiled from: PG */
public final class C6259fb {

    /* renamed from: a */
    public final Object[] f18497a;

    /* renamed from: b */
    public short f18498b;

    public C6259fb() {
        this.f18497a = new Object[5];
        this.f18498b = 0;
    }

    public C6259fb(C6259fb fbVar) {
        this.f18497a = new Object[5];
        this.f18498b = 0;
        for (int i = 0; i < 5; i++) {
            this.f18497a[i] = fbVar.f18497a[i];
        }
        this.f18498b = fbVar.f18498b;
    }

    /* renamed from: e */
    private static String m16806e(int i) {
        if (i == 0) {
            return "CONTENT";
        }
        if (i == 1) {
            return "BACKGROUND";
        }
        if (i == 2) {
            return "FOREGROUND";
        }
        if (i == 3) {
            return "HOST";
        }
        if (i != 4) {
            return null;
        }
        return "BORDER";
    }

    /* renamed from: a */
    public final int mo13249a(int i) {
        if (i < 0 || i >= this.f18498b) {
            short s = this.f18498b;
            throw new IndexOutOfBoundsException("index=" + i + ", size=" + s);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 <= i) {
            if (this.f18497a[i3] != null) {
                i2++;
            }
            i3++;
        }
        return i3 - 1;
    }

    /* renamed from: b */
    public final Object mo13250b() {
        Object[] objArr = this.f18497a;
        Object obj = objArr[3];
        if (obj != null) {
            return obj;
        }
        Object obj2 = objArr[0];
        if (obj2 != null) {
            return obj2;
        }
        Object obj3 = objArr[1];
        if (obj3 != null) {
            return obj3;
        }
        Object obj4 = objArr[2];
        return obj4 != null ? obj4 : objArr[4];
    }

    /* renamed from: c */
    public final void mo13251c(int i, Object obj) {
        if (obj != null) {
            Object[] objArr = this.f18497a;
            if (objArr[i] == null) {
                if (objArr[3] == null) {
                    if (i == 3) {
                        if (this.f18498b <= 0) {
                            i = 3;
                        }
                    }
                    objArr[i] = obj;
                    this.f18498b = (short) (this.f18498b + 1);
                    return;
                }
                throw new RuntimeException("OutputUnitType.HOST unit should be the only member of an OutputUnitsAffinityGroup");
            }
            throw new RuntimeException("Already contains unit for type ".concat(String.valueOf(m16806e(i))));
        }
        throw new IllegalArgumentException("value should not be null");
    }

    /* renamed from: d */
    public final void mo13252d(int i, Object obj) {
        if (obj != null) {
            Object[] objArr = this.f18497a;
            if (objArr[i] != null) {
                objArr[i] = obj;
                return;
            }
        }
        if (obj != null && this.f18497a[i] == null) {
            mo13251c(i, obj);
        } else if (obj == null) {
            Object[] objArr2 = this.f18497a;
            if (objArr2[i] != null) {
                objArr2[i] = null;
                this.f18498b = (short) (this.f18498b - 1);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C6259fb fbVar = (C6259fb) obj;
            if (this.f18498b == fbVar.f18498b) {
                for (int i = 0; i < 5; i++) {
                    if (this.f18497a[i] != fbVar.f18497a[i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        for (int i = 0; i < this.f18498b; i++) {
            int a = mo13249a(i);
            Object obj = this.f18497a[mo13249a(i)];
            sb.append("\n\t");
            sb.append(m16806e(a));
            sb.append(": ");
            sb.append(obj.toString());
        }
        return sb.toString();
    }
}
