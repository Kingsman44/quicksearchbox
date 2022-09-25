package com.google.android.libraries.elements.p1714d.p1724f.p1725a;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.p098j.C2082cp;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69977g;

/* renamed from: com.google.android.libraries.elements.d.f.a.l */
/* compiled from: PG */
public final /* synthetic */ class C21088l implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C21092p f59102a;

    /* renamed from: b */
    public final /* synthetic */ View f59103b;

    /* renamed from: c */
    public final /* synthetic */ int f59104c;

    /* renamed from: d */
    public final /* synthetic */ int f59105d;

    /* renamed from: e */
    public final /* synthetic */ C2082cp f59106e;

    /* renamed from: f */
    public final /* synthetic */ C69977g f59107f;

    public /* synthetic */ C21088l(C21092p pVar, C69977g gVar, View view, int i, int i2, C2082cp cpVar) {
        this.f59102a = pVar;
        this.f59107f = gVar;
        this.f59103b = view;
        this.f59104c = i;
        this.f59105d = i2;
        this.f59106e = cpVar;
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        C21092p pVar = this.f59102a;
        C69977g gVar = this.f59107f;
        View view = this.f59103b;
        int i = this.f59104c;
        int i2 = this.f59105d;
        C2082cp cpVar = this.f59106e;
        pVar.f59122b.mo26148b();
        gVar.mo61552b(pVar.mo26150d(view, i, i2, cpVar));
    }
}
