package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.sidekick.shared.cards.C91691f;
import com.google.android.apps.gsa.sidekick.shared.cards.C91692g;
import com.google.android.apps.gsa.sidekick.shared.secondscreen.SecondScreenLaunchHelper;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9195cd;
import com.google.android.apps.p489g.p494d.C9215cx;
import com.google.android.apps.p489g.p494d.C9224df;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.am */
/* compiled from: PG */
public abstract class C104311am extends C91691f {

    /* renamed from: c */
    private static final C59071e f290166c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.base.am");

    /* renamed from: d */
    private final C104348l f290167d;

    /* renamed from: e */
    private final C89859i f290168e;

    /* renamed from: f */
    private final C58833ax f290169f;

    /* renamed from: g */
    private final boolean f290170g;

    /* renamed from: h */
    private final C58833ax f290171h;

    protected C104311am(Context context, C91692g gVar, C104348l lVar) {
        super(context, gVar);
        this.f290167d = lVar;
        this.f290168e = gVar.mo86162b();
        this.f290170g = gVar.mo86184u();
        this.f290169f = gVar.mo86179q();
        this.f290171h = gVar.mo86180r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo86195b(C9141ad adVar) {
        this.f290168e.mo83702b(C89849ae.NOW_CARD_CLICK_AMP);
        super.mo86195b(adVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo86196c(C9141ad adVar) {
        mo94070u(adVar);
        super.mo86196c(adVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo94057h(C9141ad adVar);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo94058i(C9141ad adVar);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo94059j(C9141ad adVar);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo94060k(C9141ad adVar);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo94061l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo94062m(C9141ad adVar);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo94063n(C9141ad adVar);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract void mo94064o(C9141ad adVar);

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo94065p(C9141ad adVar);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo94066q(C9141ad adVar, int i, boolean z, String str) {
        C9224df dfVar = adVar.f31545k;
        if (dfVar == null) {
            dfVar = C9224df.f31879l;
        }
        SecondScreenLaunchHelper.Options a = SecondScreenLaunchHelper.m150796a(this.f255779b.mo86185v(), dfVar);
        a.f256329p = true;
        a.f256324k = this.f290170g;
        a.f256320g = str;
        if (i != 0) {
            a.f256323j = i;
        }
        a.f256325l = z;
        if (this.f255779b.mo86185v()) {
            a.f256327n = false;
        }
        SecondScreenLaunchHelper.m150797b(this.f255778a, this.f255779b.mo86171i(), a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo94067r(C9141ad adVar);

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo94068s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract void mo94069t(C9141ad adVar);

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo94070u(C9141ad adVar) {
        if (this.f290169f.mo56113h() && ((C87680ah) this.f290169f.mo56107c()).f237031a.mo81951w() && (adVar.f31535a & 16) != 0) {
            C9195cd cdVar = adVar.f31541g;
            if (cdVar == null) {
                cdVar = C9195cd.f31746j;
            }
            if ((cdVar.f31748a & 2) != 0) {
                C9195cd cdVar2 = adVar.f31541g;
                if (cdVar2 == null) {
                    cdVar2 = C9195cd.f31746j;
                }
                if (C89429a.m145458p(Uri.parse(cdVar2.f31750c))) {
                    this.f290168e.mo83702b(C89849ae.NOW_CARD_CLICK_CCT);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo94071v(C9215cx cxVar);

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo94072w();

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a8, code lost:
        if (r0.mo86426f(r4, r2, r5) == false) goto L_0x00aa;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo86200g(com.google.android.apps.p489g.p494d.C9141ad r7) {
        /*
            r6 = this;
            int r0 = r7.f31535a
            r1 = 1
            r0 = r0 & r1
            java.lang.String r2 = "BaseMPClientActionHndlr"
            if (r0 == 0) goto L_0x00d4
            com.google.android.apps.g.d.ac r0 = com.google.android.apps.p489g.p494d.C9140ac.OPEN_URL
            int r0 = r7.f31537c
            com.google.android.apps.g.d.ac r0 = com.google.android.apps.p489g.p494d.C9140ac.m23674a(r0)
            if (r0 != 0) goto L_0x0014
            com.google.android.apps.g.d.ac r0 = com.google.android.apps.p489g.p494d.C9140ac.OPEN_URL
        L_0x0014:
            int r0 = r0.ordinal()
            r3 = 2
            if (r0 == r3) goto L_0x00d0
            r3 = 3
            if (r0 == r3) goto L_0x00cc
            r3 = 4
            if (r0 == r3) goto L_0x00c8
            r3 = 44
            if (r0 == r3) goto L_0x00c4
            r3 = 63
            if (r0 == r3) goto L_0x00c0
            r3 = 47
            if (r0 == r3) goto L_0x00bc
            r3 = 48
            if (r0 == r3) goto L_0x00c4
            switch(r0) {
                case 51: goto L_0x00b8;
                case 52: goto L_0x00b4;
                case 53: goto L_0x0062;
                case 54: goto L_0x005e;
                default: goto L_0x0034;
            }
        L_0x0034:
            switch(r0) {
                case 57: goto L_0x005a;
                case 58: goto L_0x0056;
                case 59: goto L_0x0052;
                case 60: goto L_0x004e;
                default: goto L_0x0037;
            }
        L_0x0037:
            com.google.common.f.e r0 = f290166c
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Delegating to the topmost CAH."
            r2 = 21942(0x55b6, float:3.0747E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            boolean r7 = super.mo86200g(r7)
            return r7
        L_0x004e:
            r6.mo94063n(r7)
            return r1
        L_0x0052:
            r6.mo94057h(r7)
            return r1
        L_0x0056:
            r6.mo94061l()
            return r1
        L_0x005a:
            r6.mo94058i(r7)
            return r1
        L_0x005e:
            r6.mo94072w()
            return r1
        L_0x0062:
            com.google.android.apps.g.d.cx r0 = r7.f31555u
            if (r0 != 0) goto L_0x0068
            com.google.android.apps.g.d.cx r0 = com.google.android.apps.p489g.p494d.C9215cx.f31837o
        L_0x0068:
            int r0 = r0.f31839a
            r0 = r0 & 64
            if (r0 == 0) goto L_0x00b3
            com.google.android.apps.gsa.staticplugins.nowcards.base.l r0 = r6.f290167d
            com.google.android.apps.g.d.v r0 = r0.f290310e
            int r2 = r0.f32192a
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0082
            com.google.ai.b.hj r0 = r0.f32174H
            if (r0 != 0) goto L_0x007f
            com.google.ai.b.hj r0 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x007f:
            long r2 = r0.f26969j
            goto L_0x0084
        L_0x0082:
            r2 = 0
        L_0x0084:
            com.google.common.base.ax r0 = r6.f290171h
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x00aa
            com.google.common.base.ax r0 = r6.f290171h
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.sidekick.shared.o.i r0 = (com.google.android.apps.gsa.sidekick.shared.p7254o.C91885i) r0
            com.google.android.apps.g.d.cx r4 = r7.f31555u
            if (r4 != 0) goto L_0x009a
            com.google.android.apps.g.d.cx r4 = com.google.android.apps.p489g.p494d.C9215cx.f31837o
        L_0x009a:
            com.google.android.apps.gsa.staticplugins.nowcards.base.l r5 = r6.f290167d
            com.google.android.apps.g.d.v r5 = r5.f290310e
            com.google.ai.b.hj r5 = r5.f32174H
            if (r5 != 0) goto L_0x00a4
            com.google.ai.b.hj r5 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x00a4:
            boolean r0 = r0.mo86426f(r4, r2, r5)
            if (r0 != 0) goto L_0x00b3
        L_0x00aa:
            com.google.android.apps.g.d.cx r7 = r7.f31555u
            if (r7 != 0) goto L_0x00b0
            com.google.android.apps.g.d.cx r7 = com.google.android.apps.p489g.p494d.C9215cx.f31837o
        L_0x00b0:
            r6.mo94071v(r7)
        L_0x00b3:
            return r1
        L_0x00b4:
            r6.mo94068s()
            return r1
        L_0x00b8:
            r6.mo94062m(r7)
            return r1
        L_0x00bc:
            r6.mo94069t(r7)
            return r1
        L_0x00c0:
            r6.mo94067r(r7)
            return r1
        L_0x00c4:
            r6.mo94064o(r7)
            return r1
        L_0x00c8:
            r6.mo94065p(r7)
            return r1
        L_0x00cc:
            r6.mo94059j(r7)
            return r1
        L_0x00d0:
            r6.mo94060k(r7)
            return r1
        L_0x00d4:
            com.google.common.f.e r7 = f290166c
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r0, r2)
            java.lang.String r0 = "Client action without a type was specified."
            r1 = 21943(0x55b7, float:3.0749E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.base.C104311am.mo86200g(com.google.android.apps.g.d.ad):boolean");
    }
}
