package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.p084a.C1676b;
import androidx.constraintlayout.p079a.p080a.p081a.C1594d;
import androidx.constraintlayout.p079a.p080a.p081a.C1596f;
import androidx.constraintlayout.p079a.p080a.p081a.C1597g;
import androidx.constraintlayout.p079a.p082b.C1638f;
import androidx.constraintlayout.widget.C1747f;
import androidx.constraintlayout.widget.C1748g;
import androidx.constraintlayout.widget.C1749h;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.C1761t;
import androidx.constraintlayout.widget.C1763v;
import androidx.constraintlayout.widget.C1764w;
import androidx.constraintlayout.widget.C1765x;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p098j.C2008ab;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
public class MotionLayout extends ConstraintLayout implements C2008ab {

    /* renamed from: a */
    public static boolean f4817a;

    /* renamed from: A */
    public CopyOnWriteArrayList f4818A = null;

    /* renamed from: B */
    protected boolean f4819B = false;

    /* renamed from: C */
    int f4820C;

    /* renamed from: D */
    int f4821D;

    /* renamed from: E */
    int f4822E;

    /* renamed from: F */
    int f4823F;

    /* renamed from: G */
    int f4824G;

    /* renamed from: H */
    int f4825H;

    /* renamed from: I */
    float f4826I;

    /* renamed from: J */
    public C1741z f4827J;

    /* renamed from: K */
    public Runnable f4828K = null;

    /* renamed from: L */
    Rect f4829L;

    /* renamed from: M */
    C1739x f4830M;

    /* renamed from: N */
    ArrayList f4831N;

    /* renamed from: O */
    int f4832O;

    /* renamed from: ab */
    private long f4833ab = 0;

    /* renamed from: ac */
    private float f4834ac = 1.0f;

    /* renamed from: ad */
    private long f4835ad;

    /* renamed from: ae */
    private boolean f4836ae;

    /* renamed from: af */
    private boolean f4837af = false;

    /* renamed from: ag */
    private C1676b f4838ag = new C1676b();

    /* renamed from: ah */
    private C1737v f4839ah = new C1737v(this);

    /* renamed from: ai */
    private boolean f4840ai = false;

    /* renamed from: aj */
    private int f4841aj = 0;

    /* renamed from: ak */
    private long f4842ak = -1;

    /* renamed from: al */
    private float f4843al = 0.0f;

    /* renamed from: am */
    private int f4844am = 0;

    /* renamed from: an */
    private float f4845an = 0.0f;

    /* renamed from: ao */
    private C1597g f4846ao = new C1597g();

    /* renamed from: ap */
    private boolean f4847ap = false;

    /* renamed from: aq */
    private boolean f4848aq;

    /* renamed from: ar */
    private RectF f4849ar;

    /* renamed from: as */
    private View f4850as;

    /* renamed from: at */
    private Matrix f4851at;

    /* renamed from: b */
    C1707af f4852b;

    /* renamed from: c */
    Interpolator f4853c;

    /* renamed from: d */
    Interpolator f4854d = null;

    /* renamed from: e */
    float f4855e = 0.0f;

    /* renamed from: f */
    public int f4856f = -1;

    /* renamed from: g */
    int f4857g = -1;

    /* renamed from: h */
    public int f4858h = -1;

    /* renamed from: i */
    public int f4859i = 0;

    /* renamed from: j */
    public int f4860j = 0;

    /* renamed from: k */
    public boolean f4861k = true;

    /* renamed from: l */
    HashMap f4862l = new HashMap();

    /* renamed from: m */
    float f4863m = 0.0f;

    /* renamed from: n */
    float f4864n = 0.0f;

    /* renamed from: o */
    float f4865o = 0.0f;

    /* renamed from: p */
    boolean f4866p = false;

    /* renamed from: q */
    public C1702aa f4867q;

    /* renamed from: r */
    int f4868r = 0;

    /* renamed from: s */
    C1738w f4869s;

    /* renamed from: t */
    int f4870t;

    /* renamed from: u */
    int f4871u;

    /* renamed from: v */
    boolean f4872v = false;

    /* renamed from: w */
    float f4873w;

    /* renamed from: x */
    float f4874x;

    /* renamed from: y */
    long f4875y;

    /* renamed from: z */
    float f4876z;

    public MotionLayout(Context context) {
        super(context);
        new HashMap();
        this.f4829L = new Rect();
        this.f4832O = 1;
        this.f4830M = new C1739x(this);
        this.f4848aq = false;
        this.f4849ar = new RectF();
        this.f4850as = null;
        this.f4851at = null;
        this.f4831N = new ArrayList();
        m4587M((AttributeSet) null);
    }

    /* renamed from: L */
    private final void m4586L() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.f4867q != null || ((copyOnWriteArrayList = this.f4818A) != null && !copyOnWriteArrayList.isEmpty())) && this.f4845an != this.f4863m) {
            if (this.f4844am != -1) {
                C1702aa aaVar = this.f4867q;
                if (aaVar != null) {
                    aaVar.mo4748f();
                }
                CopyOnWriteArrayList copyOnWriteArrayList2 = this.f4818A;
                if (copyOnWriteArrayList2 != null) {
                    Iterator it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        ((C1702aa) it.next()).mo4748f();
                    }
                }
            }
            this.f4844am = -1;
            this.f4845an = this.f4863m;
            CopyOnWriteArrayList copyOnWriteArrayList3 = this.f4818A;
            if (copyOnWriteArrayList3 != null) {
                Iterator it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    ((C1702aa) it2.next()).mo4746c();
                }
            }
        }
    }

    /* renamed from: M */
    private final void m4587M(AttributeSet attributeSet) {
        C1707af afVar;
        AttributeSet attributeSet2 = attributeSet;
        f4817a = isInEditMode();
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet2, C1761t.f5470l);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = 2;
                if (index == 2) {
                    this.f4852b = new C1707af(getContext(), this, obtainStyledAttributes.getResourceId(2, -1));
                } else if (index == 1) {
                    this.f4857g = obtainStyledAttributes.getResourceId(1, -1);
                } else if (index == 4) {
                    this.f4865o = obtainStyledAttributes.getFloat(4, 0.0f);
                    this.f4866p = true;
                } else if (index == 0) {
                    z = obtainStyledAttributes.getBoolean(0, z);
                } else if (index == 5) {
                    if (this.f4868r == 0) {
                        if (true != obtainStyledAttributes.getBoolean(5, false)) {
                            i2 = 0;
                        }
                        this.f4868r = i2;
                    }
                } else if (index == 3) {
                    this.f4868r = obtainStyledAttributes.getInt(3, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.f4852b == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.f4852b = null;
            }
        }
        if (this.f4868r != 0) {
            C1707af afVar2 = this.f4852b;
            if (afVar2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int f = afVar2.mo4767f();
                C1756o n = afVar2.mo4775n(afVar2.mo4767f());
                String c = C1701a.m4620c(getContext(), f);
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    int id = childAt.getId();
                    if (id == -1) {
                        String name = childAt.getClass().getName();
                        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 45 + String.valueOf(name).length());
                        sb.append("CHECK: ");
                        sb.append(c);
                        sb.append(" ALL VIEWS SHOULD HAVE ID's ");
                        sb.append(name);
                        sb.append(" does not!");
                        Log.w("MotionLayout", sb.toString());
                        id = -1;
                    }
                    if (n.mo4886f(id) == null) {
                        String b = C1701a.m4619b(childAt);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c).length() + 27 + String.valueOf(b).length());
                        sb2.append("CHECK: ");
                        sb2.append(c);
                        sb2.append(" NO CONSTRAINTS for ");
                        sb2.append(b);
                        Log.w("MotionLayout", sb2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) n.f5457f.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[i4] = numArr[i4].intValue();
                }
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = iArr[i5];
                    String c2 = C1701a.m4620c(getContext(), i6);
                    if (findViewById(iArr[i5]) == null) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 27 + String.valueOf(c2).length());
                        sb3.append("CHECK: ");
                        sb3.append(c);
                        sb3.append(" NO View matches id ");
                        sb3.append(c2);
                        Log.w("MotionLayout", sb3.toString());
                    }
                    if (n.mo4883a(i6) == -1) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(c).length() + 26 + String.valueOf(c2).length());
                        sb4.append("CHECK: ");
                        sb4.append(c);
                        sb4.append("(");
                        sb4.append(c2);
                        sb4.append(") no LAYOUT_HEIGHT");
                        Log.w("MotionLayout", sb4.toString());
                    }
                    if (n.mo4884b(i6) == -1) {
                        StringBuilder sb5 = new StringBuilder(String.valueOf(c).length() + 26 + String.valueOf(c2).length());
                        sb5.append("CHECK: ");
                        sb5.append(c);
                        sb5.append("(");
                        sb5.append(c2);
                        sb5.append(") no LAYOUT_HEIGHT");
                        Log.w("MotionLayout", sb5.toString());
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                ArrayList arrayList = this.f4852b.f4920d;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    C1706ae aeVar = (C1706ae) arrayList.get(i7);
                    if (aeVar == this.f4852b.f4919c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (aeVar.f4902d == aeVar.f4901c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i8 = aeVar.f4902d;
                    int i9 = aeVar.f4901c;
                    String c3 = C1701a.m4620c(getContext(), i8);
                    String c4 = C1701a.m4620c(getContext(), i9);
                    if (sparseIntArray.get(i8) == i9) {
                        StringBuilder sb6 = new StringBuilder(String.valueOf(c3).length() + 53 + String.valueOf(c4).length());
                        sb6.append("CHECK: two transitions with the same start and end ");
                        sb6.append(c3);
                        sb6.append("->");
                        sb6.append(c4);
                        Log.e("MotionLayout", sb6.toString());
                    }
                    if (sparseIntArray2.get(i9) == i8) {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(c3).length() + 43 + String.valueOf(c4).length());
                        sb7.append("CHECK: you can't have reverse transitions");
                        sb7.append(c3);
                        sb7.append("->");
                        sb7.append(c4);
                        Log.e("MotionLayout", sb7.toString());
                    }
                    sparseIntArray.put(i8, i9);
                    sparseIntArray2.put(i9, i8);
                    if (this.f4852b.mo4775n(i8) == null) {
                        String valueOf = String.valueOf(c3);
                        Log.e("MotionLayout", valueOf.length() != 0 ? " no such constraintSetStart ".concat(valueOf) : new String(" no such constraintSetStart "));
                    }
                    if (this.f4852b.mo4775n(i9) == null) {
                        String valueOf2 = String.valueOf(c3);
                        Log.e("MotionLayout", valueOf2.length() != 0 ? " no such constraintSetEnd ".concat(valueOf2) : new String(" no such constraintSetEnd "));
                    }
                }
            }
        }
        if (this.f4857g == -1 && (afVar = this.f4852b) != null) {
            this.f4857g = afVar.mo4767f();
            this.f4856f = afVar.mo4767f();
            this.f4858h = afVar.mo4766e();
        }
    }

    /* renamed from: N */
    private final void m4588N() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.f4867q != null || ((copyOnWriteArrayList = this.f4818A) != null && !copyOnWriteArrayList.isEmpty())) {
            ArrayList arrayList = this.f4831N;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Integer num = (Integer) arrayList.get(i);
                C1702aa aaVar = this.f4867q;
                if (aaVar != null) {
                    num.intValue();
                    aaVar.mo4747e();
                }
                CopyOnWriteArrayList copyOnWriteArrayList2 = this.f4818A;
                if (copyOnWriteArrayList2 != null) {
                    Iterator it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        num.intValue();
                        ((C1702aa) it.next()).mo4747e();
                    }
                }
            }
            this.f4831N.clear();
        }
    }

    /* renamed from: O */
    private final boolean m4589O(float f, float f2, View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                if (m4589O((((float) childAt.getLeft()) + f) - ((float) view.getScrollX()), (((float) childAt.getTop()) + f2) - ((float) view.getScrollY()), childAt, motionEvent)) {
                    z2 = true;
                    break;
                }
            }
        }
        if (!z2) {
            this.f4849ar.set(f, f2, (((float) view.getRight()) + f) - ((float) view.getLeft()), (((float) view.getBottom()) + f2) - ((float) view.getTop()));
            if (motionEvent.getAction() != 0 || this.f4849ar.contains(motionEvent.getX(), motionEvent.getY())) {
                float f3 = -f;
                float f4 = -f2;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f3, f4);
                    z = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f3, -f4);
                } else {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(f3, f4);
                    if (this.f4851at == null) {
                        this.f4851at = new Matrix();
                    }
                    matrix.invert(this.f4851at);
                    obtain.transform(this.f4851at);
                    z = view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (z) {
                    return true;
                }
            }
        }
        return z2;
    }

    /* renamed from: A */
    public final void mo4712A(int i, View... viewArr) {
        C1707af afVar = this.f4852b;
        if (afVar != null) {
            C1716ao aoVar = afVar.f4930n;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = aoVar.f5008b;
            int size = arrayList2.size();
            C1714am amVar = null;
            for (int i2 = 0; i2 < size; i2++) {
                C1714am amVar2 = (C1714am) arrayList2.get(i2);
                if (amVar2.f4986a == i) {
                    for (int i3 = 0; i3 <= 0; i3++) {
                        View view = viewArr[i3];
                        if (amVar2.mo4787b(view)) {
                            arrayList.add(view);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                        MotionLayout motionLayout = aoVar.f5007a;
                        int i4 = motionLayout.f4857g;
                        if (amVar2.f4988c == 2) {
                            amVar2.mo4786a(aoVar, motionLayout, i4, (C1756o) null, viewArr2);
                        } else if (i4 == -1) {
                            String str = aoVar.f5010d;
                            String motionLayout2 = motionLayout.toString();
                            Log.w(str, motionLayout2.length() != 0 ? "No support for ViewTransition within transition yet. Currently: ".concat(motionLayout2) : new String("No support for ViewTransition within transition yet. Currently: "));
                        } else {
                            C1756o c = motionLayout.mo4716c(i4);
                            if (c != null) {
                                amVar2.mo4786a(aoVar, aoVar.f5007a, i4, c, viewArr2);
                            }
                        }
                        arrayList.clear();
                    }
                    amVar = amVar2;
                }
            }
            if (amVar == null) {
                Log.e(aoVar.f5010d, " Could not find ViewTransition");
                return;
            }
            return;
        }
        Log.e("MotionLayout", " no motionScene");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo4713B(int i) {
        if (i != 4 || this.f4857g != -1) {
            int i2 = this.f4832O;
            this.f4832O = i;
            if (i2 == 3) {
                if (i == 3) {
                    m4586L();
                }
                i2 = 3;
            }
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (i3 == 0 || i3 == 1) {
                if (i == 3) {
                    m4586L();
                }
                if (i == 4) {
                    mo4721l();
                }
            } else if (i3 == 2 && i == 4) {
                mo4721l();
            }
        }
    }

    /* renamed from: a */
    public final Rect mo4714a(C1638f fVar) {
        this.f4829L.top = fVar.mo4633k();
        this.f4829L.left = fVar.mo4632j();
        Rect rect = this.f4829L;
        rect.right = fVar.mo4631i() + rect.left;
        Rect rect2 = this.f4829L;
        rect2.bottom = fVar.mo4630h() + rect2.top;
        return this.f4829L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1733r mo4715b(int i) {
        return (C1733r) this.f4862l.get(findViewById(i));
    }

    /* renamed from: c */
    public final C1756o mo4716c(int i) {
        C1707af afVar = this.f4852b;
        if (afVar == null) {
            return null;
        }
        return afVar.mo4775n(i);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* renamed from: d */
    public final void mo1848d(View view, int i, int i2, int[] iArr, int i3) {
        C1706ae aeVar;
        ? r1;
        C1710ai aiVar;
        float f;
        float f2;
        C1710ai aiVar2;
        C1710ai aiVar3;
        C1710ai aiVar4;
        int i4;
        View view2 = view;
        int i5 = i;
        int i6 = i2;
        C1707af afVar = this.f4852b;
        if (afVar != null && (aeVar = afVar.f4919c) != null && aeVar.mo4760a()) {
            int i7 = -1;
            if (!aeVar.mo4760a() || (aiVar4 = aeVar.f4910l) == null || (i4 = aiVar4.f4946c) == -1 || view.getId() == i4) {
                C1706ae aeVar2 = afVar.f4919c;
                if (!(aeVar2 == null || (aiVar3 = aeVar2.f4910l) == null || !aiVar3.f4963t)) {
                    C1710ai aiVar5 = aeVar.f4910l;
                    if (!(aiVar5 == null || (aiVar5.f4965v & 4) == 0)) {
                        i7 = i6;
                    }
                    float f3 = this.f4863m;
                    if ((f3 == 1.0f || f3 == 0.0f) && view2.canScrollVertically(i7)) {
                        return;
                    }
                }
                C1710ai aiVar6 = aeVar.f4910l;
                if (!(aiVar6 == null || (aiVar6.f4965v & 1) == 0)) {
                    float f4 = (float) i5;
                    float f5 = (float) i6;
                    C1706ae aeVar3 = afVar.f4919c;
                    if (aeVar3 == null || (aiVar2 = aeVar3.f4910l) == null) {
                        f2 = 0.0f;
                    } else {
                        MotionLayout motionLayout = aiVar2.f4960q;
                        float f6 = motionLayout.f4864n;
                        motionLayout.mo4722m(aiVar2.f4945b, f6, aiVar2.f4948e, aiVar2.f4947d, aiVar2.f4956m);
                        float f7 = aiVar2.f4953j;
                        float f8 = 1.0E-7f;
                        if (f7 != 0.0f) {
                            float[] fArr = aiVar2.f4956m;
                            float f9 = fArr[0];
                            if (f9 == 0.0f) {
                                fArr[0] = 1.0E-7f;
                            } else {
                                f8 = f9;
                            }
                            f2 = (f4 * f7) / f8;
                        } else {
                            float[] fArr2 = aiVar2.f4956m;
                            float f10 = fArr2[1];
                            if (f10 == 0.0f) {
                                fArr2[1] = 1.0E-7f;
                            } else {
                                f8 = f10;
                            }
                            f2 = (f5 * aiVar2.f4954k) / f8;
                        }
                    }
                    float f11 = this.f4864n;
                    if ((f11 <= 0.0f && f2 < 0.0f) || (f11 >= 1.0f && f2 > 0.0f)) {
                        view2.setNestedScrollingEnabled(false);
                        view2.post(new C1736u(view2));
                        return;
                    }
                }
                float f12 = this.f4863m;
                float f13 = (float) i5;
                long nanoTime = System.nanoTime();
                this.f4873w = f13;
                float f14 = (float) i6;
                this.f4874x = f14;
                double d = (double) (nanoTime - this.f4875y);
                Double.isNaN(d);
                this.f4876z = (float) (d * 1.0E-9d);
                this.f4875y = nanoTime;
                C1706ae aeVar4 = afVar.f4919c;
                if (!(aeVar4 == null || (aiVar = aeVar4.f4910l) == null)) {
                    MotionLayout motionLayout2 = aiVar.f4960q;
                    float f15 = motionLayout2.f4864n;
                    if (!aiVar.f4955l) {
                        aiVar.f4955l = true;
                        motionLayout2.mo4735q(f15);
                    }
                    aiVar.f4960q.mo4722m(aiVar.f4945b, f15, aiVar.f4948e, aiVar.f4947d, aiVar.f4956m);
                    float f16 = aiVar.f4953j;
                    float[] fArr3 = aiVar.f4956m;
                    if (((double) Math.abs((f16 * fArr3[0]) + (aiVar.f4954k * fArr3[1]))) < 0.01d) {
                        float[] fArr4 = aiVar.f4956m;
                        fArr4[0] = 0.01f;
                        fArr4[1] = 0.01f;
                    }
                    float f17 = aiVar.f4953j;
                    if (f17 != 0.0f) {
                        f = (f13 * f17) / aiVar.f4956m[0];
                    } else {
                        f = (f14 * aiVar.f4954k) / aiVar.f4956m[1];
                    }
                    float max = Math.max(Math.min(f15 + f, 1.0f), 0.0f);
                    MotionLayout motionLayout3 = aiVar.f4960q;
                    if (max != motionLayout3.f4864n) {
                        motionLayout3.mo4735q(max);
                    }
                }
                if (f12 != this.f4863m) {
                    iArr[0] = i5;
                    r1 = 1;
                    iArr[1] = i6;
                } else {
                    r1 = 1;
                }
                mo4720k(false);
                if (iArr[0] != 0 || iArr[r1] != 0) {
                    this.f4872v = r1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchDraw(android.graphics.Canvas r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = 0
            r0.mo4720k(r2)
            androidx.constraintlayout.motion.widget.af r3 = r0.f4852b
            r4 = 0
            if (r3 == 0) goto L_0x003d
            androidx.constraintlayout.motion.widget.ao r3 = r3.f4930n
            java.util.ArrayList r5 = r3.f5011e
            if (r5 != 0) goto L_0x0014
            goto L_0x003d
        L_0x0014:
            int r6 = r5.size()
            r7 = 0
        L_0x0019:
            if (r7 >= r6) goto L_0x0027
            java.lang.Object r8 = r5.get(r7)
            androidx.constraintlayout.motion.widget.al r8 = (androidx.constraintlayout.motion.widget.C1713al) r8
            r8.mo4784a()
            int r7 = r7 + 1
            goto L_0x0019
        L_0x0027:
            java.util.ArrayList r5 = r3.f5011e
            java.util.ArrayList r6 = r3.f5012f
            r5.removeAll(r6)
            java.util.ArrayList r5 = r3.f5012f
            r5.clear()
            java.util.ArrayList r5 = r3.f5011e
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x003d
            r3.f5011e = r4
        L_0x003d:
            super.dispatchDraw(r31)
            androidx.constraintlayout.motion.widget.af r3 = r0.f4852b
            if (r3 != 0) goto L_0x0045
            return
        L_0x0045:
            int r3 = r0.f4868r
            r5 = 1
            r3 = r3 & r5
            if (r3 != r5) goto L_0x012f
            boolean r3 = r30.isInEditMode()
            if (r3 != 0) goto L_0x012f
            int r3 = r0.f4841aj
            int r3 = r3 + r5
            r0.f4841aj = r3
            long r6 = java.lang.System.nanoTime()
            long r8 = r0.f4842ak
            r10 = -1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0083
            long r8 = r6 - r8
            r10 = 200000000(0xbebc200, double:9.8813129E-316)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x0085
            int r3 = r0.f4841aj
            float r3 = (float) r3
            float r8 = (float) r8
            r9 = 814313567(0x3089705f, float:1.0E-9)
            float r8 = r8 * r9
            float r3 = r3 / r8
            r8 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r8
            int r3 = (int) r3
            float r3 = (float) r3
            float r3 = r3 / r8
            r0.f4843al = r3
            r0.f4841aj = r2
            r0.f4842ak = r6
            goto L_0x0085
        L_0x0083:
            r0.f4842ak = r6
        L_0x0085:
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r6 = 1109917696(0x42280000, float:42.0)
            r3.setTextSize(r6)
            float r6 = r0.f4864n
            r7 = 1148846080(0x447a0000, float:1000.0)
            float r6 = r6 * r7
            int r6 = (int) r6
            float r6 = (float) r6
            r7 = 1092616192(0x41200000, float:10.0)
            float r6 = r6 / r7
            float r8 = r0.f4843al
            int r9 = r0.f4856f
            java.lang.String r9 = androidx.constraintlayout.motion.widget.C1701a.m4621d(r0, r9)
            java.lang.String r10 = java.lang.String.valueOf(r9)
            int r10 = r10.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r10 = r10 + 24
            r11.<init>(r10)
            r11.append(r8)
            java.lang.String r8 = " fps "
            r11.append(r8)
            r11.append(r9)
            java.lang.String r8 = " -> "
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            int r9 = r0.f4858h
            java.lang.String r9 = androidx.constraintlayout.motion.widget.C1701a.m4621d(r0, r9)
            int r10 = r0.f4857g
            r11 = -1
            if (r10 != r11) goto L_0x00d3
            java.lang.String r10 = "undefined"
            goto L_0x00d7
        L_0x00d3:
            java.lang.String r10 = androidx.constraintlayout.motion.widget.C1701a.m4621d(r0, r10)
        L_0x00d7:
            java.lang.String r11 = java.lang.String.valueOf(r9)
            int r11 = r11.length()
            java.lang.String r12 = java.lang.String.valueOf(r10)
            int r12 = r12.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r14 = r8.length()
            int r14 = r14 + 36
            int r14 = r14 + r11
            int r14 = r14 + r12
            r13.<init>(r14)
            r13.append(r8)
            r13.append(r9)
            java.lang.String r8 = " (progress: "
            r13.append(r8)
            r13.append(r6)
            java.lang.String r6 = " ) state="
            r13.append(r6)
            r13.append(r10)
            java.lang.String r6 = r13.toString()
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r8)
            int r8 = r30.getHeight()
            int r8 = r8 + -29
            float r8 = (float) r8
            r9 = 1093664768(0x41300000, float:11.0)
            r1.drawText(r6, r9, r8, r3)
            r8 = -7864184(0xffffffffff880088, float:NaN)
            r3.setColor(r8)
            int r8 = r30.getHeight()
            int r8 = r8 + -30
            float r8 = (float) r8
            r1.drawText(r6, r7, r8, r3)
        L_0x012f:
            int r3 = r0.f4868r
            if (r3 <= r5) goto L_0x050a
            androidx.constraintlayout.motion.widget.w r3 = r0.f4869s
            if (r3 != 0) goto L_0x013e
            androidx.constraintlayout.motion.widget.w r3 = new androidx.constraintlayout.motion.widget.w
            r3.<init>(r0)
            r0.f4869s = r3
        L_0x013e:
            androidx.constraintlayout.motion.widget.w r3 = r0.f4869s
            java.util.HashMap r6 = r0.f4862l
            androidx.constraintlayout.motion.widget.af r7 = r0.f4852b
            int r7 = r7.mo4765d()
            int r8 = r0.f4868r
            if (r6 == 0) goto L_0x050a
            int r9 = r6.size()
            if (r9 != 0) goto L_0x0154
            goto L_0x050a
        L_0x0154:
            r31.save()
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r3.f5183o
            r9.isInEditMode()
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L_0x0164:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x0506
            java.lang.Object r9 = r6.next()
            androidx.constraintlayout.motion.widget.r r9 = (androidx.constraintlayout.motion.widget.C1733r) r9
            androidx.constraintlayout.motion.widget.ab r10 = r9.f5142e
            int r10 = r10.f4879c
            java.util.ArrayList r11 = r9.f5154q
            int r12 = r11.size()
            r13 = 0
        L_0x017b:
            if (r13 >= r12) goto L_0x018c
            java.lang.Object r14 = r11.get(r13)
            androidx.constraintlayout.motion.widget.ab r14 = (androidx.constraintlayout.motion.widget.C1703ab) r14
            int r14 = r14.f4879c
            int r10 = java.lang.Math.max(r10, r14)
            int r13 = r13 + 1
            goto L_0x017b
        L_0x018c:
            androidx.constraintlayout.motion.widget.ab r11 = r9.f5143f
            int r11 = r11.f4879c
            int r10 = java.lang.Math.max(r10, r11)
            if (r8 <= 0) goto L_0x0199
            if (r10 != 0) goto L_0x0199
            r10 = 1
        L_0x0199:
            if (r10 == 0) goto L_0x04fc
            float[] r15 = r3.f5171c
            int[] r11 = r3.f5170b
            androidx.constraintlayout.a.a.a.d[] r12 = r9.f5146i
            r12 = r12[r2]
            double[] r14 = r12.mo4519d()
            java.util.ArrayList r12 = r9.f5154q
            int r13 = r12.size()
            r4 = 0
            r16 = 0
        L_0x01b0:
            if (r4 >= r13) goto L_0x01c6
            int r17 = r16 + 1
            java.lang.Object r18 = r12.get(r4)
            r5 = r18
            androidx.constraintlayout.motion.widget.ab r5 = (androidx.constraintlayout.motion.widget.C1703ab) r5
            int r5 = r5.f4892p
            r11[r16] = r5
            int r4 = r4 + 1
            r16 = r17
            r5 = 1
            goto L_0x01b0
        L_0x01c6:
            r4 = 0
            r5 = 0
        L_0x01c8:
            int r11 = r14.length
            if (r4 >= r11) goto L_0x01f5
            androidx.constraintlayout.a.a.a.d[] r11 = r9.f5146i
            r11 = r11[r2]
            r12 = r14[r4]
            double[] r2 = r9.f5152o
            r11.mo4516a(r12, r2)
            androidx.constraintlayout.motion.widget.ab r11 = r9.f5142e
            r12 = r14[r4]
            int[] r2 = r9.f5151n
            double[] r0 = r9.f5152o
            r19 = r14
            r14 = r2
            r2 = r15
            r15 = r0
            r16 = r2
            r17 = r5
            r11.mo4751b(r12, r14, r15, r16, r17)
            int r5 = r5 + 2
            int r4 = r4 + 1
            r0 = r30
            r15 = r2
            r14 = r19
            r2 = 0
            goto L_0x01c8
        L_0x01f5:
            int r5 = r5 / 2
            r3.f5180l = r5
            if (r10 <= 0) goto L_0x04f7
            int r0 = r7 / 16
            float[] r2 = r3.f5169a
            if (r2 == 0) goto L_0x0206
            int r2 = r2.length
            int r4 = r0 + r0
            if (r2 == r4) goto L_0x0213
        L_0x0206:
            int r2 = r0 + r0
            float[] r2 = new float[r2]
            r3.f5169a = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r3.f5172d = r2
        L_0x0213:
            int r2 = r3.f5182n
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.translate(r2, r2)
            android.graphics.Paint r4 = r3.f5173e
            r5 = 1996488704(0x77000000, float:2.5961484E33)
            r4.setColor(r5)
            android.graphics.Paint r4 = r3.f5177i
            r4.setColor(r5)
            android.graphics.Paint r4 = r3.f5174f
            r4.setColor(r5)
            android.graphics.Paint r4 = r3.f5175g
            r4.setColor(r5)
            float[] r4 = r3.f5169a
            int r5 = r0 + -1
            float r5 = (float) r5
            float r5 = r2 / r5
            java.util.HashMap r11 = r9.f5157t
            java.lang.String r12 = "translationX"
            if (r11 != 0) goto L_0x023f
            r15 = 0
            goto L_0x0246
        L_0x023f:
            java.lang.Object r11 = r11.get(r12)
            androidx.constraintlayout.a.a.a.q r11 = (androidx.constraintlayout.p079a.p080a.p081a.C1607q) r11
            r15 = r11
        L_0x0246:
            java.util.HashMap r11 = r9.f5157t
            java.lang.String r13 = "translationY"
            if (r11 != 0) goto L_0x024e
            r14 = 0
            goto L_0x0255
        L_0x024e:
            java.lang.Object r11 = r11.get(r13)
            androidx.constraintlayout.a.a.a.q r11 = (androidx.constraintlayout.p079a.p080a.p081a.C1607q) r11
            r14 = r11
        L_0x0255:
            java.util.HashMap r11 = r9.f5158u
            if (r11 != 0) goto L_0x025b
            r12 = 0
            goto L_0x0262
        L_0x025b:
            java.lang.Object r11 = r11.get(r12)
            androidx.constraintlayout.motion.a.p r11 = (androidx.constraintlayout.motion.p084a.C1690p) r11
            r12 = r11
        L_0x0262:
            java.util.HashMap r11 = r9.f5158u
            if (r11 != 0) goto L_0x0268
            r13 = 0
            goto L_0x026f
        L_0x0268:
            java.lang.Object r11 = r11.get(r13)
            androidx.constraintlayout.motion.a.p r11 = (androidx.constraintlayout.motion.p084a.C1690p) r11
            r13 = r11
        L_0x026f:
            r11 = 0
        L_0x0270:
            r16 = 2143289344(0x7fc00000, float:NaN)
            r17 = 0
            if (r11 >= r0) goto L_0x038f
            float r2 = (float) r11
            float r2 = r2 * r5
            r20 = r0
            float r0 = r9.f5150m
            r19 = 1065353216(0x3f800000, float:1.0)
            int r21 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r21 == 0) goto L_0x02a5
            r21 = r5
            float r5 = r9.f5149l
            int r22 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r22 >= 0) goto L_0x028c
            r2 = 0
        L_0x028c:
            int r22 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r23 = r6
            if (r22 <= 0) goto L_0x02a9
            r22 = r7
            double r6 = (double) r2
            r24 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r26 = (r6 > r24 ? 1 : (r6 == r24 ? 0 : -1))
            if (r26 >= 0) goto L_0x02ab
            float r2 = r2 - r5
            float r2 = r2 * r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r2, r0)
            goto L_0x02ad
        L_0x02a5:
            r21 = r5
            r23 = r6
        L_0x02a9:
            r22 = r7
        L_0x02ab:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x02ad:
            double r5 = (double) r2
            androidx.constraintlayout.motion.widget.ab r7 = r9.f5142e
            androidx.constraintlayout.a.a.a.f r7 = r7.f4878b
            java.util.ArrayList r0 = r9.f5154q
            r24 = r5
            int r5 = r0.size()
            r6 = 0
        L_0x02bb:
            if (r6 >= r5) goto L_0x02eb
            java.lang.Object r26 = r0.get(r6)
            r27 = r0
            r0 = r26
            androidx.constraintlayout.motion.widget.ab r0 = (androidx.constraintlayout.motion.widget.C1703ab) r0
            r26 = r5
            androidx.constraintlayout.a.a.a.f r5 = r0.f4878b
            if (r5 == 0) goto L_0x02e4
            r28 = r5
            float r5 = r0.f4880d
            int r29 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r29 >= 0) goto L_0x02da
            r17 = r5
            r7 = r28
            goto L_0x02e4
        L_0x02da:
            boolean r5 = java.lang.Float.isNaN(r16)
            if (r5 == 0) goto L_0x02e4
            float r0 = r0.f4880d
            r16 = r0
        L_0x02e4:
            int r6 = r6 + 1
            r5 = r26
            r0 = r27
            goto L_0x02bb
        L_0x02eb:
            if (r7 == 0) goto L_0x0309
            boolean r0 = java.lang.Float.isNaN(r16)
            r5 = 1
            if (r5 == r0) goto L_0x02f5
            goto L_0x02f7
        L_0x02f5:
            r16 = 1065353216(0x3f800000, float:1.0)
        L_0x02f7:
            float r16 = r16 - r17
            float r0 = r2 - r17
            float r0 = r0 / r16
            double r5 = (double) r0
            double r5 = r7.mo4521a(r5)
            float r0 = (float) r5
            float r0 = r0 * r16
            float r0 = r0 + r17
            double r5 = (double) r0
            goto L_0x030b
        L_0x0309:
            r5 = r24
        L_0x030b:
            androidx.constraintlayout.a.a.a.d[] r0 = r9.f5146i
            r7 = 0
            r0 = r0[r7]
            double[] r7 = r9.f5152o
            r0.mo4516a(r5, r7)
            androidx.constraintlayout.a.a.a.d r0 = r9.f5147j
            if (r0 == 0) goto L_0x0324
            double[] r7 = r9.f5152o
            r24 = r8
            int r8 = r7.length
            if (r8 <= 0) goto L_0x0326
            r0.mo4516a(r5, r7)
            goto L_0x0326
        L_0x0324:
            r24 = r8
        L_0x0326:
            int r0 = r11 + r11
            androidx.constraintlayout.motion.widget.ab r7 = r9.f5142e
            int[] r8 = r9.f5151n
            r25 = r15
            double[] r15 = r9.f5152o
            r26 = r11
            r11 = r7
            r7 = r12
            r1 = r13
            r12 = r5
            r5 = r14
            r14 = r8
            r6 = r25
            r16 = r4
            r17 = r0
            r11.mo4751b(r12, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0350
            r8 = r4[r0]
            androidx.constraintlayout.a.a.a.i r11 = r7.f4415a
            double r11 = r11.mo4526a(r2)
            float r11 = (float) r11
            float r8 = r8 + r11
            r4[r0] = r8
            goto L_0x035b
        L_0x0350:
            if (r6 == 0) goto L_0x035b
            r8 = r4[r0]
            float r11 = r6.mo4534a(r2)
            float r8 = r8 + r11
            r4[r0] = r8
        L_0x035b:
            if (r1 == 0) goto L_0x036c
            int r0 = r0 + 1
            r8 = r4[r0]
            androidx.constraintlayout.a.a.a.i r11 = r1.f4415a
            double r11 = r11.mo4526a(r2)
            float r2 = (float) r11
            float r8 = r8 + r2
            r4[r0] = r8
            goto L_0x0379
        L_0x036c:
            if (r5 == 0) goto L_0x0379
            int r0 = r0 + 1
            r8 = r4[r0]
            float r2 = r5.mo4534a(r2)
            float r8 = r8 + r2
            r4[r0] = r8
        L_0x0379:
            int r11 = r26 + 1
            r13 = r1
            r14 = r5
            r15 = r6
            r12 = r7
            r0 = r20
            r5 = r21
            r7 = r22
            r6 = r23
            r8 = r24
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = r31
            goto L_0x0270
        L_0x038f:
            r23 = r6
            r22 = r7
            r24 = r8
            int r0 = r3.f5180l
            r1 = r31
            r3.mo4815a(r1, r10, r0, r9)
            android.graphics.Paint r0 = r3.f5173e
            r2 = -21965(0xffffffffffffaa33, float:NaN)
            r0.setColor(r2)
            android.graphics.Paint r0 = r3.f5174f
            r2 = -2067046(0xffffffffffe0759a, float:NaN)
            r0.setColor(r2)
            android.graphics.Paint r0 = r3.f5177i
            r0.setColor(r2)
            android.graphics.Paint r0 = r3.f5175g
            r2 = -13391360(0xffffffffff33aa00, float:-2.388145E38)
            r0.setColor(r2)
            int r0 = r3.f5182n
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.translate(r0, r0)
            int r0 = r3.f5180l
            r3.mo4815a(r1, r10, r0, r9)
            r0 = 5
            if (r10 != r0) goto L_0x04ee
            android.graphics.Path r2 = r3.f5172d
            r2.reset()
            r7 = 0
        L_0x03cd:
            r2 = 50
            if (r7 > r2) goto L_0x04b6
            float[] r2 = r3.f5178j
            float r5 = (float) r7
            r6 = 1112014848(0x42480000, float:50.0)
            float r5 = r5 / r6
            r6 = 0
            float r5 = r9.mo4806a(r5, r6)
            androidx.constraintlayout.a.a.a.d[] r8 = r9.f5146i
            r10 = 0
            r8 = r8[r10]
            double r10 = (double) r5
            double[] r5 = r9.f5152o
            r8.mo4516a(r10, r5)
            androidx.constraintlayout.motion.widget.ab r5 = r9.f5142e
            int[] r8 = r9.f5151n
            double[] r10 = r9.f5152o
            float r11 = r5.f4882f
            float r12 = r5.f4883g
            float r13 = r5.f4884h
            float r14 = r5.f4885i
            r15 = 0
        L_0x03f6:
            int r6 = r8.length
            r0 = 2
            if (r15 >= r6) goto L_0x041e
            r6 = r5
            r4 = r10[r15]
            float r4 = (float) r4
            r5 = r8[r15]
            r26 = r4
            r4 = 1
            if (r5 == r4) goto L_0x0417
            if (r5 == r0) goto L_0x0414
            r0 = 3
            if (r5 == r0) goto L_0x0411
            r0 = 4
            if (r5 == r0) goto L_0x040e
            goto L_0x0419
        L_0x040e:
            r14 = r26
            goto L_0x0419
        L_0x0411:
            r13 = r26
            goto L_0x0419
        L_0x0414:
            r12 = r26
            goto L_0x0419
        L_0x0417:
            r11 = r26
        L_0x0419:
            int r15 = r15 + 1
            r5 = r6
            r0 = 5
            goto L_0x03f6
        L_0x041e:
            r6 = r5
            androidx.constraintlayout.motion.widget.r r4 = r6.f4890n
            if (r4 == 0) goto L_0x0450
            double r4 = (double) r11
            double r10 = (double) r12
            double r26 = java.lang.Math.sin(r10)
            java.lang.Double.isNaN(r4)
            double r26 = r26 * r4
            r28 = 0
            double r26 = r26 + r28
            r6 = 1073741824(0x40000000, float:2.0)
            float r8 = r13 / r6
            double r0 = (double) r8
            java.lang.Double.isNaN(r0)
            double r0 = r26 - r0
            float r0 = (float) r0
            double r10 = java.lang.Math.cos(r10)
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r10
            double r4 = -r4
            float r1 = r14 / r6
            double r10 = (double) r1
            java.lang.Double.isNaN(r10)
            double r4 = r4 - r10
            float r12 = (float) r4
            r11 = r0
        L_0x0450:
            java.lang.Float.isNaN(r16)
            java.lang.Float.isNaN(r16)
            float r0 = r11 + r17
            float r1 = r12 + r17
            float r11 = r11 + r13
            float r11 = r11 + r17
            float r12 = r12 + r14
            float r12 = r12 + r17
            r4 = 0
            r2[r4] = r0
            r4 = 1
            r2[r4] = r1
            r4 = 2
            r2[r4] = r11
            r4 = 3
            r2[r4] = r1
            r1 = 4
            r2[r1] = r11
            r1 = 5
            r2[r1] = r12
            r1 = 6
            r2[r1] = r0
            r0 = 7
            r2[r0] = r12
            android.graphics.Path r2 = r3.f5172d
            float[] r4 = r3.f5178j
            r5 = 0
            r6 = r4[r5]
            r8 = 1
            r4 = r4[r8]
            r2.moveTo(r6, r4)
            android.graphics.Path r2 = r3.f5172d
            float[] r4 = r3.f5178j
            r6 = 2
            r6 = r4[r6]
            r10 = 3
            r4 = r4[r10]
            r2.lineTo(r6, r4)
            android.graphics.Path r2 = r3.f5172d
            float[] r4 = r3.f5178j
            r6 = 4
            r6 = r4[r6]
            r10 = 5
            r4 = r4[r10]
            r2.lineTo(r6, r4)
            android.graphics.Path r2 = r3.f5172d
            float[] r4 = r3.f5178j
            r1 = r4[r1]
            r0 = r4[r0]
            r2.lineTo(r1, r0)
            android.graphics.Path r0 = r3.f5172d
            r0.close()
            int r7 = r7 + 1
            r1 = r31
            r0 = 5
            goto L_0x03cd
        L_0x04b6:
            r5 = 0
            r8 = 1
            android.graphics.Paint r0 = r3.f5173e
            r1 = 1140850688(0x44000000, float:512.0)
            r0.setColor(r1)
            r0 = r31
            r1 = 1073741824(0x40000000, float:2.0)
            r0.translate(r1, r1)
            android.graphics.Path r1 = r3.f5172d
            android.graphics.Paint r2 = r3.f5173e
            r0.drawPath(r1, r2)
            r1 = -1073741824(0xffffffffc0000000, float:-2.0)
            r0.translate(r1, r1)
            android.graphics.Paint r1 = r3.f5173e
            r2 = -65536(0xffffffffffff0000, float:NaN)
            r1.setColor(r2)
            android.graphics.Path r1 = r3.f5172d
            android.graphics.Paint r2 = r3.f5173e
            r0.drawPath(r1, r2)
            r1 = r0
            r7 = r22
            r6 = r23
            r8 = r24
            r2 = 0
            r4 = 0
            r5 = 1
            r0 = r30
            goto L_0x0164
        L_0x04ee:
            r0 = r30
            r7 = r22
            r6 = r23
            r8 = r24
            goto L_0x04f9
        L_0x04f7:
            r0 = r30
        L_0x04f9:
            r2 = 0
            r4 = 0
            goto L_0x0503
        L_0x04fc:
            r24 = r8
            r8 = 1
            r0 = r30
            r8 = r24
        L_0x0503:
            r5 = 1
            goto L_0x0164
        L_0x0506:
            r0 = r1
            r31.restore()
        L_0x050a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public final void mo1850e(View view, int i, int i2, int i3, int i4, int i5) {
    }

    /* renamed from: f */
    public final void mo1851f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!(!this.f4872v && i == 0 && i2 == 0)) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f4872v = false;
    }

    /* renamed from: g */
    public final void mo1852g(View view, View view2, int i, int i2) {
        this.f4875y = System.nanoTime();
        this.f4876z = 0.0f;
        this.f4873w = 0.0f;
        this.f4874x = 0.0f;
    }

    /* renamed from: h */
    public final void mo1857h(View view, int i) {
        C1710ai aiVar;
        float f;
        C1707af afVar = this.f4852b;
        if (afVar != null) {
            float f2 = this.f4876z;
            float f3 = 0.0f;
            if (f2 != 0.0f) {
                float f4 = this.f4873w / f2;
                float f5 = this.f4874x / f2;
                C1706ae aeVar = afVar.f4919c;
                if (aeVar != null && (aiVar = aeVar.f4910l) != null) {
                    boolean z = false;
                    aiVar.f4955l = false;
                    MotionLayout motionLayout = aiVar.f4960q;
                    float f6 = motionLayout.f4864n;
                    motionLayout.mo4722m(aiVar.f4945b, f6, aiVar.f4948e, aiVar.f4947d, aiVar.f4956m);
                    float[] fArr = aiVar.f4956m;
                    float f7 = fArr[0];
                    float f8 = fArr[1];
                    float f9 = aiVar.f4953j;
                    if (f9 != 0.0f) {
                        f = (f4 * f9) / f7;
                    } else {
                        f = (f5 * aiVar.f4954k) / f8;
                    }
                    if (!Float.isNaN(f)) {
                        f6 += f / 3.0f;
                    }
                    if (f6 != 0.0f) {
                        boolean z2 = f6 != 1.0f;
                        int i2 = aiVar.f4944a;
                        if (i2 != 3) {
                            z = true;
                        }
                        if (z && z2) {
                            MotionLayout motionLayout2 = aiVar.f4960q;
                            if (((double) f6) >= 0.5d) {
                                f3 = 1.0f;
                            }
                            motionLayout2.mo4742w(i2, f3, f);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo4718i(float f) {
        C1707af afVar = this.f4852b;
        if (afVar != null) {
            float f2 = this.f4864n;
            float f3 = this.f4863m;
            if (f2 != f3 && this.f4836ae) {
                this.f4864n = f3;
                f2 = f3;
            }
            if (f2 != f) {
                this.f4837af = false;
                this.f4865o = f;
                this.f4834ac = ((float) afVar.mo4765d()) / 1000.0f;
                mo4735q(f);
                Interpolator interpolator = null;
                this.f4853c = null;
                C1707af afVar2 = this.f4852b;
                C1706ae aeVar = afVar2.f4919c;
                switch (aeVar.f4903e) {
                    case -2:
                        interpolator = AnimationUtils.loadInterpolator(afVar2.f4917a.getContext(), afVar2.f4919c.f4905g);
                        break;
                    case -1:
                        interpolator = new C1704ac(C1596f.m4246c(aeVar.f4904f));
                        break;
                    case 0:
                        interpolator = new AccelerateDecelerateInterpolator();
                        break;
                    case 1:
                        interpolator = new AccelerateInterpolator();
                        break;
                    case 2:
                        interpolator = new DecelerateInterpolator();
                        break;
                    case 4:
                        interpolator = new BounceInterpolator();
                        break;
                    case 5:
                        interpolator = new OvershootInterpolator();
                        break;
                    case 6:
                        interpolator = new AnticipateInterpolator();
                        break;
                }
                this.f4854d = interpolator;
                this.f4836ae = false;
                this.f4833ab = System.nanoTime();
                this.f4866p = true;
                this.f4863m = f2;
                this.f4864n = f2;
                invalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo4719j(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C1733r rVar = (C1733r) this.f4862l.get(getChildAt(i));
            if (rVar != null && "button".equals(C1701a.m4619b(rVar.f5139b)) && rVar.f5159v != null) {
                int i2 = 0;
                while (true) {
                    C1730o[] oVarArr = rVar.f5159v;
                    if (i2 >= oVarArr.length) {
                        break;
                    }
                    oVarArr[i2].mo4800g(true != z ? 100.0f : -100.0f, rVar.f5139b);
                    i2++;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0176  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4720k(boolean r21) {
        /*
            r20 = this;
            r0 = r20
            long r1 = r0.f4835ad
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0010
            long r1 = java.lang.System.nanoTime()
            r0.f4835ad = r1
        L_0x0010:
            float r1 = r0.f4864n
            r2 = -1
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0020
            r0.f4857g = r2
        L_0x0020:
            boolean r5 = r0.f4840ai
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L_0x0036
            boolean r5 = r0.f4866p
            if (r5 == 0) goto L_0x0033
            if (r21 != 0) goto L_0x0036
            float r5 = r0.f4865o
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r2 = 0
            goto L_0x024a
        L_0x0036:
            float r5 = r0.f4865o
            float r5 = r5 - r1
            float r1 = java.lang.Math.signum(r5)
            long r8 = java.lang.System.nanoTime()
            android.view.animation.Interpolator r5 = r0.f4853c
            boolean r10 = r5 instanceof androidx.constraintlayout.motion.widget.C1735t
            r11 = 814313567(0x3089705f, float:1.0E-9)
            if (r10 != 0) goto L_0x0057
            long r12 = r0.f4835ad
            long r12 = r8 - r12
            float r10 = (float) r12
            float r10 = r10 * r1
            float r10 = r10 * r11
            float r12 = r0.f4834ac
            float r10 = r10 / r12
            goto L_0x0058
        L_0x0057:
            r10 = 0
        L_0x0058:
            float r12 = r0.f4864n
            float r12 = r12 + r10
            boolean r13 = r0.f4836ae
            if (r13 == 0) goto L_0x0061
            float r12 = r0.f4865o
        L_0x0061:
            int r13 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x006b
            float r13 = r0.f4865o
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x0075
        L_0x006b:
            int r13 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r13 > 0) goto L_0x007b
            float r13 = r0.f4865o
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 > 0) goto L_0x007b
        L_0x0075:
            float r12 = r0.f4865o
            r0.f4866p = r7
            r13 = 1
            goto L_0x007c
        L_0x007b:
            r13 = 0
        L_0x007c:
            r0.f4864n = r12
            r0.f4863m = r12
            r0.f4835ad = r8
            r14 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r5 == 0) goto L_0x010c
            if (r13 != 0) goto L_0x010c
            boolean r13 = r0.f4837af
            if (r13 == 0) goto L_0x00ec
            long r12 = r0.f4833ab
            long r12 = r8 - r12
            float r10 = (float) r12
            float r10 = r10 * r11
            float r5 = r5.getInterpolation(r10)
            android.view.animation.Interpolator r10 = r0.f4853c
            androidx.constraintlayout.motion.a.b r11 = r0.f4838ag
            r12 = 2
            if (r10 != r11) goto L_0x00ab
            androidx.constraintlayout.a.a.a.t r10 = r11.f4809b
            boolean r10 = r10.mo4540c()
            if (r6 == r10) goto L_0x00a9
            r10 = 1
            goto L_0x00ac
        L_0x00a9:
            r10 = 2
            goto L_0x00ac
        L_0x00ab:
            r10 = 0
        L_0x00ac:
            r0.f4864n = r5
            r0.f4835ad = r8
            android.view.animation.Interpolator r8 = r0.f4853c
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.C1735t
            if (r9 == 0) goto L_0x00ea
            androidx.constraintlayout.motion.widget.t r8 = (androidx.constraintlayout.motion.widget.C1735t) r8
            float r8 = r8.mo4708a()
            r0.f4855e = r8
            float r9 = java.lang.Math.abs(r8)
            float r11 = r0.f4834ac
            float r9 = r9 * r11
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 > 0) goto L_0x00ce
            if (r10 != r12) goto L_0x00ce
            r0.f4866p = r7
        L_0x00ce:
            int r9 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x00dc
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 < 0) goto L_0x00dc
            r0.f4864n = r3
            r0.f4866p = r7
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x00dc:
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x00ea
            int r8 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r8 > 0) goto L_0x00ea
            r0.f4864n = r4
            r0.f4866p = r7
            r12 = 0
            goto L_0x010f
        L_0x00ea:
            r12 = r5
            goto L_0x010f
        L_0x00ec:
            float r5 = r5.getInterpolation(r12)
            android.view.animation.Interpolator r8 = r0.f4853c
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.C1735t
            if (r9 == 0) goto L_0x00ff
            androidx.constraintlayout.motion.widget.t r8 = (androidx.constraintlayout.motion.widget.C1735t) r8
            float r8 = r8.mo4708a()
            r0.f4855e = r8
            goto L_0x010a
        L_0x00ff:
            float r12 = r12 + r10
            float r8 = r8.getInterpolation(r12)
            float r8 = r8 - r5
            float r8 = r8 * r1
            float r8 = r8 / r10
            r0.f4855e = r8
        L_0x010a:
            r12 = r5
            goto L_0x010e
        L_0x010c:
            r0.f4855e = r10
        L_0x010e:
            r10 = 0
        L_0x010f:
            float r5 = r0.f4855e
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x011d
            r5 = 3
            r0.mo4713B(r5)
        L_0x011d:
            r5 = 4
            if (r10 == r6) goto L_0x0145
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x012a
            float r8 = r0.f4865o
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0134
        L_0x012a:
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 > 0) goto L_0x0138
            float r8 = r0.f4865o
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 > 0) goto L_0x0138
        L_0x0134:
            float r12 = r0.f4865o
            r0.f4866p = r7
        L_0x0138:
            int r8 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x0140
            int r8 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r8 > 0) goto L_0x0145
        L_0x0140:
            r0.f4866p = r7
            r0.mo4713B(r5)
        L_0x0145:
            int r8 = r20.getChildCount()
            r0.f4840ai = r7
            long r9 = java.lang.System.nanoTime()
            r0.f4826I = r12
            android.view.animation.Interpolator r11 = r0.f4854d
            if (r11 != 0) goto L_0x0157
            r11 = r12
            goto L_0x015b
        L_0x0157:
            float r11 = r11.getInterpolation(r12)
        L_0x015b:
            android.view.animation.Interpolator r13 = r0.f4854d
            if (r13 == 0) goto L_0x0173
            float r14 = r0.f4834ac
            float r14 = r1 / r14
            float r14 = r14 + r12
            float r13 = r13.getInterpolation(r14)
            r0.f4855e = r13
            android.view.animation.Interpolator r14 = r0.f4854d
            float r14 = r14.getInterpolation(r12)
            float r13 = r13 - r14
            r0.f4855e = r13
        L_0x0173:
            r15 = 0
        L_0x0174:
            if (r15 >= r8) goto L_0x019f
            android.view.View r14 = r0.getChildAt(r15)
            java.util.HashMap r13 = r0.f4862l
            java.lang.Object r13 = r13.get(r14)
            androidx.constraintlayout.motion.widget.r r13 = (androidx.constraintlayout.motion.widget.C1733r) r13
            if (r13 == 0) goto L_0x0197
            boolean r7 = r0.f4840ai
            androidx.constraintlayout.a.a.a.g r3 = r0.f4846ao
            r19 = r15
            r15 = r11
            r16 = r9
            r18 = r3
            boolean r3 = r13.mo4809d(r14, r15, r16, r18)
            r3 = r3 | r7
            r0.f4840ai = r3
            goto L_0x0199
        L_0x0197:
            r19 = r15
        L_0x0199:
            int r15 = r19 + 1
            r3 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            goto L_0x0174
        L_0x019f:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x01ac
            float r3 = r0.f4865o
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x01aa
            goto L_0x01ac
        L_0x01aa:
            r3 = 1
            goto L_0x01b8
        L_0x01ac:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x01b7
            float r3 = r0.f4865o
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x01b7
            goto L_0x01aa
        L_0x01b7:
            r3 = 0
        L_0x01b8:
            boolean r7 = r0.f4840ai
            if (r7 != 0) goto L_0x01c5
            boolean r7 = r0.f4866p
            if (r7 != 0) goto L_0x01c5
            if (r3 == 0) goto L_0x01c5
            r0.mo4713B(r5)
        L_0x01c5:
            boolean r7 = r0.f4819B
            if (r7 == 0) goto L_0x01cc
            r20.requestLayout()
        L_0x01cc:
            boolean r7 = r0.f4840ai
            r3 = r3 ^ r6
            r3 = r3 | r7
            r0.f4840ai = r3
            int r3 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x01ee
            int r3 = r0.f4856f
            if (r3 == r2) goto L_0x01ee
            int r2 = r0.f4857g
            if (r2 == r3) goto L_0x01ee
            r0.f4857g = r3
            androidx.constraintlayout.motion.widget.af r2 = r0.f4852b
            androidx.constraintlayout.widget.o r2 = r2.mo4775n(r3)
            r2.mo4887g(r0)
            r0.mo4713B(r5)
            r2 = 1
            goto L_0x01ef
        L_0x01ee:
            r2 = 0
        L_0x01ef:
            double r7 = (double) r12
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 < 0) goto L_0x020b
            int r3 = r0.f4857g
            int r7 = r0.f4858h
            if (r3 == r7) goto L_0x020b
            r0.f4857g = r7
            androidx.constraintlayout.motion.widget.af r2 = r0.f4852b
            androidx.constraintlayout.widget.o r2 = r2.mo4775n(r7)
            r2.mo4887g(r0)
            r0.mo4713B(r5)
            r2 = 1
        L_0x020b:
            boolean r3 = r0.f4840ai
            if (r3 != 0) goto L_0x022a
            boolean r3 = r0.f4866p
            if (r3 == 0) goto L_0x0214
            goto L_0x022a
        L_0x0214:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x021e
            r3 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0226
        L_0x021e:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x022d
            int r3 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x022d
        L_0x0226:
            r0.mo4713B(r5)
            goto L_0x022d
        L_0x022a:
            r20.invalidate()
        L_0x022d:
            boolean r3 = r0.f4840ai
            if (r3 != 0) goto L_0x024a
            boolean r3 = r0.f4866p
            if (r3 != 0) goto L_0x024a
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x023f
            r3 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0247
        L_0x023f:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x024a
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x024a
        L_0x0247:
            r20.mo4723n()
        L_0x024a:
            float r1 = r0.f4864n
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0261
            int r1 = r0.f4857g
            int r3 = r0.f4858h
            if (r1 == r3) goto L_0x025a
            r7 = 0
            goto L_0x025b
        L_0x025a:
            r7 = 1
        L_0x025b:
            r1 = r7 ^ 1
            r2 = r2 | r1
            r0.f4857g = r3
            goto L_0x0273
        L_0x0261:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0273
            int r1 = r0.f4857g
            int r3 = r0.f4856f
            if (r1 == r3) goto L_0x026d
            r7 = 0
            goto L_0x026e
        L_0x026d:
            r7 = 1
        L_0x026e:
            r1 = r7 ^ 1
            r2 = r2 | r1
            r0.f4857g = r3
        L_0x0273:
            boolean r1 = r0.f4848aq
            r1 = r1 | r2
            r0.f4848aq = r1
            if (r2 == 0) goto L_0x0281
            boolean r1 = r0.f4847ap
            if (r1 != 0) goto L_0x0281
            r20.requestLayout()
        L_0x0281:
            float r1 = r0.f4864n
            r0.f4863m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo4720k(boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo4721l() {
        int i;
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.f4867q != null || ((copyOnWriteArrayList = this.f4818A) != null && !copyOnWriteArrayList.isEmpty())) && this.f4844am == -1) {
            this.f4844am = this.f4857g;
            if (!this.f4831N.isEmpty()) {
                ArrayList arrayList = this.f4831N;
                i = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
            } else {
                i = -1;
            }
            int i2 = this.f4857g;
            if (!(i == i2 || i2 == -1)) {
                this.f4831N.add(Integer.valueOf(i2));
            }
        }
        m4588N();
        Runnable runnable = this.f4828K;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo4722m(int i, float f, float f2, float f3, float[] fArr) {
        String str;
        double[] dArr;
        int i2 = i;
        HashMap hashMap = this.f4862l;
        View C = mo4824C(i);
        C1733r rVar = (C1733r) hashMap.get(C);
        if (rVar != null) {
            float f4 = f;
            float a = rVar.mo4806a(f, rVar.f5155r);
            C1594d[] dVarArr = rVar.f5146i;
            int i3 = 0;
            if (dVarArr != null) {
                double d = (double) a;
                dVarArr[0].mo4518c(d, rVar.f5153p);
                rVar.f5146i[0].mo4516a(d, rVar.f5152o);
                float f5 = rVar.f5155r[0];
                while (true) {
                    dArr = rVar.f5153p;
                    if (i3 >= dArr.length) {
                        break;
                    }
                    double d2 = dArr[i3];
                    double d3 = (double) f5;
                    Double.isNaN(d3);
                    dArr[i3] = d2 * d3;
                    i3++;
                }
                C1594d dVar = rVar.f5147j;
                if (dVar != null) {
                    double[] dArr2 = rVar.f5152o;
                    if (dArr2.length > 0) {
                        dVar.mo4516a(d, dArr2);
                        rVar.f5147j.mo4518c(d, rVar.f5153p);
                        C1703ab.m4626f(f2, f3, fArr, rVar.f5151n, rVar.f5153p, rVar.f5152o);
                    }
                } else {
                    C1703ab.m4626f(f2, f3, fArr, rVar.f5151n, dArr, rVar.f5152o);
                }
            } else {
                C1703ab abVar = rVar.f5143f;
                float f6 = abVar.f4882f;
                C1703ab abVar2 = rVar.f5142e;
                float f7 = f6 - abVar2.f4882f;
                float f8 = abVar.f4883g - abVar2.f4883g;
                float f9 = abVar.f4884h;
                float f10 = abVar2.f4884h;
                float f11 = abVar.f4885i;
                float f12 = abVar2.f4885i;
                fArr[0] = ((1.0f - f2) * f7) + ((f7 + (f9 - f10)) * f2);
                fArr[1] = ((1.0f - f3) * f8) + ((f8 + (f11 - f12)) * f3);
            }
            C.getY();
            return;
        }
        if (C == null) {
            StringBuilder sb = new StringBuilder(11);
            sb.append(i);
            str = sb.toString();
        } else {
            str = C.getContext().getResources().getResourceName(i);
        }
        String valueOf = String.valueOf(str);
        Log.w("MotionLayout", valueOf.length() != 0 ? "WARNING could not find view id ".concat(valueOf) : new String("WARNING could not find view id "));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo4723n() {
        C1706ae aeVar;
        C1710ai aiVar;
        View view;
        C1707af afVar = this.f4852b;
        if (afVar != null) {
            if (afVar.mo4773l(this, this.f4857g)) {
                requestLayout();
                return;
            }
            int i = this.f4857g;
            if (i != -1) {
                C1707af afVar2 = this.f4852b;
                ArrayList arrayList = afVar2.f4920d;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C1706ae aeVar2 = (C1706ae) arrayList.get(i2);
                    if (aeVar2.f4911m.size() > 0) {
                        ArrayList arrayList2 = aeVar2.f4911m;
                        int size2 = arrayList2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            ((C1705ad) arrayList2.get(i3)).mo4758b(this);
                        }
                    }
                }
                ArrayList arrayList3 = afVar2.f4921e;
                int size3 = arrayList3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    C1706ae aeVar3 = (C1706ae) arrayList3.get(i4);
                    if (aeVar3.f4911m.size() > 0) {
                        ArrayList arrayList4 = aeVar3.f4911m;
                        int size4 = arrayList4.size();
                        for (int i5 = 0; i5 < size4; i5++) {
                            ((C1705ad) arrayList4.get(i5)).mo4758b(this);
                        }
                    }
                }
                ArrayList arrayList5 = afVar2.f4920d;
                int size5 = arrayList5.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    C1706ae aeVar4 = (C1706ae) arrayList5.get(i6);
                    if (aeVar4.f4911m.size() > 0) {
                        ArrayList arrayList6 = aeVar4.f4911m;
                        int size6 = arrayList6.size();
                        for (int i7 = 0; i7 < size6; i7++) {
                            ((C1705ad) arrayList6.get(i7)).mo4757a(this, i, aeVar4);
                        }
                    }
                }
                ArrayList arrayList7 = afVar2.f4921e;
                int size7 = arrayList7.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    C1706ae aeVar5 = (C1706ae) arrayList7.get(i8);
                    if (aeVar5.f4911m.size() > 0) {
                        ArrayList arrayList8 = aeVar5.f4911m;
                        int size8 = arrayList8.size();
                        for (int i9 = 0; i9 < size8; i9++) {
                            ((C1705ad) arrayList8.get(i9)).mo4757a(this, i, aeVar5);
                        }
                    }
                }
            }
            if (this.f4852b.mo4774m() && (aeVar = this.f4852b.f4919c) != null && (aiVar = aeVar.f4910l) != null) {
                int i10 = aiVar.f4945b;
                if (i10 != -1) {
                    view = aiVar.f4960q.findViewById(i10);
                    if (view == null) {
                        String valueOf = String.valueOf(C1701a.m4620c(aiVar.f4960q.getContext(), aiVar.f4945b));
                        Log.e("TouchResponse", valueOf.length() != 0 ? "cannot find TouchAnchorId @id/".concat(valueOf) : new String("cannot find TouchAnchorId @id/"));
                    }
                } else {
                    view = null;
                }
                if (view instanceof NestedScrollView) {
                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                    nestedScrollView.setOnTouchListener(new C1708ag());
                    nestedScrollView.f6034d = new C1709ah();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo4724o(int i) {
        this.f5207W = null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r8 = this;
            super.onAttachedToWindow()
            android.view.Display r0 = r8.getDisplay()
            if (r0 == 0) goto L_0x000c
            r0.getRotation()
        L_0x000c:
            androidx.constraintlayout.motion.widget.af r0 = r8.f4852b
            r1 = -1
            if (r0 == 0) goto L_0x005e
            int r2 = r8.f4857g
            if (r2 == r1) goto L_0x005e
            androidx.constraintlayout.widget.o r0 = r0.mo4775n(r2)
            androidx.constraintlayout.motion.widget.af r2 = r8.f4852b
            r3 = 0
        L_0x001c:
            android.util.SparseArray r4 = r2.f4922f
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x0055
            android.util.SparseArray r4 = r2.f4922f
            int r4 = r4.keyAt(r3)
            android.util.SparseIntArray r5 = r2.f4923g
            int r5 = r5.get(r4)
            android.util.SparseIntArray r6 = r2.f4923g
            int r6 = r6.size()
        L_0x0036:
            if (r5 <= 0) goto L_0x004f
            if (r5 != r4) goto L_0x003b
            goto L_0x0047
        L_0x003b:
            int r7 = r6 + -1
            if (r6 < 0) goto L_0x0047
            android.util.SparseIntArray r6 = r2.f4923g
            int r5 = r6.get(r5)
            r6 = r7
            goto L_0x0036
        L_0x0047:
            java.lang.String r2 = "MotionScene"
            java.lang.String r3 = "Cannot be derived from yourself"
            android.util.Log.e(r2, r3)
            goto L_0x0055
        L_0x004f:
            r2.mo4770i(r4, r8)
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0055:
            if (r0 == 0) goto L_0x005a
            r0.mo4888h(r8)
        L_0x005a:
            int r0 = r8.f4857g
            r8.f4856f = r0
        L_0x005e:
            r8.mo4723n()
            androidx.constraintlayout.motion.widget.z r0 = r8.f4827J
            r2 = 3
            r3 = 2
            if (r0 == 0) goto L_0x00fd
            int r4 = r0.f5195c
            if (r4 != r1) goto L_0x0070
            int r4 = r0.f5196d
            if (r4 == r1) goto L_0x008e
            r4 = -1
        L_0x0070:
            if (r4 != r1) goto L_0x007a
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.f5197e
            int r5 = r0.f5196d
            r4.mo4744y(r5)
            goto L_0x0089
        L_0x007a:
            int r5 = r0.f5196d
            if (r5 != r1) goto L_0x0084
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r0.f5197e
            r5.mo4736r(r4, r1, r1)
            goto L_0x0089
        L_0x0084:
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r0.f5197e
            r6.mo4741v(r4, r5)
        L_0x0089:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.f5197e
            r4.mo4713B(r3)
        L_0x008e:
            float r3 = r0.f5194b
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L_0x00a8
            float r1 = r0.f5193a
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x00a0
            goto L_0x0113
        L_0x00a0:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f5197e
            float r0 = r0.f5193a
            r1.mo4735q(r0)
            return
        L_0x00a8:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f5197e
            float r4 = r0.f5193a
            float r5 = r0.f5194b
            boolean r6 = r3.isAttachedToWindow()
            if (r6 != 0) goto L_0x00c6
            androidx.constraintlayout.motion.widget.z r2 = r3.f4827J
            if (r2 != 0) goto L_0x00bf
            androidx.constraintlayout.motion.widget.z r2 = new androidx.constraintlayout.motion.widget.z
            r2.<init>(r3)
            r3.f4827J = r2
        L_0x00bf:
            androidx.constraintlayout.motion.widget.z r2 = r3.f4827J
            r2.f5193a = r4
            r2.f5194b = r5
            goto L_0x00f2
        L_0x00c6:
            r3.mo4735q(r4)
            r3.mo4713B(r2)
            r3.f4855e = r5
            r2 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 == 0) goto L_0x00df
            int r4 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r2 = 0
        L_0x00db:
            r3.mo4718i(r2)
            goto L_0x00f2
        L_0x00df:
            int r5 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x00f2
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00f2
            r5 = 1056964608(0x3f000000, float:0.5)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ee
            goto L_0x00ef
        L_0x00ee:
            r2 = 0
        L_0x00ef:
            r3.mo4718i(r2)
        L_0x00f2:
            r2 = 2143289344(0x7fc00000, float:NaN)
            r0.f5193a = r2
            r0.f5194b = r2
            r0.f5195c = r1
            r0.f5196d = r1
            return
        L_0x00fd:
            androidx.constraintlayout.motion.widget.af r0 = r8.f4852b
            if (r0 == 0) goto L_0x0113
            androidx.constraintlayout.motion.widget.ae r0 = r0.f4919c
            if (r0 == 0) goto L_0x0113
            int r0 = r0.f4912n
            r1 = 4
            if (r0 != r1) goto L_0x0113
            r8.mo4743x()
            r8.mo4713B(r3)
            r8.mo4713B(r2)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f4847ap = true;
        try {
            if (this.f4852b == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (!(this.f4870t == i5 && this.f4871u == i6)) {
                mo4734p();
                mo4720k(true);
            }
            this.f4870t = i5;
            this.f4871u = i6;
            this.f4847ap = false;
        } finally {
            this.f4847ap = false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r7 == r8.f5189f) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            androidx.constraintlayout.motion.widget.af r3 = r0.f4852b
            if (r3 != 0) goto L_0x000e
            super.onMeasure(r18, r19)
            return
        L_0x000e:
            int r3 = r0.f4859i
            r4 = 0
            r5 = 1
            if (r3 != r1) goto L_0x001b
            int r3 = r0.f4860j
            if (r3 == r2) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = 0
            goto L_0x001c
        L_0x001b:
            r3 = 1
        L_0x001c:
            boolean r6 = r0.f4848aq
            if (r6 == 0) goto L_0x0029
            r0.f4848aq = r4
            r17.mo4723n()
            r17.m4588N()
            r3 = 1
        L_0x0029:
            boolean r6 = r0.f5204T
            r3 = r3 | r6
            r0.f4859i = r1
            r0.f4860j = r2
            androidx.constraintlayout.motion.widget.af r6 = r0.f4852b
            int r6 = r6.mo4767f()
            androidx.constraintlayout.motion.widget.af r7 = r0.f4852b
            int r7 = r7.mo4766e()
            if (r3 != 0) goto L_0x0048
            androidx.constraintlayout.motion.widget.x r8 = r0.f4830M
            int r9 = r8.f5188e
            if (r6 != r9) goto L_0x0048
            int r8 = r8.f5189f
            if (r7 == r8) goto L_0x0073
        L_0x0048:
            int r8 = r0.f4856f
            r9 = -1
            if (r8 == r9) goto L_0x006e
            super.onMeasure(r18, r19)
            androidx.constraintlayout.motion.widget.x r1 = r0.f4830M
            androidx.constraintlayout.motion.widget.af r2 = r0.f4852b
            androidx.constraintlayout.widget.o r2 = r2.mo4775n(r6)
            androidx.constraintlayout.motion.widget.af r3 = r0.f4852b
            androidx.constraintlayout.widget.o r3 = r3.mo4775n(r7)
            r1.mo4819e(r2, r3)
            androidx.constraintlayout.motion.widget.x r1 = r0.f4830M
            r1.mo4818b()
            androidx.constraintlayout.motion.widget.x r1 = r0.f4830M
            r1.f5188e = r6
            r1.f5189f = r7
            r1 = 0
            goto L_0x0074
        L_0x006e:
            if (r3 == 0) goto L_0x0073
            super.onMeasure(r18, r19)
        L_0x0073:
            r1 = 1
        L_0x0074:
            boolean r2 = r0.f4819B
            if (r2 != 0) goto L_0x007a
            if (r1 == 0) goto L_0x00cb
        L_0x007a:
            int r1 = r17.getPaddingTop()
            int r2 = r17.getPaddingBottom()
            int r3 = r17.getPaddingLeft()
            int r6 = r17.getPaddingRight()
            androidx.constraintlayout.a.b.g r7 = r0.f5203S
            int r7 = r7.mo4631i()
            int r3 = r3 + r6
            int r7 = r7 + r3
            androidx.constraintlayout.a.b.g r3 = r0.f5203S
            int r3 = r3.mo4630h()
            int r1 = r1 + r2
            int r3 = r3 + r1
            int r1 = r0.f4824G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L_0x00a2
            if (r1 != 0) goto L_0x00b2
        L_0x00a2:
            int r1 = r0.f4820C
            float r6 = (float) r1
            float r7 = r0.f4826I
            int r8 = r0.f4822E
            int r8 = r8 - r1
            float r1 = (float) r8
            float r7 = r7 * r1
            float r6 = r6 + r7
            int r7 = (int) r6
            r17.requestLayout()
        L_0x00b2:
            int r1 = r0.f4825H
            if (r1 == r2) goto L_0x00b8
            if (r1 != 0) goto L_0x00c8
        L_0x00b8:
            int r1 = r0.f4821D
            float r2 = (float) r1
            float r3 = r0.f4826I
            int r6 = r0.f4823F
            int r6 = r6 - r1
            float r1 = (float) r6
            float r3 = r3 * r1
            float r2 = r2 + r3
            int r3 = (int) r2
            r17.requestLayout()
        L_0x00c8:
            r0.setMeasuredDimension(r7, r3)
        L_0x00cb:
            float r1 = r0.f4865o
            float r2 = r0.f4864n
            float r1 = r1 - r2
            float r1 = java.lang.Math.signum(r1)
            long r2 = java.lang.System.nanoTime()
            android.view.animation.Interpolator r6 = r0.f4853c
            boolean r7 = r6 instanceof androidx.constraintlayout.motion.p084a.C1676b
            r8 = 814313567(0x3089705f, float:1.0E-9)
            r9 = 0
            if (r7 != 0) goto L_0x00ef
            long r10 = r0.f4835ad
            long r10 = r2 - r10
            float r7 = (float) r10
            float r7 = r7 * r1
            float r7 = r7 * r8
            float r10 = r0.f4834ac
            float r7 = r7 / r10
            goto L_0x00f0
        L_0x00ef:
            r7 = 0
        L_0x00f0:
            float r10 = r0.f4864n
            float r10 = r10 + r7
            boolean r7 = r0.f4836ae
            if (r7 == 0) goto L_0x00f9
            float r10 = r0.f4865o
        L_0x00f9:
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0103
            float r7 = r0.f4865o
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x010d
        L_0x0103:
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 > 0) goto L_0x0110
            float r7 = r0.f4865o
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0110
        L_0x010d:
            float r10 = r0.f4865o
            goto L_0x0111
        L_0x0110:
            r5 = 0
        L_0x0111:
            if (r6 == 0) goto L_0x0128
            if (r5 != 0) goto L_0x0128
            boolean r5 = r0.f4837af
            if (r5 == 0) goto L_0x0124
            long r10 = r0.f4833ab
            long r2 = r2 - r10
            float r2 = (float) r2
            float r2 = r2 * r8
            float r10 = r6.getInterpolation(r2)
            goto L_0x0128
        L_0x0124:
            float r10 = r6.getInterpolation(r10)
        L_0x0128:
            int r2 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0132
            float r2 = r0.f4865o
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x013c
        L_0x0132:
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x013e
            float r1 = r0.f4865o
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x013e
        L_0x013c:
            float r10 = r0.f4865o
        L_0x013e:
            r0.f4826I = r10
            int r1 = r17.getChildCount()
            long r2 = java.lang.System.nanoTime()
            android.view.animation.Interpolator r5 = r0.f4854d
            if (r5 == 0) goto L_0x0150
            float r10 = r5.getInterpolation(r10)
        L_0x0150:
            if (r4 >= r1) goto L_0x016d
            android.view.View r12 = r0.getChildAt(r4)
            java.util.HashMap r5 = r0.f4862l
            java.lang.Object r5 = r5.get(r12)
            r11 = r5
            androidx.constraintlayout.motion.widget.r r11 = (androidx.constraintlayout.motion.widget.C1733r) r11
            if (r11 == 0) goto L_0x016a
            androidx.constraintlayout.a.a.a.g r5 = r0.f4846ao
            r13 = r10
            r14 = r2
            r16 = r5
            r11.mo4809d(r12, r13, r14, r16)
        L_0x016a:
            int r4 = r4 + 1
            goto L_0x0150
        L_0x016d:
            boolean r1 = r0.f4819B
            if (r1 == 0) goto L_0x0174
            r17.requestLayout()
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final void onRtlPropertiesChanged(int i) {
        C1710ai aiVar;
        C1707af afVar = this.f4852b;
        if (afVar != null) {
            boolean I = mo4830I();
            afVar.f4929m = I;
            C1706ae aeVar = afVar.f4919c;
            if (aeVar != null && (aiVar = aeVar.f4910l) != null) {
                aiVar.mo4780c(I);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x07e6  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x07ef A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            androidx.constraintlayout.motion.widget.af r2 = r0.f4852b
            if (r2 == 0) goto L_0x07f1
            boolean r3 = r0.f4861k
            if (r3 == 0) goto L_0x07f1
            boolean r2 = r2.mo4774m()
            if (r2 == 0) goto L_0x07f1
            androidx.constraintlayout.motion.widget.af r2 = r0.f4852b
            androidx.constraintlayout.motion.widget.ae r3 = r2.f4919c
            if (r3 == 0) goto L_0x0024
            boolean r3 = r3.mo4760a()
            if (r3 == 0) goto L_0x001f
            goto L_0x0024
        L_0x001f:
            boolean r1 = super.onTouchEvent(r32)
            return r1
        L_0x0024:
            int r3 = r0.f4857g
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            androidx.constraintlayout.motion.widget.y r5 = r2.f4933q
            if (r5 != 0) goto L_0x003d
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r2.f4917a
            androidx.constraintlayout.motion.widget.y r5 = androidx.constraintlayout.motion.widget.C1740y.f5191a
            android.view.VelocityTracker r6 = android.view.VelocityTracker.obtain()
            r5.f5192b = r6
            androidx.constraintlayout.motion.widget.y r5 = androidx.constraintlayout.motion.widget.C1740y.f5191a
            r2.f4933q = r5
        L_0x003d:
            androidx.constraintlayout.motion.widget.y r5 = r2.f4933q
            r5.mo4822c(r1)
            r5 = 2
            r8 = -1
            if (r3 == r8) goto L_0x0219
            int r12 = r32.getAction()
            if (r12 == 0) goto L_0x01ad
            if (r12 == r5) goto L_0x0050
            goto L_0x0219
        L_0x0050:
            boolean r12 = r2.f4927k
            if (r12 != 0) goto L_0x0219
            float r12 = r32.getRawY()
            float r13 = r2.f4932p
            float r12 = r12 - r13
            float r13 = r32.getRawX()
            float r14 = r2.f4931o
            float r13 = r13 - r14
            double r14 = (double) r13
            r16 = 0
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 != 0) goto L_0x006e
            double r14 = (double) r12
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 == 0) goto L_0x07db
        L_0x006e:
            android.view.MotionEvent r14 = r2.f4926j
            if (r14 == 0) goto L_0x07db
            if (r3 == r8) goto L_0x0173
            androidx.constraintlayout.widget.x r15 = r2.f4918b
            if (r15 == 0) goto L_0x007e
            int r15 = r15.mo4911a(r3)
            if (r15 != r8) goto L_0x007f
        L_0x007e:
            r15 = r3
        L_0x007f:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r10 = r2.f4920d
            int r8 = r10.size()
            r5 = 0
        L_0x008b:
            if (r5 >= r8) goto L_0x00a3
            java.lang.Object r19 = r10.get(r5)
            r11 = r19
            androidx.constraintlayout.motion.widget.ae r11 = (androidx.constraintlayout.motion.widget.C1706ae) r11
            int r6 = r11.f4902d
            if (r6 == r15) goto L_0x009d
            int r6 = r11.f4901c
            if (r6 != r15) goto L_0x00a0
        L_0x009d:
            r7.add(r11)
        L_0x00a0:
            int r5 = r5 + 1
            goto L_0x008b
        L_0x00a3:
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            java.util.Iterator r6 = r7.iterator()
            r7 = 0
            r8 = 0
        L_0x00ae:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x0171
            java.lang.Object r10 = r6.next()
            androidx.constraintlayout.motion.widget.ae r10 = (androidx.constraintlayout.motion.widget.C1706ae) r10
            boolean r11 = r10.f4913o
            if (r11 != 0) goto L_0x015d
            androidx.constraintlayout.motion.widget.ai r11 = r10.f4910l
            if (r11 == 0) goto L_0x0153
            boolean r15 = r2.f4929m
            r11.mo4780c(r15)
            androidx.constraintlayout.motion.widget.ai r11 = r10.f4910l
            androidx.constraintlayout.motion.widget.MotionLayout r15 = r2.f4917a
            android.graphics.RectF r11 = r11.mo4779b(r15, r5)
            if (r11 == 0) goto L_0x00df
            float r15 = r14.getX()
            float r9 = r14.getY()
            boolean r9 = r11.contains(r15, r9)
            if (r9 == 0) goto L_0x015d
        L_0x00df:
            androidx.constraintlayout.motion.widget.ai r9 = r10.f4910l
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r2.f4917a
            android.graphics.RectF r9 = r9.mo4778a(r11, r5)
            if (r9 == 0) goto L_0x00f7
            float r11 = r14.getX()
            float r15 = r14.getY()
            boolean r9 = r9.contains(r11, r15)
            if (r9 == 0) goto L_0x015d
        L_0x00f7:
            androidx.constraintlayout.motion.widget.ai r9 = r10.f4910l
            float r11 = r9.f4953j
            float r11 = r11 * r13
            float r15 = r9.f4954k
            float r15 = r15 * r12
            float r11 = r11 + r15
            boolean r9 = r9.f4952i
            if (r9 == 0) goto L_0x0138
            float r9 = r14.getX()
            androidx.constraintlayout.motion.widget.ai r11 = r10.f4910l
            float r11 = r11.f4949f
            float r9 = r9 - r11
            float r11 = r14.getY()
            androidx.constraintlayout.motion.widget.ai r15 = r10.f4910l
            float r15 = r15.f4950g
            float r11 = r11 - r15
            float r15 = r12 + r11
            r20 = r5
            r21 = r6
            double r5 = (double) r15
            float r15 = r13 + r9
            r22 = r12
            r23 = r13
            double r12 = (double) r15
            double r5 = java.lang.Math.atan2(r5, r12)
            double r12 = (double) r9
            r15 = r8
            double r8 = (double) r11
            double r8 = java.lang.Math.atan2(r12, r8)
            double r5 = r5 - r8
            float r5 = (float) r5
            r6 = 1092616192(0x41200000, float:10.0)
            float r11 = r5 * r6
            goto L_0x0141
        L_0x0138:
            r20 = r5
            r21 = r6
            r15 = r8
            r22 = r12
            r23 = r13
        L_0x0141:
            int r5 = r10.f4901c
            if (r5 != r3) goto L_0x0147
            float r5 = -r11
            goto L_0x014c
        L_0x0147:
            r5 = 1066192077(0x3f8ccccd, float:1.1)
            float r5 = r5 * r11
        L_0x014c:
            int r6 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0166
            r7 = r5
            r8 = r10
            goto L_0x0167
        L_0x0153:
            r20 = r5
            r21 = r6
            r15 = r8
            r22 = r12
            r23 = r13
            goto L_0x0166
        L_0x015d:
            r20 = r5
            r21 = r6
            r15 = r8
            r22 = r12
            r23 = r13
        L_0x0166:
            r8 = r15
        L_0x0167:
            r5 = r20
            r6 = r21
            r12 = r22
            r13 = r23
            goto L_0x00ae
        L_0x0171:
            r15 = r8
            goto L_0x0175
        L_0x0173:
            androidx.constraintlayout.motion.widget.ae r8 = r2.f4919c
        L_0x0175:
            if (r8 == 0) goto L_0x0219
            r0.mo4740u(r8)
            androidx.constraintlayout.motion.widget.ae r3 = r2.f4919c
            androidx.constraintlayout.motion.widget.ai r3 = r3.f4910l
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r2.f4917a
            android.graphics.RectF r3 = r3.mo4779b(r5, r4)
            if (r3 == 0) goto L_0x019a
            android.view.MotionEvent r4 = r2.f4926j
            float r4 = r4.getX()
            android.view.MotionEvent r5 = r2.f4926j
            float r5 = r5.getY()
            boolean r3 = r3.contains(r4, r5)
            if (r3 != 0) goto L_0x019a
            r3 = 1
            goto L_0x019b
        L_0x019a:
            r3 = 0
        L_0x019b:
            r2.f4928l = r3
            androidx.constraintlayout.motion.widget.ae r3 = r2.f4919c
            androidx.constraintlayout.motion.widget.ai r3 = r3.f4910l
            float r4 = r2.f4931o
            float r5 = r2.f4932p
            r3.f4958o = r4
            r3.f4959p = r5
            r5 = 0
            r3.f4955l = r5
            goto L_0x0219
        L_0x01ad:
            r5 = 0
            float r3 = r32.getRawX()
            r2.f4931o = r3
            float r3 = r32.getRawY()
            r2.f4932p = r3
            r2.f4926j = r1
            r2.f4927k = r5
            androidx.constraintlayout.motion.widget.ae r1 = r2.f4919c
            androidx.constraintlayout.motion.widget.ai r1 = r1.f4910l
            if (r1 == 0) goto L_0x07db
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.f4917a
            android.graphics.RectF r1 = r1.mo4778a(r3, r4)
            if (r1 == 0) goto L_0x01e6
            android.view.MotionEvent r3 = r2.f4926j
            float r3 = r3.getX()
            android.view.MotionEvent r5 = r2.f4926j
            float r5 = r5.getY()
            boolean r1 = r1.contains(r3, r5)
            if (r1 != 0) goto L_0x01e6
            r1 = 0
            r2.f4926j = r1
            r1 = 1
            r2.f4927k = r1
            goto L_0x07db
        L_0x01e6:
            androidx.constraintlayout.motion.widget.ae r1 = r2.f4919c
            androidx.constraintlayout.motion.widget.ai r1 = r1.f4910l
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.f4917a
            android.graphics.RectF r1 = r1.mo4779b(r3, r4)
            if (r1 == 0) goto L_0x0208
            android.view.MotionEvent r3 = r2.f4926j
            float r3 = r3.getX()
            android.view.MotionEvent r4 = r2.f4926j
            float r4 = r4.getY()
            boolean r1 = r1.contains(r3, r4)
            if (r1 != 0) goto L_0x0208
            r1 = 1
            r2.f4928l = r1
            goto L_0x020b
        L_0x0208:
            r1 = 0
            r2.f4928l = r1
        L_0x020b:
            androidx.constraintlayout.motion.widget.ae r1 = r2.f4919c
            androidx.constraintlayout.motion.widget.ai r1 = r1.f4910l
            float r3 = r2.f4931o
            float r2 = r2.f4932p
            r1.f4958o = r3
            r1.f4959p = r2
            goto L_0x07db
        L_0x0219:
            boolean r3 = r2.f4927k
            if (r3 == 0) goto L_0x021f
            goto L_0x07db
        L_0x021f:
            androidx.constraintlayout.motion.widget.ae r3 = r2.f4919c
            if (r3 == 0) goto L_0x07ae
            androidx.constraintlayout.motion.widget.ai r3 = r3.f4910l
            if (r3 == 0) goto L_0x07ae
            boolean r4 = r2.f4928l
            if (r4 != 0) goto L_0x07ae
            androidx.constraintlayout.motion.widget.y r4 = r2.f4933q
            boolean r5 = r3.f4952i
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            if (r5 == 0) goto L_0x058b
            r4.mo4822c(r1)
            int r5 = r32.getAction()
            if (r5 == 0) goto L_0x057a
            r20 = 1135869952(0x43b40000, float:360.0)
            r21 = 1073741824(0x40000000, float:2.0)
            r11 = 1
            if (r5 == r11) goto L_0x03f5
            r11 = 2
            if (r5 == r11) goto L_0x024b
            goto L_0x07ae
        L_0x024b:
            r32.getRawY()
            r32.getRawX()
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f4960q
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r5 = r5 / r21
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f4960q
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r6 = r6 / r21
            int r7 = r3.f4951h
            r8 = -1
            if (r7 == r8) goto L_0x02a1
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f4960q
            android.view.View r5 = r5.findViewById(r7)
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f4960q
            int[] r7 = r3.f4957n
            r6.getLocationOnScreen(r7)
            int[] r6 = r3.f4957n
            r7 = 0
            r6 = r6[r7]
            float r6 = (float) r6
            int r7 = r5.getLeft()
            int r8 = r5.getRight()
            int r7 = r7 + r8
            float r7 = (float) r7
            float r7 = r7 / r21
            float r6 = r6 + r7
            int[] r7 = r3.f4957n
            r8 = 1
            r7 = r7[r8]
            float r7 = (float) r7
            int r8 = r5.getTop()
            int r5 = r5.getBottom()
            int r8 = r8 + r5
            float r5 = (float) r8
            float r5 = r5 / r21
            float r5 = r5 + r7
            r30 = r6
            r6 = r5
            r5 = r30
            goto L_0x02ed
        L_0x02a1:
            int r7 = r3.f4945b
            r8 = -1
            if (r7 == r8) goto L_0x02ed
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f4960q
            androidx.constraintlayout.motion.widget.r r7 = r8.mo4715b(r7)
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f4960q
            androidx.constraintlayout.motion.widget.ab r7 = r7.f5142e
            int r7 = r7.f4888l
            android.view.View r7 = r8.findViewById(r7)
            if (r7 != 0) goto L_0x02c0
            java.lang.String r7 = "TouchResponse"
            java.lang.String r8 = "could not find view to animate to"
            android.util.Log.e(r7, r8)
            goto L_0x02ed
        L_0x02c0:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f4960q
            int[] r6 = r3.f4957n
            r5.getLocationOnScreen(r6)
            int[] r5 = r3.f4957n
            r6 = 0
            r5 = r5[r6]
            float r5 = (float) r5
            int r6 = r7.getLeft()
            int r8 = r7.getRight()
            int r6 = r6 + r8
            float r6 = (float) r6
            float r6 = r6 / r21
            float r5 = r5 + r6
            int[] r6 = r3.f4957n
            r8 = 1
            r6 = r6[r8]
            float r6 = (float) r6
            int r8 = r7.getTop()
            int r7 = r7.getBottom()
            int r8 = r8 + r7
            float r7 = (float) r8
            float r7 = r7 / r21
            float r6 = r6 + r7
        L_0x02ed:
            float r7 = r32.getRawX()
            float r7 = r7 - r5
            float r8 = r32.getRawY()
            float r8 = r8 - r6
            float r11 = r32.getRawY()
            float r11 = r11 - r6
            double r11 = (double) r11
            float r13 = r32.getRawX()
            float r13 = r13 - r5
            double r14 = (double) r13
            double r11 = java.lang.Math.atan2(r11, r14)
            float r13 = r3.f4959p
            float r13 = r13 - r6
            double r13 = (double) r13
            float r6 = r3.f4958o
            float r6 = r6 - r5
            double r5 = (double) r6
            double r5 = java.lang.Math.atan2(r13, r5)
            double r5 = r11 - r5
            r13 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r5 = r5 * r13
            r13 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r5 = r5 / r13
            float r5 = (float) r5
            r6 = 1134886912(0x43a50000, float:330.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x032d
            r6 = -1011613696(0xffffffffc3b40000, float:-360.0)
            float r5 = r5 + r6
            goto L_0x0335
        L_0x032d:
            r6 = -1012596736(0xffffffffc3a50000, float:-330.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0335
            float r5 = r5 + r20
        L_0x0335:
            float r6 = java.lang.Math.abs(r5)
            double r13 = (double) r6
            int r6 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r6 > 0) goto L_0x0342
            boolean r6 = r3.f4955l
            if (r6 == 0) goto L_0x07ae
        L_0x0342:
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f4960q
            float r9 = r6.f4864n
            boolean r10 = r3.f4955l
            if (r10 != 0) goto L_0x0350
            r10 = 1
            r3.f4955l = r10
            r6.mo4735q(r9)
        L_0x0350:
            int r6 = r3.f4945b
            r10 = -1
            if (r6 == r10) goto L_0x037a
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f4960q
            float r13 = r3.f4948e
            float r14 = r3.f4947d
            float[] r15 = r3.f4956m
            r24 = r10
            r25 = r6
            r26 = r9
            r27 = r13
            r28 = r14
            r29 = r15
            r24.mo4722m(r25, r26, r27, r28, r29)
            float[] r6 = r3.f4956m
            r10 = 1
            r13 = r6[r10]
            double r13 = (double) r13
            double r13 = java.lang.Math.toDegrees(r13)
            float r13 = (float) r13
            r6[r10] = r13
            goto L_0x037f
        L_0x037a:
            r10 = 1
            float[] r6 = r3.f4956m
            r6[r10] = r20
        L_0x037f:
            float r6 = r3.f4964u
            float r5 = r5 * r6
            float[] r6 = r3.f4956m
            r6 = r6[r10]
            float r5 = r5 / r6
            float r9 = r9 + r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r6 = java.lang.Math.min(r9, r5)
            r9 = 0
            float r6 = java.lang.Math.max(r6, r9)
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f4960q
            float r13 = r10.f4864n
            int r14 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x03e4
            int r14 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r14 == 0) goto L_0x03a4
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x03ae
        L_0x03a4:
            int r5 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x03aa
            r9 = 1
            goto L_0x03ab
        L_0x03aa:
            r9 = 0
        L_0x03ab:
            r10.mo4719j(r9)
        L_0x03ae:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f4960q
            r5.mo4735q(r6)
            r5 = 1000(0x3e8, float:1.401E-42)
            r4.mo4823d(r5)
            float r5 = r4.mo4820a()
            float r4 = r4.mo4821b()
            double r9 = (double) r4
            double r4 = (double) r5
            double r13 = java.lang.Math.hypot(r9, r4)
            double r4 = java.lang.Math.atan2(r9, r4)
            double r4 = r4 - r11
            double r4 = java.lang.Math.sin(r4)
            double r6 = (double) r7
            double r8 = (double) r8
            double r6 = java.lang.Math.hypot(r6, r8)
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f4960q
            double r13 = r13 * r4
            double r13 = r13 / r6
            float r4 = (float) r13
            double r4 = (double) r4
            double r4 = java.lang.Math.toDegrees(r4)
            float r4 = (float) r4
            r8.f4855e = r4
            goto L_0x03e7
        L_0x03e4:
            r4 = 0
            r10.f4855e = r4
        L_0x03e7:
            float r4 = r32.getRawX()
            r3.f4958o = r4
            float r4 = r32.getRawY()
            r3.f4959p = r4
            goto L_0x07ae
        L_0x03f5:
            r5 = 0
            r3.f4955l = r5
            r5 = 16
            r4.mo4823d(r5)
            float r5 = r4.mo4820a()
            float r4 = r4.mo4821b()
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r3.f4960q
            float r10 = r9.f4864n
            int r9 = r9.getWidth()
            float r9 = (float) r9
            float r9 = r9 / r21
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.f4960q
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r21
            int r14 = r3.f4951h
            r15 = -1
            if (r14 == r15) goto L_0x0457
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r3.f4960q
            android.view.View r9 = r9.findViewById(r14)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.f4960q
            int[] r14 = r3.f4957n
            r11.getLocationOnScreen(r14)
            int[] r11 = r3.f4957n
            r14 = 0
            r11 = r11[r14]
            float r11 = (float) r11
            int r14 = r9.getLeft()
            int r15 = r9.getRight()
            int r14 = r14 + r15
            float r14 = (float) r14
            float r14 = r14 / r21
            float r11 = r11 + r14
            int[] r14 = r3.f4957n
            r15 = 1
            r14 = r14[r15]
            float r14 = (float) r14
            int r15 = r9.getTop()
            int r9 = r9.getBottom()
        L_0x044c:
            int r15 = r15 + r9
            float r9 = (float) r15
            float r9 = r9 / r21
            float r9 = r9 + r14
            r30 = r11
            r11 = r9
            r9 = r30
            goto L_0x0495
        L_0x0457:
            int r14 = r3.f4945b
            r15 = -1
            if (r14 == r15) goto L_0x0495
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r3.f4960q
            androidx.constraintlayout.motion.widget.r r9 = r9.mo4715b(r14)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.f4960q
            androidx.constraintlayout.motion.widget.ab r9 = r9.f5142e
            int r9 = r9.f4888l
            android.view.View r9 = r11.findViewById(r9)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.f4960q
            int[] r14 = r3.f4957n
            r11.getLocationOnScreen(r14)
            int[] r11 = r3.f4957n
            r14 = 0
            r11 = r11[r14]
            float r11 = (float) r11
            int r14 = r9.getLeft()
            int r15 = r9.getRight()
            int r14 = r14 + r15
            float r14 = (float) r14
            float r14 = r14 / r21
            float r11 = r11 + r14
            int[] r14 = r3.f4957n
            r15 = 1
            r14 = r14[r15]
            float r14 = (float) r14
            int r15 = r9.getTop()
            int r9 = r9.getBottom()
            goto L_0x044c
        L_0x0495:
            float r14 = r32.getRawX()
            float r14 = r14 - r9
            float r9 = r32.getRawY()
            float r9 = r9 - r11
            double r6 = (double) r9
            double r12 = (double) r14
            double r6 = java.lang.Math.atan2(r6, r12)
            double r6 = java.lang.Math.toDegrees(r6)
            int r12 = r3.f4945b
            r13 = -1
            if (r12 == r13) goto L_0x04d3
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r3.f4960q
            float r11 = r3.f4948e
            float r15 = r3.f4947d
            float[] r8 = r3.f4956m
            r24 = r13
            r25 = r12
            r26 = r10
            r27 = r11
            r28 = r15
            r29 = r8
            r24.mo4722m(r25, r26, r27, r28, r29)
            float[] r8 = r3.f4956m
            r11 = 1
            r12 = r8[r11]
            double r12 = (double) r12
            double r12 = java.lang.Math.toDegrees(r12)
            float r12 = (float) r12
            r8[r11] = r12
            goto L_0x04d8
        L_0x04d3:
            r11 = 1
            float[] r8 = r3.f4956m
            r8[r11] = r20
        L_0x04d8:
            float r4 = r4 + r9
            double r8 = (double) r4
            float r5 = r5 + r14
            double r4 = (double) r5
            double r4 = java.lang.Math.atan2(r8, r4)
            double r4 = java.lang.Math.toDegrees(r4)
            double r4 = r4 - r6
            float r4 = (float) r4
            r5 = 1115291648(0x427a0000, float:62.5)
            float r4 = r4 * r5
            boolean r5 = java.lang.Float.isNaN(r4)
            if (r5 != 0) goto L_0x0500
            r5 = 1077936128(0x40400000, float:3.0)
            float r13 = r4 * r5
            float r5 = r3.f4964u
            float r13 = r13 * r5
            float[] r5 = r3.f4956m
            r6 = 1
            r5 = r5[r6]
            float r13 = r13 / r5
            float r13 = r13 + r10
            goto L_0x0501
        L_0x0500:
            r13 = r10
        L_0x0501:
            r5 = 0
            int r6 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r6 == 0) goto L_0x0567
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r6 == 0) goto L_0x0567
            int r5 = r3.f4944a
            r6 = 3
            if (r5 == r6) goto L_0x0567
            float r6 = r3.f4964u
            float r4 = r4 * r6
            float[] r6 = r3.f4956m
            r7 = 1
            r6 = r6[r7]
            float r4 = r4 / r6
            double r6 = (double) r13
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 >= 0) goto L_0x0524
            r6 = 0
            goto L_0x0526
        L_0x0524:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x0526:
            r7 = 6
            if (r5 != r7) goto L_0x0536
            float r5 = r10 + r4
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0534
            float r4 = java.lang.Math.abs(r4)
        L_0x0534:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x0536:
            int r5 = r3.f4944a
            r7 = 7
            if (r5 != r7) goto L_0x0549
            float r5 = r10 + r4
            r6 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0548
            float r4 = java.lang.Math.abs(r4)
            float r4 = -r4
        L_0x0548:
            r6 = 0
        L_0x0549:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f4960q
            int r7 = r3.f4944a
            r8 = 1077936128(0x40400000, float:3.0)
            float r4 = r4 * r8
            r5.mo4742w(r7, r6, r4)
            r4 = 0
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x055f
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x07ae
        L_0x055f:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r3.f4960q
            r4 = 4
            r3.mo4713B(r4)
            goto L_0x07ae
        L_0x0567:
            r4 = 0
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0572
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x07ae
        L_0x0572:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r3.f4960q
            r4 = 4
            r3.mo4713B(r4)
            goto L_0x07ae
        L_0x057a:
            float r4 = r32.getRawX()
            r3.f4958o = r4
            float r4 = r32.getRawY()
            r3.f4959p = r4
            r4 = 0
            r3.f4955l = r4
            goto L_0x07ae
        L_0x058b:
            r4.mo4822c(r1)
            int r5 = r32.getAction()
            if (r5 == 0) goto L_0x079f
            r6 = 1
            if (r5 == r6) goto L_0x06c7
            r6 = 2
            if (r5 == r6) goto L_0x059c
            goto L_0x07ae
        L_0x059c:
            float r5 = r32.getRawY()
            float r6 = r3.f4959p
            float r5 = r5 - r6
            float r6 = r32.getRawX()
            float r7 = r3.f4958o
            float r6 = r6 - r7
            float r7 = r3.f4953j
            float r7 = r7 * r6
            float r8 = r3.f4954k
            float r8 = r8 * r5
            float r7 = r7 + r8
            float r7 = java.lang.Math.abs(r7)
            float r8 = r3.f4966w
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x05c1
            boolean r7 = r3.f4955l
            if (r7 == 0) goto L_0x07ae
        L_0x05c1:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.f4960q
            float r8 = r7.f4864n
            boolean r12 = r3.f4955l
            if (r12 != 0) goto L_0x05cf
            r12 = 1
            r3.f4955l = r12
            r7.mo4735q(r8)
        L_0x05cf:
            int r7 = r3.f4945b
            r12 = -1
            if (r7 == r12) goto L_0x05ee
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r3.f4960q
            float r13 = r3.f4948e
            float r14 = r3.f4947d
            float[] r15 = r3.f4956m
            r24 = r12
            r25 = r7
            r26 = r8
            r27 = r13
            r28 = r14
            r29 = r15
            r24.mo4722m(r25, r26, r27, r28, r29)
            r13 = 0
            r14 = 1
            goto L_0x060f
        L_0x05ee:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.f4960q
            int r7 = r7.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r3.f4960q
            int r12 = r12.getHeight()
            int r7 = java.lang.Math.min(r7, r12)
            float r7 = (float) r7
            float[] r12 = r3.f4956m
            float r13 = r3.f4954k
            float r13 = r13 * r7
            r14 = 1
            r12[r14] = r13
            float r13 = r3.f4953j
            float r7 = r7 * r13
            r13 = 0
            r12[r13] = r7
        L_0x060f:
            float r7 = r3.f4953j
            float[] r12 = r3.f4956m
            r15 = r12[r13]
            float r7 = r7 * r15
            float r13 = r3.f4954k
            r12 = r12[r14]
            float r13 = r13 * r12
            float r7 = r7 + r13
            float r12 = r3.f4964u
            float r7 = r7 * r12
            float r7 = java.lang.Math.abs(r7)
            double r12 = (double) r7
            r7 = 1008981770(0x3c23d70a, float:0.01)
            int r14 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r14 >= 0) goto L_0x0637
            float[] r9 = r3.f4956m
            r10 = 0
            r9[r10] = r7
            r12 = 1
            r9[r12] = r7
            goto L_0x0639
        L_0x0637:
            r10 = 0
            r12 = 1
        L_0x0639:
            float r9 = r3.f4953j
            r13 = 0
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x0646
            float[] r5 = r3.f4956m
            r5 = r5[r10]
            float r6 = r6 / r5
            goto L_0x064c
        L_0x0646:
            float[] r6 = r3.f4956m
            r6 = r6[r12]
            float r6 = r5 / r6
        L_0x064c:
            float r8 = r8 + r6
            r5 = 1065353216(0x3f800000, float:1.0)
            float r6 = java.lang.Math.min(r8, r5)
            r5 = 0
            float r6 = java.lang.Math.max(r6, r5)
            int r5 = r3.f4944a
            r8 = 6
            if (r5 != r8) goto L_0x0661
            float r6 = java.lang.Math.max(r6, r7)
        L_0x0661:
            int r5 = r3.f4944a
            r7 = 7
            if (r5 != r7) goto L_0x066d
            r5 = 1065185444(0x3f7d70a4, float:0.99)
            float r6 = java.lang.Math.min(r6, r5)
        L_0x066d:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f4960q
            float r7 = r5.f4864n
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x06b6
            r8 = 0
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 == 0) goto L_0x0680
            r9 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x068a
        L_0x0680:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0686
            r7 = 1
            goto L_0x0687
        L_0x0686:
            r7 = 0
        L_0x0687:
            r5.mo4719j(r7)
        L_0x068a:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f4960q
            r5.mo4735q(r6)
            r5 = 1000(0x3e8, float:1.401E-42)
            r4.mo4823d(r5)
            float r5 = r4.mo4820a()
            float r4 = r4.mo4821b()
            float r6 = r3.f4953j
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x06aa
            float[] r4 = r3.f4956m
            r6 = 0
            r4 = r4[r6]
            float r5 = r5 / r4
            goto L_0x06b1
        L_0x06aa:
            float[] r5 = r3.f4956m
            r6 = 1
            r5 = r5[r6]
            float r5 = r4 / r5
        L_0x06b1:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.f4960q
            r4.f4855e = r5
            goto L_0x06b9
        L_0x06b6:
            r4 = 0
            r5.f4855e = r4
        L_0x06b9:
            float r4 = r32.getRawX()
            r3.f4958o = r4
            float r4 = r32.getRawY()
            r3.f4959p = r4
            goto L_0x07ae
        L_0x06c7:
            r5 = 0
            r3.f4955l = r5
            r5 = 1000(0x3e8, float:1.401E-42)
            r4.mo4823d(r5)
            float r5 = r4.mo4820a()
            float r4 = r4.mo4821b()
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f4960q
            float r7 = r6.f4864n
            int r8 = r3.f4945b
            r9 = -1
            if (r8 == r9) goto L_0x06f8
            float r9 = r3.f4948e
            float r10 = r3.f4947d
            float[] r12 = r3.f4956m
            r24 = r6
            r25 = r8
            r26 = r7
            r27 = r9
            r28 = r10
            r29 = r12
            r24.mo4722m(r25, r26, r27, r28, r29)
            r9 = 0
            r10 = 1
            goto L_0x0717
        L_0x06f8:
            int r6 = r6.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f4960q
            int r8 = r8.getHeight()
            int r6 = java.lang.Math.min(r6, r8)
            float r6 = (float) r6
            float[] r8 = r3.f4956m
            float r9 = r3.f4954k
            float r9 = r9 * r6
            r10 = 1
            r8[r10] = r9
            float r9 = r3.f4953j
            float r6 = r6 * r9
            r9 = 0
            r8[r9] = r6
        L_0x0717:
            float[] r6 = r3.f4956m
            r8 = r6[r9]
            r6 = r6[r10]
            float r9 = r3.f4953j
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x0726
            float r5 = r5 / r8
            goto L_0x0728
        L_0x0726:
            float r5 = r4 / r6
        L_0x0728:
            boolean r4 = java.lang.Float.isNaN(r5)
            if (r4 != 0) goto L_0x0734
            r4 = 1077936128(0x40400000, float:3.0)
            float r4 = r5 / r4
            float r4 = r4 + r7
            goto L_0x0735
        L_0x0734:
            r4 = r7
        L_0x0735:
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x078d
            r6 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x078d
            int r6 = r3.f4944a
            r8 = 3
            if (r6 == r8) goto L_0x078d
            double r8 = (double) r4
            r12 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x074e
            r4 = 0
            goto L_0x0750
        L_0x074e:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0750:
            r8 = 6
            if (r6 != r8) goto L_0x0760
            float r4 = r7 + r5
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x075e
            float r5 = java.lang.Math.abs(r5)
        L_0x075e:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0760:
            int r6 = r3.f4944a
            r8 = 7
            if (r6 != r8) goto L_0x0774
            float r4 = r7 + r5
            r6 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0773
            float r4 = java.lang.Math.abs(r5)
            float r4 = -r4
            r5 = r4
        L_0x0773:
            r4 = 0
        L_0x0774:
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f4960q
            int r8 = r3.f4944a
            r6.mo4742w(r8, r4, r5)
            r4 = 0
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0786
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x07ae
        L_0x0786:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r3.f4960q
            r4 = 4
            r3.mo4713B(r4)
            goto L_0x07ae
        L_0x078d:
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0798
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x07ae
        L_0x0798:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r3.f4960q
            r4 = 4
            r3.mo4713B(r4)
            goto L_0x07ae
        L_0x079f:
            float r4 = r32.getRawX()
            r3.f4958o = r4
            float r4 = r32.getRawY()
            r3.f4959p = r4
            r4 = 0
            r3.f4955l = r4
        L_0x07ae:
            float r3 = r32.getRawX()
            r2.f4931o = r3
            float r3 = r32.getRawY()
            r2.f4932p = r3
            int r1 = r32.getAction()
            r3 = 1
            if (r1 != r3) goto L_0x07db
            androidx.constraintlayout.motion.widget.y r1 = r2.f4933q
            if (r1 == 0) goto L_0x07db
            android.view.VelocityTracker r3 = r1.f5192b
            if (r3 == 0) goto L_0x07d0
            r3.recycle()
            r3 = 0
            r1.f5192b = r3
            goto L_0x07d1
        L_0x07d0:
            r3 = 0
        L_0x07d1:
            r2.f4933q = r3
            int r1 = r0.f4857g
            r3 = -1
            if (r1 == r3) goto L_0x07db
            r2.mo4773l(r0, r1)
        L_0x07db:
            androidx.constraintlayout.motion.widget.af r1 = r0.f4852b
            androidx.constraintlayout.motion.widget.ae r1 = r1.f4919c
            r2 = 4
            boolean r1 = r1.mo4761b(r2)
            if (r1 == 0) goto L_0x07ef
            androidx.constraintlayout.motion.widget.af r1 = r0.f4852b
            androidx.constraintlayout.motion.widget.ae r1 = r1.f4919c
            androidx.constraintlayout.motion.widget.ai r1 = r1.f4910l
            boolean r1 = r1.f4955l
            return r1
        L_0x07ef:
            r1 = 1
            return r1
        L_0x07f1:
            boolean r1 = super.onTouchEvent(r32)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C1734s) {
            C1734s sVar = (C1734s) view;
            if (this.f4818A == null) {
                this.f4818A = new CopyOnWriteArrayList();
            }
            this.f4818A.add(sVar);
            throw null;
        }
    }

    /* renamed from: p */
    public final void mo4734p() {
        this.f4830M.mo4818b();
        invalidate();
    }

    /* renamed from: q */
    public final void mo4735q(float f) {
        if (f < 0.0f || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f4827J == null) {
                this.f4827J = new C1741z(this);
            }
            this.f4827J.f5193a = f;
            return;
        }
        if (f <= 0.0f) {
            if (this.f4864n == 1.0f && this.f4857g == this.f4858h) {
                mo4713B(3);
            }
            this.f4857g = this.f4856f;
            if (this.f4864n == 0.0f) {
                mo4713B(4);
            }
        } else if (f >= 1.0f) {
            if (this.f4864n == 0.0f && this.f4857g == this.f4856f) {
                mo4713B(3);
            }
            this.f4857g = this.f4858h;
            if (this.f4864n == 1.0f) {
                mo4713B(4);
            }
        } else {
            this.f4857g = -1;
            mo4713B(3);
        }
        if (this.f4852b != null) {
            this.f4836ae = true;
            this.f4865o = f;
            this.f4863m = f;
            this.f4835ad = -1;
            this.f4833ab = -1;
            this.f4853c = null;
            this.f4866p = true;
            invalidate();
        }
    }

    /* renamed from: r */
    public final void mo4736r(int i, int i2, int i3) {
        C1756o oVar;
        C1747f fVar;
        int a;
        C1756o oVar2;
        mo4713B(2);
        this.f4857g = i;
        this.f4856f = -1;
        this.f4858h = -1;
        C1749h hVar = this.f5207W;
        if (hVar != null) {
            float f = (float) i2;
            float f2 = (float) i3;
            int i4 = hVar.f5322b;
            if (i4 == i) {
                if (i == -1) {
                    fVar = (C1747f) hVar.f5324d.valueAt(0);
                } else {
                    fVar = (C1747f) hVar.f5324d.get(i4);
                }
                int i5 = hVar.f5323c;
                if ((i5 == -1 || !((C1748g) fVar.f5312b.get(i5)).mo4867a(f, f2)) && hVar.f5323c != (a = fVar.mo4866a(f, f2))) {
                    if (a == -1) {
                        oVar2 = null;
                    } else {
                        oVar2 = ((C1748g) fVar.f5312b.get(a)).f5320f;
                    }
                    if (a == -1) {
                        int i6 = fVar.f5313c;
                    } else {
                        int i7 = ((C1748g) fVar.f5312b.get(a)).f5319e;
                    }
                    if (oVar2 != null) {
                        hVar.f5323c = a;
                        oVar2.mo4888h(hVar.f5321a);
                        return;
                    }
                    return;
                }
                return;
            }
            hVar.f5322b = i;
            C1747f fVar2 = (C1747f) hVar.f5324d.get(i);
            int a2 = fVar2.mo4866a(f, f2);
            if (a2 == -1) {
                oVar = fVar2.f5314d;
            } else {
                oVar = ((C1748g) fVar2.f5312b.get(a2)).f5320f;
            }
            if (a2 == -1) {
                int i8 = fVar2.f5313c;
            } else {
                int i9 = ((C1748g) fVar2.f5312b.get(a2)).f5319e;
            }
            if (oVar == null) {
                StringBuilder sb = new StringBuilder(79);
                sb.append("NO Constraint set found ! id=");
                sb.append(i);
                sb.append(", dim =");
                sb.append(f);
                sb.append(", ");
                sb.append(f2);
                Log.v("ConstraintLayoutStates", sb.toString());
                return;
            }
            hVar.f5323c = a2;
            oVar.mo4888h(hVar.f5321a);
            return;
        }
        C1707af afVar = this.f4852b;
        if (afVar != null) {
            afVar.mo4775n(i).mo4888h(this);
        }
    }

    /* renamed from: s */
    public final void mo4738s(int i) {
        C1706ae aeVar;
        C1707af afVar = this.f4852b;
        if (afVar != null) {
            ArrayList arrayList = afVar.f4920d;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    aeVar = null;
                    break;
                }
                aeVar = (C1706ae) arrayList.get(i2);
                i2++;
                if (aeVar.f4899a == i) {
                    break;
                }
            }
            this.f4856f = aeVar.f4902d;
            this.f4858h = aeVar.f4901c;
            if (!isAttachedToWindow()) {
                if (this.f4827J == null) {
                    this.f4827J = new C1741z(this);
                }
                C1741z zVar = this.f4827J;
                zVar.f5195c = this.f4856f;
                zVar.f5196d = this.f4858h;
                return;
            }
            int i3 = this.f4857g;
            float f = i3 == this.f4856f ? 0.0f : i3 == this.f4858h ? 1.0f : Float.NaN;
            this.f4852b.mo4771j(aeVar);
            this.f4830M.mo4819e(this.f4852b.mo4775n(this.f4856f), this.f4852b.mo4775n(this.f4858h));
            mo4734p();
            if (this.f4864n != f) {
                if (f == 0.0f) {
                    mo4719j(true);
                    this.f4852b.mo4775n(this.f4856f).mo4888h(this);
                } else if (f == 1.0f) {
                    mo4719j(false);
                    this.f4852b.mo4775n(this.f4858h).mo4888h(this);
                }
            }
            this.f4864n = true != Float.isNaN(f) ? f : 0.0f;
            if (Float.isNaN(f)) {
                Log.v("MotionLayout", C1701a.m4618a().concat(" transitionToStart "));
                mo4718i(0.0f);
                return;
            }
            mo4735q(f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r1 = (r1 = r1.f4919c).f4910l;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1884t(android.view.View r1, android.view.View r2, int r3, int r4) {
        /*
            r0 = this;
            androidx.constraintlayout.motion.widget.af r1 = r0.f4852b
            if (r1 == 0) goto L_0x0015
            androidx.constraintlayout.motion.widget.ae r1 = r1.f4919c
            if (r1 == 0) goto L_0x0015
            androidx.constraintlayout.motion.widget.ai r1 = r1.f4910l
            if (r1 == 0) goto L_0x0015
            int r1 = r1.f4965v
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r1 = 1
            return r1
        L_0x0015:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo1884t(android.view.View, android.view.View, int, int):boolean");
    }

    public final String toString() {
        Context context = getContext();
        String c = C1701a.m4620c(context, this.f4856f);
        String c2 = C1701a.m4620c(context, this.f4858h);
        float f = this.f4864n;
        float f2 = this.f4855e;
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 47 + String.valueOf(c2).length());
        sb.append(c);
        sb.append("->");
        sb.append(c2);
        sb.append(" (pos:");
        sb.append(f);
        sb.append(" Dpos/Dt:");
        sb.append(f2);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo4740u(C1706ae aeVar) {
        long j;
        this.f4852b.mo4771j(aeVar);
        mo4713B(2);
        if (this.f4857g == this.f4852b.mo4766e()) {
            this.f4864n = 1.0f;
            this.f4863m = 1.0f;
            this.f4865o = 1.0f;
        } else {
            this.f4864n = 0.0f;
            this.f4863m = 0.0f;
            this.f4865o = 0.0f;
        }
        if (aeVar.mo4761b(1)) {
            j = -1;
        } else {
            j = System.nanoTime();
        }
        this.f4835ad = j;
        int f = this.f4852b.mo4767f();
        int e = this.f4852b.mo4766e();
        if (f != this.f4856f || e != this.f4858h) {
            this.f4856f = f;
            this.f4858h = e;
            this.f4852b.mo4772k(f, e);
            this.f4830M.mo4819e(this.f4852b.mo4775n(this.f4856f), this.f4852b.mo4775n(this.f4858h));
            C1739x xVar = this.f4830M;
            int i = this.f4856f;
            int i2 = this.f4858h;
            xVar.f5188e = i;
            xVar.f5189f = i2;
            xVar.mo4818b();
            mo4734p();
        }
    }

    /* renamed from: v */
    public final void mo4741v(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f4827J == null) {
                this.f4827J = new C1741z(this);
            }
            C1741z zVar = this.f4827J;
            zVar.f5195c = i;
            zVar.f5196d = i2;
            return;
        }
        C1707af afVar = this.f4852b;
        if (afVar != null) {
            this.f4856f = i;
            this.f4858h = i2;
            afVar.mo4772k(i, i2);
            this.f4830M.mo4819e(this.f4852b.mo4775n(i), this.f4852b.mo4775n(i2));
            mo4734p();
            this.f4864n = 0.0f;
            mo4718i(0.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r1 != 7) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if ((r1 + ((r4 * r5) - (((r2 * r5) * r5) / 2.0f))) > 1.0f) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if ((r1 + ((r4 * r5) + (((r2 * r5) * r5) / 2.0f))) < 0.0f) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        r0.f4838ag.mo4709b(r0.f4864n, r15, r16, r0.f4834ac, r0.f4852b.mo4762a(), r0.f4852b.mo4763b());
        r0.f4855e = 0.0f;
        r0.f4865o = r8;
        r0.f4853c = r0.f4838ag;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4742w(int r14, float r15, float r16) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r8 = r15
            r4 = r16
            androidx.constraintlayout.motion.widget.af r2 = r0.f4852b
            if (r2 != 0) goto L_0x000a
            return
        L_0x000a:
            float r2 = r0.f4864n
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0011
            return
        L_0x0011:
            r2 = 1
            r0.f4837af = r2
            long r5 = java.lang.System.nanoTime()
            r0.f4833ab = r5
            androidx.constraintlayout.motion.widget.af r3 = r0.f4852b
            int r3 = r3.mo4765d()
            float r3 = (float) r3
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r3 / r5
            r0.f4834ac = r5
            r0.f4865o = r8
            r0.f4866p = r2
            r3 = 7
            r6 = 6
            r7 = 2
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            if (r1 == 0) goto L_0x00b8
            if (r1 == r2) goto L_0x00b8
            if (r1 == r7) goto L_0x00b8
            r11 = 4
            if (r1 == r11) goto L_0x00a5
            r11 = 5
            if (r1 == r11) goto L_0x0043
            if (r1 == r6) goto L_0x00b8
            if (r1 == r3) goto L_0x00b8
            goto L_0x0121
        L_0x0043:
            float r1 = r0.f4864n
            androidx.constraintlayout.motion.widget.af r2 = r0.f4852b
            float r2 = r2.mo4762a()
            r3 = 1073741824(0x40000000, float:2.0)
            int r5 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0061
            float r5 = r4 / r2
            float r6 = r4 * r5
            float r2 = r2 * r5
            float r2 = r2 * r5
            float r2 = r2 / r3
            float r6 = r6 - r2
            float r1 = r1 + r6
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0083
            goto L_0x0070
        L_0x0061:
            float r5 = -r4
            float r5 = r5 / r2
            float r6 = r4 * r5
            float r2 = r2 * r5
            float r2 = r2 * r5
            float r2 = r2 / r3
            float r6 = r6 + r2
            float r1 = r1 + r6
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x0083
        L_0x0070:
            androidx.constraintlayout.motion.widget.v r1 = r0.f4839ah
            float r2 = r0.f4864n
            androidx.constraintlayout.motion.widget.af r3 = r0.f4852b
            float r3 = r3.mo4762a()
            r1.mo4813b(r4, r2, r3)
            androidx.constraintlayout.motion.widget.v r1 = r0.f4839ah
            r0.f4853c = r1
            goto L_0x0121
        L_0x0083:
            androidx.constraintlayout.motion.a.b r1 = r0.f4838ag
            float r2 = r0.f4864n
            float r5 = r0.f4834ac
            androidx.constraintlayout.motion.widget.af r3 = r0.f4852b
            float r6 = r3.mo4762a()
            androidx.constraintlayout.motion.widget.af r3 = r0.f4852b
            float r7 = r3.mo4763b()
            r3 = r15
            r4 = r16
            r1.mo4709b(r2, r3, r4, r5, r6, r7)
            r0.f4855e = r10
            r0.f4865o = r8
            androidx.constraintlayout.motion.a.b r1 = r0.f4838ag
            r0.f4853c = r1
            goto L_0x0121
        L_0x00a5:
            androidx.constraintlayout.motion.widget.v r1 = r0.f4839ah
            float r2 = r0.f4864n
            androidx.constraintlayout.motion.widget.af r3 = r0.f4852b
            float r3 = r3.mo4762a()
            r1.mo4813b(r4, r2, r3)
            androidx.constraintlayout.motion.widget.v r1 = r0.f4839ah
            r0.f4853c = r1
            goto L_0x0121
        L_0x00b8:
            if (r1 == r2) goto L_0x00c4
            if (r1 != r3) goto L_0x00bd
            goto L_0x00c4
        L_0x00bd:
            if (r1 == r7) goto L_0x00c5
            if (r1 != r6) goto L_0x00c2
            goto L_0x00c5
        L_0x00c2:
            r9 = r8
            goto L_0x00c5
        L_0x00c4:
            r9 = 0
        L_0x00c5:
            androidx.constraintlayout.motion.widget.af r1 = r0.f4852b
            androidx.constraintlayout.motion.widget.ae r2 = r1.f4919c
            if (r2 == 0) goto L_0x0105
            androidx.constraintlayout.motion.widget.ai r2 = r2.f4910l
            if (r2 == 0) goto L_0x0105
            int r3 = r2.f4940C
            if (r3 != 0) goto L_0x00d4
            goto L_0x0105
        L_0x00d4:
            androidx.constraintlayout.motion.a.b r1 = r0.f4838ag
            float r3 = r0.f4864n
            float r4 = r2.f4968y
            float r5 = r2.f4969z
            float r6 = r2.f4967x
            float r7 = r2.f4938A
            int r2 = r2.f4939B
            androidx.constraintlayout.a.a.a.r r8 = r1.f4808a
            if (r8 != 0) goto L_0x00ed
            androidx.constraintlayout.a.a.a.r r8 = new androidx.constraintlayout.a.a.a.r
            r8.<init>()
            r1.f4808a = r8
        L_0x00ed:
            androidx.constraintlayout.a.a.a.r r8 = r1.f4808a
            r1.f4809b = r8
            double r11 = (double) r9
            r8.f4446c = r11
            double r11 = (double) r6
            r8.f4444a = r11
            r8.f4448e = r3
            double r5 = (double) r5
            r8.f4445b = r5
            r8.f4449f = r4
            r8.f4450g = r7
            r8.f4451h = r2
            r8.f4447d = r10
            goto L_0x011b
        L_0x0105:
            androidx.constraintlayout.motion.a.b r2 = r0.f4838ag
            float r3 = r0.f4864n
            float r6 = r1.mo4762a()
            androidx.constraintlayout.motion.widget.af r1 = r0.f4852b
            float r7 = r1.mo4763b()
            r1 = r2
            r2 = r3
            r3 = r9
            r4 = r16
            r1.mo4709b(r2, r3, r4, r5, r6, r7)
        L_0x011b:
            r0.f4865o = r9
            androidx.constraintlayout.motion.a.b r1 = r0.f4838ag
            r0.f4853c = r1
        L_0x0121:
            r1 = 0
            r0.f4836ae = r1
            long r1 = java.lang.System.nanoTime()
            r0.f4833ab = r1
            r13.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo4742w(int, float, float):void");
    }

    /* renamed from: x */
    public final void mo4743x() {
        mo4718i(1.0f);
        this.f4828K = null;
    }

    /* renamed from: y */
    public final void mo4744y(int i) {
        C1765x xVar;
        if (!isAttachedToWindow()) {
            if (this.f4827J == null) {
                this.f4827J = new C1741z(this);
            }
            this.f4827J.f5196d = i;
            return;
        }
        C1707af afVar = this.f4852b;
        if (!(afVar == null || (xVar = afVar.f4918b) == null)) {
            int i2 = this.f4857g;
            C1763v vVar = (C1763v) xVar.f5492b.get(i);
            if (vVar == null) {
                i2 = i;
            } else if (vVar.f5485c != i2) {
                ArrayList arrayList = vVar.f5484b;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i2 = vVar.f5485c;
                        break;
                    }
                    int i4 = i3 + 1;
                    if (i2 == ((C1764w) arrayList.get(i3)).f5490e) {
                        break;
                    }
                    i3 = i4;
                }
            }
            if (i2 != -1) {
                i = i2;
            }
        }
        int i5 = this.f4857g;
        if (i5 != i) {
            if (this.f4856f == i) {
                mo4718i(0.0f);
            } else if (this.f4858h == i) {
                mo4718i(1.0f);
            } else {
                this.f4858h = i;
                if (i5 != -1) {
                    mo4741v(i5, i);
                    mo4718i(1.0f);
                    this.f4864n = 0.0f;
                    mo4743x();
                    return;
                }
                this.f4837af = false;
                this.f4865o = 1.0f;
                this.f4863m = 0.0f;
                this.f4864n = 0.0f;
                this.f4835ad = System.nanoTime();
                this.f4833ab = System.nanoTime();
                this.f4836ae = false;
                this.f4853c = null;
                this.f4834ac = ((float) this.f4852b.mo4765d()) / 1000.0f;
                this.f4856f = -1;
                this.f4852b.mo4772k(-1, this.f4858h);
                SparseArray sparseArray = new SparseArray();
                int childCount = getChildCount();
                this.f4862l.clear();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    this.f4862l.put(childAt, new C1733r(childAt));
                    sparseArray.put(childAt.getId(), (C1733r) this.f4862l.get(childAt));
                }
                this.f4866p = true;
                this.f4830M.mo4819e((C1756o) null, this.f4852b.mo4775n(i));
                mo4734p();
                this.f4830M.mo4817a();
                int childCount2 = getChildCount();
                for (int i7 = 0; i7 < childCount2; i7++) {
                    View childAt2 = getChildAt(i7);
                    C1733r rVar = (C1733r) this.f4862l.get(childAt2);
                    if (rVar != null) {
                        C1703ab abVar = rVar.f5142e;
                        abVar.f4880d = 0.0f;
                        abVar.f4881e = 0.0f;
                        abVar.mo4752c(childAt2.getX(), childAt2.getY(), (float) childAt2.getWidth(), (float) childAt2.getHeight());
                        rVar.f5144g.mo4802b(childAt2);
                    }
                }
                int width = getWidth();
                int height = getHeight();
                for (int i8 = 0; i8 < childCount; i8++) {
                    C1733r rVar2 = (C1733r) this.f4862l.get(getChildAt(i8));
                    if (rVar2 != null) {
                        this.f4852b.mo4769h(rVar2);
                        rVar2.mo4810f(width, height, System.nanoTime());
                    }
                }
                float c = this.f4852b.mo4764c();
                if (c != 0.0f) {
                    float f = Float.MAX_VALUE;
                    float f2 = -3.4028235E38f;
                    for (int i9 = 0; i9 < childCount; i9++) {
                        C1703ab abVar2 = ((C1733r) this.f4862l.get(getChildAt(i9))).f5143f;
                        float f3 = abVar2.f4883g + abVar2.f4882f;
                        f = Math.min(f, f3);
                        f2 = Math.max(f2, f3);
                    }
                    for (int i10 = 0; i10 < childCount; i10++) {
                        C1733r rVar3 = (C1733r) this.f4862l.get(getChildAt(i10));
                        C1703ab abVar3 = rVar3.f5143f;
                        float f4 = abVar3.f4882f;
                        float f5 = abVar3.f4883g;
                        rVar3.f5150m = 1.0f / (1.0f - c);
                        rVar3.f5149l = c - ((((f4 + f5) - f) * c) / (f2 - f));
                    }
                }
                this.f4863m = 0.0f;
                this.f4864n = 0.0f;
                this.f4866p = true;
                invalidate();
            }
        }
    }

    /* renamed from: z */
    public final void mo4745z(int i, C1756o oVar) {
        C1707af afVar = this.f4852b;
        if (afVar != null) {
            afVar.f4922f.put(i, oVar);
        }
        this.f4830M.mo4819e(this.f4852b.mo4775n(this.f4856f), this.f4852b.mo4775n(this.f4858h));
        mo4734p();
        if (this.f4857g == i) {
            oVar.mo4888h(this);
        }
    }

    public final void requestLayout() {
        C1707af afVar;
        C1706ae aeVar;
        if (!this.f4819B && this.f4857g == -1 && (afVar = this.f4852b) != null && (aeVar = afVar.f4919c) != null) {
            int i = aeVar.f4915q;
            if (i != 0) {
                if (i == 2) {
                    int childCount = getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        ((C1733r) this.f4862l.get(getChildAt(i2))).f5141d = true;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new HashMap();
        this.f4829L = new Rect();
        this.f4832O = 1;
        this.f4830M = new C1739x(this);
        this.f4848aq = false;
        this.f4849ar = new RectF();
        this.f4850as = null;
        this.f4851at = null;
        this.f4831N = new ArrayList();
        m4587M(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new HashMap();
        this.f4829L = new Rect();
        this.f4832O = 1;
        this.f4830M = new C1739x(this);
        this.f4848aq = false;
        this.f4849ar = new RectF();
        this.f4850as = null;
        this.f4851at = null;
        this.f4831N = new ArrayList();
        m4587M(attributeSet);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C1710ai aiVar;
        int i;
        RectF b;
        int i2;
        C1707af afVar = this.f4852b;
        if (afVar == null || !this.f4861k) {
            return false;
        }
        C1716ao aoVar = afVar.f4930n;
        int i3 = aoVar.f5007a.f4857g;
        if (i3 != -1) {
            if (aoVar.f5009c == null) {
                aoVar.f5009c = new HashSet();
                ArrayList arrayList = aoVar.f5008b;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    C1714am amVar = (C1714am) arrayList.get(i4);
                    int childCount = aoVar.f5007a.getChildCount();
                    int i5 = 0;
                    while (true) {
                        i2 = i4 + 1;
                        if (i5 >= childCount) {
                            break;
                        }
                        View childAt = aoVar.f5007a.getChildAt(i5);
                        if (amVar.mo4788c(childAt)) {
                            childAt.getId();
                            aoVar.f5009c.add(childAt);
                        }
                        i5++;
                    }
                    i4 = i2;
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList arrayList2 = aoVar.f5011e;
            int i6 = 2;
            int i7 = 1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                ArrayList arrayList3 = aoVar.f5011e;
                int size2 = arrayList3.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    C1713al alVar = (C1713al) arrayList3.get(i8);
                    if (action != 1) {
                        if (action == 2) {
                            alVar.f4973a.f5139b.getHitRect(alVar.f4982j);
                            if (!alVar.f4982j.contains((int) x, (int) y)) {
                                if (alVar.f4978f) {
                                }
                            }
                        }
                    } else if (alVar.f4978f) {
                    }
                    alVar.mo4785b();
                }
            }
            if (action == 0 || action == 1) {
                C1756o c = aoVar.f5007a.mo4716c(i3);
                ArrayList arrayList4 = aoVar.f5008b;
                int size3 = arrayList4.size();
                int i9 = 0;
                while (i9 < size3) {
                    C1714am amVar2 = (C1714am) arrayList4.get(i9);
                    int i10 = amVar2.f4987b;
                    if (i10 != i7 ? !(i10 != i6 ? !(i10 == 3 && action == 0) : action != i7) : action == 0) {
                        Iterator it = aoVar.f5009c.iterator();
                        while (it.hasNext()) {
                            View view = (View) it.next();
                            if (amVar2.mo4788c(view)) {
                                view.getHitRect(rect);
                                if (rect.contains((int) x, (int) y)) {
                                    MotionLayout motionLayout = aoVar.f5007a;
                                    View[] viewArr = new View[i7];
                                    viewArr[0] = view;
                                    C1714am amVar3 = amVar2;
                                    MotionLayout motionLayout2 = motionLayout;
                                    amVar2.mo4786a(aoVar, motionLayout2, i3, c, viewArr);
                                    i9 = i9;
                                    amVar2 = amVar3;
                                    size3 = size3;
                                    i7 = 1;
                                }
                            }
                        }
                    }
                    i9++;
                    size3 = size3;
                    i7 = 1;
                    i6 = 2;
                }
            }
        }
        C1706ae aeVar = this.f4852b.f4919c;
        if (aeVar == null || !aeVar.mo4760a() || (aiVar = aeVar.f4910l) == null) {
            return false;
        }
        if ((motionEvent.getAction() == 0 && (b = aiVar.mo4779b(this, new RectF())) != null && !b.contains(motionEvent.getX(), motionEvent.getY())) || (i = aiVar.f4946c) == -1) {
            return false;
        }
        View view2 = this.f4850as;
        if (view2 == null || view2.getId() != i) {
            this.f4850as = findViewById(i);
        }
        View view3 = this.f4850as;
        if (view3 == null) {
            return false;
        }
        this.f4849ar.set((float) view3.getLeft(), (float) this.f4850as.getTop(), (float) this.f4850as.getRight(), (float) this.f4850as.getBottom());
        if (!this.f4849ar.contains(motionEvent.getX(), motionEvent.getY()) || m4589O((float) this.f4850as.getLeft(), (float) this.f4850as.getTop(), this.f4850as, motionEvent)) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }
}
