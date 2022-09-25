package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.support.p033v7.view.menu.C0453ag;
import android.support.p033v7.view.menu.C0480t;
import android.support.p033v7.widget.C0751je;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1877c;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.p098j.C2015ai;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1990j;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.badge.C44536a;
import com.google.android.material.badge.C44538c;
import com.google.android.material.p3504a.C44497b;
import com.google.android.material.p3510g.C44688a;
import com.google.android.material.p3512i.C44693c;
import com.google.android.material.p3513j.C44767a;

/* renamed from: com.google.android.material.navigation.f */
/* compiled from: PG */
public abstract class C44819f extends FrameLayout implements C0453ag {

    /* renamed from: i */
    private static final int[] f116892i = {16842912};

    /* renamed from: j */
    private static final C44817d f116893j = new C44817d();

    /* renamed from: k */
    private static final C44817d f116894k = new C44818e();

    /* renamed from: A */
    private ValueAnimator f116895A;

    /* renamed from: B */
    private C44817d f116896B = f116893j;

    /* renamed from: C */
    private boolean f116897C = false;

    /* renamed from: D */
    private int f116898D = 0;

    /* renamed from: E */
    private int f116899E = 0;

    /* renamed from: F */
    private int f116900F = 0;

    /* renamed from: a */
    public boolean f116901a = false;

    /* renamed from: b */
    public ColorStateList f116902b;

    /* renamed from: c */
    Drawable f116903c;

    /* renamed from: d */
    public final ImageView f116904d;

    /* renamed from: e */
    public C0480t f116905e;

    /* renamed from: f */
    public float f116906f = 0.0f;

    /* renamed from: g */
    public boolean f116907g = false;

    /* renamed from: h */
    public C44536a f116908h;

    /* renamed from: l */
    private int f116909l;

    /* renamed from: m */
    private int f116910m;

    /* renamed from: n */
    private float f116911n;

    /* renamed from: o */
    private float f116912o;

    /* renamed from: p */
    private float f116913p;

    /* renamed from: q */
    private int f116914q;

    /* renamed from: r */
    private boolean f116915r;

    /* renamed from: s */
    private final FrameLayout f116916s;

    /* renamed from: t */
    private final View f116917t;

    /* renamed from: u */
    private final ViewGroup f116918u;

    /* renamed from: v */
    private final TextView f116919v;

    /* renamed from: w */
    private final TextView f116920w;

    /* renamed from: x */
    private ColorStateList f116921x;

    /* renamed from: y */
    private Drawable f116922y;

    /* renamed from: z */
    private Drawable f116923z;

    public C44819f(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(mo47500c(), this, true);
        this.f116916s = (FrameLayout) findViewById(R.id.navigation_bar_item_icon_container);
        this.f116917t = findViewById(R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(R.id.navigation_bar_item_icon_view);
        this.f116904d = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.navigation_bar_item_labels_group);
        this.f116918u = viewGroup;
        TextView textView = (TextView) findViewById(R.id.navigation_bar_item_small_label_view);
        this.f116919v = textView;
        TextView textView2 = (TextView) findViewById(R.id.navigation_bar_item_large_label_view);
        this.f116920w = textView2;
        setBackgroundResource(R.drawable.mtrl_navigation_bar_item_background);
        this.f116909l = getResources().getDimensionPixelSize(mo47499b());
        this.f116910m = viewGroup.getPaddingBottom();
        C2043bi.m5551ae(textView, 2);
        C2043bi.m5551ae(textView2, 2);
        setFocusable(true);
        m79509D(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C44814a(this));
        }
    }

    /* renamed from: C */
    private final View m79508C() {
        FrameLayout frameLayout = this.f116916s;
        return frameLayout != null ? frameLayout : this.f116904d;
    }

    /* renamed from: D */
    private final void m79509D(float f, float f2) {
        this.f116911n = f - f2;
        this.f116912o = f2 / f;
        this.f116913p = f / f2;
    }

    /* renamed from: E */
    private final void m79510E() {
        C0480t tVar = this.f116905e;
        if (tVar != null) {
            mo48213o(tVar.isChecked());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m79511F(android.widget.TextView r4, int r5) {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto L_0x000c
        L_0x000a:
            r5 = 0
            goto L_0x004d
        L_0x000c:
            int[] r2 = com.google.android.material.p3512i.C44695e.f116487b
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L_0x0021
            goto L_0x000a
        L_0x0021:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L_0x003f
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L_0x004d
        L_0x003f:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L_0x004d:
            if (r5 == 0) goto L_0x0053
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.C44819f.m79511F(android.widget.TextView, int):void");
    }

    /* renamed from: G */
    private static void m79512G(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: H */
    private static void m79513H(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: I */
    private static void m79514I(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    /* renamed from: J */
    private final boolean m79515J() {
        return this.f116907g && this.f116914q == 2;
    }

    /* renamed from: A */
    public final void mo48199A(int i) {
        int i2;
        if (this.f116917t != null) {
            int i3 = this.f116898D;
            int i4 = this.f116900F;
            int min = Math.min(i3, i - (i4 + i4));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f116917t.getLayoutParams();
            if (m79515J()) {
                i2 = min;
            } else {
                i2 = this.f116899E;
            }
            layoutParams.height = i2;
            layoutParams.width = min;
            this.f116917t.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: B */
    public final boolean mo48200B() {
        return this.f116908h != null;
    }

    /* renamed from: a */
    public final C0480t mo1441a() {
        return this.f116905e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo47499b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo47500c();

    /* renamed from: d */
    public final Drawable mo48201d() {
        View view = this.f116917t;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f116916s;
        if (frameLayout != null && this.f116897C) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final boolean mo1445e() {
        return false;
    }

    /* renamed from: f */
    public final void mo1446f(C0480t tVar) {
        CharSequence charSequence;
        this.f116905e = tVar;
        tVar.isCheckable();
        refreshDrawableState();
        mo48213o(tVar.isChecked());
        setEnabled(tVar.isEnabled());
        Drawable icon = tVar.getIcon();
        if (icon != this.f116922y) {
            this.f116922y = icon;
            if (icon != null) {
                Drawable.ConstantState constantState = icon.getConstantState();
                if (constantState != null) {
                    icon = constantState.newDrawable();
                }
                icon = icon.mutate();
                this.f116923z = icon;
                ColorStateList colorStateList = this.f116921x;
                if (colorStateList != null) {
                    C1929b.m5226g(icon, colorStateList);
                }
            }
            this.f116904d.setImageDrawable(icon);
        }
        CharSequence charSequence2 = tVar.f1685d;
        this.f116919v.setText(charSequence2);
        this.f116920w.setText(charSequence2);
        C0480t tVar2 = this.f116905e;
        if (tVar2 == null || TextUtils.isEmpty(tVar2.f1692k)) {
            setContentDescription(charSequence2);
        }
        C0480t tVar3 = this.f116905e;
        if (tVar3 != null && !TextUtils.isEmpty(tVar3.f1693l)) {
            charSequence2 = this.f116905e.f1693l;
        }
        C0751je.m2535a(this, charSequence2);
        setId(tVar.f1682a);
        if (!TextUtils.isEmpty(tVar.f1692k)) {
            setContentDescription(tVar.f1692k);
        }
        if (!TextUtils.isEmpty(tVar.f1693l)) {
            charSequence = tVar.f1693l;
        } else {
            charSequence = tVar.f1685d;
        }
        C0751je.m2535a(this, charSequence);
        setVisibility(true != tVar.isVisible() ? 8 : 0);
        this.f116901a = true;
    }

    /* renamed from: g */
    public final void mo48203g() {
        Drawable drawable = this.f116903c;
        boolean z = true;
        RippleDrawable rippleDrawable = null;
        if (this.f116902b != null) {
            Drawable d = mo48201d();
            if (this.f116897C && mo48201d() != null && this.f116916s != null && d != null) {
                rippleDrawable = new RippleDrawable(C44767a.m79372b(this.f116902b), (Drawable) null, d);
                z = false;
            } else if (drawable == null) {
                drawable = new RippleDrawable(C44767a.m79371a(this.f116902b), (Drawable) null, (Drawable) null);
            }
        }
        FrameLayout frameLayout = this.f116916s;
        if (frameLayout != null) {
            C2043bi.m5530X(frameLayout, rippleDrawable);
        }
        C2043bi.m5530X(this, drawable);
        setDefaultFocusHighlightEnabled(z);
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f116918u.getLayoutParams();
        C44536a aVar = this.f116908h;
        int minimumHeight = aVar != null ? aVar.getMinimumHeight() / 2 : 0;
        return Math.max(minimumHeight, ((FrameLayout.LayoutParams) m79508C().getLayoutParams()).topMargin) + this.f116904d.getMeasuredWidth() + minimumHeight + layoutParams.topMargin + this.f116918u.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumWidth() {
        int i;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f116918u.getLayoutParams();
        int measuredWidth = layoutParams.leftMargin + this.f116918u.getMeasuredWidth() + layoutParams.rightMargin;
        C44536a aVar = this.f116908h;
        if (aVar == null) {
            i = 0;
        } else {
            i = aVar.getMinimumWidth() - this.f116908h.f115814b.mo47472b();
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) m79508C().getLayoutParams();
        return Math.max(Math.max(i, layoutParams2.leftMargin) + this.f116904d.getMeasuredWidth() + Math.max(i, layoutParams2.rightMargin), measuredWidth);
    }

    /* renamed from: h */
    public final void mo48206h(Drawable drawable) {
        View view = this.f116917t;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
            mo48203g();
        }
    }

    /* renamed from: i */
    public final void mo48207i(boolean z) {
        this.f116897C = z;
        mo48203g();
        View view = this.f116917t;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
            requestLayout();
        }
    }

    /* renamed from: j */
    public final void mo48208j(int i) {
        this.f116899E = i;
        mo48199A(getWidth());
    }

    /* renamed from: k */
    public final void mo48209k(int i) {
        this.f116900F = i;
        mo48199A(getWidth());
    }

    /* renamed from: l */
    public final void mo48210l(float f, float f2) {
        View view = this.f116917t;
        if (view != null) {
            C44817d dVar = this.f116896B;
            view.setScaleX(C44817d.m79505a(f));
            view.setScaleY(dVar.mo48198b(f));
            view.setAlpha(C44497b.m78598b(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        }
        this.f116906f = f;
    }

    /* renamed from: m */
    public final void mo48211m(int i) {
        this.f116898D = i;
        mo48199A(getWidth());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo48212n(C44536a aVar) {
        if (this.f116908h != aVar) {
            if (mo48200B() && this.f116904d != null) {
                Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
                mo48228z(this.f116904d);
            }
            this.f116908h = aVar;
            ImageView imageView = this.f116904d;
            if (imageView != null && mo48200B()) {
                setClipChildren(false);
                setClipToPadding(false);
                C44536a aVar2 = this.f116908h;
                C44538c.m78734a(aVar2, imageView);
                if (aVar2.mo47477b() != null) {
                    aVar2.mo47477b().setForeground(aVar2);
                } else {
                    imageView.getOverlay().add(aVar2);
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo48213o(boolean z) {
        TextView textView = this.f116920w;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.f116920w;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f116919v;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f116919v;
        textView4.setPivotY((float) textView4.getBaseline());
        float f = true != z ? 0.0f : 1.0f;
        if (!this.f116897C || !this.f116901a || !C2043bi.m5569aw(this)) {
            mo48210l(f, f);
        } else {
            ValueAnimator valueAnimator = this.f116895A;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f116895A = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f116906f, f});
            this.f116895A = ofFloat;
            ofFloat.addUpdateListener(new C44816c(this, f));
            this.f116895A.setInterpolator(C44688a.m79217a(getContext(), R.attr.motionEasingEmphasizedInterpolator, C44497b.f115651b));
            this.f116895A.setDuration((long) C44693c.m79225a(getContext(), R.attr.motionDurationLong2, getResources().getInteger(R.integer.material_motion_duration_long_1)));
            this.f116895A.start();
        }
        int i = this.f116914q;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m79513H(m79508C(), this.f116909l, 49);
                    m79514I(this.f116918u, this.f116910m);
                    this.f116920w.setVisibility(0);
                } else {
                    m79513H(m79508C(), this.f116909l, 17);
                    m79514I(this.f116918u, 0);
                    this.f116920w.setVisibility(4);
                }
                this.f116919v.setVisibility(4);
            } else if (i == 1) {
                m79514I(this.f116918u, this.f116910m);
                if (z) {
                    m79513H(m79508C(), (int) (((float) this.f116909l) + this.f116911n), 49);
                    m79512G(this.f116920w, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f116919v;
                    float f2 = this.f116912o;
                    m79512G(textView5, f2, f2, 4);
                } else {
                    m79513H(m79508C(), this.f116909l, 49);
                    TextView textView6 = this.f116920w;
                    float f3 = this.f116913p;
                    m79512G(textView6, f3, f3, 4);
                    m79512G(this.f116919v, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                m79513H(m79508C(), this.f116909l, 17);
                this.f116920w.setVisibility(8);
                this.f116919v.setVisibility(8);
            }
        } else if (this.f116915r) {
            if (z) {
                m79513H(m79508C(), this.f116909l, 49);
                m79514I(this.f116918u, this.f116910m);
                this.f116920w.setVisibility(0);
            } else {
                m79513H(m79508C(), this.f116909l, 17);
                m79514I(this.f116918u, 0);
                this.f116920w.setVisibility(4);
            }
            this.f116919v.setVisibility(4);
        } else {
            m79514I(this.f116918u, this.f116910m);
            if (z) {
                m79513H(m79508C(), (int) (((float) this.f116909l) + this.f116911n), 49);
                m79512G(this.f116920w, 1.0f, 1.0f, 0);
                TextView textView7 = this.f116919v;
                float f4 = this.f116912o;
                m79512G(textView7, f4, f4, 4);
            } else {
                m79513H(m79508C(), this.f116909l, 49);
                TextView textView8 = this.f116920w;
                float f5 = this.f116913p;
                m79512G(textView8, f5, f5, 4);
                m79512G(this.f116919v, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0480t tVar = this.f116905e;
        if (tVar != null && tVar.isCheckable() && tVar.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f116892i);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C44536a aVar = this.f116908h;
        if (aVar != null && aVar.isVisible()) {
            C0480t tVar = this.f116905e;
            CharSequence charSequence = tVar.f1685d;
            if (!TextUtils.isEmpty(tVar.f1692k)) {
                charSequence = this.f116905e.f1692k;
            }
            String valueOf = String.valueOf(charSequence);
            C44536a aVar2 = this.f116908h;
            Object obj = null;
            if (aVar2.isVisible()) {
                if (!aVar2.f115814b.mo47473c()) {
                    obj = aVar2.f115814b.f115791b.f115802h;
                } else if (!(aVar2.f115814b.f115791b.f115803i == 0 || (context = (Context) aVar2.f115813a.get()) == null)) {
                    int a = aVar2.mo47476a();
                    int i = aVar2.f115815c;
                    if (a <= i) {
                        obj = context.getResources().getQuantityString(aVar2.f115814b.f115791b.f115803i, aVar2.mo47476a(), new Object[]{Integer.valueOf(aVar2.mo47476a())});
                    } else {
                        obj = context.getString(aVar2.f115814b.f115791b.f115804j, new Object[]{Integer.valueOf(i)});
                    }
                }
            }
            String valueOf2 = String.valueOf(obj);
            accessibilityNodeInfo.setContentDescription(valueOf + ", " + valueOf2);
        }
        C1991k kVar = new C1991k(accessibilityNodeInfo);
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i2 = 0;
        for (int i3 = 0; i3 < indexOfChild; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if ((childAt instanceof C44819f) && childAt.getVisibility() == 0) {
                i2++;
            }
        }
        kVar.mo5155d(C1990j.m5333a(0, 1, i2, 1, false, isSelected()));
        if (isSelected()) {
            kVar.f5921a.setClickable(false);
            kVar.mo5159g(C1988h.f5905c);
        }
        kVar.mo5158f(getResources().getString(R.string.item_view_role_description));
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new C44815b(this, i));
    }

    /* renamed from: p */
    public final void mo48217p(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f116904d.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f116904d.setLayoutParams(layoutParams);
    }

    /* renamed from: q */
    public final void mo48218q(ColorStateList colorStateList) {
        Drawable drawable;
        this.f116921x = colorStateList;
        if (this.f116905e != null && (drawable = this.f116923z) != null) {
            C1929b.m5226g(drawable, colorStateList);
            this.f116923z.invalidateSelf();
        }
    }

    /* renamed from: r */
    public final void mo48219r(int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = C1877c.m5125a(getContext(), i);
        }
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f116903c = drawable;
        mo48203g();
    }

    /* renamed from: s */
    public final void mo48220s(int i) {
        if (this.f116910m != i) {
            this.f116910m = i;
            m79510E();
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f116919v.setEnabled(z);
        this.f116920w.setEnabled(z);
        this.f116904d.setEnabled(z);
        if (z) {
            C2043bi.m5557ak(this, C2015ai.m5366a(getContext()));
        } else {
            C2043bi.m5557ak(this, (C2015ai) null);
        }
    }

    /* renamed from: t */
    public final void mo48222t(int i) {
        if (this.f116909l != i) {
            this.f116909l = i;
            m79510E();
        }
    }

    /* renamed from: u */
    public final void mo48223u(int i) {
        if (this.f116914q != i) {
            this.f116914q = i;
            if (m79515J()) {
                this.f116896B = f116894k;
            } else {
                this.f116896B = f116893j;
            }
            mo48199A(getWidth());
            m79510E();
        }
    }

    /* renamed from: v */
    public final void mo48224v(boolean z) {
        if (this.f116915r != z) {
            this.f116915r = z;
            m79510E();
        }
    }

    /* renamed from: w */
    public final void mo48225w(int i) {
        m79511F(this.f116920w, i);
        m79509D(this.f116919v.getTextSize(), this.f116920w.getTextSize());
    }

    /* renamed from: x */
    public final void mo48226x(int i) {
        m79511F(this.f116919v, i);
        m79509D(this.f116919v.getTextSize(), this.f116920w.getTextSize());
    }

    /* renamed from: y */
    public final void mo48227y(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f116919v.setTextColor(colorStateList);
            this.f116920w.setTextColor(colorStateList);
        }
    }

    /* renamed from: z */
    public final void mo48228z(View view) {
        if (mo48200B()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C44536a aVar = this.f116908h;
                if (aVar != null) {
                    if (aVar.mo47477b() != null) {
                        aVar.mo47477b().setForeground((Drawable) null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
            }
            this.f116908h = null;
        }
    }
}
