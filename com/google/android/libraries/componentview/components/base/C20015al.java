package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.libraries.componentview.components.base.p1687a.C19908ai;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19936bj;
import com.google.android.libraries.componentview.components.base.p1687a.C19938bl;
import com.google.android.libraries.componentview.components.base.p1687a.C19941bo;
import com.google.android.libraries.componentview.components.base.p1687a.C19991n;
import com.google.android.libraries.componentview.components.base.p1688b.C20041k;
import com.google.android.libraries.componentview.p1675a.p1677b.C19744c;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20587bn;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20539h;
import com.google.android.libraries.componentview.services.p1701a.C20540i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.components.base.al */
/* compiled from: PG */
public class C20015al extends C20061bs {

    /* renamed from: a */
    public String f56086a;

    /* renamed from: b */
    public C19941bo f56087b;

    /* renamed from: c */
    public final C20540i f56088c;

    /* renamed from: d */
    protected final SettableFuture f56089d = new SettableFuture();

    /* renamed from: e */
    protected final C20621l f56090e;

    /* renamed from: f */
    private byte[] f56091f;

    /* renamed from: g */
    private String f56092g;

    /* renamed from: h */
    private String f56093h;

    /* renamed from: i */
    private final C20587bn f56094i;

    /* renamed from: j */
    private boolean f56095j;

    /* renamed from: k */
    private final Executor f56096k;

    /* renamed from: l */
    private final C60887da f56097l;

    public C20015al(Context context, C56425d dVar, C20540i iVar, C20587bn bnVar, C20601ca caVar, C20566at atVar, C20621l lVar, Executor executor, C60887da daVar) {
        super(context, dVar, caVar);
        this.f56088c = iVar;
        this.f56094i = bnVar;
        this.f56090e = lVar;
        this.f56096k = executor;
        this.f56097l = daVar;
    }

    /* renamed from: A */
    private final boolean m37812A() {
        return TextUtils.isEmpty(this.f56086a) && m37813B() && this.f56093h == null;
    }

    /* renamed from: B */
    private final boolean m37813B() {
        return TextUtils.isEmpty(this.f56092g) || this.f56094i.mo25523a(this.f56092g) <= 0;
    }

    /* renamed from: C */
    private final boolean m37814C() {
        return !m37813B() && !this.f56087b.f55801f;
    }

    /* renamed from: m */
    private final C60870cx m37815m() {
        String str;
        boolean z = true;
        this.f56095j = true;
        byte[] bArr = this.f56091f;
        if (bArr != null) {
            return this.f56088c.mo25454b(this.f56086a, bArr, (ImageView) this.f56305p, this.f56087b.f55808m);
        }
        if (m37814C()) {
            ((ImageView) this.f56305p).setImageResource(this.f56094i.mo25523a(this.f56092g));
            return C60856cj.m92900i(new C19744c());
        } else if (this.f56093h != null) {
            try {
                ((ImageView) this.f56305p).setImageDrawable(this.f56304o.getPackageManager().getApplicationIcon(this.f56093h));
            } catch (PackageManager.NameNotFoundException unused) {
                ((ImageView) this.f56305p).setImageDrawable(this.f56304o.getPackageManager().getDefaultActivityIcon());
            }
            return C60856cj.m92900i(new C19744c());
        } else {
            int a = C19938bl.m37781a(this.f56087b.f55802g);
            boolean z2 = a == 0 || a == 3;
            boolean B = m37813B();
            if (B) {
                str = this.f56086a;
            } else {
                Context context = this.f56304o;
                int a2 = this.f56094i.mo25523a(this.f56092g);
                str = "android.resource://" + context.getPackageName() + "/" + a2;
            }
            C20540i iVar = this.f56088c;
            ImageView imageView = (ImageView) this.f56305p;
            if (!z2 || !B) {
                z = false;
            }
            C60870cx c = iVar.mo25455c(str, imageView, z, this.f56087b.f55808m);
            if (!B && !TextUtils.isEmpty(this.f56086a)) {
                c.mo4106b(new C20014ak(this, z2), C60826bg.f164896a);
            }
            return c;
        }
    }

    /* renamed from: b */
    public final C60870cx mo25099b() {
        return this.f56089d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19941bo.f55794r);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        mo25191o((C19941bo) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public ImageView mo25110e(Context context) {
        return new C20041k(context, this.f56308s, this.f56096k, this.f56097l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: kz */
    public C56425d mo25132kz(List list) {
        byte[] bArr;
        int a = C19938bl.m37781a(this.f56087b.f55802g);
        if ((a != 0 && a != 3) || TextUtils.isEmpty(this.f56086a) || this.f56091f != null || m37814C()) {
            return this.f57588z;
        }
        C19936bj bjVar = (C19936bj) this.f56087b.toBuilder();
        C20540i iVar = this.f56088c;
        String str = this.f56086a;
        synchronized (iVar.f57692a) {
            C20539h hVar = (C20539h) iVar.f57692a.get(str);
            if (hVar == null) {
                bArr = null;
            } else {
                bArr = hVar.f57690b;
            }
        }
        if (bArr != null) {
            C63088z A = C63088z.m96139A(bArr);
            bjVar.copyOnWrite();
            C19941bo boVar = (C19941bo) bjVar.instance;
            boVar.f55796a |= 2;
            boVar.f55798c = A;
        }
        bjVar.copyOnWrite();
        C19941bo boVar2 = (C19941bo) bjVar.instance;
        boVar2.f55802g = 0;
        boVar2.f55796a |= 32;
        C19941bo boVar3 = this.f56087b;
        if ((boVar3.f55796a & 16384) != 0) {
            int a2 = C19908ai.m37774a(boVar3.f55811p);
            if (a2 == 0) {
                a2 = 1;
            }
            bjVar.copyOnWrite();
            C19941bo boVar4 = (C19941bo) bjVar.instance;
            boVar4.f55811p = a2 - 1;
            boVar4.f55796a |= 16384;
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19941bo.f55794r, (C19941bo) bjVar.build());
        return (C56425d) cVar.build();
    }

    /* renamed from: n */
    public final C60870cx mo25190n() {
        if (m37812A() || this.f56095j) {
            return C60856cj.m92900i(new C19744c());
        }
        return m37815m();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011f  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25191o(com.google.android.libraries.componentview.components.base.p1687a.C19941bo r6) {
        /*
            r5 = this;
            r5.f56087b = r6
            int r0 = r6.f55796a
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0011
            com.google.android.libraries.componentview.components.base.a.aq r0 = r6.f55803h
            if (r0 != 0) goto L_0x000e
            com.google.android.libraries.componentview.components.base.a.aq r0 = com.google.android.libraries.componentview.components.base.p1687a.C19916aq.f55703s
        L_0x000e:
            r5.mo25249w(r0)
        L_0x0011:
            int r0 = r6.f55804i
            int r0 = com.google.android.libraries.componentview.components.base.p1687a.C19940bn.m37782a(r0)
            if (r0 != 0) goto L_0x001a
            r0 = 5
        L_0x001a:
            int r0 = r0 + -1
            switch(r0) {
                case 1: goto L_0x0036;
                case 2: goto L_0x0033;
                case 3: goto L_0x0030;
                case 4: goto L_0x002d;
                case 5: goto L_0x002a;
                case 6: goto L_0x0027;
                case 7: goto L_0x0024;
                case 8: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            r0 = 0
            goto L_0x0038
        L_0x0021:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            goto L_0x0038
        L_0x0024:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            goto L_0x0038
        L_0x0027:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_START
            goto L_0x0038
        L_0x002a:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_END
            goto L_0x0038
        L_0x002d:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            goto L_0x0038
        L_0x0030:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            goto L_0x0038
        L_0x0033:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            goto L_0x0038
        L_0x0036:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
        L_0x0038:
            if (r0 == 0) goto L_0x0041
            android.view.View r1 = r5.f56305p
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setScaleType(r0)
        L_0x0041:
            float r0 = r6.f55805j
            r1 = 0
            r2 = 0
            r3 = 1
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0058
            android.view.View r1 = r5.f56305p
            boolean r4 = r1 instanceof com.google.android.libraries.componentview.components.base.p1688b.C20041k
            if (r4 == 0) goto L_0x0058
            com.google.android.libraries.componentview.components.base.b.k r1 = (com.google.android.libraries.componentview.components.base.p1688b.C20041k) r1
            r1.f56188i = r0
            r1.setAdjustViewBounds(r2)
            goto L_0x0063
        L_0x0058:
            boolean r0 = r6.f55806k
            if (r0 == 0) goto L_0x0063
            android.view.View r0 = r5.f56305p
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setAdjustViewBounds(r3)
        L_0x0063:
            int r0 = r6.f55796a
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = r6.f55797b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0074
            java.lang.String r0 = r6.f55797b
            r5.f56086a = r0
        L_0x0074:
            int r0 = r6.f55796a
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x008a
            com.google.protobuf.z r0 = r6.f55798c
            int r0 = r0.mo59031d()
            if (r0 <= 0) goto L_0x008a
            com.google.protobuf.z r0 = r6.f55798c
            byte[] r0 = r0.mo59174N()
            r5.f56091f = r0
        L_0x008a:
            int r0 = r6.f55796a
            r0 = r0 & 4
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = r6.f55799d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = r6.f55799d
            r5.f56092g = r0
        L_0x009c:
            int r0 = r6.f55796a
            r3 = r0 & 8
            if (r3 == 0) goto L_0x00a6
            java.lang.String r3 = r6.f55800e
            r5.f56093h = r3
        L_0x00a6:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00bf
            com.google.android.libraries.componentview.components.base.a.r r0 = r6.f55807l
            if (r0 != 0) goto L_0x00b0
            com.google.android.libraries.componentview.components.base.a.r r0 = com.google.android.libraries.componentview.components.base.p1687a.C19995r.f56032g
        L_0x00b0:
            int r0 = com.google.android.libraries.componentview.services.application.C20566at.m38590a(r0)
            if (r0 == 0) goto L_0x00bf
            android.view.View r3 = r5.f56305p
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r3.setColorFilter(r0, r4)
        L_0x00bf:
            int r0 = r6.f55796a
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x00d5
            android.view.View r0 = r5.f56305p
            boolean r3 = r0 instanceof com.google.android.libraries.componentview.components.base.p1688b.C20041k
            if (r3 == 0) goto L_0x00d5
            com.google.android.libraries.componentview.components.base.b.k r0 = (com.google.android.libraries.componentview.components.base.p1688b.C20041k) r0
            com.google.android.libraries.componentview.components.base.a.bi r3 = r6.f55809n
            if (r3 != 0) goto L_0x00d3
            com.google.android.libraries.componentview.components.base.a.bi r3 = com.google.android.libraries.componentview.components.base.p1687a.C19935bi.f55786c
        L_0x00d3:
            r0.f56185f = r3
        L_0x00d5:
            boolean r0 = r5.m37812A()
            if (r0 == 0) goto L_0x011f
            com.google.android.libraries.componentview.services.application.by r0 = r5.mo25418G()
            com.google.android.libraries.componentview.a.b.a r1 = com.google.android.libraries.componentview.p1675a.p1677b.C19742a.EMPTY_RESOURCE
            r0.mo25535e(r1)
            java.lang.String r1 = "Empty resourceUrl, resourceData and resourceName!"
            r0.mo25536f(r1)
            int r1 = r6.f55796a
            r1 = r1 & 64
            if (r1 == 0) goto L_0x0102
            com.google.android.libraries.componentview.components.base.a.aq r6 = r6.f55803h
            if (r6 != 0) goto L_0x00f5
            com.google.android.libraries.componentview.components.base.a.aq r6 = com.google.android.libraries.componentview.components.base.p1687a.C19916aq.f55703s
        L_0x00f5:
            java.lang.String r6 = r6.f55713i
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Image Component Dump Information\ncontent description : "
            java.lang.String r6 = r1.concat(r6)
            goto L_0x0104
        L_0x0102:
            java.lang.String r6 = "Image Component Dump Information\n"
        L_0x0104:
            r0.mo25534d(r6)
            com.google.android.libraries.componentview.services.application.bz r6 = r0.mo25531a()
            com.google.android.libraries.componentview.services.application.ca r0 = r5.f56308s
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "ImageComponent"
            com.google.android.libraries.componentview.p1699f.C20520h.m38498c(r2, r6, r0, r1)
            com.google.common.util.concurrent.SettableFuture r6 = r5.f56089d
            com.google.android.libraries.componentview.a.b.c r0 = new com.google.android.libraries.componentview.a.b.c
            r0.<init>()
            r6.mo57356n(r0)
            return
        L_0x011f:
            com.google.android.libraries.componentview.components.base.a.bo r0 = r5.f56087b
            int r0 = r0.f55802g
            int r0 = com.google.android.libraries.componentview.components.base.p1687a.C19938bl.m37781a(r0)
            if (r0 != 0) goto L_0x012a
            goto L_0x0137
        L_0x012a:
            if (r0 != r1) goto L_0x0137
            com.google.common.util.concurrent.SettableFuture r0 = r5.f56089d
            com.google.android.libraries.componentview.a.b.c r1 = new com.google.android.libraries.componentview.a.b.c
            r1.<init>()
            r0.mo57356n(r1)
            goto L_0x0140
        L_0x0137:
            com.google.common.util.concurrent.SettableFuture r0 = r5.f56089d
            com.google.common.util.concurrent.cx r1 = r5.m37815m()
            r0.mo57358p(r1)
        L_0x0140:
            android.view.View r0 = r5.f56305p
            boolean r1 = r0 instanceof com.google.android.libraries.componentview.components.base.p1688b.C20041k
            if (r1 == 0) goto L_0x014c
            com.google.android.libraries.componentview.components.base.b.k r0 = (com.google.android.libraries.componentview.components.base.p1688b.C20041k) r0
            boolean r6 = r6.f55810o
            r0.f56187h = r6
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.components.base.C20015al.mo25191o(com.google.android.libraries.componentview.components.base.a.bo):void");
    }

    /* renamed from: p */
    public final void mo25192p(float f, float f2, float f3, float f4) {
        if (this.f56305p instanceof C20041k) {
            C19916aq aqVar = this.f56087b.f55803h;
            if (aqVar == null) {
                aqVar = C19916aq.f55703s;
            }
            if (aqVar.f55706b != 18 || !((Boolean) aqVar.f55707c).booleanValue()) {
                ((C20041k) this.f56305p).f56182c = new float[]{f, f, f2, f2, f3, f3, f4, f4};
            } else {
                ((C20041k) this.f56305p).f56183d = true;
            }
            ((C20041k) this.f56305p).f56186g = this.f56090e.mo25566a();
            return;
        }
        super.mo25192p(f, f2, f3, f4);
    }

    /* renamed from: q */
    public final void mo25193q(float f, float f2, float f3, float f4) {
        if (this.f56303n != null) {
            if (this.f56305p instanceof C20041k) {
                mo25192p(f, f2, f3, f4);
                C19991n nVar = this.f56303n;
                nVar.getClass();
                GradientDrawable s = mo25247s(nVar);
                Drawable background = ((ImageView) this.f56305p).getBackground();
                if (background instanceof ColorDrawable) {
                    s.setColor(((ColorDrawable) background).getColor());
                }
                ((ImageView) this.f56305p).setBackground(s);
                C20041k kVar = (C20041k) this.f56305p;
                C19991n nVar2 = this.f56303n;
                nVar2.getClass();
                kVar.f56184e = nVar2;
                Drawable background2 = kVar.getBackground();
                if ((background2 instanceof GradientDrawable) && !kVar.f56183d) {
                    if (f > 0.0f || f2 > 0.0f || f3 > 0.0f || f4 > 0.0f) {
                        ((GradientDrawable) background2).setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
                        return;
                    }
                    return;
                }
                return;
            }
            super.mo25193q(f, f2, f3, f4);
        }
    }
}
