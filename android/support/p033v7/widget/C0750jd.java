package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.p034a.C0338a;
import android.support.p033v7.view.menu.C0451ae;
import android.support.p033v7.view.menu.C0477q;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2058bx;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.jd */
/* compiled from: PG */
public final class C0750jd implements C0556bz {

    /* renamed from: a */
    public final Toolbar f2614a;

    /* renamed from: b */
    public int f2615b;

    /* renamed from: c */
    public Drawable f2616c;

    /* renamed from: d */
    CharSequence f2617d;

    /* renamed from: e */
    public CharSequence f2618e;

    /* renamed from: f */
    public Window.Callback f2619f;

    /* renamed from: g */
    public boolean f2620g;

    /* renamed from: h */
    public int f2621h = 0;

    /* renamed from: i */
    private View f2622i;

    /* renamed from: j */
    private View f2623j;

    /* renamed from: k */
    private Drawable f2624k;

    /* renamed from: l */
    private Drawable f2625l;

    /* renamed from: m */
    private boolean f2626m;

    /* renamed from: n */
    private CharSequence f2627n;

    /* renamed from: o */
    private ActionMenuPresenter f2628o;

    /* renamed from: p */
    private int f2629p = 0;

    /* renamed from: q */
    private Drawable f2630q;

    public C0750jd(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f2614a = toolbar;
        this.f2617d = toolbar.f1957q;
        this.f2627n = toolbar.f1958r;
        this.f2626m = this.f2617d != null;
        this.f2616c = toolbar.mo2391e();
        String str = null;
        C0735ip f = C0735ip.m2473f(toolbar.getContext(), (AttributeSet) null, C0338a.f1065a, R.attr.actionBarStyle, 0);
        int i = 15;
        this.f2630q = f.mo3246b(15);
        if (z) {
            CharSequence text = f.f2596b.getText(27);
            if (!TextUtils.isEmpty(text)) {
                mo2654q(text);
            }
            CharSequence text2 = f.f2596b.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f2627n = text2;
                if ((this.f2615b & 8) != 0) {
                    toolbar.mo2421v(text2);
                }
            }
            Drawable b = f.mo3246b(20);
            if (b != null) {
                this.f2625l = b;
                m2501I();
            }
            Drawable b2 = f.mo3246b(17);
            if (b2 != null) {
                this.f2624k = b2;
                m2501I();
            }
            if (this.f2616c == null && (drawable = this.f2630q) != null) {
                this.f2616c = drawable;
                mo3258G();
            }
            mo2649l(f.f2596b.getInt(10, 0));
            int resourceId = f.f2596b.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, toolbar, false);
                View view = this.f2623j;
                if (!(view == null || (this.f2615b & 16) == 0)) {
                    toolbar.removeView(view);
                }
                this.f2623j = inflate;
                if (!(inflate == null || (this.f2615b & 16) == 0)) {
                    toolbar.addView(inflate);
                }
                mo2649l(this.f2615b | 16);
            }
            int layoutDimension = f.f2596b.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = f.f2596b.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = f.f2596b.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.mo2400k();
                toolbar.f1956p.mo3148a(max, max2);
            }
            int resourceId2 = f.f2596b.getResourceId(28, 0);
            if (resourceId2 != 0) {
                toolbar.mo2424y(toolbar.getContext(), resourceId2);
            }
            int resourceId3 = f.f2596b.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context = toolbar.getContext();
                toolbar.f1950j = resourceId3;
                TextView textView = toolbar.f1942b;
                if (textView != null) {
                    textView.setTextAppearance(context, resourceId3);
                }
            }
            int resourceId4 = f.f2596b.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.mo2420u(resourceId4);
            }
        } else {
            if (toolbar.mo2391e() != null) {
                this.f2630q = toolbar.mo2391e();
            } else {
                i = 11;
            }
            this.f2615b = i;
        }
        f.f2596b.recycle();
        if (this.f2629p != R.string.abc_action_bar_up_description) {
            this.f2629p = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.mo2397h())) {
                int i2 = this.f2629p;
                this.f2618e = i2 != 0 ? toolbar.getContext().getString(i2) : str;
                mo3257F();
            }
        }
        this.f2618e = toolbar.mo2397h();
        toolbar.mo2419t(new C0748jb(this));
    }

    /* renamed from: H */
    private final void m2500H(CharSequence charSequence) {
        this.f2617d = charSequence;
        if ((this.f2615b & 8) != 0) {
            this.f2614a.mo2423x(charSequence);
            if (this.f2626m) {
                C2043bi.m5528V(this.f2614a.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: I */
    private final void m2501I() {
        Drawable drawable;
        int i = this.f2615b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f2625l) == null) {
            drawable = this.f2624k;
        }
        this.f2614a.mo2405o(drawable);
    }

    /* renamed from: A */
    public final void mo2633A() {
    }

    /* renamed from: B */
    public final void mo2634B() {
        this.f2616c = C0678gm.m2375e().mo3100c(this.f2614a.getContext(), R.drawable.quantum_gm_ic_arrow_back_vd_theme_24);
        mo3258G();
    }

    /* renamed from: C */
    public final void mo2635C() {
        if (this.f2621h != 2) {
            this.f2621h = 2;
            View view = this.f2622i;
            if (view != null) {
                this.f2614a.addView(view, 0);
                C0744iy iyVar = (C0744iy) this.f2622i.getLayoutParams();
                iyVar.width = -2;
                iyVar.height = -2;
                iyVar.f1134a = 8388691;
            }
        }
    }

    /* renamed from: D */
    public final void mo2636D() {
        throw new IllegalStateException("Can't set dropdown selected position without an adapter");
    }

    /* renamed from: E */
    public final void mo2637E() {
        this.f2618e = "close";
        mo3257F();
    }

    /* renamed from: F */
    public final void mo3257F() {
        if ((this.f2615b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f2618e)) {
            this.f2614a.mo2415p(this.f2629p);
        } else {
            this.f2614a.mo2416q(this.f2618e);
        }
    }

    /* renamed from: G */
    public final void mo3258G() {
        if ((this.f2615b & 4) != 0) {
            Toolbar toolbar = this.f2614a;
            Drawable drawable = this.f2616c;
            if (drawable == null) {
                drawable = this.f2630q;
            }
            toolbar.mo2418s(drawable);
            return;
        }
        this.f2614a.mo2418s((Drawable) null);
    }

    /* renamed from: a */
    public final int mo2638a() {
        return this.f2615b;
    }

    /* renamed from: b */
    public final int mo2639b() {
        return 0;
    }

    /* renamed from: c */
    public final int mo2640c() {
        return this.f2621h;
    }

    /* renamed from: d */
    public final Context mo2641d() {
        return this.f2614a.getContext();
    }

    /* renamed from: e */
    public final ViewGroup mo2642e() {
        return this.f2614a;
    }

    /* renamed from: f */
    public final C2058bx mo2643f(int i, long j) {
        C2058bx x = C2043bi.m5595x(this.f2614a);
        x.mo5201c(i == 0 ? 1.0f : 0.0f);
        x.mo5202d(j);
        x.mo5203e(new C0749jc(this, i));
        return x;
    }

    /* renamed from: g */
    public final void mo2644g() {
        this.f2614a.mo2398i();
    }

    /* renamed from: h */
    public final void mo2645h() {
        this.f2614a.mo2399j();
    }

    /* renamed from: i */
    public final void mo2646i() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: j */
    public final void mo2647j() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: k */
    public final void mo2648k(boolean z) {
        Toolbar toolbar = this.f2614a;
        toolbar.f1966z = z;
        toolbar.requestLayout();
    }

    /* renamed from: l */
    public final void mo2649l(int i) {
        View view;
        int i2 = this.f2615b ^ i;
        this.f2615b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    mo3257F();
                }
                mo3258G();
            }
            if ((i2 & 3) != 0) {
                m2501I();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f2614a.mo2423x(this.f2617d);
                    this.f2614a.mo2421v(this.f2627n);
                } else {
                    this.f2614a.mo2423x((CharSequence) null);
                    this.f2614a.mo2421v((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f2623j) != null) {
                if ((i & 16) != 0) {
                    this.f2614a.addView(view);
                } else {
                    this.f2614a.removeView(view);
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo2650m(C0687gv gvVar) {
        Toolbar toolbar;
        View view = this.f2622i;
        if (view != null && view.getParent() == (toolbar = this.f2614a)) {
            toolbar.removeView(this.f2622i);
        }
        this.f2622i = gvVar;
        if (gvVar != null && this.f2621h == 2) {
            this.f2614a.addView(gvVar, 0);
            C0744iy iyVar = (C0744iy) this.f2622i.getLayoutParams();
            iyVar.width = -2;
            iyVar.height = -2;
            iyVar.f1134a = 8388691;
            gvVar.f2515d = true;
        }
    }

    /* renamed from: n */
    public final void mo2651n(Menu menu, C0451ae aeVar) {
        ActionMenuPresenter actionMenuPresenter = this.f2628o;
        if (actionMenuPresenter == null) {
            actionMenuPresenter = new ActionMenuPresenter(this.f2614a.getContext());
            this.f2628o = actionMenuPresenter;
            actionMenuPresenter.f1596g = R.id.action_menu_presenter;
        }
        actionMenuPresenter.f1594e = aeVar;
        Toolbar toolbar = this.f2614a;
        if (menu != null || toolbar.f1941a != null) {
            toolbar.mo2403m();
            C0477q qVar = toolbar.f1941a.f1784a;
            if (qVar != menu) {
                if (qVar != null) {
                    qVar.mo1666m(toolbar.f1962v);
                    qVar.mo1666m(toolbar.f1963w);
                }
                if (toolbar.f1963w == null) {
                    toolbar.f1963w = new C0743ix(toolbar);
                }
                actionMenuPresenter.f1771j = true;
                if (menu != null) {
                    C0477q qVar2 = (C0477q) menu;
                    qVar2.mo1655f(actionMenuPresenter, toolbar.f1948h);
                    qVar2.mo1655f(toolbar.f1963w, toolbar.f1948h);
                } else {
                    actionMenuPresenter.mo1520c(toolbar.f1948h, (C0477q) null);
                    toolbar.f1963w.mo1520c(toolbar.f1948h, (C0477q) null);
                    actionMenuPresenter.mo1546f(true);
                    toolbar.f1963w.mo1546f(true);
                }
                toolbar.f1941a.mo1899f(toolbar.f1949i);
                toolbar.f1941a.mo1900g(actionMenuPresenter);
                toolbar.f1962v = actionMenuPresenter;
                toolbar.mo2425z();
            }
        }
    }

    /* renamed from: o */
    public final void mo2652o() {
        this.f2620g = true;
    }

    /* renamed from: p */
    public final void mo2653p(Drawable drawable) {
        this.f2616c = drawable;
        mo3258G();
    }

    /* renamed from: q */
    public final void mo2654q(CharSequence charSequence) {
        this.f2626m = true;
        m2500H(charSequence);
    }

    /* renamed from: r */
    public final void mo2655r(int i) {
        this.f2614a.setVisibility(i);
    }

    /* renamed from: s */
    public final void mo2656s(Window.Callback callback) {
        this.f2619f = callback;
    }

    /* renamed from: t */
    public final void mo2657t(CharSequence charSequence) {
        if (!this.f2626m) {
            m2500H(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.f1941a;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2658u() {
        /*
            r2 = this;
            android.support.v7.widget.Toolbar r0 = r2.f2614a
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0012
            android.support.v7.widget.ActionMenuView r0 = r0.f1941a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.f1785b
            if (r0 == 0) goto L_0x0012
            r0 = 1
            return r0
        L_0x0012:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0750jd.mo2658u():boolean");
    }

    /* renamed from: v */
    public final boolean mo2659v() {
        return this.f2614a.mo2383A();
    }

    /* renamed from: w */
    public final boolean mo2660w() {
        return this.f2614a.mo2384B();
    }

    /* renamed from: x */
    public final boolean mo2661x() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f2614a.f1941a;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.f1786c) == null) {
            return false;
        }
        return actionMenuPresenter.f1774m != null || actionMenuPresenter.mo1888m();
    }

    /* renamed from: y */
    public final boolean mo2662y() {
        return this.f2614a.mo2385C();
    }

    /* renamed from: z */
    public final boolean mo2663z() {
        return this.f2614a.mo2386D();
    }
}
