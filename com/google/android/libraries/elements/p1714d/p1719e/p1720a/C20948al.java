package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.protos.youtube.elements.C66215eb;

/* renamed from: com.google.android.libraries.elements.d.e.a.al */
/* compiled from: PG */
public final /* synthetic */ class C20948al implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C20951ao f58734a;

    /* renamed from: b */
    public final /* synthetic */ C66215eb f58735b;

    /* renamed from: c */
    public final /* synthetic */ C21311r f58736c;

    public /* synthetic */ C20948al(C20951ao aoVar, C66215eb ebVar, C21311r rVar) {
        this.f58734a = aoVar;
        this.f58735b = ebVar;
        this.f58736c = rVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            com.google.android.libraries.elements.d.e.a.ao r0 = r15.f58734a
            com.google.protos.youtube.elements.eb r1 = r15.f58735b
            com.google.android.libraries.elements.interfaces.r r2 = r15.f58736c
            android.view.View r3 = r2.mo26732b()
            if (r3 != 0) goto L_0x000d
            return
        L_0x000d:
            android.view.View r2 = r2.mo26731a()
            android.content.Context r4 = r3.getContext()
            int r5 = r1.f180059a
            r6 = 2
            r5 = r5 & r6
            if (r5 == 0) goto L_0x001e
            java.lang.String r5 = r1.f180061c
            goto L_0x001f
        L_0x001e:
            r5 = 0
        L_0x001f:
            if (r5 == 0) goto L_0x0034
            android.view.View r2 = r3.findViewWithTag(r5)
            if (r2 == 0) goto L_0x0028
            goto L_0x004d
        L_0x0028:
            com.google.android.libraries.elements.interfaces.bc r0 = new com.google.android.libraries.elements.interfaces.bc
            java.lang.String r1 = "Cannot find ScrollableContainerType instance via the provided key: "
            java.lang.String r1 = r1.concat(r5)
            r0.<init>(r1)
            throw r0
        L_0x0034:
            if (r2 == 0) goto L_0x0047
        L_0x0036:
            if (r2 == 0) goto L_0x0047
            boolean r5 = r2 instanceof android.widget.HorizontalScrollView
            if (r5 != 0) goto L_0x004b
            boolean r5 = r2 instanceof com.facebook.litho.widget.LithoScrollView
            if (r5 != 0) goto L_0x004b
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r2 = (android.view.View) r2
            goto L_0x0036
        L_0x0047:
            android.view.View r2 = r0.mo26076e(r3)
        L_0x004b:
            if (r2 == 0) goto L_0x010d
        L_0x004d:
            r0.mo26077f()
            boolean r3 = r2 instanceof android.widget.HorizontalScrollView
            if (r3 != 0) goto L_0x0061
            boolean r3 = r2 instanceof com.facebook.litho.widget.LithoScrollView
            if (r3 == 0) goto L_0x0059
            goto L_0x0061
        L_0x0059:
            com.google.android.libraries.elements.interfaces.bc r0 = new com.google.android.libraries.elements.interfaces.bc
            java.lang.String r1 = "ScrollableContainerTypeAutoScrollCommand should only apply to ScrollableContainerTypeinstance"
            r0.<init>(r1)
            throw r0
        L_0x0061:
            java.util.Locale r3 = java.util.Locale.getDefault()
            int r3 = androidx.core.p096h.C1965r.m5296a(r3)
            boolean r5 = r2 instanceof com.facebook.litho.widget.LithoScrollView
            int r7 = r1.f180059a
            r8 = 1
            r7 = r7 & r8
            r9 = 200(0xc8, double:9.9E-322)
            if (r7 == 0) goto L_0x007c
            long r11 = r1.f180060b
            r13 = 0
            int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x007c
            r9 = r11
        L_0x007c:
            android.content.res.Resources r1 = r4.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r4 = r2.getScrollX()
            int r7 = r2.getScrollY()
            java.lang.String r11 = "scrollX"
            r12 = 0
            if (r3 != r8) goto L_0x00ac
            if (r5 != 0) goto L_0x00ac
            int r1 = com.google.android.libraries.elements.p1714d.p1719e.p1720a.C20951ao.m39393d(r1, r4)
            int r1 = r1 * 1000
            long r13 = (long) r1
            long r13 = r13 / r9
            int[] r1 = new int[r6]
            r1[r12] = r4
            r1[r8] = r12
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(r2, r11, r1)
            android.animation.ObjectAnimator r1 = r1.setDuration(r13)
            r0.f58739a = r1
            goto L_0x00f2
        L_0x00ac:
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r3 = r3.getChildAt(r12)
            if (r5 == 0) goto L_0x00be
            int r3 = r3.getHeight()
            int r13 = r2.getHeight()
            goto L_0x00c6
        L_0x00be:
            int r3 = r3.getWidth()
            int r13 = r2.getWidth()
        L_0x00c6:
            int r3 = r3 - r13
            int r1 = com.google.android.libraries.elements.p1714d.p1719e.p1720a.C20951ao.m39393d(r1, r3)
            int r1 = r1 * 1000
            long r13 = (long) r1
            long r13 = r13 / r9
            if (r5 == 0) goto L_0x00e2
            int[] r1 = new int[r6]
            r1[r12] = r7
            r1[r8] = r3
            java.lang.String r3 = "scrollY"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(r2, r3, r1)
            android.animation.ObjectAnimator r1 = r1.setDuration(r13)
            goto L_0x00f0
        L_0x00e2:
            int[] r1 = new int[r6]
            r1[r12] = r4
            r1[r8] = r3
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(r2, r11, r1)
            android.animation.ObjectAnimator r1 = r1.setDuration(r13)
        L_0x00f0:
            r0.f58739a = r1
        L_0x00f2:
            android.animation.ObjectAnimator r1 = r0.f58739a
            com.google.android.libraries.elements.d.e.a.an r3 = new com.google.android.libraries.elements.d.e.a.an
            r3.<init>()
            r1.addListener(r3)
            com.google.android.libraries.elements.d.e.a.am r1 = new com.google.android.libraries.elements.d.e.a.am
            r1.<init>(r0, r2)
            r2.setOnTouchListener(r1)
            com.google.android.libraries.elements.d.e.a.ak r1 = new com.google.android.libraries.elements.d.e.a.ak
            r1.<init>(r0)
            r2.post(r1)
            return
        L_0x010d:
            com.google.android.libraries.elements.interfaces.bc r0 = new com.google.android.libraries.elements.interfaces.bc
            java.lang.String r1 = "Cannot find ScrollableContainerType instance in command's ancestors chain. Please put command at right place or add an Element key to both ScrollableContainerType instance and ScrollableContainer command."
            r0.<init>(r1)
            goto L_0x0116
        L_0x0115:
            throw r0
        L_0x0116:
            goto L_0x0115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.p1719e.p1720a.C20948al.run():void");
    }
}
