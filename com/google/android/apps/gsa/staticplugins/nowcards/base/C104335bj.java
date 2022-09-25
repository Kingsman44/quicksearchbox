package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.sidekick.shared.util.C91992k;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104428ae;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105081r;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105082s;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7536ax;
import com.google.p375ai.p378b.C7848me;
import com.google.p375ai.p378b.C7850mg;
import com.google.p375ai.p378b.C7851mh;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.bj */
/* compiled from: PG */
public final class C104335bj extends TouchInterceptingFrameLayout implements C105081r {

    /* renamed from: c */
    public String f290267c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f290268d = false;

    /* renamed from: e */
    public C104339c f290269e;

    /* renamed from: f */
    public int f290270f = 1;

    /* renamed from: g */
    private final Context f290271g;

    /* renamed from: h */
    private final C89291a f290272h;

    /* renamed from: i */
    private View f290273i;

    /* renamed from: j */
    private View f290274j;

    /* renamed from: k */
    private C7850mg f290275k;

    /* renamed from: l */
    private C7850mg f290276l;

    /* renamed from: m */
    private boolean f290277m = false;

    /* renamed from: n */
    private final C104346j f290278n;

    public C104335bj(Context context, C104346j jVar, C89291a aVar) {
        super(context);
        this.f290271g = context;
        this.f290278n = jVar;
        this.f290272h = aVar;
    }

    /* renamed from: d */
    private static View m172475d(View view) {
        if (view != null) {
            return view.findViewById(R.id.action_icon);
        }
        return null;
    }

    /* renamed from: e */
    private static void m172476e(View view, boolean z) {
        if (z) {
            view.animate().alpha(0.0f).setDuration(200).withEndAction(new C104334bi(view)).start();
            return;
        }
        view.setAlpha(0.0f);
        view.setVisibility(4);
    }

    /* renamed from: f */
    private static void m172477f(View view, boolean z) {
        view.setVisibility(0);
        if (z) {
            view.animate().alpha(1.0f).setDuration(200).start();
        } else {
            view.setAlpha(1.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0152, code lost:
        if ((r13.f31644a & 4) != 0) goto L_0x0156;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0176  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m172478g(android.view.View r12, com.google.p375ai.p378b.C7850mg r13) {
        /*
            r11 = this;
            android.content.Context r0 = r11.f290271g
            com.google.android.apps.gsa.shared.au.b.a r1 = r11.f290272h
            com.google.ai.b.ax r13 = r13.f27516c
            if (r13 != 0) goto L_0x000a
            com.google.ai.b.ax r13 = com.google.p375ai.p378b.C7536ax.f26084o
        L_0x000a:
            r2 = 0
            com.google.android.apps.g.d.ad r13 = com.google.android.apps.gsa.sidekick.shared.util.C91992k.m150979g(r0, r1, r2, r13)
            if (r13 == 0) goto L_0x0186
            com.google.android.apps.gsa.staticplugins.nowcards.base.j r0 = r11.f290278n
            com.google.android.apps.gsa.staticplugins.nowcards.base.l r1 = r0.f290293b
            com.google.android.apps.gsa.staticplugins.nowcards.ui.f r0 = r0.f290292a
            int r3 = r13.f31535a
            r3 = r3 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x0022
            java.lang.String r3 = r13.f31549o
            r11.setContentDescription(r3)
        L_0x0022:
            com.google.android.apps.g.d.b r3 = r13.f31539e
            if (r3 != 0) goto L_0x0028
            com.google.android.apps.g.d.b r3 = com.google.android.apps.p489g.p494d.C9164b.f31642o
        L_0x0028:
            int r3 = r3.f31644a
            r3 = r3 & 8192(0x2000, float:1.14794E-41)
            r4 = 2131432163(0x7f0b12e3, float:1.8486076E38)
            if (r3 == 0) goto L_0x00a2
            android.view.View r3 = r12.findViewById(r4)
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r3 = (com.google.android.apps.gsa.now.shared.p6421ui.RecyclerViewStub) r3
            com.google.android.apps.g.d.b r4 = r13.f31539e
            if (r4 != 0) goto L_0x003e
            com.google.android.apps.g.d.b r5 = com.google.android.apps.p489g.p494d.C9164b.f31642o
            goto L_0x003f
        L_0x003e:
            r5 = r4
        L_0x003f:
            int r5 = r5.f31644a
            r5 = r5 & 32
            if (r5 == 0) goto L_0x0065
            if (r4 != 0) goto L_0x0049
            com.google.android.apps.g.d.b r4 = com.google.android.apps.p489g.p494d.C9164b.f31642o
        L_0x0049:
            int r4 = r4.f31650g
            com.google.android.apps.gsa.sidekick.shared.ui.q r5 = new com.google.android.apps.gsa.sidekick.shared.ui.q
            android.content.Context r6 = r1.f290307b
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131169039(0x7f070f0f, float:1.7952397E38)
            int r6 = r6.getDimensionPixelSize(r7)
            r5.<init>(r4, r6)
            r4 = 15
            r5.mo86641a(r4)
            r1.mo94125r(r3, r5)
        L_0x0065:
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r4 = r1.f290314i
            com.google.android.apps.gsa.now.shared.ui.j r4 = r4.f290349s
            r3.mo76716c(r4)
            r4 = 2131625608(0x7f0e0688, float:1.8878429E38)
            r3.f227323a = r4
            android.view.View r3 = r3.mo76714a()
            r3.setVisibility(r2)
            r4 = 2131427537(0x7f0b00d1, float:1.8476693E38)
            android.view.View r4 = r12.findViewById(r4)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r4 = (com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView) r4
            r5 = 2131432164(0x7f0b12e4, float:1.8486078E38)
            if (r4 == 0) goto L_0x009d
            com.google.android.apps.g.d.b r6 = r13.f31539e
            if (r6 != 0) goto L_0x008c
            com.google.android.apps.g.d.b r6 = com.google.android.apps.p489g.p494d.C9164b.f31642o
        L_0x008c:
            com.google.ai.b.lb r6 = r6.f31657n
            if (r6 != 0) goto L_0x0092
            com.google.ai.b.lb r6 = com.google.p375ai.p378b.C7818lb.f27416n
        L_0x0092:
            com.google.common.b.gu r6 = com.google.common.p4522b.C58485gu.m89846n(r6)
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r7 = r1.f290314i
            com.google.android.apps.gsa.now.shared.ui.j r7 = r7.f290349s
            r4.mo94502d(r0, r6, r7)
        L_0x009d:
            r0 = r3
            r6 = 2131432164(0x7f0b12e4, float:1.8486078E38)
            goto L_0x00a7
        L_0x00a2:
            r3 = 0
            r0 = r3
            r6 = 2131432163(0x7f0b12e3, float:1.8486076E38)
        L_0x00a7:
            com.google.android.apps.g.d.b r3 = r13.f31539e
            if (r3 != 0) goto L_0x00ad
            com.google.android.apps.g.d.b r3 = com.google.android.apps.p489g.p494d.C9164b.f31642o
        L_0x00ad:
            r5 = r3
            r7 = 2131432338(0x7f0b1392, float:1.848643E38)
            r8 = 0
            r3 = r1
            r4 = r12
            com.google.android.apps.gsa.now.shared.ui.RecyclerViewStub r12 = r3.mo94116j(r4, r5, r6, r7, r8)
            if (r12 == 0) goto L_0x0186
            r3 = 2131427518(0x7f0b00be, float:1.8476655E38)
            android.view.View r12 = r12.findViewById(r3)
            boolean r3 = r12 instanceof android.widget.ImageView
            if (r3 == 0) goto L_0x0186
            r3 = r12
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.Context r4 = r1.f290307b
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131170560(0x7f071500, float:1.7955482E38)
            int r4 = r4.getDimensionPixelSize(r5)
            android.content.Context r5 = r1.f290307b
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131170561(0x7f071501, float:1.7955484E38)
            int r5 = r5.getDimensionPixelSize(r6)
            android.content.Context r6 = r1.f290307b
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131170559(0x7f0714ff, float:1.795548E38)
            int r6 = r6.getDimensionPixelSize(r7)
            android.content.Context r7 = r1.f290307b
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131170562(0x7f071502, float:1.7955486E38)
            int r7 = r7.getDimensionPixelSize(r8)
            android.content.Context r8 = r1.f290307b
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131170558(0x7f0714fe, float:1.7955478E38)
            int r8 = r8.getDimensionPixelSize(r9)
            com.google.android.apps.g.d.b r9 = r13.f31539e
            if (r9 != 0) goto L_0x010f
            com.google.android.apps.g.d.b r9 = com.google.android.apps.p489g.p494d.C9164b.f31642o
        L_0x010f:
            int r9 = r9.f31644a
            r9 = r9 & 32
            if (r9 == 0) goto L_0x012f
            android.content.Context r7 = r1.f290307b
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131169040(0x7f070f10, float:1.7952399E38)
            int r7 = r7.getDimensionPixelSize(r8)
            android.content.Context r8 = r1.f290307b
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131169038(0x7f070f0e, float:1.7952395E38)
            int r8 = r8.getDimensionPixelSize(r9)
        L_0x012f:
            android.view.ViewParent r12 = r12.getParent()
            android.view.View r12 = (android.view.View) r12
            int r9 = r13.f31535a
            r9 = r9 & 4
            if (r9 == 0) goto L_0x0155
            com.google.android.apps.g.d.b r13 = r13.f31539e
            if (r13 != 0) goto L_0x0142
            com.google.android.apps.g.d.b r9 = com.google.android.apps.p489g.p494d.C9164b.f31642o
            goto L_0x0143
        L_0x0142:
            r9 = r13
        L_0x0143:
            int r9 = r9.f31644a
            r10 = 1
            r9 = r9 & r10
            if (r9 == 0) goto L_0x014a
            goto L_0x0156
        L_0x014a:
            if (r13 != 0) goto L_0x014e
            com.google.android.apps.g.d.b r13 = com.google.android.apps.p489g.p494d.C9164b.f31642o
        L_0x014e:
            int r13 = r13.f31644a
            r13 = r13 & 4
            if (r13 == 0) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r10 = 0
        L_0x0156:
            if (r0 == 0) goto L_0x0170
            if (r10 == 0) goto L_0x0170
            if (r12 == 0) goto L_0x016c
            android.content.Context r13 = r1.f290307b
            android.content.res.Resources r13 = r13.getResources()
            r1 = 2131170557(0x7f0714fd, float:1.7955476E38)
            int r13 = r13.getDimensionPixelSize(r1)
            r12.setPadding(r2, r2, r13, r2)
        L_0x016c:
            r0.setPadding(r5, r7, r6, r8)
            goto L_0x017b
        L_0x0170:
            if (r0 == 0) goto L_0x0176
            r0.setPadding(r5, r7, r6, r8)
            goto L_0x017b
        L_0x0176:
            if (r12 == 0) goto L_0x017b
            r12.setPadding(r5, r7, r6, r8)
        L_0x017b:
            android.view.ViewGroup$LayoutParams r12 = r3.getLayoutParams()
            r12.width = r4
            r12.height = r4
            r3.setLayoutParams(r12)
        L_0x0186:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.base.C104335bj.m172478g(android.view.View, com.google.ai.b.mg):void");
    }

    /* renamed from: a */
    public final void mo94090a(C7851mh mhVar) {
        C7850mg mgVar;
        C7850mg mgVar2;
        int i = mhVar.f27521a;
        if ((i & 2) != 0) {
            this.f290267c = mhVar.f27524d;
        }
        if ((i & 1) != 0) {
            int a = C7848me.m22878a(mhVar.f27522b);
            if (a == 0) {
                a = 1;
            }
            this.f290270f = a;
            this.f290268d = true;
            for (C7850mg mgVar3 : mhVar.f27523c) {
                if ((mgVar3.f27514a & 1) != 0) {
                    int a2 = C7848me.m22878a(mgVar3.f27515b);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (a2 - 1 != 1) {
                        this.f290276l = mgVar3;
                    } else {
                        this.f290275k = mgVar3;
                    }
                }
            }
            this.f290277m = (this.f290275k == null || this.f290276l == null) ? false : true;
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f290271g).inflate(R.layout.multi_state_icon, (ViewGroup) null);
            if (frameLayout != null) {
                View findViewById = frameLayout.findViewById(R.id.set_action_container);
                this.f290274j = findViewById;
                if (!(findViewById == null || (mgVar2 = this.f290275k) == null)) {
                    m172478g(findViewById, mgVar2);
                }
            }
            if (frameLayout != null) {
                View findViewById2 = frameLayout.findViewById(R.id.default_action_container);
                this.f290273i = findViewById2;
                if (!(findViewById2 == null || (mgVar = this.f290276l) == null)) {
                    m172478g(findViewById2, mgVar);
                }
            }
            if (mo94091b()) {
                setHapticFeedbackEnabled(true);
                setOnTouchListener(new C105082s(this, m172475d(this.f290274j), m172475d(this.f290273i)));
            }
            mo94092c(this.f290270f, true, false, false);
            addView(frameLayout);
        }
    }

    /* renamed from: b */
    public final boolean mo94091b() {
        String str = this.f290267c;
        if (str != null) {
            return str.contains("heart") || this.f290267c.contains("follow");
        }
        return false;
    }

    /* renamed from: c */
    public final void mo94092c(int i, boolean z, boolean z2, boolean z3) {
        C104339c cVar;
        C7850mg mgVar;
        C7850mg mgVar2;
        int i2 = this.f290270f;
        if (i2 != i || z) {
            if (!(i2 == i || (cVar = this.f290269e) == null || (mgVar = this.f290276l) == null || (mgVar2 = this.f290275k) == null)) {
                C7850mg mgVar3 = i2 == 1 ? mgVar : mgVar2;
                if (i != 1) {
                    mgVar = mgVar2;
                }
                C104348l lVar = cVar.f290284a;
                String str = cVar.f290285b;
                C104428ae aeVar = lVar.f290324s;
                aeVar.getClass();
                aeVar.mo94168k(str, mgVar3, mgVar, z3);
            }
            this.f290270f = i;
            boolean z4 = i != 2;
            if (i == 2) {
                View view = this.f290273i;
                if (view != null) {
                    m172476e(view, z2);
                }
                View view2 = this.f290274j;
                if (view2 != null) {
                    m172477f(view2, z2);
                }
                C7850mg mgVar4 = this.f290275k;
                if (!(mgVar4 == null || (mgVar4.f27514a & 2) == 0)) {
                    Context context = this.f290271g;
                    C89291a aVar = this.f290272h;
                    C7536ax axVar = mgVar4.f27516c;
                    if (axVar == null) {
                        axVar = C7536ax.f26084o;
                    }
                    C9141ad g = C91992k.m150979g(context, aVar, false, axVar);
                    if (g != null) {
                        this.f290278n.f290293b.mo94103B(this, g);
                    }
                }
            } else {
                View view3 = this.f290274j;
                if (view3 != null) {
                    m172476e(view3, z2);
                }
                View view4 = this.f290273i;
                if (view4 != null) {
                    m172477f(view4, z2);
                }
                C7850mg mgVar5 = this.f290276l;
                if (!(mgVar5 == null || (mgVar5.f27514a & 2) == 0)) {
                    Context context2 = this.f290271g;
                    C89291a aVar2 = this.f290272h;
                    C7536ax axVar2 = mgVar5.f27516c;
                    if (axVar2 == null) {
                        axVar2 = C7536ax.f26084o;
                    }
                    C9141ad g2 = C91992k.m150979g(context2, aVar2, false, axVar2);
                    if (g2 != null) {
                        this.f290278n.f290293b.mo94103B(this, g2);
                    }
                }
            }
            if (this.f290277m) {
                setSelected(!z4);
            }
            sendAccessibilityEvent(8);
        }
    }

    public final CharSequence getAccessibilityClassName() {
        return true != this.f290277m ? "android.widget.Button" : "android.widget.ToggleButton";
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f290277m) {
            accessibilityNodeInfo.setClassName("android.widget.ToggleButton");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(isSelected());
            return;
        }
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    public final boolean performClick() {
        C7850mg mgVar;
        C7850mg mgVar2;
        boolean performClick = super.performClick();
        int i = this.f290270f;
        if (i == 2) {
            mgVar2 = this.f290275k;
            mgVar = this.f290276l;
        } else {
            mgVar2 = null;
            mgVar = null;
        }
        if (i == 1) {
            mgVar2 = this.f290276l;
            mgVar = this.f290275k;
        }
        if (!(mgVar2 == null || mgVar == null || (mgVar2.f27514a & 4) == 0)) {
            int a = C7848me.m22878a(mgVar2.f27517d);
            if (a == 0) {
                a = 1;
            }
            mo94092c(a, false, true, true);
        }
        return performClick;
    }
}
