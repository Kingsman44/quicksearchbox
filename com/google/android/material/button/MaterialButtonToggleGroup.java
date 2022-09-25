package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2104s;
import androidx.core.p098j.p099a.C1989i;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44733be;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.p3515l.C44772c;
import com.google.android.material.p3515l.C44784o;
import com.google.android.material.p3515l.C44785p;
import com.google.android.material.theme.p3518a.C44965a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: a */
    public final LinkedHashSet f115983a;

    /* renamed from: b */
    public boolean f115984b;

    /* renamed from: c */
    private final List f115985c;

    /* renamed from: d */
    private final C44578h f115986d;

    /* renamed from: e */
    private final Comparator f115987e;

    /* renamed from: f */
    private Integer[] f115988f;

    /* renamed from: g */
    private boolean f115989g;

    /* renamed from: h */
    private boolean f115990h;

    /* renamed from: i */
    private final int f115991i;

    /* renamed from: j */
    private Set f115992j;

    public MaterialButtonToggleGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    private final int m78861d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (mo47575c(i)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: e */
    private final void m78862e() {
        LinearLayout.LayoutParams layoutParams;
        int d = m78861d();
        if (d != -1) {
            for (int i = d + 1; i < getChildCount(); i++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i);
                int min = Math.min(materialButton.mo47546f(), ((MaterialButton) getChildAt(i - 1)).mo47546f());
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    C2104s.m5793f(layoutParams, 0);
                    C2104s.m5794g(layoutParams, -min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    C2104s.m5794g(layoutParams, 0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && d != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(d)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                C2104s.m5793f(layoutParams3, 0);
                C2104s.m5794g(layoutParams3, 0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    /* renamed from: f */
    private final void m78863f(Set set) {
        Set set2 = this.f115992j;
        this.f115992j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            Integer valueOf = Integer.valueOf(id);
            boolean contains = set.contains(valueOf);
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f115984b = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f115984b = false;
            }
            if (set2.contains(valueOf) != set.contains(valueOf)) {
                boolean contains2 = set.contains(valueOf);
                Iterator it = this.f115983a.iterator();
                while (it.hasNext()) {
                    ((C44577g) it.next()).mo47592a(id, contains2);
                }
            }
        }
        invalidate();
    }

    /* renamed from: a */
    public final void mo47572a(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: -1");
            return;
        }
        HashSet hashSet = new HashSet(this.f115992j);
        if (z) {
            Integer valueOf = Integer.valueOf(i);
            if (!hashSet.contains(valueOf)) {
                if (this.f115989g && !hashSet.isEmpty()) {
                    hashSet.clear();
                }
                hashSet.add(valueOf);
            } else {
                return;
            }
        } else {
            Integer valueOf2 = Integer.valueOf(i);
            if (!hashSet.contains(valueOf2)) {
                return;
            }
            if (!this.f115990h || hashSet.size() > 1) {
                hashSet.remove(valueOf2);
            }
        }
        m78863f(hashSet);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        if (materialButton.getId() == -1) {
            materialButton.setId(C2043bi.m5574c());
        }
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        if (materialButton.mo47561q()) {
            materialButton.f115969b.f116009q = true;
        }
        materialButton.f115974g = this.f115986d;
        if (materialButton.mo47561q()) {
            C44573c cVar = materialButton.f115969b;
            cVar.f116006n = true;
            cVar.mo47590e();
        }
        mo47572a(materialButton.getId(), materialButton.f115973f);
        C44785p g = materialButton.mo47547g();
        this.f115985c.add(new C44576f(g.f116784f, g.f116787i, g.f116785g, g.f116786h));
        C2043bi.m5526T(materialButton, new C44575e(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo47574b() {
        C44576f fVar;
        int childCount = getChildCount();
        int d = m78861d();
        int i = -1;
        int childCount2 = getChildCount() - 1;
        while (true) {
            if (childCount2 >= 0) {
                if (mo47575c(childCount2)) {
                    i = childCount2;
                    break;
                }
                childCount2--;
            } else {
                break;
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            if (materialButton.getVisibility() != 8) {
                C44784o oVar = new C44784o(materialButton.mo47547g());
                C44576f fVar2 = (C44576f) this.f115985c.get(i2);
                if (d != i) {
                    int orientation = getOrientation();
                    if (i2 == d) {
                        if (orientation == 0) {
                            fVar2 = C44741bm.m79317j(this) ? C44576f.m78874b(fVar2) : C44576f.m78873a(fVar2);
                        } else {
                            C44772c cVar = fVar2.f116016b;
                            C44772c cVar2 = C44576f.f116015a;
                            fVar = new C44576f(cVar, cVar2, fVar2.f116017c, cVar2);
                        }
                    } else if (i2 != i) {
                        fVar2 = null;
                    } else if (orientation == 0) {
                        fVar2 = C44741bm.m79317j(this) ? C44576f.m78873a(fVar2) : C44576f.m78874b(fVar2);
                    } else {
                        C44772c cVar3 = C44576f.f116015a;
                        fVar = new C44576f(cVar3, fVar2.f116019e, cVar3, fVar2.f116018d);
                    }
                    fVar2 = fVar;
                }
                if (fVar2 == null) {
                    oVar.mo48146e(0.0f);
                } else {
                    oVar.f116771e = fVar2.f116016b;
                    oVar.f116774h = fVar2.f116019e;
                    oVar.f116772f = fVar2.f116017c;
                    oVar.f116773g = fVar2.f116018d;
                }
                materialButton.mo47555l(new C44785p(oVar));
            }
        }
    }

    /* renamed from: c */
    public final boolean mo47575c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f115987e);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f115988f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f115991i;
        if (i != -1) {
            m78863f(Collections.singleton(Integer.valueOf(i)));
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1991k kVar = new C1991k(accessibilityNodeInfo);
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && mo47575c(i2)) {
                i++;
            }
        }
        kVar.mo5154c(C1989i.m5331a(1, i, false, true != this.f115989g ? 2 : 1));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        mo47574b();
        m78862e();
        super.onMeasure(i, i2);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).f115974g = null;
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f115985c.remove(indexOfChild);
        }
        mo47574b();
        m78862e();
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    /* access modifiers changed from: protected */
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f115988f;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(C44965a.m79936a(context, attributeSet, i, 2132151772), attributeSet, i);
        this.f115985c = new ArrayList();
        this.f115986d = new C44578h(this);
        this.f115983a = new LinkedHashSet();
        this.f115987e = new C44574d(this);
        this.f115984b = false;
        this.f115992j = new HashSet();
        TypedArray a = C44733be.m79295a(getContext(), attributeSet, C44579i.f116022b, i, 2132151772, new int[0]);
        boolean z = a.getBoolean(2, false);
        if (this.f115989g != z) {
            this.f115989g = z;
            m78863f(new HashSet());
        }
        this.f115991i = a.getResourceId(0, -1);
        this.f115990h = a.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        a.recycle();
        C2043bi.m5551ae(this, 1);
    }
}
