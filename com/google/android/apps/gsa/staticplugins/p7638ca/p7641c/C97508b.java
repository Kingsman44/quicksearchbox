package com.google.android.apps.gsa.staticplugins.p7638ca.p7641c;

import android.view.View;
import com.google.android.apps.gsa.shared.p7148ui.SuggestionGridLayout;
import com.google.android.apps.gsa.shared.p7148ui.p7152d.C90668a;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7859d.C100072o;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.ca.c.b */
/* compiled from: PG */
public final class C97508b {

    /* renamed from: a */
    public static final C59071e f272312a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ca.c.b");

    /* renamed from: b */
    public final SuggestionGridLayout f272313b;

    /* renamed from: c */
    public final View[] f272314c = new View[((C58724pq) C90668a.f253557a).f156474d];

    /* renamed from: d */
    public int f272315d;

    /* renamed from: e */
    public C100072o f272316e;

    public C97508b(SuggestionGridLayout suggestionGridLayout) {
        this.f272313b = suggestionGridLayout;
        suggestionGridLayout.addOnLayoutChangeListener(new C97507a(this, suggestionGridLayout));
    }
}
