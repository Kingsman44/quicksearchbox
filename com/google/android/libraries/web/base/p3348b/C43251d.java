package com.google.android.libraries.web.base.p3348b;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2383n;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.browser.internal.C43296h;
import com.google.android.libraries.web.browser.internal.C43308t;
import com.google.android.libraries.web.browser.internal.C43309u;
import com.google.android.libraries.web.coordinator.internal.fragment.C43756o;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3420k.C43862h;
import com.google.android.libraries.web.p3420k.C43863i;
import com.google.android.libraries.web.p3428m.C43942s;
import com.google.android.libraries.web.p3428m.p3429a.C43914c;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.function.Predicate;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.base.b.d */
/* compiled from: PG */
public final class C43251d implements C43262m {

    /* renamed from: a */
    public final Fragment f113024a;

    /* renamed from: b */
    public final C71422aw f113025b;

    /* renamed from: c */
    public final C69585o f113026c;

    public C43251d(C43269t tVar, Fragment fragment, C71422aw awVar, C69585o oVar) {
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar, "mainImmediateContext");
        this.f113024a = fragment;
        this.f113025b = awVar;
        this.f113026c = oVar;
    }

    /* renamed from: a */
    public final Fragment mo46332a() {
        return C43756o.m77265a(this.f113024a).f114092a;
    }

    /* renamed from: b */
    public final void mo46333b(C43257h hVar) {
        C69664n.m101061g(hVar, "loadUrlParams");
        C19559g.m37304c();
        C43756o.m77265a(this.f113024a).mo46775b(new C43235a(this, hVar));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo46334c(String str) {
        C69664n.m101061g(str, "url");
        C43257h k = C43257h.m76306m(str).mo46365k();
        C69664n.m101060f(k, "create(url)");
        mo46333b(k);
    }

    /* renamed from: d */
    public final void mo46335d(C60870cx cxVar, C43323b bVar) {
        C69664n.m101061g(cxVar, "loadUrlParamsFuture");
        C69664n.m101061g(bVar, "clientData");
        C19559g.m37304c();
        C43756o.m77265a(this.f113024a).mo46775b(new C43241b(this, cxVar, bVar));
    }

    /* renamed from: e */
    public final void mo46336e() {
        C19559g.m37304c();
        C43863i iVar = C43756o.m77265a(this.f113024a).f114099h;
        if (iVar != null && !iVar.mo46872a()) {
            C43308t a = C43309u.m76408a(iVar.f114310a.f114326h.mo46855b());
            a.mo46403b();
            if (a.f113155e.mo46945l()) {
                C43914c i = a.f113155e.mo46769c();
                C69664n.m101058d(i);
                new C43942s(i).mo46948a();
            }
        }
    }

    /* renamed from: f */
    public final boolean mo46337f() {
        C19559g.m37304c();
        C43863i iVar = C43756o.m77265a(this.f113024a).f114099h;
        if (iVar == null || iVar.mo46872a()) {
            return false;
        }
        return C43309u.m76408a(iVar.f114310a.f114326h.mo46855b()).mo46407f(C43296h.f113112a);
    }

    /* renamed from: g */
    public final boolean mo46338g(Predicate predicate) {
        C69664n.m101061g(predicate, "urlPredicate");
        C19559g.m37304c();
        C43863i iVar = C43756o.m77265a(this.f113024a).f114099h;
        if (iVar == null) {
            return false;
        }
        C69664n.m101061g(predicate, "urlPredicate");
        if (iVar.mo46872a()) {
            return false;
        }
        return C43309u.m76408a(iVar.f114310a.f114326h.mo46855b()).mo46407f(new C43862h(predicate));
    }

    /* renamed from: h */
    public final boolean mo46339h() {
        C19559g.m37304c();
        if (this.f113024a.getLifecycle().mo5789a() == C2383n.INITIALIZED) {
            return C43756o.m77265a(this.f113024a).f114096e;
        }
        throw new IllegalStateException("WebController#hasFailedAsyncInitialUrlLoad can only be called at Fragment#onCreate.");
    }
}
