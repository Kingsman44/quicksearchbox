package com.google.android.apps.search.podcasts.library.history;

import android.support.p033v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import androidx.core.content.C1877c;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.podcasts.library.history.p10582a.C140584a;
import com.google.android.apps.search.podcasts.library.history.p10582a.C140589f;
import com.google.android.apps.search.podcasts.library.p10579a.C140559a;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141252c;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141213d;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141215f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.play.unison.binding.C31974aw;
import com.google.android.material.appbar.AppBarLayout;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47579cc;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47707g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.history.b */
/* compiled from: PG */
public final class C140590b {

    /* renamed from: a */
    public static final C59071e f381820a = C59071e.m91331h();

    /* renamed from: b */
    public final HistoryFragment f381821b;

    /* renamed from: c */
    public final C46801dp f381822c;

    /* renamed from: d */
    public final C47707g f381823d;

    /* renamed from: e */
    public final C140559a f381824e;

    /* renamed from: f */
    public final C28306ab f381825f;

    /* renamed from: g */
    public final C140589f f381826g;

    /* renamed from: h */
    public final C46778cv f381827h;

    /* renamed from: i */
    public C140584a f381828i;

    /* renamed from: j */
    public C31974aw f381829j;

    /* renamed from: k */
    private final C141213d f381830k;

    /* renamed from: l */
    private final C47770dh f381831l;

    /* renamed from: com.google.android.apps.search.podcasts.library.history.b$a */
    /* compiled from: PG */
    final class C140591a implements C46792di.C46793a {
        public C140591a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C59052c cVar = (C59052c) ((C59052c) C140590b.f381820a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41606));
            cVar.mo56386p("Error loading history");
            SwipeRefreshLayout a = C140590b.this.mo115765a();
            if (a != null) {
                a.mo8794l(false, false);
            }
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C140584a aVar = (C140584a) obj;
            C69664n.m101061g(aVar, "data");
            C140590b.this.mo115766b(aVar);
            SwipeRefreshLayout a = C140590b.this.mo115765a();
            if (a != null) {
                a.mo8794l(false, false);
            }
        }

        /* renamed from: c */
        public final void mo18079c() {
            SwipeRefreshLayout a = C140590b.this.mo115765a();
            if (a != null) {
                a.mo8794l(true, false);
            }
        }

        /* renamed from: d */
        public final void mo50733d() {
            C59052c cVar = (C59052c) C140590b.f381820a.mo56224b();
            cVar.mo56379ah(new C59094n(41604));
            cVar.mo56386p("Refreshing history in background");
        }

        /* renamed from: e */
        public final void mo50734e(Throwable th) {
            SwipeRefreshLayout a = C140590b.this.mo115765a();
            if (a != null) {
                a.mo8794l(false, false);
            }
            C59052c cVar = (C59052c) C140590b.f381820a.mo56224b();
            cVar.mo56379ah(new C59094n(41605));
            cVar.mo56386p("Failed to refresh history in background");
        }

        /* renamed from: f */
        public final void mo50735f() {
            SwipeRefreshLayout a = C140590b.this.mo115765a();
            if (a != null) {
                a.mo8794l(false, false);
            }
        }
    }

    public C140590b(HistoryFragment historyFragment, C46801dp dpVar, C47707g gVar, C140559a aVar, C28306ab abVar, C140589f fVar, C46778cv cvVar, C141213d dVar, C47770dh dhVar) {
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(dhVar, "traceCreation");
        this.f381821b = historyFragment;
        this.f381822c = dpVar;
        this.f381823d = gVar;
        this.f381824e = aVar;
        this.f381825f = abVar;
        this.f381826g = fVar;
        this.f381827h = cvVar;
        this.f381830k = dVar;
        this.f381831l = dhVar;
    }

    /* renamed from: a */
    public final SwipeRefreshLayout mo115765a() {
        View view = this.f381821b.getView();
        if (view != null) {
            return (SwipeRefreshLayout) view.findViewById(R.id.podcasts_swipe_refresh);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo115766b(C140584a aVar) {
        C141252c cVar;
        FullScreenMessageView fullScreenMessageView;
        if (aVar != null) {
            C140584a aVar2 = this.f381828i;
            if (aVar2 == null || aVar.f381809b != aVar2.f381809b) {
                View requireView = this.f381821b.requireView();
                C69664n.m101060f(requireView, "historyFragment.requireView()");
                mo115767c(requireView, aVar.f381809b);
            }
            C31974aw awVar = this.f381829j;
            if (awVar != null) {
                awVar.mo37740a(aVar.f381808a);
            }
            if (aVar.f381808a.f382708a.isEmpty()) {
                cVar = C141252c.EMPTY;
            } else {
                cVar = C141252c.NONE;
            }
            View view = this.f381821b.getView();
            if (!(view == null || (fullScreenMessageView = (FullScreenMessageView) view.findViewById(R.id.podcasts_message_layer)) == null)) {
                fullScreenMessageView.mo17754z().mo116270a(cVar);
            }
        }
        this.f381828i = aVar;
    }

    /* renamed from: c */
    public final void mo115767c(View view, boolean z) {
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.podcasts_appbar_layout);
        appBarLayout.f115671f = R.id.podcasts_history_list;
        appBarLayout.mo47403m();
        C69664n.m101060f(appBarLayout, BuildConfig.FLAVOR);
        C141215f.m229224b(appBarLayout);
        Toolbar toolbar = (Toolbar) appBarLayout.findViewById(R.id.podcasts_appbar_header_toolbar);
        toolbar.mo2393g().clear();
        toolbar.mo2393g().add(0, R.id.podcasts_toggle_show_completed_episodes_menu_item, 0, z ? R.string.podcasts_hide_completed_episodes : R.string.podcasts_show_completed_episodes);
        MenuItem findItem = toolbar.mo2393g().findItem(R.id.podcasts_toggle_show_completed_episodes_menu_item);
        findItem.setIcon(C1877c.m5125a(toolbar.getContext(), R.drawable.quantum_ic_history_vd_theme_24));
        findItem.setOnMenuItemClickListener(new C47579cc(this.f381831l, "App bar more actions menu item to show/hide completed episodes", new C140593d(this, z)));
        C141213d dVar = this.f381830k;
        C69664n.m101060f(toolbar, "this");
        dVar.mo116228c(toolbar);
        toolbar.mo2423x(this.f381821b.getString(R.string.podcasts_history));
    }
}
