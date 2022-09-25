package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.C1767a;
import androidx.core.p097i.C1971f;
import androidx.core.p097i.C1973h;
import androidx.core.p098j.C2007aa;
import androidx.core.p098j.C2008ab;
import androidx.core.p098j.C2009ac;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;
import androidx.core.p098j.C2101p;
import androidx.customview.view.AbsSavedState;
import com.evernote.android.state.C6012R;
import com.google.android.googlequicksearchbox.R;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class CoordinatorLayout extends ViewGroup implements C2007aa, C2008ab {

    /* renamed from: a */
    static final String f5497a;

    /* renamed from: b */
    static final Class[] f5498b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    static final ThreadLocal f5499c = new ThreadLocal();

    /* renamed from: d */
    static final Comparator f5500d = new C1776i();

    /* renamed from: i */
    private static final C1971f f5501i = new C1973h(12);

    /* renamed from: e */
    public final C1777j f5502e;

    /* renamed from: f */
    public C2082cp f5503f;

    /* renamed from: g */
    public boolean f5504g;

    /* renamed from: h */
    ViewGroup.OnHierarchyChangeListener f5505h;

    /* renamed from: j */
    private final List f5506j;

    /* renamed from: k */
    private final List f5507k;

    /* renamed from: l */
    private final int[] f5508l;

    /* renamed from: m */
    private final int[] f5509m;

    /* renamed from: n */
    private boolean f5510n;

    /* renamed from: o */
    private boolean f5511o;

    /* renamed from: p */
    private int[] f5512p;

    /* renamed from: q */
    private View f5513q;

    /* renamed from: r */
    private View f5514r;

    /* renamed from: s */
    private C1774g f5515s;

    /* renamed from: t */
    private boolean f5516t;

    /* renamed from: u */
    private Drawable f5517u;

    /* renamed from: v */
    private C2010ad f5518v;

    /* renamed from: w */
    private final C2009ac f5519w;

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f5497a = packageR != null ? packageR.getName() : null;
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    private final boolean m4835A(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f5507k;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator comparator = f5500d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            C1773f fVar = (C1773f) view.getLayoutParams();
            C1770c cVar = fVar.f5523a;
            if (!z || actionMasked == 0) {
                if (!z && cVar != null && (z = m4852z(cVar, view, motionEvent, i))) {
                    this.f5513q = view;
                    if (!(actionMasked == 3 || actionMasked == 1)) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            View view2 = (View) list.get(i4);
                            C1770c cVar2 = ((C1773f) view2.getLayoutParams()).f5523a;
                            if (cVar2 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = m4837C(motionEvent);
                                }
                                m4852z(cVar2, view2, motionEvent2, i);
                            }
                        }
                    }
                }
                if (fVar.f5523a == null) {
                    fVar.f5535m = false;
                }
                boolean z2 = fVar.f5535m;
            } else if (cVar != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = m4837C(motionEvent);
                }
                m4852z(cVar, view, motionEvent2, i);
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z;
    }

    /* renamed from: B */
    private static final void m4836B(int i, Rect rect, Rect rect2, C1773f fVar, int i2, int i3) {
        int i4;
        int i5;
        int i6 = fVar.f5525c;
        if (i6 == 0) {
            i6 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(m4845r(fVar.f5526d), i);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 112;
        int i10 = absoluteGravity2 & 7;
        if (i10 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i10 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = (rect.height() / 2) + rect.top;
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i7 == 1) {
            i4 -= i2 / 2;
        } else if (i7 != 5) {
            i4 -= i2;
        }
        if (i8 == 16) {
            i5 -= i3 / 2;
        } else if (i8 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* renamed from: C */
    private static final MotionEvent m4837C(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    /* renamed from: D */
    private static final void m4838D(View view, int i) {
        C1773f fVar = (C1773f) view.getLayoutParams();
        int i2 = fVar.f5531i;
        if (i2 != i) {
            C2043bi.m5516J(view, i - i2);
            fVar.f5531i = i;
        }
    }

    /* renamed from: E */
    private static final void m4839E(View view, int i) {
        C1773f fVar = (C1773f) view.getLayoutParams();
        int i2 = fVar.f5532j;
        if (i2 != i) {
            C2043bi.m5517K(view, i - i2);
            fVar.f5532j = i;
        }
    }

    /* renamed from: a */
    static C1770c m4840a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = String.valueOf(context.getPackageName()).concat(String.valueOf(str));
        } else if (str.indexOf(46) < 0) {
            String str2 = f5497a;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f5499c;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f5498b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C1770c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(str)), e);
        }
    }

    /* renamed from: m */
    protected static C1773f m4841m() {
        return new C1773f(-2, -2);
    }

    /* renamed from: n */
    protected static C1773f m4842n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1773f) {
            return new C1773f((C1773f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1773f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1773f(layoutParams);
    }

    /* renamed from: o */
    static final C1773f m4843o(View view) {
        C1773f fVar = (C1773f) view.getLayoutParams();
        if (!fVar.f5524b) {
            if (view instanceof C1769b) {
                C1770c a = ((C1769b) view).mo4952a();
                if (a == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.mo4974a(a);
                fVar.f5524b = true;
            } else {
                C1771d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C1771d) cls.getAnnotation(C1771d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.mo4974a((C1770c) dVar.mo4971a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.mo4971a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                fVar.f5524b = true;
            }
        }
        return fVar;
    }

    /* renamed from: q */
    private final int mo77372q(int i) {
        int[] iArr = this.f5512p;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    /* renamed from: r */
    private static int m4845r(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: s */
    private static int m4846s(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: u */
    private static Rect m4847u() {
        Rect rect = (Rect) f5501i.mo5126a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: v */
    private final void m4848v(C1773f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: w */
    private static void m4849w(Rect rect) {
        rect.setEmpty();
        f5501i.mo5127b(rect);
    }

    /* renamed from: x */
    private final void m4850x() {
        View view = this.f5513q;
        if (view != null) {
            C1770c cVar = ((C1773f) view.getLayoutParams()).f5523a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                cVar.mo4963k(this, this.f5513q, obtain);
                obtain.recycle();
            }
            this.f5513q = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((C1773f) getChildAt(i).getLayoutParams()).f5535m = false;
        }
        this.f5510n = false;
    }

    /* renamed from: y */
    private final void m4851y() {
        if (C2043bi.m5564ar(this)) {
            if (this.f5518v == null) {
                this.f5518v = new C1768a(this);
            }
            C2043bi.m5555ai(this, this.f5518v);
            setSystemUiVisibility(1280);
            return;
        }
        C2043bi.m5555ai(this, (C2010ad) null);
    }

    /* renamed from: z */
    private final boolean m4852z(C1770c cVar, View view, MotionEvent motionEvent, int i) {
        if (i != 0) {
            return cVar.mo4963k(this, view, motionEvent);
        }
        return cVar.mo4958f(this, view, motionEvent);
    }

    /* renamed from: b */
    public final List mo4914b(View view) {
        C1777j jVar = this.f5502e;
        int i = jVar.f5542b.f3122d;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) jVar.f5542b.mo3708h(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(jVar.f5542b.mo3702e(i2));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* renamed from: c */
    public final void mo4915c(View view) {
        ArrayList a = this.f5502e.mo4982a(view);
        if (a != null && !a.isEmpty()) {
            for (int i = 0; i < a.size(); i++) {
                View view2 = (View) a.get(i);
                C1770c cVar = ((C1773f) view2.getLayoutParams()).f5523a;
                if (cVar != null) {
                    cVar.mo4957e(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1773f) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final void mo1848d(View view, int i, int i2, int[] iArr, int i3) {
        C1770c cVar;
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i3;
            } else {
                C1773f fVar = (C1773f) childAt.getLayoutParams();
                if (fVar.mo4976c(i3) && (cVar = fVar.f5523a) != null) {
                    int[] iArr2 = this.f5508l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.mo4967o(this, childAt, view, i2, iArr2, i3);
                    if (i > 0) {
                        i4 = Math.max(i6, this.f5508l[0]);
                    } else {
                        i4 = Math.min(i6, this.f5508l[0]);
                    }
                    i6 = i4;
                    if (i2 > 0) {
                        i5 = Math.max(i7, this.f5508l[1]);
                    } else {
                        i5 = Math.min(i7, this.f5508l[1]);
                    }
                    i7 = i5;
                    z = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo4926j(1);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C1770c cVar = ((C1773f) view.getLayoutParams()).f5523a;
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f5517u;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void mo1850e(View view, int i, int i2, int i3, int i4, int i5) {
        mo1851f(view, i, i2, i3, i4, 0, this.f5509m);
    }

    /* renamed from: f */
    public final void mo1851f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C1770c cVar;
        int i6;
        int i7;
        int childCount = getChildCount();
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                int i11 = i5;
            } else {
                C1773f fVar = (C1773f) childAt.getLayoutParams();
                if (fVar.mo4976c(i5) && (cVar = fVar.f5523a) != null) {
                    int[] iArr2 = this.f5508l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.mo4968p(this, childAt, i2, i3, i4, iArr2);
                    if (i3 > 0) {
                        i6 = Math.max(i8, this.f5508l[0]);
                    } else {
                        i6 = Math.min(i8, this.f5508l[0]);
                    }
                    i8 = i6;
                    if (i4 > 0) {
                        i7 = Math.max(i9, this.f5508l[1]);
                    } else {
                        i7 = Math.min(i9, this.f5508l[1]);
                    }
                    i9 = i7;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z) {
            mo4926j(1);
        }
    }

    /* renamed from: g */
    public final void mo1852g(View view, View view2, int i, int i2) {
        this.f5519w.mo5172a(i, i2);
        this.f5514r = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C1773f fVar = (C1773f) getChildAt(i3).getLayoutParams();
            if (fVar.mo4976c(i2)) {
                C1770c cVar = fVar.f5523a;
            }
        }
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m4841m();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1773f(getContext(), attributeSet);
    }

    public final int getNestedScrollAxes() {
        C2009ac acVar = this.f5519w;
        return acVar.f5928b | acVar.f5927a;
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: h */
    public final void mo1857h(View view, int i) {
        this.f5519w.mo5173b(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C1773f fVar = (C1773f) childAt.getLayoutParams();
            if (fVar.mo4976c(i)) {
                C1770c cVar = fVar.f5523a;
                if (cVar != null) {
                    cVar.mo4956d(this, childAt, view, i);
                }
                fVar.mo4975b(i, false);
                fVar.f5537o = false;
            }
        }
        this.f5514r = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo4925i(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            C1778k.m4893a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo4926j(int i) {
        int i2;
        Rect rect;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int height;
        int i5;
        C1773f fVar;
        int i6;
        Rect rect2;
        int i7;
        int i8;
        boolean z4;
        int i9;
        C1773f fVar2;
        C1770c cVar;
        int i10 = i;
        int f = C2043bi.m5577f(this);
        int size = this.f5506j.size();
        Rect u = m4847u();
        Rect u2 = m4847u();
        Rect u3 = m4847u();
        int i11 = 0;
        while (i11 < size) {
            View view = (View) this.f5506j.get(i11);
            C1773f fVar3 = (C1773f) view.getLayoutParams();
            if (i10 == 0 && view.getVisibility() == 8) {
                i3 = size;
                rect = u3;
                i2 = i11;
            } else {
                int i12 = 0;
                while (i12 < i11) {
                    if (fVar3.f5534l == ((View) this.f5506j.get(i12))) {
                        C1773f fVar4 = (C1773f) view.getLayoutParams();
                        if (fVar4.f5533k != null) {
                            Rect u4 = m4847u();
                            Rect u5 = m4847u();
                            Rect u6 = m4847u();
                            C1778k.m4893a(this, fVar4.f5533k, u4);
                            mo4925i(view, false, u5);
                            int measuredWidth = view.getMeasuredWidth();
                            i8 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            i7 = i11;
                            Rect rect3 = u5;
                            Rect rect4 = u4;
                            C1773f fVar5 = fVar4;
                            int i13 = measuredWidth;
                            rect2 = u3;
                            i6 = i12;
                            fVar = fVar3;
                            m4836B(f, u4, u6, fVar5, i13, measuredHeight);
                            if (u6.left == rect3.left && u6.top == rect3.top) {
                                i9 = i13;
                                fVar2 = fVar5;
                                z4 = false;
                            } else {
                                i9 = i13;
                                fVar2 = fVar5;
                                z4 = true;
                            }
                            m4848v(fVar2, u6, i9, measuredHeight);
                            int i14 = u6.left - rect3.left;
                            int i15 = u6.top - rect3.top;
                            if (i14 != 0) {
                                C2043bi.m5516J(view, i14);
                            }
                            if (i15 != 0) {
                                C2043bi.m5517K(view, i15);
                            }
                            if (z4 && (cVar = fVar2.f5523a) != null) {
                                cVar.mo4957e(this, view, fVar2.f5533k);
                            }
                            m4849w(rect4);
                            m4849w(rect3);
                            m4849w(u6);
                            i12 = i6 + 1;
                            size = i8;
                            i11 = i7;
                            u3 = rect2;
                            fVar3 = fVar;
                        }
                    }
                    i6 = i12;
                    fVar = fVar3;
                    i8 = size;
                    rect2 = u3;
                    i7 = i11;
                    i12 = i6 + 1;
                    size = i8;
                    i11 = i7;
                    u3 = rect2;
                    fVar3 = fVar;
                }
                int i16 = size;
                Rect rect5 = u3;
                i2 = i11;
                mo4925i(view, true, u2);
                C1773f fVar6 = fVar3;
                if (fVar6.f5529g != 0 && !u2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar6.f5529g, f);
                    int i17 = absoluteGravity & 112;
                    if (i17 == 48) {
                        u.top = Math.max(u.top, u2.bottom);
                    } else if (i17 == 80) {
                        u.bottom = Math.max(u.bottom, getHeight() - u2.top);
                    }
                    int i18 = absoluteGravity & 7;
                    if (i18 == 3) {
                        u.left = Math.max(u.left, u2.right);
                    } else if (i18 == 5) {
                        u.right = Math.max(u.right, getWidth() - u2.left);
                    }
                }
                if (fVar6.f5530h != 0 && view.getVisibility() == 0 && C2043bi.m5570ax(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    C1773f fVar7 = (C1773f) view.getLayoutParams();
                    C1770c cVar2 = fVar7.f5523a;
                    Rect u7 = m4847u();
                    Rect u8 = m4847u();
                    u8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (cVar2 == null || !cVar2.mo4966n(view, u7)) {
                        u7.set(u8);
                    } else if (!u8.contains(u7)) {
                        throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + u7.toShortString() + " | Bounds:" + u8.toShortString());
                    }
                    m4849w(u8);
                    if (u7.isEmpty()) {
                        m4849w(u7);
                    } else {
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar7.f5530h, f);
                        if ((absoluteGravity2 & 48) != 48 || (i5 = (u7.top - fVar7.topMargin) - fVar7.f5532j) >= u.top) {
                            z2 = false;
                        } else {
                            m4839E(view, u.top - i5);
                            z2 = true;
                        }
                        if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - u7.bottom) - fVar7.bottomMargin) + fVar7.f5532j) < u.bottom) {
                            m4839E(view, height - u.bottom);
                        } else if (!z2) {
                            m4839E(view, 0);
                        }
                        if ((absoluteGravity2 & 3) != 3 || (i4 = (u7.left - fVar7.leftMargin) - fVar7.f5531i) >= u.left) {
                            z3 = false;
                        } else {
                            m4838D(view, u.left - i4);
                            z3 = true;
                        }
                        if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - u7.right) - fVar7.rightMargin) + fVar7.f5531i) < u.right) {
                            m4838D(view, width - u.right);
                        } else if (!z3) {
                            m4838D(view, 0);
                        }
                        m4849w(u7);
                    }
                }
                if (i10 != 2) {
                    rect = rect5;
                    rect.set(((C1773f) view.getLayoutParams()).f5538p);
                    if (!rect.equals(u2)) {
                        ((C1773f) view.getLayoutParams()).f5538p.set(u2);
                    } else {
                        i3 = i16;
                    }
                } else {
                    rect = rect5;
                }
                i3 = i16;
                for (int i19 = i2 + 1; i19 < i3; i19++) {
                    View view2 = (View) this.f5506j.get(i19);
                    C1773f fVar8 = (C1773f) view2.getLayoutParams();
                    C1770c cVar3 = fVar8.f5523a;
                    if (cVar3 != null && cVar3.mo4964l(view2, view)) {
                        if (i10 != 0 || !fVar8.f5537o) {
                            if (i10 != 2) {
                                z = cVar3.mo4957e(this, view2, view);
                            } else {
                                cVar3.mo4954b(this, view2, view);
                                z = true;
                            }
                            if (i10 == 1) {
                                fVar8.f5537o = z;
                            }
                        } else {
                            fVar8.f5537o = false;
                        }
                    }
                }
            }
            i11 = i2 + 1;
            size = i3;
            u3 = rect;
        }
        m4849w(u);
        m4849w(u2);
        m4849w(u3);
    }

    /* renamed from: k */
    public final void mo4927k(View view, int i) {
        int i2;
        C1773f fVar = (C1773f) view.getLayoutParams();
        View view2 = fVar.f5533k;
        if (view2 == null && fVar.f5528f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect u = m4847u();
            Rect u2 = m4847u();
            try {
                C1778k.m4893a(this, view2, u);
                C1773f fVar2 = (C1773f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m4836B(i, u, u2, fVar2, measuredWidth, measuredHeight);
                m4848v(fVar2, u2, measuredWidth, measuredHeight);
                view.layout(u2.left, u2.top, u2.right, u2.bottom);
            } finally {
                m4849w(u);
                m4849w(u2);
            }
        } else {
            int i3 = fVar.f5527e;
            if (i3 >= 0) {
                C1773f fVar3 = (C1773f) view.getLayoutParams();
                int absoluteGravity = Gravity.getAbsoluteGravity(m4846s(fVar3.f5525c), i);
                int i4 = absoluteGravity & 7;
                int i5 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int q = mo77372q(i3) - measuredWidth2;
                if (i4 == 1) {
                    q += measuredWidth2 / 2;
                } else if (i4 == 5) {
                    q += measuredWidth2;
                }
                if (i5 != 16) {
                    i2 = i5 != 80 ? 0 : measuredHeight2;
                } else {
                    i2 = measuredHeight2 / 2;
                }
                int max = Math.max(getPaddingLeft() + fVar3.leftMargin, Math.min(q, ((width - getPaddingRight()) - measuredWidth2) - fVar3.rightMargin));
                int max2 = Math.max(getPaddingTop() + fVar3.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - fVar3.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            C1773f fVar4 = (C1773f) view.getLayoutParams();
            Rect u3 = m4847u();
            u3.set(getPaddingLeft() + fVar4.leftMargin, getPaddingTop() + fVar4.topMargin, (getWidth() - getPaddingRight()) - fVar4.rightMargin, (getHeight() - getPaddingBottom()) - fVar4.bottomMargin);
            if (this.f5503f != null && C2043bi.m5564ar(this) && !C2043bi.m5564ar(view)) {
                u3.left += this.f5503f.mo5240b();
                u3.top += this.f5503f.mo5242d();
                u3.right -= this.f5503f.mo5241c();
                u3.bottom -= this.f5503f.mo5239a();
            }
            Rect u4 = m4847u();
            C2101p.m5783a(m4845r(fVar4.f5525c), view.getMeasuredWidth(), view.getMeasuredHeight(), u3, u4, i);
            view.layout(u4.left, u4.top, u4.right, u4.bottom);
            m4849w(u3);
            m4849w(u4);
        }
    }

    /* renamed from: l */
    public final boolean mo4928l(View view, int i, int i2) {
        Rect u = m4847u();
        C1778k.m4893a(this, view, u);
        try {
            return u.contains(i, i2);
        } finally {
            m4849w(u);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4850x();
        if (this.f5516t) {
            if (this.f5515s == null) {
                this.f5515s = new C1774g(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f5515s);
        }
        if (this.f5503f == null && C2043bi.m5564ar(this)) {
            C2043bi.m5524R(this);
        }
        this.f5511o = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4850x();
        if (this.f5516t && this.f5515s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f5515s);
        }
        View view = this.f5514r;
        if (view != null) {
            mo1857h(view, 0);
        }
        this.f5511o = false;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5504g && this.f5517u != null) {
            C2082cp cpVar = this.f5503f;
            int d = cpVar != null ? cpVar.mo5242d() : 0;
            if (d > 0) {
                this.f5517u.setBounds(0, 0, getWidth(), d);
                this.f5517u.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m4850x();
            actionMasked = 0;
        }
        boolean A = m4835A(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f5513q = null;
            m4850x();
        }
        return A;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1770c cVar;
        int f = C2043bi.m5577f(this);
        int size = this.f5506j.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f5506j.get(i5);
            if (view.getVisibility() != 8 && ((cVar = ((C1773f) view.getLayoutParams()).f5523a) == null || !cVar.mo4959g(this, view, f))) {
                mo4927k(view, f);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x032c, code lost:
        if (r0.mo4965m(r30, r20, r7, r21, r25) == false) goto L_0x033f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x032f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r6 = r30
            java.util.List r0 = r6.f5506j
            r0.clear()
            androidx.coordinatorlayout.widget.j r0 = r6.f5502e
            androidx.c.n r1 = r0.f5542b
            int r1 = r1.f3122d
            r7 = 0
            r2 = 0
        L_0x000f:
            if (r2 >= r1) goto L_0x0026
            androidx.c.n r3 = r0.f5542b
            java.lang.Object r3 = r3.mo3708h(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L_0x0023
            r3.clear()
            androidx.core.i.f r4 = r0.f5541a
            r4.mo5127b(r3)
        L_0x0023:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x0026:
            androidx.c.n r0 = r0.f5542b
            r0.clear()
            int r0 = r30.getChildCount()
            r1 = 0
        L_0x0030:
            if (r1 >= r0) goto L_0x017d
            android.view.View r2 = r6.getChildAt(r1)
            androidx.coordinatorlayout.widget.f r3 = m4843o(r2)
            int r4 = r3.f5528f
            r5 = -1
            r8 = 0
            if (r4 != r5) goto L_0x0046
            r3.f5534l = r8
            r3.f5533k = r8
            goto L_0x00cd
        L_0x0046:
            android.view.View r4 = r3.f5533k
            if (r4 == 0) goto L_0x0074
            int r4 = r4.getId()
            int r5 = r3.f5528f
            if (r4 == r5) goto L_0x0053
            goto L_0x0074
        L_0x0053:
            android.view.View r4 = r3.f5533k
            android.view.ViewParent r5 = r4.getParent()
        L_0x0059:
            if (r5 == r6) goto L_0x0071
            if (r5 == 0) goto L_0x006c
            if (r5 != r2) goto L_0x0060
            goto L_0x006c
        L_0x0060:
            boolean r9 = r5 instanceof android.view.View
            if (r9 == 0) goto L_0x0067
            r4 = r5
            android.view.View r4 = (android.view.View) r4
        L_0x0067:
            android.view.ViewParent r5 = r5.getParent()
            goto L_0x0059
        L_0x006c:
            r3.f5534l = r8
            r3.f5533k = r8
            goto L_0x0074
        L_0x0071:
            r3.f5534l = r4
            goto L_0x00cb
        L_0x0074:
            int r4 = r3.f5528f
            android.view.View r4 = r6.findViewById(r4)
            r3.f5533k = r4
            android.view.View r4 = r3.f5533k
            if (r4 == 0) goto L_0x00c1
            if (r4 != r6) goto L_0x0095
            boolean r4 = r30.isInEditMode()
            if (r4 == 0) goto L_0x008d
            r3.f5534l = r8
            r3.f5533k = r8
            goto L_0x00cb
        L_0x008d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x0095:
            android.view.ViewParent r5 = r4.getParent()
        L_0x0099:
            if (r5 == r6) goto L_0x00be
            if (r5 == 0) goto L_0x00be
            if (r5 != r2) goto L_0x00b2
            boolean r4 = r30.isInEditMode()
            if (r4 == 0) goto L_0x00aa
            r3.f5534l = r8
            r3.f5533k = r8
            goto L_0x00cb
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00b2:
            boolean r9 = r5 instanceof android.view.View
            if (r9 == 0) goto L_0x00b9
            r4 = r5
            android.view.View r4 = (android.view.View) r4
        L_0x00b9:
            android.view.ViewParent r5 = r5.getParent()
            goto L_0x0099
        L_0x00be:
            r3.f5534l = r4
            goto L_0x00cb
        L_0x00c1:
            boolean r4 = r30.isInEditMode()
            if (r4 == 0) goto L_0x0157
            r3.f5534l = r8
            r3.f5533k = r8
        L_0x00cb:
            android.view.View r4 = r3.f5533k
        L_0x00cd:
            androidx.coordinatorlayout.widget.j r4 = r6.f5502e
            r4.mo4983b(r2)
            r4 = 0
        L_0x00d3:
            if (r4 >= r0) goto L_0x0153
            if (r4 != r1) goto L_0x00d8
            goto L_0x0148
        L_0x00d8:
            android.view.View r5 = r6.getChildAt(r4)
            android.view.View r8 = r3.f5534l
            if (r5 == r8) goto L_0x0106
            int r8 = androidx.core.p098j.C2043bi.m5577f(r30)
            android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
            androidx.coordinatorlayout.widget.f r9 = (androidx.coordinatorlayout.widget.C1773f) r9
            int r9 = r9.f5529g
            int r9 = android.view.Gravity.getAbsoluteGravity(r9, r8)
            if (r9 == 0) goto L_0x00fc
            int r10 = r3.f5530h
            int r8 = android.view.Gravity.getAbsoluteGravity(r10, r8)
            r8 = r8 & r9
            if (r8 != r9) goto L_0x00fc
            goto L_0x0106
        L_0x00fc:
            androidx.coordinatorlayout.widget.c r8 = r3.f5523a
            if (r8 == 0) goto L_0x0148
            boolean r8 = r8.mo4964l(r2, r5)
            if (r8 == 0) goto L_0x0148
        L_0x0106:
            androidx.coordinatorlayout.widget.j r8 = r6.f5502e
            androidx.c.n r8 = r8.f5542b
            boolean r8 = r8.containsKey(r5)
            if (r8 != 0) goto L_0x0115
            androidx.coordinatorlayout.widget.j r8 = r6.f5502e
            r8.mo4983b(r5)
        L_0x0115:
            androidx.coordinatorlayout.widget.j r8 = r6.f5502e
            androidx.c.n r9 = r8.f5542b
            boolean r9 = r9.containsKey(r5)
            if (r9 == 0) goto L_0x014b
            androidx.c.n r9 = r8.f5542b
            boolean r9 = r9.containsKey(r2)
            if (r9 == 0) goto L_0x014b
            androidx.c.n r9 = r8.f5542b
            java.lang.Object r9 = r9.get(r5)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x0145
            androidx.core.i.f r9 = r8.f5541a
            java.lang.Object r9 = r9.mo5126a()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x0140
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0140:
            androidx.c.n r8 = r8.f5542b
            r8.put(r5, r9)
        L_0x0145:
            r9.add(r2)
        L_0x0148:
            int r4 = r4 + 1
            goto L_0x00d3
        L_0x014b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x0153:
            int r1 = r1 + 1
            goto L_0x0030
        L_0x0157:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Could not find CoordinatorLayout descendant view with id "
            r1.<init>(r4)
            android.content.res.Resources r4 = r30.getResources()
            int r3 = r3.f5528f
            java.lang.String r3 = r4.getResourceName(r3)
            r1.append(r3)
            java.lang.String r3 = " to anchor view "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x017d:
            java.util.List r0 = r6.f5506j
            androidx.coordinatorlayout.widget.j r1 = r6.f5502e
            java.util.ArrayList r2 = r1.f5543c
            r2.clear()
            java.util.HashSet r2 = r1.f5544d
            r2.clear()
            androidx.c.n r2 = r1.f5542b
            int r2 = r2.f3122d
            r3 = 0
        L_0x0190:
            if (r3 >= r2) goto L_0x01a2
            androidx.c.n r4 = r1.f5542b
            java.lang.Object r4 = r4.mo3702e(r3)
            java.util.ArrayList r5 = r1.f5543c
            java.util.HashSet r8 = r1.f5544d
            r1.mo4984c(r4, r5, r8)
            int r3 = r3 + 1
            goto L_0x0190
        L_0x01a2:
            java.util.ArrayList r1 = r1.f5543c
            r0.addAll(r1)
            java.util.List r0 = r6.f5506j
            java.util.Collections.reverse(r0)
            int r0 = r30.getChildCount()
            r1 = 0
        L_0x01b1:
            r8 = 1
            if (r1 >= r0) goto L_0x01d9
            android.view.View r2 = r6.getChildAt(r1)
            androidx.coordinatorlayout.widget.j r3 = r6.f5502e
            androidx.c.n r4 = r3.f5542b
            int r4 = r4.f3122d
            r5 = 0
        L_0x01bf:
            if (r5 >= r4) goto L_0x01d6
            androidx.c.n r9 = r3.f5542b
            java.lang.Object r9 = r9.mo3708h(r5)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x01d3
            boolean r9 = r9.contains(r2)
            if (r9 == 0) goto L_0x01d3
            r0 = 1
            goto L_0x01da
        L_0x01d3:
            int r5 = r5 + 1
            goto L_0x01bf
        L_0x01d6:
            int r1 = r1 + 1
            goto L_0x01b1
        L_0x01d9:
            r0 = 0
        L_0x01da:
            boolean r1 = r6.f5516t
            if (r0 == r1) goto L_0x020e
            if (r0 == 0) goto L_0x01fb
            boolean r0 = r6.f5511o
            if (r0 == 0) goto L_0x01f8
            androidx.coordinatorlayout.widget.g r0 = r6.f5515s
            if (r0 != 0) goto L_0x01ef
            androidx.coordinatorlayout.widget.g r0 = new androidx.coordinatorlayout.widget.g
            r0.<init>(r6)
            r6.f5515s = r0
        L_0x01ef:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.g r1 = r6.f5515s
            r0.addOnPreDrawListener(r1)
        L_0x01f8:
            r6.f5516t = r8
            goto L_0x020e
        L_0x01fb:
            boolean r0 = r6.f5511o
            if (r0 == 0) goto L_0x020c
            androidx.coordinatorlayout.widget.g r0 = r6.f5515s
            if (r0 == 0) goto L_0x020c
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.g r1 = r6.f5515s
            r0.removeOnPreDrawListener(r1)
        L_0x020c:
            r6.f5516t = r7
        L_0x020e:
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r11 = androidx.core.p098j.C2043bi.m5577f(r30)
            if (r11 != r8) goto L_0x0226
            r12 = 1
            goto L_0x0227
        L_0x0226:
            r12 = 0
        L_0x0227:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            androidx.core.j.cp r2 = r6.f5503f
            if (r2 == 0) goto L_0x0250
            boolean r2 = androidx.core.p098j.C2043bi.m5564ar(r30)
            if (r2 == 0) goto L_0x0250
            r19 = 1
            goto L_0x0252
        L_0x0250:
            r19 = 0
        L_0x0252:
            java.util.List r2 = r6.f5506j
            int r5 = r2.size()
            r4 = r0
            r3 = r1
            r1 = 0
            r2 = 0
        L_0x025c:
            if (r2 >= r5) goto L_0x0385
            java.util.List r0 = r6.f5506j
            java.lang.Object r0 = r0.get(r2)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r8 = 8
            if (r0 != r8) goto L_0x027c
            r22 = r2
            r28 = r5
            r24 = r9
            r26 = r10
            r27 = r11
            goto L_0x0377
        L_0x027c:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r8 = r0
            androidx.coordinatorlayout.widget.f r8 = (androidx.coordinatorlayout.widget.C1773f) r8
            int r0 = r8.f5527e
            if (r0 < 0) goto L_0x02ce
            if (r13 == 0) goto L_0x02ce
            int r0 = r6.mo77372q(r0)
            int r7 = r8.f5525c
            int r7 = m4846s(r7)
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r11)
            r7 = r7 & 7
            r22 = r1
            r1 = 3
            if (r7 != r1) goto L_0x02a4
            if (r12 == 0) goto L_0x02ab
            r7 = 3
            r23 = 1
            goto L_0x02a6
        L_0x02a4:
            r23 = r12
        L_0x02a6:
            r1 = 5
            if (r7 != r1) goto L_0x02ba
            if (r23 == 0) goto L_0x02b7
        L_0x02ab:
            int r1 = r14 - r10
            int r1 = r1 - r0
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            r21 = r1
            r7 = 0
            goto L_0x02d2
        L_0x02b7:
            r7 = 5
            r23 = 0
        L_0x02ba:
            if (r7 != r1) goto L_0x02be
            if (r23 == 0) goto L_0x02c3
        L_0x02be:
            r1 = 3
            if (r7 != r1) goto L_0x02cc
            if (r23 == 0) goto L_0x02cc
        L_0x02c3:
            int r0 = r0 - r9
            r7 = 0
            int r0 = java.lang.Math.max(r7, r0)
            r21 = r0
            goto L_0x02d2
        L_0x02cc:
            r7 = 0
            goto L_0x02d0
        L_0x02ce:
            r22 = r1
        L_0x02d0:
            r21 = 0
        L_0x02d2:
            if (r19 == 0) goto L_0x0306
            boolean r0 = androidx.core.p098j.C2043bi.m5564ar(r20)
            if (r0 != 0) goto L_0x0306
            androidx.core.j.cp r0 = r6.f5503f
            int r0 = r0.mo5240b()
            androidx.core.j.cp r1 = r6.f5503f
            int r1 = r1.mo5241c()
            androidx.core.j.cp r7 = r6.f5503f
            int r7 = r7.mo5242d()
            r24 = r2
            androidx.core.j.cp r2 = r6.f5503f
            int r2 = r2.mo5239a()
            int r0 = r0 + r1
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r7 = r7 + r2
            int r1 = r16 - r7
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r15)
            r7 = r0
            r25 = r1
            goto L_0x030c
        L_0x0306:
            r24 = r2
            r7 = r31
            r25 = r32
        L_0x030c:
            androidx.coordinatorlayout.widget.c r0 = r8.f5523a
            if (r0 == 0) goto L_0x032f
            r2 = r22
            r1 = r30
            r22 = r24
            r24 = r9
            r9 = r2
            r2 = r20
            r26 = r10
            r10 = r3
            r3 = r7
            r27 = r11
            r11 = r4
            r4 = r21
            r28 = r5
            r5 = r25
            boolean r0 = r0.mo4965m(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x034c
            goto L_0x033f
        L_0x032f:
            r28 = r5
            r26 = r10
            r27 = r11
            r10 = r3
            r11 = r4
            r29 = r24
            r24 = r9
            r9 = r22
            r22 = r29
        L_0x033f:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r7
            r3 = r21
            r4 = r25
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x034c:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            int r1 = r8.leftMargin
            int r0 = r0 + r1
            int r1 = r8.rightMargin
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r11, r0)
            int r1 = r20.getMeasuredHeight()
            int r1 = r18 + r1
            int r2 = r8.topMargin
            int r1 = r1 + r2
            int r2 = r8.bottomMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r10, r1)
            int r2 = r20.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r9, r2)
            r4 = r0
            r3 = r1
            r1 = r2
        L_0x0377:
            int r2 = r22 + 1
            r9 = r24
            r10 = r26
            r11 = r27
            r5 = r28
            r7 = 0
            r8 = 1
            goto L_0x025c
        L_0x0385:
            r9 = r1
            r10 = r3
            r11 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r9
            r1 = r31
            int r0 = android.view.View.resolveSizeAndState(r11, r1, r0)
            int r1 = r9 << 16
            r2 = r32
            int r1 = android.view.View.resolveSizeAndState(r10, r2, r1)
            r6.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1773f fVar = (C1773f) childAt.getLayoutParams();
                if (fVar.f5536n) {
                    C1770c cVar = fVar.f5523a;
                }
            }
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        C1770c cVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1773f fVar = (C1773f) childAt.getLayoutParams();
                if (fVar.f5536n && (cVar = fVar.f5523a) != null) {
                    z |= cVar.mo4960h(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1848d(view, i, i2, iArr, 0);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1850e(view, i, i2, i3, i4, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo1852g(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6116d);
        SparseArray sparseArray = savedState.f5520a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C1770c cVar = m4843o(childAt).f5523a;
            if (!(id == -1 || cVar == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                cVar.mo4969q(childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Parcelable r;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C1770c cVar = ((C1773f) childAt.getLayoutParams()).f5523a;
            if (!(id == -1 || cVar == null || (r = cVar.mo4970r(childAt)) == null)) {
                sparseArray.append(id, r);
            }
        }
        savedState.f5520a = sparseArray;
        return savedState;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1884t(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        mo1857h(view, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f5513q;
        boolean z2 = false;
        if (view != null) {
            C1770c cVar = ((C1773f) view.getLayoutParams()).f5523a;
            z = cVar != null ? cVar.mo4963k(this, this.f5513q, motionEvent) : false;
        } else {
            z = m4835A(motionEvent, 1);
            if (actionMasked != 0 && z) {
                z2 = true;
            }
        }
        if (this.f5513q == null || actionMasked == 3) {
            z |= super.onTouchEvent(motionEvent);
        } else if (z2) {
            MotionEvent C = m4837C(motionEvent);
            super.onTouchEvent(C);
            C.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f5513q = null;
            m4850x();
        }
        return z;
    }

    /* renamed from: p */
    public final void mo4945p(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C1770c cVar = ((C1773f) view.getLayoutParams()).f5523a;
        if (cVar == null || !cVar.mo4961i(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f5510n) {
            if (this.f5513q == null) {
                int childCount = getChildCount();
                MotionEvent motionEvent = null;
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    C1770c cVar = ((C1773f) childAt.getLayoutParams()).f5523a;
                    if (cVar != null) {
                        if (motionEvent == null) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        }
                        cVar.mo4958f(this, childAt, motionEvent);
                    }
                }
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
            }
            m4850x();
            this.f5510n = true;
        }
    }

    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m4851y();
    }

    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f5505h = onHierarchyChangeListener;
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f5517u;
        if (drawable != null && drawable.isVisible() != z) {
            this.f5517u.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public final boolean mo1884t(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C1773f fVar = (C1773f) childAt.getLayoutParams();
                C1770c cVar = fVar.f5523a;
                if (cVar != null) {
                    boolean j = cVar.mo4962j(this, childAt, view, view2, i, i2);
                    z |= j;
                    fVar.mo4975b(i3, j);
                } else {
                    fVar.mo4975b(i3, false);
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5517u;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m4842n(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f5506j = new ArrayList();
        this.f5502e = new C1777j();
        this.f5507k = new ArrayList();
        this.f5508l = new int[2];
        this.f5509m = new int[2];
        this.f5519w = new C2009ac();
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C1767a.f5495a, 0, C6012R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C1767a.f5495a, i, 0);
        }
        if (i == 0) {
            C2043bi.m5525S(this, context, C1767a.f5495a, attributeSet, typedArray, 0, C6012R.style.Widget_Support_CoordinatorLayout);
        } else {
            C2043bi.m5525S(this, context, C1767a.f5495a, attributeSet, typedArray, i, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f5512p = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f5512p.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f5512p;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f5517u = typedArray.getDrawable(1);
        typedArray.recycle();
        m4851y();
        super.setOnHierarchyChangeListener(new C1772e(this));
        if (C2043bi.m5575d(this) == 0) {
            C2043bi.m5551ae(this, 1);
        }
    }

    /* compiled from: PG */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C1775h();

        /* renamed from: a */
        SparseArray f5520a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f5520a = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f5520a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f6116d, i);
            SparseArray sparseArray = this.f5520a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f5520a.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f5520a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
