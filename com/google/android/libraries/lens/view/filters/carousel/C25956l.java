package com.google.android.libraries.lens.view.filters.carousel;

import android.support.p033v7.widget.C0656fr;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;

/* renamed from: com.google.android.libraries.lens.view.filters.carousel.l */
/* compiled from: PG */
final class C25956l extends C0656fr {

    /* renamed from: a */
    final /* synthetic */ C25961q f70543a;

    public C25956l(C25961q qVar) {
        this.f70543a = qVar;
    }

    /* renamed from: e */
    public final boolean mo3014e(int i, int i2) {
        C25961q qVar = this.f70543a;
        boolean z = i > 0;
        LinearLayoutManager e = qVar.mo31143e();
        float f = Float.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < e.getItemCount(); i4++) {
            View findViewByPosition = e.findViewByPosition(i4);
            if (findViewByPosition != null) {
                float a = qVar.mo31139a(findViewByPosition);
                if (z == (Math.signum(a) > 0.0f) && Math.abs(a) < f) {
                    f = Math.abs(a);
                    i3 = i4;
                }
            }
        }
        if (i3 == -1) {
            i3 = qVar.mo31141c();
        }
        qVar.mo31147i(i3);
        return true;
    }
}
