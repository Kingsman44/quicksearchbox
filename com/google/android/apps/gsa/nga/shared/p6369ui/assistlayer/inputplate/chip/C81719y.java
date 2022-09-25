package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.view.View;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28293k;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.y */
/* compiled from: PG */
public final /* synthetic */ class C81719y implements C81688an {

    /* renamed from: a */
    public final /* synthetic */ ChipsCarousel f223479a;

    public /* synthetic */ C81719y(ChipsCarousel chipsCarousel) {
        this.f223479a = chipsCarousel;
    }

    /* renamed from: gU */
    public final void mo75235gU(View view) {
        C28293k kVar;
        C81688an anVar = this.f223479a.f223377g;
        if (anVar != null) {
            C81681ag agVar = (C81681ag) anVar;
            int childAdapterPosition = agVar.f223395c.getChildAdapterPosition(view);
            C28293k kVar2 = agVar.f223398f;
            if (kVar2 != null && childAdapterPosition >= 0 && childAdapterPosition < ((C28257a) kVar2).f76909b.size()) {
                kVar = (C28293k) ((C28257a) agVar.f223398f).f76909b.get(childAdapterPosition);
            } else {
                kVar = null;
            }
            if (kVar != null) {
                agVar.mo75234e(C28285c.m52883j(((C28293k) kVar.mo33746b().get(0)).mo33745a(), 5, (Integer) null));
            }
        }
    }
}
