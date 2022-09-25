package com.google.android.apps.gsa.staticplugins.messages.monet.p8038ui;

import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102725f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.ui.t */
/* compiled from: PG */
public final /* synthetic */ class C102777t implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C102779v f286888a;

    public /* synthetic */ C102777t(C102779v vVar) {
        this.f286888a = vVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C102779v vVar = this.f286888a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C102725f fVar = (C102725f) axVar.mo56107c();
            if (fVar == C102725f.SHOWN_ACTIVE || fVar == C102725f.SHOWN_NONACTIVE) {
                GmmIntentFuseUiView gmmIntentFuseUiView = (GmmIntentFuseUiView) vVar.f286893d.inflate(R.layout.gmm_intent_fuse_ui_view, (ViewGroup) null);
                boolean z = fVar == C102725f.SHOWN_ACTIVE;
                C102778u uVar = new C102778u(vVar);
                gmmIntentFuseUiView.f286857f = z;
                if (!z) {
                    gmmIntentFuseUiView.f286853b.setVisibility(4);
                    gmmIntentFuseUiView.f286852a.setVisibility(4);
                } else {
                    gmmIntentFuseUiView.f286852a.setOnClickListener(new C102758a(gmmIntentFuseUiView, uVar));
                }
                if (!gmmIntentFuseUiView.f286857f) {
                    gmmIntentFuseUiView.f286854c.setVisibility(4);
                } else {
                    ProgressBar progressBar = gmmIntentFuseUiView.f286854c;
                    progressBar.setMax(progressBar.getMax() * 100);
                    ProgressBar progressBar2 = gmmIntentFuseUiView.f286854c;
                    gmmIntentFuseUiView.f286855d = new C102761d(progressBar2, (float) progressBar2.getMax());
                    gmmIntentFuseUiView.f286855d.setStartOffset(500);
                    gmmIntentFuseUiView.f286855d.setDuration(4000);
                    gmmIntentFuseUiView.f286855d.setInterpolator(new LinearInterpolator());
                    gmmIntentFuseUiView.f286855d.setAnimationListener(new C102760c(gmmIntentFuseUiView, uVar));
                    gmmIntentFuseUiView.f286854c.startAnimation(gmmIntentFuseUiView.f286855d);
                }
                gmmIntentFuseUiView.f286856e.setOnClickListener(new C102759b(gmmIntentFuseUiView, uVar));
                vVar.f286896g.addView(gmmIntentFuseUiView);
                vVar.f286895f.setMinHeight((int) vVar.f286892c.getResources().getDimension(R.dimen.message_card_explanation_text_height_smaller));
            }
        }
    }
}
