package com.google.android.libraries.web.p3408h.p3414b;

import android.net.Uri;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.lifecycle.C43889d;
import com.google.android.libraries.web.lifecycle.C43890e;
import com.google.android.libraries.web.lifecycle.internal.C43896d;
import com.google.android.libraries.web.lifecycle.p3426b.C43879a;
import com.google.android.libraries.web.lifecycle.p3426b.C43880b;
import com.google.android.libraries.web.p3408h.C43774a;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.p3411a.C43780e;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.p3411a.C43781f;
import com.google.android.libraries.web.p3428m.C43904a;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.h.b.b */
/* compiled from: PG */
public final class C43788b implements C43796j, C43890e, C43880b {

    /* renamed from: a */
    public final C43781f f114172a;

    /* renamed from: b */
    public final C71548cy f114173b;

    /* renamed from: c */
    public final C43896d f114174c;

    /* renamed from: d */
    public final C43791e f114175d;

    /* renamed from: e */
    private final C43879a f114176e = new C43879a();

    public C43788b(C43791e eVar, C43904a aVar, C43774a aVar2, C43781f fVar, C69585o oVar) {
        C69664n.m101061g(eVar, "initialNavigationSnapshot");
        C69664n.m101061g(aVar, "window");
        C69664n.m101061g(aVar2, "page");
        C69664n.m101061g(fVar, "channelsManager");
        C69664n.m101061g(oVar, "mainImmediateContext");
        this.f114175d = eVar;
        this.f114172a = fVar;
        Uri a = eVar.mo46810a();
        C69664n.m101058d(a);
        this.f114173b = C71574dx.m104480b(new C43789c(a));
        C43896d dVar = new C43896d();
        this.f114174c = dVar;
        C19559g.m37304c();
        fVar.f114162b = true;
        dVar.mo46896b(new C43780e(fVar));
    }

    /* renamed from: a */
    public final void mo46804a() {
        this.f114174c.mo46902h();
    }

    /* renamed from: c */
    public final /* synthetic */ C43889d mo46410c() {
        throw null;
    }

    /* renamed from: e */
    public final C43879a mo46412e() {
        return this.f114176e;
    }
}
