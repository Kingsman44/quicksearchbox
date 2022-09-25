package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6371a.C81519a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6375d.C81553a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81569l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81819l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81969af;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81970ag;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81979ap;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81980aq;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81984au;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81993bc;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.C82041a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.C82042b;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.C82043c;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.nga.shared.p6417x.C83369s;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.animation.impl.C147783f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68227m;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.az */
/* compiled from: PG */
public final class C82071az implements C82041a {

    /* renamed from: a */
    public static final C59071e f224305a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.az");

    /* renamed from: A */
    public final ViewGroup f224306A;

    /* renamed from: B */
    public final ViewGroup f224307B;

    /* renamed from: C */
    public final ViewGroup f224308C;

    /* renamed from: D */
    public final View f224309D;

    /* renamed from: E */
    public final C81979ap f224310E;

    /* renamed from: F */
    private final C22871g f224311F;

    /* renamed from: G */
    private final C81819l f224312G;

    /* renamed from: H */
    private final C83358h f224313H;

    /* renamed from: I */
    private final C81984au f224314I;

    /* renamed from: J */
    private final Optional f224315J;

    /* renamed from: K */
    private final AtomicReference f224316K = new AtomicReference(C60866ct.f164955a);

    /* renamed from: L */
    private final View.OnLayoutChangeListener f224317L;

    /* renamed from: M */
    private final C83363m f224318M = new C83363m();

    /* renamed from: N */
    private final C83358h f224319N;

    /* renamed from: O */
    private final C83358h f224320O;

    /* renamed from: P */
    private final C83358h f224321P;

    /* renamed from: Q */
    private final C83358h f224322Q;

    /* renamed from: R */
    private final C83358h f224323R;

    /* renamed from: S */
    private C60870cx f224324S = C60856cj.m92898g();

    /* renamed from: b */
    public final C83357g f224325b = new C83361k(false, C81519a.class);

    /* renamed from: c */
    public final C83357g f224326c = new C83361k(false, C81519a.class);

    /* renamed from: d */
    public final GestureAwareLayout f224327d;

    /* renamed from: e */
    public final View f224328e;

    /* renamed from: f */
    public final View f224329f;

    /* renamed from: g */
    public final View f224330g;

    /* renamed from: h */
    public final View f224331h;

    /* renamed from: i */
    public final View f224332i;

    /* renamed from: j */
    public final ImageView f224333j;

    /* renamed from: k */
    public final C22871g f224334k;

    /* renamed from: l */
    public final Context f224335l;

    /* renamed from: m */
    public final C82084bl f224336m;

    /* renamed from: n */
    public final C82074bb f224337n;

    /* renamed from: o */
    public final C82100p f224338o;

    /* renamed from: p */
    public final C81564g f224339p;

    /* renamed from: q */
    public final C81993bc f224340q;

    /* renamed from: r */
    public final Supplier f224341r;

    /* renamed from: s */
    public final Supplier f224342s;

    /* renamed from: t */
    public final C82043c f224343t;

    /* renamed from: u */
    public final C82043c f224344u;

    /* renamed from: v */
    public final C82043c f224345v;

    /* renamed from: w */
    public final C82043c f224346w;

    /* renamed from: x */
    public final C82043c f224347x;

    /* renamed from: y */
    public final ViewGroup f224348y;

    /* renamed from: z */
    public final ViewGroup f224349z;

    public C82071az(Context context, C81569l lVar, C82085bm bmVar, C82101q qVar, C82075bc bcVar, C22871g gVar, C22871g gVar2, Map map, C81564g gVar3, C81819l lVar2, C81553a aVar, C81984au auVar, C81993bc bcVar2, Optional optional) {
        Context context2 = context;
        C81569l lVar3 = lVar;
        C82085bm bmVar2 = bmVar;
        C22871g gVar4 = gVar;
        C22871g gVar5 = gVar2;
        Map map2 = map;
        GestureAwareLayout gestureAwareLayout = (GestureAwareLayout) LayoutInflater.from(context).cloneInContext(context2).inflate(R.layout.nga_shelf_background_view, (ViewGroup) null);
        this.f224327d = gestureAwareLayout;
        this.f224335l = context2;
        this.f224311F = gVar5;
        this.f224339p = gVar3;
        this.f224314I = auVar;
        this.f224340q = bcVar2;
        this.f224315J = optional;
        View findViewById = gestureAwareLayout.findViewById(R.id.nga_assist_shelf_background);
        this.f224328e = findViewById;
        View findViewById2 = gestureAwareLayout.findViewById(R.id.nga_assist_shelf_shadow);
        View findViewById3 = gestureAwareLayout.findViewById(R.id.nga_assist_shelf_shadow_top);
        this.f224329f = findViewById3;
        View findViewById4 = gestureAwareLayout.findViewById(R.id.nga_assist_shelf_shadow_middle);
        this.f224330g = findViewById4;
        View findViewById5 = gestureAwareLayout.findViewById(R.id.nga_assist_shelf_shadow_bottom);
        this.f224331h = findViewById5;
        View findViewById6 = gestureAwareLayout.findViewById(R.id.nga_assist_navbar_background);
        this.f224332i = findViewById6;
        this.f224333j = (ImageView) gestureAwareLayout.findViewById(R.id.nga_assist_shelf_pill);
        this.f224309D = gestureAwareLayout.findViewById(R.id.nga_assist_shelf_navbar_guideline);
        ViewGroup viewGroup = (ViewGroup) gestureAwareLayout.findViewById(R.id.nga_assist_single_content_container);
        this.f224349z = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) gestureAwareLayout.findViewById(R.id.nga_assist_double_content_container);
        this.f224306A = viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) gestureAwareLayout.findViewById(R.id.nga_assist_top_content_container);
        this.f224307B = viewGroup3;
        ViewGroup viewGroup4 = viewGroup2;
        ViewGroup viewGroup5 = (ViewGroup) gestureAwareLayout.findViewById(R.id.nga_assist_above_shelf_content_container);
        this.f224348y = viewGroup5;
        ViewGroup viewGroup6 = viewGroup5;
        this.f224308C = (ViewGroup) gestureAwareLayout.findViewById(R.id.nga_assist_ambient_visual_search_gleams_container);
        C82061ap apVar = new C82061ap(this, gVar5);
        findViewById.getClass();
        findViewById2.getClass();
        findViewById6.getClass();
        C147783f fVar = (C147783f) ((C68221g) qVar.f224465a).f184583a;
        fVar.getClass();
        ViewGroup viewGroup7 = viewGroup4;
        ViewGroup viewGroup8 = viewGroup6;
        ViewGroup viewGroup9 = viewGroup;
        View view = findViewById5;
        View view2 = findViewById4;
        this.f224338o = new C82100p(findViewById, findViewById2, findViewById6, apVar, fVar);
        this.f224334k = gVar4;
        this.f224312G = lVar2;
        this.f224310E = C81980aq.m130228a(context);
        C82043c cVar = (C82043c) map2.get(C82042b.HERO_CHIP);
        cVar.getClass();
        this.f224343t = cVar;
        C82043c cVar2 = (C82043c) map2.get(C82042b.SINGLE_CONTENT);
        cVar2.getClass();
        this.f224344u = cVar2;
        C82043c cVar3 = (C82043c) map2.get(C82042b.DOUBLE_CONTENT);
        cVar3.getClass();
        this.f224345v = cVar3;
        C82043c cVar4 = (C82043c) map2.get(C82042b.TOP_CONTENT);
        cVar4.getClass();
        this.f224346w = cVar4;
        C82043c cVar5 = (C82043c) map2.get(C82042b.AMBIENT_VISUAL_SEARCH_GLEAM);
        cVar5.getClass();
        this.f224347x = cVar5;
        C83358h i = C83349aj.m132654i(lVar2.mo75159l(), lVar2.mo75165r(), lVar3.f223133a, lVar2.mo75154g(), C82062aq.f224296a);
        this.f224321P = i;
        C83358h j = C83349aj.m132655j(lVar2.mo75159l(), lVar2.mo75154g(), i, C82063ar.f224297a);
        this.f224313H = j;
        this.f224320O = C83349aj.m132658m(lVar2.mo75154g(), C82064as.f224298a);
        gestureAwareLayout.getClass();
        findViewById.getClass();
        findViewById3.getClass();
        view2.getClass();
        view.getClass();
        viewGroup8.getClass();
        viewGroup9.getClass();
        viewGroup7.getClass();
        viewGroup3.getClass();
        Context context3 = (Context) ((C68221g) bmVar2.f224423a).f184583a;
        context3.getClass();
        C81819l lVar4 = (C81819l) ((C68221g) bmVar2.f224424b).f184583a;
        lVar4.getClass();
        Set c = ((C68227m) bmVar2.f224425c).mo17428b();
        c.getClass();
        C22871g gVar6 = (C22871g) ((C68221g) bmVar2.f224426d).f184583a;
        gVar6.getClass();
        C147783f fVar2 = (C147783f) ((C68221g) bmVar2.f224427e).f184583a;
        fVar2.getClass();
        View view3 = findViewById;
        C82084bl blVar = r8;
        C82084bl blVar2 = new C82084bl(gestureAwareLayout, view3, findViewById3, view2, view, viewGroup8, viewGroup9, viewGroup7, viewGroup3, context3, lVar4, c, gVar6, fVar2);
        this.f224336m = blVar;
        C81564g gVar7 = (C81564g) ((C68221g) bcVar.f224369a).f184583a;
        gVar7.getClass();
        this.f224337n = new C82074bb(blVar, gVar7);
        this.f224341r = new C82065at(this);
        this.f224342s = C82066au.f224300a;
        this.f224317L = new C82067av(this, gVar4);
        this.f224319N = C83349aj.m132656k(lVar2.mo75165r(), j, C82104t.f224468a);
        this.f224322Q = C83349aj.m132656k(aVar.mo75136a(), lVar3.f223138f, C82105u.f224469a);
        this.f224323R = C83349aj.m132655j(lVar2.mo75150c(), lVar2.mo75168u(), lVar3.f223138f, C82106v.f224470a);
    }

    /* renamed from: c */
    public static Drawable m130345c(boolean z, boolean z2, int i) {
        if (z) {
            if (i - 1 == 1) {
                return C81970ag.m130212b(C58485gu.m89848p(C81969af.m130208c("#003C4043", 0.0f), C81969af.m130208c("#293C4043", 0.73f), C81969af.m130208c("#293C4043", 1.0f)));
            }
            if (!z2) {
                return null;
            }
            if (i == 1) {
                return C81970ag.m130213c("#003C4043", "#003C4043");
            }
            return C81970ag.m130213c("#293C4043", "#293C4043");
        } else if (i - 1 == 1) {
            return C81970ag.m130212b(C58485gu.m89848p(C81969af.m130208c("#00000000", 0.0f), C81969af.m130208c("#1A000000", 0.73f), C81969af.m130208c("#1A000000", 1.0f)));
        } else {
            if (!z2) {
                return null;
            }
            if (i == 1) {
                return C81970ag.m130213c("#00000000", "#00000000");
            }
            return C81970ag.m130213c("#1A000000", "#1A000000");
        }
    }

    /* renamed from: a */
    public final RectF mo75196a() {
        return new RectF((float) this.f224328e.getLeft(), (float) this.f224328e.getTop(), (float) this.f224328e.getRight(), (float) this.f224328e.getBottom());
    }

    /* renamed from: b */
    public final C83358h mo75477b() {
        return this.f224325b;
    }

    /* renamed from: d */
    public final void mo75129d() {
        this.f224334k.mo28212l("[NGA] Set Shelf Pill VE id", new C82107w(this));
        this.f224327d.addOnLayoutChangeListener(this.f224317L);
        ((C60870cx) this.f224316K.getAndSet(this.f224334k.mo28207g("[NGA] add shelfViewProviders", new C82069ax(this)))).cancel(false);
        this.f224318M.mo76663c(this.f224319N, new C83369s(this.f224334k, "swipeConfigChanged", new C82047ab(this)));
        this.f224318M.mo76663c(this.f224312G.mo75168u(), new C83369s(this.f224334k, "windowInsetsReceiver", new C82048ac(this)));
        this.f224318M.mo76663c(this.f224336m.f224406f, new C82050ae(this));
        C83363m mVar = this.f224318M;
        C83358h hVar = this.f224313H;
        C22871g gVar = this.f224334k;
        C82100p pVar = this.f224338o;
        Objects.requireNonNull(pVar);
        mVar.mo76663c(hVar, new C83369s(gVar, "shelfBackgroundState", new C82051af(pVar)));
        C83363m mVar2 = this.f224318M;
        C83358h hVar2 = this.f224320O;
        C22871g gVar2 = this.f224334k;
        C82084bl blVar = this.f224336m;
        Objects.requireNonNull(blVar);
        mVar2.mo76663c(hVar2, new C83369s(gVar2, "applySizeChangeImmediately", new C82052ag(blVar)));
        this.f224318M.mo76663c(this.f224314I.mo75426a(R.string.nga_assist_root_view_label), new C82053ah(this));
        C83363m mVar3 = this.f224318M;
        C83358h hVar3 = this.f224321P;
        C22871g gVar3 = this.f224334k;
        C82084bl blVar2 = this.f224336m;
        Objects.requireNonNull(blVar2);
        mVar3.mo76663c(hVar3, new C83369s(gVar3, "shelfSize", new C82054ai(blVar2)));
        this.f224318M.mo76663c(this.f224322Q, new C83369s(this.f224334k, "shadowConfig", new C82055aj(this)));
        this.f224318M.mo76663c(this.f224312G.mo75155h(), new C83369s(this.f224334k, "handleConfigAction", new C82056ak(this)));
        this.f224318M.mo76663c(this.f224323R, new C83369s(this.f224334k, "applyLayoutConfig", new C82108x(this)));
        C60870cx cxVar = (C60870cx) this.f224315J.map(new C82109y(this)).orElse(C60856cj.m92898g());
        this.f224324S = cxVar;
        C90875ai.m148465b(new C82110z(this), cxVar, this.f224311F, "[NGA] loadingPillFutureCallback").mo85223a(C82046aa.f224279a);
    }

    /* renamed from: e */
    public final void mo75130e() {
        this.f224327d.removeOnLayoutChangeListener(this.f224317L);
        ((C60870cx) this.f224316K.get()).cancel(false);
        this.f224318M.mo76661a();
        this.f224324S.cancel(false);
    }

    /* renamed from: m */
    public final View mo75209m() {
        return this.f224327d;
    }
}
