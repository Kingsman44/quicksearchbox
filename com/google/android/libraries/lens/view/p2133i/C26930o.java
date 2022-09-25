package com.google.android.libraries.lens.view.p2133i;

import android.view.View;
import com.google.android.material.bottomsheet.C44555f;

/* renamed from: com.google.android.libraries.lens.view.i.o */
/* compiled from: PG */
final class C26930o extends C44555f {

    /* renamed from: a */
    final /* synthetic */ C26932q f73371a;

    public C26930o(C26932q qVar) {
        this.f73371a = qVar;
    }

    /* renamed from: a */
    public final void mo32311a(View view, float f) {
    }

    /* renamed from: b */
    public final void mo32312b(View view, int i) {
        if (i == 3) {
            C26932q qVar = this.f73371a;
            if (qVar.f73399n.f73383l == 3) {
                qVar.mo32319d(3);
            }
        } else if (i == 5) {
            C26917d dVar = this.f73371a.f73389d;
            if (!dVar.isStateSaved()) {
                dVar.dismiss();
            }
        }
    }
}
