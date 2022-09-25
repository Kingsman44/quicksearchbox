package com.google.android.libraries.elements.p1714d.p1724f.p1725a;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import p5488io.p5490b.p5496d.C69820b;

/* renamed from: com.google.android.libraries.elements.d.f.a.n */
/* compiled from: PG */
public final /* synthetic */ class C21090n implements C69820b {

    /* renamed from: a */
    public final /* synthetic */ C21092p f59113a;

    /* renamed from: b */
    public final /* synthetic */ View f59114b;

    /* renamed from: c */
    public final /* synthetic */ View.OnLayoutChangeListener f59115c;

    /* renamed from: d */
    public final /* synthetic */ AccessibilityManager.TouchExplorationStateChangeListener f59116d;

    /* renamed from: e */
    public final /* synthetic */ C21087k f59117e;

    public /* synthetic */ C21090n(C21092p pVar, View view, View.OnLayoutChangeListener onLayoutChangeListener, C21087k kVar, AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        this.f59113a = pVar;
        this.f59114b = view;
        this.f59115c = onLayoutChangeListener;
        this.f59117e = kVar;
        this.f59116d = touchExplorationStateChangeListener;
    }

    /* renamed from: a */
    public final void mo26097a() {
        C21092p pVar = this.f59113a;
        View view = this.f59114b;
        View.OnLayoutChangeListener onLayoutChangeListener = this.f59115c;
        C21087k kVar = this.f59117e;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f59116d;
        if (view != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        pVar.f59123c.mo26144b(kVar);
        pVar.f59121a.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }
}
