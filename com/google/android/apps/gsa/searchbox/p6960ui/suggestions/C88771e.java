package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.searchbox.p6960ui.C88702c;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88805ap;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.shared.util.p7187ui.C91110i;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.shared.util.p7187ui.C91121t;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.e */
/* compiled from: PG */
public final class C88771e extends ViewGroup implements C88786t {

    /* renamed from: b */
    private static final TimeInterpolator f240198b = C91107f.f254406b;

    /* renamed from: a */
    final List f240199a = new ArrayList();

    /* renamed from: c */
    private boolean f240200c;

    /* renamed from: d */
    private boolean f240201d;

    /* renamed from: e */
    private boolean f240202e;

    /* renamed from: f */
    private long f240203f;

    /* renamed from: g */
    private long f240204g;

    /* renamed from: h */
    private long f240205h;

    /* renamed from: i */
    private final int f240206i;

    /* renamed from: j */
    private final C88845y f240207j;

    /* renamed from: k */
    private final List f240208k = new ArrayList();

    /* renamed from: l */
    private ListIterator f240209l;

    /* renamed from: m */
    private final List f240210m = new ArrayList();

    /* renamed from: n */
    private int f240211n;

    /* renamed from: o */
    private int f240212o;

    /* renamed from: p */
    private int f240213p;

    /* renamed from: q */
    private int f240214q;

    /* renamed from: r */
    private int f240215r;

    /* renamed from: s */
    private int f240216s;

    /* renamed from: t */
    private int f240217t;

    /* renamed from: u */
    private C88702c f240218u;

    /* renamed from: v */
    private final C88770d f240219v = new C88770d();

    /* renamed from: w */
    private final Rect f240220w = new Rect();

    /* renamed from: x */
    private float f240221x;

    /* renamed from: y */
    private boolean f240222y;

    /* renamed from: z */
    private boolean f240223z;

    public C88771e(int i, Context context) {
        super(context);
        this.f240206i = i;
        this.f240207j = new C88845y(this);
        setTag(R.id.suggestion_container_type, Integer.valueOf(i));
        this.f240216s = 0;
        this.f240217t = 0;
    }

    /* renamed from: p */
    private final int m143959p(int i) {
        if (i >= 0 && i < getChildCount()) {
            View childAt = getChildAt(i);
            if (childAt.getId() != -1 && childAt.getVisibility() == 0 && childAt.isFocusable()) {
                return childAt.getId();
            }
        }
        return -1;
    }

    /* renamed from: q */
    private static int m143960q(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    /* renamed from: r */
    private static C88803an m143961r(View view) {
        if (view instanceof C88803an) {
            return (C88803an) view;
        }
        Object tag = view.getTag(R.id.view_corresponding_suggestion_view);
        if (tag instanceof C88803an) {
            return (C88803an) tag;
        }
        return null;
    }

    /* renamed from: s */
    private static void m143962s(C88803an anVar) {
        View s = anVar.mo82585s();
        if (!(s instanceof C88803an)) {
            s.setTag(R.id.view_corresponding_suggestion_view, anVar);
        }
    }

    /* renamed from: b */
    public final int mo82487b(int i) {
        int i2;
        int i3;
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                i2 = -1;
                break;
            }
            i2 = m143959p(i4);
            if (i2 != -1) {
                break;
            }
            i4++;
        }
        int i5 = childCount - 1;
        while (true) {
            if (i5 < 0) {
                i3 = -1;
                break;
            }
            i3 = m143959p(i5);
            if (i3 != -1) {
                break;
            }
            i5--;
        }
        if (i != 2) {
            if (i != 17) {
                if (i == 33) {
                    return this.f240223z ? i2 : i3;
                }
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("Unknown focus direction " + i);
                    }
                }
            }
            return -1;
        }
        return i2;
    }

    /* renamed from: c */
    public final int mo82513c() {
        return this.f240206i;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        C88715p pVar = (C88715p) obj;
        C90476a aVar = pVar.f239946r;
        this.f240207j.mo82630b(pVar.f239931c);
        this.f240218u = pVar.f239944p;
    }

    /* renamed from: e */
    public final C88803an mo82514e(int i) {
        if (this.f240209l.hasNext()) {
            C88803an anVar = (C88803an) this.f240209l.next();
            if (anVar.mo82342b(i)) {
                this.f240211n++;
                m143962s(anVar);
                return anVar;
            }
            C88803an a = this.f240207j.mo82629a(i);
            if (a == null) {
                this.f240209l.previous();
                return null;
            }
            removeView(anVar.mo82585s());
            this.f240207j.mo82631c(anVar);
            int i2 = this.f240211n + 1;
            this.f240211n = i2;
            addView(a.mo82585s(), i2);
            this.f240209l.set(a);
            m143962s(anVar);
            return a;
        }
        C88803an a2 = this.f240207j.mo82629a(i);
        if (a2 != null) {
            this.f240209l.add(a2);
            this.f240211n++;
            addView(a2.mo82585s());
            m143962s(a2);
        }
        return a2;
    }

    /* renamed from: f */
    public final void mo82515f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            addView((View) it.next());
            this.f240217t++;
        }
    }

    /* renamed from: g */
    public final void mo82516g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i = this.f240216s;
            this.f240216s = i + 1;
            addView((View) it.next(), i);
        }
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* renamed from: h */
    public final void mo82519h() {
        int childCount = getChildCount();
        int i = this.f240217t;
        removeViews(childCount - i, i);
        removeViews(0, this.f240216s);
        this.f240216s = 0;
        this.f240217t = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017c  */
    /* renamed from: hD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo82217hD(java.lang.Object r15) {
        /*
            r14 = this;
            com.google.android.apps.gsa.searchbox.ui.j r15 = (com.google.android.apps.gsa.searchbox.p6960ui.C88709j) r15
            int r0 = r14.f240206i
            com.google.android.apps.gsa.searchbox.ui.suggestions.u r15 = r15.mo82433a(r0)
            int r0 = r15.f240291e
            r1 = -1
            if (r0 == r1) goto L_0x0010
            r14.setId(r0)
        L_0x0010:
            float r0 = r15.f240293g
            r14.f240221x = r0
            int r0 = r15.f240292f
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r1 == r0) goto L_0x001d
            r0 = 0
            goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            r14.f240223z = r0
            boolean r0 = r15.f240281G
            r14.f240200c = r0
            boolean r3 = r15.f240282H
            r14.f240201d = r3
            long r3 = r15.f240312z
            r14.f240203f = r3
            long r3 = r15.f240275A
            r14.f240204g = r3
            long r3 = r15.f240276B
            r14.f240205h = r3
            boolean r3 = r14.f240202e
            r0 = r0 & r3
            r14.f240202e = r0
            boolean r0 = r15.f240302p
            if (r0 == 0) goto L_0x0041
            int r3 = r15.f240303q
            r3 = 0
            goto L_0x0052
        L_0x0041:
            android.content.Context r3 = r14.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = r15.f240294h
            r4 = 2131167291(0x7f07083b, float:1.7948851E38)
            int r3 = r3.getDimensionPixelSize(r4)
        L_0x0052:
            if (r0 == 0) goto L_0x0057
            int r4 = r15.f240304r
            goto L_0x0065
        L_0x0057:
            android.content.Context r4 = r14.getContext()
            android.content.res.Resources r4 = r4.getResources()
            int r5 = r15.f240295i
            int r4 = r4.getDimensionPixelSize(r5)
        L_0x0065:
            if (r0 == 0) goto L_0x006b
            int r5 = r15.f240305s
            r5 = 0
            goto L_0x007c
        L_0x006b:
            android.content.Context r5 = r14.getContext()
            android.content.res.Resources r5 = r5.getResources()
            int r6 = r15.f240296j
            r6 = 2131167292(0x7f07083c, float:1.7948853E38)
            int r5 = r5.getDimensionPixelSize(r6)
        L_0x007c:
            if (r0 == 0) goto L_0x0082
            int r6 = r15.f240306t
            r6 = 0
            goto L_0x0093
        L_0x0082:
            android.content.Context r6 = r14.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r7 = r15.f240297k
            r7 = 2131167290(0x7f07083a, float:1.794885E38)
            int r6 = r6.getDimensionPixelSize(r7)
        L_0x0093:
            com.google.android.apps.gsa.shared.ui.an r7 = r15.f240277C
            r7.setMargins(r3, r4, r5, r6)
            com.google.android.apps.gsa.shared.ui.an r3 = r15.f240277C
            r14.setLayoutParams(r3)
            int r3 = r14.getPaddingLeft()
            int r4 = r14.getPaddingRight()
            int r5 = r14.getPaddingTop()
            int r6 = r14.getPaddingBottom()
            if (r0 == 0) goto L_0x00d7
            int r0 = r15.f240307u
            if (r0 != 0) goto L_0x00c0
            int r0 = r15.f240308v
            if (r0 != 0) goto L_0x00bf
            int r0 = r15.f240309w
            if (r0 != 0) goto L_0x00bf
            int r0 = r15.f240310x
            if (r0 == 0) goto L_0x00e8
        L_0x00bf:
            r0 = 0
        L_0x00c0:
            if (r0 != 0) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r3 = r0
        L_0x00c4:
            int r0 = r15.f240308v
            if (r0 != 0) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r5 = r0
        L_0x00ca:
            int r0 = r15.f240309w
            if (r0 != 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r4 = r0
        L_0x00d0:
            int r0 = r15.f240310x
            if (r0 == 0) goto L_0x00d5
            r6 = r0
        L_0x00d5:
            r0 = 1
            goto L_0x0125
        L_0x00d7:
            int r0 = r15.f240298l
            int r7 = r15.f240299m
            int r8 = r15.f240300n
            int r9 = r15.f240301o
            if (r0 != 0) goto L_0x00ea
            if (r7 != 0) goto L_0x00ea
            if (r8 != 0) goto L_0x00ea
            if (r9 == 0) goto L_0x00e8
            goto L_0x00ea
        L_0x00e8:
            r0 = 0
            goto L_0x0125
        L_0x00ea:
            if (r0 != 0) goto L_0x00ed
            goto L_0x00f9
        L_0x00ed:
            android.content.Context r3 = r14.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getDimensionPixelSize(r0)
        L_0x00f9:
            if (r7 != 0) goto L_0x00fc
            goto L_0x0108
        L_0x00fc:
            android.content.Context r0 = r14.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r5 = r0.getDimensionPixelSize(r7)
        L_0x0108:
            if (r8 == 0) goto L_0x0116
            android.content.Context r0 = r14.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r4 = r0.getDimensionPixelSize(r8)
        L_0x0116:
            if (r9 == 0) goto L_0x00d5
            android.content.Context r0 = r14.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r6 = r0.getDimensionPixelSize(r9)
            goto L_0x00d5
        L_0x0125:
            boolean r7 = r15.f240288b
            boolean r7 = r15.f240283I
            if (r7 != 0) goto L_0x0133
            boolean r2 = r15.f240284J
            int r2 = r15.f240289c
            r14.setBackgroundResource(r2)
            goto L_0x015f
        L_0x0133:
            com.google.android.apps.gsa.searchbox.ui.suggestions.c r13 = new com.google.android.apps.gsa.searchbox.ui.suggestions.c
            android.content.Context r7 = r14.getContext()
            android.content.res.Resources r8 = r7.getResources()
            int r9 = r15.f240289c
            int r7 = r15.f240290d
            if (r7 == 0) goto L_0x0153
            android.content.Context r2 = r14.getContext()
            android.content.res.Resources r2 = r2.getResources()
            int r7 = r15.f240290d
            int r2 = r2.getDimensionPixelSize(r7)
            r10 = r2
            goto L_0x0154
        L_0x0153:
            r10 = 0
        L_0x0154:
            int r11 = r15.f240311y
            int r12 = r15.f240285K
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            r14.setBackgroundDrawable(r13)
        L_0x015f:
            if (r0 == 0) goto L_0x0164
            r14.setPadding(r3, r5, r4, r6)
        L_0x0164:
            r0 = 8
            r14.setVisibility(r0)
            int r0 = r15.f240278D
            r14.f240212o = r0
            int r2 = r15.f240279E
            r2 = 2147483647(0x7fffffff, float:NaN)
            r14.f240213p = r2
            com.google.android.apps.gsa.searchbox.ui.c r3 = r14.f240218u
            boolean r3 = r3.f239826a
            r14.f240222y = r3
            if (r1 != r3) goto L_0x017f
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x017f:
            r14.f240214q = r0
            int r15 = r15.f240280F
            r14.f240215r = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88771e.mo82217hD(java.lang.Object):void");
    }

    /* renamed from: i */
    public final void mo82520i() {
        while (this.f240209l.hasNext()) {
            C88803an anVar = (C88803an) this.f240209l.next();
            this.f240207j.mo82631c(anVar);
            this.f240209l.remove();
            removeView(anVar.mo82585s());
        }
        int i = 0;
        boolean z = this.f240211n != -1;
        if (this.f240200c && getVisibility() != 0 && z) {
            this.f240202e = true;
        }
        if (true != z) {
            i = 8;
        }
        setVisibility(i);
    }

    /* renamed from: j */
    public final void mo82521j() {
        int i = this.f240214q;
        int i2 = this.f240215r + i;
        if (i2 > i) {
            this.f240214q = i2;
        }
    }

    /* renamed from: k */
    public final void mo82522k() {
        this.f240209l = this.f240208k.listIterator();
        this.f240211n = -1;
        mo82519h();
        boolean z = this.f240218u.f239826a;
        this.f240222y = z;
        this.f240214q = z ? this.f240213p : this.f240212o;
    }

    /* renamed from: l */
    public final void mo82523l() {
        this.f240209l.remove();
        this.f240207j.mo82631c((C88803an) this.f240209l.previous());
        int i = this.f240211n;
        this.f240211n = i - 1;
        removeViewAt(i);
    }

    /* renamed from: m */
    public final void mo82491m(C91110i iVar) {
        int id;
        int id2;
        for (List it : this.f240199a) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    View childAt = getChildAt(((Integer) it2.next()).intValue());
                    if (childAt != null) {
                        childAt.setNextFocusUpId(-1);
                        childAt.setNextFocusDownId(-1);
                        childAt.setNextFocusLeftId(-1);
                        childAt.setNextFocusRightId(-1);
                        childAt.setNextFocusForwardId(-1);
                    } else {
                        return;
                    }
                }
            }
        }
        for (List<Integer> it3 : this.f240199a) {
            View view = null;
            View view2 = null;
            for (Integer intValue : it3) {
                View childAt2 = getChildAt(intValue.intValue());
                int id3 = childAt2.getId();
                if (id3 != -1 && childAt2.isFocusable()) {
                    if (view2 == null) {
                        view = childAt2;
                    }
                    if (view2 != null) {
                        childAt2.setNextFocusLeftId(view2.getId());
                        view2.setNextFocusRightId(id3);
                        view2.setNextFocusForwardId(id3);
                    }
                    view2 = childAt2;
                }
            }
            if (!(view == null || view2 == null)) {
                view.setNextFocusLeftId(view2.getId());
                view2.setNextFocusRightId(view.getId());
            }
        }
        int size = this.f240199a.size();
        if (size > 0) {
            for (Integer intValue2 : (List) this.f240199a.get(0)) {
                View childAt3 = getChildAt(intValue2.intValue());
                if (!(childAt3 == null || (id2 = childAt3.getId()) == -1 || !childAt3.isFocusable())) {
                    childAt3.setNextFocusUpId(C91121t.m148887a(iVar.f254420b, id2));
                }
            }
            for (Integer intValue3 : (List) this.f240199a.get(size - 1)) {
                View childAt4 = getChildAt(intValue3.intValue());
                if (!(childAt4 == null || (id = childAt4.getId()) == -1 || !childAt4.isFocusable())) {
                    childAt4.setNextFocusDownId(C91121t.m148887a(iVar.f254421c, id));
                    childAt4.setNextFocusForwardId(C91121t.m148887a(iVar.f254424f, id));
                }
            }
        }
    }

    /* renamed from: n */
    public final boolean mo82524n() {
        return this.f240222y || this.f240211n + 1 < this.f240214q;
    }

    /* renamed from: o */
    public final boolean mo82525o() {
        return C91115n.m148876h(this);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f240219v.mo82512b(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), getWidth(), mo82525o());
        for (List<Integer> it : this.f240199a) {
            for (Integer intValue : it) {
                View childAt = getChildAt(intValue.intValue());
                this.f240219v.mo82511a(childAt, this.f240220w);
                childAt.layout(this.f240220w.left, this.f240220w.top, this.f240220w.right, this.f240220w.bottom);
            }
        }
        if (!this.f240222y && this.f240202e && !C90772bp.m148283J(getContext())) {
            int i5 = 0;
            for (List<Integer> it2 : this.f240199a) {
                for (Integer intValue2 : it2) {
                    View childAt2 = getChildAt(intValue2.intValue());
                    int i6 = i5 + 1;
                    int measuredHeight = childAt2.getMeasuredHeight();
                    long j = this.f240223z ? 0 : ((long) i5) * this.f240204g;
                    float f = this.f240201d ? ((float) (-measuredHeight)) * 0.32f : 0.0f;
                    childAt2.setAlpha(0.0f);
                    childAt2.setTranslationY(f);
                    childAt2.animate().translationY(0.0f).alpha(1.0f).setDuration(this.f240203f).setStartDelay(this.f240205h + j).setInterpolator(f240198b).withLayer();
                    i5 = i6;
                }
            }
        }
        this.f240202e = false;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Iterator it;
        int i5;
        int i6;
        int i7;
        Iterator it2;
        boolean z;
        int i8;
        boolean z2;
        int i9;
        int i10 = i;
        int i11 = i2;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i3 = size;
        } else if (mode == 1073741824) {
            i3 = size;
            mode = 1073741824;
        } else {
            i3 = Integer.MAX_VALUE;
        }
        this.f240219v.mo82512b(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i3, mo82525o());
        this.f240199a.clear();
        this.f240210m.clear();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            i4 = -1;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                C58838bb.m90869d(marginLayoutParams.height != -1, "A child view in FlowBasedSuggestionContainer has a layoutParam.height: MATCH_PARENT which is not supported");
                if (m143961r(childAt) != null) {
                    if (marginLayoutParams.width != -1) {
                        marginLayoutParams.width = -2;
                    }
                    C58838bb.m90869d(this.f240221x == 0.0f || this.f240223z, "SuggestionContainer must either have no weight sum or all children are configured to  be placed in a single row.");
                    if (this.f240221x > 0.0f) {
                        marginLayoutParams.width = (int) (((float) ((i3 - getPaddingLeft()) - getPaddingRight())) / this.f240221x);
                    }
                }
                int childMeasureSpec = getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), marginLayoutParams.width);
                C88770d dVar = this.f240219v;
                if (dVar.f240191e >= i3) {
                    i9 = dVar.f240194h;
                } else {
                    i9 = dVar.f240192f;
                }
                childAt.measure(childMeasureSpec, getChildMeasureSpec(i11, i9 + getPaddingBottom(), marginLayoutParams.height));
                this.f240219v.mo82511a(childAt, (Rect) null);
                int i13 = this.f240219v.f240195i;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (i13 == this.f240199a.size()) {
                    this.f240199a.add(C58597ky.m90212c(Integer.valueOf(i12)));
                    this.f240210m.add(Integer.valueOf(measuredHeight));
                } else {
                    ((List) this.f240199a.get(i13)).add(Integer.valueOf(i12));
                    if (((Integer) this.f240210m.get(i13)).intValue() < measuredHeight) {
                        this.f240210m.set(i13, Integer.valueOf(measuredHeight));
                    }
                }
            }
            i12++;
        }
        if (this.f240222y) {
            int i14 = 0;
            for (int i15 = 0; i15 < this.f240216s; i15++) {
                if (getChildAt(i15).getVisibility() == 0) {
                    i14++;
                }
            }
            int childCount2 = getChildCount();
            int i16 = 0;
            for (int i17 = childCount2 - this.f240217t; i17 < childCount2; i17++) {
                if (getChildAt(i17).getVisibility() == 0) {
                    i16++;
                }
            }
            int size3 = this.f240199a.size();
            int i18 = this.f240214q;
            if ((size3 - i14) - i16 > i18) {
                int i19 = i14 + i18;
                int size4 = (this.f240199a.size() - 1) - i16;
                while (size4 >= i19) {
                    List list = (List) this.f240199a.get(size4);
                    for (int size5 = list.size() + i4; size5 >= 0; size5--) {
                        View childAt2 = getChildAt(((Integer) list.get(size5)).intValue());
                        C88803an r = m143961r(childAt2);
                        if (r != null) {
                            r.mo82586t().f108914o = 3;
                            this.f240207j.mo82631c(r);
                            if ((this.f240209l.hasPrevious() ? (C88803an) this.f240209l.previous() : null) == r) {
                                this.f240209l.remove();
                            }
                        }
                        removeView(childAt2);
                    }
                    this.f240199a.remove(size4);
                    this.f240219v.f240194h -= ((Integer) this.f240210m.get(size4)).intValue();
                    this.f240210m.remove(size4);
                    size4--;
                    i4 = -1;
                }
            }
            Iterator it3 = this.f240199a.iterator();
            while (it3.hasNext()) {
                List<Integer> list2 = (List) it3.next();
                int size6 = list2.size();
                int paddingLeft = (i3 - getPaddingLeft()) - getPaddingRight();
                for (Integer intValue : list2) {
                    paddingLeft -= getChildAt(intValue.intValue()).getMeasuredWidth();
                }
                int i20 = paddingLeft / size6;
                if (i20 > 0) {
                    int i21 = 0;
                    while (i21 < size6) {
                        View childAt3 = getChildAt(((Integer) list2.get(i21)).intValue());
                        int measuredWidth = childAt3.getMeasuredWidth();
                        Iterator it4 = it3;
                        ViewGroup.LayoutParams layoutParams = childAt3.getLayoutParams();
                        List list3 = list2;
                        layoutParams.width = measuredWidth + (i21 == size6 + -1 ? paddingLeft : i20);
                        paddingLeft -= i20;
                        childAt3.measure(getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), layoutParams.width), getChildMeasureSpec(i11, this.f240219v.f240192f + getPaddingBottom(), layoutParams.height));
                        i21++;
                        it3 = it4;
                        list2 = list3;
                    }
                }
            }
        }
        int size7 = this.f240208k.size() - 1;
        int size8 = this.f240199a.size();
        Iterator it5 = this.f240199a.iterator();
        int i22 = 0;
        int i23 = 0;
        while (it5.hasNext()) {
            List list4 = (List) it5.next();
            int size9 = list4.size();
            Iterator it6 = list4.iterator();
            int i24 = 0;
            while (it6.hasNext()) {
                C88803an r2 = m143961r(getChildAt(((Integer) it6.next()).intValue()));
                if (r2 != null) {
                    boolean z3 = i23 == 0;
                    if (i23 == size7) {
                        i5 = size7;
                        z = true;
                    } else {
                        i5 = size7;
                        z = false;
                    }
                    if (this.f240216s != 0 || !z3) {
                        it = it5;
                        i8 = 0;
                    } else {
                        it = it5;
                        i8 = 1;
                    }
                    if (this.f240217t != 0 || !z) {
                        it2 = it6;
                        z2 = false;
                    } else {
                        it2 = it6;
                        z2 = true;
                    }
                    i7 = size9;
                    i6 = size8;
                    r2.mo82537f(new C88805ap(i22, i24, i8 | (true != z3 ? 0 : 4) | (true != z ? 0 : 8) | (true != z2 ? 0 : 2) | (i24 == size9 + -1 ? 16 : 0) | (i22 == size8 + -1 ? 32 : 0) | (i24 == 0 ? 64 : 0) | (i22 == 0 ? 128 : 0)));
                    i23++;
                } else {
                    i5 = size7;
                    i6 = size8;
                    it = it5;
                    it2 = it6;
                    i7 = size9;
                }
                i24++;
                size7 = i5;
                it5 = it;
                it6 = it2;
                size9 = i7;
                size8 = i6;
            }
            int i25 = size7;
            Iterator it7 = it5;
            i22++;
            size8 = size8;
        }
        C88770d dVar2 = this.f240219v;
        int q = m143960q(size, mode, dVar2.f240193g + dVar2.f240187a + dVar2.f240188b);
        C88770d dVar3 = this.f240219v;
        setMeasuredDimension(q, m143960q(size2, mode2, dVar3.f240194h + dVar3.f240189c + dVar3.f240190d));
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
