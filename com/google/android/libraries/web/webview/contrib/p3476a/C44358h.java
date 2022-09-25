package com.google.android.libraries.web.webview.contrib.p3476a;

import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43948y;
import com.google.android.libraries.web.p3428m.C43949z;
import com.google.android.libraries.web.p3428m.p3429a.C43914c;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.android.libraries.web.webview.p3491j.C44452d;
import com.google.android.libraries.web.webview.p3491j.C44453e;
import com.google.android.libraries.web.webview.p3491j.C44454f;
import com.google.android.libraries.web.webview.p3492k.p3493a.C44475p;
import java.util.HashSet;
import java.util.Set;
import p3186j$.util.Collection;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.contrib.a.h */
/* compiled from: PG */
public final class C44358h implements C44107h, C43949z, C44453e, C44452d {

    /* renamed from: a */
    public final Set f115340a = new HashSet();

    /* renamed from: b */
    private final Set f115341b = new HashSet();

    public C44358h(C43948y yVar) {
        yVar.mo46938e(this);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo44356a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo46529b(C43904a aVar) {
    }

    /* renamed from: c */
    public final void mo46530c(C43904a aVar) {
        C44475p pVar = (C44475p) ((C43914c) aVar).mo46411d(C44475p.class);
        pVar.f115616a.mo47307a(C44082a.f114755a, this);
        C44454f fVar = pVar.f115616a;
        C69664n.m101061g(C44082a.f114755a, "restricted");
        fVar.f115547b.add(this);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo46531d() {
    }

    /* renamed from: e */
    public final void mo47232e(int i, int i2, int i3, boolean z) {
        Collection.EL.stream(this.f115340a).forEach(new C44357g(i, i2, i3, z));
    }

    /* renamed from: f */
    public final void mo47233f(int i) {
        Collection.EL.stream(this.f115341b).forEach(new C44356f());
    }
}
