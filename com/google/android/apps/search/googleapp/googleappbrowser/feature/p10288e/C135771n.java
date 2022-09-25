package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.e.n */
/* compiled from: PG */
public final class C135771n implements C46792di.C46793a {

    /* renamed from: a */
    final /* synthetic */ C135772o f369816a;

    public C135771n(C135772o oVar) {
        this.f369816a = oVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C135772o.f369817a.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(40615));
        cVar.mo56384n();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        View c;
        Optional optional = (Optional) obj;
        C69664n.m101061g(optional, "data");
        C135772o oVar = this.f369816a;
        oVar.f369823g = (C135776s) optional.orElse(null);
        if (oVar.f369823g == null && (c = oVar.mo112534c()) != null) {
            c.setVisibility(0);
        }
        oVar.f369824h = false;
        oVar.f369820d.mo33922f();
        if (oVar.f369825i) {
            oVar.mo112535d();
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }

    /* renamed from: d */
    public final void mo50733d() {
        C59052c cVar = (C59052c) C135772o.f369817a.mo56224b();
        cVar.mo56379ah(new C59094n(40613));
        cVar.mo56386p("onBackgroundFetch");
    }

    /* renamed from: e */
    public final void mo50734e(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C135772o oVar = this.f369816a;
        C59052c cVar = (C59052c) C135772o.f369817a.mo56226d();
        cVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.GOOGLE_APP_BROWSER_GOOGLE_ON_CONTENT_REQUEST_FAILED_VALUE));
        C59052c cVar2 = (C59052c) cVar.mo56382g(th);
        cVar2.mo56379ah(new C59094n(40616));
        cVar2.mo56386p("onContentFetchError");
        oVar.f369823g = null;
        oVar.f369824h = true;
        View c = oVar.mo112534c();
        if (c != null) {
            c.setVisibility(8);
        }
        oVar.mo112553v();
    }

    /* renamed from: f */
    public final void mo50735f() {
        C59052c cVar = (C59052c) C135772o.f369817a.mo56224b();
        cVar.mo56379ah(new C59094n(40614));
        cVar.mo56386p("onBackgroundFetchSucceeded");
    }
}
