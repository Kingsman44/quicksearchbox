package com.google.android.libraries.lens.view.education;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2057ag.C25102d;
import com.google.android.libraries.lens.view.utils.C28134w;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.lens.view.education.j */
/* compiled from: PG */
public final class C25780j {

    /* renamed from: a */
    private static final C58974d f70048a = C58974d.m91135i("LatexRendererFactory");

    /* renamed from: b */
    private final C68214a f70049b;

    public C25780j(C68214a aVar) {
        this.f70049b = aVar;
    }

    /* renamed from: a */
    public final C25777g mo30930a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.latex_renderer_xplatmath_textview_container);
        if (viewGroup2 == null) {
            try {
                viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.latex_renderer_xplatmath_textview, viewGroup, false);
                if (viewGroup2 != null) {
                    viewGroup.removeAllViews();
                    viewGroup.addView(viewGroup2);
                }
            } catch (RuntimeException e) {
                ((C58970a) ((C58970a) ((C58970a) f70048a.mo56225c()).mo56382g(e)).mo56372aa(49338)).mo56386p("Failed to populate renderer view.");
                viewGroup2 = null;
            }
        }
        if (viewGroup2 == null) {
            return null;
        }
        C25773c cVar = new C25773c();
        cVar.mo30922b();
        cVar.mo30921a(0);
        cVar.mo30922b();
        cVar.mo30921a(96);
        if (cVar.f70046b != 3) {
            StringBuilder sb = new StringBuilder();
            if ((cVar.f70046b & 1) == 0) {
                sb.append(" shouldWrapContent");
            }
            if ((cVar.f70046b & 2) == 0) {
                sb.append(" maxHeight");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        C25785o oVar = new C25785o(viewGroup2, new C25774d(cVar.f70045a), (C25102d) this.f70049b.mo27525b());
        LatexRendererScrollView latexRendererScrollView = oVar.f70042a.f70038b;
        latexRendererScrollView.f70036a = (int) C28134w.m52424a((float) ((C25774d) oVar.f70043b).f70047a, oVar.mo30920a());
        latexRendererScrollView.requestLayout();
        ((C25784n) oVar.f70042a).f70054f.setOnTouchListener(C25782l.f70051a);
        return oVar;
    }
}
