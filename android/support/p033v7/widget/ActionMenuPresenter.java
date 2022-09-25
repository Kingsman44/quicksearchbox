package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.view.C0433a;
import android.support.p033v7.view.menu.ActionMenuItemView;
import android.support.p033v7.view.menu.C0451ae;
import android.support.p033v7.view.menu.C0453ag;
import android.support.p033v7.view.menu.C0454ah;
import android.support.p033v7.view.menu.C0460an;
import android.support.p033v7.view.menu.C0464d;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.view.menu.C0480t;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2089d;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.ActionMenuPresenter */
/* compiled from: PG */
public final class ActionMenuPresenter extends C0464d {

    /* renamed from: h */
    public C0768n f1769h;

    /* renamed from: i */
    public int f1770i;

    /* renamed from: j */
    public boolean f1771j;

    /* renamed from: k */
    C0769o f1772k;

    /* renamed from: l */
    public C0746j f1773l;

    /* renamed from: m */
    C0766l f1774m;

    /* renamed from: n */
    final C0770p f1775n = new C0770p(this);

    /* renamed from: o */
    int f1776o;

    /* renamed from: p */
    private boolean f1777p;

    /* renamed from: q */
    private boolean f1778q;

    /* renamed from: r */
    private int f1779r;

    /* renamed from: s */
    private int f1780s;

    /* renamed from: t */
    private final SparseBooleanArray f1781t = new SparseBooleanArray();

    /* renamed from: u */
    private C0765k f1782u;

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$SavedState */
    /* compiled from: PG */
    class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0771q();

        /* renamed from: a */
        public int f1783a;

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f1783a = parcel.readInt();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1783a);
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final View mo1613b(C0480t tVar, View view, ViewGroup viewGroup) {
        C0453ag agVar;
        View actionView = tVar.getActionView();
        int i = 0;
        if (actionView == null || tVar.mo1708m()) {
            if (view instanceof C0453ag) {
                agVar = (C0453ag) view;
            } else {
                agVar = (C0453ag) this.f1593d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            }
            agVar.mo1446f(tVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) agVar;
            actionMenuItemView.f1507b = (ActionMenuView) this.f1595f;
            if (this.f1782u == null) {
                this.f1782u = new C0765k(this);
            }
            actionMenuItemView.f1508c = this.f1782u;
            actionView = (View) agVar;
        }
        if (true == tVar.f1696o) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof C0774t)) {
            actionView.setLayoutParams(ActionMenuView.m1716k(layoutParams));
        }
        return actionView;
    }

    /* renamed from: c */
    public final void mo1520c(Context context, C0477q qVar) {
        this.f1591b = context;
        LayoutInflater.from(this.f1591b);
        this.f1592c = qVar;
        Resources resources = context.getResources();
        if (!this.f1778q) {
            this.f1777p = true;
        }
        this.f1779r = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.f1770i = C0433a.m1392a(context);
        int i = this.f1779r;
        if (this.f1777p) {
            if (this.f1769h == null) {
                this.f1769h = new C0768n(this, this.f1590a);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1769h.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1769h.getMeasuredWidth();
        } else {
            this.f1769h = null;
        }
        this.f1780s = i;
        float f = resources.getDisplayMetrics().density;
    }

    /* renamed from: d */
    public final void mo1543d(C0477q qVar, boolean z) {
        mo1887l();
        mo1890p();
        C0451ae aeVar = this.f1594e;
        if (aeVar != null) {
            aeVar.mo1121a(qVar, z);
        }
    }

    /* renamed from: eI */
    public final Parcelable mo1545eI() {
        SavedState savedState = new SavedState();
        savedState.f1783a = this.f1776o;
        return savedState;
    }

    /* renamed from: f */
    public final void mo1546f(boolean z) {
        C0454ah ahVar;
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f1595f;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            C0477q qVar = this.f1592c;
            if (qVar != null) {
                qVar.mo1664k();
                ArrayList e = this.f1592c.mo1654e();
                int size = e.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0480t tVar = (C0480t) e.get(i2);
                    if (tVar.mo1710o()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0480t a = childAt instanceof C0453ag ? ((C0453ag) childAt).mo1441a() : null;
                        View b = mo1613b(tVar, childAt, viewGroup);
                        if (tVar != a) {
                            b.setPressed(false);
                            b.jumpDrawablesToCurrentState();
                        }
                        if (b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b);
                            }
                            ((ViewGroup) this.f1595f).addView(b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f1769h) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f1595f).requestLayout();
        C0477q qVar2 = this.f1592c;
        if (qVar2 != null) {
            qVar2.mo1664k();
            ArrayList arrayList2 = qVar2.f1653d;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C2089d dVar = ((C0480t) arrayList2.get(i3)).f1695n;
            }
        }
        C0477q qVar3 = this.f1592c;
        if (qVar3 != null) {
            qVar3.mo1664k();
            arrayList = qVar3.f1654e;
        }
        if (this.f1777p && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0480t) arrayList.get(0)).f1696o;
            } else if (size3 > 0) {
                z2 = true;
            }
            if (z2) {
                if (this.f1769h == null) {
                    this.f1769h = new C0768n(this, this.f1590a);
                }
                ViewGroup viewGroup3 = (ViewGroup) this.f1769h.getParent();
                if (viewGroup3 != this.f1595f) {
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(this.f1769h);
                    }
                    C0768n nVar = this.f1769h;
                    C0774t j = ActionMenuView.m1715j();
                    j.f2661a = true;
                    ((ActionMenuView) this.f1595f).addView(nVar, j);
                }
                ((ActionMenuView) this.f1595f).f1785b = this.f1777p;
            }
        }
        C0768n nVar2 = this.f1769h;
        if (nVar2 != null && nVar2.getParent() == (ahVar = this.f1595f)) {
            ((ViewGroup) ahVar).removeView(this.f1769h);
        }
        ((ActionMenuView) this.f1595f).f1785b = this.f1777p;
    }

    /* renamed from: g */
    public final boolean mo1547g() {
        int i;
        ArrayList arrayList;
        boolean z;
        C0477q qVar = this.f1592c;
        View view = null;
        if (qVar != null) {
            arrayList = qVar.mo1654e();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i2 = this.f1770i;
        int i3 = this.f1780s;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f1595f;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            z = true;
            if (i4 >= i) {
                break;
            }
            C0480t tVar = (C0480t) arrayList.get(i4);
            if (tVar.mo1713r()) {
                i5++;
            } else if (tVar.mo1712q()) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.f1771j && tVar.f1696o) {
                i2 = 0;
            }
            i4++;
        }
        if (this.f1777p && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i7 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.f1781t;
        sparseBooleanArray.clear();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            C0480t tVar2 = (C0480t) arrayList.get(i8);
            if (tVar2.mo1713r()) {
                View b = mo1613b(tVar2, view, viewGroup);
                b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i9 == 0) {
                    i9 = measuredWidth;
                }
                int i10 = tVar2.f1683b;
                if (i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                }
                tVar2.mo1706k(z);
            } else if (tVar2.mo1712q()) {
                int i11 = tVar2.f1683b;
                boolean z3 = sparseBooleanArray.get(i11);
                boolean z4 = (i7 > 0 || z3) && i3 > 0;
                if (z4) {
                    View b2 = mo1613b(tVar2, view, viewGroup);
                    b2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i9 == 0) {
                        i9 = measuredWidth2;
                    }
                    z4 = i3 + i9 > 0;
                }
                boolean z5 = z4;
                if (z5 && i11 != 0) {
                    sparseBooleanArray.put(i11, z);
                } else if (z3) {
                    sparseBooleanArray.put(i11, false);
                    for (int i12 = 0; i12 < i8; i12++) {
                        C0480t tVar3 = (C0480t) arrayList.get(i12);
                        if (tVar3.f1683b == i11) {
                            if (tVar3.mo1710o()) {
                                i7++;
                            }
                            tVar3.mo1706k(false);
                        }
                    }
                }
                if (z5) {
                    i7--;
                }
                tVar2.mo1706k(z5);
            } else {
                tVar2.mo1706k(false);
                i8++;
                view = null;
                z = true;
            }
            i8++;
            view = null;
            z = true;
        }
        return true;
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    /* renamed from: h */
    public final boolean mo1548h(android.support.p033v7.view.menu.C0460an r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x007f
            r0 = r9
        L_0x0008:
            android.support.v7.view.menu.q r2 = r0.f1586m
            android.support.v7.view.menu.q r3 = r8.f1592c
            if (r2 == r3) goto L_0x0012
            r0 = r2
            android.support.v7.view.menu.an r0 = (android.support.p033v7.view.menu.C0460an) r0
            goto L_0x0008
        L_0x0012:
            android.support.v7.view.menu.t r0 = r0.f1587n
            android.support.v7.view.menu.ah r2 = r8.f1595f
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
            if (r2 != 0) goto L_0x001c
            goto L_0x0039
        L_0x001c:
            int r4 = r2.getChildCount()
            r5 = 0
        L_0x0021:
            if (r5 >= r4) goto L_0x0039
            android.view.View r6 = r2.getChildAt(r5)
            boolean r7 = r6 instanceof android.support.p033v7.view.menu.C0453ag
            if (r7 == 0) goto L_0x0036
            r7 = r6
            android.support.v7.view.menu.ag r7 = (android.support.p033v7.view.menu.C0453ag) r7
            android.support.v7.view.menu.t r7 = r7.mo1441a()
            if (r7 != r0) goto L_0x0036
            r3 = r6
            goto L_0x0039
        L_0x0036:
            int r5 = r5 + 1
            goto L_0x0021
        L_0x0039:
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            android.support.v7.view.menu.t r0 = r9.f1587n
            int r0 = r0.f1682a
            r8.f1776o = r0
            java.util.ArrayList r0 = r9.f1652c
            int r0 = r0.size()
            r2 = 0
        L_0x0049:
            r4 = 1
            if (r2 >= r0) goto L_0x0061
            android.view.MenuItem r5 = r9.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L_0x005e
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L_0x005e
            r1 = 1
            goto L_0x0061
        L_0x005e:
            int r2 = r2 + 1
            goto L_0x0049
        L_0x0061:
            android.support.v7.widget.j r0 = new android.support.v7.widget.j
            android.content.Context r2 = r8.f1591b
            r0.<init>(r8, r2, r9, r3)
            r8.f1773l = r0
            r0.mo1537d(r1)
            android.support.v7.widget.j r0 = r8.f1773l
            r0.mo1539f()
            android.support.v7.view.menu.ae r0 = r8.f1594e
            if (r0 == 0) goto L_0x007e
            if (r9 == 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            android.support.v7.view.menu.q r9 = r8.f1592c
        L_0x007b:
            r0.mo1122b(r9)
        L_0x007e:
            return r4
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.ActionMenuPresenter.mo1548h(android.support.v7.view.menu.an):boolean");
    }

    /* renamed from: k */
    public final void mo1886k(ActionMenuView actionMenuView) {
        this.f1595f = actionMenuView;
        actionMenuView.f1784a = this.f1592c;
    }

    /* renamed from: l */
    public final boolean mo1887l() {
        C0454ah ahVar;
        C0766l lVar = this.f1774m;
        if (lVar == null || (ahVar = this.f1595f) == null) {
            C0769o oVar = this.f1772k;
            if (oVar == null) {
                return false;
            }
            oVar.mo1535b();
            return true;
        }
        ((View) ahVar).removeCallbacks(lVar);
        this.f1774m = null;
        return true;
    }

    /* renamed from: m */
    public final boolean mo1888m() {
        C0769o oVar = this.f1772k;
        return oVar != null && oVar.mo1541h();
    }

    /* renamed from: n */
    public final void mo1549n(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f1783a) > 0 && (findItem = this.f1592c.findItem(i)) != null) {
            mo1548h((C0460an) findItem.getSubMenu());
        }
    }

    /* renamed from: o */
    public final boolean mo1889o() {
        C0477q qVar;
        if (!this.f1777p || mo1888m() || (qVar = this.f1592c) == null || this.f1595f == null || this.f1774m != null) {
            return false;
        }
        qVar.mo1664k();
        if (qVar.f1654e.isEmpty()) {
            return false;
        }
        this.f1774m = new C0766l(this, new C0769o(this, this.f1591b, this.f1592c, this.f1769h));
        ((View) this.f1595f).post(this.f1774m);
        return true;
    }

    /* renamed from: p */
    public final void mo1890p() {
        C0746j jVar = this.f1773l;
        if (jVar != null) {
            jVar.mo1535b();
        }
    }

    /* renamed from: q */
    public final void mo1891q() {
        this.f1777p = true;
        this.f1778q = true;
    }
}
