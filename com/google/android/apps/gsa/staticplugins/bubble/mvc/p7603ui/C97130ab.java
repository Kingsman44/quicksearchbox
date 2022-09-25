package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui;

import androidx.core.p097i.C1967b;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97112h;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97213a;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97214b;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.view.BubbleView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ab */
/* compiled from: PG */
public final /* synthetic */ class C97130ab implements C1967b {

    /* renamed from: a */
    public final /* synthetic */ C97136ah f271390a;

    /* renamed from: b */
    public final /* synthetic */ BubbleView f271391b;

    public /* synthetic */ C97130ab(C97136ah ahVar, BubbleView bubbleView) {
        this.f271390a = ahVar;
        this.f271391b = bubbleView;
    }

    /* renamed from: a */
    public final void mo3353a(Object obj) {
        C97136ah ahVar = this.f271390a;
        BubbleView bubbleView = this.f271391b;
        if (((Integer) obj).intValue() == 2) {
            C97112h hVar = ahVar.f271415m;
            if (hVar != null) {
                C97214b b = hVar.f271343l.mo90473b();
                ahVar.f271424v = new C97213a(b.mo90592a(), b.mo90593b() + 0.01f);
            }
            bubbleView.findViewById(R.id.collapsed_content_view).setVisibility(8);
            return;
        }
        bubbleView.findViewById(R.id.collapsed_content_view).setVisibility(0);
        if (ahVar.f271415m != null && ahVar.f271414l != null) {
            ahVar.mo90517e();
        }
    }
}
