package com.google.android.apps.gsa.searchnow;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.apps.gsa.plugins.p6468a.p6471c.C84058a;
import com.google.android.apps.gsa.search.shared.overlay.C87660i;
import com.google.android.apps.gsa.search.shared.overlay.C87661j;
import com.google.android.apps.gsa.search.shared.overlay.C87663l;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87625ad;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87632f;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87676ad;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88237uf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88238ug;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88239uh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.searchplate.C88890a;
import com.google.android.apps.gsa.searchplate.C88906ah;
import com.google.android.apps.gsa.searchplate.C88951n;
import com.google.android.apps.gsa.searchplate.SearchPlate;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.shared.monet.C90164ae;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90196b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.p7096a.C90255a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90274c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90275d;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90285a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7106w.C90297b;
import com.google.android.apps.gsa.shared.p6976ag.p6978b.C89106a;
import com.google.android.apps.gsa.shared.p6993ao.C89241f;
import com.google.android.apps.gsa.shared.p6993ao.C89244i;
import com.google.android.apps.gsa.shared.p6993ao.C89245j;
import com.google.android.apps.gsa.shared.p6993ao.C89249n;
import com.google.android.apps.gsa.shared.p6993ao.C89251p;
import com.google.android.apps.gsa.shared.p6993ao.C89252q;
import com.google.android.apps.gsa.shared.p6993ao.C89254s;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7148ui.SuggestionGridLayout;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.search.p7137a.C90483a;
import com.google.android.apps.gsa.shared.util.C90722af;
import com.google.android.apps.gsa.shared.util.C90730an;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.sidekick.shared.overlay.C91896e;
import com.google.android.apps.gsa.sidekick.shared.snackbar.C91919d;
import com.google.android.apps.gsa.staticplugins.opa.continuation.AcpPlateLayout;
import com.google.android.apps.gsa.staticplugins.opa.continuation.C108500b;
import com.google.android.apps.gsa.staticplugins.opa.continuation.C108501c;
import com.google.android.apps.gsa.staticplugins.opa.continuation.C108503e;
import com.google.android.apps.gsa.staticplugins.opa.continuation.C108504f;
import com.google.android.apps.gsa.staticplugins.opa.continuation.C108505g;
import com.google.android.apps.gsa.staticplugins.opa.continuation.C108506h;
import com.google.android.apps.gsa.staticplugins.opa.continuation.C108508j;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139701a;
import com.google.android.apps.search.lens.p10547a.C139921f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39193b;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.amo;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.io.IOException;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.searchnow.am */
/* compiled from: PG */
public final class C88861am implements C90483a, C90991b {

    /* renamed from: A */
    public final C139701a f240571A;

    /* renamed from: B */
    public final C139921f f240572B;

    /* renamed from: C */
    public final C91919d f240573C;

    /* renamed from: D */
    public final C68214a f240574D;

    /* renamed from: E */
    Intent f240575E;

    /* renamed from: F */
    public Rect f240576F = new Rect();

    /* renamed from: G */
    public final C88862an f240577G;

    /* renamed from: H */
    public final amo f240578H;

    /* renamed from: I */
    public boolean f240579I;

    /* renamed from: J */
    public boolean f240580J;

    /* renamed from: K */
    public boolean f240581K;

    /* renamed from: L */
    public Query f240582L = null;

    /* renamed from: M */
    public C90208n f240583M;

    /* renamed from: N */
    C87676ad f240584N;

    /* renamed from: O */
    C90285a f240585O;

    /* renamed from: P */
    C90196b f240586P;

    /* renamed from: Q */
    C90297b f240587Q;

    /* renamed from: R */
    C90255a f240588R;

    /* renamed from: S */
    public int f240589S = 0;

    /* renamed from: T */
    public C90275d f240590T;

    /* renamed from: U */
    public final C91896e f240591U;

    /* renamed from: V */
    public final C90274c f240592V;

    /* renamed from: W */
    public boolean f240593W;

    /* renamed from: X */
    private final C89251p f240594X;

    /* renamed from: Y */
    private final ViewTreeObserver.OnGlobalLayoutListener f240595Y;

    /* renamed from: Z */
    private final C58833ax f240596Z;

    /* renamed from: a */
    public final C21370a f240597a;

    /* renamed from: aa */
    private C90208n f240598aa;

    /* renamed from: ab */
    private Boolean f240599ab;

    /* renamed from: ac */
    private boolean f240600ac;

    /* renamed from: b */
    public final Context f240601b;

    /* renamed from: c */
    public final C88863ao f240602c;

    /* renamed from: d */
    public final C87625ad f240603d;

    /* renamed from: e */
    public final C91097g f240604e;

    /* renamed from: f */
    public final ViewGroup f240605f;

    /* renamed from: g */
    public final C88864ap f240606g;

    /* renamed from: h */
    public final SearchNowDrawerLayout f240607h;

    /* renamed from: i */
    public final C68214a f240608i;

    /* renamed from: j */
    public final C58833ax f240609j;

    /* renamed from: k */
    public final C90164ae f240610k;

    /* renamed from: l */
    public final C90164ae f240611l;

    /* renamed from: m */
    public final C90164ae f240612m;

    /* renamed from: n */
    public final C90164ae f240613n;

    /* renamed from: o */
    public final C90164ae f240614o;

    /* renamed from: p */
    public final C68214a f240615p;

    /* renamed from: q */
    public final C89244i f240616q;

    /* renamed from: r */
    public final C89106a f240617r;

    /* renamed from: s */
    public boolean f240618s;

    /* renamed from: t */
    public boolean f240619t;

    /* renamed from: u */
    public boolean f240620u;

    /* renamed from: v */
    public final View f240621v;

    /* renamed from: w */
    public final C91142g f240622w;

    /* renamed from: x */
    public final C87682aj f240623x;

    /* renamed from: y */
    public final C90476a f240624y;

    /* renamed from: z */
    public final C88848a f240625z;

    public C88861am(C21370a aVar, Context context, C58833ax axVar, C88863ao aoVar, View view, C91142g gVar, C91097g gVar2, C87625ad adVar, amo amo, C68214a aVar2, C88864ap apVar, C88862an anVar, C58833ax axVar2, C90164ae aeVar, C90164ae aeVar2, C90164ae aeVar3, C90164ae aeVar4, C90164ae aeVar5, C89106a aVar3, C68214a aVar4, C90476a aVar5, C58833ax axVar3, C89251p pVar, C89245j jVar, C88848a aVar6, C91919d dVar, C139701a aVar7, C139921f fVar, C68214a aVar8) {
        View view2 = view;
        C91142g gVar3 = gVar;
        C91097g gVar4 = gVar2;
        C87625ad adVar2 = adVar;
        C58833ax axVar4 = axVar2;
        C90164ae aeVar6 = aeVar;
        C90164ae aeVar7 = aeVar2;
        C90164ae aeVar8 = aeVar3;
        C90164ae aeVar9 = aeVar4;
        C90164ae aeVar10 = aeVar5;
        C89251p pVar2 = pVar;
        C89245j jVar2 = jVar;
        C88850ab abVar = new C88850ab(this);
        this.f240595Y = abVar;
        this.f240597a = aVar;
        this.f240601b = context;
        this.f240602c = aoVar;
        this.f240621v = view2;
        this.f240622w = gVar3;
        this.f240604e = gVar4;
        this.f240603d = adVar2;
        this.f240578H = amo;
        this.f240577G = anVar;
        this.f240606g = apVar;
        this.f240608i = aVar2;
        this.f240615p = aVar4;
        this.f240624y = aVar5;
        this.f240596Z = axVar3;
        this.f240594X = pVar2;
        C88906ah ahVar = adVar2.f236779I;
        C88951n nVar = adVar2.f236778H.f240740m;
        C88889z zVar = new C88889z(adVar2);
        C87661j jVar3 = (C87661j) jVar2.f241990a.mo17428b();
        jVar3.getClass();
        C89254s sVar = (C89254s) jVar2.f241991b.mo17428b();
        sVar.getClass();
        C89251p pVar3 = (C89251p) jVar2.f241992c.mo17428b();
        pVar3.getClass();
        C89241f fVar2 = (C89241f) jVar2.f241993d.mo17428b();
        fVar2.getClass();
        ahVar.getClass();
        nVar.getClass();
        this.f240616q = new C89249n(jVar3, sVar, pVar3, fVar2, ahVar, nVar, zVar);
        this.f240625z = aVar6;
        this.f240573C = dVar;
        this.f240571A = aVar7;
        this.f240572B = fVar;
        this.f240574D = aVar8;
        if (view.getBackground() instanceof C88890a) {
            C88890a aVar9 = (C88890a) view.getBackground();
        }
        context.getClass();
        Rect rect = this.f240576F;
        rect.getClass();
        C89252q a = pVar2.mo83205a(C90208n.INTERESTS_TAB);
        gVar.getClass();
        boolean j = gVar3.mo85405j(C90010bp.f246987bc);
        gVar.getClass();
        this.f240591U = new C91896e(context, rect, a, j, gVar3.mo85405j(C89972ak.f246527B));
        this.f240592V = new C88855ag(this);
        SearchNowDrawerLayout searchNowDrawerLayout = (SearchNowDrawerLayout) view2.findViewById(R.id.navigation_drawer_layout);
        this.f240607h = searchNowDrawerLayout;
        boolean z = true;
        searchNowDrawerLayout.mo5464m(1);
        View g = searchNowDrawerLayout.mo5456g(8388611);
        if (g != null) {
            searchNowDrawerLayout.mo5462k(g, false);
            view.getViewTreeObserver().addOnGlobalLayoutListener(abVar);
            adVar2.mo81769B(new C88860al(this));
            C88859ak akVar = new C88859ak(this);
            this.f240623x = akVar;
            adVar2.f236773C.mo81940l(akVar, C88244um.INIT_NOW_UI, C88244um.FORCE_CLOSE);
            C88890a aVar10 = adVar2.f236777G.f236924b;
            aVar10.f240792d = true;
            aVar10.invalidateSelf();
            Window window = aoVar.getWindow();
            if (adVar2.f236805aH != window) {
                adVar2.f236805aH = window;
                adVar2.mo81805al(adVar2.f236831ah != 1 ? false : z);
            }
            C87676ad adVar3 = new C87676ad(adVar2.f236773C, gVar4, axVar);
            this.f240584N = adVar3;
            adVar3.mo81956b();
            this.f240609j = axVar4;
            this.f240610k = aeVar6;
            aeVar6.f251927a = new C88858aj(this);
            aeVar.mo83912a();
            ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.fullscreen_container);
            viewGroup.getClass();
            C90730an.m148190c(axVar4, new C88849aa(viewGroup));
            this.f240611l = aeVar7;
            ViewGroup viewGroup2 = (ViewGroup) view2.findViewById(R.id.bottom_bar_container);
            viewGroup2.getClass();
            this.f240605f = viewGroup2;
            aeVar7.f251927a = new C88851ac(this);
            aeVar2.mo83912a();
            C90164ae aeVar11 = aeVar3;
            this.f240612m = aeVar11;
            aeVar11.f251927a = new C88852ad(this);
            aeVar3.mo83912a();
            C90164ae aeVar12 = aeVar4;
            this.f240613n = aeVar12;
            ViewGroup viewGroup3 = (ViewGroup) view2.findViewById(R.id.search_plate_tooltip_container);
            viewGroup3.getClass();
            aeVar12.f251927a = new C88853ae(this, viewGroup3);
            aeVar4.mo83912a();
            C90164ae aeVar13 = aeVar5;
            this.f240614o = aeVar13;
            aeVar13.f251927a = new C88854af(this);
            aeVar5.mo83912a();
            this.f240617r = aVar3;
            this.f240618s = false;
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity ".concat(String.valueOf(DrawerLayout.m6032j(8388611))));
    }

    /* renamed from: o */
    private final void m144281o(boolean z) {
        this.f240579I = z;
        this.f240603d.f236809aL = z;
    }

    /* renamed from: Q */
    public final void mo81784Q(Intent intent, Bundle bundle) {
        throw null;
    }

    /* renamed from: T */
    public final void mo81787T(Bundle bundle) {
        throw null;
    }

    /* renamed from: U */
    public final void mo81788U() {
        throw null;
    }

    /* renamed from: V */
    public final void mo81789V(Bundle bundle) {
        throw null;
    }

    /* renamed from: W */
    public final void mo81790W() {
        throw null;
    }

    /* renamed from: X */
    public final void mo81791X(boolean z) {
        throw null;
    }

    /* renamed from: Y */
    public final void mo81792Y(boolean z) {
        throw null;
    }

    /* renamed from: a */
    public final C90208n mo82641a(Intent intent, Bundle bundle, boolean z) {
        C90208n nVar;
        if (bundle != null) {
            return C90208n.m146767a(bundle.getInt("search_now_overlay:initial_tab_type", 1));
        }
        if (intent.hasExtra("lobby_initial_tab")) {
            return C90208n.m146767a(intent.getIntExtra("lobby_initial_tab", 1));
        }
        if (z || !intent.getBooleanExtra("use-consistent-resume", false) || mo82651l()) {
            nVar = C90208n.INTERESTS_TAB;
        } else {
            nVar = this.f240583M;
        }
        return nVar == null ? C90208n.INTERESTS_TAB : nVar;
    }

    /* renamed from: an */
    public final boolean mo81807an() {
        throw null;
    }

    /* renamed from: ao */
    public final void mo81808ao() {
        throw null;
    }

    /* renamed from: ap */
    public final void mo81809ap() {
        throw null;
    }

    /* renamed from: b */
    public final void mo82642b() {
        C90255a aVar = this.f240588R;
        if (aVar != null) {
            aVar.mo83969a();
        }
    }

    /* renamed from: c */
    public final void mo82643c() {
        C90297b bVar = this.f240587Q;
        if (bVar != null) {
            bVar.mo83992a();
        }
    }

    /* renamed from: e */
    public final void mo82644e(Bundle bundle) {
        if (!this.f240600ac) {
            this.f240600ac = true;
            if (bundle.containsKey("search_now_overlay:launched_in_text_search_mode")) {
                m144281o(bundle.getBoolean("search_now_overlay:launched_in_text_search_mode"));
            }
            if (bundle.containsKey("search_now_overlay:launched_in_voice_search_mode")) {
                this.f240580J = bundle.getBoolean("search_now_overlay:launched_in_voice_search_mode");
            }
            if (bundle.containsKey("search_now_overlay:search_mode_ended")) {
                this.f240593W = bundle.getBoolean("search_now_overlay:search_mode_ended");
            }
        }
    }

    /* renamed from: f */
    public final void mo82645f() {
        C90285a aVar;
        C90208n nVar = this.f240598aa;
        if (nVar != null && nVar != this.f240583M && (aVar = this.f240585O) != null && this.f240586P != null) {
            aVar.mo83986c();
            C90196b bVar = this.f240586P;
            bVar.getClass();
            C90208n nVar2 = this.f240598aa;
            nVar2.getClass();
            bVar.mo83939c(nVar2);
            this.f240583M = this.f240598aa;
            this.f240598aa = null;
        }
    }

    /* renamed from: g */
    public final void mo82646g(C90208n nVar) {
        this.f240616q.mo83201a(nVar);
        C91896e eVar = this.f240591U;
        if (!(eVar == null || nVar == C90208n.SEARCH_TAB)) {
            eVar.f256236h = nVar;
        }
        this.f240625z.mo82638a(nVar);
        this.f240583M = nVar;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchNowOverlay");
        fVar.mo85286m(this.f240603d);
        fVar.mo85286m(this.f240606g);
        fVar.mo85279c("launched in text search mode").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f240579I)));
        fVar.mo85279c("launched in voice search mode").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f240580J)));
        fVar.mo85279c("intent to handle set").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f240575E != null)));
        C90730an.m148190c(this.f240609j, new C88882s(fVar));
    }

    /* renamed from: h */
    public final void mo82647h(Intent intent, Bundle bundle, boolean z) {
        C87625ad adVar;
        C87625ad adVar2;
        C87663l lVar;
        Intent intent2 = intent;
        Bundle bundle2 = bundle;
        if (!z && intent2 != null && intent2.getBooleanExtra("reuse_search_now_activity", false)) {
            C90208n a = mo82641a(intent2, (Bundle) null, false);
            if (a == C90208n.NO_TAB) {
                C90285a aVar = this.f240585O;
                if (aVar != null) {
                    aVar.mo83986c();
                }
            } else if (a != this.f240583M) {
                C90285a aVar2 = this.f240585O;
                if (aVar2 == null || this.f240586P == null) {
                    this.f240598aa = a;
                    return;
                }
                if (aVar2.mo83984a() != a) {
                    C90285a aVar3 = this.f240585O;
                    aVar3.getClass();
                    aVar3.mo83986c();
                    C90196b bVar = this.f240586P;
                    bVar.getClass();
                    bVar.mo83939c(a);
                } else {
                    C90285a aVar4 = this.f240585O;
                    aVar4.getClass();
                    aVar4.mo83988e();
                }
                this.f240583M = a;
                this.f240598aa = null;
                return;
            } else {
                return;
            }
        }
        this.f240575E = intent2;
        this.f240581K = false;
        if (intent2 != null) {
            boolean z2 = z && this.f240622w.mo85405j(C90029ch.f248235aV) && intent2.getBooleanExtra("show_acp_plate", false);
            this.f240618s = z2;
            if (z2) {
                C89106a aVar5 = this.f240617r;
                Context context = this.f240601b;
                FrameLayout frameLayout = (FrameLayout) this.f240621v.findViewById(R.id.assistant_plate_container);
                String stringExtra = intent2.getStringExtra("parent-event-id");
                long intExtra = (long) intent2.getIntExtra("acp_plate_timeout_millis", 0);
                byte[] byteArrayExtra = this.f240622w.mo85405j(C90029ch.f248236aW) ? intent2.getByteArrayExtra("acp_suggestions") : null;
                C108508j jVar = (C108508j) aVar5;
                jVar.f301911c = frameLayout;
                LayoutInflater.from(context).inflate(R.layout.assistant_plate, jVar.f301911c, true);
                frameLayout.setVisibility(0);
                jVar.f301912d = (AcpPlateLayout) frameLayout.findViewById(R.id.assistant_plate);
                AcpPlateLayout acpPlateLayout = jVar.f301912d;
                C28292j jVar2 = new C28292j(100797);
                jVar2.mo33795i(5);
                jVar2.mo33795i(22);
                C28295m.m52919e(acpPlateLayout, jVar2);
                if (jVar.f301913e == null) {
                    jVar.f301913e = jVar.f301912d.findViewById(R.id.snapshot_icon);
                    C89941l.m146512c(jVar.f301913e, 100648);
                    jVar.f301913e.setOnClickListener(new C89943l(new C108503e(jVar, context)));
                }
                if (jVar.f301914f == null) {
                    jVar.f301914f = jVar.f301912d.findViewById(R.id.mic_icon);
                    C89941l.m146512c(jVar.f301914f, 100649);
                    jVar.f301914f.setOnClickListener(new C89943l(new C108504f(jVar, context)));
                }
                if (jVar.f301915g == null) {
                    jVar.f301915g = jVar.f301912d.findViewById(R.id.keyboard_icon);
                    C89941l.m146512c(jVar.f301915g, 100650);
                    jVar.f301915g.setOnClickListener(new C89943l(new C108505g(jVar, context)));
                }
                if (intExtra != 0) {
                    C22871g gVar = jVar.f301910b;
                    AcpPlateLayout acpPlateLayout2 = jVar.f301912d;
                    Objects.requireNonNull(acpPlateLayout2);
                    jVar.f301916h = gVar.mo28208h("dismissAcpPlateLayout", intExtra, new C108506h(acpPlateLayout2));
                }
                if (byteArrayExtra != null) {
                    try {
                        C58485gu j = C58485gu.m89842j(((C51986gl) C62942bv.parseFrom((C62942bv) C51986gl.f136421f, byteArrayExtra)).f136424b);
                        Collection.EL.stream(j).map(C108500b.f301895a).collect(Collectors.joining(", "));
                        ViewGroup viewGroup = (ViewGroup) ((C108508j) aVar5).f301912d.findViewById(R.id.suggestions);
                        viewGroup.removeAllViews();
                        int size = j.size();
                        for (int i = 0; i < size; i++) {
                            C51992gr grVar = (C51992gr) j.get(i);
                            TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.acp_suggestion_chip, viewGroup, false);
                            C89941l.m146512c(textView, (grVar.f136447a & 4) != 0 ? grVar.f136450d : 27105);
                            textView.setOnClickListener(new C89943l(new C108501c((C108508j) aVar5, context, grVar)));
                            textView.setText(grVar.f136451e);
                            viewGroup.addView(textView);
                        }
                    } catch (C62974ct e) {
                        ((C58970a) ((C58970a) ((C58970a) C108508j.f301909a.mo56226d()).mo56382g(e)).mo56372aa(24080)).mo56386p("Failed to parse suggestion arguments.");
                    }
                }
                C60321oe a2 = C28285c.m52874a(jVar.f301912d, 101679);
                if (a2 != null) {
                    if (stringExtra == null) {
                        C89949q.m146521e(a2, false);
                    } else {
                        try {
                            C60220t b = C28294l.m52912b(stringExtra);
                            C60320od odVar = (C60320od) a2.toBuilder();
                            C60217q qVar = (C60217q) C60218r.f162925d.createBuilder();
                            qVar.copyOnWrite();
                            C60218r rVar = (C60218r) qVar.instance;
                            b.getClass();
                            rVar.f162928b = b;
                            rVar.f162927a |= 1;
                            odVar.copyOnWrite();
                            C60321oe oeVar = (C60321oe) odVar.instance;
                            C60218r rVar2 = (C60218r) qVar.build();
                            rVar2.getClass();
                            oeVar.f163229d = rVar2;
                            oeVar.f163226a |= 2;
                            aql aql = (aql) aqm.f159760n.createBuilder();
                            aql.copyOnWrite();
                            aqm aqm = (aqm) aql.instance;
                            aqm.f159762a |= 8;
                            aqm.f159766e = 0;
                            aql.copyOnWrite();
                            aqm aqm2 = (aqm) aql.instance;
                            aqm2.f159762a |= 4;
                            aqm2.f159765d = 23263;
                            odVar.copyOnWrite();
                            C60321oe oeVar2 = (C60321oe) odVar.instance;
                            aqm aqm3 = (aqm) aql.build();
                            aqm3.getClass();
                            oeVar2.f163230e = aqm3;
                            oeVar2.f163226a |= 16;
                            odVar.copyOnWrite();
                            C60321oe oeVar3 = (C60321oe) odVar.instance;
                            oeVar3.f163231f = 3;
                            oeVar3.f163226a |= 32;
                            a2 = (C60321oe) odVar.build();
                        } catch (IOException e2) {
                            ((C58970a) ((C58970a) ((C58970a) C108508j.f301909a.mo56225c()).mo56382g(e2)).mo56372aa(24077)).mo56386p("Failed to parse event id.");
                        }
                        C89949q.m146521e(a2, false);
                    }
                }
            }
            boolean b2 = C90722af.m148174b(intent);
            if (intent.getExtras() == null && intent.getData() != null) {
                Uri data = intent.getData();
                String authority = (!TextUtils.equals(data.getScheme(), "search") || TextUtils.isEmpty(data.getAuthority())) ? null : data.getAuthority();
                if (authority != null) {
                    intent2.putExtra("velvet-query", Query.f252741b.mo84268aE(authority, false));
                    intent2.putExtra("commit-query", true);
                }
            }
            this.f240582L = C84058a.m133962a(intent);
            boolean b3 = C84058a.m133963b(intent);
            boolean booleanExtra = intent2.getBooleanExtra("use-consistent-resume", false);
            if (bundle2 == null || !booleanExtra) {
                if (this.f240599ab == null || !booleanExtra) {
                    this.f240599ab = Boolean.valueOf(!C89429a.m145466x(intent) && !C89429a.m145460r(intent) && !b2 && (this.f240582L == null || !b3));
                }
                this.f240580J = this.f240599ab.booleanValue() && C89429a.m145467y(intent);
                m144281o(this.f240599ab.booleanValue() && !this.f240580J);
            } else {
                mo82644e(bundle2);
                this.f240599ab = Boolean.valueOf(this.f240579I || this.f240580J);
            }
            this.f240603d.mo81818n(C39193b.m68624a(intent), false);
            this.f240603d.mo81795ab(true);
            C90208n a3 = mo82641a(intent2, bundle2, false);
            this.f240583M = a3;
            if (!(bundle2 != null || a3 == C90208n.UNKNOWN_TAB || a3 == C90208n.INTERESTS_TAB || a3 == C90208n.SEARCH_TAB || a3 == C90208n.NO_TAB)) {
                this.f240603d.f236879u.setVisibility(4);
            }
            if (bundle2 == null && z && a3 == C90208n.INTERESTS_TAB && (lVar = adVar2.f236837an) != null) {
                SearchPlate searchPlate = (adVar2 = this.f240603d).f236778H;
                Objects.requireNonNull(lVar);
                searchPlate.f240731d = new C87632f(lVar);
            }
            if (bundle2 == null && this.f240596Z.mo56113h()) {
                int intExtra2 = intent2.getIntExtra("extra_sna_bootstrap_source", 0);
                C87673aa aaVar = this.f240603d.f236773C;
                C88489j jVar3 = new C88489j(C87739bu.SEARCH_NOW_ACTIVITY_BOOTSTRAPPED);
                C62940bt btVar = C88239uh.f238494a;
                C88237uf ufVar = (C88237uf) C88238ug.f238487f.createBuilder();
                boolean booleanValue = ((Boolean) this.f240596Z.mo56107c()).booleanValue();
                ufVar.copyOnWrite();
                C88238ug ugVar = (C88238ug) ufVar.instance;
                ugVar.f238489a |= 1;
                ugVar.f238490b = booleanValue;
                boolean z3 = intExtra2 == 1;
                ufVar.copyOnWrite();
                C88238ug ugVar2 = (C88238ug) ufVar.instance;
                ugVar2.f238489a |= 2;
                ugVar2.f238491c = z3;
                boolean z4 = intExtra2 == 2;
                ufVar.copyOnWrite();
                C88238ug ugVar3 = (C88238ug) ufVar.instance;
                ugVar3.f238489a |= 4;
                ugVar3.f238492d = z4;
                boolean z5 = intExtra2 == 3;
                ufVar.copyOnWrite();
                C88238ug ugVar4 = (C88238ug) ufVar.instance;
                ugVar4.f238489a |= 8;
                ugVar4.f238493e = z5;
                jVar3.mo82014b(btVar, (C88238ug) ufVar.build());
                aaVar.mo81937i(jVar3.mo82013a());
            }
            this.f240625z.mo82638a(a3);
            if ((!booleanExtra || z) && !this.f240599ab.booleanValue() && a3 == C90208n.INTERESTS_TAB && (adVar = this.f240603d) != null && adVar.f236879u != null) {
                int dimensionPixelSize = this.f240621v.getResources().getDimensionPixelSize(true != this.f240622w.mo85405j(C90010bp.f246987bc) ? R.dimen.now_header_height_resized_small : R.dimen.now_header_height_resized_mini);
                C87625ad adVar3 = this.f240603d;
                adVar3.f236879u.setTranslationY((float) (dimensionPixelSize - adVar3.f236778H.f240703a.f241535a));
            }
            if (bundle2 != null) {
                this.f240582L = null;
            } else if (b2) {
                this.f240603d.f236773C.mo81946r(C90722af.m148173a(intent), (Bundle) null, C88431bb.f239082a);
            } else if (this.f240582L != null && b3) {
                C87673aa aaVar2 = this.f240603d.f236773C;
                Query a4 = C84058a.m133962a(intent);
                if (intent2.getBooleanExtra("recognized_voice_query", false)) {
                    if (a4 == null) {
                        a4 = Query.f252741b;
                    }
                    CharSequence charSequence = a4.f252768g;
                    C90498f i2 = a4.mo84480i();
                    i2.mo84562U(1);
                    i2.mo84572d(1024, 0);
                    i2.mo84572d(0, 2048);
                    i2.mo84573e(0, 32768);
                    i2.mo84561T(QueryTriggerType.USER);
                    i2.mo84564W(0);
                    i2.mo84546E(charSequence);
                    a4 = i2.mo84568a();
                }
                if (a4 != null && C84058a.m133963b(intent)) {
                    if (a4.mo84355bn() == null) {
                        a4 = a4.mo84275aL("and.gsa.searchnow");
                    }
                    if (a4.f252760R == null) {
                        a4 = a4.mo84272aI(amo.SEARCH_NOW);
                    }
                    aaVar2.mo81931b(a4);
                }
                this.f240603d.f236773C.mo81947s(intent.getExtras());
            }
        }
    }

    /* renamed from: i */
    public final void mo82648i() {
        C90196b bVar = this.f240586P;
        int a = bVar != null ? bVar.mo83937a() : 0;
        SuggestionGridLayout suggestionGridLayout = this.f240603d.f236881w;
        if (suggestionGridLayout != null) {
            suggestionGridLayout.f253366c = this.f240576F.bottom;
            suggestionGridLayout.setPadding(suggestionGridLayout.getPaddingLeft(), suggestionGridLayout.getPaddingTop(), suggestionGridLayout.getPaddingRight(), a);
        }
    }

    /* renamed from: k */
    public final void mo82650k() {
        C87625ad adVar = this.f240603d;
        boolean z = true;
        boolean z2 = !mo82653n();
        if (adVar.f236806aI != z2) {
            adVar.f236806aI = z2;
            if (!z2 && !adVar.f236877s.f236745j) {
                z = false;
            }
            C87660i iVar = adVar.f236777G;
            if (iVar.f236928f != z) {
                iVar.f236928f = z;
                iVar.mo81855b(false);
            }
            iVar.f236929g = z;
        }
    }

    /* renamed from: l */
    public final boolean mo82651l() {
        Intent intent = this.f240575E;
        return intent != null && intent.getBooleanExtra("consistent-resume-timed-out", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo82652m() {
        return this.f240579I || this.f240580J;
    }

    /* renamed from: n */
    public final boolean mo82653n() {
        return mo82652m() && !this.f240593W;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r0 != false) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82649j() {
        /*
            r5 = this;
            com.google.android.apps.gsa.searchnow.a r0 = r5.f240625z
            int r1 = r5.f240589S
            r2 = 2
            r3 = 107(0x6b, float:1.5E-43)
            r4 = 3
            if (r1 == r2) goto L_0x001e
            if (r1 == r4) goto L_0x0018
            r2 = 4
            if (r1 == r2) goto L_0x0010
            goto L_0x0025
        L_0x0010:
            com.google.android.apps.gsa.sidekick.shared.c.e r0 = r0.f240556a
            r1 = 108(0x6c, float:1.51E-43)
            r0.mo86057v(r1)
            goto L_0x0025
        L_0x0018:
            com.google.android.apps.gsa.sidekick.shared.c.e r0 = r0.f240556a
            r0.mo86057v(r3)
            goto L_0x0025
        L_0x001e:
            com.google.android.apps.gsa.sidekick.shared.c.e r0 = r0.f240556a
            r1 = 106(0x6a, float:1.49E-43)
            r0.mo86057v(r1)
        L_0x0025:
            boolean r0 = r5.f240580J
            r1 = 1
            if (r0 == 0) goto L_0x002e
            boolean r2 = r5.f240593W
            if (r2 == 0) goto L_0x0034
        L_0x002e:
            int r2 = r5.f240589S
            if (r2 != r4) goto L_0x0040
            if (r0 == 0) goto L_0x0044
        L_0x0034:
            boolean r0 = r5.f240593W
            if (r0 != 0) goto L_0x0044
            com.google.android.apps.gsa.searchnow.a r0 = r5.f240625z
            com.google.android.apps.gsa.sidekick.shared.c.e r0 = r0.f240556a
            r0.mo86057v(r3)
            goto L_0x0044
        L_0x0040:
            boolean r1 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90293i.m146825a(r2)
        L_0x0044:
            com.google.android.apps.gsa.shared.monet.b.r.d r0 = r5.f240590T
            if (r0 == 0) goto L_0x004b
            r0.mo83978a(r1)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchnow.C88861am.mo82649j():void");
    }
}
