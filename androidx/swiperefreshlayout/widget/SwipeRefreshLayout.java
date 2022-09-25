package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import androidx.core.content.C1878d;
import androidx.core.p098j.C2007aa;
import androidx.core.p098j.C2008ab;
import androidx.core.p098j.C2009ac;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2110y;
import androidx.core.p098j.C2111z;
import androidx.core.widget.C2126m;
import com.google.common.p4535g.C59203do;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public class SwipeRefreshLayout extends ViewGroup implements C2008ab, C2007aa, C2110y {

    /* renamed from: o */
    private static final String f13491o = "SwipeRefreshLayout";

    /* renamed from: p */
    private static final int[] f13492p = {16842766};

    /* renamed from: A */
    private float f13493A;

    /* renamed from: B */
    private float f13494B;

    /* renamed from: C */
    private boolean f13495C;

    /* renamed from: D */
    private int f13496D;

    /* renamed from: E */
    private final DecelerateInterpolator f13497E;

    /* renamed from: F */
    private int f13498F;

    /* renamed from: G */
    private Animation f13499G;

    /* renamed from: H */
    private Animation f13500H;

    /* renamed from: I */
    private Animation f13501I;

    /* renamed from: J */
    private Animation f13502J;

    /* renamed from: K */
    private Animation f13503K;

    /* renamed from: L */
    private int f13504L;

    /* renamed from: M */
    private Animation.AnimationListener f13505M;

    /* renamed from: N */
    private final Animation f13506N;

    /* renamed from: O */
    private final Animation f13507O;

    /* renamed from: a */
    public C4186o f13508a;

    /* renamed from: b */
    public boolean f13509b;

    /* renamed from: c */
    public final C2111z f13510c;

    /* renamed from: d */
    int f13511d;

    /* renamed from: e */
    boolean f13512e;

    /* renamed from: f */
    public C4172a f13513f;

    /* renamed from: g */
    protected int f13514g;

    /* renamed from: h */
    float f13515h;

    /* renamed from: i */
    protected int f13516i;

    /* renamed from: j */
    public int f13517j;

    /* renamed from: k */
    public int f13518k;

    /* renamed from: l */
    C4176e f13519l;

    /* renamed from: m */
    boolean f13520m;

    /* renamed from: n */
    boolean f13521n;

    /* renamed from: q */
    private View f13522q;

    /* renamed from: r */
    private int f13523r;

    /* renamed from: s */
    private float f13524s;

    /* renamed from: t */
    private float f13525t;

    /* renamed from: u */
    private final C2009ac f13526u;

    /* renamed from: v */
    private final int[] f13527v;

    /* renamed from: w */
    private final int[] f13528w;

    /* renamed from: x */
    private final int[] f13529x;

    /* renamed from: y */
    private boolean f13530y;

    /* renamed from: z */
    private int f13531z;

    public SwipeRefreshLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: q */
    private final Animation m11963q(int i, int i2) {
        C4181j jVar = new C4181j(this, i, i2);
        jVar.setDuration(300);
        C4172a aVar = this.f13513f;
        aVar.f13533a = null;
        aVar.clearAnimation();
        this.f13513f.startAnimation(jVar);
        return jVar;
    }

    /* renamed from: r */
    private final void mo112033r() {
        if (this.f13522q == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f13513f)) {
                    this.f13522q = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: s */
    private final void m11965s(float f) {
        if (f > this.f13524s) {
            m11968w(true, true);
            return;
        }
        this.f13509b = false;
        this.f13519l.mo8837e(0.0f);
        C4182k kVar = !this.f13512e ? new C4182k(this) : null;
        int i = this.f13511d;
        if (this.f13512e) {
            this.f13514g = i;
            this.f13515h = this.f13513f.getScaleX();
            C4185n nVar = new C4185n(this);
            this.f13503K = nVar;
            nVar.setDuration(150);
            if (kVar != null) {
                this.f13513f.f13533a = kVar;
            }
            this.f13513f.clearAnimation();
            this.f13513f.startAnimation(this.f13503K);
        } else {
            this.f13514g = i;
            this.f13507O.reset();
            this.f13507O.setDuration(200);
            this.f13507O.setInterpolator(this.f13497E);
            if (kVar != null) {
                this.f13513f.f13533a = kVar;
            }
            this.f13513f.clearAnimation();
            this.f13513f.startAnimation(this.f13507O);
        }
        this.f13519l.mo8833b(false);
    }

    /* renamed from: u */
    private final void m11966u(float f) {
        this.f13519l.mo8833b(true);
        float min = Math.min(1.0f, Math.abs(f / this.f13524s));
        double d = (double) min;
        Double.isNaN(d);
        float max = (((float) Math.max(d - 11.2d, C59203do.f157270a)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f13524s;
        int i = this.f13518k;
        if (i <= 0) {
            i = this.f13517j;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 + f2) / f2) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = (float) (max2 - pow);
        float f4 = f3 + f3;
        float f5 = f2 * f4;
        int i2 = this.f13516i + ((int) ((f2 * min) + f5 + f5));
        if (this.f13513f.getVisibility() != 0) {
            this.f13513f.setVisibility(0);
        }
        if (!this.f13512e) {
            this.f13513f.setScaleX(1.0f);
            this.f13513f.setScaleY(1.0f);
        }
        if (this.f13512e) {
            mo8778c(Math.min(1.0f, f / this.f13524s));
        }
        if (f < this.f13524s) {
            if (this.f13519l.f13563a.f13558t > 76 && !m11970y(this.f13501I)) {
                this.f13501I = m11963q(this.f13519l.f13563a.f13558t, 76);
            }
        } else if (this.f13519l.f13563a.f13558t < 255 && !m11970y(this.f13502J)) {
            this.f13502J = m11963q(this.f13519l.f13563a.f13558t, PrivateKeyType.INVALID);
        }
        this.f13519l.mo8837e(Math.min(0.8f, max * 0.8f));
        this.f13519l.mo8834c(Math.min(1.0f, max));
        C4176e eVar = this.f13519l;
        eVar.f13563a.f13545g = (((max * 0.4f) - 16.0f) + f4 + f4) * 0.5f;
        eVar.invalidateSelf();
        mo8786fJ(i2 - this.f13511d);
    }

    /* renamed from: v */
    private final void m11967v(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f13496D) {
            this.f13496D = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: w */
    private final void m11968w(boolean z, boolean z2) {
        if (this.f13509b != z) {
            this.f13520m = z2;
            mo112033r();
            this.f13509b = z;
            if (z) {
                int i = this.f13511d;
                Animation.AnimationListener animationListener = this.f13505M;
                this.f13514g = i;
                this.f13506N.reset();
                this.f13506N.setDuration(200);
                this.f13506N.setInterpolator(this.f13497E);
                if (animationListener != null) {
                    this.f13513f.f13533a = animationListener;
                }
                this.f13513f.clearAnimation();
                this.f13513f.startAnimation(this.f13506N);
                return;
            }
            mo8795n(this.f13505M);
        }
    }

    /* renamed from: x */
    private final void m11969x(float f) {
        float f2 = this.f13494B;
        float f3 = (float) this.f13523r;
        if (f - f2 > f3 && !this.f13495C) {
            this.f13493A = f2 + f3;
            this.f13495C = true;
            this.f13519l.setAlpha(76);
        }
    }

    /* renamed from: y */
    private static final boolean m11970y(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo8778c(float f) {
        this.f13513f.setScaleX(f);
        this.f13513f.setScaleY(f);
    }

    /* renamed from: d */
    public final void mo1848d(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        mo8794l(true, true);
        return true;
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f13510c.mo5281c(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f13510c.mo5282d(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f13510c.mo5283e(i, i2, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f13510c.mo5284f(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: e */
    public final void mo1850e(View view, int i, int i2, int i3, int i4, int i5) {
        mo1851f(view, i, i2, i3, i4, i5, this.f13529x);
    }

    /* renamed from: f */
    public final void mo1851f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (i5 == 0) {
            int i7 = iArr[1];
            this.f13510c.mo5284f(i, i2, i3, i4, this.f13528w, 0, iArr);
            int i8 = i4 - (iArr[1] - i7);
            if (i8 == 0) {
                i8 = this.f13528w[1] + i4;
                i6 = 0;
            } else {
                i6 = i8;
            }
            if (i8 < 0 && !mo8796o()) {
                float abs = this.f13525t + ((float) Math.abs(i8));
                this.f13525t = abs;
                m11966u(abs);
                iArr[1] = iArr[1] + i6;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fH */
    public final void mo8784fH(float f) {
        int i = this.f13514g;
        mo8786fJ((i + ((int) (((float) (this.f13516i - i)) * f))) - this.f13513f.getTop());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fI */
    public final void mo8785fI() {
        this.f13513f.clearAnimation();
        this.f13519l.stop();
        this.f13513f.setVisibility(8);
        this.f13513f.getBackground().setAlpha(PrivateKeyType.INVALID);
        this.f13519l.setAlpha(PrivateKeyType.INVALID);
        if (this.f13512e) {
            mo8778c(0.0f);
        } else {
            mo8786fJ(this.f13516i - this.f13511d);
        }
        this.f13511d = this.f13513f.getTop();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fJ */
    public final void mo8786fJ(int i) {
        this.f13513f.bringToFront();
        C2043bi.m5517K(this.f13513f, i);
        this.f13511d = this.f13513f.getTop();
    }

    /* renamed from: g */
    public final void mo1852g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* access modifiers changed from: protected */
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f13498F;
        return i3 < 0 ? i2 : i2 == i + -1 ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    public final int getNestedScrollAxes() {
        C2009ac acVar = this.f13526u;
        return acVar.f5928b | acVar.f5927a;
    }

    /* renamed from: h */
    public final void mo1857h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final boolean hasNestedScrollingParent() {
        return this.f13510c.mo5285g(0);
    }

    /* renamed from: i */
    public final void mo8790i(int... iArr) {
        mo112033r();
        C4176e eVar = this.f13519l;
        eVar.f13563a.mo8828d(iArr);
        eVar.f13563a.mo8827c(0);
        eVar.invalidateSelf();
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f13510c.f6017a;
    }

    /* renamed from: j */
    public final void mo8792j(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[1];
        for (int i = 0; i <= 0; i++) {
            iArr2[i] = C1878d.m5128a(context, iArr[i]);
        }
        mo8790i(iArr2);
    }

    /* renamed from: k */
    public final void mo8793k(boolean z, int i) {
        this.f13517j = i;
        this.f13512e = z;
        this.f13513f.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo8795n(Animation.AnimationListener animationListener) {
        C4180i iVar = new C4180i(this);
        this.f13500H = iVar;
        iVar.setDuration(150);
        C4172a aVar = this.f13513f;
        aVar.f13533a = animationListener;
        aVar.clearAnimation();
        this.f13513f.startAnimation(this.f13500H);
    }

    /* renamed from: o */
    public final boolean mo8796o() {
        View view = this.f13522q;
        if (view instanceof ListView) {
            return C2126m.m5898b((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo8785fI();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mo112033r();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || mo8796o() || this.f13509b || this.f13530y) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f13496D;
                    if (i == -1) {
                        Log.e(f13491o, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m11969x(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m11967v(motionEvent);
                    }
                }
            }
            this.f13495C = false;
            this.f13496D = -1;
        } else {
            mo8786fJ(this.f13516i - this.f13513f.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f13496D = pointerId;
            this.f13495C = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f13494B = motionEvent.getY(findPointerIndex2);
        }
        return this.f13495C;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f13522q == null) {
                mo112033r();
            }
            View view = this.f13522q;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f13513f.getMeasuredWidth();
                int measuredHeight2 = this.f13513f.getMeasuredHeight();
                C4172a aVar = this.f13513f;
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.f13511d;
                aVar.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f13522q == null) {
            mo112033r();
        }
        View view = this.f13522q;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f13513f.measure(View.MeasureSpec.makeMeasureSpec(this.f13504L, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f13504L, 1073741824));
            this.f13498F = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f13513f) {
                    this.f13498F = i3;
                    return;
                }
            }
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.f13510c.mo5281c(f, f2, z);
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f13510c.mo5282d(f, f2);
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f13525t;
            float f2 = 0.0f;
            if (f > 0.0f) {
                float f3 = (float) i2;
                if (f3 > f) {
                    iArr[1] = (int) f;
                    this.f13525t = 0.0f;
                } else {
                    f2 = f - f3;
                    this.f13525t = f2;
                    iArr[1] = i2;
                }
                m11966u(f2);
            }
        }
        int[] iArr2 = this.f13527v;
        int i3 = iArr[0];
        if (this.f13510c.mo5283e(i - i3, i2 - iArr[1], iArr2, (int[]) null, 0)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1851f(view, i, i2, i3, i4, 0, this.f13529x);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f13526u.mo5172a(i, 0);
        this.f13510c.mo5286h(i & 2, 0);
        this.f13525t = 0.0f;
        this.f13530y = true;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        mo8794l(savedState.f13532a, false);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f13509b);
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f13509b && (i & 2) != 0;
    }

    public final void onStopNestedScroll(View view) {
        this.f13526u.mo5173b(0);
        this.f13530y = false;
        float f = this.f13525t;
        if (f > 0.0f) {
            m11965s(f);
            this.f13525t = 0.0f;
        } else {
            post(new C4177f(this));
        }
        this.f13510c.mo5280b(0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || mo8796o() || this.f13509b || this.f13530y) {
            return false;
        }
        if (actionMasked == 0) {
            this.f13496D = motionEvent.getPointerId(0);
            this.f13495C = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f13496D);
            if (findPointerIndex < 0) {
                Log.e(f13491o, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f13495C) {
                float y = motionEvent.getY(findPointerIndex);
                float f = this.f13493A;
                this.f13495C = false;
                m11965s((y - f) * 0.5f);
            }
            this.f13496D = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f13496D);
            if (findPointerIndex2 < 0) {
                Log.e(f13491o, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            m11969x(y2);
            if (this.f13495C) {
                float f2 = (y2 - this.f13493A) * 0.5f;
                if (f2 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                m11966u(f2);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f13491o, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f13496D = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m11967v(motionEvent);
            }
        }
        return true;
    }

    /* renamed from: p */
    public final void mo8811p() {
        this.f13504L = (int) (getResources().getDisplayMetrics().density * 56.0f);
        this.f13513f.setImageDrawable((Drawable) null);
        this.f13519l.mo8835d(0);
        this.f13513f.setImageDrawable(this.f13519l);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo8785fI();
        }
    }

    public final void setNestedScrollingEnabled(boolean z) {
        this.f13510c.mo5279a(z);
    }

    public final boolean startNestedScroll(int i) {
        return this.f13510c.mo5286h(i, 0);
    }

    public final void stopNestedScroll() {
        this.f13510c.mo5280b(0);
    }

    /* renamed from: t */
    public final boolean mo1884t(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    /* compiled from: PG */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C4187p();

        /* renamed from: a */
        final boolean f13532a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f13532a = parcel.readByte() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f13532a ? (byte) 1 : 0);
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f13532a = z;
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13509b = false;
        this.f13524s = -1.0f;
        this.f13527v = new int[2];
        this.f13528w = new int[2];
        this.f13529x = new int[2];
        this.f13496D = -1;
        this.f13498F = -1;
        this.f13505M = new C4178g(this);
        this.f13506N = new C4183l(this);
        this.f13507O = new C4184m(this);
        this.f13523r = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f13531z = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f13497E = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f13504L = (int) (displayMetrics.density * 40.0f);
        this.f13513f = new C4172a(getContext());
        C4176e eVar = new C4176e(getContext());
        this.f13519l = eVar;
        eVar.mo8835d(1);
        this.f13513f.setImageDrawable(this.f13519l);
        this.f13513f.setVisibility(8);
        addView(this.f13513f);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f13517j = i;
        this.f13524s = (float) i;
        this.f13526u = new C2009ac();
        C2111z zVar = new C2111z(this);
        this.f13510c = zVar;
        zVar.mo5279a(true);
        int i2 = -this.f13504L;
        this.f13511d = i2;
        this.f13516i = i2;
        mo8784fH(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f13492p);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: l */
    public final void mo8794l(boolean z, boolean z2) {
        if (z) {
            if (!this.f13509b) {
                this.f13509b = true;
                mo8786fJ((this.f13517j + this.f13516i) - this.f13511d);
                this.f13520m = z2;
                Animation.AnimationListener animationListener = this.f13505M;
                this.f13513f.setVisibility(0);
                this.f13519l.setAlpha(PrivateKeyType.INVALID);
                C4179h hVar = new C4179h(this);
                this.f13499G = hVar;
                hVar.setDuration((long) this.f13531z);
                if (animationListener != null) {
                    this.f13513f.f13533a = animationListener;
                }
                this.f13513f.clearAnimation();
                this.f13513f.startAnimation(this.f13499G);
                return;
            }
            z = true;
        }
        m11968w(z, false);
    }
}
