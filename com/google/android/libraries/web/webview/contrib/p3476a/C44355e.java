package com.google.android.libraries.web.webview.contrib.p3476a;

import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.shared.lifecycle.C44103d;
import com.google.android.libraries.web.shared.lifecycle.C44106g;

/* renamed from: com.google.android.libraries.web.webview.contrib.a.e */
/* compiled from: PG */
public final class C44355e {

    /* renamed from: a */
    private final C44106g f115333a;

    /* renamed from: b */
    private final C43269t f115334b;

    /* renamed from: c */
    private boolean f115335c = false;

    public C44355e(C44106g gVar, C43269t tVar) {
        this.f115333a = gVar;
        this.f115334b = tVar;
    }

    /* renamed from: a */
    public final void mo47231a(C44351a aVar) {
        if (!this.f115334b.mo46385c().equals(C43271v.WEB_LAYER) && !this.f115335c) {
            this.f115335c = true;
            C44103d dVar = new C44103d(this.f115333a, C44358h.class);
            C44353c cVar = new C44353c(aVar);
            C44354d dVar2 = new C44354d(aVar);
            dVar.f114795a = cVar;
            dVar.f114796b = dVar2;
            dVar.f114797c = true;
            dVar.mo47075a("WebScrollMixin#registerForOverscroll");
        }
    }
}
