package com.google.android.libraries.lens.view.gallery;

/* renamed from: com.google.android.libraries.lens.view.gallery.an */
/* compiled from: PG */
public final class C26313an {
    /* renamed from: a */
    public static int m48565a(long j) {
        if (j == 0) {
            return 2;
        }
        if (j == 1) {
            return 3;
        }
        if (j < 6) {
            return 4;
        }
        if (j < 100) {
            return 5;
        }
        return j < 1000 ? 6 : 7;
    }
}
