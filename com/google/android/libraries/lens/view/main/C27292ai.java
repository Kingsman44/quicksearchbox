package com.google.android.libraries.lens.view.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.binaries.satin.app.C73958bn;
import com.google.android.apps.gsa.binaries.satin.app.C74175nh;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119096ae;
import com.google.android.apps.search.lens.C139924b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.common.text.selection.p2009ui.p2011b.C24158c;
import com.google.android.libraries.lens.view.C28224z;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filecache.C25839c;
import com.google.android.libraries.lens.view.filters.C26019p;
import com.google.android.libraries.lens.view.filters.C26022s;
import com.google.android.libraries.lens.view.filters.C26234v;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.translation.C26059ax;
import com.google.android.libraries.lens.view.filters.translation.C26120dc;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.frozenimage.C26270b;
import com.google.android.libraries.lens.view.frozenimage.C26272d;
import com.google.android.libraries.lens.view.frozenimage.C26275g;
import com.google.android.libraries.lens.view.gallery.C26299ac;
import com.google.android.libraries.lens.view.gallery.C26314ao;
import com.google.android.libraries.lens.view.gallery.C26315ap;
import com.google.android.libraries.lens.view.gallery.p2109b.C26329i;
import com.google.android.libraries.lens.view.gallery.p2111d.C26367m;
import com.google.android.libraries.lens.view.gleam.C26505cj;
import com.google.android.libraries.lens.view.gleam.C26510co;
import com.google.android.libraries.lens.view.gleam.C26526dd;
import com.google.android.libraries.lens.view.gleam.C26586ff;
import com.google.android.libraries.lens.view.gleam.region.C26616g;
import com.google.android.libraries.lens.view.imageviewer.C26937a;
import com.google.android.libraries.lens.view.imageviewer.C26957t;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26976l;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26980p;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27074a;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27075b;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27076c;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27077d;
import com.google.android.libraries.lens.view.infopanel.p2144e.C27182x;
import com.google.android.libraries.lens.view.livingsurfaces.C27251j;
import com.google.android.libraries.lens.view.onboarding.C27474ag;
import com.google.android.libraries.lens.view.onboarding.C27481an;
import com.google.android.libraries.lens.view.onboarding.C27483ap;
import com.google.android.libraries.lens.view.onboarding.C27517o;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2053ad.C24980c;
import com.google.android.libraries.lens.view.p2053ad.C24981d;
import com.google.android.libraries.lens.view.p2056af.C25028a;
import com.google.android.libraries.lens.view.p2056af.C25050av;
import com.google.android.libraries.lens.view.p2056af.C25062bg;
import com.google.android.libraries.lens.view.p2056af.C25063bh;
import com.google.android.libraries.lens.view.p2056af.C25064bi;
import com.google.android.libraries.lens.view.p2056af.C25065bj;
import com.google.android.libraries.lens.view.p2056af.C25066bk;
import com.google.android.libraries.lens.view.p2056af.C25067bl;
import com.google.android.libraries.lens.view.p2056af.C25068bm;
import com.google.android.libraries.lens.view.p2065ai.C25139a;
import com.google.android.libraries.lens.view.p2065ai.C25149aj;
import com.google.android.libraries.lens.view.p2065ai.C25155ap;
import com.google.android.libraries.lens.view.p2067ak.C25197ac;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2069am.C25344t;
import com.google.android.libraries.lens.view.p2074ap.C25466f;
import com.google.android.libraries.lens.view.p2075aq.C25469b;
import com.google.android.libraries.lens.view.p2078at.C25499ae;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2078at.C25511aq;
import com.google.android.libraries.lens.view.p2078at.C25514at;
import com.google.android.libraries.lens.view.p2078at.C25516av;
import com.google.android.libraries.lens.view.p2078at.C25529l;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2078at.C25540w;
import com.google.android.libraries.lens.view.p2078at.C25543z;
import com.google.android.libraries.lens.view.p2081au.C25550af;
import com.google.android.libraries.lens.view.p2081au.C25574x;
import com.google.android.libraries.lens.view.p2081au.C25575y;
import com.google.android.libraries.lens.view.p2085ax.C25614p;
import com.google.android.libraries.lens.view.p2087ay.C25664y;
import com.google.android.libraries.lens.view.p2089b.C25676c;
import com.google.android.libraries.lens.view.p2089b.C25678e;
import com.google.android.libraries.lens.view.p2089b.C25679f;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.lens.view.p2091bb.C25691e;
import com.google.android.libraries.lens.view.p2092c.C25699a;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26789an;
import com.google.android.libraries.lens.view.p2113h.p2123f.C26821c;
import com.google.android.libraries.lens.view.p2113h.p2131i.C26885b;
import com.google.android.libraries.lens.view.p2113h.p2132j.C26886a;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26899d;
import com.google.android.libraries.lens.view.p2133i.p2136c.C26914j;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.p2151m.C27280g;
import com.google.android.libraries.lens.view.p2152n.C27456i;
import com.google.android.libraries.lens.view.p2153o.C27459a;
import com.google.android.libraries.lens.view.p2153o.C27466h;
import com.google.android.libraries.lens.view.p2161r.C27655b;
import com.google.android.libraries.lens.view.p2162s.C27695m;
import com.google.android.libraries.lens.view.p2162s.C27696n;
import com.google.android.libraries.lens.view.p2180z.C28225a;
import com.google.android.libraries.lens.view.ris.C27675a;
import com.google.android.libraries.lens.view.sampleimages.C27697a;
import com.google.android.libraries.lens.view.sensors.orientation.C27727d;
import com.google.android.libraries.lens.view.sensors.orientation.C27729f;
import com.google.android.libraries.lens.view.sensors.orientation.DisplayFlipService$1;
import com.google.android.libraries.lens.view.session.C27749al;
import com.google.android.libraries.lens.view.session.C27761ax;
import com.google.android.libraries.lens.view.session.C27766bb;
import com.google.android.libraries.lens.view.session.C27781bq;
import com.google.android.libraries.lens.view.session.C27794n;
import com.google.android.libraries.lens.view.textoverlay.C28074g;
import com.google.android.libraries.lens.view.textoverlay.C28079l;
import com.google.android.libraries.lens.view.textoverlay.C28093z;
import com.google.android.libraries.lens.view.utils.C28102ad;
import com.google.android.libraries.lens.view.utils.C28130s;
import com.google.android.libraries.lens.view.weblrp.C28188c;
import com.google.android.libraries.lens.view.weblrp.C28205s;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28448r;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1657ba.p1661b.p1662a.p1663a.C19642a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.web.contrib.p3384g.p3385a.C43562a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60708zx;
import com.google.common.p4552o.adn;
import com.google.common.p4552o.ado;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.main.ai */
/* compiled from: PG */
public final class C27292ai extends C27426fg implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    public final C2393x f74695a = new C2393x(this);

    /* renamed from: b */
    private C27384dt f74696b;

    /* renamed from: c */
    private Context f74697c;

    /* renamed from: d */
    private final C47515ab f74698d = new C47515ab(this);

    /* renamed from: e */
    private boolean f74699e;

    @Deprecated
    public C27292ai() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C27384dt mo17754z() {
        C27384dt dtVar = this.f74696b;
        if (dtVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f74699e) {
            return dtVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo32850b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f74697c == null) {
            this.f74697c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f74697c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f74698d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f74695a;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f74698d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f74698d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27291ah.m50857a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f74698d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C27291ah.m50857a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f74698d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27291ah.m50857a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C27384dt a = mo17754z();
        a.f75001u.mo19974a(C37194a.f98563cT.mo40812e(C59898bg.f161867w, C25028a.m46316a(configuration)));
        if (a.f74992l.mo30591a()) {
            a.mo32930Q();
        }
        a.mo32942ad();
    }

    public final void onCreate(Bundle bundle) {
        this.f74698d.mo51381i();
        try {
            super.onCreate(bundle);
            C27384dt a = mo17754z();
            C27327bq bqVar = a.f74881C;
            C27292ai aiVar = a.f74987g;
            C27288ae aeVar = bqVar.f74816u;
            aeVar.f74679l = new C27326bp(bqVar);
            aeVar.f74675h.mo5704e(aiVar, new C27299ap(bqVar));
            C25068bm bmVar = (C25068bm) a.f74894P.mo27525b();
            bmVar.f68318d.mo19974a(C37194a.f98486aw);
            C47633f h = C47633f.m84733g(bmVar.f68317c.f68662a.f68693b).mo51515h(new C25065bj(bmVar), bmVar.f68319e);
            C60870cx b = bmVar.f68319e.mo19399b(new C25062bg(bmVar));
            C60870cx b2 = bmVar.f68319e.mo19399b(new C25063bh(bmVar));
            C60870cx a2 = C47638k.m84753d(h, b, b2).mo51520a(new C25064bi(h, b, b2), bmVar.f68319e);
            C25066bk bkVar = new C25066bk(bmVar);
            C47633f g = C47633f.m84733g(C60922j.m93044g(a2, C47810es.m84963c(bkVar), bmVar.f68319e));
            C25067bl blVar = new C25067bl(bmVar);
            C60856cj.m92911t(g.f164926b, C47810es.m84974n(blVar), bmVar.f68319e);
            a.f74999s.mo30784a();
            a.f74997q.mo30535e();
            a.mo32939aa();
            C26059ax axVar = a.f74888J;
            axVar.f70819i.mo33444q(a.f74987g.f74695a);
            a.f74936af.f73043a.mo5704e(a.f74987g, new C27344cg(a));
            if (a.f74944an && a.f74995o.mo31462g(C26239a.ENABLE_WEBX_PREWARM)) {
                if (a.f74992l.mo30592b()) {
                    a.f74899U.mo30199b(new C27376dl(a), C24980c.QUERY_SENT);
                } else {
                    a.f74899U.mo30199b(new C27376dl(a), C24980c.AFTER_CAMERA_START_UP);
                }
            }
            a.f74937ag.mo50429i(a.f74907aC);
            a.f74938ah.mo50828h(R.id.lens_search_enabled_subscription, new C27695m(a.f74939ai), new C27345ch(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27291ah.m50857a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f74698d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C27291ah.m50857a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C60870cx cxVar;
        this.f74698d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C27384dt a = mo17754z();
            a.f74912aH = (ViewGroup) layoutInflater.inflate(R.layout.lens_container, viewGroup, false);
            C28306ab abVar = a.f74890L;
            Activity activity = a.f74990j;
            C28313c a2 = abVar.f76990a.mo33805a(C28427h.m53115a(51771));
            a2.mo33859g(C45954d.m82060a(a.f74889K.f69824a));
            a2.mo33859g(C28375ak.m53061c(51781));
            adn adn = (adn) ado.f158388g.createBuilder();
            C60708zx zxVar = a.f74896R.f76837c;
            adn.copyOnWrite();
            ado ado = (ado) adn.instance;
            zxVar.getClass();
            ado.f158396f = zxVar;
            ado.f158391a |= 64;
            a2.mo33858f(new C28353e(C25686g.f69825a, (ado) adn.build()));
            int i = C28485y.f77298f;
            abVar.mo33801b(activity.findViewById(16908290), a2);
            C28306ab abVar2 = a.f74890L;
            abVar2.mo33801b(a.f74912aH, abVar2.f76990a.mo33805a(C28427h.m53115a(true != a.f74992l.mo30592b() ? 53629 : 53631)));
            Window window = a.f74990j.getWindow();
            if (!window.getDecorView().isAttachedToWindow()) {
                cxVar = C2169h.m6027a(new C25676c(window));
            } else {
                cxVar = C60856cj.m92900i(C25678e.m47348a(window.getDecorView()));
            }
            C60856cj.m92911t(cxVar, C47810es.m84974n(new C27386du(a)), a.f74994n);
            a.f74912aH.setPadding(0, 0, 0, 0);
            if (a.f74992l.mo30592b()) {
                a.mo32936W();
            }
            ViewGroup viewGroup2 = (ViewGroup) a.f74912aH.findViewById(R.id.lens_underlay);
            viewGroup2.getClass();
            a.f74910aF = viewGroup2;
            ViewGroup.LayoutParams layoutParams = a.f74910aF.getLayoutParams();
            layoutParams.getClass();
            a.f74984d = new LensUnderlayCoordinatorBehavior(a.f75000t, a.f74932ab, a.f74933ac.mo31317j());
            ((C1773f) layoutParams).mo4974a(a.f74984d);
            LensUnderlayCoordinatorBehavior lensUnderlayCoordinatorBehavior = a.f74984d;
            C25691e eVar = a.f74901W;
            Objects.requireNonNull(eVar);
            lensUnderlayCoordinatorBehavior.f74641a = new C27360cw(eVar);
            ViewGroup viewGroup3 = (ViewGroup) a.f74912aH.findViewById(R.id.lens_overlay);
            viewGroup3.getClass();
            a.f74911aG = viewGroup3;
            View findViewById = a.f74912aH.findViewById(R.id.text_announce_overlay);
            findViewById.getClass();
            a.f74909aE = findViewById;
            a.f74913aI = a.f74912aH.findViewById(R.id.snackbar_container);
            a.f74914aJ = new View(a.f75000t);
            a.f74912aH.addView(a.f74914aJ);
            C28306ab abVar3 = a.f74890L;
            abVar3.mo33801b(a.f74910aF, abVar3.f76990a.mo33805a(C28427h.m53115a(51773)));
            C28306ab abVar4 = a.f74890L;
            abVar4.mo33801b(a.f74911aG, abVar4.f76990a.mo33805a(C28427h.m53115a(51772)));
            C28306ab abVar5 = a.f74890L;
            abVar5.mo33801b(a.f74914aJ, abVar5.f76990a.mo33805a(C28427h.m53115a(56151)));
            View findViewById2 = a.f74912aH.findViewById(R.id.fade_in_animator);
            findViewById2.getClass();
            a.f74915aK = findViewById2;
            a.mo32941ac();
            a.f74924aT = (C26234v) a.mo32951p(R.id.lens_coordinator_container, "filter_settings_container_fragment_tag", new C27368dd(a));
            a.f74923aS = (C26019p) a.mo32951p(R.id.filter_selector_fragment_placeholder, "filter_selector_fragment", new C27331bu(a));
            a.mo32952q().f70730s = a.f74959bc;
            if (a.f74943am) {
                a.mo32959y();
            }
            a.f74892N.f70644c = new C27361cx(a);
            a.f74921aQ = (C25149aj) a.mo32950o(R.id.lens_overlay_buttons_container, new C27373di(a));
            a.mo32950o(R.id.scrim_container, new C27365da(a));
            a.f74898T.mo32777b(new C27362cy(a));
            if (a.f74893O.mo56113h()) {
                if (a.f74987g.getChildFragmentManager().f634a.mo670b(R.id.lens_debug_container) == null) {
                    C0154a aVar = new C0154a(a.f74987g.getChildFragmentManager());
                    aVar.mo511h(R.id.lens_debug_container, ((C27459a) a.f74893O.mo56107c()).mo32992k(), (String) null, 1);
                    aVar.mo509f();
                }
            }
            a.f74920aP = (C28074g) a.mo32950o(R.id.text_overlay_container, new C27366db(a));
            ViewGroup viewGroup4 = (ViewGroup) a.f74912aH.findViewById(R.id.magnifier_container);
            viewGroup4.getClass();
            C28093z a3 = a.f74920aP.mo17754z();
            ViewGroup viewGroup5 = a.f74910aF;
            boolean z = a3.f76454g;
            a3.mo33553e();
            if (viewGroup5 != null) {
                a3.f76464q = new C24158c(viewGroup5, viewGroup4);
                a3.f76464q.f65996b.f66009h = z;
            }
            a.f74922aR = (C26272d) a.mo32951p(R.id.frozen_image_container, "frozen_image_fragment", new C27379do(a));
            a.f74919aO = (C26510co) a.mo32950o(R.id.gleam_overlay_container, new C27343cf(a));
            C26526dd ddVar = a.f74919aO.mo17754z().f72338e;
            C26270b s = a.mo32954s();
            ddVar.f72300j = s;
            ((C26275g) s).f71415e = ddVar;
            if (a.f74941ak) {
                a.f74919aO.mo17754z().f72333A = C58833ax.m90833j(new C27354cq(a));
            }
            if (!a.f74992l.mo30592b()) {
                a.mo32929P();
            }
            C28074g gVar = a.f74920aP;
            gVar.getClass();
            C28079l lVar = gVar.mo17754z().f76450c;
            C58838bb.m90866a(lVar, "api is only available while attached");
            C27327bq bqVar = a.f74881C;
            C26505cj u = a.mo32956u();
            C26270b s2 = a.mo32954s();
            bqVar.f74767M = u;
            bqVar.f74768N = lVar;
            bqVar.f74769O = s2;
            lVar.f76428p = new C27313bc(bqVar, s2);
            ((C26526dd) u).f72284G = new C27295al(bqVar);
            a.f74901W.mo30803e(lVar, a.mo32956u(), a.mo32954s());
            a.f74998r.mo33734e((ViewGroup) a.f74912aH.findViewById(R.id.lens_hats_survey_container));
            a.f75001u.mo19974a(C37194a.f98631j.mo40812e(C59898bg.f161867w, C25028a.m46316a(layoutInflater.getContext().getResources().getConfiguration())));
            if (a.f74886H.mo32696d() == 3) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(500);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setAnimationListener(new C27381dq(a));
                a.f74915aK.setVisibility(0);
                a.f74915aK.startAnimation(alphaAnimation);
            }
            View findViewById3 = a.f74910aF.findViewById(R.id.lens_camera_view_placeholder);
            findViewById3.getClass();
            a.f74917aM = findViewById3;
            LensOverlayLayout lensOverlayLayout = (LensOverlayLayout) a.f74910aF.findViewById(R.id.lens_overlay_layout);
            lensOverlayLayout.getClass();
            a.f74918aN = lensOverlayLayout;
            LensOverlayLayout lensOverlayLayout2 = a.f74918aN;
            C21370a aVar2 = a.f75004x;
            C47770dh dhVar = a.f74902X;
            boolean z2 = a.f74942al;
            lensOverlayLayout2.f74631e = aVar2;
            lensOverlayLayout2.f74632f = dhVar;
            lensOverlayLayout2.f74633g = z2;
            if (a.f74886H.mo32708n().mo56113h()) {
                LensOverlayLayout lensOverlayLayout3 = a.f74918aN;
                int i2 = ((C25344t) a.f74886H.mo32708n().mo56107c()).f68991c;
                int[] iArr = new int[2];
                lensOverlayLayout3.getLocationOnScreen(iArr);
                lensOverlayLayout3.f74628b = Integer.valueOf(Math.max(0, i2 - iArr[1]));
                for (int i3 = 0; i3 < lensOverlayLayout3.getChildCount(); i3++) {
                    View childAt = lensOverlayLayout3.getChildAt(i3);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    layoutParams2.gravity = (layoutParams2.gravity & 8388615) | 48;
                    childAt.setLayoutParams(layoutParams2);
                    childAt.setTranslationY((float) lensOverlayLayout3.f74628b.intValue());
                }
            }
            Context context = a.f75000t;
            C60888db dbVar = a.f74993m;
            C26022s q = a.mo32952q();
            LensOverlayLayout lensOverlayLayout4 = a.f74918aN;
            lensOverlayLayout4.getClass();
            a.f74906aB = new C27392e(context, a, dbVar, q, lensOverlayLayout4, a.f74901W, a.mo32956u(), a.mo32954s());
            a.f74918aN.f74629c = a.f74906aB;
            a.f74908aD = C27394eb.STOPPED;
            a.f74997q.mo30531a().mo5704e(a.f74987g, new C27349cl(a));
            a.f74887I.f69673e.mo5704e(a.f74987g, new C27350cm(a));
            a.f74888J.f70829s.mo5704e(a.f74987g, new C27351cn(a));
            a.f74888J.f70788B.mo5704e(a.f74987g, new C27352co(a));
            a.f74888J.f70789C.mo5704e(a.f74987g, new C27353cp(a));
            a.f74888J.f70836z.mo5704e(a.f74987g, new C27355cr(a));
            if (a.f74946ap) {
                a.f75005y.f73571e.mo5704e(a.f74987g, new C27356cs(a));
            }
            a.f74931aa.f73293b.mo5704e(a.f74987g.getViewLifecycleOwner(), new C27357ct(a));
            a.f74934ad.f69405c.mo5704e(a.f74987g.getViewLifecycleOwner(), new C27358cu(a));
            if (a.f74992l.mo30591a()) {
                C27729f fVar = a.f74904Z;
                C27292ai aiVar = a.f74987g;
                C27359cv cvVar = new C27359cv(a);
                Object systemService = fVar.f75705a.getSystemService("display");
                systemService.getClass();
                DisplayManager displayManager = (DisplayManager) systemService;
                Object systemService2 = fVar.f75705a.getSystemService("window");
                systemService2.getClass();
                aiVar.f74695a.mo5790b(new DisplayFlipService$1((WindowManager) systemService2, cvVar, displayManager));
            }
            ViewGroup viewGroup6 = a.f74912aH;
            if (viewGroup6 != null) {
                C47831fm.m85019n();
                return viewGroup6;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C27291ah.m50857a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f74698d.mo51374b();
        try {
            super.onDestroy();
            C27384dt a = mo17754z();
            if (a.f74908aD != C27394eb.UNINITIALIZED) {
                a.mo32949ak(C27394eb.DESTROYED);
            }
            C25614p pVar = a.f74887I;
            if (pVar.f69677i != null) {
                ((C119096ae) pVar.f69670b.mo27525b()).mo104116h();
                pVar.mo30727d(1);
                if (pVar.f69674f != null) {
                    ((C119096ae) pVar.f69670b.mo27525b()).mo104115g(pVar.f69674f);
                }
            }
            a.f74880B.f74609b.mo32808b();
            C27327bq bqVar = a.f74881C;
            if (bqVar.f74765K) {
                bqVar.mo32883n();
            }
            C27288ae aeVar = bqVar.f74816u;
            if (!aeVar.f74678k) {
                aeVar.mo32827d();
                aeVar.mo32828e();
                C25550af afVar = aeVar.f74669b;
                afVar.mo30609f((C25574x) null);
                afVar.mo30610g((C60870cx) null);
                afVar.mo30608e(C28130s.m52411b(C56306df.AUTO_FILTER));
            }
            b.close();
            return;
        } catch (Throwable th) {
            C27291ah.m50857a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f74698d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C27291ah.m50857a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f74698d.mo51376d();
        try {
            super.onDetach();
            this.f74699e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C27291ah.m50857a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f74698d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C27291ah.m50857a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f74698d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C27291ah.m50857a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f74698d.mo51381i();
        try {
            super.onPause();
            mo17754z().mo32949ak(C27394eb.STOPPED);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27291ah.m50857a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f74698d.mo51377e();
        try {
            super.onResume();
            C27384dt a = mo17754z();
            a.f74997q.mo30535e();
            if (!a.mo32943ae()) {
                a.mo32949ak(C27394eb.ACTIVE);
                a.f74954ax = false;
                C27077d dVar = a.f74950at;
                if (dVar != null) {
                    a.mo32922I(dVar);
                    a.f74950at = null;
                }
                if (a.f74955ay) {
                    a.f74955ay = false;
                    if (a.mo32945ag()) {
                        a.f74996p.mo33056c();
                    }
                }
            }
            a.mo32942ad();
            e.close();
            return;
        } catch (Throwable th) {
            C27291ah.m50857a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f74698d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f74698d.mo51381i();
        try {
            super.onStart();
            C27384dt a = mo17754z();
            if (a.f74954ax) {
                a.f75001u.mo19974a(C37194a.f98640s);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27291ah.m50857a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f74698d.mo51381i();
        try {
            super.onStop();
            C27384dt a = mo17754z();
            a.mo32919E();
            a.f75001u.mo19974a(C37194a.f98627f.mo40805c(C62722b.OK));
            C25050av avVar = a.f74882D;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1290;
            avVar.mo30241a((C60555uf) tzVar.build());
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27291ah.m50857a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f74698d.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C27384dt a = mo17754z();
            C47393f.m84233d(this, C25514at.class, new C27405em(a));
            C47393f.m84233d(this, C27466h.class, new C27414ev(a));
            C47393f.m84233d(this, C27076c.class, new C27415ew(a));
            C47393f.m84233d(this, C27075b.class, new C27416ex(a));
            C47393f.m84233d(this, C27074a.class, new C27417ey(a));
            C47393f.m84233d(this, C27077d.class, new C27418ez(a));
            C47393f.m84233d(this, C25511aq.class, new C27420fa(a));
            C47393f.m84233d(this, C28188c.class, new C27421fb(a));
            C47393f.m84233d(this, C26937a.class, new C27422fc(a));
            C47393f.m84233d(this, C26957t.class, new C27395ec(a));
            C47393f.m84233d(this, C26329i.C26330a.class, new C27396ed(a));
            C47393f.m84233d(this, C26315ap.class, new C27397ee(a));
            C47393f.m84233d(this, C26299ac.C26300a.class, new C27398ef(a));
            C47393f.m84233d(this, C26367m.class, new C27399eg(a));
            C47393f.m84233d(this, C26299ac.C26302c.class, new C27400eh(a));
            C47393f.m84233d(this, C26314ao.class, new C27401ei(a));
            C47393f.m84233d(this, C25155ap.C25156a.class, new C27402ej(a));
            C47393f.m84233d(this, C26299ac.C26301b.class, new C27403ek(a));
            C47393f.m84233d(this, C26886a.class, new C27404el(a));
            C47393f.m84233d(this, C25139a.class, new C27406en(a));
            C47393f.m84233d(this, C27675a.class, new C27407eo(a));
            C47393f.m84233d(this, C25516av.class, new C27408ep(a));
            C47393f.m84233d(this, C25529l.class, new C27409eq(a));
            C47393f.m84233d(this, C26616g.class, new C27410er(a));
            C47393f.m84233d(this, C27483ap.class, new C27411es(a));
            C47393f.m84233d(this, C27474ag.class, new C27412et(a));
            C47393f.m84233d(this, C27697a.class, new C27413eu(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27291ah.m50857a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f74698d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f74698d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f74698d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f74698d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f74698d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f74698d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        C27292ai aiVar = this;
        aiVar.f74698d.mo51381i();
        try {
            if (!aiVar.f74699e) {
                super.onAttach(context);
                if (aiVar.f74696b == null) {
                    Object jN = mo32975d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C27292ai) {
                        C27292ai aiVar2 = (C27292ai) fragment;
                        C68225k.m98532d(aiVar2);
                        String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                        C68225k.m98532d(b);
                        AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                        Activity activity = (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                        Activity activity2 = (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                        if (activity2 instanceof C139924b) {
                            Duration duration = ((C139924b) activity2).f380367j;
                            C68225k.m98532d(duration);
                            C25543z zVar = (C25543z) ((C74176nj) jN).f206836d.f205229X.mo17428b();
                            C60888db dbVar = (C60888db) ((C74176nj) jN).f206677a.lL.mo17428b();
                            Executor executor = (Executor) ((C74176nj) jN).f206836d.f205207B.mo17428b();
                            C26244b bVar = (C26244b) ((C74176nj) jN).f206836d.f205444z.mo17428b();
                            C24974a aVar = (C24974a) ((C74176nj) jN).f206836d.f205261ac.mo17428b();
                            C27517o oVar = (C27517o) ((C74176nj) jN).f206836d.f205255aW.mo17428b();
                            C27481an anVar = (C27481an) ((C74176nj) jN).f206836d.f205268aj.mo17428b();
                            boolean booleanValue = ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199555hI.mo17428b()).booleanValue();
                            C25504aj ajVar = (C25504aj) ((C74176nj) jN).f206836d.f205220O.mo17428b();
                            C28225a aVar2 = (C28225a) ((C74176nj) jN).f206836d.f205253aU.mo17428b();
                            C25679f eM = ((C74176nj) jN).mo69676eM();
                            Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                            C37215b bVar2 = (C37215b) ((C74176nj) jN).f206730b.f198027a.f199167S.mo17428b();
                            C58833ax axVar = (C58833ax) ((C74176nj) jN).f206836d.f205439u.mo17428b();
                            C25197ac acVar = (C25197ac) ((C74176nj) jN).f206730b.f198027a.f199551hE.mo17428b();
                            C25225bd bdVar = (C25225bd) ((C74176nj) jN).f206677a.a.f203105jf.mo17428b();
                            C21370a aVar3 = (C21370a) ((C74176nj) jN).f206677a.i.mo17428b();
                            C26980p pVar = (C26980p) ((C74176nj) jN).f206836d.f205248aP.mo17428b();
                            C28205s sVar = new C28205s((C26244b) ((C74176nj) jN).f206836d.f205444z.mo17428b(), new C43562a(((C74176nj) jN).f206677a.d.mo67808ce()), (C37215b) ((C74176nj) jN).f206730b.f198027a.f199167S.mo17428b(), ((C74176nj) jN).mo69741fY(), (C74175nh) ((C74176nj) jN).f206688aK.mo17428b(), (Executor) ((C74176nj) jN).f206677a.lL.mo17428b(), (C25543z) ((C74176nj) jN).f206836d.f205229X.mo17428b());
                            C26976l lVar = new C26976l(new C27182x((Context) ((C74176nj) jN).f206677a.g.mo17428b(), (C47449e) ((C74176nj) jN).f206677a.gH.mo17428b(), (C25225bd) ((C74176nj) jN).f206677a.a.f203105jf.mo17428b()), (LensConnectivityManager) ((C74176nj) jN).f206836d.f205208C.mo17428b(), (Context) ((C74176nj) jN).f206677a.g.mo17428b(), ((C74176nj) jN).f206836d.mo69015cQ());
                            C27280g t = ((C74176nj) jN).f206836d.mo69037t();
                            C73958bn bnVar = ((C74176nj) jN).f206836d;
                            C69464a aVar4 = bnVar.f205284az;
                            C73958bn bnVar2 = ((C74176nj) jN).f206836d;
                            C69464a aVar5 = bnVar2.f205312ba;
                            C26821c q = ((C74176nj) jN).f206836d.mo69034q();
                            C73958bn bnVar3 = ((C74176nj) jN).f206836d;
                            C27327bq bqVar = new C27327bq(aVar4, (C25575y) bnVar.f205230Y.mo17428b(), (C25543z) ((C74176nj) jN).f206836d.f205229X.mo17428b(), (C60888db) ((C74176nj) jN).f206677a.lL.mo17428b(), (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), (C25537t) ((C74176nj) jN).f206836d.f205273ao.mo17428b(), aVar5, (C26244b) bnVar2.f205444z.mo17428b(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66959fZ().f185304a.mo17428b()).mo50901a("com.google.android.apps.search.lens.user 45377005").mo50907f(), ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60902p(), ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199552hF.mo17428b()).booleanValue(), (C25664y) ((C74176nj) jN).f206836d.f205240aH.mo17428b(), (C37215b) ((C74176nj) jN).f206730b.f198027a.f199167S.mo17428b(), (C25225bd) ((C74176nj) jN).f206677a.a.f203105jf.mo17428b(), (C21370a) ((C74176nj) jN).f206677a.i.mo17428b(), q, bnVar3.f205217L, (C27749al) bnVar3.f205221P.mo17428b(), (Executor) ((C74176nj) jN).f206677a.lL.mo17428b(), (C27794n) ((C74176nj) jN).f206836d.f205315bd.mo17428b(), (C25989d) ((C74176nj) jN).f206836d.f205212G.mo17428b(), (C27781bq) ((C74176nj) jN).f206836d.f205256aX.mo17428b(), (C25050av) ((C74176nj) jN).f206836d.f205210E.mo17428b(), (C25839c) ((C74176nj) jN).f206836d.f205314bc.mo17428b(), (C27761ax) ((C74176nj) jN).f206836d.f205228W.mo17428b(), (Executor) ((C74176nj) jN).f206836d.f205207B.mo17428b(), (C19642a) ((C74176nj) jN).f206836d.f205316be.mo17428b(), (C27655b) ((C74176nj) jN).f206836d.f205260ab.mo17428b(), (C27288ae) ((C74176nj) jN).f206836d.f205263ae.mo17428b(), (C26899d) ((C74176nj) jN).f206836d.f205281aw.mo17428b(), new C26914j(), (C26059ax) ((C74176nj) jN).f206836d.f205225T.mo17428b(), (C26120dc) ((C74176nj) jN).f206836d.f205262ad.mo17428b(), (C25699a) ((C74176nj) jN).f206836d.f205280av.mo17428b(), C68219e.m98518a(((C74176nj) jN).f206836d.f205227V), (C27727d) ((C74176nj) jN).f206836d.f205317bf.mo17428b(), (C28225a) ((C74176nj) jN).f206836d.f205253aU.mo17428b(), (C26980p) ((C74176nj) jN).f206836d.f205248aP.mo17428b(), (C25499ae) ((C74176nj) jN).f206836d.f205247aO.mo17428b(), ((C74176nj) jN).f206836d.mo68985R(), (C26586ff) ((C74176nj) jN).f206836d.f205233aA.mo17428b(), (C58833ax) ((C74176nj) jN).f206836d.f205259aa.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60901o(), (C27232l) ((C74176nj) jN).f206836d.f205441w.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60890d(), ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199598hz.mo17428b()).booleanValue(), ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60899m(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66959fZ().f185304a.mo17428b()).mo50901a("com.google.android.apps.search.lens.user 45375420").mo50907f(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66959fZ().f185304a.mo17428b()).mo50901a("com.google.android.apps.search.lens.user 45377970").mo50907f(), ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60894h());
                            C27424fe feVar = new C27424fe((C25664y) ((C74176nj) jN).f206836d.f205240aH.mo17428b());
                            C27729f fVar = new C27729f((Context) ((C74176nj) jN).f206836d.f205391d.mo17428b());
                            C27424fe feVar2 = feVar;
                            C26885b bVar3 = new C26885b((C37215b) ((C74176nj) jN).f206730b.f198027a.f199167S.mo17428b(), (C60888db) ((C74176nj) jN).f206677a.lL.mo17428b(), ((C74176nj) jN).f206836d.f205264af);
                            C25469b bVar4 = new C25469b((C60888db) ((C74176nj) jN).f206677a.lL.mo17428b());
                            C25469b bVar5 = bVar4;
                            C27696n nVar = new C27696n((Context) ((C74176nj) jN).f206677a.g.mo17428b(), (C60887da) ((C74176nj) jN).f206677a.lH.mo17428b());
                            C69464a aVar6 = ((C74176nj) jN).f206836d.f205280av;
                            C27425ff ffVar = new C27425ff((C27232l) ((C74176nj) jN).f206836d.f205441w.mo17428b());
                            aiVar = this;
                            aiVar.f74696b = new C27384dt(aiVar2, b, accountId, activity, duration, zVar, dbVar, executor, bVar, aVar, oVar, anVar, booleanValue, ajVar, aVar2, eM, context2, bVar2, axVar, acVar, bdVar, aVar3, pVar, sVar, lVar, R.id.lens_info_panel, t, bqVar, (C25050av) ((C74176nj) jN).f206836d.f205210E.mo17428b(), (C27761ax) ((C74176nj) jN).f206836d.f205228W.mo17428b(), (C25537t) ((C74176nj) jN).f206836d.f205273ao.mo17428b(), ((C74176nj) jN).f206836d.mo68996ad(), ((C74176nj) jN).f206836d.mo68984Q(), (C27456i) ((C74176nj) jN).f206836d.f205277as.mo17428b(), (C27232l) ((C74176nj) jN).f206836d.f205441w.mo17428b(), (C27749al) ((C74176nj) jN).f206836d.f205221P.mo17428b(), (C25614p) ((C74176nj) jN).f206836d.f205318bg.mo17428b(), (C26059ax) ((C74176nj) jN).f206836d.f205225T.mo17428b(), (C25684e) ((C74176nj) jN).f206836d.f205219N.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C25989d) ((C74176nj) jN).f206836d.f205212G.mo17428b(), C68219e.m98518a(((C74176nj) jN).f206733bC), (C58833ax) ((C74176nj) jN).f206836d.f205259aa.mo17428b(), C68219e.m98518a(((C74176nj) jN).f206836d.f205319bh), C68219e.m98518a(((C74176nj) jN).f206836d.f205250aR), (C28224z) ((C74176nj) jN).f206836d.f205209D.mo17428b(), feVar2, (C27251j) ((C74176nj) jN).f206836d.f205243aK.mo17428b(), (C24981d) ((C74176nj) jN).f206836d.f205231Z.mo17428b(), C68219e.m98518a(((C74176nj) jN).f206836d.f205278at), ((C74176nj) jN).mo69790gU(), C68219e.m98518a(((C74176nj) jN).f206836d.f205227V), (C28448r) ((C74176nj) jN).f206677a.b.f200191et.mo17428b(), (C25540w) ((C74176nj) jN).f206836d.f205269ak.mo17428b(), ((C74176nj) jN).f206836d.mo68985R(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C27766bb) ((C74176nj) jN).f206836d.f205254aV.mo17428b(), fVar, bVar3, (C25499ae) ((C74176nj) jN).f206836d.f205247aO.mo17428b(), (C25466f) ((C74176nj) jN).f206836d.f205224S.mo17428b(), (C26120dc) ((C74176nj) jN).f206836d.f205262ad.mo17428b(), bVar5, ffVar, (C26789an) ((C74176nj) jN).f206836d.f205258aZ.mo17428b(), ((C74176nj) jN).f206836d.mo69017cS(), ((C46897i) ((C74176nj) jN).f206677a.d.mo67796bt().f185300a.mo17428b()).mo50901a("com.google.android.apps.search.lens.device 45368145").mo50907f(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66959fZ().f185304a.mo17428b()).mo50901a("com.google.android.apps.search.lens.user 45370192").mo50907f(), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C46855i) ((C74176nj) jN).f207083j.mo17428b(), nVar, aVar6, ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60901o(), ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60890d(), ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60904r(), ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60896j(), ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60905s(), ((C74176nj) jN).f206836d.mo69016cR(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66959fZ().f185304a.mo17428b()).mo50901a("com.google.android.apps.search.lens.user 45378496").mo50907f(), ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60894h());
                            super.getLifecycle().mo5790b(new TracedFragmentLifecycle(aiVar.f74698d, aiVar.f74695a));
                        } else {
                            throw new IllegalStateException("Attempt to inject ActivityCreationTimestamp in non-LensView Activity");
                        }
                    } else {
                        String obj = C27384dt.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                C27384dt dtVar = aiVar.f74696b;
                C28102ad.m52384a(dtVar.f74990j);
                dtVar.f74881C.f74787ag = dtVar;
                dtVar.f74883E.mo30555e(dtVar);
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = aiVar.f74698d;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            th = th;
            Throwable th2 = th;
            C47831fm.m85019n();
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
