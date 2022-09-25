package com.facebook.litho.widget;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0669gd;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.facebook.litho.C6106aq;
import com.facebook.litho.C6154cb;
import com.facebook.litho.C6193dm;
import com.facebook.litho.C6203dw;
import com.facebook.litho.C6231ee;
import com.facebook.litho.C6235ei;
import com.facebook.litho.C6261fd;
import com.facebook.litho.C6276fs;
import com.facebook.litho.C6349gb;
import com.facebook.litho.C6411u;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.p324c.C6152f;
import com.facebook.litho.p325d.C6180a;
import com.google.android.libraries.elements.p1729h.C21215m;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3134c.C40338b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.facebook.litho.widget.cf */
/* compiled from: PG */
public final class C6474cf implements C6468c, C6425ak, C6417ac {

    /* renamed from: F */
    static final C6443bb f19177F = new C6443bb();

    /* renamed from: G */
    public static final /* synthetic */ int f19178G = 0;

    /* renamed from: H */
    private static final C6276fs f19179H = new C6276fs();

    /* renamed from: I */
    private static final Rect f19180I = new Rect();

    /* renamed from: A */
    public final boolean[] f19181A;

    /* renamed from: B */
    public final C6540er f19182B;

    /* renamed from: C */
    public int f19183C;

    /* renamed from: D */
    public final C6492cx f19184D;

    /* renamed from: E */
    public final Runnable f19185E;

    /* renamed from: J */
    private final int f19186J;

    /* renamed from: K */
    private final AtomicBoolean f19187K = new AtomicBoolean(false);

    /* renamed from: L */
    private final boolean f19188L;

    /* renamed from: M */
    private final boolean f19189M;

    /* renamed from: N */
    private final C6487cs f19190N;

    /* renamed from: O */
    private final boolean f19191O;

    /* renamed from: P */
    private final boolean f19192P;

    /* renamed from: Q */
    private final boolean f19193Q;

    /* renamed from: R */
    private final Deque f19194R;

    /* renamed from: S */
    private final AtomicBoolean f19195S;

    /* renamed from: T */
    private final AtomicBoolean f19196T;

    /* renamed from: U */
    private final ViewTreeObserver.OnPreDrawListener f19197U;

    /* renamed from: V */
    private final Runnable f19198V;

    /* renamed from: W */
    private final boolean f19199W;

    /* renamed from: X */
    private C6276fs f19200X;

    /* renamed from: Y */
    private boolean f19201Y;

    /* renamed from: Z */
    private final C6537eo f19202Z;

    /* renamed from: a */
    public final List f19203a = new ArrayList();

    /* renamed from: aa */
    private final C40338b f19204aa;

    /* renamed from: ab */
    private final C6453bl f19205ab;

    /* renamed from: ac */
    private final C6445bd f19206ac;

    /* renamed from: ad */
    private int f19207ad;

    /* renamed from: ae */
    private C6507dl f19208ae;

    /* renamed from: b */
    public final List f19209b = new ArrayList();

    /* renamed from: c */
    public final C6427am f19210c;

    /* renamed from: d */
    public final C0640fb f19211d;

    /* renamed from: e */
    public final C6411u f19212e;

    /* renamed from: f */
    public final Handler f19213f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    public final float f19214g;

    /* renamed from: h */
    public final AtomicBoolean f19215h = new AtomicBoolean(false);

    /* renamed from: i */
    public final boolean f19216i;

    /* renamed from: j */
    public final boolean f19217j;

    /* renamed from: k */
    final boolean f19218k;

    /* renamed from: l */
    final Deque f19219l;

    /* renamed from: m */
    final Runnable f19220m;

    /* renamed from: n */
    public boolean f19221n;

    /* renamed from: o */
    public int f19222o;

    /* renamed from: p */
    public int f19223p;

    /* renamed from: q */
    public RecyclerView f19224q;

    /* renamed from: r */
    public int f19225r;

    /* renamed from: s */
    int f19226s;

    /* renamed from: t */
    public int f19227t;

    /* renamed from: u */
    int f19228u;

    /* renamed from: v */
    volatile C6276fs f19229v;

    /* renamed from: w */
    public C6154cb f19230w;

    /* renamed from: x */
    public volatile boolean f19231x;

    /* renamed from: y */
    public final String f19232y;

    /* renamed from: z */
    public final boolean[] f19233z;

    public C6474cf(C6465bx bxVar) {
        int i;
        C6445bd bdVar;
        new AtomicLong(-1);
        this.f19194R = new ArrayDeque();
        this.f19195S = new AtomicBoolean(false);
        this.f19196T = new AtomicBoolean(false);
        this.f19219l = new ArrayDeque();
        this.f19220m = new C6451bj(this);
        this.f19205ab = new C6453bl(this);
        this.f19197U = new C6454bm(this);
        this.f19198V = new C6455bn(this);
        new C6458bq(this);
        this.f19222o = -1;
        this.f19223p = -1;
        this.f19225r = -1;
        this.f19226s = -1;
        this.f19228u = -1;
        this.f19231x = false;
        this.f19201Y = false;
        this.f19232y = BuildConfig.FLAVOR;
        this.f19233z = new boolean[1];
        this.f19181A = new boolean[1];
        this.f19202Z = new C6459br(this);
        this.f19185E = new C6460bs(this);
        this.f19212e = bxVar.f19153d;
        this.f19211d = new C6471cc(this);
        boolean z = bxVar.f19161l;
        this.f19189M = z;
        if (z) {
            i = 0;
        } else {
            i = bxVar.f19150a;
        }
        this.f19186J = i;
        this.f19214g = bxVar.f19151b;
        C6427am amVar = bxVar.f19152c;
        this.f19210c = amVar;
        C40338b bVar = bxVar.f19162m;
        this.f19204aa = bVar;
        this.f19216i = true;
        this.f19193Q = bxVar.f19160k;
        if (bVar == null) {
            boolean z2 = C6180a.f18234a;
        }
        boolean z3 = bxVar.f19155f;
        this.f19184D = new C6492cx(z3, z3 ? bxVar.f19156g : 0);
        boolean z4 = amVar.mo13487i() == 0 ? bxVar.f19154e : false;
        this.f19199W = z4;
        if (!z4) {
            bdVar = null;
        } else {
            bdVar = new C6445bd(this);
        }
        this.f19206ac = bdVar;
        this.f19221n = false;
        C0653fo j = amVar.mo13488j();
        boolean stackFromEnd = (j instanceof LinearLayoutManager ? ((LinearLayoutManager) j).getStackFromEnd() : false) ^ m17502P();
        this.f19218k = stackFromEnd;
        if (stackFromEnd) {
            this.f19190N = C6487cs.f19254b;
        } else {
            this.f19190N = C6487cs.f19253a;
        }
        this.f19182B = new C6540er(this.f19225r, this.f19226s, bxVar.f19152c);
        this.f19217j = false;
        this.f19191O = bxVar.f19157h;
        this.f19188L = bxVar.f19159j;
        this.f19192P = bxVar.f19158i;
    }

    /* renamed from: F */
    public static void m17498F(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C6548m) list.get(i)).mo13638j();
        }
    }

    /* renamed from: N */
    private final C6276fs m17500N(int i, int i2, boolean z) {
        int i3;
        int i4;
        C6276fs fsVar = new C6276fs();
        int i5 = this.f19210c.mo13487i();
        boolean L = m17499L(i, i2, i5, z);
        int i6 = 0;
        if (i5 != 1) {
            int size = View.MeasureSpec.getSize(i);
            if (!L) {
                i4 = View.MeasureSpec.getSize(i2);
            } else if (this.f19229v != null) {
                i4 = this.f19229v.f18536b;
            } else {
                i6 = size;
                i3 = 0;
            }
            i3 = i4;
            i6 = size;
        } else {
            i3 = View.MeasureSpec.getSize(i2);
            if (!L) {
                i6 = View.MeasureSpec.getSize(i);
            } else if (this.f19229v != null) {
                i6 = this.f19229v.f18535a;
            }
        }
        fsVar.f18535a = i6;
        fsVar.f18536b = i3;
        return fsVar;
    }

    /* renamed from: O */
    private final C6467bz m17501O() {
        int n;
        if (!this.f19203a.isEmpty()) {
            int n2 = m17506n(this.f19203a, this.f19218k);
            if (this.f19225r >= this.f19203a.size() || n2 < 0) {
                return null;
            }
            return new C6467bz(n2, this.f19203a);
        } else if (this.f19209b.isEmpty() || (n = m17506n(this.f19209b, this.f19218k)) < 0) {
            return null;
        } else {
            return new C6467bz(n, this.f19209b);
        }
    }

    /* renamed from: P */
    private final boolean m17502P() {
        C0653fo j = this.f19210c.mo13488j();
        if (j instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) j).getReverseLayout();
        }
        return false;
    }

    /* renamed from: Q */
    private final boolean m17503Q() {
        return (this.f19229v == null || this.f19228u == -1) ? false : true;
    }

    /* renamed from: R */
    private final boolean m17504R() {
        return this.f19215h.get() && !this.f19187K.get();
    }

    /* renamed from: S */
    private final boolean m17505S() {
        RecyclerView recyclerView = this.f19224q;
        if (recyclerView != null) {
            return recyclerView.isComputingLayout();
        }
        return false;
    }

    /* renamed from: n */
    static int m17506n(List list, boolean z) {
        if (z) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (((C6548m) list.get(size)).mo13632d().mo13532n()) {
                    return size;
                }
            }
        } else {
            int size2 = list.size();
            for (int i = 0; i < size2; i++) {
                if (((C6548m) list.get(i)).mo13632d().mo13532n()) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: s */
    public static void m17507s(C6491cw cwVar) {
        if (cwVar == null) {
            throw new RuntimeException("Received null RenderInfo to insert/update!");
        }
    }

    /* renamed from: x */
    public static void m17508x(C6548m mVar, boolean z) {
        if (mVar.mo13641m()) {
            Object g = mVar.f19501c.mo13525g("prevent_release");
            if ((!(g instanceof Boolean) || !((Boolean) g).booleanValue()) && !mVar.mo13632d().mo13531m() && mVar.mo13631b() != null && mVar.mo13631b().getLithoView() == null) {
                mVar.mo13633e(z);
            }
        }
    }

    /* renamed from: A */
    public final void mo13550A(C6466by byVar) {
        C6548m a = byVar.next();
        if (!this.f19203a.isEmpty() && a != null && this.f19228u == -1) {
            int p = mo13562p(a);
            int o = mo13561o(a);
            if (!a.mo13642n(p, o)) {
                a.mo13635g(this.f19212e, p, o, new C6449bh(this, byVar, a));
            }
        }
    }

    /* renamed from: B */
    public final void mo13323U(RecyclerView recyclerView) {
        C6349gb.m17045a();
        RecyclerView recyclerView2 = this.f19224q;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                mo13325W(recyclerView2);
            }
            this.f19224q = recyclerView;
            this.f19201Y = true;
            C0653fo j = this.f19210c.mo13488j();
            j.setItemPrefetchEnabled(this.f19193Q);
            recyclerView.getPaddingLeft();
            recyclerView.setLayoutManager(j);
            recyclerView.setAdapter(this.f19211d);
            recyclerView.addOnScrollListener(this.f19182B.f19468d);
            if (j instanceof C6436av) {
                new Rect(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
                ((C6436av) j).mo13517a();
            }
            if (recyclerView instanceof C6431aq) {
                ((C6431aq) recyclerView).f19082b = this.f19205ab;
            } else if (recyclerView.getViewTreeObserver() != null) {
                recyclerView.getViewTreeObserver().addOnPreDrawListener(this.f19197U);
            }
            this.f19210c.mo13491m(this);
            this.f19182B.mo13619a(this.f19202Z);
            int i = this.f19225r;
            if (i != -1 && i >= 0) {
                int i2 = this.f19207ad;
                if (i2 != 0) {
                    mo13560M(i, this.f19227t, i2);
                } else {
                    this.f19210c.mo13490l(i, this.f19227t);
                }
            }
            RecyclerView recyclerView3 = this.f19224q;
            if (recyclerView3 != null) {
                int i3 = C6497db.f19264s;
                C6497db dbVar = recyclerView3.getParent() instanceof C6497db ? (C6497db) recyclerView3.getParent() : null;
                if (dbVar != null) {
                    C6507dl dlVar = new C6507dl(this);
                    this.f19208ae = dlVar;
                    if (dlVar.f19290a == null) {
                        dlVar.f19290a = dbVar;
                        dlVar.f19290a.mo13582q();
                        dlVar.f19291b = dbVar.f19266p.mLayout;
                        if (dlVar.f19291b != null) {
                            dlVar.f19290a.f19266p.addOnScrollListener(dlVar);
                            return;
                        }
                        throw new RuntimeException("LayoutManager of RecyclerView is not initialized yet.");
                    }
                    throw new RuntimeException("SectionsRecyclerView has already been initialized but never reset.");
                }
            }
        }
    }

    /* renamed from: C */
    public final void mo13552C(int i, int i2) {
        C6548m mVar;
        boolean z;
        boolean z2;
        C6349gb.m17045a();
        if (C6494cz.f19262a) {
            int hashCode = hashCode();
            Log.d("SectionsDebug", "(" + hashCode + ") moveItem " + i + " to " + i2);
        }
        synchronized (this) {
            mVar = (C6548m) this.f19203a.remove(i);
            this.f19203a.add(i2, mVar);
            int i3 = this.f19228u;
            z = true;
            if (i3 != -1) {
                float f = (float) i2;
                int i4 = this.f19225r;
                float f2 = ((float) i3) * this.f19214g;
                if (f >= ((float) i4) - f2 && f <= ((float) (i4 + i3)) + f2) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        if (mVar.mo13641m() && !z2) {
            mVar.mo13633e(this.f19216i);
        }
        this.f19211d.mObservable.mo2880b(i, i2);
        C6540er erVar = this.f19182B;
        int i5 = this.f19228u;
        if (!erVar.mo13622d() && i5 != -1) {
            int i6 = erVar.f19465a;
            boolean z3 = i2 >= i6 && i2 <= (i6 + i5) + -1;
            boolean z4 = i >= i6 && i <= (i6 + i5) + -1;
            if (!z3 && !z4) {
                z = false;
            }
        }
        erVar.mo13621c(z);
    }

    /* renamed from: D */
    public final void mo13553D(boolean z, C6543h hVar) {
        C6467bz O;
        int n;
        String str = "SectionsDebug";
        if (C6494cz.f19262a) {
            int hashCode = hashCode();
            Log.d(str, "(" + hashCode + ") notifyChangeSetComplete");
        }
        C6349gb.m17045a();
        hVar.mo13358a();
        this.f19219l.addLast(hVar);
        mo13569y();
        if (!z) {
            return;
        }
        if (C6203dw.m16458b((C6203dw) null)) {
            throw null;
        } else if (this.f19215h.get()) {
            if (!this.f19187K.get()) {
                if (!m17503Q() && (n = m17506n(this.f19203a, this.f19218k)) >= 0) {
                    C6467bz bzVar = new C6467bz(n, this.f19203a);
                    C6276fs fsVar = this.f19200X;
                    mo13566u(fsVar.f18535a, fsVar.f18536b, bzVar, this.f19210c.mo13487i());
                }
                mo13570z();
                return;
            }
            C6276fs fsVar2 = this.f19200X;
            if (fsVar2.f18535a != 0) {
                if (fsVar2.f18536b != 0) {
                    C6276fs N = m17500N(this.f19222o, this.f19223p, true);
                    C6276fs fsVar3 = new C6276fs();
                    int i = N.f18535a;
                    int i2 = N.f18536b;
                    int c = this.f19210c.mo13481c();
                    int i3 = 0;
                    if (c == -1) {
                        c = 0;
                    }
                    List list = this.f19203a;
                    C6426al k = this.f19210c.mo13489k(i, i2);
                    if (k != null) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
                        C6276fs fsVar4 = new C6276fs();
                        while (true) {
                            if (!k.mo13499c() || c >= list.size()) {
                                break;
                            }
                            C6548m mVar = (C6548m) list.get(c);
                            C6491cw d = mVar.mo13632d();
                            if (d.mo13533o()) {
                                break;
                            }
                            mVar.mo13636h(this.f19212e, this.f19210c.mo13485g(makeMeasureSpec, d), this.f19210c.mo13484f(makeMeasureSpec2, d), fsVar4);
                            k.mo13498b(d, fsVar4.f18535a, fsVar4.f18536b);
                            c++;
                            i3++;
                            makeMeasureSpec = makeMeasureSpec;
                            str = str;
                        }
                        String str2 = str;
                        int a = k.mo13497a();
                        if (this.f19210c.mo13487i() == 1) {
                            fsVar3.f18535a = i;
                            fsVar3.f18536b = Math.min(a, i2);
                        } else {
                            fsVar3.f18535a = Math.min(a, i);
                            fsVar3.f18536b = i2;
                        }
                        int size = list.size();
                        if (C6494cz.f19262a) {
                            int hashCode2 = hashCode();
                            Log.d(str2, "(" + hashCode2 + ") filled viewport with " + i3 + " items (holder.size() = " + size + ")");
                        }
                    }
                    if (!m17503Q() && (O = m17501O()) != null) {
                        mo13566u(i, i2, O, this.f19210c.mo13487i());
                    }
                    int i4 = fsVar3.f18535a;
                    C6276fs fsVar5 = this.f19200X;
                    if (i4 != fsVar5.f18535a || fsVar3.f18536b != fsVar5.f18536b) {
                        mo13556H();
                        return;
                    }
                    return;
                }
            }
            mo13556H();
        }
    }

    /* renamed from: E */
    public final void mo13554E(List list) {
        this.f19213f.post(new C6444bc(list));
    }

    /* renamed from: G */
    public final void mo13555G(int i, int i2) {
        C6349gb.m17045a();
        if (C6494cz.f19262a) {
            int hashCode = hashCode();
            Log.d("SectionsDebug", "(" + hashCode + ") removeRangeAt " + i + ", size: " + i2);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add((C6548m) this.f19203a.remove(i));
            }
        }
        this.f19211d.mObservable.mo2883e(i, i2);
        C6540er erVar = this.f19182B;
        erVar.mo13621c(erVar.mo13625g(i));
        mo13554E(arrayList);
    }

    /* renamed from: H */
    public final void mo13556H() {
        if (C6494cz.f19262a) {
            int hashCode = hashCode();
            Log.d("SectionsDebug", "(" + hashCode + ") requestRemeasure");
        }
        if (this.f19224q != null) {
            this.f19213f.removeCallbacks(this.f19220m);
            this.f19224q.removeCallbacks(this.f19220m);
            C2043bi.m5520N(this.f19224q, this.f19220m);
            return;
        }
        this.f19213f.removeCallbacks(this.f19220m);
        this.f19213f.post(this.f19220m);
    }

    /* renamed from: I */
    public final void mo13325W(RecyclerView recyclerView) {
        int i;
        int i2;
        C6349gb.m17045a();
        C0653fo j = this.f19210c.mo13488j();
        View findViewByPosition = j.findViewByPosition(this.f19225r);
        if (findViewByPosition != null) {
            boolean P = m17502P();
            if (this.f19210c.mo13487i() == 0) {
                if (P) {
                    i2 = (recyclerView.getWidth() - j.getPaddingRight()) - j.getDecoratedRight(findViewByPosition);
                } else {
                    i2 = j.getDecoratedLeft(findViewByPosition) - j.getPaddingLeft();
                }
                this.f19227t = i2;
            } else {
                if (P) {
                    i = (recyclerView.getHeight() - j.getPaddingBottom()) - j.getDecoratedBottom(findViewByPosition);
                } else {
                    i = j.getDecoratedTop(findViewByPosition) - j.getPaddingTop();
                }
                this.f19227t = i;
            }
        } else {
            this.f19227t = 0;
        }
        recyclerView.removeOnScrollListener(this.f19182B.f19468d);
        if (recyclerView instanceof C6431aq) {
            ((C6431aq) recyclerView).f19082b = null;
        } else if (recyclerView.getViewTreeObserver() != null) {
            recyclerView.getViewTreeObserver().removeOnPreDrawListener(this.f19197U);
        }
        mo13569y();
        recyclerView.setAdapter((C0640fb) null);
        recyclerView.setLayoutManager((C0653fo) null);
        C6540er erVar = this.f19182B;
        C6537eo eoVar = this.f19202Z;
        if (eoVar != null) {
            synchronized (erVar) {
                if (!erVar.f19467c.isEmpty()) {
                    erVar.f19467c.remove(eoVar);
                }
            }
        }
        synchronized (this) {
            int size = this.f19203a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C6548m) this.f19203a.get(size)).mo13633e(this.f19216i);
            }
        }
        if (this.f19224q == recyclerView) {
            this.f19224q = null;
            C6507dl dlVar = this.f19208ae;
            if (dlVar != null) {
                C6497db dbVar = dlVar.f19290a;
                if (dbVar != null) {
                    dbVar.f19266p.removeOnScrollListener(dlVar);
                    dlVar.f19291b = null;
                    dlVar.f19290a = null;
                } else {
                    throw new IllegalStateException("SectionsRecyclerView has not been set yet.");
                }
            }
            this.f19210c.mo13491m((C6425ak) null);
        }
    }

    /* renamed from: J */
    public final void mo13558J(int i, C6491cw cwVar) {
        boolean o;
        C6349gb.m17045a();
        if (C6494cz.f19262a) {
            int hashCode = hashCode();
            String s = cwVar.mo13577s();
            Log.d("SectionsDebug", "(" + hashCode + ") updateItemAt " + i + ", name: " + s);
        }
        synchronized (this) {
            C6548m mVar = (C6548m) this.f19203a.get(i);
            o = mVar.mo13632d().mo13533o();
            m17507s(cwVar);
            this.f19184D.mo13578a(cwVar);
            mVar.mo13632d();
            mVar.mo13640l(cwVar);
        }
        if (o || cwVar.mo13533o()) {
            this.f19211d.notifyItemChanged(i);
        }
        C6540er erVar = this.f19182B;
        erVar.mo13621c(erVar.mo13623e(i, 1));
    }

    /* renamed from: K */
    public final void mo13559K(int i, List list) {
        C6349gb.m17045a();
        if (C6494cz.f19262a) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = ((C6491cw) list.get(i2)).mo13577s();
            }
            Log.d("SectionsDebug", "(" + hashCode() + ") updateRangeAt " + i + ", size: " + list.size() + ", names: " + Arrays.toString(strArr));
        }
        synchronized (this) {
            try {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    int i4 = i + i3;
                    C6548m mVar = (C6548m) this.f19203a.get(i4);
                    C6491cw cwVar = (C6491cw) list.get(i3);
                    m17507s(cwVar);
                    if (cwVar.mo13533o() || mVar.mo13632d().mo13533o()) {
                        this.f19211d.notifyItemChanged(i4);
                    }
                    this.f19184D.mo13578a(cwVar);
                    mVar.mo13632d();
                    mVar.mo13640l(cwVar);
                }
            } catch (IndexOutOfBoundsException e) {
                String[] strArr2 = new String[list.size()];
                for (int i5 = 0; i5 < list.size(); i5++) {
                    strArr2[i5] = ((C6491cw) list.get(i5)).mo13577s();
                }
                throw new IndexOutOfBoundsException(("(" + hashCode() + ") updateRangeAt " + i + ", size: " + list.size() + ", names: " + Arrays.toString(strArr2)) + e.getMessage());
            }
        }
        C6540er erVar = this.f19182B;
        erVar.mo13621c(erVar.mo13623e(i, list.size()));
    }

    /* renamed from: M */
    public final void mo13560M(int i, int i2, int i3) {
        if (this.f19224q == null) {
            this.f19225r = i;
            this.f19227t = i2;
            this.f19207ad = i3;
            return;
        }
        C0669gd b = C6498dc.m17608b(this.f19212e.f19009b, i2, i3);
        b.f2449g = i;
        this.f19224q.mLayout.startSmoothScroll(b);
    }

    /* renamed from: T */
    public final void mo13322T(C6276fs fsVar, int i, int i2, C6154cb cbVar) {
        AtomicBoolean atomicBoolean;
        C6467bz O;
        boolean z = cbVar != null;
        int i3 = this.f19210c.mo13487i();
        if (i3 != 0) {
            if (i3 != 1) {
                throw new UnsupportedOperationException("The orientation defined by LayoutInfo should be either OrientationHelper.HORIZONTAL or OrientationHelper.VERTICAL");
            } else if (View.MeasureSpec.getMode(i2) == 0) {
                throw new IllegalStateException("Height mode has to be EXACTLY OR AT MOST for a vertical scrolling RecyclerView");
            } else if (!z && View.MeasureSpec.getMode(i) == 0) {
                throw new IllegalStateException("Can't use Unspecified width on a vertical scrolling Recycler if dynamic measurement is not allowed");
            }
        } else if (View.MeasureSpec.getMode(i) == 0) {
            throw new IllegalStateException("Width mode has to be EXACTLY OR AT MOST for an horizontal scrolling RecyclerView");
        } else if (!z && View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException("Can't use Unspecified height on an horizontal scrolling Recycler if dynamic measurement is not allowed");
        }
        boolean L = m17499L(i, i2, i3, z);
        this.f19196T.set(true);
        try {
            synchronized (this) {
                if (this.f19222o != -1 && !this.f19187K.get()) {
                    if (i3 != 1) {
                        if (C6235ei.m16506a(this.f19223p, i2, this.f19200X.f18536b)) {
                            fsVar.f18535a = View.MeasureSpec.getSize(i);
                            fsVar.f18536b = this.f19200X.f18536b;
                            atomicBoolean = this.f19196T;
                        }
                    } else if (C6235ei.m16506a(this.f19222o, i, this.f19200X.f18535a)) {
                        fsVar.f18535a = this.f19200X.f18535a;
                        fsVar.f18536b = View.MeasureSpec.getSize(i2);
                        atomicBoolean = this.f19196T;
                    }
                    this.f19215h.set(false);
                    this.f19228u = -1;
                    this.f19229v = null;
                    int size = this.f19203a.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((C6548m) this.f19203a.get(i4)).mo13637i();
                    }
                    if (Looper.myLooper() != Looper.getMainLooper() || m17505S()) {
                        this.f19213f.removeCallbacks(this.f19198V);
                        this.f19213f.post(this.f19198V);
                    } else {
                        this.f19211d.mObservable.mo2879a();
                    }
                }
                this.f19222o = i;
                this.f19223p = i2;
                if (!m17503Q() && (O = m17501O()) != null) {
                    mo13566u(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), O, i3);
                }
                C6276fs N = m17500N(i, i2, z);
                if (i3 != 1) {
                    if (L) {
                        if (this.f19229v == null) {
                            this.f19230w = cbVar;
                            this.f19187K.set(true);
                        }
                    }
                    boolean z2 = this.f19199W;
                    if (!z2) {
                        cbVar = null;
                    }
                    this.f19230w = cbVar;
                    this.f19187K.set(z2);
                } else {
                    if (L) {
                        if (this.f19229v == null) {
                            this.f19230w = cbVar;
                            this.f19187K.set(true);
                        }
                    }
                    this.f19230w = null;
                }
                int i5 = N.f18535a;
                fsVar.f18535a = i5;
                int i6 = N.f18536b;
                fsVar.f18536b = i6;
                this.f19200X = new C6276fs(i5, i6);
                this.f19215h.set(true);
                Iterator it = this.f19194R.iterator();
                if (!it.hasNext()) {
                    if (this.f19228u != -1) {
                        mo13565t(this.f19225r, this.f19226s, this.f19190N);
                    }
                    atomicBoolean = this.f19196T;
                } else {
                    ArrayList arrayList = ((C6463bv) it.next()).f19145a;
                    throw null;
                }
            }
            atomicBoolean.set(false);
        } catch (Throwable th) {
            this.f19196T.set(false);
            throw th;
        }
    }

    /* renamed from: V */
    public final synchronized void mo13324V(int i, int i2) {
        boolean z;
        if (this.f19222o != -1) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            int i3 = this.f19210c.mo13487i();
            int i4 = this.f19222o;
            if (i4 != -1) {
                if (i3 == 0) {
                    z = C6235ei.m16506a(this.f19223p, makeMeasureSpec2, this.f19200X.f18536b);
                } else if (i3 == 1) {
                    z = C6235ei.m16506a(i4, makeMeasureSpec, this.f19200X.f18535a);
                }
                if (z) {
                    return;
                }
            }
        }
        mo13322T(f19179H, View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824), this.f19230w);
    }

    /* renamed from: X */
    public final /* bridge */ /* synthetic */ void mo13326X() {
    }

    /* renamed from: a */
    public final void mo13327a() {
        ArrayList arrayList;
        if (C6349gb.m17046b()) {
            m17498F(this.f19203a);
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList(this.f19203a);
        }
        mo13554E(arrayList);
    }

    /* renamed from: b */
    public final int mo13480b() {
        throw null;
    }

    /* renamed from: c */
    public final int mo13481c() {
        throw null;
    }

    /* renamed from: d */
    public final int mo13482d() {
        throw null;
    }

    /* renamed from: e */
    public final int mo13483e() {
        throw null;
    }

    /* renamed from: f */
    public final boolean mo13328f() {
        return this.f19221n;
    }

    /* renamed from: g */
    public final boolean mo13329g() {
        return false;
    }

    /* renamed from: h */
    public final int mo13486h() {
        throw null;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo13330i() {
    }

    /* renamed from: j */
    public final synchronized ComponentTree mo13500j(int i) {
        C6548m mVar = (C6548m) this.f19203a.get(i);
        int p = mo13562p(mVar);
        int o = mo13561o(mVar);
        if (mVar.mo13642n(p, o)) {
            return mVar.mo13631b();
        }
        mVar.mo13636h(this.f19212e, p, o, (C6276fs) null);
        return mVar.mo13631b();
    }

    /* renamed from: k */
    public final boolean mo13501k(int i) {
        return mo13502l(i) && ((C6548m) this.f19203a.get(i)).mo13632d().mo13531m();
    }

    /* renamed from: l */
    public final boolean mo13502l(int i) {
        return i >= 0 && i < this.f19203a.size();
    }

    /* renamed from: m */
    public final synchronized C6491cw mo13511m(int i) {
        C6349gb.m17045a();
        return ((C6548m) this.f19203a.get(i)).mo13632d();
    }

    /* renamed from: o */
    public final int mo13561o(C6548m mVar) {
        if (this.f19199W) {
            return 0;
        }
        if (m17504R()) {
            return this.f19210c.mo13484f(View.MeasureSpec.makeMeasureSpec(this.f19200X.f18536b, 1073741824), mVar.mo13632d());
        }
        return this.f19210c.mo13484f(this.f19223p, mVar.mo13632d());
    }

    /* renamed from: p */
    public final int mo13562p(C6548m mVar) {
        if (m17504R()) {
            return this.f19210c.mo13485g(View.MeasureSpec.makeMeasureSpec(this.f19200X.f18535a, 1073741824), mVar.mo13632d());
        }
        return this.f19210c.mo13485g(this.f19222o, mVar.mo13632d());
    }

    /* renamed from: q */
    public final C6548m mo13563q(C6491cw cwVar) {
        C40338b bVar = this.f19204aa;
        C6193dm dmVar = bVar != null ? bVar.f105948a : null;
        C6445bd bdVar = this.f19206ac;
        boolean z = this.f19191O;
        boolean z2 = this.f19188L;
        boolean z3 = this.f19192P;
        C6547l c = C6548m.m17825c();
        if (cwVar == null) {
            cwVar = C6546k.m17818r();
        }
        c.f19492a = cwVar;
        c.f19493b = dmVar;
        c.f19497f = bdVar;
        c.f19494c = z;
        c.f19496e = z2;
        c.f19495d = z3;
        if (c.f19492a != null) {
            return new C6548m(c);
        }
        throw new IllegalArgumentException("A RenderInfo must be specified to create a ComponentTreeHolder");
    }

    /* renamed from: r */
    public final void mo13564r(int i) {
        C6349gb.m17045a();
        if (this.f19195S.get() && this.f19215h.get()) {
            if (!this.f19196T.get()) {
                Boolean bool = null;
                if (!m17505S()) {
                    synchronized (this) {
                        if (this.f19194R.isEmpty()) {
                            this.f19195S.set(false);
                            return;
                        }
                        C6463bv bvVar = (C6463bv) this.f19194R.peekFirst();
                        int i2 = bvVar.f19146b;
                        this.f19194R.pollFirst();
                        synchronized (this) {
                            ArrayList arrayList = bvVar.f19145a;
                            throw null;
                        }
                    }
                } else if (i > 100) {
                    RecyclerView recyclerView = this.f19224q;
                    int size = this.f19194R.size();
                    if (recyclerView != null) {
                        bool = Boolean.valueOf(recyclerView.mIsAttached);
                    }
                    throw new RuntimeException("Too many retries -- RecyclerView is stuck in layout. Batch size: " + size + ", isSubAdapter: false, isAttachedToWindow: " + bool);
                } else {
                    C6152f.m16219b().mo13135a(new C6446be(this, i));
                }
            }
        }
    }

    /* renamed from: t */
    public final void mo13565t(int i, int i2, C6487cs csVar) {
        synchronized (this) {
            if (m17504R()) {
                int i3 = this.f19228u;
                if (i3 != -1) {
                    if (i == -1 || i2 == -1) {
                        i = 0;
                        i2 = 0;
                    }
                    int max = Math.max(i3, i2 - i);
                    int size = this.f19203a.size();
                    int i4 = (int) (((float) max) * this.f19214g);
                    int i5 = i - i4;
                    int i6 = i + max + i4;
                    csVar.mo13576a(size, new C6450bi(this, i5, i6, size));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo13566u(int i, int i2, C6467bz bzVar, int i3) {
        String str;
        C21215m mVar;
        C6276fs fsVar;
        C6261fd fdVar = null;
        boolean b = C6203dw.m16458b((C6203dw) null);
        C6466by byVar = new C6466by(bzVar.f19168b, bzVar.f19167a, this.f19203a.size() - 1, this.f19218k);
        if (!this.f19203a.isEmpty()) {
            for (int i4 = 0; i4 <= 0; i4++) {
                mo13550A(byVar);
            }
        }
        C6548m mVar2 = (C6548m) bzVar.f19168b.get(bzVar.f19167a);
        int p = mo13562p(mVar2);
        int o = mo13561o(mVar2);
        if (!b) {
            if (this.f19212e.mo13475m() != null) {
                mVar = this.f19212e.mo13475m();
                str = this.f19212e.mo13470f();
            } else {
                mVar = mVar2.mo13632d().mo13534p();
                str = mVar2.mo13632d().mo13526h();
            }
            if (mVar != null) {
                C6411u uVar = this.f19212e;
                fdVar = C6231ee.m16501b(mVar, str, mVar.mo26269a(uVar, 20), uVar.f19016i);
            }
            try {
                if (this.f19186J <= 0 || !C6349gb.m17046b()) {
                    C6276fs fsVar2 = new C6276fs();
                    mVar2.mo13636h(this.f19212e, p, o, fsVar2);
                    if (this.f19189M) {
                        List<C6548m> list = this.f19203a;
                        C6411u uVar2 = this.f19212e;
                        C6276fs fsVar3 = new C6276fs();
                        int i5 = 0;
                        for (C6548m h : list) {
                            h.mo13636h(uVar2, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0), fsVar3);
                            i5 = Math.max(i5, fsVar3.f18536b);
                        }
                        fsVar2.f18536b = i5;
                    }
                    int max = Math.max(this.f19210c.mo13479a(fsVar2.f18535a, fsVar2.f18536b, i, i2), 1);
                    this.f19229v = fsVar2;
                    this.f19228u = max;
                } else {
                    if (i3 == 0) {
                        fsVar = new C6276fs(i / this.f19186J, i2);
                    } else {
                        fsVar = new C6276fs(i, i2 / this.f19186J);
                    }
                    this.f19229v = fsVar;
                    this.f19228u = this.f19186J;
                }
                if (fdVar != null) {
                    C21215m.m39906e(fdVar);
                }
            } catch (Throwable th) {
                if (fdVar != null) {
                    C21215m.m39906e(fdVar);
                }
                throw th;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: v */
    public final void mo13567v(int i, C6491cw cwVar) {
        C6349gb.m17045a();
        if (C6494cz.f19262a) {
            int hashCode = hashCode();
            String s = cwVar.mo13577s();
            Log.d("SectionsDebug", "(" + hashCode + ") insertItemAt " + i + ", name: " + s);
        }
        m17507s(cwVar);
        C6548m q = mo13563q(cwVar);
        synchronized (this) {
            this.f19203a.add(i, q);
            this.f19184D.mo13578a(cwVar);
        }
        this.f19211d.notifyItemInserted(i);
        C6540er erVar = this.f19182B;
        erVar.mo13621c(erVar.mo13624f(i, this.f19228u));
    }

    /* renamed from: w */
    public final void mo13568w(int i, List list) {
        C6349gb.m17045a();
        if (C6494cz.f19262a) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = ((C6491cw) list.get(i2)).mo13577s();
            }
            int hashCode = hashCode();
            int size = list.size();
            String arrays = Arrays.toString(strArr);
            Log.d("SectionsDebug", "(" + hashCode + ") insertRangeAt " + i + ", size: " + size + ", names: " + arrays);
        }
        synchronized (this) {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C6491cw cwVar = (C6491cw) list.get(i3);
                m17507s(cwVar);
                this.f19203a.add(i + i3, mo13563q(cwVar));
                this.f19184D.mo13578a(cwVar);
            }
        }
        C0640fb fbVar = this.f19211d;
        fbVar.mObservable.mo2882d(i, list.size());
        C6540er erVar = this.f19182B;
        list.size();
        erVar.mo13621c(erVar.mo13624f(i, this.f19228u));
    }

    /* renamed from: y */
    public final void mo13569y() {
        C6349gb.m17045a();
        if (!this.f19219l.isEmpty() && this.f19201Y) {
            RecyclerView recyclerView = this.f19224q;
            if (recyclerView != null && recyclerView.hasPendingAdapterUpdates() && recyclerView.mIsAttached && recyclerView.getWindowVisibility() == 0) {
                ViewParent viewParent = recyclerView;
                while (true) {
                    if (viewParent instanceof View) {
                        View view = (View) viewParent;
                        if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                            break;
                        }
                        viewParent = view.getParent();
                    } else if (recyclerView.getGlobalVisibleRect(f19180I)) {
                        if (this.f19219l.size() > 20) {
                            this.f19219l.clear();
                            StringBuilder sb = new StringBuilder("recyclerView: ");
                            sb.append(recyclerView);
                            sb.append(", hasPendingAdapterUpdates(): ");
                            sb.append(recyclerView.hasPendingAdapterUpdates());
                            sb.append(", isAttachedToWindow(): ");
                            sb.append(recyclerView.mIsAttached);
                            sb.append(", getWindowVisibility(): ");
                            sb.append(recyclerView.getWindowVisibility());
                            sb.append(", vie visible hierarchy: ");
                            ArrayList arrayList = new ArrayList();
                            ViewParent viewParent2 = recyclerView;
                            while (viewParent2 instanceof View) {
                                View view2 = (View) viewParent2;
                                String simpleName = view2.getClass().getSimpleName();
                                float alpha = view2.getAlpha();
                                int visibility = view2.getVisibility();
                                arrayList.add("view=" + simpleName + ", alpha=" + alpha + ", visibility=" + visibility);
                                if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                    break;
                                }
                                viewParent2 = view2.getParent();
                            }
                            sb.append(arrayList);
                            sb.append(", getGlobalVisibleRect(): ");
                            sb.append(recyclerView.getGlobalVisibleRect(f19180I));
                            sb.append(", isComputingLayout(): ");
                            sb.append(recyclerView.isComputingLayout());
                            sb.append(", isSubAdapter: false, visible range: [");
                            sb.append(this.f19225r);
                            sb.append(", ");
                            sb.append(this.f19226s);
                            sb.append("]");
                            C6106aq.m15891b(2, "RecyclerBinder:DataRenderedNotTriggered", "@OnDataRendered callbacks aren't triggered as expected: ".concat(sb.toString()));
                            return;
                        }
                        return;
                    }
                }
            }
            boolean z = recyclerView != null;
            ArrayDeque arrayDeque = new ArrayDeque(this.f19219l);
            this.f19219l.clear();
            this.f19213f.postAtFrontOfQueue(new C6448bg(arrayDeque, z));
        }
    }

    /* renamed from: z */
    public final void mo13570z() {
        if (this.f19224q != null && this.f19182B.mo13622d()) {
            this.f19224q.removeCallbacks(this.f19185E);
            C2043bi.m5520N(this.f19224q, this.f19185E);
        }
        mo13565t(this.f19225r, this.f19226s, this.f19190N);
    }

    /* renamed from: L */
    static boolean m17499L(int i, int i2, int i3, boolean z) {
        if (i3 == 1) {
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                return false;
            }
        } else if (View.MeasureSpec.getMode(i2) == 1073741824) {
            return false;
        }
        if (z) {
            return true;
        }
        return false;
    }
}
