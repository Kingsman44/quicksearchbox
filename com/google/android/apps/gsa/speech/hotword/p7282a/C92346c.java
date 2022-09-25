package com.google.android.apps.gsa.speech.hotword.p7282a;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.hotword.a.c */
/* compiled from: PG */
final class C92346c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C92349f f257451a;

    public C92346c(C92349f fVar) {
        this.f257451a = fVar;
    }

    public final void onGlobalLayout() {
        int height = this.f257451a.f257459g.getHeight();
        C92349f fVar = this.f257451a;
        int i = fVar.f257457e;
        if (i == 0) {
            fVar.f257457e = height;
            C58976aa aaVar = C58975e.f156826a;
            C92349f fVar2 = this.f257451a;
            int i2 = fVar2.f257457e;
            int A = fVar2.mo47541h().mo47504A();
            if (i2 <= A) {
                C59104x b = C92349f.f257454a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "BottomSheetDialog");
                ((C59052c) ((C59052c) b).mo56372aa(12463)).mo56386p("#setupFooter - small content");
                fVar2.f257461i.setVisibility(8);
                fVar2.f257462j.mo48051g(8, true);
                fVar2.f257463k.setVisibility(0);
            } else {
                C59104x b2 = C92349f.f257454a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "BottomSheetDialog");
                ((C59052c) ((C59052c) b2).mo56372aa(12461)).mo56386p("#setupFooter - large content");
                float f = (float) (A - i2);
                C59104x b3 = C92349f.f257454a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "BottomSheetDialog");
                ((C59052c) ((C59052c) b3).mo56372aa(12462)).mo56359L("footerPos: %f, peekHeight: %d, sheetviewHeight: %d", Float.valueOf(f), Integer.valueOf(A), Integer.valueOf(i2));
                fVar2.f257460h.setTranslationY(f);
                fVar2.f257461i.setVisibility(0);
                fVar2.f257462j.mo48051g(0, true);
                fVar2.f257463k.setVisibility(8);
            }
            fVar2.f257460h.setLayoutParams(new LinearLayout.LayoutParams(-1, fVar2.f257455c));
        } else if (height != i) {
            C58976aa aaVar2 = C58975e.f156826a;
            C92349f fVar3 = this.f257451a;
            fVar3.mo86997g(fVar3.f257459g);
            this.f257451a.f257457e = height;
        }
    }
}
