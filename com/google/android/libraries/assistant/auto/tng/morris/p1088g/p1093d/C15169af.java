package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14106ag;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14110ak;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14117ar;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15340n;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.af */
/* compiled from: PG */
public final class C15169af {

    /* renamed from: a */
    public static final C59071e f45503a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.d.af");

    /* renamed from: b */
    public View f45504b;

    /* renamed from: c */
    public View f45505c;

    /* renamed from: d */
    public C14558nr f45506d;

    /* renamed from: e */
    public C60872cz f45507e;

    /* renamed from: f */
    public final C14986h f45508f;

    /* renamed from: g */
    public final C14117ar f45509g;

    /* renamed from: h */
    public final C14110ak f45510h;

    /* renamed from: i */
    public final C86124t f45511i;

    /* renamed from: j */
    private TextView f45512j;

    /* renamed from: k */
    private TextView f45513k;

    /* renamed from: l */
    private ViewGroup f45514l;

    /* renamed from: m */
    private ViewGroup f45515m;

    /* renamed from: n */
    private View f45516n;

    /* renamed from: o */
    private View f45517o;

    /* renamed from: p */
    private final Context f45518p;

    /* renamed from: q */
    private final C15340n f45519q;

    /* renamed from: r */
    private final C14132bf f45520r;

    /* renamed from: s */
    private final C69464a f45521s;

    /* renamed from: t */
    private final C14106ag f45522t;

    /* renamed from: u */
    private final C60888db f45523u;

    /* renamed from: v */
    private final int f45524v;

    public C15169af(Context context, C14986h hVar, C14132bf bfVar, C15340n nVar, C69464a aVar, C14117ar arVar, C14106ag agVar, C14110ak akVar, C60888db dbVar, C86124t tVar) {
        this.f45518p = context;
        this.f45508f = hVar;
        this.f45520r = bfVar;
        this.f45519q = nVar;
        this.f45521s = aVar;
        this.f45509g = arVar;
        this.f45522t = agVar;
        this.f45510h = akVar;
        this.f45511i = tVar;
        this.f45523u = dbVar;
        Resources resources = context.getResources();
        double d = (double) resources.getDisplayMetrics().heightPixels;
        Double.isNaN(d);
        this.f45524v = (((int) (d * 0.9d)) - resources.getDimensionPixelSize(R.dimen.morris_energy_bar_height)) - resources.getDimensionPixelSize(R.dimen.immersive_card_content_minimum_margin_top);
    }

    /* renamed from: d */
    private static Animation m31749d(Context context, int i) {
        Animation p = C15352z.m31958p(context, 54.0f, R.integer.motion_med03, 0);
        AnimationSet animationSet = (AnimationSet) AnimationUtils.loadAnimation(context, i);
        animationSet.addAnimation(p);
        return animationSet;
    }

    /* renamed from: e */
    private final void m31750e() {
        C60872cz czVar = this.f45507e;
        if (czVar != null) {
            czVar.cancel(true);
            this.f45507e = null;
        }
    }

    /* renamed from: a */
    public final void mo22044a(ContextThemeWrapper contextThemeWrapper, boolean z) {
        Animation loadAnimation = AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.immersive_shelf_animate_out);
        loadAnimation.setAnimationListener(new C15166ac(this, z));
        View view = this.f45504b;
        if (view != null) {
            view.startAnimation(loadAnimation);
        }
        Animation loadAnimation2 = AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.immersive_scrim_animate_out);
        loadAnimation2.setAnimationListener(new C15167ad(this));
        View view2 = this.f45505c;
        if (view2 != null) {
            view2.startAnimation(loadAnimation2);
        }
        View view3 = this.f45516n;
        if (view3 != null) {
            view3.startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.immersive_fab_animate_out));
        }
        View view4 = this.f45517o;
        if (view4 != null) {
            view4.startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.immersive_fab_animate_out));
        }
    }

    /* renamed from: c */
    public final void mo22046c() {
        this.f45506d = null;
        this.f45512j = null;
        this.f45514l = null;
        this.f45515m = null;
        this.f45504b = null;
        this.f45505c = null;
        this.f45516n = null;
        this.f45517o = null;
        this.f45513k = null;
        m31750e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0190, code lost:
        if (r3.equals(r10) != false) goto L_0x0433;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22045b(com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr r17, android.view.ViewGroup r18, android.view.ContextThemeWrapper r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            android.widget.TextView r3 = r0.f45512j
            r4 = 1
            if (r3 == 0) goto L_0x000d
            goto L_0x0169
        L_0x000d:
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r19)
            r5 = 2131625691(0x7f0e06db, float:1.8878597E38)
            r6 = r18
            android.view.View r3 = r3.inflate(r5, r6, r4)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.getClass()
            r5 = 2131432474(0x7f0b141a, float:1.8486706E38)
            android.view.View r3 = r3.findViewById(r5)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.getClass()
            r5 = 2131432458(0x7f0b140a, float:1.8486674E38)
            android.view.View r5 = r3.findViewById(r5)
            r0.f45504b = r5
            com.google.android.libraries.assistant.auto.tng.morris.g.d.ae r5 = new com.google.android.libraries.assistant.auto.tng.morris.g.d.ae
            r5.<init>(r0)
            android.view.View r6 = r0.f45504b
            r6.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.c.n r7 = new com.google.android.libraries.assistant.auto.tng.morris.c.n
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r8 = r0.f45520r
            r7.<init>(r2, r8, r5)
            r6.setOnTouchListener(r7)
            r5 = 2131432468(0x7f0b1414, float:1.8486694E38)
            android.view.View r5 = r3.findViewById(r5)
            r0.f45505c = r5
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r6 = r0.f45520r
            r5.getClass()
            r7 = 119441(0x1d291, float:1.67372E-40)
            r6.mo21444a(r5, r7)
            android.view.View r5 = r0.f45505c
            r5.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r6 = r0.f45520r
            com.google.android.libraries.assistant.auto.tng.morris.g.d.x r7 = new com.google.android.libraries.assistant.auto.tng.morris.g.d.x
            r7.<init>(r0, r2)
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
            com.google.android.libraries.assistant.auto.tng.morris.c.bc r9 = new com.google.android.libraries.assistant.auto.tng.morris.c.bc
            r9.<init>(r6, r8, r7)
            r5.setOnClickListener(r9)
            r5 = 2131432473(0x7f0b1419, float:1.8486704E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f45512j = r5
            r5 = 2131436190(0x7f0b229e, float:1.8494243E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f45513k = r5
            r5 = 2131432461(0x7f0b140d, float:1.848668E38)
            android.view.View r5 = r3.findViewById(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r0.f45514l = r5
            r5 = 2131432459(0x7f0b140b, float:1.8486676E38)
            android.view.View r5 = r3.findViewById(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r0.f45515m = r5
            r5 = 2131432466(0x7f0b1412, float:1.848669E38)
            android.view.View r5 = r3.findViewById(r5)
            r0.f45517o = r5
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r6 = r0.f45520r
            r5.getClass()
            r7 = 135154(0x20ff2, float:1.89391E-40)
            r6.mo21444a(r5, r7)
            r5 = 2131432463(0x7f0b140f, float:1.8486684E38)
            android.view.View r3 = r3.findViewById(r5)
            r0.f45516n = r3
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r5 = r0.f45520r
            r3.getClass()
            r6 = 119440(0x1d290, float:1.67371E-40)
            r5.mo21444a(r3, r6)
            android.view.View r3 = r0.f45516n
            r3.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r5 = r0.f45520r
            com.google.android.libraries.assistant.auto.tng.morris.g.d.y r6 = new com.google.android.libraries.assistant.auto.tng.morris.g.d.y
            r6.<init>(r0, r2)
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            com.google.android.libraries.assistant.auto.tng.morris.c.bc r8 = new com.google.android.libraries.assistant.auto.tng.morris.c.bc
            r8.<init>(r5, r7, r6)
            r3.setOnClickListener(r8)
            android.view.ViewGroup r3 = r0.f45515m
            r3.getClass()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.constraintlayout.widget.d r3 = (androidx.constraintlayout.widget.C1745d) r3
            int r5 = r0.f45524v
            r3.f5248Q = r5
            android.view.ViewGroup r5 = r0.f45515m
            r5.getClass()
            r5.setLayoutParams(r3)
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            android.view.View r3 = r0.f45504b
            if (r3 == 0) goto L_0x0107
            r5 = 2130772094(0x7f01007e, float:1.7147297E38)
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r2, r5)
            r3.startAnimation(r5)
        L_0x0107:
            android.view.View r3 = r0.f45505c
            if (r3 == 0) goto L_0x0115
            r5 = 2130772090(0x7f01007a, float:1.7147289E38)
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r2, r5)
            r3.startAnimation(r5)
        L_0x0115:
            android.widget.TextView r3 = r0.f45512j
            if (r3 == 0) goto L_0x0123
            r5 = 2130772089(0x7f010079, float:1.7147287E38)
            android.view.animation.Animation r5 = m31749d(r2, r5)
            r3.startAnimation(r5)
        L_0x0123:
            android.widget.TextView r3 = r0.f45513k
            if (r3 == 0) goto L_0x0131
            r5 = 2130772092(0x7f01007c, float:1.7147293E38)
            android.view.animation.Animation r5 = m31749d(r2, r5)
            r3.startAnimation(r5)
        L_0x0131:
            android.view.View r3 = r0.f45516n
            r5 = 2130772086(0x7f010076, float:1.714728E38)
            if (r3 == 0) goto L_0x013f
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r2, r5)
            r3.startAnimation(r6)
        L_0x013f:
            android.view.View r3 = r0.f45517o
            if (r3 == 0) goto L_0x014a
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r2, r5)
            r3.startAnimation(r5)
        L_0x014a:
            android.view.ViewGroup r3 = r0.f45514l
            if (r3 == 0) goto L_0x0169
            android.view.animation.LayoutAnimationController r5 = new android.view.animation.LayoutAnimationController
            r6 = 2130772085(0x7f010075, float:1.7147278E38)
            android.view.animation.Animation r6 = m31749d(r2, r6)
            r7 = 1032805417(0x3d8f5c29, float:0.07)
            r5.<init>(r6, r7)
            r3.setLayoutAnimation(r5)
            android.view.ViewGroup r3 = r0.f45514l
            android.view.animation.LayoutAnimationController r3 = r3.getLayoutAnimation()
            r3.start()
        L_0x0169:
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r3 = r0.f45506d
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0516
            com.google.at.h.b.a.r r3 = r1.f44017c
            r5 = 4
            java.lang.String r6 = "Morris.ImmersiveRndr"
            r7 = 5
            r8 = 8
            r9 = 0
            if (r3 == 0) goto L_0x022a
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r3 = r0.f45506d
            if (r3 == 0) goto L_0x0194
            com.google.at.h.b.a.r r3 = r3.f44017c
            if (r3 != 0) goto L_0x0186
            com.google.at.h.b.a.r r3 = com.google.p4017at.p4060h.p4068b.p4069a.C54201r.f142243f
        L_0x0186:
            com.google.at.h.b.a.r r10 = r1.f44017c
            if (r10 != 0) goto L_0x018c
            com.google.at.h.b.a.r r10 = com.google.p4017at.p4060h.p4068b.p4069a.C54201r.f142243f
        L_0x018c:
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0194
            goto L_0x0433
        L_0x0194:
            g.a.a r3 = r0.f45521s
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.libraries.componentview.a.a r3 = (com.google.android.libraries.componentview.p1675a.C19739a) r3
            com.google.at.h.b.a.r r10 = r1.f44017c
            if (r10 != 0) goto L_0x01a2
            com.google.at.h.b.a.r r10 = com.google.p4017at.p4060h.p4068b.p4069a.C54201r.f142243f
        L_0x01a2:
            com.google.android.libraries.componentview.a.a.a r3 = r3.mo25092a(r10)
            if (r3 == 0) goto L_0x0215
            android.view.View r10 = r3.mo25098kH()
            if (r10 != 0) goto L_0x01af
            goto L_0x0215
        L_0x01af:
            android.view.View r10 = r0.f45517o
            r10.getClass()
            r10.setVisibility(r8)
            android.widget.TextView r10 = r0.f45512j
            r10.getClass()
            r10.setVisibility(r8)
            android.widget.TextView r10 = r0.f45513k
            r10.getClass()
            r10.setVisibility(r8)
            android.view.ViewGroup r10 = r0.f45514l
            r10.getClass()
            r10.setVisibility(r8)
            android.view.ViewGroup r10 = r0.f45515m
            r10.getClass()
            r10.setVisibility(r9)
            android.view.ViewGroup r10 = r0.f45515m
            r10.getClass()
            r10.removeAllViews()
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r10 = r0.f45520r
            android.view.ViewGroup r11 = r0.f45515m
            r11.getClass()
            r12 = 133595(0x209db, float:1.87206E-40)
            r10.mo21444a(r11, r12)
            android.view.View r3 = r3.mo25098kH()
            r3.getClass()
            android.view.ViewGroup r10 = r0.f45515m
            r10.getClass()
            r10.addView(r3)
            android.view.ViewGroup$LayoutParams r10 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            android.content.Context r11 = r0.f45518p
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131169149(0x7f070f7d, float:1.795262E38)
            int r11 = r11.getDimensionPixelSize(r12)
            r10.bottomMargin = r11
            r3.setLayoutParams(r10)
            goto L_0x0433
        L_0x0215:
            com.google.common.f.e r3 = f45503a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r10, r6)
            java.lang.String r10 = "Error converting renderd card proto to component view"
            r11 = 46007(0xb3b7, float:6.447E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r11)).mo56386p(r10)
            goto L_0x0433
        L_0x022a:
            android.widget.TextView r3 = r0.f45512j
            r3.getClass()
            java.lang.String r10 = r1.f44015a
            r3.setText(r10)
            android.widget.TextView r3 = r0.f45512j
            r3.getClass()
            r3.setVisibility(r9)
            android.view.ViewGroup r3 = r0.f45514l
            r3.getClass()
            r3.setVisibility(r9)
            android.view.ViewGroup r3 = r0.f45515m
            r3.getClass()
            r3.setVisibility(r8)
            com.google.protobuf.cq r3 = r1.f44016b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0255
            goto L_0x0271
        L_0x0255:
            com.google.protobuf.cq r3 = r1.f44016b
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.libraries.assistant.auto.tng.morris.g.d.v r10 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15266v.f45802a
            j$.util.stream.Stream r3 = r3.flatMap(r10)
            com.google.android.libraries.assistant.auto.tng.morris.g.d.w r10 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15267w.f45803a
            boolean r3 = r3.allMatch(r10)
            if (r3 != 0) goto L_0x0271
            android.widget.TextView r3 = r0.f45513k
            r3.getClass()
            r3.setVisibility(r9)
        L_0x0271:
            int r3 = r1.f44018d
            int r3 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14557nq.m30639a(r3)
            if (r3 != 0) goto L_0x027a
            goto L_0x0295
        L_0x027a:
            if (r3 != r7) goto L_0x0295
            android.view.View r3 = r0.f45517o
            r3.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r10 = r0.f45520r
            com.google.android.libraries.assistant.auto.tng.morris.g.d.aa r11 = new com.google.android.libraries.assistant.auto.tng.morris.g.d.aa
            r11.<init>(r0)
            j$.util.Optional r12 = p3186j$.util.Optional.empty()
            com.google.android.libraries.assistant.auto.tng.morris.c.bc r13 = new com.google.android.libraries.assistant.auto.tng.morris.c.bc
            r13.<init>(r10, r12, r11)
            r3.setOnClickListener(r13)
            goto L_0x029d
        L_0x0295:
            android.view.View r3 = r0.f45517o
            r3.getClass()
            r3.setVisibility(r8)
        L_0x029d:
            com.google.protobuf.cq r3 = r1.f44016b
            int r3 = r3.size()
            android.view.ViewGroup r10 = r0.f45514l
            r10.getClass()
            int r10 = r10.getChildCount()
            if (r10 <= r3) goto L_0x02bd
            int r10 = r10 - r3
            r11 = 0
        L_0x02b0:
            if (r11 >= r10) goto L_0x02bd
            android.view.ViewGroup r12 = r0.f45514l
            r12.getClass()
            r12.removeViewAt(r11)
            int r11 = r11 + 1
            goto L_0x02b0
        L_0x02bd:
            r10 = 0
        L_0x02be:
            if (r10 >= r3) goto L_0x0433
            com.google.protobuf.cq r11 = r1.f44016b
            java.lang.Object r11 = r11.get(r10)
            com.google.android.libraries.assistant.auto.tng.morris.e.nw r11 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14563nw) r11
            android.view.ViewGroup r12 = r0.f45514l
            r12.getClass()
            android.view.View r12 = r12.getChildAt(r10)
            if (r12 == 0) goto L_0x02d5
            r12 = 1
            goto L_0x02d6
        L_0x02d5:
            r12 = 0
        L_0x02d6:
            if (r12 == 0) goto L_0x02e7
            android.view.ViewGroup r13 = r0.f45514l
            r13.getClass()
            android.view.View r13 = r13.getChildAt(r10)
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            r13.removeAllViews()
            goto L_0x02f6
        L_0x02e7:
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r19)
            r14 = 2131625689(0x7f0e06d9, float:1.8878593E38)
            android.view.ViewGroup r15 = r0.f45514l
            android.view.View r13 = r13.inflate(r14, r15, r9)
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
        L_0x02f6:
            r14 = 0
        L_0x02f7:
            com.google.protobuf.cq r15 = r11.f44032a
            int r15 = r15.size()
            if (r14 >= r15) goto L_0x041f
            com.google.protobuf.cq r15 = r11.f44032a
            java.lang.Object r15 = r15.get(r14)
            com.google.android.libraries.assistant.auto.tng.morris.e.nu r15 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14561nu) r15
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r19)
            int r9 = r15.f44027d
            int r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14560nt.m30640a(r9)
            if (r9 != 0) goto L_0x0314
            r9 = 1
        L_0x0314:
            int r9 = r9 + -2
            if (r9 == r5) goto L_0x0334
            if (r9 == r8) goto L_0x031b
            goto L_0x032f
        L_0x031b:
            com.google.android.libraries.assistant.auto.tng.morris.e.mo r9 = r15.f44028e
            if (r9 != 0) goto L_0x0321
            com.google.android.libraries.assistant.auto.tng.morris.e.mo r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14528mo.f43909f
        L_0x0321:
            int r9 = r9.f43913c
            int r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14527mn.m30632a(r9)
            if (r9 == 0) goto L_0x032f
            if (r9 != r7) goto L_0x032f
            r9 = 2131625686(0x7f0e06d6, float:1.8878587E38)
            goto L_0x0332
        L_0x032f:
            r9 = 2131625690(0x7f0e06da, float:1.8878595E38)
        L_0x0332:
            r8 = 0
            goto L_0x0338
        L_0x0334:
            r9 = 2131625683(0x7f0e06d3, float:1.887858E38)
            goto L_0x0332
        L_0x0338:
            android.view.View r4 = r4.inflate(r9, r13, r8)
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r9 = r0.f45520r
            r8 = 119442(0x1d292, float:1.67374E-40)
            r9.mo21444a(r4, r8)
            r8 = 2131432471(0x7f0b1417, float:1.84867E38)
            android.view.View r8 = r4.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.String r9 = r15.f44024a
            r8.setText(r9)
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r8 = r0.f45520r
            com.google.android.libraries.assistant.auto.tng.morris.g.d.ab r9 = new com.google.android.libraries.assistant.auto.tng.morris.g.d.ab
            r9.<init>(r0, r15, r2)
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            com.google.android.libraries.assistant.auto.tng.morris.c.bc r7 = new com.google.android.libraries.assistant.auto.tng.morris.c.bc
            r7.<init>(r8, r5, r9)
            r4.setOnClickListener(r7)
            r5 = 2131432470(0x7f0b1416, float:1.8486698E38)
            android.view.View r7 = r4.findViewById(r5)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            int r8 = r15.f44027d
            int r8 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14560nt.m30640a(r8)
            if (r8 != 0) goto L_0x0377
            r8 = 1
        L_0x0377:
            int r8 = r8 + -2
            r9 = 2131231540(0x7f080334, float:1.8079164E38)
            switch(r8) {
                case 1: goto L_0x03f3;
                case 2: goto L_0x03e8;
                case 3: goto L_0x03e1;
                case 4: goto L_0x037f;
                case 5: goto L_0x03da;
                case 6: goto L_0x03d3;
                case 7: goto L_0x03cc;
                case 8: goto L_0x0381;
                default: goto L_0x037f;
            }
        L_0x037f:
            goto L_0x03f9
        L_0x0381:
            com.google.android.libraries.assistant.auto.tng.morris.e.mo r7 = r15.f44028e
            if (r7 != 0) goto L_0x0387
            com.google.android.libraries.assistant.auto.tng.morris.e.mo r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14528mo.f43909f
        L_0x0387:
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r8 = r7.f43915e
            if (r8 != 0) goto L_0x0393
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r8 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj.f43456e
        L_0x0393:
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r15 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj.f43456e
            boolean r15 = r8.equals(r15)
            if (r15 == 0) goto L_0x039f
            r5.setImageResource(r9)
            goto L_0x03a6
        L_0x039f:
            android.graphics.Bitmap r8 = com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c.m31983a(r8)
            r5.setImageBitmap(r8)
        L_0x03a6:
            int r5 = r7.f43913c
            int r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14527mn.m30632a(r5)
            if (r5 == 0) goto L_0x03f9
            r8 = 5
            if (r5 != r8) goto L_0x03f9
            com.google.protobuf.fg r5 = r7.f43914d
            if (r5 != 0) goto L_0x03b7
            com.google.protobuf.fg r5 = com.google.protobuf.C63042fg.f170152c
        L_0x03b7:
            long r7 = com.google.protobuf.p4750c.C62953e.m95478c(r5)
            java.lang.String r5 = com.google.android.libraries.assistant.auto.tng.common.p933q.C13337u.m29582a(r2, r7)
            r7 = 2131435214(0x7f0b1ece, float:1.8492264E38)
            android.view.View r7 = r4.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.setText(r5)
            goto L_0x03f9
        L_0x03cc:
            r5 = 2131231755(0x7f08040b, float:1.80796E38)
            r7.setImageResource(r5)
            goto L_0x03f9
        L_0x03d3:
            r5 = 2131231753(0x7f080409, float:1.8079596E38)
            r7.setImageResource(r5)
            goto L_0x03f9
        L_0x03da:
            r5 = 2131231756(0x7f08040c, float:1.8079602E38)
            r7.setImageResource(r5)
            goto L_0x03f9
        L_0x03e1:
            r5 = 2131231754(0x7f08040a, float:1.8079598E38)
            r7.setImageResource(r5)
            goto L_0x03f9
        L_0x03e8:
            r7.setImageResource(r9)
            com.google.android.libraries.assistant.auto.tng.morris.g.f.n r5 = r0.f45519q
            long r8 = r15.f44026c
            r5.mo22210a(r8, r7)
            goto L_0x03f9
        L_0x03f3:
            r5 = 2131233109(0x7f080955, float:1.8082346E38)
            r7.setImageResource(r5)
        L_0x03f9:
            r13.addView(r4)
            if (r14 <= 0) goto L_0x0415
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            android.content.res.Resources r7 = r19.getResources()
            r8 = 2131169159(0x7f070f87, float:1.795264E38)
            int r7 = r7.getDimensionPixelSize(r8)
            r5.setMarginStart(r7)
            r4.setLayoutParams(r5)
        L_0x0415:
            int r14 = r14 + 1
            r4 = 1
            r5 = 4
            r7 = 5
            r8 = 8
            r9 = 0
            goto L_0x02f7
        L_0x041f:
            if (r12 != 0) goto L_0x0429
            android.view.ViewGroup r4 = r0.f45514l
            r4.getClass()
            r4.addView(r13)
        L_0x0429:
            int r10 = r10 + 1
            r4 = 1
            r5 = 4
            r7 = 5
            r8 = 8
            r9 = 0
            goto L_0x02be
        L_0x0433:
            long r3 = r1.f44019e
            r7 = 0
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x044f
            com.google.common.util.concurrent.cz r5 = r0.f45507e
            if (r5 != 0) goto L_0x0452
            com.google.common.util.concurrent.db r5 = r0.f45523u
            com.google.android.libraries.assistant.auto.tng.morris.g.d.z r7 = new com.google.android.libraries.assistant.auto.tng.morris.g.d.z
            r7.<init>(r0, r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.cz r2 = r5.mo29164d(r7, r3, r2)
            r0.f45507e = r2
            goto L_0x0452
        L_0x044f:
            r16.m31750e()
        L_0x0452:
            android.view.View r2 = r0.f45505c
            r2.getClass()
            boolean r3 = r1.f44020f
            r4 = 1
            if (r4 == r3) goto L_0x045f
            r8 = 8
            goto L_0x0460
        L_0x045f:
            r8 = 0
        L_0x0460:
            r2.setVisibility(r8)
            int r2 = r1.f44018d
            int r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14557nq.m30639a(r2)
            if (r4 != 0) goto L_0x046c
            r4 = 1
        L_0x046c:
            int r2 = r4 + -2
            r3 = 1
            if (r2 == r3) goto L_0x0505
            r3 = 2
            if (r2 == r3) goto L_0x04e0
            r3 = 3
            if (r2 == r3) goto L_0x04d0
            r3 = 4
            if (r2 == r3) goto L_0x04c0
            r3 = 5
            if (r2 == r3) goto L_0x04b0
            com.google.common.f.e r2 = f45503a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r6)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r3 = 46005(0xb3b5, float:6.4467E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            switch(r4) {
                case 2: goto L_0x04a8;
                case 3: goto L_0x04a5;
                case 4: goto L_0x04a2;
                case 5: goto L_0x049f;
                case 6: goto L_0x049c;
                case 7: goto L_0x0499;
                default: goto L_0x0496;
            }
        L_0x0496:
            java.lang.String r3 = "UNRECOGNIZED"
            goto L_0x04aa
        L_0x0499:
            java.lang.String r3 = "LOCAL"
            goto L_0x04aa
        L_0x049c:
            java.lang.String r3 = "MEDIA"
            goto L_0x04aa
        L_0x049f:
            java.lang.String r3 = "DESTINATION"
            goto L_0x04aa
        L_0x04a2:
            java.lang.String r3 = "CALLING"
            goto L_0x04aa
        L_0x04a5:
            java.lang.String r3 = "MESSAGING"
            goto L_0x04aa
        L_0x04a8:
            java.lang.String r3 = "UNKNOWN"
        L_0x04aa:
            java.lang.String r4 = "Attempted to log calling AppFlow for invalid immersiveType type: %s"
            r2.mo56389s(r4, r3)
            goto L_0x0514
        L_0x04b0:
            com.google.android.libraries.assistant.auto.tng.morris.c.ag r2 = r0.f45522t
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98050fQ
            com.google.android.libraries.search.b.i.a r3 = r3.mo40813g()
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            r2.mo21411b(r3, r4)
            goto L_0x0514
        L_0x04c0:
            com.google.android.libraries.assistant.auto.tng.morris.c.ag r2 = r0.f45522t
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98051fR
            com.google.android.libraries.search.b.i.a r3 = r3.mo40813g()
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            r2.mo21411b(r3, r4)
            goto L_0x0514
        L_0x04d0:
            com.google.android.libraries.assistant.auto.tng.morris.c.ag r2 = r0.f45522t
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98049fP
            com.google.android.libraries.search.b.i.a r3 = r3.mo40813g()
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            r2.mo21411b(r3, r4)
            goto L_0x0514
        L_0x04e0:
            com.google.android.libraries.assistant.auto.tng.morris.c.ag r2 = r0.f45522t
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98048fO
            com.google.android.libraries.search.b.i.a r3 = r3.mo40813g()
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            r2.mo21411b(r3, r4)
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f45511i
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248927x
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x0514
            com.google.android.libraries.assistant.auto.tng.morris.c.ak r2 = r0.f45510h
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98222ii
            com.google.android.libraries.search.b.i.a r3 = r3.mo40813g()
            r2.mo21421f(r3)
            goto L_0x0514
        L_0x0505:
            com.google.android.libraries.assistant.auto.tng.morris.c.ag r2 = r0.f45522t
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98052fS
            com.google.android.libraries.search.b.i.a r3 = r3.mo40813g()
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            r2.mo21411b(r3, r4)
        L_0x0514:
            r0.f45506d = r1
        L_0x0516:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15169af.mo22045b(com.google.android.libraries.assistant.auto.tng.morris.e.nr, android.view.ViewGroup, android.view.ContextThemeWrapper):void");
    }
}
