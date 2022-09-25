package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.Space;
import com.bumptech.glide.p291h.C5630q;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8249d.C106753d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8249d.C106756g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.shared.VerticallyResizeableLinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class ReorderingGridLayout extends GridLayout {

    /* renamed from: b */
    public static final /* synthetic */ int f297596b = 0;

    /* renamed from: c */
    private static final C59071e f297597c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.view.ReorderingGridLayout");

    /* renamed from: a */
    public boolean f297598a = false;

    /* renamed from: d */
    private Space f297599d = null;

    /* renamed from: e */
    private Space f297600e = null;

    /* renamed from: f */
    private final List f297601f = new ArrayList();

    /* renamed from: g */
    private final int f297602g;

    /* renamed from: h */
    private final C106796d f297603h = new C106796d(this);

    /* renamed from: i */
    private int f297604i;

    /* renamed from: j */
    private int f297605j;

    /* renamed from: k */
    private boolean f297606k = false;

    public ReorderingGridLayout(Context context) {
        super(context);
        this.f297602g = context.getResources().getDimensionPixelOffset(R.dimen.grid_layout_default_gap);
    }

    /* renamed from: b */
    private final int m177541b(C106795c cVar) {
        if (cVar == null) {
            return 0;
        }
        if (cVar.bottomMargin != Integer.MIN_VALUE) {
            return cVar.bottomMargin;
        }
        if (getUseDefaultMargins()) {
            return this.f297602g;
        }
        return 0;
    }

    /* renamed from: c */
    private static int m177542c(View view, int i) {
        View view2;
        if (!(view instanceof MeasuringViewSwitcher)) {
            return view.getMeasuredHeight();
        }
        MeasuringViewSwitcher measuringViewSwitcher = (MeasuringViewSwitcher) view;
        if (i == 2) {
            view2 = measuringViewSwitcher.getChildAt(0);
        } else {
            view2 = measuringViewSwitcher.getChildAt(1);
        }
        return view2.getMeasuredHeight();
    }

    /* renamed from: d */
    private static int m177543d(View view, boolean z) {
        if (!(view instanceof MeasuringViewSwitcher)) {
            return view.getMeasuredHeight();
        }
        C106795c cVar = (C106795c) view.getLayoutParams();
        return m177542c(view, z ? cVar.f297613b : cVar.f297614c);
    }

    /* renamed from: e */
    private final int m177544e(C106795c cVar) {
        if (cVar != null && cVar.topMargin != Integer.MIN_VALUE) {
            return cVar.topMargin;
        }
        if (getUseDefaultMargins()) {
            return this.f297602g;
        }
        return 0;
    }

    /* renamed from: f */
    private final void m177545f(int i, int i2) {
        super.onMeasure(i, i2);
        C59104x b = f297597c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "rgridlayout");
        ((C59052c) ((C59052c) b).mo56372aa(23217)).mo56386p("Calling super measure");
    }

    /* renamed from: g */
    private final void m177546g(int i, int i2, int i3, int i4, int i5, boolean z) {
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            C106795c cVar = (C106795c) childAt.getLayoutParams();
            boolean z2 = !this.f297598a;
            C106794b bVar = cVar.f297615d;
            if (!(bVar == null || cVar.f297616e == null)) {
                boolean z3 = (bVar.equals(cVar.f297617f) ^ true) || (cVar.f297616e.equals(cVar.f297618g) ^ true);
                C58976aa aaVar = C58975e.f156826a;
                C106794b bVar2 = cVar.f297615d;
                C5630q.m14607d(bVar2, "Argument must not be null");
                cVar.rowSpec = bVar2.mo95663a(z2);
                C106794b bVar3 = cVar.f297616e;
                C5630q.m14607d(bVar3, "Argument must not be null");
                cVar.columnSpec = bVar3.mo95663a(z2);
                cVar.f297617f = cVar.f297615d;
                cVar.f297618g = cVar.f297616e;
                cVar.f297615d = null;
                cVar.f297616e = null;
                if (z3) {
                    z = true;
                }
            }
            if (childAt instanceof MeasuringViewSwitcher) {
                C58976aa aaVar2 = C58975e.f156826a;
                MeasuringViewSwitcher measuringViewSwitcher = (MeasuringViewSwitcher) childAt;
                measuringViewSwitcher.setDisplayedChild(cVar.f297614c == 2 ? 0 : 1);
                measuringViewSwitcher.mo95654a(i3, i4, i5, true);
            }
        }
        if (z) {
            C58976aa aaVar3 = C58975e.f156826a;
            m177545f(i, i2);
        }
    }

    /* renamed from: h */
    private final void m177547h(int i, int i2, View view) {
        if (!(view instanceof Space)) {
            boolean z = i >= 0 && i2 >= i && this.f297606k;
            view.setVisibility(true != z ? 0 : 4);
            C106795c cVar = (C106795c) view.getLayoutParams();
            if (z) {
                cVar.mo95668c(0, 0.0f);
                cVar.mo95667b(0, 0, 0.0f);
                C58976aa aaVar = C58975e.f156826a;
            }
        }
    }

    /* renamed from: i */
    private final void m177548i(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C106793a.f297607a);
        this.f297606k = obtainStyledAttributes.getBoolean(0, false);
        this.f297598a = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: j */
    private final boolean m177549j(boolean z) {
        C106796d dVar;
        int i;
        boolean z2 = z;
        this.f297601f.clear();
        C58976aa aaVar = C58975e.f156826a;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        boolean z3 = false;
        boolean z4 = true;
        while (true) {
            dVar = this.f297603h;
            if (i2 >= dVar.f297624f) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C106795c cVar = (C106795c) childAt.getLayoutParams();
                int i9 = z2 ? cVar.f297613b : cVar.f297614c;
                cVar.mo95669d(i9);
                childAt.getMeasuredWidth();
                int c = m177542c(childAt, i9);
                if (cVar.f297612a < i9) {
                    this.f297601f.add(Integer.valueOf(i2));
                }
                z3 |= childAt instanceof VerticallyResizeableLinearLayout;
                if (i9 != 1 || !this.f297598a || i6 < 0) {
                    C106796d dVar2 = this.f297603h;
                    int i10 = dVar2.f297622d;
                    int i11 = i6;
                    int i12 = i10 + i9;
                    int i13 = i7;
                    int i14 = dVar2.f297623e;
                    if (i12 > i14 || z4) {
                        if (i10 >= i14 || z4) {
                            i5 = i8;
                            i6 = i11;
                            i7 = i13;
                        } else {
                            i6 = dVar2.f297621c;
                            i7 = i10;
                        }
                        dVar2.f297622d = i9;
                        if (!z4) {
                            dVar2.f297621c++;
                        }
                        int e = m177544e(cVar);
                        int b = m177541b(cVar);
                        this.f297603h.f297619a += c + b + e;
                        i8 = i5;
                    } else {
                        dVar2.f297622d = i12;
                        if (i5 >= 0) {
                            dVar2.f297619a += Math.abs(c - m177543d(getChildAt(i5), z2));
                        }
                        i6 = i11;
                        i7 = i13;
                    }
                    C106796d dVar3 = this.f297603h;
                    if (dVar3.f297619a > dVar3.f297620b) {
                        i3 += i9;
                        i = -1;
                        if (i4 == -1) {
                            i4 = dVar3.f297621c;
                        }
                    } else {
                        i = -1;
                    }
                    if (i2 != dVar3.f297624f + i || i9 != 2 || !this.f297598a || i6 < 0) {
                        cVar.mo95668c(dVar3.f297621c, 1.0f);
                        cVar.mo95667b(this.f297603h.f297622d - i9, i9, 1.0f);
                        m177547h(i4, this.f297603h.f297621c, childAt);
                    } else {
                        cVar.mo95668c(i6, 1.0f);
                        cVar.mo95667b(0, 2, 1.0f);
                        View childAt2 = getChildAt(i8);
                        C106795c cVar2 = (C106795c) childAt2.getLayoutParams();
                        cVar2.mo95668c(this.f297603h.f297621c, 1.0f);
                        cVar2.mo95667b(0, cVar2.f297614c, 1.0f);
                        m177547h(i4, i6, childAt);
                        m177547h(i4, this.f297603h.f297621c, childAt2);
                        int i15 = this.f297603h.f297621c;
                        int i16 = cVar2.f297614c;
                    }
                    C106796d dVar4 = this.f297603h;
                    int i17 = dVar4.f297621c;
                    int i18 = dVar4.f297622d;
                    i5 = i2;
                    z4 = false;
                } else {
                    cVar.mo95668c(i6, 1.0f);
                    cVar.mo95667b(i7, 1, 1.0f);
                    this.f297603h.f297619a += Math.abs(c - m177543d(getChildAt(i8), z2));
                    m177547h(i4, i6, childAt);
                    C106796d dVar5 = this.f297603h;
                    int i19 = dVar5.f297621c;
                    int i20 = dVar5.f297622d;
                    i6 = -1;
                    i7 = -1;
                    i8 = -1;
                }
            }
            i2++;
        }
        int i21 = dVar.f297619a;
        int i22 = dVar.f297620b;
        if (i3 == 0) {
            return true;
        }
        if (this.f297601f.isEmpty() && !z3) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private final boolean m177550k() {
        int i;
        C59104x b = f297597c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "rgridlayout");
        C106796d dVar = this.f297603h;
        ((C59052c) ((C59052c) b).mo56372aa(23266)).mo56393w("look for child to vertically resize, current childrenHeight:%d, current gridLayoutHeight:%d", dVar.f297619a, dVar.f297620b);
        for (int i2 = 0; i2 < this.f297603h.f297624f; i2++) {
            View childAt = getChildAt(i2);
            C106795c cVar = (C106795c) childAt.getLayoutParams();
            if (childAt instanceof VerticallyResizeableLinearLayout) {
                C59071e eVar = f297597c;
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "rgridlayout");
                ((C59052c) ((C59052c) b2).mo56372aa(23267)).mo56396z("verticallyResizeable child at idx:%d isActivated:%b", i2, childAt.isActivated());
                int measuredHeight = childAt.getMeasuredHeight();
                C106796d dVar2 = this.f297603h;
                int i3 = (dVar2.f297620b - dVar2.f297619a) + measuredHeight;
                C59104x b3 = eVar.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "rgridlayout");
                ((C59052c) ((C59052c) b3).mo56372aa(23268)).mo56393w("attempt to vertically resize to proposed size:%d, original size:%d", i3, measuredHeight);
                if (i3 > 0) {
                    int i4 = cVar.f297614c;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 0);
                    C106753d dVar3 = ((VerticallyResizeableLinearLayout) childAt).f297683a;
                    int i5 = -1;
                    if (dVar3 != null) {
                        C106756g gVar = dVar3.f297487a;
                        int size = View.MeasureSpec.getSize(makeMeasureSpec);
                        if (size >= 0) {
                            int paddingTop = gVar.f297497e.getPaddingTop() + gVar.f297497e.getPaddingBottom() + gVar.f297504l;
                            int i6 = size - paddingTop;
                            int i7 = C106756g.f297492a;
                            int max = Math.max(i6 / gVar.f297503k, 3);
                            C106756g.f297492a = max;
                            if (max < gVar.f297500h) {
                                gVar.f297498f.measure(View.MeasureSpec.makeMeasureSpec(gVar.f297497e.getMeasuredWidth(), LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(size, 0));
                                max = Math.max((i6 - gVar.f297505m) / gVar.f297503k, 3);
                                C106756g.f297492a = max;
                                i = gVar.f297505m;
                            } else {
                                i = 0;
                            }
                            int i8 = paddingTop + i + (gVar.f297503k * max);
                            if (i7 != max) {
                                gVar.mo95643e();
                                i5 = i8;
                            } else {
                                gVar.mo95644f();
                            }
                        }
                    }
                    boolean z = i5 > 0 && measuredHeight != i5;
                    C59104x b4 = eVar.mo56224b();
                    b4.mo56378ag(C58975e.f156826a, "rgridlayout");
                    ((C59052c) ((C59052c) b4).mo56372aa(23269)).mo56359L("verticallyResizeable child at idx:%d remeasured from %d to %d", Integer.valueOf(i2), Integer.valueOf(measuredHeight), Integer.valueOf(i5));
                    if (z) {
                        setColumnOrderPreserved(true);
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C106795c generateLayoutParams(AttributeSet attributeSet) {
        return new C106795c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = i2;
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (!this.f297606k || View.MeasureSpec.getMode(i2) != 0) {
                i5 = i9;
            } else {
                View.MeasureSpec.getSize(i2);
                i5 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), LinearLayoutManager.INVALID_OFFSET);
            }
            m177545f(i8, i5);
            if (View.MeasureSpec.getMode(i) != 1073741824 || (View.MeasureSpec.getSize(i) != 0 && (View.MeasureSpec.getMode(this.f297604i) != Integer.MIN_VALUE || (View.MeasureSpec.getSize(this.f297604i) <= View.MeasureSpec.getSize(i) && View.MeasureSpec.getSize(this.f297605j) <= View.MeasureSpec.getSize(i5))))) {
                int size = (View.MeasureSpec.getSize(i5) - getPaddingTop()) - getPaddingBottom();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i5));
                Space space = this.f297599d;
                C5630q.m14607d(space, "Argument must not be null");
                if (View.MeasureSpec.getSize(View.MeasureSpec.makeMeasureSpec(space.getMeasuredWidth(), 1073741824)) != 0) {
                    Space space2 = this.f297600e;
                    C5630q.m14607d(space2, "Argument must not be null");
                    if (View.MeasureSpec.getSize(View.MeasureSpec.makeMeasureSpec(space2.getMeasuredWidth(), 1073741824)) != 0) {
                        boolean z = false;
                        for (int i10 = 0; i10 < getChildCount(); i10++) {
                            z |= !(getChildAt(i10).getMeasuredWidth() <= getMeasuredWidth());
                        }
                        int measuredWidth = getMeasuredWidth();
                        int i11 = this.f297602g;
                        int i12 = i11 + i11;
                        int i13 = measuredWidth - i12;
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((i13 - i12) / 2, 1073741824);
                        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                        if (z) {
                            setColumnOrderPreserved(true);
                        } else {
                            int i14 = 0;
                            while (i14 < getChildCount()) {
                                try {
                                    View childAt = getChildAt(i14);
                                    if (childAt instanceof MeasuringViewSwitcher) {
                                        ((MeasuringViewSwitcher) childAt).mo95654a(makeMeasureSpec2, makeMeasureSpec3, makeMeasureSpec, false);
                                    }
                                    i14++;
                                } catch (Throwable th) {
                                    th = th;
                                    i4 = i;
                                    i3 = i2;
                                    this.f297604i = i4;
                                    this.f297605j = i3;
                                    throw th;
                                }
                            }
                            this.f297603h.mo95670a(size);
                            if (m177549j(true)) {
                                C106796d dVar = this.f297603h;
                                int i15 = dVar.f297619a;
                                int i16 = dVar.f297620b;
                                m177546g(i, i5, makeMeasureSpec2, makeMeasureSpec3, makeMeasureSpec, m177550k());
                            } else {
                                int i17 = this.f297603h.f297624f - 1;
                                while (i17 >= 0) {
                                    View childAt2 = getChildAt(i17);
                                    if (childAt2.getVisibility() != 8) {
                                        C106795c cVar = (C106795c) childAt2.getLayoutParams();
                                        C106796d dVar2 = this.f297603h;
                                        if (dVar2.f297619a <= dVar2.f297620b) {
                                            cVar.mo95669d(cVar.f297613b);
                                        } else {
                                            int i18 = cVar.f297612a;
                                            if (i18 < cVar.f297613b) {
                                                cVar.mo95669d(i18);
                                                int i19 = cVar.f297614c;
                                                int c = m177542c(childAt2, cVar.f297613b);
                                                int i20 = i17 - 1;
                                                if (i20 >= 0) {
                                                    try {
                                                        C106795c cVar2 = (C106795c) getChildAt(i20).getLayoutParams();
                                                        C106794b bVar = cVar2.f297616e;
                                                        C5630q.m14607d(bVar, "Argument must not be null");
                                                        if (bVar.f297609a == 0 && bVar.f297610b == 1) {
                                                            C5630q.m14607d(cVar2.f297615d, "Argument must not be null");
                                                            C106794b bVar2 = cVar.f297615d;
                                                            C5630q.m14607d(bVar2, "Argument must not be null");
                                                            C106794b bVar3 = cVar2.f297615d;
                                                            C5630q.m14607d(bVar3, "Argument must not be null");
                                                            bVar2.f297609a = bVar3.f297609a;
                                                            bVar.f297609a = 1;
                                                            this.f297603h.f297619a -= (c + m177544e(cVar)) + m177541b(cVar);
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        i3 = i2;
                                                        i4 = i8;
                                                        this.f297604i = i4;
                                                        this.f297605j = i3;
                                                        throw th;
                                                    }
                                                }
                                                int i21 = i17 + 1;
                                                if (i21 < this.f297603h.f297624f) {
                                                    C106795c cVar3 = (C106795c) getChildAt(i21).getLayoutParams();
                                                    int i22 = i17 + 2;
                                                    View childAt3 = i22 < this.f297603h.f297624f ? getChildAt(i22) : null;
                                                    if (childAt3 != null) {
                                                        C106794b bVar4 = ((C106795c) childAt3.getLayoutParams()).f297615d;
                                                        C5630q.m14607d(bVar4, "Argument must not be null");
                                                        i7 = bVar4.f297609a;
                                                    } else {
                                                        i7 = -1;
                                                    }
                                                    C106794b bVar5 = cVar3.f297616e;
                                                    C5630q.m14607d(bVar5, "Argument must not be null");
                                                    if (bVar5.f297610b == 1) {
                                                        C106794b bVar6 = cVar3.f297615d;
                                                        C5630q.m14607d(bVar6, "Argument must not be null");
                                                        if (bVar6.f297609a != i7) {
                                                            C5630q.m14607d(cVar.f297615d, "Argument must not be null");
                                                            C106794b bVar7 = cVar.f297615d;
                                                            C5630q.m14607d(bVar7, "Argument must not be null");
                                                            bVar6.f297609a = bVar7.f297609a;
                                                            bVar5.f297609a = 1;
                                                            this.f297603h.f297619a -= (c + m177544e(cVar)) + m177541b(cVar);
                                                        }
                                                    }
                                                }
                                                int c2 = m177542c(childAt2, cVar.f297612a);
                                                this.f297603h.f297619a -= c - c2;
                                            }
                                        }
                                    }
                                    i17--;
                                    i8 = i;
                                    i9 = i2;
                                }
                                C106796d dVar3 = this.f297603h;
                                if (dVar3.f297619a <= dVar3.f297620b || !m177550k()) {
                                    this.f297603h.mo95670a(size);
                                    m177549j(false);
                                    m177546g(i, i5, makeMeasureSpec2, makeMeasureSpec3, makeMeasureSpec, false);
                                    C106796d dVar4 = this.f297603h;
                                    int i23 = dVar4.f297619a;
                                    int i24 = dVar4.f297620b;
                                } else {
                                    setColumnOrderPreserved(true);
                                }
                            }
                        }
                    }
                }
                i6 = i;
                this.f297604i = i6;
                this.f297605j = i2;
            }
            i6 = i8;
            this.f297604i = i6;
            this.f297605j = i2;
        } catch (Throwable th3) {
            th = th3;
            i4 = i8;
            i3 = i9;
        }
    }

    public final void onViewAdded(View view) {
        C58976aa aaVar = C58975e.f156826a;
        if (view.getId() == R.id.one_column_space) {
            this.f297599d = (Space) view;
        } else if (view.getId() == R.id.two_column_space) {
            this.f297600e = (Space) view;
        }
        super.onViewAdded(view);
    }

    public final void onViewRemoved(View view) {
        C58976aa aaVar = C58975e.f156826a;
        super.onViewRemoved(view);
    }

    public ReorderingGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f297602g = context.getResources().getDimensionPixelOffset(R.dimen.grid_layout_default_gap);
        m177548i(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final GridLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C106795c(super.generateLayoutParams(layoutParams));
    }

    public ReorderingGridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f297602g = context.getResources().getDimensionPixelOffset(R.dimen.grid_layout_default_gap);
        m177548i(context, attributeSet);
    }

    public ReorderingGridLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f297602g = context.getResources().getDimensionPixelOffset(R.dimen.grid_layout_default_gap);
        m177548i(context, attributeSet);
    }
}
