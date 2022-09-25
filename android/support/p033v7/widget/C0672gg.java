package android.support.p033v7.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.p098j.C2043bi;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;

/* renamed from: android.support.v7.widget.gg */
/* compiled from: PG */
final class C0672gg implements Runnable {

    /* renamed from: a */
    OverScroller f2473a;

    /* renamed from: b */
    Interpolator f2474b = RecyclerView.sQuinticInterpolator;

    /* renamed from: c */
    final /* synthetic */ RecyclerView f2475c;

    /* renamed from: d */
    private int f2476d;

    /* renamed from: e */
    private int f2477e;

    /* renamed from: f */
    private boolean f2478f = false;

    /* renamed from: g */
    private boolean f2479g = false;

    public C0672gg(RecyclerView recyclerView) {
        this.f2475c = recyclerView;
        this.f2473a = new OverScroller(recyclerView.getContext(), RecyclerView.sQuinticInterpolator);
    }

    /* renamed from: e */
    private final void m2367e() {
        this.f2475c.removeCallbacks(this);
        C2043bi.m5520N(this.f2475c, this);
    }

    /* renamed from: a */
    public final void mo3057a(int i, int i2) {
        this.f2475c.setScrollState(2);
        this.f2477e = 0;
        this.f2476d = 0;
        Interpolator interpolator = this.f2474b;
        Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.f2474b = interpolator2;
            this.f2473a = new OverScroller(this.f2475c.getContext(), RecyclerView.sQuinticInterpolator);
        }
        this.f2473a.fling(0, 0, i, i2, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
        mo3058b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3058b() {
        if (this.f2478f) {
            this.f2479g = true;
        } else {
            m2367e();
        }
    }

    /* renamed from: c */
    public final void mo3059c(int i, int i2, int i3, Interpolator interpolator) {
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int width = z ? this.f2475c.getWidth() : this.f2475c.getHeight();
            if (true != z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), SimpleSnackbar.LENGTH_SHORT);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.f2474b != interpolator) {
            this.f2474b = interpolator;
            this.f2473a = new OverScroller(this.f2475c.getContext(), interpolator);
        }
        this.f2477e = 0;
        this.f2476d = 0;
        this.f2475c.setScrollState(2);
        this.f2473a.startScroll(0, 0, i, i2, i4);
        mo3058b();
    }

    /* renamed from: d */
    public final void mo3060d() {
        this.f2475c.removeCallbacks(this);
        this.f2473a.abortAnimation();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            android.support.v7.widget.RecyclerView r1 = r0.f2475c
            android.support.v7.widget.fo r2 = r1.mLayout
            if (r2 != 0) goto L_0x000c
            r19.mo3060d()
            return
        L_0x000c:
            r2 = 0
            r0.f2479g = r2
            r3 = 1
            r0.f2478f = r3
            r1.consumePendingUpdateOperations()
            android.widget.OverScroller r1 = r0.f2473a
            boolean r4 = r1.computeScrollOffset()
            if (r4 == 0) goto L_0x01c8
            int r4 = r1.getCurrX()
            int r5 = r1.getCurrY()
            int r6 = r0.f2476d
            int r7 = r0.f2477e
            r0.f2476d = r4
            r0.f2477e = r5
            android.support.v7.widget.RecyclerView r8 = r0.f2475c
            int r4 = r4 - r6
            android.widget.EdgeEffect r6 = r8.mLeftGlow
            android.widget.EdgeEffect r9 = r8.mRightGlow
            int r8 = r8.getWidth()
            int r4 = android.support.p033v7.widget.RecyclerView.consumeFlingInStretch$ar$ds(r4, r6, r9, r8)
            android.support.v7.widget.RecyclerView r6 = r0.f2475c
            int r5 = r5 - r7
            android.widget.EdgeEffect r7 = r6.mTopGlow
            android.widget.EdgeEffect r8 = r6.mBottomGlow
            int r6 = r6.getHeight()
            int r5 = android.support.p033v7.widget.RecyclerView.consumeFlingInStretch$ar$ds(r5, r7, r8, r6)
            android.support.v7.widget.RecyclerView r6 = r0.f2475c
            int[] r13 = r6.mReusableIntPair
            r13[r2] = r2
            r13[r3] = r2
            androidx.core.j.z r10 = r6.getScrollingChildHelper()
            r14 = 0
            r15 = 1
            r11 = r4
            r12 = r5
            boolean r6 = r10.mo5283e(r11, r12, r13, r14, r15)
            if (r6 == 0) goto L_0x006b
            android.support.v7.widget.RecyclerView r6 = r0.f2475c
            int[] r6 = r6.mReusableIntPair
            r7 = r6[r2]
            int r4 = r4 - r7
            r6 = r6[r3]
            int r5 = r5 - r6
        L_0x006b:
            android.support.v7.widget.RecyclerView r6 = r0.f2475c
            int r6 = r6.getOverScrollMode()
            r7 = 2
            if (r6 == r7) goto L_0x0079
            android.support.v7.widget.RecyclerView r6 = r0.f2475c
            r6.considerReleasingGlowsOnScroll(r4, r5)
        L_0x0079:
            android.support.v7.widget.RecyclerView r6 = r0.f2475c
            android.support.v7.widget.fb r8 = r6.mAdapter
            if (r8 == 0) goto L_0x00bc
            int[] r8 = r6.mReusableIntPair
            r8[r2] = r2
            r8[r3] = r2
            r6.scrollStep(r4, r5, r8)
            android.support.v7.widget.RecyclerView r6 = r0.f2475c
            int[] r8 = r6.mReusableIntPair
            r9 = r8[r2]
            r8 = r8[r3]
            int r4 = r4 - r9
            int r5 = r5 - r8
            android.support.v7.widget.fo r10 = r6.mLayout
            android.support.v7.widget.gd r10 = r10.mSmoothScroller
            if (r10 == 0) goto L_0x00be
            boolean r11 = r10.f2452j
            if (r11 != 0) goto L_0x00be
            boolean r11 = r10.f2453k
            if (r11 == 0) goto L_0x00be
            android.support.v7.widget.ge r6 = r6.mState
            int r6 = r6.mo3052a()
            if (r6 != 0) goto L_0x00ac
            r10.mo3051l()
            goto L_0x00be
        L_0x00ac:
            int r11 = r10.f2449g
            if (r11 < r6) goto L_0x00b8
            int r6 = r6 + -1
            r10.f2449g = r6
            r10.mo3050k(r9, r8)
            goto L_0x00be
        L_0x00b8:
            r10.mo3050k(r9, r8)
            goto L_0x00be
        L_0x00bc:
            r8 = 0
            r9 = 0
        L_0x00be:
            android.support.v7.widget.RecyclerView r6 = r0.f2475c
            java.util.ArrayList r6 = r6.mItemDecorations
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x00cd
            android.support.v7.widget.RecyclerView r6 = r0.f2475c
            r6.invalidate()
        L_0x00cd:
            android.support.v7.widget.RecyclerView r6 = r0.f2475c
            int[] r10 = r6.mReusableIntPair
            r10[r2] = r2
            r10[r3] = r2
            androidx.core.j.z r11 = r6.getScrollingChildHelper()
            r16 = 0
            r17 = 1
            r12 = r9
            r13 = r8
            r14 = r4
            r15 = r5
            r18 = r10
            r11.mo5284f(r12, r13, r14, r15, r16, r17, r18)
            android.support.v7.widget.RecyclerView r6 = r0.f2475c
            int[] r10 = r6.mReusableIntPair
            r11 = r10[r2]
            int r4 = r4 - r11
            r10 = r10[r3]
            int r5 = r5 - r10
            if (r9 != 0) goto L_0x00f9
            if (r8 == 0) goto L_0x00f6
            r9 = 0
            goto L_0x00f9
        L_0x00f6:
            r8 = 0
            r9 = 0
            goto L_0x00fc
        L_0x00f9:
            r6.dispatchOnScrolled(r9, r8)
        L_0x00fc:
            android.support.v7.widget.RecyclerView r6 = r0.f2475c
            boolean r6 = r6.awakenScrollBars()
            if (r6 != 0) goto L_0x0109
            android.support.v7.widget.RecyclerView r6 = r0.f2475c
            r6.invalidate()
        L_0x0109:
            int r6 = r1.getCurrX()
            int r10 = r1.getFinalX()
            int r11 = r1.getCurrY()
            int r12 = r1.getFinalY()
            boolean r13 = r1.isFinished()
            if (r13 != 0) goto L_0x012e
            if (r6 == r10) goto L_0x0127
            if (r4 == 0) goto L_0x0124
            goto L_0x0127
        L_0x0124:
            r4 = 0
        L_0x0125:
            r6 = 0
            goto L_0x012f
        L_0x0127:
            if (r11 == r12) goto L_0x012e
            if (r5 == 0) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            r5 = 0
            goto L_0x0125
        L_0x012e:
            r6 = 1
        L_0x012f:
            android.support.v7.widget.RecyclerView r10 = r0.f2475c
            android.support.v7.widget.fo r11 = r10.mLayout
            android.support.v7.widget.gd r11 = r11.mSmoothScroller
            if (r11 == 0) goto L_0x013d
            boolean r11 = r11.f2452j
            if (r11 == 0) goto L_0x013d
            goto L_0x01bc
        L_0x013d:
            if (r6 == 0) goto L_0x01bc
            int r6 = r10.getOverScrollMode()
            if (r6 == r7) goto L_0x01b0
            float r1 = r1.getCurrVelocity()
            int r1 = (int) r1
            if (r4 >= 0) goto L_0x014e
            int r4 = -r1
            goto L_0x0153
        L_0x014e:
            if (r4 <= 0) goto L_0x0152
            r4 = r1
            goto L_0x0153
        L_0x0152:
            r4 = 0
        L_0x0153:
            if (r5 >= 0) goto L_0x0157
            int r1 = -r1
            goto L_0x015b
        L_0x0157:
            if (r5 <= 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r1 = 0
        L_0x015b:
            android.support.v7.widget.RecyclerView r5 = r0.f2475c
            if (r4 >= 0) goto L_0x0171
            r5.ensureLeftGlow()
            android.widget.EdgeEffect r6 = r5.mLeftGlow
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L_0x0183
            android.widget.EdgeEffect r6 = r5.mLeftGlow
            int r7 = -r4
            r6.onAbsorb(r7)
            goto L_0x0183
        L_0x0171:
            if (r4 <= 0) goto L_0x0183
            r5.ensureRightGlow()
            android.widget.EdgeEffect r6 = r5.mRightGlow
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L_0x0183
            android.widget.EdgeEffect r6 = r5.mRightGlow
            r6.onAbsorb(r4)
        L_0x0183:
            if (r1 >= 0) goto L_0x0197
            r5.ensureTopGlow()
            android.widget.EdgeEffect r6 = r5.mTopGlow
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L_0x01a9
            android.widget.EdgeEffect r6 = r5.mTopGlow
            int r7 = -r1
            r6.onAbsorb(r7)
            goto L_0x01a9
        L_0x0197:
            if (r1 <= 0) goto L_0x01a9
            r5.ensureBottomGlow()
            android.widget.EdgeEffect r6 = r5.mBottomGlow
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L_0x01a9
            android.widget.EdgeEffect r6 = r5.mBottomGlow
            r6.onAbsorb(r1)
        L_0x01a9:
            if (r4 != 0) goto L_0x01ad
            if (r1 == 0) goto L_0x01b0
        L_0x01ad:
            androidx.core.p098j.C2043bi.m5519M(r5)
        L_0x01b0:
            boolean r1 = android.support.p033v7.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r1 == 0) goto L_0x01c8
            android.support.v7.widget.RecyclerView r1 = r0.f2475c
            android.support.v7.widget.de r1 = r1.mPrefetchRegistry
            r1.mo2730b()
            goto L_0x01c8
        L_0x01bc:
            r19.mo3058b()
            android.support.v7.widget.RecyclerView r1 = r0.f2475c
            android.support.v7.widget.dg r4 = r1.mGapWorker
            if (r4 == 0) goto L_0x01c8
            r4.mo2733a(r1, r9, r8)
        L_0x01c8:
            android.support.v7.widget.RecyclerView r1 = r0.f2475c
            android.support.v7.widget.fo r1 = r1.mLayout
            android.support.v7.widget.gd r1 = r1.mSmoothScroller
            if (r1 == 0) goto L_0x01d7
            boolean r4 = r1.f2452j
            if (r4 == 0) goto L_0x01d7
            r1.mo3050k(r2, r2)
        L_0x01d7:
            r0.f2478f = r2
            boolean r1 = r0.f2479g
            if (r1 == 0) goto L_0x01e1
            r19.m2367e()
            return
        L_0x01e1:
            android.support.v7.widget.RecyclerView r1 = r0.f2475c
            r1.setScrollState(r2)
            android.support.v7.widget.RecyclerView r1 = r0.f2475c
            androidx.core.j.z r1 = r1.getScrollingChildHelper()
            r1.mo5280b(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0672gg.run():void");
    }
}
