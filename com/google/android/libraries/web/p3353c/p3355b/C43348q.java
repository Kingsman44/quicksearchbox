package com.google.android.libraries.web.p3353c.p3355b;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.web.base.C43234b;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.p3418j.C43844i;
import com.google.android.libraries.web.p3418j.C43850o;
import com.google.android.libraries.web.p3418j.p3419a.C43836y;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.apps.tiktok.dataservice.C46689ag;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.c.b.q */
/* compiled from: PG */
public final class C43348q implements C43377v {

    /* renamed from: a */
    public final C43269t f113231a;

    /* renamed from: b */
    public final C21370a f113232b;

    /* renamed from: c */
    private final WebModelProvider f113233c;

    /* renamed from: d */
    private final C43850o f113234d;

    /* renamed from: e */
    private final C43234b f113235e;

    /* renamed from: f */
    private final C43836y f113236f;

    public C43348q(C43269t tVar, WebModelProvider webModelProvider, C43850o oVar, C43836y yVar, C21370a aVar, C43234b bVar) {
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        C69664n.m101061g(aVar, "clock");
        this.f113231a = tVar;
        this.f113233c = webModelProvider;
        this.f113234d = oVar;
        this.f113236f = yVar;
        this.f113232b = aVar;
        this.f113235e = bVar;
    }

    /* renamed from: c */
    private final C43339h m76498c() {
        return (C43339h) this.f113233c.mo47072a(C43339h.class);
    }

    /* renamed from: a */
    public final C43376u mo46468a() {
        WebModelProvider webModelProvider = this.f113233c;
        C43376u uVar = C43376u.f113326k;
        C69664n.m101060f(uVar, "getDefaultInstance()");
        return (C43376u) webModelProvider.mo47073b(C43339h.class, uVar, C43347p.f113230a);
    }

    /* renamed from: b */
    public final C46689ag mo46469b() {
        if (this.f113235e.f112985d) {
            return new C43346o(this, m76498c().mo46465d());
        }
        return this.f113234d.mo46848a(this.f113236f, m76498c().mo46465d(), C43844i.f114274a);
    }
}
