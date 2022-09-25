package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.core.p094f.C1900m;
import androidx.core.p098j.C2043bi;
import androidx.core.widget.C2123j;
import androidx.viewpager.widget.C4268a;
import androidx.viewpager.widget.C4277j;
import androidx.viewpager.widget.C4278k;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.logger.p7064i.C89922b;
import com.google.android.apps.gsa.staticplugins.opa.util.C113853ch;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianViewPager */
/* compiled from: PG */
public class ValyrianViewPager extends ViewGroup {

    /* renamed from: a */
    public static final int[] f316121a = {16842931};

    /* renamed from: v */
    private static final C59071e f316122v = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianViewPager");

    /* renamed from: w */
    private static final Comparator f316123w = C114121az.f316320a;

    /* renamed from: x */
    private static final Interpolator f316124x = C114123ba.f316322a;

    /* renamed from: y */
    private static final C114130bh f316125y = new C114130bh();

    /* renamed from: A */
    private final Rect f316126A = new Rect();

    /* renamed from: B */
    private Scroller f316127B;

    /* renamed from: C */
    private float f316128C = -3.4028235E38f;

    /* renamed from: D */
    private float f316129D = Float.MAX_VALUE;

    /* renamed from: E */
    private boolean f316130E;

    /* renamed from: F */
    private boolean f316131F;

    /* renamed from: G */
    private boolean f316132G;

    /* renamed from: H */
    private boolean f316133H;

    /* renamed from: I */
    private int f316134I;

    /* renamed from: J */
    private int f316135J;

    /* renamed from: K */
    private int f316136K;

    /* renamed from: L */
    private float f316137L;

    /* renamed from: M */
    private float f316138M;

    /* renamed from: N */
    private float f316139N;

    /* renamed from: O */
    private float f316140O;

    /* renamed from: P */
    private int f316141P = -1;

    /* renamed from: Q */
    private VelocityTracker f316142Q;

    /* renamed from: R */
    private int f316143R;

    /* renamed from: S */
    private int f316144S;

    /* renamed from: T */
    private int f316145T;

    /* renamed from: U */
    private C2123j f316146U;

    /* renamed from: V */
    private C2123j f316147V;

    /* renamed from: W */
    private boolean f316148W;

    /* renamed from: aa */
    private int f316149aa;

    /* renamed from: ab */
    private C4278k f316150ab;

    /* renamed from: ac */
    private int f316151ac;

    /* renamed from: ad */
    private ArrayList f316152ad;

    /* renamed from: ae */
    private final Runnable f316153ae = new C114124bb(this);

    /* renamed from: af */
    private boolean f316154af;

    /* renamed from: b */
    public int f316155b;

    /* renamed from: c */
    public boolean f316156c = true;

    /* renamed from: d */
    public final ArrayList f316157d = new ArrayList();

    /* renamed from: e */
    public C4268a f316158e;

    /* renamed from: f */
    public int f316159f;

    /* renamed from: g */
    public int f316160g = -1;

    /* renamed from: h */
    public Parcelable f316161h;

    /* renamed from: i */
    public ClassLoader f316162i;

    /* renamed from: j */
    public C114129bg f316163j;

    /* renamed from: k */
    public boolean f316164k;

    /* renamed from: l */
    public boolean f316165l;

    /* renamed from: m */
    public int f316166m;

    /* renamed from: n */
    public boolean f316167n = true;

    /* renamed from: o */
    public C4277j f316168o;

    /* renamed from: p */
    public C68214a f316169p;

    /* renamed from: q */
    public int f316170q = 0;

    /* renamed from: r */
    int f316171r = 0;

    /* renamed from: s */
    public C58833ax f316172s;

    /* renamed from: t */
    public C38802e f316173t;

    /* renamed from: u */
    public C68214a f316174u;

    /* renamed from: z */
    private final C114126bd f316175z = new C114126bd();

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianViewPager$a */
    /* compiled from: PG */
    public interface C114094a {
        /* renamed from: qT */
        void mo101114qT(ValyrianViewPager valyrianViewPager);
    }

    public ValyrianViewPager(Context context) {
        super(context);
        mo101084e();
    }

    /* renamed from: A */
    private final void m189169A() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: B */
    private final boolean m189170B() {
        if (this.f316157d.isEmpty()) {
            this.f316148W = false;
            mo101098o();
            if (this.f316148W) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C114126bd s = m189173s();
        m189171q();
        s.getClass();
        this.f316148W = false;
        mo101098o();
        if (this.f316148W) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: q */
    private final int m189171q() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: r */
    private final Rect m189172r(Rect rect, View view) {
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

    /* renamed from: s */
    private final C114126bd m189173s() {
        int i;
        int q = m189171q();
        float f = 0.0f;
        float scrollY = q > 0 ? ((float) getScrollY()) / ((float) q) : 0.0f;
        float f2 = q > 0 ? 0.0f / ((float) q) : 0.0f;
        C114126bd bdVar = null;
        float f3 = 0.0f;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        while (i2 < this.f316157d.size()) {
            C114126bd bdVar2 = (C114126bd) this.f316157d.get(i2);
            if (!z && bdVar2.f316325b != (i = i3 + 1)) {
                bdVar2 = this.f316175z;
                bdVar2.f316328e = f + f3 + f2;
                bdVar2.f316325b = i;
                bdVar2.f316327d = 1.0f;
                i2--;
            }
            C114126bd bdVar3 = bdVar2;
            f = bdVar3.f316328e;
            float f4 = bdVar3.f316327d + f + f2;
            if (!z && scrollY < f) {
                return bdVar;
            }
            if (scrollY < f4 || i2 == this.f316157d.size() - 1) {
                return bdVar3;
            }
            i3 = bdVar3.f316325b;
            i2++;
            z = false;
            bdVar = bdVar3;
            f3 = bdVar3.f316327d;
        }
        return bdVar;
    }

    /* renamed from: t */
    private final void m189174t(boolean z) {
        boolean z2 = this.f316171r == 2;
        if (z2) {
            m189178x(false);
            this.f316127B.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f316127B.getCurrX();
            int currY = this.f316127B.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.f316165l = false;
        for (int i = 0; i < this.f316157d.size(); i++) {
            C114126bd bdVar = (C114126bd) this.f316157d.get(i);
            if (bdVar.f316326c) {
                bdVar.f316326c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            C2043bi.m5520N(this, this.f316153ae);
        } else {
            this.f316153ae.run();
        }
    }

    /* renamed from: u */
    private final void m189175u() {
        this.f316132G = false;
        this.f316133H = false;
        VelocityTracker velocityTracker = this.f316142Q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f316142Q = null;
        }
    }

    /* renamed from: v */
    private final void m189176v(MotionEvent motionEvent) {
        try {
            int actionIndex = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(actionIndex) == this.f316141P) {
                int i = actionIndex == 0 ? 1 : 0;
                this.f316138M = motionEvent.getY(i);
                this.f316141P = motionEvent.getPointerId(i);
                VelocityTracker velocityTracker = this.f316142Q;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            }
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) f316122v.mo56225c()).mo56382g(e)).mo56372aa(28737)).mo56386p("#onSecondaryPointerUp");
        }
    }

    /* renamed from: w */
    private final void m189177w(int i, boolean z, int i2, boolean z2) {
        C4277j jVar;
        C4277j jVar2;
        int i3;
        int i4;
        int i5 = i;
        C114126bd c = mo101076c(i);
        int q = c != null ? (int) (((float) m189171q()) * Math.max(this.f316128C, Math.min(c.f316328e, this.f316129D))) : 0;
        if (z) {
            if (getChildCount() == 0) {
                m189178x(false);
            } else {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int i6 = -scrollX;
                int i7 = q - scrollY;
                if (i6 != 0) {
                    i3 = i6;
                } else if (i7 == 0) {
                    m189174t(false);
                    mo101085f(this.f316159f);
                    mo101093j(0);
                } else {
                    i3 = 0;
                }
                m189178x(true);
                mo101093j(2);
                int q2 = m189171q();
                float f = (float) q2;
                float f2 = (float) (q2 / 2);
                double min = (double) (Math.min(1.0f, ((float) Math.abs(i3)) / f) - 8.0f);
                Double.isNaN(min);
                float sin = f2 + (((float) Math.sin((double) ((float) (min * 0.4712389167638204d)))) * f2);
                int abs = Math.abs(i2);
                if (abs > 0) {
                    i4 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
                } else {
                    i4 = (int) (((((float) Math.abs(i3)) / (f + 0.0f)) + 1.0f) * 100.0f);
                }
                this.f316127B.startScroll(scrollX, scrollY, i3, i7, Math.max(Math.min(i4, 400), 10));
                C2043bi.m5519M(this);
            }
            if (this.f316164k) {
                m189174t(false);
            }
            if (z2 && (jVar2 = this.f316168o) != null) {
                jVar2.mo9184e(i5);
                return;
            }
            return;
        }
        if (z2 && (jVar = this.f316168o) != null) {
            jVar.mo9184e(i5);
        }
        m189174t(false);
        scrollTo(0, q);
        m189170B();
    }

    /* renamed from: x */
    private final void m189178x(boolean z) {
        if (this.f316131F != z) {
            this.f316131F = z;
        }
    }

    /* renamed from: y */
    private final void m189179y() {
        if (this.f316151ac != 0) {
            ArrayList arrayList = this.f316152ad;
            if (arrayList == null) {
                this.f316152ad = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f316152ad.add(getChildAt(i));
            }
            Collections.sort(this.f316152ad, f316125y);
        }
    }

    /* renamed from: z */
    private final boolean m189180z(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f316138M;
        this.f316138M = f;
        float scrollY = ((float) getScrollY()) + (f2 - f);
        float q = (float) m189171q();
        float f3 = this.f316128C * q;
        float f4 = this.f316129D * q;
        boolean z3 = false;
        C114126bd bdVar = (C114126bd) this.f316157d.get(0);
        ArrayList arrayList = this.f316157d;
        C114126bd bdVar2 = (C114126bd) arrayList.get(arrayList.size() - 1);
        if (bdVar.f316325b != 0) {
            f3 = bdVar.f316328e * q;
            z = false;
        } else {
            z = true;
        }
        if (bdVar2.f316325b != this.f316158e.mo9175k() - 1) {
            f4 = bdVar2.f316328e * q;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollY < f3) {
            if (z) {
                this.f316146U.f6083a.onPull(Math.abs(f3 - scrollY) / q);
                z3 = true;
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z2) {
                this.f316147V.f6083a.onPull(Math.abs(scrollY - f4) / q);
                z3 = true;
            }
            scrollY = f4;
        }
        int i = (int) scrollY;
        this.f316137L += scrollY - ((float) i);
        scrollTo(getScrollX(), i);
        m189170B();
        return z3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C114126bd mo101071a(int i, int i2) {
        C114126bd bdVar = new C114126bd();
        bdVar.f316325b = i;
        bdVar.f316324a = this.f316158e.mo649gw(this, i);
        bdVar.f316327d = 1.0f;
        if (i2 < 0 || i2 >= this.f316157d.size()) {
            this.f316157d.add(bdVar);
        } else {
            this.f316157d.add(i2, bdVar);
        }
        return bdVar;
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C114126bd b;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (b = mo101075b(childAt)) != null && b.f316325b == this.f316159f) {
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
        C114126bd b;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (b = mo101075b(childAt)) != null && b.f316325b == this.f316159f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new C114127be();
        }
        C114127be beVar = (C114127be) layoutParams;
        boolean z = beVar.f316329a | (view instanceof C114125bc);
        beVar.f316329a = z;
        if (!this.f316130E) {
            super.addView(view, i, layoutParams);
        } else if (beVar == null || !z) {
            beVar.f316332d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C114126bd mo101075b(View view) {
        for (int i = 0; i < this.f316157d.size(); i++) {
            C114126bd bdVar = (C114126bd) this.f316157d.get(i);
            if (this.f316158e.mo652i(view, bdVar.f316324a)) {
                return bdVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C114126bd mo101076c(int i) {
        for (int i2 = 0; i2 < this.f316157d.size(); i2++) {
            C114126bd bdVar = (C114126bd) this.f316157d.get(i2);
            if (bdVar.f316325b == i) {
                return bdVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C114127be) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        if (this.f316127B.isFinished() || !this.f316127B.computeScrollOffset()) {
            m189174t(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f316127B.getCurrX();
        int currY = this.f316127B.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m189170B()) {
                this.f316127B.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        C2043bi.m5519M(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo101079d() {
        int k = this.f316158e.mo9175k();
        this.f316155b = k;
        boolean z = this.f316157d.size() < 3 && this.f316157d.size() < k;
        int i = this.f316159f;
        int i2 = 0;
        while (i2 < this.f316157d.size()) {
            C114126bd bdVar = (C114126bd) this.f316157d.get(i2);
            int l = this.f316158e.mo9176l(bdVar.f316324a);
            if (l != -1) {
                if (l == -2) {
                    this.f316157d.remove(i2);
                    i2--;
                    int i3 = bdVar.f316325b;
                    removeView((View) bdVar.f316324a);
                    int i4 = this.f316159f;
                    if (i4 == bdVar.f316325b) {
                        i = Math.max(0, Math.min(i4, -1 + k));
                    }
                } else {
                    int i5 = bdVar.f316325b;
                    if (i5 != l) {
                        if (i5 == this.f316159f) {
                            i = l;
                        }
                        bdVar.f316325b = l;
                    }
                }
                z = true;
            }
            i2++;
        }
        Collections.sort(this.f316157d, f316123w);
        if (z) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                C114127be beVar = (C114127be) getChildAt(i6).getLayoutParams();
                if (!beVar.f316329a) {
                    beVar.f316331c = 0.0f;
                }
            }
            mo101092i(i, false, true, 0);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.f316154af) {
            C58833ax axVar = this.f316172s;
            if (axVar != null && axVar.mo56113h()) {
                ((C89922b) axVar.mo56107c()).mo83757a();
                this.f316173t.mo41633g();
                this.f316154af = true;
            }
            C68214a aVar = this.f316174u;
            if (aVar != null) {
                ((C113853ch) aVar.mo27525b()).mo100699a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
            r4 = this;
            boolean r0 = super.dispatchKeyEvent(r5)
            r1 = 1
            if (r0 != 0) goto L_0x0049
            int r0 = r5.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0044
            int r0 = r5.getKeyCode()
            r3 = 21
            if (r0 == r3) goto L_0x003d
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x001f
            goto L_0x0044
        L_0x001f:
            boolean r0 = r5.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            r5 = 2
            boolean r5 = r4.mo101094k(r5)
            goto L_0x0045
        L_0x002b:
            boolean r5 = r5.hasModifiers(r1)
            if (r5 == 0) goto L_0x0044
            boolean r5 = r4.mo101094k(r1)
            goto L_0x0045
        L_0x0036:
            r5 = 66
            boolean r5 = r4.mo101094k(r5)
            goto L_0x0045
        L_0x003d:
            r5 = 17
            boolean r5 = r4.mo101094k(r5)
            goto L_0x0045
        L_0x0044:
            r5 = 0
        L_0x0045:
            if (r5 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            return r2
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.ValyrianViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C114126bd b;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (b = mo101075b(childAt)) != null && b.f316325b == this.f316159f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        boolean z;
        C4268a aVar;
        super.draw(canvas);
        int j = C2043bi.m5581j(this);
        if (j == 0 || (j == 1 && (aVar = this.f316158e) != null && aVar.mo9175k() > 1)) {
            if (!this.f316146U.f6083a.isFinished()) {
                int save = canvas.save();
                int height = getHeight();
                int width = getWidth();
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                canvas.translate((float) getPaddingLeft(), this.f316128C * ((float) height));
                this.f316146U.f6083a.setSize((width - paddingLeft) - paddingRight, height);
                z = this.f316146U.f6083a.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                z = false;
            }
            if (!this.f316147V.f6083a.isFinished()) {
                int save2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((float) ((-width2) - getPaddingLeft()), (-(this.f316129D + 1.0f)) * ((float) height2));
                this.f316147V.f6083a.setSize(width2, height2);
                z |= this.f316147V.f6083a.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                C2043bi.m5519M(this);
                return;
            }
            return;
        }
        this.f316146U.f6083a.finish();
        this.f316147V.f6083a.finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo101084e() {
        ((C114094a) C47266f.m84076a(getContext(), C114094a.class)).mo101114qT(this);
        setWillNotDraw(false);
        setDescendantFocusability(C89885b.HTTP_VALUE);
        setFocusable(true);
        Context context = getContext();
        this.f316127B = new Scroller(context, f316124x);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f316136K = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.f316143R = (int) (400.0f * f);
        this.f316144S = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f316146U = new C2123j(context);
        this.f316147V = new C2123j(context);
        this.f316166m = (int) (10.0f * f);
        this.f316145T = (int) (f + f);
        this.f316134I = (int) (f * 16.0f);
        C2043bi.m5526T(this, new C114128bf(this));
        if (C2043bi.m5575d(this) == 0) {
            C2043bi.m5551ae(this, 1);
        }
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r10 != r11) goto L_0x0068;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101085f(int r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r0.f316159f
            if (r2 == r1) goto L_0x0016
            if (r2 >= r1) goto L_0x000d
            r4 = 130(0x82, float:1.82E-43)
            goto L_0x000f
        L_0x000d:
            r4 = 33
        L_0x000f:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r2 = r0.mo101076c(r2)
            r0.f316159f = r1
            goto L_0x0018
        L_0x0016:
            r4 = 2
            r2 = 0
        L_0x0018:
            androidx.viewpager.widget.a r1 = r0.f316158e
            if (r1 != 0) goto L_0x0020
            r18.m189179y()
            return
        L_0x0020:
            boolean r1 = r0.f316165l
            if (r1 == 0) goto L_0x0028
            r18.m189179y()
            return
        L_0x0028:
            android.os.IBinder r1 = r18.getWindowToken()
            if (r1 == 0) goto L_0x0390
            int r1 = r0.f316159f
            int r1 = r1 + -1
            r5 = 0
            int r1 = java.lang.Math.max(r5, r1)
            androidx.viewpager.widget.a r6 = r0.f316158e
            int r6 = r6.mo9175k()
            int r7 = r6 + -1
            int r8 = r0.f316159f
            int r8 = r8 + 1
            int r7 = java.lang.Math.min(r7, r8)
            int r8 = r0.f316155b
            if (r6 != r8) goto L_0x0333
            r8 = 0
        L_0x004c:
            java.util.ArrayList r9 = r0.f316157d
            int r9 = r9.size()
            if (r8 >= r9) goto L_0x0068
            java.util.ArrayList r9 = r0.f316157d
            java.lang.Object r9 = r9.get(r8)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r9 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r9
            int r10 = r9.f316325b
            int r11 = r0.f316159f
            if (r10 < r11) goto L_0x0065
            if (r10 == r11) goto L_0x0069
            goto L_0x0068
        L_0x0065:
            int r8 = r8 + 1
            goto L_0x004c
        L_0x0068:
            r9 = 0
        L_0x0069:
            if (r9 != 0) goto L_0x0073
            if (r6 <= 0) goto L_0x0073
            int r9 = r0.f316159f
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r9 = r0.mo101071a(r9, r8)
        L_0x0073:
            if (r9 == 0) goto L_0x02b5
            int r11 = r8 + -1
            if (r11 < 0) goto L_0x0082
            java.util.ArrayList r12 = r0.f316157d
            java.lang.Object r12 = r12.get(r11)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r12 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r12
            goto L_0x0083
        L_0x0082:
            r12 = 0
        L_0x0083:
            int r13 = r18.m189171q()
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 > 0) goto L_0x008d
            r15 = 0
            goto L_0x0099
        L_0x008d:
            float r15 = r9.f316327d
            float r15 = r14 - r15
            int r3 = r18.getPaddingLeft()
            float r3 = (float) r3
            float r5 = (float) r13
            float r3 = r3 / r5
            float r15 = r15 + r3
        L_0x0099:
            int r3 = r0.f316159f
            int r3 = r3 + -1
            r5 = 0
        L_0x009e:
            if (r3 < 0) goto L_0x00fd
            int r16 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r16 < 0) goto L_0x00cc
            if (r3 >= r1) goto L_0x00cc
            if (r12 != 0) goto L_0x00a9
            goto L_0x00fd
        L_0x00a9:
            int r10 = r12.f316325b
            if (r3 != r10) goto L_0x00fa
            boolean r10 = r12.f316326c
            if (r10 != 0) goto L_0x00fa
            java.util.ArrayList r10 = r0.f316157d
            r10.remove(r11)
            java.lang.Object r10 = r12.f316324a
            android.view.View r10 = (android.view.View) r10
            r0.removeView(r10)
            int r11 = r11 + -1
            int r8 = r8 + -1
            if (r11 < 0) goto L_0x00f8
            java.util.ArrayList r10 = r0.f316157d
            java.lang.Object r10 = r10.get(r11)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r10 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r10
            goto L_0x00f9
        L_0x00cc:
            if (r12 == 0) goto L_0x00e2
            int r10 = r12.f316325b
            if (r3 != r10) goto L_0x00e2
            float r10 = r12.f316327d
            float r5 = r5 + r10
            int r11 = r11 + -1
            if (r11 < 0) goto L_0x00f8
            java.util.ArrayList r10 = r0.f316157d
            java.lang.Object r10 = r10.get(r11)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r10 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r10
            goto L_0x00f9
        L_0x00e2:
            int r10 = r11 + 1
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r10 = r0.mo101071a(r3, r10)
            float r10 = r10.f316327d
            float r5 = r5 + r10
            int r8 = r8 + 1
            if (r11 < 0) goto L_0x00f8
            java.util.ArrayList r10 = r0.f316157d
            java.lang.Object r10 = r10.get(r11)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r10 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r10
            goto L_0x00f9
        L_0x00f8:
            r10 = 0
        L_0x00f9:
            r12 = r10
        L_0x00fa:
            int r3 = r3 + -1
            goto L_0x009e
        L_0x00fd:
            float r1 = r9.f316327d
            int r3 = r8 + 1
            int r5 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r5 >= 0) goto L_0x0198
            java.util.ArrayList r5 = r0.f316157d
            int r5 = r5.size()
            if (r3 >= r5) goto L_0x0116
            java.util.ArrayList r5 = r0.f316157d
            java.lang.Object r5 = r5.get(r3)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r5 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r5
            goto L_0x0117
        L_0x0116:
            r5 = 0
        L_0x0117:
            if (r13 > 0) goto L_0x011b
            r10 = 0
            goto L_0x0123
        L_0x011b:
            int r10 = r18.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r13
            float r10 = r10 / r11
            float r10 = r10 + r14
        L_0x0123:
            int r11 = r0.f316159f
            int r11 = r11 + 1
            r12 = r3
        L_0x0128:
            if (r11 >= r6) goto L_0x0198
            int r13 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r13 < 0) goto L_0x0158
            if (r11 <= r7) goto L_0x0158
            if (r5 != 0) goto L_0x0133
            goto L_0x0198
        L_0x0133:
            int r13 = r5.f316325b
            if (r11 != r13) goto L_0x0195
            boolean r13 = r5.f316326c
            if (r13 != 0) goto L_0x0195
            java.util.ArrayList r13 = r0.f316157d
            r13.remove(r12)
            java.lang.Object r5 = r5.f316324a
            android.view.View r5 = (android.view.View) r5
            r0.removeView(r5)
            java.util.ArrayList r5 = r0.f316157d
            int r5 = r5.size()
            if (r12 >= r5) goto L_0x0194
            java.util.ArrayList r5 = r0.f316157d
            java.lang.Object r5 = r5.get(r12)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r5 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r5
            goto L_0x0195
        L_0x0158:
            if (r5 == 0) goto L_0x0174
            int r13 = r5.f316325b
            if (r11 != r13) goto L_0x0174
            float r5 = r5.f316327d
            float r1 = r1 + r5
            int r12 = r12 + 1
            java.util.ArrayList r5 = r0.f316157d
            int r5 = r5.size()
            if (r12 >= r5) goto L_0x0194
            java.util.ArrayList r5 = r0.f316157d
            java.lang.Object r5 = r5.get(r12)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r5 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r5
            goto L_0x0195
        L_0x0174:
            int r5 = r12 + 1
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r12 = r0.mo101071a(r11, r12)
            float r12 = r12.f316327d
            float r1 = r1 + r12
            java.util.ArrayList r12 = r0.f316157d
            int r12 = r12.size()
            if (r5 >= r12) goto L_0x0193
            java.util.ArrayList r12 = r0.f316157d
            java.lang.Object r12 = r12.get(r5)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r12 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r12
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
            androidx.viewpager.widget.a r1 = r0.f316158e
            int r1 = r1.mo9175k()
            int r5 = r18.m189171q()
            if (r5 <= 0) goto L_0x01aa
            float r5 = (float) r5
            r6 = 0
            float r10 = r6 / r5
            r6 = r10
            goto L_0x01ab
        L_0x01aa:
            r6 = 0
        L_0x01ab:
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x023c
            int r7 = r2.f316325b
            int r10 = r9.f316325b
            if (r7 >= r10) goto L_0x01fe
            float r10 = r2.f316328e
            float r2 = r2.f316327d
            float r10 = r10 + r2
            float r10 = r10 + r6
            int r7 = r7 + 1
            r2 = 0
        L_0x01be:
            int r11 = r9.f316325b
            if (r7 > r11) goto L_0x023c
            java.util.ArrayList r11 = r0.f316157d
            int r11 = r11.size()
            if (r2 >= r11) goto L_0x023c
            java.util.ArrayList r11 = r0.f316157d
            java.lang.Object r11 = r11.get(r2)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r11 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r11
        L_0x01d2:
            int r12 = r11.f316325b
            if (r7 <= r12) goto L_0x01eb
            java.util.ArrayList r12 = r0.f316157d
            int r12 = r12.size()
            int r12 = r12 + -1
            if (r2 >= r12) goto L_0x01eb
            int r2 = r2 + 1
            java.util.ArrayList r11 = r0.f316157d
            java.lang.Object r11 = r11.get(r2)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r11 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r11
            goto L_0x01d2
        L_0x01eb:
            int r12 = r11.f316325b
            if (r7 >= r12) goto L_0x01f5
            float r12 = r6 + r5
            float r10 = r10 + r12
            int r7 = r7 + 1
            goto L_0x01eb
        L_0x01f5:
            r11.f316328e = r10
            float r11 = r11.f316327d
            float r11 = r11 + r6
            float r10 = r10 + r11
            int r7 = r7 + 1
            goto L_0x01be
        L_0x01fe:
            if (r7 <= r10) goto L_0x023c
            java.util.ArrayList r10 = r0.f316157d
            int r10 = r10.size()
            int r10 = r10 + -1
            float r2 = r2.f316328e
        L_0x020a:
            int r7 = r7 + -1
            int r11 = r9.f316325b
            if (r7 < r11) goto L_0x023c
            if (r10 < 0) goto L_0x023c
            java.util.ArrayList r11 = r0.f316157d
            java.lang.Object r11 = r11.get(r10)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r11 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r11
        L_0x021a:
            int r12 = r11.f316325b
            if (r7 >= r12) goto L_0x022b
            if (r10 <= 0) goto L_0x022b
            int r10 = r10 + -1
            java.util.ArrayList r11 = r0.f316157d
            java.lang.Object r11 = r11.get(r10)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r11 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r11
            goto L_0x021a
        L_0x022b:
            int r12 = r11.f316325b
            if (r7 <= r12) goto L_0x0235
            float r12 = r6 + r5
            float r2 = r2 - r12
            int r7 = r7 + -1
            goto L_0x022b
        L_0x0235:
            float r12 = r11.f316327d
            float r12 = r12 + r6
            float r2 = r2 - r12
            r11.f316328e = r2
            goto L_0x020a
        L_0x023c:
            java.util.ArrayList r2 = r0.f316157d
            int r2 = r2.size()
            float r7 = r9.f316328e
            int r10 = r9.f316325b
            int r11 = r10 + -1
            if (r10 != 0) goto L_0x024c
            r12 = r7
            goto L_0x024f
        L_0x024c:
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x024f:
            r0.f316128C = r12
            int r1 = r1 + -1
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r10 != r1) goto L_0x025c
            float r10 = r9.f316327d
            float r10 = r10 + r7
            float r10 = r10 + r12
            goto L_0x025f
        L_0x025c:
            r10 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x025f:
            r0.f316129D = r10
            int r8 = r8 + -1
        L_0x0263:
            if (r8 < 0) goto L_0x0286
            java.util.ArrayList r10 = r0.f316157d
            java.lang.Object r10 = r10.get(r8)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r10 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r10
        L_0x026d:
            int r13 = r10.f316325b
            if (r11 <= r13) goto L_0x0277
            int r11 = r11 + -1
            float r13 = r6 + r5
            float r7 = r7 - r13
            goto L_0x026d
        L_0x0277:
            float r14 = r10.f316327d
            float r14 = r14 + r6
            float r7 = r7 - r14
            r10.f316328e = r7
            if (r13 != 0) goto L_0x0281
            r0.f316128C = r7
        L_0x0281:
            int r8 = r8 + -1
            int r11 = r11 + -1
            goto L_0x0263
        L_0x0286:
            float r7 = r9.f316328e
            float r8 = r9.f316327d
            float r7 = r7 + r8
            float r7 = r7 + r6
            int r8 = r9.f316325b
        L_0x028e:
            int r8 = r8 + 1
            if (r3 >= r2) goto L_0x02b5
            java.util.ArrayList r9 = r0.f316157d
            java.lang.Object r9 = r9.get(r3)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r9 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r9
        L_0x029a:
            int r10 = r9.f316325b
            if (r8 >= r10) goto L_0x02a4
            int r8 = r8 + 1
            float r10 = r6 + r5
            float r7 = r7 + r10
            goto L_0x029a
        L_0x02a4:
            if (r10 != r1) goto L_0x02ac
            float r10 = r9.f316327d
            float r10 = r10 + r7
            float r10 = r10 + r12
            r0.f316129D = r10
        L_0x02ac:
            r9.f316328e = r7
            float r9 = r9.f316327d
            float r9 = r9 + r6
            float r7 = r7 + r9
            int r3 = r3 + 1
            goto L_0x028e
        L_0x02b5:
            int r1 = r18.getChildCount()
            r2 = 0
        L_0x02ba:
            if (r2 >= r1) goto L_0x02e6
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.be r5 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114127be) r5
            r5.f316334f = r2
            boolean r6 = r5.f316329a
            if (r6 != 0) goto L_0x02e2
            float r6 = r5.f316331c
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x02e3
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r3 = r0.mo101075b(r3)
            if (r3 == 0) goto L_0x02e3
            float r6 = r3.f316327d
            r5.f316331c = r6
            int r3 = r3.f316325b
            r5.f316333e = r3
            goto L_0x02e3
        L_0x02e2:
            r7 = 0
        L_0x02e3:
            int r2 = r2 + 1
            goto L_0x02ba
        L_0x02e6:
            r18.m189179y()
            boolean r1 = r18.hasFocus()
            if (r1 == 0) goto L_0x0332
            android.view.View r1 = r18.findFocus()
            if (r1 == 0) goto L_0x0309
        L_0x02f5:
            android.view.ViewParent r2 = r1.getParent()
            if (r2 == r0) goto L_0x0304
            boolean r1 = r2 instanceof android.view.View
            if (r1 != 0) goto L_0x0300
            goto L_0x0309
        L_0x0300:
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            goto L_0x02f5
        L_0x0304:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r3 = r0.mo101075b(r1)
            goto L_0x030a
        L_0x0309:
            r3 = 0
        L_0x030a:
            if (r3 == 0) goto L_0x0312
            int r1 = r3.f316325b
            int r2 = r0.f316159f
            if (r1 == r2) goto L_0x0332
        L_0x0312:
            r5 = 0
        L_0x0313:
            int r1 = r18.getChildCount()
            if (r5 >= r1) goto L_0x0332
            android.view.View r1 = r0.getChildAt(r5)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r2 = r0.mo101075b(r1)
            if (r2 == 0) goto L_0x032f
            int r2 = r2.f316325b
            int r3 = r0.f316159f
            if (r2 != r3) goto L_0x032f
            boolean r1 = r1.requestFocus(r4)
            if (r1 != 0) goto L_0x0332
        L_0x032f:
            int r5 = r5 + 1
            goto L_0x0313
        L_0x0332:
            return
        L_0x0333:
            android.content.res.Resources r1 = r18.getResources()     // Catch:{ NotFoundException -> 0x0340 }
            int r2 = r18.getId()     // Catch:{ NotFoundException -> 0x0340 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0340 }
            goto L_0x0348
        L_0x0340:
            int r1 = r18.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0348:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            int r3 = r0.f316155b
            java.lang.Class r4 = r18.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            androidx.viewpager.widget.a r5 = r0.f316158e
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r3 = ", found: "
            r7.append(r3)
            r7.append(r6)
            java.lang.String r3 = " Pager id: "
            r7.append(r3)
            r7.append(r1)
            java.lang.String r1 = " Pager class: "
            r7.append(r1)
            r7.append(r4)
            java.lang.String r1 = " Problematic adapter: "
            r7.append(r1)
            r7.append(r5)
            java.lang.String r1 = r7.toString()
            r2.<init>(r1)
            throw r2
        L_0x0390:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.ValyrianViewPager.mo101085f(int):void");
    }

    /* renamed from: g */
    public final void mo101086g(int i) {
        this.f316165l = false;
        mo101092i(i, !this.f316167n, false, 0);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C114127be();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C114127be(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final int getChildDrawingOrder(int i, int i2) {
        return ((C114127be) ((View) this.f316152ad.get(i2)).getLayoutParams()).f316334f;
    }

    /* renamed from: h */
    public final void mo101091h(int i, boolean z) {
        this.f316165l = false;
        mo101092i(i, z, false, 0);
    }

    /* renamed from: i */
    public final void mo101092i(int i, boolean z, boolean z2, int i2) {
        C4277j jVar;
        C4268a aVar = this.f316158e;
        boolean z3 = false;
        if (aVar == null || aVar.mo9175k() <= 0) {
            m189178x(false);
        } else if (z2 || this.f316159f != i || this.f316157d.isEmpty()) {
            int i3 = -1;
            if (i < 0) {
                i = 0;
            } else if (i >= this.f316158e.mo9175k()) {
                i = this.f316158e.mo9175k() - 1;
            }
            int i4 = this.f316159f;
            if (i > i4 + 1 || i < i4 - 1) {
                for (int i5 = 0; i5 < this.f316157d.size(); i5++) {
                    ((C114126bd) this.f316157d.get(i5)).f316326c = true;
                }
            }
            int i6 = this.f316159f;
            if (i6 != i) {
                z3 = true;
            }
            if (this.f316167n) {
                this.f316159f = i;
                if (z3 && (jVar = this.f316168o) != null) {
                    jVar.mo9184e(i);
                }
                requestLayout();
                return;
            }
            if (i6 != i) {
                if (i > i6) {
                    i3 = 1;
                }
                this.f316170q = i3;
            }
            mo101085f(i);
            m189177w(i, z, i2, z3);
        } else {
            m189178x(false);
        }
    }

    /* renamed from: j */
    public final void mo101093j(int i) {
        if (this.f316171r != i) {
            this.f316171r = i;
            if (this.f316150ab != null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    C2043bi.m5539aF(getChildAt(i2), i == 0 ? 0 : 2);
                }
            }
            C4277j jVar = this.f316168o;
            if (jVar != null) {
                jVar.mo9182a(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo101094k(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            r1 = 0
            if (r0 != r5) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x0056
        L_0x0009:
            if (r0 == 0) goto L_0x0056
            android.view.ViewParent r2 = r0.getParent()
        L_0x000f:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x001b
            if (r2 != r5) goto L_0x0016
            goto L_0x0056
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
            com.google.common.f.e r0 = f316122v
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view %s"
            r4 = 28743(0x7047, float:4.0278E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r3, r2)
            goto L_0x0007
        L_0x0056:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r5, r0, r6)
            r2 = 33
            r3 = 0
            if (r1 == 0) goto L_0x0088
            if (r1 == r0) goto L_0x0088
            if (r6 != r2) goto L_0x00ab
            android.graphics.Rect r6 = r5.f316126A
            android.graphics.Rect r6 = r5.m189172r(r6, r1)
            int r6 = r6.top
            android.graphics.Rect r3 = r5.f316126A
            android.graphics.Rect r3 = r5.m189172r(r3, r0)
            int r3 = r3.top
            if (r0 == 0) goto L_0x0080
            if (r6 < r3) goto L_0x0080
            boolean r6 = r5.mo101097n()
            goto L_0x0084
        L_0x0080:
            boolean r6 = r1.requestFocus()
        L_0x0084:
            r3 = r6
            r6 = 33
            goto L_0x00ab
        L_0x0088:
            if (r6 == r2) goto L_0x00a7
            r0 = 1
            if (r6 != r0) goto L_0x008e
            goto L_0x00a7
        L_0x008e:
            r1 = 2
            if (r6 != r1) goto L_0x00ab
            androidx.viewpager.widget.a r1 = r5.f316158e
            if (r1 == 0) goto L_0x00ab
            int r2 = r5.f316159f
            int r1 = r1.mo9175k()
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x00ab
            int r1 = r5.f316159f
            int r1 = r1 + r0
            r5.mo101091h(r1, r0)
            r3 = 1
            goto L_0x00ab
        L_0x00a7:
            boolean r3 = r5.mo101097n()
        L_0x00ab:
            if (r3 == 0) goto L_0x00b4
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        L_0x00b4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.ValyrianViewPager.mo101094k(int):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo101095l(View view, boolean z, int i, int i2, int i3) {
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
                int i5 = i3 + scrollY;
                if (i5 >= childAt.getTop() && i5 < childAt.getBottom() && (i4 = i2 + scrollX) >= childAt.getLeft() && i4 < childAt.getRight()) {
                    if (mo101095l(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (view2 instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view2;
            ((C59052c) ((C59052c) f316122v.mo56224b()).mo56372aa(28744)).mo56359L("canScroll ***: offset %d range %d ext %d", Integer.valueOf(recyclerView.computeVerticalScrollOffset()), Integer.valueOf(recyclerView.computeVerticalScrollRange()), Integer.valueOf(recyclerView.computeVerticalScrollExtent()));
        }
        if (!z || !view.canScrollVertically(-i)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean mo101096m(int i) {
        if (this.f316158e == null) {
            return false;
        }
        int q = m189171q();
        int scrollY = getScrollY();
        if (i < 0) {
            if (scrollY > ((int) (((float) q) * this.f316128C))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollY >= ((int) (((float) q) * this.f316129D))) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo101097n() {
        int i = this.f316159f;
        if (i <= 0) {
            return false;
        }
        mo101091h(i - 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101098o() {
        /*
            r11 = this;
            int r0 = r11.f316149aa
            r1 = 0
            if (r0 <= 0) goto L_0x006e
            int r0 = r11.getScrollY()
            int r2 = r11.getPaddingTop()
            int r3 = r11.getPaddingBottom()
            int r4 = r11.getHeight()
            int r5 = r11.getChildCount()
            r6 = 0
        L_0x001a:
            if (r6 >= r5) goto L_0x006e
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.be r8 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114127be) r8
            boolean r9 = r8.f316329a
            if (r9 != 0) goto L_0x002b
            goto L_0x006b
        L_0x002b:
            int r8 = r8.f316330b
            r8 = r8 & 112(0x70, float:1.57E-43)
            r9 = 16
            if (r8 == r9) goto L_0x0050
            r9 = 48
            if (r8 == r9) goto L_0x004a
            r9 = 80
            if (r8 == r9) goto L_0x003d
            r8 = r2
            goto L_0x005f
        L_0x003d:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredHeight()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredHeight()
            int r3 = r3 + r9
            goto L_0x005c
        L_0x004a:
            int r8 = r7.getHeight()
            int r8 = r8 + r2
            goto L_0x005f
        L_0x0050:
            int r8 = r7.getMeasuredHeight()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
        L_0x005c:
            r10 = r8
            r8 = r2
            r2 = r10
        L_0x005f:
            int r2 = r2 + r0
            int r9 = r7.getTop()
            int r2 = r2 - r9
            if (r2 == 0) goto L_0x006a
            r7.offsetTopAndBottom(r2)
        L_0x006a:
            r2 = r8
        L_0x006b:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x006e:
            androidx.viewpager.widget.k r0 = r11.f316150ab
            if (r0 == 0) goto L_0x00bf
            int r0 = r11.getScrollY()
            int r2 = r11.getChildCount()
        L_0x007a:
            if (r1 >= r2) goto L_0x00bf
            android.view.View r3 = r11.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.be r4 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114127be) r4
            boolean r4 = r4.f316329a
            if (r4 == 0) goto L_0x008b
            goto L_0x00bc
        L_0x008b:
            int r4 = r3.getTop()
            int r4 = r4 - r0
            float r4 = (float) r4
            int r5 = r11.m189171q()
            float r5 = (float) r5
            float r4 = r4 / r5
            androidx.viewpager.widget.k r5 = r11.f316150ab
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ay r5 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114120ay) r5
            boolean r5 = r5.f316319a
            if (r5 == 0) goto L_0x00bc
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 < 0) goto L_0x00ad
            int r7 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x00ad
            float r6 = r5 - r4
            goto L_0x00b9
        L_0x00ad:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x00b9
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b9
            float r6 = r4 + r5
        L_0x00b9:
            r3.setAlpha(r6)
        L_0x00bc:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x00bf:
            r0 = 1
            r11.f316148W = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.ValyrianViewPager.mo101098o():void");
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f316167n = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f316153ae);
        super.onDetachedFromWindow();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        MotionEvent motionEvent2 = motionEvent;
        try {
            int action = motionEvent.getAction() & PrivateKeyType.INVALID;
            if (!this.f316156c) {
                return false;
            }
            if (action != 3) {
                if (action != 1) {
                    if (action == 0) {
                        float x = motionEvent.getX();
                        this.f316139N = x;
                        this.f316137L = x;
                        float y = motionEvent.getY();
                        this.f316140O = y;
                        this.f316138M = y;
                        this.f316141P = motionEvent2.getPointerId(0);
                        this.f316133H = false;
                        this.f316127B.computeScrollOffset();
                        if (this.f316171r != 2 || Math.abs(this.f316127B.getFinalY() - this.f316127B.getCurrY()) <= this.f316145T) {
                            m189174t(false);
                            this.f316132G = false;
                        } else {
                            this.f316127B.abortAnimation();
                            this.f316165l = false;
                            mo101085f(this.f316159f);
                            this.f316132G = true;
                            m189169A();
                            mo101093j(1);
                        }
                    } else if (this.f316132G) {
                        return true;
                    } else {
                        if (this.f316133H) {
                            return false;
                        }
                        if (action == 2) {
                            int i = this.f316141P;
                            if (i != -1) {
                                int findPointerIndex = motionEvent2.findPointerIndex(i);
                                float y2 = motionEvent2.getY(findPointerIndex);
                                float f2 = y2 - this.f316138M;
                                float abs = Math.abs(f2);
                                float x2 = motionEvent2.getX(findPointerIndex);
                                float abs2 = Math.abs(x2 - this.f316139N);
                                if (f2 != 0.0f) {
                                    float f3 = this.f316138M;
                                    if (f3 >= ((float) this.f316135J) || f2 <= 0.0f) {
                                        if (f3 <= ((float) (getHeight() - this.f316135J)) || f2 >= 0.0f) {
                                            if (mo101095l(this, false, (int) f2, (int) x2, (int) y2)) {
                                                this.f316137L = x2;
                                                this.f316138M = y2;
                                                this.f316133H = true;
                                                return false;
                                            }
                                        }
                                    }
                                }
                                float f4 = (float) this.f316136K;
                                if (abs > f4) {
                                    this.f316132G = true;
                                    m189169A();
                                    mo101093j(1);
                                    if (f2 > 0.0f) {
                                        f = this.f316140O + ((float) this.f316136K);
                                    } else {
                                        f = this.f316140O - ((float) this.f316136K);
                                    }
                                    this.f316138M = f;
                                    this.f316137L = x2;
                                    m189178x(true);
                                } else if (abs2 > f4) {
                                    this.f316133H = true;
                                }
                                if (this.f316132G && m189180z(y2)) {
                                    C2043bi.m5519M(this);
                                }
                            }
                        } else if (action == 6) {
                            m189176v(motionEvent);
                        }
                    }
                    if (this.f316142Q == null) {
                        this.f316142Q = VelocityTracker.obtain();
                    }
                    VelocityTracker velocityTracker = this.f316142Q;
                    velocityTracker.getClass();
                    velocityTracker.addMovement(motionEvent2);
                    return this.f316132G;
                }
            }
            this.f316132G = false;
            this.f316133H = false;
            this.f316141P = -1;
            VelocityTracker velocityTracker2 = this.f316142Q;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f316142Q = null;
            }
            return false;
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) f316122v.mo56225c()).mo56382g(e)).mo56372aa(28746)).mo56386p("#onInterceptTouchEvent");
            return false;
        }
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
            int r8 = r18.getScrollY()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.be r12 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114127be) r12
            boolean r14 = r12.f316329a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f316330b
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
            int r5 = r5 + r8
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
            int r3 = r3 - r5
            int r3 = r3 - r7
            r7 = 0
        L_0x00b9:
            if (r7 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r7)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.be r9 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114127be) r9
            boolean r10 = r9.f316329a
            if (r10 != 0) goto L_0x0105
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r10 = r0.mo101075b(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r3
            float r10 = r10.f316328e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r5
            boolean r14 = r9.f316332d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f316332d = r14
            int r14 = r2 - r4
            int r14 = r14 - r6
            r15 = 1073741824(0x40000000, float:2.0)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r15)
            float r9 = r9.f316331c
            float r13 = r13 * r9
            int r9 = (int) r13
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r15)
            r8.measure(r14, r9)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r4
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r10
            r8.layout(r4, r10, r9, r13)
        L_0x0105:
            int r7 = r7 + 1
            goto L_0x00b9
        L_0x0108:
            r0.f316149aa = r11
            boolean r1 = r0.f316167n
            if (r1 == 0) goto L_0x0115
            int r1 = r0.f316159f
            r2 = 0
            r0.m189177w(r1, r2, r2, r2)
            goto L_0x0116
        L_0x0115:
            r2 = 0
        L_0x0116:
            r0.f316167n = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.ValyrianViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = r17
            int r2 = getDefaultSize(r1, r2)
            r3 = r18
            int r3 = getDefaultSize(r1, r3)
            r0.setMeasuredDimension(r2, r3)
            int r2 = r16.getMeasuredHeight()
            int r3 = r2 / 10
            int r4 = r0.f316134I
            int r3 = java.lang.Math.min(r3, r4)
            r0.f316135J = r3
            int r3 = r16.getMeasuredWidth()
            int r4 = r16.getPaddingLeft()
            int r3 = r3 - r4
            int r4 = r16.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r16.getPaddingTop()
            int r2 = r2 - r4
            int r4 = r16.getPaddingBottom()
            int r2 = r2 - r4
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
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.be r6 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114127be) r6
            if (r6 == 0) goto L_0x00bd
            boolean r10 = r6.f316329a
            if (r10 == 0) goto L_0x00bd
            int r10 = r6.f316330b
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
            r13 = r3
        L_0x0090:
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x0094
        L_0x0093:
            r13 = r3
        L_0x0094:
            int r1 = r6.height
            if (r1 == r15) goto L_0x00a1
            int r1 = r6.height
            if (r1 == r14) goto L_0x009f
            int r1 = r6.height
            goto L_0x00a3
        L_0x009f:
            r1 = r2
            goto L_0x00a3
        L_0x00a1:
            r1 = r2
            r8 = r12
        L_0x00a3:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r11)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            r9.measure(r6, r1)
            if (r10 == 0) goto L_0x00b6
            int r1 = r9.getMeasuredHeight()
            int r2 = r2 - r1
            goto L_0x00bd
        L_0x00b6:
            if (r7 == 0) goto L_0x00bd
            int r1 = r9.getMeasuredWidth()
            int r3 = r3 - r1
        L_0x00bd:
            int r5 = r5 + 1
            r1 = 0
            goto L_0x003d
        L_0x00c2:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            r0.f316130E = r7
            int r3 = r0.f316159f
            r0.mo101085f(r3)
            r3 = 0
            r0.f316130E = r3
            int r4 = r16.getChildCount()
        L_0x00d4:
            if (r3 >= r4) goto L_0x00fc
            android.view.View r5 = r0.getChildAt(r3)
            int r7 = r5.getVisibility()
            if (r7 == r6) goto L_0x00f9
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.be r7 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114127be) r7
            if (r7 == 0) goto L_0x00ec
            boolean r9 = r7.f316329a
            if (r9 != 0) goto L_0x00f9
        L_0x00ec:
            float r9 = (float) r2
            float r7 = r7.f316331c
            float r9 = r9 * r7
            int r7 = (int) r9
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            r5.measure(r1, r7)
        L_0x00f9:
            int r3 = r3 + 1
            goto L_0x00d4
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.ValyrianViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        C114126bd b;
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
            if (childAt.getVisibility() == 0 && (b = mo101075b(childAt)) != null && b.f316325b == this.f316159f && childAt.requestFocus(i, rect)) {
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
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.f316158e != null) {
            Parcelable parcelable2 = savedState.f316177b;
            ClassLoader classLoader = savedState.f316178c;
            mo101092i(savedState.f316176a, false, true, 0);
            return;
        }
        this.f316160g = savedState.f316176a;
        this.f316161h = savedState.f316177b;
        this.f316162i = savedState.f316178c;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f316176a = this.f316159f;
        if (this.f316158e != null) {
            savedState.f316177b = null;
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 == i4) {
            return;
        }
        if (i4 <= 0 || this.f316157d.isEmpty()) {
            C114126bd c = mo101076c(this.f316159f);
            int min = (int) ((c != null ? Math.min(c.f316328e, this.f316129D) : 0.0f) * ((float) ((i2 - getPaddingTop()) - getPaddingBottom())));
            if (min != getScrollY()) {
                m189174t(false);
                scrollTo(getScrollX(), min);
                return;
            }
            return;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int scrollY = (int) ((((float) getScrollY()) / ((float) ((i4 - getPaddingTop()) - getPaddingBottom()))) * ((float) ((i2 - paddingTop) - paddingBottom)));
        scrollTo(getScrollX(), scrollY);
        if (!this.f316127B.isFinished()) {
            int duration = this.f316127B.getDuration() - this.f316127B.timePassed();
            C114126bd c2 = mo101076c(this.f316159f);
            if (c2 != null) {
                this.f316127B.startScroll(0, scrollY, 0, (int) (c2.f316328e * ((float) i2)), duration);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ac A[Catch:{ IllegalArgumentException -> 0x01d4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r0 = 0
            boolean r1 = r8.f316156c     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r1 != 0) goto L_0x0006
            return r0
        L_0x0006:
            int r1 = r9.getAction()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r1 != 0) goto L_0x0014
            int r1 = r9.getEdgeFlags()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r1 != 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r0
        L_0x0014:
            androidx.viewpager.widget.a r1 = r8.f316158e     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r1 == 0) goto L_0x01d3
            int r1 = r1.mo9175k()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r1 != 0) goto L_0x0020
            goto L_0x01d3
        L_0x0020:
            android.view.VelocityTracker r1 = r8.f316142Q     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r1 != 0) goto L_0x002a
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.f316142Q = r1     // Catch:{ IllegalArgumentException -> 0x01d4 }
        L_0x002a:
            android.view.VelocityTracker r1 = r8.f316142Q     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r1.addMovement(r9)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r1 = r9.getAction()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 1
            if (r1 == 0) goto L_0x01b0
            r3 = -1
            if (r1 == r2) goto L_0x0100
            r4 = 2
            if (r1 == r4) goto L_0x0091
            r4 = 3
            if (r1 == r4) goto L_0x006c
            r3 = 5
            if (r1 == r3) goto L_0x005a
            r3 = 6
            if (r1 == r3) goto L_0x0049
            goto L_0x01d2
        L_0x0049:
            r8.m189176v(r9)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r1 = r8.f316141P     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r1 = r9.findPointerIndex(r1)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r9 = r9.getY(r1)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.f316138M = r9     // Catch:{ IllegalArgumentException -> 0x01d4 }
            goto L_0x01d2
        L_0x005a:
            int r1 = r9.getActionIndex()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r3 = r9.getY(r1)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.f316138M = r3     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r9 = r9.getPointerId(r1)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.f316141P = r9     // Catch:{ IllegalArgumentException -> 0x01d4 }
            goto L_0x01d2
        L_0x006c:
            boolean r9 = r8.f316132G     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r9 == 0) goto L_0x01d2
            int r9 = r8.f316159f     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.m189177w(r9, r2, r0, r0)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.f316141P = r3     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.m189175u()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            androidx.core.widget.j r9 = r8.f316146U     // Catch:{ IllegalArgumentException -> 0x01d4 }
            boolean r9 = r9.mo5363d()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r9 != 0) goto L_0x008e
            androidx.core.widget.j r9 = r8.f316147V     // Catch:{ IllegalArgumentException -> 0x01d4 }
            boolean r9 = r9.mo5363d()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r9 == 0) goto L_0x008b
            goto L_0x008e
        L_0x008b:
            r9 = 0
            goto L_0x01aa
        L_0x008e:
            r9 = 1
            goto L_0x01aa
        L_0x0091:
            boolean r1 = r8.f316156c     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r1 != 0) goto L_0x0096
            return r0
        L_0x0096:
            boolean r1 = r8.f316132G     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r1 != 0) goto L_0x00ec
            int r1 = r8.f316141P     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r1 = r9.findPointerIndex(r1)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r3 = r9.getY(r1)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r4 = r8.f316138M     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r1 = r9.getX(r1)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r5 = r8.f316137L     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r5 = r1 - r5
            float r5 = java.lang.Math.abs(r5)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r6 = r8.f316136K     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r6 = (float) r6     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ec
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ec
            r8.f316132G = r2     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.m189169A()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r4 = r8.f316140O     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r3 = r3 - r4
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00d5
            int r3 = r8.f316136K     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r3 = (float) r3     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r4 = r4 + r3
            goto L_0x00d9
        L_0x00d5:
            int r3 = r8.f316136K     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r3 = (float) r3     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r4 = r4 - r3
        L_0x00d9:
            r8.f316138M = r4     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.f316137L = r1     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.mo101093j(r2)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.m189178x(r2)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            android.view.ViewParent r1 = r8.getParent()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r1 == 0) goto L_0x00ec
            r1.requestDisallowInterceptTouchEvent(r2)     // Catch:{ IllegalArgumentException -> 0x01d4 }
        L_0x00ec:
            boolean r1 = r8.f316132G     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r1 == 0) goto L_0x01d2
            int r1 = r8.f316141P     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r1 = r9.findPointerIndex(r1)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r9 = r9.getY(r1)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            boolean r9 = r8.m189180z(r9)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            goto L_0x01aa
        L_0x0100:
            boolean r1 = r8.f316132G     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r1 == 0) goto L_0x01d2
            android.view.VelocityTracker r1 = r8.f316142Q     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r1.getClass()
            int r4 = r8.f316144S     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r4 = (float) r4     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r5 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r5, r4)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r4 = r8.f316141P     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r1 = r1.getYVelocity(r4)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r1 = (int) r1     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.f316165l = r2     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r4 = r8.m189171q()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r5 = r8.getScrollY()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r6 = r8.m189173s()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r6.getClass()
            int r7 = r6.f316325b     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r5 = (float) r5     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r4 = (float) r4     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r5 = r5 / r4
            float r4 = r6.f316328e     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r5 = r5 - r4
            float r4 = r6.f316327d     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r5 = r5 / r4
            int r4 = r8.f316141P     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r4 = r9.findPointerIndex(r4)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r9 = r9.getY(r4)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r4 = r8.f316140O     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r9 = r9 - r4
            int r9 = (int) r9     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r9 = java.lang.Math.abs(r9)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r4 = r8.f316166m     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r9 <= r4) goto L_0x0158
            int r9 = java.lang.Math.abs(r1)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r4 = r8.f316143R     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r9 <= r4) goto L_0x0158
            if (r1 <= 0) goto L_0x0155
            goto L_0x0167
        L_0x0155:
            int r7 = r7 + 1
            goto L_0x0167
        L_0x0158:
            int r9 = r8.f316159f     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r7 < r9) goto L_0x0160
            r9 = 1053609165(0x3ecccccd, float:0.4)
            goto L_0x0163
        L_0x0160:
            r9 = 1058642330(0x3f19999a, float:0.6)
        L_0x0163:
            float r4 = (float) r7     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r4 = r4 + r5
            float r4 = r4 + r9
            int r7 = (int) r4     // Catch:{ IllegalArgumentException -> 0x01d4 }
        L_0x0167:
            java.util.ArrayList r9 = r8.f316157d     // Catch:{ IllegalArgumentException -> 0x01d4 }
            boolean r9 = r9.isEmpty()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r9 != 0) goto L_0x0190
            java.util.ArrayList r9 = r8.f316157d     // Catch:{ IllegalArgumentException -> 0x01d4 }
            java.lang.Object r9 = r9.get(r0)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r9 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r9     // Catch:{ IllegalArgumentException -> 0x01d4 }
            java.util.ArrayList r4 = r8.f316157d     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r5 = r4.size()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r5 = r5 + r3
            java.lang.Object r4 = r4.get(r5)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bd r4 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114126bd) r4     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r9 = r9.f316325b     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r4 = r4.f316325b     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r4 = java.lang.Math.min(r7, r4)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r7 = java.lang.Math.max(r9, r4)     // Catch:{ IllegalArgumentException -> 0x01d4 }
        L_0x0190:
            r8.mo101092i(r7, r2, r2, r1)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.f316141P = r3     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.m189175u()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            androidx.core.widget.j r9 = r8.f316146U     // Catch:{ IllegalArgumentException -> 0x01d4 }
            boolean r9 = r9.mo5363d()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r9 != 0) goto L_0x008e
            androidx.core.widget.j r9 = r8.f316147V     // Catch:{ IllegalArgumentException -> 0x01d4 }
            boolean r9 = r9.mo5363d()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            if (r9 == 0) goto L_0x008b
            goto L_0x008e
        L_0x01aa:
            if (r9 == 0) goto L_0x01d2
            androidx.core.p098j.C2043bi.m5519M(r8)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            goto L_0x01d2
        L_0x01b0:
            android.widget.Scroller r1 = r8.f316127B     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r1.abortAnimation()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.f316165l = r0     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r1 = r8.f316159f     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.mo101085f(r1)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r1 = r9.getX()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.f316139N = r1     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.f316137L = r1     // Catch:{ IllegalArgumentException -> 0x01d4 }
            float r1 = r9.getY()     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.f316140O = r1     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.f316138M = r1     // Catch:{ IllegalArgumentException -> 0x01d4 }
            int r9 = r9.getPointerId(r0)     // Catch:{ IllegalArgumentException -> 0x01d4 }
            r8.f316141P = r9     // Catch:{ IllegalArgumentException -> 0x01d4 }
        L_0x01d2:
            return r2
        L_0x01d3:
            return r0
        L_0x01d4:
            r9 = move-exception
            com.google.common.f.e r1 = f316122v
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "#onTouchEvent"
            r3 = 28753(0x7051, float:4.0292E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r9)).mo56372aa(r3)).mo56386p(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.ValyrianViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void mo101109p(C4278k kVar) {
        C4278k kVar2 = this.f316150ab;
        this.f316150ab = kVar;
        setChildrenDrawingOrderEnabled(true);
        this.f316151ac = 1;
        if (kVar2 == null) {
            mo101085f(this.f316159f);
        }
    }

    public final void removeView(View view) {
        if (this.f316130E) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C114127be();
    }

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianViewPager$SavedState */
    /* compiled from: PG */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C1900m();

        /* renamed from: a */
        int f316176a;

        /* renamed from: b */
        Parcelable f316177b;

        /* renamed from: c */
        ClassLoader f316178c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f316176a = parcel.readInt();
            this.f316177b = parcel.readParcelable(classLoader);
            this.f316178c = classLoader;
        }

        public final String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            int i = this.f316176a;
            return "FragmentPager.SavedState{" + hexString + " position=" + i + "}";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f316176a);
            parcel.writeParcelable(this.f316177b, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ValyrianViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo101084e();
    }
}
