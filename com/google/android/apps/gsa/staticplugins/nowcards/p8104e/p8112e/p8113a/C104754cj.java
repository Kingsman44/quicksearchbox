package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.now.shared.p6421ui.C83412a;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91669h;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91774j;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91866h;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104337bl;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104461x;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104477m;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8114b.C104845f;
import com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104904ab;
import com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104978x;
import com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104979y;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62921ba;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.cj */
/* compiled from: PG */
public final class C104754cj extends C104823j {

    /* renamed from: c */
    C83412a f291757c;

    /* renamed from: d */
    private final C104477m f291758d;

    /* renamed from: e */
    private final Context f291759e;

    /* renamed from: f */
    private final C104461x f291760f;

    /* renamed from: g */
    private final C104978x f291761g;

    /* renamed from: h */
    private final C104904ab f291762h;

    /* renamed from: i */
    private final C89291a f291763i;

    /* renamed from: j */
    private final boolean f291764j;

    /* renamed from: k */
    private final CardRenderingContext f291765k;

    /* renamed from: l */
    private final C58833ax f291766l;

    /* renamed from: m */
    private final boolean f291767m = true;

    /* renamed from: n */
    private C90315c f291768n;

    /* renamed from: o */
    private ViewGroup f291769o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104754cj(C22945j jVar, C104477m mVar, Context context, C104461x xVar, C68214a aVar, C68214a aVar2, C89291a aVar3, C58833ax axVar, C58833ax axVar2, C91866h hVar, CardRenderingContext cardRenderingContext, boolean z, C104337bl blVar, C58833ax axVar3, C104845f fVar, boolean z2) {
        super(jVar, mVar, xVar, axVar, axVar2, hVar, C91774j.m150380a(jVar), z, blVar, fVar, z2);
        Context context2 = context;
        this.f291758d = mVar;
        this.f291759e = context2;
        this.f291763i = aVar3;
        this.f291760f = xVar;
        this.f291764j = z;
        this.f291765k = cardRenderingContext;
        C104978x a = ((C104979y) aVar.mo27525b()).mo94429a(context2, (C91669h) aVar2.mo27525b());
        this.f291761g = a;
        Objects.requireNonNull(jVar);
        C22945j jVar2 = jVar;
        this.f291762h = a.mo94427M(new C104749ce(jVar));
        this.f291766l = axVar3;
    }

    /* renamed from: im */
    public final void mo28298im() {
        super.mo28298im();
        if (this.f291766l.mo56113h() && this.f291767m) {
            C90315c cVar = this.f291768n;
            cVar.getClass();
            ((C90314b) this.f291766l.mo56107c()).mo83995b(cVar);
            this.f291768n = null;
        }
        this.f291761g.f290316k = null;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        mo94362v();
        C104978x xVar = this.f291761g;
        C104461x xVar2 = this.f291760f;
        xVar.f290319n = xVar2;
        xVar.f290320o = xVar2;
        xVar.f290322q = xVar2;
        xVar.f290324s = xVar2;
        xVar.f290323r = xVar2;
        xVar.f290325t = xVar2;
        C83412a aVar = new C83412a(this.f291759e);
        this.f291757c = aVar;
        aVar.mo76745d(this.f291764j);
        ViewGroup a = this.f291762h.mo94389a();
        this.f291769o = a;
        this.f291757c.mo76744c(a);
        this.f291757c.mo76747e(this.f291765k.mo49316k());
        mo28295iC(this.f291757c);
        ((C104793dv) this.f291758d).f291972a.mo28726b(new C104745ca(this));
        ((C104793dv) this.f291758d).f291980i.mo28726b(new C104746cb(this));
        ((C104793dv) this.f291758d).f291976e.mo28726b(new C104747cc(this));
        ((C104793dv) this.f291758d).f291973b.mo28726b(new C104748cd(this));
        super.mo28299iw();
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01aa  */
    /* renamed from: ix */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28300ix() {
        /*
            r12 = this;
            com.google.common.base.ax r0 = r12.f291766l
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0023
            boolean r0 = r12.f291767m
            if (r0 == 0) goto L_0x0023
            com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.cf r0 = new com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.cf
            r0.<init>(r12)
            r12.f291768n = r0
            com.google.common.base.ax r0 = r12.f291766l
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.shared.monet.d.b r0 = (com.google.android.apps.gsa.shared.monet.p7112d.C90314b) r0
            com.google.android.apps.gsa.shared.monet.d.c r1 = r12.f291768n
            r1.getClass()
            r0.mo83994a(r1)
        L_0x0023:
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r0 = r12.f291761g
            com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.cg r1 = new com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.cg
            r1.<init>(r12)
            r0.f290316k = r1
            com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.ch r1 = new com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.ch
            r1.<init>(r12)
            r0.f290317l = r1
            com.google.android.apps.gsa.staticplugins.nowcards.e.b.m r0 = r12.f291758d
            com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.dv r0 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a.C104793dv) r0
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r0 = r0.f291974c
            java.lang.Object r0 = r0.f63720e
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r0 = (com.google.android.libraries.gsa.monet.shared.ProtoParcelable) r0
            com.google.android.apps.g.d.v r1 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
            com.google.protobuf.eb r1 = r1.getParserForType()
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()
            r3 = 1
            com.google.protobuf.bv r0 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43557b(r0, r1, r2, r3)
            com.google.android.apps.g.d.v r0 = (com.google.android.apps.p489g.p494d.C9278v) r0
            r0.getClass()
            com.google.android.apps.gsa.staticplugins.nowcards.e.b.m r1 = r12.f291758d
            com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.dv r1 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a.C104793dv) r1
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r1 = r1.f291978g
            java.lang.Object r1 = r1.f63720e
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r1 = (com.google.android.libraries.gsa.monet.shared.ProtoParcelable) r1
            com.google.ai.b.st r2 = com.google.p375ai.p378b.C8025st.f28178h
            com.google.protobuf.eb r2 = r2.getParserForType()
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()
            com.google.protobuf.bv r1 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43557b(r1, r2, r4, r3)
            com.google.ai.b.st r1 = (com.google.p375ai.p378b.C8025st) r1
            r1.getClass()
            com.google.android.apps.gsa.staticplugins.nowcards.e.b.m r2 = r12.f291758d
            com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.dv r2 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a.C104793dv) r2
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r2 = r2.f291977f
            java.lang.Object r2 = r2.f63720e
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r2 = (com.google.android.libraries.gsa.monet.shared.ProtoParcelable) r2
            com.google.ai.b.tb r4 = com.google.p375ai.p378b.C8034tb.f28222f
            com.google.protobuf.eb r4 = r4.getParserForType()
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()
            com.google.protobuf.bv r2 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43557b(r2, r4, r5, r3)
            r7 = r2
            com.google.ai.b.tb r7 = (com.google.p375ai.p378b.C8034tb) r7
            r7.getClass()
            com.google.android.apps.gsa.staticplugins.nowcards.e.b.m r2 = r12.f291758d
            com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.dv r2 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a.C104793dv) r2
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r2 = r2.f291975d
            java.lang.Object r2 = r2.f63720e
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = com.google.p375ai.p378b.C7693gl.m22807a(r2)
            r10 = 0
            r11 = 4
            if (r2 != r11) goto L_0x00ba
            com.google.android.apps.gsa.now.shared.ui.a r4 = r12.f291757c
            r4.mo76748f(r10)
            goto L_0x00cd
        L_0x00ba:
            com.google.android.apps.gsa.now.shared.ui.a r4 = r12.f291757c
            com.google.android.apps.gsa.staticplugins.nowcards.e.b.m r5 = r12.f291758d
            com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.dv r5 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a.C104793dv) r5
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r5 = r5.f291979h
            java.lang.Object r5 = r5.f63720e
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r4.mo76748f(r5)
        L_0x00cd:
            com.google.android.apps.gsa.now.shared.ui.a r4 = r12.f291757c
            r4.mo76751i(r2)
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r4 = r12.f291761g
            r4.mo94126s(r0)
            com.google.android.apps.gsa.staticplugins.nowcards.g.ab r4 = r12.f291762h
            int r5 = r0.f32192a
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            r5 = r5 & r6
            if (r5 == 0) goto L_0x00e7
            com.google.android.apps.g.d.ad r5 = r0.f32169C
            if (r5 != 0) goto L_0x00e8
            com.google.android.apps.g.d.ad r5 = com.google.android.apps.p489g.p494d.C9141ad.f31521K
            goto L_0x00e8
        L_0x00e7:
            r5 = 0
        L_0x00e8:
            r6 = r5
            int r8 = r0.f32167A
            boolean r9 = r12.f291764j
            r5 = r1
            r4.mo94390b(r5, r6, r7, r8, r9)
            com.google.ai.b.qz r0 = r1.f28186g
            if (r0 != 0) goto L_0x00f7
            com.google.ai.b.qz r0 = com.google.p375ai.p378b.C7977qz.f28030b
        L_0x00f7:
            com.google.ai.b.rb r0 = r0.f28032a
            if (r0 != 0) goto L_0x00fd
            com.google.ai.b.rb r0 = com.google.p375ai.p378b.C7980rb.f28035c
        L_0x00fd:
            int r0 = r0.f28037a
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0132
            com.google.ai.b.qz r0 = r1.f28186g
            if (r0 != 0) goto L_0x0108
            com.google.ai.b.qz r0 = com.google.p375ai.p378b.C7977qz.f28030b
        L_0x0108:
            com.google.ai.b.rb r0 = r0.f28032a
            if (r0 != 0) goto L_0x010e
            com.google.ai.b.rb r0 = com.google.p375ai.p378b.C7980rb.f28035c
        L_0x010e:
            int r0 = r0.f28038b
            int r0 = com.google.p375ai.p378b.C8029sx.m22925a(r0)
            if (r0 != 0) goto L_0x0117
            r0 = 1
        L_0x0117:
            int r0 = r0 + -1
            if (r0 == r3) goto L_0x011c
            goto L_0x0132
        L_0x011c:
            com.google.android.apps.gsa.now.shared.ui.a r0 = r12.f291757c
            r0.setImportantForAccessibility(r3)
            com.google.android.apps.gsa.now.shared.ui.a r0 = r12.f291757c
            r0.setFocusable(r3)
            com.google.android.apps.gsa.now.shared.ui.a r0 = r12.f291757c
            com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.ci r4 = new com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.ci
            r4.<init>()
            r0.setAccessibilityDelegate(r4)
            r0 = 1
            goto L_0x0133
        L_0x0132:
            r0 = 0
        L_0x0133:
            int r4 = r1.f28180a
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0165
            android.view.ViewGroup r4 = r12.f291769o
            com.google.android.apps.gsa.shared.au.b.a r5 = r12.f291763i
            android.content.Context r6 = r12.f291759e
            com.google.ai.b.xj r7 = r1.f28184e
            if (r7 != 0) goto L_0x0144
            com.google.ai.b.xj r7 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x0144:
            java.lang.String r5 = r5.mo83231a(r6, r7)
            r4.setContentDescription(r5)
            android.view.ViewGroup r4 = r12.f291769o
            r4.setImportantForAccessibility(r3)
            r4 = 0
        L_0x0151:
            android.view.ViewGroup r5 = r12.f291769o
            int r5 = r5.getChildCount()
            if (r4 >= r5) goto L_0x0165
            android.view.ViewGroup r5 = r12.f291769o
            android.view.View r5 = r5.getChildAt(r4)
            r5.setImportantForAccessibility(r11)
            int r4 = r4 + 1
            goto L_0x0151
        L_0x0165:
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r4 = r12.f291765k
            boolean r4 = r4.mo49315j()
            if (r4 == 0) goto L_0x0193
            r4 = 2
            if (r2 == r4) goto L_0x0173
            r4 = 6
            if (r2 != r4) goto L_0x0193
        L_0x0173:
            int r2 = r1.f28180a
            r2 = r2 & r11
            if (r2 == 0) goto L_0x0193
            if (r0 != 0) goto L_0x0193
            com.google.android.apps.gsa.now.shared.ui.a r0 = r12.f291757c
            com.google.android.apps.gsa.staticplugins.nowcards.base.aw r2 = new com.google.android.apps.gsa.staticplugins.nowcards.base.aw
            r2.<init>(r3)
            r0.setAccessibilityDelegate(r2)
            android.view.ViewGroup r0 = r12.f291769o
            r0.setImportantForAccessibility(r3)
            android.view.ViewGroup r0 = r12.f291769o
            com.google.android.apps.gsa.staticplugins.nowcards.base.ax r2 = new com.google.android.apps.gsa.staticplugins.nowcards.base.ax
            r2.<init>(r10)
            r0.setAccessibilityDelegate(r2)
        L_0x0193:
            r12.mo94331w()
            r12.mo94332x()
            com.google.android.apps.gsa.staticplugins.nowcards.e.b.m r0 = r12.f291758d
            com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.dv r0 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a.C104793dv) r0
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r0 = r0.f291976e
            java.lang.Object r0 = r0.f63720e
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0
            r12.mo94333y(r0, r3)
            boolean r0 = r1.f28185f
            if (r0 != 0) goto L_0x01af
            android.view.ViewGroup r0 = r12.f291769o
            r0.setImportantForAccessibility(r11)
        L_0x01af:
            super.mo28300ix()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a.C104754cj.mo28300ix():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final View mo94300k() {
        return this.f291757c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final C104348l mo94301m() {
        return this.f291761g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final C9278v mo94302p() {
        C9278v vVar = (C9278v) C23245b.m43557b((ProtoParcelable) ((C58833ax) ((C104793dv) this.f291758d).f291974c.f63720e).mo56107c(), C9278v.f32165Z.getParserForType(), C62921ba.m95368a(), true);
        vVar.getClass();
        return vVar;
    }

    /* renamed from: s */
    public final void mo94303s() {
        C83412a aVar = this.f291757c;
        aVar.getClass();
        aVar.setImportantForAccessibility(0);
        this.f291757c.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        ViewGroup viewGroup = this.f291769o;
        viewGroup.getClass();
        viewGroup.setImportantForAccessibility(0);
        this.f291769o.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        for (int i = 0; i < this.f291769o.getChildCount(); i++) {
            this.f291769o.getChildAt(i).setImportantForAccessibility(0);
        }
        this.f291769o.setContentDescription((CharSequence) null);
        this.f291757c.mo76743b(-1);
        this.f291757c.mo76749g(-1);
        this.f291757c.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        this.f291762h.mo94391c();
    }

    /* renamed from: w */
    public final void mo94331w() {
        C58833ax axVar = (C58833ax) ((C104793dv) this.f291758d).f291972a.f63720e;
        if (axVar.mo56113h() && ((Integer) axVar.mo56107c()).intValue() >= 0) {
            this.f291757c.mo76743b((int) TypedValue.applyDimension(1, (float) ((Integer) axVar.mo56107c()).intValue(), this.f291759e.getResources().getDisplayMetrics()));
        }
    }

    /* renamed from: x */
    public final void mo94332x() {
        C58833ax axVar = (C58833ax) ((C104793dv) this.f291758d).f291980i.f63720e;
        if (axVar.mo56113h() && ((Integer) axVar.mo56107c()).intValue() >= 0) {
            this.f291757c.mo76749g((int) TypedValue.applyDimension(1, (float) ((Integer) axVar.mo56107c()).intValue(), this.f291759e.getResources().getDisplayMetrics()));
        }
    }

    /* renamed from: y */
    public final void mo94333y(C58485gu guVar, boolean z) {
        if (this.f291761g.mo94106E()) {
            this.f291761g.mo94105D(C58485gu.m89842j(guVar), !z);
        }
    }
}
