package com.google.android.apps.gsa.search.core.state.p6872d;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6519al.p6646cg.C85089a;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.p6864a.C86801p;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98635r;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60494rz;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.bj */
/* compiled from: PG */
public final class C86943bj extends C86898ct implements C86801p {

    /* renamed from: a */
    private static final C59071e f234828a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.d.bj");

    /* renamed from: b */
    private final C85089a f234829b;

    /* renamed from: c */
    private final SharedPreferences f234830c;

    /* renamed from: d */
    private final C85929cw f234831d;

    /* renamed from: e */
    private C58833ax f234832e;

    /* renamed from: f */
    private C58833ax f234833f;

    /* renamed from: g */
    private C60494rz f234834g = C60494rz.UNKNOWN;

    /* renamed from: h */
    private C58833ax f234835h;

    /* renamed from: i */
    private C58833ax f234836i;

    public C86943bj(C68214a aVar, C85089a aVar2, SharedPreferences sharedPreferences, C85929cw cwVar) {
        super(aVar, 10);
        C58836b bVar = C58836b.f156633a;
        this.f234832e = bVar;
        this.f234833f = bVar;
        C58836b bVar2 = C58836b.f156633a;
        this.f234835h = bVar2;
        this.f234836i = bVar2;
        this.f234829b = aVar2;
        this.f234830c = sharedPreferences;
        this.f234831d = cwVar;
    }

    /* renamed from: g */
    private final boolean m140301g() {
        return this.f234830c.getBoolean("use_recently", true);
    }

    /* renamed from: a */
    public final void mo80495a(Intent intent, boolean z) {
        if (m140301g()) {
            if (z) {
                String stringExtra = intent.getStringExtra("recently_webpage_query");
                if (m140301g()) {
                    C58976aa aaVar = C58975e.f156826a;
                    this.f234835h = C58833ax.m90833j(stringExtra);
                }
            }
            C60494rz a = C60494rz.m92598a(intent.getIntExtra("com.google.android.apps.gsa.customtabs.SOURCE", 0));
            if (a == null) {
                a = C60494rz.UNKNOWN;
            }
            if (m140301g()) {
                C58976aa aaVar2 = C58975e.f156826a;
                a.getClass();
                this.f234834g = a;
                this.f234836i = C58836b.f156633a;
            }
        }
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.RECENTLY_SCREENSHOT_CAPTURED};
    }

    /* renamed from: c */
    public final void mo80496c(C58833ax axVar) {
        String str;
        C58976aa aaVar = C58975e.f156826a;
        if (axVar.mo56113h() && !((C98635r) axVar.mo56107c()).equals(this.f234833f.mo56111f()) && this.f234831d.mo79577s(((C98635r) axVar.mo56107c()).mo91237b(), true, false) == null) {
            C98635r rVar = (C98635r) axVar.mo56107c();
            if (m140301g()) {
                if (this.f234835h.mo56113h()) {
                    str = (String) this.f234835h.mo56107c();
                } else if (this.f234834g == C60494rz.SUGGEST) {
                    if (!this.f234836i.mo56113h()) {
                        this.f234836i = C58833ax.m90834k(C58837ba.m90858g(rVar.mo91238c()));
                    }
                    str = (String) this.f234836i.mo56107c();
                } else {
                    str = (this.f234834g != C60494rz.NOW && this.f234832e.mo56113h()) ? ((Query) this.f234832e.mo56107c()).f252770i : BuildConfig.FLAVOR;
                }
                this.f234829b.mo78712q(str, rVar, this.f234834g.f163762v);
            }
        }
        this.f234833f = axVar;
    }

    /* renamed from: e */
    public final void mo80497e(C58833ax axVar) {
        this.f234832e = axVar;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("RecentlyState");
        boolean h = this.f234832e.mo56113h();
        fVar.mo85279c("has last query").mo85276a(C90752i.m148228b(Boolean.valueOf(h)));
        if (h) {
            fVar.mo85279c("last query").mo85276a(C90752i.m148234h(this.f234832e.mo56107c()));
        }
        boolean h2 = this.f234833f.mo56113h();
        fVar.mo85279c("has last navigation info").mo85276a(C90752i.m148228b(Boolean.valueOf(h2)));
        if (h2) {
            fVar.mo85279c("last navigation info").mo85276a(C90752i.m148234h(this.f234833f.mo56107c()));
        }
    }

    /* renamed from: hl */
    public final void mo80592hl(String str) {
        if ("use_recently".equals(str) && !this.f234830c.getBoolean(str, true)) {
            this.f234829b.mo78703g();
        }
    }

    /* renamed from: hp */
    public final String[] mo80593hp() {
        return new String[]{"use_recently"};
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a.ordinal() == 46) {
            if (this.f234832e.mo56113h()) {
                this.f234829b.mo78707k(((Query) this.f234832e.mo56107c()).f252770i, ((Query) this.f234832e.mo56107c()).mo84346be(), clientEventData.mo81913d(Bitmap.class) ? (Bitmap) clientEventData.mo81912b(Bitmap.class) : null);
                return;
            }
            C59104x c = f234828a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "RecentlyState");
            ((C59052c) ((C59052c) c).mo56372aa(9227)).mo56386p("RECENTLY_SCREENSHOT_CAPTURED event without expected query.");
        }
    }
}
