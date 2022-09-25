package com.google.android.apps.gsa.shared.p7148ui.header;

import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;

/* renamed from: com.google.android.apps.gsa.shared.ui.header.a */
/* compiled from: PG */
final class C90688a extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ View f253660a;

    /* renamed from: b */
    final /* synthetic */ CorpusBarSelector f253661b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90688a(CorpusBarSelector corpusBarSelector, View view) {
        super("Scroll parent");
        this.f253661b = corpusBarSelector;
        this.f253660a = view;
    }

    public final void run() {
        ViewParent parent = this.f253660a.getParent();
        CorpusBarSelector corpusBarSelector = this.f253661b;
        if (parent == corpusBarSelector && corpusBarSelector.getParent() != null) {
            this.f253661b.mo84989b(this.f253660a);
        }
    }
}
