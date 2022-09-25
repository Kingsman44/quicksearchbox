package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Message;
import android.support.p033v7.widget.C0646fh;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.core.content.C1878d;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.assistant.shared.p.e;
import com.google.android.apps.gsa.assistant.shared.p.f;
import com.google.android.apps.gsa.assistant.shared.p.h;
import com.google.android.apps.gsa.assistant.shared.p.k;
import com.google.android.apps.gsa.assistant.shared.p.l;
import com.google.android.apps.gsa.assistant.shared.p.m;
import com.google.android.apps.gsa.assistant.shared.p5826p.C73896b;
import com.google.android.apps.gsa.assistant.shared.p5826p.C73897c;
import com.google.android.apps.gsa.assistant.shared.p5826p.C73900j;
import com.google.android.apps.gsa.opa.C83573ad;
import com.google.android.apps.gsa.opa.p6448i.C83709a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87564g;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107658ar;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107662av;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.p8354d.C108523b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a.C111806n;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112685aw;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112694be;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112705m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8525e.p8529c.C111771e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m.C112794ct;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.C113023i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8568a.C112990a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8568a.C112991b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8568a.C112996g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8568a.C112997h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8569b.C112999a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113191cv;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8573r.C113236d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113369dj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113374do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113375dp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8578b.C113275a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.C113428a;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9232a.C121491a;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9234c.C121525n;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9235d.C121535i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.p4553a.C59450aa;
import dagger.C68214a;
import dagger.p5294a.C68221g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.bm */
/* compiled from: PG */
public final class C113558bm implements m, C113375dp, C112991b {

    /* renamed from: A */
    private static final int f314370A = R.id.finish_setup_bar_v2;

    /* renamed from: a */
    public static final C59071e f314371a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.ui.bm");

    /* renamed from: y */
    private static final C121537f f314372y = C121537f.m200840b("Tapas/TapasUiControllerImpl", C121511c.f337208a);

    /* renamed from: z */
    private static final int f314373z = R.layout.opa_finish_setup_bar_v2;

    /* renamed from: B */
    private final C22871g f314374B;

    /* renamed from: C */
    private final C22871g f314375C;

    /* renamed from: D */
    private final C22871g f314376D;

    /* renamed from: E */
    private final C68214a f314377E;

    /* renamed from: F */
    private final C86124t f314378F;

    /* renamed from: G */
    private final C113565h f314379G;

    /* renamed from: H */
    private final C68214a f314380H;

    /* renamed from: I */
    private final C68214a f314381I;

    /* renamed from: J */
    private final l f314382J;

    /* renamed from: K */
    private final C73900j f314383K;

    /* renamed from: L */
    private final C68214a f314384L;

    /* renamed from: M */
    private final C68214a f314385M;

    /* renamed from: N */
    private final LinearLayoutManager f314386N;

    /* renamed from: O */
    private final C68214a f314387O;

    /* renamed from: P */
    private final C73897c f314388P;

    /* renamed from: Q */
    private final C68214a f314389Q;

    /* renamed from: R */
    private boolean f314390R;

    /* renamed from: S */
    private final C73896b f314391S;

    /* renamed from: T */
    private final C113526ah f314392T;

    /* renamed from: U */
    private final C68214a f314393U;

    /* renamed from: V */
    private final C113425ff f314394V;

    /* renamed from: W */
    private final C113191cv f314395W;

    /* renamed from: X */
    private final AtomicBoolean f314396X = new AtomicBoolean(false);

    /* renamed from: Y */
    private final boolean f314397Y;

    /* renamed from: Z */
    private final boolean f314398Z;

    /* renamed from: aa */
    private final C113523ae f314399aa;

    /* renamed from: ab */
    private final C68214a f314400ab;

    /* renamed from: ac */
    private ViewGroup f314401ac;

    /* renamed from: ad */
    private C113522ad f314402ad;

    /* renamed from: ae */
    private final C68214a f314403ae;

    /* renamed from: af */
    private final C68214a f314404af;

    /* renamed from: ag */
    private Optional f314405ag;

    /* renamed from: ah */
    private final C68214a f314406ah;

    /* renamed from: ai */
    private final C48674ai f314407ai;

    /* renamed from: aj */
    private final C68214a f314408aj;

    /* renamed from: ak */
    private final C112997h f314409ak;

    /* renamed from: al */
    private C112996g f314410al;

    /* renamed from: am */
    private final C108523b f314411am;

    /* renamed from: b */
    public final Context f314412b;

    /* renamed from: c */
    public final C2391v f314413c;

    /* renamed from: d */
    final TapasTouchInterceptingFrameLayout f314414d;

    /* renamed from: e */
    TapasOverlayFrameLayout f314415e;

    /* renamed from: f */
    final RecyclerView f314416f;

    /* renamed from: g */
    final View f314417g;

    /* renamed from: h */
    final LinearLayout f314418h;

    /* renamed from: i */
    public final C68214a f314419i;

    /* renamed from: j */
    public final C21370a f314420j;

    /* renamed from: k */
    final C112990a f314421k;

    /* renamed from: l */
    public final C113275a f314422l;

    /* renamed from: m */
    public final C68214a f314423m;

    /* renamed from: n */
    public final C68214a f314424n;

    /* renamed from: o */
    public final C68214a f314425o;

    /* renamed from: p */
    final List f314426p;

    /* renamed from: q */
    public final C107658ar f314427q;

    /* renamed from: r */
    public final C2332ag f314428r = new C2332ag(k.a);

    /* renamed from: s */
    public final h f314429s;

    /* renamed from: t */
    public final C68214a f314430t;

    /* renamed from: u */
    public ViewTreeObserver.OnPreDrawListener f314431u;

    /* renamed from: v */
    public final AtomicLong f314432v = new AtomicLong();

    /* renamed from: w */
    public final C68214a f314433w;

    /* renamed from: x */
    public C58833ax f314434x = C58836b.f156633a;

    public C113558bm(l lVar, C73900j jVar, C107658ar arVar, Context context, C22871g gVar, C22871g gVar2, C22871g gVar3, C2391v vVar, C68214a aVar, C21370a aVar2, C86124t tVar, C113275a aVar3, C68214a aVar4, C68214a aVar5, C108523b bVar, C68214a aVar6, C68214a aVar7, C68214a aVar8, C73897c cVar, C68214a aVar9, C68214a aVar10, C68214a aVar11, h hVar, C68214a aVar12, C68214a aVar13, Optional optional, C68214a aVar14, C73896b bVar2, C113527ai aiVar, C107710u uVar, C68214a aVar15, C68214a aVar16, C68214a aVar17, C113425ff ffVar, C68214a aVar18, C113191cv cvVar, C113523ae aeVar, C68214a aVar19, C68214a aVar20, C68214a aVar21, C68214a aVar22, C48674ai aiVar2, C68214a aVar23, C112997h hVar2, C112990a aVar24) {
        l lVar2 = lVar;
        Context context2 = context;
        C22871g gVar4 = gVar;
        C86124t tVar2 = tVar;
        C68214a aVar25 = aVar7;
        C68214a aVar26 = aVar8;
        C68214a aVar27 = aVar9;
        C113527ai aiVar3 = aiVar;
        C48674ai aiVar4 = aiVar2;
        ArrayList arrayList = new ArrayList();
        this.f314426p = arrayList;
        this.f314412b = context2;
        this.f314374B = gVar4;
        this.f314375C = gVar2;
        this.f314376D = gVar3;
        this.f314413c = vVar;
        this.f314419i = aVar;
        this.f314420j = aVar2;
        this.f314425o = aVar4;
        this.f314377E = aVar26;
        this.f314378F = tVar2;
        this.f314422l = aVar3;
        this.f314382J = lVar2;
        this.f314383K = jVar;
        this.f314427q = arVar;
        this.f314423m = aVar6;
        this.f314384L = aVar25;
        this.f314385M = aVar10;
        this.f314424n = aVar11;
        this.f314429s = hVar;
        this.f314387O = aVar12;
        this.f314389Q = aVar14;
        this.f314399aa = aeVar;
        this.f314400ab = aVar27;
        C113565h hVar3 = new C113565h(arrayList, aVar27, aVar25);
        this.f314379G = hVar3;
        hVar3.setHasStableIds(true);
        this.f314381I = aVar5;
        this.f314411am = bVar;
        this.f314388P = cVar;
        this.f314380H = aVar13;
        Optional.empty();
        this.f314430t = aVar18;
        this.f314391S = bVar2;
        this.f314394V = ffVar;
        this.f314395W = cvVar;
        this.f314403ae = aVar19;
        this.f314406ah = aVar22;
        this.f314407ai = aiVar4;
        this.f314408aj = aVar23;
        this.f314421k = aVar24;
        boolean b = cvVar.mo99906b();
        this.f314397Y = b;
        boolean e = cvVar.mo99909e();
        this.f314398Z = e;
        if (tVar2.mo79746e(C90063do.f249600gb)) {
            uVar.mo96220c(new C113544az(aVar26), C88244um.NEW_ASSISTANT_RESPONSE_RECEIVED);
        }
        this.f314393U = aVar15;
        this.f314404af = aVar20;
        this.f314405ag = Optional.empty();
        this.f314433w = aVar21;
        if (tVar2.mo79746e(C90063do.f249454do)) {
            ((C121535i) aVar16.mo27525b()).mo105231a();
        }
        if (tVar2.mo79746e(C90063do.f249456dq)) {
            ((C121525n) aVar17.mo27525b()).mo105224c();
        }
        if (tVar2.mo79746e(C90063do.f249394ch)) {
            C121491a.m200750b();
        }
        LayoutInflater from = LayoutInflater.from(context);
        int i = R.layout.suggestions_container_inner_transparent;
        if ((b || e) && !m187980G()) {
            i = R.layout.shelf_suggestions_container_inner_transparent;
        }
        TapasTouchInterceptingFrameLayout tapasTouchInterceptingFrameLayout = (TapasTouchInterceptingFrameLayout) from.inflate(i, (ViewGroup) null);
        this.f314414d = tapasTouchInterceptingFrameLayout;
        FrameLayout frameLayout = (FrameLayout) tapasTouchInterceptingFrameLayout.findViewById(R.id.suggestions_background);
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new C113546ba(this));
        }
        C113549bd bdVar = new C113549bd(this, context2, aVar25);
        this.f314386N = bdVar;
        bdVar.setOrientation(1);
        if (!m187980G()) {
            bdVar.setReverseLayout(true);
        }
        RecyclerView recyclerView = (RecyclerView) tapasTouchInterceptingFrameLayout.findViewById(R.id.suggestions_container);
        this.f314416f = recyclerView;
        if (e) {
            FrameLayout frameLayout2 = (FrameLayout) tapasTouchInterceptingFrameLayout.findViewById(R.id.suggestions_placeholder_container);
            frameLayout2.setOutlineProvider(new C113550be(context2));
            frameLayout2.setClipToOutline(true);
        }
        h hVar4 = (h) ((C68221g) aiVar3.f314316a).f184583a;
        hVar4.getClass();
        C2391v vVar2 = (C2391v) ((C68221g) aiVar3.f314317b).f184583a;
        vVar2.getClass();
        C22871g gVar5 = (C22871g) aiVar3.f314318c.mo17428b();
        gVar5.getClass();
        C86124t tVar3 = (C86124t) aiVar3.f314319d.mo17428b();
        tVar3.getClass();
        recyclerView.getClass();
        this.f314392T = new C113526ah(hVar4, vVar2, gVar5, tVar3, recyclerView);
        View inflate = from.inflate(f314373z, (FrameLayout) tapasTouchInterceptingFrameLayout.findViewById(R.id.tapas_finish_setup_bar_holder));
        this.f314417g = inflate;
        TextView textView = (TextView) inflate.findViewById(f314370A);
        if (textView != null) {
            textView.setOnClickListener(new C113551bf(this, lVar2));
        }
        this.f314418h = (LinearLayout) tapasTouchInterceptingFrameLayout.findViewById(R.id.suggestions_content_container);
        recyclerView.setLayoutManager(bdVar);
        recyclerView.setAdapter(hVar3);
        recyclerView.setItemAnimator((C0646fh) null);
        recyclerView.addItemDecoration$ar$ds(new C113573p(aiVar4));
        tapasTouchInterceptingFrameLayout.f253398a = new C113529ak(this);
        tapasTouchInterceptingFrameLayout.setOnClickListener(new C113530al(this));
        gVar4.mo28212l("Setup Tapas Lifecycle observer for debug panel", new C113536ar(hVar, vVar, tVar, optional, gVar));
        this.f314409ak = hVar2;
    }

    /* renamed from: E */
    private final C112996g m187978E() {
        if (this.f314410al == null) {
            this.f314410al = this.f314409ak.mo99810a(this, this.f314422l.mo100052a());
        }
        return this.f314410al;
    }

    /* renamed from: F */
    private final void m187979F() {
        this.f314426p.clear();
        this.f314379G.mObservable.mo2879a();
    }

    /* renamed from: G */
    private final boolean m187980G() {
        return this.f314395W.mo99905a() && this.f314407ai == C48674ai.INTENT_LAUNCHER;
    }

    /* renamed from: H */
    private final boolean m187981H() {
        return this.f314378F.mo79746e(C90063do.f249400cn) && this.f314378F.mo79745c(C90063do.f249595gW).contains(C48672ag.COMPLETE_SERVER.name());
    }

    /* renamed from: I */
    private final TapasOverlayFrameLayout m187982I() {
        TapasOverlayFrameLayout tapasOverlayFrameLayout = this.f314415e;
        if (tapasOverlayFrameLayout != null) {
            return tapasOverlayFrameLayout;
        }
        if (this.f314414d.findViewWithTag("TAPAS_SUGGESTION_OVERLAY") != null) {
            C59104x c = f314371a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TapasUiControllerImpl");
            ((C59052c) ((C59052c) c).mo56372aa(27921)).mo56386p("Suggestions overlay already attached to parent view");
            TapasOverlayFrameLayout tapasOverlayFrameLayout2 = (TapasOverlayFrameLayout) this.f314414d.findViewWithTag("TAPAS_SUGGESTION_OVERLAY");
            this.f314415e = tapasOverlayFrameLayout2;
            return tapasOverlayFrameLayout2;
        }
        int a = this.f314388P.mo65405a();
        TapasOverlayFrameLayout tapasOverlayFrameLayout3 = (TapasOverlayFrameLayout) LayoutInflater.from(this.f314412b).inflate(R.layout.suggestions_overlay, this.f314414d, false);
        this.f314415e = tapasOverlayFrameLayout3;
        tapasOverlayFrameLayout3.f314285a = new C113533ao(this);
        this.f314414d.addView(tapasOverlayFrameLayout3);
        if (a == 1) {
            this.f314415e.setBackgroundColor(C1878d.m5128a(this.f314412b, R.color.tapas_dark_overlay_background));
        }
        return this.f314415e;
    }

    /* renamed from: J */
    private final void m187983J() {
        if (this.f314401ac == null) {
            this.f314401ac = (ViewGroup) this.f314414d.findViewById(R.id.tapas_placeholder);
        }
    }

    /* renamed from: A */
    public final void mo100276A(int i) {
        mo100279D(true, i);
    }

    /* renamed from: B */
    public final void mo100277B() {
        ViewGroup viewGroup = this.f314401ac;
        if (viewGroup != null) {
            viewGroup.setAlpha(0.0f);
            ViewGroup viewGroup2 = this.f314401ac;
            viewGroup2.getClass();
            viewGroup2.setVisibility(8);
        }
    }

    /* renamed from: C */
    public final void mo100278C(View view, View view2, C113374do doVar) {
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        TapasOverlayFrameLayout I = m187982I();
        I.getClass();
        I.getGlobalVisibleRect(rect);
        int[] j = C91115n.m148878j(I);
        int[] j2 = C91115n.m148878j(view2);
        if (marginLayoutParams == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        if (marginLayoutParams.height == -2 || marginLayoutParams.height == -1) {
            i = View.MeasureSpec.makeMeasureSpec(marginLayoutParams.height, 0);
        } else {
            i = View.MeasureSpec.makeMeasureSpec(marginLayoutParams.height, 1073741824);
        }
        if (marginLayoutParams.width == -2 || marginLayoutParams.width == -1) {
            i2 = View.MeasureSpec.makeMeasureSpec(marginLayoutParams.width, 0);
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(marginLayoutParams.width, 1073741824);
        }
        view.measure(i2, i);
        int measuredHeight = view.getMeasuredHeight();
        int measuredWidth = view.getMeasuredWidth();
        marginLayoutParams.topMargin = Math.min(((j2[1] + (doVar.f313929d == 2 ? view2.getHeight() : 0)) + doVar.f313927b) - j[1], rect.height() - measuredHeight);
        marginLayoutParams.leftMargin = Math.min(j2[0] + doVar.f313926a, rect.width() - measuredWidth);
        view.setLayoutParams(marginLayoutParams);
        view.requestLayout();
        I.setBackgroundColor(doVar.f313928c.orElse(this.f314412b.getResources().getColor(R.color.tapas_overlay_background)));
        I.setVisibility(0);
    }

    /* renamed from: D */
    public final void mo100279D(boolean z, int i) {
        C89849ae aeVar;
        if (!((C113583z) this.f314381I.mo27525b()).mo100316a() || this.f314428r.mo3842a() != k.c) {
            this.f314428r.mo5708l(k.a);
            return;
        }
        this.f314411am.mo96958a(false);
        this.f314428r.mo5708l(k.a);
        C22871g gVar = this.f314374B;
        C73900j jVar = this.f314383K;
        Objects.requireNonNull(jVar);
        gVar.mo28212l("restore system ui", new C113531am(jVar));
        C107658ar arVar = this.f314427q;
        if (arVar != null) {
            arVar.mo96200b(z);
        }
        C112705m mVar = (C112705m) this.f314423m.mo27525b();
        int i2 = i - 1;
        if (i2 == 0) {
            aeVar = C89849ae.TAPAS_QUANTUM_KEYBOARD_QUERY_SUBMIT;
        } else if (i2 != 1) {
            aeVar = C89849ae.TAPAS_QUANTUM_KEYBOARD_DISMISSED;
        } else {
            aeVar = C89849ae.TAPAS_QUANTUM_KEYBOARD_TIMEOUT;
        }
        mVar.mo99666a(aeVar);
    }

    /* renamed from: a */
    public final int mo100280a() {
        return C1878d.m5128a(this.f314412b, R.color.tapas_background_transparent);
    }

    /* renamed from: b */
    public final View mo100281b() {
        return this.f314414d;
    }

    /* renamed from: c */
    public final C2332ag mo100282c() {
        return this.f314428r;
    }

    /* renamed from: d */
    public final void mo99374d(View view, View view2, FrameLayout.LayoutParams layoutParams, int i) {
        mo99377jE(view, view2, layoutParams, new C113374do(i));
    }

    /* renamed from: e */
    public final C59450aa mo100283e() {
        return m187978E().f313145k;
    }

    /* renamed from: f */
    public final void mo100284f(ViewGroup viewGroup, int i) {
        ViewParent parent = this.f314414d.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.f314414d);
        }
        if (m187980G()) {
            viewGroup.addView(this.f314414d, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f314418h.getLayoutParams();
            layoutParams.gravity = 48;
            this.f314418h.setLayoutParams(layoutParams);
            this.f314416f.setPadding(this.f314412b.getResources().getDimensionPixelOffset(R.dimen.intent_launcher_suggestions_view_left), 0, this.f314412b.getResources().getDimensionPixelOffset(R.dimen.intent_launcher_suggestions_view_right), 0);
            return;
        }
        if (this.f314397Y) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.valyrian_chat_ui_root);
            if (viewGroup2 != null) {
                m187983J();
                this.f314414d.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
                viewGroup2.addView(this.f314414d);
                if (this.f314401ac != null) {
                    C113523ae aeVar = this.f314399aa;
                    TapasTouchInterceptingFrameLayout tapasTouchInterceptingFrameLayout = this.f314414d;
                    tapasTouchInterceptingFrameLayout.getClass();
                    C86124t tVar = (C86124t) aeVar.f314305a.mo17428b();
                    tVar.getClass();
                    ((C113191cv) aeVar.f314306b.mo17428b()).getClass();
                    C22871g gVar = (C22871g) aeVar.f314307c.mo17428b();
                    gVar.getClass();
                    this.f314402ad = new C113522ad(tapasTouchInterceptingFrameLayout, tVar, gVar);
                    return;
                }
                return;
            }
        } else if (this.f314398Z) {
            m187983J();
        }
        this.f314396X.set(true);
        mo100303x(i);
        viewGroup.addView(this.f314414d);
    }

    /* renamed from: g */
    public final void mo100285g() {
        C0673gh findViewHolderForAdapterPosition;
        C0673gh findViewHolderForAdapterPosition2;
        C0673gh findViewHolderForAdapterPosition3;
        C113565h hVar = (C113565h) this.f314416f.mAdapter;
        if (hVar != null && hVar.getItemCount() > 0 && (findViewHolderForAdapterPosition = this.f314416f.findViewHolderForAdapterPosition(0)) != null) {
            C113579v vVar = (C113579v) this.f314400ab.mo27525b();
            if (findViewHolderForAdapterPosition instanceof C113577t) {
                RecyclerView recyclerView = ((C113577t) findViewHolderForAdapterPosition).f314479b;
                C113572o oVar = (C113572o) recyclerView.mAdapter;
                if (oVar != null && oVar.getItemCount() > 0 && (findViewHolderForAdapterPosition3 = recyclerView.findViewHolderForAdapterPosition(0)) != null) {
                    oVar.mo100313b(findViewHolderForAdapterPosition3).performClick();
                }
            } else if (findViewHolderForAdapterPosition instanceof C113578u) {
                RecyclerView recyclerView2 = ((C113578u) findViewHolderForAdapterPosition).f314482b;
                C113572o oVar2 = (C113572o) recyclerView2.mAdapter;
                if (oVar2 != null && oVar2.getItemCount() > 0 && (findViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(0)) != null) {
                    oVar2.mo100313b(findViewHolderForAdapterPosition2).performClick();
                }
            } else {
                ((C59052c) ((C59052c) C113579v.f314483a.mo56225c()).mo56372aa(27917)).mo56386p("Unknown suggestion section view holder");
            }
        }
    }

    /* renamed from: gS */
    public final void mo100286gS(C91006f fVar) {
        fVar.mo85291r("TapasUiControllerImpl");
        fVar.mo85286m((C90991b) this.f314419i.mo27525b());
    }

    /* renamed from: h */
    public final void mo100287h(e eVar) {
        ((C112694be) this.f314384L.mo27525b()).mo99655f();
        ((C112685aw) this.f314377E.mo27525b()).mo99637l();
        mo100289j(eVar);
        ((C112705m) this.f314423m.mo27525b()).mo99669d(C89849ae.TAPAS_ACTIVITY_STOP_CANCEL);
        TapasTouchInterceptingFrameLayout tapasTouchInterceptingFrameLayout = this.f314414d;
        if (tapasTouchInterceptingFrameLayout != null) {
            tapasTouchInterceptingFrameLayout.animate().cancel();
            this.f314414d.animate().alpha(0.0f).setDuration(this.f314378F.mo79743a(C90063do.f249599ga)).setListener(new C113555bj(this)).start();
        }
        m187979F();
        this.f314421k.f313121d = null;
        mo99375jB();
        this.f314417g.setVisibility(8);
        if (this.f314428r.mo3842a() == k.c) {
            int i = 1;
            boolean z = eVar == e.c;
            if (eVar != e.g) {
                i = 3;
            }
            mo100279D(z, i);
        }
        C107658ar arVar = this.f314427q;
        if (arVar != null) {
            arVar.mo96204f();
        }
        this.f314382J.g();
        if (m187981H()) {
            ((C89037bh) this.f314403ae.mo27525b()).mo27383i();
        }
        C113369dj djVar = (C113369dj) this.f314404af.mo27525b();
        synchronized (djVar.f313919b) {
            djVar.f313920c.clear();
        }
        this.f314405ag = Optional.empty();
    }

    /* renamed from: i */
    public final void mo100288i() {
        C112694be beVar = (C112694be) this.f314384L.mo27525b();
        Optional optional = (Optional) beVar.f312406c.getAndSet(Optional.empty());
        if (optional.isPresent() && !beVar.f312407d) {
            if (!beVar.f312409f.get()) {
                C89949q.m146520d((C60321oe) optional.get(), beVar.f312412i - beVar.f312411h.mo26870b());
            }
            beVar.f312405b.set(Optional.empty());
            beVar.f312407d = true;
            beVar.f312409f.compareAndSet(true, false);
        }
        beVar.mo99659j();
    }

    /* renamed from: j */
    public final void mo100289j(e eVar) {
        if (eVar == e.e || eVar == e.b || eVar == e.j) {
            ((C107662av) this.f314430t.mo27525b()).mo96209e(Optional.m71637of(((C112685aw) this.f314377E.mo27525b()).mo99626a()));
        }
    }

    /* renamed from: jB */
    public final void mo99375jB() {
        TapasOverlayFrameLayout tapasOverlayFrameLayout = this.f314415e;
        if (tapasOverlayFrameLayout != null && tapasOverlayFrameLayout.getVisibility() == 0) {
            this.f314415e.removeAllViews();
            this.f314415e.setVisibility(8);
            this.f314382J.h(true);
        }
    }

    /* renamed from: jC */
    public final void mo99364jC(long j, String str) {
        ((C112705m) this.f314423m.mo27525b()).mo99668c(j, str);
    }

    /* renamed from: jD */
    public final void mo99376jD(String str, int i) {
        Toast makeText = Toast.makeText(this.f314412b, str, i);
        Rect rect = new Rect();
        if (this.f314414d.getGlobalVisibleRect(rect)) {
            makeText.setGravity(81, 0, Resources.getSystem().getDisplayMetrics().heightPixels - (rect.bottom - this.f314412b.getResources().getDimensionPixelSize(R.dimen.toast_offset_from_tapas_bottom)));
        }
        makeText.show();
    }

    /* renamed from: jE */
    public final void mo99377jE(View view, View view2, FrameLayout.LayoutParams layoutParams, C113374do doVar) {
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        view.setOnClickListener(new C113556bk());
        TapasOverlayFrameLayout I = m187982I();
        I.getClass();
        I.addView(view, layoutParams);
        I.setOnClickListener(new C113557bl(this));
        I.addOnLayoutChangeListener(new C113547bb(this, view, view2, doVar));
        I.getViewTreeObserver().addOnGlobalLayoutListener(new C113548bc(this, I, view, view2, doVar));
    }

    /* renamed from: jF */
    public final boolean mo99365jF() {
        return this.f314391S.mo65404b();
    }

    /* renamed from: jG */
    public final void mo99366jG(long j, String str, long j2) {
        this.f314431u = new C113552bg(this, j2, str, j);
        ViewTreeObserver viewTreeObserver = this.f314416f.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f314431u;
        onPreDrawListener.getClass();
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* renamed from: jH */
    public final void mo99367jH(C113408es esVar, String str, long j) {
        ViewGroup viewGroup;
        if (esVar != null) {
            this.f314405ag = Optional.m71637of(esVar);
            if (esVar.mo100121d().isEmpty()) {
                f314372y.mo105240i("ResultsFetched:Ideal");
            } else {
                f314372y.mo105240i("ResultsFetched:DegradedExperience");
            }
            C58485gu a = ((C113023i) this.f314385M.mo27525b()).mo99819a(esVar);
            if (!a.isEmpty()) {
                if (this.f314416f.getVisibility() != 0) {
                    this.f314416f.setVisibility(0);
                }
                ((C112694be) this.f314384L.mo27525b()).mo99658i();
                C113526ah ahVar = this.f314392T;
                if (!ahVar.f314314c) {
                    ahVar.f314312a.setAlpha(0.0f);
                    ahVar.f314315d = ahVar.f314312a.animate().alpha(1.0f).setDuration(ahVar.f314313b);
                    ahVar.f314314c = true;
                }
                if (this.f314421k.f313119b.get() < j) {
                    m187979F();
                }
                this.f314421k.f313119b.set(j);
                if (this.f314426p.isEmpty() && !a.isEmpty()) {
                    mo99366jG(esVar.mo100118a().mo100016a(), str, j);
                }
                if (this.f314402ad == null || !this.f314378F.mo79746e(C90063do.f249384cX) || !this.f314395W.mo99906b() || (viewGroup = this.f314401ac) == null || viewGroup.getVisibility() != 0) {
                    mo100277B();
                } else {
                    ViewGroup viewGroup2 = this.f314401ac;
                    viewGroup2.getClass();
                    viewGroup2.animate().cancel();
                    ViewGroup viewGroup3 = this.f314401ac;
                    viewGroup3.getClass();
                    viewGroup3.animate().alpha(0.0f).setDuration(this.f314378F.mo79743a(C90063do.f249599ga)).start();
                    C113522ad adVar = this.f314402ad;
                    adVar.getClass();
                    adVar.f314302a.getViewTreeObserver().addOnPreDrawListener(new C113521ac(adVar, new C113553bh(this)));
                }
                int size = this.f314426p.size();
                this.f314426p.addAll(a);
                C113565h hVar = this.f314379G;
                hVar.mObservable.mo2882d(size, a.size());
                ((C111806n) this.f314389Q.mo27525b()).mo99251b(this.f314426p);
                Optional empty = Optional.empty();
                if (esVar.mo100128i().isPresent() && !((List) esVar.mo100128i().get()).isEmpty()) {
                    empty = Optional.m71637of((String) ((List) esVar.mo100128i().get()).get(0));
                }
                Optional optional = empty;
                if (!m187980G()) {
                    C83573ad a2 = this.f314382J.a();
                    this.f314434x = a2.mo76905a();
                    if (!TextUtils.isEmpty(str) || !this.f314434x.mo56113h() || m187980G()) {
                        this.f314417g.setVisibility(8);
                    } else if (this.f314417g.getVisibility() != 0) {
                        TextView textView = (TextView) this.f314417g.findViewById(f314370A);
                        if (!TextUtils.isEmpty(a2.mo76906b())) {
                            textView.setText(a2.mo76906b());
                        }
                        textView.setVisibility(0);
                        this.f314417g.setVisibility(0);
                    }
                }
                ((C112685aw) this.f314377E.mo27525b()).mo99635j(esVar, optional, esVar.mo100124f(), esVar.mo100122e(), a);
                mo99375jB();
                if (this.f314378F.mo79746e(C90063do.f249493ea)) {
                    ((C111771e) this.f314380H.mo27525b()).mo99228c(esVar, this.f314426p, str, esVar.mo100133n());
                }
                this.f314386N.setStackFromEnd(false);
                this.f314416f.scrollToPosition(0);
            }
        }
    }

    /* renamed from: k */
    public final void mo100290k() {
        ((C112999a) this.f314408aj.mo27525b()).mo99811a();
        ((C112694be) this.f314384L.mo27525b()).mo99655f();
    }

    /* renamed from: l */
    public final void mo100291l() {
        C58976aa aaVar = C58975e.f156826a;
        ((C112705m) this.f314423m.mo27525b()).mo99669d(C89849ae.TAPAS_ACTIVITY_STOP_CANCEL);
        ((C112694be) this.f314384L.mo27525b()).mo99656g();
        if (this.f314431u != null) {
            ViewTreeObserver viewTreeObserver = this.f314416f.getViewTreeObserver();
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f314431u;
            onPreDrawListener.getClass();
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f314431u = null;
        } else {
            this.f314432v.set(this.f314421k.f313118a.get());
        }
        ((C112705m) this.f314423m.mo27525b()).mo99667b();
        ((C112999a) this.f314408aj.mo27525b()).mo99812b();
    }

    /* renamed from: m */
    public final void mo100292m(Bundle bundle) {
        if (mo99368y()) {
            ((C112705m) this.f314423m.mo27525b()).mo99677l();
        }
        C112694be beVar = (C112694be) this.f314384L.mo27525b();
        C60321oe a = C28285c.m52874a(this.f314416f, 85951);
        if (a != null && beVar.f312408e.get()) {
            beVar.f312406c.set(Optional.m71637of(a));
            beVar.f312412i = beVar.f312411h.mo26870b();
        }
        beVar.mo99659j();
        beVar.f312405b.set(Optional.empty());
        Optional.m71637of(C87564g.m142223a(bundle));
        ((C112999a) this.f314408aj.mo27525b()).mo99813c();
    }

    /* renamed from: n */
    public final void mo100293n() {
        mo100279D(true, 3);
        ((C112999a) this.f314408aj.mo27525b()).mo99814d();
    }

    /* renamed from: o */
    public final void mo100294o(String str) {
        Optional optional;
        C59104x b = f314371a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TapasUiControllerImpl");
        ((C59052c) ((C59052c) b).mo56372aa(27926)).mo56386p("Query submitted via blue submit button while Tapas was active");
        C112794ct ctVar = (C112794ct) this.f314393U.mo27525b();
        Optional optional2 = this.f314405ag;
        C112794ct.f312617b.mo105240i("tapas_text_submit");
        C112794ct.f312617b.mo105239h("tapas_prefix_text_submit", (long) str.length());
        if (C83709a.m133281a(ctVar.f312618c) && optional2.isPresent()) {
            ctVar.mo99741c(10, (C113408es) optional2.get(), OptionalInt.empty(), 3);
        }
        if (optional2.isPresent()) {
            optional = ((C113408es) optional2.get()).mo100125g();
        } else {
            optional = Optional.empty();
        }
        ctVar.mo99740b(10, str, true, optional, Optional.empty());
        ctVar.f312619d.mo99644b();
    }

    /* renamed from: p */
    public final void mo100295p(Bundle bundle) {
        if (!this.f314390R) {
            if (bundle != null) {
                Optional.m71637of(C87564g.m142223a(bundle));
            }
            ((C113428a) this.f314387O.mo27525b()).mo100232b();
            this.f314375C.mo28212l("prewarm sources", new C113532an(this));
            this.f314390R = true;
        }
    }

    /* renamed from: q */
    public final void mo100296q(String str) {
        C108523b bVar = this.f314411am;
        Message obtain = Message.obtain(bVar.f301940a, 3);
        Bundle bundle = new Bundle();
        bundle.putString("final_text", str);
        obtain.setData(bundle);
        bVar.f301940a.sendMessage(obtain);
    }

    /* renamed from: r */
    public final void mo100297r() {
        ((C107662av) this.f314430t.mo27525b()).mo96205a(C89849ae.AGSA_TEXT_TAPAS_UI_DRAWN);
        C112705m mVar = (C112705m) this.f314423m.mo27525b();
        if (mVar.f312433a.get()) {
            mVar.mo99666a(C89849ae.TAPAS_SHOW_UI);
        }
        ((C112705m) this.f314423m.mo27525b()).mo99677l();
        this.f314394V.mo100137c();
        this.f314414d.setVisibility(0);
        this.f314414d.animate().cancel();
        if (this.f314398Z) {
            this.f314414d.setAlpha(1.0f);
        } else {
            this.f314414d.animate().alpha(1.0f).setDuration(this.f314378F.mo79743a(C90063do.f249599ga)).setListener(new C113554bi(this)).start();
        }
        this.f314382J.g();
        if (this.f314378F.mo79746e(C90063do.f249322bO)) {
            this.f314374B.mo28213m("Prefetch slices", this.f314378F.mo79743a(C90063do.f249266aL), new C113537as(this));
        }
        ViewGroup viewGroup = this.f314401ac;
        if (viewGroup != null) {
            viewGroup.animate().cancel();
            ViewGroup viewGroup2 = this.f314401ac;
            viewGroup2.getClass();
            viewGroup2.setVisibility(0);
            ViewGroup viewGroup3 = this.f314401ac;
            viewGroup3.getClass();
            viewGroup3.setAlpha(1.0f);
        }
        this.f314375C.mo28201a("Set first show UI", new C113538at(this));
        if (this.f314378F.mo79746e(C90063do.f249448di)) {
            C90875ai.m148465b(C113539au.f314337a, ((C46578l) this.f314406ah.mo27525b()).mo50546b(C113236d.m187276a(this.f314378F)), this.f314376D, "Enqueing Tapas charging worker.").mo85223a(C113540av.f314338a);
        }
    }

    /* renamed from: s */
    public final void mo100298s() {
        TextView textView = (TextView) this.f314414d.findViewById(R.id.opa_legal_notice_in_tapas);
        textView.setMovementMethod(new LinkMovementMethod());
        textView.setVisibility(0);
    }

    /* renamed from: t */
    public final void mo100299t() {
        if (((C113583z) this.f314381I.mo27525b()).mo100316a() && this.f314428r.mo3842a() != k.c) {
            this.f314411am.mo96958a(true);
            this.f314428r.mo5708l(k.c);
            C22871g gVar = this.f314374B;
            C73900j jVar = this.f314383K;
            Objects.requireNonNull(jVar);
            gVar.mo28212l("hide system ui", new C113543ay(jVar));
            ((C112705m) this.f314423m.mo27525b()).mo99666a(C89849ae.TAPAS_QUANTUM_KEYBOARD_SHOW);
        }
    }

    /* renamed from: u */
    public final void mo100300u(String str, String str2) {
        C108523b bVar = this.f314411am;
        Message obtain = Message.obtain(bVar.f301940a, 2);
        Bundle bundle = new Bundle();
        bundle.putString("pending_text", str2);
        bundle.putString("stable_text", str);
        obtain.setData(bundle);
        bVar.f301940a.sendMessage(obtain);
    }

    /* renamed from: v */
    public final void mo100301v(String str) {
        mo100302w(str, Optional.empty());
    }

    /* renamed from: w */
    public final void mo100302w(String str, Optional optional) {
        C51331dt dtVar;
        if (this.f314429s.a().mo3842a() != f.b) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C112996g E = m187978E();
        if (this.f314391S.mo65403a()) {
            dtVar = C51331dt.UNTRUSTED;
        } else {
            dtVar = C51331dt.FULLY_TRUSTED;
        }
        E.mo99809c(str, optional, dtVar);
        if (m187981H()) {
            ((C89037bh) this.f314403ae.mo27525b()).mo27382h(C113528aj.f314320a);
        }
    }

    /* renamed from: x */
    public final void mo100303x(int i) {
        if (this.f314396X.get()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f314414d.getLayoutParams();
            if (marginLayoutParams == null) {
                marginLayoutParams = new C1773f(-1, -1);
            }
            marginLayoutParams.bottomMargin = i;
            this.f314414d.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: y */
    public final boolean mo99368y() {
        return this.f314414d.getVisibility() == 0;
    }

    /* renamed from: z */
    public final void mo100304z(String str, int i, int i2) {
        ((C112685aw) this.f314377E.mo27525b()).mo99639n(str, i, i2);
        mo100302w(str, Optional.empty());
    }
}
