package com.google.android.apps.gsa.staticplugins.opa.p8369hq;

import android.accounts.AccountsException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0395p;
import android.support.p033v7.app.C0401v;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.c.b;
import com.google.android.apps.gsa.assistant.settings.hq.aq;
import com.google.android.apps.gsa.assistant.settings.hq.s;
import com.google.android.apps.gsa.assistant.settings.p5781hq.C73705ah;
import com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.network.LifecycleAware;
import com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.p5784c.C73602a;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.p5829r.C73906a;
import com.google.android.apps.gsa.assistant.shared.p5830s.C73908b;
import com.google.android.apps.gsa.binaries.satin.app.afn;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.nga.api.C74715bp;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86314e;
import com.google.android.apps.gsa.search.shared.p6930h.C87559b;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.logger.C89838ab;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90064dp;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.apps.gsa.shared.util.C90779c;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.opa.C109467mf;
import com.google.android.apps.gsa.staticplugins.opa.C109739nm;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.staticplugins.opa.p8338bh.p8339a.C108066a;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109226an;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113720h;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113721i;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114513a;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114514b;
import com.google.android.apps.gsa.staticplugins.opa.util.C113766ai;
import com.google.android.apps.gsa.staticplugins.opa.util.C113768ak;
import com.google.android.apps.gsa.staticplugins.opa.util.C113809by;
import com.google.android.apps.gsa.staticplugins.opa.util.C113810bz;
import com.google.android.apps.gsa.staticplugins.opa.util.C113863cr;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8597b.C113954b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.lens.view.p2162s.C27683a;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.inject.C47266f;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50639b;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50654q;
import com.google.common.base.C58833ax;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60218r;
import dagger.C68214a;
import dagger.p5294a.C68219e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hq.OpaHqActivity */
/* compiled from: PG */
public class OpaHqActivity extends C0395p implements s {

    /* renamed from: j */
    public static final C59071e f304069j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.hq.OpaHqActivity");

    /* renamed from: A */
    public C22871g f304070A;

    /* renamed from: B */
    public C113954b f304071B;

    /* renamed from: C */
    public C73906a f304072C;

    /* renamed from: D */
    public C58833ax f304073D;

    /* renamed from: E */
    public C108013bm f304074E;

    /* renamed from: F */
    public C21370a f304075F;

    /* renamed from: G */
    public C109739nm f304076G;

    /* renamed from: H */
    public C73908b f304077H;

    /* renamed from: I */
    public C114513a f304078I;

    /* renamed from: J */
    C86314e f304079J;

    /* renamed from: K */
    public C91090a f304080K;

    /* renamed from: L */
    public C68214a f304081L;

    /* renamed from: M */
    public Context f304082M;

    /* renamed from: N */
    C109225am f304083N = new C109225am();

    /* renamed from: O */
    private PopupMenu.OnMenuItemClickListener f304084O;

    /* renamed from: P */
    private ViewGroup f304085P;

    /* renamed from: Q */
    private View f304086Q;

    /* renamed from: R */
    private View f304087R;

    /* renamed from: S */
    private ImageView f304088S;

    /* renamed from: T */
    private boolean f304089T;

    /* renamed from: U */
    private String f304090U = null;

    /* renamed from: V */
    private int f304091V = -1;

    /* renamed from: W */
    private int f304092W = -1;

    /* renamed from: X */
    private int f304093X = -1;

    /* renamed from: Y */
    private int f304094Y = -1;

    /* renamed from: Z */
    private int f304095Z;

    /* renamed from: aa */
    private boolean f304096aa;

    /* renamed from: ab */
    private C113809by f304097ab;

    /* renamed from: k */
    public C58833ax f304098k;

    /* renamed from: l */
    public C90929bz f304099l;

    /* renamed from: m */
    public C90465g f304100m;

    /* renamed from: n */
    public C113863cr f304101n;

    /* renamed from: o */
    public SharedPreferences f304102o;

    /* renamed from: p */
    public C114514b f304103p;

    /* renamed from: q */
    public C86124t f304104q;

    /* renamed from: r */
    public C68214a f304105r;

    /* renamed from: s */
    public C68214a f304106s;

    /* renamed from: t */
    public C68214a f304107t;

    /* renamed from: u */
    public C68214a f304108u;

    /* renamed from: v */
    public bm f304109v;

    /* renamed from: w */
    public C68214a f304110w;

    /* renamed from: x */
    public C58833ax f304111x;

    /* renamed from: y */
    public C58833ax f304112y;

    /* renamed from: z */
    public C73602a f304113z;

    /* renamed from: A */
    private final void m181738A(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("account_name");
            if (!TextUtils.isEmpty(stringExtra)) {
                String F = ((C86054o) this.f304106s.mo27525b()).mo79659F();
                if (F == null || !F.equals(stringExtra)) {
                    try {
                        ((C86054o) this.f304106s.mo27525b()).mo79686t(stringExtra);
                        Toast.makeText(this, getString(R.string.hq_account_switch_prompt, new Object[]{stringExtra}), 0).show();
                    } catch (AccountsException e) {
                        C59104x c = f304069j.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "OpaHQActivity");
                        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24628)).mo56386p("error setting account");
                    }
                }
            }
        }
    }

    /* renamed from: B */
    private final void m181739B() {
        int i;
        if (this.f304104q.mo79746e(C90014bt.f247448hO)) {
            if (m181746I()) {
                i = this.f304095Z + ((int) C91115n.m148870b((float) this.f304104q.mo79743a(C90014bt.f247445hL), this.f304082M));
            } else {
                i = this.f304095Z;
            }
            ViewGroup viewGroup = this.f304085P;
            viewGroup.setPadding(viewGroup.getPaddingLeft(), this.f304085P.getPaddingTop(), this.f304085P.getPaddingRight(), i);
        }
    }

    /* renamed from: C */
    private final void m181740C(Fragment fragment, String str) {
        C0154a aVar = new C0154a(mo545jw());
        aVar.mo689v(R.id.fragment_container, fragment, str);
        aVar.f814j = 4099;
        aVar.mo505b(false);
    }

    /* renamed from: D */
    private final void m181741D(int i) {
        C58976aa aaVar = C58975e.f156826a;
        View view = this.f304086Q;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: E */
    private final void m181742E(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f304104q.mo79746e(C90014bt.f247296eV) || (!this.f304102o.getBoolean("opa_hq_ever_triggered", false) && this.f304104q.mo79746e(C90014bt.f247615kW) && intent != null && TextUtils.equals(intent.getStringExtra("caller"), "caller.gn"))) {
            m181741D(8);
            m181751z(false);
            Bundle bundle = new Bundle();
            bundle.putBoolean("ww", true);
            Fragment a = this.f304083N.mo97682a("Webview");
            a.setArguments(bundle);
            m181740C(a, "Webview");
        } else if (intent == null || intent.getExtras() == null || !intent.getExtras().containsKey("section")) {
            mo97668v(intent);
        } else {
            C73705ah.m108226a(this, this.f304099l, (C84413ad) this.f304105r.mo27525b(), new LifecycleAware.NamedUiFutureCallbackWrapper(getLifecycle(), new C109224al(this)));
        }
    }

    /* renamed from: F */
    private final boolean m181743F() {
        return this.f304104q.mo79746e(C90014bt.f247252de);
    }

    /* renamed from: G */
    private final boolean m181744G() {
        return this.f304104q.mo79758x(C90064dp.f249652b).equals("EXPLORE");
    }

    /* renamed from: H */
    private final boolean m181745H() {
        return this.f304104q.mo79746e(C90014bt.f247253df) || m181744G();
    }

    /* renamed from: I */
    private final boolean m181746I() {
        return this.f304104q.mo79746e(C90014bt.f247448hO) && this.f304073D.mo56113h() && ((C74715bp) this.f304073D.mo56107c()).mo71084e();
    }

    /* renamed from: J */
    private final boolean m181747J(Intent intent) {
        if (this.f304109v.n() || !this.f304089T || m181746I()) {
            return false;
        }
        if (intent != null) {
            int K = m181748K(intent);
            int i = K - 1;
            if (K == 0) {
                throw null;
            } else if (!(i == 0 || i == 1)) {
                if (i == 2 || i == 3) {
                    return false;
                }
                throw new AssertionError();
            }
        }
        return true;
    }

    /* renamed from: K */
    private static int m181748K(Intent intent) {
        return C50654q.m85873a()[intent.getIntExtra("entry_point_origin", 0)];
    }

    /* renamed from: x */
    private final View m181749x() {
        return findViewById(R.id.hq_opa_logo_container_stub).findViewById(R.id.hq_opa_logo_view_for_valyrian);
    }

    /* renamed from: y */
    private final void m181750y(boolean z) {
        int i;
        View.OnClickListener onClickListener;
        if (this.f304088S != null) {
            C109230d a = C109230d.m181787a(this.f304104q.mo79743a(C90014bt.f247294eT));
            if (this.f304096aa) {
                i = a.f304164k;
            } else {
                i = a.f304166m;
            }
            this.f304070A.mo28212l("Set image drawable on UI thread.", new C109213aa(this.f304088S, i));
            this.f304088S.setSelected(z);
            if (z) {
                onClickListener = C109250x.f304212a;
            } else {
                onClickListener = new C109215ac(this);
            }
            this.f304088S.setOnClickListener(new C89943l(onClickListener));
        }
    }

    /* renamed from: z */
    private final void m181751z(boolean z) {
        View view = this.f304087R;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        }
    }

    /* renamed from: a */
    public final C91097g mo46104a() {
        return this.f304080K;
    }

    /* renamed from: b */
    public final void mo97662b(C50639b bVar) {
        this.f304070A.mo28212l("showMainContent", new C109214ab(this));
        this.f304090U = bVar.f131737a;
    }

    /* renamed from: c */
    public final void mo97663c() {
        this.f304077H.mo65441c();
    }

    /* renamed from: d */
    public final void mo97664d() {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.putExtra("opa_exit_signed_out_mode_and_relaunch", true);
        intent.putExtra("triggered_by", 68);
        C87565h hVar = new C87565h(intent.getExtras());
        hVar.f236560f = 4;
        hVar.f236523a = "and.opa";
        hVar.f236497A = false;
        hVar.f236515S = true;
        hVar.f236516T = true;
        C58833ax b = this.f304076G.mo98061b(hVar.mo81685a());
        if (!b.mo56113h()) {
            C59104x c = f304069j.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OpaHQActivity");
            ((C59052c) ((C59052c) c).mo56372aa(24624)).mo56386p("#launchOobeFlow: Failed to build OOBE intent.");
            return;
        }
        this.f304080K.mo65089a((Intent) b.mo56107c());
    }

    /* renamed from: f */
    public final C113809by mo97666f() {
        return this.f304097ab;
    }

    public final void finish() {
        int i;
        super.finish();
        int i2 = this.f304093X;
        if (i2 != -1 && (i = this.f304094Y) != -1) {
            overridePendingTransition(i2, i);
        }
    }

    public final void onBackPressed() {
        aq aqVar;
        C58976aa aaVar = C58975e.f156826a;
        if (m181745H()) {
            if (m181744G()) {
                aqVar = this.f304083N.mo97684c();
            } else {
                aqVar = this.f304083N.mo97683b();
            }
            if (aqVar.mo65182i()) {
                aqVar.mo65181c();
                return;
            }
        }
        this.f2707h.mo3340c();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        View view;
        ImageView imageView;
        C74504a.m120462a(f.at);
        C58976aa aaVar = C58975e.f156826a;
        C89838ab.m146266j(39);
        super.onCreate(bundle);
        C109226an anVar = new C109226an(this);
        if (anVar.f304141b == null) {
            ((C109226an.C109227a) C47266f.m84076a(anVar.f304140a, C109226an.C109227a.class)).mo97685qI(anVar);
        }
        afn afn = new afn(anVar.f304141b.f195969a);
        this.f304098k = (C58833ax) afn.f195971b.mo17428b();
        this.f304099l = (C90929bz) afn.f195970a.a.f203444q.mo17428b();
        this.f304100m = (C90465g) afn.f195970a.a.f202977hJ.mo17428b();
        this.f304101n = (C113863cr) afn.f195972c.mo17428b();
        this.f304102o = (SharedPreferences) afn.f195970a.a.f203126k.mo17428b();
        this.f304103p = (C114514b) afn.f195974e.mo17428b();
        this.f304104q = (C86124t) afn.f195970a.a.f202006C.mo17428b();
        this.f304105r = C68219e.m98518a(afn.f195970a.a.f202689bn);
        this.f304106s = C68219e.m98518a(afn.f195970a.a.f202324I);
        this.f304107t = C68219e.m98518a(afn.f195970a.a.f202913fz);
        this.f304108u = C68219e.m98518a(afn.f195970a.a.f202707cE);
        this.f304109v = (bm) afn.f195970a.a.f202218G.mo17428b();
        this.f304110w = C68219e.m98518a(afn.f195970a.a.f202866fE);
        this.f304111x = (C58833ax) afn.f195970a.a.f202813eE.mo17428b();
        C90476a aVar = (C90476a) afn.f195970a.r.mo17428b();
        this.f304112y = (C58833ax) afn.f195970a.b.f200251g.mo17428b();
        b bVar = (b) afn.f195970a.b.f200410j.mo17428b();
        this.f304113z = (C73602a) afn.f195970a.b.f200145e.mo17428b();
        this.f304070A = (C22871g) afn.f195970a.aT.mo17428b();
        this.f304071B = (C113954b) afn.f195975f.mo17428b();
        this.f304072C = (C73906a) afn.f195976g.mo17428b();
        C91142g gVar = (C91142g) afn.f195970a.bq.mo17428b();
        this.f304073D = (C58833ax) afn.f195970a.a.f202860ez.mo17428b();
        this.f304074E = (C108013bm) afn.f195970a.a.f202825eQ.mo17428b();
        this.f304075F = (C21370a) afn.f195970a.i.mo17428b();
        this.f304076G = (C109739nm) afn.f195970a.b.f200184em.mo17428b();
        this.f304077H = (C73908b) afn.f195970a.b.f200021bi.mo17428b();
        this.f304081L = C68219e.m98518a(afn.f195977h);
        C0401v.m1321C();
        this.f304082M = this;
        this.f304080K = new C91090a(this, this, 0);
        this.f304089T = this.f304109v.u();
        if (!this.f304109v.v()) {
            C59104x c = f304069j.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OpaHQActivity");
            ((C59052c) ((C59052c) c).mo56372aa(24635)).mo56386p("Explore cannot be shown in this locale. Exiting.");
            finish();
            return;
        }
        Intent intent = getIntent();
        m181738A(intent);
        if (m181745H()) {
            this.f304113z.f194723a.mo83702b(C89849ae.OPA_EXPLORE_WEBVIEW_INITIAL_PAGE_START);
            C59104x c2 = f304069j.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "OpaHQActivity");
            ((C59052c) ((C59052c) c2).mo56372aa(24634)).mo56386p("Explore in webview (experimental feature) enabled");
        }
        if (!this.f304112y.mo56113h()) {
            C90779c.m148334a(this, 1);
        }
        if (this.f304112y.mo56113h()) {
            setContentView(((C108066a) this.f304112y.mo56107c()).mo96416a(this).mo82140b(R.layout.opa_hq_content));
        } else {
            setContentView((int) R.layout.opa_hq_content);
        }
        this.f304085P = (ViewGroup) findViewById(R.id.opa_hq_content);
        if (!m181744G()) {
            int i2 = true != m181743F() ? R.layout.explore_header_layout : R.layout.explore_header_layout_v2;
            ViewStub viewStub = (ViewStub) findViewById(R.id.header_layout_stub);
            viewStub.setLayoutResource(i2);
            this.f304086Q = viewStub.inflate();
        }
        this.f304095Z = this.f304085P.getPaddingBottom();
        ViewStub viewStub2 = (ViewStub) findViewById(R.id.hq_opa_logo_container_stub);
        if (m181743F()) {
            viewStub2.setLayoutResource(R.layout.explore_footer_v2);
        } else {
            viewStub2.setLayoutResource(R.layout.explore_footer);
        }
        View inflate = viewStub2.inflate();
        this.f304087R = inflate;
        if (inflate != null) {
            if (!m181747J(getIntent())) {
                this.f304087R.setVisibility(8);
                m181739B();
            } else {
                (m181743F() ? m181749x() : this.f304087R).setOnClickListener(new C89943l(new C109220ah(this)));
                this.f304088S = (ImageView) this.f304087R.findViewById(R.id.explore_icon);
                m181750y(true);
                if (m181743F()) {
                    this.f304088S.setSelected(true);
                }
                this.f304087R.setBackgroundColor(getResources().getColor(17170443));
                this.f304087R.findViewById(R.id.hq_opa_logo_view).setVisibility(8);
                View x = m181749x();
                x.setVisibility(0);
                if (!m181743F()) {
                    x = this.f304087R;
                }
                C28292j jVar = new C28292j(34476);
                jVar.mo33795i(5);
                C28295m.m52919e(x, jVar);
                if (m181743F()) {
                    findViewById(R.id.hq_opa_logo_view).setVisibility(8);
                    findViewById(R.id.hq_opa_logo_view_for_valyrian).setVisibility(8);
                    ViewGroup.LayoutParams layoutParams = this.f304087R.getLayoutParams();
                    layoutParams.height = this.f304082M.getResources().getDimensionPixelOffset(R.dimen.hq_header_height_v2);
                    layoutParams.width = -1;
                    this.f304087R.setLayoutParams(layoutParams);
                    View findViewById = this.f304087R.findViewById(R.id.footer_search_plate_layout);
                    LogoView logoView = (LogoView) findViewById.findViewById(R.id.opa_hq_content_footer_icon_mic);
                    float integer = (float) this.f304082M.getResources().getInteger(R.integer.explore_mic_icon_size);
                    logoView.mo28223c(integer, integer);
                    logoView.mo28225e(7, true);
                    if (!((C27683a) this.f304110w.mo27525b()).mo33175b() || !((C27683a) this.f304110w.mo27525b()).mo33174a()) {
                        findViewById.findViewById(R.id.opa_hq_content_footer_icon_lens).setVisibility(8);
                        ((FrameLayout.LayoutParams) logoView.getLayoutParams()).gravity = 8388691;
                    } else {
                        findViewById.findViewById(R.id.opa_hq_content_footer_icon_lens).setOnClickListener(new C89943l(new C109251y(this)));
                    }
                    findViewById.findViewById(R.id.opa_hq_content_footer_icon_mic).setOnClickListener(new C89943l(new C109220ah(this)));
                    findViewById.findViewById(R.id.opa_hq_content_footer_icon_keyboard).setOnClickListener(new C89943l(new C109252z(this)));
                    C113720h hVar = new C113720h();
                    hVar.f314945a = this.f304082M.getResources().getColor(R.color.search_plate_inner_shadow_color);
                    hVar.f314947c = this.f304082M.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_inner_shadow_y_offset);
                    hVar.f314946b = this.f304082M.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_inner_shadow_radius);
                    C113721i iVar = new C113721i(hVar, this.f304082M.getResources().getColor(R.color.chatui_solid_background_fill_v2), (float) this.f304082M.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_inner_background_radius), (float) this.f304082M.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_inner_background_radius));
                    findViewById.getClass();
                    findViewById.setBackground(iVar);
                    findViewById.setElevation(0.0f);
                    findViewById.setLayerType(1, (Paint) null);
                }
            }
        }
        if (!m181744G()) {
            if (m181743F()) {
                this.f304071B.mo100815a((ImageView) findViewById(R.id.profile_icon));
            } else {
                ImageView imageView2 = (ImageView) findViewById(R.id.hq_settings_button);
                if (imageView2 != null) {
                    imageView2.setColorFilter(this.f304082M.getResources().getColor(R.color.settings_menu_button_color));
                }
            }
            if (this.f304086Q != null) {
                if (m181743F()) {
                    View view2 = this.f304086Q;
                    view2.getClass();
                    imageView = (ImageView) view2.findViewById(R.id.back_arrow_v2);
                } else {
                    View view3 = this.f304086Q;
                    view3.getClass();
                    imageView = (ImageView) view3.findViewById(R.id.back_arrow);
                }
                imageView.setVisibility(0);
                imageView.setOnClickListener(new C109218af(this));
            }
            this.f304078I = this.f304103p.mo101365a(this.f304085P, true != C90685b.m148054b(this, (C90021c) null) ? "com.google.android.googlequicksearchbox.NEXUS_OPA_FEEDBACK" : "com.google.android.googlequicksearchbox.ANDROID_TABLET_OPA_FEEDBACK", this.f304100m.mo84210a(this));
            C109216ad adVar = new C109216ad(this);
            C85929cw cwVar = (C85929cw) this.f304107t.mo27525b();
            this.f304079J = new C86314e(this.f304082M, (C86054o) this.f304106s.mo27525b(), this.f304108u, "https://myactivity.google.com/product/assistant/embed?utm_source=opa&utm_medium=er&utm_campaign=", ((C86054o) this.f304106s.mo27525b()).mo79668a());
            this.f304097ab = new C113809by(this.f304080K, this, (C87559b) this.f304098k.mo56107c(), adVar, C58886cw.m90973a(new C109217ae(this)), this.f304079J, this.f304072C);
            this.f304084O = new C113810bz(this.f304097ab);
            C113768ak akVar = new C113768ak(this.f304101n);
            akVar.mo100612d(R.id.opa_menu_account, 33992);
            akVar.mo100612d(R.id.opa_menu_settings, 33996);
            akVar.mo100612d(R.id.opa_menu_my_activity, 37053);
            akVar.mo100612d(R.id.opa_menu_help, 33995);
            akVar.mo100612d(R.id.opa_menu_feedback, 33994);
            if (m181743F()) {
                view = findViewById(R.id.hq_settings_button_v2);
            } else {
                view = findViewById(R.id.hq_settings_button);
            }
            PopupMenu popupMenu = new PopupMenu(this, view);
            popupMenu.getMenuInflater().inflate(R.menu.opa_menu, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new C113766ai(akVar, this.f304084O));
            MenuItem findItem = popupMenu.getMenu().findItem(R.id.opa_menu_what_can_you_do);
            if (findItem != null) {
                findItem.setVisible(false);
                findItem.setEnabled(false);
            }
            if (!this.f304072C.mo65438a()) {
                popupMenu.getMenu().removeItem(R.id.opa_menu_transparency_disclosure);
            }
            view.setOnClickListener(akVar.mo100609a(34070, popupMenu.getMenu(), new C89943l(new C109219ag(popupMenu))));
        }
        m181742E(intent);
        if (intent != null) {
            this.f304091V = intent.getIntExtra("launch_entry_animation", -1);
            this.f304092W = intent.getIntExtra("launch_exit_animation", -1);
            this.f304093X = intent.getIntExtra("close_entry_animation", -1);
            this.f304094Y = intent.getIntExtra("close_exit_animation", -1);
            int i3 = this.f304091V;
            if (i3 != -1 && (i = this.f304092W) != -1) {
                overridePendingTransition(i3, i);
            }
        }
    }

    public final void onNewIntent(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        getIntent();
        super.onNewIntent(intent);
        if (!intent.getBooleanExtra("from_account_switch", false)) {
            m181742E(intent);
        }
    }

    public final void onResume() {
        C58976aa aaVar = C58975e.f156826a;
        C89838ab.m146266j(39);
        ((C109467mf) this.f304081L.mo27525b()).mo97847b(C89849ae.OPA_INPUT_PLATE_EXPLORE);
        C0401v.m1321C();
        super.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        C58976aa aaVar = C58975e.f156826a;
        C89838ab.m146266j(39);
        super.onStart();
        b.e(findViewById(R.id.opa_hq_content), (C60218r) null);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C58976aa aaVar = C58975e.f156826a;
        super.onStop();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (m181744G() != false) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97668v(android.content.Intent r14) {
        /*
            r13 = this;
            boolean r0 = r13.m181745H()
            r1 = 0
            if (r0 != 0) goto L_0x0009
        L_0x0007:
            r2 = 0
            goto L_0x001c
        L_0x0009:
            com.google.android.apps.gsa.search.core.i.t r0 = r13.f304104q
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247360fg
            boolean r0 = r0.mo79746e(r2)
            r2 = 8
            if (r0 == 0) goto L_0x0016
            goto L_0x001c
        L_0x0016:
            boolean r0 = r13.m181744G()
            if (r0 == 0) goto L_0x0007
        L_0x001c:
            r13.m181741D(r2)
            boolean r0 = r13.m181747J(r14)
            r13.m181751z(r0)
            r13.m181739B()
            android.content.SharedPreferences r0 = r13.f304102o
            java.lang.String r2 = "opa_hq_ever_triggered"
            boolean r0 = r0.getBoolean(r2, r1)
            r3 = 1
            if (r0 != 0) goto L_0x0041
            android.content.SharedPreferences r0 = r13.f304102o
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r3)
            r0.apply()
        L_0x0041:
            com.google.android.apps.gsa.staticplugins.opa.hq.am r0 = r13.f304083N
            boolean r2 = r13.m181745H()
            java.lang.String r4 = "Capability"
            if (r2 == 0) goto L_0x0057
            boolean r2 = r13.m181744G()
            if (r2 == 0) goto L_0x0054
            java.lang.String r2 = "TimepassWebview"
            goto L_0x0058
        L_0x0054:
            java.lang.String r2 = "Webview"
            goto L_0x0058
        L_0x0057:
            r2 = r4
        L_0x0058:
            android.support.v4.app.Fragment r0 = r0.mo97682a(r2)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r5 = r13.f304090U
            if (r5 == 0) goto L_0x0090
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0090
            boolean r5 = r0 instanceof com.google.android.apps.gsa.assistant.settings.hq.q
            java.lang.String r6 = "prefsConsistencyToken"
            if (r5 == 0) goto L_0x007f
            java.lang.String r5 = r13.f304090U
            if (r5 == 0) goto L_0x0090
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x0090
            r2.putString(r6, r5)
            goto L_0x0090
        L_0x007f:
            boolean r5 = r0 instanceof com.google.android.apps.gsa.assistant.settings.p5781hq.C73568af
            if (r5 == 0) goto L_0x0090
            java.lang.String r5 = r13.f304090U
            if (r5 == 0) goto L_0x0090
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x0090
            r2.putString(r6, r5)
        L_0x0090:
            if (r14 == 0) goto L_0x00a5
            java.lang.String r5 = "nested_page"
            boolean r6 = r14.hasExtra(r5)
            if (r6 == 0) goto L_0x00a5
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "nestedPage"
            android.os.Parcelable r5 = r14.getParcelableExtra(r5)
            r2.putParcelable(r6, r5)
        L_0x00a5:
            if (r14 == 0) goto L_0x0321
            java.lang.String r5 = "updates_center_queue"
            boolean r6 = r14.hasExtra(r5)
            if (r6 == 0) goto L_0x0321
            r13.f304096aa = r3
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r6 = r14.hasExtra(r5)
            if (r6 != 0) goto L_0x00bc
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
            goto L_0x010c
        L_0x00bc:
            int r6 = m181748K(r14)
            r7 = 4
            if (r6 != r7) goto L_0x00f1
            byte[] r6 = r14.getByteArrayExtra(r5)     // Catch:{ ct -> 0x00d9 }
            if (r6 != 0) goto L_0x00cc
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a     // Catch:{ ct -> 0x00d9 }
            goto L_0x010c
        L_0x00cc:
            com.google.assistant.b.a.a.a.an r7 = com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an.f131726h     // Catch:{ ct -> 0x00d9 }
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (byte[]) r6)     // Catch:{ ct -> 0x00d9 }
            com.google.assistant.b.a.a.a.an r6 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r6     // Catch:{ ct -> 0x00d9 }
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)     // Catch:{ ct -> 0x00d9 }
            goto L_0x010c
        L_0x00d9:
            r6 = move-exception
            com.google.common.f.e r7 = f304069j
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r9 = "OpaHQActivity"
            r7.mo56378ag(r8, r9)
            java.lang.String r8 = "#updatesCenter error parsing UpdatesCenterQueue from intent."
            r9 = 24620(0x602c, float:3.45E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r6)).mo56372aa(r9)).mo56386p(r8)
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
            goto L_0x010c
        L_0x00f1:
            android.os.Parcelable r6 = r14.getParcelableExtra(r5)
            com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable r6 = (com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable) r6
            if (r6 != 0) goto L_0x00fc
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
            goto L_0x010c
        L_0x00fc:
            com.google.assistant.b.a.a.a.an r7 = com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an.f131726h
            com.google.protobuf.eb r7 = r7.getParserForType()
            com.google.protobuf.MessageLite r6 = r6.mo84191d(r7)
            com.google.assistant.b.a.a.a.an r6 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r6
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
        L_0x010c:
            boolean r7 = r6.mo56113h()
            if (r7 != 0) goto L_0x0114
            goto L_0x0312
        L_0x0114:
            com.google.android.apps.gsa.search.core.i.t r7 = r13.f304104q
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90066dr.f249674Q
            boolean r7 = r7.mo79746e(r8)
            if (r7 == 0) goto L_0x0123
            com.google.android.apps.gsa.staticplugins.opa.be.bm r7 = r13.f304074E
            r7.mo96359J()
        L_0x0123:
            com.google.android.apps.gsa.search.core.i.t r7 = r13.f304104q
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247801nx
            boolean r7 = r7.mo79746e(r8)
            r8 = 3
            if (r7 != 0) goto L_0x01e0
            java.lang.Object r6 = r6.mo56107c()
            com.google.assistant.b.a.a.a.an r6 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r6
            com.google.protobuf.bn r7 = r6.toBuilder()
            com.google.assistant.b.a.a.a.am r7 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50637am) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.assistant.b.a.a.a.an r9 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r9
            com.google.protobuf.cq r10 = com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an.emptyProtobufList()
            r9.f131729b = r10
            com.google.protobuf.cq r9 = r6.f131729b
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)
            com.google.android.apps.gsa.staticplugins.opa.hq.ai r10 = com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109221ai.f304133a
            j$.util.stream.Stream r9 = r9.filter(r10)
            j$.util.stream.Collector r10 = p3186j$.util.stream.Collectors.toList()
            java.lang.Object r9 = r9.collect(r10)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r7.mo53413b(r9)
            com.google.protobuf.cq r9 = r6.f131729b
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)
            com.google.android.apps.gsa.staticplugins.opa.hq.aj r10 = com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109222aj.f304134a
            j$.util.stream.Stream r9 = r9.filter(r10)
            com.google.android.apps.gsa.staticplugins.opa.hq.ak r10 = com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109223ak.f304135a
            j$.util.stream.Stream r9 = r9.map(r10)
            j$.util.stream.Collector r10 = p3186j$.util.stream.Collectors.toList()
            java.lang.Object r9 = r9.collect(r10)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r7.mo53413b(r9)
            com.google.protobuf.cq r9 = r6.f131729b
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
        L_0x0186:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x01b6
            java.lang.Object r11 = r9.next()
            com.google.assistant.b.a.a.a.y r11 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50662y) r11
            com.google.protobuf.bn r12 = r11.toBuilder()
            com.google.assistant.b.a.a.a.w r12 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50660w) r12
            int r11 = r11.f131786b
            int r11 = com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50661x.m85874a(r11)
            if (r11 == 0) goto L_0x0186
            if (r11 != r8) goto L_0x0186
            boolean r11 = r6.f131733f
            if (r11 == 0) goto L_0x01b2
            if (r10 != 0) goto L_0x01b2
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.assistant.b.a.a.a.y r10 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50662y) r10
            r10.f131786b = r8
            r10 = 1
        L_0x01b2:
            r7.mo53414c(r12)
            goto L_0x0186
        L_0x01b6:
            if (r10 == 0) goto L_0x01c7
            com.google.android.libraries.f.a r3 = r13.f304075F
            long r8 = r3.mo26870b()
            r7.copyOnWrite()
            com.google.protobuf.bv r3 = r7.instance
            com.google.assistant.b.a.a.a.an r3 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r3
            r3.f131731d = r8
        L_0x01c7:
            com.google.android.apps.gsa.staticplugins.opa.be.bm r3 = r13.f304074E
            com.google.protobuf.bv r6 = r7.build()
            com.google.assistant.b.a.a.a.an r6 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r6
            r3.mo96360K(r6)
            com.google.protobuf.bv r3 = r7.build()
            com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable r6 = new com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable
            r6.<init>((com.google.protobuf.MessageLite) r3)
            r2.putParcelable(r5, r6)
            goto L_0x0312
        L_0x01e0:
            java.lang.Object r6 = r6.mo56107c()
            com.google.assistant.b.a.a.a.an r6 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r6
            com.google.assistant.b.a.a.a.an r7 = com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an.f131726h
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.b.a.a.a.am r7 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50637am) r7
            boolean r9 = r6.f131733f
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.assistant.b.a.a.a.an r10 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r10
            int r11 = r10.f131728a
            r11 = r11 | r3
            r10.f131728a = r11
            r10.f131733f = r9
            boolean r9 = r6.f131734g
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.assistant.b.a.a.a.an r10 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r10
            int r11 = r10.f131728a
            r12 = 2
            r11 = r11 | r12
            r10.f131728a = r11
            r10.f131734g = r9
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable r9 = new com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable
            r9.<init>((com.google.protobuf.MessageLite) r7)
            r2.putParcelable(r5, r9)
            boolean r5 = r6.f131733f
            if (r5 != 0) goto L_0x0223
            boolean r5 = r6.f131734g
            if (r5 == 0) goto L_0x0312
        L_0x0223:
            com.google.protobuf.cq r5 = r6.f131729b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x023a
            com.google.protobuf.cq r5 = r6.f131730c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x023a
            com.google.android.apps.gsa.assistant.shared.s.b r3 = r13.f304077H
            r3.mo65442d()
            goto L_0x0312
        L_0x023a:
            com.google.protobuf.bn r5 = r6.toBuilder()
            com.google.assistant.b.a.a.a.am r5 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50637am) r5
            r6 = 0
        L_0x0241:
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.b.a.a.a.an r7 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r7
            com.google.protobuf.cq r7 = r7.f131729b
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x028e
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.b.a.a.a.an r7 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r7
            com.google.protobuf.cq r7 = r7.f131729b
            java.lang.Object r7 = r7.get(r6)
            com.google.assistant.b.a.a.a.y r7 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50662y) r7
            int r9 = r7.f131786b
            int r9 = com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50661x.m85874a(r9)
            if (r9 != 0) goto L_0x0262
            goto L_0x028b
        L_0x0262:
            if (r9 != r8) goto L_0x028b
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.assistant.b.a.a.a.w r7 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50660w) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.assistant.b.a.a.a.y r9 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50662y) r9
            r9.f131786b = r12
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            com.google.assistant.b.a.a.a.an r9 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r9
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.b.a.a.a.y r7 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50662y) r7
            r7.getClass()
            r9.mo53415a()
            com.google.protobuf.cq r9 = r9.f131729b
            r9.set(r6, r7)
        L_0x028b:
            int r6 = r6 + 1
            goto L_0x0241
        L_0x028e:
            r6 = 0
        L_0x028f:
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.b.a.a.a.an r7 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r7
            com.google.protobuf.cq r7 = r7.f131730c
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x02dc
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.b.a.a.a.an r7 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r7
            com.google.protobuf.cq r7 = r7.f131730c
            java.lang.Object r7 = r7.get(r6)
            com.google.assistant.b.a.a.a.y r7 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50662y) r7
            int r9 = r7.f131786b
            int r9 = com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50661x.m85874a(r9)
            if (r9 != 0) goto L_0x02b0
            goto L_0x02d9
        L_0x02b0:
            if (r9 != r8) goto L_0x02d9
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.assistant.b.a.a.a.w r7 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50660w) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.assistant.b.a.a.a.y r9 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50662y) r9
            r9.f131786b = r12
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            com.google.assistant.b.a.a.a.an r9 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r9
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.b.a.a.a.y r7 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50662y) r7
            r7.getClass()
            r9.mo53416b()
            com.google.protobuf.cq r9 = r9.f131730c
            r9.set(r6, r7)
        L_0x02d9:
            int r6 = r6 + 1
            goto L_0x028f
        L_0x02dc:
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.assistant.b.a.a.a.an r6 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r6
            int r7 = r6.f131728a
            r3 = r3 | r7
            r6.f131728a = r3
            r6.f131733f = r1
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.assistant.b.a.a.a.an r3 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r3
            int r6 = r3.f131728a
            r6 = r6 | r12
            r3.f131728a = r6
            r3.f131734g = r1
            com.google.android.libraries.f.a r3 = r13.f304075F
            long r6 = r3.mo26870b()
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.assistant.b.a.a.a.an r3 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r3
            r3.f131731d = r6
            com.google.android.apps.gsa.staticplugins.opa.be.bm r3 = r13.f304074E
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.b.a.a.a.an r5 = (com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an) r5
            r3.mo96360K(r5)
        L_0x0312:
            java.lang.String r3 = "entry_point_origin"
            boolean r5 = r14.hasExtra(r3)
            if (r5 == 0) goto L_0x0321
            int r14 = r14.getIntExtra(r3, r1)
            r2.putInt(r3, r14)
        L_0x0321:
            boolean r14 = r0.isAdded()
            if (r14 == 0) goto L_0x0338
            boolean r14 = r0 instanceof com.google.android.apps.gsa.assistant.settings.hq.q
            if (r14 == 0) goto L_0x0337
            r0.setArguments(r2)
            com.google.android.apps.gsa.assistant.settings.hq.q r0 = (com.google.android.apps.gsa.assistant.settings.hq.q) r0
            java.lang.String r14 = r0.b()
            r0.d(r14)
        L_0x0337:
            return
        L_0x0338:
            r0.setArguments(r2)
            r13.m181740C(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8369hq.OpaHqActivity.mo97668v(android.content.Intent):void");
    }

    /* renamed from: w */
    public final void mo97669w(int i) {
        C87565h hVar = new C87565h();
        hVar.f236500D = getIntent().getBooleanExtra("from_dock_mode", false);
        hVar.f236497A = true;
        hVar.f236560f = i;
        ((C87568k) this.f304111x.mo56107c()).mo81688b(this.f304082M, hVar.mo81685a());
    }

    /* renamed from: e */
    public final void mo97665e(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            m181741D(0);
            if (this.f304096aa) {
                m181750y(false);
            }
        } else if (i2 != 1) {
            m181741D(8);
        } else {
            m181741D(8);
            m181750y(true);
        }
    }
}
