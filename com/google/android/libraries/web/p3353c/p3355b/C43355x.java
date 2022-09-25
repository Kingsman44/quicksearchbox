package com.google.android.libraries.web.p3353c.p3355b;

import com.google.android.libraries.web.base.C43234b;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43378w;
import com.google.android.libraries.web.p3353c.C43379x;
import com.google.android.libraries.web.p3418j.C43848m;
import com.google.android.libraries.web.p3418j.C43850o;
import com.google.android.libraries.web.p3418j.C43852q;
import com.google.android.libraries.web.p3418j.p3419a.C43836y;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.web.c.b.x */
/* compiled from: PG */
public final class C43355x implements C43379x {

    /* renamed from: a */
    private final WebModelProvider f113247a;

    /* renamed from: b */
    private final C43850o f113248b;

    /* renamed from: c */
    private final C46723bg f113249c;

    /* renamed from: d */
    private final C43234b f113250d;

    /* renamed from: e */
    private final C43836y f113251e;

    public C43355x(WebModelProvider webModelProvider, C43850o oVar, C43836y yVar, C46723bg bgVar, C43234b bVar) {
        this.f113247a = webModelProvider;
        this.f113248b = oVar;
        this.f113251e = yVar;
        this.f113249c = bgVar;
        this.f113250d = bVar;
    }

    /* renamed from: d */
    private final C43339h m76506d() {
        return (C43339h) this.f113247a.mo47072a(C43339h.class);
    }

    /* renamed from: a */
    public final C46689ag mo46470a(C60931s sVar) {
        C46690ah e = m76506d().mo46466e();
        if (this.f113250d.f112985d) {
            return new C46719bc(this.f113249c, new C43352u(this, sVar), e);
        }
        return this.f113248b.mo46848a(this.f113251e, e, new C43353v(sVar));
    }

    /* renamed from: b */
    public final C46689ag mo46471b(C43378w wVar, C43378w wVar2) {
        C46690ah e = m76506d().mo46466e();
        if (this.f113250d.f112985d) {
            return new C43354w(this, wVar, wVar2, e);
        }
        C43850o oVar = this.f113248b;
        C43836y yVar = this.f113251e;
        return new C43848m(new C43349r(wVar), yVar.mo46847a(C44082a.f114755a, (C43852q) oVar.f114285a.mo46768a()), new C43350s(wVar2), e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo46472c() {
        return ((C43376u) this.f113247a.mo47073b(C43339h.class, C43376u.f113326k, C43351t.f113239a)).f113329b;
    }
}
