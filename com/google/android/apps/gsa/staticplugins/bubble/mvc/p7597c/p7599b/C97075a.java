package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.p7599b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.bubble.C96873a;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.C97065a;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.C97077d;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97093h;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.p7602b.C97087a;
import com.google.android.apps.gsa.staticplugins.bubble.p7588g.p7589a.C97018a;
import com.google.android.apps.gsa.staticplugins.bubble.p7588g.p7589a.C97019b;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97040c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60826bg;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.c.b.a */
/* compiled from: PG */
public final class C97075a implements C97065a, C97087a {

    /* renamed from: a */
    private final C97019b f271251a;

    /* renamed from: b */
    private final C97093h f271252b;

    /* renamed from: c */
    private final C97077d f271253c;

    /* renamed from: d */
    private final C97040c f271254d;

    /* renamed from: e */
    private boolean f271255e = true;

    /* renamed from: f */
    private final C96873a f271256f;

    public C97075a(C97019b bVar, C97093h hVar, C97077d dVar, C97040c cVar, C96873a aVar) {
        this.f271251a = bVar;
        this.f271252b = hVar;
        this.f271253c = dVar;
        this.f271254d = cVar;
        this.f271256f = aVar;
    }

    /* renamed from: j */
    private final void m160682j() {
        if (this.f271255e) {
            C97077d dVar = this.f271253c;
            dVar.f271263a.mo65089a(dVar.f271265c.mo78222e("and.gsa.widget.mic"));
            return;
        }
        C97077d dVar2 = this.f271253c;
        C91097g gVar = dVar2.f271263a;
        C84515a aVar = dVar2.f271265c;
        gVar.mo65089a(aVar.mo78220c("and.gsa.widget.text", aVar.mo78224g()));
    }

    /* renamed from: a */
    public final void mo90428a() {
        m160682j();
    }

    /* renamed from: b */
    public final void mo90429b() {
        this.f271252b.mo90458a(2);
    }

    /* renamed from: c */
    public final void mo90430c() {
    }

    /* renamed from: d */
    public final void mo90431d() {
        m160682j();
    }

    /* renamed from: e */
    public final void mo90432e(Runnable runnable) {
    }

    /* renamed from: f */
    public final boolean mo90433f() {
        C46459k.m82829b(C118826c.m197213c(this.f271251a.f271139a.mo46039a(new C97018a(), C60826bg.f164896a)), "Selection update failed", new Object[0]);
        C96873a aVar = this.f271256f;
        aVar.f270852a.mo90386a(this.f271254d, this.f271252b.f271292d);
        return true;
    }

    /* renamed from: g */
    public final void mo90434g() {
        C96873a aVar = this.f271256f;
        aVar.f270852a.mo90386a(this.f271254d, this.f271252b.f271292d);
    }

    /* renamed from: h */
    public final void mo90438h() {
        this.f271255e = false;
    }

    /* renamed from: i */
    public final void mo90439i() {
        this.f271255e = true;
    }
}
