package com.google.android.libraries.surveys.internal.view;

import android.view.ViewTreeObserver;
import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68400y;

/* renamed from: com.google.android.libraries.surveys.internal.view.bl */
/* compiled from: PG */
final class C43110bl implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    final /* synthetic */ C43111bm f112749a;

    public C43110bl(C43111bm bmVar) {
        this.f112749a = bmVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        if (r6 != false) goto L_0x0052;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46170a(int r6) {
        /*
            r5 = this;
            com.google.android.libraries.surveys.internal.view.bm r0 = r5.f112749a
            boolean r0 = r0.getUserVisibleHint()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.google.android.libraries.surveys.internal.view.bm r0 = r5.f112749a
            com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback r0 = r0.f112755i
            int r0 = r0.getScrollY()
            com.google.android.libraries.surveys.internal.view.bm r1 = r5.f112749a
            android.view.View r1 = r1.f112754h
            int r1 = r1.getBottom()
            com.google.android.libraries.surveys.internal.view.bm r2 = r5.f112749a
            com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback r2 = r2.f112755i
            int r2 = r2.getScrollY()
            int r2 = r2 + r6
            com.google.android.libraries.surveys.internal.view.bm r3 = r5.f112749a
            android.view.View r3 = r3.f112754h
            int r3 = r3.getBottom()
            if (r3 <= r6) goto L_0x002e
            r6 = 1
            goto L_0x002f
        L_0x002e:
            r6 = 0
        L_0x002f:
            r3 = 0
            if (r6 == 0) goto L_0x0049
            if (r0 != 0) goto L_0x0035
            goto L_0x0049
        L_0x0035:
            com.google.android.libraries.surveys.internal.view.bm r6 = r5.f112749a
            android.view.View r0 = r6.f112752f
            android.content.res.Resources r6 = r6.getResources()
            r4 = 2131172535(0x7f071cb7, float:1.7959488E38)
            int r6 = r6.getDimensionPixelSize(r4)
            float r6 = (float) r6
            r0.setElevation(r6)
            goto L_0x0052
        L_0x0049:
            com.google.android.libraries.surveys.internal.view.bm r0 = r5.f112749a
            android.view.View r0 = r0.f112752f
            r0.setElevation(r3)
            if (r6 == 0) goto L_0x0069
        L_0x0052:
            if (r1 != r2) goto L_0x0055
            goto L_0x0069
        L_0x0055:
            com.google.android.libraries.surveys.internal.view.bm r6 = r5.f112749a
            android.view.View r0 = r6.f112753g
            android.content.res.Resources r6 = r6.getResources()
            r1 = 2131172517(0x7f071ca5, float:1.7959451E38)
            int r6 = r6.getDimensionPixelSize(r1)
            float r6 = (float) r6
            r0.setElevation(r6)
            return
        L_0x0069:
            com.google.android.libraries.surveys.internal.view.bm r6 = r5.f112749a
            android.view.View r6 = r6.f112753g
            r6.setElevation(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.view.C43110bl.mo46170a(int):void");
    }

    public final void onScrollChanged() {
        if (!C43054c.m75959b(C68400y.m98798d(C43054c.f112610b)) || this.f112749a.mo46174j()) {
            mo46170a(this.f112749a.f112755i.getHeight());
        }
    }
}
