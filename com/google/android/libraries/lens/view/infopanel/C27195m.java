package com.google.android.libraries.lens.view.infopanel;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.infopanel.bottomsheet.LensResultPanelBottomsheetBehavior;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26968d;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26972h;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26973i;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26980p;
import com.google.android.libraries.lens.view.infopanel.p2140b.C27031s;
import com.google.android.libraries.lens.view.p2053ad.C24980c;
import com.google.android.libraries.lens.view.p2053ad.C24981d;
import com.google.android.libraries.lens.view.p2056af.C25073c;
import com.google.android.libraries.lens.view.p2074ap.C25466f;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2078at.C25543z;
import com.google.android.libraries.lens.view.p2078at.p2079a.C25494i;
import com.google.android.libraries.lens.view.p2089b.C25679f;
import com.google.android.libraries.lens.view.p2092c.C25699a;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27655b;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.lens.view.p2180z.C28225a;
import com.google.android.libraries.lens.view.session.C27766bb;
import com.google.android.libraries.lens.view.srpx.C28044j;
import com.google.android.libraries.lens.view.srpx.C28049o;
import com.google.android.libraries.lens.view.srpx.C28050p;
import com.google.android.libraries.lens.view.srpx.p2170a.C28033d;
import com.google.android.libraries.lens.view.utils.C28102ad;
import com.google.android.libraries.lens.view.utils.C28110al;
import com.google.android.libraries.lens.view.utils.C28134w;
import com.google.android.libraries.lens.view.weblrp.C28201o;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.C43265p;
import com.google.android.libraries.web.base.WebConfig;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4563i.C59892ba;
import com.google.common.p4552o.p4563i.C59895bd;
import com.google.net.p4726a.p4727a.C62722b;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.infopanel.m */
/* compiled from: PG */
public final class C27195m implements C27654a, C25494i, C27071by {

    /* renamed from: a */
    public static final C58974d f74328a = C58974d.m91135i("InfoPanelFragment");

    /* renamed from: A */
    public boolean f74329A = false;

    /* renamed from: B */
    public boolean f74330B = true;

    /* renamed from: C */
    public int f74331C;

    /* renamed from: D */
    public C28452b f74332D;

    /* renamed from: E */
    private final WebConfig f74333E;

    /* renamed from: F */
    private final C24981d f74334F;

    /* renamed from: G */
    private final C47770dh f74335G;

    /* renamed from: H */
    private final Activity f74336H;

    /* renamed from: I */
    private final int f74337I;

    /* renamed from: b */
    public final C27073c f74338b;

    /* renamed from: c */
    public final AccountId f74339c;

    /* renamed from: d */
    public final C26244b f74340d;

    /* renamed from: e */
    public final C28310af f74341e;

    /* renamed from: f */
    public final C28306ab f74342f;

    /* renamed from: g */
    public final C28443m f74343g;

    /* renamed from: h */
    public final C26980p f74344h;

    /* renamed from: i */
    public final C26990ah f74345i;

    /* renamed from: j */
    public final C25699a f74346j;

    /* renamed from: k */
    public final C27031s f74347k;

    /* renamed from: l */
    public final C27655b f74348l;

    /* renamed from: m */
    public final C28225a f74349m;

    /* renamed from: n */
    public final C37215b f74350n;

    /* renamed from: o */
    public final C25466f f74351o;

    /* renamed from: p */
    public final C28044j f74352p;

    /* renamed from: q */
    public final C25537t f74353q;

    /* renamed from: r */
    public final C27766bb f74354r;

    /* renamed from: s */
    public final C25073c f74355s;

    /* renamed from: t */
    public final C25679f f74356t;

    /* renamed from: u */
    public final List f74357u = new ArrayList();

    /* renamed from: v */
    public final C27232l f74358v;

    /* renamed from: w */
    public final boolean f74359w;

    /* renamed from: x */
    public final C25543z f74360x;

    /* renamed from: y */
    public InfoPanelView f74361y;

    /* renamed from: z */
    public boolean f74362z;

    public C27195m(AccountId accountId, C27073c cVar, C26244b bVar, WebConfig webConfig, C28310af afVar, C28306ab abVar, C28443m mVar, C25073c cVar2, C26980p pVar, C26990ah ahVar, C25699a aVar, C27031s sVar, C27655b bVar2, C28225a aVar2, C37215b bVar3, C24981d dVar, C25466f fVar, C28044j jVar, C47770dh dhVar, C25537t tVar, Activity activity, C27766bb bbVar, C25679f fVar2, C27232l lVar, boolean z, int i, C25543z zVar) {
        this.f74338b = cVar;
        this.f74339c = accountId;
        this.f74340d = bVar;
        this.f74341e = afVar;
        this.f74342f = abVar;
        this.f74343g = mVar;
        this.f74333E = webConfig;
        this.f74344h = pVar;
        this.f74345i = ahVar;
        this.f74346j = aVar;
        this.f74347k = sVar;
        this.f74348l = bVar2;
        this.f74349m = aVar2;
        this.f74350n = bVar3;
        this.f74334F = dVar;
        this.f74351o = fVar;
        this.f74352p = jVar;
        this.f74335G = dhVar;
        this.f74353q = tVar;
        this.f74336H = activity;
        this.f74354r = bbVar;
        this.f74355s = cVar2;
        this.f74356t = fVar2;
        this.f74358v = lVar;
        this.f74337I = i;
        this.f74359w = z;
        this.f74360x = zVar;
    }

    /* renamed from: a */
    public static C27073c m50416a(AccountId accountId) {
        C27073c cVar = new C27073c();
        C68324h.m98669f(cVar);
        C47247a.m84047b(cVar, accountId);
        return cVar;
    }

    /* renamed from: s */
    private final void m50417s() {
        this.f74334F.mo30198a(C24980c.RESULTS_RENDERED);
        this.f74350n.mo19974a(C37194a.f98626e.mo40815i(C62722b.OK));
        if (!this.f74330B) {
            this.f74350n.mo19974a(C37194a.f98481ar.mo40815i(C62722b.OK));
            return;
        }
        this.f74350n.mo19974a(C37194a.f98480aq.mo40815i(C62722b.OK));
        this.f74330B = false;
    }

    /* renamed from: b */
    public final C28049o mo32624b() {
        C43264o oVar = (C43264o) this.f74338b.getChildFragmentManager().f634a.mo671c("srpx-web-coordinator-fragment");
        if (oVar != null) {
            return (C28049o) oVar.mo17754z().mo46379a();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("InfoPanelFragment");
        eVar.mo33146c(this.f74361y);
    }

    /* renamed from: d */
    public final C28201o mo32625d() {
        return (C28201o) this.f74338b.getChildFragmentManager().f634a.mo671c("web-lrp-root-fragment-tag");
    }

    /* renamed from: e */
    public final C28201o mo32626e() {
        C28201o d = mo32625d();
        if (d != null) {
            return d;
        }
        FragmentManager childFragmentManager = this.f74338b.getChildFragmentManager();
        this.f74350n.mo19974a(C37194a.f98617dr);
        AccountId accountId = this.f74339c;
        String bool = Boolean.toString(this.f74330B);
        C28201o oVar = new C28201o();
        C68324h.m98669f(oVar);
        C47247a.m84047b(oVar, accountId);
        C47243l.m84040b(oVar, bool);
        C0154a aVar = new C0154a(childFragmentManager);
        aVar.mo511h(R.id.panel_content, oVar, "web-lrp-root-fragment-tag", 1);
        aVar.mo509f();
        this.f74350n.mo19974a(C37194a.f98618ds);
        return oVar;
    }

    /* renamed from: f */
    public final C58833ax mo32627f() {
        return C58833ax.m90834k(C28294l.m52913c(this.f74343g.mo33851a(C28485y.m53234a(this.f74361y))));
    }

    /* renamed from: g */
    public final void mo32628g(boolean z) {
        if (z) {
            LensResultPanelBottomsheetBehavior.m50197t(this.f74361y).f73744b = false;
        } else {
            LensResultPanelBottomsheetBehavior.m50197t(this.f74361y).f73744b = true;
        }
        mo32633m(z);
    }

    /* renamed from: h */
    public final void mo32629h(C28033d dVar, C58833ax axVar) {
        if (this.f74359w && this.f74340d.mo31462g(C26239a.ONELRP_REMOVE_CUSTOM_SCROLLING) && !this.f74361y.mo32375t()) {
            this.f74361y.mo32357g();
        }
        boolean z = true;
        this.f74361y.f73496j.f73797b = true;
        FragmentManager childFragmentManager = this.f74338b.getChildFragmentManager();
        C43264o a = C43265p.m76349a(this.f74339c, this.f74333E);
        C0154a aVar = new C0154a(childFragmentManager);
        aVar.mo689v(R.id.panel_content, a, "srpx-web-coordinator-fragment");
        aVar.mo509f();
        C28049o a2 = C28050p.m52284a(this.f74339c, this.f74352p.mo33497a(dVar, this.f74338b.getContext(), mo32627f()), dVar.mo33487a(), axVar, this.f74330B);
        a.mo17754z().mo46380b(a2);
        a2.mo17754z().f76342l = this;
        a2.mo17754z().mo33505f(this.f74331C);
        if (this.f74332D != null) {
            C28050p a3 = a2.mo17754z();
            C28452b bVar = this.f74332D;
            bVar.getClass();
            if (a3.f76343m != null) {
                z = false;
            }
            C58838bb.m90884s(z, "Synthetic container is already set.");
            a3.f76343m = bVar;
        }
    }

    /* renamed from: i */
    public final void mo32630i(C26973i iVar) {
        if (!iVar.mo32425n()) {
            if (iVar.mo32422k().mo56113h()) {
                this.f74361y.mo32374s();
            } else if (!mo32637q(iVar)) {
                this.f74361y.mo32360j();
            } else {
                return;
            }
            this.f74361y.mo32359i();
        } else if (!iVar.mo32417g().mo56113h() || iVar.mo32417g().mo56107c() != C26972h.PROGRESS_BAR) {
            InfoPanelView infoPanelView = this.f74361y;
            infoPanelView.f73489c.f73589d.setVisibility(0);
            infoPanelView.f73489c.f73589d.mo9695f();
        } else if (!this.f74359w || !this.f74330B) {
            this.f74361y.mo32374s();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo32631j() {
        C47538ax c = this.f74335G.mo51613c("InfoPanel onPreDraw");
        try {
            C25073c cVar = this.f74355s;
            C62722b bVar = C62722b.OK;
            C59892ba baVar = (C59892ba) C59895bd.f161854d.createBuilder();
            baVar.copyOnWrite();
            C59895bd bdVar = (C59895bd) baVar.instance;
            bdVar.f161857b = 1;
            bdVar.f161856a |= 1;
            int i = true != this.f74330B ? 3 : 2;
            baVar.copyOnWrite();
            C59895bd bdVar2 = (C59895bd) baVar.instance;
            bdVar2.f161858c = i - 1;
            bdVar2.f161856a |= 2;
            cVar.mo30252a(bVar, (C59895bd) baVar.build());
            m50417s();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: k */
    public final void mo30519k(boolean z) {
        this.f74361y.mo32360j();
        if (!z) {
            this.f74344h.mo32446n(4);
        }
        if (this.f74329A) {
            m50417s();
            this.f74329A = false;
        }
    }

    /* renamed from: l */
    public final void mo32632l() {
        FragmentManager childFragmentManager = this.f74338b.getChildFragmentManager();
        C43264o oVar = (C43264o) childFragmentManager.f634a.mo671c("srpx-web-coordinator-fragment");
        if (oVar != null) {
            C0154a aVar = new C0154a(childFragmentManager);
            aVar.mo516m(oVar);
            aVar.mo509f();
        }
    }

    /* renamed from: m */
    public final void mo32633m(boolean z) {
        C27207w a = this.f74361y.f73489c.f73586a.mo17754z();
        if (a.f74389c != z) {
            a.f74389c = z;
            if (a.f74399m == null) {
                a.f74399m = ValueAnimator.ofInt(new int[]{0, a.f74392f});
                a.f74399m.addUpdateListener(new C27205u(a));
                a.f74399m.setDuration(300);
            }
            if (z) {
                ValueAnimator valueAnimator = a.f74399m;
                valueAnimator.getClass();
                valueAnimator.start();
                return;
            }
            ValueAnimator valueAnimator2 = a.f74399m;
            valueAnimator2.getClass();
            valueAnimator2.reverse();
        }
    }

    /* renamed from: n */
    public final void mo32634n(int i) {
        if (this.f74361y == null) {
            ((C58970a) ((C58970a) f74328a.mo56226d()).mo56372aa(49507)).mo56386p("Could not get infoPanel to adjust LRP width.");
            return;
        }
        Context context = this.f74338b.getContext();
        int i2 = this.f74337I;
        int i3 = -1;
        int i4 = (i2 * 250) + 32 + ((i2 - 1) * 12);
        if (i > i4) {
            i3 = (int) C28134w.m52424a((float) i4, context);
        }
        InfoPanelView infoPanelView = this.f74361y;
        C27207w a = infoPanelView.f73489c.f73586a.mo17754z();
        a.f74390d.f74385j.getLayoutParams().width = i3;
        a.f74390d.f74385j.requestLayout();
        infoPanelView.f73489c.f73589d.getLayoutParams().width = i3;
        infoPanelView.f73489c.f73589d.requestLayout();
        infoPanelView.f73489c.f73587b.getLayoutParams().width = i3;
        infoPanelView.f73489c.f73587b.requestLayout();
    }

    /* renamed from: o */
    public final void mo32635o() {
        mo32636p(this.f74344h.mo32435a());
    }

    /* renamed from: p */
    public final void mo32636p(C26968d dVar) {
        if (dVar == C26968d.FULLY_EXPANDED) {
            Activity activity = this.f74336H;
            if (C28110al.m52391c(activity)) {
                C28102ad.m52384a(activity);
                return;
            }
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 9472);
            return;
        }
        C28102ad.m52384a(this.f74336H);
    }

    /* renamed from: q */
    public final boolean mo32637q(C26973i iVar) {
        return this.f74359w && this.f74340d.mo31462g(C26239a.ONELRP_STICKY_WEBVIEW_ENABLED) && iVar.mo32433q();
    }

    /* renamed from: r */
    public final int mo32638r() {
        return this.f74344h.mo32436b().mo32433q() ? 3 : 2;
    }
}
