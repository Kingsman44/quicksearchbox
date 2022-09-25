package com.google.android.apps.search.podcasts.explore;

import android.support.p031v4.app.Fragment;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.search.podcasts.explore.p10564a.C140248a;
import com.google.android.apps.search.podcasts.explore.p10564a.C140261n;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10565f.C140300au;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141252c;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141218i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.material.tabs.C44918u;
import com.google.android.material.tabs.TabLayout;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.contrib.androidx.p3699d.C47626h;
import com.google.apps.tiktok.tracing.contrib.androidx.p3699d.C47627i;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47707g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60866ct;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.explore.f */
/* compiled from: PG */
public final class C140266f {

    /* renamed from: a */
    public static final C59071e f381056a = C59071e.m91331h();

    /* renamed from: b */
    public final ExploreFragment f381057b;

    /* renamed from: c */
    public final C46801dp f381058c;

    /* renamed from: d */
    public final C140261n f381059d;

    /* renamed from: e */
    public final C46485f f381060e;

    /* renamed from: f */
    public final C47627i f381061f;

    /* renamed from: g */
    public final C47707g f381062g;

    /* renamed from: h */
    public final AccountId f381063h;

    /* renamed from: i */
    public final C141218i f381064i;

    /* renamed from: j */
    public ViewPager2 f381065j;

    /* renamed from: k */
    public C44918u f381066k;

    /* renamed from: l */
    private final C46778cv f381067l;

    /* renamed from: com.google.android.apps.search.podcasts.explore.f$a */
    /* compiled from: PG */
    final class C140267a implements C46792di.C46793a {

        /* renamed from: a */
        public final AccountId f381068a;

        /* renamed from: b */
        final /* synthetic */ C140266f f381069b;

        /* renamed from: c */
        private final Fragment f381070c;

        public C140267a(C140266f fVar, AccountId accountId, Fragment fragment) {
            C69664n.m101061g(accountId, "accountId");
            this.f381069b = fVar;
            this.f381068a = accountId;
            this.f381070c = fragment;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, C42181t.f110467a);
            C59052c cVar = (C59052c) ((C59052c) C140266f.f381056a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41587));
            cVar.mo56386p("Error loading discover tabs");
            this.f381069b.mo115536c(C141252c.ERROR);
            SwipeRefreshLayout a = this.f381069b.mo115534a();
            if (a != null) {
                a.mo8794l(false, false);
            }
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C141252c cVar;
            C140248a aVar = (C140248a) obj;
            C69664n.m101061g(aVar, "discoverTabs");
            View view = this.f381070c.getView();
            if (view != null) {
                C140266f fVar = this.f381069b;
                View findViewById = view.findViewById(R.id.podcasts_tab_layout);
                C69664n.m101060f(findViewById, "findViewById(R.id.podcasts_tab_layout)");
                TabLayout tabLayout = (TabLayout) findViewById;
                View findViewById2 = view.findViewById(R.id.podcasts_view_pager);
                C69664n.m101060f(findViewById2, "findViewById(R.id.podcasts_view_pager)");
                ViewPager2 viewPager2 = (ViewPager2) findViewById2;
                tabLayout.setVisibility(aVar.f381017a.size() <= 1 ? 8 : 0);
                C44918u uVar = fVar.f381066k;
                if (uVar != null) {
                    uVar.mo48454b();
                }
                C140265e eVar = new C140265e(aVar, this, this.f381070c);
                eVar.f13865d.mo9199a(new C47626h(fVar.f381061f, "Explore tabs pager"));
                viewPager2.mo9210b(eVar);
                C44918u uVar2 = new C44918u(tabLayout, viewPager2, new C140264d(aVar));
                uVar2.mo48453a();
                fVar.f381066k = uVar2;
                if (aVar.f381017a.isEmpty()) {
                    cVar = C141252c.ERROR;
                } else {
                    cVar = C141252c.NONE;
                }
                fVar.mo115536c(cVar);
                SwipeRefreshLayout a = fVar.mo115534a();
                if (a != null) {
                    a.mo8794l(false, false);
                }
            }
        }

        /* renamed from: c */
        public final void mo18079c() {
            SwipeRefreshLayout a = this.f381069b.mo115534a();
            if (a != null) {
                a.mo8794l(true, false);
            }
        }

        /* renamed from: d */
        public final void mo50733d() {
            C59052c cVar = (C59052c) C140266f.f381056a.mo56224b();
            cVar.mo56379ah(new C59094n(41586));
            cVar.mo56386p("Reloading tabs in background");
        }

        /* renamed from: e */
        public final void mo50734e(Throwable th) {
            SwipeRefreshLayout a = this.f381069b.mo115534a();
            if (a != null) {
                if (a.f13509b) {
                    C47393f.m84237h(new C140300au(), a);
                }
                a.mo8794l(false, false);
            }
        }

        /* renamed from: f */
        public final void mo50735f() {
            SwipeRefreshLayout a = this.f381069b.mo115534a();
            if (a != null) {
                a.mo8794l(false, false);
            }
        }
    }

    public C140266f(ExploreFragment exploreFragment, C46801dp dpVar, C140261n nVar, C46778cv cvVar, C46485f fVar, C47627i iVar, C47707g gVar, AccountId accountId, C141218i iVar2) {
        C69664n.m101061g(dpVar, "subscriptionsMixin");
        C69664n.m101061g(nVar, "exploreFeedService");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(fVar, "accountNavigation");
        C69664n.m101061g(accountId, "accountId");
        this.f381057b = exploreFragment;
        this.f381058c = dpVar;
        this.f381059d = nVar;
        this.f381067l = cvVar;
        this.f381060e = fVar;
        this.f381061f = iVar;
        this.f381062g = gVar;
        this.f381063h = accountId;
        this.f381064i = iVar2;
    }

    /* renamed from: a */
    public final SwipeRefreshLayout mo115534a() {
        View view = this.f381057b.getView();
        if (view != null) {
            return (SwipeRefreshLayout) view.findViewById(R.id.podcasts_swipe_refresh);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo115535b() {
        this.f381067l.mo50788b(C60866ct.f164955a, C140192a.f380885a);
    }

    /* renamed from: c */
    public final void mo115536c(C141252c cVar) {
        FullScreenMessageView fullScreenMessageView;
        C69664n.m101061g(cVar, "state");
        View view = this.f381057b.getView();
        if (view != null && (fullScreenMessageView = (FullScreenMessageView) view.findViewById(R.id.podcasts_explore_message_layer)) != null) {
            fullScreenMessageView.mo17754z().mo116270a(cVar);
        }
    }
}
