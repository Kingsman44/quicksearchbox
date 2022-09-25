package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import androidx.cardview.widget.CardView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88467q;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90003bi;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97088c;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97093h;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97094i;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97106b;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97108d;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97112h;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97113i;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97117m;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97118n;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97119o;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97120p;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97127w;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97128x;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7607c.C97193a;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7609e.C97207b;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7609e.C97208c;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97213a;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97214b;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97218f;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97219g;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97220h;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.view.BackButtonFrameLayout;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.view.BubbleView;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97042e;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7593b.C97037c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p10982ad.C147454r;
import com.google.common.base.C58837ba;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ah */
/* compiled from: PG */
public final class C97136ah implements C97094i, C97138aj, C97137ai {

    /* renamed from: D */
    private static final C97088c f271396D = new C97135ag();

    /* renamed from: a */
    public static final C59071e f271397a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ah");

    /* renamed from: A */
    public final C88473w f271398A;

    /* renamed from: B */
    public final C97113i f271399B;

    /* renamed from: C */
    public final C97225k f271400C;

    /* renamed from: E */
    private final C86124t f271401E;

    /* renamed from: F */
    private boolean f271402F = false;

    /* renamed from: G */
    private final C97093h f271403G;

    /* renamed from: b */
    public final Context f271404b;

    /* renamed from: c */
    public final WindowManager f271405c;

    /* renamed from: d */
    public final DisplayManager f271406d;

    /* renamed from: e */
    public final C97192c f271407e;

    /* renamed from: f */
    public C97088c f271408f = f271396D;

    /* renamed from: g */
    public final C97037c f271409g;

    /* renamed from: h */
    public final C97146ar f271410h;

    /* renamed from: i */
    public final C88467q f271411i;

    /* renamed from: j */
    public final int f271412j;

    /* renamed from: k */
    public final int f271413k;

    /* renamed from: l */
    public C97224j f271414l;

    /* renamed from: m */
    public C97112h f271415m;

    /* renamed from: n */
    public C97117m f271416n;

    /* renamed from: o */
    public C97119o f271417o;

    /* renamed from: p */
    public final C97208c f271418p;

    /* renamed from: q */
    public BackButtonFrameLayout f271419q;

    /* renamed from: r */
    public BubbleView f271420r;

    /* renamed from: s */
    public View f271421s;

    /* renamed from: t */
    public View f271422t;

    /* renamed from: u */
    public CardView f271423u;

    /* renamed from: v */
    public C97214b f271424v = C97214b.f271609c;

    /* renamed from: w */
    public C97193a f271425w;

    /* renamed from: x */
    public boolean f271426x = false;

    /* renamed from: y */
    public final C22871g f271427y;

    /* renamed from: z */
    public C97128x f271428z;

    public C97136ah(Context context, C97192c cVar, C97093h hVar, C97037c cVar2, C97146ar arVar, C88467q qVar, int i, C86124t tVar, C22871g gVar, int i2, C88473w wVar, C97208c cVar3, C97113i iVar, C97225k kVar) {
        this.f271404b = context;
        this.f271405c = (WindowManager) context.getSystemService("window");
        this.f271406d = (DisplayManager) context.getSystemService("display");
        this.f271407e = cVar;
        this.f271403G = hVar;
        this.f271409g = cVar2;
        this.f271410h = arVar;
        this.f271411i = qVar;
        this.f271412j = i;
        this.f271401E = tVar;
        this.f271427y = gVar;
        this.f271413k = i2;
        this.f271398A = wVar;
        this.f271418p = cVar3;
        this.f271399B = iVar;
        this.f271400C = kVar;
    }

    /* renamed from: s */
    private final void m160791s() {
        this.f271419q.animate().alpha(0.0f).withEndAction(new C97134af(this)).start();
        this.f271420r.setVisibility(0);
        this.f271402F = true;
        this.f271414l.f271621d = true;
        this.f271425w.mo90579a();
        mo90519g();
    }

    /* renamed from: t */
    private static void m160792t(View view, boolean z) {
        view.setVisibility(true != z ? 8 : 0);
    }

    /* renamed from: u */
    private final boolean m160793u() {
        BubbleView bubbleView = this.f271420r;
        return bubbleView != null && bubbleView.getVisibility() == 0;
    }

    /* renamed from: v */
    private final boolean m160794v() {
        View view = this.f271421s;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: a */
    public final void mo90460a() {
        C97207b bVar = C97207b.NONE;
        C88467q qVar = C88467q.UNSPECIFIED;
        int i = this.f271403G.f271295g;
        int i2 = i - 1;
        if (i != 0) {
            boolean z = false;
            int i3 = i2 != 2 ? 8 : 0;
            View findViewById = this.f271420r.findViewById(R.id.collapsed_bubble_error_indicator);
            if (findViewById.getVisibility() != i3) {
                findViewById.setVisibility(i3);
                C28292j a = C28295m.m52915a(findViewById);
                C58893dc.m90996a(a);
                if (i3 == 8) {
                    C89949q.m146521e(C28285c.m52879f(a, false), false);
                } else {
                    C89949q.m146521e(C28285c.m52879f(a, true), false);
                }
            }
            View findViewById2 = this.f271421s.findViewById(R.id.extended_bubble_error_indicator);
            int i4 = this.f271403G.f271295g;
            boolean z2 = i4 == 3;
            if (i4 != 0) {
                m160792t(findViewById2, z2);
                View findViewById3 = this.f271420r.findViewById(R.id.loading_indicator);
                if (this.f271403G.f271295g != 0) {
                    m160792t(findViewById3, false);
                    View findViewById4 = this.f271420r.findViewById(R.id.collapsed_content_view);
                    if (this.f271403G.f271295g != 0) {
                        findViewById4.setVisibility(0);
                        View view = this.f271422t;
                        int i5 = this.f271403G.f271295g;
                        boolean z3 = i5 == 3;
                        if (i5 != 0) {
                            C97220h.m160928a(view, z3);
                            BubbleView bubbleView = this.f271420r;
                            int i6 = this.f271403G.f271295g;
                            if (i6 == 3) {
                                z = true;
                            }
                            if (i6 != 0) {
                                C97220h.m160928a(bubbleView, z);
                                return;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo90461b() {
        if (this.f271415m == null || this.f271414l == null || this.f271417o == null) {
            ((C59052c) ((C59052c) f271397a.mo56225c()).mo56372aa(18404)).mo56386p("onExpansionStateChange: called without onCreate()");
            return;
        }
        C97207b bVar = C97207b.NONE;
        C88467q qVar = C88467q.UNSPECIFIED;
        int i = this.f271403G.f271294f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            mo90517e();
        } else if (i2 == 1) {
            this.f271424v = this.f271415m.f271343l.mo90473b();
            this.f271419q.setAlpha(0.0f);
            this.f271419q.setVisibility(0);
            this.f271419q.animate().alpha(1.0f).start();
            C97119o oVar = this.f271417o;
            C97120p pVar = oVar.f271364e;
            pVar.f271367a.removeView(pVar.f271370d);
            pVar.f271367a.removeView(pVar.f271369c);
            WindowManager windowManager = pVar.f271367a;
            View view = pVar.f271370d;
            windowManager.addView(view, view.getLayoutParams());
            WindowManager windowManager2 = pVar.f271367a;
            View view2 = pVar.f271369c;
            windowManager2.addView(view2, view2.getLayoutParams());
            int width = oVar.f271361b.getWidth();
            int width2 = oVar.f271362c.getWidth();
            int height = oVar.f271361b.getHeight();
            int height2 = oVar.f271362c.getHeight();
            C97120p pVar2 = oVar.f271364e;
            pVar2.f271373g.mo124186l(((float) width) / ((float) width2));
            pVar2.f271374h.mo124186l(((float) height) / ((float) height2));
            View view3 = oVar.f271361b;
            view3.getLocationOnScreen(C97219g.f271613a);
            int[] iArr = C97219g.f271613a;
            int i3 = iArr[0];
            int i4 = iArr[1];
            Rect rect = new Rect(i3, i4, view3.getWidth() + i3, view3.getHeight() + i4);
            C97120p pVar3 = oVar.f271364e;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            C97213a aVar = (C97213a) C97219g.m160925a(pVar3.f271368b);
            pVar3.f271371e.mo124186l(exactCenterX - aVar.f271607a);
            pVar3.f271372f.mo124186l(exactCenterY - aVar.f271608b);
            oVar.f271364e.f271375i.mo124186l(0.0f);
            oVar.f271363d.setVisibility(0);
            oVar.f271361b.setVisibility(8);
            oVar.f271361b.post(new C97118n(oVar));
            C97120p pVar4 = oVar.f271364e;
            pVar4.f271373g.mo124179e(1.0f);
            pVar4.f271374h.mo124179e(1.0f);
            C97120p pVar5 = oVar.f271364e;
            pVar5.f271371e.mo124179e(0.0f);
            pVar5.f271372f.mo124179e(0.0f);
            oVar.f271364e.f271375i.mo124179e(1.0f);
            this.f271414l.f271621d = false;
            C97193a aVar2 = this.f271425w;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            aVar2.f271554a.registerReceiver(aVar2, intentFilter);
            C28292j a = C28295m.m52915a(this.f271420r);
            C58893dc.m90996a(a);
            C89949q.m146521e(C28285c.m52879f(a, false), false);
            C28292j a2 = C28295m.m52915a(this.f271422t);
            C58893dc.m90996a(a2);
            C89949q.m146521e(C28285c.m52879f(a2, true), false);
        } else if (i2 == 2) {
            m160791s();
        }
    }

    /* renamed from: c */
    public final void mo90462c() {
        Button button = (Button) this.f271421s.findViewById(R.id.feedback_link);
        String str = this.f271403G.f271291c;
        Context context = this.f271404b;
        if (C58837ba.m90859h(str)) {
            str = context.getResources().getString(R.string.bubble_feedback_link);
        }
        button.setText(str);
    }

    /* renamed from: d */
    public final void mo90463d() {
        Button button = (Button) this.f271421s.findViewById(R.id.bubble_remove_button);
        int visibility = button.getVisibility();
        button.setText(this.f271403G.f271290b);
        m160792t(button, !this.f271403G.f271290b.isEmpty());
        int visibility2 = button.getVisibility();
        if (visibility2 != visibility) {
            C28292j a = C28295m.m52915a(button);
            C58893dc.m90996a(a);
            if (visibility2 == 0) {
                C89949q.m146521e(C28285c.m52879f(a, true), false);
            } else {
                C89949q.m146521e(C28285c.m52879f(a, false), false);
            }
        }
    }

    /* renamed from: e */
    public final void mo90517e() {
        C97214b bVar = this.f271424v;
        m160791s();
        C97112h hVar = this.f271415m;
        hVar.mo90499h(hVar.mo90495d(bVar));
    }

    /* renamed from: f */
    public final void mo90518f() {
        new C90873ag(this.f271407e.mo90575c(), this.f271427y, "graftVisualElementsIntoExtendedBubble", new C97226l(this)).mo85223a(C97237w.f271648a);
    }

    /* renamed from: g */
    public final void mo90519g() {
        this.f271415m.getClass();
        if (this.f271402F) {
            RectF b = C97218f.m160923b(C97219g.m160925a(this.f271406d), this.f271422t.getWidth(), this.f271422t.getHeight());
            C97112h hVar = this.f271415m;
            if (!b.contains(hVar.mo90494c(hVar.f271343l.mo90472a()))) {
                this.f271402F = false;
                this.f271421s.setAlpha(0.0f);
                this.f271421s.post(new C97240z(this));
                C28292j a = C28295m.m52915a(this.f271422t);
                C58893dc.m90996a(a);
                C89949q.m146521e(C28285c.m52879f(a, false), false);
                C28292j a2 = C28295m.m52915a(this.f271420r);
                C58893dc.m90996a(a2);
                C89949q.m146521e(C28285c.m52879f(a2, true), false);
            }
        }
    }

    /* renamed from: h */
    public final void mo90520h() {
        this.f271408f.mo90441b();
    }

    /* renamed from: i */
    public final void mo90521i() {
        if (this.f271414l == null || this.f271415m == null || this.f271417o == null) {
            ((C59052c) ((C59052c) f271397a.mo56225c()).mo56372aa(18394)).mo56386p("onClick: called without onCreate()");
        } else if (m160794v()) {
            this.f271408f.mo90442c();
        } else {
            C89949q.m146521e(C28285c.m52882i(this.f271420r, 5, (Integer) null), false);
            this.f271408f.mo90440a();
            this.f271415m.mo90497f();
        }
    }

    /* renamed from: j */
    public final void mo90522j() {
        if (!this.f271426x) {
            C97042e.m160628d(4, C97042e.m160626b(this.f271398A), this.f271413k);
        }
    }

    /* renamed from: k */
    public final void mo90523k(float f, float f2) {
        if (this.f271414l == null || this.f271415m == null) {
            ((C59052c) ((C59052c) f271397a.mo56225c()).mo56372aa(18398)).mo56386p("onDrag: called without onCreate()");
            return;
        }
        if (m160794v()) {
            this.f271408f.mo90443d();
        } else {
            C97207b a = this.f271418p.mo90536a(this.f271420r);
            if (a == C97207b.NONE) {
                this.f271418p.mo90540e();
            } else {
                this.f271418p.mo90537b(a);
            }
        }
        C97112h hVar = this.f271415m;
        C97213a aVar = new C97213a(f, f2);
        hVar.mo90498g(C97112h.f271335d, aVar);
        if (hVar.f271338g.mo79746e(C90003bi.f246866b)) {
            hVar.f271336e.mo90508b(hVar, hVar.mo90494c(aVar));
        }
    }

    /* renamed from: l */
    public final void mo90524l(float f, float f2) {
        C97214b bVar;
        float f3;
        if (this.f271414l == null || this.f271415m == null) {
            ((C59052c) ((C59052c) f271397a.mo56225c()).mo56372aa(18400)).mo56386p("onDragEnd: called without onCreate()");
            return;
        }
        C97207b a = this.f271418p.mo90536a(this.f271420r);
        mo90525m();
        if (m160793u()) {
            if (a == C97207b.NONE) {
                C97112h hVar = this.f271415m;
                ((C59052c) ((C59052c) C97112h.f271332a.mo56224b()).mo56372aa(18423)).mo56390t("snapToScreenEdgeWithVelocity(%f, %f)", f, f2);
                if (Math.hypot((double) f, (double) f2) < 1500.0d) {
                    bVar = hVar.mo90495d(hVar.f271343l.mo90472a());
                    hVar.mo90499h(bVar);
                } else {
                    float b = f > 0.0f ? hVar.f271343l.f271316b.f397999e + ((float) (hVar.mo90493b() / 2)) : hVar.f271343l.f271316b.f397998d - ((float) (hVar.mo90493b() / 2));
                    C97213a aVar = new C97213a(b, hVar.f271343l.mo90472a().mo90593b() + (((b - hVar.f271343l.mo90472a().mo90592a()) / f) * f2));
                    if (f2 > 0.0f) {
                        f3 = hVar.f271343l.f271317c.f397999e + ((float) (hVar.mo90492a() / 2));
                    } else {
                        f3 = hVar.f271343l.f271317c.f397998d - ((float) (hVar.mo90492a() / 2));
                    }
                    C97214b d = hVar.mo90495d(C97218f.m160924c(C58485gu.m89847o(aVar, new C97213a(hVar.f271343l.mo90472a().mo90592a() + (((f3 - hVar.f271343l.mo90472a().mo90593b()) / f2) * f), f3)), hVar.f271343l.mo90472a()));
                    C97106b bVar2 = hVar.f271343l;
                    C97213a aVar2 = new C97213a(f, f2);
                    C147454r rVar = C97112h.f271334c;
                    C97213a aVar3 = (C97213a) d;
                    bVar2.f271316b.mo124183i(aVar2.f271607a).mo124173c(rVar).mo124174a(aVar3.f271607a);
                    bVar2.f271317c.mo124183i(aVar2.f271608b).mo124173c(rVar).mo124174a(aVar3.f271608b);
                    bVar = d;
                }
                C97112h hVar2 = this.f271415m;
                if (hVar2.f271338g.mo79746e(C90003bi.f246866b)) {
                    hVar2.f271336e.mo90508b(hVar2, hVar2.mo90494c(bVar));
                    hVar2.f271336e.mo90509c(hVar2);
                    return;
                }
                return;
            }
            this.f271415m.mo90497f();
            if (a == C97207b.DROP) {
                C89949q.m146521e(C28285c.m52882i(this.f271420r, 38, (Integer) null), false);
            }
            C97128x xVar = this.f271428z;
            ((C97108d) xVar).f271322a.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).withEndAction(new C97127w(xVar, a)).start();
        }
    }

    /* renamed from: m */
    public final void mo90525m() {
        this.f271418p.mo90538c();
        C97117m mVar = this.f271416n;
        mVar.getClass();
        mVar.mo90504b(1.0f);
    }

    /* renamed from: n */
    public final void mo90526n() {
        this.f271408f.mo90444e();
    }

    /* renamed from: o */
    public final void mo90527o() {
        if (m160793u()) {
            C97117m mVar = this.f271416n;
            mVar.getClass();
            mVar.mo90504b(1.1f);
        }
    }

    /* renamed from: p */
    public final void mo90528p() {
        CardView cardView = this.f271423u;
        if (cardView != null) {
            cardView.setElevation(this.f271407e.mo90578f() ? (float) this.f271404b.getResources().getDimensionPixelSize(R.dimen.collapsed_view_elevation) : 0.0f);
            int i = 0;
            this.f271423u.mo4473c(true != this.f271407e.mo90578f() ? 0 : -1);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f271423u.getLayoutParams();
            if (this.f271407e.mo90578f()) {
                i = this.f271404b.getResources().getDimensionPixelSize(R.dimen.collapsed_view_margin);
            }
            marginLayoutParams.setMargins(i, i, i, i);
            this.f271423u.setLayoutParams(marginLayoutParams);
            C97112h hVar = this.f271415m;
            if (hVar != null) {
                hVar.f271344m = i;
            }
        }
    }

    /* renamed from: q */
    public final void mo90529q() {
        this.f271415m.mo90500i();
        if (!m160794v()) {
            C97112h hVar = this.f271415m;
            hVar.mo90499h(hVar.mo90495d(hVar.f271343l.mo90473b()));
        }
    }

    /* renamed from: r */
    public final boolean mo90530r() {
        return ((long) this.f271412j) >= this.f271401E.mo79743a(C90003bi.f246872h);
    }
}
