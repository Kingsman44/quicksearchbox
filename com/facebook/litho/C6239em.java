package com.facebook.litho;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2061c;
import androidx.p060c.C0981k;
import com.facebook.litho.p325d.C6180a;
import com.facebook.litho.p332h.C6375a;
import com.facebook.p313c.C6032c;
import com.facebook.p313c.C6040e;
import com.facebook.p313c.C6048g;
import com.facebook.p313c.C6050i;
import com.facebook.p313c.C6051j;
import com.facebook.p313c.C6059r;
import com.facebook.p313c.C6060s;
import com.facebook.p313c.C6063v;
import com.facebook.p313c.C6065x;
import com.facebook.p313c.p314a.C6021a;
import com.facebook.p313c.p314a.C6022b;
import com.facebook.p313c.p317d.C6038a;
import com.facebook.p313c.p318e.C6044d;
import com.facebook.yoga.C6570f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.p1729h.C21215m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.litho.em */
/* compiled from: PG */
final class C6239em implements C6050i {

    /* renamed from: w */
    private static final Rect f18431w = new Rect();

    /* renamed from: A */
    private final C6137br f18432A;

    /* renamed from: B */
    private C6048g f18433B;

    /* renamed from: C */
    private C6065x f18434C;

    /* renamed from: a */
    public final C0981k f18435a;

    /* renamed from: b */
    public final C0981k f18436b;

    /* renamed from: c */
    public final Map f18437c;

    /* renamed from: d */
    public boolean f18438d;

    /* renamed from: e */
    public boolean f18439e;

    /* renamed from: f */
    public boolean f18440f;

    /* renamed from: g */
    public final C0981k f18441g = new C0981k(10);

    /* renamed from: h */
    public final LithoView f18442h;

    /* renamed from: i */
    public final Rect f18443i = new Rect();

    /* renamed from: j */
    public final C6237ek f18444j = new C6237ek();

    /* renamed from: k */
    public int f18445k;

    /* renamed from: l */
    public int f18446l;

    /* renamed from: m */
    public int f18447m;

    /* renamed from: n */
    public C6187dg f18448n;

    /* renamed from: o */
    public C6187dg f18449o;

    /* renamed from: p */
    public final C6051j f18450p;

    /* renamed from: q */
    public final C6044d f18451q;

    /* renamed from: r */
    public final C6021a f18452r;

    /* renamed from: s */
    public final Set f18453s;

    /* renamed from: t */
    public C6380he f18454t;

    /* renamed from: u */
    public C6021a f18455u;

    /* renamed from: v */
    public int f18456v;

    /* renamed from: x */
    private long[] f18457x;

    /* renamed from: y */
    private final C6411u f18458y;

    /* renamed from: z */
    private final C6238el f18459z = new C6238el();

    public C6239em(LithoView lithoView) {
        LithoView lithoView2 = lithoView;
        boolean z = C6180a.f18234a;
        this.f18447m = -1;
        this.f18453s = new HashSet();
        this.f18432A = new C6137br();
        this.f18456v = 0;
        this.f18435a = new C0981k(10);
        this.f18436b = new C0981k(10);
        this.f18458y = lithoView2.f17940p;
        this.f18442h = lithoView2;
        this.f18438d = true;
        this.f18437c = C6180a.f18235b ? new HashMap() : null;
        C6383hh hhVar = new C6383hh();
        hhVar.f18891e = C6570f.INHERIT;
        C6051j jVar = new C6051j(C6185de.m16312f(new C6185de((C6248ev) null, hhVar, new C6170cr(), (String) null, lithoView2.f17941q, 0, 0, 0, 0, 0, lithoView.getContext().getResources().getConfiguration().orientation, (C6367gt) null), (C6060s) null, (Map) null), lithoView2, lithoView2);
        jVar.f17807e = new C6198dr(lithoView2);
        this.f18450p = jVar;
        C6044d dVar = C6044d.f17773a;
        this.f18451q = dVar;
        C6021a p = dVar.mo12582p(new C6048g(this));
        this.f18452r = p;
        C6044d.m15544j(p, lithoView2);
        if (!lithoView2.f17935k) {
            C6380he heVar = C6380he.f18885a;
            this.f18454t = heVar;
            mo12639w(heVar);
            this.f18455u = mo12631j(this.f18454t);
        }
    }

    /* renamed from: F */
    static void m16511F(Object obj, C6185de deVar, int i) {
        C6132bm b;
        C6093ad f;
        C6412v d;
        C6092ac e;
        C6410t c;
        C6407q qVar = deVar.f18255e;
        boolean w = C6407q.m17278w(qVar);
        if (C6407q.m17270A(qVar)) {
            View view = (View) obj;
            C6248ev evVar = deVar.f18253c;
            int i2 = 1;
            if (evVar != null) {
                if (!(evVar.mo13099p() == null || (c = m16523c(view)) == null)) {
                    c.f19007a = null;
                }
                if (!(evVar.mo13104u() == null || (e = m16525e(view)) == null)) {
                    e.f17991a = null;
                }
                if (!(evVar.mo13102s() == null || (d = m16524d(view)) == null)) {
                    d.f19022a = null;
                }
                if (!(evVar.mo13033C() == null || (f = m16526f(view)) == null)) {
                    f.f17992a = null;
                }
                if (evVar.mo13101r() != null) {
                    if ((view instanceof C6167co) && (b = ((C6167co) view).mo12667b()) != null) {
                        b.f18150a = null;
                    }
                    C6093ad f2 = m16526f(view);
                    if (f2 != null) {
                        f2.f17993b = null;
                    }
                }
                if (evVar.mo13103t() != null && (view instanceof ComponentHost)) {
                    ((ComponentHost) view).f17848g = null;
                }
                view.setTag((Object) null);
                SparseArray n = evVar.mo13097n();
                if (view instanceof ComponentHost) {
                    ((ComponentHost) view).f17843b = null;
                } else if (n != null) {
                    int size = n.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        view.setTag(n.keyAt(i3), (Object) null);
                    }
                }
                if (evVar.mo13090g() != 0.0f) {
                    C2043bi.m5548ab(view, 0.0f);
                }
                if (evVar.mo13098o() != null) {
                    view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                }
                if (evVar.mo13065ag()) {
                    view.setClipToOutline(false);
                }
                if (!evVar.mo13064af() && (view instanceof ViewGroup)) {
                    ((ViewGroup) view).setClipChildren(true);
                }
                if (!TextUtils.isEmpty(evVar.mo13035E())) {
                    view.setContentDescription((CharSequence) null);
                }
                if (evVar.mo13073ao()) {
                    if (view.getScaleX() != 1.0f) {
                        view.setScaleX(1.0f);
                    }
                    if (view.getScaleY() != 1.0f) {
                        view.setScaleY(1.0f);
                    }
                }
                if (evVar.mo13068aj() && view.getAlpha() != 1.0f) {
                    view.setAlpha(1.0f);
                }
                if (evVar.mo13070al() && view.getRotation() != 0.0f) {
                    view.setRotation(0.0f);
                }
                if (evVar.mo13071am() && view.getRotationX() != 0.0f) {
                    view.setRotationX(0.0f);
                }
                if (evVar.mo13072an() && view.getRotationY() != 0.0f) {
                    view.setRotationY(0.0f);
                }
            }
            view.setClickable(1 == (i & 1));
            view.setLongClickable((i & 2) == 2);
            view.setFocusable((i & 4) == 4);
            view.setEnabled((i & 8) == 8);
            view.setSelected((i & 16) == 16);
            if (deVar.f18258h != 0) {
                C2043bi.m5551ae(view, 0);
            }
            boolean z = view instanceof ComponentHost;
            if (z || view.getTag(R.id.component_node_info) != null) {
                view.setTag(R.id.component_node_info, (Object) null);
                if (!z) {
                    C2043bi.m5526T(view, (C2061c) null);
                }
            }
            C6383hh hhVar = deVar.f18254d;
            if (hhVar != null) {
                if (!(hhVar.f18892f == null && hhVar.f18893g == 0)) {
                    view.setStateListAnimator((StateListAnimator) null);
                }
                if (C6185de.m16310b(deVar.f18257g)) {
                    m16520W(view, hhVar);
                    m16521X(view, hhVar);
                }
                if (!w) {
                    if (hhVar.mo13400b()) {
                        try {
                            view.setPadding(0, 0, 0, 0);
                        } catch (NullPointerException e2) {
                            C6032c.m15511a().mo12567b("From component: ".concat(deVar.f18255e.mo13461q()), e2);
                        }
                    }
                    m16520W(view, hhVar);
                    m16521X(view, hhVar);
                    view.setLayoutDirection(2);
                }
            }
            if ((i & 32) == 0) {
                i2 = -1;
            } else if ((i & 64) == 64) {
                i2 = 2;
            }
            if (i2 != -1) {
                view.setLayerType(i2, (Paint) null);
            }
        }
    }

    /* renamed from: I */
    static boolean m16512I(C6185de deVar, C6185de deVar2, boolean z) {
        int i = deVar.f18264n;
        C6407q qVar = deVar2.f18255e;
        C6407q qVar2 = deVar.f18255e;
        if (C6180a.f18242i && deVar.f18259i != deVar2.f18259i) {
            return true;
        }
        if (qVar2.mo12821al()) {
            Rect rect = deVar.f18256f;
            Rect rect2 = deVar2.f18256f;
            if (!(rect.width() == rect2.width() && rect.height() == rect2.height())) {
                return true;
            }
        }
        if (z) {
            if (i == 1) {
                if (!(qVar instanceof C6134bo) || !(qVar2 instanceof C6134bo)) {
                    return false;
                }
                C6411u uVar = deVar2.f18251a;
                C6411u uVar2 = deVar.f18251a;
                if (qVar.mo12809aC(qVar, qVar2)) {
                    return true;
                }
                return false;
            } else if (i == 2) {
                return true;
            }
        }
        C6411u uVar3 = deVar2.f18251a;
        C6411u uVar4 = deVar.f18251a;
        return qVar.mo12809aC(qVar, qVar2);
    }

    /* renamed from: P */
    private final void m16513P(C6051j jVar, C6407q qVar, Object obj) {
        C6063v vVar = jVar.f17806d.f17827b;
        qVar.mo12798Q(m16522Y(qVar), obj);
        this.f18432A.mo13116a(qVar, obj);
        jVar.f17805c = true;
    }

    /* renamed from: Q */
    private static void m16514Q(C6051j jVar) {
        m16511F(jVar.f17803a, ((C6201du) jVar.f17806d.f17827b).f18345a, C6198dr.m16449b(jVar).f18340a);
    }

    /* renamed from: R */
    private static void m16515R(View view, boolean z) {
        C6349gb.m17045a();
        if (view instanceof LithoView) {
            LithoView lithoView = (LithoView) view;
            if (!lithoView.mo12732F()) {
                return;
            }
            if (!z) {
                lithoView.mo12593v(new Rect(0, 0, view.getWidth(), view.getHeight()), false);
            } else {
                lithoView.mo12649u();
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m16515R(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* renamed from: S */
    private static void m16516S(C6051j jVar) {
        m16529z(jVar.f17803a, ((C6201du) jVar.f17806d.f17827b).f18345a);
    }

    /* renamed from: T */
    private static void m16517T(View view, C6383hh hhVar) {
        Drawable drawable = hhVar.f18887a;
        if (drawable != null) {
            view.setBackground(drawable);
        }
    }

    /* renamed from: U */
    private static void m16518U(View view, C6383hh hhVar) {
        Drawable drawable = hhVar.f18888b;
        if (drawable != null) {
            view.setForeground(drawable);
        }
    }

    /* renamed from: V */
    private final void m16519V(C6051j jVar, C6407q qVar, Object obj) {
        C6063v vVar = jVar.f17806d.f17827b;
        this.f18432A.mo13117b(qVar, obj);
        qVar.mo12813ad(m16522Y(qVar), obj);
        jVar.f17805c = false;
    }

    /* renamed from: W */
    private static void m16520W(View view, C6383hh hhVar) {
        if (hhVar.f18887a != null) {
            view.setBackground((Drawable) null);
        }
    }

    /* renamed from: X */
    private static void m16521X(View view, C6383hh hhVar) {
        if (hhVar.f18888b != null) {
            view.setForeground((Drawable) null);
        }
    }

    /* renamed from: Y */
    private final C6411u m16522Y(C6407q qVar) {
        C6411u uVar = qVar.f18995r;
        return uVar == null ? this.f18458y : uVar;
    }

    /* renamed from: c */
    static C6410t m16523c(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).f17844c;
        }
        return (C6410t) view.getTag(R.id.component_click_listener);
    }

    /* renamed from: d */
    static C6412v m16524d(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).f17846e;
        }
        return (C6412v) view.getTag(R.id.component_focus_change_listener);
    }

    /* renamed from: e */
    static C6092ac m16525e(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).f17845d;
        }
        return (C6092ac) view.getTag(R.id.component_long_click_listener);
    }

    /* renamed from: f */
    static C6093ad m16526f(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).f17847f;
        }
        return (C6093ad) view.getTag(R.id.component_touch_listener);
    }

    /* renamed from: r */
    public static void m16527r(C6051j jVar, boolean z) {
        if (C6407q.m17270A(((C6201du) jVar.f17806d.f17827b).f18345a.f18255e)) {
            m16515R((View) jVar.f17803a, z);
        }
    }

    /* renamed from: x */
    static void m16528x(View view, C6093ad adVar) {
        if (view instanceof ComponentHost) {
            ComponentHost componentHost = (ComponentHost) view;
            componentHost.f17847f = adVar;
            componentHost.setOnTouchListener(adVar);
            return;
        }
        view.setOnTouchListener(adVar);
        view.setTag(R.id.component_touch_listener, adVar);
    }

    /* renamed from: z */
    static void m16529z(Object obj, C6185de deVar) {
        C6407q qVar = deVar.f18255e;
        if (C6407q.m17270A(qVar)) {
            View view = (View) obj;
            C6248ev evVar = deVar.f18253c;
            int i = 2;
            if (evVar != null) {
                C6154cb p = evVar.mo13099p();
                if (p != null) {
                    C6410t c = m16523c(view);
                    if (c == null) {
                        c = new C6410t();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost = (ComponentHost) view;
                            componentHost.f17844c = c;
                            componentHost.setOnClickListener(c);
                        } else {
                            view.setOnClickListener(c);
                            view.setTag(R.id.component_click_listener, c);
                        }
                    }
                    c.f19007a = p;
                    view.setClickable(true);
                }
                C6154cb u = evVar.mo13104u();
                if (u != null) {
                    C6092ac e = m16525e(view);
                    if (e == null) {
                        e = new C6092ac();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost2 = (ComponentHost) view;
                            componentHost2.f17845d = e;
                            componentHost2.setOnLongClickListener(e);
                        } else {
                            view.setOnLongClickListener(e);
                            view.setTag(R.id.component_long_click_listener, e);
                        }
                    }
                    e.f17991a = u;
                    view.setLongClickable(true);
                }
                C6154cb s = evVar.mo13102s();
                if (s != null) {
                    C6412v d = m16524d(view);
                    if (d == null) {
                        d = new C6412v();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost3 = (ComponentHost) view;
                            componentHost3.f17846e = d;
                            componentHost3.setOnFocusChangeListener(d);
                        } else {
                            view.setOnFocusChangeListener(d);
                            view.setTag(R.id.component_focus_change_listener, d);
                        }
                    }
                    d.f19022a = s;
                }
                C6154cb C = evVar.mo13033C();
                if (C != null) {
                    C6093ad f = m16526f(view);
                    if (f == null) {
                        f = new C6093ad();
                        m16528x(view, f);
                    }
                    f.f17992a = C;
                }
                C6154cb r = evVar.mo13101r();
                if (r != null) {
                    if (view instanceof C6167co) {
                        C6167co coVar = (C6167co) view;
                        C6132bm b = coVar.mo12667b();
                        if (b == null) {
                            b = new C6132bm();
                            coVar.mo12684m(b);
                        }
                        b.f18150a = r;
                    } else {
                        C6093ad f2 = m16526f(view);
                        if (f2 == null) {
                            f2 = new C6093ad();
                            m16528x(view, f2);
                        }
                        f2.f17993b = r;
                    }
                }
                C6154cb t = evVar.mo13103t();
                if (t != null && (view instanceof ComponentHost)) {
                    ((ComponentHost) view).f17848g = t;
                }
                boolean z = view instanceof ComponentHost;
                if (z || evVar.mo13074ap()) {
                    view.setTag(R.id.component_node_info, evVar);
                }
                view.setTag(evVar.mo13036F());
                SparseArray n = evVar.mo13097n();
                if (n != null) {
                    if (z) {
                        ((ComponentHost) view).f17843b = n;
                    } else {
                        int size = n.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            view.setTag(n.keyAt(i2), n.valueAt(i2));
                        }
                    }
                }
                float g = evVar.mo13090g();
                if (g != 0.0f) {
                    C2043bi.m5548ab(view, g);
                }
                ViewOutlineProvider o = evVar.mo13098o();
                if (o != null) {
                    view.setOutlineProvider(o);
                }
                if (evVar.mo13065ag()) {
                    view.setClipToOutline(true);
                }
                if (evVar.mo13069ak() && (view instanceof ViewGroup)) {
                    ((ViewGroup) view).setClipChildren(evVar.mo13064af());
                }
                CharSequence E = evVar.mo13035E();
                if (!TextUtils.isEmpty(E)) {
                    view.setContentDescription(E);
                }
                int l = evVar.mo13095l();
                if (l == 1) {
                    view.setFocusable(true);
                } else if (l == 2) {
                    view.setFocusable(false);
                }
                int i3 = evVar.mo13092i();
                if (i3 == 1) {
                    view.setClickable(true);
                } else if (i3 == 2) {
                    view.setClickable(false);
                }
                int j = evVar.mo13093j();
                if (j == 1) {
                    view.setEnabled(true);
                } else if (j == 2) {
                    view.setEnabled(false);
                }
                int m = evVar.mo13096m();
                if (m == 1) {
                    view.setSelected(true);
                } else if (m == 2) {
                    view.setSelected(false);
                }
                if (evVar.mo13073ao()) {
                    float f3 = evVar.mo13089f();
                    view.setScaleX(f3);
                    view.setScaleY(f3);
                }
                if (evVar.mo13068aj()) {
                    view.setAlpha(evVar.mo13085b());
                }
                if (evVar.mo13070al()) {
                    view.setRotation(evVar.mo13086c());
                }
                if (evVar.mo13071am()) {
                    view.setRotationX(evVar.mo13087d());
                }
                if (evVar.mo13072an()) {
                    view.setRotationY(evVar.mo13088e());
                }
                C2043bi.m5561ao(view, evVar.mo13038H());
            }
            int i4 = deVar.f18258h;
            if (i4 != 0) {
                C2043bi.m5551ae(view, i4);
            }
            C6383hh hhVar = deVar.f18254d;
            if (hhVar != null) {
                boolean w = C6407q.m17278w(qVar);
                int i5 = hhVar.f18894h;
                if (i5 != -1) {
                    view.setLayerType(i5, hhVar.f18895i);
                }
                StateListAnimator stateListAnimator = hhVar.f18892f;
                int i6 = hhVar.f18893g;
                if (!(stateListAnimator == null && i6 == 0)) {
                    if (stateListAnimator == null) {
                        stateListAnimator = AnimatorInflater.loadStateListAnimator(view.getContext(), i6);
                    }
                    view.setStateListAnimator(stateListAnimator);
                }
                if (C6185de.m16310b(deVar.f18257g)) {
                    m16517T(view, hhVar);
                    m16518U(view, hhVar);
                    if (w) {
                        view.setPadding(0, 0, 0, 0);
                        return;
                    }
                } else if (w) {
                    return;
                }
                m16517T(view, hhVar);
                if (hhVar.mo13400b()) {
                    Rect rect = hhVar.f18889c;
                    int i7 = rect != null ? rect.left : 0;
                    Rect rect2 = hhVar.f18889c;
                    int i8 = rect2 != null ? rect2.top : 0;
                    Rect rect3 = hhVar.f18889c;
                    int i9 = rect3 != null ? rect3.right : 0;
                    Rect rect4 = hhVar.f18889c;
                    view.setPadding(i7, i8, i9, rect4 != null ? rect4.bottom : 0);
                }
                m16518U(view, hhVar);
                C6570f fVar = C6570f.INHERIT;
                int ordinal = hhVar.f18891e.ordinal();
                if (ordinal == 1) {
                    i = 0;
                } else if (ordinal == 2) {
                    i = 1;
                }
                view.setLayoutDirection(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo13221A() {
        C6349gb.m17045a();
        long[] jArr = this.f18457x;
        if (jArr != null) {
            int length = jArr.length;
            for (int i = 0; i < length; i++) {
                C6051j g = mo13230g(i);
                if (g != null && g.f17805c) {
                    m16519V(g, ((C6201du) g.f17806d.f17827b).f18345a.f18255e, g.f17803a);
                }
            }
            C6044d.m15543h(this.f18452r);
            C6044d.m15543h(this.f18452r);
            if (this.f18454t != null) {
                this.f18455u.mo12571c();
            }
        }
    }

    /* renamed from: B */
    public final void mo12623B(C6051j jVar) {
        C6185de deVar = ((C6201du) jVar.f17806d.f17827b).f18345a;
        long j = deVar.f18263m;
        m16514Q(jVar);
        C6407q qVar = ((C6201du) jVar.f17806d.f17827b).f18345a.f18255e;
        Object obj = jVar.f17803a;
        C6411u Y = m16522Y(qVar);
        if (jVar.f17805c) {
            m16519V(jVar, qVar, obj);
        }
        qVar.mo12814ae(Y, obj);
        C6380he heVar = this.f18454t;
        if (heVar != null) {
            C6021a aVar = this.f18455u;
            C6063v vVar = jVar.f17806d.f17827b;
            Object obj2 = jVar.f17803a;
            heVar.mo12576c(aVar, vVar, deVar);
        } else {
            C6048g gVar = this.f18433B;
            if (gVar != null) {
                C6063v vVar2 = jVar.f17806d.f17827b;
                Object obj3 = jVar.f17803a;
                gVar.mo12619i();
            }
        }
        try {
            C6198dr b = C6198dr.m16449b(jVar);
            Context context = this.f18458y.f19009b;
            C6185de deVar2 = ((C6201du) jVar.f17806d.f17827b).f18345a;
            C6407q qVar2 = deVar2.f18255e;
            if (!b.f18341b) {
                Object obj4 = jVar.f17803a;
                C6236ej e = C6105ap.m15889e(context, qVar2);
                if (e != null) {
                    e.mo13113b(obj4);
                }
                b.f18341b = true;
                b.f18342c = "unmountItem";
                return;
            }
            String q = qVar2.mo13461q();
            String str = deVar2.f18252b;
            String E = C6407q.m17273E(qVar2);
            String valueOf = String.valueOf(deVar2.f18260j);
            String str2 = b.f18342c;
            throw new C6197dq("Releasing released mount content! component: " + q + ", globalKey: " + E + ", transitionId: " + valueOf + ", previousReleaseCause: " + str2);
        } catch (C6197dq e2) {
            String message = e2.getMessage();
            String m = mo13231m(jVar);
            throw new RuntimeException(message + " " + m);
        }
    }

    /* renamed from: C */
    public final void mo12624C() {
        C6349gb.m17045a();
        long[] jArr = this.f18457x;
        if (jArr != null) {
            int length = jArr.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                mo13222D(length, this.f18441g);
            }
            this.f18443i.setEmpty();
            this.f18440f = true;
            C6048g gVar = this.f18433B;
            if (gVar != null) {
                gVar.mo12616f();
            }
            this.f18451q.mo12580g(this.f18452r);
            C6380he heVar = this.f18454t;
            if (heVar != null) {
                C6021a aVar = this.f18455u;
                aVar.mo12571c();
                heVar.mo13396h(aVar);
            }
            mo13232o();
            C6044d.m15543h(this.f18452r);
        }
    }

    /* renamed from: D */
    public final void mo13222D(int i, C0981k kVar) {
        int i2 = i;
        C0981k kVar2 = kVar;
        C6051j g = mo13230g(i);
        long nanoTime = System.nanoTime();
        if (g != null) {
            long j = this.f18457x[i2];
            if (j == 0) {
                m16514Q(g);
                return;
            }
            this.f18435a.mo3683j(j);
            Object obj = g.f17803a;
            C6065x xVar = this.f18434C;
            boolean z = false;
            if (xVar != null && xVar.mo12661m(this.f18433B.f17799c, g)) {
                z = true;
            }
            int i3 = -1;
            if ((obj instanceof ComponentHost) && !(obj instanceof LithoView)) {
                ComponentHost componentHost = (ComponentHost) obj;
                int a = componentHost.mo12601a() - 1;
                while (a >= 0) {
                    C6051j c = componentHost.mo12602c(a);
                    if (this.f18435a.mo3674b(c) == i3) {
                        C6185de deVar = ((C6201du) c.f17806d.f17827b).f18345a;
                        C6106aq.m15891b(2, "UnmountItem:ChildNotFound", "Child of mount item not found in MountSate mIndexToItemMap, child_component: " + deVar.f18255e.mo13461q() + ", child_transitionId: " + String.valueOf(deVar.f18260j));
                    }
                    C0981k kVar3 = this.f18435a;
                    long d = kVar3.mo3677d(kVar3.mo3674b(c));
                    int length = this.f18457x.length - 1;
                    while (true) {
                        if (length < 0) {
                            break;
                        } else if (this.f18457x[length] == d) {
                            mo13222D(length, kVar2);
                            break;
                        } else {
                            length--;
                        }
                    }
                    a--;
                    i3 = -1;
                }
                if (!z && componentHost.mo12601a() > 0) {
                    C6185de deVar2 = ((C6201du) g.f17806d.f17827b).f18345a;
                    C6106aq.m15891b(2, "UnmountItem:ChildsNotUnmounted", "Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState, component: " + deVar2.f18255e.mo13461q() + ", transitionId: " + String.valueOf(deVar2.f18260j));
                    throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                }
            }
            ComponentHost componentHost2 = (ComponentHost) g.f17804b;
            C6407q qVar = ((C6201du) g.f17806d.f17827b).f18345a.f18255e;
            if (qVar.mo12817ah()) {
                this.f18436b.mo3683j(this.f18457x[i2]);
            }
            if (C6407q.m17278w(qVar)) {
                kVar2.mo3684k(kVar2.mo3674b((ComponentHost) obj));
            }
            if (z) {
                this.f18434C.mo12660k(this.f18433B.f17799c, g, componentHost2);
            } else {
                if (obj instanceof C6169cq) {
                    ArrayList arrayList = new ArrayList();
                    ((C6169cq) obj).mo13143a(arrayList);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((LithoView) arrayList.get(size)).mo12731D();
                    }
                }
                componentHost2.mo12606p(i2, g);
                mo12623B(g);
            }
            C6237ek ekVar = this.f18444j;
            if (ekVar.f18426n) {
                List list = ekVar.f18419g;
                double nanoTime2 = (double) (System.nanoTime() - nanoTime);
                Double.isNaN(nanoTime2);
                list.add(Double.valueOf(nanoTime2 / 1000000.0d));
                this.f18444j.f18414b.add(qVar.mo13461q());
                this.f18444j.f18423k++;
            }
        }
    }

    /* renamed from: E */
    public final void mo12625E(C6022b bVar) {
        C6048g gVar = this.f18433B;
        if (gVar != null) {
            gVar.mo12617g(bVar);
        }
    }

    /* renamed from: G */
    public final boolean mo13223G(C6060s sVar) {
        if (this.f18454t == null) {
            return false;
        }
        C6021a aVar = this.f18455u;
        if (aVar != null) {
            return aVar.mo12573e(((C6201du) sVar.f17827b).f18345a.f18263m);
        }
        throw new IllegalStateException("Need a state when using the TransitionsExtension.");
    }

    /* renamed from: H */
    public final boolean mo12626H() {
        C6349gb.m17045a();
        return this.f18440f;
    }

    /* renamed from: J */
    public final void mo13224J(C6051j jVar) {
        C6380he heVar = this.f18454t;
        if (heVar != null) {
            C6021a aVar = this.f18455u;
            C6060s sVar = jVar.f17806d;
            C6063v vVar = sVar.f17827b;
            Object obj = jVar.f17803a;
            Object obj2 = sVar.f17828c;
            heVar.mo12581n(aVar, vVar, obj);
            return;
        }
        C6048g gVar = this.f18433B;
        if (gVar != null) {
            C6060s sVar2 = jVar.f17806d;
            C6063v vVar2 = sVar2.f17827b;
            Object obj3 = jVar.f17803a;
            Object obj4 = sVar2.f17828c;
            gVar.mo12621k(vVar2, obj3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo13225K(C6187dg dgVar) {
        C6349gb.m17045a();
        if (dgVar != null) {
            this.f18448n = dgVar;
            if (this.f18439e) {
                C6106aq.m15891b(3, "MountState:InvalidReentrantMounts", "Trying to mount while already mounting! ".concat(mo13231m(this.f18450p)));
            }
            this.f18439e = true;
            ComponentTree componentTree = this.f18442h.f17938n;
            C21215m m = componentTree.f17907j.mo13475m();
            int i = dgVar.f18315t;
            C6261fd fdVar = null;
            if (i != this.f18447m) {
                this.f18449o = null;
            }
            if (m != null) {
                C6411u uVar = componentTree.f17907j;
                fdVar = C6231ee.m16500a(uVar, m, m.mo26269a(uVar, 6));
            }
            if (fdVar != null) {
                fdVar.mo13236b("PREPARE_MOUNT_START");
            }
            mo13229O(dgVar);
            if (fdVar != null) {
                fdVar.mo13236b("PREPARE_MOUNT_END");
            }
            this.f18444j.mo13220b();
            if (fdVar != null && C21215m.m39905d(fdVar)) {
                this.f18444j.mo13219a();
            }
            int a = dgVar.mo12597a();
            for (int i2 = 0; i2 < a; i2++) {
                C6060s d = dgVar.mo12598d(i2);
                C6185de deVar = ((C6201du) d.f17827b).f18345a;
                C6407q qVar = deVar.f18255e;
                C6051j g = mo13230g(i2);
                C6048g gVar = this.f18433B;
                if (gVar != null && !gVar.mo12620j(d)) {
                    if (g != null) {
                        mo13222D(i2, this.f18441g);
                    }
                } else if (g == null) {
                    mo13233s(i2, d, deVar, dgVar);
                    mo13224J(mo13230g(i2));
                } else {
                    C6187dg dgVar2 = this.f18449o;
                    boolean z = dgVar2 != null && dgVar2.f18316u == dgVar.f18317v;
                    long nanoTime = System.nanoTime();
                    boolean M = mo13227M(d, g, z);
                    C6237ek ekVar = this.f18444j;
                    if (ekVar.f18426n) {
                        if (M) {
                            ekVar.f18415c.add(qVar.mo13461q());
                            List list = this.f18444j.f18420h;
                            double nanoTime2 = (double) (System.nanoTime() - nanoTime);
                            Double.isNaN(nanoTime2);
                            list.add(Double.valueOf(nanoTime2 / 1000000.0d));
                            this.f18444j.f18424l++;
                        } else {
                            ekVar.f18425m++;
                        }
                    }
                }
            }
            this.f18438d = false;
            this.f18440f = false;
            this.f18447m = i;
            this.f18449o = dgVar;
            if (fdVar != null) {
                mo13228N(fdVar);
            }
            C6375a.m17086a();
            this.f18439e = false;
            return;
        }
        throw new IllegalStateException("Trying to mount a null layoutState");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo13226L(Rect rect, boolean z) {
        if (z) {
            this.f18451q.mo12577d(this.f18452r);
        } else {
            this.f18451q.mo12610i(this.f18452r, rect);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        if (r10 == null) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010c  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13227M(com.facebook.p313c.C6060s r20, com.facebook.p313c.C6051j r21, boolean r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            com.facebook.c.v r3 = r1.f17827b
            com.facebook.litho.du r3 = (com.facebook.litho.C6201du) r3
            com.facebook.litho.de r3 = r3.f18345a
            com.facebook.litho.q r4 = r3.f18255e
            com.facebook.c.s r5 = r2.f17806d
            com.facebook.c.v r5 = r5.f17827b
            com.facebook.litho.du r5 = (com.facebook.litho.C6201du) r5
            com.facebook.litho.de r5 = r5.f18345a
            com.facebook.litho.q r6 = r5.f18255e
            java.lang.Object r7 = r2.f17803a
            com.facebook.c.e r8 = r2.f17804b
            com.facebook.litho.ComponentHost r8 = (com.facebook.litho.ComponentHost) r8
            r9 = r22
            boolean r9 = m16512I(r3, r5, r9)
            r11 = 1
            if (r9 != 0) goto L_0x0098
            com.facebook.litho.hh r12 = r3.f18254d
            com.facebook.litho.hh r13 = r5.f18254d
            r14 = 0
            if (r13 != 0) goto L_0x0031
            if (r12 != 0) goto L_0x0098
            r12 = r14
        L_0x0031:
            if (r13 == 0) goto L_0x0083
            if (r13 != r12) goto L_0x0036
            goto L_0x0083
        L_0x0036:
            if (r12 != 0) goto L_0x003a
            goto L_0x0098
        L_0x003a:
            android.graphics.drawable.Drawable r15 = r13.f18887a
            android.graphics.drawable.Drawable r10 = r12.f18887a
            boolean r10 = com.facebook.litho.p328f.C6257d.m16805a(r15, r10)
            if (r10 != 0) goto L_0x0045
            goto L_0x0098
        L_0x0045:
            android.graphics.drawable.Drawable r10 = r13.f18888b
            android.graphics.drawable.Drawable r15 = r12.f18888b
            boolean r10 = com.facebook.litho.p328f.C6257d.m16805a(r10, r15)
            if (r10 != 0) goto L_0x0050
            goto L_0x0098
        L_0x0050:
            android.graphics.Rect r10 = r13.f18889c
            android.graphics.Rect r15 = r12.f18889c
            boolean r10 = com.facebook.litho.C6404n.m17223b(r10, r15)
            if (r10 != 0) goto L_0x005b
            goto L_0x0098
        L_0x005b:
            android.graphics.Rect r10 = r13.f18890d
            android.graphics.Rect r15 = r12.f18890d
            boolean r10 = com.facebook.litho.C6404n.m17223b(r10, r15)
            if (r10 != 0) goto L_0x0066
            goto L_0x0098
        L_0x0066:
            com.facebook.yoga.f r10 = r13.f18891e
            com.facebook.yoga.f r15 = r12.f18891e
            boolean r10 = com.facebook.litho.C6404n.m17223b(r10, r15)
            if (r10 != 0) goto L_0x0071
            goto L_0x0098
        L_0x0071:
            int r10 = r13.f18893g
            int r15 = r12.f18893g
            if (r10 == r15) goto L_0x0078
            goto L_0x0098
        L_0x0078:
            android.animation.StateListAnimator r10 = r13.f18892f
            android.animation.StateListAnimator r12 = r12.f18892f
            boolean r10 = com.facebook.litho.C6404n.m17223b(r10, r12)
            if (r10 != 0) goto L_0x0083
            goto L_0x0098
        L_0x0083:
            com.facebook.litho.ev r10 = r3.f18253c
            com.facebook.litho.ev r12 = r5.f18253c
            if (r12 != 0) goto L_0x008c
            if (r10 != 0) goto L_0x0098
            goto L_0x008d
        L_0x008c:
            r14 = r10
        L_0x008d:
            if (r12 == 0) goto L_0x0096
            boolean r10 = r12.mo13057a(r14)
            if (r10 != 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r10 = 0
            goto L_0x0099
        L_0x0098:
            r10 = 1
        L_0x0099:
            if (r10 == 0) goto L_0x009e
            m16514Q(r21)
        L_0x009e:
            boolean r12 = r2.f17805c
            if (r12 == 0) goto L_0x00a7
            java.lang.Object r12 = r2.f17803a
            r0.m16519V(r2, r6, r12)
        L_0x00a7:
            r2.f17806d = r1
            if (r9 == 0) goto L_0x00c5
            com.facebook.litho.q r1 = r3.f18255e
            com.facebook.litho.q r6 = r5.f18255e
            boolean r12 = com.facebook.litho.C6407q.m17278w(r1)
            if (r12 != 0) goto L_0x00c5
            java.lang.Object r12 = r2.f17803a
            com.facebook.litho.u r13 = r0.m16522Y(r6)
            r6.mo12814ae(r13, r12)
            com.facebook.litho.u r6 = r0.m16522Y(r1)
            r1.mo12800T(r6, r12)
        L_0x00c5:
            if (r10 == 0) goto L_0x00ca
            m16516S(r21)
        L_0x00ca:
            r0.m16513P(r2, r4, r7)
            long r12 = r3.f18263m
            r14 = 0
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x00d6
            goto L_0x0106
        L_0x00d6:
            android.graphics.Rect r1 = f18431w
            r3.mo13156e(r1)
            com.facebook.litho.q r3 = r3.f18255e
            boolean r3 = com.facebook.litho.C6407q.m17270A(r3)
            if (r3 == 0) goto L_0x00f0
            java.lang.Object r3 = r2.f17803a
            android.view.View r3 = (android.view.View) r3
            boolean r3 = r3.isLayoutRequested()
            if (r3 == 0) goto L_0x00f0
            r18 = 1
            goto L_0x00f2
        L_0x00f0:
            r18 = 0
        L_0x00f2:
            java.lang.Object r3 = r2.f17803a
            int r12 = r1.left
            int r13 = r1.top
            int r14 = r1.right
            int r15 = r1.bottom
            com.facebook.litho.C6349gb.m17045a()
            r16 = 0
            r17 = r3
            com.facebook.p313c.p317d.C6038a.m15531c(r12, r13, r14, r15, r16, r17, r18)
        L_0x0106:
            java.lang.Object r1 = r2.f17803a
            boolean r1 = r1 instanceof android.graphics.drawable.Drawable
            if (r1 == 0) goto L_0x0115
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            int r1 = r5.f18257g
            com.facebook.litho.ev r2 = r5.f18253c
            com.facebook.litho.C6563y.m17863b(r8, r7, r1, r2)
        L_0x0115:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6239em.mo13227M(com.facebook.c.s, com.facebook.c.j, boolean):boolean");
    }

    /* renamed from: N */
    public final void mo13228N(C6261fd fdVar) {
        C6237ek ekVar = this.f18444j;
        if (!ekVar.f18426n) {
            C21215m.m39904c(fdVar);
        } else if (ekVar.f18422j == 0 || ekVar.f18413a.isEmpty()) {
            C21215m.m39904c(fdVar);
        } else {
            String[] strArr = (String[]) this.f18444j.f18413a.toArray(new String[0]);
            Double[] dArr = (Double[]) this.f18444j.f18418f.toArray(new Double[0]);
            String[] strArr2 = (String[]) this.f18444j.f18414b.toArray(new String[0]);
            Double[] dArr2 = (Double[]) this.f18444j.f18419g.toArray(new Double[0]);
            String[] strArr3 = (String[]) this.f18444j.f18417e.toArray(new String[0]);
            String[] strArr4 = (String[]) this.f18444j.f18415c.toArray(new String[0]);
            Double[] dArr3 = (Double[]) this.f18444j.f18420h.toArray(new Double[0]);
            String[] strArr5 = (String[]) this.f18444j.f18416d.toArray(new String[0]);
            Double[] dArr4 = (Double[]) this.f18444j.f18421i.toArray(new Double[0]);
            C21215m.m39906e(fdVar);
        }
    }

    /* renamed from: a */
    public final int mo12627a() {
        return this.f18435a.mo3675c();
    }

    /* renamed from: b */
    public final int mo12628b() {
        C6349gb.m17045a();
        long[] jArr = this.f18457x;
        if (jArr == null) {
            return 0;
        }
        return jArr.length;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C6051j mo13230g(int i) {
        C6349gb.m17045a();
        long[] jArr = this.f18457x;
        if (jArr != null && i < jArr.length) {
            return (C6051j) this.f18435a.mo3678e(jArr[i]);
        }
        return null;
    }

    /* renamed from: h */
    public final C6051j mo12629h(int i) {
        return mo13230g(i);
    }

    /* renamed from: i */
    public final C6051j mo12630i() {
        return (C6051j) this.f18435a.mo3678e(0);
    }

    /* renamed from: j */
    public final C6021a mo12631j(C6022b bVar) {
        return bVar == this.f18451q ? this.f18452r : this.f18433B.mo12611a(bVar);
    }

    /* renamed from: k */
    public final Object mo12632k(int i) {
        C6051j g = mo13230g(i);
        if (g == null) {
            return null;
        }
        return g.f17803a;
    }

    /* renamed from: l */
    public final Object mo12633l(long j) {
        C6051j jVar = (C6051j) this.f18435a.mo3678e(j);
        if (jVar == null) {
            return null;
        }
        return jVar.f17803a;
    }

    /* renamed from: m */
    public final String mo13231m(C6051j jVar) {
        long j;
        String str;
        int b = this.f18435a.mo3674b(jVar);
        boolean z = false;
        int i = -1;
        if (b >= 0) {
            j = this.f18435a.mo3677d(b);
            int i2 = 0;
            while (true) {
                long[] jArr = this.f18457x;
                if (i2 >= jArr.length) {
                    break;
                } else if (j == jArr[i2]) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            j = -1;
        }
        ComponentTree componentTree = this.f18442h.f17938n;
        if (componentTree == null) {
            str = "<null_component_tree>";
        } else {
            str = componentTree.mo12706a().mo13461q();
        }
        Object obj = jVar.f17803a;
        String valueOf = String.valueOf(obj != null ? obj.getClass() : "<null_content>");
        String q = ((C6201du) jVar.f17806d.f17827b).f18345a.f18255e.mo13461q();
        String valueOf2 = String.valueOf(((C6201du) jVar.f17806d.f17827b).f18345a.f18260j);
        C6040e eVar = jVar.f17804b;
        String valueOf3 = String.valueOf(eVar != null ? eVar.getClass() : "<null_host>");
        if (this.f18441g.mo3678e(0) == jVar.f17804b) {
            z = true;
        }
        return "rootComponent=" + str + ", index=" + i + ", mapIndex=" + b + ", id=" + j + ", disappearRange=[-1,-1], contentType=" + valueOf + ", component=" + q + ", transitionId=" + valueOf2 + ", host=" + valueOf3 + ", isRootHost=" + z;
    }

    /* renamed from: n */
    public final void mo12634n() {
        mo13234v();
    }

    /* renamed from: o */
    public final void mo13232o() {
        C6380he heVar = this.f18454t;
        if (heVar != null) {
            heVar.mo13396h(this.f18455u);
        }
        this.f18447m = -1;
    }

    /* renamed from: p */
    public final void mo12635p() {
        C6349gb.m17045a();
        mo13221A();
    }

    /* renamed from: q */
    public final void mo12636q(C6059r rVar) {
        mo13225K((C6187dg) rVar.f17825c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: com.facebook.litho.ComponentHost} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13233s(int r19, com.facebook.p313c.C6060s r20, com.facebook.litho.C6185de r21, com.facebook.litho.C6187dg r22) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r21
            r3 = r22
            long r4 = java.lang.System.nanoTime()
            long r6 = r2.f18261k
            androidx.c.k r8 = r1.f18441g
            java.lang.Object r8 = r8.mo3678e(r6)
            com.facebook.litho.ComponentHost r8 = (com.facebook.litho.ComponentHost) r8
            if (r8 != 0) goto L_0x0032
            int r8 = r3.mo12622f(r6)
            com.facebook.c.s r9 = r3.mo12598d(r8)
            com.facebook.c.v r10 = r9.f17827b
            com.facebook.litho.du r10 = (com.facebook.litho.C6201du) r10
            com.facebook.litho.de r10 = r10.f18345a
            r1.mo13233s(r8, r9, r10, r3)
            androidx.c.k r3 = r1.f18441g
            java.lang.Object r3 = r3.mo3678e(r6)
            r8 = r3
            com.facebook.litho.ComponentHost r8 = (com.facebook.litho.ComponentHost) r8
        L_0x0032:
            com.facebook.litho.q r3 = r2.f18255e
            com.facebook.litho.u r6 = r1.f18458y
            android.content.Context r6 = r6.f19009b
            com.facebook.litho.ej r7 = com.facebook.litho.C6105ap.m15889e(r6, r3)
            if (r7 != 0) goto L_0x0046
            java.lang.Object r6 = r3.mo12797P(r6)     // Catch:{ all -> 0x0043 }
            goto L_0x004a
        L_0x0043:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0046:
            java.lang.Object r6 = r7.mo13030a(r6, r3)
        L_0x004a:
            com.facebook.litho.u r7 = r1.m16522Y(r3)
            r3.mo12800T(r7, r6)
            boolean r9 = com.facebook.litho.C6407q.m17278w(r3)
            if (r9 == 0) goto L_0x0061
            r9 = r6
            com.facebook.litho.ComponentHost r9 = (com.facebook.litho.ComponentHost) r9
            long r10 = r2.f18263m
            androidx.c.k r12 = r1.f18441g
            r12.mo3682i(r10, r9)
        L_0x0061:
            com.facebook.c.j r9 = new com.facebook.c.j
            r10 = r20
            r9.<init>(r10, r8, r6)
            com.facebook.litho.dr r10 = new com.facebook.litho.dr
            r10.<init>(r6)
            r9.f17807e = r10
            androidx.c.k r10 = r1.f18435a
            long[] r11 = r1.f18457x
            r12 = r11[r0]
            r10.mo3682i(r12, r9)
            boolean r10 = r3.mo12817ah()
            if (r10 == 0) goto L_0x0087
            androidx.c.k r10 = r1.f18436b
            long[] r11 = r1.f18457x
            r12 = r11[r0]
            r10.mo3682i(r12, r9)
        L_0x0087:
            android.graphics.Rect r10 = f18431w
            r2.mo13156e(r10)
            r8.mo12681j(r0, r9, r10)
            m16516S(r9)
            r1.m16513P(r9, r3, r6)
            r2.mo13156e(r10)
            java.lang.Object r0 = r9.f17803a
            int r11 = r10.left
            int r12 = r10.top
            int r13 = r10.right
            int r14 = r10.bottom
            com.facebook.litho.C6349gb.m17045a()
            r15 = 0
            r17 = 1
            r16 = r0
            com.facebook.p313c.p317d.C6038a.m15531c(r11, r12, r13, r14, r15, r16, r17)
            com.facebook.litho.ek r0 = r1.f18444j
            boolean r2 = r0.f18426n
            if (r2 == 0) goto L_0x0139
            java.util.List r0 = r0.f18418f
            long r8 = java.lang.System.nanoTime()
            long r8 = r8 - r4
            double r4 = (double) r8
            r8 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            java.lang.Double.isNaN(r4)
            double r4 = r4 / r8
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r0.add(r2)
            com.facebook.litho.ek r0 = r1.f18444j
            java.util.List r0 = r0.f18413a
            java.lang.String r2 = r3.mo13461q()
            r0.add(r2)
            com.facebook.litho.ek r0 = r1.f18444j
            int r2 = r0.f18422j
            int r2 = r2 + 1
            r0.f18422j = r2
            com.facebook.litho.u r2 = r3.f18995r
            java.util.List r0 = r0.f18417e
            com.google.android.libraries.elements.h.m r3 = r7.mo13475m()
            r4 = 0
            if (r2 != 0) goto L_0x00ea
            goto L_0x0136
        L_0x00ea:
            com.facebook.litho.hf r2 = r2.f19016i
            if (r2 != 0) goto L_0x00ef
            goto L_0x0136
        L_0x00ef:
            java.util.Map r2 = r3.mo26270b(r2)
            if (r2 != 0) goto L_0x00f6
            goto L_0x0136
        L_0x00f6:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r2.size()
            int r4 = r4 * 16
            r3.<init>(r4)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0109:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0132
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r3.append(r5)
            r5 = 58
            r3.append(r5)
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            r4 = 59
            r3.append(r4)
            goto L_0x0109
        L_0x0132:
            java.lang.String r4 = r3.toString()
        L_0x0136:
            r0.add(r4)
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6239em.mo13233s(int, com.facebook.c.s, com.facebook.litho.de, com.facebook.litho.dg):void");
    }

    /* renamed from: t */
    public final void mo12637t(long j) {
        int f;
        C6187dg dgVar = this.f18448n;
        if (dgVar != null && (f = dgVar.mo12622f(j)) >= 0 && mo13230g(f) == null) {
            C6060s d = this.f18448n.mo12598d(f);
            mo13233s(f, d, ((C6201du) d.f17827b).f18345a, this.f18448n);
        }
    }

    /* renamed from: u */
    public final void mo12638u(long j) {
        C6051j jVar = (C6051j) this.f18435a.mo3678e(j);
        if (jVar != null) {
            mo13222D(((C6201du) jVar.f17806d.f17827b).f18345a.f18262l, this.f18441g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo13234v() {
        C6349gb.m17045a();
        long[] jArr = this.f18457x;
        if (jArr != null) {
            int length = jArr.length;
            for (int i = 0; i < length; i++) {
                C6051j g = mo13230g(i);
                if (g != null && !g.f17805c) {
                    C6407q qVar = ((C6201du) g.f17806d.f17827b).f18345a.f18255e;
                    Object obj = g.f17803a;
                    m16513P(g, qVar, obj);
                    if ((obj instanceof View) && !(obj instanceof ComponentHost)) {
                        View view = (View) obj;
                        if (view.isLayoutRequested()) {
                            int left = view.getLeft();
                            int top = view.getTop();
                            int right = view.getRight();
                            int bottom = view.getBottom();
                            C6349gb.m17045a();
                            C6038a.m15531c(left, top, right, bottom, (Rect) null, view, true);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: w */
    public final void mo12639w(C6022b bVar) {
        if (this.f18433B == null) {
            this.f18433B = new C6048g(this);
        }
        this.f18433B.mo12613c(bVar);
    }

    /* renamed from: y */
    public final void mo12640y(C6065x xVar) {
        this.f18434C = xVar;
    }

    /* renamed from: O */
    public final void mo13229O(C6187dg dgVar) {
        C6185de deVar;
        int i;
        C6238el elVar = this.f18459z;
        elVar.f18430c = 0;
        elVar.f18429b = 0;
        elVar.f18428a = 0;
        if (this.f18457x != null) {
            int i2 = 0;
            while (true) {
                long[] jArr = this.f18457x;
                if (i2 >= jArr.length) {
                    break;
                }
                int f = dgVar.mo12622f(jArr[i2]);
                if (f < 0) {
                    deVar = null;
                } else {
                    deVar = ((C6201du) dgVar.mo12598d(f).f17827b).f18345a;
                }
                if (deVar == null) {
                    i = -1;
                } else {
                    i = deVar.f18262l;
                }
                C6051j g = mo13230g(i2);
                C6065x xVar = this.f18434C;
                if (xVar == null || g == null || !xVar.mo12661m(this.f18433B.f17799c, g)) {
                    if (i == -1) {
                        mo13222D(i2, this.f18441g);
                    } else {
                        long j = deVar.f18261k;
                        if (g != null) {
                            if (g.f17804b != this.f18441g.mo3678e(j)) {
                                mo13222D(i2, this.f18441g);
                                this.f18459z.f18428a++;
                            } else if (i != i2) {
                                g.f17804b.mo12604k(g, i2, i);
                                this.f18459z.f18429b++;
                            } else {
                                this.f18459z.f18430c++;
                            }
                        }
                    }
                    this.f18459z.f18428a++;
                }
                i2++;
            }
        }
        if (this.f18441g.mo3678e(0) == null) {
            this.f18441g.mo3682i(0, this.f18442h);
            this.f18435a.mo3682i(0, this.f18450p);
        }
        int a = dgVar.mo12597a();
        long[] jArr2 = this.f18457x;
        if (jArr2 == null || a != jArr2.length) {
            this.f18457x = new long[a];
        }
        for (int i3 = 0; i3 < a; i3++) {
            this.f18457x[i3] = ((C6201du) dgVar.mo12598d(i3).f17827b).f18345a.f18263m;
        }
    }
}
