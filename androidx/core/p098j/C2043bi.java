package androidx.core.p098j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.p098j.p099a.C1981aa;
import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.core.j.bi */
/* compiled from: PG */
public final class C2043bi {

    /* renamed from: a */
    public static final int[] f5944a = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: b */
    private static WeakHashMap f5945b = null;

    /* renamed from: c */
    private static final C2012af f5946c = C2016aj.f5933a;

    /* renamed from: d */
    private static final C2021ao f5947d = new C2021ao();

    static {
        new AtomicInteger(1);
    }

    /* renamed from: A */
    public static C2082cp m5507A(View view, C2082cp cpVar) {
        WindowInsets e = cpVar.mo5243e();
        if (e != null) {
            WindowInsets b = C2028av.m5429b(view, e);
            if (!b.equals(e)) {
                return C2082cp.m5717h(b, view);
            }
        }
        return cpVar;
    }

    @Deprecated
    /* renamed from: B */
    public static C2088cv m5508B(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C2039be.m5500a(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new C2088cv(window, view);
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: C */
    public static CharSequence m5509C(View view) {
        return (CharSequence) m5545aL().mo5185d(view);
    }

    /* renamed from: D */
    public static CharSequence m5510D(View view) {
        return (CharSequence) m5594w().mo5185d(view);
    }

    /* renamed from: E */
    public static String m5511E(View view) {
        return C2030ax.m5438h(view);
    }

    /* renamed from: F */
    public static List m5512F(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: G */
    public static void m5513G(View view, C1988h hVar) {
        m5514H(view);
        m5546aM(hVar.mo5148a(), view);
        m5512F(view).add(hVar);
        m5515I(view, 0);
    }

    /* renamed from: H */
    public static void m5514H(View view) {
        C2061c t = m5591t(view);
        if (t == null) {
            t = new C2061c(C2061c.DEFAULT_DELEGATE);
        }
        m5526T(view, t);
    }

    /* renamed from: I */
    static void m5515I(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = false;
            if (m5509C(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            }
            int i2 = 32;
            if (C2027au.m5421a(view) != 0 || z) {
                if (true != z) {
                    i2 = 2048;
                }
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(i2);
                C2027au.m5424d(obtain, i);
                if (z) {
                    obtain.getText().add(m5509C(view));
                    if (C2024ar.m5388a(view) == 0) {
                        C2024ar.m5402o(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (C2024ar.m5388a((View) parent) == 4) {
                            C2024ar.m5402o(view, 2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                C2027au.m5424d(obtain2, 32);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m5509C(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    C2027au.m5422b(view.getParent(), view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", String.valueOf(view.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), e);
                }
            }
        }
    }

    /* renamed from: J */
    public static void m5516J(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    /* renamed from: K */
    public static void m5517K(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    /* renamed from: L */
    public static void m5518L(View view, C1991k kVar) {
        view.onInitializeAccessibilityNodeInfo(kVar.f5921a);
    }

    /* renamed from: M */
    public static void m5519M(View view) {
        C2024ar.m5394g(view);
    }

    /* renamed from: N */
    public static void m5520N(View view, Runnable runnable) {
        C2024ar.m5396i(view, runnable);
    }

    /* renamed from: O */
    public static void m5521O(View view, Runnable runnable, long j) {
        C2024ar.m5397j(view, runnable, j);
    }

    /* renamed from: P */
    public static void m5522P(View view, int i) {
        m5546aM(i, view);
        m5515I(view, 0);
    }

    /* renamed from: R */
    public static void m5524R(View view) {
        C2028av.m5430c(view);
    }

    /* renamed from: S */
    public static void m5525S(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        C2038bd.m5498c(view, context, iArr, attributeSet, typedArray, i, i2);
    }

    /* renamed from: T */
    public static void m5526T(View view, C2061c cVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (cVar == null && (C2038bd.m5496a(view) instanceof C1979a)) {
            cVar = new C2061c(C2061c.DEFAULT_DELEGATE);
        }
        if (cVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = cVar.mBridge;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: U */
    public static void m5527U(View view, int i) {
        C2027au.m5423c(view, i);
    }

    /* renamed from: V */
    public static void m5528V(View view, CharSequence charSequence) {
        m5545aL().mo5186e(view, charSequence);
        if (charSequence != null) {
            C2021ao aoVar = f5947d;
            WeakHashMap weakHashMap = aoVar.f5934a;
            boolean z = false;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(aoVar);
            if (C2027au.m5425e(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aoVar);
                return;
            }
            return;
        }
        C2021ao aoVar2 = f5947d;
        aoVar2.f5934a.remove(view);
        view.removeOnAttachStateChangeListener(aoVar2);
        C2024ar.m5398k(view.getViewTreeObserver(), aoVar2);
    }

    @Deprecated
    /* renamed from: W */
    public static void m5529W(View view, float f) {
        view.setAlpha(f);
    }

    /* renamed from: X */
    public static void m5530X(View view, Drawable drawable) {
        C2024ar.m5400m(view, drawable);
    }

    /* renamed from: Y */
    public static void m5531Y(View view, ColorStateList colorStateList) {
        C2030ax.m5440j(view, colorStateList);
    }

    /* renamed from: Z */
    public static void m5532Z(View view, PorterDuff.Mode mode) {
        C2030ax.m5441k(view, mode);
    }

    /* renamed from: a */
    public static float m5533a(View view) {
        return C2030ax.m5431a(view);
    }

    /* renamed from: aA */
    public static boolean m5534aA(View view) {
        Boolean bool = (Boolean) new C2017ak(Boolean.class).mo5185d(view);
        return bool != null && bool.booleanValue();
    }

    /* renamed from: aB */
    public static boolean m5535aB(View view, int i, Bundle bundle) {
        return C2024ar.m5406s(view, i, bundle);
    }

    /* renamed from: aC */
    public static boolean m5536aC(View view) {
        return C2035ba.m5486o(view);
    }

    /* renamed from: aD */
    public static String[] m5537aD(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2040bf.m5505c(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* renamed from: aE */
    public static void m5538aE(View view, C2082cp cpVar, Rect rect) {
        C2030ax.m5436f(view, cpVar, rect);
    }

    @Deprecated
    /* renamed from: aF */
    public static void m5539aF(View view, int i) {
        view.setLayerType(i, (Paint) null);
    }

    /* renamed from: aG */
    public static void m5540aG(View view) {
        C2030ax.m5443m(view, true);
    }

    /* renamed from: aH */
    public static void m5541aH(View view, int i) {
        C2031ay.m5460d(view, i, 3);
    }

    @Deprecated
    /* renamed from: aI */
    public static void m5542aI(View view) {
        view.setTranslationX(0.0f);
    }

    @Deprecated
    /* renamed from: aJ */
    public static void m5543aJ(View view) {
        view.setTranslationY(0.0f);
    }

    /* renamed from: aK */
    private static C2012af m5544aK(View view) {
        return view instanceof C2012af ? (C2012af) view : f5946c;
    }

    /* renamed from: aL */
    private static C2022ap m5545aL() {
        return new C2018al(CharSequence.class);
    }

    /* renamed from: aM */
    private static void m5546aM(int i, View view) {
        List F = m5512F(view);
        for (int i2 = 0; i2 < F.size(); i2++) {
            if (((C1988h) F.get(i2)).mo5148a() == i) {
                F.remove(i2);
                return;
            }
        }
    }

    /* renamed from: aa */
    public static void m5547aa(View view, Rect rect) {
        C2026at.m5419b(view, rect);
    }

    /* renamed from: ab */
    public static void m5548ab(View view, float f) {
        C2030ax.m5442l(view, f);
    }

    @Deprecated
    /* renamed from: ac */
    public static void m5549ac(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: ad */
    public static void m5550ad(View view, boolean z) {
        C2024ar.m5401n(view, z);
    }

    /* renamed from: ae */
    public static void m5551ae(View view, int i) {
        C2024ar.m5402o(view, i);
    }

    /* renamed from: af */
    public static void m5552af(View view, int i) {
        C2035ba.m5478g(view, i);
    }

    /* renamed from: ag */
    public static void m5553ag(View view, int i) {
        C2025as.m5413g(view, i);
    }

    /* renamed from: ah */
    public static void m5554ah(View view, int i) {
        C2025as.m5415i(view, i);
    }

    /* renamed from: ai */
    public static void m5555ai(View view, C2010ad adVar) {
        C2030ax.m5444n(view, adVar);
    }

    /* renamed from: aj */
    public static void m5556aj(View view, int i, int i2, int i3, int i4) {
        C2025as.m5416j(view, i, i2, i3, i4);
    }

    /* renamed from: ak */
    public static void m5557ak(View view, C2015ai aiVar) {
        C2032az.m5464d(view, aiVar != null ? aiVar.f5932a : null);
    }

    @Deprecated
    /* renamed from: al */
    public static void m5558al(View view, float f) {
        view.setScaleX(f);
    }

    @Deprecated
    /* renamed from: am */
    public static void m5559am(View view, float f) {
        view.setScaleY(f);
    }

    /* renamed from: an */
    public static void m5560an(View view, List list) {
        C2038bd.m5499d(view, list);
    }

    /* renamed from: ao */
    public static void m5561ao(View view, String str) {
        C2030ax.m5445o(view, str);
    }

    /* renamed from: ap */
    public static void m5562ap(View view, float f) {
        C2030ax.m5446p(view, f);
    }

    /* renamed from: aq */
    public static void m5563aq(View view) {
        C2030ax.m5448r(view);
    }

    /* renamed from: ar */
    public static boolean m5564ar(View view) {
        return C2024ar.m5403p(view);
    }

    /* renamed from: as */
    public static boolean m5565as(View view) {
        return C2038bd.m5496a(view) != null;
    }

    /* renamed from: at */
    public static boolean m5566at(View view) {
        return C2023aq.m5387a(view);
    }

    /* renamed from: au */
    public static boolean m5567au(View view) {
        return C2024ar.m5404q(view);
    }

    /* renamed from: av */
    public static boolean m5568av(View view) {
        return C2024ar.m5405r(view);
    }

    /* renamed from: aw */
    public static boolean m5569aw(View view) {
        return C2027au.m5425e(view);
    }

    /* renamed from: ax */
    public static boolean m5570ax(View view) {
        return C2027au.m5426f(view);
    }

    /* renamed from: ay */
    public static boolean m5571ay(View view) {
        return C2030ax.m5455y(view);
    }

    /* renamed from: az */
    public static boolean m5572az(View view) {
        return C2025as.m5417k(view);
    }

    /* renamed from: b */
    public static float m5573b(View view) {
        return C2030ax.m5433c(view);
    }

    /* renamed from: c */
    public static int m5574c() {
        return C2025as.m5407a();
    }

    /* renamed from: d */
    public static int m5575d(View view) {
        return C2024ar.m5388a(view);
    }

    /* renamed from: e */
    public static int m5576e(View view) {
        return C2035ba.m5472a(view);
    }

    /* renamed from: f */
    public static int m5577f(View view) {
        return C2025as.m5409c(view);
    }

    @Deprecated
    /* renamed from: g */
    public static int m5578g(View view) {
        return view.getMeasuredWidthAndState();
    }

    /* renamed from: h */
    public static int m5579h(View view) {
        return C2024ar.m5389b(view);
    }

    /* renamed from: i */
    public static int m5580i(View view) {
        return C2024ar.m5390c(view);
    }

    @Deprecated
    /* renamed from: j */
    public static int m5581j(View view) {
        return view.getOverScrollMode();
    }

    /* renamed from: k */
    public static int m5582k(View view) {
        return C2025as.m5410d(view);
    }

    /* renamed from: l */
    public static int m5583l(View view) {
        return C2025as.m5411e(view);
    }

    @Deprecated
    /* renamed from: m */
    public static int m5584m(View view) {
        return C2024ar.m5391d(view);
    }

    /* renamed from: n */
    public static ColorStateList m5585n(View view) {
        return C2030ax.m5434d(view);
    }

    /* renamed from: o */
    public static PorterDuff.Mode m5586o(View view) {
        return C2030ax.m5435e(view);
    }

    /* renamed from: p */
    public static Rect m5587p(View view) {
        return C2026at.m5418a(view);
    }

    /* renamed from: q */
    public static Display m5588q(View view) {
        return C2025as.m5412f(view);
    }

    /* renamed from: r */
    public static View m5589r(View view, int i) {
        return (View) C2037bc.m5488b(view, i);
    }

    /* renamed from: s */
    public static ViewParent m5590s(View view) {
        return C2024ar.m5392e(view);
    }

    /* renamed from: t */
    public static C2061c m5591t(View view) {
        View.AccessibilityDelegate a = C2038bd.m5496a(view);
        if (a == null) {
            return null;
        }
        if (a instanceof C1979a) {
            return ((C1979a) a).f5897a;
        }
        return new C2061c(a);
    }

    /* renamed from: u */
    public static C2096k m5592u(View view, C2096k kVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + kVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C2040bf.m5503a(view, kVar);
        }
        C2011ae aeVar = (C2011ae) view.getTag(R.id.tag_on_receive_content_listener);
        if (aeVar == null) {
            return m5544aK(view).mo2480a(kVar);
        }
        C2096k a = aeVar.mo5174a(view, kVar);
        if (a == null) {
            return null;
        }
        return m5544aK(view).mo2480a(a);
    }

    /* renamed from: v */
    public static C2022ap m5593v() {
        return new C2020an(Boolean.class);
    }

    /* renamed from: w */
    public static C2022ap m5594w() {
        return new C2019am(CharSequence.class);
    }

    /* renamed from: x */
    public static C2058bx m5595x(View view) {
        if (f5945b == null) {
            f5945b = new WeakHashMap();
        }
        C2058bx bxVar = (C2058bx) f5945b.get(view);
        if (bxVar != null) {
            return bxVar;
        }
        C2058bx bxVar2 = new C2058bx(view);
        f5945b.put(view, bxVar2);
        return bxVar2;
    }

    /* renamed from: y */
    public static C2082cp m5596y(View view, C2082cp cpVar) {
        WindowInsets e = cpVar.mo5243e();
        if (e != null) {
            WindowInsets a = C2028av.m5428a(view, e);
            if (!a.equals(e)) {
                return C2082cp.m5717h(a, view);
            }
        }
        return cpVar;
    }

    /* renamed from: z */
    public static C2082cp m5597z(View view) {
        return C2031ay.m5458b(view);
    }

    /* renamed from: Q */
    public static void m5523Q(View view, C1988h hVar, CharSequence charSequence, C1981aa aaVar) {
        if (aaVar == null && charSequence == null) {
            m5522P(view, hVar.mo5148a());
            return;
        }
        m5513G(view, new C1988h((Object) null, hVar.f5916n, charSequence, aaVar, hVar.f5917o));
    }
}
