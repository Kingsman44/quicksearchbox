package com.google.android.apps.gsa.staticplugins.p7377ah.p7380c;

import com.google.android.apps.gsa.shared.p7148ui.header.CorpusBarSelector;
import com.google.android.apps.gsa.shared.p7148ui.header.CorpusBarView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.ah.c.o */
/* compiled from: PG */
public final /* synthetic */ class C93869o implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C93870p f262154a;

    public /* synthetic */ C93869o(C93870p pVar) {
        this.f262154a = pVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C93870p pVar = this.f262154a;
        if (((Boolean) obj).booleanValue()) {
            pVar.f262162h = new C93858d(pVar.f262159e, pVar.f262157c);
            C93858d dVar = pVar.f262162h;
            CorpusBarView corpusBarView = pVar.f262161g;
            dVar.f262132d = pVar.f262160f;
            corpusBarView.setContentDescription(dVar.f262129a.getString(R.string.corpora_dialog_header));
            corpusBarView.setFocusable(true);
            corpusBarView.setClickable(true);
            corpusBarView.setOnClickListener(new C93855a(dVar));
            corpusBarView.f253623a.setImportantForAccessibility(4);
            CorpusBarSelector corpusBarSelector = corpusBarView.f253624b;
            corpusBarSelector.setDescendantFocusability(393216);
            corpusBarSelector.setImportantForAccessibility(4);
        }
    }
}
