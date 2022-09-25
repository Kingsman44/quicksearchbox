package com.google.android.libraries.lens.view.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.app.C0392m;
import android.support.p033v7.widget.C0673gh;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.C1756o;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.core.app.C1820g;
import androidx.p109f.p110a.C2248v;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p291h.C5622i;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.android.libraries.lens.view.C27653r;
import com.google.android.libraries.lens.view.C28224z;
import com.google.android.libraries.lens.view.feedback.C25813d;
import com.google.android.libraries.lens.view.feedback.FeedbackBannerView;
import com.google.android.libraries.lens.view.feedback.FeedbackBehavior;
import com.google.android.libraries.lens.view.feedback.FeedbackFooterView;
import com.google.android.libraries.lens.view.filters.C25901ah;
import com.google.android.libraries.lens.view.filters.C25902ai;
import com.google.android.libraries.lens.view.filters.C25903aj;
import com.google.android.libraries.lens.view.filters.C25904ak;
import com.google.android.libraries.lens.view.filters.C25905al;
import com.google.android.libraries.lens.view.filters.C25906am;
import com.google.android.libraries.lens.view.filters.C25909ap;
import com.google.android.libraries.lens.view.filters.C25928bg;
import com.google.android.libraries.lens.view.filters.C25935c;
import com.google.android.libraries.lens.view.filters.C26012i;
import com.google.android.libraries.lens.view.filters.C26019p;
import com.google.android.libraries.lens.view.filters.C26022s;
import com.google.android.libraries.lens.view.filters.C26234v;
import com.google.android.libraries.lens.view.filters.C26236x;
import com.google.android.libraries.lens.view.filters.FilterPreview;
import com.google.android.libraries.lens.view.filters.LvfButtonsView;
import com.google.android.libraries.lens.view.filters.carousel.C25961q;
import com.google.android.libraries.lens.view.filters.carousel.FilterCarouselView;
import com.google.android.libraries.lens.view.filters.p2099c.C25941f;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.C25994i;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.filters.translation.C26059ax;
import com.google.android.libraries.lens.view.filters.translation.C26120dc;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.frozenimage.C26270b;
import com.google.android.libraries.lens.view.frozenimage.C26272d;
import com.google.android.libraries.lens.view.gallery.C26297aa;
import com.google.android.libraries.lens.view.gallery.C26299ac;
import com.google.android.libraries.lens.view.gallery.C26422i;
import com.google.android.libraries.lens.view.gallery.C26431r;
import com.google.android.libraries.lens.view.gallery.C26432s;
import com.google.android.libraries.lens.view.gallery.GalleryRecyclerView;
import com.google.android.libraries.lens.view.gallery.p2112e.C26408a;
import com.google.android.libraries.lens.view.gallery.p2112e.C26416i;
import com.google.android.libraries.lens.view.gleam.C26505cj;
import com.google.android.libraries.lens.view.gleam.C26510co;
import com.google.android.libraries.lens.view.gleam.C26526dd;
import com.google.android.libraries.lens.view.imageviewer.C26957t;
import com.google.android.libraries.lens.view.infopanel.C27001as;
import com.google.android.libraries.lens.view.infopanel.C27002at;
import com.google.android.libraries.lens.view.infopanel.C27003au;
import com.google.android.libraries.lens.view.infopanel.C27004av;
import com.google.android.libraries.lens.view.infopanel.C27005aw;
import com.google.android.libraries.lens.view.infopanel.C27073c;
import com.google.android.libraries.lens.view.infopanel.InfoPanelHeader;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26967c;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26968d;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26970f;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26973i;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26976l;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26980p;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27077d;
import com.google.android.libraries.lens.view.livingsurfaces.C27251j;
import com.google.android.libraries.lens.view.livingsurfaces.p2149a.C27235b;
import com.google.android.libraries.lens.view.onboarding.C27481an;
import com.google.android.libraries.lens.view.onboarding.C27505c;
import com.google.android.libraries.lens.view.onboarding.C27506d;
import com.google.android.libraries.lens.view.onboarding.C27517o;
import com.google.android.libraries.lens.view.onboarding.C27520r;
import com.google.android.libraries.lens.view.onboarding.C27525w;
import com.google.android.libraries.lens.view.onboarding.OnboardingBackgroundView;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2053ad.C24980c;
import com.google.android.libraries.lens.view.p2053ad.C24981d;
import com.google.android.libraries.lens.view.p2056af.C25050av;
import com.google.android.libraries.lens.view.p2057ag.C25105g;
import com.google.android.libraries.lens.view.p2057ag.C25113o;
import com.google.android.libraries.lens.view.p2065ai.C25149aj;
import com.google.android.libraries.lens.view.p2065ai.C25155ap;
import com.google.android.libraries.lens.view.p2066aj.C25190b;
import com.google.android.libraries.lens.view.p2067ak.C25196ab;
import com.google.android.libraries.lens.view.p2067ak.C25197ac;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2067ak.C25265d;
import com.google.android.libraries.lens.view.p2067ak.C25284w;
import com.google.android.libraries.lens.view.p2069am.C25342r;
import com.google.android.libraries.lens.view.p2074ap.C25466f;
import com.google.android.libraries.lens.view.p2075aq.C25468a;
import com.google.android.libraries.lens.view.p2075aq.C25469b;
import com.google.android.libraries.lens.view.p2077as.C25477c;
import com.google.android.libraries.lens.view.p2077as.C25479e;
import com.google.android.libraries.lens.view.p2078at.C25497ac;
import com.google.android.libraries.lens.view.p2078at.C25498ad;
import com.google.android.libraries.lens.view.p2078at.C25499ae;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2078at.C25515au;
import com.google.android.libraries.lens.view.p2078at.C25522e;
import com.google.android.libraries.lens.view.p2078at.C25533p;
import com.google.android.libraries.lens.view.p2078at.C25535r;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2078at.C25538u;
import com.google.android.libraries.lens.view.p2078at.C25540w;
import com.google.android.libraries.lens.view.p2078at.C25543z;
import com.google.android.libraries.lens.view.p2081au.C25561k;
import com.google.android.libraries.lens.view.p2081au.C25562l;
import com.google.android.libraries.lens.view.p2081au.C25563m;
import com.google.android.libraries.lens.view.p2082av.C25582f;
import com.google.android.libraries.lens.view.p2082av.C25585i;
import com.google.android.libraries.lens.view.p2082av.C25586j;
import com.google.android.libraries.lens.view.p2085ax.C25614p;
import com.google.android.libraries.lens.view.p2087ay.C25663x;
import com.google.android.libraries.lens.view.p2087ay.C25664y;
import com.google.android.libraries.lens.view.p2089b.C25679f;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.lens.view.p2091bb.C25688b;
import com.google.android.libraries.lens.view.p2091bb.C25691e;
import com.google.android.libraries.lens.view.p2093d.C25753b;
import com.google.android.libraries.lens.view.p2093d.C25754c;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26748aq;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26749ar;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26765q;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26789an;
import com.google.android.libraries.lens.view.p2113h.p2123f.C26821c;
import com.google.android.libraries.lens.view.p2113h.p2131i.C26884a;
import com.google.android.libraries.lens.view.p2113h.p2131i.C26885b;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.p2151m.C27280g;
import com.google.android.libraries.lens.view.p2152n.C27456i;
import com.google.android.libraries.lens.view.p2162s.C27696n;
import com.google.android.libraries.lens.view.p2172t.C28057b;
import com.google.android.libraries.lens.view.p2172t.C28063h;
import com.google.android.libraries.lens.view.p2180z.C28225a;
import com.google.android.libraries.lens.view.ris.C27675a;
import com.google.android.libraries.lens.view.ris.C27677c;
import com.google.android.libraries.lens.view.ris.C27679e;
import com.google.android.libraries.lens.view.sampleimages.C27701e;
import com.google.android.libraries.lens.view.sensors.orientation.C27725b;
import com.google.android.libraries.lens.view.sensors.orientation.C27727d;
import com.google.android.libraries.lens.view.sensors.orientation.C27729f;
import com.google.android.libraries.lens.view.session.C27749al;
import com.google.android.libraries.lens.view.session.C27761ax;
import com.google.android.libraries.lens.view.session.C27766bb;
import com.google.android.libraries.lens.view.textoverlay.C28074g;
import com.google.android.libraries.lens.view.utils.C28098a;
import com.google.android.libraries.lens.view.utils.C28128q;
import com.google.android.libraries.lens.view.utils.C28130s;
import com.google.android.libraries.lens.view.utils.C28135x;
import com.google.android.libraries.lens.view.weblrp.C28205s;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28446p;
import com.google.android.libraries.logging.p2185ve.C28447q;
import com.google.android.libraries.logging.p2185ve.C28448r;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.p3506c.C44581b;
import com.google.android.material.p3516m.C44808d;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.C47583cg;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60700zp;
import com.google.common.p4552o.p4563i.C59899bh;
import com.google.common.p4552o.p4563i.C59900bi;
import com.google.common.p4552o.p4563i.C59928cj;
import com.google.common.p4552o.p4563i.C59930cl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.lens.p4711m.C62632i;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C62995dn;
import com.google.protobuf.p4750c.C62948a;
import dagger.C68214a;
import dagger.hilt.android.internal.managers.C68324h;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.nio.charset.StandardCharsets;
import p3186j$.time.Duration;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.main.dt */
/* compiled from: PG */
public final class C27384dt implements C25515au, C27322bl, C26970f, C25113o, C25535r, C27364d {

    /* renamed from: a */
    public static final C59071e f74877a = C59071e.m91332i("com.google.android.libraries.lens.view.main.dt");

    /* renamed from: b */
    static final long f74878b = Duration.ofDays(30).toMillis();

    /* renamed from: A */
    public final C26976l f74879A;

    /* renamed from: B */
    public final C27280g f74880B;

    /* renamed from: C */
    public final C27327bq f74881C;

    /* renamed from: D */
    public final C25050av f74882D;

    /* renamed from: E */
    public final C25537t f74883E;

    /* renamed from: F */
    public final C60700zp f74884F;

    /* renamed from: G */
    public final C27456i f74885G;

    /* renamed from: H */
    public final C27232l f74886H;

    /* renamed from: I */
    public final C25614p f74887I;

    /* renamed from: J */
    public final C26059ax f74888J;

    /* renamed from: K */
    public final C25684e f74889K;

    /* renamed from: L */
    public final C28306ab f74890L;

    /* renamed from: M */
    public final C28443m f74891M;

    /* renamed from: N */
    public final C25989d f74892N;

    /* renamed from: O */
    public final C58833ax f74893O;

    /* renamed from: P */
    public final C68214a f74894P;

    /* renamed from: Q */
    public final C68214a f74895Q;

    /* renamed from: R */
    public final C28224z f74896R;

    /* renamed from: S */
    public final C27424fe f74897S;

    /* renamed from: T */
    public final C27251j f74898T;

    /* renamed from: U */
    public final C24981d f74899U;

    /* renamed from: V */
    public final C47274n f74900V;

    /* renamed from: W */
    public final C25691e f74901W;

    /* renamed from: X */
    public final C47770dh f74902X;

    /* renamed from: Y */
    public final C27766bb f74903Y;

    /* renamed from: Z */
    public final C27729f f74904Z;

    /* renamed from: aA */
    public C26416i f74905aA;

    /* renamed from: aB */
    C27392e f74906aB;

    /* renamed from: aC */
    public final C46440f f74907aC = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C27384dt.f74877a.mo56225c()).mo56382g(th)).mo56372aa(49751)).mo56386p("Failed to async close gallery");
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C27384dt.this.mo32948aj(0.0f);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: aD */
    C27394eb f74908aD = C27394eb.UNINITIALIZED;

    /* renamed from: aE */
    public View f74909aE;

    /* renamed from: aF */
    ViewGroup f74910aF;

    /* renamed from: aG */
    ViewGroup f74911aG;

    /* renamed from: aH */
    public ViewGroup f74912aH;

    /* renamed from: aI */
    public View f74913aI;

    /* renamed from: aJ */
    public View f74914aJ;

    /* renamed from: aK */
    public View f74915aK;

    /* renamed from: aL */
    public C25582f f74916aL;

    /* renamed from: aM */
    public View f74917aM;

    /* renamed from: aN */
    LensOverlayLayout f74918aN;

    /* renamed from: aO */
    public C26510co f74919aO;

    /* renamed from: aP */
    public C28074g f74920aP;

    /* renamed from: aQ */
    public C25149aj f74921aQ;

    /* renamed from: aR */
    C26272d f74922aR;

    /* renamed from: aS */
    public C26019p f74923aS;

    /* renamed from: aT */
    public C26234v f74924aT;

    /* renamed from: aU */
    public C27235b f74925aU;

    /* renamed from: aV */
    C27073c f74926aV;

    /* renamed from: aW */
    C28057b f74927aW;

    /* renamed from: aX */
    public C27228h f74928aX;

    /* renamed from: aY */
    public boolean f74929aY;

    /* renamed from: aZ */
    public Rect f74930aZ = new Rect();

    /* renamed from: aa */
    public final C26885b f74931aa;

    /* renamed from: ab */
    public final C25466f f74932ab;

    /* renamed from: ac */
    public final C26120dc f74933ac;

    /* renamed from: ad */
    public final C25469b f74934ad;

    /* renamed from: ae */
    public final C27425ff f74935ae;

    /* renamed from: af */
    public final C26789an f74936af;

    /* renamed from: ag */
    public final C46439e f74937ag;

    /* renamed from: ah */
    public final C46855i f74938ah;

    /* renamed from: ai */
    public final C27696n f74939ai;

    /* renamed from: aj */
    public final C69464a f74940aj;

    /* renamed from: ak */
    public final boolean f74941ak;

    /* renamed from: al */
    public final boolean f74942al;

    /* renamed from: am */
    public final boolean f74943am;

    /* renamed from: an */
    public final boolean f74944an;

    /* renamed from: ao */
    public final boolean f74945ao;

    /* renamed from: ap */
    public final boolean f74946ap;

    /* renamed from: aq */
    public final boolean f74947aq;

    /* renamed from: ar */
    public boolean f74948ar;

    /* renamed from: as */
    public C58833ax f74949as = C58836b.f156633a;

    /* renamed from: at */
    public C27077d f74950at;

    /* renamed from: au */
    public C58833ax f74951au = C58836b.f156633a;

    /* renamed from: av */
    public boolean f74952av;

    /* renamed from: aw */
    public boolean f74953aw;

    /* renamed from: ax */
    public boolean f74954ax;

    /* renamed from: ay */
    public boolean f74955ay;

    /* renamed from: az */
    public C25105g f74956az;

    /* renamed from: ba */
    public C25497ac f74957ba = C25497ac.NONE;

    /* renamed from: bb */
    public int f74958bb = 1;

    /* renamed from: bc */
    final C27383ds f74959bc = new C27383ds(this);

    /* renamed from: bd */
    public C27653r f74960bd;

    /* renamed from: be */
    private final C24974a f74961be;

    /* renamed from: bf */
    private final C27481an f74962bf;

    /* renamed from: bg */
    private final boolean f74963bg;

    /* renamed from: bh */
    private final C58833ax f74964bh;

    /* renamed from: bi */
    private final C25197ac f74965bi;

    /* renamed from: bj */
    private final int f74966bj;

    /* renamed from: bk */
    private final C27761ax f74967bk;

    /* renamed from: bl */
    private final C28128q f74968bl;

    /* renamed from: bm */
    private final C27749al f74969bm;

    /* renamed from: bn */
    private final C68214a f74970bn;

    /* renamed from: bo */
    private final C28448r f74971bo;

    /* renamed from: bp */
    private final C25540w f74972bp;

    /* renamed from: bq */
    private final C25499ae f74973bq;

    /* renamed from: br */
    private final boolean f74974br;

    /* renamed from: bs */
    private final boolean f74975bs;

    /* renamed from: bt */
    private final boolean f74976bt;

    /* renamed from: bu */
    private final boolean f74977bu;

    /* renamed from: bv */
    private final C25758g f74978bv;

    /* renamed from: bw */
    private final C25758g f74979bw = new C25758g(false);

    /* renamed from: bx */
    private boolean f74980bx = false;

    /* renamed from: by */
    private C26748aq[] f74981by;

    /* renamed from: bz */
    private final C27382dr f74982bz = new C27382dr(this);

    /* renamed from: c */
    public final C68214a f74983c;

    /* renamed from: d */
    public LensUnderlayCoordinatorBehavior f74984d;

    /* renamed from: e */
    public boolean f74985e;

    /* renamed from: f */
    FeedbackBannerView f74986f;

    /* renamed from: g */
    public final C27292ai f74987g;

    /* renamed from: h */
    public final boolean f74988h;

    /* renamed from: i */
    public final AccountId f74989i;

    /* renamed from: j */
    public final Activity f74990j;

    /* renamed from: k */
    public final Duration f74991k;

    /* renamed from: l */
    public final C25543z f74992l;

    /* renamed from: m */
    public final C60888db f74993m;

    /* renamed from: n */
    public final Executor f74994n;

    /* renamed from: o */
    public final C26244b f74995o;

    /* renamed from: p */
    public final C27517o f74996p;

    /* renamed from: q */
    public final C25504aj f74997q;

    /* renamed from: r */
    public final C28225a f74998r;

    /* renamed from: s */
    public final C25679f f74999s;

    /* renamed from: t */
    public final Context f75000t;

    /* renamed from: u */
    public final C37215b f75001u;

    /* renamed from: v */
    public final C68214a f75002v;

    /* renamed from: w */
    public final C25225bd f75003w;

    /* renamed from: x */
    final C21370a f75004x;

    /* renamed from: y */
    public final C26980p f75005y;

    /* renamed from: z */
    public final C28205s f75006z;

    static {
        C62948a.m95457h(24);
    }

    public C27384dt(C27292ai aiVar, String str, AccountId accountId, Activity activity, Duration duration, C25543z zVar, C60888db dbVar, Executor executor, C26244b bVar, C24974a aVar, C27517o oVar, C27481an anVar, boolean z, C25504aj ajVar, C28225a aVar2, C25679f fVar, Context context, C37215b bVar2, C58833ax axVar, C25197ac acVar, C25225bd bdVar, C21370a aVar3, C26980p pVar, C28205s sVar, C26976l lVar, int i, C27280g gVar, C27327bq bqVar, C25050av avVar, C27761ax axVar2, C25537t tVar, C60700zp zpVar, C28128q qVar, C27456i iVar, C27232l lVar2, C27749al alVar, C25614p pVar2, C26059ax axVar3, C25684e eVar, C28306ab abVar, C28443m mVar, C25989d dVar, C68214a aVar4, C58833ax axVar4, C68214a aVar5, C68214a aVar6, C28224z zVar2, C27424fe feVar, C27251j jVar, C24981d dVar2, C68214a aVar7, C47274n nVar, C68214a aVar8, C28448r rVar, C25540w wVar, C25691e eVar2, C47770dh dhVar, C27766bb bbVar, C27729f fVar2, C26885b bVar3, C25499ae aeVar, C25466f fVar3, C26120dc dcVar, C25469b bVar4, C27425ff ffVar, C26789an anVar2, boolean z2, boolean z3, boolean z4, C46439e eVar3, C46855i iVar2, C27696n nVar2, C69464a aVar9, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f74987g = aiVar;
        this.f74988h = Boolean.parseBoolean(str);
        this.f74989i = accountId;
        this.f74990j = activity;
        this.f74991k = duration;
        this.f74992l = zVar;
        this.f74983c = aVar7;
        this.f74993m = dbVar;
        this.f74994n = executor;
        this.f74995o = bVar;
        this.f74961be = aVar;
        this.f74996p = oVar;
        this.f74962bf = anVar;
        this.f74963bg = z;
        this.f74997q = ajVar;
        this.f74998r = aVar2;
        this.f74999s = fVar;
        this.f75000t = context;
        this.f75001u = bVar2;
        this.f74964bh = axVar;
        this.f74965bi = acVar;
        this.f75003w = bdVar;
        this.f75004x = aVar3;
        this.f75006z = sVar;
        this.f75005y = pVar;
        this.f74879A = lVar;
        this.f74966bj = i;
        this.f74880B = gVar;
        this.f74881C = bqVar;
        this.f74882D = avVar;
        this.f74967bk = axVar2;
        this.f74883E = tVar;
        this.f74884F = zpVar;
        this.f74968bl = qVar;
        this.f74885G = iVar;
        this.f74886H = lVar2;
        this.f74969bm = alVar;
        this.f74887I = pVar2;
        this.f74888J = axVar3;
        this.f74889K = eVar;
        this.f74890L = abVar;
        this.f74891M = mVar;
        this.f74892N = dVar;
        this.f74970bn = aVar4;
        this.f74893O = axVar4;
        this.f74894P = aVar5;
        this.f74895Q = aVar6;
        this.f74896R = zVar2;
        this.f74897S = feVar;
        this.f74898T = jVar;
        this.f74899U = dVar2;
        this.f74900V = nVar;
        this.f75002v = aVar8;
        this.f74971bo = rVar;
        this.f74972bp = wVar;
        this.f74901W = eVar2;
        this.f74902X = dhVar;
        this.f74903Y = bbVar;
        this.f74904Z = fVar2;
        this.f74931aa = bVar3;
        this.f74973bq = aeVar;
        this.f74932ab = fVar3;
        this.f74933ac = dcVar;
        this.f74934ad = bVar4;
        this.f74935ae = ffVar;
        this.f74936af = anVar2;
        this.f74941ak = z2;
        this.f74942al = z3;
        this.f74974br = z4;
        this.f74937ag = eVar3;
        this.f74938ah = iVar2;
        this.f74939ai = nVar2;
        this.f74940aj = aVar9;
        this.f74943am = z5;
        this.f74975bs = z6;
        this.f74944an = z10;
        this.f74976bt = z7;
        this.f74946ap = z8;
        this.f74945ao = z9;
        this.f74947aq = z11;
        this.f74977bu = z12;
        this.f74978bv = new C25758g(Boolean.valueOf(zVar.mo30592b()));
    }

    /* renamed from: aA */
    private final boolean m50965aA() {
        if (!this.f74995o.mo31462g(C26239a.SELECTION_STATE_ENABLED)) {
            return false;
        }
        if (!this.f74995o.mo31462g(C26239a.SELECTION_STATE_FOR_TRANSLATE_APP_ENTRY_POINT_DISABLED) || !C62632i.m94823h(this.f74886H.mo32701h())) {
            return true;
        }
        return false;
    }

    /* renamed from: aB */
    private final void m50966aB(int i) {
        C28448r rVar = this.f74971bo;
        C28446p a = C28447q.m53152a(126855);
        C59899bh bhVar = (C59899bh) C59900bi.f161890j.createBuilder();
        C59928cj cjVar = (C59928cj) C59930cl.f161974c.createBuilder();
        cjVar.copyOnWrite();
        C59930cl clVar = (C59930cl) cjVar.instance;
        clVar.f161977b = i - 1;
        clVar.f161976a |= 1;
        bhVar.copyOnWrite();
        C59900bi biVar = (C59900bi) bhVar.instance;
        C59930cl clVar2 = (C59930cl) cjVar.build();
        clVar2.getClass();
        biVar.f161898f = clVar2;
        biVar.f161893a |= 1024;
        a.f77232a.mo33895b(new C28441k(C25686g.f69826b, (C59900bi) bhVar.build()));
        a.mo33898b(C45954d.m82060a(this.f74889K.f69824a));
        rVar.mo33855a(a.mo33897a());
    }

    /* renamed from: al */
    private final C25901ah m50967al() {
        return (C25901ah) this.f74987g.getChildFragmentManager().f634a.mo671c("lvf_buttons_fragment_tag");
    }

    /* renamed from: am */
    private final C25479e m50968am() {
        C25477c cVar = (C25477c) mo32951p(R.id.lens_coordinator_container, "selection_state_fragment_tag", new C27375dk(this));
        cVar.getClass();
        return cVar.mo17754z();
    }

    /* renamed from: an */
    private static String m50969an(Intent intent, String str) {
        if (!intent.hasExtra(str)) {
            return null;
        }
        String stringExtra = intent.getStringExtra(str);
        try {
            return new String(Base64.decode(stringExtra, 8), StandardCharsets.UTF_8);
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) f74877a.mo56225c()).mo56382g(e)).mo56372aa(49758)).mo56389s("Invalid base-64 encoding: %s", stringExtra);
            return null;
        }
    }

    /* renamed from: ao */
    private final void m50970ao() {
        if (this.f74916aL == null) {
            C25582f fVar = new C25582f(this.f74900V);
            fVar.mo17754z().f69621g = this.f74982bz;
            this.f74916aL = fVar;
            C28306ab abVar = this.f74890L;
            abVar.mo33801b(fVar, abVar.f76990a.mo33805a(C28427h.m53115a(51775)));
            if (this.f74957ba == C25497ac.FROZEN) {
                fVar.setVisibility(4);
            }
            C25582f fVar2 = this.f74916aL;
            fVar2.getClass();
            fVar2.addOnLayoutChangeListener(new C27387dv(this));
            int indexOfChild = this.f74910aF.indexOfChild(this.f74917aM);
            this.f74910aF.removeView(this.f74917aM);
            this.f74910aF.addView(this.f74916aL, indexOfChild);
        }
    }

    /* renamed from: ap */
    private final void m50971ap() {
        long j;
        C58833ax h = this.f74886H.mo32701h();
        if (C62632i.m94825j(h)) {
            j = this.f74965bi.mo30342a(String.valueOf(h.mo56111f()), this.f74886H.mo32694a());
        } else {
            C25197ac acVar = this.f74965bi;
            String str = (String) h.mo56111f();
            C25265d dVar = ((C25284w) acVar.f68625a.mo30362b(false)).f68781b;
            if (dVar == null) {
                dVar = C25265d.f68732c;
            }
            String valueOf = String.valueOf(str);
            valueOf.getClass();
            C62995dn dnVar = dVar.f68734a;
            j = dnVar.containsKey(valueOf) ? ((Long) dnVar.get(valueOf)).longValue() : -1;
        }
        if (j >= 0 || !this.f74964bh.mo56113h()) {
            if (this.f75004x.mo26870b() - j > f74878b && this.f74964bh.mo56113h()) {
                C58838bb.m90883r(this.f74964bh.mo56113h());
                mo30544X(this.f75000t.getString(R.string.lens_current_account_dialog_message, new Object[]{this.f74964bh.mo56107c()}), 0);
                mo32927N();
            }
            if (this.f74992l.mo30591a()) {
                mo32921H();
            } else {
                mo32926M();
            }
        } else if (!this.f74953aw) {
            C58838bb.m90883r(this.f74964bh.mo56113h());
            C44581b bVar = new C44581b(this.f75000t, 0);
            bVar.f1347a.f1335p = new C27370df(this);
            C0392m create = bVar.create();
            ViewGroup e = C28135x.m52429e(LayoutInflater.from(this.f75000t));
            LayoutInflater from = LayoutInflater.from(this.f75000t);
            View inflate = from.inflate(R.layout.lens_confirm_account_dialog, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.account)).setText((String) this.f74964bh.mo56107c());
            C28135x.m52428d(e, inflate);
            C28135x.m52425a(e).setText(from.getContext().getString(R.string.lens_confirm_accounts_dialog_title));
            C28135x.m52427c(e).setText(from.getContext().getString(R.string.lens_confirm_accounts_dialog_continue));
            C28135x.m52426b(e).setText(from.getContext().getString(R.string.lens_confirm_accounts_dialog_no_thanks));
            MaterialButton c = C28135x.m52427c(e);
            c.setOnClickListener(new C47591co(this.f74902X, "Click dialog continue", new C27371dg(this, create)));
            MaterialButton b = C28135x.m52426b(e);
            b.setOnClickListener(new C47591co(this.f74902X, "Click dialog cancel", new C27372dh(this, create)));
            create.f1349a.mo1109d(e);
            create.setCanceledOnTouchOutside(false);
            create.setCancelable(false);
            create.show();
            C28306ab abVar = this.f74890L;
            Window window = create.getWindow();
            window.getClass();
            View findViewById = window.findViewById(16908290);
            C28313c a = this.f74890L.f76990a.mo33805a(C28427h.m53115a(56265));
            a.mo33859g(C28375ak.m53061c(51781));
            a.mo33859g(C45954d.m82060a(this.f74889K.f69824a));
            abVar.mo33801b(findViewById, a);
            this.f74953aw = true;
            this.f75001u.mo19974a(C37194a.f98417G);
            C28306ab abVar2 = this.f74890L;
            abVar2.mo33801b(c, abVar2.f76990a.mo33805a(C28427h.m53115a(56266)));
            C28306ab abVar3 = this.f74890L;
            abVar3.mo33801b(b, abVar3.f76990a.mo33805a(C28427h.m53115a(56267)));
        }
    }

    /* renamed from: aq */
    private final void m50972aq(boolean z) {
        if (!this.f74962bf.mo33016a()) {
            ((C59052c) ((C59052c) f74877a.mo56226d()).mo56372aa(49765)).mo56386p("Cannot start camera while onboarding is pending");
            return;
        }
        m50970ao();
        boolean z2 = true;
        boolean z3 = z && !mo32944af();
        C27327bq bqVar = this.f74881C;
        if (bqVar.f74798c.mo30591a()) {
            if (z3 && !bqVar.f74770P.mo30527d()) {
                ((C59052c) ((C59052c) C27327bq.f74753a.mo56226d()).mo56372aa(49744)).mo56386p("Ignoring transitionToLive in non-NONE mode");
                z3 = false;
            }
            if (bqVar.f74766L != null) {
                ((C59052c) ((C59052c) C27327bq.f74753a.mo56226d()).mo56372aa(49743)).mo56386p("Ignoring call to #requestStartCamera when camera already started");
            } else {
                bqVar.f74766L = (C26765q) bqVar.f74802g.mo17428b();
                bqVar.mo32885q();
                C26765q qVar = bqVar.f74766L;
                qVar.getClass();
                qVar.mo32126q(new C27321bk(bqVar));
                C25664y yVar = bqVar.f74808m;
                if (!yVar.f69793i) {
                    yVar.f69793i = true;
                    yVar.f69798n.mo30748h(new C25663x(yVar));
                }
                boolean z4 = bqVar.f74770P.mo30526c() || z3;
                if (!z4 && (!bqVar.f74770P.mo30527d() || !bqVar.f74772R)) {
                    z2 = false;
                }
                C26765q qVar2 = bqVar.f74766L;
                qVar2.getClass();
                qVar2.mo32118i(z4);
                C26765q qVar3 = bqVar.f74766L;
                qVar3.getClass();
                qVar3.mo32122m(z2);
                if (z2) {
                    bqVar.f74816u.mo32828e();
                }
                if (z3) {
                    bqVar.mo32868A(C25497ac.LIVE, (C25533p) null);
                }
            }
            if (this.f74957ba.mo30526c()) {
                C26885b bVar = this.f74931aa;
                bVar.mo32258b(false);
                bVar.mo32257a();
                bVar.f73297f = bVar.f73294c.mo29165e(new C26884a(bVar), C26885b.f73292a.toMillis(), TimeUnit.MILLISECONDS);
            }
            mo32928O();
            return;
        }
        throw new IllegalStateException("requestStartCamera called in postcapture mode");
    }

    /* renamed from: ar */
    private final void m50973ar() {
        if (!this.f74980bx) {
            this.f74980bx = true;
            if (this.f74972bp.mo30590a() == C25538u.GALLERY_STARTUP) {
                m50974as(false);
            }
        }
    }

    /* renamed from: as */
    private final void m50974as(boolean z) {
        AccountId accountId = this.f74989i;
        C26422i iVar = new C26422i();
        C68324h.m98669f(iVar);
        C47247a.m84047b(iVar, accountId);
        C0154a aVar = new C0154a(this.f74987g.getChildFragmentManager());
        aVar.mo511h(R.id.lens_gallery_container, iVar, "gallery_fragment", 1);
        aVar.mo509f();
        iVar.mo17754z().f71484P = new C27348ck(this);
        if (z) {
            iVar.mo17754z().mo31509i();
        }
        C27327bq bqVar = this.f74881C;
        bqVar.f74772R = true;
        bqVar.mo32892x();
        C26022s q = mo32952q();
        q.f70725n = q.mo31222a();
        C25935c cVar = q.f70725n;
        if (cVar != null) {
            C26012i a = cVar.mo17754z();
            a.f70692q = true;
            a.mo31219e();
        }
        mo32929P();
        C25909ap r = mo32953r();
        r.f70399r = true;
        r.mo31067b();
        r.mo31068c();
        C25155ap w = mo32957w();
        w.f68520s = true;
        w.mo30295d(false);
    }

    /* renamed from: at */
    private final void m50975at(boolean z) {
        View view;
        LensOverlayLayout lensOverlayLayout = this.f74918aN;
        if (z) {
            C26272d dVar = this.f74922aR;
            dVar.getClass();
            view = dVar.getView();
        } else {
            view = null;
        }
        lensOverlayLayout.f74627a = view;
        lensOverlayLayout.requestLayout();
    }

    /* renamed from: au */
    private final void m50976au() {
        if (!this.f74995o.mo31462g(C26239a.THINKING_GLEAMS_LOADING_STATE) || m50979ax() || this.f74973bq.f69455a.mo3842a() != C25498ad.NONE) {
            mo32935V(false);
            this.f75005y.mo32444k(this.f75000t.getString(R.string.lens_info_panel_loading_message));
            return;
        }
        m50977av();
    }

    /* renamed from: av */
    private final void m50977av() {
        if (this.f74976bt) {
            return;
        }
        if (!this.f74975bs || !this.f74886H.mo32714t().mo56113h()) {
            ((C25190b) mo32950o(R.id.postcapture_thinking_gleams_container, new C27333bw(this))).mo17754z().mo30336b(true);
        }
    }

    /* renamed from: aw */
    private final boolean m50978aw(C24226r... rVarArr) {
        C27228h hVar = (C27228h) C58833ax.m90833j(this.f74881C.f74816u.f74684q).mo56111f();
        return hVar != null && hVar.mo32673f().mo56113h() && DesugarArrays.stream((T[]) rVarArr).anyMatch(new C27363cz(hVar));
    }

    /* renamed from: ax */
    private final boolean m50979ax() {
        return this.f75005y.mo32435a() != C26968d.HIDDEN;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r0.mo31626a();
     */
    /* renamed from: ay */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m50980ay() {
        /*
            r6 = this;
            com.google.android.libraries.lens.view.gallery.i r0 = r6.mo32955t()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            com.google.android.libraries.lens.view.gallery.ac r0 = r0.mo17754z()
            com.google.android.libraries.lens.view.gallery.b r2 = r0.mo31503c()
            if (r2 != 0) goto L_0x0013
            goto L_0x005c
        L_0x0013:
            com.google.android.libraries.lens.view.gallery.i r3 = r0.f71495c
            android.support.v4.app.FragmentManager r3 = r3.getChildFragmentManager()
            android.support.v4.app.a r4 = new android.support.v4.app.a
            r4.<init>((android.support.p031v4.app.FragmentManager) r3)
            r3 = 2130772066(0x7f010062, float:1.714724E38)
            r5 = 2130772067(0x7f010063, float:1.7147242E38)
            r4.mo691x(r3, r5, r1, r1)
            r4.mo516m(r2)
            r4.mo509f()
            android.view.View r1 = r0.f71472D
            r1.getClass()
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r2 = 0
            android.view.ViewPropertyAnimator r1 = r1.translationX(r2)
            r2 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            r1.start()
            com.google.android.libraries.lens.view.gallery.e.k r1 = r0.f71476H
            r1.getClass()
            r1.mo31623a()
            r1 = 1
            r0.mo31508h(r1)
            com.google.android.libraries.lens.view.gallery.ap r2 = new com.google.android.libraries.lens.view.gallery.ap
            java.lang.String r3 = ""
            r2.<init>(r3)
            com.google.android.libraries.lens.view.gallery.i r0 = r0.f71495c
            com.google.apps.tiktok.p3674l.p3679c.C47393f.m84236g(r2, r0)
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.main.C27384dt.m50980ay():boolean");
    }

    /* renamed from: az */
    private final boolean m50981az() {
        return m50978aw(C24226r.GALLERY);
    }

    /* renamed from: v */
    public static C27292ai m50982v(AccountId accountId, boolean z) {
        String bool = Boolean.toString(z);
        C27292ai aiVar = new C27292ai();
        C68324h.m98669f(aiVar);
        C47247a.m84047b(aiVar, accountId);
        C47243l.m84040b(aiVar, bool);
        return aiVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final C47392e mo32915A(C27675a aVar) {
        try {
            Intent parseUri = Intent.parseUri(aVar.f75572a, 0);
            parseUri.setAction("android.intent.action.VIEW");
            this.f74883E.mo30556f(parseUri);
        } catch (URISyntaxException e) {
            mo30544X(this.f75000t.getString(R.string.lens_failed_to_open_3rd_party_content), 0);
            ((C59052c) ((C59052c) ((C59052c) f74877a.mo56226d()).mo56382g(e)).mo56372aa(49756)).mo56386p("Failed to open Reverse Image Search URL");
        }
        return C47392e.f123115a;
    }

    /* renamed from: B */
    public final void mo32916B() {
        if (this.f74946ap && ((C27001as) this.f74987g.getChildFragmentManager().f634a.mo671c("lens-multimodal-panel")) == null) {
            AccountId accountId = this.f74989i;
            C27073c cVar = this.f74926aV;
            cVar.getClass();
            InfoPanelHeader infoPanelHeader = cVar.mo17754z().f74361y.f73489c.f73586a;
            infoPanelHeader.getClass();
            Rect a = infoPanelHeader.mo17754z().f74397k.mo32385a();
            C27002at atVar = (C27002at) C27005aw.f73633b.createBuilder();
            C27003au auVar = (C27003au) C27004av.f73627e.createBuilder();
            int i = a.bottom;
            auVar.copyOnWrite();
            ((C27004av) auVar.instance).f73629a = i;
            int i2 = a.left;
            auVar.copyOnWrite();
            ((C27004av) auVar.instance).f73630b = i2;
            int i3 = a.right;
            auVar.copyOnWrite();
            ((C27004av) auVar.instance).f73631c = i3;
            int i4 = a.top;
            auVar.copyOnWrite();
            ((C27004av) auVar.instance).f73632d = i4;
            C27004av avVar = (C27004av) auVar.build();
            atVar.copyOnWrite();
            avVar.getClass();
            ((C27005aw) atVar.instance).f73635a = avVar;
            C27001as asVar = new C27001as();
            C68324h.m98669f(asVar);
            C47247a.m84047b(asVar, accountId);
            C47243l.m84039a(asVar, (C27005aw) atVar.build());
            asVar.setEnterTransition(new C44808d());
            asVar.setExitTransition(new C44808d());
            asVar.showNow(this.f74987g.getChildFragmentManager(), "lens-multimodal-panel");
        }
    }

    /* renamed from: D */
    public final void mo32918D(C25342r rVar) {
        C27336bz bzVar = new C27336bz(this, rVar);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(bzVar), this.f74993m);
        C27388dw dwVar = new C27388dw();
        C60856cj.m92911t(m, C47810es.m84974n(dwVar), this.f74993m);
    }

    /* renamed from: E */
    public final void mo32919E() {
        if (this.f74910aF.indexOfChild(this.f74917aM) < 0) {
            int indexOfChild = this.f74910aF.indexOfChild(this.f74916aL);
            this.f74910aF.removeView(this.f74916aL);
            this.f74910aF.addView(this.f74917aM, indexOfChild);
        }
        this.f74916aL = null;
        this.f74981by = null;
    }

    /* renamed from: F */
    public final void mo32920F() {
        if (!this.f74995o.mo31462g(C26239a.SELECTION_STATE_ENABLED) || this.f74995o.mo31462g(C26239a.EDUCATION_SELECTION_STATE_ENABLED) || !this.f74881C.f74755A.f75057b || this.f74973bq.f69455a.mo3842a() == C25498ad.NONE) {
            this.f75005y.mo32438e(false);
            if (!this.f74881C.f74776V.mo33304b()) {
                mo32956u();
                Fragment a = this.f74996p.mo33054a();
                if (a != null) {
                    C27525w a2 = ((C27520r) a).mo17754z();
                    Fragment a3 = a2.mo33059a();
                    if (a3 instanceof C27701e) {
                        a2.mo33067j(a3);
                        return;
                    }
                    C60870cx cxVar = a2.f75295s;
                    if (cxVar != null) {
                        cxVar.cancel(false);
                        a2.f75295s = null;
                    }
                    a2.mo33063f(C62722b.CANCELLED);
                }
                if (this.f74881C.mo32872E()) {
                    this.f75001u.mo19974a(C37194a.f98627f.mo40805c(C62722b.OK));
                    this.f75001u.mo19974a(C37194a.f98543c);
                    if (mo32944af()) {
                        this.f75001u.mo19974a(C37194a.f98425O);
                    }
                } else if (!m50980ay()) {
                    mo32917C();
                }
            }
        } else {
            mo32931R();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x048d A[SYNTHETIC, Splitter:B:158:0x048d] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04dc A[SYNTHETIC, Splitter:B:168:0x04dc] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x052c  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30589G(android.content.Intent r11) {
        /*
            r10 = this;
            dagger.a r0 = r10.f74970bn
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.lens.view.ab.e r0 = (com.google.android.libraries.lens.view.p2051ab.C24972e) r0
            android.net.Uri r1 = r11.getData()
            if (r1 != 0) goto L_0x000f
            goto L_0x0053
        L_0x000f:
            java.lang.String r2 = "return-text"
            java.lang.String r3 = r1.getHost()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0053
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ae-action://return-text/"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.String r2 = "UTF-8"
            java.lang.String r11 = p3186j$.net.URLDecoder.decode(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "EXTRA_LENS_RESULT_TEXT"
            android.content.Intent r11 = r1.putExtra(r2, r11)
            android.app.Activity r1 = r0.f68121b
            r2 = -1
            r1.setResult(r2, r11)
            android.app.Activity r11 = r0.f68121b
            r11.finish()
            return
        L_0x0044:
            r0 = move-exception
            com.google.common.f.a.d r1 = com.google.android.libraries.lens.view.p2051ab.C24972e.f68120a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Couldn't decode Lens copy-to-keyboard results"
            r3 = 49622(0xc1d6, float:6.9535E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
        L_0x0053:
            android.net.Uri r0 = r11.getData()
            r0.getClass()
            java.lang.String r1 = "ae-action"
            java.lang.String r2 = r0.getScheme()
            boolean r1 = r1.equals(r2)
            com.google.common.base.C58838bb.m90868c(r1)
            java.lang.String r1 = "send_feedback"
            java.lang.String r2 = r0.getHost()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0079
            java.lang.String r11 = "ep"
            r10.mo32937Y(r11)
            return
        L_0x0079:
            java.lang.String r1 = "edit_text_query"
            java.lang.String r2 = r0.getHost()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0089
            r10.mo32916B()
            return
        L_0x0089:
            java.lang.String r1 = "lens-forward-intent"
            java.lang.String r2 = r0.getHost()
            boolean r1 = r1.equals(r2)
            r2 = 8
            if (r1 == 0) goto L_0x00b2
            java.lang.String r0 = "com.google.opa.eyes.EXTRA_LENS_FORWARD_INTENT"
            java.lang.String r11 = r11.getStringExtra(r0)
            byte[] r11 = android.util.Base64.decode(r11, r2)
            com.google.android.libraries.lens.view.at.t r0 = r10.f74883E
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = p3186j$.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r11, r2)
            android.content.Intent r11 = com.google.android.libraries.lens.view.utils.C28133v.m52416b(r1)
            r0.mo30556f(r11)
            return
        L_0x00b2:
            java.lang.String r1 = "resultpanel-expand"
            java.lang.String r3 = r0.getHost()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c6
            com.google.android.libraries.lens.view.infopanel.a.p r11 = r10.f75005y
            com.google.android.libraries.lens.view.infopanel.a.d r0 = com.google.android.libraries.lens.view.infopanel.p2138a.C26968d.FULLY_EXPANDED
            r11.mo32441h(r0)
            return
        L_0x00c6:
            java.lang.String r1 = "resultpanel-header-hide"
            java.lang.String r3 = r0.getHost()
            boolean r1 = r1.equals(r3)
            r3 = 0
            if (r1 == 0) goto L_0x00e0
            com.google.android.libraries.lens.view.infopanel.c r11 = r10.f74926aV
            r11.getClass()
            com.google.android.libraries.lens.view.infopanel.m r11 = r11.mo17754z()
            r11.mo32628g(r3)
            return
        L_0x00e0:
            java.lang.String r1 = "resultpanel-header-show"
            java.lang.String r4 = r0.getHost()
            boolean r1 = r1.equals(r4)
            r4 = 1
            if (r1 == 0) goto L_0x00fa
            com.google.android.libraries.lens.view.infopanel.c r11 = r10.f74926aV
            r11.getClass()
            com.google.android.libraries.lens.view.infopanel.m r11 = r11.mo17754z()
            r11.mo32628g(r4)
            return
        L_0x00fa:
            java.lang.String r1 = "request-location-permissions"
            java.lang.String r5 = r0.getHost()
            boolean r1 = r1.equals(r5)
            r5 = 5
            r6 = 4
            r7 = 2
            if (r1 == 0) goto L_0x0173
            com.google.android.libraries.lens.view.main.eb r11 = com.google.android.libraries.lens.view.main.C27394eb.UNINITIALIZED
            com.google.android.libraries.lens.view.at.z r11 = com.google.android.libraries.lens.view.p2078at.C25543z.POSTCAPTURE
            com.google.android.libraries.lens.view.session.al r11 = r10.f74969bm
            int r11 = r11.mo33228f()
            int r0 = r11 + -1
            r1 = 0
            if (r11 == 0) goto L_0x0172
            if (r0 == 0) goto L_0x0165
            if (r0 == r7) goto L_0x0145
            r11 = 3
            if (r0 == r11) goto L_0x0145
            if (r0 == r6) goto L_0x0133
            if (r0 == r5) goto L_0x0124
            return
        L_0x0124:
            com.google.common.f.e r11 = f74877a
            com.google.common.f.x r11 = r11.mo56225c()
            java.lang.String r0 = "Requested location permissions but the entrypoint disallows it"
            r1 = 49783(0xc277, float:6.9761E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0133:
            com.google.android.libraries.lens.view.at.aj r11 = r10.f74997q
            java.lang.String[] r0 = r11.mo30538h()
            com.google.android.libraries.lens.view.main.ci r1 = new com.google.android.libraries.lens.view.main.ci
            r1.<init>(r10)
            r2 = 161400(0x27678, float:2.2617E-40)
            r11.mo30534d(r0, r1, r2)
            return
        L_0x0145:
            android.content.Intent r11 = new android.content.Intent
            java.lang.String r0 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r11.<init>(r0)
            com.google.android.libraries.lens.view.main.ai r0 = r10.f74987g
            android.content.Context r0 = r0.getContext()
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r2 = "package"
            android.net.Uri r0 = android.net.Uri.fromParts(r2, r0, r1)
            r11.setData(r0)
            com.google.android.libraries.lens.view.at.t r0 = r10.f74883E
            r0.mo30556f(r11)
            return
        L_0x0165:
            android.content.Intent r11 = new android.content.Intent
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            r11.<init>(r0)
            com.google.android.libraries.lens.view.at.t r0 = r10.f74883E
            r0.mo30556f(r11)
            return
        L_0x0172:
            throw r1
        L_0x0173:
            java.lang.String r1 = "com.google.opa.eyes.EXTRA_LENS_FOLLOW_ON_PRESENTATION_METADATA"
            java.lang.String r1 = r11.getStringExtra(r1)
            if (r1 == 0) goto L_0x02b1
            byte[] r11 = android.util.Base64.decode(r1, r2)
            com.google.protobuf.z r11 = com.google.protobuf.C63088z.m96139A(r11)     // Catch:{ ct -> 0x02a1 }
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x02a1 }
            com.google.lens.a.bb r1 = com.google.lens.p4694a.C62050bb.f167631e     // Catch:{ ct -> 0x02a1 }
            com.google.protobuf.bv r11 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r1, (com.google.protobuf.C63088z) r11, (com.google.protobuf.C62921ba) r0)     // Catch:{ ct -> 0x02a1 }
            com.google.lens.a.bb r11 = (com.google.lens.p4694a.C62050bb) r11     // Catch:{ ct -> 0x02a1 }
            if (r11 == 0) goto L_0x02a0
            int r0 = r11.f167633a
            r0 = r0 & r4
            if (r0 == 0) goto L_0x02a0
            int r0 = r11.f167635c
            int r0 = com.google.lens.p4694a.C62049ba.m94754a(r0)
            if (r0 != 0) goto L_0x01a0
            goto L_0x027a
        L_0x01a0:
            if (r0 != r7) goto L_0x027a
            com.google.android.libraries.lens.view.infopanel.a.p r0 = r10.f75005y
            com.google.android.libraries.lens.view.infopanel.a.i r0 = r0.mo32436b()
            int r1 = r11.f167636d
            com.google.android.libraries.lens.view.infopanel.a.g r2 = com.google.android.libraries.lens.view.infopanel.p2138a.C26973i.m50040p()
            com.google.common.base.ax r4 = r0.mo32413d()
            if (r4 == 0) goto L_0x0272
            r6 = r2
            com.google.android.libraries.lens.view.infopanel.a.a r6 = (com.google.android.libraries.lens.view.infopanel.p2138a.C26961a) r6
            r6.f73511c = r4
            com.google.android.libraries.lens.view.infopanel.a.a.d r4 = r0.mo32412b()
            r2.mo32394b(r4)
            r2.mo32398f(r3)
            com.google.common.base.ax r4 = r0.mo32422k()
            if (r4 == 0) goto L_0x026a
            r6.f73510b = r4
            boolean r4 = r0.mo32424m()
            r2.mo32395c(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)
            r6.f73514f = r4
            com.google.common.b.gp r4 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.gu r8 = r0.mo32423l()
            if (r1 < 0) goto L_0x0203
            int r9 = r8.size()
            if (r1 >= r9) goto L_0x0203
            r0 = 0
        L_0x01ed:
            if (r0 >= r1) goto L_0x01fb
            java.lang.Object r9 = r8.get(r0)
            com.google.android.libraries.lens.view.infopanel.e.ae r9 = (com.google.android.libraries.lens.view.infopanel.p2144e.C27129ae) r9
            r4.mo55395g(r9)
            int r0 = r0 + 1
            goto L_0x01ed
        L_0x01fb:
            com.google.common.b.gu r0 = r4.mo55394f()
            r2.mo32396d(r0)
            goto L_0x020a
        L_0x0203:
            com.google.common.b.gu r0 = r0.mo32423l()
            r2.mo32396d(r0)
        L_0x020a:
            com.google.protobuf.cq r11 = r11.f167634b
            java.util.Iterator r11 = r11.iterator()
        L_0x0210:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x024f
            java.lang.Object r0 = r11.next()
            com.google.at.g.a.a.ce r0 = (com.google.p4017at.p4056g.p4057a.p4058a.C54024ce) r0
            int r1 = r0.f141747a
            if (r1 != r5) goto L_0x022c
            java.lang.Object r0 = r0.f141748b
            com.google.at.g.a.a.ac r0 = (com.google.p4017at.p4056g.p4057a.p4058a.C53968ac) r0
            com.google.android.libraries.lens.view.infopanel.a.a.d r0 = com.google.android.libraries.lens.view.infopanel.p2138a.p2139a.C26965d.m50010f(r0)
            r2.mo32394b(r0)
            goto L_0x0210
        L_0x022c:
            if (r1 != r7) goto L_0x0210
            java.lang.Object r0 = r0.f141748b
            com.google.at.g.a.a.ck r0 = (com.google.p4017at.p4056g.p4057a.p4058a.C54030ck) r0
            com.google.lens.a.ax r0 = r0.f141760b
            if (r0 == 0) goto L_0x0210
            int r1 = r0.f167625a
            r4 = 41
            if (r1 != r4) goto L_0x0210
            java.lang.Object r0 = r0.f167626b
            com.google.lens.a.cv r0 = (com.google.lens.p4694a.C62097cv) r0
            com.google.android.libraries.lens.view.srpx.a.c r0 = com.google.android.libraries.lens.view.srpx.p2170a.C28033d.m52241i(r0)
            com.google.android.libraries.lens.view.srpx.a.d r0 = r0.mo33486a()
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            r6.f73510b = r0
            goto L_0x0210
        L_0x024f:
            com.google.android.libraries.lens.view.infopanel.a.i r11 = r2.mo32393a()
            com.google.android.libraries.lens.view.af.av r0 = r10.f74882D
            com.google.android.libraries.lens.view.session.ax r1 = r10.f74967bk
            android.content.Context r2 = r10.f75000t
            com.google.common.o.aac r2 = com.google.android.libraries.lens.view.utils.C28137z.m52436b(r2, r3)
            com.google.common.o.uf r1 = r1.mo33230a(r2)
            r0.mo30241a(r1)
            com.google.android.libraries.lens.view.infopanel.a.p r0 = r10.f75005y
            r0.mo32440g(r11)
            return
        L_0x026a:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "Null srpModel"
            r11.<init>(r0)
            throw r11
        L_0x0272:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "Null infoPanelFeedbackItem"
            r11.<init>(r0)
            throw r11
        L_0x027a:
            com.google.common.f.e r0 = f74877a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 49761(0xc261, float:6.973E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            int r11 = r11.f167635c
            int r11 = com.google.lens.p4694a.C62049ba.m94754a(r11)
            if (r11 != 0) goto L_0x0294
            goto L_0x0299
        L_0x0294:
            if (r11 == r4) goto L_0x0299
            java.lang.String r11 = "INLINE_UPDATE"
            goto L_0x029b
        L_0x0299:
            java.lang.String r11 = "DEFAULT_REFRESH"
        L_0x029b:
            java.lang.String r1 = "Received followOnPresentationMetadata with unsupported Type: %s"
            r0.mo56389s(r1, r11)
        L_0x02a0:
            return
        L_0x02a1:
            r11 = move-exception
            com.google.common.f.e r0 = f74877a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Could not set refinement model, received invalid proto."
            r2 = 49762(0xc262, float:6.9731E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r11)).mo56372aa(r2)).mo56386p(r1)
            return
        L_0x02b1:
            com.google.android.libraries.lens.view.am.r r1 = com.google.android.libraries.lens.view.p2069am.C25342r.f68970o
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.lens.view.am.o r1 = (com.google.android.libraries.lens.view.p2069am.C25339o) r1
            java.lang.String r5 = r0.getHost()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.libraries.lens.view.am.r r8 = (com.google.android.libraries.lens.view.p2069am.C25342r) r8
            r5.getClass()
            int r9 = r8.f68972a
            r9 = r9 | r4
            r8.f68972a = r9
            r8.f68973b = r5
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L_0x02ef
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x02ef
            java.lang.String r0 = r0.substring(r4)
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.libraries.lens.view.am.r r5 = (com.google.android.libraries.lens.view.p2069am.C25342r) r5
            r0.getClass()
            int r8 = r5.f68972a
            r8 = r8 | r7
            r5.f68972a = r8
            r5.f68974c = r0
        L_0x02ef:
            java.lang.String r0 = "com.google.opa.eyes.EXTRA_TITLE"
            java.lang.String r0 = m50969an(r11, r0)
            if (r0 == 0) goto L_0x0305
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.libraries.lens.view.am.r r5 = (com.google.android.libraries.lens.view.p2069am.C25342r) r5
            int r8 = r5.f68972a
            r6 = r6 | r8
            r5.f68972a = r6
            r5.f68975d = r0
        L_0x0305:
            java.lang.String r0 = "com.google.opa.eyes.EXTRA_TEXT"
            java.lang.String r0 = m50969an(r11, r0)
            if (r0 == 0) goto L_0x031b
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.libraries.lens.view.am.r r5 = (com.google.android.libraries.lens.view.p2069am.C25342r) r5
            int r6 = r5.f68972a
            r6 = r6 | r2
            r5.f68972a = r6
            r5.f68976e = r0
        L_0x031b:
            java.lang.String r0 = "com.google.opa.eyes.EXTRA_MATH_EDITOR_METADATA"
            java.lang.String r0 = m50969an(r11, r0)
            com.google.android.libraries.lens.view.am.q r5 = com.google.android.libraries.lens.view.p2069am.C25341q.f68965d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.lens.view.am.p r5 = (com.google.android.libraries.lens.view.p2069am.C25340p) r5
            if (r0 == 0) goto L_0x0339
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.libraries.lens.view.am.q r6 = (com.google.android.libraries.lens.view.p2069am.C25341q) r6
            int r8 = r6.f68967a
            r8 = r8 | r4
            r6.f68967a = r8
            r6.f68968b = r0
        L_0x0339:
            java.lang.String r0 = "com.google.opa.eyes.EXTRA_MATH_EDITOR_IS_FULL_QUERY"
            java.lang.String r0 = m50969an(r11, r0)
            if (r0 == 0) goto L_0x0357
            java.lang.String r6 = "n"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0357
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.libraries.lens.view.am.q r0 = (com.google.android.libraries.lens.view.p2069am.C25341q) r0
            int r6 = r0.f68967a
            r6 = r6 | r7
            r0.f68967a = r6
            r0.f68969c = r3
        L_0x0357:
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.libraries.lens.view.am.r r0 = (com.google.android.libraries.lens.view.p2069am.C25342r) r0
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.libraries.lens.view.am.q r5 = (com.google.android.libraries.lens.view.p2069am.C25341q) r5
            r5.getClass()
            r0.f68983l = r5
            int r5 = r0.f68972a
            r5 = r5 | 4096(0x1000, float:5.74E-42)
            r0.f68972a = r5
            java.lang.String r0 = "com.google.opa.eyes.EXTRA_LENSLETS_DATA"
            java.lang.String r0 = r11.getStringExtra(r0)
            if (r0 == 0) goto L_0x03af
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch:{ ct -> 0x03a0, IllegalArgumentException -> 0x039e }
            com.google.protobuf.z r0 = com.google.protobuf.C63088z.m96139A(r0)     // Catch:{ ct -> 0x03a0, IllegalArgumentException -> 0x039e }
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x03a0, IllegalArgumentException -> 0x039e }
            com.google.lens.f.b r6 = com.google.lens.p4700f.C62247b.f168052a     // Catch:{ ct -> 0x03a0, IllegalArgumentException -> 0x039e }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r5)     // Catch:{ ct -> 0x03a0, IllegalArgumentException -> 0x039e }
            com.google.lens.f.b r0 = (com.google.lens.p4700f.C62247b) r0     // Catch:{ ct -> 0x03a0, IllegalArgumentException -> 0x039e }
            r1.copyOnWrite()     // Catch:{ ct -> 0x03a0, IllegalArgumentException -> 0x039e }
            com.google.protobuf.bv r5 = r1.instance     // Catch:{ ct -> 0x03a0, IllegalArgumentException -> 0x039e }
            com.google.android.libraries.lens.view.am.r r5 = (com.google.android.libraries.lens.view.p2069am.C25342r) r5     // Catch:{ ct -> 0x03a0, IllegalArgumentException -> 0x039e }
            r0.getClass()     // Catch:{ ct -> 0x03a0, IllegalArgumentException -> 0x039e }
            r5.f68977f = r0     // Catch:{ ct -> 0x03a0, IllegalArgumentException -> 0x039e }
            int r0 = r5.f68972a     // Catch:{ ct -> 0x03a0, IllegalArgumentException -> 0x039e }
            r0 = r0 | 16
            r5.f68972a = r0     // Catch:{ ct -> 0x03a0, IllegalArgumentException -> 0x039e }
            goto L_0x03af
        L_0x039e:
            r0 = move-exception
            goto L_0x03a1
        L_0x03a0:
            r0 = move-exception
        L_0x03a1:
            com.google.common.f.e r5 = f74877a
            com.google.common.f.x r5 = r5.mo56225c()
            java.lang.String r6 = "Could not set Lenslets data, received invalid proto."
            r8 = 49764(0xc264, float:6.9734E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r8)).mo56386p(r6)
        L_0x03af:
            java.lang.String r0 = "com.google.opa.eyes.EXTRA_LENS_QUERY_REQUEST_METADATA"
            java.lang.String r0 = r11.getStringExtra(r0)
            if (r0 == 0) goto L_0x03fc
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch:{ ct -> 0x03ed, IllegalArgumentException -> 0x03eb }
            com.google.protobuf.z r0 = com.google.protobuf.C63088z.m96139A(r0)     // Catch:{ ct -> 0x03ed, IllegalArgumentException -> 0x03eb }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x03ed, IllegalArgumentException -> 0x03eb }
            com.google.bp.f.b.a.be r5 = com.google.p4242bp.p4257f.p4260b.p4261a.C56251be.f149845d     // Catch:{ ct -> 0x03ed, IllegalArgumentException -> 0x03eb }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x03ed, IllegalArgumentException -> 0x03eb }
            com.google.bp.f.b.a.be r0 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56251be) r0     // Catch:{ ct -> 0x03ed, IllegalArgumentException -> 0x03eb }
            r1.copyOnWrite()     // Catch:{ ct -> 0x03ed, IllegalArgumentException -> 0x03eb }
            com.google.protobuf.bv r2 = r1.instance     // Catch:{ ct -> 0x03ed, IllegalArgumentException -> 0x03eb }
            com.google.android.libraries.lens.view.am.r r2 = (com.google.android.libraries.lens.view.p2069am.C25342r) r2     // Catch:{ ct -> 0x03ed, IllegalArgumentException -> 0x03eb }
            r0.getClass()     // Catch:{ ct -> 0x03ed, IllegalArgumentException -> 0x03eb }
            r2.f68978g = r0     // Catch:{ ct -> 0x03ed, IllegalArgumentException -> 0x03eb }
            int r5 = r2.f68972a     // Catch:{ ct -> 0x03ed, IllegalArgumentException -> 0x03eb }
            r5 = r5 | 32
            r2.f68972a = r5     // Catch:{ ct -> 0x03ed, IllegalArgumentException -> 0x03eb }
            com.google.android.libraries.lens.view.infopanel.a.p r2 = r10.f75005y     // Catch:{ ct -> 0x03ed, IllegalArgumentException -> 0x03eb }
            int r0 = r0.f149847a     // Catch:{ ct -> 0x03ed, IllegalArgumentException -> 0x03eb }
            r0 = r0 & r7
            if (r0 == 0) goto L_0x03e5
            r3 = 1
        L_0x03e5:
            r0 = r3 ^ 1
            r2.mo32438e(r0)     // Catch:{ ct -> 0x03ed, IllegalArgumentException -> 0x03eb }
            goto L_0x03fc
        L_0x03eb:
            r0 = move-exception
            goto L_0x03ee
        L_0x03ed:
            r0 = move-exception
        L_0x03ee:
            com.google.common.f.e r2 = f74877a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Could not set QueryRequestMetadata, received invalid proto."
            r4 = 49763(0xc263, float:6.9733E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
        L_0x03fc:
            com.google.common.base.ax r0 = com.google.android.libraries.lens.view.utils.C28133v.m52417c(r11)
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x041e
            java.lang.Object r0 = r0.mo56107c()
            com.google.protos.ag.b.d r0 = (com.google.protos.p4799ag.p4802b.C63164d) r0
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.lens.view.am.r r2 = (com.google.android.libraries.lens.view.p2069am.C25342r) r2
            r0.getClass()
            r2.f68979h = r0
            int r0 = r2.f68972a
            r0 = r0 | 64
            r2.f68972a = r0
        L_0x041e:
            java.lang.String r0 = "com.google.opa.eyes.EXTRA_SOURCE_CHIP_ID"
            java.lang.String r0 = r11.getStringExtra(r0)
            if (r0 == 0) goto L_0x0435
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.lens.view.am.r r2 = (com.google.android.libraries.lens.view.p2069am.C25342r) r2
            int r3 = r2.f68972a
            r3 = r3 | 256(0x100, float:3.59E-43)
            r2.f68972a = r3
            r2.f68980i = r0
        L_0x0435:
            java.lang.String r0 = "com.google.opa.eyes.EXTRA_CLOUD_COPY_METADATA"
            byte[] r0 = com.google.android.libraries.lens.view.utils.C28133v.m52423i(r11, r0)
            int r2 = r0.length
            if (r2 == 0) goto L_0x0464
            com.google.protobuf.z r0 = com.google.protobuf.C63088z.m96139A(r0)     // Catch:{ ct -> 0x0455, IllegalArgumentException -> 0x0453 }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0455, IllegalArgumentException -> 0x0453 }
            com.google.lens.j.j r3 = com.google.lens.p4707j.C62576j.f168937e     // Catch:{ ct -> 0x0455, IllegalArgumentException -> 0x0453 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x0455, IllegalArgumentException -> 0x0453 }
            com.google.lens.j.j r0 = (com.google.lens.p4707j.C62576j) r0     // Catch:{ ct -> 0x0455, IllegalArgumentException -> 0x0453 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ ct -> 0x0455, IllegalArgumentException -> 0x0453 }
            goto L_0x0466
        L_0x0453:
            r0 = move-exception
            goto L_0x0456
        L_0x0455:
            r0 = move-exception
        L_0x0456:
            com.google.common.f.a.d r2 = com.google.android.libraries.lens.view.utils.C28133v.f76548a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Could not set CloudCopyActionData"
            r4 = 50263(0xc457, float:7.0433E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
        L_0x0464:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0466:
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x0484
            java.lang.Object r0 = r0.mo56107c()
            com.google.lens.j.j r0 = (com.google.lens.p4707j.C62576j) r0
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.lens.view.am.r r2 = (com.google.android.libraries.lens.view.p2069am.C25342r) r2
            r0.getClass()
            r2.f68981j = r0
            int r0 = r2.f68972a
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r2.f68972a = r0
        L_0x0484:
            java.lang.String r0 = "com.google.opa.eyes.EXTRA_TEXT_TO_SPEECH_METADATA"
            byte[] r0 = com.google.android.libraries.lens.view.utils.C28133v.m52423i(r11, r0)
            int r2 = r0.length
            if (r2 == 0) goto L_0x04b3
            com.google.protobuf.z r0 = com.google.protobuf.C63088z.m96139A(r0)     // Catch:{ ct -> 0x04a4, IllegalArgumentException -> 0x04a2 }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x04a4, IllegalArgumentException -> 0x04a2 }
            com.google.lens.j.eg r3 = com.google.lens.p4707j.C62511eg.f168775b     // Catch:{ ct -> 0x04a4, IllegalArgumentException -> 0x04a2 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x04a4, IllegalArgumentException -> 0x04a2 }
            com.google.lens.j.eg r0 = (com.google.lens.p4707j.C62511eg) r0     // Catch:{ ct -> 0x04a4, IllegalArgumentException -> 0x04a2 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ ct -> 0x04a4, IllegalArgumentException -> 0x04a2 }
            goto L_0x04b5
        L_0x04a2:
            r0 = move-exception
            goto L_0x04a5
        L_0x04a4:
            r0 = move-exception
        L_0x04a5:
            com.google.common.f.a.d r2 = com.google.android.libraries.lens.view.utils.C28133v.f76548a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Could not set TextToSpeechActionData"
            r4 = 50267(0xc45b, float:7.0439E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
        L_0x04b3:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x04b5:
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x04d3
            java.lang.Object r0 = r0.mo56107c()
            com.google.lens.j.eg r0 = (com.google.lens.p4707j.C62511eg) r0
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.lens.view.am.r r2 = (com.google.android.libraries.lens.view.p2069am.C25342r) r2
            r0.getClass()
            r2.f68982k = r0
            int r0 = r2.f68972a
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r2.f68972a = r0
        L_0x04d3:
            java.lang.String r0 = "com.google.opa.eyes.EXTRA_PRONOUNCE_OBJECT_METADATA"
            byte[] r0 = com.google.android.libraries.lens.view.utils.C28133v.m52423i(r11, r0)
            int r2 = r0.length
            if (r2 == 0) goto L_0x0502
            com.google.protobuf.z r0 = com.google.protobuf.C63088z.m96139A(r0)     // Catch:{ ct -> 0x04f3, IllegalArgumentException -> 0x04f1 }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x04f3, IllegalArgumentException -> 0x04f1 }
            com.google.lens.j.du r3 = com.google.lens.p4707j.C62498du.f168729a     // Catch:{ ct -> 0x04f3, IllegalArgumentException -> 0x04f1 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x04f3, IllegalArgumentException -> 0x04f1 }
            com.google.lens.j.du r0 = (com.google.lens.p4707j.C62498du) r0     // Catch:{ ct -> 0x04f3, IllegalArgumentException -> 0x04f1 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ ct -> 0x04f3, IllegalArgumentException -> 0x04f1 }
            goto L_0x0504
        L_0x04f1:
            r0 = move-exception
            goto L_0x04f4
        L_0x04f3:
            r0 = move-exception
        L_0x04f4:
            com.google.common.f.a.d r2 = com.google.android.libraries.lens.view.utils.C28133v.f76548a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Could not set PronounceObjectActionData"
            r4 = 50266(0xc45a, float:7.0438E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
        L_0x0502:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0504:
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x0522
            java.lang.Object r0 = r0.mo56107c()
            com.google.lens.j.du r0 = (com.google.lens.p4707j.C62498du) r0
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.lens.view.am.r r2 = (com.google.android.libraries.lens.view.p2069am.C25342r) r2
            r0.getClass()
            r2.f68984m = r0
            int r0 = r2.f68972a
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r2.f68972a = r0
        L_0x0522:
            com.google.common.base.ax r11 = com.google.android.libraries.lens.view.utils.C28133v.m52418d(r11)
            boolean r0 = r11.mo56113h()
            if (r0 == 0) goto L_0x0544
            java.lang.Object r11 = r11.mo56107c()
            com.google.lens.j.x r11 = (com.google.lens.p4707j.C62590x) r11
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.libraries.lens.view.am.r r0 = (com.google.android.libraries.lens.view.p2069am.C25342r) r0
            r11.getClass()
            r0.f68985n = r11
            int r11 = r0.f68972a
            r11 = r11 | 16384(0x4000, float:2.2959E-41)
            r0.f68972a = r11
        L_0x0544:
            com.google.protobuf.bv r11 = r1.build()
            com.google.android.libraries.lens.view.am.r r11 = (com.google.android.libraries.lens.view.p2069am.C25342r) r11
            r10.mo32918D(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.main.C27384dt.mo30589G(android.content.Intent):void");
    }

    /* renamed from: H */
    public final void mo32921H() {
        C118569b bVar;
        C27517o oVar = this.f74996p;
        if (!oVar.f75257k) {
            C118569b bVar2 = C118569b.UNKNOWN_METRIC_TYPE;
            if (oVar.f75248b.mo30536f("android.permission.CAMERA")) {
                bVar = C118569b.LENS_CAMERA_GRANTED_ON_STARTUP_COUNT;
                if (oVar.f75254h) {
                    oVar.f75253g.mo30235a("GRANTED");
                }
            } else if (!C1820g.m4992b(oVar.f75250d, "android.permission.CAMERA")) {
                bVar = C118569b.LENS_CAMERA_BLOCKED_ON_STARTUP_COUNT;
                if (oVar.f75254h) {
                    oVar.f75253g.mo30235a("BLOCKED");
                }
            } else if (oVar.f75249c.mo30359o()) {
                bVar = C118569b.LENS_CAMERA_PENDING_ON_STARTUP_SHOW_FALLBACK_COUNT;
                if (oVar.f75254h) {
                    oVar.f75253g.mo30235a("PENDING_SHOW_FALLBACK");
                }
            } else {
                bVar = C118569b.LENS_CAMERA_PENDING_ON_STARTUP_SHOW_ONBOARDING_COUNT;
                if (oVar.f75254h) {
                    oVar.f75253g.mo30235a("PENDING_SHOW_ONBOARDING");
                }
            }
            oVar.f75252f.mo30251a(C118575h.PLUGIN_LENS, bVar, 1);
            oVar.f75257k = true;
        }
        if (m50981az()) {
            if (this.f74962bf.mo33016a() && this.f74997q.mo30536f("android.permission.CAMERA")) {
                m50972aq(false);
                C25582f fVar = this.f74916aL;
                fVar.getClass();
                fVar.setVisibility(4);
            }
            mo32926M();
        } else if (this.f74996p.mo33057d()) {
            C58838bb.m90883r(this.f74992l.mo30591a());
            C27517o oVar2 = this.f74996p;
            boolean d = C62632i.m94819d(this.f74886H.mo32701h());
            if (oVar2.mo33054a() == null) {
                C27520r b = C27525w.m51242b(oVar2.f75247a, d);
                C0154a aVar = new C0154a((FragmentManager) oVar2.f75251e.mo27525b());
                aVar.mo511h(R.id.lens_onboarding_container, b, "ONBOARDING_FRAGMENT", 1);
                aVar.mo509f();
            }
            if (!mo32944af()) {
                m50973ar();
            }
            mo32938Z();
            mo32924K();
        } else {
            if (!mo32944af()) {
                m50973ar();
            }
            this.f74996p.mo33055b();
            mo32938Z();
            mo32924K();
        }
        this.f74969bm.mo33225c();
    }

    /* renamed from: I */
    public final void mo32922I(C27077d dVar) {
        this.f75005y.mo32443j(new C26967c(dVar.f73812a, dVar.f73813b));
        mo32933T();
    }

    /* renamed from: J */
    public final void mo32923J() {
        C25190b x = mo32958x();
        if (x != null) {
            x.mo17754z().mo30336b(false);
        }
    }

    /* renamed from: K */
    public final void mo32924K() {
        C58838bb.m90883r(this.f74992l.mo30591a());
        if (mo32943ae() && this.f74962bf.mo33016a() && this.f74997q.mo30536f("android.permission.CAMERA")) {
            m50972aq(true);
        }
    }

    /* renamed from: L */
    public final void mo32925L() {
        if (m50965aA()) {
            m50968am();
        }
        if (this.f74926aV == null) {
            this.f75001u.mo19974a(C37194a.f98611dl);
            this.f74926aV = (C27073c) mo32951p(R.id.lens_coordinator_container, "info_panel_fragment", new C27340cc(this));
            this.f75001u.mo19974a(C37194a.f98612dm);
            this.f74926aV.mo17754z().f74357u.add(this);
            this.f74987g.requireView().findViewById(R.id.filter_selector_fragment_placeholder).bringToFront();
        }
    }

    /* renamed from: M */
    public final void mo32926M() {
        if (this.f74908aD == C27394eb.ACTIVE) {
            C27228h hVar = this.f74928aX;
            if (hVar != null) {
                this.f74881C.mo32884o(hVar);
                this.f74928aX = null;
                this.f74929aY = true;
            }
            if (this.f74929aY) {
                mo32925L();
                if (this.f74976bt) {
                    m50976au();
                } else if (!this.f74995o.mo31462g(C26239a.THINKING_GLEAMS_LOADING_STATE)) {
                    m50977av();
                }
                this.f74881C.mo32882m(this.f74905aA);
                this.f74929aY = false;
            }
        }
    }

    /* renamed from: N */
    public final void mo32927N() {
        C58838bb.m90883r(this.f74964bh.mo56113h());
        String str = (String) this.f74886H.mo32701h().mo56111f();
        if (C62632i.m94825j(this.f74886H.mo32701h())) {
            this.f74965bi.mo30343c(String.valueOf(str), this.f74886H.mo32694a(), this.f75004x.mo26870b());
            return;
        }
        this.f74965bi.f68625a.mo30363c(new C25196ab(str, this.f75004x.mo26870b()));
    }

    /* renamed from: O */
    public final void mo32928O() {
        C26748aq[] aqVarArr;
        if (!mo32943ae()) {
            ((C59052c) ((C59052c) f74877a.mo56225c()).mo56372aa(49769)).mo56386p("#maybeAttachSurfaceToCameraController: Invalid state");
            return;
        }
        m50970ao();
        C25582f fVar = this.f74916aL;
        fVar.getClass();
        if (this.f74997q.mo30536f("android.permission.CAMERA")) {
            if (this.f74981by != null) {
                ((C59052c) ((C59052c) f74877a.mo56226d()).mo56372aa(49767)).mo56386p("#maybeAttachSurfaceToCameraController: Surface already attached");
                return;
            }
            C25586j a = fVar.mo17754z();
            int i = 0;
            while (true) {
                int i2 = a.f69617c;
                if (i >= i2) {
                    aqVarArr = new C26748aq[i2];
                    for (int i3 = 0; i3 < a.f69617c; i3++) {
                        aqVarArr[i3] = a.f69619e[i3].f69614b;
                    }
                } else if (!a.f69619e[i].f69613a.isAvailable()) {
                    aqVarArr = null;
                    break;
                } else {
                    SurfaceTexture surfaceTexture = a.f69619e[i].f69613a.getSurfaceTexture();
                    surfaceTexture.getClass();
                    C25585i iVar = a.f69619e[i];
                    if (iVar.f69614b == null) {
                        iVar.f69614b = new C26748aq(surfaceTexture);
                    }
                    i++;
                }
            }
            if (aqVarArr != null) {
                for (C25585i iVar2 : a.f69619e) {
                    iVar2.f69613a.setVisibility(4);
                }
                a.f69619e[0].f69613a.setVisibility(0);
            }
            if (aqVarArr != null) {
                this.f74981by = aqVarArr;
                C27327bq bqVar = this.f74881C;
                Size size = new Size(fVar.getWidth(), fVar.getHeight());
                bqVar.f74788ah = new C26749ar(aqVarArr);
                bqVar.f74789ai = size;
                bqVar.mo32885q();
            }
        }
    }

    /* renamed from: P */
    public final void mo32929P() {
        if (this.f74987g.getChildFragmentManager().f634a.mo671c("lvf_buttons_fragment_tag") == null) {
            C25901ah ahVar = (C25901ah) mo32951p(R.id.lvf_buttons, "lvf_buttons_fragment_tag", new C27341cd(this));
            C25909ap a = ahVar.mo17754z();
            C25758g gVar = this.f74978bv;
            C27292ai aiVar = this.f74987g;
            C25758g gVar2 = this.f74979bw;
            C25758g gVar3 = mo32952q().f70719h;
            boolean z = false;
            if (((Boolean) gVar2.mo3842a()).booleanValue() && ((Boolean) gVar3.mo3842a()).booleanValue()) {
                z = true;
            }
            C25758g gVar4 = new C25758g(Boolean.valueOf(z));
            gVar2.mo5704e(aiVar, new C25753b(gVar3, gVar4));
            gVar3.mo5704e(aiVar, new C25754c(gVar2, gVar4));
            C26505cj u = mo32956u();
            C27383ds dsVar = this.f74959bc;
            a.f70398q = gVar4;
            a.f70397p = gVar;
            gVar4.mo5704e(a.f70385d, new C25902ai(a));
            gVar.mo5704e(a.f70385d, new C25903aj(a));
            a.f70396o = u;
            C26526dd ddVar = (C26526dd) u;
            ddVar.f72314x.mo5704e(a.f70385d, new C25904ak(a));
            ddVar.f72315y.mo5704e(a.f70385d, new C25905al(a));
            a.f70386e.f72479f.mo5704e(a.f70385d, new C25906am(a));
            a.f70400s = dsVar;
            mo32952q().f70729r = new C27342ce(ahVar);
            mo32940ab();
        }
    }

    /* renamed from: Q */
    public final void mo32930Q() {
        mo32919E();
        this.f74881C.mo32879j();
        mo32924K();
    }

    /* renamed from: R */
    public final void mo32931R() {
        if (this.f74973bq.f69455a.mo3842a() != C25498ad.NONE) {
            this.f74973bq.mo30528a(C25498ad.NONE);
            this.f74881C.f74816u.mo32829f(false);
        } else {
            this.f74910aF.performHapticFeedback(1);
        }
        this.f75005y.mo32442i();
        mo32952q().mo31224e();
        mo32935V(true);
        if (this.f74892N.f70642a.f70649b == C25980d.TRANSLATE) {
            this.f74901W.mo30808j();
        } else {
            this.f74901W.mo30810l(C25688b.f69828b);
        }
    }

    /* renamed from: S */
    public final void mo32932S() {
        if (this.f74997q.mo30536f("android.permission.CAMERA")) {
            mo32924K();
        }
        if (!this.f74996p.mo33057d()) {
            this.f74996p.mo33055b();
        }
    }

    /* renamed from: T */
    public final void mo32933T() {
        C27001as asVar;
        if (this.f74946ap && (asVar = (C27001as) this.f74987g.getChildFragmentManager().f634a.mo671c("lens-multimodal-panel")) != null) {
            asVar.dismiss();
            this.f74987g.getChildFragmentManager().mo467ah();
        }
    }

    /* renamed from: U */
    public final void mo32934U() {
        if (this.f74986f == null) {
            mo32936W();
        }
        FeedbackBannerView feedbackBannerView = this.f74986f;
        feedbackBannerView.getClass();
        String string = this.f75000t.getResources().getString(R.string.lens_results_feedback_prompt_text);
        C1756o oVar = new C1756o();
        oVar.mo4889i(feedbackBannerView);
        oVar.mo4891k(R.id.results_feedback_prompt_text, 7, R.id.thumbs_up, 6);
        oVar.mo4888h(feedbackBannerView);
        feedbackBannerView.f70109b.setText(string);
        feedbackBannerView.f70110c.setVisibility(0);
        feedbackBannerView.f70111d.setVisibility(0);
        feedbackBannerView.f70112e.setVisibility(8);
    }

    /* renamed from: V */
    public final void mo32935V(boolean z) {
        if (m50965aA()) {
            C25941f fVar = m50968am().f69428b;
            fVar.f70482g = z;
            fVar.mo31111d();
        }
    }

    /* renamed from: W */
    public final void mo32936W() {
        FeedbackFooterView feedbackFooterView = (FeedbackFooterView) this.f74912aH.findViewById(R.id.lens_feedback_footer);
        feedbackFooterView.getClass();
        ((C1773f) feedbackFooterView.getLayoutParams()).mo4974a(new FeedbackBehavior(this.f75000t, this.f74966bj));
        FeedbackBannerView a = this.f74968bl.mo33575a();
        this.f74986f = a;
        a.setVisibility(0);
        C28306ab abVar = this.f74890L;
        abVar.mo33802c(feedbackFooterView, abVar.f76990a.mo33805a(C28427h.m53115a(95153)));
        feedbackFooterView.addView(this.f74986f);
        ViewGroup.LayoutParams layoutParams = feedbackFooterView.getLayoutParams();
        if (layoutParams instanceof C1773f) {
            C1770c cVar = ((C1773f) layoutParams).f5523a;
            if (cVar != null) {
                C26980p pVar = this.f75005y;
                pVar.f73569c.mo5704e(this.f74987g, new C25813d((FeedbackBehavior) cVar, feedbackFooterView));
                return;
            }
            throw new IllegalArgumentException("The view is not associated with CoordinatorLayout.Behavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: X */
    public final void mo30544X(String str, int i) {
        if (C28098a.m52377a(this.f75000t)) {
            Toast.makeText(this.f75000t, str, i).show();
        } else {
            Snackbar.m79661q((Context) null, this.f74913aI, str, i).mo48343h();
        }
    }

    /* renamed from: Z */
    public final void mo32938Z() {
        if (mo32943ae()) {
            if (m50978aw(C24226r.SAMPLE_IMAGES)) {
                C25504aj ajVar = this.f74997q;
                if (ajVar.mo30536f(ajVar.mo30532b())) {
                    this.f74881C.mo32872E();
                }
            }
        }
    }

    /* renamed from: aa */
    public final void mo32939aa() {
        if (this.f74997q.mo30536f("android.permission.ACCESS_FINE_LOCATION")) {
            this.f74958bb = 3;
        } else if (this.f74997q.mo30536f("android.permission.ACCESS_COARSE_LOCATION")) {
            this.f74958bb = 2;
        } else {
            this.f74958bb = 1;
        }
    }

    /* renamed from: ab */
    public final void mo32940ab() {
        C27235b bVar;
        if (m50967al() != null && (bVar = this.f74925aU) != null && bVar.getView() != null && C28130s.m52412c(this.f74892N.f70643b, C56306df.AUTO_FILTER)) {
            C25909ap r = mo32953r();
            View requireView = this.f74925aU.requireView();
            LvfButtonsView lvfButtonsView = r.f70395n;
            if (lvfButtonsView != null) {
                ViewGroup viewGroup = (ViewGroup) lvfButtonsView.findViewById(R.id.external_view_container_live);
                viewGroup.removeAllViews();
                ViewParent parent = requireView.getParent();
                if (parent != null) {
                    C58838bb.m90869d(parent instanceof ViewGroup, "parent is not a ViewGroup");
                    ((ViewGroup) parent).removeView(requireView);
                }
                viewGroup.addView(requireView);
            }
        }
    }

    /* renamed from: ac */
    public final void mo32941ac() {
        int i = 0;
        boolean z = this.f74957ba.mo30527d() && this.f74992l.mo30591a() && ((this.f74963bg && !this.f74962bf.mo33016a()) || !this.f74997q.mo30536f("android.permission.CAMERA"));
        View findViewById = this.f74910aF.findViewById(R.id.lens_onboarding_background);
        if (true != z) {
            i = 8;
        }
        findViewById.setVisibility(i);
        if (z) {
            C27506d a = ((OnboardingBackgroundView) findViewById).mo17754z();
            if (!a.f75225c) {
                a.f75225c = true;
                C6007z k = a.f75223a.mo51286a().mo11873k("https://www.gstatic.com/lens/ui/onboarding/blurry_camera.jpg");
                k.mo12455s(new C27505c(a, a.f75224b), (C5592i) null, k, C5622i.f16959a);
            }
        }
    }

    /* renamed from: ad */
    public final void mo32942ad() {
        View view;
        if (C24974a.m46225a(this.f74961be.f68122a) || (view = this.f74987g.getView()) == null) {
            return;
        }
        if (view.getResources().getConfiguration().orientation == 2) {
            Activity activity = this.f74990j;
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 4);
            return;
        }
        Activity activity2 = this.f74990j;
        activity2.getWindow().getDecorView().setSystemUiVisibility(activity2.getWindow().getDecorView().getSystemUiVisibility() & -5);
    }

    /* renamed from: ae */
    public final boolean mo32943ae() {
        return this.f74908aD.equals(C27394eb.ACTIVE);
    }

    /* renamed from: af */
    public final boolean mo32944af() {
        return mo32955t() != null;
    }

    /* renamed from: ag */
    public final boolean mo32945ag() {
        if (mo32944af() || m50979ax()) {
            return false;
        }
        if (!mo32943ae()) {
            this.f74955ay = true;
            return true;
        }
        this.f75001u.mo19974a(C37194a.f98425O);
        m50974as(true);
        C58838bb.m90883r(!this.f74957ba.mo30525b());
        if (this.f74957ba.mo30526c()) {
            this.f74881C.mo32881l();
        }
        return true;
    }

    /* renamed from: ah */
    public final boolean mo32946ah() {
        return !this.f74908aD.equals(C27394eb.UNINITIALIZED) && !this.f74908aD.equals(C27394eb.DESTROYED);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ai */
    public final void mo32947ai(String str, int i, int i2) {
        C25522e eVar = new C25522e(str, i, i2);
        C26980p pVar = this.f75005y;
        pVar.getClass();
        if (!C26980p.m50058m(pVar.mo32436b(), eVar) && !pVar.f73572f.isEmpty()) {
            C26980p.m50058m((C26973i) pVar.f73572f.peek(), eVar);
        }
    }

    /* renamed from: aj */
    public final void mo32948aj(float f) {
        float f2;
        int i;
        int i2;
        Locale locale;
        C26422i t = mo32955t();
        if (t != null) {
            C26299ac a = t.mo17754z();
            if (!a.f71514v.isStarted() && a.f71478J == null && !m50980ay()) {
                C26299ac a2 = t.mo17754z();
                a2.mo31508h(false);
                if (!a2.f71500h.mo33017b()) {
                    View view = a2.f71473E;
                    view.getClass();
                    view.setVisibility(8);
                }
                View view2 = a2.f71475G;
                view2.getClass();
                view2.setVisibility(8);
                a2.f71506n.mo31547b();
                Locale locale2 = a2.f71481M;
                if (!(locale2 == null || (locale = a2.f71482N) == null)) {
                    a2.f71508p.mo31263r(locale2, locale);
                    a2.f71481M = null;
                    a2.f71482N = null;
                    a2.f71508p.mo31257l((Locale) null);
                }
                C26408a aVar = a2.f71477I;
                float f3 = aVar == null ? 0.0f : aVar.f71847b;
                float a3 = (float) a2.mo31501a();
                GalleryRecyclerView galleryRecyclerView = a2.f71474F;
                boolean z = true;
                if (galleryRecyclerView != null) {
                    C0673gh findViewHolderForAdapterPosition = galleryRecyclerView.findViewHolderForAdapterPosition(0);
                    if (findViewHolderForAdapterPosition == null) {
                        i2 = 0;
                    } else {
                        i2 = findViewHolderForAdapterPosition.itemView.getBottom();
                    }
                    int dimensionPixelSize = a2.f71495c.getResources().getDimensionPixelSize(R.dimen.lens_gallery_camera_view_padding_bottom);
                    if (i2 <= dimensionPixelSize) {
                        i2 = dimensionPixelSize + 1;
                        C26408a aVar2 = a2.f71477I;
                        aVar2.getClass();
                        aVar2.mo31607a(i2);
                    }
                    GalleryRecyclerView galleryRecyclerView2 = a2.f71474F;
                    galleryRecyclerView2.getClass();
                    f2 = (float) ((a2.f71483O + galleryRecyclerView2.getPaddingTop()) - i2);
                } else {
                    f2 = 0.0f;
                }
                float f4 = a3 + f2;
                if (f > 0.0f) {
                    float min = Math.min(f4, f3);
                    float max = Math.max(f, 3.0f * f4);
                    C2248v vVar = new C2248v(new C26297aa(a2, min, f4));
                    vVar.mo5589h(min);
                    vVar.f6320m = f4;
                    vVar.f6314g = max;
                    vVar.mo5591i(0.1f);
                    vVar.mo5587f(new C26431r(a2));
                    a2.f71478J = vVar;
                    a2.f71478J.mo5585d();
                    i = (int) (((f4 - min) * 1000.0f) / max);
                } else {
                    float max2 = Math.max(0.0f, f4 - f3);
                    a2.f71514v.setDuration(300);
                    a2.f71514v.addUpdateListener(new C47583cg(a2.f71509q, new C26432s(a2, f3, max2, f4), "Update gallery exit animation"));
                    a2.f71514v.start();
                    i = 300;
                }
                this.f75001u.mo19974a(C37194a.f98426P.mo40815i(C62722b.CANCELLED));
                C25155ap w = mo32957w();
                w.f68520s = false;
                w.mo30295d(false);
                C26416i iVar = this.f74905aA;
                if (iVar != null) {
                    iVar.mo31620d();
                    this.f74905aA = null;
                }
                C58838bb.m90883r(this.f74992l.mo30591a());
                if (this.f74962bf.mo33016a() && this.f74997q.mo30536f("android.permission.CAMERA")) {
                    this.f74881C.mo32880k();
                }
                C27520r rVar = (C27520r) this.f74996p.mo33054a();
                if (rVar != null) {
                    C27525w a4 = rVar.mo17754z();
                    if (a4.f75288l && (!a4.f75284h.mo30359o() || (C62632i.m94823h(a4.f75285i.mo32701h()) && a4.f75284h.mo30346b() <= 0))) {
                        a4.mo33071n(i);
                    } else if (!a4.f75289m.mo30536f("android.permission.CAMERA")) {
                        a4.mo33070m(i);
                    }
                }
                C26022s q = mo32952q();
                C25935c cVar = q.f70725n;
                if (cVar != null) {
                    C26012i a5 = cVar.mo17754z();
                    a5.f70692q = false;
                    if (a5.f70679d.getResources().getConfiguration().orientation != 2 || C24974a.m46225a(a5.f70685j.f68122a)) {
                        z = false;
                    }
                    if (!a5.f70682g.mo33017b() || z) {
                        if (i <= 100) {
                            a5.mo31219e();
                        } else {
                            FilterCarouselView filterCarouselView = a5.f70687l;
                            filterCarouselView.getClass();
                            filterCarouselView.setVisibility(0);
                            FilterCarouselView filterCarouselView2 = a5.f70687l;
                            filterCarouselView2.getClass();
                            filterCarouselView2.animate().alpha(a5.mo31215a()).setStartDelay((long) (i - 100)).setDuration(100);
                        }
                    }
                }
                q.mo31225f(q.f70713b.f70642a.f70649b.mo31199b(), false);
                if (m50967al() != null) {
                    C25909ap r = mo32953r();
                    r.f70399r = false;
                    if (!r.mo31070e()) {
                        if (i <= 100) {
                            r.mo31067b();
                        } else {
                            LvfButtonsView lvfButtonsView = r.f70395n;
                            lvfButtonsView.getClass();
                            lvfButtonsView.setVisibility(0);
                            LvfButtonsView lvfButtonsView2 = r.f70395n;
                            lvfButtonsView2.getClass();
                            lvfButtonsView2.animate().alpha(r.mo31066a()).setStartDelay((long) (i - 100)).setDuration(100);
                        }
                    }
                }
                C27327bq bqVar = this.f74881C;
                bqVar.f74772R = false;
                bqVar.mo32892x();
            }
        }
    }

    /* renamed from: ak */
    public final void mo32949ak(C27394eb ebVar) {
        if (!this.f74908aD.equals(ebVar)) {
            C27394eb ebVar2 = this.f74908aD;
            this.f74908aD = ebVar;
            if (ebVar2.equals(C27394eb.UNINITIALIZED)) {
                ((C59052c) ((C59052c) f74877a.mo56225c()).mo56372aa(49791)).mo56386p("State must be initialized before calling switchToState");
            } else if (ebVar2.equals(C27394eb.DESTROYED)) {
                ((C59052c) ((C59052c) f74877a.mo56225c()).mo56372aa(49790)).mo56386p("DESTROYED state shouldn't be changed");
            } else {
                this.f74911aG.setVisibility(0);
                C25543z zVar = C25543z.POSTCAPTURE;
                int ordinal = ebVar.ordinal();
                if (ordinal == 0) {
                    ((C59052c) ((C59052c) f74877a.mo56225c()).mo56372aa(49789)).mo56386p("Should never set state to UNINITIALIZED");
                } else if (ordinal == 1) {
                    mo32919E();
                    C27327bq bqVar = this.f74881C;
                    bqVar.f74764J = new C27303at(bqVar);
                    bqVar.f74818w.mo31312e(bqVar.f74764J);
                    C27288ae aeVar = bqVar.f74816u;
                    aeVar.f74670c.mo30595d().mo30657f(new C27443w(aeVar));
                    aeVar.f74670c.mo30594b().mo30657f(new C27444x(aeVar));
                    aeVar.f74670c.mo30597f().mo30657f(new C27445y(aeVar));
                    aeVar.f74670c.mo30596e().mo30657f(new C27446z(aeVar));
                    aeVar.f74670c.mo30593a().mo30657f(new C27429i(aeVar));
                    aeVar.mo32836m((C25561k) ((C58833ax) aeVar.f74670c.mo30595d().mo30656d()).mo56111f());
                    aeVar.mo32833j((C25561k) ((C58833ax) aeVar.f74670c.mo30594b().mo30656d()).mo56111f());
                    aeVar.mo32835l((C25562l) ((C58833ax) aeVar.f74670c.mo30597f().mo30656d()).mo56111f());
                    aeVar.mo32834k((C25562l) ((C58833ax) aeVar.f74670c.mo30596e().mo30656d()).mo56111f());
                    aeVar.mo32831h((C25563m) ((C58833ax) aeVar.f74670c.mo30593a().mo30656d()).mo56111f());
                    aeVar.f74669b.mo30608e(((C25989d) aeVar.f74674g.mo27525b()).f70643b);
                    C58838bb.m90883r(bqVar.f74766L == null);
                    if (bqVar.f74798c.mo30591a()) {
                        bqVar.f74793am.mo33229g(new C27304au(bqVar));
                    }
                    bqVar.f74765K = true;
                    C26526dd ddVar = (C26526dd) bqVar.f74767M;
                    ddVar.f72296f.f69789e.add(ddVar.f72285H);
                    C27727d dVar = bqVar.f74783ac;
                    C46459k.m82829b(dVar.f75700d.mo51511a(new C27725b(dVar), dVar.f75698b), "OrientationService.startListening failed", new Object[0]);
                    if (this.f74974br) {
                        C24981d dVar2 = this.f74899U;
                        C27280g gVar = this.f74880B;
                        Objects.requireNonNull(gVar);
                        dVar2.mo30199b(new C27334bx(gVar), C24980c.RESULTS_RENDERED);
                    }
                    this.f74899U.mo30199b(new C27335by(this), C24980c.QUERY_SENT);
                    int ordinal2 = this.f74992l.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            if (!this.f74886H.mo32729F((String) this.f74964bh.mo56111f()) || !C62632i.m94825j(this.f74886H.mo32701h())) {
                                mo32921H();
                            } else if (m50981az() || !this.f74996p.mo33057d()) {
                                m50971ap();
                            } else {
                                mo32921H();
                            }
                        }
                    } else if (this.f74886H.mo32729F((String) this.f74964bh.mo56111f())) {
                        m50971ap();
                    } else {
                        mo32926M();
                    }
                } else if (ordinal == 2) {
                    this.f74969bm.mo33226d();
                    this.f74887I.mo30725b();
                    this.f74881C.mo32883n();
                    this.f74954ax = true;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo32901e(float f, float f2) {
        C25582f fVar = this.f74916aL;
        if (fVar != null && fVar.getVisibility() == 0) {
            C28443m mVar = this.f74891M;
            C28442l a = C28442l.m53142h().mo33894a();
            C25582f fVar2 = this.f74916aL;
            fVar2.getClass();
            mVar.mo33853c(a, C28485y.m53234a(fVar2));
            PointF a2 = this.f74901W.mo30799a(new PointF(f, f2));
            C27327bq bqVar = this.f74881C;
            C26765q qVar = bqVar.f74766L;
            if (qVar != null) {
                C58833ax d = qVar.mo32113d(a2);
                if (d.mo56113h()) {
                    C27322bl blVar = bqVar.f74787ag;
                    blVar.getClass();
                    C27384dt dtVar = (C27384dt) blVar;
                    if (dtVar.f74927aW == null) {
                        dtVar.f74927aW = (C28057b) dtVar.mo32951p(R.id.lens_underlay, "focus_point_fragment", new C27367dc(dtVar));
                    }
                    C28063h a3 = dtVar.f74927aW.mo17754z();
                    DisplayMetrics displayMetrics = a3.f76371a.getResources().getDisplayMetrics();
                    a3.f76377g = new Point(Math.round(a2.x * ((float) displayMetrics.widthPixels)), Math.round(a2.y * ((float) displayMetrics.heightPixels)));
                    if (a3.f76372b.isRunning()) {
                        a3.f76372b.cancel();
                    }
                    a3.f76375e.setVisibility(0);
                    a3.f76376f.setVisibility(0);
                    a3.f76372b.start();
                    C26821c cVar = bqVar.f74775U;
                    TimeUnit.MILLISECONDS.toMicros(bqVar.f74774T.mo26870b());
                    cVar.mo32197l();
                    C26765q qVar2 = bqVar.f74766L;
                    qVar2.getClass();
                    qVar2.mo32119j((PointF) d.mo56107c());
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo32902f(float f) {
        C27327bq bqVar = this.f74881C;
        C26765q qVar = bqVar.f74766L;
        if (qVar != null) {
            qVar.mo32115f(f);
            C27322bl blVar = bqVar.f74787ag;
            if (blVar != null) {
                float a = bqVar.f74766L.mo32111a();
                C27384dt dtVar = (C27384dt) blVar;
                dtVar.f74909aE.setContentDescription(dtVar.f75000t.getResources().getString(R.string.lens_zoom_level, new Object[]{Float.valueOf(a)}));
            }
        }
    }

    /* renamed from: g */
    public final void mo32903g() {
        C25928bg bgVar;
        if (m50967al() != null && (bgVar = mo32953r().f70394m) != null && bgVar.f70433d) {
            boolean z = false;
            if ((!bgVar.f70432c || bgVar.f70434e) && bgVar.f70431b.mo30358n()) {
                z = true;
            }
            if (!z) {
                bgVar.mo31086f();
            }
            bgVar.mo31085e(z);
        }
    }

    /* renamed from: h */
    public final boolean mo32904h() {
        return mo32943ae();
    }

    /* renamed from: i */
    public final boolean mo32905i() {
        boolean ag = mo32945ag();
        if (ag) {
            this.f74996p.mo33056c();
        }
        return ag;
    }

    /* renamed from: j */
    public final void mo30856j(C26968d dVar) {
        boolean z = false;
        int i = dVar == C26968d.FULLY_EXPANDED ? 4 : 0;
        this.f74911aG.setImportantForAccessibility(i);
        this.f74910aF.setImportantForAccessibility(i);
        if (dVar == C26968d.MOVING) {
            z = true;
        }
        this.f74952av = z;
    }

    /* renamed from: k */
    public final void mo32861k(boolean z) {
        if (this.f74977bu && this.f74957ba.mo30525b()) {
            this.f74918aN.f74634h = z;
        }
    }

    /* renamed from: kW */
    public final void mo30520kW(C25533p pVar) {
        this.f74984d.f74642b = true;
        m50975at(true);
        m50966aB(5);
    }

    /* renamed from: kX */
    public final void mo30521kX(boolean z) {
        if (z) {
            m50966aB(3);
        }
        C25469b bVar = this.f74934ad;
        if (z) {
            bVar.f69405c.mo5708l(true);
            C60870cx cxVar = bVar.f69406d;
            if (cxVar != null) {
                cxVar.cancel(false);
            }
            bVar.f69406d = bVar.f69404b.mo29165e(new C25468a(bVar), C25469b.f69403a.toMillis(), TimeUnit.MILLISECONDS);
            return;
        }
        bVar.mo30504a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: kY */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30522kY(com.google.android.libraries.lens.view.p2078at.C25497ac r7, com.google.android.libraries.lens.view.p2078at.C25497ac r8, com.google.android.libraries.lens.view.p2078at.C25533p r9) {
        /*
            r6 = this;
            if (r7 == r8) goto L_0x0009
            com.google.android.libraries.lens.view.at.ae r0 = r6.f74973bq
            com.google.android.libraries.lens.view.at.ad r1 = com.google.android.libraries.lens.view.p2078at.C25498ad.NONE
            r0.mo30528a(r1)
        L_0x0009:
            r6.f74957ba = r8
            com.google.android.libraries.lens.view.filters.translation.dc r0 = r6.f74933ac
            com.google.android.libraries.lens.view.p2078at.C25495aa.m46954a(r0, r7, r8, r9)
            com.google.android.libraries.lens.view.filters.s r0 = r6.mo32952q()
            r0.f70726o = r8
            com.google.android.libraries.lens.view.filters.c.f r1 = r0.f70715d
            com.google.android.libraries.lens.view.at.ac r2 = r1.f70479d
            boolean r2 = r2.mo30525b()
            if (r2 == 0) goto L_0x0029
            boolean r2 = r8.mo30525b()
            if (r2 != 0) goto L_0x0029
            r1.mo31108a()
        L_0x0029:
            r1.f70479d = r8
            r1.mo31111d()
            r0.mo31230k()
            com.google.android.libraries.lens.view.d.g r1 = r0.f70716e
            java.lang.Object r1 = r1.mo3842a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            boolean r2 = r8.mo30525b()
            if (r1 == r2) goto L_0x0050
            com.google.android.libraries.lens.view.d.g r1 = r0.f70716e
            boolean r2 = r8.mo30525b()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.mo5708l(r2)
        L_0x0050:
            r0.mo31226g()
            com.google.android.libraries.lens.view.d.g r1 = r0.f70718g
            boolean r2 = r8.mo30524a()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.mo5708l(r2)
            com.google.android.libraries.lens.view.gleam.ff r1 = r0.f70721j
            com.google.android.libraries.lens.view.d.g r1 = r1.f72478e
            java.lang.Object r1 = r1.mo3842a()
            com.google.android.libraries.lens.view.gleam.fc r1 = (com.google.android.libraries.lens.view.gleam.C26583fc) r1
            r0.mo31232m(r1)
            com.google.android.libraries.lens.view.d.g r0 = r6.f74978bv
            java.lang.Object r0 = r0.mo3842a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.google.android.libraries.lens.view.at.ac r1 = r6.f74957ba
            boolean r1 = r1.mo30525b()
            if (r0 == r1) goto L_0x0090
            com.google.android.libraries.lens.view.d.g r0 = r6.f74978bv
            com.google.android.libraries.lens.view.at.ac r1 = r6.f74957ba
            boolean r1 = r1.mo30525b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.mo5708l(r1)
        L_0x0090:
            com.google.android.libraries.lens.view.at.ac r0 = r6.f74957ba
            boolean r0 = r0.mo30525b()
            if (r0 != 0) goto L_0x009b
            r6.mo32929P()
        L_0x009b:
            com.google.android.libraries.lens.view.d.g r0 = r6.f74979bw
            com.google.android.libraries.lens.view.at.ac r1 = r6.f74957ba
            boolean r1 = r1.mo30524a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.mo5708l(r1)
            boolean r0 = r6.f74943am
            if (r0 == 0) goto L_0x00c7
            boolean r0 = r8.mo30525b()
            if (r0 != 0) goto L_0x00bc
            com.google.android.libraries.lens.view.ris.e r0 = r6.mo32959y()
            java.lang.String r1 = ""
            r0.f75581a = r1
        L_0x00bc:
            com.google.android.libraries.lens.view.ris.e r0 = r6.mo32959y()
            boolean r1 = r8.mo30525b()
            r0.mo33170b(r1)
        L_0x00c7:
            r6.mo32941ac()
            com.google.android.libraries.lens.view.av.f r0 = r6.f74916aL
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x012e
            com.google.android.libraries.lens.view.at.ac r0 = r6.f74957ba
            boolean r0 = r0.mo30526c()
            if (r0 != 0) goto L_0x00e9
            com.google.android.libraries.lens.view.at.ac r0 = r6.f74957ba
            boolean r0 = r0.mo30527d()
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r6.mo32944af()
            if (r0 == 0) goto L_0x00e7
            goto L_0x00e9
        L_0x00e7:
            r0 = 0
            goto L_0x00ea
        L_0x00e9:
            r0 = 1
        L_0x00ea:
            android.content.Context r3 = r6.f75000t
            android.content.Context r3 = r3.getApplicationContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131493075(0x7f0c00d3, float:1.860962E38)
            int r4 = r3.getInteger(r4)
            r5 = 2131493076(0x7f0c00d4, float:1.8609622E38)
            int r3 = r3.getInteger(r5)
            if (r0 == 0) goto L_0x0125
            com.google.android.libraries.lens.view.av.f r0 = r6.f74916aL
            r0.getClass()
            r0.setVisibility(r2)
            com.google.android.libraries.lens.view.av.f r0 = r6.f74916aL
            r0.getClass()
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r5 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r5)
            long r4 = (long) r4
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r4)
            long r3 = (long) r3
            r0.setStartDelay(r3)
            goto L_0x012e
        L_0x0125:
            com.google.android.libraries.lens.view.av.f r0 = r6.f74916aL
            r0.getClass()
            r3 = 4
            r0.setVisibility(r3)
        L_0x012e:
            com.google.android.libraries.lens.view.filters.v r0 = r6.f74924aT
            r0.getClass()
            com.google.android.libraries.lens.view.filters.x r0 = r0.mo17754z()
            com.google.android.libraries.lens.view.filters.v r3 = r0.f71286a
            android.support.v4.app.FragmentManager r3 = r3.getChildFragmentManager()
            android.support.v4.app.cc r3 = r3.f634a
            java.lang.String r4 = "filter_settings_fragment"
            android.support.v4.app.Fragment r3 = r3.mo671c(r4)
            if (r3 != 0) goto L_0x0157
            boolean r4 = r8.mo30524a()
            if (r4 == 0) goto L_0x0157
            com.google.android.libraries.lens.view.filters.e.d r3 = r0.f71288c
            com.google.android.libraries.lens.view.filters.e.a.e r3 = r3.mo31203a()
        L_0x0153:
            r0.mo31451a(r8, r3)
            goto L_0x0176
        L_0x0157:
            if (r3 == 0) goto L_0x0176
            boolean r4 = r8.mo30524a()
            if (r4 != 0) goto L_0x0176
            android.support.v4.app.FragmentManager r3 = r3.getChildFragmentManager()
            android.support.v4.app.cc r3 = r3.f634a
            java.util.List r3 = r3.mo677i()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0176
            com.google.android.libraries.lens.view.filters.e.d r3 = r0.f71288c
            com.google.android.libraries.lens.view.filters.e.a.e r3 = r3.mo31203a()
            goto L_0x0153
        L_0x0176:
            com.google.android.libraries.lens.view.filters.e.a.j r0 = r0.f71289d
            if (r0 == 0) goto L_0x0193
            boolean r3 = r8.mo30527d()
            if (r3 == 0) goto L_0x0184
            r0.mo31046d()
            goto L_0x0193
        L_0x0184:
            boolean r3 = r8.mo30526c()
            if (r3 != 0) goto L_0x0190
            boolean r3 = r8.mo30525b()
            if (r3 == 0) goto L_0x0193
        L_0x0190:
            r0.mo31047e()
        L_0x0193:
            com.google.android.libraries.lens.view.flags.b r0 = r6.f74995o
            com.google.android.libraries.lens.view.flags.a r3 = com.google.android.libraries.lens.view.flags.C26239a.SELECTION_STATE_ENABLED
            boolean r0 = r0.mo31462g(r3)
            if (r0 == 0) goto L_0x01b5
            com.google.android.libraries.lens.view.main.dj r0 = new com.google.android.libraries.lens.view.main.dj
            r0.<init>(r6)
            r3 = 2131429299(0x7f0b07b3, float:1.8480267E38)
            android.support.v4.app.Fragment r0 = r6.mo32950o(r3, r0)
            com.google.android.libraries.lens.view.g.b r0 = (com.google.android.libraries.lens.view.p2107g.C26290b) r0
            r0.getClass()
            com.google.android.libraries.lens.view.g.e r0 = r0.mo17754z()
            com.google.android.libraries.lens.view.p2078at.C25495aa.m46954a(r0, r7, r8, r9)
        L_0x01b5:
            com.google.android.libraries.lens.view.main.bq r0 = r6.f74881C
            com.google.android.libraries.lens.view.p2078at.C25495aa.m46954a(r0, r7, r8, r9)
            com.google.android.libraries.lens.view.ai.ap r0 = r6.mo32957w()
            com.google.android.libraries.lens.view.frozenimage.b r3 = r6.mo32954s()
            boolean r3 = r3.mo31475f()
            com.google.android.libraries.lens.view.at.ac r4 = r0.f68523v
            boolean r4 = r4.mo30527d()
            if (r4 == 0) goto L_0x01d5
            boolean r4 = r8.mo30526c()
            if (r4 == 0) goto L_0x01d5
            goto L_0x01d6
        L_0x01d5:
            r1 = 0
        L_0x01d6:
            r0.f68523v = r8
            r0.f68521t = r3
            r0.mo30295d(r1)
            boolean r0 = r8.mo30526c()
            if (r0 != 0) goto L_0x01fc
            com.google.android.libraries.lens.view.h.e.an r0 = r6.f74936af
            com.google.android.libraries.lens.view.d.g r1 = r0.f73043a
            java.lang.Object r1 = r1.mo3842a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x01fc
            com.google.android.libraries.lens.view.d.g r0 = r0.f73043a
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.mo5708l(r1)
        L_0x01fc:
            com.google.common.base.ax r0 = r6.f74893O
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x020f
            com.google.common.base.ax r0 = r6.f74893O
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.libraries.lens.view.at.ab r0 = (com.google.android.libraries.lens.view.p2078at.C25496ab) r0
            com.google.android.libraries.lens.view.p2078at.C25495aa.m46954a(r0, r7, r8, r9)
        L_0x020f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.main.C27384dt.mo30522kY(com.google.android.libraries.lens.view.at.ac, com.google.android.libraries.lens.view.at.ac, com.google.android.libraries.lens.view.at.p):void");
    }

    /* renamed from: kZ */
    public final void mo30523kZ() {
        this.f74984d.f74642b = false;
        m50975at(false);
        this.f74928aX = null;
        mo32923J();
        if (mo32944af()) {
            if (this.f74949as.mo56113h()) {
                mo32952q().mo31225f(((C25980d) this.f74949as.mo56107c()).mo31199b(), false);
                this.f74949as = C58836b.f156633a;
            }
            C26422i t = mo32955t();
            t.getClass();
            C26299ac a = t.mo17754z();
            View view = a.f71495c.getView();
            view.getClass();
            view.animate().cancel();
            view.setVisibility(0);
            view.setAlpha(1.0f);
            GalleryRecyclerView galleryRecyclerView = a.f71474F;
            galleryRecyclerView.getClass();
            galleryRecyclerView.setAlpha(0.0f);
            a.f71474F.animate().alpha(1.0f).setDuration(250).start();
            if (a.mo31503c() == null) {
                a.mo31508h(true);
            }
            a.f71505m.mo31515a();
            if (a.f71500h.mo33017b()) {
                a.mo31510j();
                FilterCarouselView filterCarouselView = (FilterCarouselView) a.f71495c.requireView().findViewById(R.id.filter_carousel_view);
                if (filterCarouselView != null) {
                    C25961q a2 = filterCarouselView.mo17754z();
                    C25994i iVar = a.f71510r.f70642a;
                    a2.mo31146h(iVar.mo31208a(iVar.f70649b));
                }
            }
            C25582f fVar = this.f74916aL;
            if (fVar != null) {
                fVar.setVisibility(0);
            }
            C26022s q = mo32952q();
            C25935c cVar = q.f70725n;
            if (cVar != null) {
                C26012i a3 = cVar.mo17754z();
                a3.f70692q = true;
                a3.mo31219e();
            }
            FilterPreview filterPreview = q.f70728q;
            if (filterPreview != null) {
                filterPreview.mo30988a();
            }
        }
    }

    /* renamed from: l */
    public final void mo32862l(C56306df dfVar, boolean z) {
        if (this.f74923aS != null) {
            mo32952q().mo31225f(dfVar, z);
            C26234v vVar = this.f74924aT;
            vVar.getClass();
            C26236x a = vVar.mo17754z();
            C25497ac acVar = this.f74957ba;
            if (acVar == null) {
                acVar = C25497ac.NONE;
            }
            a.mo31451a(acVar, this.f74892N.mo31203a());
            mo32940ab();
        }
    }

    /* renamed from: m */
    public final void mo32863m(String str) {
        if (!mo32946ah()) {
            ((C59052c) ((C59052c) f74877a.mo56226d()).mo56372aa(49779)).mo56389s("Ignoring onShowSnackbar in state: %s", this.f74908aD);
        } else {
            mo30544X(str, -1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        if (r0 != 7) goto L_0x0097;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32864n(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.mo32946ah()
            if (r0 != 0) goto L_0x001f
            com.google.common.f.e r6 = f74877a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            r0 = 49776(0xc270, float:6.9751E-41)
            com.google.common.f.x r6 = r6.mo56372aa(r0)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            java.lang.String r0 = "Ignoring onPanelStateChanged in state: %s"
            com.google.android.libraries.lens.view.main.eb r1 = r5.f74908aD
            r6.mo56389s(r0, r1)
            return
        L_0x001f:
            com.google.android.libraries.lens.view.main.ai r0 = r5.f74987g
            android.support.v4.app.FragmentManager r0 = r0.getChildFragmentManager()
            boolean r0 = r0.mo461ab()
            if (r0 == 0) goto L_0x003a
            com.google.common.f.e r6 = f74877a
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r0 = "Ignoring panel change after state saved"
            r1 = 49775(0xc26f, float:6.975E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x003a:
            r5.mo32925L()
            com.google.android.libraries.lens.view.main.eb r0 = com.google.android.libraries.lens.view.main.C27394eb.UNINITIALIZED
            com.google.android.libraries.lens.view.at.z r0 = com.google.android.libraries.lens.view.p2078at.C25543z.POSTCAPTURE
            int r6 = r6 + -1
            r0 = 1
            if (r6 == r0) goto L_0x00b4
            r1 = 2
            if (r6 == r1) goto L_0x00a5
            r2 = 3
            if (r6 == r2) goto L_0x00a1
            com.google.android.libraries.lens.view.at.ac r6 = r5.f74957ba
            boolean r6 = r6.mo30525b()
            if (r6 == 0) goto L_0x009d
            boolean r6 = r5.f74976bt
            if (r6 != 0) goto L_0x009d
            com.google.android.libraries.lens.view.filters.e.d r6 = r5.f74892N
            com.google.android.libraries.lens.view.filters.e.i r6 = r6.f70642a
            com.google.android.libraries.lens.view.filters.e.a.d r6 = r6.f70649b
            com.google.android.libraries.lens.view.filters.e.a.d r3 = com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d.TRANSLATE
            r4 = 4
            if (r6 != r3) goto L_0x0097
            com.google.android.libraries.lens.view.filters.translation.ax r6 = r5.f74888J
            boolean r3 = r6.mo31265t()
            if (r3 != 0) goto L_0x0070
        L_0x006b:
            int r0 = r6.mo31268w()
            goto L_0x0098
        L_0x0070:
            com.google.common.base.ax r3 = r6.f70791E
            boolean r3 = r3.mo56113h()
            if (r3 != 0) goto L_0x0079
            goto L_0x0098
        L_0x0079:
            com.google.bp.f.b.a.cz r0 = com.google.p4242bp.p4257f.p4260b.p4261a.C56299cz.UNKNOWN
            com.google.android.libraries.lens.view.am.c r0 = com.google.android.libraries.lens.view.p2069am.C25327c.UNKNOWN
            com.google.common.base.ax r0 = r6.f70791E
            java.lang.Object r0 = r0.mo56107c()
            com.google.bp.f.b.a.cz r0 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56299cz) r0
            int r0 = r0.ordinal()
            if (r0 == r1) goto L_0x0095
            r1 = 5
            if (r0 == r1) goto L_0x0095
            r1 = 6
            if (r0 == r1) goto L_0x006b
            r1 = 7
            if (r0 == r1) goto L_0x006b
            goto L_0x0097
        L_0x0095:
            r0 = 3
            goto L_0x0098
        L_0x0097:
            r0 = 4
        L_0x0098:
            com.google.android.libraries.lens.view.infopanel.a.p r6 = r5.f75005y
            r6.mo32446n(r0)
        L_0x009d:
            r5.mo32923J()
            return
        L_0x00a1:
            r5.m50976au()
            return
        L_0x00a5:
            com.google.android.libraries.lens.view.infopanel.a.p r6 = r5.f75005y
            android.content.Context r0 = r5.f75000t
            r1 = 2132088898(0x7f151842, float:1.9818093E38)
            java.lang.String r0 = r0.getString(r1)
            r6.mo32444k(r0)
            return
        L_0x00b4:
            com.google.android.libraries.lens.view.infopanel.a.p r6 = r5.f75005y
            r6.mo32442i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.main.C27384dt.mo32864n(int):void");
    }

    /* renamed from: o */
    public final Fragment mo32950o(int i, C58881cr crVar) {
        Fragment b = this.f74987g.getChildFragmentManager().f634a.mo670b(i);
        if (b != null) {
            return b;
        }
        Fragment fragment = (Fragment) crVar.mo6453a();
        C0154a aVar = new C0154a(this.f74987g.getChildFragmentManager());
        aVar.mo511h(i, fragment, (String) null, 1);
        aVar.mo509f();
        return fragment;
    }

    /* renamed from: p */
    public final Fragment mo32951p(int i, String str, C58881cr crVar) {
        Fragment c = this.f74987g.getChildFragmentManager().f634a.mo671c(str);
        if (c != null) {
            return c;
        }
        Fragment fragment = (Fragment) crVar.mo6453a();
        C0154a aVar = new C0154a(this.f74987g.getChildFragmentManager());
        aVar.mo511h(i, fragment, str, 1);
        aVar.mo509f();
        return fragment;
    }

    /* renamed from: r */
    public final C25909ap mo32953r() {
        C25901ah ahVar = (C25901ah) this.f74987g.getChildFragmentManager().f634a.mo671c("lvf_buttons_fragment_tag");
        ahVar.getClass();
        return ahVar.mo17754z();
    }

    /* renamed from: t */
    public final C26422i mo32955t() {
        return (C26422i) this.f74987g.getChildFragmentManager().f634a.mo671c("gallery_fragment");
    }

    /* renamed from: x */
    public final C25190b mo32958x() {
        return (C25190b) this.f74987g.getChildFragmentManager().f634a.mo670b(R.id.postcapture_thinking_gleams_container);
    }

    /* renamed from: y */
    public final C27679e mo32959y() {
        C27677c cVar = (C27677c) mo32951p(R.id.lens_coordinator_container, "ris_fragment", new C27339cb(this));
        cVar.getClass();
        return cVar.mo17754z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final C47392e mo32960z(C26957t tVar) {
        try {
            Intent parseUri = Intent.parseUri(tVar.f73474a, 0);
            parseUri.setAction("android.intent.action.VIEW");
            this.f74883E.mo30556f(parseUri);
        } catch (URISyntaxException unused) {
            Toast.makeText(this.f74900V, R.string.lens_failed_to_open_3rd_party_content, 1).show();
        }
        return C47392e.f123115a;
    }

    /* renamed from: q */
    public final C26022s mo32952q() {
        C26019p pVar = this.f74923aS;
        pVar.getClass();
        return pVar.mo17754z();
    }

    /* renamed from: s */
    public final C26270b mo32954s() {
        C26272d dVar = this.f74922aR;
        dVar.getClass();
        return dVar.mo17754z().f71426b;
    }

    /* renamed from: u */
    public final C26505cj mo32956u() {
        C26510co coVar = this.f74919aO;
        coVar.getClass();
        return coVar.mo17754z().f72338e;
    }

    /* renamed from: w */
    public final C25155ap mo32957w() {
        C25149aj ajVar = this.f74921aQ;
        ajVar.getClass();
        return ajVar.mo17754z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo32917C() {
        C27653r rVar = this.f74960bd;
        rVar.getClass();
        rVar.mo33142a();
        mo32949ak(C27394eb.STOPPED);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bc  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32937Y(java.lang.String r9) {
        /*
            r8 = this;
            com.google.android.libraries.lens.view.main.bq r0 = r8.f74881C
            boolean r1 = r0.f74765K
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0014
            com.google.android.libraries.lens.view.feedback.b r0 = new com.google.android.libraries.lens.view.feedback.b
            r0.<init>()
            com.google.android.libraries.lens.view.feedback.s r0 = r0.mo30957a()
            goto L_0x017b
        L_0x0014:
            com.google.android.libraries.lens.view.infopanel.a.p r1 = r0.f74784ad
            com.google.android.libraries.lens.view.d.g r1 = r1.f73571e
            java.lang.Object r1 = r1.mo3842a()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            com.google.android.libraries.lens.view.main.av r5 = com.google.android.libraries.lens.view.main.C27305av.f74718a
            com.google.common.base.ax r1 = r1.mo56106b(r5)
            java.lang.String r5 = ""
            java.lang.Object r1 = r1.mo56109e(r5)
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.libraries.lens.view.feedback.b r5 = new com.google.android.libraries.lens.view.feedback.b
            r5.<init>()
            com.google.android.libraries.lens.view.main.ae r6 = r0.f74816u
            com.google.common.base.ax r6 = r6.mo32825a()
            com.google.android.libraries.lens.view.main.n r7 = com.google.android.libraries.lens.view.main.C27434n.f75078a
            com.google.common.base.ax r6 = r6.mo56106b(r7)
            java.lang.Object r6 = r6.mo56111f()
            com.google.android.libraries.lens.e.y r6 = (com.google.android.libraries.lens.p2014e.C24233y) r6
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90833j(r6)
            r5.f70128a = r6
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r3 != r6) goto L_0x0050
            r1 = r4
        L_0x0050:
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r1)
            r5.f70133f = r1
            com.google.android.libraries.lens.view.main.ae r1 = r0.f74816u
            com.google.android.libraries.lens.view.at.p r6 = r1.f74680m
            if (r6 != 0) goto L_0x0060
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            goto L_0x00eb
        L_0x0060:
            com.google.android.libraries.lens.view.au.o r6 = r1.f74670c
            com.google.android.libraries.lens.view.au.s r6 = r6.mo30594b()
            java.lang.Object r6 = r6.mo30656d()
            com.google.common.base.ax r6 = (com.google.common.base.C58833ax) r6
            com.google.android.libraries.lens.view.main.v r7 = com.google.android.libraries.lens.view.main.C27442v.f75090a
            com.google.common.base.ax r6 = r6.mo56106b(r7)
            com.google.android.libraries.lens.view.au.af r1 = r1.f74669b
            com.google.android.libraries.lens.view.au.ac r1 = r1.f69551a
            java.lang.Object r1 = r1.mo30656d()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            boolean r7 = r1.mo56113h()
            if (r7 == 0) goto L_0x009f
            java.lang.Object r7 = r1.mo56107c()
            com.google.common.util.concurrent.cx r7 = (com.google.common.util.concurrent.C60870cx) r7
            boolean r7 = r7.isDone()
            if (r7 == 0) goto L_0x009f
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ ExecutionException -> 0x009f }
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1     // Catch:{ ExecutionException -> 0x009f }
            java.lang.Object r1 = com.google.common.util.concurrent.C60856cj.m92909r(r1)     // Catch:{ ExecutionException -> 0x009f }
            com.google.android.libraries.lens.view.au.j r1 = (com.google.android.libraries.lens.view.p2081au.C25560j) r1     // Catch:{ ExecutionException -> 0x009f }
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)     // Catch:{ ExecutionException -> 0x009f }
            goto L_0x00a1
        L_0x009f:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x00a1:
            com.google.common.base.ax r1 = r6.mo56105a(r1)
            boolean r6 = r1.mo56113h()
            if (r6 != 0) goto L_0x00bc
            com.google.common.f.a.d r1 = com.google.android.libraries.lens.view.main.C27288ae.f74662a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r6 = "No image found for the feedback report"
            r7 = 49688(0xc218, float:6.9628E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r7)).mo56386p(r6)
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            goto L_0x00eb
        L_0x00bc:
            java.lang.Object r6 = r1.mo56107c()
            com.google.android.libraries.lens.view.au.j r6 = (com.google.android.libraries.lens.view.p2081au.C25560j) r6
            com.google.android.libraries.lens.e.s r6 = r6.mo30614a()
            android.graphics.Bitmap r6 = r6.mo29707c()
            boolean r7 = r6.isMutable()
            if (r7 == 0) goto L_0x00d4
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r6)
        L_0x00d4:
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.lens.view.au.j r1 = (com.google.android.libraries.lens.view.p2081au.C25560j) r1
            com.google.android.libraries.lens.e.s r1 = r1.mo30614a()
            com.google.android.libraries.lens.e.r r1 = r1.mo29709e()
            com.google.android.libraries.lens.view.feedback.a r7 = new com.google.android.libraries.lens.view.feedback.a
            r7.<init>(r6, r1)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r7)
        L_0x00eb:
            java.lang.Object r1 = r1.mo56111f()
            com.google.android.libraries.lens.view.feedback.q r1 = (com.google.android.libraries.lens.view.feedback.C25827q) r1
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r1)
            r5.f70129b = r1
            com.google.android.libraries.lens.view.au.y r1 = r0.f74819x
            com.google.android.libraries.lens.view.au.s r1 = r1.mo30606b()
            java.lang.Object r1 = r1.mo30656d()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x0136
            com.google.android.libraries.lens.view.au.y r1 = r0.f74819x
            com.google.android.libraries.lens.view.au.s r1 = r1.mo30606b()
            java.lang.Object r1 = r1.mo30656d()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.lens.view.au.x r1 = (com.google.android.libraries.lens.view.p2081au.C25574x) r1
            com.google.android.libraries.lens.view.session.bm r1 = r1.mo30644a()
            com.google.android.libraries.lens.e.w r6 = r1.mo33256c()
            com.google.android.libraries.lens.e.w r7 = com.google.android.libraries.lens.p2014e.C24231w.RETICLE_SELECTION
            if (r6 != r7) goto L_0x0130
            int r1 = r1.mo33260h()
            r6 = 3
            if (r1 != r6) goto L_0x0130
            r1 = 1
            goto L_0x0131
        L_0x0130:
            r1 = 0
        L_0x0131:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x0137
        L_0x0136:
            r1 = r4
        L_0x0137:
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r1)
            r5.f70130c = r1
            com.google.android.libraries.lens.view.gleam.cj r1 = r0.f74767M
            boolean r1 = r1.mo31776l()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r1)
            r5.f70131d = r1
            com.google.android.libraries.lens.view.gleam.cj r1 = r0.f74767M
            com.google.common.base.ax r1 = r1.mo31769e()
            java.lang.Object r1 = r1.mo56111f()
            android.graphics.RectF r1 = (android.graphics.RectF) r1
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r1)
            r5.f70132e = r1
            com.google.android.libraries.lens.view.main.ae r0 = r0.f74816u
            com.google.common.base.ax r0 = r0.mo32825a()
            com.google.android.libraries.lens.view.main.j r1 = com.google.android.libraries.lens.view.main.C27430j.f75073a
            com.google.common.base.ax r0 = r0.mo56106b(r1)
            java.lang.Object r0 = r0.mo56111f()
            com.google.android.libraries.lens.view.au.n r0 = (com.google.android.libraries.lens.view.p2081au.C25564n) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
            r5.f70134g = r0
            com.google.android.libraries.lens.view.feedback.s r0 = r5.mo30957a()
        L_0x017b:
            com.google.common.base.ax r1 = r0.mo30962c()
            boolean r1 = r1.mo56113h()
            com.google.apps.tiktok.account.AccountId r5 = r8.f74989i
            com.google.android.libraries.lens.view.feedback.f r1 = com.google.android.libraries.lens.view.feedback.C25823n.m47649a(r5, r1)
            com.google.android.libraries.lens.view.main.ai r5 = r8.f74987g
            android.support.v4.app.FragmentManager r5 = r5.getChildFragmentManager()
            java.lang.String r6 = "review_feedback_fragment"
            r1.showNow(r5, r6)
            com.google.android.libraries.lens.view.feedback.n r1 = r1.mo17754z()
            android.view.ViewGroup r5 = r8.f74912aH
            r1.f70172j = r9
            r1.f70173k = r0
            android.app.Activity r9 = r1.f70166d
            android.view.Window r9 = r9.getWindow()
            com.google.common.util.concurrent.cx r9 = com.google.android.libraries.lens.view.feedback.C25809ab.m47621b(r9, r5)
            com.google.common.base.ax r5 = r0.mo30968h()
            java.lang.Object r5 = r5.mo56111f()
            com.google.android.libraries.lens.view.au.n r5 = (com.google.android.libraries.lens.view.p2081au.C25564n) r5
            com.google.android.libraries.lens.view.au.n r6 = com.google.android.libraries.lens.view.p2081au.C25564n.ONLINE
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x01c6
            com.google.at.g.a.a.r r0 = com.google.p4017at.p4056g.p4057a.p4058a.C54066r.f141866d
            com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse r5 = new com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse
            r5.<init>(r4, r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r5)
            goto L_0x01f3
        L_0x01c6:
            com.google.common.base.ax r0 = r0.mo30962c()
            com.google.android.libraries.lens.view.feedback.l r5 = com.google.android.libraries.lens.view.feedback.C25821l.f70161a
            com.google.common.base.ax r0 = r0.mo56106b(r5)
            java.lang.Object r0 = r0.mo56111f()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 != 0) goto L_0x01e4
            com.google.at.g.a.a.r r0 = com.google.p4017at.p4056g.p4057a.p4058a.C54066r.f141866d
            com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse r5 = new com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse
            r5.<init>(r4, r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r5)
            goto L_0x01f3
        L_0x01e4:
            com.google.common.util.concurrent.da r5 = r1.f70169g
            com.google.android.libraries.lens.view.feedback.m r6 = new com.google.android.libraries.lens.view.feedback.m
            r6.<init>(r0)
            java.util.concurrent.Callable r0 = com.google.apps.tiktok.tracing.C47810es.m84978r(r6)
            com.google.common.util.concurrent.cx r0 = r5.mo19399b(r0)
        L_0x01f3:
            com.google.apps.tiktok.concurrent.futuresmixin.e r5 = r1.f70168f
            r6 = 2
            com.google.common.util.concurrent.cx[] r6 = new com.google.common.util.concurrent.C60870cx[r6]
            r6[r2] = r9
            r6[r3] = r0
            com.google.common.util.concurrent.cf r2 = com.google.common.util.concurrent.C60856cj.m92895d(r6)
            com.google.android.libraries.lens.view.feedback.j r3 = new com.google.android.libraries.lens.view.feedback.j
            r3.<init>(r9, r0)
            java.util.concurrent.Callable r9 = com.google.apps.tiktok.tracing.C47810es.m84978r(r3)
            com.google.common.util.concurrent.da r0 = r1.f70170h
            com.google.common.util.concurrent.cx r9 = r2.mo57334a(r9, r0)
            com.google.apps.tiktok.concurrent.futuresmixin.d r0 = new com.google.apps.tiktok.concurrent.futuresmixin.d
            r0.<init>(r9)
            com.google.apps.tiktok.concurrent.futuresmixin.f r9 = r1.f70174l
            com.google.common.util.concurrent.cx r0 = r0.f121541a
            r5.mo50428h(r0, r4, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.main.C27384dt.mo32937Y(java.lang.String):void");
    }
}
