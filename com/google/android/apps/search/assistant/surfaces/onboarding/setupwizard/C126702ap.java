package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.view.View;
import android.widget.ScrollView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.template.C45275b;
import com.google.android.setupcompat.template.C45276c;
import com.google.android.setupcompat.template.C45277d;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.view.BottomScrollView;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ap */
/* compiled from: PG */
public final class C126702ap {

    /* renamed from: a */
    public static final C59071e f348930a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ap");

    /* renamed from: b */
    public ScrollView f348931b;

    /* renamed from: c */
    public boolean f348932c = false;

    /* renamed from: d */
    public boolean f348933d = false;

    /* renamed from: e */
    public C45277d f348934e;

    /* renamed from: f */
    public C45277d f348935f;

    /* renamed from: g */
    private GlifLayout f348936g;

    /* renamed from: h */
    private BottomScrollView f348937h;

    /* renamed from: i */
    private boolean f348938i = false;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo107695a() {
        int dimensionPixelSize = this.f348936g.getContext().getResources().getDimensionPixelSize(R.dimen.assistant_suw_min_scroll_height);
        BottomScrollView bottomScrollView = this.f348937h;
        if (bottomScrollView != null && bottomScrollView.f118404a <= dimensionPixelSize) {
            mo107696b();
        }
        if (!this.f348938i && !this.f348931b.canScrollVertically(1)) {
            mo107696b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo107696b() {
        this.f348938i = true;
        ((C59052c) ((C59052c) f348930a.mo56224b()).mo56372aa(37121)).mo56386p("updateFooterButton");
        C45275b bVar = (C45275b) this.f348936g.mo49129j(C45275b.class);
        C45277d dVar = this.f348934e;
        if (dVar != null) {
            bVar.mo49175f(dVar);
        }
        C45277d dVar2 = this.f348935f;
        if (dVar2 != null) {
            bVar.mo49176g(dVar2, this.f348932c);
        }
    }

    /* renamed from: c */
    public final void mo107697c(View view) {
        GlifLayout glifLayout = (GlifLayout) view;
        this.f348936g = glifLayout;
        ScrollView m = glifLayout.mo49190m();
        this.f348931b = m;
        this.f348937h = m instanceof BottomScrollView ? (BottomScrollView) m : null;
    }

    /* renamed from: d */
    public final void mo107698d() {
        GlifLayout glifLayout = this.f348936g;
        if (glifLayout != null) {
            C45276c cVar = new C45276c(this.f348936g.getContext());
            cVar.mo49181b(R.string.assistant_suw_more_button_text);
            cVar.f118281b = new C126698al(this);
            cVar.f118282c = 5;
            cVar.f118283d = 2132150157;
            ((C45275b) glifLayout.mo49129j(C45275b.class)).mo49175f(cVar.mo49180a());
            C126700an anVar = new C126700an(this);
            this.f348931b.getViewTreeObserver().addOnDrawListener(anVar);
            this.f348931b.getViewTreeObserver().addOnGlobalLayoutListener(new C126701ao(this, anVar));
            this.f348931b.getViewTreeObserver().addOnScrollChangedListener(new C126699am(this));
        }
    }
}
