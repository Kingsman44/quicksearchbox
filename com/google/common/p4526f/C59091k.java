package com.google.common.p4526f;

import com.google.common.p4526f.p4528b.C59037l;

/* renamed from: com.google.common.f.k */
/* compiled from: PG */
final class C59091k extends C59037l {

    /* renamed from: a */
    public Object[] f157054a = new Object[8];

    /* renamed from: b */
    public int f157055b = 0;

    /* renamed from: a */
    public final int mo56346a(C58976aa aaVar) {
        for (int i = 0; i < this.f157055b; i++) {
            if (this.f157054a[i + i].equals(aaVar)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo56310b() {
        return this.f157055b;
    }

    /* renamed from: c */
    public final C58976aa mo56311c(int i) {
        if (i < this.f157055b) {
            return (C58976aa) this.f157054a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: d */
    public final Object mo56312d(C58976aa aaVar) {
        int a = mo56346a(aaVar);
        if (a == -1) {
            return null;
        }
        return aaVar.f156828b.cast(this.f157054a[a + a + 1]);
    }

    /* renamed from: e */
    public final Object mo56313e(int i) {
        if (i < this.f157055b) {
            return this.f157054a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.f157055b; i++) {
            sb.append(" '");
            sb.append(mo56311c(i));
            sb.append("': ");
            sb.append(mo56313e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
