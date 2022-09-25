package com.google.android.libraries.lens.view.gallery;

import android.support.p033v7.widget.C0594dj;
import com.google.android.libraries.lens.view.gallery.p2111d.C26363i;
import com.google.android.libraries.lens.view.gallery.p2111d.C26372r;

/* renamed from: com.google.android.libraries.lens.view.gallery.z */
/* compiled from: PG */
final class C26439z extends C0594dj {

    /* renamed from: a */
    final /* synthetic */ C26299ac f71932a;

    public C26439z(C26299ac acVar) {
        this.f71932a = acVar;
    }

    public final int getSpanIndex(int i, int i2) {
        C26363i iVar = this.f71932a.f71469A;
        if (iVar.f71683e.mo31563b(i) != 0) {
            return 0;
        }
        C26372r rVar = iVar.f71683e;
        return rVar.mo31565d(i) % rVar.f71733b;
    }

    public final int getSpanSize(int i) {
        C26363i iVar = this.f71932a.f71469A;
        if (iVar.f71683e.mo31563b(i) == 0) {
            return 1;
        }
        return iVar.f71680b;
    }
}
