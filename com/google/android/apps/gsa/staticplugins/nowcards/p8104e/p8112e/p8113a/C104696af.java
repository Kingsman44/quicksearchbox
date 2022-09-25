package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.google.android.apps.gsa.now.shared.p6421ui.C83413b;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91774j;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91775k;
import com.google.android.apps.gsa.sidekick.shared.monet.p7252h.C91845d;
import com.google.android.apps.gsa.sidekick.shared.monet.p7252h.C91846e;
import com.google.android.apps.gsa.sidekick.shared.monet.p7252h.C91850i;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91866h;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104336bk;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104337bl;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104411v;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104453p;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104470f;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104520p;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8114b.C104845f;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8115f.C104853b;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62921ba;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.af */
/* compiled from: PG */
public final class C104696af extends C104823j implements C91850i {

    /* renamed from: c */
    private final C104470f f291538c;

    /* renamed from: d */
    private final Context f291539d;

    /* renamed from: e */
    private final CardRenderingContext f291540e;

    /* renamed from: f */
    private final C104453p f291541f;

    /* renamed from: g */
    private final C68214a f291542g;

    /* renamed from: h */
    private final C58833ax f291543h;

    /* renamed from: i */
    private final C91845d f291544i;

    /* renamed from: j */
    private final boolean f291545j;

    /* renamed from: k */
    private final Rect f291546k = new Rect();

    /* renamed from: l */
    private final C104780di f291547l;

    /* renamed from: m */
    private final C58833ax f291548m;

    /* renamed from: n */
    private CardView f291549n;

    /* renamed from: o */
    private C104348l f291550o;

    /* renamed from: p */
    private ViewGroup f291551p;

    /* renamed from: q */
    private Rect f291552q = new Rect();

    /* renamed from: r */
    private C104779dh f291553r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104696af(C22945j jVar, C104470f fVar, Context context, C104453p pVar, CardRenderingContext cardRenderingContext, C68214a aVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C91866h hVar, C91846e eVar, boolean z, C104337bl blVar, C104845f fVar2, C58833ax axVar4, C104780di diVar, boolean z2) {
        super(jVar, fVar, pVar, axVar2, axVar3, hVar, C91774j.m150380a(jVar), z, blVar, fVar2, z2);
        this.f291538c = fVar;
        this.f291539d = context;
        this.f291541f = pVar;
        this.f291540e = cardRenderingContext;
        this.f291542g = aVar;
        this.f291543h = axVar;
        this.f291545j = z;
        this.f291547l = diVar;
        this.f291548m = axVar4;
        this.f291544i = eVar.mo86333a("CarouselModuleRenderer", this.f292071a);
    }

    /* renamed from: A */
    private static boolean m173300A(C9278v vVar) {
        C9277u a = C9277u.m23705a(vVar.f32196c);
        if (a == null) {
            a = C9277u.UNKNOWN;
        }
        if (a == C9277u.METADATA_CARD_SMALL_CAROUSEL) {
            return true;
        }
        C9277u a2 = C9277u.m23705a(vVar.f32196c);
        if (a2 == null) {
            a2 = C9277u.UNKNOWN;
        }
        return a2 == C9277u.TRAY_IMAGE_FULL;
    }

    /* renamed from: z */
    private final C104520p m173301z() {
        C104520p pVar = (C104520p) C23245b.m43557b((ProtoParcelable) ((C58833ax) ((C104785dn) this.f291538c).f291911a.f63720e).mo56107c(), C104520p.f290714g.getParserForType(), C62921ba.m95368a(), true);
        pVar.getClass();
        return pVar;
    }

    /* renamed from: d */
    public final boolean mo86334d() {
        return this.f291544i.mo86332c();
    }

    /* renamed from: im */
    public final void mo28298im() {
        super.mo28298im();
        C104779dh dhVar = this.f291553r;
        if (dhVar != null) {
            dhVar.mo94347a();
            dhVar.mo94349c();
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C23129y g = this.f63126Q.mo28338g();
        C58838bb.m90868c(g.f63477b.startsWith("TYPE_CAROUSEL_MODULE"));
        C9277u a = C9277u.m23705a(C104853b.m173813a(g.f63477b));
        if (this.f291550o == null) {
            if (C104411v.m172629a(a)) {
                C104348l b = ((C104336bk) this.f291542g.mo27525b()).mo94096b(this.f291539d, C104411v.f290543a);
                b.getClass();
                this.f291550o = b;
            } else {
                C104348l b2 = ((C104336bk) this.f291542g.mo27525b()).mo94096b(this.f291539d, a);
                b2.getClass();
                this.f291550o = b2;
            }
        }
        mo94362v();
        C104348l lVar = this.f291550o;
        C104453p pVar = this.f291541f;
        lVar.f290319n = pVar;
        lVar.f290320o = pVar;
        lVar.f290321p = pVar;
        lVar.f290322q = pVar;
        lVar.f290324s = pVar;
        lVar.f290323r = pVar;
        lVar.f290325t = pVar;
        lVar.f290316k = new C104839z(this);
        lVar.f290317l = new C104691aa(this);
        CardView cardView = new CardView(this.f291539d);
        this.f291549n = cardView;
        cardView.setId(R.id.carousel_module_card_view);
        ViewGroup viewGroup = (ViewGroup) this.f291550o.mo94113g(a, new FrameLayout(this.f291539d));
        this.f291551p = viewGroup;
        this.f291546k.set(viewGroup.getPaddingLeft(), this.f291551p.getPaddingTop(), this.f291551p.getPaddingRight(), this.f291551p.getPaddingBottom());
        ViewGroup viewGroup2 = this.f291551p;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f291549n.addView(this.f291551p);
        }
        this.f291549n.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        mo28295iC(this.f291549n);
        ((C104785dn) this.f291538c).f291911a.mo28726b(new C104692ab(this));
        ((C104785dn) this.f291538c).f291912b.mo28726b(new C104693ac(this));
        ((C104785dn) this.f291538c).f291913c.mo28726b(new C104694ad(this));
        C104779dh a2 = this.f291547l.mo94350a(this.f291539d, this.f63126Q, this.f291550o, "CarouselModuleRenderer", this.f291548m, this.f291541f, this.f291538c);
        this.f291553r = a2;
        a2.mo94348b(this.f291545j);
        super.mo28299iw();
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        if (!this.f291550o.mo94106E()) {
            mo94304w(m173301z());
        }
        super.mo28300ix();
    }

    /* renamed from: ja */
    public final void mo86336ja() {
    }

    /* renamed from: jb */
    public final void mo86337jb(int i, int i2, int i3, int i4, int i5, boolean z) {
        C104337bl blVar = this.f292072b;
        C9278v vVar = m173301z().f290717b;
        if (vVar == null) {
            vVar = C9278v.f32165Z;
        }
        C7718hj hjVar = vVar.f32174H;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        blVar.mo94097a(hjVar);
        if (((Boolean) ((C104785dn) this.f291538c).f291914d.f63720e).booleanValue()) {
            this.f291544i.mo86330a(i4, i5, z);
        }
    }

    /* renamed from: jc */
    public final void mo86338jc(boolean z, C91775k kVar, int i, int i2, int i3) {
        this.f291544i.mo86331b(new C104695ae(this), z, kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final View mo94300k() {
        return this.f291549n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final C104348l mo94301m() {
        return this.f291550o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final C9278v mo94302p() {
        C9278v vVar = m173301z().f290717b;
        return vVar == null ? C9278v.f32165Z : vVar;
    }

    /* renamed from: s */
    public final void mo94303s() {
        this.f291550o.mo94036q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x028f, code lost:
        if (r1 != com.google.android.apps.p489g.p494d.C9277u.HERO_IMAGE_CENTER) goto L_0x0291;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0221  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94304w(com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104520p r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            com.google.android.apps.g.d.v r2 = r1.f290717b
            if (r2 != 0) goto L_0x000a
            com.google.android.apps.g.d.v r2 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
        L_0x000a:
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.android.apps.g.d.q r2 = (com.google.android.apps.p489g.p494d.C9273q) r2
            int r3 = r1.f290716a
            r3 = r3 & 16
            if (r3 == 0) goto L_0x005a
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            com.google.ai.b.up r3 = r3.f32170D
            if (r3 != 0) goto L_0x0020
            com.google.ai.b.up r3 = com.google.p375ai.p378b.C8075up.f28418l
        L_0x0020:
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.ai.b.um r3 = (com.google.p375ai.p378b.C8072um) r3
            int r4 = r1.f290721f
            com.google.ai.b.uo r4 = com.google.p375ai.p378b.C8074uo.m22931a(r4)
            if (r4 != 0) goto L_0x0030
            com.google.ai.b.uo r4 = com.google.p375ai.p378b.C8074uo.CHECKED
        L_0x0030:
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.ai.b.up r5 = (com.google.p375ai.p378b.C8075up) r5
            int r4 = r4.f28417d
            r5.f28427h = r4
            int r4 = r5.f28420a
            r4 = r4 | 64
            r5.f28420a = r4
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.g.d.v r4 = (com.google.android.apps.p489g.p494d.C9278v) r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.ai.b.up r3 = (com.google.p375ai.p378b.C8075up) r3
            r3.getClass()
            r4.f32170D = r3
            int r3 = r4.f32192a
            r5 = 134217728(0x8000000, float:3.85186E-34)
            r3 = r3 | r5
            r4.f32192a = r3
        L_0x005a:
            com.google.android.apps.gsa.staticplugins.nowcards.base.l r3 = r0.f291550o
            boolean r3 = r3.mo94106E()
            if (r3 == 0) goto L_0x0067
            com.google.android.apps.gsa.staticplugins.nowcards.base.l r3 = r0.f291550o
            r3.mo94036q()
        L_0x0067:
            com.google.android.apps.gsa.staticplugins.nowcards.base.l r3 = r0.f291550o
            com.google.android.apps.gsa.staticplugins.nowcards.e.f.a r4 = new com.google.android.apps.gsa.staticplugins.nowcards.e.f.a
            com.google.protobuf.bv r5 = r2.build()
            com.google.android.apps.g.d.v r5 = (com.google.android.apps.p489g.p494d.C9278v) r5
            r4.<init>(r5)
            r3.mo94110I(r4)
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            int r3 = r3.f32196c
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r3)
            if (r3 != 0) goto L_0x0085
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0085:
            com.google.android.apps.g.d.u r4 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_LOGO
            r5 = 0
            if (r3 == r4) goto L_0x00d7
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            int r4 = r3.f32196c
            com.google.android.apps.g.d.u r4 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r4)
            if (r4 != 0) goto L_0x0098
            com.google.android.apps.g.d.u r4 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0098:
            com.google.android.apps.g.d.u r6 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_WEB_LOGO
            if (r4 != r6) goto L_0x009d
            goto L_0x00d7
        L_0x009d:
            int r4 = r3.f32192a
            r4 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x010f
            com.google.android.apps.g.d.bx r3 = r3.f32210q
            if (r3 != 0) goto L_0x00a9
            com.google.android.apps.g.d.bx r3 = com.google.android.apps.p489g.p494d.C9188bx.f31714x
        L_0x00a9:
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.android.apps.g.d.bs r3 = (com.google.android.apps.p489g.p494d.C9183bs) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.g.d.bx r4 = (com.google.android.apps.p489g.p494d.C9188bx) r4
            r4.f31724i = r5
            int r6 = r4.f31716a
            r6 = r6 | 16
            r4.f31716a = r6
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.g.d.v r4 = (com.google.android.apps.p489g.p494d.C9278v) r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.apps.g.d.bx r3 = (com.google.android.apps.p489g.p494d.C9188bx) r3
            r3.getClass()
            r4.f32210q = r3
            int r3 = r4.f32192a
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r4.f32192a = r3
            goto L_0x010f
        L_0x00d7:
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            com.google.android.apps.g.d.bx r3 = r3.f32210q
            if (r3 != 0) goto L_0x00e1
            com.google.android.apps.g.d.bx r3 = com.google.android.apps.p489g.p494d.C9188bx.f31714x
        L_0x00e1:
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.android.apps.g.d.bs r3 = (com.google.android.apps.p489g.p494d.C9183bs) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.g.d.bx r4 = (com.google.android.apps.p489g.p494d.C9188bx) r4
            r6 = 2
            r4.f31724i = r6
            int r6 = r4.f31716a
            r6 = r6 | 16
            r4.f31716a = r6
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.g.d.v r4 = (com.google.android.apps.p489g.p494d.C9278v) r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.apps.g.d.bx r3 = (com.google.android.apps.p489g.p494d.C9188bx) r3
            r3.getClass()
            r4.f32210q = r3
            int r3 = r4.f32192a
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r4.f32192a = r3
        L_0x010f:
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            int r3 = r3.f32195b
            r4 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L_0x013b
            com.google.common.base.ax r3 = r0.f291543h
            boolean r3 = r3.mo56113h()
            if (r3 == 0) goto L_0x013b
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r3 = r0.f291540e
            boolean r3 = r3.mo49313h()
            if (r3 == 0) goto L_0x013b
            com.google.common.base.ax r3 = r0.f291543h
            java.lang.Object r3 = r3.mo56107c()
            com.google.android.apps.gsa.sidekick.shared.cards.a.i r3 = (com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91670i) r3
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.g.d.v r4 = (com.google.android.apps.p489g.p494d.C9278v) r4
            java.lang.String r4 = r4.f32190X
            r3.mo86097f(r4)
        L_0x013b:
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.g.d.v r2 = (com.google.android.apps.p489g.p494d.C9278v) r2
            com.google.ai.b.rt r3 = r1.f290718c
            if (r3 != 0) goto L_0x0147
            com.google.ai.b.rt r3 = com.google.p375ai.p378b.C7998rt.f28087v
        L_0x0147:
            r7 = r3
            int r8 = r1.f290719d
            boolean r1 = r1.f290720e
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.p r3 = r19.m173301z()
            com.google.android.apps.g.d.v r3 = r3.f290717b
            if (r3 != 0) goto L_0x0156
            com.google.android.apps.g.d.v r3 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
        L_0x0156:
            com.google.ai.b.hj r3 = r3.f32174H
            if (r3 != 0) goto L_0x015c
            com.google.ai.b.hj r3 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x015c:
            int r3 = r3.f26952X
            int r3 = com.google.p375ai.p378b.C7650ew.m22795a(r3)
            if (r3 != 0) goto L_0x0165
            r3 = 1
        L_0x0165:
            boolean r14 = m173300A(r2)
            r15 = 4
            if (r3 != r15) goto L_0x016f
            r16 = 1
            goto L_0x0171
        L_0x016f:
            r16 = 0
        L_0x0171:
            int r6 = r2.f32196c
            com.google.android.apps.g.d.u r6 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r6)
            if (r6 != 0) goto L_0x017b
            com.google.android.apps.g.d.u r6 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x017b:
            r13 = r6
            com.google.android.apps.g.d.u r12 = com.google.android.apps.p489g.p494d.C9277u.TRAY_SEARCH_CHIP_WRAP
            android.content.Context r6 = r0.f291539d
            android.content.res.Resources r11 = r6.getResources()
            android.content.Context r6 = r0.f291539d
            int r9 = r2.f32196c
            com.google.android.apps.g.d.u r10 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r9)
            if (r10 != 0) goto L_0x0190
            com.google.android.apps.g.d.u r10 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0190:
            com.google.android.apps.g.d.u r4 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_TWO_TONE
            if (r10 == r4) goto L_0x01a3
            com.google.android.apps.g.d.u r4 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r9)
            if (r4 != 0) goto L_0x019c
            com.google.android.apps.g.d.u r4 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x019c:
            com.google.android.apps.g.d.u r9 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_TWO_TONE_ICON
            if (r4 != r9) goto L_0x01a1
            goto L_0x01a3
        L_0x01a1:
            r4 = 0
            goto L_0x01a4
        L_0x01a3:
            r4 = 1
        L_0x01a4:
            r9 = 4
            r17 = 0
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r10 = r0.f291540e
            boolean r18 = r10.mo49316k()
            r10 = r16
            r15 = r11
            r11 = r4
            r4 = r12
            r12 = r17
            r5 = r13
            r13 = r18
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.f r6 = com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104396g.m172607c(r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r7 = r6.f290491k
            if (r7 == 0) goto L_0x01fb
            com.google.android.apps.gsa.staticplugins.nowcards.base.l r7 = r0.f291550o
            boolean r7 = r7 instanceof com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104928az
            if (r7 == 0) goto L_0x01fb
            if (r2 == 0) goto L_0x01fb
            int r7 = r2.f32196c
            com.google.android.apps.g.d.u r7 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r7)
            if (r7 != 0) goto L_0x01d1
            com.google.android.apps.g.d.u r7 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x01d1:
            boolean r7 = com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104411v.m172629a(r7)
            if (r7 == 0) goto L_0x01fb
            if (r14 == 0) goto L_0x01e3
            if (r16 == 0) goto L_0x01e3
            r7 = 2131168026(0x7f070b1a, float:1.7950342E38)
            int r7 = r15.getDimensionPixelSize(r7)
            goto L_0x01ee
        L_0x01e3:
            if (r14 == 0) goto L_0x01ed
            r7 = 2131166500(0x7f070524, float:1.7947247E38)
            int r7 = r15.getDimensionPixelSize(r7)
            goto L_0x01ee
        L_0x01ed:
            r7 = 0
        L_0x01ee:
            com.google.android.apps.gsa.staticplugins.nowcards.base.l r8 = r0.f291550o
            com.google.android.apps.gsa.staticplugins.nowcards.g.az r8 = (com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104928az) r8
            int r9 = r6.f290482b
            int r7 = r7 + r7
            int r9 = r9 - r7
            int r7 = r6.f290484d
            r8.mo94397L(r9, r7)
        L_0x01fb:
            int r7 = r6.f290483c
            r8 = -2
            if (r7 != 0) goto L_0x0201
            r7 = -2
        L_0x0201:
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            int r10 = r6.f290482b
            r9.<init>(r10, r7)
            if (r5 != r4) goto L_0x021a
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r9.<init>(r8, r7)
            android.view.ViewGroup r4 = r0.f291551p
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r7 = -1
            r5.<init>(r8, r7)
            r4.setLayoutParams(r5)
        L_0x021a:
            if (r1 == 0) goto L_0x0221
            r1 = 0
            com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148873e(r9, r1, r1, r1, r1)
            goto L_0x0227
        L_0x0221:
            r1 = 0
            int r4 = r6.f290481a
            com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148873e(r9, r1, r1, r4, r1)
        L_0x0227:
            androidx.cardview.widget.CardView r4 = r0.f291549n
            r4.setClipToOutline(r1)
            androidx.cardview.widget.CardView r1 = r0.f291549n
            androidx.cardview.widget.a r1 = r1.f4345f
            androidx.cardview.widget.CardView r1 = r1.f4347b
            r4 = 0
            r1.setElevation(r4)
            androidx.cardview.widget.CardView r1 = r0.f291549n
            r1.mo4475e(r4)
            int r1 = r2.f32186T
            int r1 = com.google.p375ai.p378b.C7691gj.m22806a(r1)
            if (r1 != 0) goto L_0x0244
            r1 = 1
        L_0x0244:
            r4 = 3
            if (r1 != r4) goto L_0x024e
            androidx.cardview.widget.CardView r1 = r0.f291549n
            r4 = 0
            r0.mo94306y(r1, r3, r4)
            goto L_0x0257
        L_0x024e:
            r4 = 4
            if (r1 != r4) goto L_0x0257
            androidx.cardview.widget.CardView r1 = r0.f291549n
            r4 = 1
            r0.mo94306y(r1, r3, r4)
        L_0x0257:
            int r1 = r2.f32196c
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r1)
            if (r1 != 0) goto L_0x0261
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0261:
            boolean r1 = com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104411v.m172630b(r1)
            if (r1 != 0) goto L_0x02e8
            int r1 = r2.f32196c
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r1)
            if (r1 != 0) goto L_0x0271
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0271:
            boolean r1 = com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104411v.m172631c(r1)
            if (r1 != 0) goto L_0x02e8
            r1 = 7
            if (r3 == r1) goto L_0x02e8
            boolean r1 = m173300A(r2)
            if (r1 != 0) goto L_0x02e8
            r1 = 4
            if (r3 != r1) goto L_0x0291
            int r1 = r2.f32196c
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r1)
            if (r1 != 0) goto L_0x028d
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x028d:
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.HERO_IMAGE_CENTER
            if (r1 == r3) goto L_0x02e8
        L_0x0291:
            android.content.Context r1 = r0.f291539d
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r3 = r0.f291540e
            boolean r3 = r3.mo49316k()
            r4 = 0
            android.graphics.Rect r1 = com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104396g.m172605a(r1, r4, r4, r3)
            r3 = 2131166504(0x7f070528, float:1.7947255E38)
            int r3 = r15.getDimensionPixelSize(r3)
            if (r14 == 0) goto L_0x02a9
            r5 = 0
            goto L_0x02b3
        L_0x02a9:
            r4 = 2131166505(0x7f070529, float:1.7947257E38)
            int r4 = r15.getDimensionPixelSize(r4)
            int r5 = r1.top
            int r5 = r5 + r4
        L_0x02b3:
            android.view.ViewGroup r4 = r0.f291551p
            int r6 = r1.left
            int r6 = r6 + r3
            android.graphics.Rect r7 = r0.f291546k
            int r7 = r7.left
            int r6 = r6 + r7
            android.graphics.Rect r7 = r0.f291552q
            int r7 = r7.left
            int r6 = r6 - r7
            android.graphics.Rect r7 = r0.f291546k
            int r7 = r7.top
            int r5 = r5 + r7
            android.graphics.Rect r7 = r0.f291552q
            int r7 = r7.top
            int r5 = r5 - r7
            int r7 = r1.right
            int r7 = r7 + r3
            android.graphics.Rect r3 = r0.f291546k
            int r3 = r3.right
            int r7 = r7 + r3
            android.graphics.Rect r3 = r0.f291552q
            int r3 = r3.right
            int r7 = r7 - r3
            int r1 = r1.bottom
            android.graphics.Rect r3 = r0.f291546k
            int r3 = r3.bottom
            int r1 = r1 + r3
            android.graphics.Rect r3 = r0.f291552q
            int r3 = r3.bottom
            int r1 = r1 - r3
            r4.setPadding(r6, r5, r7, r1)
        L_0x02e8:
            androidx.cardview.widget.CardView r1 = r0.f291549n
            r1.setLayoutParams(r9)
            com.google.android.apps.gsa.staticplugins.nowcards.e.b.f r1 = r0.f291538c
            com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.dn r1 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a.C104785dn) r1
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r1 = r1.f291913c
            java.lang.Object r1 = r1.f63720e
            com.google.common.b.gu r1 = (com.google.common.p4522b.C58485gu) r1
            r3 = 1
            r0.mo94305x(r1, r3)
            com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.dh r1 = r0.f291553r
            r1.f291883j = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a.C104696af.mo94304w(com.google.android.apps.gsa.staticplugins.nowcards.e.c.p):void");
    }

    /* renamed from: x */
    public final void mo94305x(C58485gu guVar, boolean z) {
        if (this.f291550o.mo94106E()) {
            this.f291550o.mo94105D(C58485gu.m89842j(guVar), !z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo94306y(CardView cardView, int i, boolean z) {
        int i2;
        if (i != 7) {
            boolean z2 = this.f291545j;
            boolean k = this.f291540e.mo49316k();
            int i3 = i - 1;
            if (i3 == 3) {
                i2 = k ? z2 ? R.drawable.discover_card_background_dark_whole : R.drawable.discover_card_background_whole : z2 ? R.drawable.dark_patch_c8_b11 : R.drawable.patch_equal_c8_b11;
            } else if (i3 != 4) {
                C59104x c = C83413b.f227382a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "CornersAndShadowsMgr");
                ((C59052c) ((C59052c) c).mo56372aa(6669)).mo56386p("Trying to get a carousel shadow for a non carousel card");
                i2 = C83413b.m132809b(z2, z, k);
            } else {
                i2 = C83413b.m132809b(z2, z, k);
            }
            this.f291552q = new Rect();
            Drawable drawable = this.f291539d.getResources().getDrawable(i2);
            drawable.getPadding(this.f291552q);
            cardView.setBackground(drawable);
        } else if (this.f291545j) {
            cardView.setBackgroundResource(R.color.back_of_card_dark_background_color);
        }
    }
}
