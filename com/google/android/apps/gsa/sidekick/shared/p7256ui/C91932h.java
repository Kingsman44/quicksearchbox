package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.p7148ui.C90628ad;
import com.google.android.apps.gsa.shared.p7148ui.C90638an;
import com.google.android.apps.gsa.shared.p7148ui.SuggestionGridLayout;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91667f;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91668g;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91671j;
import com.google.android.apps.gsa.sidekick.shared.p7239h.C91738a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.h */
/* compiled from: PG */
final class C91932h extends C90628ad implements LayoutTransition.TransitionListener {

    /* renamed from: b */
    public final View f256391b;

    /* renamed from: c */
    final /* synthetic */ ClusterCard f256392c;

    /* renamed from: d */
    private boolean f256393d = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91932h(ClusterCard clusterCard, View view, View view2) {
        super(C58485gu.m89846n(view2));
        this.f256392c = clusterCard;
        this.f256391b = view;
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup instanceof SuggestionGridLayout) {
            this.f256393d = false;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                layoutTransition.addTransitionListener(this);
            }
        }
    }

    /* renamed from: d */
    private final void m150838d(ViewGroup viewGroup) {
        if (this.f256393d) {
            if (viewGroup instanceof SuggestionGridLayout) {
                C90638an anVar = (C90638an) this.f256391b.getLayoutParams();
                anVar.f253490s = 5;
                this.f256391b.setLayoutParams(anVar);
            }
            this.f256391b.postDelayed(new C91931g(this), 500);
        }
        this.f256393d = true;
    }

    /* renamed from: c */
    public final void mo84882c() {
        ViewGroup viewGroup = (ViewGroup) this.f256391b.getParent();
        if (viewGroup != null) {
            m150838d(viewGroup);
            C91738a aVar = this.f256392c.f256357j;
            if (aVar != null) {
                C58485gu guVar = this.f253420a;
                int size = guVar.size();
                for (int i = 0; i < size; i++) {
                    C91667f fVar = (C91667f) ((View) guVar.get(i)).getTag(R.id.entry_card_view_adapter);
                    if (fVar != null) {
                        fVar.mo86089k(aVar);
                    }
                }
            }
            C91667f fVar2 = (C91667f) viewGroup.getTag(R.id.entry_card_view_adapter);
            C91668g gVar = (C91668g) this.f256391b.getTag(R.id.card_module_presenter);
            if (gVar != null && (fVar2 instanceof C91671j)) {
                ((C91671j) fVar2).mo86102q(gVar);
            }
        }
    }

    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        ViewGroup viewGroup2;
        View view2 = this.f256391b;
        if (view == view2 && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
            LayoutTransition layoutTransition2 = viewGroup2.getLayoutTransition();
            if (layoutTransition2 != null) {
                layoutTransition2.removeTransitionListener(this);
            }
            m150838d(viewGroup2);
        }
    }

    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
    }
}
