package com.google.android.libraries.material.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2100o;
import androidx.p043a.p044a.C0782b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.p2205a.C28491d;
import com.google.android.libraries.material.p2205a.C28497j;
import com.google.android.libraries.p1623at.p1632e.C19556d;
import java.util.HashMap;
import java.util.Map;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.material.featurehighlight.ac */
/* compiled from: PG */
public final class C28512ac extends ViewGroup {

    /* renamed from: I */
    public static final /* synthetic */ int f77390I = 0;

    /* renamed from: J */
    private static final int[] f77391J = {R.attr.materialButtonOutlinedStyle};

    /* renamed from: A */
    public boolean f77392A = true;

    /* renamed from: B */
    public boolean f77393B = true;

    /* renamed from: C */
    public boolean f77394C = false;

    /* renamed from: D */
    public C28543y f77395D;

    /* renamed from: E */
    public Paint f77396E;

    /* renamed from: F */
    public int f77397F;

    /* renamed from: G */
    public final AccessibilityManager f77398G;

    /* renamed from: H */
    public final C28531m f77399H;

    /* renamed from: K */
    private final int[] f77400K = new int[2];

    /* renamed from: L */
    private final Rect f77401L = new Rect();

    /* renamed from: M */
    private final Rect f77402M = new Rect();

    /* renamed from: N */
    private final C2100o f77403N;

    /* renamed from: O */
    private final C2100o f77404O;

    /* renamed from: P */
    private boolean f77405P;

    /* renamed from: Q */
    private Map f77406Q;

    /* renamed from: R */
    private final View.OnAttachStateChangeListener f77407R = new C28534p(this);

    /* renamed from: a */
    public final Rect f77408a = new Rect();

    /* renamed from: b */
    public final Rect f77409b = new Rect();

    /* renamed from: c */
    public final Rect f77410c = new Rect();

    /* renamed from: d */
    public final Rect f77411d = new Rect();

    /* renamed from: e */
    public final C28517ah f77412e;

    /* renamed from: f */
    public final C28515af f77413f;

    /* renamed from: g */
    public C28523e f77414g;

    /* renamed from: h */
    public View f77415h;

    /* renamed from: i */
    public int f77416i;

    /* renamed from: j */
    public int f77417j;

    /* renamed from: k */
    public View f77418k;

    /* renamed from: l */
    public Drawable f77419l;

    /* renamed from: m */
    public float f77420m = 1.0f;

    /* renamed from: n */
    public boolean f77421n;

    /* renamed from: o */
    public boolean f77422o;

    /* renamed from: p */
    public ImageView f77423p;

    /* renamed from: q */
    public Animator f77424q;

    /* renamed from: r */
    public final C28516ag f77425r;

    /* renamed from: s */
    public C28511ab f77426s;

    /* renamed from: t */
    public boolean f77427t = false;

    /* renamed from: u */
    public float f77428u = 0.0f;

    /* renamed from: v */
    public float f77429v = 0.0f;

    /* renamed from: w */
    public boolean f77430w = false;

    /* renamed from: x */
    public Interpolator f77431x;

    /* renamed from: y */
    public Interpolator f77432y;

    /* renamed from: z */
    public boolean f77433z;

    public C28512ac(Context context, C28531m mVar) {
        super(context);
        int i;
        setId(R.id.featurehighlight_view);
        setWillNotDraw(false);
        C28515af afVar = new C28515af(context);
        this.f77413f = afVar;
        afVar.setCallback(this);
        C28517ah ahVar = new C28517ah(context);
        this.f77412e = ahVar;
        ahVar.setCallback(this);
        this.f77425r = new C28516ag(this);
        this.f77398G = (AccessibilityManager) getContext().getSystemService("accessibility");
        C2100o oVar = new C2100o(context, new C28535q(this), (Handler) null);
        this.f77403N = oVar;
        oVar.f6015a.f6014a.setIsLongpressEnabled(false);
        C2100o oVar2 = new C2100o(getContext(), new C28536r(this), (Handler) null);
        this.f77404O = oVar2;
        oVar2.f6015a.f6014a.setIsLongpressEnabled(false);
        this.f77399H = mVar;
        if (mVar == C28531m.Legacy) {
            i = R.layout.text_content;
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f77391J);
            boolean hasValue = obtainStyledAttributes.hasValue(0);
            obtainStyledAttributes.recycle();
            i = R.layout.gm_text_content;
            if (!hasValue) {
                context = new C0782b(context, 2132150942);
            }
        }
        C28523e eVar = (C28523e) LayoutInflater.from(context).inflate(i, this, false);
        C28523e eVar2 = this.f77414g;
        if (eVar2 != null) {
            removeView(eVar2.mo33966a());
        }
        eVar.getClass();
        this.f77414g = eVar;
        addView(eVar.mo33966a(), 0);
        mo34006g(new C28510aa(this));
        setVisibility(8);
    }

    /* renamed from: r */
    private final void m53327r(Rect rect, View view) {
        m53328s(this.f77400K, view);
        int[] iArr = this.f77400K;
        int i = iArr[0];
        rect.set(i, iArr[1], view.getMeasuredWidth() + i, this.f77400K[1] + view.getMeasuredHeight());
    }

    /* renamed from: s */
    private final void m53328s(int[] iArr, View view) {
        getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - i;
        iArr[1] = iArr[1] - i2;
    }

    /* renamed from: t */
    private final void m53329t(boolean z) {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int childCount = viewGroup.getChildCount();
            if (z) {
                this.f77406Q = new HashMap();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != this) {
                        this.f77406Q.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        C2043bi.m5551ae(childAt, 4);
                    }
                }
                return;
            }
            Map map = this.f77406Q;
            if (map != null) {
                for (View view : map.keySet()) {
                    C2043bi.m5551ae(view, ((Integer) this.f77406Q.get(view)).intValue());
                }
                this.f77406Q = null;
            }
        }
    }

    /* renamed from: u */
    private final boolean m53330u() {
        return this.f77420m != 1.0f;
    }

    /* renamed from: a */
    public final Animator mo33998a() {
        Animator animator;
        C28515af afVar = this.f77413f;
        Context context = getContext();
        C28518ai aiVar = C28518ai.PULSE_WITH_INNER_CIRCLE;
        int ordinal = afVar.f77441g.ordinal();
        if (ordinal == 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator duration = ObjectAnimator.ofFloat(afVar, "scale", new float[]{1.0f, 1.1f}).setDuration(500);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(afVar, "scale", new float[]{1.1f, 1.0f}).setDuration(500);
            ObjectAnimator duration3 = ObjectAnimator.ofPropertyValuesHolder(afVar, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("pulseScale", new float[]{1.1f, 2.0f}), PropertyValuesHolder.ofFloat("pulseAlpha", new float[]{1.0f, 0.0f})}).setDuration(500);
            animatorSet.play(duration).with(ObjectAnimator.ofFloat(afVar, "pulseAlpha", new float[]{0.0f}).setDuration(500));
            animatorSet.play(duration2).with(duration3).after(duration);
            animator = animatorSet;
        } else if (ordinal == 1) {
            animator = ObjectAnimator.ofPropertyValuesHolder(afVar, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scale", new float[]{0.0f, 2.0f}), PropertyValuesHolder.ofInt("alpha", new int[]{PrivateKeyType.INVALID, 0})}).setDuration(1000);
        } else {
            throw new IllegalStateException("No implementation for animation type.");
        }
        animator.setInterpolator(C28497j.f77331c);
        animator.setStartDelay(500);
        C28491d.m53263b(animator, (Runnable) null);
        animator.addListener(new C28514ae(context));
        return animator;
    }

    /* renamed from: b */
    public final Interpolator mo33999b(Interpolator interpolator, float f) {
        return new C28532n(interpolator, f, this.f77412e.f77464h, this.f77412e.mo34048a(this.f77402M));
    }

    /* renamed from: c */
    public final Interpolator mo34000c(Interpolator interpolator) {
        return new C28542x(interpolator, this.f77412e.f77464h, this.f77412e.mo34048a(this.f77402M));
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    /* renamed from: d */
    public final void mo34002d() {
        if (!this.f77427t) {
            this.f77426s.mo33994a();
        }
        View view = this.f77415h;
        if (view != null) {
            view.performClick();
        }
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C28543y yVar = this.f77395D;
        if (yVar == null || !yVar.dispatchHoverEvent(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: e */
    public final void mo34004e(Runnable runnable) {
        if (!this.f77427t) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f77414g.mo33966a(), "alpha", new float[]{0.0f}).setDuration(200);
            duration.setInterpolator(mo34000c(C28497j.f77330b));
            C28517ah ahVar = this.f77412e;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(ahVar, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scale", new float[]{ahVar.getScale(), 1.125f}), PropertyValuesHolder.ofInt("alpha", new int[]{ahVar.f77460d.getAlpha(), 0})});
            ofPropertyValuesHolder.setInterpolator(C28497j.f77330b);
            Animator duration2 = ofPropertyValuesHolder.setDuration(200).setDuration(200);
            Animator duration3 = this.f77413f.mo34031a().setDuration(200);
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet.Builder with = animatorSet.play(duration).with(duration2).with(duration3);
            if (mo34024p()) {
                with.with(ObjectAnimator.ofFloat(this.f77423p, "elevation", new float[]{0.0f}).setDuration(200));
            }
            animatorSet.addListener(new C28533o(this, runnable));
            mo34015m(animatorSet);
        }
    }

    /* renamed from: f */
    public final void mo34005f(Runnable runnable) {
        if (!this.f77427t) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f77414g.mo33966a(), "alpha", new float[]{0.0f}).setDuration(200);
            duration.setInterpolator(mo34000c(C28497j.f77330b));
            float exactCenterX = this.f77408a.exactCenterX();
            float f = this.f77412e.f77465i;
            float exactCenterY = this.f77408a.exactCenterY();
            C28517ah ahVar = this.f77412e;
            float f2 = ahVar.f77466j;
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scale", new float[]{ahVar.getScale(), 0.0f});
            PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("alpha", new int[]{ahVar.f77460d.getAlpha(), 0});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(ahVar, new PropertyValuesHolder[]{ofFloat, PropertyValuesHolder.ofFloat("translationX", new float[]{ahVar.getTranslationX(), exactCenterX - f}), PropertyValuesHolder.ofFloat("translationY", new float[]{ahVar.getTranslationY(), exactCenterY - f2}), ofInt});
            ofPropertyValuesHolder.setInterpolator(C28497j.f77330b);
            Animator duration2 = ofPropertyValuesHolder.setDuration(200).setDuration(200);
            Animator duration3 = this.f77413f.mo34031a().setDuration(200);
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet.Builder with = animatorSet.play(duration).with(duration2).with(duration3);
            if (mo34024p()) {
                with.with(ObjectAnimator.ofFloat(this.f77423p, "elevation", new float[]{0.0f}).setDuration(200));
            }
            animatorSet.addListener(new C28533o(this, runnable));
            mo34015m(animatorSet);
        }
    }

    /* renamed from: g */
    public final void mo34006g(C28511ab abVar) {
        this.f77414g.mo33977l(abVar);
        this.f77426s = abVar;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* renamed from: h */
    public final void mo34010h() {
        ImageView imageView = this.f77423p;
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(this.f77397F));
        }
    }

    /* renamed from: i */
    public final void mo34011i(int i, int i2) {
        this.f77413f.mo34033c(i);
        this.f77413f.mo34034d(i2);
    }

    /* renamed from: j */
    public final void mo34012j(View view) {
        C19556d.m37298a(C2043bi.m5569aw(this), "Must be attached to window before showing");
        this.f77415h = view;
        C28543y yVar = new C28543y(this, view);
        this.f77395D = yVar;
        C2043bi.m5526T(this, yVar);
        if (mo34017o()) {
            TextView textView = (TextView) view;
            this.f77417j = textView.getCurrentTextColor();
            textView.setTextColor(this.f77416i);
        }
        if (mo34024p()) {
            mo34013k();
        }
        if (getVisibility() == 8) {
            setVisibility(4);
        }
        view.addOnAttachStateChangeListener(this.f77407R);
    }

    /* renamed from: k */
    public final void mo34013k() {
        View view = this.f77415h;
        if (view != null) {
            this.f77422o = view.isDrawingCacheEnabled();
            this.f77415h.setDrawingCacheEnabled(true);
            ImageView imageView = new ImageView(getContext());
            this.f77423p = imageView;
            imageView.setElevation(this.f77415h.getElevation());
            this.f77423p.setOutlineProvider(new C28539u(this));
            if (this.f77396E != null) {
                mo34010h();
            }
            addView(this.f77423p);
        }
    }

    /* renamed from: l */
    public final void mo34014l() {
        C19556d.m37298a(getParent() != null, "View must be attached to view hierarchy");
        setVisibility(0);
        this.f77427t = false;
    }

    /* renamed from: m */
    public final void mo34015m(Animator animator) {
        Animator animator2 = this.f77424q;
        if (animator2 != null) {
            animator2.cancel();
        }
        if (animator != null) {
            this.f77424q = animator;
            animator.start();
        }
    }

    /* renamed from: n */
    public final boolean mo34016n(float f, float f2) {
        return this.f77401L.contains(Math.round(f), Math.round(f2));
    }

    /* renamed from: o */
    public final boolean mo34017o() {
        return this.f77416i != 0 && (this.f77415h instanceof TextView);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f77394C = false;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        View view = this.f77415h;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this.f77407R);
        }
        Animator animator = this.f77424q;
        if (animator != null) {
            animator.removeAllListeners();
            this.f77424q.cancel();
            this.f77424q = null;
        }
        this.f77394C = false;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        canvas.save();
        if (this.f77418k != null) {
            canvas.clipRect(this.f77401L);
        }
        this.f77412e.draw(canvas);
        if (!this.f77433z) {
            this.f77413f.draw(canvas);
        }
        if (this.f77419l != null) {
            canvas.translate(this.f77408a.exactCenterX() - (((float) this.f77419l.getBounds().width()) / 2.0f), this.f77408a.exactCenterY() - (((float) this.f77419l.getBounds().height()) / 2.0f));
            this.f77419l.draw(canvas);
        } else {
            View view = this.f77415h;
            if (view == null) {
                throw new IllegalStateException("Neither target view nor drawable was set");
            } else if (!mo34024p()) {
                canvas.translate((float) this.f77408a.left, (float) this.f77408a.top);
                if (m53330u()) {
                    canvas.save();
                    float f = this.f77420m;
                    canvas.scale(f, f);
                }
                Paint paint = this.f77396E;
                if (paint != null) {
                    int saveLayer = canvas.saveLayer((RectF) null, paint, 31);
                    this.f77415h.draw(canvas);
                    canvas.restoreToCount(saveLayer);
                } else {
                    this.f77415h.draw(canvas);
                }
                if (m53330u()) {
                    canvas.restore();
                }
            } else {
                view.invalidate();
                this.f77423p.setImageBitmap(this.f77415h.getDrawingCache());
            }
        }
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        int i5;
        int i6;
        boolean z2 = true;
        C19556d.m37298a(this.f77415h != null, "Target view must be set before layout");
        this.f77394C = true;
        m53328s(this.f77400K, this.f77415h);
        Rect rect = this.f77408a;
        int[] iArr = this.f77400K;
        int i7 = iArr[0];
        rect.set(i7, iArr[1], this.f77415h.getWidth() + i7, this.f77400K[1] + this.f77415h.getHeight());
        Drawable drawable = this.f77419l;
        if (drawable != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_min_tap_target_size) / 2;
            int max = Math.max(drawable.getBounds().height() / 2, dimensionPixelSize);
            int max2 = Math.max(drawable.getBounds().width() / 2, dimensionPixelSize);
            int centerX = this.f77408a.centerX();
            int centerY = this.f77408a.centerY();
            this.f77408a.set(centerX - max2, centerY - max, centerX + max2, centerY + max);
        }
        Rect rect2 = this.f77408a;
        float f3 = this.f77420m;
        int width = rect2.width();
        float f4 = f3 - 4.0f;
        int height = rect2.height();
        float f5 = (((float) width) * f4) / 2.0f;
        rect2.left = (int) (((float) rect2.left) - f5);
        rect2.right = (int) (((float) rect2.right) + f5);
        float f6 = (((float) height) * f4) / 2.0f;
        rect2.top = (int) (((float) rect2.top) - f6);
        rect2.bottom = (int) (((float) rect2.bottom) + f6);
        if (this.f77419l == null && mo34024p()) {
            if (this.f77423p == null) {
                z2 = false;
            }
            C19556d.m37298a(z2, "Target view mock must be created before layout");
            this.f77423p.layout(this.f77408a.left, this.f77408a.top, this.f77408a.right, this.f77408a.bottom);
        }
        View view = this.f77418k;
        if (view != null) {
            m53327r(this.f77401L, view);
        } else {
            this.f77401L.set(i, i2, i3, i4);
        }
        this.f77412e.setBounds(this.f77401L);
        if (!this.f77433z) {
            this.f77413f.setBounds(this.f77401L);
        }
        C28516ag agVar = this.f77425r;
        Rect rect3 = this.f77408a;
        Rect rect4 = this.f77401L;
        View a = agVar.f77452d.f77414g.mo33966a();
        if (rect3.isEmpty() || rect4.isEmpty()) {
            a.layout(0, 0, 0, 0);
        } else {
            int centerY2 = rect3.centerY();
            int centerX2 = rect3.centerX();
            if (!agVar.f77453e) {
                C28515af afVar = agVar.f77452d.f77413f;
                afVar.f77439e = rect3.exactCenterX();
                afVar.f77440f = rect3.exactCenterY();
                afVar.f77438d = Math.max((float) afVar.f77435a, (((float) Math.max(rect3.width(), rect3.height())) / 2.0f) + ((float) afVar.f77436b));
                afVar.invalidateSelf();
                C28515af afVar2 = agVar.f77452d.f77413f;
                Rect rect5 = agVar.f77450b;
                float f7 = afVar2.f77438d + ((float) afVar2.f77437c);
                rect5.set(Math.round(afVar2.f77439e - f7), Math.round(afVar2.f77440f - f7), Math.round(afVar2.f77439e + f7), Math.round(afVar2.f77440f + f7));
            }
            int i8 = agVar.f77454f;
            if (i8 != 48 && (i8 == 80 || centerY2 < rect4.centerY())) {
                agVar.mo34047b(a, rect4.width(), rect4.bottom - agVar.f77450b.bottom);
                int a2 = agVar.mo34046a(a, rect4.left, rect4.right, a.getMeasuredWidth(), centerX2);
                int i9 = agVar.f77453e ? rect3.bottom + agVar.f77451c : agVar.f77450b.bottom;
                a.layout(a2, i9, a.getMeasuredWidth() + a2, a.getMeasuredHeight() + i9);
            } else {
                agVar.mo34047b(a, rect4.width(), (agVar.f77453e ? rect3.top : agVar.f77450b.top) - rect4.top);
                int a3 = agVar.mo34046a(a, rect4.left, rect4.right, a.getMeasuredWidth(), centerX2);
                int i10 = agVar.f77453e ? rect3.top - agVar.f77451c : agVar.f77450b.top;
                a.layout(a3, i10 - a.getMeasuredHeight(), a.getMeasuredWidth() + a3, i10);
            }
        }
        agVar.f77449a.set(a.getLeft(), a.getTop(), a.getRight(), a.getBottom());
        C28517ah ahVar = agVar.f77452d.f77412e;
        Rect rect6 = agVar.f77449a;
        boolean z3 = agVar.f77453e;
        ahVar.f77458b.set(rect3);
        ahVar.f77459c.set(rect6);
        float exactCenterX = rect3.exactCenterX();
        float exactCenterY = rect3.exactCenterY();
        if (z3) {
            int centerY3 = rect3.centerY();
            int centerY4 = rect4.centerY();
            int i11 = ahVar.f77461e;
            int i12 = i11 + i11;
            ahVar.f77465i = exactCenterX / 2.0f;
            if (centerY3 < centerY4) {
                i6 = rect6.bottom;
                i5 = C28517ah.m53354f(i6, exactCenterX, i12);
                ahVar.f77466j = (float) (-i5);
            } else {
                i6 = rect4.height() - rect6.top;
                i5 = C28517ah.m53354f(i6, exactCenterX, i12);
                ahVar.f77466j = (float) (rect4.height() + i5);
            }
            ahVar.f77464h = (float) (i6 + i5 + i12);
        } else {
            Rect bounds = ahVar.getBounds();
            if (Math.min(exactCenterY - ((float) bounds.top), ((float) bounds.bottom) - exactCenterY) < ((float) ahVar.f77457a)) {
                ahVar.f77465i = exactCenterX;
                ahVar.f77466j = exactCenterY;
            } else {
                if (exactCenterX <= bounds.exactCenterX()) {
                    f = rect6.exactCenterX() + ((float) ahVar.f77462f);
                } else {
                    f = rect6.exactCenterX() - ((float) ahVar.f77462f);
                }
                ahVar.f77465i = f;
                if (exactCenterY <= bounds.exactCenterY()) {
                    f2 = rect6.exactCenterY() + ((float) ahVar.f77463g);
                } else {
                    f2 = rect6.exactCenterY() - ((float) ahVar.f77463g);
                }
                exactCenterY = f2;
                ahVar.f77466j = exactCenterY;
            }
            ahVar.f77464h = ((float) ahVar.f77461e) + Math.max(C28517ah.m53355g(ahVar.f77465i, exactCenterY, rect3), C28517ah.m53355g(ahVar.f77465i, ahVar.f77466j, rect6));
        }
        ahVar.invalidateSelf();
        m53327r(this.f77402M, this.f77414g.mo33966a());
        m53327r(this.f77409b, this.f77414g.mo33969d());
        m53327r(this.f77410c, this.f77414g.mo33967b());
        m53327r(this.f77411d, this.f77414g.mo33968c());
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSize(View.MeasureSpec.getSize(i), i), resolveSize(View.MeasureSpec.getSize(i2), i2));
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f77405P = this.f77408a.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            actionMasked = 0;
        }
        if (!this.f77405P || this.f77415h == null) {
            this.f77403N.f6015a.f6014a.onTouchEvent(motionEvent);
            if (actionMasked == 1 && this.f77430w) {
                this.f77430w = false;
                this.f77432y = null;
                this.f77431x = null;
                if (this.f77428u > getResources().getDimension(R.dimen.libraries_material_featurehighlight_swipe_to_dismiss_threshold)) {
                    mo34025q();
                } else {
                    Animator animator = this.f77424q;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this.f77414g.mo33966a(), "alpha", new float[]{1.0f}).setDuration(150);
                    duration.setInterpolator(mo33999b(C28497j.f77329a, 1.0f - this.f77429v));
                    float exactCenterX = this.f77408a.exactCenterX();
                    float f = this.f77412e.f77465i;
                    float exactCenterY = this.f77408a.exactCenterY();
                    C28517ah ahVar = this.f77412e;
                    Animator duration2 = ahVar.mo34049b(exactCenterX - f, exactCenterY - ahVar.f77466j, 1.0f - this.f77429v).setDuration(150);
                    Animator duration3 = this.f77413f.mo34032b(1.0f - this.f77429v).setDuration(150);
                    AnimatorSet animatorSet = new AnimatorSet();
                    AnimatorSet.Builder with = animatorSet.play(duration).with(duration2).with(duration3);
                    if (mo34024p()) {
                        with.with(ObjectAnimator.ofFloat(this.f77423p, "elevation", new float[]{this.f77415h.getElevation()}).setDuration(150));
                    }
                    animatorSet.addListener(new C28541w(this));
                    mo34015m(animatorSet);
                }
                if (!this.f77427t) {
                    this.f77426s.mo33996b();
                }
            }
        } else {
            C2100o oVar = this.f77404O;
            if (oVar != null) {
                oVar.f6015a.f6014a.onTouchEvent(motionEvent);
                if (actionMasked == 1) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.setAction(3);
                }
            }
            this.f77415h.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: p */
    public final boolean mo34024p() {
        return this.f77421n;
    }

    /* renamed from: q */
    public final void mo34025q() {
        if (!this.f77427t) {
            this.f77426s.mo33995d();
        }
    }

    public final void setVisibility(int i) {
        if (i == getVisibility()) {
            super.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            m53329t(false);
            ViewParent s = C2043bi.m5590s(this);
            if (s instanceof View) {
                ((View) s).sendAccessibilityEvent(32);
            }
        } else if (i == 0) {
            sendAccessibilityEvent(32);
            m53329t(true);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f77412e || drawable == this.f77413f || drawable == this.f77419l;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
