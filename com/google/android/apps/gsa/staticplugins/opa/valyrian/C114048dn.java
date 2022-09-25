package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.app.Activity;
import android.content.Context;
import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.opa.C83580ak;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.dn */
/* compiled from: PG */
final class C114048dn implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C86124t f315730a;

    /* renamed from: b */
    final /* synthetic */ C83580ak f315731b;

    /* renamed from: c */
    final /* synthetic */ Activity f315732c;

    /* renamed from: d */
    final /* synthetic */ boolean f315733d;

    /* renamed from: e */
    final /* synthetic */ Context f315734e;

    /* renamed from: f */
    final /* synthetic */ C114071eg f315735f;

    public C114048dn(C114071eg egVar, C86124t tVar, C83580ak akVar, Activity activity, boolean z, Context context) {
        this.f315735f = egVar;
        this.f315730a = tVar;
        this.f315731b = akVar;
        this.f315732c = activity;
        this.f315733d = z;
        this.f315734e = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        r0 = r10.f315735f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0091, code lost:
        r0 = r10.f315735f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r10 = this;
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            android.widget.FrameLayout r0 = r0.f315985u
            if (r0 == 0) goto L_0x01d6
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f315730a
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248266b
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x001b
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            android.widget.FrameLayout r0 = r0.f315985u
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r10)
        L_0x001b:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            boolean r0 = r0.mo95399aj()
            if (r0 == 0) goto L_0x01d6
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f315730a
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248266b
            boolean r0 = r0.mo79746e(r1)
            if (r0 != 0) goto L_0x0038
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            android.widget.FrameLayout r0 = r0.f315985u
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r10)
        L_0x0038:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            int r0 = r0.f315906bp
            r1 = 7
            r2 = 4
            r3 = 10
            r4 = 2
            r5 = 1
            r6 = 0
            if (r0 == r1) goto L_0x00d2
            r1 = 8
            if (r0 == r1) goto L_0x00d2
            r1 = 3
            if (r0 == r1) goto L_0x00d2
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f315730a
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248205S
            boolean r0 = r0.mo79746e(r1)
            r1 = 13
            if (r0 != 0) goto L_0x005e
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            int r0 = r0.f315906bp
            if (r0 == r1) goto L_0x00d2
        L_0x005e:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            int r7 = r0.f315906bp
            if (r7 == r3) goto L_0x00d2
            r8 = 6
            if (r7 != r8) goto L_0x0075
            boolean r0 = r0.mo100911dp()
            if (r0 == 0) goto L_0x0075
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            boolean r0 = r0.mo100905db()
            if (r0 == 0) goto L_0x00d2
        L_0x0075:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            int r0 = r0.f315906bp
            r7 = 19
            if (r0 != r7) goto L_0x007e
            goto L_0x00d2
        L_0x007e:
            com.google.android.apps.gsa.opa.ak r3 = r10.f315731b
            r7 = 11
            if (r0 != r7) goto L_0x0091
            boolean r0 = r3.mo76924e()
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r3.mo76925f()
            if (r0 == 0) goto L_0x0091
            goto L_0x00b7
        L_0x0091:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            int r3 = r0.f315906bp
            if (r3 == r2) goto L_0x00b7
            r2 = 12
            if (r3 != r2) goto L_0x00a1
            boolean r0 = r0.mo100905db()
            if (r0 == 0) goto L_0x00b7
        L_0x00a1:
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f315730a
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248205S
            boolean r0 = r0.mo79746e(r2)
            if (r0 == 0) goto L_0x00b1
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            int r0 = r0.f315906bp
            if (r0 == r1) goto L_0x00ea
        L_0x00b1:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            r0.mo101014cD(r6, r6)
            goto L_0x00ea
        L_0x00b7:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r0.f315856an
            r0.mo101173t(r4)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            r0.mo101016cF(r6)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            int r1 = r0.f315909bs
            r0.mo101033dD(r6, r1)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            r0.f315909bs = r4
            r0.mo101034dE(r4)
            goto L_0x00ea
        L_0x00d2:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            int r1 = r0.f315906bp
            if (r1 == r3) goto L_0x00e3
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.w r0 = r0.f315821aE
            r0.mo101204a(r2)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.w r0 = r0.f315821aE
            r0.f316465a = r5
        L_0x00e3:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r0.f315856an
            r0.mo101170q()
        L_0x00ea:
            android.app.Activity r0 = r10.f315732c
            boolean r0 = com.google.android.apps.gsa.nga.shared.p6369ui.p6405b.C82193a.m130503a(r0)
            if (r0 != 0) goto L_0x017a
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r1 = r0.f315856an
            android.view.ViewGroup r1 = r1.f316350l
            int[] r2 = new int[r4]
            android.content.Context r3 = r0.f315981q
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131100204(0x7f06022c, float:1.7812783E38)
            int r3 = r3.getColor(r4)
            r2[r6] = r3
            android.content.Context r3 = r0.f315981q
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131100203(0x7f06022b, float:1.781278E38)
            int r3 = r3.getColor(r4)
            r2[r5] = r3
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP
            r3.<init>(r4, r2)
            r3.setGradientType(r5)
            com.google.android.apps.gsa.staticplugins.opa.util.bo r0 = r0.f315987w
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f315170b
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247484hy
            long r6 = r2.mo79743a(r4)
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f315170b
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247485hz
            long r8 = r2.mo79743a(r4)
            android.content.Context r2 = r0.f315169a
            android.util.DisplayMetrics r2 = com.google.android.apps.gsa.staticplugins.opa.util.C113799bo.m188384a(r2)
            int r2 = r2.heightPixels
            android.content.Context r0 = r0.f315169a
            float r4 = (float) r8
            float r4 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r4, r0)
            android.util.DisplayMetrics r8 = com.google.android.apps.gsa.staticplugins.opa.util.C113799bo.m188384a(r0)
            int r8 = r8.heightPixels
            android.content.res.Resources r0 = r0.getResources()
            r9 = 2131166615(0x7f070597, float:1.794748E38)
            int r0 = r0.getDimensionPixelSize(r9)
            android.graphics.Rect r9 = new android.graphics.Rect
            float r2 = (float) r2
            int r7 = (int) r6
            float r6 = (float) r7
            r7 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r7
            float r2 = r2 * r6
            int r2 = (int) r2
            int r2 = r8 - r2
            int r2 = r2 - r0
            int r4 = (int) r4
            int r4 = r4 + r0
            int r8 = r8 - r0
            r9.<init>(r0, r2, r4, r8)
            int r0 = r9.width()
            float r0 = (float) r0
            r3.setGradientRadius(r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.setGradientCenter(r0, r2)
            r1.setBackground(r3)
        L_0x017a:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            r0.mo101002bN(r5)
            boolean r0 = r10.f315733d
            if (r0 == 0) goto L_0x01d6
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r10.f315735f
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianRecyclerView r0 = r0.f315866ax
            if (r0 == 0) goto L_0x01d6
            android.support.v7.widget.fh r0 = r0.mItemAnimator
            boolean r1 = r0 instanceof com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114097ab
            if (r1 == 0) goto L_0x0195
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ab r0 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ab
            r0.<init>()
            goto L_0x01cd
        L_0x0195:
            boolean r1 = r0 instanceof com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114116au
            if (r1 == 0) goto L_0x01a3
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.au r0 = new com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.au
            android.content.Context r1 = r10.f315734e
            com.google.android.apps.gsa.search.core.i.t r2 = r10.f315730a
            r0.<init>(r1, r2)
            goto L_0x01cd
        L_0x01a3:
            boolean r1 = r0 instanceof android.support.p033v7.widget.C0568ck
            if (r1 == 0) goto L_0x01b4
            android.support.v7.widget.ck r1 = new android.support.v7.widget.ck
            r1.<init>()
            android.support.v7.widget.ck r0 = (android.support.p033v7.widget.C0568ck) r0
            boolean r0 = r0.f2538m
            r1.f2538m = r0
        L_0x01b2:
            r0 = r1
            goto L_0x01cd
        L_0x01b4:
            r1 = 0
            if (r0 == 0) goto L_0x01b2
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg.f315790j
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r3 = 28480(0x6f40, float:3.9909E-41)
            java.lang.String r4 = "Unhandled animator: %s."
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r3)).mo56389s(r4, r0)
            goto L_0x01b2
        L_0x01cd:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r1 = r10.f315735f
            android.support.v7.widget.RecyclerView r1 = r1.mo100994aT()
            r1.setItemAnimator(r0)
        L_0x01d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.C114048dn.onGlobalLayout():void");
    }
}
