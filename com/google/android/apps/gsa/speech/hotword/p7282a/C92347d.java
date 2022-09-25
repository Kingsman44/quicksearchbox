package com.google.android.apps.gsa.speech.hotword.p7282a;

import android.view.View;
import com.google.android.material.bottomsheet.C44555f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.hotword.a.d */
/* compiled from: PG */
final class C92347d extends C44555f {

    /* renamed from: a */
    final /* synthetic */ C92349f f257452a;

    public C92347d(C92349f fVar) {
        this.f257452a = fVar;
    }

    /* renamed from: a */
    public final void mo32311a(View view, float f) {
        C92349f fVar = this.f257452a;
        fVar.f257456d = f;
        fVar.mo86997g(view);
    }

    /* renamed from: b */
    public final void mo32312b(View view, int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (i == 5) {
            this.f257452a.cancel();
        } else if (i == 3) {
            this.f257452a.f257461i.setVisibility(8);
        } else {
            this.f257452a.f257461i.setVisibility(0);
        }
    }
}
