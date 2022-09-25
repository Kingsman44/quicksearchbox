package com.google.android.libraries.searchbox.shared.p3202c;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.searchbox.shared.c.c */
/* compiled from: PG */
public final class C41645c {

    /* renamed from: a */
    public final List f108859a = new ArrayList();

    /* renamed from: b */
    private final List f108860b = new ArrayList();

    /* renamed from: d */
    private final int m73045d(int i) {
        int size = this.f108860b.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            if (i >= ((C41644b) this.f108860b.get(i3)).f108857a) {
                i2 = i3 + 1;
            } else {
                size = i3 - 1;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public final int mo44242a(int i) {
        int d = m73045d(i);
        if (d != 0) {
            int i2 = d - 1;
            if (((C41644b) this.f108860b.get(i2)).f108858b < i) {
                return -1;
            }
            return i2;
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo44243b(int i, Object obj) {
        int a = mo44242a(i);
        if (a == -1) {
            mo44244c(new C41644b(i, i), obj);
        } else {
            this.f108859a.set(a, obj);
        }
    }

    /* renamed from: c */
    public final void mo44244c(C41644b bVar, Object obj) {
        int d;
        int i = bVar.f108857a;
        int i2 = bVar.f108858b;
        if (i > i2) {
            throw new IllegalArgumentException(String.format("Range start is greater than the range end: [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        } else if (!this.f108860b.isEmpty() && ((d = m73045d(i)) != m73045d(i2) || (d != 0 && ((C41644b) this.f108860b.get(d - 1)).f108858b >= i))) {
            throw new IllegalArgumentException(String.format("At least one range lies between [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        } else {
            int d2 = m73045d(i);
            this.f108860b.add(d2, new C41644b(i, i2));
            this.f108859a.add(d2, obj);
        }
    }
}
