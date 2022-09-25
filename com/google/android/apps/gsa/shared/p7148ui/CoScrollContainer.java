package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7187ui.C91118q;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.ui.CoScrollContainer */
/* compiled from: PG */
public class CoScrollContainer extends FrameLayout implements C90633ai {

    /* renamed from: f */
    private static final C59071e f253337f = C59071e.m91332i("com.google.android.apps.gsa.shared.ui.CoScrollContainer");
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: a */
    public int f253338a;
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: b */
    public int f253339b;

    /* renamed from: c */
    public boolean f253340c;

    /* renamed from: d */
    boolean f253341d;

    /* renamed from: e */
    public boolean f253342e;

    /* renamed from: g */
    private final DecelerateInterpolator f253343g;

    /* renamed from: h */
    private final List f253344h;

    /* renamed from: i */
    private final Rect f253345i;

    /* renamed from: j */
    private boolean f253346j;

    /* renamed from: k */
    private int f253347k;

    /* renamed from: l */
    private boolean f253348l;

    /* renamed from: m */
    private final C90631ag f253349m;

    /* renamed from: n */
    private C90700l f253350n;

    /* renamed from: o */
    private boolean f253351o;

    /* renamed from: p */
    private int f253352p;

    /* renamed from: q */
    private View f253353q;

    /* renamed from: r */
    private int f253354r;

    /* renamed from: s */
    private int f253355s;

    /* renamed from: t */
    private final Set f253356t;

    public CoScrollContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    private final void m147883A(View view) {
        this.f253353q = view;
        this.f253354r = -1;
    }

    /* renamed from: t */
    protected static final int m147884t(int i, int i2) {
        if (i <= 0) {
            return 0;
        }
        return Math.min(i, i2);
    }

    /* renamed from: v */
    private final void m147885v() {
        int scrollY = getScrollY();
        int computeVerticalScrollRange = computeVerticalScrollRange() - getHeight();
        if (this.f253349m.f253448p != -2) {
            computeVerticalScrollRange = Math.max(scrollY, computeVerticalScrollRange);
        }
        int size = this.f253344h.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C90632ah) this.f253344h.get(size)).mo81847b(scrollY, computeVerticalScrollRange);
            } else {
                return;
            }
        }
    }

    /* renamed from: w */
    private final void m147886w(C90700l lVar, int i, int i2) {
        int translationY = (int) lVar.f253713b.getTranslationY();
        long j = 0;
        if (i != translationY) {
            if (translationY < 0) {
                if (this.f253346j) {
                    translationY = getScrollY() + getHeight();
                    lVar.f253713b.setTranslationY((float) translationY);
                } else {
                    m147887x(lVar, i);
                    return;
                }
            }
            if (lVar.f253721j == 0 || lVar.f253722k != ((long) i)) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (Math.abs(translationY - i) > Math.abs(i2)) {
                    long j2 = lVar.f253721j;
                    if (j2 <= 0 || i2 == 0) {
                        j = 166;
                        lVar.f253721j = uptimeMillis + 166;
                    } else {
                        j = j2 - uptimeMillis;
                    }
                }
                if (j > 16) {
                    lVar.f253713b.animate().translationY((float) i).setInterpolator(this.f253343g).setDuration(j).withEndAction(lVar.f253723l);
                    lVar.f253722k = (long) i;
                    return;
                }
                m147887x(lVar, i);
                return;
            }
            return;
        }
        lVar.f253713b.animate().cancel();
        lVar.f253721j = 0;
    }

    /* renamed from: x */
    private static void m147887x(C90700l lVar, int i) {
        lVar.f253713b.animate().cancel();
        lVar.f253721j = 0;
        lVar.f253713b.setTranslationY((float) i);
    }

    /* renamed from: y */
    private final boolean m147888y(int i) {
        View findFocus;
        int i2 = 33;
        if (i == 61) {
            if (!this.f253356t.contains(61) || (!this.f253356t.contains(59) && !this.f253356t.contains(60))) {
                i2 = 130;
            }
            if (m147889z(i2) && (findFocus = findFocus()) != null) {
                View findFocus2 = findFocus.findFocus();
                View focusSearch = findFocus2 != null ? findFocus2.focusSearch(i2) : null;
                if (focusSearch == null) {
                    focusSearch = findFocus.focusSearch(i2);
                }
                if (focusSearch != null) {
                    if (isLayoutRequested()) {
                        m147883A(focusSearch);
                    } else {
                        int c = mo84787c(focusSearch);
                        if (c >= 0) {
                            this.f253349m.mo84896m(c, -1);
                        }
                    }
                }
            }
            return false;
        }
        if (i == 20) {
            if (m147889z(130)) {
                return this.f253349m.mo84895l(true);
            }
        } else if (i == 19 && m147889z(33)) {
            return this.f253349m.mo84895l(false);
        }
        return false;
    }

    /* renamed from: z */
    private final boolean m147889z(int i) {
        View findFocus = findFocus();
        if (findFocus == null) {
            return true;
        }
        int scrollY = getScrollY();
        int height = getHeight();
        this.f253345i.set(0, 0, findFocus.getWidth(), findFocus.getHeight());
        offsetDescendantRectToMyCoords(findFocus, this.f253345i);
        if (i == 130 && this.f253345i.top < (height / 2) + scrollY && this.f253345i.bottom > scrollY) {
            return false;
        }
        if (i == 33 && this.f253345i.bottom > (height / 2) + scrollY && this.f253345i.top < scrollY + height) {
            return false;
        }
        View focusSearch = findFocus.focusSearch(i);
        if (focusSearch == null) {
            return true;
        }
        this.f253345i.set(0, 0, focusSearch.getWidth(), focusSearch.getHeight());
        try {
            offsetDescendantRectToMyCoords(focusSearch, this.f253345i);
            if (i == 33 && this.f253345i.bottom > (height / 2) + scrollY) {
                if (this.f253345i.top < scrollY + height) {
                    return false;
                }
            }
            if (i != 130 || this.f253345i.bottom <= (height / 2) + scrollY || this.f253345i.top >= scrollY + height) {
                return true;
            }
            return false;
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: a */
    public final int mo84784a(C90700l lVar, int i) {
        int scrollY = getScrollY();
        int i2 = 0;
        if ((lVar.f253714c == 5 || scrollY < lVar.f253720i) && !this.f253348l) {
            return 0;
        }
        int i3 = lVar.f253720i + i;
        if (i != 0) {
            i2 = i3;
        }
        m147887x(lVar, i3);
        this.f253348l = true;
        super.scrollTo(getScrollX(), i2);
        return i;
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        ((C90700l) view.getLayoutParams()).mo85032c(view);
    }

    /* renamed from: b */
    public final int mo84786b(C90700l lVar, int i) {
        C90700l lVar2 = this.f253350n;
        if (!(lVar2 == null || lVar2 == lVar)) {
            ((C59052c) ((C59052c) f253337f.mo56226d()).mo56372aa(11184)).mo56386p("Multiple children causing a scroll?");
            this.f253350n.f253724m = 0;
        }
        int scrollY = lVar.f253713b.getScrollY();
        this.f253350n = lVar;
        this.f253340c = true;
        if (this.f253352p != -1) {
            i -= lVar.f253724m;
        } else if (i < 0 && lVar.f253713b.getScrollY() + i <= 1) {
            i = -getScrollY();
        }
        int min = Math.min(Math.max(0, getScrollY() + i), computeVerticalScrollRange() - getHeight());
        super.scrollTo(getScrollX(), min);
        int i2 = lVar.f253720i;
        int i3 = min - i2;
        int a = lVar.mo85030a();
        m147887x(lVar, mo84794e(i2, i3, a));
        int t = m147884t(i3, a) - scrollY;
        lVar.f253724m = t - i;
        return t;
    }

    /* renamed from: c */
    public final int mo84787c(View view) {
        this.f253345i.setEmpty();
        try {
            offsetDescendantRectToMyCoords(view, this.f253345i);
            ViewParent viewParent = view.getParent();
            while (viewParent != this) {
                if (viewParent instanceof View) {
                    view = (View) viewParent;
                    viewParent = view.getParent();
                } else {
                    throw new IllegalArgumentException("Descendant isn't our descendant?");
                }
            }
            C90700l lVar = (C90700l) view.getLayoutParams();
            if (lVar.f253714c == 5) {
                return -1;
            }
            int i = this.f253345i.top;
            if (lVar.f253718g) {
                i += view.getScrollY();
            }
            return i + lVar.f253720i;
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C90700l)) {
            return false;
        }
        C90700l lVar = (C90700l) layoutParams;
        CoScrollContainer coScrollContainer = lVar.f253712a;
        if (coScrollContainer == null) {
            lVar.f253712a = this;
            return true;
        } else if (coScrollContainer == this) {
            return true;
        } else {
            return false;
        }
    }

    public final void computeScroll() {
        C90631ag agVar = this.f253349m;
        if (agVar.mo84894k()) {
            boolean computeScrollOffset = agVar.f253436d.computeScrollOffset();
            int currY = agVar.f253436d.getCurrY();
            if (computeScrollOffset) {
                boolean z = agVar.f253452t;
                agVar.f253435c.setScrollY(currY);
                agVar.f253435c.postInvalidateOnAnimation();
                return;
            }
            boolean z2 = agVar.f253452t;
            agVar.f253448p = -1;
            agVar.f253434b.mo84804k();
        }
    }

    public final int computeVerticalScrollRange() {
        int measuredHeight = getMeasuredHeight();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C90700l lVar = (C90700l) childAt.getLayoutParams();
                if (!lVar.f253718g) {
                    measuredHeight = Math.max(measuredHeight, childAt.getMeasuredHeight());
                } else if (lVar.f253714c != 5) {
                    measuredHeight = Math.max(measuredHeight, lVar.f253720i + Math.max(0, lVar.f253719h.mo84903a() - lVar.f253717f));
                }
            }
        }
        return this.f253341d ? Math.max(0, measuredHeight) : measuredHeight;
    }

    /* renamed from: d */
    public final int mo84791d() {
        return computeVerticalScrollRange() - getHeight();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View focusedChild = getFocusedChild();
        boolean z = focusedChild != null && ((C90700l) focusedChild.getLayoutParams()).f253718g;
        int keyCode = keyEvent.getKeyCode();
        this.f253348l = z && (keyCode == 61 || keyCode == 19 || keyCode == 20 || keyCode == 21 || keyCode == 22 || keyCode == 61);
        if (super.dispatchKeyEvent(keyEvent)) {
            if (z) {
                C90700l lVar = (C90700l) focusedChild.getLayoutParams();
                if (lVar.f253718g && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 20 && focusedChild.getScrollY() >= lVar.mo85030a()) {
                    scrollTo(getScrollX(), computeVerticalScrollRange() - getHeight());
                }
            }
            return true;
        }
        if (keyEvent.getAction() == 1) {
            this.f253356t.remove(Integer.valueOf(keyEvent.getKeyCode()));
        }
        if (keyEvent.getAction() == 0) {
            this.f253356t.add(Integer.valueOf(keyEvent.getKeyCode()));
        }
        return !z && keyEvent.getAction() == 0 && m147888y(keyEvent.getKeyCode());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r4.mo84894k() == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r0 != 3) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x005f
            r3 = -1
            r4 = 1
            if (r0 == r4) goto L_0x0023
            r5 = 2
            if (r0 == r5) goto L_0x0013
            r4 = 3
            if (r0 == r4) goto L_0x0050
            goto L_0x0067
        L_0x0013:
            boolean r0 = r6.f253351o
            if (r0 == 0) goto L_0x0067
            com.google.android.apps.gsa.shared.ui.ag r0 = r6.f253349m
            boolean r1 = r0.f253451s
            if (r1 == 0) goto L_0x0067
            r0.f253449q = r4
            r0.mo84889f(r7)
            goto L_0x0067
        L_0x0023:
            boolean r0 = r6.f253351o
            if (r0 == 0) goto L_0x0050
            boolean r0 = r6.f253340c
            if (r0 == 0) goto L_0x0050
            int r0 = r6.f253352p
            if (r0 == r3) goto L_0x0050
            com.google.android.apps.gsa.shared.ui.ag r4 = r6.f253349m
            boolean r5 = r4.f253451s
            if (r5 == 0) goto L_0x004d
            boolean r5 = r4.f253449q
            if (r5 == 0) goto L_0x004d
            r4.f253449q = r2
            r4.mo84888e(r0)
            android.view.VelocityTracker r0 = r4.f253446n
            if (r0 == 0) goto L_0x0047
            r0.recycle()
            r4.f253446n = r1
        L_0x0047:
            boolean r0 = r4.mo84894k()
            if (r0 != 0) goto L_0x0050
        L_0x004d:
            r6.mo84805l()
        L_0x0050:
            r6.f253351o = r2
            r6.f253340c = r2
            com.google.android.apps.gsa.shared.ui.l r0 = r6.f253350n
            if (r0 == 0) goto L_0x005c
            r0.f253724m = r2
            r6.f253350n = r1
        L_0x005c:
            r6.f253352p = r3
            goto L_0x0067
        L_0x005f:
            int r0 = r7.getPointerId(r2)
            r6.f253352p = r0
            r6.f253350n = r1
        L_0x0067:
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7148ui.CoScrollContainer.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo84794e(int i, int i2, int i3) {
        if (i2 <= 0) {
            return i;
        }
        return i2 < i3 ? getScrollY() : i + i3;
    }

    /* renamed from: f */
    public final C90700l generateLayoutParams(AttributeSet attributeSet) {
        return new C90700l(getContext(), this, attributeSet);
    }

    /* renamed from: g */
    public final void mo84796g() {
        int size = this.f253344h.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C90632ah) this.f253344h.get(size)).mo84900l();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f253355s;
        if (i2 == i3) {
            return 0;
        }
        return i2 < i3 ? i2 + 1 : i2;
    }

    /* renamed from: h */
    public final void mo84801h(int i) {
        int size = this.f253344h.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C90632ah) this.f253344h.get(size)).mo84897d(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public final void mo84802i() {
        int size = this.f253344h.size();
        while (true) {
            size--;
            if (size >= 0) {
                C90632ah ahVar = (C90632ah) this.f253344h.get(size);
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    public final void mo84803j() {
        int size = this.f253344h.size();
        while (true) {
            size--;
            if (size >= 0) {
                C90632ah ahVar = (C90632ah) this.f253344h.get(size);
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public final void mo84804k() {
        int size = this.f253344h.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C90632ah) this.f253344h.get(size)).mo84898f();
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    public final void mo84805l() {
        int size = this.f253344h.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C90632ah) this.f253344h.get(size)).mo84899g();
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    public final void mo84806m(C90700l lVar) {
        int i;
        if (lVar.f253714c != 1) {
            i = 0;
        } else {
            i = this.f253338a;
        }
        lVar.f253720i = i - lVar.f253716e;
    }

    /* renamed from: n */
    public final void mo84807n(boolean z) {
        this.f253341d = z;
        this.f253342e = !z;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C90631ag agVar = this.f253349m;
        if (agVar.f253444l && !agVar.f253445m.isFinished()) {
            int save = canvas.save();
            int scrollY = agVar.f253435c.getScrollY();
            int width = agVar.f253435c.getWidth();
            int height = agVar.f253435c.getHeight();
            if (agVar.f253443k) {
                canvas.rotate(180.0f);
                canvas.translate((float) (-width), (float) ((-scrollY) - height));
                agVar.f253445m.setSize(width, agVar.f253437e);
            } else {
                canvas.translate(0.0f, (float) scrollY);
                agVar.f253445m.setSize(width, agVar.f253437e);
            }
            if (agVar.f253445m.draw(canvas)) {
                agVar.f253435c.postInvalidateOnAnimation();
            } else {
                agVar.f253444l = false;
            }
            canvas.restoreToCount(save);
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        C90631ag agVar = this.f253349m;
        if (!agVar.f253451s || (motionEvent.getSource() & 8194) == 0 || (motionEvent.getActionMasked() & 8) == 0) {
            return super.onGenericMotionEvent(motionEvent);
        }
        float axisValue = motionEvent.getAxisValue(9);
        int i = agVar.f253439g;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (agVar.f253433a.getTheme().resolveAttribute(16842829, typedValue, true)) {
                i = (int) typedValue.getDimension(agVar.f253433a.getResources().getDisplayMetrics());
                agVar.f253439g = i;
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        int a = agVar.mo84884a((int) (axisValue * ((float) (-i))));
        if (a != 0) {
            C90633ai aiVar = agVar.f253434b;
            aiVar.setScrollY(aiVar.getScrollY() + a);
        }
        return true;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ScrollView.class.getCanonicalName());
        int computeVerticalScrollRange = computeVerticalScrollRange() - getHeight();
        accessibilityEvent.setScrollable(computeVerticalScrollRange > 0 && isEnabled() && this.f253349m.f253451s);
        accessibilityEvent.setScrollX(0);
        accessibilityEvent.setScrollY(getScrollY());
        accessibilityEvent.setMaxScrollX(0);
        accessibilityEvent.setMaxScrollY(computeVerticalScrollRange);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ScrollView.class.getCanonicalName());
        if (isEnabled() && this.f253349m.f253451s && computeVerticalScrollRange() - getHeight() > 0) {
            accessibilityNodeInfo.setScrollable(true);
            if (this.f253349m.mo84892i(false)) {
                accessibilityNodeInfo.addAction(8192);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            }
            if (this.f253349m.mo84892i(true)) {
                accessibilityNodeInfo.addAction(4096);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m147888y(i)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f253342e) {
            boolean z3 = true;
            mo84821q(true, 0);
            View view = this.f253353q;
            if (view != null) {
                if (view == this) {
                    z2 = this.f253349m.mo84896m(0, -1);
                } else {
                    int c = mo84787c(view);
                    z2 = c >= 0 ? this.f253349m.mo84896m(c, this.f253354r) : false;
                }
                this.f253353q = null;
                if (!z2) {
                    mo84804k();
                }
            }
            C90631ag agVar = this.f253349m;
            int scrollY = agVar.f253434b.getScrollY();
            int d = agVar.f253434b.mo84791d();
            int i5 = agVar.f253448p;
            if (i5 == -2 ? agVar.f253436d.getFinalY() <= d : i5 == -1 ? scrollY <= d : i5 <= d) {
                z3 = false;
            }
            if (z3) {
                if (agVar.mo84894k()) {
                    agVar.f253436d.abortAnimation();
                    agVar.f253448p = -1;
                }
                agVar.mo84896m(d, -1);
            }
            m147885v();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        boolean z = true;
        C58838bb.m90883r(View.MeasureSpec.getMode(i) == 1073741824);
        int mode = View.MeasureSpec.getMode(i2);
        C58838bb.m90883r(mode == 1073741824 || mode == Integer.MIN_VALUE);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f253355s = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt == null) {
                this.f253355s = i4;
            }
            if (((C90700l) childAt.getLayoutParams()).f253718g) {
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, 0, childAt.getLayoutParams().width), makeMeasureSpec);
            }
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i3) {
                i3 = measuredHeight;
            }
        }
        if (mode == Integer.MIN_VALUE && i3 < size2) {
            size2 = i3;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt2 = getChildAt(i5);
            if (((C90700l) childAt2.getLayoutParams()).f253715d && childAt2.getMeasuredHeight() < size2) {
                childAt2.measure(i, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
        }
        if (this.f253355s == -1) {
            z = false;
        }
        setChildrenDrawingOrderEnabled(z);
        setMeasuredDimension(size, size2);
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m147885v();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C90631ag agVar = this.f253349m;
        if (!agVar.f253451s) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = agVar.f253442j;
        int actionMasked = motionEvent.getActionMasked();
        agVar.mo84889f(motionEvent);
        if (actionMasked == 0) {
            agVar.mo84887d(motionEvent);
        } else if (actionMasked != 1) {
            boolean z2 = false;
            if (actionMasked == 2) {
                boolean z3 = agVar.f253453u;
                agVar.mo84890g(motionEvent);
                if (!agVar.f253447o) {
                    boolean j = agVar.mo84893j();
                    agVar.f253447o = j;
                    if (j) {
                        agVar.f253434b.mo84796g();
                        agVar.mo84886c();
                    }
                }
                if (agVar.f253447o) {
                    if (agVar.f253442j) {
                        int i = agVar.f253438f;
                        if (i != 0) {
                            if ((i > 0) == agVar.f253443k) {
                                agVar.f253440h = 0;
                            }
                        }
                        if (agVar.mo84893j()) {
                            if (agVar.mo84892i(agVar.f253440h > 0)) {
                                agVar.f253442j = false;
                                agVar.f253441i = 0;
                                agVar.f253438f = agVar.f253440h;
                            }
                        }
                        int i2 = agVar.f253441i;
                        if ((i2 > 0) != agVar.f253443k) {
                            agVar.f253442j = false;
                            agVar.f253438f = i2;
                            agVar.f253440h = i2;
                        }
                    }
                    if (!agVar.f253442j) {
                        int a = agVar.mo84884a(agVar.f253438f);
                        int i3 = agVar.f253438f - a;
                        agVar.f253440h = i3;
                        if ((agVar.f253447o && i3 != 0) || agVar.mo84893j()) {
                            agVar.f253442j = true;
                            int i4 = agVar.f253440h;
                            agVar.f253438f = i4;
                            agVar.f253441i = i4;
                            if (i4 > 0) {
                                z2 = true;
                            }
                            agVar.f253443k = z2;
                        }
                        z2 = a;
                    }
                    if (z2) {
                        C90633ai aiVar = agVar.f253434b;
                        aiVar.setScrollY(aiVar.getScrollY() + (z2 ? 1 : 0));
                    }
                    agVar.mo84891h();
                }
            } else if (actionMasked == 3) {
                agVar.mo84885b(false);
            }
        } else {
            agVar.mo84885b(true);
        }
        if (z) {
            if (!agVar.f253442j) {
                agVar.f253434b.mo84802i();
                return true;
            }
        } else if (agVar.f253442j) {
            agVar.f253434b.mo84803j();
            return true;
        }
        if (agVar.f253442j) {
            agVar.f253434b.mo84801h(agVar.f253441i);
        }
        return true;
    }

    /* renamed from: p */
    public final void mo84819p(C90700l lVar, int i) {
        int height;
        int i2 = lVar.f253714c;
        if (i2 == 0) {
            m147886w(lVar, lVar.f253713b.getTop(), i);
        } else if (i2 == 1) {
            int i3 = lVar.f253720i;
            int scrollY = getScrollY() - i3;
            if (lVar.f253718g) {
                C91118q qVar = lVar.f253719h;
                int a = lVar.mo85030a();
                qVar.mo84904b(m147884t(scrollY, a));
                m147886w(lVar, mo84794e(i3, scrollY, a), i);
                return;
            }
            m147886w(lVar, lVar.f253720i, i);
        } else if (i2 == 5 && (height = getHeight()) > 0) {
            m147887x(lVar, -height);
            if (lVar.f253718g) {
                lVar.f253719h.mo84904b(0);
            }
        }
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (isEnabled()) {
            C90631ag agVar = this.f253349m;
            if (agVar.f253451s) {
                if (i != 4096) {
                    if (i == 8192 && agVar.mo84892i(false)) {
                        this.f253349m.mo84895l(false);
                        return true;
                    }
                } else if (agVar.mo84892i(true)) {
                    this.f253349m.mo84895l(true);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: q */
    public final void mo84821q(boolean z, int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C90700l lVar = (C90700l) getChildAt(i2).getLayoutParams();
            if (lVar.f253714c != 0) {
                if (z) {
                    mo84806m(lVar);
                }
                mo84819p(lVar, i);
            }
        }
    }

    /* renamed from: r */
    public final void mo84822r(C90632ah ahVar) {
        if (!this.f253344h.contains(ahVar)) {
            this.f253344h.add(ahVar);
        }
    }

    public final void removeView(View view) {
        C90700l lVar = (C90700l) view.getLayoutParams();
        C58838bb.m90883r(lVar.f253712a == this);
        super.removeView(view);
        lVar.f253712a = null;
        lVar.mo85032c((View) null);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.f253351o = z;
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* renamed from: s */
    public final void mo84825s(C90632ah ahVar) {
        this.f253344h.remove(ahVar);
    }

    public final void scrollTo(int i, int i2) {
        int scrollY = getScrollY();
        super.scrollTo(i, i2);
        mo84821q(false, i2 - scrollY);
    }

    /* renamed from: u */
    public final void mo84827u() {
        if (isLayoutRequested()) {
            m147883A(this);
        } else {
            this.f253349m.mo84896m(0, -1);
        }
    }

    public CoScrollContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoScrollContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f253343g = new DecelerateInterpolator(2.5f);
        this.f253344h = new ArrayList();
        this.f253345i = new Rect();
        this.f253352p = -1;
        this.f253355s = -1;
        this.f253342e = true;
        this.f253356t = new HashSet();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C90629ae.f253425c);
            this.f253346j = obtainStyledAttributes.getBoolean(1, true);
            this.f253347k = obtainStyledAttributes.getInt(0, 30);
            obtainStyledAttributes.recycle();
        } else {
            this.f253346j = true;
            this.f253347k = 30;
        }
        setFocusable(true);
        setDescendantFocusability(C89885b.HTTP_VALUE);
        this.f253349m = new C90631ag(getContext(), this, this, this.f253347k);
        setWillNotDraw(false);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C90700l(this, layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            com.google.android.apps.gsa.shared.ui.ag r0 = r4.f253349m
            boolean r1 = r0.f253451s
            if (r1 != 0) goto L_0x0007
            goto L_0x004a
        L_0x0007:
            int r1 = r5.getActionMasked()
            r2 = 3
            if (r1 == r2) goto L_0x0046
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0046
        L_0x0012:
            boolean r3 = r0.f253453u
            if (r1 == 0) goto L_0x0039
            boolean r3 = r0.f253447o
            if (r3 == 0) goto L_0x001b
            goto L_0x004e
        L_0x001b:
            if (r1 == 0) goto L_0x0039
            r3 = 2
            if (r1 == r3) goto L_0x0021
            goto L_0x003f
        L_0x0021:
            r0.mo84890g(r5)
            boolean r1 = r0.f253447o
            if (r1 != 0) goto L_0x003f
            boolean r1 = r0.mo84893j()
            r0.f253447o = r1
            if (r1 == 0) goto L_0x003f
            com.google.android.apps.gsa.shared.ui.ai r1 = r0.f253434b
            r1.mo84796g()
            r0.mo84886c()
            goto L_0x003c
        L_0x0039:
            r0.mo84887d(r5)
        L_0x003c:
            r0.mo84889f(r5)
        L_0x003f:
            boolean r1 = r0.f253447o
            if (r1 != 0) goto L_0x004e
            boolean r0 = r0.f253452t
            goto L_0x004a
        L_0x0046:
            r1 = 0
            r0.mo84885b(r1)
        L_0x004a:
            boolean r2 = super.onInterceptTouchEvent(r5)
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7148ui.CoScrollContainer.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: o */
    public final void mo84808o(boolean z) {
        C90631ag agVar = this.f253349m;
        if (agVar.f253451s != z) {
            agVar.f253451s = z;
            if (!z) {
                VelocityTracker velocityTracker = agVar.f253446n;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    agVar.f253446n = null;
                }
                agVar.f253449q = false;
                agVar.f253447o = false;
                agVar.f253450r = -1;
                if (!agVar.mo84894k()) {
                    agVar.f253434b.mo84805l();
                }
                if (agVar.f253442j) {
                    agVar.f253442j = false;
                    agVar.mo84891h();
                    agVar.f253434b.mo84802i();
                }
            }
        }
        sendAccessibilityEvent(4096);
    }
}
