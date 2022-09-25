package androidx.viewpager2.widget;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;

/* renamed from: androidx.viewpager2.widget.g */
/* compiled from: PG */
public final class C4304g extends C0658ft {

    /* renamed from: a */
    public C4313p f13919a;

    /* renamed from: b */
    public int f13920b;

    /* renamed from: c */
    public int f13921c;

    /* renamed from: d */
    public final C4303f f13922d = new C4303f();

    /* renamed from: e */
    public int f13923e;

    /* renamed from: f */
    public boolean f13924f;

    /* renamed from: g */
    private final ViewPager2 f13925g;

    /* renamed from: h */
    private final RecyclerView f13926h;

    /* renamed from: i */
    private final LinearLayoutManager f13927i;

    /* renamed from: j */
    private int f13928j;

    /* renamed from: k */
    private boolean f13929k;

    /* renamed from: l */
    private boolean f13930l;

    public C4304g(ViewPager2 viewPager2) {
        this.f13925g = viewPager2;
        RecyclerView recyclerView = viewPager2.f13896f;
        this.f13926h = recyclerView;
        this.f13927i = (LinearLayoutManager) recyclerView.mLayout;
        m12355f();
    }

    /* renamed from: e */
    private final void m12354e(int i, float f, int i2) {
        C4313p pVar = this.f13919a;
        if (pVar != null) {
            pVar.mo9233d(i, f, i2);
        }
    }

    /* renamed from: f */
    private final void m12355f() {
        this.f13920b = 0;
        this.f13921c = 0;
        this.f13922d.mo9235a();
        this.f13928j = -1;
        this.f13923e = -1;
        this.f13929k = false;
        this.f13930l = false;
        this.f13924f = false;
    }

    /* renamed from: g */
    private final boolean m12356g() {
        return this.f13920b == 1;
    }

    /* renamed from: a */
    public final void mo9236a(int i) {
        C4313p pVar = this.f13919a;
        if (pVar != null) {
            pVar.mo9202b(i);
        }
    }

    /* renamed from: b */
    public final void mo9237b(int i) {
        if ((this.f13920b != 3 || this.f13921c != 0) && this.f13921c != i) {
            this.f13921c = i;
            C4313p pVar = this.f13919a;
            if (pVar != null) {
                pVar.mo9201a(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011e, code lost:
        if (r7[r3 - 1][1] >= r8) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0125, code lost:
        if (r1.getChildCount() <= 1) goto L_0x0127;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9238c() {
        /*
            r14 = this;
            androidx.viewpager2.widget.f r0 = r14.f13922d
            android.support.v7.widget.LinearLayoutManager r1 = r14.f13927i
            int r1 = r1.findFirstVisibleItemPosition()
            r0.f13916a = r1
            r2 = -1
            if (r1 != r2) goto L_0x0011
            r0.mo9235a()
            return
        L_0x0011:
            android.support.v7.widget.LinearLayoutManager r3 = r14.f13927i
            android.view.View r1 = r3.findViewByPosition(r1)
            if (r1 != 0) goto L_0x001d
            r0.mo9235a()
            return
        L_0x001d:
            android.support.v7.widget.LinearLayoutManager r3 = r14.f13927i
            int r3 = r3.getLeftDecorationWidth(r1)
            android.support.v7.widget.LinearLayoutManager r4 = r14.f13927i
            int r4 = r4.getRightDecorationWidth(r1)
            android.support.v7.widget.LinearLayoutManager r5 = r14.f13927i
            int r5 = r5.getTopDecorationHeight(r1)
            android.support.v7.widget.LinearLayoutManager r6 = r14.f13927i
            int r6 = r6.getBottomDecorationHeight(r1)
            android.view.ViewGroup$LayoutParams r7 = r1.getLayoutParams()
            boolean r8 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r8 == 0) goto L_0x004b
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            int r8 = r7.leftMargin
            int r3 = r3 + r8
            int r8 = r7.rightMargin
            int r4 = r4 + r8
            int r8 = r7.topMargin
            int r5 = r5 + r8
            int r7 = r7.bottomMargin
            int r6 = r6 + r7
        L_0x004b:
            int r7 = r1.getHeight()
            int r7 = r7 + r5
            int r7 = r7 + r6
            int r6 = r1.getWidth()
            int r6 = r6 + r3
            int r6 = r6 + r4
            android.support.v7.widget.LinearLayoutManager r4 = r14.f13927i
            int r4 = r4.getOrientation()
            if (r4 != 0) goto L_0x0076
            int r1 = r1.getLeft()
            int r1 = r1 - r3
            android.support.v7.widget.RecyclerView r3 = r14.f13926h
            int r3 = r3.getPaddingLeft()
            int r1 = r1 - r3
            androidx.viewpager2.widget.ViewPager2 r3 = r14.f13925g
            boolean r3 = r3.mo9221i()
            if (r3 == 0) goto L_0x0074
            int r1 = -r1
        L_0x0074:
            r7 = r6
            goto L_0x0082
        L_0x0076:
            int r1 = r1.getTop()
            int r1 = r1 - r5
            android.support.v7.widget.RecyclerView r3 = r14.f13926h
            int r3 = r3.getPaddingTop()
            int r1 = r1 - r3
        L_0x0082:
            int r1 = -r1
            r0.f13918c = r1
            if (r1 >= 0) goto L_0x015b
            android.view.ViewGroup$MarginLayoutParams r1 = androidx.viewpager2.widget.C4299b.f13913a
            android.support.v7.widget.LinearLayoutManager r1 = r14.f13927i
            int r3 = r1.getChildCount()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0095
            goto L_0x0121
        L_0x0095:
            int r6 = r1.getOrientation()
            if (r6 != 0) goto L_0x009d
            r6 = 1
            goto L_0x009e
        L_0x009d:
            r6 = 0
        L_0x009e:
            r7 = 2
            int[] r8 = new int[r7]
            r8[r5] = r7
            r8[r4] = r3
            java.lang.Class r7 = java.lang.Integer.TYPE
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r7, r8)
            int[][] r7 = (int[][]) r7
            r8 = 0
        L_0x00ae:
            if (r8 >= r3) goto L_0x00f6
            android.view.View r9 = r1.getChildAt(r8)
            if (r9 == 0) goto L_0x00ee
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            boolean r11 = r10 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r11 == 0) goto L_0x00c1
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            goto L_0x00c3
        L_0x00c1:
            android.view.ViewGroup$MarginLayoutParams r10 = androidx.viewpager2.widget.C4299b.f13913a
        L_0x00c3:
            r11 = r7[r8]
            if (r6 == 0) goto L_0x00ce
            int r12 = r9.getLeft()
            int r13 = r10.leftMargin
            goto L_0x00d4
        L_0x00ce:
            int r12 = r9.getTop()
            int r13 = r10.topMargin
        L_0x00d4:
            int r12 = r12 - r13
            r11[r4] = r12
            r11 = r7[r8]
            if (r6 == 0) goto L_0x00e2
            int r9 = r9.getRight()
            int r10 = r10.rightMargin
            goto L_0x00e8
        L_0x00e2:
            int r9 = r9.getBottom()
            int r10 = r10.bottomMargin
        L_0x00e8:
            int r9 = r9 + r10
            r11[r5] = r9
            int r8 = r8 + 1
            goto L_0x00ae
        L_0x00ee:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "null view contained in the view hierarchy"
            r0.<init>(r1)
            throw r0
        L_0x00f6:
            androidx.viewpager2.widget.a r6 = new androidx.viewpager2.widget.a
            r6.<init>()
            java.util.Arrays.sort(r7, r6)
            r6 = 1
        L_0x00ff:
            if (r6 >= r3) goto L_0x0110
            int r8 = r6 + -1
            r8 = r7[r8]
            r8 = r8[r5]
            r9 = r7[r6]
            r9 = r9[r4]
            if (r8 != r9) goto L_0x0127
            int r6 = r6 + 1
            goto L_0x00ff
        L_0x0110:
            r6 = r7[r4]
            r8 = r6[r5]
            r6 = r6[r4]
            int r8 = r8 - r6
            if (r6 > 0) goto L_0x0127
            int r3 = r3 + r2
            r2 = r7[r3]
            r2 = r2[r5]
            if (r2 >= r8) goto L_0x0121
            goto L_0x0127
        L_0x0121:
            int r2 = r1.getChildCount()
            if (r2 > r5) goto L_0x0143
        L_0x0127:
            int r2 = r1.getChildCount()
            r3 = 0
        L_0x012c:
            if (r3 >= r2) goto L_0x0143
            android.view.View r6 = r1.getChildAt(r3)
            boolean r6 = androidx.viewpager2.widget.C4299b.m12343a(r6)
            if (r6 != 0) goto L_0x013b
            int r3 = r3 + 1
            goto L_0x012c
        L_0x013b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."
            r0.<init>(r1)
            throw r0
        L_0x0143:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r5]
            int r0 = r0.f13918c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r4] = r0
            java.lang.String r0 = "Page can only be offset by a positive amount, not by %d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x015b:
            if (r7 != 0) goto L_0x015f
            r1 = 0
            goto L_0x0162
        L_0x015f:
            float r1 = (float) r1
            float r2 = (float) r7
            float r1 = r1 / r2
        L_0x0162:
            r0.f13917b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C4304g.mo9238c():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo9239d() {
        return this.f13921c == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r5 < 0) == r3.f13925g.mo9221i()) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(android.support.p033v7.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f13930l = r4
            r3.mo9238c()
            boolean r0 = r3.f13929k
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x0037
            r3.f13929k = r2
            if (r6 > 0) goto L_0x001f
            if (r6 != 0) goto L_0x0029
            if (r5 < 0) goto L_0x0016
            r5 = 0
            goto L_0x0017
        L_0x0016:
            r5 = 1
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f13925g
            boolean r6 = r6.mo9221i()
            if (r5 != r6) goto L_0x0029
        L_0x001f:
            androidx.viewpager2.widget.f r5 = r3.f13922d
            int r6 = r5.f13918c
            if (r6 == 0) goto L_0x0029
            int r5 = r5.f13916a
            int r5 = r5 + r4
            goto L_0x002d
        L_0x0029:
            androidx.viewpager2.widget.f r5 = r3.f13922d
            int r5 = r5.f13916a
        L_0x002d:
            r3.f13923e = r5
            int r6 = r3.f13928j
            if (r6 == r5) goto L_0x0045
            r3.mo9236a(r5)
            goto L_0x0045
        L_0x0037:
            int r5 = r3.f13920b
            if (r5 != 0) goto L_0x0045
            androidx.viewpager2.widget.f r5 = r3.f13922d
            int r5 = r5.f13916a
            if (r5 != r1) goto L_0x0042
            r5 = 0
        L_0x0042:
            r3.mo9236a(r5)
        L_0x0045:
            androidx.viewpager2.widget.f r5 = r3.f13922d
            int r6 = r5.f13916a
            if (r6 != r1) goto L_0x004c
            r6 = 0
        L_0x004c:
            float r0 = r5.f13917b
            int r5 = r5.f13918c
            r3.m12354e(r6, r0, r5)
            androidx.viewpager2.widget.f r5 = r3.f13922d
            int r6 = r5.f13916a
            int r0 = r3.f13923e
            if (r6 == r0) goto L_0x005d
            if (r0 != r1) goto L_0x006b
        L_0x005d:
            int r5 = r5.f13918c
            if (r5 != 0) goto L_0x006b
            int r5 = r3.f13921c
            if (r5 == r4) goto L_0x006b
            r3.mo9237b(r2)
            r3.m12355f()
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C4304g.onScrolled(android.support.v7.widget.RecyclerView, int, int):void");
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (!(this.f13920b == 1 && this.f13921c == 1) && i == 1) {
            this.f13920b = 1;
            int i2 = this.f13923e;
            if (i2 != -1) {
                this.f13928j = i2;
                this.f13923e = -1;
            } else if (this.f13928j == -1) {
                this.f13928j = this.f13927i.findFirstVisibleItemPosition();
            }
            mo9237b(1);
        } else if (!m12356g() || i != 2) {
            if (m12356g() && i == 0) {
                mo9238c();
                if (!this.f13930l) {
                    int i3 = this.f13922d.f13916a;
                    if (i3 != -1) {
                        m12354e(i3, 0.0f, 0);
                    }
                } else {
                    C4303f fVar = this.f13922d;
                    if (fVar.f13918c == 0) {
                        int i4 = this.f13928j;
                        int i5 = fVar.f13916a;
                        if (i4 != i5) {
                            mo9236a(i5);
                        }
                    }
                }
                mo9237b(0);
                m12355f();
            }
            if (this.f13920b == 2 && i == 0 && this.f13924f) {
                mo9238c();
                C4303f fVar2 = this.f13922d;
                if (fVar2.f13918c == 0) {
                    int i6 = this.f13923e;
                    int i7 = fVar2.f13916a;
                    if (i6 != i7) {
                        if (i7 == -1) {
                            i7 = 0;
                        }
                        mo9236a(i7);
                    }
                    mo9237b(0);
                    m12355f();
                }
            }
        } else if (this.f13930l) {
            mo9237b(2);
            this.f13929k = true;
        }
    }
}
