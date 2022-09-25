package com.google.android.apps.gsa.staticplugins.p7377ah.p7380c;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.p7148ui.header.CorpusBarSelector;
import com.google.android.apps.gsa.shared.search.corpus.Corpus;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;

/* renamed from: com.google.android.apps.gsa.staticplugins.ah.c.m */
/* compiled from: PG */
public final /* synthetic */ class C93867m implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C93870p f262152a;

    public /* synthetic */ C93867m(C93870p pVar) {
        this.f262152a = pVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        View findViewWithTag;
        C93870p pVar = this.f262152a;
        C58485gu guVar = (C58485gu) obj;
        pVar.f262160f = guVar;
        CorpusBarSelector corpusBarSelector = pVar.f262161g.f253624b;
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        int childCount = corpusBarSelector.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = corpusBarSelector.getChildAt(childCount);
            if (childAt.getTag() instanceof Corpus) {
                Corpus corpus = (Corpus) childAt.getTag();
            }
            corpusBarSelector.removeView(childAt);
        }
        CorpusBarSelector corpusBarSelector2 = pVar.f262161g.f253624b;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            Corpus corpus2 = (Corpus) guVar.get(i);
            String str = corpus2.f252914e;
            View view = (View) pVar.f262155a.get(str);
            if (view == null) {
                view = pVar.f262158d.inflate(R.layout.corpus_selector, corpusBarSelector2, false);
                pVar.f262155a.put(str, view);
            }
            CorpusBarSelector corpusBarSelector3 = pVar.f262161g.f253624b;
            TextView textView = (TextView) view.findViewById(R.id.corpus_selector_name);
            String a = CorpusBarSelector.m148067a(corpusBarSelector3.getContext(), corpus2);
            if (!(textView == null || a == null)) {
                textView.setText(a);
                corpusBarSelector3.mo84990c(textView);
            }
            view.setTag(corpus2);
            if (corpus2.equals(corpusBarSelector3.f253618b)) {
                view.setSelected(true);
            } else {
                view.setSelected(false);
            }
            view.setOnClickListener(new C93865k(pVar, corpus2));
            corpusBarSelector2.addView(view);
        }
        if (((Boolean) ((C93873s) pVar.f262156b).f262174c.f63720e).booleanValue()) {
            C58833ax axVar = (C58833ax) ((C93873s) pVar.f262156b).f262173b.f63720e;
            if (axVar.mo56113h()) {
                pVar.f262161g.f253624b.mo84991d((Corpus) axVar.mo56107c());
                CorpusBarSelector corpusBarSelector4 = pVar.f262161g.f253624b;
                Corpus corpus3 = corpusBarSelector4.f253618b;
                if (!(corpus3 == null || (findViewWithTag = corpusBarSelector4.findViewWithTag(corpus3)) == null)) {
                    corpusBarSelector4.mo84989b(findViewWithTag);
                }
            }
            C93858d dVar = pVar.f262162h;
            if (dVar != null) {
                dVar.mo88193a((Corpus) axVar.mo56111f());
                C93858d dVar2 = pVar.f262162h;
                dVar2.f262132d = guVar;
                C93863i iVar = dVar2.f262135g;
                if (iVar != null) {
                    iVar.clear();
                    dVar2.f262135g.addAll(guVar);
                    return;
                }
                return;
            }
            return;
        }
        pVar.f262161g.f253624b.mo84991d((Corpus) null);
    }
}
