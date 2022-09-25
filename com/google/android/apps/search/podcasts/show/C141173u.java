package com.google.android.apps.search.podcasts.show;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.search.podcasts.show.p10616c.C141141b;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141252c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.u */
/* compiled from: PG */
public final class C141173u implements C46792di.C46793a {

    /* renamed from: a */
    final /* synthetic */ C141175w f383261a;

    public C141173u(C141175w wVar) {
        this.f383261a = wVar;
    }

    /* renamed from: g */
    private final SwipeRefreshLayout m229180g() {
        View view = this.f383261a.f383272i.getView();
        if (view != null) {
            return (SwipeRefreshLayout) view.findViewById(R.id.podcasts_swipe_refresh);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C141175w.f383264a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(41652));
        cVar.mo56386p("Error loading show data");
        this.f383261a.mo116209b(C141252c.ERROR);
        SwipeRefreshLayout g = m229180g();
        if (g != null) {
            g.mo8794l(false, false);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        C141141b bVar = (C141141b) obj;
        C69664n.m101061g(bVar, "data");
        this.f383261a.mo116208a(bVar);
        SwipeRefreshLayout g = m229180g();
        if (g != null) {
            g.mo8794l(false, false);
        }
    }

    /* renamed from: c */
    public final void mo18079c() {
        C59052c cVar = (C59052c) C141175w.f383264a.mo56224b();
        cVar.mo56379ah(new C59094n(41653));
        cVar.mo56386p("First show page load");
        SwipeRefreshLayout g = m229180g();
        if (g != null) {
            g.mo8794l(true, false);
        }
    }

    /* renamed from: d */
    public final void mo50733d() {
        C59052c cVar = (C59052c) C141175w.f383264a.mo56224b();
        cVar.mo56379ah(new C59094n(41650));
        cVar.mo56386p("Loading show in background");
    }

    /* renamed from: e */
    public final void mo50734e(Throwable th) {
        SwipeRefreshLayout g = m229180g();
        if (g != null) {
            g.mo8794l(false, false);
        }
        C59052c cVar = (C59052c) C141175w.f383264a.mo56224b();
        cVar.mo56379ah(new C59094n(41651));
        cVar.mo56386p("Failed to load show in background");
    }

    /* renamed from: f */
    public final void mo50735f() {
        SwipeRefreshLayout g = m229180g();
        if (g != null) {
            g.mo8794l(false, false);
        }
    }
}
