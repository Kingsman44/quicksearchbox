package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.gsa.assistant.settings.shared.e.k;
import com.google.android.apps.gsa.assistant.settings.shared.e.l;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.nga.api.C74709bj;
import com.google.android.apps.gsa.nga.api.C74712bm;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmenu.AccountMenu;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.gmshead.GmsheadAccountsModelUpdater;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.C44909l;
import com.google.android.material.tabs.TabLayout;
import com.google.assistant.p3861at.C50270qw;
import com.google.assistant.p3861at.C50272qy;
import com.google.assistant.p3861at.C50282rh;
import com.google.common.base.C58831av;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.at */
/* compiled from: PG */
public final class C9907at {

    /* renamed from: a */
    public static final C59071e f33970a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.ae.at");

    /* renamed from: b */
    static final Intent f33971b = new Intent().setAction("com.android.settings.action.SETTINGS_SEARCH");

    /* renamed from: c */
    public final C9892ae f33972c;

    /* renamed from: d */
    public final C9858a f33973d;

    /* renamed from: e */
    public final C91189au f33974e;

    /* renamed from: f */
    public final h f33975f;

    /* renamed from: g */
    public final l f33976g;

    /* renamed from: h */
    public final C22871g f33977h;

    /* renamed from: i */
    public final C86124t f33978i;

    /* renamed from: j */
    public final C9972p f33979j;

    /* renamed from: k */
    public final C30305n f33980k;

    /* renamed from: l */
    public final GmsheadAccountsModelUpdater f33981l;

    /* renamed from: m */
    public final C86054o f33982m;

    /* renamed from: n */
    public final C28310af f33983n;

    /* renamed from: o */
    public final C28443m f33984o;

    /* renamed from: p */
    public final C68214a f33985p;

    /* renamed from: q */
    public k f33986q;

    /* renamed from: r */
    public C50282rh f33987r;

    /* renamed from: s */
    public boolean f33988s;

    /* renamed from: t */
    public AppBarLayout f33989t;

    /* renamed from: u */
    public AccountMenu f33990u;

    /* renamed from: v */
    public TabLayout f33991v;

    /* renamed from: w */
    C30282k f33992w;

    /* renamed from: x */
    private final C90021c f33993x;

    /* renamed from: y */
    private final C58833ax f33994y;

    public C9907at(C9892ae aeVar, C9858a aVar, C91189au auVar, h hVar, l lVar, C22871g gVar, C86124t tVar, C90021c cVar, C9972p pVar, C30305n nVar, GmsheadAccountsModelUpdater gmsheadAccountsModelUpdater, C86054o oVar, C28310af afVar, C28443m mVar, C58833ax axVar, C68214a aVar2) {
        this.f33972c = aeVar;
        this.f33973d = aVar;
        this.f33974e = auVar;
        this.f33975f = hVar;
        this.f33976g = lVar;
        this.f33977h = gVar;
        this.f33978i = tVar;
        this.f33993x = cVar;
        this.f33979j = pVar;
        this.f33980k = nVar;
        this.f33981l = gmsheadAccountsModelUpdater;
        this.f33982m = oVar;
        this.f33983n = afVar;
        this.f33984o = mVar;
        this.f33994y = axVar;
        this.f33985p = aVar2;
    }

    /* renamed from: a */
    public static C9892ae m24667a() {
        C9892ae aeVar = new C9892ae();
        C68324h.m98669f(aeVar);
        return aeVar;
    }

    /* renamed from: b */
    public final void mo18108b(C50282rh rhVar, View view) {
        if (this.f33972c.getActivity() != null && rhVar != null) {
            ViewPager viewPager = (ViewPager) view.findViewById(R.id.settings_pager);
            int i = 0;
            int i2 = ((Bundle) C58831av.m90830c(this.f33972c.getArguments(), Bundle.EMPTY)).getInt("focus_target", 0);
            viewPager.mo9146k(new C9906as(this.f33972c.getChildFragmentManager(), rhVar, i2));
            viewPager.mo9137f(new C9905ar(this));
            this.f33991v.mo48419n(viewPager, false);
            if (this.f33991v.f117183a.size() > 4) {
                this.f33991v.mo48416k(0);
            } else {
                this.f33991v.mo48416k(1);
            }
            if (i2 != 0) {
                TabLayout tabLayout = (TabLayout) view.findViewById(R.id.settings_tabs);
                int i3 = 0;
                loop0:
                while (true) {
                    if (i3 >= rhVar.f130765b.size()) {
                        break;
                    }
                    for (C50272qy qyVar : ((C50270qw) rhVar.f130765b.get(i3)).f130730c) {
                        if (i2 == 1 && qyVar.f130734a == 2) {
                            i = i3;
                            break loop0;
                        }
                    }
                    i3++;
                }
                C44909l b = tabLayout.mo48406b(i);
                if (b != null) {
                    b.mo48441a();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo18109c(View view) {
        this.f33984o.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        try {
            this.f33972c.startActivity(f33971b);
        } catch (ActivityNotFoundException e) {
            C59104x c = f33970a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MainPageFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(955)).mo56386p("Could not open Android system settings search");
        }
    }

    /* renamed from: d */
    public final void mo18110d() {
        ViewGroup viewGroup;
        if (this.f33993x.mo79746e(C90126fx.f251074bu) && this.f33972c.getResources().getConfiguration().orientation != 2) {
            View view = this.f33972c.getView();
            if (this.f33994y.mo56113h() && view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.nga_error_container)) != null) {
                C74712bm bmVar = (C74712bm) this.f33994y.mo56107c();
                C58833ax b = bmVar.mo71072b(view.getContext());
                viewGroup.removeAllViews();
                if (b.mo56113h()) {
                    View view2 = (View) b.mo56107c();
                    viewGroup.addView(view2);
                    viewGroup.setVisibility(0);
                    if (view2 instanceof C74709bj) {
                        C74709bj bjVar = (C74709bj) view2;
                        bjVar.mo71070b(new C9901an(view, viewGroup));
                        bjVar.mo71069a(new C9902ao(this));
                    }
                } else {
                    viewGroup.setVisibility(8);
                }
                C58833ax d = bmVar.mo71074d(view);
                if (d.mo56113h()) {
                    ((Snackbar) d.mo56107c()).mo48343h();
                }
            }
        }
    }
}
