package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Paint;
import android.net.Uri;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0657fs;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.android.apps.gsa.staticplugins.opa.util.C113854ci;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114119ax;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114732b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114735e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114737g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114748b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114751e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114753g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114754h;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8635i.C114773b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114796at;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114800ax;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114839ci;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114843cm;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114844cn;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114853cw;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114854cx;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114860dc;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114865dh;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114867dj;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114882n;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114893y;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a.C114905ad;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a.C114919ar;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a.C114922au;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a.C114923av;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a.C114948z;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115014br;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115033cj;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115080y;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28291i;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.assistant.p3994s.p3995a.C53156dl;
import com.google.assistant.p3994s.p3995a.C53157dm;
import com.google.assistant.p3994s.p3995a.C53160dp;
import com.google.assistant.p3994s.p3995a.C53161dq;
import com.google.assistant.p3994s.p3995a.C53265hm;
import com.google.assistant.p3994s.p3995a.C53267ho;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53284ie;
import com.google.assistant.p3994s.p3995a.C53286ig;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.p4816ai.p4818b.C63204j;
import dagger.C68214a;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.ay */
/* compiled from: PG */
public final class C114575ay implements C114754h {

    /* renamed from: a */
    public static final C59071e f317711a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.ay");

    /* renamed from: A */
    public SwipeRefreshLayout f317712A;

    /* renamed from: B */
    public C114711cl f317713B;

    /* renamed from: C */
    public RecyclerView f317714C;

    /* renamed from: D */
    public View f317715D;

    /* renamed from: E */
    public View f317716E;

    /* renamed from: F */
    public C114753g f317717F;

    /* renamed from: G */
    public C28293k f317718G;

    /* renamed from: H */
    public final C114893y f317719H;

    /* renamed from: I */
    private final Context f317720I;

    /* renamed from: J */
    private final C114604by f317721J;

    /* renamed from: K */
    private C91097g f317722K;

    /* renamed from: L */
    private final C108226ax f317723L;

    /* renamed from: M */
    private final C68214a f317724M;

    /* renamed from: N */
    private final C22871g f317725N;

    /* renamed from: O */
    private final C22871g f317726O;

    /* renamed from: P */
    private final SharedPreferences f317727P;

    /* renamed from: Q */
    private final C114732b f317728Q;

    /* renamed from: R */
    private final C86054o f317729R;

    /* renamed from: S */
    private final C68214a f317730S;

    /* renamed from: T */
    private final C68214a f317731T;

    /* renamed from: U */
    private final C114923av f317732U;

    /* renamed from: V */
    private final C114860dc f317733V;

    /* renamed from: W */
    private final C68214a f317734W;

    /* renamed from: X */
    private final C68214a f317735X;

    /* renamed from: Y */
    private final C114119ax f317736Y;

    /* renamed from: Z */
    private C58485gu f317737Z;

    /* renamed from: aa */
    private C114922au f317738aa;

    /* renamed from: ab */
    private C28293k f317739ab;

    /* renamed from: ac */
    private C28293k f317740ac;

    /* renamed from: ad */
    private final C114796at f317741ad;

    /* renamed from: b */
    public final Activity f317742b;

    /* renamed from: c */
    public final C114708ci f317743c;

    /* renamed from: d */
    public final C114712cm f317744d;

    /* renamed from: e */
    public final SettableFuture f317745e;

    /* renamed from: f */
    public final C114742l f317746f;

    /* renamed from: g */
    public final C114865dh f317747g;

    /* renamed from: h */
    public final C21370a f317748h;

    /* renamed from: i */
    public final C86124t f317749i;

    /* renamed from: j */
    public final C114839ci f317750j;

    /* renamed from: k */
    public final C68214a f317751k;

    /* renamed from: l */
    public final C114748b f317752l;

    /* renamed from: m */
    public final C68214a f317753m;

    /* renamed from: n */
    public final C68214a f317754n;

    /* renamed from: o */
    public final C114773b f317755o;

    /* renamed from: p */
    public final Object f317756p = new Object();

    /* renamed from: q */
    public C28291i f317757q;

    /* renamed from: r */
    final C114867dj f317758r;

    /* renamed from: s */
    boolean f317759s;

    /* renamed from: t */
    boolean f317760t;

    /* renamed from: u */
    boolean f317761u = false;

    /* renamed from: v */
    SettableFuture f317762v;

    /* renamed from: w */
    public long f317763w;

    /* renamed from: x */
    public ViewGroup f317764x;

    /* renamed from: y */
    public ViewGroup f317765y;

    /* renamed from: z */
    public ViewGroup f317766z;

    public C114575ay(Context context, Activity activity, C114709cj cjVar, C114604by byVar, C114712cm cmVar, C114742l lVar, C68214a aVar, C22871g gVar, C22871g gVar2, SharedPreferences sharedPreferences, C21370a aVar2, C114732b bVar, C86054o oVar, C86124t tVar, C114748b bVar2, C114839ci ciVar, C68214a aVar3, C114893y yVar, C114796at atVar, C68214a aVar4, C68214a aVar5, C68214a aVar6, C114865dh dhVar, C114923av avVar, C114860dc dcVar, C68214a aVar7, C68214a aVar8, C68214a aVar9, C114800ax axVar, C114773b bVar3, C108226ax axVar2, boolean z, C114119ax axVar3) {
        C114860dc dcVar2 = dcVar;
        C108226ax axVar4 = axVar2;
        C58976aa aaVar = C58975e.f156826a;
        this.f317720I = context;
        this.f317742b = activity;
        C114709cj cjVar2 = cjVar;
        this.f317743c = cjVar.mo101531a(z, C53306j.MAIN_APP);
        this.f317721J = byVar;
        this.f317744d = cmVar;
        this.f317746f = lVar;
        this.f317724M = aVar;
        this.f317747g = dhVar;
        this.f317725N = gVar;
        this.f317726O = gVar2;
        this.f317727P = sharedPreferences;
        this.f317748h = aVar2;
        this.f317728Q = bVar;
        this.f317729R = oVar;
        this.f317754n = aVar7;
        this.f317723L = axVar4;
        this.f317745e = new SettableFuture();
        this.f317749i = tVar;
        this.f317752l = bVar2;
        this.f317750j = ciVar;
        this.f317751k = aVar3;
        this.f317736Y = axVar3;
        this.f317719H = yVar;
        this.f317741ad = atVar;
        this.f317753m = aVar4;
        this.f317735X = aVar9;
        this.f317730S = aVar5;
        this.f317731T = aVar6;
        this.f317732U = avVar;
        this.f317733V = dcVar2;
        dcVar2.f318684q = axVar4;
        this.f317734W = aVar8;
        this.f317758r = axVar.mo101603a(activity);
        this.f317755o = bVar3;
    }

    /* renamed from: A */
    private final void m189913A() {
        C58485gu guVar = this.f317737Z;
        if (guVar != null) {
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                ((C114757k) guVar.get(i2)).mo101580d();
            }
        }
    }

    /* renamed from: B */
    private final void m189914B(C58480gp gpVar, C114758l lVar, C58485gu guVar, C87546b bVar) {
        C58833ax a = this.f317721J.mo101449a(lVar, guVar, this.f317723L, bVar, this.f317722K, C53306j.MAIN_APP, this.f317741ad, !this.f317761u || this.f317748h.mo26870b() - this.f317763w < 1500, new C114572av(this));
        if (a.mo56113h()) {
            C58480gp gpVar2 = gpVar;
            gpVar.mo55395g((C114757k) a.mo56107c());
        }
    }

    /* renamed from: C */
    private final void m189915C(boolean z, C53270hr hrVar, C53287ih ihVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f317747g.mo101662a(new C114568ar(this, z, hrVar, ihVar));
    }

    /* renamed from: a */
    public final ViewGroup mo101411a() {
        C60870cx cxVar;
        Uri uri;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f317764x == null) {
            this.f317764x = (ViewGroup) LayoutInflater.from(this.f317720I).inflate(R.layout.zero_state_main_view, (ViewGroup) null);
            if (this.f317749i.mo79746e(C90014bt.f247289eO)) {
                ViewGroup viewGroup = this.f317764x;
                viewGroup.getClass();
                viewGroup.setBackground(this.f317720I.getResources().getDrawable(R.drawable.zero_state_main_view_v2_background, (Resources.Theme) null));
            }
            if (this.f317749i.mo79746e(C90080ee.f249815n)) {
                ViewGroup viewGroup2 = this.f317764x;
                viewGroup2.getClass();
                C114773b bVar = this.f317755o;
                View inflate = LayoutInflater.from(new ContextThemeWrapper(bVar.f318495a, 2132150899)).inflate(R.layout.tap_to_update_bubble_layout, viewGroup2, false);
                bVar.f318496b = (ExtendedFloatingActionButton) inflate.findViewById(R.id.zero_state_tap_to_update_bubble);
                ExtendedFloatingActionButton extendedFloatingActionButton = bVar.f318496b;
                if (C90962a.m148577a(bVar.f318495a)) {
                    extendedFloatingActionButton.setForceDarkAllowed(false);
                    extendedFloatingActionButton.setTextColor(bVar.f318495a.getResources().getColorStateList(R.color.zero_state_tap_to_update_bubble_text_color_dark_mode));
                    extendedFloatingActionButton.mo47556m(bVar.f318495a.getResources().getColorStateList(R.color.zero_state_tap_to_update_bubble_background_color_dark_mode));
                } else {
                    extendedFloatingActionButton.setTextColor(bVar.f318495a.getResources().getColorStateList(R.color.zero_state_tap_to_update_bubble_text_color));
                    extendedFloatingActionButton.mo47556m(bVar.f318495a.getResources().getColorStateList(R.color.zero_state_tap_to_update_bubble_background_color));
                }
                ExtendedFloatingActionButton extendedFloatingActionButton2 = bVar.f318496b;
                extendedFloatingActionButton2.mo47890r(extendedFloatingActionButton2.f116354p);
                inflate.getClass();
                viewGroup2.addView(inflate);
                this.f317755o.f318497c = this.f317733V;
            }
            if (this.f317749i.mo79746e(C90080ee.f249810i)) {
                C114923av avVar = this.f317732U;
                ViewGroup viewGroup3 = this.f317764x;
                viewGroup3.getClass();
                Context context = (Context) avVar.f318860a.mo17428b();
                context.getClass();
                C114948z zVar = (C114948z) avVar.f318861b.mo17428b();
                zVar.getClass();
                C114919ar arVar = (C114919ar) avVar.f318862c.mo17428b();
                arVar.getClass();
                C114922au auVar = new C114922au(context, zVar, arVar, viewGroup3);
                this.f317738aa = auVar;
                ViewGroup viewGroup4 = this.f317764x;
                viewGroup4.getClass();
                viewGroup4.addView(auVar.f318858a);
                C114922au auVar2 = this.f317738aa;
                if (auVar2 != null) {
                    this.f317739ab = auVar2.f318859b;
                }
                ((C114948z) this.f317734W.mo27525b()).f318943a = this.f317733V;
            }
            this.f317743c.f318282c = new C114571au(this);
            ViewGroup viewGroup5 = this.f317764x;
            viewGroup5.getClass();
            RecyclerView recyclerView = (RecyclerView) viewGroup5.findViewById(R.id.zero_state_content_view);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f317720I);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setLayerType(2, (Paint) null);
            C114711cl a = this.f317744d.mo101533a(C53306j.MAIN_APP);
            this.f317713B = a;
            recyclerView.setAdapter(a);
            mo101419i(recyclerView);
            C114119ax axVar = this.f317736Y;
            if (axVar != null) {
                recyclerView.addOnScrollListener(axVar);
            }
            recyclerView.addOnScrollListener(((C114737g) this.f317753m.mo27525b()).mo101567f(true));
            int dimensionPixelSize = this.f317720I.getResources().getDimensionPixelSize(R.dimen.zero_state_recycler_view_bottom_padding);
            recyclerView.getClass();
            recyclerView.setPadding(0, 0, 0, dimensionPixelSize);
            this.f317714C = recyclerView;
            this.f317719H.f318764b = linearLayoutManager;
            mo101413c(this.f317743c.f318285f.mo101443e());
            ViewGroup viewGroup6 = this.f317764x;
            viewGroup6.getClass();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewGroup6.findViewById(R.id.swipe_refresh);
            this.f317712A = swipeRefreshLayout;
            swipeRefreshLayout.getClass();
            swipeRefreshLayout.mo8792j(R.color.quantum_googblue);
            swipeRefreshLayout.mo8793k(true, this.f317720I.getResources().getDimensionPixelSize(R.dimen.refresh_progress_offset));
            swipeRefreshLayout.f13508a = new C114574ax(this);
            Intent intent = this.f317752l.f318452e;
            if (intent != null) {
                C114860dc dcVar = this.f317733V;
                C53156dl dlVar = (C53156dl) C53157dm.f139323c.createBuilder();
                String type = intent.getType();
                if (type == null) {
                    cxVar = C60856cj.m92900i((C53157dm) dlVar.build());
                } else {
                    if (type.equals("text/plain")) {
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (stringExtra != null) {
                            C53160dp dpVar = (C53160dp) C53161dq.f139332c.createBuilder();
                            dpVar.copyOnWrite();
                            C53161dq dqVar = (C53161dq) dpVar.instance;
                            dqVar.f139334a |= 1;
                            dqVar.f139335b = stringExtra;
                            dlVar.copyOnWrite();
                            C53157dm dmVar = (C53157dm) dlVar.instance;
                            C53161dq dqVar2 = (C53161dq) dpVar.build();
                            dqVar2.getClass();
                            dmVar.f139326b = dqVar2;
                            dmVar.f139325a = 1;
                        }
                    } else if (type.startsWith("image/") && (uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM")) != null) {
                        cxVar = dcVar.f318673f.mo28209i(dcVar.f318672e.mo28201a("LoadContentUriImage", new C114843cm(dcVar, uri)), "buildImagePayloadForShareIntent", new C114844cn(dlVar, uri));
                    }
                    cxVar = C60856cj.m92900i((C53157dm) dlVar.build());
                }
                new C90873ag(cxVar, dcVar.f318674g, "buildPayloadForShareIntent", new C114853cw(dcVar)).mo85223a(C114854cx.f318647a);
                this.f317752l.f318452e = null;
                C114708ci ciVar = this.f317743c;
                synchronized (ciVar.f318283d) {
                    C114602bw bwVar = ciVar.f318285f;
                    synchronized (bwVar.f317848i) {
                        bwVar.f317854o.mo57356n(C58485gu.m89845m());
                    }
                    ciVar.f318291l.mo57356n(C58485gu.m89845m());
                }
            } else {
                ((C89859i) this.f317751k.mo27525b()).mo83702b(C89849ae.OPA_ZERO_STATE_INITIALIZE_SECTION_DATA);
                new C90873ag(C60856cj.m92897f(this.f317743c.mo101525a(), this.f317745e), this.f317725N, "initializeSectionsAsync", new C114564an(this)).mo85223a(new C114565ao(this));
            }
        }
        ViewGroup viewGroup7 = this.f317764x;
        viewGroup7.getClass();
        return viewGroup7;
    }

    /* renamed from: b */
    public final C28293k mo101412b() {
        C114711cl clVar = this.f317713B;
        if (clVar == null) {
            return null;
        }
        C28257a aVar = (C28257a) clVar.mo33782a();
        ArrayList arrayList = new ArrayList(aVar.f76909b);
        C28293k kVar = this.f317718G;
        if (kVar != null) {
            arrayList.add(kVar);
        }
        C28293k kVar2 = this.f317739ab;
        if (kVar2 != null) {
            arrayList.add(kVar2);
        }
        C28293k kVar3 = this.f317740ac;
        if (kVar3 != null) {
            arrayList.add(kVar3);
        }
        if (arrayList.size() == 1 && this.f317739ab != null) {
            return C28293k.m52907d(aVar.f76908a, arrayList);
        }
        if (arrayList.size() == 1 && this.f317740ac != null) {
            return C28293k.m52907d(aVar.f76908a, arrayList);
        }
        if (arrayList.size() > 1) {
            return C28293k.m52907d(aVar.f76908a, arrayList.subList(1, arrayList.size()));
        }
        return C28293k.m52908e(aVar.f76908a, new C28293k[0]);
    }

    /* renamed from: c */
    public final void mo101413c(C60870cx cxVar) {
        DisplayMetrics displayMetrics = this.f317720I.getResources().getDisplayMetrics();
        double applyDimension = (double) (displayMetrics.heightPixels - ((int) TypedValue.applyDimension(1, 152.0f, displayMetrics)));
        Double.isNaN(applyDimension);
        int i = (int) (applyDimension / 2.5d);
        ViewGroup viewGroup = this.f317764x;
        viewGroup.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.zero_state_loading_view);
        this.f317765y = viewGroup2;
        viewGroup2.setVisibility(0);
        this.f317765y.setAlpha(0.0f);
        ViewGroup viewGroup3 = this.f317764x;
        viewGroup3.getClass();
        this.f317716E = viewGroup3.findViewById(R.id.zero_state_progress_bar);
        for (int i2 = 0; i2 < 3; i2++) {
            View view = new View(this.f317720I);
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
            if (this.f317749i.mo79746e(C90014bt.f247289eO)) {
                view.setBackground(this.f317720I.getResources().getDrawable(R.drawable.zero_state_loading_card_v2_background, (Resources.Theme) null));
            } else {
                view.setBackground(this.f317720I.getResources().getDrawable(R.drawable.zero_state_loading_card_background, (Resources.Theme) null));
            }
            ViewGroup viewGroup4 = this.f317765y;
            viewGroup4.getClass();
            viewGroup4.addView(view);
        }
        new C90873ag(cxVar, this.f317725N, "shouldNotShowAnimation", new C114562al(this)).mo85223a(C114563am.f317696a);
    }

    /* renamed from: d */
    public final void mo101414d(C58485gu guVar, C87546b bVar, boolean z) {
        int a;
        int a2;
        C53420nf nfVar;
        int i;
        int i2;
        C58485gu guVar2 = guVar;
        C87546b bVar2 = bVar;
        C58976aa aaVar = C58975e.f156826a;
        if (guVar.isEmpty()) {
            C59104x d = f317711a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ZSMainController");
            ((C59052c) ((C59052c) d).mo56372aa(29169)).mo56386p("#initializeSections(): received empty section data list.");
            if (z) {
                this.f317752l.f318451d = null;
                return;
            }
            return;
        }
        this.f317733V.mo101656a();
        C58480gp e = C58485gu.m89837e();
        int i3 = 0;
        while (i3 < guVar.size()) {
            C114758l lVar = (C114758l) guVar2.get(i3);
            if (lVar instanceof C115080y) {
                i2 = i3;
                C58833ax a3 = this.f317721J.mo101449a(lVar, (C58485gu) null, this.f317723L, bVar, this.f317722K, C53306j.AMBIENT, this.f317741ad, false, (AnimatorListenerAdapter) null);
                if (a3.mo56113h()) {
                    ViewGroup viewGroup = this.f317764x;
                    viewGroup.getClass();
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.zero_state_footer_view);
                    this.f317766z = viewGroup2;
                    viewGroup2.addView(((C114757k) a3.mo56107c()).mo101577a());
                    if (((C114757k) a3.mo56107c()).mo101579c() != null) {
                        C28293k c = ((C114757k) a3.mo56107c()).mo101579c();
                        c.getClass();
                        C114711cl clVar = this.f317713B;
                        clVar.getClass();
                        this.f317746f.mo101569d(c, ((C28257a) clVar.mo33782a()).f76908a);
                        this.f317718G = c;
                    }
                }
            } else {
                i2 = i3;
                if (lVar instanceof C115033cj) {
                    if (i2 < guVar.size() - 1) {
                        i = i2 + 1;
                        if (guVar2.get(i) instanceof C115033cj) {
                            m189914B(e, (C114758l) null, C58485gu.m89847o(lVar, (C114758l) guVar2.get(i)), bVar2);
                            i3 = i + 1;
                        }
                    }
                    m189914B(e, (C114758l) null, C58485gu.m89846n(lVar), bVar2);
                } else {
                    m189914B(e, lVar, (C58485gu) null, bVar2);
                }
            }
            i = i2;
            i3 = i + 1;
        }
        C58485gu f = e.mo55394f();
        f.getClass();
        this.f317719H.f318763a.clear();
        boolean z2 = !((C113787bc) this.f317731T.mo27525b()).mo100629i(false);
        int i4 = 0;
        while (true) {
            int i5 = 4;
            if (i4 >= ((C58724pq) f).f156474d) {
                break;
            }
            C114757k kVar = (C114757k) f.get(i4);
            if (kVar instanceof C115014br) {
                C115014br brVar = (C115014br) kVar;
                String str = brVar.f319228d.f319250b;
                if (!str.isEmpty()) {
                    brVar.f319239o.f318763a.put(str, new C114882n(str, 1, i4, -1, brVar));
                }
                C58485gu d2 = brVar.f319228d.mo101819d();
                int i6 = 0;
                while (i6 < d2.size()) {
                    C53366lf a4 = ((C114751e) d2.get(i6)).mo101573a();
                    if (a4.f140037b == i5) {
                        nfVar = (C53420nf) a4.f140038c;
                    } else {
                        nfVar = C53420nf.f140165o;
                    }
                    String str2 = nfVar.f140175i;
                    if (!str2.isEmpty()) {
                        C114796at atVar = brVar.f319240p;
                        C53265hm hmVar = nfVar.f140170d;
                        if (hmVar == null) {
                            hmVar = C53265hm.f139631f;
                        }
                        C53267ho hoVar = nfVar.f140171e;
                        if (hoVar == null) {
                            hoVar = C53267ho.f139638b;
                        }
                        if (!atVar.mo101600g(hmVar, hoVar)) {
                            C114882n nVar = r4;
                            Map map = brVar.f319239o.f318763a;
                            C114882n nVar2 = new C114882n(str2, 2, i4, i6, brVar);
                            map.put(str2, nVar);
                        }
                    }
                    i6++;
                    i5 = 4;
                }
                if (z2 && brVar.f319237m.mo79746e(C90059dk.f249163ct) && !C58837ba.m90859h(brVar.f319228d.f319249a.f140129b) && !brVar.f319228d.mo101819d().isEmpty()) {
                    ((ImageView) brVar.mo101577a().findViewById(R.id.generic_stacked_cards_section_customization_icon)).setVisibility(0);
                    z2 = false;
                    i4++;
                }
            }
            i4++;
        }
        C114711cl clVar2 = this.f317713B;
        clVar2.getClass();
        clVar2.f318305a = f;
        clVar2.mObservable.mo2879a();
        ((C113854ci) this.f317724M.mo27525b()).mo100702c();
        m189913A();
        this.f317737Z = f;
        C53287ih d3 = C87571n.m142340d(this.f317752l.f318451d);
        if (d3 != null) {
            this.f317719H.mo101689b(d3);
            this.f317743c.f318285f.f317856q.get();
            this.f317743c.f318285f.mo101447i();
            if (this.f317743c.f318285f.f317856q.get() && this.f317743c.f318285f.mo101447i() && (a2 = C53284ie.m86806a(d3.f139698d)) != 0 && a2 == 4) {
                this.f317760t = true;
                this.f317743c.mo101529e();
            } else if (z || (a = C53284ie.m86806a(d3.f139698d)) == 0 || a != 2 || !this.f317743c.f318285f.f317856q.get() || this.f317743c.f318285f.mo101447i()) {
                this.f317752l.f318451d = null;
            }
        }
    }

    /* renamed from: e */
    public final void mo101415e(boolean z) {
        View view = this.f317716E;
        if (view != null) {
            view.setVisibility(8);
        }
        if (this.f317715D == null) {
            ViewGroup viewGroup = this.f317764x;
            viewGroup.getClass();
            this.f317715D = ((ViewStub) viewGroup.findViewById(R.id.zero_state_offline_bar_view_stub)).inflate();
        }
        int i = true != z ? R.string.zero_state_network_error_toast_message : R.string.zero_state_generic_error_toast_message;
        View view2 = this.f317715D;
        view2.getClass();
        ((TextView) view2.findViewById(R.id.zero_state_blue_bar_description)).setText(((C73841bf) this.f317735X.mo27525b()).mo65322a().getString(i));
        View view3 = this.f317715D;
        view3.getClass();
        view3.setVisibility(0);
    }

    /* renamed from: f */
    public final boolean mo101416f(int i) {
        RecyclerView recyclerView = this.f317714C;
        return recyclerView != null && recyclerView.canScrollVertically(i);
    }

    /* renamed from: g */
    public final long mo101417g() {
        if (!((C114735e) this.f317754n.mo27525b()).f318399e.getAndSet(false)) {
            return 0;
        }
        C114735e eVar = (C114735e) this.f317754n.mo27525b();
        C58976aa aaVar = C58975e.f156826a;
        eVar.f318398d.get();
        return eVar.f318398d.get();
    }

    /* renamed from: h */
    public final Animator mo101418h() {
        ViewGroup viewGroup = this.f317764x;
        if (viewGroup == null) {
            return new ObjectAnimator();
        }
        return this.f317750j.mo101648a(viewGroup);
    }

    /* renamed from: i */
    public final void mo101419i(RecyclerView recyclerView) {
        C114711cl clVar = this.f317713B;
        clVar.getClass();
        C28293k a = clVar.mo33782a();
        recyclerView.getClass();
        C28295m.m52919e(recyclerView, ((C28257a) a).f76908a);
        C28291i iVar = new C28291i(recyclerView, this.f317746f);
        this.f317757q = iVar;
        C114711cl clVar2 = this.f317713B;
        clVar2.getClass();
        iVar.f76970d = clVar2;
        iVar.mo33786b();
        recyclerView.getViewTreeObserver().dispatchOnGlobalLayout();
        recyclerView.addOnScrollListener(this.f317728Q.mo101550a(a, 3));
    }

    /* renamed from: j */
    public final C63204j mo101420j() {
        return this.f317743c.f318285f.f317853n;
    }

    /* renamed from: k */
    public final void mo101421k(C0657fs fsVar) {
        RecyclerView recyclerView = this.f317714C;
        if (recyclerView != null) {
            recyclerView.mOnItemTouchListeners.add(fsVar);
        }
    }

    /* renamed from: l */
    public final void mo101422l() {
        mo101426p();
    }

    /* renamed from: m */
    public final void mo101423m() {
        C58976aa aaVar = C58975e.f156826a;
        this.f317743c.mo101526b();
        this.f317733V.mo101656a();
        if (this.f317714C != null) {
            this.f317757q.mo33787c();
            RecyclerView recyclerView = this.f317714C;
            recyclerView.getClass();
            this.f317757q = new C28291i(recyclerView, this.f317746f);
            RecyclerView recyclerView2 = this.f317714C;
            recyclerView2.getClass();
            recyclerView2.setAdapter((C0640fb) null);
        }
        m189913A();
    }

    /* renamed from: n */
    public final void mo101424n() {
        C58976aa aaVar = C58975e.f156826a;
        C53287ih d = C87571n.m142340d(this.f317752l.f318451d);
        if (d != null) {
            int a = C53284ie.m86806a(d.f139698d);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 0 || i == 1) {
                if (this.f317743c.f318285f.mo101447i() || mo101434x()) {
                    this.f317719H.mo101689b(d);
                    this.f317752l.f318451d = null;
                    return;
                }
                m189915C(true, C53270hr.FOREGROUND, d);
            } else if (i != 2) {
                if (!this.f317749i.mo79746e(C90014bt.f247287eM) || !this.f317749i.mo79746e(C90014bt.f247381gA)) {
                    this.f317719H.mo101689b(d);
                    this.f317752l.f318451d = null;
                } else {
                    C114711cl clVar = this.f317713B;
                    if (clVar != null) {
                        clVar.f318305a = C58485gu.m89845m();
                        clVar.mObservable.mo2879a();
                    }
                    this.f317760t = true;
                    this.f317743c.mo101529e();
                }
                int b = C53286ig.m86808b(d.f139703i);
                if (b != 0 && b == 26 && !d.f139705k.isEmpty()) {
                    try {
                        this.f317722K.mo65089a(Intent.parseUri(d.f139705k, 0));
                    } catch (URISyntaxException e) {
                        C59104x d2 = f317711a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "ZSMainController");
                        ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(29160)).mo56386p("Unable to parse intent to trigger after start.");
                    }
                }
            } else {
                m189915C(false, C53270hr.FOREGROUND, d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo101425o() {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f317756p) {
            SettableFuture settableFuture = this.f317762v;
            if (settableFuture != null) {
                if (!settableFuture.isDone()) {
                    return;
                }
            }
            this.f317759s = true;
            this.f317760t = true;
            SwipeRefreshLayout swipeRefreshLayout = this.f317712A;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.mo8794l(true, false);
            }
            SettableFuture settableFuture2 = new SettableFuture();
            this.f317762v = settableFuture2;
            C90875ai.m148465b(new C114566ap(this), C90877ak.m148471e(settableFuture2, this.f317749i.mo79743a(C90014bt.f247810oF) + 1, TimeUnit.SECONDS, this.f317726O), this.f317725N, "stopSpinnerFutureWithTimeout").mo85223a(new C114567aq(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101426p() {
        /*
            r3 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Object r0 = r3.f317756p
            monitor-enter(r0)
            com.google.common.util.concurrent.SettableFuture r1 = r3.f317762v     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.isDone()     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0010
            goto L_0x0019
        L_0x0010:
            com.google.common.util.concurrent.SettableFuture r1 = r3.f317762v     // Catch:{ all -> 0x001b }
            com.google.android.apps.gsa.x.c r2 = com.google.android.apps.gsa.p8883x.C118826c.f331422a     // Catch:{ all -> 0x001b }
            r1.mo57356n(r2)     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.C114575ay.mo101426p():void");
    }

    /* renamed from: q */
    public final void mo101427q(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f317749i.mo79746e(C90014bt.f247289eO) && this.f317749i.mo79746e(C90014bt.f247287eM)) {
            this.f317742b.getWindow().setStatusBarColor(C1878d.m5128a(this.f317720I, R.color.zero_state_main_view_v2_color));
        }
        RecyclerView recyclerView = this.f317714C;
        if (recyclerView != null) {
            C0653fo foVar = recyclerView.mLayout;
            if (foVar == null) {
                C59104x d = f317711a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ZSMainController");
                ((C59052c) ((C59052c) d).mo56372aa(29178)).mo56386p("#onPageSelected(): Zero State view has no layout manager attached.");
                return;
            }
            if (!z && !this.f317749i.mo79746e(C90014bt.f247287eM)) {
                foVar.scrollToPosition(0);
            }
            SharedPreferences.Editor edit = this.f317727P.edit();
            edit.putLong(TextUtils.concat(new CharSequence[]{"opa_zero_state_last_shown_time_millis_", this.f317729R.mo79659F(), "_", ((bm) this.f317730S.mo27525b()).b()}).toString(), this.f317748h.mo26870b());
            edit.apply();
            C114735e eVar = (C114735e) this.f317754n.mo27525b();
            if (eVar.f318397c.get()) {
                eVar.f318397c.set(false);
                eVar.mo101554b(C89849ae.OPA_ANDROID_ZERO_STATE_ENTER);
            }
        }
    }

    /* renamed from: r */
    public final void mo101428r() {
        C58976aa aaVar = C58975e.f156826a;
        C114905ad a = ((C114948z) this.f317734W.mo27525b()).mo101738a();
        if (a != null) {
            a.dismissAllowingStateLoss();
        }
        ((C114735e) this.f317754n.mo27525b()).mo101556d(C89849ae.OPA_ANDROID_ZERO_STATE_USER_EXIT);
    }

    /* renamed from: s */
    public final void mo101429s() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: t */
    public final void mo101430t(C87546b bVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f317745e.mo57356n(bVar);
    }

    /* renamed from: u */
    public final void mo101431u(C114753g gVar) {
        this.f317717F = gVar;
    }

    /* renamed from: v */
    public final void mo101432v(C28293k kVar) {
        this.f317740ac = kVar;
    }

    /* renamed from: w */
    public final void mo101433w(C91097g gVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f317722K = gVar;
        this.f317733V.f318683p = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r0 = com.google.assistant.p3994s.p3995a.C53284ie.m86806a(r0.f139698d);
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo101434x() {
        /*
            r3 = this;
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.b r0 = r3.f317752l
            java.lang.String r0 = r0.f318451d
            com.google.assistant.s.a.ih r0 = com.google.android.apps.gsa.search.shared.p6930h.C87571n.m142340d(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000c
            return r1
        L_0x000c:
            int r0 = r0.f139698d
            int r0 = com.google.assistant.p3994s.p3995a.C53284ie.m86806a(r0)
            if (r0 == 0) goto L_0x001a
            r2 = 4
            if (r0 == r2) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r0 = 1
            return r0
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.C114575ay.mo101434x():boolean");
    }

    /* renamed from: y */
    public final void mo101435y() {
    }

    /* renamed from: z */
    public final void mo101436z(C53270hr hrVar, C53287ih ihVar) {
        this.f317743c.mo101530f(hrVar, ihVar);
        this.f317760t = true;
    }
}
