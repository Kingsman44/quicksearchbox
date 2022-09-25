package com.google.android.apps.gsa.staticplugins.nowcards.carousel;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7148ui.SuggestionGridLayout;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91671j;
import com.google.android.apps.gsa.sidekick.shared.monet.p7248d.C91820a;
import com.google.android.apps.gsa.sidekick.shared.p7255p.C91899a;
import com.google.android.apps.gsa.sidekick.shared.p7255p.C91902d;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91904b;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91909g;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.LoggingRequest;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.StreamRenderData;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.apps.p489g.p494d.C9280x;
import com.google.android.googlequicksearchbox.R;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.carousel.o */
/* compiled from: PG */
public class C104404o extends C104348l implements View.OnLayoutChangeListener, View.OnClickListener, View.OnAttachStateChangeListener, C104412w {

    /* renamed from: G */
    private static final C59071e f290501G = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.carousel.o");

    /* renamed from: y */
    public static final C9277u[] f290502y = {C9277u.TRAY_IMAGE_FULL, C9277u.METADATA_CARD_SMALL_CAROUSEL, C9277u.METADATA_CARD_SMALL_CAROUSEL_TEXTONLY, C9277u.METADATA_CARD_SMALL_CAROUSEL_TEXTONLY_RADIO, C9277u.METADATA_CARD_SMALL_CAROUSEL_SPLIT_TEXT, C9277u.METADATA_CARD_SMALL_CAROUSEL_LOGO, C9277u.METADATA_CARD_SMALL_CAROUSEL_WEB_LOGO, C9277u.METADATA_CARD_SMALL_CAROUSEL_TWO_TONE, C9277u.METADATA_CARD_SMALL_CAROUSEL_TWO_TONE_ICON, C9277u.METADATA_CARD_SMALL_CAROUSEL_MONOTONE};

    /* renamed from: A */
    public C104403n f290503A;

    /* renamed from: B */
    public C104393d f290504B;

    /* renamed from: C */
    public FrameLayout f290505C;

    /* renamed from: D */
    public boolean f290506D;

    /* renamed from: E */
    public TouchInterceptingFrameLayout f290507E;

    /* renamed from: F */
    CarouselRecyclerView f290508F;

    /* renamed from: H */
    private final C90929bz f290509H;

    /* renamed from: I */
    private SuggestionGridLayout f290510I;

    /* renamed from: J */
    private final C68214a f290511J;

    /* renamed from: K */
    private View f290512K;

    /* renamed from: L */
    private View f290513L;

    /* renamed from: M */
    private C104395f f290514M;

    /* renamed from: N */
    private boolean f290515N;

    /* renamed from: O */
    private AccessibilityManager f290516O;

    /* renamed from: P */
    private C91902d f290517P;

    /* renamed from: Q */
    private final View.OnTouchListener f290518Q;

    /* renamed from: z */
    public final List f290519z = new ArrayList();

    protected C104404o(Context context, C90929bz bzVar, C68214a aVar, C104350n nVar) {
        super(context, nVar);
        new Rect();
        this.f290518Q = new C104398i();
        this.f290509H = bzVar;
        this.f290511J = aVar;
    }

    /* renamed from: M */
    private final C104395f m172614M(C9278v vVar) {
        C9280x xVar;
        CardRenderingContext n = mo94120n();
        Context context = this.f290307b;
        if ((vVar.f32192a & 32768) != 0) {
            xVar = vVar.f32211r;
            if (xVar == null) {
                xVar = C9280x.f32220d;
            }
        } else {
            xVar = null;
        }
        boolean z = true;
        int i = true != this.f290314i.f290336f ? 2 : 3;
        if (n == null || !n.mo49316k()) {
            z = false;
        }
        return C104396g.m172606b(context, xVar, i, (C91820a) null, z);
    }

    /* renamed from: N */
    private final void m172615N(ViewGroup viewGroup) {
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.setAnimateParentHierarchy(false);
        }
        this.f290507E = (TouchInterceptingFrameLayout) viewGroup.findViewById(R.id.carousel_root);
        CarouselRecyclerView carouselRecyclerView = (CarouselRecyclerView) viewGroup.findViewById(R.id.carousel);
        this.f290508F = carouselRecyclerView;
        carouselRecyclerView.setVisibility(0);
        this.f290512K = viewGroup.findViewById(R.id.scroll_left);
        this.f290513L = viewGroup.findViewById(R.id.scroll_right);
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.breaker);
        this.f290505C = frameLayout;
        this.f290504B = C104394e.m172604a(frameLayout);
        C104395f fVar = this.f290514M;
        if (fVar != null && fVar.f290490j) {
            if (!C90685b.m148053a(this.f290307b) && !C90685b.m148054b(this.f290307b, (C90021c) null)) {
                this.f290508F.setClipChildren(false);
            }
            this.f290507E.setClipChildren(false);
            this.f290505C.setClipChildren(false);
            this.f290505C.setClipToPadding(false);
        }
        this.f290516O = (AccessibilityManager) this.f290507E.getContext().getSystemService("accessibility");
    }

    /* renamed from: L */
    public final void mo94153L(int i) {
        if (i != 0) {
            int i2 = 0;
            boolean z = i > 0;
            C104403n nVar = this.f290503A;
            LoggingRequest loggingRequest = null;
            if (nVar == null) {
                Iterator it = this.f290519z.iterator();
                if (it.hasNext()) {
                    C91899a aVar = (C91899a) it.next();
                    throw null;
                }
            } else if (nVar.f290497a == z) {
                i2 = nVar.f290498b;
                this.f290509H.mo85149n(nVar);
            }
            int i3 = i + i2;
            if (this.f290515N && Math.abs(i3) > 10) {
                C7718hj hjVar = this.f290310e.f32174H;
                if (hjVar == null) {
                    hjVar = C7718hj.f26927af;
                }
                LoggingRequest y = LoggingRequest.m150674y(hjVar, C7681g.CAROUSEL_SCROLL, (C7526an) null, this.f290314i.f290342l.mo85966a());
                C91904b bVar = new C91904b();
                C9277u a = C9277u.m23705a(this.f290310e.f32196c);
                if (a == null) {
                    a = C9277u.UNKNOWN;
                }
                bVar.f256311h = a;
                bVar.f256310g = Integer.valueOf(i3);
                StreamRenderData a2 = bVar.mo86554a();
                C91909g i4 = y.mo86500i();
                i4.mo86547k(a2);
                loggingRequest = i4.mo86537a();
            }
            C104403n nVar2 = new C104403n(this, loggingRequest, z, i3);
            this.f290503A = nVar2;
            this.f290509H.mo85150o(nVar2, 200);
        }
    }

    /* renamed from: a */
    public final View mo86091a(C91671j jVar, C9278v vVar) {
        this.f290514M = m172614M(vVar);
        return super.mo86091a(jVar, vVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo94018b(LayoutInflater layoutInflater) {
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(R.layout.qp_module_carousel_layout, mo94115i(), false);
        m172615N(viewGroup);
        return viewGroup;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) this.f290308c.f256406b.inflate(R.layout.qp_module_carousel_layout, viewGroup, false);
        m172615N(viewGroup2);
        return viewGroup2;
    }

    /* renamed from: d */
    public List mo94030d() {
        return this.f290508F.f290465c;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0116 A[EDGE_INSN: B:82:0x0116->B:60:0x0116 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo94020e() {
        /*
            r13 = this;
            com.google.android.apps.g.d.v r0 = r13.f290310e
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r1 = r13.mo94120n()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000c
            r4 = 1
            goto L_0x000d
        L_0x000c:
            r4 = 0
        L_0x000d:
            r13.f290506D = r4
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.f r4 = r13.f290514M
            if (r4 != 0) goto L_0x0019
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.f r4 = r13.m172614M(r0)
            r13.f290514M = r4
        L_0x0019:
            int r4 = r0.f32192a
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0027
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.CarouselRecyclerView r4 = r13.f290508F
            int r5 = r0.f32167A
            r4.setBackgroundColor(r5)
        L_0x0027:
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.CarouselRecyclerView r4 = r13.f290508F
            com.google.android.apps.gsa.sidekick.shared.cards.a.j r8 = r13.f290309d
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r5 = r13.f290314i
            com.google.android.apps.gsa.sidekick.shared.p.c r5 = r5.f290350t
            dagger.a r5 = r13.f290511J
            java.lang.Object r5 = r5.mo27525b()
            r7 = r5
            com.google.android.apps.gsa.staticplugins.nowcards.base.bk r7 = (com.google.android.apps.gsa.staticplugins.nowcards.base.C104336bk) r7
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.f r11 = r13.f290514M
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r5 = r13.f290314i
            com.google.android.apps.gsa.sidekick.shared.e.a.l r10 = r5.f290332b
            com.google.android.apps.gsa.staticplugins.nowcards.ui.WrapContentHeightLinearLayoutManager r5 = new com.google.android.apps.gsa.staticplugins.nowcards.ui.WrapContentHeightLinearLayoutManager
            android.content.Context r6 = r4.getContext()
            r5.<init>(r6)
            r4.f290463a = r5
            com.google.android.apps.gsa.staticplugins.nowcards.ui.WrapContentHeightLinearLayoutManager r5 = r4.f290463a
            r4.setLayoutManager(r5)
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.r r12 = new com.google.android.apps.gsa.staticplugins.nowcards.carousel.r
            android.content.Context r6 = r4.getContext()
            r5 = r12
            r9 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r4.f290464b = r12
            int r5 = r11.f290485e
            if (r5 > 0) goto L_0x0063
            int r6 = r11.f290486f
            if (r6 <= 0) goto L_0x0079
        L_0x0063:
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.t r6 = new com.google.android.apps.gsa.staticplugins.nowcards.carousel.t
            int r7 = r11.f290486f
            com.google.android.apps.g.d.x r8 = r0.f32211r
            if (r8 != 0) goto L_0x006d
            com.google.android.apps.g.d.x r8 = com.google.android.apps.p489g.p494d.C9280x.f32220d
        L_0x006d:
            com.google.protobuf.cq r8 = r8.f32223b
            int r8 = r8.size()
            r6.<init>(r5, r7, r8)
            r4.addItemDecoration$ar$ds(r6)
        L_0x0079:
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.r r5 = r4.f290464b
            com.google.android.apps.g.d.x r6 = r0.f32211r
            if (r6 != 0) goto L_0x0081
            com.google.android.apps.g.d.x r6 = com.google.android.apps.p489g.p494d.C9280x.f32220d
        L_0x0081:
            r5.mo94156a(r6)
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.r r5 = r4.f290464b
            r4.setAdapter(r5)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            int r6 = r5.leftMargin
            int r7 = r11.f290488h
            int r8 = r5.rightMargin
            int r9 = r11.f290487g
            r5.setMargins(r6, r7, r8, r9)
            r4.setLayoutParams(r5)
            r4 = 0
            if (r1 == 0) goto L_0x00a8
            boolean r5 = r1.mo49313h()
            if (r5 == 0) goto L_0x00a9
            r5 = 1
            goto L_0x00aa
        L_0x00a8:
            r1 = r4
        L_0x00a9:
            r5 = 0
        L_0x00aa:
            if (r1 == 0) goto L_0x00b4
            boolean r1 = r1.mo49314i()
            if (r1 == 0) goto L_0x00b4
            r1 = 1
            goto L_0x00b5
        L_0x00b4:
            r1 = 0
        L_0x00b5:
            if (r5 != 0) goto L_0x00b9
            if (r1 == 0) goto L_0x00ee
        L_0x00b9:
            com.google.android.apps.gsa.sidekick.shared.p.d r1 = r13.f290517P
            if (r1 != 0) goto L_0x00ce
            com.google.android.apps.gsa.sidekick.shared.p.d r1 = new com.google.android.apps.gsa.sidekick.shared.p.d
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r6 = r13.f290314i
            com.google.common.base.ax r6 = r6.f290338h
            java.lang.Object r6 = r6.mo56107c()
            com.google.android.apps.gsa.sidekick.shared.cards.a.i r6 = (com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91670i) r6
            r1.<init>()
            r13.f290517P = r1
        L_0x00ce:
            java.util.List r1 = r13.f290519z
            java.util.Iterator r1 = r1.iterator()
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00ee
            java.lang.Object r0 = r1.next()
            com.google.android.apps.gsa.sidekick.shared.p.a r0 = (com.google.android.apps.gsa.sidekick.shared.p7255p.C91899a) r0
            if (r5 != 0) goto L_0x00e8
            com.google.android.apps.gsa.sidekick.shared.p.d r0 = r13.f290517P
            if (r0 != 0) goto L_0x00e7
            throw r4
        L_0x00e7:
            throw r4
        L_0x00e8:
            com.google.android.apps.gsa.sidekick.shared.p.d r0 = r13.f290517P
            r0.getClass()
            throw r4
        L_0x00ee:
            com.google.ai.b.hj r1 = r0.f32174H
            if (r1 != 0) goto L_0x00f4
            com.google.ai.b.hj r1 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x00f4:
            com.google.protobuf.cq r1 = r1.f26935G
            java.util.Iterator r1 = r1.iterator()
        L_0x00fa:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0116
            java.lang.Object r4 = r1.next()
            com.google.ai.b.h r4 = (com.google.p375ai.p378b.C7708h) r4
            int r4 = r4.f26897b
            com.google.ai.b.g r4 = com.google.p375ai.p378b.C7681g.m22802a(r4)
            if (r4 != 0) goto L_0x0110
            com.google.ai.b.g r4 = com.google.p375ai.p378b.C7681g.INVALID
        L_0x0110:
            com.google.ai.b.g r5 = com.google.p375ai.p378b.C7681g.CAROUSEL_SCROLL
            if (r4 != r5) goto L_0x00fa
            r13.f290515N = r2
        L_0x0116:
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.CarouselRecyclerView r1 = r13.f290508F
            r1.f290467e = r13
            android.view.View r1 = r13.f290512K
            r1.setOnClickListener(r13)
            android.view.View r1 = r13.f290513L
            r1.setOnClickListener(r13)
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.CarouselRecyclerView r1 = r13.f290508F
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.h r2 = new com.google.android.apps.gsa.staticplugins.nowcards.carousel.h
            r2.<init>()
            r1.f290468f = r2
            android.view.accessibility.AccessibilityManager r1 = r13.f290516O
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L_0x0143
            android.view.accessibility.AccessibilityManager r1 = r13.f290516O
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L_0x0143
            android.widget.FrameLayout r1 = r13.f290505C
            r1.setOnClickListener(r13)
            goto L_0x0153
        L_0x0143:
            android.widget.FrameLayout r1 = r13.f290505C
            android.view.View$OnTouchListener r2 = r13.f290518Q
            r1.setOnTouchListener(r2)
            com.google.android.apps.gsa.shared.ui.TouchInterceptingFrameLayout r1 = r13.f290507E
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.j r2 = new com.google.android.apps.gsa.staticplugins.nowcards.carousel.j
            r2.<init>(r13)
            r1.f253398a = r2
        L_0x0153:
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.d r1 = r13.f290504B
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.k r2 = new com.google.android.apps.gsa.staticplugins.nowcards.carousel.k
            r2.<init>(r13)
            r1.f290480b = r2
            android.content.Context r1 = r13.f290307b
            android.content.res.Resources r1 = r1.getResources()
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.f r2 = r13.f290514M
            int r2 = r2.f290487g
            int r2 = r2 / 2
            r4 = 2131166498(0x7f070522, float:1.7947243E38)
            int r1 = r1.getDimensionPixelSize(r4)
            android.view.View r4 = r13.f290512K
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            r4.setMargins(r1, r3, r3, r2)
            android.view.View r5 = r13.f290512K
            r5.setLayoutParams(r4)
            android.view.View r4 = r13.f290513L
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            r4.setMargins(r3, r3, r1, r2)
            android.view.View r1 = r13.f290513L
            r1.setLayoutParams(r4)
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.CarouselRecyclerView r1 = r13.f290508F
            r1.setVisibility(r3)
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.CarouselRecyclerView r1 = r13.f290508F
            r1.addOnLayoutChangeListener(r13)
            com.google.android.apps.g.d.x r1 = r0.f32211r
            if (r1 != 0) goto L_0x019f
            com.google.android.apps.g.d.x r1 = com.google.android.apps.p489g.p494d.C9280x.f32220d
        L_0x019f:
            com.google.ai.b.rt r1 = r1.f32224c
            if (r1 != 0) goto L_0x01a5
            com.google.ai.b.rt r1 = com.google.p375ai.p378b.C7998rt.f28087v
        L_0x01a5:
            int r1 = r1.f28089a
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x01be
            com.google.android.apps.gsa.shared.ui.TouchInterceptingFrameLayout r1 = r13.f290507E
            com.google.android.apps.g.d.x r0 = r0.f32211r
            if (r0 != 0) goto L_0x01b3
            com.google.android.apps.g.d.x r0 = com.google.android.apps.p489g.p494d.C9280x.f32220d
        L_0x01b3:
            com.google.ai.b.rt r0 = r0.f32224c
            if (r0 != 0) goto L_0x01b9
            com.google.ai.b.rt r0 = com.google.p375ai.p378b.C7998rt.f28087v
        L_0x01b9:
            int r0 = r0.f28102n
            r1.setBackgroundColor(r0)
        L_0x01be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104404o.mo94020e():void");
    }

    public final void onClick(View view) {
        if (view.getId() != R.id.scroll_left && view.getId() != R.id.scroll_right) {
            view.getId();
        }
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                break;
            } else if (parent instanceof SuggestionGridLayout) {
                this.f290510I = (SuggestionGridLayout) parent;
                break;
            } else {
                parent = parent.getParent();
            }
        }
        if (C91115n.m148876h(this.f290507E)) {
            View findViewById = this.f290505C.findViewById(R.id.breaker_icon);
            findViewById.setContentDescription(findViewById.getContext().getString(R.string.scroll_left));
        }
        if (this.f290510I != null) {
            this.f290509H.mo85151p(new C104401l(this));
            view.removeOnLayoutChangeListener(this);
            view.addOnAttachStateChangeListener(this);
            return;
        }
        ((C59052c) ((C59052c) f290501G.mo56226d()).mo56372aa(21968)).mo56386p("Carousel being used outside SuggestionGridLayout");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    /* renamed from: h */
    public final View mo94114h(C9278v vVar) {
        C9278v vVar2 = this.f290310e;
        if (vVar2 == null || (vVar2.f32192a & 32768) == 0) {
            return mo86091a(this.f290309d, vVar);
        }
        if ((vVar.f32192a & 32768) == 0) {
            return super.mo94114h(vVar);
        }
        C9280x xVar = vVar.f32211r;
        if (xVar == null) {
            xVar = C9280x.f32220d;
        }
        C9278v[] vVarArr = (C9278v[]) xVar.f32223b.toArray(new C9278v[0]);
        if (vVarArr == null || vVarArr.length == 0) {
            return mo86091a(this.f290309d, vVar);
        }
        C104407r rVar = this.f290508F.f290464b;
        C9280x xVar2 = vVar.f32211r;
        if (xVar2 == null) {
            xVar2 = C9280x.f32220d;
        }
        rVar.mo94156a(xVar2);
        return this.f290311f;
    }
}
