package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.AnimatorSet;
import androidx.viewpager.widget.C4281n;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.staticplugins.opa.C109037fg;
import com.google.android.apps.gsa.staticplugins.opa.p8344bk.C108093b;
import com.google.android.apps.gsa.staticplugins.opa.searchbox.C110426a;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114106ak;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114132bj;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114748b;
import com.google.assistant.p3994s.p3995a.C53286ig;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.dr */
/* compiled from: PG */
final class C114052dr extends C4281n {

    /* renamed from: a */
    final /* synthetic */ C86124t f315740a;

    /* renamed from: b */
    final /* synthetic */ C108093b f315741b;

    /* renamed from: c */
    final /* synthetic */ C110426a f315742c;

    /* renamed from: d */
    final /* synthetic */ C114748b f315743d;

    /* renamed from: e */
    final /* synthetic */ C114106ak f315744e;

    /* renamed from: f */
    final /* synthetic */ boolean f315745f;

    /* renamed from: g */
    final /* synthetic */ C114071eg f315746g;

    /* renamed from: h */
    private int f315747h = 0;

    public C114052dr(C114071eg egVar, C86124t tVar, C108093b bVar, C110426a aVar, C114748b bVar2, C114106ak akVar, boolean z) {
        this.f315746g = egVar;
        this.f315740a = tVar;
        this.f315741b = bVar;
        this.f315742c = aVar;
        this.f315743d = bVar2;
        this.f315744e = akVar;
        this.f315745f = z;
    }

    /* renamed from: a */
    public final void mo9182a(int i) {
        C109037fg fgVar;
        int b;
        C59071e eVar = C114071eg.f315790j;
        if (i == 2) {
            if (this.f315746g.f315856an.mo101172s() == 4 || this.f315747h == 1) {
                C53287ih d = C87571n.m142340d(this.f315743d.f318451d);
                if (d == null || (b = C53286ig.m86808b(d.f139703i)) == 0 || b != 2) {
                    this.f315746g.f315821aE.mo101204a(1);
                } else {
                    this.f315746g.f315821aE.mo101204a(11);
                }
            } else {
                this.f315746g.f315821aE.mo101204a(2);
            }
            C114132bj bjVar = this.f315746g.f315856an;
            AnimatorSet animatorSet = bjVar.f316354p;
            if (animatorSet != null && !animatorSet.isStarted()) {
                bjVar.f316354p.start();
            }
        } else if (i == 0) {
            this.f315744e.mo101149a();
            if (this.f315746g.mo95399aj()) {
                if (this.f315746g.f315856an.mo101172s() != 4) {
                    C114071eg egVar = this.f315746g;
                    if (egVar.f315832aP || this.f315745f) {
                        egVar.f315856an.mo101173t(3);
                    } else {
                        int i2 = egVar.f315856an.f316355q;
                        if (i2 == 5) {
                            this.f315746g.f315856an.mo101173t(2);
                        } else if (i2 == 6) {
                            this.f315746g.f315856an.mo101173t(4);
                        }
                    }
                } else {
                    C114071eg egVar2 = this.f315746g;
                    if (egVar2.f315843aa && (fgVar = egVar2.f315911bu) != null) {
                        fgVar.f303205a.f303238X.mo96163ao(0);
                        fgVar.mo97411d();
                    }
                }
            }
        }
        this.f315747h = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a2, code lost:
        if (r13.f315742c.mo96176c() == false) goto L_0x01a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ab  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9184e(int r14) {
        /*
            r13 = this;
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg.f315790j
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r13.f315746g
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bj r0 = r0.f315856an
            int r0 = r0.mo101172s()
            r1 = 1
            r2 = 0
            r3 = 4
            if (r0 != r3) goto L_0x0011
            r4 = 0
            goto L_0x0012
        L_0x0011:
            r4 = 1
        L_0x0012:
            if (r0 != r3) goto L_0x0016
            r5 = 1
            goto L_0x0017
        L_0x0016:
            r5 = 0
        L_0x0017:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r6 = r13.f315746g
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ValyrianViewPager r7 = r6.f315855am
            r7.f316156c = r4
            boolean r4 = r6.f315823aG
            if (r4 == 0) goto L_0x0029
            int r4 = r6.f315906bp
            r7 = 10
            if (r4 != r7) goto L_0x0029
            r4 = 1
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            int r7 = r6.f315909bs
            if (r7 != r0) goto L_0x002f
            return
        L_0x002f:
            r6.mo101004bP()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r6 = r13.f315746g
            boolean r6 = r6.f315827aK
            r7 = 8
            r8 = 3
            if (r6 == 0) goto L_0x0040
            if (r0 == r8) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r6 = 3
            goto L_0x005b
        L_0x0040:
            com.google.android.apps.gsa.search.core.i.t r6 = r13.f315740a
            boolean r6 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f.m188692c(r6)
            if (r6 == 0) goto L_0x0061
            if (r0 == r3) goto L_0x0061
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r6 = r13.f315746g
            android.view.View r6 = r6.f315834aR
            int r6 = r6.getVisibility()
            if (r6 != r7) goto L_0x0061
            com.google.android.apps.gsa.staticplugins.opa.bk.b r6 = r13.f315741b
            boolean r6 = r6.f300678a
            if (r6 != 0) goto L_0x0061
            r6 = r0
        L_0x005b:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r9 = r13.f315746g
            r9.mo101026cm()
            goto L_0x0067
        L_0x0061:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r6 = r13.f315746g
            r6.mo101027cn()
            r6 = r0
        L_0x0067:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r9 = r13.f315746g
            boolean r10 = r9.f315828aL
            if (r10 == 0) goto L_0x0075
            if (r6 == r8) goto L_0x0071
            r10 = 1
            goto L_0x0072
        L_0x0071:
            r10 = 0
        L_0x0072:
            r9.mo101025ck(r10)
        L_0x0075:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r9 = r13.f315746g
            boolean r10 = r9.f315832aP
            if (r10 != 0) goto L_0x00a4
            android.view.View r9 = r9.f315810T
            if (r9 == 0) goto L_0x0082
            r9.setSelected(r5)
        L_0x0082:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r9 = r13.f315746g
            android.view.View r9 = r9.f315809S
            if (r0 != r3) goto L_0x008a
            r10 = 0
            goto L_0x008c
        L_0x008a:
            r10 = 8
        L_0x008c:
            r9.setVisibility(r10)
            com.google.android.apps.gsa.search.core.i.t r9 = r13.f315740a
            boolean r9 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f.m188692c(r9)
            if (r9 != 0) goto L_0x00a4
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r9 = r13.f315746g
            android.view.View r9 = r9.f315808R
            if (r0 != r3) goto L_0x00a0
            r0 = 8
            goto L_0x00a1
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            r9.setVisibility(r0)
        L_0x00a4:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r13.f315746g
            com.google.android.apps.gsa.staticplugins.opa.fg r9 = r0.f315911bu
            if (r9 != 0) goto L_0x00ab
            return
        L_0x00ab:
            r9 = 2
            if (r5 == 0) goto L_0x0102
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r3 = r0.f315820aD
            if (r3 != 0) goto L_0x00c1
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg.f315790j
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r3 = "Zero State controller does not exist."
            r7 = 28582(0x6fa6, float:4.0052E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56386p(r3)
            goto L_0x0190
        L_0x00c1:
            int r10 = r0.f315909bs
            if (r10 == r8) goto L_0x00ca
            if (r10 != r9) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            r10 = 0
            goto L_0x00cb
        L_0x00ca:
            r10 = 1
        L_0x00cb:
            r3.mo101427q(r10)
            boolean r3 = r0.f315832aP
            if (r3 != 0) goto L_0x00dc
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f315982r
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247289eO
            boolean r3 = r3.mo79746e(r10)
            if (r3 == 0) goto L_0x00e1
        L_0x00dc:
            android.view.ViewGroup r3 = r0.f315988x
            r3.setVisibility(r7)
        L_0x00e1:
            android.view.View r3 = r0.f315811U
            if (r3 == 0) goto L_0x00e8
            r3.setVisibility(r7)
        L_0x00e8:
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f315982r
            boolean r3 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f.m188690a(r3)
            if (r3 == 0) goto L_0x00f5
            android.view.View r3 = r0.f315812V
            r3.setVisibility(r2)
        L_0x00f5:
            boolean r3 = r0.f315843aa
            if (r3 == 0) goto L_0x0190
            com.google.android.apps.gsa.staticplugins.opa.fg r0 = r0.f315911bu
            if (r0 == 0) goto L_0x0190
            r0.mo97411d()
            goto L_0x0190
        L_0x0102:
            boolean r10 = r0.f315843aa
            if (r10 == 0) goto L_0x0190
            int r10 = r0.f315909bs
            if (r10 != r3) goto L_0x0190
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f315982r
            boolean r3 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f.m188690a(r3)
            if (r3 == 0) goto L_0x0119
            android.view.View r3 = r0.f315812V
            if (r3 == 0) goto L_0x0119
            r3.setVisibility(r7)
        L_0x0119:
            com.google.android.apps.gsa.staticplugins.opa.fg r3 = r0.f315911bu
            r3.getClass()
            com.google.android.apps.gsa.staticplugins.opa.fj r7 = r3.f303205a
            com.google.android.apps.gsa.staticplugins.opa.ay.as r10 = r7.f303238X
            android.os.Bundle r7 = r7.f303442g
            boolean r7 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142258aF(r7)
            r7 = r7 ^ r1
            r10.mo96153ae(r7)
            com.google.android.apps.gsa.staticplugins.opa.fj r7 = r3.f303205a
            com.google.android.apps.gsa.staticplugins.opa.ay.as r10 = r7.f303238X
            android.os.Bundle r7 = r7.f303442g
            boolean r7 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142258aF(r7)
            r7 = r7 ^ r1
            r10.mo96150ab(r7)
            com.google.android.apps.gsa.staticplugins.opa.fj r7 = r3.f303205a
            com.google.android.apps.gsa.staticplugins.opa.ay.as r7 = r7.f303238X
            r7.mo96116O(r2)
            com.google.android.apps.gsa.staticplugins.opa.fj r7 = r3.f303205a
            r7.f303390cv = r8
            com.google.android.apps.gsa.staticplugins.opa.x.l r10 = r7.f303314bU
            r10.f317599g = r1
            r7.mo97472ah()
            com.google.android.apps.gsa.staticplugins.opa.fj r7 = r3.f303205a
            dagger.a r7 = r7.f303316bW
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.g r7 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114737g) r7
            r7.mo101563b()
            com.google.android.apps.gsa.staticplugins.opa.fj r7 = r3.f303205a
            dagger.a r7 = r7.f303258aR
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bn r7 = (com.google.android.apps.gsa.staticplugins.opa.util.C113798bn) r7
            com.google.android.libraries.b.d.a r10 = new com.google.android.libraries.b.d.a
            r11 = 5
            r10.<init>(r11)
            com.google.android.libraries.b.f.f r11 = new com.google.android.libraries.b.f.f
            com.google.android.apps.gsa.staticplugins.opa.fj r12 = r3.f303205a
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r12 = r12.f303450o
            android.view.ViewGroup r12 = r12.mo95419h()
            int r12 = r12.getWidth()
            com.google.android.apps.gsa.staticplugins.opa.fj r3 = r3.f303205a
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r3 = r3.f303450o
            android.view.ViewGroup r3 = r3.mo95419h()
            int r3 = r3.getHeight()
            r11.<init>(r12, r3)
            r7.mo24921c(r10, r11)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r0 = r0.f315820aD
            if (r0 == 0) goto L_0x0190
            r0.mo101428r()
        L_0x0190:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r13.f315746g
            if (r6 == r8) goto L_0x01a5
            if (r4 != 0) goto L_0x01a5
            boolean r3 = r0.f315831aO
            r0.f315831aO = r2
            if (r3 != 0) goto L_0x01a5
            com.google.android.apps.gsa.staticplugins.opa.searchbox.a r3 = r13.f315742c
            boolean r3 = r3.mo96176c()
            if (r3 != 0) goto L_0x01a5
            goto L_0x01a6
        L_0x01a5:
            r1 = 0
        L_0x01a6:
            r0.f315830aN = r1
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r13.f315746g
            com.google.android.apps.gsa.staticplugins.opa.fg r1 = r0.f315911bu
            boolean r0 = r0.f315830aN
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.opa.C109040fj.f303210a
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.opa.fj r3 = r1.f303205a
            boolean r3 = r3.mo97527bu()
            if (r3 != 0) goto L_0x01c1
            com.google.android.apps.gsa.staticplugins.opa.fj r3 = r1.f303205a
            r4 = 9
            r3.mo97498bH(r2, r2, r2, r4)
        L_0x01c1:
            if (r0 == 0) goto L_0x01d3
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r1.f303205a
            com.google.android.apps.gsa.staticplugins.opa.v.t r0 = r0.f303320ba
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_VISUAL_STAGE_CHANGE
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            r0.mo100764h(r3, r4, r4, r4)
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r1.f303205a
            r0.mo97544q()
        L_0x01d3:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r1.f303205a
            com.google.android.apps.gsa.staticplugins.opa.chatui.iq r0 = r0.f303225K
            android.view.View r0 = r0.mo95253e()
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x01ee
            if (r5 == 0) goto L_0x01ee
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r1.f303205a
            com.google.android.apps.gsa.staticplugins.opa.chatui.iq r0 = r0.f303225K
            android.view.View r0 = r0.mo95252d()
            r0.callOnClick()
        L_0x01ee:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r13.f315746g
            com.google.android.apps.gsa.staticplugins.opa.valyrian.aa r0 = r0.f315853ak
            if (r6 != r8) goto L_0x01fe
            boolean r1 = r0.mo100800x()
            if (r1 == 0) goto L_0x01fe
            r0.mo100796t(r2)
            goto L_0x0201
        L_0x01fe:
            r0.mo100786j(r2)
        L_0x0201:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r13.f315746g
            r0.mo101034dE(r6)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r13.f315746g
            r0.mo101028co()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r0 = r13.f315746g
            int r1 = r0.f315909bs
            r0.mo101033dD(r14, r1)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.eg r14 = r13.f315746g
            int r0 = r14.f315909bs
            if (r0 == r9) goto L_0x021a
            r14.f315910bt = r0
        L_0x021a:
            r14.f315909bs = r6
            r14.f315823aG = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.C114052dr.mo9184e(int):void");
    }
}
