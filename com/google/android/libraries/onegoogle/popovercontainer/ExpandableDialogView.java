package com.google.android.libraries.onegoogle.popovercontainer;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Parcelable;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import androidx.core.content.C1878d;
import androidx.core.graphics.C1924a;
import androidx.core.p098j.C2008ab;
import androidx.core.p098j.C2009ac;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2100o;
import androidx.p119j.p120a.p121a.C2299a;
import androidx.p119j.p120a.p121a.C2300b;
import androidx.p119j.p120a.p121a.C2302d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.common.C30899a;
import com.google.android.libraries.onegoogle.common.C30910aj;
import com.google.android.libraries.onegoogle.common.OverScrollControlledNestedScrollView;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30872ae;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.android.libraries.p2203m.p2204a.C28487a;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.p3504a.C44499d;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3508e.C44654a;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44784o;
import com.google.android.material.p3515l.C44785p;

/* compiled from: PG */
public final class ExpandableDialogView extends ViewGroup implements C2008ab, C30872ae {

    /* renamed from: m */
    public static final /* synthetic */ int f83539m = 0;

    /* renamed from: n */
    private static final TimeInterpolator f83540n = new C2299a();

    /* renamed from: o */
    private static final Property f83541o = new C31048j(Integer.class);

    /* renamed from: p */
    private static final Property f83542p = new C31049k(RectF.class);

    /* renamed from: q */
    private static final Property f83543q = new C31050l(Integer.class);

    /* renamed from: A */
    private boolean f83544A;

    /* renamed from: B */
    private boolean f83545B;

    /* renamed from: C */
    private int f83546C;

    /* renamed from: D */
    private final Paint f83547D;

    /* renamed from: E */
    private final Paint f83548E;

    /* renamed from: F */
    private final Paint f83549F;

    /* renamed from: G */
    private final RectF f83550G;

    /* renamed from: H */
    private final ObjectAnimator f83551H;

    /* renamed from: I */
    private final ObjectAnimator f83552I;

    /* renamed from: J */
    private final int f83553J;

    /* renamed from: K */
    private final C44654a f83554K;

    /* renamed from: L */
    private final Paint f83555L;

    /* renamed from: M */
    private final int f83556M;

    /* renamed from: N */
    private final boolean f83557N;

    /* renamed from: O */
    private final boolean f83558O;

    /* renamed from: P */
    private final C2100o f83559P;

    /* renamed from: Q */
    private OverScrollControlledNestedScrollView f83560Q;

    /* renamed from: R */
    private View f83561R;

    /* renamed from: S */
    private View f83562S;

    /* renamed from: T */
    private boolean f83563T;

    /* renamed from: U */
    private Configuration f83564U;

    /* renamed from: V */
    private boolean f83565V;

    /* renamed from: W */
    private boolean f83566W;

    /* renamed from: a */
    public final Rect f83567a = new Rect();

    /* renamed from: aa */
    private boolean f83568aa;

    /* renamed from: ab */
    private int f83569ab;

    /* renamed from: ac */
    private int f83570ac;

    /* renamed from: ad */
    private int f83571ad;

    /* renamed from: ae */
    private int f83572ae;

    /* renamed from: af */
    private int f83573af;

    /* renamed from: b */
    public final float f83574b;

    /* renamed from: c */
    public final RectF f83575c;

    /* renamed from: d */
    public View f83576d;

    /* renamed from: e */
    public final C44779j f83577e;

    /* renamed from: f */
    public final float f83578f;

    /* renamed from: g */
    public float f83579g;

    /* renamed from: h */
    public View f83580h;

    /* renamed from: i */
    public int f83581i;

    /* renamed from: j */
    public Runnable f83582j;

    /* renamed from: k */
    public Window f83583k;

    /* renamed from: l */
    public int f83584l;

    /* renamed from: r */
    private final C2009ac f83585r = new C2009ac();

    /* renamed from: s */
    private final Rect f83586s = new Rect();

    /* renamed from: t */
    private final int f83587t;

    /* renamed from: u */
    private final int f83588u;

    /* renamed from: v */
    private final int f83589v;

    /* renamed from: w */
    private final int f83590w;

    /* renamed from: x */
    private final int f83591x;

    /* renamed from: y */
    private final int f83592y;

    /* renamed from: z */
    private float f83593z;

    /* compiled from: PG */
    abstract class State implements Parcelable {
        /* renamed from: a */
        public abstract Parcelable mo36685a();

        /* renamed from: b */
        public abstract boolean mo36686b();
    }

    /* JADX INFO: finally extract failed */
    public ExpandableDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        Paint paint = new Paint(1);
        this.f83547D = paint;
        Paint paint2 = new Paint(1);
        this.f83548E = paint2;
        Paint paint3 = new Paint(1);
        this.f83549F = paint3;
        this.f83550G = new RectF();
        RectF rectF = new RectF();
        this.f83575c = rectF;
        Paint paint4 = new Paint(1);
        this.f83555L = paint4;
        this.f83554K = new C44654a(context);
        this.f83587t = getResources().getDimensionPixelSize(R.dimen.og_dialog_margin_horizontal);
        this.f83589v = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_margin_bottom);
        this.f83590w = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_width);
        this.f83591x = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_max_height);
        this.f83592y = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_min_scroll);
        float c = C30899a.m57684c(getContext());
        this.f83574b = c;
        this.f83578f = (float) getResources().getDimensionPixelSize(R.dimen.og_dialog_header_elevation);
        setWillNotDraw(false);
        paint4.setStyle(Paint.Style.FILL);
        if (C30899a.m57683b(getContext(), R.attr.ogUseElevatedSurfaceBackgroundColor).data != 0) {
            Context context2 = getContext();
            i = new C44654a(context2).mo47886a(C44535e.m78720c(context2, R.attr.colorSurface, 0), context2.getResources().getDimension(R.dimen.m3_sys_elevation_level2));
        } else {
            i = C28487a.m53260a(getContext(), R.attr.colorSurface);
        }
        this.f83553J = i;
        int a = C30899a.m57682a(getContext(), R.attr.ogLightGrey);
        this.f83556M = a;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C31037al.f83609a, 0, 0);
        try {
            this.f83557N = obtainStyledAttributes.getBoolean(2, false);
            this.f83558O = obtainStyledAttributes.getBoolean(0, false);
            this.f83588u = obtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.og_dialog_default_margin_top));
            obtainStyledAttributes.recycle();
            paint3.setColor(i);
            paint.setColor(C1924a.m5189h(i, Math.round(204.0f)));
            paint2.setColor(a);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, f83541o, new int[]{0});
            this.f83552I = ofInt;
            ofInt.setDuration(150);
            ofInt.setInterpolator(new C2300b());
            ofInt.addListener(new C31044f(this));
            C44779j O = C44779j.m79382O(getContext(), 0.0f);
            this.f83577e = O;
            O.mo48124V(ColorStateList.valueOf(i));
            C44784o oVar = new C44784o();
            oVar.mo48149h(c);
            oVar.mo48150i(c);
            O.mo47555l(new C44785p(oVar));
            ObjectAnimator ofObject = ObjectAnimator.ofObject(this, f83542p, new C31038am(new RectF()), new RectF[]{rectF});
            this.f83551H = ofObject;
            ofObject.setDuration(300);
            ofObject.setInterpolator(new C2300b());
            ofObject.addListener(new C31045g(this));
            setClipToOutline(true);
            setOutlineProvider(new C31046h(this));
            setClipChildren(false);
            m57897o(getResources().getConfiguration());
            C2100o oVar2 = new C2100o(getContext(), new C31047i(this), (Handler) null);
            this.f83559P = oVar2;
            oVar2.f6015a.f6014a.setIsLongpressEnabled(false);
            this.f83584l = 1;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: n */
    private final void m57896n(int i) {
        int i2;
        int i3;
        int height = this.f83567a.height();
        int round = Math.round(((float) this.f83587t) * (1.0f - mo36692a()));
        if (!this.f83565V || i <= this.f83590w) {
            Rect rect = this.f83567a;
            int i4 = this.f83586s.top;
            if (mo36701m()) {
                i2 = 0;
            } else {
                i2 = this.f83546C - this.f83581i;
            }
            rect.top = i4 + i2;
            this.f83567a.left = this.f83586s.left + round;
            this.f83567a.right = (i - this.f83586s.right) - round;
            if (this.f83544A || m57900r()) {
                Rect rect2 = this.f83567a;
                rect2.bottom = rect2.top + height;
            } else if (this.f83581i <= 0) {
                Rect rect3 = this.f83567a;
                rect3.bottom = rect3.top + this.f83576d.getMeasuredHeight() + this.f83570ac;
            } else {
                int measuredHeight = this.f83586s.top + this.f83546C + this.f83576d.getMeasuredHeight() + this.f83570ac;
                this.f83567a.bottom = measuredHeight + Math.round(((float) (this.f83569ab - measuredHeight)) * mo36692a());
            }
            if (mo36701m()) {
                this.f83550G.set(0.0f, 0.0f, (float) i, (float) this.f83569ab);
                return;
            }
            this.f83550G.set((float) this.f83567a.left, ((float) this.f83567a.top) - (C2302d.m6236a(C2299a.f6447a, Math.max(0.0f, (mo36692a() - 7.2f) / 0.39999998f)) * ((float) this.f83586s.top)), (float) this.f83567a.right, (float) this.f83567a.bottom);
            return;
        }
        this.f83567a.top = this.f83546C + this.f83586s.top;
        int i5 = this.f83584l;
        int i6 = i5 - 1;
        if (i5 != 0) {
            if (i6 == 0) {
                this.f83567a.left = ((((i - this.f83586s.left) - this.f83586s.right) - this.f83590w) / 2) + this.f83586s.left;
            } else if (i6 == 1) {
                Rect rect4 = this.f83567a;
                if (C2043bi.m5577f(this.f83576d) == 0) {
                    i3 = (((i - this.f83586s.left) - this.f83586s.right) - this.f83590w) - round;
                } else {
                    i3 = this.f83586s.left + round;
                }
                rect4.left = i3;
            }
            Rect rect5 = this.f83567a;
            rect5.right = rect5.left + this.f83590w;
            Rect rect6 = this.f83567a;
            rect6.bottom = rect6.top + height;
            this.f83550G.set(this.f83567a);
            return;
        }
        throw null;
    }

    /* renamed from: o */
    private final void m57897o(Configuration configuration) {
        boolean z = true;
        this.f83565V = configuration.smallestScreenWidthDp >= 600;
        if (configuration.orientation != 2) {
            z = false;
        }
        this.f83566W = z;
        this.f83568aa = C30910aj.m57700a(getContext());
        requestLayout();
    }

    /* renamed from: p */
    private final void m57898p() {
        OverScrollControlledNestedScrollView overScrollControlledNestedScrollView = this.f83560Q;
        if (overScrollControlledNestedScrollView != null) {
            boolean z = true;
            if (!mo36701m() && !this.f83565V) {
                z = false;
            }
            overScrollControlledNestedScrollView.f83312e = z;
        }
    }

    /* renamed from: q */
    private final boolean m57899q() {
        int i = this.f83581i;
        return i < -290 || i <= this.f83573af;
    }

    /* renamed from: r */
    private final boolean m57900r() {
        return (this.f83566W || this.f83568aa) && !this.f83565V;
    }

    /* renamed from: a */
    public final float mo36692a() {
        if (this.f83565V) {
            return 0.0f;
        }
        if (m57900r()) {
            return 1.0f;
        }
        return this.f83593z;
    }

    /* renamed from: b */
    public final void mo35630b(C30897z zVar) {
        zVar.mo35822b(findViewById(R.id.og_container_header), 93522);
        zVar.mo35822b(findViewById(R.id.og_header_close_button), 93521);
        View view = this.f83580h;
        view.getClass();
        zVar.mo35822b(view, 90573);
    }

    /* renamed from: c */
    public final void mo36693c(float f) {
        this.f83562S.setTranslationY(f);
        this.f83561R.setTranslationY(f);
    }

    /* renamed from: d */
    public final void mo1848d(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        if (i2 > 0 && (i4 = this.f83581i) < (i5 = this.f83546C)) {
            if (!this.f83544A && !this.f83545B) {
                i5 = 0;
            }
            int min = Math.min(i2, i5 - i4);
            iArr[1] = min;
            mo36697i(this.f83581i + min);
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipRect((float) this.f83567a.left, (float) this.f83567a.top, (float) this.f83567a.right, this.f83575c.bottom);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* renamed from: e */
    public final void mo1850e(View view, int i, int i2, int i3, int i4, int i5) {
    }

    /* renamed from: f */
    public final void mo1851f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i4 >= 0) {
            return;
        }
        if (i5 == 0 || this.f83581i < this.f83546C) {
            int max = Math.max(i4 + this.f83581i, this.f83573af);
            iArr[1] = max - this.f83581i;
            mo36697i(max);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        this.f83586s.set(rect);
        return true;
    }

    /* renamed from: g */
    public final void mo1852g(View view, View view2, int i, int i2) {
        this.f83585r.mo5172a(i, i2);
    }

    public final int getNestedScrollAxes() {
        C2009ac acVar = this.f83585r;
        return acVar.f5928b | acVar.f5927a;
    }

    /* renamed from: h */
    public final void mo1857h(View view, int i) {
        this.f83585r.mo5173b(i);
        if (i == 1) {
            this.f83563T = false;
        }
        if (!this.f83563T && !mo36701m()) {
            if (m57899q()) {
                this.f83552I.setIntValues(new int[]{this.f83572ae});
                ObjectAnimator objectAnimator = this.f83552I;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(50);
                animatorSet.setInterpolator(new AccelerateInterpolator());
                if (this.f83583k != null) {
                    int a = C1878d.m5128a(getContext(), R.color.google_scrim);
                    animatorSet.playTogether(new Animator[]{objectAnimator, ObjectAnimator.ofObject(this.f83583k.getDecorView(), f83543q, new C44499d(), new Integer[]{Integer.valueOf(a), Integer.valueOf(C1924a.m5189h(a, 0))})});
                } else {
                    animatorSet.playTogether(new Animator[]{objectAnimator});
                }
                animatorSet.start();
                return;
            }
            if (this.f83581i >= 145) {
                this.f83552I.setIntValues(new int[]{this.f83546C});
            } else {
                this.f83552I.setIntValues(new int[]{0});
            }
            this.f83552I.start();
        }
    }

    /* renamed from: i */
    public final void mo36697i(int i) {
        Runnable runnable;
        if (this.f83581i != i) {
            this.f83593z = Math.max(0.0f, ((float) i) / ((float) this.f83546C));
            m57898p();
            this.f83560Q.offsetTopAndBottom(this.f83581i - i);
            this.f83581i = i;
            this.f83551H.cancel();
            m57896n(getWidth());
            if (!this.f83544A) {
                mo36698j(this.f83550G);
            }
            this.f83575c.set(this.f83550G);
            mo36699k();
            invalidate();
            invalidateOutline();
            this.f83576d.measure(View.MeasureSpec.makeMeasureSpec(this.f83567a.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), LinearLayoutManager.INVALID_OFFSET));
            this.f83576d.layout(this.f83567a.left, this.f83567a.top, this.f83567a.right, this.f83567a.top + this.f83576d.getMeasuredHeight());
            if (!this.f83557N) {
                this.f83560Q.layout(this.f83567a.left, this.f83576d.getBottom(), this.f83567a.right, this.f83567a.bottom);
            }
            if (i <= this.f83572ae && (runnable = this.f83582j) != null) {
                C31036ak akVar = ((C31058t) runnable).f83648a;
                akVar.mo36730c();
                akVar.dismiss();
            }
        }
    }

    /* renamed from: j */
    public final void mo36698j(RectF rectF) {
        this.f83575c.set(rectF);
        mo36693c((rectF.bottom - ((float) this.f83560Q.getTop())) - ((float) this.f83571ad));
        mo36699k();
        invalidate();
        invalidateOutline();
    }

    /* renamed from: k */
    public final void mo36699k() {
        boolean l = mo36700l();
        if (this.f83575c.top < ((float) this.f83586s.top) / 2.0f) {
            setSystemUiVisibility(getSystemUiVisibility() & -8193);
            if (!l) {
                setSystemUiVisibility(getSystemUiVisibility() | 8192);
            }
        } else {
            setSystemUiVisibility(getSystemUiVisibility() & -8193);
        }
        int i = 0;
        boolean z = this.f83575c.bottom >= ((float) (getHeight() - this.f83586s.bottom));
        Window window = this.f83583k;
        if (window != null) {
            if (this.f83566W || !z) {
                window.setNavigationBarColor(0);
            } else {
                window.setNavigationBarColor(0);
            }
        }
        if (!this.f83566W || this.f83565V) {
            if (!z) {
                setSystemUiVisibility(getSystemUiVisibility() & -17);
            }
            Window window2 = this.f83583k;
            if (window2 != null) {
                if (z) {
                    i = this.f83556M;
                }
                window2.setNavigationBarDividerColor(i);
            }
        }
    }

    /* renamed from: l */
    public final boolean mo36700l() {
        Configuration configuration = this.f83564U;
        return configuration != null && (configuration.uiMode & 48) == 32;
    }

    /* renamed from: lk */
    public final void mo35632lk(C30897z zVar) {
        zVar.mo35825e(findViewById(R.id.og_header_close_button));
        zVar.mo35825e(findViewById(R.id.og_container_header));
        View view = this.f83580h;
        view.getClass();
        zVar.mo35825e(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo36701m() {
        return mo36692a() == 1.0f;
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.f83586s.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new C31043e(this));
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m57897o(configuration);
        m57898p();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        float a = this.f83574b * (1.0f - mo36692a());
        canvas.drawRoundRect(this.f83575c, a, a, this.f83549F);
        C44779j jVar = this.f83577e;
        C44784o oVar = new C44784o();
        oVar.mo48149h(a);
        oVar.mo48150i(a);
        jVar.mo47555l(new C44785p(oVar));
        if (mo36701m()) {
            float a2 = C2043bi.m5533a(this.f83576d);
            if (a2 == 0.0f) {
                i = this.f83553J;
            } else {
                i = this.f83554K.mo47887b(this.f83553J, a2 + C44741bm.m79309b(this));
            }
            this.f83555L.setColor(i);
            canvas.drawRect((float) this.f83586s.left, (float) (-this.f83586s.top), this.f83575c.right - ((float) this.f83586s.right), (float) this.f83576d.getTop(), this.f83555L);
        }
    }

    public final void onDrawForeground(Canvas canvas) {
        float a = this.f83574b * (1.0f - mo36692a());
        canvas.save();
        canvas.clipRect(0, getHeight() - this.f83586s.bottom, getWidth(), getHeight());
        canvas.drawRoundRect(this.f83575c, a, a, this.f83547D);
        canvas.drawRect(0.0f, (float) (getHeight() - this.f83586s.bottom), (float) getWidth(), (float) ((getHeight() - this.f83586s.bottom) + 1), this.f83548E);
        canvas.restore();
        if (mo36701m()) {
            if (this.f83586s.left > 0) {
                canvas.drawRect((float) (this.f83586s.left - 1), 0.0f, (float) this.f83586s.left, (float) getHeight(), this.f83548E);
            }
            if (this.f83586s.right > 0) {
                canvas.drawRect((float) (getWidth() - this.f83586s.right), 0.0f, (float) ((getWidth() - this.f83586s.right) + 1), (float) getHeight(), this.f83548E);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View childAt = getChildAt(0);
        this.f83576d = childAt;
        C2043bi.m5530X(childAt, this.f83577e);
        this.f83576d.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        this.f83560Q = (OverScrollControlledNestedScrollView) findViewById(R.id.og_container_scroll_view);
        this.f83561R = findViewById(R.id.og_container_footer_divider);
        this.f83562S = findViewById(R.id.og_container_footer);
        this.f83580h = findViewById(R.id.og_dialog_scrim_ve);
        this.f83561R.setBackgroundColor(this.f83556M);
        findViewById(R.id.og_container_disable_content_view).setBackgroundColor(this.f83553J);
        m57898p();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect;
        this.f83576d.layout(this.f83567a.left, this.f83567a.top, this.f83567a.right, this.f83567a.top + this.f83576d.getMeasuredHeight());
        if (this.f83565V || !this.f83557N) {
            rect = this.f83567a;
        } else {
            rect = this.f83586s;
        }
        int i5 = rect.left;
        this.f83560Q.layout(i5, this.f83576d.getBottom(), this.f83560Q.getMeasuredWidth() + i5, this.f83567a.bottom);
        if (this.f83581i == 0) {
            this.f83560Q.setScrollY(0);
        }
        mo36699k();
        if (!getResources().getConfiguration().equals(this.f83564U)) {
            this.f83564U = getResources().getConfiguration();
            this.f83575c.set(this.f83550G);
            invalidateOutline();
        } else if (!this.f83575c.equals(this.f83550G)) {
            this.f83551H.setObjectValues(new Object[]{this.f83550G});
            this.f83551H.start();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        m57896n(size);
        int i7 = (size2 - this.f83586s.top) - this.f83586s.bottom;
        this.f83576d.measure(View.MeasureSpec.makeMeasureSpec(this.f83567a.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(i7, LinearLayoutManager.INVALID_OFFSET));
        int measuredHeight = this.f83576d.getMeasuredHeight();
        if (this.f83565V || !this.f83557N) {
            i3 = this.f83567a.width();
        } else {
            i3 = (size - this.f83586s.left) - this.f83586s.right;
        }
        int i8 = i7 - measuredHeight;
        boolean z = this.f83565V;
        if (z) {
            i4 = (i8 - this.f83588u) - this.f83589v;
        } else {
            i4 = i8 - this.f83588u;
        }
        boolean z2 = false;
        int i9 = z ? this.f83592y : 0;
        this.f83569ab = size2 - this.f83586s.bottom;
        this.f83560Q.findViewById(R.id.og_container_scroll_root).setMinimumHeight(0);
        this.f83560Q.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i8, LinearLayoutManager.INVALID_OFFSET));
        this.f83570ac = this.f83560Q.getMeasuredHeight();
        if (this.f83560Q.getMeasuredHeight() - i4 >= i9) {
            z2 = true;
        }
        this.f83544A = z2;
        if (mo36701m() || (!this.f83565V && z2 && this.f83560Q.getMeasuredHeight() < i8)) {
            this.f83560Q.findViewById(R.id.og_container_scroll_root).setMinimumHeight(i8);
            this.f83560Q.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i8, 1073741824));
        }
        if (mo36701m() || this.f83544A) {
            i5 = this.f83565V ? Math.min(this.f83591x - measuredHeight, i4) : i8;
        } else {
            i5 = this.f83560Q.getMeasuredHeight();
            this.f83593z = 0.0f;
            m57898p();
        }
        if (!this.f83558O || mo36701m() || this.f83565V) {
            this.f83546C = this.f83588u;
        } else {
            this.f83546C = Math.max(this.f83588u, (i8 - i5) / 2);
        }
        int i10 = -size2;
        this.f83572ae = this.f83586s.top + i10 + this.f83546C;
        this.f83573af = (i10 / 2) + this.f83586s.top + this.f83546C;
        Rect rect = this.f83567a;
        rect.bottom = rect.top + i5 + measuredHeight;
        RectF rectF = this.f83550G;
        if (mo36701m()) {
            i6 = this.f83569ab;
        } else {
            i6 = this.f83567a.bottom;
        }
        rectF.bottom = (float) i6;
        this.f83571ad = this.f83560Q.findViewById(R.id.og_container_scroll_root).getMeasuredHeight();
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f83581i < this.f83546C;
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f83585r.mo5172a(i, 0);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        State state = (State) parcelable;
        super.onRestoreInstanceState(state.mo36685a());
        this.f83593z = true != state.mo36686b() ? 0.0f : 1.0f;
        m57898p();
        this.f83581i = Math.round(this.f83593z * ((float) this.f83588u));
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        boolean z = this.f83593z == 1.0f;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            return new AutoValue_ExpandableDialogView_State(z, onSaveInstanceState);
        }
        throw new NullPointerException("Null parentState");
    }

    public final void onStopNestedScroll(View view) {
        this.f83585r.mo5173b(0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f83559P.f6015a.f6014a.onTouchEvent(motionEvent);
    }

    /* renamed from: t */
    public final boolean mo1884t(View view, View view2, int i, int i2) {
        if (m57899q()) {
            return false;
        }
        this.f83552I.cancel();
        if (this.f83565V || m57900r()) {
            return false;
        }
        if (i2 == 1) {
            this.f83563T = true;
        }
        this.f83545B = mo36701m();
        return true;
    }
}
