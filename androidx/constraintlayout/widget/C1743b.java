package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.p079a.p082b.C1638f;
import androidx.constraintlayout.p079a.p082b.C1643k;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.widget.b */
/* compiled from: PG */
public class C1743b extends View {

    /* renamed from: c */
    public int[] f5224c = new int[32];

    /* renamed from: d */
    public int f5225d;

    /* renamed from: e */
    protected final Context f5226e;

    /* renamed from: f */
    protected String f5227f;

    /* renamed from: g */
    protected String f5228g;

    /* renamed from: h */
    protected final HashMap f5229h = new HashMap();

    /* renamed from: i */
    protected C1643k f5230i;

    public C1743b(Context context) {
        super(context);
        this.f5226e = context;
        mo4700a((AttributeSet) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059 A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m4762c(java.lang.String r6) {
        /*
            r5 = this;
            android.view.ViewParent r0 = r5.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r1 = 0
            if (r0 == 0) goto L_0x0010
            android.view.ViewParent r0 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            boolean r2 = r5.isInEditMode()
            r3 = 0
            if (r2 == 0) goto L_0x0029
            if (r0 == 0) goto L_0x0029
            java.lang.Object r2 = r0.mo4831K(r6)
            boolean r4 = r2 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x0029
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            if (r2 != 0) goto L_0x0034
            if (r0 == 0) goto L_0x0033
            int r2 = r5.mo4853h(r0, r6)
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 != 0) goto L_0x0043
            java.lang.Class<androidx.constraintlayout.widget.s> r0 = androidx.constraintlayout.widget.C1760s.class
            java.lang.reflect.Field r0 = r0.getField(r6)     // Catch:{ Exception -> 0x0041 }
            int r3 = r0.getInt(r1)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0044
        L_0x0041:
            goto L_0x0044
        L_0x0043:
            r3 = r2
        L_0x0044:
            if (r3 != 0) goto L_0x0059
            android.content.Context r0 = r5.f5226e
            android.content.res.Resources r0 = r0.getResources()
            android.content.Context r1 = r5.f5226e
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = "id"
            int r6 = r0.getIdentifier(r6, r2, r1)
            return r6
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C1743b.m4762c(java.lang.String):int");
    }

    /* renamed from: e */
    private final void m4763e(String str) {
        if (str != null && str.length() != 0 && this.f5226e != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int c = m4762c(trim);
            if (c != 0) {
                this.f5229h.put(Integer.valueOf(c), trim);
                m4764f(c);
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(trim).length() + 23);
            sb.append("Could not find id of \"");
            sb.append(trim);
            sb.append("\"");
            Log.w("ConstraintHelper", sb.toString());
        }
    }

    /* renamed from: f */
    private final void m4764f(int i) {
        if (i != getId()) {
            int i2 = this.f5225d;
            int[] iArr = this.f5224c;
            int length = iArr.length;
            if (i2 + 1 > length) {
                this.f5224c = Arrays.copyOf(iArr, length + length);
            }
            int[] iArr2 = this.f5224c;
            int i3 = this.f5225d;
            iArr2[i3] = i;
            this.f5225d = i3 + 1;
        }
    }

    /* renamed from: g */
    private final void m4765g(String str) {
        if (str != null && str.length() != 0 && this.f5226e != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof C1745d) && trim.equals(((C1745d) layoutParams).f5256Y)) {
                    if (childAt.getId() == -1) {
                        String simpleName = childAt.getClass().getSimpleName();
                        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 42);
                        sb.append("to use ConstraintTag view ");
                        sb.append(simpleName);
                        sb.append(" must have an ID");
                        Log.w("ConstraintHelper", sb.toString());
                    } else {
                        m4764f(childAt.getId());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4700a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1761t.f5460b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(35);
                    this.f5227f = string;
                    mo4856l(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(36);
                    this.f5228g = string2;
                    mo4857m(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public void mo4701b(C1751j jVar, C1643k kVar, C1745d dVar, SparseArray sparseArray) {
        int length;
        C1752k kVar2 = jVar.f5342e;
        int[] iArr = kVar2.f5383ak;
        int i = 0;
        if (iArr != null) {
            mo4858n(iArr);
        } else {
            String str = kVar2.f5384al;
            if (str != null) {
                if (str.length() > 0) {
                    String[] split = str.split(",");
                    getContext();
                    int[] iArr2 = new int[split.length];
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        length = split.length;
                        if (i2 >= length) {
                            break;
                        }
                        int c = m4762c(split[i2].trim());
                        if (c != 0) {
                            iArr2[i3] = c;
                            i3++;
                        }
                        i2++;
                    }
                    if (i3 != length) {
                        iArr2 = Arrays.copyOf(iArr2, i3);
                    }
                    kVar2.f5383ak = iArr2;
                } else {
                    kVar2.f5383ak = null;
                }
            }
        }
        if (kVar != null) {
            kVar.mo4667S();
            if (jVar.f5342e.f5383ak != null) {
                while (true) {
                    int[] iArr3 = jVar.f5342e.f5383ak;
                    if (i < iArr3.length) {
                        C1638f fVar = (C1638f) sparseArray.get(iArr3[i]);
                        if (fVar != null) {
                            kVar.mo4665Q(fVar);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo4703d(C1638f fVar, boolean z) {
    }

    /* renamed from: h */
    public final int mo4853h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || (resources = this.f5226e.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo4854i() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo4855j((ConstraintLayout) parent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo4855j(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f5225d; i++) {
            View C = constraintLayout.mo4824C(this.f5224c[i]);
            if (C != null) {
                C.setVisibility(visibility);
                if (elevation > 0.0f) {
                    C.setTranslationZ(C.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo4840k(ConstraintLayout constraintLayout) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo4856l(String str) {
        this.f5227f = str;
        if (str != null) {
            int i = 0;
            this.f5225d = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m4763e(str.substring(i));
                    return;
                } else {
                    m4763e(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo4857m(String str) {
        this.f5228g = str;
        if (str != null) {
            int i = 0;
            this.f5225d = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m4765g(str.substring(i));
                    return;
                } else {
                    m4765g(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo4858n(int[] iArr) {
        this.f5227f = null;
        this.f5225d = 0;
        for (int f : iArr) {
            m4764f(f);
        }
    }

    /* renamed from: o */
    public final void mo4859o() {
        if (this.f5230i != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C1745d) {
                ((C1745d) layoutParams).f5276ar = this.f5230i;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f5227f;
        if (str != null) {
            mo4856l(str);
        }
        String str2 = this.f5228g;
        if (str2 != null) {
            mo4857m(str2);
        }
    }

    public final void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* renamed from: p */
    public final int[] mo4861p() {
        return Arrays.copyOf(this.f5224c, this.f5225d);
    }

    /* renamed from: q */
    public void mo4842q() {
    }

    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f5227f == null) {
            m4764f(i);
        }
    }

    public C1743b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5226e = context;
        mo4700a(attributeSet);
    }

    public C1743b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5226e = context;
        mo4700a(attributeSet);
    }
}
