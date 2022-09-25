package com.google.android.libraries.componentview.services.p1701a;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.componentview.p1697d.C20470a;

/* renamed from: com.google.android.libraries.componentview.services.a.l */
/* compiled from: PG */
final class C20543l implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    private final C20470a f57699a;

    /* renamed from: b */
    private final View f57700b;

    /* renamed from: c */
    private final C20536e f57701c;

    /* renamed from: d */
    private boolean f57702d = false;

    public C20543l(C20470a aVar, View view, C20536e eVar) {
        this.f57699a = aVar;
        this.f57700b = view;
        this.f57701c = eVar;
    }

    public final boolean onPreDraw() {
        if (this.f57702d) {
            return true;
        }
        this.f57702d = true;
        this.f57700b.getViewTreeObserver().removeOnPreDrawListener(this);
        C20536e eVar = this.f57701c;
        if (eVar == null) {
            this.f57699a.mo25181kD(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            C20527a aVar = (C20527a) eVar;
            this.f57699a.mo25181kD(aVar.f57670a, aVar.f57671b, aVar.f57672c, aVar.f57673d);
        }
        return true;
    }
}
