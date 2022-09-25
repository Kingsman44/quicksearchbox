package com.google.android.libraries.web.p3408h.p3414b;

import com.google.android.apps.gsa.binaries.satin.app.bag;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.lifecycle.C43889d;
import com.google.android.libraries.web.lifecycle.internal.C43896d;
import com.google.android.libraries.web.p3408h.C43774a;
import com.google.android.libraries.web.p3408h.C43786b;
import com.google.android.libraries.web.p3408h.p3415c.C43806b;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.shared.p3444d.C44089a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71521by;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71571du;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.h.b.i */
/* compiled from: PG */
public final class C43795i implements C43774a {

    /* renamed from: a */
    public final C43806b f114190a;

    /* renamed from: b */
    public final C43269t f114191b;

    /* renamed from: c */
    public final C44089a f114192c;

    /* renamed from: d */
    public final C69585o f114193d;

    /* renamed from: e */
    public final C71548cy f114194e;

    /* renamed from: f */
    public final C43896d f114195f = new C43896d();

    /* renamed from: g */
    public final Map f114196g = new LinkedHashMap();

    /* renamed from: h */
    public boolean f114197h;

    /* renamed from: i */
    public final bag f114198i;

    /* renamed from: j */
    private final C71571du f114199j;

    /* renamed from: k */
    private final C69613f f114200k = new C69747m(new C43794h(this));

    public C43795i(C43904a aVar, C43806b bVar, bag bag, C43269t tVar, C44089a aVar2, C69585o oVar) {
        C69664n.m101061g(aVar, "window");
        C69664n.m101061g(bVar, "initialNavigation");
        C69664n.m101061g(bag, "documentFactory");
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        C69664n.m101061g(oVar, "mainImmediateContext");
        this.f114190a = bVar;
        this.f114198i = bag;
        this.f114191b = tVar;
        this.f114192c = aVar2;
        this.f114193d = oVar;
        C69664n.m101059e(bVar, "null cannot be cast to non-null type com.google.android.libraries.web.page.internal.WebNavigationImpl");
        C71548cy b = C71574dx.m104480b(bVar);
        this.f114194e = b;
        this.f114199j = C71521by.m104365c(b);
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C71422aw mo46791a() {
        return (C71422aw) this.f114200k.mo5768a();
    }

    /* renamed from: b */
    public final C43788b mo46814b() {
        Object e = this.f114199j.mo62784e();
        if (e instanceof C43788b) {
            return (C43788b) e;
        }
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C43889d mo46410c() {
        throw null;
    }

    /* renamed from: d */
    public final C43790d mo46815d() {
        Object e = this.f114199j.mo62784e();
        if (e instanceof C43790d) {
            return (C43790d) e;
        }
        return null;
    }

    /* renamed from: e */
    public final void mo46816e(C69626l lVar) {
        C19559g.m37304c();
        this.f114195f.mo46904j();
        lVar.mo5761a(this.f114194e.mo62784e());
        for (Map.Entry value : this.f114196g.entrySet()) {
            ((C43786b) value.getValue()).mo46799a();
        }
        this.f114196g.clear();
        this.f114195f.mo46902h();
    }
}
