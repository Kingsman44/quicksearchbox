package android.support.p033v7.widget.p041a;

/* renamed from: android.support.v7.widget.a.a */
/* compiled from: PG */
final class C0491a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0502l f1976a;

    public C0491a(C0502l lVar) {
        this.f1976a = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            android.support.v7.widget.a.l r1 = r0.f1976a
            android.support.v7.widget.gh r2 = r1.f2006b
            if (r2 == 0) goto L_0x0127
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.f2023s
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0017
            r4 = 0
            goto L_0x0019
        L_0x0017:
            long r4 = r2 - r4
        L_0x0019:
            android.support.v7.widget.RecyclerView r8 = r1.f2017m
            android.support.v7.widget.fo r8 = r8.mLayout
            android.graphics.Rect r9 = r1.f2022r
            if (r9 != 0) goto L_0x0028
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r1.f2022r = r9
        L_0x0028:
            android.support.v7.widget.gh r9 = r1.f2006b
            android.view.View r9 = r9.itemView
            android.graphics.Rect r10 = r1.f2022r
            r8.calculateItemDecorationsForChild(r9, r10)
            boolean r9 = r8.canScrollHorizontally()
            r10 = 0
            r14 = 0
            if (r9 == 0) goto L_0x007a
            float r9 = r1.f2011g
            float r11 = r1.f2009e
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r1.f2022r
            int r11 = r11.left
            int r11 = r9 - r11
            android.support.v7.widget.RecyclerView r12 = r1.f2017m
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r1.f2009e
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0055
            if (r11 >= 0) goto L_0x0055
            goto L_0x007b
        L_0x0055:
            int r11 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x007a
            android.support.v7.widget.gh r11 = r1.f2006b
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            int r9 = r9 + r11
            android.graphics.Rect r11 = r1.f2022r
            int r11 = r11.right
            int r9 = r9 + r11
            android.support.v7.widget.RecyclerView r11 = r1.f2017m
            int r11 = r11.getWidth()
            android.support.v7.widget.RecyclerView r12 = r1.f2017m
            int r12 = r12.getPaddingRight()
            int r11 = r11 - r12
            int r9 = r9 - r11
            if (r9 > 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r11 = r9
            goto L_0x007b
        L_0x007a:
            r11 = 0
        L_0x007b:
            boolean r8 = r8.canScrollVertically()
            if (r8 == 0) goto L_0x00c3
            float r8 = r1.f2012h
            float r9 = r1.f2010f
            float r8 = r8 + r9
            int r8 = (int) r8
            android.graphics.Rect r9 = r1.f2022r
            int r9 = r9.top
            int r9 = r8 - r9
            android.support.v7.widget.RecyclerView r12 = r1.f2017m
            int r12 = r12.getPaddingTop()
            int r9 = r9 - r12
            float r12 = r1.f2010f
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x009e
            if (r9 >= 0) goto L_0x009e
            r15 = r9
            goto L_0x00c4
        L_0x009e:
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c3
            android.support.v7.widget.gh r9 = r1.f2006b
            android.view.View r9 = r9.itemView
            int r9 = r9.getHeight()
            int r8 = r8 + r9
            android.graphics.Rect r9 = r1.f2022r
            int r9 = r9.bottom
            int r8 = r8 + r9
            android.support.v7.widget.RecyclerView r9 = r1.f2017m
            int r9 = r9.getHeight()
            android.support.v7.widget.RecyclerView r10 = r1.f2017m
            int r10 = r10.getPaddingBottom()
            int r9 = r9 - r10
            int r8 = r8 - r9
            if (r8 > 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r15 = r8
            goto L_0x00c4
        L_0x00c3:
            r15 = 0
        L_0x00c4:
            if (r11 == 0) goto L_0x00dc
            android.support.v7.widget.a.f r8 = r1.f2014j
            android.support.v7.widget.RecyclerView r9 = r1.f2017m
            android.support.v7.widget.gh r10 = r1.f2006b
            android.view.View r10 = r10.itemView
            int r10 = r10.getWidth()
            android.support.v7.widget.RecyclerView r12 = r1.f2017m
            r12.getWidth()
            r12 = r4
            int r11 = r8.mo2446i(r9, r10, r11, r12)
        L_0x00dc:
            r16 = r11
            if (r15 == 0) goto L_0x00f7
            android.support.v7.widget.a.f r8 = r1.f2014j
            android.support.v7.widget.RecyclerView r9 = r1.f2017m
            android.support.v7.widget.gh r10 = r1.f2006b
            android.view.View r10 = r10.itemView
            int r10 = r10.getHeight()
            android.support.v7.widget.RecyclerView r11 = r1.f2017m
            r11.getHeight()
            r11 = r15
            r12 = r4
            int r15 = r8.mo2446i(r9, r10, r11, r12)
        L_0x00f7:
            if (r16 != 0) goto L_0x00ff
            if (r15 == 0) goto L_0x00fc
            goto L_0x0101
        L_0x00fc:
            r1.f2023s = r6
            return
        L_0x00ff:
            r14 = r16
        L_0x0101:
            long r4 = r1.f2023s
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0109
            r1.f2023s = r2
        L_0x0109:
            android.support.v7.widget.RecyclerView r1 = r1.f2017m
            r1.scrollBy(r14, r15)
            android.support.v7.widget.a.l r1 = r0.f1976a
            android.support.v7.widget.gh r2 = r1.f2006b
            if (r2 == 0) goto L_0x0117
            r1.mo2463g(r2)
        L_0x0117:
            android.support.v7.widget.a.l r1 = r0.f1976a
            android.support.v7.widget.RecyclerView r2 = r1.f2017m
            java.lang.Runnable r1 = r1.f2018n
            r2.removeCallbacks(r1)
            android.support.v7.widget.a.l r1 = r0.f1976a
            android.support.v7.widget.RecyclerView r1 = r1.f2017m
            androidx.core.p098j.C2043bi.m5520N(r1, r0)
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.p041a.C0491a.run():void");
    }
}
