package com.google.android.apps.gsa.shared.p7148ui;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.shared.ui.ao */
/* compiled from: PG */
final class C90639ao extends C90628ad {

    /* renamed from: b */
    public final C90637am f253491b;

    /* renamed from: c */
    final /* synthetic */ SuggestionGridLayout f253492c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90639ao(SuggestionGridLayout suggestionGridLayout, C90637am amVar) {
        super(C58485gu.m89842j(amVar.f253467d));
        this.f253492c = suggestionGridLayout;
        this.f253491b = amVar;
    }

    /* renamed from: c */
    public final void mo84882c() {
        if (SuggestionGridLayout.m147911a(this.f253491b).f253475d) {
            this.f253492c.mo84840c(this.f253491b);
            this.f253492c.invalidate();
        }
    }
}
