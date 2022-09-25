package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.p098j.C2043bi;
import androidx.core.widget.C2123j;
import androidx.customview.view.AbsSavedState;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.material.tabs.C44903f;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public class ViewPager extends ViewGroup {

    /* renamed from: a */
    static final int[] f13784a = {16842931};

    /* renamed from: i */
    private static final Comparator f13785i = new C4269b();

    /* renamed from: j */
    private static final Interpolator f13786j = new C4270c();

    /* renamed from: k */
    private static final C4282o f13787k = new C4282o();

    /* renamed from: A */
    private float f13788A = Float.MAX_VALUE;

    /* renamed from: B */
    private boolean f13789B;

    /* renamed from: C */
    private boolean f13790C;

    /* renamed from: D */
    private boolean f13791D;

    /* renamed from: E */
    private int f13792E = 1;

    /* renamed from: F */
    private boolean f13793F;

    /* renamed from: G */
    private boolean f13794G;

    /* renamed from: H */
    private int f13795H;

    /* renamed from: I */
    private int f13796I;

    /* renamed from: J */
    private int f13797J;

    /* renamed from: K */
    private boolean f13798K = true;

    /* renamed from: L */
    private float f13799L;

    /* renamed from: M */
    private float f13800M;

    /* renamed from: N */
    private float f13801N;

    /* renamed from: O */
    private float f13802O;

    /* renamed from: P */
    private int f13803P = -1;

    /* renamed from: Q */
    private VelocityTracker f13804Q;

    /* renamed from: R */
    private int f13805R;

    /* renamed from: S */
    private int f13806S;

    /* renamed from: T */
    private int f13807T;

    /* renamed from: U */
    private int f13808U;

    /* renamed from: V */
    private boolean f13809V = true;

    /* renamed from: W */
    private boolean f13810W;

    /* renamed from: aa */
    private int f13811aa;

    /* renamed from: ab */
    private C4278k f13812ab;

    /* renamed from: ac */
    private int f13813ac;

    /* renamed from: ad */
    private int f13814ad;

    /* renamed from: ae */
    private ArrayList f13815ae;

    /* renamed from: af */
    private final Runnable f13816af = new C4271d(this);

    /* renamed from: ag */
    private int f13817ag = 0;

    /* renamed from: b */
    public C4268a f13818b;

    /* renamed from: c */
    public int f13819c;

    /* renamed from: d */
    public EdgeEffect f13820d;

    /* renamed from: e */
    public EdgeEffect f13821e;

    /* renamed from: f */
    public List f13822f;

    /* renamed from: g */
    public C4277j f13823g;

    /* renamed from: h */
    public List f13824h;

    /* renamed from: l */
    private int f13825l;

    /* renamed from: m */
    private final ArrayList f13826m = new ArrayList();

    /* renamed from: n */
    private final C4274g f13827n = new C4274g();

    /* renamed from: o */
    private final Rect f13828o = new Rect();

    /* renamed from: p */
    private int f13829p = -1;

    /* renamed from: q */
    private Parcelable f13830q = null;

    /* renamed from: r */
    private ClassLoader f13831r = null;

    /* renamed from: s */
    private Scroller f13832s;

    /* renamed from: t */
    private boolean f13833t;

    /* renamed from: u */
    private C4279l f13834u;

    /* renamed from: v */
    private int f13835v;

    /* renamed from: w */
    private Drawable f13836w;

    /* renamed from: x */
    private int f13837x;

    /* renamed from: y */
    private int f13838y;

    /* renamed from: z */
    private float f13839z = -3.4028235E38f;

    public ViewPager(Context context) {
        super(context);
        mo9169v(context);
    }

    /* renamed from: A */
    private final C4274g mo46114A() {
        int i;
        int y = mo46117y();
        float f = 0.0f;
        float scrollX = y > 0 ? ((float) getScrollX()) / ((float) y) : 0.0f;
        float f2 = y > 0 ? ((float) this.f13835v) / ((float) y) : 0.0f;
        C4274g gVar = null;
        float f3 = 0.0f;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        while (i2 < this.f13826m.size()) {
            C4274g gVar2 = (C4274g) this.f13826m.get(i2);
            if (!z && gVar2.f13849b != (i = i3 + 1)) {
                gVar2 = this.f13827n;
                gVar2.f13852e = f + f3 + f2;
                gVar2.f13849b = i;
                gVar2.f13851d = this.f13818b.mo9174j(i);
                i2--;
            }
            C4274g gVar3 = gVar2;
            f = gVar3.f13852e;
            float f4 = gVar3.f13851d + f + f2;
            if (!z && scrollX < f) {
                return gVar;
            }
            if (scrollX < f4 || i2 == this.f13826m.size() - 1) {
                return gVar3;
            }
            i3 = gVar3.f13849b;
            i2++;
            z = false;
            gVar = gVar3;
            f3 = gVar3.f13851d;
        }
        return gVar;
    }

    /* renamed from: B */
    private final void m12238B(boolean z) {
        boolean z2 = this.f13817ag == 2;
        if (z2) {
            m12243G(false);
            if (!this.f13832s.isFinished()) {
                this.f13832s.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f13832s.getCurrX();
                int currY = this.f13832s.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m12245I(currX);
                    }
                }
            }
        }
        this.f13791D = false;
        for (int i = 0; i < this.f13826m.size(); i++) {
            C4274g gVar = (C4274g) this.f13826m.get(i);
            if (gVar.f13850c) {
                gVar.f13850c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            C2043bi.m5520N(this, this.f13816af);
        } else {
            this.f13816af.run();
        }
    }

    /* renamed from: C */
    private final void m12239C(int i) {
        C4277j jVar = this.f13823g;
        if (jVar != null) {
            jVar.mo9184e(i);
        }
        List list = this.f13822f;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C4277j jVar2 = (C4277j) this.f13822f.get(i2);
                if (jVar2 != null) {
                    jVar2.mo9184e(i);
                }
            }
        }
    }

    /* renamed from: D */
    private final void m12240D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f13803P) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f13799L = motionEvent.getX(i);
            this.f13803P = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f13804Q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: E */
    private final void m12241E(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f13826m.isEmpty()) {
            C4274g e = mo9136e(this.f13819c);
            int min = (int) ((e != null ? Math.min(e.f13852e, this.f13788A) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m12238B(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.f13832s.isFinished()) {
            this.f13832s.setFinalX(mo9122a() * mo46117y());
        } else {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - paddingLeft) - paddingRight) + i3))), getScrollY());
        }
    }

    /* renamed from: F */
    private final void m12242F(int i, boolean z, int i2, boolean z2) {
        int i3;
        int i4;
        int i5;
        C4274g e = mo9136e(i);
        int y = e != null ? (int) (((float) mo46117y()) * Math.max(this.f13839z, Math.min(e.f13852e, this.f13788A))) : 0;
        if (z) {
            if (getChildCount() == 0) {
                m12243G(false);
            } else {
                Scroller scroller = this.f13832s;
                if (scroller == null || scroller.isFinished()) {
                    i3 = getScrollX();
                } else {
                    i3 = this.f13833t ? this.f13832s.getCurrX() : this.f13832s.getStartX();
                    this.f13832s.abortAnimation();
                    m12243G(false);
                }
                int i6 = i3;
                int scrollY = getScrollY();
                int i7 = y - i6;
                int i8 = -scrollY;
                if (i7 != 0) {
                    i4 = i7;
                } else if (i8 == 0) {
                    m12238B(false);
                    mo9144i(this.f13819c);
                    mo9163q(0);
                } else {
                    i4 = 0;
                }
                m12243G(true);
                mo9163q(2);
                int y2 = mo46117y();
                float f = (float) y2;
                float f2 = (float) (y2 / 2);
                float sin = f2 + (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i4)) / f) - 8.0f) * 0.47123894f))) * f2);
                int abs = Math.abs(i2);
                if (abs > 0) {
                    i5 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
                } else {
                    i5 = (int) (((((float) Math.abs(i4)) / ((f * this.f13818b.mo9174j(this.f13819c)) + ((float) this.f13835v))) + 1.0f) * 100.0f);
                }
                int min = Math.min(i5, 600);
                this.f13833t = false;
                this.f13832s.startScroll(i6, scrollY, i4, i8, min);
                C2043bi.m5519M(this);
            }
            if (z2) {
                m12239C(i);
                return;
            }
            return;
        }
        if (z2) {
            m12239C(i);
        }
        m12238B(false);
        scrollTo(y, 0);
        m12245I(y);
    }

    /* renamed from: G */
    private final void m12243G(boolean z) {
        if (this.f13790C != z) {
            this.f13790C = z;
        }
    }

    /* renamed from: H */
    private final void m12244H() {
        if (this.f13814ad != 0) {
            ArrayList arrayList = this.f13815ae;
            if (arrayList == null) {
                this.f13815ae = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f13815ae.add(getChildAt(i));
            }
            Collections.sort(this.f13815ae, f13787k);
        }
    }

    /* renamed from: I */
    private final boolean m12245I(int i) {
        if (this.f13826m.size() != 0) {
            C4274g A = mo46114A();
            int y = mo46117y();
            int i2 = this.f13835v;
            float f = (float) y;
            int i3 = A.f13849b;
            float f2 = ((((float) i) / f) - A.f13852e) / (A.f13851d + (((float) i2) / f));
            this.f13810W = false;
            mo9143h(i3, f2, (int) (((float) (y + i2)) * f2));
            if (this.f13810W) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f13809V) {
            return false;
        } else {
            this.f13810W = false;
            mo9143h(0, 0.0f, 0);
            if (this.f13810W) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: J */
    private final boolean m12246J(float f, float f2) {
        float f3;
        boolean z;
        float f4 = this.f13799L - f;
        this.f13799L = f;
        float height = f2 / ((float) getHeight());
        float width = f4 / ((float) getWidth());
        if (C2123j.m5886a(this.f13820d) != 0.0f) {
            f3 = -C2123j.m5887b(this.f13820d, -width, 1.0f - height);
        } else {
            f3 = C2123j.m5886a(this.f13821e) != 0.0f ? C2123j.m5887b(this.f13821e, width, height) : 0.0f;
        }
        float width2 = f3 * ((float) getWidth());
        float f5 = f4 - width2;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = width2 != 0.0f;
        if (Math.abs(f5) < 1.0E-4f) {
            return z4;
        }
        float scrollX = ((float) getScrollX()) + f5;
        float y = (float) mo46117y();
        float f6 = this.f13839z * y;
        float f7 = this.f13788A * y;
        C4274g gVar = (C4274g) this.f13826m.get(0);
        ArrayList arrayList = this.f13826m;
        C4274g gVar2 = (C4274g) arrayList.get(arrayList.size() - 1);
        if (gVar.f13849b != 0) {
            f6 = gVar.f13852e * y;
            z = false;
        } else {
            z = true;
        }
        if (gVar2.f13849b != this.f13818b.mo9175k() - 1) {
            f7 = gVar2.f13852e * y;
        } else {
            z2 = true;
        }
        if (scrollX < f6) {
            if (z) {
                C2123j.m5887b(this.f13820d, (f6 - scrollX) / y, 1.0f - (f2 / ((float) getHeight())));
            } else {
                z3 = z4;
            }
            z4 = z3;
            scrollX = f6;
        } else if (scrollX > f7) {
            if (z2) {
                C2123j.m5887b(this.f13821e, (scrollX - f7) / y, f2 / ((float) getHeight()));
            } else {
                z3 = z4;
            }
            z4 = z3;
            scrollX = f7;
        }
        int i = (int) scrollX;
        this.f13799L += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m12245I(i);
        return z4;
    }

    /* renamed from: K */
    private final boolean m12247K() {
        this.f13803P = -1;
        this.f13793F = false;
        this.f13794G = false;
        VelocityTracker velocityTracker = this.f13804Q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f13804Q = null;
        }
        this.f13820d.onRelease();
        this.f13821e.onRelease();
        if (!this.f13820d.isFinished() || !this.f13821e.isFinished()) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    private final void m12248L() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: y */
    private final int mo46117y() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: z */
    private final Rect m12250z(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: a */
    public int mo9122a() {
        return this.f13819c;
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C4274g d;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (d = mo9131d(childAt)) != null && d.f13849b == this.f13819c) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
                arrayList.add(this);
            }
        }
    }

    public final void addTouchables(ArrayList arrayList) {
        C4274g d;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (d = mo9131d(childAt)) != null && d.f13849b == this.f13819c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new C4275h();
        }
        C4275h hVar = (C4275h) layoutParams;
        boolean z = hVar.f13853a | (view.getClass().getAnnotation(C4273f.class) != null);
        hVar.f13853a = z;
        if (!this.f13789B) {
            super.addView(view, i, layoutParams);
        } else if (hVar == null || !z) {
            hVar.f13856d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: b */
    public C4268a mo9126b() {
        return this.f13818b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C4274g mo9127c(int i, int i2) {
        C4274g gVar = new C4274g();
        gVar.f13849b = i;
        gVar.f13848a = this.f13818b.mo649gw(this, i);
        gVar.f13851d = this.f13818b.mo9174j(i);
        if (i2 < 0 || i2 >= this.f13826m.size()) {
            this.f13826m.add(gVar);
        } else {
            this.f13826m.add(i2, gVar);
        }
        return gVar;
    }

    public final boolean canScrollHorizontally(int i) {
        if (this.f13818b == null) {
            return false;
        }
        int y = mo46117y();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) y) * this.f13839z))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) y) * this.f13788A))) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C4275h) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        this.f13833t = true;
        if (this.f13832s.isFinished() || !this.f13832s.computeScrollOffset()) {
            m12238B(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f13832s.getCurrX();
        int currY = this.f13832s.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m12245I(currX)) {
                this.f13832s.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C2043bi.m5519M(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C4274g mo9131d(View view) {
        for (int i = 0; i < this.f13826m.size(); i++) {
            C4274g gVar = (C4274g) this.f13826m.get(i);
            if (this.f13818b.mo652i(view, gVar.f13848a)) {
                return gVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L_0x005f
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x005a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L_0x0048
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x0020
            goto L_0x005a
        L_0x0020:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            boolean r6 = r5.mo9164r(r4)
            goto L_0x005b
        L_0x002b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L_0x005a
            boolean r6 = r5.mo9164r(r1)
            goto L_0x005b
        L_0x0036:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0041
            boolean r6 = r5.mo9168u()
            goto L_0x005b
        L_0x0041:
            r6 = 66
            boolean r6 = r5.mo9164r(r6)
            goto L_0x005b
        L_0x0048:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0053
            boolean r6 = r5.mo9167t()
            goto L_0x005b
        L_0x0053:
            r6 = 17
            boolean r6 = r5.mo9164r(r6)
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            if (r6 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            return r2
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C4274g d;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (d = mo9131d(childAt)) != null && d.f13849b == this.f13819c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        boolean z;
        C4268a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f13818b) != null && aVar.mo9175k() > 1)) {
            if (!this.f13820d.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f13839z * ((float) width));
                this.f13820d.setSize(height, width);
                z = this.f13820d.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                z = false;
            }
            if (!this.f13821e.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f13788A + 1.0f)) * ((float) width2));
                this.f13821e.setSize((height2 - paddingTop) - paddingBottom, width2);
                z |= this.f13821e.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                C2043bi.m5519M(this);
                return;
            }
            return;
        }
        this.f13820d.finish();
        this.f13821e.finish();
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f13836w;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C4274g mo9136e(int i) {
        for (int i2 = 0; i2 < this.f13826m.size(); i2++) {
            C4274g gVar = (C4274g) this.f13826m.get(i2);
            if (gVar.f13849b == i) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void mo9137f(C4277j jVar) {
        if (this.f13822f == null) {
            this.f13822f = new ArrayList();
        }
        this.f13822f.add(jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo9138g() {
        int k = this.f13818b.mo9175k();
        this.f13825l = k;
        int size = this.f13826m.size();
        int i = this.f13792E;
        boolean z = size < (i + i) + 1 && this.f13826m.size() < k;
        int i2 = this.f13819c;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < this.f13826m.size()) {
            C4274g gVar = (C4274g) this.f13826m.get(i3);
            int l = this.f13818b.mo9176l(gVar.f13848a);
            if (l != -1) {
                if (l == -2) {
                    this.f13826m.remove(i3);
                    i3--;
                    if (!z2) {
                        this.f13818b.mo651h(this);
                    }
                    this.f13818b.mo646d(this, gVar.f13849b, gVar.f13848a);
                    int i4 = this.f13819c;
                    if (i4 == gVar.f13849b) {
                        i2 = Math.max(0, Math.min(i4, -1 + k));
                    }
                    z = true;
                    z2 = true;
                } else {
                    int i5 = gVar.f13849b;
                    if (i5 != l) {
                        if (i5 == this.f13819c) {
                            i2 = l;
                        }
                        gVar.f13849b = l;
                        z = true;
                    }
                }
            }
            i3++;
        }
        if (z2) {
            this.f13818b.mo650gx(this);
        }
        Collections.sort(this.f13826m, f13785i);
        if (z) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                C4275h hVar = (C4275h) getChildAt(i6).getLayoutParams();
                if (!hVar.f13853a) {
                    hVar.f13855c = 0.0f;
                }
            }
            mo9149n(i2, false, true, 0);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C4275h();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4275h(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final int getChildDrawingOrder(int i, int i2) {
        if (this.f13814ad == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C4275h) ((View) this.f13815ae.get(i2)).getLayoutParams()).f13858f;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9143h(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f13811aa
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.h r9 = (androidx.viewpager.widget.C4275h) r9
            boolean r10 = r9.f13853a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f13854b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            androidx.viewpager.widget.j r0 = r12.f13823g
            if (r0 == 0) goto L_0x0072
            r0.mo9183c(r13, r14, r15)
        L_0x0072:
            java.util.List r0 = r12.f13822f
            if (r0 == 0) goto L_0x008d
            int r0 = r0.size()
            r3 = 0
        L_0x007b:
            if (r3 >= r0) goto L_0x008d
            java.util.List r4 = r12.f13822f
            java.lang.Object r4 = r4.get(r3)
            androidx.viewpager.widget.j r4 = (androidx.viewpager.widget.C4277j) r4
            if (r4 == 0) goto L_0x008a
            r4.mo9183c(r13, r14, r15)
        L_0x008a:
            int r3 = r3 + 1
            goto L_0x007b
        L_0x008d:
            androidx.viewpager.widget.k r13 = r12.f13812ab
            if (r13 == 0) goto L_0x00f2
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x0099:
            if (r1 >= r14) goto L_0x00f2
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.h r0 = (androidx.viewpager.widget.C4275h) r0
            boolean r0 = r0.f13853a
            if (r0 != 0) goto L_0x00ef
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.mo46117y()
            float r3 = (float) r3
            float r0 = r0 / r3
            float r3 = java.lang.Math.abs(r0)
            float r3 = -r3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r4
            r4 = 1041865112(0x3e199998, float:0.14999998)
            float r4 = r4 * r3
            r5 = 1062836634(0x3f59999a, float:0.85)
            float r4 = r4 + r5
            android.view.animation.Interpolator r5 = com.google.android.apps.search.googleapp.stampviewer.viewpager.C139495f.f379296a
            r6 = 1063675494(0x3f666666, float:0.9)
            float r3 = r3 * r6
            r6 = 0
            float r3 = r3 + r6
            r6 = 1036831949(0x3dcccccd, float:0.1)
            float r3 = r3 + r6
            float r3 = r5.getInterpolation(r3)
            r15.setAlpha(r3)
            r15.setScaleX(r4)
            r15.setScaleY(r4)
            r3 = -1127428915(0xffffffffbccccccd, float:-0.025)
            float r0 = r0 * r3
            int r3 = r15.getWidth()
            float r3 = (float) r3
            float r0 = r0 * r3
            r15.setTranslationX(r0)
        L_0x00ef:
            int r1 = r1 + 1
            goto L_0x0099
        L_0x00f2:
            r12.f13810W = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo9143h(int, float, int):void");
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [android.view.ViewParent] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 != r10) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9144i(int r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r0.f13819c
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.g r2 = r0.mo9136e(r2)
            r0.f13819c = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            androidx.viewpager.widget.a r1 = r0.f13818b
            if (r1 != 0) goto L_0x0018
            r18.m12244H()
            return
        L_0x0018:
            boolean r1 = r0.f13791D
            if (r1 == 0) goto L_0x0020
            r18.m12244H()
            return
        L_0x0020:
            android.os.IBinder r1 = r18.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            androidx.viewpager.widget.a r1 = r0.f13818b
            r1.mo651h(r0)
            int r1 = r0.f13792E
            int r4 = r0.f13819c
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            androidx.viewpager.widget.a r6 = r0.f13818b
            int r6 = r6.mo9175k()
            int r7 = r6 + -1
            int r8 = r0.f13819c
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f13825l
            if (r6 != r7) goto L_0x0353
            r7 = 0
        L_0x004a:
            java.util.ArrayList r8 = r0.f13826m
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList r8 = r0.f13826m
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.g r8 = (androidx.viewpager.widget.C4274g) r8
            int r9 = r8.f13849b
            int r10 = r0.f13819c
            if (r9 < r10) goto L_0x0063
            if (r9 == r10) goto L_0x0067
            goto L_0x0066
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f13819c
            androidx.viewpager.widget.g r8 = r0.mo9127c(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x02d2
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList r11 = r0.f13826m
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.g r11 = (androidx.viewpager.widget.C4274g) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r18.mo46117y()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r14 = 0
            goto L_0x0098
        L_0x008c:
            float r14 = r8.f13851d
            float r14 = r13 - r14
            int r15 = r18.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x0098:
            int r3 = r0.f13819c
            int r3 = r3 + -1
            r15 = 0
        L_0x009d:
            if (r3 < 0) goto L_0x00fd
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00cb
            if (r3 >= r4) goto L_0x00cb
            if (r11 != 0) goto L_0x00a8
            goto L_0x00fd
        L_0x00a8:
            int r5 = r11.f13849b
            if (r3 != r5) goto L_0x00f9
            boolean r5 = r11.f13850c
            if (r5 != 0) goto L_0x00f9
            java.util.ArrayList r5 = r0.f13826m
            r5.remove(r10)
            androidx.viewpager.widget.a r5 = r0.f13818b
            java.lang.Object r11 = r11.f13848a
            r5.mo646d(r0, r3, r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList r5 = r0.f13826m
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.g r5 = (androidx.viewpager.widget.C4274g) r5
            goto L_0x00f8
        L_0x00cb:
            if (r11 == 0) goto L_0x00e1
            int r5 = r11.f13849b
            if (r3 != r5) goto L_0x00e1
            float r5 = r11.f13851d
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList r5 = r0.f13826m
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.g r5 = (androidx.viewpager.widget.C4274g) r5
            goto L_0x00f8
        L_0x00e1:
            int r5 = r10 + 1
            androidx.viewpager.widget.g r5 = r0.mo9127c(r3, r5)
            float r5 = r5.f13851d
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList r5 = r0.f13826m
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.g r5 = (androidx.viewpager.widget.C4274g) r5
            goto L_0x00f8
        L_0x00f7:
            r5 = 0
        L_0x00f8:
            r11 = r5
        L_0x00f9:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x009d
        L_0x00fd:
            float r3 = r8.f13851d
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0198
            java.util.ArrayList r5 = r0.f13826m
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0116
            java.util.ArrayList r5 = r0.f13826m
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.g r5 = (androidx.viewpager.widget.C4274g) r5
            goto L_0x0117
        L_0x0116:
            r5 = 0
        L_0x0117:
            if (r12 > 0) goto L_0x011b
            r10 = 0
            goto L_0x0123
        L_0x011b:
            int r10 = r18.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0123:
            int r11 = r0.f13819c
            int r11 = r11 + 1
            r12 = r4
        L_0x0128:
            if (r11 >= r6) goto L_0x0198
            int r13 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r13 < 0) goto L_0x0158
            if (r11 <= r1) goto L_0x0158
            if (r5 != 0) goto L_0x0133
            goto L_0x0198
        L_0x0133:
            int r13 = r5.f13849b
            if (r11 != r13) goto L_0x0195
            boolean r13 = r5.f13850c
            if (r13 != 0) goto L_0x0195
            java.util.ArrayList r13 = r0.f13826m
            r13.remove(r12)
            androidx.viewpager.widget.a r13 = r0.f13818b
            java.lang.Object r5 = r5.f13848a
            r13.mo646d(r0, r11, r5)
            java.util.ArrayList r5 = r0.f13826m
            int r5 = r5.size()
            if (r12 >= r5) goto L_0x0194
            java.util.ArrayList r5 = r0.f13826m
            java.lang.Object r5 = r5.get(r12)
            androidx.viewpager.widget.g r5 = (androidx.viewpager.widget.C4274g) r5
            goto L_0x0195
        L_0x0158:
            if (r5 == 0) goto L_0x0174
            int r13 = r5.f13849b
            if (r11 != r13) goto L_0x0174
            float r5 = r5.f13851d
            float r3 = r3 + r5
            int r12 = r12 + 1
            java.util.ArrayList r5 = r0.f13826m
            int r5 = r5.size()
            if (r12 >= r5) goto L_0x0194
            java.util.ArrayList r5 = r0.f13826m
            java.lang.Object r5 = r5.get(r12)
            androidx.viewpager.widget.g r5 = (androidx.viewpager.widget.C4274g) r5
            goto L_0x0195
        L_0x0174:
            int r5 = r12 + 1
            androidx.viewpager.widget.g r12 = r0.mo9127c(r11, r12)
            float r12 = r12.f13851d
            float r3 = r3 + r12
            java.util.ArrayList r12 = r0.f13826m
            int r12 = r12.size()
            if (r5 >= r12) goto L_0x0193
            java.util.ArrayList r12 = r0.f13826m
            java.lang.Object r12 = r12.get(r5)
            androidx.viewpager.widget.g r12 = (androidx.viewpager.widget.C4274g) r12
            r17 = r12
            r12 = r5
            r5 = r17
            goto L_0x0195
        L_0x0193:
            r12 = r5
        L_0x0194:
            r5 = 0
        L_0x0195:
            int r11 = r11 + 1
            goto L_0x0128
        L_0x0198:
            androidx.viewpager.widget.a r1 = r0.f13818b
            int r1 = r1.mo9175k()
            int r3 = r18.mo46117y()
            if (r3 <= 0) goto L_0x01aa
            int r5 = r0.f13835v
            float r5 = (float) r5
            float r3 = (float) r3
            float r5 = r5 / r3
            goto L_0x01ab
        L_0x01aa:
            r5 = 0
        L_0x01ab:
            if (r2 == 0) goto L_0x0244
            int r3 = r2.f13849b
            int r6 = r8.f13849b
            if (r3 >= r6) goto L_0x0201
            float r6 = r2.f13852e
            float r2 = r2.f13851d
            float r6 = r6 + r2
            float r6 = r6 + r5
            int r3 = r3 + 1
            r2 = 0
        L_0x01bc:
            int r10 = r8.f13849b
            if (r3 > r10) goto L_0x0244
            java.util.ArrayList r10 = r0.f13826m
            int r10 = r10.size()
            if (r2 >= r10) goto L_0x0244
            java.util.ArrayList r10 = r0.f13826m
            java.lang.Object r10 = r10.get(r2)
            androidx.viewpager.widget.g r10 = (androidx.viewpager.widget.C4274g) r10
        L_0x01d0:
            int r11 = r10.f13849b
            if (r3 <= r11) goto L_0x01e9
            java.util.ArrayList r11 = r0.f13826m
            int r11 = r11.size()
            int r11 = r11 + -1
            if (r2 >= r11) goto L_0x01e9
            int r2 = r2 + 1
            java.util.ArrayList r10 = r0.f13826m
            java.lang.Object r10 = r10.get(r2)
            androidx.viewpager.widget.g r10 = (androidx.viewpager.widget.C4274g) r10
            goto L_0x01d0
        L_0x01e9:
            int r11 = r10.f13849b
            if (r3 >= r11) goto L_0x01f8
            androidx.viewpager.widget.a r11 = r0.f13818b
            float r11 = r11.mo9174j(r3)
            float r11 = r11 + r5
            float r6 = r6 + r11
            int r3 = r3 + 1
            goto L_0x01e9
        L_0x01f8:
            r10.f13852e = r6
            float r10 = r10.f13851d
            float r10 = r10 + r5
            float r6 = r6 + r10
            int r3 = r3 + 1
            goto L_0x01bc
        L_0x0201:
            if (r3 <= r6) goto L_0x0244
            java.util.ArrayList r6 = r0.f13826m
            int r6 = r6.size()
            int r6 = r6 + -1
            float r2 = r2.f13852e
        L_0x020d:
            int r3 = r3 + -1
            int r10 = r8.f13849b
            if (r3 < r10) goto L_0x0244
            if (r6 < 0) goto L_0x0244
            java.util.ArrayList r10 = r0.f13826m
            java.lang.Object r10 = r10.get(r6)
            androidx.viewpager.widget.g r10 = (androidx.viewpager.widget.C4274g) r10
        L_0x021d:
            int r11 = r10.f13849b
            if (r3 >= r11) goto L_0x022e
            if (r6 <= 0) goto L_0x022e
            int r6 = r6 + -1
            java.util.ArrayList r10 = r0.f13826m
            java.lang.Object r10 = r10.get(r6)
            androidx.viewpager.widget.g r10 = (androidx.viewpager.widget.C4274g) r10
            goto L_0x021d
        L_0x022e:
            int r11 = r10.f13849b
            if (r3 <= r11) goto L_0x023d
            androidx.viewpager.widget.a r11 = r0.f13818b
            float r11 = r11.mo9174j(r3)
            float r11 = r11 + r5
            float r2 = r2 - r11
            int r3 = r3 + -1
            goto L_0x022e
        L_0x023d:
            float r11 = r10.f13851d
            float r11 = r11 + r5
            float r2 = r2 - r11
            r10.f13852e = r2
            goto L_0x020d
        L_0x0244:
            java.util.ArrayList r2 = r0.f13826m
            int r2 = r2.size()
            float r3 = r8.f13852e
            int r6 = r8.f13849b
            int r10 = r6 + -1
            if (r6 != 0) goto L_0x0254
            r11 = r3
            goto L_0x0257
        L_0x0254:
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0257:
            r0.f13839z = r11
            int r1 = r1 + -1
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r6 != r1) goto L_0x0264
            float r6 = r8.f13851d
            float r6 = r6 + r3
            float r6 = r6 + r11
            goto L_0x0267
        L_0x0264:
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x0267:
            r0.f13788A = r6
            int r7 = r7 + -1
        L_0x026b:
            if (r7 < 0) goto L_0x0294
            java.util.ArrayList r6 = r0.f13826m
            java.lang.Object r6 = r6.get(r7)
            androidx.viewpager.widget.g r6 = (androidx.viewpager.widget.C4274g) r6
        L_0x0275:
            int r12 = r6.f13849b
            if (r10 <= r12) goto L_0x0285
            int r12 = r10 + -1
            androidx.viewpager.widget.a r13 = r0.f13818b
            float r10 = r13.mo9174j(r10)
            float r10 = r10 + r5
            float r3 = r3 - r10
            r10 = r12
            goto L_0x0275
        L_0x0285:
            float r13 = r6.f13851d
            float r13 = r13 + r5
            float r3 = r3 - r13
            r6.f13852e = r3
            if (r12 != 0) goto L_0x028f
            r0.f13839z = r3
        L_0x028f:
            int r7 = r7 + -1
            int r10 = r10 + -1
            goto L_0x026b
        L_0x0294:
            float r3 = r8.f13852e
            float r6 = r8.f13851d
            float r3 = r3 + r6
            float r3 = r3 + r5
            int r6 = r8.f13849b
        L_0x029c:
            int r6 = r6 + 1
            if (r4 >= r2) goto L_0x02c9
            java.util.ArrayList r7 = r0.f13826m
            java.lang.Object r7 = r7.get(r4)
            androidx.viewpager.widget.g r7 = (androidx.viewpager.widget.C4274g) r7
        L_0x02a8:
            int r10 = r7.f13849b
            if (r6 >= r10) goto L_0x02b8
            int r10 = r6 + 1
            androidx.viewpager.widget.a r12 = r0.f13818b
            float r6 = r12.mo9174j(r6)
            float r6 = r6 + r5
            float r3 = r3 + r6
            r6 = r10
            goto L_0x02a8
        L_0x02b8:
            if (r10 != r1) goto L_0x02c0
            float r10 = r7.f13851d
            float r10 = r10 + r3
            float r10 = r10 + r11
            r0.f13788A = r10
        L_0x02c0:
            r7.f13852e = r3
            float r7 = r7.f13851d
            float r7 = r7 + r5
            float r3 = r3 + r7
            int r4 = r4 + 1
            goto L_0x029c
        L_0x02c9:
            androidx.viewpager.widget.a r1 = r0.f13818b
            int r2 = r0.f13819c
            java.lang.Object r3 = r8.f13848a
            r1.mo647g(r0, r2, r3)
        L_0x02d2:
            androidx.viewpager.widget.a r1 = r0.f13818b
            r1.mo650gx(r0)
            int r1 = r18.getChildCount()
            r2 = 0
        L_0x02dc:
            if (r2 >= r1) goto L_0x0305
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.h r4 = (androidx.viewpager.widget.C4275h) r4
            r4.f13858f = r2
            boolean r5 = r4.f13853a
            if (r5 != 0) goto L_0x0302
            float r5 = r4.f13855c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x0302
            androidx.viewpager.widget.g r3 = r0.mo9131d(r3)
            if (r3 == 0) goto L_0x0302
            float r5 = r3.f13851d
            r4.f13855c = r5
            int r3 = r3.f13849b
            r4.f13857e = r3
        L_0x0302:
            int r2 = r2 + 1
            goto L_0x02dc
        L_0x0305:
            r18.m12244H()
            boolean r1 = r18.hasFocus()
            if (r1 == 0) goto L_0x0352
            android.view.View r1 = r18.findFocus()
            if (r1 == 0) goto L_0x0328
        L_0x0314:
            android.view.ViewParent r2 = r1.getParent()
            if (r2 == r0) goto L_0x0323
            boolean r1 = r2 instanceof android.view.View
            if (r1 != 0) goto L_0x031f
            goto L_0x0328
        L_0x031f:
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            goto L_0x0314
        L_0x0323:
            androidx.viewpager.widget.g r3 = r0.mo9131d(r1)
            goto L_0x0329
        L_0x0328:
            r3 = 0
        L_0x0329:
            if (r3 == 0) goto L_0x0331
            int r1 = r3.f13849b
            int r2 = r0.f13819c
            if (r1 == r2) goto L_0x0352
        L_0x0331:
            r5 = 0
        L_0x0332:
            int r1 = r18.getChildCount()
            if (r5 >= r1) goto L_0x0352
            android.view.View r1 = r0.getChildAt(r5)
            androidx.viewpager.widget.g r2 = r0.mo9131d(r1)
            if (r2 == 0) goto L_0x034f
            int r2 = r2.f13849b
            int r3 = r0.f13819c
            if (r2 != r3) goto L_0x034f
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 != 0) goto L_0x0352
        L_0x034f:
            int r5 = r5 + 1
            goto L_0x0332
        L_0x0352:
            return
        L_0x0353:
            android.content.res.Resources r1 = r18.getResources()     // Catch:{ NotFoundException -> 0x0360 }
            int r2 = r18.getId()     // Catch:{ NotFoundException -> 0x0360 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0360 }
            goto L_0x0368
        L_0x0360:
            int r1 = r18.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0368:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.<init>(r4)
            int r4 = r0.f13825l
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r18.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            androidx.viewpager.widget.a r1 = r0.f13818b
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            goto L_0x03a9
        L_0x03a8:
            throw r2
        L_0x03a9:
            goto L_0x03a8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo9144i(int):void");
    }

    /* renamed from: j */
    public final void mo9145j(C4277j jVar) {
        List list = this.f13822f;
        if (list != null) {
            list.remove(jVar);
        }
    }

    /* renamed from: k */
    public void mo9146k(C4268a aVar) {
        C4268a aVar2 = this.f13818b;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f13844b = null;
            }
            this.f13818b.mo651h(this);
            for (int i = 0; i < this.f13826m.size(); i++) {
                C4274g gVar = (C4274g) this.f13826m.get(i);
                this.f13818b.mo646d(this, gVar.f13849b, gVar.f13848a);
            }
            this.f13818b.mo650gx(this);
            this.f13826m.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C4275h) getChildAt(i2).getLayoutParams()).f13853a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f13819c = 0;
            scrollTo(0, 0);
        }
        this.f13818b = aVar;
        this.f13825l = 0;
        if (aVar != null) {
            if (this.f13834u == null) {
                this.f13834u = new C4279l(this);
            }
            C4268a aVar3 = this.f13818b;
            C4279l lVar = this.f13834u;
            synchronized (aVar3) {
                aVar3.f13844b = lVar;
            }
            this.f13791D = false;
            boolean z = this.f13809V;
            this.f13809V = true;
            this.f13825l = this.f13818b.mo9175k();
            if (this.f13829p >= 0) {
                this.f13818b.mo653jT(this.f13830q, this.f13831r);
                mo9149n(this.f13829p, false, true, 0);
                this.f13829p = -1;
                this.f13830q = null;
                this.f13831r = null;
            } else if (!z) {
                mo9144i(this.f13819c);
            } else {
                requestLayout();
            }
        }
        List list = this.f13824h;
        if (list != null && !list.isEmpty()) {
            int size = this.f13824h.size();
            for (int i3 = 0; i3 < size; i3++) {
                C44903f fVar = (C44903f) this.f13824h.get(i3);
                TabLayout tabLayout = fVar.f117213b;
                if (tabLayout.f117168B == this) {
                    tabLayout.mo48414i(aVar, fVar.f117212a);
                }
            }
        }
    }

    /* renamed from: l */
    public void mo9147l(int i) {
        this.f13791D = false;
        mo9149n(i, !this.f13809V, false, 0);
    }

    /* renamed from: m */
    public void mo9148m(int i, boolean z) {
        this.f13791D = false;
        mo9149n(i, z, false, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo9149n(int i, boolean z, boolean z2, int i2) {
        C4268a aVar = this.f13818b;
        boolean z3 = false;
        if (aVar == null || aVar.mo9175k() <= 0) {
            m12243G(false);
        } else if (z2 || this.f13819c != i || this.f13826m.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f13818b.mo9175k()) {
                i = this.f13818b.mo9175k() - 1;
            }
            int i3 = this.f13792E;
            int i4 = this.f13819c;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f13826m.size(); i5++) {
                    ((C4274g) this.f13826m.get(i5)).f13850c = true;
                }
            }
            if (this.f13819c != i) {
                z3 = true;
            }
            if (this.f13809V) {
                this.f13819c = i;
                if (z3) {
                    m12239C(i);
                }
                requestLayout();
                return;
            }
            mo9144i(i);
            m12242F(i, z, i2, z3);
        } else {
            m12243G(false);
        }
    }

    /* renamed from: o */
    public final void mo9150o(int i) {
        int i2 = this.f13835v;
        this.f13835v = i;
        int width = getWidth();
        m12241E(width, width, i, i2);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13809V = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f13816af);
        Scroller scroller = this.f13832s;
        if (scroller != null && !scroller.isFinished()) {
            this.f13832s.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.f13835v
            if (r1 <= 0) goto L_0x00a9
            android.graphics.drawable.Drawable r1 = r0.f13836w
            if (r1 == 0) goto L_0x00a9
            java.util.ArrayList r1 = r0.f13826m
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00a9
            androidx.viewpager.widget.a r1 = r0.f13818b
            if (r1 == 0) goto L_0x00a9
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            float r3 = (float) r2
            int r4 = r0.f13835v
            float r4 = (float) r4
            float r4 = r4 / r3
            java.util.ArrayList r5 = r0.f13826m
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.g r5 = (androidx.viewpager.widget.C4274g) r5
            float r7 = r5.f13852e
            java.util.ArrayList r8 = r0.f13826m
            int r8 = r8.size()
            int r9 = r5.f13849b
            java.util.ArrayList r10 = r0.f13826m
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.g r10 = (androidx.viewpager.widget.C4274g) r10
            int r10 = r10.f13849b
        L_0x0045:
            if (r9 >= r10) goto L_0x00a9
        L_0x0047:
            int r11 = r5.f13849b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            int r6 = r6 + 1
            java.util.ArrayList r5 = r0.f13826m
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.g r5 = (androidx.viewpager.widget.C4274g) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0063
            float r7 = r5.f13852e
            float r11 = r5.f13851d
            float r7 = r7 + r11
            float r11 = r7 * r3
            float r7 = r7 + r4
            goto L_0x0070
        L_0x0063:
            androidx.viewpager.widget.a r11 = r0.f13818b
            float r11 = r11.mo9174j(r9)
            float r12 = r7 + r11
            float r12 = r12 * r3
            float r11 = r11 + r4
            float r7 = r7 + r11
            r11 = r12
        L_0x0070:
            int r12 = r0.f13835v
            float r12 = (float) r12
            float r12 = r12 + r11
            float r13 = (float) r1
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x0098
            android.graphics.drawable.Drawable r12 = r0.f13836w
            int r13 = java.lang.Math.round(r11)
            int r14 = r0.f13837x
            int r15 = r0.f13835v
            float r15 = (float) r15
            float r15 = r15 + r11
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.f13838y
            r12.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.f13836w
            r12 = r18
            r3.draw(r12)
            goto L_0x009c
        L_0x0098:
            r12 = r18
            r16 = r3
        L_0x009c:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a4
            goto L_0x00a9
        L_0x00a4:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        if (action == 3 || action == 1) {
            m12247K();
            return false;
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f13801N = x;
            this.f13799L = x;
            float y = motionEvent.getY();
            this.f13802O = y;
            this.f13800M = y;
            this.f13803P = motionEvent2.getPointerId(0);
            this.f13794G = false;
            this.f13833t = true;
            this.f13832s.computeScrollOffset();
            if (this.f13817ag == 2 && Math.abs(this.f13832s.getFinalX() - this.f13832s.getCurrX()) > this.f13808U) {
                this.f13832s.abortAnimation();
                this.f13791D = false;
                mo9144i(this.f13819c);
                this.f13793F = true;
                m12248L();
                mo9163q(1);
            } else if (C2123j.m5886a(this.f13820d) == 0.0f && C2123j.m5886a(this.f13821e) == 0.0f) {
                m12238B(false);
                this.f13793F = false;
            } else {
                this.f13793F = true;
                mo9163q(1);
                if (C2123j.m5886a(this.f13820d) != 0.0f) {
                    C2123j.m5887b(this.f13820d, 0.0f, 1.0f - (this.f13800M / ((float) getHeight())));
                }
                if (C2123j.m5886a(this.f13821e) != 0.0f) {
                    C2123j.m5887b(this.f13821e, 0.0f, this.f13800M / ((float) getHeight()));
                }
            }
        } else if (this.f13793F) {
            return true;
        } else {
            if (this.f13794G) {
                return false;
            }
            if (action == 2) {
                int i = this.f13803P;
                if (i != -1) {
                    int findPointerIndex = motionEvent2.findPointerIndex(i);
                    float x2 = motionEvent2.getX(findPointerIndex);
                    float f2 = x2 - this.f13799L;
                    float abs = Math.abs(f2);
                    float y2 = motionEvent2.getY(findPointerIndex);
                    float abs2 = Math.abs(y2 - this.f13802O);
                    if (f2 != 0.0f) {
                        float f3 = this.f13799L;
                        if (this.f13798K || ((f3 >= ((float) this.f13796I) || f2 <= 0.0f) && (f3 <= ((float) (getWidth() - this.f13796I)) || f2 >= 0.0f))) {
                            if (mo9166s(this, false, (int) f2, (int) x2, (int) y2)) {
                                this.f13799L = x2;
                                this.f13800M = y2;
                                this.f13794G = true;
                                return false;
                            }
                        }
                    }
                    float f4 = (float) this.f13797J;
                    if (abs > f4 && abs * 0.5f > abs2) {
                        this.f13793F = true;
                        m12248L();
                        mo9163q(1);
                        if (f2 > 0.0f) {
                            f = this.f13801N + ((float) this.f13797J);
                        } else {
                            f = this.f13801N - ((float) this.f13797J);
                        }
                        this.f13799L = f;
                        this.f13800M = y2;
                        m12243G(true);
                    } else if (abs2 > f4) {
                        this.f13794G = true;
                    }
                    if (this.f13793F && m12246J(x2, y2)) {
                        C2043bi.m5519M(this);
                    }
                }
            } else if (action == 6) {
                m12240D(motionEvent);
            }
        }
        if (this.f13804Q == null) {
            this.f13804Q = VelocityTracker.obtain();
        }
        this.f13804Q.addMovement(motionEvent2);
        return this.f13793F;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.h r12 = (androidx.viewpager.widget.C4275h) r12
            boolean r14 = r12.f13853a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f13854b
            r14 = r12 & 112(0x70, float:1.57E-43)
            r12 = r12 & 7
            r15 = 1
            if (r12 == r15) goto L_0x005c
            r15 = 3
            if (r12 == r15) goto L_0x0056
            r15 = 5
            if (r12 == r15) goto L_0x0049
            r12 = r4
            goto L_0x006d
        L_0x0049:
            int r12 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r12 = r13.getMeasuredWidth()
            int r12 = r12 + r4
            goto L_0x006d
        L_0x005c:
            int r12 = r13.getMeasuredWidth()
            int r12 = r2 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r4)
        L_0x0068:
            r17 = r12
            r12 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r14 == r15) goto L_0x008e
            r15 = 48
            if (r14 == r15) goto L_0x0088
            r15 = 80
            if (r14 == r15) goto L_0x007b
            r14 = r5
            goto L_0x009f
        L_0x007b:
            int r14 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r14 = r13.getMeasuredHeight()
            int r14 = r14 + r5
            goto L_0x009f
        L_0x008e:
            int r14 = r13.getMeasuredHeight()
            int r14 = r3 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r5)
        L_0x009a:
            r17 = r14
            r14 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r4 = r12
            r5 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.h r9 = (androidx.viewpager.widget.C4275h) r9
            boolean r10 = r9.f13853a
            if (r10 != 0) goto L_0x0105
            androidx.viewpager.widget.g r10 = r0.mo9131d(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f13852e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f13856d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f13856d = r14
            float r9 = r9.f13855c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0108:
            r0.f13837x = r5
            int r3 = r3 - r7
            r0.f13838y = r3
            r0.f13811aa = r11
            boolean r1 = r0.f13809V
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f13819c
            r2 = 0
            r0.m12242F(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.f13809V = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = r17
            int r2 = getDefaultSize(r1, r2)
            r3 = r18
            int r3 = getDefaultSize(r1, r3)
            r0.setMeasuredDimension(r2, r3)
            int r2 = r16.getMeasuredWidth()
            int r3 = r2 / 10
            int r4 = r0.f13795H
            int r3 = java.lang.Math.min(r3, r4)
            r0.f13796I = r3
            int r3 = r16.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r16.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r16.getMeasuredHeight()
            int r4 = r16.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r16.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r16.getChildCount()
            r5 = 0
        L_0x003d:
            r6 = 8
            r7 = 1
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 >= r4) goto L_0x00c2
            android.view.View r9 = r0.getChildAt(r5)
            int r10 = r9.getVisibility()
            if (r10 == r6) goto L_0x00bd
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            androidx.viewpager.widget.h r6 = (androidx.viewpager.widget.C4275h) r6
            if (r6 == 0) goto L_0x00bd
            boolean r10 = r6.f13853a
            if (r10 == 0) goto L_0x00bd
            int r10 = r6.f13854b
            r11 = r10 & 7
            r10 = r10 & 112(0x70, float:1.57E-43)
            r12 = 48
            if (r10 == r12) goto L_0x006b
            r12 = 80
            if (r10 != r12) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r10 = 0
            goto L_0x006c
        L_0x006b:
            r10 = 1
        L_0x006c:
            r12 = 3
            if (r11 == r12) goto L_0x0074
            r12 = 5
            if (r11 != r12) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r7 = 0
        L_0x0074:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x007d
            r11 = 1073741824(0x40000000, float:2.0)
        L_0x007a:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0081
        L_0x007d:
            if (r7 == 0) goto L_0x007a
            r12 = 1073741824(0x40000000, float:2.0)
        L_0x0081:
            int r13 = r6.width
            r14 = -1
            r15 = -2
            if (r13 == r15) goto L_0x0093
            int r11 = r6.width
            if (r11 == r14) goto L_0x008f
            int r11 = r6.width
            r13 = r11
            goto L_0x0090
        L_0x008f:
            r13 = r2
        L_0x0090:
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x0094
        L_0x0093:
            r13 = r2
        L_0x0094:
            int r1 = r6.height
            if (r1 == r15) goto L_0x00a1
            int r1 = r6.height
            if (r1 == r14) goto L_0x009f
            int r1 = r6.height
            goto L_0x00a3
        L_0x009f:
            r1 = r3
            goto L_0x00a3
        L_0x00a1:
            r1 = r3
            r8 = r12
        L_0x00a3:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r11)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            r9.measure(r6, r1)
            if (r10 == 0) goto L_0x00b6
            int r1 = r9.getMeasuredHeight()
            int r3 = r3 - r1
            goto L_0x00bd
        L_0x00b6:
            if (r7 == 0) goto L_0x00bd
            int r1 = r9.getMeasuredWidth()
            int r2 = r2 - r1
        L_0x00bd:
            int r5 = r5 + 1
            r1 = 0
            goto L_0x003d
        L_0x00c2:
            android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            r0.f13789B = r7
            int r3 = r0.f13819c
            r0.mo9144i(r3)
            r3 = 0
            r0.f13789B = r3
            int r4 = r16.getChildCount()
        L_0x00d7:
            if (r3 >= r4) goto L_0x00ff
            android.view.View r5 = r0.getChildAt(r3)
            int r7 = r5.getVisibility()
            if (r7 == r6) goto L_0x00fc
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.viewpager.widget.h r7 = (androidx.viewpager.widget.C4275h) r7
            if (r7 == 0) goto L_0x00ef
            boolean r9 = r7.f13853a
            if (r9 != 0) goto L_0x00fc
        L_0x00ef:
            float r9 = (float) r2
            float r7 = r7.f13855c
            float r9 = r9 * r7
            int r7 = (int) r9
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            r5.measure(r7, r1)
        L_0x00fc:
            int r3 = r3 + 1
            goto L_0x00d7
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        C4274g d;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i4 = 0;
            i2 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
            i2 = -1;
        }
        while (i4 != i3) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (d = mo9131d(childAt)) != null && d.f13849b == this.f13819c && childAt.requestFocus(i, rect)) {
                return true;
            }
            i4 += i2;
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6116d);
        C4268a aVar = this.f13818b;
        if (aVar != null) {
            aVar.mo653jT(savedState.f13841b, savedState.f13842e);
            mo9149n(savedState.f13840a, false, true, 0);
            return;
        }
        this.f13829p = savedState.f13840a;
        this.f13830q = savedState.f13841b;
        this.f13831r = savedState.f13842e;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13840a = this.f13819c;
        C4268a aVar = this.f13818b;
        if (aVar != null) {
            savedState.f13841b = aVar.mo648gv();
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f13835v;
            m12241E(i, i3, i5, i5);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C4268a aVar;
        boolean z;
        int i;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f13818b) == null || aVar.mo9175k() == 0) {
            return false;
        }
        if (this.f13804Q == null) {
            this.f13804Q = VelocityTracker.obtain();
        }
        this.f13804Q.addMovement(motionEvent);
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.f13793F) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f13803P);
                        if (findPointerIndex == -1) {
                            z = m12247K();
                        } else {
                            float x = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x - this.f13799L);
                            float y = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y - this.f13800M);
                            if (abs > ((float) this.f13797J) && abs > abs2) {
                                this.f13793F = true;
                                m12248L();
                                float f = this.f13801N;
                                this.f13799L = x - f > 0.0f ? f + ((float) this.f13797J) : f - ((float) this.f13797J);
                                this.f13800M = y;
                                mo9163q(1);
                                m12243G(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.f13793F) {
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.f13803P);
                        z = m12246J(motionEvent.getX(findPointerIndex2), motionEvent.getY(findPointerIndex2));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f13799L = motionEvent.getX(actionIndex);
                        this.f13803P = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m12240D(motionEvent);
                        this.f13799L = motionEvent.getX(motionEvent.findPointerIndex(this.f13803P));
                    }
                } else if (this.f13793F) {
                    m12242F(this.f13819c, true, 0, false);
                    z = m12247K();
                }
            } else if (this.f13793F) {
                VelocityTracker velocityTracker = this.f13804Q;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f13806S);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f13803P);
                this.f13791D = true;
                int y2 = mo46117y();
                int scrollX = getScrollX();
                C4274g A = mo46114A();
                int i2 = this.f13835v;
                float f2 = (float) y2;
                int i3 = A.f13849b;
                float f3 = ((((float) scrollX) / f2) - A.f13852e) / (A.f13851d + (((float) i2) / f2));
                if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f13803P)) - this.f13801N)) <= this.f13807T || Math.abs(xVelocity) <= this.f13805R || C2123j.m5886a(this.f13820d) != 0.0f || C2123j.m5886a(this.f13821e) != 0.0f) {
                    i = ((int) (f3 + (i3 >= this.f13819c ? 0.4f : 0.6f))) + i3;
                } else {
                    i = xVelocity > 0 ? i3 : i3 + 1;
                }
                if (this.f13826m.size() > 0) {
                    ArrayList arrayList = this.f13826m;
                    i = Math.max(((C4274g) this.f13826m.get(0)).f13849b, Math.min(i, ((C4274g) arrayList.get(arrayList.size() - 1)).f13849b));
                }
                mo9149n(i, true, true, xVelocity);
                boolean K = m12247K();
                if (i == i3 && K) {
                    if (C2123j.m5886a(this.f13821e) != 0.0f) {
                        this.f13821e.onAbsorb(-xVelocity);
                    } else if (C2123j.m5886a(this.f13820d) != 0.0f) {
                        this.f13820d.onAbsorb(xVelocity);
                    }
                }
                z = K;
            }
            if (z) {
                C2043bi.m5519M(this);
            }
        } else {
            this.f13832s.abortAnimation();
            this.f13791D = false;
            mo9144i(this.f13819c);
            float x2 = motionEvent.getX();
            this.f13801N = x2;
            this.f13799L = x2;
            float y3 = motionEvent.getY();
            this.f13802O = y3;
            this.f13800M = y3;
            this.f13803P = motionEvent.getPointerId(0);
        }
        return true;
    }

    /* renamed from: p */
    public final void mo9162p(Drawable drawable) {
        this.f13836w = drawable;
        refreshDrawableState();
        setWillNotDraw(false);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo9163q(int i) {
        if (this.f13817ag != i) {
            this.f13817ag = i;
            if (this.f13812ab != null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    getChildAt(i2).setLayerType(i != 0 ? this.f13813ac : 0, (Paint) null);
                }
            }
            C4277j jVar = this.f13823g;
            if (jVar != null) {
                jVar.mo9182a(i);
            }
            List list = this.f13822f;
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C4277j jVar2 = (C4277j) this.f13822f.get(i3);
                    if (jVar2 != null) {
                        jVar2.mo9182a(i);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b9  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9164r(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            r1 = 0
            if (r0 != r5) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x0058
        L_0x0009:
            if (r0 == 0) goto L_0x0058
            android.view.ViewParent r2 = r0.getParent()
        L_0x000f:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x001b
            if (r2 != r5) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x000f
        L_0x001b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L_0x002f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0048
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x002f
        L_0x0048:
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = r0.concat(r2)
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L_0x0007
        L_0x0058:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r5, r0, r6)
            r2 = 0
            r3 = 66
            r4 = 17
            if (r1 == 0) goto L_0x00a9
            if (r1 == r0) goto L_0x00a9
            if (r6 != r4) goto L_0x0089
            android.graphics.Rect r2 = r5.f13828o
            android.graphics.Rect r2 = r5.m12250z(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r5.f13828o
            android.graphics.Rect r3 = r5.m12250z(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L_0x0084
            if (r2 < r3) goto L_0x0084
            boolean r2 = r5.mo9167t()
            goto L_0x00bd
        L_0x0084:
            boolean r2 = r1.requestFocus()
            goto L_0x00bd
        L_0x0089:
            if (r6 != r3) goto L_0x00bd
            android.graphics.Rect r2 = r5.f13828o
            android.graphics.Rect r2 = r5.m12250z(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r5.f13828o
            android.graphics.Rect r3 = r5.m12250z(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L_0x00a4
            if (r2 > r3) goto L_0x00a4
            boolean r2 = r5.mo9168u()
            goto L_0x00bd
        L_0x00a4:
            boolean r2 = r1.requestFocus()
            goto L_0x00bd
        L_0x00a9:
            if (r6 == r4) goto L_0x00b9
            r0 = 1
            if (r6 != r0) goto L_0x00af
            goto L_0x00b9
        L_0x00af:
            if (r6 == r3) goto L_0x00b4
            r0 = 2
            if (r6 != r0) goto L_0x00bd
        L_0x00b4:
            boolean r2 = r5.mo9168u()
            goto L_0x00bd
        L_0x00b9:
            boolean r2 = r5.mo9167t()
        L_0x00bd:
            if (r2 == 0) goto L_0x00c6
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        L_0x00c6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo9164r(int):boolean");
    }

    public final void removeView(View view) {
        if (this.f13789B) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo9166s(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (mo9166s(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo9167t() {
        int i = this.f13819c;
        if (i <= 0) {
            return false;
        }
        mo9148m(i - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo9168u() {
        C4268a aVar = this.f13818b;
        if (aVar == null || this.f13819c >= aVar.mo9175k() - 1) {
            return false;
        }
        mo9148m(this.f13819c + 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo9169v(Context context) {
        setWillNotDraw(false);
        setDescendantFocusability(C89885b.HTTP_VALUE);
        setFocusable(true);
        this.f13832s = new Scroller(context, f13786j);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f13797J = viewConfiguration.getScaledPagingTouchSlop();
        this.f13805R = (int) (400.0f * f);
        this.f13806S = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f13820d = new EdgeEffect(context);
        this.f13821e = new EdgeEffect(context);
        this.f13807T = (int) (25.0f * f);
        this.f13808U = (int) (f + f);
        this.f13795H = (int) (f * 16.0f);
        C2043bi.m5526T(this, new C4276i(this));
        if (C2043bi.m5575d(this) == 0) {
            C2043bi.m5551ae(this, 1);
        }
        C2043bi.m5555ai(this, new C4272e(this));
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f13836w;
    }

    /* renamed from: w */
    public final void mo9171w() {
        if (this.f13792E != 1) {
            this.f13792E = 1;
            mo9144i(this.f13819c);
        }
    }

    /* renamed from: x */
    public final void mo9172x(C4278k kVar) {
        C4278k kVar2 = this.f13812ab;
        this.f13812ab = kVar;
        setChildrenDrawingOrderEnabled(true);
        this.f13814ad = 2;
        this.f13813ac = 2;
        if (kVar2 == null) {
            mo9144i(this.f13819c);
        }
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C4275h();
    }

    /* compiled from: PG */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C4280m();

        /* renamed from: a */
        int f13840a;

        /* renamed from: b */
        Parcelable f13841b;

        /* renamed from: e */
        ClassLoader f13842e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f13840a = parcel.readInt();
            this.f13841b = parcel.readParcelable(classLoader);
            this.f13842e = classLoader;
        }

        public final String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f13840a + "}";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f6116d, i);
            parcel.writeInt(this.f13840a);
            parcel.writeParcelable(this.f13841b, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo9169v(context);
    }
}
