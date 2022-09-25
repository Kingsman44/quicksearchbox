package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1697d.C20483n;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;

/* renamed from: com.google.android.libraries.componentview.components.base.a */
/* compiled from: PG */
public abstract class C19898a extends C20483n {

    /* renamed from: e */
    public static final int f55668e = Color.rgb(66, 133, 244);

    /* renamed from: a */
    private boolean f55669a = false;

    /* renamed from: f */
    protected final Context f55670f;

    /* renamed from: g */
    public final C20601ca f55671g;

    /* renamed from: h */
    protected final C20537f f55672h;

    /* renamed from: i */
    protected final C20621l f55673i;

    public C19898a(C56425d dVar, Context context, C20537f fVar, C20601ca caVar, C20621l lVar) {
        super(dVar);
        this.f55670f = context;
        this.f55671g = caVar;
        this.f55672h = fVar;
        this.f55673i = lVar;
    }

    /* renamed from: m */
    private static void m37765m(View view, Drawable drawable) {
        Drawable background = view.getBackground();
        if (background != null) {
            drawable = new LayerDrawable(new Drawable[]{background, drawable});
        }
        view.setBackground(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C19926b mo25154e() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C56425d mo25128f();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo25129h(View view);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo25130i(C56425d dVar);

    /* renamed from: j */
    public void mo25180j() {
        mo25130i(this.f57588z);
        C56425d f = mo25128f();
        if (f != null) {
            this.f57601m = this.f55672h.mo25450a(this, f);
            View kH = mo25098kH();
            if (kH == null) {
                C20598by G = mo25418G();
                G.mo25535e(C19742a.NULL_VIEW);
                G.mo25536f("Unable to attach actions to null view");
                C20520h.m38498c("AbstractActionComponent", G.mo25531a(), this.f55671g, new Object[0]);
                return;
            }
            C56425d dVar = this.f57588z;
            if ((dVar.f150539a & 4) != 0) {
                C56429h hVar = dVar.f150542d;
                if (hVar == null) {
                    hVar = C56429h.f150547k;
                }
                if ((hVar.f150549a & 1) != 0) {
                    C56429h hVar2 = this.f57588z.f150542d;
                    if (hVar2 == null) {
                        hVar2 = C56429h.f150547k;
                    }
                    C60214n nVar = hVar2.f150550b;
                    if (nVar == null) {
                        nVar = C60214n.f162914g;
                    }
                    C20482m.m38441i(kH, nVar.f162918c);
                }
            }
            mo25129h(kH);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        if ((r7.f56034a & 8) == 0) goto L_0x008b;
     */
    /* renamed from: kD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25181kD(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            boolean r0 = r6.f55669a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r6.f55669a = r0
            android.view.View r1 = r6.mo25098kH()
            r2 = 0
            if (r1 != 0) goto L_0x002b
            com.google.android.libraries.componentview.services.application.by r7 = r6.mo25418G()
            com.google.android.libraries.componentview.a.b.a r8 = com.google.android.libraries.componentview.p1675a.p1677b.C19742a.NULL_VIEW
            r7.mo25535e(r8)
            java.lang.String r8 = "Unable to round corners of null view"
            r7.mo25536f(r8)
            com.google.android.libraries.componentview.services.application.bz r7 = r7.mo25531a()
            com.google.android.libraries.componentview.services.application.ca r8 = r6.f55671g
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.String r10 = "AbstractActionComponent"
            com.google.android.libraries.componentview.p1699f.C20520h.m38498c(r10, r7, r8, r9)
            return
        L_0x002b:
            super.mo25181kD(r7, r8, r9, r10)
            r3 = 8
            float[] r4 = new float[r3]
            r4[r2] = r7
            r4[r0] = r7
            r7 = 2
            r4[r7] = r8
            r7 = 3
            r4[r7] = r8
            r7 = 4
            r4[r7] = r9
            r8 = 5
            r4[r8] = r9
            r8 = 6
            r4[r8] = r10
            r8 = 7
            r4[r8] = r10
            boolean r8 = r6.mo25182l()
            if (r8 == 0) goto L_0x00ad
            com.google.android.libraries.componentview.components.base.a.b r8 = r6.mo25154e()
            if (r8 == 0) goto L_0x005a
            boolean r8 = r8.f55758c
            if (r8 == 0) goto L_0x005a
            r8 = 1
            goto L_0x005b
        L_0x005a:
            r8 = 0
        L_0x005b:
            com.google.android.libraries.componentview.components.base.a.b r9 = r6.mo25154e()
            r10 = 536870912(0x20000000, float:1.0842022E-19)
            if (r9 == 0) goto L_0x008b
            int r5 = r9.f55756a
            r7 = r7 & r5
            if (r7 == 0) goto L_0x008b
            com.google.android.libraries.componentview.components.base.a.r r7 = r9.f55759d
            if (r7 != 0) goto L_0x006e
            com.google.android.libraries.componentview.components.base.a.r r7 = com.google.android.libraries.componentview.components.base.p1687a.C19995r.f56032g
        L_0x006e:
            int r7 = r7.f56034a
            r7 = r7 & 16
            if (r7 == 0) goto L_0x0075
            goto L_0x0081
        L_0x0075:
            com.google.android.libraries.componentview.components.base.a.r r7 = r9.f55759d
            if (r7 != 0) goto L_0x007b
            com.google.android.libraries.componentview.components.base.a.r r7 = com.google.android.libraries.componentview.components.base.p1687a.C19995r.f56032g
        L_0x007b:
            int r7 = r7.f56034a
            r7 = r7 & r3
            if (r7 != 0) goto L_0x0081
            goto L_0x008b
        L_0x0081:
            com.google.android.libraries.componentview.components.base.a.r r7 = r9.f55759d
            if (r7 != 0) goto L_0x0087
            com.google.android.libraries.componentview.components.base.a.r r7 = com.google.android.libraries.componentview.components.base.p1687a.C19995r.f56032g
        L_0x0087:
            int r10 = com.google.android.libraries.componentview.services.application.C20566at.m38590a(r7)
        L_0x008b:
            r7 = 0
            if (r8 == 0) goto L_0x0098
            android.graphics.drawable.RippleDrawable r8 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r10)
            r8.<init>(r9, r7, r7)
            goto L_0x00aa
        L_0x0098:
            android.graphics.drawable.PaintDrawable r8 = new android.graphics.drawable.PaintDrawable
            r8.<init>()
            r8.setCornerRadii(r4)
            android.graphics.drawable.RippleDrawable r9 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r10 = android.content.res.ColorStateList.valueOf(r10)
            r9.<init>(r10, r7, r8)
            r8 = r9
        L_0x00aa:
            m37765m(r1, r8)
        L_0x00ad:
            com.google.android.libraries.componentview.services.application.l r7 = r6.f55673i
            boolean r7 = r7.mo25566a()
            if (r7 == 0) goto L_0x00df
            android.content.Context r7 = r6.f55670f
            r1.setFocusable(r0)
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
            r8.<init>()
            float r7 = com.google.android.libraries.componentview.p1697d.C20482m.m38433a(r7)
            float r7 = r7 + r7
            int r7 = (int) r7
            int r9 = f55668e
            r8.setStroke(r7, r9)
            r8.setCornerRadii(r4)
            android.graphics.drawable.StateListDrawable r7 = new android.graphics.drawable.StateListDrawable
            r7.<init>()
            int[] r9 = new int[r0]
            r10 = 16842908(0x101009c, float:2.3693995E-38)
            r9[r2] = r10
            r7.addState(r9, r8)
            m37765m(r1, r7)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.components.base.C19898a.mo25181kD(float, float, float, float):void");
    }

    /* renamed from: kx */
    public final void mo25108kx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo25182l() {
        C19926b e = mo25154e();
        return e == null || e.f55757b;
    }
}
