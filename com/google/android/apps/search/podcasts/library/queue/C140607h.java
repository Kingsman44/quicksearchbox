package com.google.android.apps.search.podcasts.library.queue;

import android.support.p033v7.widget.Toolbar;
import android.support.p033v7.widget.p041a.C0502l;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.core.content.C1877c;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.podcasts.library.p10579a.C140559a;
import com.google.android.apps.search.podcasts.library.queue.p10583a.C140597b;
import com.google.android.apps.search.podcasts.library.queue.p10583a.C140600e;
import com.google.android.apps.search.podcasts.p10550b.p10556f.C140097al;
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
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.queue.h */
/* compiled from: PG */
public final class C140607h {

    /* renamed from: a */
    public static final C59071e f381865a = C59071e.m91331h();

    /* renamed from: b */
    public final QueueFragment f381866b;

    /* renamed from: c */
    public final C46801dp f381867c;

    /* renamed from: d */
    public final C140600e f381868d;

    /* renamed from: e */
    public final C140559a f381869e;

    /* renamed from: f */
    public final QueueFragment f381870f;

    /* renamed from: g */
    public final C47707g f381871g;

    /* renamed from: h */
    public final C47770dh f381872h;

    /* renamed from: i */
    public final C46778cv f381873i;

    /* renamed from: j */
    public final C28306ab f381874j;

    /* renamed from: k */
    public final C140097al f381875k;

    /* renamed from: l */
    public C140597b f381876l;

    /* renamed from: m */
    public C31974aw f381877m;

    /* renamed from: n */
    public C0502l f381878n;

    /* renamed from: o */
    private final C141213d f381879o;

    /* renamed from: com.google.android.apps.search.podcasts.library.queue.h$a */
    /* compiled from: PG */
    final class C140608a implements C46792di.C46793a {
        public C140608a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C59052c cVar = (C59052c) ((C59052c) C140607h.f381865a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41609));
            cVar.mo56386p("Error loading queue");
            SwipeRefreshLayout a = C140607h.this.mo115780a();
            if (a != null) {
                a.mo8794l(false, false);
            }
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C140597b bVar = (C140597b) obj;
            C69664n.m101061g(bVar, "data");
            C140607h.this.mo115781b(bVar);
            SwipeRefreshLayout a = C140607h.this.mo115780a();
            if (a != null) {
                a.mo8794l(false, false);
            }
        }

        /* renamed from: c */
        public final void mo18079c() {
            SwipeRefreshLayout a = C140607h.this.mo115780a();
            if (a != null) {
                a.mo8794l(true, false);
            }
        }

        /* renamed from: d */
        public final void mo50733d() {
            C59052c cVar = (C59052c) C140607h.f381865a.mo56224b();
            cVar.mo56379ah(new C59094n(41607));
            cVar.mo56386p("Refreshing queue in background");
        }

        /* renamed from: e */
        public final void mo50734e(Throwable th) {
            SwipeRefreshLayout a = C140607h.this.mo115780a();
            if (a != null) {
                a.mo8794l(false, false);
            }
            C59052c cVar = (C59052c) C140607h.f381865a.mo56224b();
            cVar.mo56379ah(new C59094n(41608));
            cVar.mo56386p("Failed to refresh queue in background");
        }

        /* renamed from: f */
        public final void mo50735f() {
            SwipeRefreshLayout a = C140607h.this.mo115780a();
            if (a != null) {
                a.mo8794l(false, false);
            }
        }
    }

    public C140607h(QueueFragment queueFragment, C46801dp dpVar, C140600e eVar, C140559a aVar, QueueFragment queueFragment2, C47707g gVar, C47770dh dhVar, C46778cv cvVar, C28306ab abVar, C141213d dVar, C140097al alVar) {
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(alVar, "queueManager");
        this.f381866b = queueFragment;
        this.f381867c = dpVar;
        this.f381868d = eVar;
        this.f381869e = aVar;
        this.f381870f = queueFragment2;
        this.f381871g = gVar;
        this.f381872h = dhVar;
        this.f381873i = cvVar;
        this.f381874j = abVar;
        this.f381879o = dVar;
        this.f381875k = alVar;
    }

    /* renamed from: a */
    public final SwipeRefreshLayout mo115780a() {
        View view = this.f381866b.getView();
        if (view != null) {
            return (SwipeRefreshLayout) view.findViewById(R.id.podcasts_swipe_refresh);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo115781b(C140597b bVar) {
        C141252c cVar;
        FullScreenMessageView fullScreenMessageView;
        if (bVar != null) {
            C31974aw awVar = this.f381877m;
            if (awVar != null) {
                awVar.mo37740a(bVar.f381850a);
            }
            if (bVar.f381850a.f382708a.isEmpty()) {
                cVar = C141252c.EMPTY;
            } else {
                cVar = C141252c.NONE;
            }
            View view = this.f381866b.getView();
            if (!(view == null || (fullScreenMessageView = (FullScreenMessageView) view.findViewById(R.id.podcasts_message_layer)) == null)) {
                fullScreenMessageView.mo17754z().mo116270a(cVar);
            }
        }
        this.f381876l = bVar;
        View view2 = this.f381866b.getView();
        if (view2 != null) {
            mo115782c(view2);
        }
    }

    /* renamed from: c */
    public final void mo115782c(View view) {
        List list;
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.podcasts_appbar_layout);
        appBarLayout.f115671f = R.id.podcasts_queue_list;
        appBarLayout.mo47403m();
        C69664n.m101060f(appBarLayout, BuildConfig.FLAVOR);
        C141215f.m229224b(appBarLayout);
        Toolbar toolbar = (Toolbar) appBarLayout.findViewById(R.id.podcasts_appbar_header_toolbar);
        toolbar.mo2393g().clear();
        C140597b bVar = this.f381876l;
        if (!(bVar == null || (list = bVar.f381850a.f382708a) == null || list.isEmpty())) {
            C69664n.m101060f(toolbar, "this");
            Menu g = toolbar.mo2393g();
            g.add(0, R.id.podcasts_clear_queue_menu_item, 0, R.string.podcasts_clear_your_queue);
            MenuItem findItem = g.findItem(R.id.podcasts_clear_queue_menu_item);
            findItem.setIcon(C1877c.m5125a(toolbar.getContext(), R.drawable.podcasts_ic_remove_from_queue));
            findItem.setOnMenuItemClickListener(new C47579cc(this.f381872h, "Open dialog to clear queue.", new C140610j(this)));
        }
        C141213d dVar = this.f381879o;
        C69664n.m101060f(toolbar, "this");
        dVar.mo116228c(toolbar);
        toolbar.mo2423x(this.f381866b.getString(R.string.podcasts_queue));
    }
}
