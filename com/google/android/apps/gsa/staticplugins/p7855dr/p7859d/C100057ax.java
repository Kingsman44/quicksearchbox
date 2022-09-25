package com.google.android.apps.gsa.staticplugins.p7855dr.p7859d;

import android.view.View;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.monet.p7114f.C90323a;
import com.google.android.apps.gsa.shared.p7148ui.C90700l;
import com.google.android.apps.gsa.shared.p7148ui.CoScrollContainer;
import com.google.android.apps.gsa.shared.p7148ui.p7153e.C90673a;
import com.google.android.apps.gsa.shared.p7148ui.p7153e.C90674b;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7858c.C100028a;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.d.ax */
/* compiled from: PG */
final class C100057ax {

    /* renamed from: a */
    public final C90323a f279830a;

    /* renamed from: b */
    public final C100055av f279831b;

    /* renamed from: c */
    public final CoScrollContainer f279832c;

    /* renamed from: d */
    public final C90673a f279833d;

    /* renamed from: e */
    public final C22945j f279834e;

    /* renamed from: f */
    public final C100056aw f279835f;

    /* renamed from: g */
    public int f279836g;

    /* renamed from: h */
    public int f279837h;

    /* renamed from: i */
    public int f279838i;

    /* renamed from: j */
    public boolean f279839j;

    /* renamed from: k */
    public View f279840k;

    /* renamed from: l */
    public boolean f279841l;

    /* renamed from: m */
    public C100071n f279842m;

    /* renamed from: n */
    private final C100061d f279843n;

    public C100057ax(C90674b bVar, C90323a aVar, C21370a aVar2, C22945j jVar, C100028a aVar3, CoScrollContainer coScrollContainer) {
        this.f279830a = aVar;
        this.f279834e = jVar;
        this.f279832c = coScrollContainer;
        this.f279843n = new C100061d(aVar2, aVar3);
        C100055av avVar = new C100055av(this);
        this.f279831b = avVar;
        C100056aw awVar = new C100056aw(this);
        this.f279835f = awVar;
        C89911f fVar = (C89911f) bVar.f253570a.mo17428b();
        fVar.getClass();
        C87680ah ahVar = (C87680ah) bVar.f253571b.mo17428b();
        ahVar.getClass();
        this.f279833d = new C90673a(coScrollContainer, fVar, ahVar);
        jVar.mo28312m(awVar);
        aVar.mo84004a(avVar);
    }

    /* renamed from: a */
    public final void mo91732a() {
        if (this.f279840k != null) {
            this.f279832c.mo84825s(this.f279843n);
            this.f279833d.mo84969b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        r0 = r0.f279886a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91733b() {
        /*
            r6 = this;
            android.view.View r0 = r6.f279840k
            if (r0 == 0) goto L_0x00a4
            boolean r1 = r6.f279841l
            if (r1 != 0) goto L_0x000a
            goto L_0x00a4
        L_0x000a:
            com.google.android.apps.gsa.shared.ui.e.a r1 = r6.f279833d
            android.view.View r2 = r1.f253566d
            if (r2 != r0) goto L_0x0018
            android.view.ViewParent r2 = r2.getParent()
            com.google.android.apps.gsa.shared.ui.CoScrollContainer r3 = r1.f253564b
            if (r2 == r3) goto L_0x0096
        L_0x0018:
            android.view.View r2 = r1.f253566d
            if (r2 == 0) goto L_0x0030
            if (r2 == r0) goto L_0x0030
            com.google.android.apps.gsa.shared.logger.f r2 = r1.f253565c
            r3 = 37999234(0x243d282, float:1.438675E-37)
            r4 = 29
            r5 = 0
            com.google.android.apps.gsa.shared.logger.e r2 = r2.mo83755a(r5, r3, r4)
            r2.mo83721a()
            r1.mo84969b()
        L_0x0030:
            r1.f253566d = r0
            android.view.ViewParent r2 = r0.getParent()
            if (r2 == 0) goto L_0x0060
            android.view.ViewParent r2 = r0.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            com.google.android.apps.gsa.shared.ui.CoScrollContainer r3 = r1.f253564b
            if (r2 != r3) goto L_0x0050
            com.google.common.f.e r0 = com.google.android.apps.gsa.shared.p7148ui.p7153e.C90673a.f253563a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "WebView already attached."
            r2 = 11286(0x2c16, float:1.5815E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x0096
        L_0x0050:
            com.google.common.f.e r3 = com.google.android.apps.gsa.shared.p7148ui.p7153e.C90673a.f253563a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r4 = "Force-detached WebView from previous parent: %s"
            r5 = 11285(0x2c15, float:1.5814E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56389s(r4, r2)
            r2.removeView(r0)
        L_0x0060:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            if (r2 != 0) goto L_0x0071
            com.google.android.apps.gsa.shared.ui.CoScrollContainer r2 = r1.f253564b
            com.google.android.apps.gsa.shared.ui.l r3 = new com.google.android.apps.gsa.shared.ui.l
            r4 = 5
            r3.<init>((com.google.android.apps.gsa.shared.p7148ui.CoScrollContainer) r2, (int) r4)
            r0.setLayoutParams(r3)
        L_0x0071:
            com.google.android.apps.gsa.shared.ui.CoScrollContainer r1 = r1.f253564b
            r2 = 0
            r1.addView(r0, r2)
            com.google.android.apps.gsa.shared.ui.CoScrollContainer r0 = r6.f279832c
            com.google.android.apps.gsa.staticplugins.dr.d.d r1 = r6.f279843n
            r0.mo84822r(r1)
            com.google.android.apps.gsa.staticplugins.dr.d.n r0 = r6.f279842m
            if (r0 == 0) goto L_0x0096
            com.google.android.apps.gsa.staticplugins.dr.d.t r0 = r0.f279886a
            com.google.android.apps.gsa.staticplugins.dr.d.ax r1 = r0.f279898d
            if (r1 == 0) goto L_0x0096
            int r2 = r0.f279902h
            int r3 = r0.f279903i
            int r2 = r2 + r3
            com.google.android.apps.gsa.shared.ui.e.a r1 = r1.f279833d
            int r1 = r1.mo84968a()
            r0.mo91736e(r2, r1)
        L_0x0096:
            com.google.android.apps.gsa.shared.ui.e.a r0 = r6.f279833d
            boolean r0 = r0.f253567e
            if (r0 != 0) goto L_0x009f
            r6.mo91734c()
        L_0x009f:
            com.google.android.apps.gsa.shared.ui.CoScrollContainer r0 = r6.f279832c
            r1 = 1
            r0.f253342e = r1
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7855dr.p7859d.C100057ax.mo91733b():void");
    }

    /* renamed from: c */
    public final void mo91734c() {
        if (this.f279840k != null && this.f279841l) {
            if (this.f279839j) {
                C90673a aVar = this.f279833d;
                View view = aVar.f253566d;
                if (view != null && !aVar.f253567e) {
                    aVar.f253567e = true;
                    ((C90700l) view.getLayoutParams()).mo85031b(1);
                    view.setFocusable(true);
                    view.setFocusableInTouchMode(true);
                    view.setVisibility(0);
                    aVar.mo84971d(true);
                }
            } else {
                this.f279833d.mo84970c();
            }
            mo91735d();
            this.f279832c.setScrollY(this.f279838i);
        }
    }

    /* renamed from: d */
    public final void mo91735d() {
        C90673a aVar = this.f279833d;
        int i = this.f279836g;
        int i2 = this.f279837h;
        View view = aVar.f253566d;
        if (view != null && aVar.f253567e) {
            C90700l lVar = (C90700l) view.getLayoutParams();
            lVar.f253716e = i;
            lVar.f253717f = i2;
            CoScrollContainer coScrollContainer = lVar.f253712a;
            if (coScrollContainer != null) {
                coScrollContainer.mo84806m(lVar);
                lVar.f253712a.mo84819p(lVar, 0);
            }
        }
    }
}
