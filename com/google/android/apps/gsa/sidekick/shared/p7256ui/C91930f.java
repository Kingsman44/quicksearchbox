package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91666e;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.f */
/* compiled from: PG */
final class C91930f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f256384a;

    /* renamed from: b */
    final /* synthetic */ C91666e f256385b;

    /* renamed from: c */
    final /* synthetic */ View f256386c;

    /* renamed from: d */
    final /* synthetic */ View f256387d;

    /* renamed from: e */
    final /* synthetic */ C91043j f256388e;

    /* renamed from: f */
    final /* synthetic */ ClusterCard f256389f;

    public C91930f(ClusterCard clusterCard, boolean z, C91666e eVar, View view, View view2, C91043j jVar) {
        this.f256389f = clusterCard;
        this.f256384a = z;
        this.f256385b = eVar;
        this.f256386c = view;
        this.f256387d = view2;
        this.f256388e = jVar;
    }

    public final void onAnimationEnd(Animator animator) {
        View view;
        View view2;
        C91666e eVar;
        if (this.f256384a && (eVar = this.f256385b) != null) {
            eVar.mo86080b();
        }
        this.f256389f.mo86597h(this.f256386c);
        this.f256389f.mo86597h(this.f256387d);
        C91932h hVar = new C91932h(this.f256389f, this.f256386c, this.f256387d);
        this.f256388e.mo17709a(hVar);
        hVar.f256391b.setVisibility(8);
        if (!(hVar.f256391b.getTag(R.id.cluster_card_embedded_question) == null || (view2 = (View) hVar.f256391b.getTag(R.id.cluster_card_embedded_question)) == null)) {
            view2.setVisibility(8);
        }
        if (!(hVar.f256391b.getTag(R.id.cluster_card_menu) == null || (view = (View) hVar.f256391b.getTag(R.id.cluster_card_menu)) == null)) {
            view.setVisibility(8);
        }
        hVar.mo84881b();
    }
}
