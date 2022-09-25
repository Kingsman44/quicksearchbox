package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80724cz;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80731df;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80738dm;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80739dn;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80740do;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80741dp;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80744ds;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80758ef;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80787fh;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.C81673b;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip.C81682ah;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip.C81683ai;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip.C81714t;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip.C81715u;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip.ChipsCarousel;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6371a.C81519a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81569l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81810c;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81819l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81822o;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81993bc;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82002j;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82003k;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82004l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl.C82068aw;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83352b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.libraries.animation.impl.C147779b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58756qv;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4816ai.p4818b.C63204j;
import java.util.Set;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.bx */
/* compiled from: PG */
public final class C81772bx implements C81810c, C81822o {

    /* renamed from: y */
    private static final C59071e f223635y = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.bx");

    /* renamed from: A */
    private final C83358h f223636A;

    /* renamed from: B */
    private final C83357g f223637B;

    /* renamed from: C */
    private final C83357g f223638C;

    /* renamed from: D */
    private final C81683ai f223639D;

    /* renamed from: E */
    private final C82003k f223640E;

    /* renamed from: F */
    private final C82003k f223641F;

    /* renamed from: G */
    private final C82003k f223642G;

    /* renamed from: H */
    private final C81783ch f223643H;

    /* renamed from: I */
    private C81682ah f223644I;

    /* renamed from: J */
    private C81682ah f223645J;

    /* renamed from: K */
    private C81782cg f223646K;

    /* renamed from: L */
    private C81782cg f223647L;

    /* renamed from: M */
    private Supplier f223648M;

    /* renamed from: a */
    public final C22871g f223649a;

    /* renamed from: b */
    public final C81819l f223650b;

    /* renamed from: c */
    public final C83363m f223651c = new C83363m();

    /* renamed from: d */
    public final C81802u f223652d;

    /* renamed from: e */
    public final C83358h f223653e;

    /* renamed from: f */
    public final C83358h f223654f;

    /* renamed from: g */
    public final C81673b f223655g;

    /* renamed from: h */
    public Optional f223656h;

    /* renamed from: i */
    public Optional f223657i;

    /* renamed from: j */
    public C80741dp f223658j;

    /* renamed from: k */
    public C80739dn f223659k;

    /* renamed from: l */
    public final Context f223660l;

    /* renamed from: m */
    public final C81993bc f223661m;

    /* renamed from: n */
    public final FrameLayout f223662n;

    /* renamed from: o */
    public final FrameLayout f223663o;

    /* renamed from: p */
    public final FrameLayout f223664p;

    /* renamed from: q */
    public final C81715u f223665q;

    /* renamed from: r */
    public final C81564g f223666r;

    /* renamed from: s */
    public C81722aa f223667s;

    /* renamed from: t */
    public C81782cg f223668t;

    /* renamed from: u */
    public C81782cg f223669u;

    /* renamed from: v */
    public final C104149a f223670v;

    /* renamed from: w */
    public int f223671w;

    /* renamed from: x */
    public final C81569l f223672x;

    /* renamed from: z */
    private final C22871g f223673z;

    public C81772bx(Context context, C22871g gVar, C22871g gVar2, C81993bc bcVar, C81683ai aiVar, C81569l lVar, C81802u uVar, C104149a aVar, C82004l lVar2, C81715u uVar2, C81819l lVar3, C81673b bVar, C81783ch chVar, C81564g gVar3) {
        C82004l lVar4 = lVar2;
        C83361k kVar = new C83361k(false, C81519a.class);
        this.f223638C = kVar;
        this.f223656h = Optional.empty();
        this.f223657i = Optional.empty();
        this.f223658j = C80741dp.EMPTY;
        this.f223659k = C80739dn.EMPTY;
        this.f223671w = 1;
        this.f223660l = context;
        this.f223661m = bcVar;
        this.f223639D = aiVar;
        this.f223672x = lVar;
        this.f223662n = new FrameLayout(context);
        this.f223670v = aVar;
        C82003k a = lVar4.mo75447a(new C81734am(this), C82002j.m130248c("singleTactileInputPlate"));
        this.f223640E = a;
        this.f223663o = new FrameLayout(context);
        C82003k a2 = lVar4.mo75447a(new C81735an(this), C82002j.m130248c("doubleTactileInputPlate"));
        this.f223641F = a2;
        this.f223664p = new FrameLayout(context);
        C82003k a3 = lVar4.mo75447a(new C81736ao(this), C82002j.m130248c("topTactileInputPlate"));
        this.f223642G = a3;
        this.f223652d = uVar;
        this.f223665q = uVar2;
        this.f223643H = chVar;
        C83361k kVar2 = new C83361k(false, C81519a.class);
        this.f223637B = kVar2;
        this.f223655g = bVar;
        this.f223649a = gVar;
        this.f223650b = lVar3;
        this.f223673z = gVar2;
        this.f223666r = gVar3;
        C83358h k = C83349aj.m132656k(lVar3.mo75159l(), kVar2, C81737ap.f223585a);
        this.f223653e = k;
        this.f223654f = C83349aj.m132655j(k, lVar3.mo75154g(), kVar, C81739ar.f223587a);
        this.f223636A = C83349aj.m132655j(a.f224173g, a2.f224173g, a3.f224173g, C81740as.f223588a);
    }

    /* renamed from: k */
    public static C28292j m129918k(int i, Optional optional, C80724cz czVar, int i2) {
        C28292j jVar = new C28292j(i);
        jVar.mo33795i(5);
        jVar.mo33795i(18);
        optional.ifPresent(new C81741at(jVar));
        if ((czVar.f221603a & 2) != 0) {
            C63204j jVar2 = czVar.f221605c;
            if (jVar2 == null) {
                jVar2 = C63204j.f170749e;
            }
            jVar.mo33792f(jVar2);
        }
        jVar.mo33794h(i2);
        return jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r1 != 1) goto L_0x0020;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.RectF mo75196a() {
        /*
            r7 = this;
            com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.aa r0 = r7.f223667s
            com.google.android.apps.gsa.nga.shared.aj.a.a.dp r1 = r7.f223658j
            com.google.android.apps.gsa.nga.shared.aj.a.a.dp r2 = com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80741dp.EMPTY
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0020
            com.google.android.apps.gsa.nga.shared.aj.a.a.dn r1 = r7.f223659k
            com.google.android.apps.gsa.nga.shared.aj.a.a.dn r2 = com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80739dn.EMPTY
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0020
            int r1 = r7.f223671w
            if (r1 == 0) goto L_0x001e
            r2 = 1
            if (r1 == r2) goto L_0x0022
            goto L_0x0020
        L_0x001e:
            r0 = 0
            throw r0
        L_0x0020:
            if (r0 != 0) goto L_0x0028
        L_0x0022:
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            return r0
        L_0x0028:
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            com.google.android.apps.gsa.nga.shared.aj.a.a.dp r2 = r7.f223658j
            com.google.common.b.ij r2 = r0.mo75282b(r2)
            com.google.common.b.sl r2 = r2.iterator()
        L_0x0037:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005b
            java.lang.Object r3 = r2.next()
            android.view.View r3 = (android.view.View) r3
            int r4 = r3.getLeft()
            float r4 = (float) r4
            int r5 = r3.getTop()
            float r5 = (float) r5
            int r6 = r3.getRight()
            float r6 = (float) r6
            int r3 = r3.getBottom()
            float r3 = (float) r3
            r1.union(r4, r5, r6, r3)
            goto L_0x0037
        L_0x005b:
            com.google.android.apps.gsa.nga.shared.aj.a.a.dn r2 = r7.f223659k
            com.google.common.b.ij r2 = r0.mo75281a(r2)
            com.google.common.b.sl r2 = r2.iterator()
        L_0x0065:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0089
            java.lang.Object r3 = r2.next()
            android.view.View r3 = (android.view.View) r3
            int r4 = r3.getLeft()
            float r4 = (float) r4
            int r5 = r3.getTop()
            float r5 = (float) r5
            int r6 = r3.getRight()
            float r6 = (float) r6
            int r3 = r3.getBottom()
            float r3 = (float) r3
            r1.union(r4, r5, r6, r3)
            goto L_0x0065
        L_0x0089:
            int r2 = r7.f223671w
            com.google.common.b.ij r0 = r0.mo75283c(r2)
            com.google.common.b.sl r0 = r0.iterator()
        L_0x0093:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b7
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            int r3 = r2.getLeft()
            float r3 = (float) r3
            int r4 = r2.getTop()
            float r4 = (float) r4
            int r5 = r2.getRight()
            float r5 = (float) r5
            int r2 = r2.getBottom()
            float r2 = (float) r2
            r1.union(r3, r4, r5, r2)
            goto L_0x0093
        L_0x00b7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl.C81772bx.mo75196a():android.graphics.RectF");
    }

    /* renamed from: b */
    public final C81801t mo75298b(C58528ij ijVar, boolean z) {
        if (!z) {
            return new C81791j(ijVar);
        }
        return new C81795n((C58528ij) Collection.EL.stream(ijVar).map(new C81790i(this.f223652d)).collect(C58370cn.f155947b));
    }

    /* renamed from: c */
    public final C81801t mo75299c(C58528ij ijVar, C58528ij ijVar2) {
        if (ijVar.equals(ijVar2)) {
            return new C81797p(ijVar2);
        }
        C58756qv c = C58758qx.m90645c(ijVar, ijVar2);
        C58756qv d = C58758qx.m90646d(ijVar, ijVar2);
        C58756qv c2 = C58758qx.m90645c(ijVar2, ijVar);
        Stream stream = Collection.EL.stream(d);
        Objects.requireNonNull(this.f223652d);
        C81799r rVar = new C81799r((Set) stream.map(new C81747az()).collect(C58370cn.f155947b));
        Stream stream2 = Collection.EL.stream(c2);
        C81802u uVar = this.f223652d;
        Objects.requireNonNull(uVar);
        C81801t rVar2 = new C81799r((Set) stream2.map(new C81749ba(uVar)).collect(C58370cn.f155947b));
        C81801t rVar3 = new C81799r((Set) Collection.EL.stream(c).map(new C81751bc(this)).collect(C58370cn.f155947b));
        if (!c.isEmpty()) {
            if (c2.isEmpty()) {
                rVar2 = rVar3;
            } else {
                C81802u uVar2 = this.f223652d;
                Duration duration = C81802u.f223737a;
                C147779b bVar = new C147779b(uVar2.f223738b, C81786e.f223716a);
                bVar.f398748b = new C81787f(rVar2);
                rVar2 = new C81800s(rVar3, bVar.mo124453a(), duration, rVar2);
            }
        }
        return new C81798q(new C81801t[]{rVar, rVar2});
    }

    /* renamed from: d */
    public final void mo75129d() {
        this.f223651c.mo76663c(this.f223636A, new C81744aw(this));
        this.f223640E.mo75445b(this.f223662n);
        this.f223641F.mo75445b(this.f223663o);
        this.f223642G.mo75445b(this.f223664p);
    }

    /* renamed from: e */
    public final void mo75130e() {
        this.f223651c.mo76661a();
        this.f223640E.mo75444a();
        this.f223641F.mo75444a();
        this.f223642G.mo75444a();
    }

    /* renamed from: f */
    public final void mo75300f(C80740do doVar, C80738dm dmVar, C81722aa aaVar) {
        C80741dp a = doVar.mo74643a();
        C80739dn b = dmVar.mo74638b();
        if (this.f223644I != null) {
            if (a.equals(C80741dp.CHIPS)) {
                this.f223644I.mo75236a(doVar.mo74644b().mo74595c());
            } else {
                this.f223644I.mo75237b();
            }
        }
        if (this.f223645J != null) {
            if (b.equals(C80739dn.CHIPS)) {
                this.f223645J.mo75236a(dmVar.mo74639c().mo74595c());
            } else {
                this.f223645J.mo75237b();
            }
        }
        C81782cg cgVar = this.f223668t;
        char c = 3;
        if (cgVar != null) {
            if (b.equals(C80739dn.FRE_SUGGESTION)) {
                cgVar.mo75309b();
                int o = dmVar.mo74641e().mo74506o();
                if (o == 0) {
                    throw null;
                } else if (o == 3) {
                    cgVar.mo75311d(aaVar.f223561n);
                }
            } else {
                cgVar.mo75310c();
            }
        }
        C81782cg cgVar2 = this.f223669u;
        if (cgVar2 != null) {
            if (a.equals(C80741dp.TRY_SAYING)) {
                cgVar2.mo75309b();
                int i = doVar.mo74650h().f221705h;
                if (i == 0) {
                    c = 2;
                } else if (i != 1) {
                    c = i != 2 ? (char) 0 : 4;
                }
                if (c != 0 && c == 4) {
                    cgVar2.mo75311d(aaVar.f223555h);
                }
            } else {
                cgVar2.mo75310c();
            }
        }
        if (this.f223646K != null) {
            if (b.equals(C80739dn.APP_SHORTCUT)) {
                this.f223646K.mo75309b();
            } else {
                this.f223646K.mo75310c();
            }
        }
        C81782cg cgVar3 = this.f223647L;
        if (cgVar3 == null) {
            return;
        }
        if (a.equals(C80741dp.STATIC_TEXT)) {
            cgVar3.mo75309b();
        } else {
            cgVar3.mo75310c();
        }
    }

    /* renamed from: g */
    public final void mo75301g(C80787fh fhVar, boolean z, ChipsCarousel chipsCarousel) {
        chipsCarousel.f223375e = new C81742au(this);
        chipsCarousel.f223376f = new C81743av(this);
        C81714t tVar = chipsCarousel.f223373c;
        if (tVar != null) {
            tVar.f223463b = z;
            tVar.mObservable.mo2879a();
        }
        chipsCarousel.mo75227c(fhVar.mo74593a());
        String b = fhVar.mo74594b();
        chipsCarousel.f223372b.setVisibility(true != b.isEmpty() ? 0 : 8);
        chipsCarousel.f223371a.setText(b);
    }

    /* renamed from: h */
    public final void mo75302h(C80731df dfVar, DoubleTopGreetingView doubleTopGreetingView) {
        if (!TextUtils.isEmpty(dfVar.mo74531d()) || !dfVar.mo74528a().equals(C80758ef.f221662e)) {
            if (dfVar.mo74528a().equals(C80758ef.f221662e)) {
                String d = dfVar.mo74531d();
                doubleTopGreetingView.mo75248b(dfVar.mo74530c());
                if (!d.equals(doubleTopGreetingView.f223490d)) {
                    doubleTopGreetingView.f223490d = d;
                    doubleTopGreetingView.f223487a.setText(d);
                    doubleTopGreetingView.f223488b.setVisibility(8);
                    doubleTopGreetingView.f223489c.setVisibility(8);
                }
            } else {
                C80758ef a = dfVar.mo74528a();
                doubleTopGreetingView.mo75248b(dfVar.mo74530c());
                String str = a.f221665b;
                doubleTopGreetingView.f223490d = str;
                doubleTopGreetingView.f223487a.setText(str);
                if ((a.f221664a & 1) != 0) {
                    doubleTopGreetingView.f223488b.setText(a.f221666c);
                    doubleTopGreetingView.f223488b.setVisibility(0);
                } else {
                    doubleTopGreetingView.f223488b.setVisibility(8);
                }
                doubleTopGreetingView.f223489c.setText(a.f221667d);
                doubleTopGreetingView.f223489c.setVisibility(0);
            }
            if (dfVar.mo74529b().equals(C80831aj.f221751c)) {
                doubleTopGreetingView.setOnClickListener((View.OnClickListener) null);
                doubleTopGreetingView.setClickable(false);
                return;
            }
            doubleTopGreetingView.setOnClickListener(new C81745ax(this, doubleTopGreetingView, dfVar));
            doubleTopGreetingView.setClickable(true);
        }
    }

    /* renamed from: i */
    public final void mo75303i() {
        Supplier supplier;
        C81722aa aaVar = this.f223667s;
        if (aaVar != null && (supplier = this.f223648M) != null) {
            this.f223644I = this.f223639D.mo75238a(aaVar.f223559l, supplier, 92781);
            this.f223645J = this.f223639D.mo75238a(aaVar.f223563p, supplier, 134253);
            C80744ds dsVar = (C80744ds) ((C83352b) this.f223653e).mo76654b();
            mo75300f(dsVar.mo74548b(), dsVar.mo74547a(), aaVar);
            this.f223661m.mo75435f(aaVar.f223556i, 92673, false);
            this.f223661m.mo75435f(aaVar.f223560m, 128487, false);
            this.f223661m.mo75435f(aaVar.f223557j, 92672, false);
            this.f223661m.mo75435f(aaVar.f223558k, 92674, false);
            this.f223661m.mo75431b(((C82068aw) supplier).f224303a.mo75492a());
            ((C59052c) ((C59052c) f223635y.mo56224b()).mo56372aa(6254)).mo56386p("setup logging");
            this.f223647L = this.f223643H.mo75312a(new C81764bp(aaVar), new C81765bq(aaVar), supplier);
            this.f223668t = this.f223643H.mo75312a(new C81766br(aaVar), new C81767bs(aaVar), supplier);
            this.f223669u = this.f223643H.mo75312a(new C81768bt(aaVar), new C81769bu(aaVar), supplier);
            this.f223646K = this.f223643H.mo75312a(new C81728ag(aaVar), new C81729ah(aaVar), supplier);
            C83349aj.m132647b(this.f223673z, this.f223637B, true, "enableVeGrafting");
        }
    }

    /* renamed from: j */
    public final void mo75304j(Supplier supplier) {
        if (this.f223648M != supplier) {
            this.f223648M = supplier;
            this.f223655g.mo75131f(supplier);
            mo75303i();
        }
    }
}
