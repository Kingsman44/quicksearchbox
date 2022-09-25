package com.google.android.libraries.web.p3420k;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.browser.internal.C43308t;
import com.google.android.libraries.web.browser.internal.C43309u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.p3420k.p3422b.C43856a;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.android.libraries.web.shared.p3444d.C44089a;
import com.google.android.libraries.web.shared.p3444d.C44095g;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.k.p */
/* compiled from: PG */
public final class C43870p {

    /* renamed from: a */
    public final C43861g f114319a;

    /* renamed from: b */
    public final C47215a f114320b;

    /* renamed from: c */
    public final String f114321c;

    /* renamed from: d */
    public final C28310af f114322d;

    /* renamed from: e */
    public final C43269t f114323e;

    /* renamed from: f */
    public final C43377v f114324f;

    /* renamed from: g */
    public final WebModelProvider f114325g;

    /* renamed from: h */
    public final C43856a f114326h;

    /* renamed from: i */
    public final C43863i f114327i = new C43863i(this);

    /* renamed from: j */
    public boolean f114328j;

    /* renamed from: k */
    public C69615a f114329k;

    /* renamed from: l */
    public Fragment f114330l;

    public C43870p(C43861g gVar, C47215a aVar, String str, C28310af afVar, C43269t tVar, C43377v vVar, WebModelProvider webModelProvider, C44095g gVar2, C44089a aVar2) {
        C69664n.m101061g(aVar, "fragmentHost");
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        this.f114319a = gVar;
        this.f114320b = aVar;
        this.f114321c = str;
        this.f114322d = afVar;
        this.f114323e = tVar;
        this.f114324f = vVar;
        this.f114325g = webModelProvider;
        Object a = gVar2.mo47064a(C43856a.class);
        C69664n.m101060f(a, "delegateProvider.get(Web…PeerDelegate::class.java)");
        this.f114326h = (C43856a) a;
        for (C43773b b : aVar2.mo47063c(tVar.mo46387e(C43773b.class))) {
            this.f114319a.f114305a.mo5790b(b);
        }
    }

    /* renamed from: a */
    public final C43308t mo46873a(C44082a aVar) {
        C69664n.m101061g(aVar, "restricted");
        return C43309u.m76408a(this.f114326h.mo46855b());
    }

    /* renamed from: b */
    public final void mo46874b(Fragment fragment) {
        C0154a aVar = new C0154a(this.f114319a.getChildFragmentManager());
        aVar.mo689v(R.id.webx_error_container, fragment, "webx-error-fragment");
        aVar.mo509f();
    }

    /* renamed from: c */
    public final void mo46875c(Fragment fragment) {
        C69664n.m101061g(fragment, "topFragment");
        this.f114326h.mo46863j(fragment);
    }

    /* renamed from: d */
    public final boolean mo46876d() {
        return this.f114326h.mo46865l();
    }
}
