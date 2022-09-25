package com.google.android.apps.gsa.staticplugins.p7377ah.p7380c;

import com.google.android.apps.gsa.shared.p7148ui.header.CorpusBarView;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7859d.C100045al;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.ah.c.l */
/* compiled from: PG */
public final /* synthetic */ class C93866l implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C93870p f262151a;

    public /* synthetic */ C93866l(C93870p pVar) {
        this.f262151a = pVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        float f;
        C93870p pVar = this.f262151a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        CorpusBarView corpusBarView = pVar.f262161g;
        if (booleanValue != corpusBarView.f253625c) {
            if (booleanValue) {
                corpusBarView.setVisibility(0);
                f = 1.0f;
            } else {
                corpusBarView.setVisibility(8);
                f = 0.0f;
            }
            corpusBarView.setAlpha(f);
        }
        corpusBarView.f253625c = booleanValue;
        C100045al alVar = pVar.f262163i;
        if (alVar != null) {
            alVar.f279773a.mo91719c(booleanValue);
        }
    }
}
