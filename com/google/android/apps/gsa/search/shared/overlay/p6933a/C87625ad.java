package com.google.android.apps.gsa.search.shared.overlay.p6933a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.binaries.satin.app.afz;
import com.google.android.apps.gsa.search.shared.overlay.C87660i;
import com.google.android.apps.gsa.search.shared.overlay.C87661j;
import com.google.android.apps.gsa.search.shared.overlay.C87662k;
import com.google.android.apps.gsa.search.shared.overlay.C87663l;
import com.google.android.apps.gsa.search.shared.overlay.OverlaySearchPlateContainer;
import com.google.android.apps.gsa.search.shared.overlay.SearchOverlayLayout;
import com.google.android.apps.gsa.search.shared.p6923b.p6924a.C87506b;
import com.google.android.apps.gsa.search.shared.p6923b.p6924a.C87507c;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87964kc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87965kd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87966ke;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88210tf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88212th;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88269vk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88271vm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88296wk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88298wm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88377zk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88379zm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88383zq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88385zs;
import com.google.android.apps.gsa.search.shared.service.p6935b.aan;
import com.google.android.apps.gsa.search.shared.service.p6935b.aao;
import com.google.android.apps.gsa.search.shared.service.p6935b.aap;
import com.google.android.apps.gsa.search.shared.service.p6935b.aar;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88423au;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88424av;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88425aw;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.C88684g;
import com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.C88686i;
import com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.C88687j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88700i;
import com.google.android.apps.gsa.searchplate.C88890a;
import com.google.android.apps.gsa.searchplate.C88901ac;
import com.google.android.apps.gsa.searchplate.C88906ah;
import com.google.android.apps.gsa.searchplate.C88907ai;
import com.google.android.apps.gsa.searchplate.C88916ar;
import com.google.android.apps.gsa.searchplate.C88923ay;
import com.google.android.apps.gsa.searchplate.C88948k;
import com.google.android.apps.gsa.searchplate.ClearOrVoiceButton;
import com.google.android.apps.gsa.searchplate.SearchPlate;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;
import com.google.android.apps.gsa.searchplate.p6963a.C88895e;
import com.google.android.apps.gsa.searchplate.p6963a.C88897g;
import com.google.android.apps.gsa.searchplate.p6965c.C88927a;
import com.google.android.apps.gsa.searchplate.p6966d.C88937i;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7064i.C89922b;
import com.google.android.apps.gsa.shared.monet.C90164ae;
import com.google.android.apps.gsa.shared.monet.p7070b.p7075ac.C90183b;
import com.google.android.apps.gsa.shared.p7148ui.C90701m;
import com.google.android.apps.gsa.shared.p7148ui.CoScrollContainer;
import com.google.android.apps.gsa.shared.p7148ui.SuggestionGridLayout;
import com.google.android.apps.gsa.shared.p7148ui.header.C90691d;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.C90742az;
import com.google.android.apps.gsa.shared.util.C90758bb;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7187ui.C91122u;
import com.google.android.apps.gsa.shared.util.p7187ui.ClosedCallbackSpinner;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139701a;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10409e.C137420i;
import com.google.android.apps.search.googleapp.search.p10409e.C137421j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.p1731a.C21375e;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41703c;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58869cf;
import com.google.common.base.C58885cv;
import com.google.common.base.C58903m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59744ea;
import com.google.common.p4552o.C59745eb;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.amo;
import com.google.common.p4552o.aod;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.PrivateKeyType;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.a.ad */
/* compiled from: PG */
public class C87625ad implements C87661j, C90701m {

    /* renamed from: n */
    public static final C59071e f236770n = C59071e.m91332i("com.google.android.apps.gsa.search.shared.overlay.a.ad");

    /* renamed from: A */
    public final C87641o f236771A = new C87641o(this);

    /* renamed from: B */
    public ChildStub f236772B;

    /* renamed from: C */
    public final C87673aa f236773C;

    /* renamed from: D */
    final C87644r f236774D;

    /* renamed from: E */
    public final ClientConfig f236775E;

    /* renamed from: F */
    public final SearchOverlayLayout f236776F;

    /* renamed from: G */
    public final C87660i f236777G;

    /* renamed from: H */
    public final SearchPlate f236778H;

    /* renamed from: I */
    public final C88906ah f236779I;

    /* renamed from: J */
    public final C88907ai f236780J;

    /* renamed from: K */
    public final C68214a f236781K;

    /* renamed from: L */
    public final C139701a f236782L;

    /* renamed from: M */
    public final C68214a f236783M;

    /* renamed from: N */
    protected C88684g f236784N;

    /* renamed from: O */
    protected C88687j f236785O;

    /* renamed from: P */
    public final C88700i f236786P;

    /* renamed from: Q */
    public C88686i f236787Q;

    /* renamed from: R */
    public C41703c f236788R;

    /* renamed from: S */
    C88890a f236789S;

    /* renamed from: T */
    final C87648v f236790T = new C87648v(this);

    /* renamed from: U */
    public final boolean f236791U;

    /* renamed from: V */
    public final boolean f236792V;

    /* renamed from: W */
    public boolean f236793W;

    /* renamed from: X */
    public boolean f236794X;

    /* renamed from: Y */
    public boolean f236795Y;

    /* renamed from: Z */
    public boolean f236796Z;

    /* renamed from: a */
    private final boolean f236797a;

    /* renamed from: aA */
    View f236798aA;

    /* renamed from: aB */
    public boolean f236799aB;

    /* renamed from: aC */
    public boolean f236800aC;

    /* renamed from: aD */
    public boolean f236801aD;

    /* renamed from: aE */
    public C90936cf f236802aE;

    /* renamed from: aF */
    public boolean f236803aF;

    /* renamed from: aG */
    public String f236804aG = "and.gsa.so";

    /* renamed from: aH */
    public Window f236805aH;

    /* renamed from: aI */
    public boolean f236806aI;

    /* renamed from: aJ */
    public Response f236807aJ;

    /* renamed from: aK */
    public boolean f236808aK;

    /* renamed from: aL */
    public boolean f236809aL;

    /* renamed from: aM */
    C87642p f236810aM;

    /* renamed from: aN */
    public boolean f236811aN;

    /* renamed from: aO */
    public final Map f236812aO = new HashMap();

    /* renamed from: aP */
    public C88923ay f236813aP;

    /* renamed from: aQ */
    public ClosedCallbackSpinner f236814aQ;

    /* renamed from: aR */
    View f236815aR;

    /* renamed from: aS */
    public boolean f236816aS = false;

    /* renamed from: aT */
    public boolean f236817aT = true;

    /* renamed from: aU */
    public String f236818aU;

    /* renamed from: aV */
    public C28293k f236819aV;

    /* renamed from: aW */
    public boolean f236820aW = false;

    /* renamed from: aX */
    public boolean f236821aX = false;

    /* renamed from: aY */
    public boolean f236822aY = false;

    /* renamed from: aZ */
    public boolean f236823aZ = false;

    /* renamed from: aa */
    public boolean f236824aa = true;

    /* renamed from: ab */
    boolean f236825ab = false;

    /* renamed from: ac */
    int f236826ac = 0;

    /* renamed from: ad */
    public boolean f236827ad = false;

    /* renamed from: ae */
    boolean f236828ae;

    /* renamed from: af */
    boolean f236829af;

    /* renamed from: ag */
    protected boolean f236830ag;

    /* renamed from: ah */
    public int f236831ah = -1;

    /* renamed from: ai */
    protected int f236832ai = -1;

    /* renamed from: aj */
    public boolean f236833aj;

    /* renamed from: ak */
    public boolean f236834ak;

    /* renamed from: al */
    public final View f236835al;

    /* renamed from: am */
    public Intent f236836am;

    /* renamed from: an */
    public C87663l f236837an;

    /* renamed from: ao */
    public Query f236838ao = null;

    /* renamed from: ap */
    protected C60870cx f236839ap = C60866ct.f164955a;

    /* renamed from: aq */
    public C91097g f236840aq;

    /* renamed from: ar */
    public boolean f236841ar;

    /* renamed from: as */
    public boolean f236842as;

    /* renamed from: at */
    public boolean f236843at;

    /* renamed from: au */
    public Query f236844au = Query.f252741b;

    /* renamed from: av */
    protected boolean f236845av;

    /* renamed from: aw */
    protected boolean f236846aw;

    /* renamed from: ax */
    public C90183b f236847ax;

    /* renamed from: ay */
    public int f236848ay = 130;

    /* renamed from: az */
    public boolean f236849az;

    /* renamed from: b */
    private final boolean f236850b;

    /* renamed from: ba */
    public boolean f236851ba = false;

    /* renamed from: bb */
    public Bundle f236852bb;

    /* renamed from: bc */
    protected C87643q f236853bc;

    /* renamed from: bd */
    public C87662k f236854bd;

    /* renamed from: be */
    private boolean f236855be = false;

    /* renamed from: bf */
    private float f236856bf;

    /* renamed from: bg */
    private boolean f236857bg;

    /* renamed from: bh */
    private boolean f236858bh;

    /* renamed from: bi */
    private Bundle f236859bi;

    /* renamed from: bj */
    private final Map f236860bj = new HashMap();

    /* renamed from: bk */
    private boolean f236861bk = false;

    /* renamed from: c */
    private final boolean f236862c;

    /* renamed from: d */
    private final C21370a f236863d;

    /* renamed from: e */
    private final amo f236864e;

    /* renamed from: f */
    private final C58833ax f236865f;

    /* renamed from: g */
    private final C87640n f236866g = new C87640n(this);

    /* renamed from: h */
    private final boolean f236867h;

    /* renamed from: i */
    private final boolean f236868i;

    /* renamed from: j */
    private boolean f236869j;

    /* renamed from: k */
    private boolean f236870k;

    /* renamed from: l */
    private boolean f236871l;

    /* renamed from: m */
    private boolean f236872m = false;

    /* renamed from: o */
    C87623ab f236873o = C87623ab.NOT_SHOWN;

    /* renamed from: p */
    protected final Context f236874p;

    /* renamed from: q */
    protected final C90929bz f236875q;

    /* renamed from: r */
    protected final C22871g f236876r;

    /* renamed from: s */
    public final C87621a f236877s;

    /* renamed from: t */
    protected final C90758bb f236878t = new C90758bb();

    /* renamed from: u */
    public final LinearLayout f236879u;

    /* renamed from: v */
    protected final OverlaySearchPlateContainer f236880v;

    /* renamed from: w */
    public SuggestionGridLayout f236881w;

    /* renamed from: x */
    protected View f236882x;

    /* renamed from: y */
    protected final View f236883y;

    /* renamed from: z */
    protected final CoScrollContainer f236884z;

    protected C87625ad(View view, SearchOverlayLayout searchOverlayLayout, C90929bz bzVar, C22871g gVar, C91097g gVar2, ClientConfig clientConfig, C87621a aVar, C58833ax axVar, C58833ax axVar2, C68214a aVar2, C58833ax axVar3, C68214a aVar3, C87677ae aeVar, C139701a aVar4, C68214a aVar5) {
        SearchOverlayLayout searchOverlayLayout2 = searchOverlayLayout;
        C87621a aVar6 = aVar;
        aVar6.f236741f = clientConfig;
        this.f236835al = view;
        Context context = aVar6.f236739d;
        Context context2 = view.getContext();
        this.f236874p = context2;
        this.f236875q = bzVar;
        this.f236876r = gVar;
        this.f236840aq = gVar2;
        ClientConfig clientConfig2 = aVar6.f236741f;
        this.f236775E = clientConfig2;
        this.f236864e = clientConfig2.f236951d;
        this.f236877s = aVar6;
        this.f236865f = axVar3;
        this.f236781K = aVar3;
        this.f236782L = aVar4;
        this.f236783M = aVar5;
        this.f236793W = aVar6.f236742g;
        this.f236868i = aVar6.f236743h;
        Resources resources = context2.getResources();
        this.f236850b = aVar6.f236747l;
        this.f236803aF = aVar6.f236756u;
        boolean z = aVar6.f236750o;
        int i = aVar6.f236755t;
        this.f236832ai = 0;
        this.f236800aC = aVar6.f236754s;
        this.f236792V = aVar6.f236708F;
        this.f236867h = aVar6.f236709G;
        boolean z2 = aVar6.f236752q;
        this.f236791U = true;
        this.f236799aB = !aVar6.f236744i;
        C21375e eVar = new C21375e();
        this.f236863d = eVar;
        if (axVar3.mo56113h()) {
            C90164ae aeVar2 = (C90164ae) axVar3.mo56107c();
            aeVar2.f251927a = new C87651y(this);
            aeVar2.mo83912a();
        }
        this.f236784N = new C88684g();
        this.f236785O = new C88687j(eVar);
        this.f236786P = new C88700i();
        this.f236776F = searchOverlayLayout2;
        LinearLayout linearLayout = (LinearLayout) searchOverlayLayout.findViewById(R.id.search_container);
        this.f236879u = linearLayout;
        OverlaySearchPlateContainer overlaySearchPlateContainer = (OverlaySearchPlateContainer) linearLayout.findViewById(R.id.search_plate_container);
        this.f236880v = overlaySearchPlateContainer;
        SearchPlate searchPlate = (SearchPlate) overlaySearchPlateContainer.findViewById(R.id.search_plate);
        searchPlate.getClass();
        this.f236778H = searchPlate;
        int i2 = aVar6.f236736ag;
        if (i2 != 2) {
            String str = aVar6.f236757v;
            ClearOrVoiceButton clearOrVoiceButton = searchPlate.f240737j;
            clearOrVoiceButton.f240671e = true;
            clearOrVoiceButton.f240672f = (LinearLayout) searchPlate.findViewById(R.id.progress_or_clear_or_voice);
            clearOrVoiceButton.f240676j = i2;
            clearOrVoiceButton.f240673g = str;
            if (aVar6.f236758w) {
                searchPlate.f240695O = true;
            }
        }
        boolean z3 = aVar6.f236732ac;
        searchPlate.f240750w = z3;
        if (!z3) {
            LogoView logoView = ((C88948k) searchPlate.mo82668b()).f240958a;
            if (logoView != null) {
                C28295m.m52918d(logoView);
            }
            C28295m.m52918d(searchPlate.f240737j);
            for (View d : searchPlate.f240730c) {
                C28295m.m52918d(d);
            }
            searchPlate.f240730c.clear();
        }
        SearchPlate searchPlate2 = this.f236778H;
        searchPlate2.f240681A = aVar6.f236759x;
        searchPlate2.f240684D = aVar6.f236760y;
        searchPlate2.f240682B = aVar6.f236761z;
        searchPlate2.f240683C = aVar6.f236703A;
        this.f236813aP = new C88923ay(this.f236874p);
        if (aVar6.f236718P) {
            ClosedCallbackSpinner closedCallbackSpinner = (ClosedCallbackSpinner) this.f236778H.findViewById(R.id.voice_search_language_spinner);
            closedCallbackSpinner.getClass();
            this.f236814aQ = closedCallbackSpinner;
            closedCallbackSpinner.f254391e = new C87633g(this);
            if (aVar6.f236722T) {
                m142453au(this.f236778H.getResources().getStringArray(R.array.language_switcher_nudge_text_list), this.f236860bj);
                m142453au(this.f236778H.getResources().getStringArray(R.array.language_switcher_nudge_text_after_selection_list), this.f236812aO);
                View inflate = ((ViewStub) this.f236778H.findViewById(R.id.language_spinner_nudge_stub)).inflate();
                this.f236815aR = inflate;
                SearchPlate searchPlate3 = this.f236778H;
                C28292j jVar = new C28292j(117048);
                jVar.mo33795i(5);
                jVar.mo33794h(2);
                searchPlate3.mo82672f(inflate, jVar);
                this.f236815aR.findViewById(R.id.switcher_nudge_dismiss_btn).setOnClickListener(new C87634h(this));
            }
            this.f236814aQ.setAdapter((SpinnerAdapter) this.f236813aP);
            C87624ac acVar = new C87624ac(this);
            this.f236814aQ.setOnTouchListener(acVar);
            this.f236814aQ.setOnItemSelectedListener(acVar);
            C88923ay ayVar = this.f236813aP;
            ClosedCallbackSpinner closedCallbackSpinner2 = this.f236814aQ;
            ayVar.f240882e = closedCallbackSpinner2;
            C2043bi.m5526T(closedCallbackSpinner2, new C88916ar(ayVar));
            this.f236813aP.f240891n = new C87638l(this);
            this.f236778H.f240749v = true;
        }
        View findViewById = this.f236880v.findViewById(R.id.search_plate_separator);
        findViewById.getClass();
        this.f236798aA = findViewById;
        this.f236882x = view.findViewById(R.id.search_suggestions_container_scroll_view);
        this.f236772B = (ChildStub) view.findViewById(R.id.search_suggestions_container_stub);
        int i3 = aVar6.f236729a;
        if (i3 != 0) {
            CoScrollContainer coScrollContainer = (CoScrollContainer) view.findViewById(i3);
            coScrollContainer.getClass();
            this.f236884z = coScrollContainer;
            coScrollContainer.mo84808o(false);
            coScrollContainer.setFocusable(false);
            coScrollContainer.setOnTouchListener(new C87622aa(this));
            coScrollContainer.mo84822r(new C87652z(this));
            coScrollContainer.addOnLayoutChangeListener(new C87636j(this, coScrollContainer));
        } else {
            this.f236884z = null;
        }
        this.f236778H.mo82682o(new C90742az(this.f236878t));
        mo81815k(this.f236866g, false);
        C88907ai aiVar = new C88907ai(resources, aVar6.f236714L);
        this.f236780J = aiVar;
        C88906ah ahVar = new C88906ah(aiVar, this.f236880v, resources, aVar6.f236713K);
        this.f236779I = ahVar;
        this.f236778H.mo82675h(ahVar);
        Resources resources2 = this.f236874p.getResources();
        int color = this.f236874p.getResources().getColor(R.color.status_bar_background);
        int dimensionPixelSize = this.f236874p.getResources().getDimensionPixelSize(this.f236874p.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        int i4 = aVar6.f236738c;
        this.f236789S = new C88890a(resources2.getColor(R.color.search_scrim), resources2.getColor(R.color.agsa_color_surface), color, dimensionPixelSize);
        View findViewById2 = view.findViewById(aVar6.f236737b);
        this.f236883y = findViewById2;
        findViewById2.setBackground(this.f236789S);
        this.f236853bc = new C87643q(this);
        C88890a aVar7 = this.f236789S;
        C87643q qVar = this.f236853bc;
        boolean z4 = aVar6.f236745j;
        C87660i iVar = new C87660i(findViewById2, aVar7, qVar, z4, z4, aVar6.f236746k);
        this.f236777G = iVar;
        boolean z5 = aVar6.f236710H;
        if (iVar.f236930h != z5) {
            iVar.f236930h = z5;
            if (z5) {
                iVar.mo81854a();
            } else {
                iVar.f236923a.setVisibility(0);
            }
        }
        this.f236778H.mo82676i(new C87646t(this));
        C91122u uVar = aVar6.f236740e;
        C87647u uVar2 = new C87647u(this);
        C87673aa aaVar = aVar6.f236734ae;
        C87673aa a = aeVar.mo81958a(uVar2, uVar2, this.f236775E);
        this.f236773C = a;
        this.f236774D = new C87644r(this);
        C87642p pVar = new C87642p(this);
        this.f236810aM = pVar;
        this.f236778H.f240734g.f240784p = pVar;
        if (!aVar6.f236751p) {
            this.f236776F.f236701b = new C87635i(this, this.f236874p);
        }
        boolean z6 = aVar6.f236706D;
        this.f236794X = z6;
        if (z6) {
            mo81804ak();
        }
        this.f236797a = aVar6.f236707E;
        this.f236862c = aVar6.f236753r;
        if (aVar6.f236711I) {
            C58976aa aaVar2 = C58975e.f156826a;
            FrameLayout frameLayout = (FrameLayout) this.f236879u.findViewById(R.id.progress_bar_container);
            frameLayout.getClass();
            Context context3 = this.f236874p;
            new C90691d(a, context3, frameLayout, context3.getResources().getDimensionPixelSize(R.dimen.material_progress_bar_bottom_margin), this.f236778H, aVar2);
        }
        mo81795ab(aVar6.f236713K);
        if (C90962a.m148577a(this.f236874p) && !TextUtils.isEmpty(aVar6.f236717O)) {
            this.f236778H.mo82677j(aVar6.f236717O);
        }
        if (!C90962a.m148577a(this.f236874p) && !TextUtils.isEmpty(aVar6.f236716N)) {
            this.f236778H.mo82677j(aVar6.f236716N);
        }
        SearchPlate searchPlate4 = this.f236778H;
        searchPlate4.f240742o.setBackgroundColor(searchPlate4.getContext().getResources().getColor(R.color.search_plate_separator_color));
        if (axVar2.mo56113h() && axVar.mo56113h()) {
            afz afz = (afz) axVar2.mo56107c();
            afz.f196077a = Long.valueOf(((Long) axVar.mo56107c()).longValue());
            this.f236837an = afz.mo65566a().a();
        }
    }

    /* renamed from: aA */
    private final void m142448aA(boolean z) {
        this.f236876r.mo28213m("Show location permission toast", 500, new C87631e(this, z));
    }

    /* renamed from: aB */
    private final void m142449aB(int i) {
        if (this.f236877s.f236733ad) {
            C87673aa aaVar = this.f236773C;
            C88489j jVar = new C88489j(C87739bu.SEARCH_BUBBLE_SNA_EVENT);
            C62940bt btVar = C87507c.f236343d;
            C87506b bVar = (C87506b) C87507c.f236342c.createBuilder();
            bVar.copyOnWrite();
            C87507c cVar = (C87507c) bVar.instance;
            cVar.f236346b = i - 1;
            cVar.f236345a |= 1;
            jVar.mo82014b(btVar, (C87507c) bVar.build());
            aaVar.mo81937i(jVar.mo82013a());
        }
    }

    /* renamed from: aq */
    protected static final int m142450aq(int i) {
        return i != 1 ? 0 : 1;
    }

    /* renamed from: as */
    private final Query m142451as(Query query) {
        if (this.f236830ag) {
            query = query.mo84277aN().mo84265aB();
        }
        C90498f i = query.mo84486o().mo84480i();
        i.mo84572d(1048576, 0);
        return i.mo84568a().mo84487p().mo84489r().mo84275aL(this.f236804aG).mo84272aI(this.f236864e);
    }

    /* renamed from: at */
    private final void m142452at(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int dimensionPixelSize = this.f236874p.getResources().getDimensionPixelSize(R.dimen.full_bleed_suggestion_list_top_margin);
        if (marginLayoutParams.topMargin != 0 && marginLayoutParams.topMargin != dimensionPixelSize) {
            marginLayoutParams.topMargin = dimensionPixelSize;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: au */
    private static void m142453au(String[] strArr, Map map) {
        for (String i : strArr) {
            List i2 = C58869cf.m90936b(new C58903m(':')).mo56155i(i);
            if (i2.size() == 2) {
                map.put((String) i2.get(0), (String) i2.get(1));
            }
        }
    }

    /* renamed from: av */
    private final void m142454av() {
        C90936cf cfVar = this.f236802aE;
        if (cfVar != null) {
            this.f236875q.mo85149n(cfVar);
            this.f236802aE = null;
        }
    }

    /* renamed from: aw */
    private final void m142455aw() {
        boolean z = true;
        if (!this.f236846aw && !this.f236870k) {
            z = false;
        }
        mo81797ad(0, 0, z);
        this.f236846aw = false;
        this.f236845av = false;
        C87662k kVar = this.f236854bd;
        if (kVar != null) {
            kVar.mo71032a();
        }
    }

    /* renamed from: ax */
    private final void m142456ax() {
        if (!this.f236773C.mo81953y() && this.f236836am == null) {
            if (this.f236862c || ((!this.f236867h && this.f236849az) || this.f236795Y)) {
                this.f236773C.mo81947s((Bundle) null);
                this.f236849az = false;
                return;
            }
            this.f236773C.mo81946r(((Long) ((C58885cv) this.f236877s.f236735af).f156729a).longValue(), (Bundle) null, C88431bb.f239082a);
        }
    }

    /* renamed from: ay */
    private final void m142457ay(Bundle bundle) {
        bundle.putParcelable("search_overlay_impl:query", this.f236844au);
        if (this.f236844au.equals(Query.f252741b)) {
            bundle.putBoolean("search_overlay_impl:query_empty", true);
        }
    }

    /* renamed from: az */
    private final void m142458az(CoScrollContainer coScrollContainer, boolean z) {
        this.f236825ab = z;
        coScrollContainer.mo84808o(z);
        coScrollContainer.setFocusable(z);
    }

    /* renamed from: A */
    public final boolean mo81768A() {
        C87621a aVar = this.f236877s;
        return aVar.f236704B && !aVar.f236712J;
    }

    /* renamed from: B */
    public final void mo81769B(C87662k kVar) {
        this.f236854bd = kVar;
        if (kVar != null) {
            kVar.mo77726g(this.f236831ah != 0);
        }
    }

    /* renamed from: C */
    public final void mo81770C(QueryTriggerType queryTriggerType) {
        Query query;
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f236871l && !this.f236846aw) {
            mo81794aa();
            mo81799af(true);
            C87621a aVar = this.f236877s;
            if (aVar.f236718P) {
                this.f236817aT = true;
            }
            if (!this.f236828ae) {
                if (aVar.f236712J) {
                    this.f236829af = true;
                    this.f236828ae = true;
                } else if (!mo81768A()) {
                    ((C89859i) this.f236781K.mo27525b()).mo83702b(C89849ae.VOICE_SEARCH_UI_SHOWN);
                    C87621a aVar2 = this.f236877s;
                    int i = true != aVar2.f236725W ? 0 : 16;
                    if (aVar2.f236726X) {
                        i |= 2048;
                    }
                    if (aVar2.f236727Y) {
                        i |= 128;
                    }
                    if (aVar2.f236728Z) {
                        i |= 16384;
                    }
                    mo81797ad(2, i, false);
                    this.f236844au = m142451as(Query.f252741b.mo84294af());
                    this.f236854bd.mo81860k();
                    mo81798ae(this.f236844au, false);
                } else {
                    mo81828x();
                    return;
                }
            }
            if (mo81768A()) {
                mo81828x();
                return;
            }
            Query af = Query.f252741b.mo84294af();
            if (queryTriggerType == null) {
                query = af.mo84297ai();
            } else {
                query = af.mo84286aW(queryTriggerType).mo84297ai();
            }
            if (queryTriggerType == QueryTriggerType.AGA_PROGRAMMATIC_LANGUAGE_SWITCHER_CLOSED) {
                if (this.f236823aZ && !this.f236877s.f236720R) {
                    this.f236823aZ = false;
                    String c = this.f236813aP.mo82798c();
                    C90498f i2 = query.mo84480i();
                    i2.mo84566Y(c);
                    query = i2.mo84568a();
                }
                C87673aa aaVar2 = this.f236773C;
                C88489j jVar = new C88489j(C87739bu.SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SWITCHER_CLOSED);
                jVar.mo82015c(m142451as(query));
                aaVar2.mo81937i(jVar.mo82013a());
                return;
            }
            if (this.f236877s.f236718P) {
                this.f236861bk = false;
            }
            C87673aa aaVar3 = this.f236773C;
            C88489j jVar2 = new C88489j(C87739bu.SEARCH_PLATE_MIC_TAPPED);
            jVar2.mo82015c(m142451as(query));
            aaVar3.mo81937i(jVar2.mo82013a());
            this.f236773C.mo81937i(new C88489j(C87739bu.SEARCH_PLATE_MIC_TAPPED_FOR_OPA_PROMO_NOTIFICATIONS).mo82013a());
        }
    }

    /* renamed from: D */
    public final void mo81771D() {
        this.f236793W = true;
    }

    /* renamed from: E */
    public final void mo81772E() {
        mo81770C((QueryTriggerType) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final Query mo81773F(aod aod) {
        Query query = this.f236844au;
        C88686i iVar = this.f236787Q;
        if (iVar == null || !iVar.mo82303E()) {
            return query;
        }
        C60456qs a = iVar.mo82308a(aod);
        if (!"and.gsa.so".equals(this.f236804aG)) {
            C60455qr qrVar = (C60455qr) a.toBuilder();
            C59744ea eaVar = (C59744ea) C59745eb.f161422d.createBuilder();
            int hashCode = this.f236804aG.hashCode();
            eaVar.copyOnWrite();
            C59745eb ebVar = (C59745eb) eaVar.instance;
            ebVar.f161424a |= 1;
            ebVar.f161425b = hashCode;
            qrVar.copyOnWrite();
            C60456qs qsVar = (C60456qs) qrVar.instance;
            C59745eb ebVar2 = (C59745eb) eaVar.build();
            ebVar2.getClass();
            qsVar.f163609f = ebVar2;
            qsVar.f163604a |= 256;
            a = (C60456qs) qrVar.build();
        }
        return query.mo84289aZ(a.toByteArray());
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo81774G(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        Query as = m142451as(query);
        this.f236844au = as;
        this.f236773C.mo81931b(as);
        this.f236854bd.mo81860k();
    }

    /* renamed from: H */
    public final void mo81775H() {
        m142454av();
        C87639m mVar = new C87639m(this);
        this.f236802aE = mVar;
        this.f236875q.mo85151p(mVar);
    }

    /* renamed from: I */
    public final void mo81776I(Response response) {
        if (this.f236787Q == null) {
            this.f236807aJ = response;
            return;
        }
        mo81778K();
        this.f236787Q.mo82314r(response);
    }

    /* renamed from: J */
    public final void mo81777J() {
        this.f236784N.mo82378j(this.f236844au.mo84352bk());
    }

    /* renamed from: K */
    public final void mo81778K() {
        if (this.f236826ac != 0) {
            C88686i iVar = this.f236787Q;
            C58976aa aaVar = C58975e.f156826a;
            iVar.mo82307I(this.f236881w);
        }
    }

    /* renamed from: L */
    public final void mo81779L() {
        C88686i iVar = this.f236787Q;
        if (iVar != null && iVar.mo82303E()) {
            iVar.mo82315w(mo76806b());
        }
    }

    /* renamed from: M */
    public final void mo81780M() {
        Query query;
        int i = this.f236831ah;
        boolean b = C88927a.m144527b(i);
        if (b && (query = this.f236844au) != null) {
            mo81827w(query, true);
        } else if (i == 0 || b) {
            mo81827w(Query.f252741b, true);
        }
    }

    /* renamed from: N */
    public final void mo81781N() {
        View view = this.f236798aA;
        int i = 8;
        if (this.f236831ah == 1 && mo81806am() && this.f236796Z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* renamed from: O */
    public final void mo81782O(int i) {
        int i2 = this.f236831ah;
        int i3 = 0;
        boolean z = true;
        if (i2 == 1) {
            if (!mo81806am()) {
                i2 = 1;
            } else {
                i2 = 1;
                z = false;
            }
        }
        if ((i & 16384) != 0 && i2 == 2) {
            z = false;
        }
        if (z != this.f236855be) {
            if (z) {
                i3 = this.f236874p.getResources().getDimensionPixelSize(R.dimen.search_plate_side_margin);
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f236880v.getLayoutParams();
            layoutParams.leftMargin = i3;
            layoutParams.rightMargin = i3;
            this.f236880v.setLayoutParams(layoutParams);
            this.f236855be = z;
        }
    }

    /* renamed from: P */
    public final void mo81783P() {
        if (this.f236787Q == null) {
            return;
        }
        if (this.f236784N.mo82380m() || this.f236786P.mo82422g()) {
            this.f236787Q.mo44274C();
        }
    }

    /* renamed from: Q */
    public final void mo81784Q(Intent intent, Bundle bundle) {
    }

    /* renamed from: R */
    public final void mo81785R() {
        C58976aa aaVar = C58975e.f156826a;
        this.f236834ak = true;
        C87663l lVar = this.f236837an;
        if (lVar != null && !lVar.f236915a && !lVar.f236936e) {
            if (lVar.f236934c.mo56113h()) {
                ((C89922b) lVar.f236934c.mo56107c()).mo83757a();
            }
            lVar.f236935d.mo41633g();
            lVar.f236936e = true;
            if (lVar.f236940i) {
                lVar.mo81868c(lVar.f236941j, lVar.f236942k);
            }
        }
        m142456ax();
        if (this.f236800aC) {
            this.f236800aC = false;
            mo81775H();
        }
    }

    /* renamed from: S */
    public final void mo81786S() {
        if (this.f236820aW) {
            this.f236815aR.setVisibility(8);
            if (this.f236877s.f236719Q) {
                this.f236773C.mo81937i(new C88489j(C87739bu.STOP_PLAYING_AUDIO).mo82013a());
            }
        }
        this.f236773C.mo81937i(new C88489j(C87739bu.SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SWITCHER_INTERACTION_MADE).mo82013a());
    }

    /* renamed from: T */
    public final void mo81787T(Bundle bundle) {
        Query query;
        C58976aa aaVar = C58975e.f156826a;
        if (bundle != null) {
            this.f236773C.mo81945q(bundle);
            this.f236846aw = bundle.getBoolean("search_overlay_impl:starting_new_activity");
            if (bundle.getBoolean("search_overlay_impl:query_empty")) {
                query = Query.f252741b;
            } else {
                query = (Query) bundle.getParcelable("search_overlay_impl:query");
                if (query == null) {
                    query = Query.f252741b;
                }
            }
            this.f236844au = query;
            mo81798ae(query, true);
            if (bundle.containsKey("search_overlay_impl:search_started")) {
                this.f236843at = bundle.getBoolean("search_overlay_impl:search_started");
            }
            if (bundle.containsKey("search_overlay_impl:search_plate_mode")) {
                int i = bundle.getInt("search_overlay_impl:search_plate_mode");
                C58838bb.m90868c(C88927a.m144530e(i));
                this.f236831ah = i;
            }
            this.f236826ac = m142450aq(this.f236831ah);
            this.f236872m = mo81806am();
            if (bundle.containsKey("search_overlay_impl:suggest_full_bleed_ui_enabled")) {
                boolean z = bundle.getBoolean("search_overlay_impl:suggest_full_bleed_ui_enabled");
                this.f236796Z = z;
                this.f236824aa = !z;
                this.f236779I.mo82775l(z);
            }
            if (bundle.containsKey("search_overlay_impl:vaa_shown")) {
                C87623ab abVar = (C87623ab) bundle.getSerializable("search_overlay_impl:vaa_shown");
                abVar.getClass();
                this.f236873o = abVar;
            }
            if (bundle.containsKey("search_overlay_impl:key_switcher_shown")) {
                this.f236816aS = bundle.getBoolean("search_overlay_impl:key_switcher_shown");
            }
            if (this.f236884z != null && bundle.containsKey("search_overlay_impl:suggest_scroll_events_enabled")) {
                m142458az(this.f236884z, bundle.getBoolean("search_overlay_impl:suggest_scroll_events_enabled"));
            }
            if (this.f236831ah == 2) {
                this.f236851ba = true;
                this.f236852bb = bundle;
            }
            SearchPlate searchPlate = this.f236778H;
            searchPlate.f240688H = bundle.getString("search_plate:search_plate_error");
            for (C88895e j : searchPlate.f240733f) {
                j.mo82750j(bundle);
            }
            if (bundle.containsKey("search_plate:search_plate_mode")) {
                int i2 = bundle.getInt("search_plate:search_plate_mode");
                C58838bb.m90868c(C88927a.m144530e(i2));
                searchPlate.mo82680m(i2, 2, true, true);
            }
            if (bundle.containsKey("search_plate:recognition_state")) {
                searchPlate.mo82692s(bundle.getInt("search_plate:recognition_state"), false);
            }
            CharSequence charSequence = bundle.getCharSequence("search_plate:text_container_text");
            if (charSequence != null) {
                searchPlate.f240734g.mo82725j(charSequence);
            }
            mo81804ak();
            return;
        }
        mo81802ai();
        int i3 = this.f236832ai;
        if (C88927a.m144530e(i3)) {
            mo81797ad(i3, 2, true);
        }
    }

    /* renamed from: U */
    public final void mo81788U() {
        C58976aa aaVar = C58975e.f156826a;
        this.f236879u.setTranslationY(this.f236856bf);
        this.f236801aD = false;
        if (this.f236846aw && !this.f236845av && !this.f236869j) {
            mo81799af(false);
            if (!this.f236867h) {
                this.f236773C.mo81930a(false);
            }
            m142455aw();
        }
        this.f236845av = false;
        this.f236869j = false;
        this.f236846aw = false;
        m142456ax();
        if (this.f236831ah == 1) {
            mo81796ac(true, true);
        }
        this.f236795Y = false;
        this.f236778H.f240739l.setImageResource(true != C90962a.m148577a(this.f236874p) ? R.drawable.ic_searchbox_google : R.drawable.googlelogo_light_color_68x28);
        m142449aB(3);
    }

    /* renamed from: V */
    public final void mo81789V(Bundle bundle) {
        int i;
        C58976aa aaVar = C58975e.f156826a;
        m142457ay(bundle);
        bundle.putBoolean("search_overlay_impl:search_started", this.f236843at);
        this.f236773C.mo81942n(bundle);
        SearchPlate searchPlate = this.f236778H;
        C88901ac acVar = searchPlate.f240689I;
        if (acVar.f240804c) {
            i = acVar.f240806e;
        } else {
            i = acVar.f240803b ? acVar.f240805d : acVar.f240809h.f240687G;
        }
        bundle.putInt("search_plate:recognition_state", i);
        int a = searchPlate.f240689I.mo82755a();
        if (a == 7) {
            bundle.putString("search_plate:search_plate_error", searchPlate.f240688H);
            a = 7;
        }
        bundle.putInt("search_plate:search_plate_mode", a);
        bundle.putCharSequence("search_plate:text_container_text", searchPlate.f240734g.mo82717b().getText());
        for (C88895e k : searchPlate.f240733f) {
            k.mo82751k(bundle);
        }
        int i2 = this.f236831ah;
        if (C88927a.m144530e(i2)) {
            bundle.putInt("search_overlay_impl:search_plate_mode", i2);
        }
        bundle.putBoolean("search_overlay_impl:starting_new_activity", this.f236846aw);
        bundle.putBoolean("search_overlay_impl:suggest_full_bleed_ui_enabled", this.f236796Z);
        bundle.putBoolean("search_overlay_impl:suggest_scroll_events_enabled", this.f236825ab);
        bundle.putSerializable("search_overlay_impl:vaa_shown", this.f236873o);
        bundle.putBoolean("search_overlay_impl:key_switcher_shown", this.f236778H.f240747t.getVisibility() == 0);
        this.f236859bi = bundle;
        mo81783P();
    }

    /* renamed from: W */
    public final void mo81790W() {
        C58976aa aaVar = C58975e.f156826a;
        this.f236833aj = true;
        this.f236776F.f236702c = this;
        this.f236778H.mo82676i(new C87646t(this));
        if (!this.f236799aB && this.f236802aE == null) {
            C87639m mVar = new C87639m(this);
            this.f236802aE = mVar;
            this.f236875q.mo85152q(mVar);
        } else if (this.f236795Y || this.f236797a) {
            mo81804ak();
        }
    }

    /* renamed from: X */
    public final void mo81791X(boolean z) {
        Bundle bundle;
        C58976aa aaVar = C58975e.f156826a;
        m142449aB(5);
        this.f236833aj = false;
        this.f236869j = false;
        this.f236778H.mo82676i((C88893c) null);
        C87663l lVar = this.f236837an;
        if (lVar != null && !lVar.f236915a) {
            lVar.f236915a = true;
        }
        if (z) {
            this.f236773C.mo81948t(true);
            this.f236795Y = true;
        } else {
            this.f236858bh = false;
            if (!this.f236850b || !this.f236844au.mo84392cY() || this.f236846aw) {
                mo81796ac(false, true);
                if (!this.f236867h && !this.f236846aw) {
                    this.f236773C.mo81930a(false);
                }
                this.f236773C.mo81948t(false);
                mo81799af(false);
                mo17500a();
            } else {
                this.f236773C.mo81948t(false);
                mo81804ak();
            }
            if (this.f236836am != null) {
                this.f236836am = null;
                C59104x b = f236770n.mo56224b();
                b.mo56378ag(C58975e.f156826a, "SearchOverlay");
                ((C59052c) ((C59052c) b).mo56372aa(9711)).mo56386p("Pending launch intent cancelled.");
            }
        }
        if (this.f236844au.equals(Query.f252741b) && (bundle = this.f236859bi) != null) {
            m142457ay(bundle);
        }
        if (this.f236795Y) {
            this.f236773C.mo81933e();
        }
        this.f236859bi = null;
    }

    /* renamed from: Y */
    public final void mo81792Y(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        this.f236857bg = z;
        this.f236773C.mo81939k(z, SystemClock.elapsedRealtime());
        if (z) {
            if (this.f236841ar) {
                this.f236876r.mo28212l("Show keyboard", new C87629c(this));
            }
            if (this.f236873o == C87623ab.BEING_SHOWN || this.f236873o == C87623ab.PAGE_CLOSED) {
                this.f236873o = C87623ab.PAGE_CLOSED_AND_VOICE_SEARCH_TRIGGERED;
                C88893c cVar = this.f236778H.f240752y;
                if (cVar != null) {
                    cVar.mo17639i();
                }
            }
        }
    }

    /* renamed from: Z */
    public final void mo81793Z(String str, boolean z) {
        if (z) {
            ((C89859i) this.f236781K.mo27525b()).mo83702b(C89849ae.VOICE_SEARCH_LANGUAGE_PICKER_NUDGE_INTRO_TTS);
        } else {
            ((C89859i) this.f236781K.mo27525b()).mo83702b(C89849ae.VOICE_SEARCH_LANGUAGE_PICKER_NUDGE_TTS_PLAYED_AFTER_LANGUAGE_SELECTED);
        }
        aao aao = (aao) aap.f237093d.createBuilder();
        aao.copyOnWrite();
        aap aap = (aap) aao.instance;
        aap.f237095a |= 1;
        aap.f237096b = z;
        aao.copyOnWrite();
        aap aap2 = (aap) aao.instance;
        str.getClass();
        aap2.f237095a |= 2;
        aap2.f237097c = str;
        C87673aa aaVar = this.f236773C;
        C88489j jVar = new C88489j(C87739bu.PLAY_TTS_NUDGE_LANGUAGE_PICKER_VOICE_SEARCH);
        jVar.mo82014b(aan.f237092a, (aap) aao.build());
        aaVar.mo81937i(jVar.mo82013a());
    }

    /* renamed from: a */
    public final void mo17500a() {
        C87662k kVar = this.f236854bd;
        if (kVar == null || !kVar.mo76792f()) {
            mo81810ar();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final void mo81794aa() {
        C88687j jVar = this.f236785O;
        jVar.f239793b = jVar.f239792a.mo26871c();
        this.f236811aN = false;
        C88686i iVar = this.f236787Q;
        if (iVar != null) {
            iVar.mo82317z();
        } else {
            this.f236808aK = true;
        }
    }

    /* renamed from: ab */
    public final void mo81795ab(boolean z) {
        View view;
        CoScrollContainer coScrollContainer;
        boolean z2 = z && this.f236877s.f236715M;
        this.f236796Z = z2;
        if (z2 && (coScrollContainer = this.f236884z) != null) {
            m142452at(coScrollContainer);
        }
        if (this.f236796Z && (view = this.f236882x) != null) {
            m142452at(view);
        }
        mo81781N();
        mo81782O(0);
    }

    /* renamed from: ac */
    public final void mo81796ac(boolean z, boolean z2) {
        this.f236841ar = false;
        if (!z) {
            this.f236778H.mo82693t(z2);
        } else if (this.f236857bg) {
            mo81805al(true);
            this.f236778H.mo82670d(z2);
        } else {
            this.f236841ar = true;
            if (!this.f236842as) {
                this.f236842as = z2;
            }
        }
    }

    /* renamed from: ad */
    public final void mo81797ad(int i, int i2, boolean z) {
        if (i == 0) {
            if (!this.f236793W) {
                return;
            }
            if (!this.f236877s.f236718P || this.f236817aT) {
                i = 0;
            } else {
                return;
            }
        }
        if (C88927a.m144527b(i)) {
            m142449aB(6);
        }
        if (C88927a.m144527b(i)) {
            if (!this.f236868i) {
                return;
            }
            if (this.f236877s.f236718P && !this.f236817aT) {
                return;
            }
        }
        C87641o oVar = this.f236771A;
        C58976aa aaVar = C58975e.f156826a;
        C87625ad adVar = oVar.f236900a;
        boolean z2 = z | (!adVar.f236803aF);
        if (i != 0 && !C88927a.m144527b(i)) {
            adVar.f236803aF = true;
        }
        if (!(i == 0 || (i2 & 1) == 0 || adVar.f236775E.mo81876F())) {
            oVar.f236900a.mo81799af(true);
        }
        C87625ad adVar2 = oVar.f236900a;
        if (adVar2.f236831ah != i || (i2 & 2) != 0) {
            adVar2.f236778H.mo82680m(i, i2, z2, z2);
        }
    }

    /* renamed from: ae */
    public final void mo81798ae(Query query, boolean z) {
        this.f236778H.mo82681n(C88937i.m144544a(query), z);
        C87662k kVar = this.f236854bd;
        if (kVar != null) {
            kVar.mo81864o();
        }
    }

    /* renamed from: af */
    public final void mo81799af(boolean z) {
        if (this.f236843at != z) {
            if (!z) {
                C58976aa aaVar = C58975e.f156826a;
            }
            this.f236843at = z;
            mo81804ak();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ag */
    public final void mo81800ag(int i) {
        if (i != this.f236826ac) {
            C58976aa aaVar = C58975e.f156826a;
            this.f236826ac = i;
            mo81781N();
            boolean z = false;
            mo81782O(0);
            boolean am = mo81806am();
            if (am && !this.f236872m) {
                mo81794aa();
                mo81799af(true);
            }
            CoScrollContainer coScrollContainer = this.f236884z;
            if (coScrollContainer != null) {
                if (1 == i) {
                    z = true;
                }
                m142458az(coScrollContainer, z);
            }
            this.f236872m = am;
            C88686i iVar = this.f236787Q;
            if (iVar != null) {
                if (i == 0) {
                    iVar.mo82312m();
                    return;
                }
                iVar.mo82311k();
                this.f236787Q.mo82307I(this.f236881w);
                this.f236787Q.mo82313p();
                this.f236787Q.mo82301B();
            }
        }
    }

    /* renamed from: ah */
    public final void mo81801ah() {
        Intent intent = this.f236836am;
        if (intent != null) {
            boolean a = this.f236840aq.mo65089a(intent);
            C58976aa aaVar = C58975e.f156826a;
            this.f236836am = null;
            if (a) {
                if (intent.getComponent() != null && intent.getComponent().getClassName().equals("com.google.android.apps.gsa.velour.dynamichosts.TransparentVelvetDynamicHostActivity")) {
                    this.f236845av = true;
                }
                this.f236846aw = true;
                this.f236849az = true;
                mo81804ak();
            }
        }
    }

    /* renamed from: ai */
    public final void mo81802ai() {
        if (this.f236809aL) {
            C88430ba baVar = (C88430ba) C88431bb.f239082a.createBuilder();
            C62940bt btVar = C88425aw.f239075a;
            C88423au auVar = (C88423au) C88424av.f239071c.createBuilder();
            auVar.copyOnWrite();
            C88424av avVar = (C88424av) auVar.instance;
            avVar.f239073a |= 1;
            avVar.f239074b = true;
            baVar.mo58885m(btVar, (C88424av) auVar.build());
            this.f236773C.mo81946r(1, (Bundle) null, (C88431bb) baVar.build());
            return;
        }
        this.f236773C.mo81947s((Bundle) null);
    }

    /* renamed from: aj */
    public final void mo81803aj() {
        if (this.f236773C.mo81951w()) {
            this.f236773C.mo81949u();
        }
    }

    /* renamed from: al */
    public final void mo81805al(boolean z) {
        Window window = this.f236805aH;
        if (window != null) {
            int i = true != z ? 32 : 48;
            C58976aa aaVar = C58975e.f156826a;
            window.setSoftInputMode(i);
        }
    }

    /* renamed from: am */
    public final boolean mo81806am() {
        return this.f236826ac == 1;
    }

    /* renamed from: an */
    public final boolean mo81807an() {
        if (!this.f236843at) {
            return false;
        }
        mo17500a();
        return true;
    }

    /* renamed from: ao */
    public final void mo81808ao() {
        ClosedCallbackSpinner closedCallbackSpinner;
        C58976aa aaVar = C58975e.f156826a;
        this.f236856bf = this.f236879u.getTranslationY();
        if (this.f236877s.f236718P && (closedCallbackSpinner = this.f236814aQ) != null) {
            closedCallbackSpinner.mo85364c();
        }
        this.f236869j = true;
    }

    /* renamed from: ap */
    public final void mo81809ap() {
        C58976aa aaVar = C58975e.f156826a;
        this.f236871l = true;
        this.f236776F.f236702c = null;
        if (this.f236865f.mo56113h()) {
            C90164ae aeVar = (C90164ae) this.f236865f.mo56107c();
            aeVar.f251927a = null;
            aeVar.mo83912a();
        }
        m142454av();
        this.f236773C.mo81934f();
    }

    /* renamed from: ar */
    public final void mo81810ar() {
        boolean z = this.f236831ah == 0;
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f236846aw && !z) {
            this.f236773C.mo81930a(C88927a.m144527b(this.f236831ah));
        }
        mo81799af(false);
        mo81804ak();
        m142455aw();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo76807c(ServiceEventData serviceEventData) {
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 7) {
            double d = ((C88379zm) serviceEventData.mo81918e(C88377zk.f238985a)).f238989b;
            SearchPlate searchPlate = this.f236778H;
            searchPlate.f240693M = d;
            for (C88895e e : searchPlate.f240733f) {
                e.mo82746e(d);
            }
        } else if (ordinal == 55) {
            mo81810ar();
        } else if (ordinal != 66) {
            String str = null;
            if (ordinal == 74) {
                C88385zs zsVar = (C88385zs) serviceEventData.mo81918e(C88383zq.f238997a);
                if ((zsVar.f239000a & 1) != 0) {
                    str = zsVar.f239001b;
                }
                this.f236778H.f240735h.mo82697b(str);
            } else if (ordinal == 97) {
                mo81799af(false);
                if (!this.f236871l && this.f236829af) {
                    m142455aw();
                    this.f236829af = false;
                }
            } else if (ordinal == 114) {
                C87662k kVar = this.f236854bd;
                if (kVar != null) {
                    kVar.mo81859j();
                }
            } else if (ordinal != 167) {
                if (ordinal == 180) {
                    this.f236817aT = true;
                    mo81770C(QueryTriggerType.AGA_PROGRAMMATIC_LANGUAGE_SWITCHER_CLOSED);
                } else if (ordinal == 182) {
                    m142448aA(false);
                } else if (ordinal == 186) {
                    m142448aA(true);
                } else if (ordinal == 9) {
                    C58976aa aaVar = C58975e.f156826a;
                    this.f236795Y = true;
                    C87662k kVar2 = this.f236854bd;
                    if (kVar2 != null) {
                        kVar2.mo81858i();
                    }
                } else if (ordinal == 10) {
                    this.f236778H.mo82690r(((C88298wm) serviceEventData.mo81918e(C88296wk.f238805a)).f238809b);
                } else if (ordinal == 21) {
                    C88212th thVar = (C88212th) serviceEventData.mo81918e(C88210tf.f238438a);
                    if ((thVar.f238441a & 1) != 0) {
                        str = thVar.f238442b;
                    }
                    if (str != null) {
                        this.f236778H.f240735h.setText(str);
                    }
                } else if (ordinal == 22) {
                    Query query = (Query) serviceEventData.mo81912b(Query.class);
                    C58976aa aaVar2 = C58975e.f156826a;
                    if (!C58832aw.m90831a(this.f236838ao, query)) {
                        this.f236838ao = query;
                        this.f236839ap.cancel(false);
                        this.f236839ap = this.f236876r.mo28208h("Set query", 200, new C87630d(this));
                    }
                }
            } else if (this.f236877s.f236718P) {
                C88271vm vmVar = (C88271vm) serviceEventData.mo81918e(C88269vk.f238745a);
                this.f236818aU = vmVar.f238750c;
                C62971cq<aar> cqVar = vmVar.f238752e;
                C62971cq cqVar2 = vmVar.f238749b;
                C88923ay ayVar = this.f236813aP;
                C87621a aVar = this.f236877s;
                ayVar.f240883f = aVar.f236721S;
                if (this.f236818aU == null) {
                    return;
                }
                if (aVar.f236723U || !cqVar2.isEmpty()) {
                    if (this.f236877s.f236723U && !cqVar.isEmpty()) {
                        this.f236813aP.f240887j = true;
                    }
                    if (this.f236877s.f236724V) {
                        C88923ay ayVar2 = this.f236813aP;
                        ayVar2.f240884g = true;
                        ayVar2.f240885h = vmVar.f238753f;
                    }
                    this.f236813aP.mo82799d(this.f236818aU, cqVar2);
                    C88923ay ayVar3 = this.f236813aP;
                    ayVar3.f240878a.clear();
                    ayVar3.f240879b.clear();
                    for (aar aar : cqVar) {
                        ayVar3.f240878a.add(aar.f237101b);
                        ayVar3.f240879b.add(aar.f237102c);
                    }
                    boolean z = this.f236877s.f236722T && (vmVar.f238751d || this.f236861bk);
                    View view = this.f236815aR;
                    if (view != null && z && !this.f236820aW) {
                        view.setVisibility(0);
                        if (this.f236860bj.containsKey(this.f236818aU)) {
                            ((TextView) this.f236815aR.findViewById(R.id.language_switcher_nudge)).setText((CharSequence) this.f236860bj.get(this.f236818aU));
                        }
                        if (!this.f236861bk) {
                            this.f236773C.mo81937i(new C88489j(C87739bu.SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SWITCHER_NUDGE_SHOWN).mo82013a());
                            ((C89859i) this.f236781K.mo27525b()).mo83702b(C89849ae.VOICE_SEARCH_LANGUAGE_PICKER_INTRO_NUDGE_SHOWN);
                            C89949q.m146521e(C28285c.m52874a(this.f236815aR, 472), false);
                            if (this.f236877s.f236719Q) {
                                this.f236817aT = false;
                                mo81810ar();
                                mo81793Z(this.f236818aU, true);
                            }
                        }
                        this.f236861bk = true;
                    }
                }
            }
        } else {
            mo81799af(false);
        }
    }

    /* renamed from: e */
    public void mo76808e(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        this.f236773C.mo81938j(z);
    }

    /* renamed from: f */
    public boolean mo76809f(Suggestion suggestion, View view) {
        return false;
    }

    /* renamed from: g */
    public final View mo81811g() {
        return this.f236776F;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchOverlayImpl");
        fVar.mo85289p("Search service client", this.f236773C);
        fVar.mo85285l(this.f236844au);
        fVar.mo85279c("launched in text search mode").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f236809aL)));
        fVar.mo85279c("pending show keyboard").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f236841ar)));
        fVar.mo85279c("has window focus").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f236857bg)));
        fVar.mo85279c("search started").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f236843at)));
        fVar.mo85279c("starting new activity").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f236846aw)));
        fVar.mo85279c("hotword requested").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f236858bh)));
        fVar.mo85279c("search plate UI mode").mo85276a(C90752i.m148229c(C88927a.m144526a(this.f236831ah)));
    }

    /* renamed from: h */
    public final View mo81812h() {
        return this.f236879u;
    }

    /* renamed from: i */
    public final C87673aa mo81813i() {
        return this.f236773C;
    }

    /* renamed from: j */
    public final SearchPlate mo81814j() {
        return this.f236778H;
    }

    /* renamed from: k */
    public final void mo81815k(C88897g gVar, boolean z) {
        this.f236778H.mo82669c(gVar);
        if (z) {
            gVar.mo81837a(this.f236831ah, 0, true);
        }
    }

    /* renamed from: l */
    public final void mo81816l() {
        this.f236778H.f240737j.mo82657a();
    }

    /* renamed from: m */
    public final void mo81817m(boolean z) {
        this.f236870k = z;
        SearchPlate searchPlate = this.f236778H;
        C58976aa aaVar = C58975e.f156826a;
        C88901ac acVar = searchPlate.f240689I;
        acVar.f240808g = z;
        if (!z) {
            acVar.mo82764i();
        }
    }

    /* renamed from: n */
    public final void mo81818n(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && !str.equals("and.gsa.int")) {
            this.f236804aG = str;
            if (str.equals("and.gsa.launcher.allapps.appssearch")) {
                this.f236844au = this.f236844au.mo84248K();
            }
            if (z) {
                C87965kd kdVar = (C87965kd) C87966ke.f237909c.createBuilder();
                kdVar.copyOnWrite();
                C87966ke keVar = (C87966ke) kdVar.instance;
                str.getClass();
                keVar.f237911a |= 1;
                keVar.f237912b = str;
                C88489j jVar = new C88489j(C87739bu.LOG_APP_ENTRY);
                jVar.mo82014b(C87964kc.f237908a, (C87966ke) kdVar.build());
                this.f236773C.mo81937i(jVar.mo82013a());
            }
        }
    }

    /* renamed from: o */
    public final void mo81819o(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f236858bh) {
            if (z) {
                z = true;
            } else {
                return;
            }
        }
        this.f236858bh = z;
        this.f236773C.mo81943o(z);
        mo81804ak();
    }

    /* renamed from: p */
    public final void mo81820p(boolean z) {
        if (this.f236843at && this.f236844au.mo84392cY()) {
            if (z) {
                mo81796ac(true, true);
                return;
            }
            ((InputMethodManager) this.f236874p.getSystemService("input_method")).hideSoftInputFromWindow(this.f236778H.getWindowToken(), 2);
            if (mo81806am()) {
                mo81777J();
            }
        }
    }

    /* renamed from: q */
    public final void mo81821q(boolean z) {
        C88890a aVar = this.f236777G.f236924b;
        aVar.f240792d = z;
        aVar.invalidateSelf();
    }

    /* renamed from: r */
    public final void mo81822r(C91097g gVar) {
        this.f236840aq = gVar;
    }

    /* renamed from: s */
    public final void mo81823s(C87663l lVar) {
        this.f236837an = lVar;
    }

    /* renamed from: t */
    public final void mo81824t(int i) {
        C88890a aVar = this.f236789S;
        aVar.f240789a = i;
        aVar.mo82736a();
        aVar.invalidateSelf();
    }

    /* renamed from: u */
    public final void mo81825u() {
        C87660i iVar = this.f236777G;
        iVar.f236925c.setIntValues(new int[]{PrivateKeyType.INVALID, PrivateKeyType.INVALID});
        iVar.f236924b.mo82738c(PrivateKeyType.INVALID);
        C87643q qVar = iVar.f236931i;
        this.f236830ag = true;
    }

    /* renamed from: v */
    public final void mo81826v(long j) {
        mo81799af(true);
        this.f236773C.mo81946r(j, (Bundle) null, C88431bb.f239082a);
    }

    /* renamed from: w */
    public final void mo81827w(Query query, boolean z) {
        Query query2;
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f236871l && !this.f236846aw) {
            if (!query.mo84392cY()) {
                query = query.mo84262Z();
            }
            this.f236844au = query;
            if (this.f236778H.f240694N) {
                query2 = Query.f252741b;
            } else {
                query2 = this.f236844au;
            }
            this.f236844au = query2;
            mo81794aa();
            mo81799af(true);
            boolean z2 = !z;
            mo81798ae(this.f236844au, z2);
            mo81797ad(1, 0, z2);
            C87673aa aaVar2 = this.f236773C;
            Query query3 = this.f236844au;
            C88489j jVar = new C88489j(C87739bu.QUERY_EDIT);
            jVar.mo82015c(query3);
            aaVar2.mo81937i(jVar.mo82013a());
        }
    }

    /* renamed from: x */
    public final void mo81828x() {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent();
        C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
        eVar.copyOnWrite();
        C137418g gVar = (C137418g) eVar.instance;
        gVar.f373769a |= 32;
        gVar.f373776h = true;
        if (this.f236804aG.equals("and.gsa.launcher.qsb.mic")) {
            eVar.copyOnWrite();
            C137418g gVar2 = (C137418g) eVar.instance;
            gVar2.f373779k = 4;
            gVar2.f373769a |= 512;
            if (this.f236877s.f236705C) {
                C137420i iVar = (C137420i) C137421j.f373789c.createBuilder();
                iVar.copyOnWrite();
                C137421j jVar = (C137421j) iVar.instance;
                jVar.f373791a |= 1;
                jVar.f373792b = true;
                eVar.copyOnWrite();
                C137418g gVar3 = (C137418g) eVar.instance;
                C137421j jVar2 = (C137421j) iVar.build();
                jVar2.getClass();
                gVar3.f373785q = jVar2;
                gVar3.f373769a |= 32768;
            }
        } else if (this.f236804aG.equals("and.gsa.voice.search.icon")) {
            eVar.copyOnWrite();
            C137418g gVar4 = (C137418g) eVar.instance;
            gVar4.f373779k = 7;
            gVar4.f373769a |= 512;
            if (this.f236877s.f236705C) {
                C137420i iVar2 = (C137420i) C137421j.f373789c.createBuilder();
                iVar2.copyOnWrite();
                C137421j jVar3 = (C137421j) iVar2.instance;
                jVar3.f373791a |= 1;
                jVar3.f373792b = true;
                eVar.copyOnWrite();
                C137418g gVar5 = (C137418g) eVar.instance;
                C137421j jVar4 = (C137421j) iVar2.build();
                jVar4.getClass();
                gVar5.f373785q = jVar4;
                gVar5.f373769a |= 32768;
            }
        } else if (this.f236804aG.equals("and.gsa.widget.mic")) {
            eVar.copyOnWrite();
            C137418g gVar6 = (C137418g) eVar.instance;
            gVar6.f373779k = 2;
            gVar6.f373769a |= 512;
            if (this.f236877s.f236705C) {
                C137420i iVar3 = (C137420i) C137421j.f373789c.createBuilder();
                iVar3.copyOnWrite();
                C137421j jVar5 = (C137421j) iVar3.instance;
                jVar5.f373791a |= 1;
                jVar5.f373792b = true;
                eVar.copyOnWrite();
                C137418g gVar7 = (C137418g) eVar.instance;
                C137421j jVar6 = (C137421j) iVar3.build();
                jVar6.getClass();
                gVar7.f373785q = jVar6;
                gVar7.f373769a |= 32768;
            }
        }
        C136128i l = C136129j.m221208l();
        l.mo112776k(C139779t.SEARCH);
        l.mo112775j(Optional.m71637of((C137418g) eVar.build()));
        C136127h.m221196a(intent, l.mo112766a());
        intent.putExtra("source", this.f236804aG);
        this.f236840aq.mo65089a(intent);
    }

    /* renamed from: y */
    public final boolean mo81829y() {
        return this.f236795Y;
    }

    /* renamed from: z */
    public final boolean mo81830z() {
        return this.f236843at;
    }

    /* renamed from: b */
    public C88709j mo76806b() {
        C90183b bVar = this.f236847ax;
        bVar.getClass();
        return bVar.mo83929c(this.f236796Z, this.f236790T);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ak */
    public final void mo81804ak() {
        if ((!this.f236794X && !this.f236801aD && ((!this.f236797a || !this.f236833aj) && !this.f236858bh && !this.f236843at)) || this.f236871l) {
            C58976aa aaVar = C58975e.f156826a;
            this.f236773C.mo81933e();
        } else if (!this.f236773C.mo81951w() && this.f236799aB && !this.f236846aw) {
            C58976aa aaVar2 = C58975e.f156826a;
            this.f236773C.mo81932c();
        }
    }
}
