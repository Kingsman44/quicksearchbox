package com.google.android.libraries.p1649b.p1651b;

import android.view.View;
import com.google.android.libraries.p1649b.p1653d.C19623a;
import com.google.android.libraries.p1649b.p1655f.C19632f;

/* renamed from: com.google.android.libraries.b.b.b */
/* compiled from: PG */
public final class C19612b implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C19618h f54580a;

    public C19612b(C19618h hVar) {
        this.f54580a = hVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        if (i7 - i5 != i9 || i8 - i6 != i4 - i2) {
            this.f54580a.f54587c.mo24960a(new C19623a(8), new C19632f(i9, i4 - i2));
        }
    }
}
