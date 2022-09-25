package com.google.android.libraries.lens.view.p2070an.p2072b;

import android.util.Size;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;

/* renamed from: com.google.android.libraries.lens.view.an.b.f */
/* compiled from: PG */
public final class C25408f {

    /* renamed from: a */
    private final int f69247a;

    public C25408f(C26244b bVar) {
        this.f69247a = (int) bVar.mo31456b(C26239a.PREFETCH_MAX_PIXELS);
    }

    /* renamed from: a */
    public final Size mo30465a(Size size) {
        int width = size.getWidth();
        int height = size.getHeight();
        double d = (double) this.f69247a;
        double d2 = (double) (width * height);
        Double.isNaN(d);
        Double.isNaN(d2);
        double sqrt = Math.sqrt(d / d2);
        if (sqrt >= 1.0d) {
            return size;
        }
        double d3 = (double) width;
        Double.isNaN(d3);
        int i = (int) (d3 * sqrt);
        double d4 = (double) height;
        Double.isNaN(d4);
        return new Size(i, (int) (d4 * sqrt));
    }
}
