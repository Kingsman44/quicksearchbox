package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113371dl;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.p */
/* compiled from: PG */
final class C113573p extends C0648fj {

    /* renamed from: a */
    private final C48674ai f314472a;

    public C113573p(C48674ai aiVar) {
        this.f314472a = aiVar;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        super.getItemOffsets(rect, view, recyclerView, geVar);
        C113565h hVar = (C113565h) recyclerView.mAdapter;
        if (hVar != null) {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.mLayout;
            boolean z = linearLayoutManager == null || linearLayoutManager.getReverseLayout();
            Resources resources = view.getResources();
            int itemCount = hVar.getItemCount();
            int i = R.dimen.section_top_margin;
            if (!z ? childLayoutPosition != 0 : childLayoutPosition != itemCount - 1) {
                if (this.f314472a == C48674ai.INTENT_LAUNCHER) {
                    i = R.dimen.intent_launcher_section_margin;
                } else {
                    Optional b = hVar.mo100309b(childLayoutPosition);
                    if (!b.isEmpty() && C113371dl.m187574d((C48670ae) b.get())) {
                        Optional b2 = hVar.mo100309b(z ? childLayoutPosition + 1 : childLayoutPosition - 1);
                        if (b2.isPresent() && C113371dl.m187574d((C48670ae) b2.get())) {
                            i = R.dimen.section_rich_cards_spacing;
                        }
                    }
                    i = R.dimen.section_text_rich_card_spacing;
                }
            }
            rect.top = resources.getDimensionPixelOffset(i);
        }
    }
}
