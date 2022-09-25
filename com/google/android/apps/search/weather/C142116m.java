package com.google.android.apps.search.weather;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.C1924a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.search.weather.p10681a.p10682a.C142055h;
import com.google.android.apps.search.weather.p10686e.C142081d;
import com.google.android.apps.search.weather.p10686e.C142084g;
import com.google.android.apps.search.weather.p10686e.C142086i;
import com.google.android.apps.search.weather.p10692j.C142113e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.C21196h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.material.opensearchbar.OpenSearchBar;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.C44918u;
import com.google.android.material.tabs.TabLayout;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46685ac;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.tracing.contrib.androidx.p3699d.C47620b;
import com.google.apps.tiktok.tracing.contrib.androidx.p3699d.C47626h;
import com.google.apps.tiktok.tracing.contrib.androidx.p3699d.C47627i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4017at.p4060h.p4075e.p4076a.C54271g;
import com.google.p4017at.p4060h.p4075e.p4076a.C54272h;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import org.chromium.net.NetworkException;

/* renamed from: com.google.android.apps.search.weather.m */
/* compiled from: PG */
public final class C142116m implements C46792di, C46685ac {

    /* renamed from: d */
    private static final C59071e f385551d = C59071e.m91332i("com.google.android.apps.search.weather.m");

    /* renamed from: a */
    public final C142118o f385552a;

    /* renamed from: b */
    public final C28443m f385553b;

    /* renamed from: c */
    public int f385554c;

    /* renamed from: e */
    private final AccountId f385555e;

    /* renamed from: f */
    private final C47627i f385556f;

    /* renamed from: g */
    private final C142113e f385557g;

    /* renamed from: h */
    private final C28439i f385558h;

    /* renamed from: i */
    private final C142055h f385559i;

    public C142116m(C142118o oVar, AccountId accountId, int i, C47627i iVar, C142113e eVar, C28439i iVar2, C28443m mVar, C142055h hVar) {
        this.f385552a = oVar;
        this.f385555e = accountId;
        this.f385554c = i;
        this.f385556f = iVar;
        this.f385557g = eVar;
        this.f385558h = iVar2;
        this.f385553b = mVar;
        this.f385559i = hVar;
    }

    /* renamed from: g */
    private final void m230715g(ViewGroup viewGroup, int i, C57784p pVar, int i2) {
        C21196h hVar = (C21196h) viewGroup.findViewById(i);
        if (hVar == null) {
            hVar = this.f385557g.mo117016d(viewGroup.getContext(), this.f385558h);
            hVar.setId(i);
            hVar.setVisibility(i2);
            viewGroup.addView(hVar, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f385557g.mo18114b(hVar, pVar);
    }

    /* renamed from: h */
    private final void m230716h() {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f385552a.requireView().findViewById(R.id.weather_swipe_refresh);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.mo8794l(false, false);
        }
    }

    /* renamed from: i */
    private final void m230717i() {
        this.f385552a.requireView().findViewById(R.id.weather_data_progress_bar).setVisibility(8);
    }

    /* renamed from: j */
    private static int m230718j(Throwable th) {
        Throwable cause = th.getCause();
        return (!(cause instanceof NetworkException) || ((NetworkException) cause).getErrorCode() != 2) ? 1 : 2;
    }

    /* renamed from: k */
    private final void m230719k(int i) {
        C142118o oVar = this.f385552a;
        AccountId accountId = this.f385555e;
        C142081d dVar = (C142081d) C142084g.f385477c.createBuilder();
        dVar.copyOnWrite();
        C142084g gVar = (C142084g) dVar.instance;
        gVar.f385480b = i - 1;
        gVar.f385479a |= 1;
        C142086i iVar = new C142086i(oVar, accountId, (C142084g) dVar.build());
        iVar.f13865d.mo9199a(new C47626h(this.f385556f, "Empty Tab Pager"));
        ViewPager2 viewPager2 = (ViewPager2) this.f385552a.requireView().findViewById(R.id.weather_tabs_pager);
        viewPager2.mo9210b(iVar);
        TabLayout tabLayout = (TabLayout) this.f385552a.requireView().findViewById(R.id.weather_tab_layout);
        ((View) tabLayout.getParent()).setBackgroundColor(C1924a.m5186e(-6378590, -16777216, 0.2f));
        new C44918u(tabLayout, viewPager2, C142105j.f385525a).mo48453a();
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f385551d.mo56225c()).mo56382g(th)).mo56372aa(42025)).mo56386p("Failed to get WeatherAppResponse.");
        m230719k(m230718j(th));
        m230717i();
        m230716h();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        C54272h hVar = (C54272h) obj;
        View requireView = this.f385552a.requireView();
        if ((hVar.f142514a & 1) != 0) {
            C54271g gVar = hVar.f142516c;
            if (gVar == null) {
                gVar = C54271g.f142505e;
            }
            ViewGroup viewGroup = (ViewGroup) requireView.findViewById(R.id.open_search_view_content_container);
            C57784p pVar = gVar.f142508b;
            if (pVar == null) {
                pVar = C57784p.f154382f;
            }
            OpenSearchView openSearchView = (OpenSearchView) requireView.findViewById(R.id.weather_open_search_view);
            m230715g(viewGroup, R.id.weather_zero_suggestion_elements_view, pVar, (openSearchView == null || openSearchView.f77608j.getText().length() <= 0) ? 0 : 8);
            ViewGroup viewGroup2 = (ViewGroup) requireView.findViewById(R.id.weather_snackbar);
            C57784p pVar2 = gVar.f142509c;
            if (pVar2 == null) {
                pVar2 = C57784p.f154382f;
            }
            m230715g(viewGroup2, R.id.weather_snackbar_elements_view, pVar2, 0);
            if ((gVar.f142507a & 4) != 0) {
                ViewGroup viewGroup3 = (ViewGroup) requireView.findViewById(R.id.weather_dialog);
                C57784p pVar3 = gVar.f142510d;
                if (pVar3 == null) {
                    pVar3 = C57784p.f154382f;
                }
                m230715g(viewGroup3, R.id.weather_dialog_elements_view, pVar3, 0);
            }
        }
        m230717i();
        m230716h();
        if (hVar.f142515b.size() == 0) {
            m230719k(3);
            return;
        }
        ((OpenSearchBar) this.f385552a.requireView().findViewById(R.id.weather_open_search_bar)).f77584B.setText(hVar.f142518e);
        C142055h hVar2 = this.f385559i;
        boolean z = hVar.f142517d;
        hVar2.f385430n = z;
        hVar2.mo116993a(hVar2.f385429m, z);
        C142161z zVar = new C142161z(this.f385552a, this.f385555e, hVar);
        zVar.f13865d.mo9199a(new C47626h(this.f385556f, "Tabs Pager"));
        ViewPager2 viewPager2 = (ViewPager2) this.f385552a.requireView().findViewById(R.id.weather_tabs_pager);
        viewPager2.mo9210b(zVar);
        viewPager2.f13892b.mo9232c(new C47620b(this.f385556f, new C142115l(this, hVar, viewPager2), "WeatherFragment OnPageChangeCallback"));
        viewPager2.mo9211c(this.f385554c, true);
        new C44918u((TabLayout) this.f385552a.requireView().findViewById(R.id.weather_tab_layout), viewPager2, new C142114k(hVar)).mo48453a();
        viewPager2.mo9216e(hVar.f142515b.size());
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }

    /* renamed from: d */
    public final void mo50733d() {
    }

    /* renamed from: e */
    public final void mo50734e(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f385551d.mo56225c()).mo56382g(th)).mo56372aa(42024)).mo56386p("Failed to get background data");
        m230717i();
        View requireView = this.f385552a.requireView();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) requireView.findViewById(R.id.weather_swipe_refresh);
        if (swipeRefreshLayout == null || !swipeRefreshLayout.f13509b) {
            m230719k(m230718j(th));
            return;
        }
        Snackbar.m79660p(requireView, R.string.weather_error_refreshing, -1).mo48343h();
        m230716h();
    }

    /* renamed from: f */
    public final void mo50735f() {
        m230717i();
        m230716h();
    }
}
