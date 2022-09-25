package com.google.android.libraries.lens.view.gallery.p2111d;

import com.google.android.libraries.lens.view.gallery.data.C26404w;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.l */
/* compiled from: PG */
public final class C26366l {
    /* renamed from: a */
    public static final boolean m48626a(int i, C26372r rVar, C26372r rVar2) {
        int b = rVar.mo31563b(i);
        if (b != rVar2.mo31563b(i)) {
            return true;
        }
        switch (b) {
            case 0:
                if (rVar.mo31569h(i) != rVar2.mo31569h(i)) {
                    return true;
                }
                C26404w e = rVar.mo31566e(i);
                C26404w e2 = rVar2.mo31566e(i);
                if (e != null && e2 != null) {
                    return e.mo31586b() != e2.mo31586b();
                }
                if (e == null && e2 == null) {
                    return false;
                }
                return true;
            case 1:
                return rVar.mo31567f() != rVar2.mo31567f();
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new IllegalArgumentException("Invalid itemType" + b);
        }
    }
}
