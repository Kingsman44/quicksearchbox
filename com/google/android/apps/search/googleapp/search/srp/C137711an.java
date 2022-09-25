package com.google.android.apps.search.googleapp.search.srp;

import android.content.Context;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.apps.search.googleapp.p10117aa.C133103au;
import com.google.android.apps.search.googleapp.p10117aa.p10119b.C133110a;
import com.google.android.apps.search.googleapp.p10117aa.p10121d.C133118a;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.apps.search.googleapp.p10335j.C136374e;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.p10527u.C139768i;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10412h.C137469b;
import com.google.android.apps.search.googleapp.search.p10412h.C137473d;
import com.google.android.apps.search.googleapp.search.p10415i.C137483ac;
import com.google.android.apps.search.googleapp.search.p10415i.C137484ad;
import com.google.android.apps.search.googleapp.search.p10415i.C137485ae;
import com.google.android.apps.search.googleapp.search.p10415i.C137522x;
import com.google.android.apps.search.googleapp.search.p10415i.C137523y;
import com.google.android.apps.search.googleapp.search.p10418j.C137534h;
import com.google.android.apps.search.googleapp.search.p10418j.C137536j;
import com.google.android.apps.search.googleapp.search.p10420k.C137543b;
import com.google.android.apps.search.googleapp.search.p10420k.C137546e;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.apps.search.googleapp.search.srp.error.C137811j;
import com.google.android.apps.search.googleapp.search.srp.error.C137813l;
import com.google.android.apps.search.googleapp.search.srp.error.C137821t;
import com.google.android.apps.search.googleapp.search.srp.external.C137835h;
import com.google.android.apps.search.googleapp.search.srp.interceptor.C137876a;
import com.google.android.apps.search.googleapp.search.srp.p10434d.C137747a;
import com.google.android.apps.search.googleapp.search.srp.p10435e.C137750aa;
import com.google.android.apps.search.googleapp.search.srp.p10435e.C137770au;
import com.google.android.apps.search.googleapp.search.srp.p10435e.C137801z;
import com.google.android.apps.search.googleapp.search.srp.p10437g.C137852a;
import com.google.android.apps.search.googleapp.search.srp.p10437g.C137853b;
import com.google.android.apps.search.googleapp.search.srp.p10438h.C137871g;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137916ab;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138772i;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y;
import com.google.android.apps.search.googleapp.silkpane.p10485a.C139272a;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139684f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.contrib.errorpage.C43515c;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43513c;
import com.google.android.libraries.web.contrib.loadingbar.p3397a.C43675b;
import com.google.android.libraries.web.contrib.loadingbar.p3398ui.C43678b;
import com.google.android.libraries.web.contrib.loadingbar.p3398ui.C43679c;
import com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin;
import com.google.android.libraries.web.coordinator.C43737c;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.p3420k.C43864j;
import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.webview.contrib.requestintercept.C44381b;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.C46401p;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.lifecycle.flow.C47429i;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p395al.p417d.p418a.C8575bc;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4309n.C56745d;
import com.google.protobuf.C62912at;
import com.google.protobuf.C63077o;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.an */
/* compiled from: PG */
public final class C137711an implements C139768i {

    /* renamed from: a */
    public static final C58974d f374545a = C58974d.m91135i("SearchResultsFragment");

    /* renamed from: A */
    public final C136374e f374546A;

    /* renamed from: B */
    public final C28306ab f374547B;

    /* renamed from: C */
    public final C43262m f374548C;

    /* renamed from: D */
    public final C43737c f374549D;

    /* renamed from: E */
    public final C43737c f374550E;

    /* renamed from: F */
    public final C43377v f374551F;

    /* renamed from: G */
    public final boolean f374552G;

    /* renamed from: H */
    public final boolean f374553H;

    /* renamed from: I */
    public final boolean f374554I;

    /* renamed from: J */
    public final C46401p f374555J;

    /* renamed from: K */
    public final C138772i f374556K;

    /* renamed from: L */
    public final C46401p f374557L;

    /* renamed from: M */
    public final C137723av f374558M;

    /* renamed from: N */
    public Optional f374559N = Optional.empty();

    /* renamed from: O */
    public final C46792di f374560O = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C58970a aVar = (C58970a) C137711an.f374545a.mo56226d();
            aVar.mo56378ag(C38505d.f101864b, 145005885);
            ((C58970a) ((C58970a) aVar.mo56382g(th)).mo56372aa(41025)).mo56386p("Fail to fetch search permission");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C63077o oVar = (C63077o) obj;
            C137711an.this.f374559N = Optional.m71637of(Boolean.valueOf(oVar.f170230a));
            C137711an.this.mo113918h(oVar.f170230a);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: P */
    public final C46792di f374561P = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C58970a) ((C58970a) ((C58970a) C137711an.f374545a.mo56226d()).mo56382g(th)).mo56372aa(41026)).mo56386p("Failed to fetch WebState");
            C137711an.this.f374586e.mo115163a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ void mo18078b(java.lang.Object r4) {
            /*
                r3 = this;
                com.google.android.libraries.web.c.u r4 = (com.google.android.libraries.web.p3353c.C43376u) r4
                int r0 = r4.f113328a
                r0 = r0 & 64
                if (r0 == 0) goto L_0x0009
                goto L_0x001f
            L_0x0009:
                int r0 = r4.f113330c
                com.google.android.libraries.web.c.n r0 = com.google.android.libraries.web.p3353c.C43369n.m76519a(r0)
                if (r0 != 0) goto L_0x0013
                com.google.android.libraries.web.c.n r0 = com.google.android.libraries.web.p3353c.C43369n.UNSPECIFIED
            L_0x0013:
                boolean r0 = com.google.android.libraries.web.p3353c.C43370o.m76522b(r0)
                if (r0 == 0) goto L_0x001f
                com.google.android.apps.search.googleapp.search.srp.an r0 = com.google.android.apps.search.googleapp.search.srp.C137711an.this
                r0.mo113920j()
                goto L_0x0043
            L_0x001f:
                com.google.android.apps.search.googleapp.search.srp.an r0 = com.google.android.apps.search.googleapp.search.srp.C137711an.this
                boolean r1 = r0.f374553H
                if (r1 == 0) goto L_0x0043
                com.google.android.apps.search.googleapp.search.srp.ab r1 = r0.f374601t
                android.view.View r1 = r1.requireView()
                r2 = 2131431941(0x7f0b1205, float:1.8485625E38)
                android.view.View r1 = r1.findViewById(r2)
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                int r2 = r1.getVisibility()
                if (r2 != 0) goto L_0x0043
                r2 = 4
                r1.setVisibility(r2)
                com.google.android.apps.search.googleapp.search.h.b r0 = r0.f374591j
                r0.mo113756g()
            L_0x0043:
                int r4 = r4.f113330c
                com.google.android.libraries.web.c.n r4 = com.google.android.libraries.web.p3353c.C43369n.m76519a(r4)
                if (r4 != 0) goto L_0x004d
                com.google.android.libraries.web.c.n r4 = com.google.android.libraries.web.p3353c.C43369n.UNSPECIFIED
            L_0x004d:
                com.google.common.b.ij r0 = com.google.android.libraries.web.p3353c.C43370o.f113313a
                boolean r4 = r0.contains(r4)
                if (r4 == 0) goto L_0x005c
                com.google.android.apps.search.googleapp.search.srp.an r4 = com.google.android.apps.search.googleapp.search.srp.C137711an.this
                com.google.android.apps.search.googleapp.startup.appinteractive.b r4 = r4.f374586e
                r4.mo115163a()
            L_0x005c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.C137711an.C1377132.mo18078b(java.lang.Object):void");
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: Q */
    public final C46440f f374562Q = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C58970a) ((C58970a) ((C58970a) C137711an.f374545a.mo56225c()).mo56382g(th)).mo56372aa(41027)).mo56386p("Failed to remove tab");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: R */
    public final int f374563R;

    /* renamed from: S */
    public final int f374564S;

    /* renamed from: T */
    public final C38553h f374565T;

    /* renamed from: U */
    private final AtomicReference f374566U;

    /* renamed from: V */
    private final C21370a f374567V;

    /* renamed from: W */
    private final Duration f374568W;

    /* renamed from: X */
    private final C46778cv f374569X;

    /* renamed from: Y */
    private final C137485ae f374570Y;

    /* renamed from: Z */
    private final C137916ab f374571Z;

    /* renamed from: aa */
    private final C133118a f374572aa;

    /* renamed from: ab */
    private final C133103au f374573ab;

    /* renamed from: ac */
    private final C133110a f374574ac;

    /* renamed from: ad */
    private final C43269t f374575ad;

    /* renamed from: ae */
    private final C43737c f374576ae;

    /* renamed from: af */
    private final boolean f374577af;

    /* renamed from: ag */
    private final boolean f374578ag;

    /* renamed from: ah */
    private final boolean f374579ah;

    /* renamed from: ai */
    private final boolean f374580ai;

    /* renamed from: aj */
    private final C46401p f374581aj;

    /* renamed from: ak */
    private final C137871g f374582ak;

    /* renamed from: b */
    public final AccountId f374583b;

    /* renamed from: c */
    public final C137692a f374584c;

    /* renamed from: d */
    public final Context f374585d;

    /* renamed from: e */
    public final C139680b f374586e;

    /* renamed from: f */
    public final C139684f f374587f;

    /* renamed from: g */
    public final C43513c f374588g;

    /* renamed from: h */
    public final C137835h f374589h;

    /* renamed from: i */
    public final C46439e f374590i;

    /* renamed from: j */
    public final C137469b f374591j;

    /* renamed from: k */
    public final C136832c f374592k;

    /* renamed from: l */
    public final C137473d f374593l;

    /* renamed from: m */
    public final C137750aa f374594m;

    /* renamed from: n */
    public final C137747a f374595n;

    /* renamed from: o */
    public final C137852a f374596o;

    /* renamed from: p */
    public final C137900w f374597p;

    /* renamed from: q */
    public final RequestBlockMixin f374598q;

    /* renamed from: r */
    public final C137534h f374599r;

    /* renamed from: s */
    public final C137546e f374600s;

    /* renamed from: t */
    public final C137699ab f374601t;

    /* renamed from: u */
    public final C137853b f374602u;

    /* renamed from: v */
    public final C139272a f374603v;

    /* renamed from: w */
    public final C137876a f374604w;

    /* renamed from: x */
    public final C38802e f374605x;

    /* renamed from: y */
    public final C47429i f374606y;

    /* renamed from: z */
    public final C46801dp f374607z;

    /* renamed from: com.google.android.apps.search.googleapp.search.srp.an$a */
    /* compiled from: PG */
    final class C137715a implements C46792di {

        /* renamed from: a */
        private final C137711an f374610a;

        /* renamed from: b */
        private final int f374611b;

        public C137715a(C137711an anVar, int i) {
            this.f374610a = anVar;
            this.f374611b = i;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            throw new AssertionError("Immediate DataSource can't fail.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            int b;
            C138788y yVar = (C138788y) obj;
            if (!yVar.f377535c.isEmpty() && (b = C138787x.m225440b(yVar.f377534b)) != 0 && b == 4) {
                C137723av avVar = this.f374610a.f374558M;
                int i = avVar.f374626c;
                if (i == 3 || i == 5) {
                    avVar.mo113925a();
                }
                int i2 = this.f374611b;
                if (i2 == 1 || i2 == 4) {
                    this.f374610a.mo113917f();
                }
            }
            int b2 = C138787x.m225440b(yVar.f377534b);
            if (b2 != 0 && b2 == 5) {
                C137723av avVar2 = this.f374610a.f374558M;
                int i3 = avVar2.f374626c;
                if (i3 == 4 || i3 == 5) {
                    avVar2.mo113925a();
                }
                int i4 = this.f374611b;
                if (i4 == 2 || i4 == 4) {
                    this.f374610a.mo113917f();
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0168, code lost:
        if (r2.equals("ATTACH_ON_CREATE") != false) goto L_0x0188;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C137711an(android.content.Context r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, java.lang.String r21, java.lang.String r22, com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e r23, java.util.concurrent.atomic.AtomicReference r24, long r25, com.google.apps.tiktok.account.AccountId r27, com.google.android.apps.search.googleapp.search.srp.C137692a r28, com.google.android.libraries.p1730f.C21370a r29, com.google.android.apps.search.googleapp.startup.appinteractive.C139680b r30, com.google.android.apps.search.googleapp.startup.appinteractive.C139684f r31, com.google.android.libraries.web.contrib.errorpage.p3373a.C43513c r32, com.google.android.apps.search.googleapp.search.srp.external.C137835h r33, com.google.android.libraries.search.p3025k.C38553h r34, com.google.apps.tiktok.concurrent.futuresmixin.C46439e r35, com.google.android.apps.search.googleapp.search.p10412h.C137469b r36, com.google.android.apps.search.googleapp.p10369o.C136832c r37, com.google.android.apps.search.googleapp.search.p10412h.C137473d r38, com.google.android.apps.search.googleapp.search.srp.p10435e.C137750aa r39, com.google.android.apps.search.googleapp.search.srp.p10434d.C137747a r40, com.google.android.apps.search.googleapp.search.srp.p10437g.C137852a r41, com.google.android.apps.search.googleapp.search.srp.p10435e.C137764ao r42, com.google.android.apps.search.googleapp.search.srp.C137900w r43, com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin r44, com.google.apps.tiktok.dataservice.C46778cv r45, com.google.android.apps.search.googleapp.search.p10418j.C137534h r46, com.google.android.apps.search.googleapp.search.p10420k.C137546e r47, com.google.android.apps.search.googleapp.search.srp.C137699ab r48, com.google.android.apps.search.googleapp.search.srp.p10437g.C137853b r49, com.google.android.apps.search.googleapp.silkpane.p10485a.C139272a r50, com.google.android.apps.search.googleapp.search.p10415i.C137485ae r51, com.google.android.apps.search.googleapp.search.srp.p10438h.C137871g r52, com.google.android.apps.search.googleapp.search.srp.interceptor.C137876a r53, com.google.android.apps.search.googleapp.search.srp.C137723av r54, com.google.apps.tiktok.lifecycle.flow.C47429i r55, com.google.apps.tiktok.dataservice.C46801dp r56, com.google.android.apps.search.googleapp.search.suggest.p10443a.C137916ab r57, com.google.android.apps.search.googleapp.p10117aa.p10121d.C133118a r58, com.google.android.apps.search.googleapp.p10117aa.C133103au r59, com.google.android.apps.search.googleapp.p10117aa.p10119b.C133110a r60, com.google.android.apps.search.googleapp.p10335j.C136374e r61, com.google.android.libraries.logging.p2185ve.C28306ab r62, com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138772i r63, com.google.android.libraries.web.base.C43262m r64, com.google.android.libraries.web.base.C43269t r65, com.google.android.libraries.web.shared.p3441a.C44077a r66, com.google.android.libraries.web.shared.p3441a.C44077a r67, com.google.android.libraries.web.shared.p3441a.C44077a r68, com.google.android.libraries.web.coordinator.C43737c r69, com.google.android.libraries.web.coordinator.C43737c r70, com.google.android.libraries.web.coordinator.C43737c r71, com.google.android.libraries.web.p3353c.C43377v r72) {
        /*
            r12 = this;
            r0 = r12
            r1 = r21
            r2 = r22
            r3 = r52
            r12.<init>()
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            r0.f374559N = r4
            com.google.android.apps.search.googleapp.search.srp.an$1 r4 = new com.google.android.apps.search.googleapp.search.srp.an$1
            r4.<init>()
            r0.f374560O = r4
            com.google.android.apps.search.googleapp.search.srp.an$2 r4 = new com.google.android.apps.search.googleapp.search.srp.an$2
            r4.<init>()
            r0.f374561P = r4
            com.google.android.apps.search.googleapp.search.srp.an$3 r4 = new com.google.android.apps.search.googleapp.search.srp.an$3
            r4.<init>()
            r0.f374562Q = r4
            r4 = r27
            r0.f374583b = r4
            r4 = r14
            r0.f374577af = r4
            com.google.apps.tiktok.cache.p r4 = com.google.android.apps.search.googleapp.search.srp.external.C137830c.m224073a(r66)
            r0.f374557L = r4
            r4 = r28
            r0.f374584c = r4
            r4 = r29
            r0.f374567V = r4
            r4 = r13
            r0.f374585d = r4
            r4 = r19
            r0.f374578ag = r4
            r4 = r30
            r0.f374586e = r4
            r4 = r31
            r0.f374587f = r4
            r4 = r17
            r0.f374552G = r4
            r4 = r32
            r0.f374588g = r4
            r4 = r33
            r0.f374589h = r4
            r4 = r34
            r0.f374565T = r4
            r4 = r35
            r0.f374590i = r4
            r4 = r36
            r0.f374591j = r4
            r4 = r37
            r0.f374592k = r4
            r4 = r38
            r0.f374593l = r4
            r4 = r39
            r0.f374594m = r4
            r4 = r40
            r0.f374595n = r4
            r4 = r41
            r0.f374596o = r4
            r4 = r24
            r0.f374566U = r4
            r4 = r16
            r0.f374579ah = r4
            r4 = r43
            r0.f374597p = r4
            r4 = r44
            r0.f374598q = r4
            r4 = r45
            r0.f374569X = r4
            r4 = r46
            r0.f374599r = r4
            r4 = r69
            r0.f374549D = r4
            com.google.android.apps.search.googleapp.search.k.a.d r4 = com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d.f374085g
            r5 = r67
            com.google.apps.tiktok.cache.InstanceStateStoreFactory r5 = r5.f114747a
            java.lang.String r6 = "search_query_name"
            com.google.apps.tiktok.cache.p r4 = r5.mo50325a(r6, r4)
            r0.f374555J = r4
            r5 = r70
            r0.f374550E = r5
            r5 = r47
            r0.f374600s = r5
            com.google.bv.b.a.a.n.d r5 = com.google.p4283bv.p4287b.p4288a.p4289a.p4309n.C56745d.f151443b
            r6 = r68
            com.google.apps.tiktok.cache.InstanceStateStoreFactory r6 = r6.f114747a
            java.lang.String r7 = "search_refinement_suggestions_store"
            com.google.apps.tiktok.cache.p r5 = r6.mo50325a(r7, r5)
            r0.f374581aj = r5
            r5 = r71
            r0.f374576ae = r5
            r5 = r48
            r0.f374601t = r5
            r5 = r49
            r0.f374602u = r5
            r5 = r15
            r0.f374580ai = r5
            r5 = r50
            r0.f374603v = r5
            r5 = r51
            r0.f374570Y = r5
            r5 = r53
            r0.f374604w = r5
            r5 = r54
            r0.f374558M = r5
            r5 = r23
            r0.f374605x = r5
            r5 = r55
            r0.f374606y = r5
            r5 = r56
            r0.f374607z = r5
            r5 = r57
            r0.f374571Z = r5
            r5 = r58
            r0.f374572aa = r5
            r5 = r59
            r0.f374573ab = r5
            r5 = r60
            r0.f374574ac = r5
            r5 = r61
            r0.f374546A = r5
            r5 = r20
            r0.f374553H = r5
            r5 = r18
            r0.f374554I = r5
            r5 = r62
            r0.f374547B = r5
            r5 = r63
            r0.f374556K = r5
            int r5 = r21.hashCode()
            r6 = 0
            java.lang.String r7 = "ATTACH_ON_COMMIT"
            r8 = -1
            r9 = 3
            r10 = 2
            r11 = 1
            switch(r5) {
                case -1621106680: goto L_0x012f;
                case -936246877: goto L_0x0125;
                case 408977633: goto L_0x011b;
                case 2032177693: goto L_0x0113;
                default: goto L_0x0112;
            }
        L_0x0112:
            goto L_0x0139
        L_0x0113:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0139
            r1 = 2
            goto L_0x013a
        L_0x011b:
            java.lang.String r5 = "ATTACH_ON_FIRST_RECOGNIZED_TEXT"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0139
            r1 = 0
            goto L_0x013a
        L_0x0125:
            java.lang.String r5 = "ATTACH_ON_THINKING_OR_RECOGNIZED_TEXT"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0139
            r1 = 3
            goto L_0x013a
        L_0x012f:
            java.lang.String r5 = "ATTACH_ON_THINKING_STATE"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0139
            r1 = 1
            goto L_0x013a
        L_0x0139:
            r1 = -1
        L_0x013a:
            r5 = 4
            if (r1 == 0) goto L_0x014f
            if (r1 == r11) goto L_0x014d
            if (r1 == r10) goto L_0x014b
            if (r1 != r9) goto L_0x0145
            r1 = 4
            goto L_0x0150
        L_0x0145:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x014b:
            r1 = 3
            goto L_0x0150
        L_0x014d:
            r1 = 2
            goto L_0x0150
        L_0x014f:
            r1 = 1
        L_0x0150:
            r0.f374563R = r1
            r1 = r64
            r0.f374548C = r1
            r1 = r65
            r0.f374575ad = r1
            int r1 = r22.hashCode()
            switch(r1) {
                case -46998416: goto L_0x017d;
                case 415979091: goto L_0x0173;
                case 2032177693: goto L_0x016b;
                case 2034698722: goto L_0x0162;
                default: goto L_0x0161;
            }
        L_0x0161:
            goto L_0x0187
        L_0x0162:
            java.lang.String r1 = "ATTACH_ON_CREATE"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0187
            goto L_0x0188
        L_0x016b:
            boolean r1 = r2.equals(r7)
            if (r1 == 0) goto L_0x0187
            r6 = 3
            goto L_0x0188
        L_0x0173:
            java.lang.String r1 = "ATTACH_AFTER_SUGGESTION_SHOWN"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0187
            r6 = 1
            goto L_0x0188
        L_0x017d:
            java.lang.String r1 = "ATTACH_ON_EDIT"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0187
            r6 = 2
            goto L_0x0188
        L_0x0187:
            r6 = -1
        L_0x0188:
            if (r6 == 0) goto L_0x019a
            if (r6 == r11) goto L_0x0198
            if (r6 == r10) goto L_0x019b
            if (r6 != r9) goto L_0x0192
            r9 = 4
            goto L_0x019b
        L_0x0192:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x0198:
            r9 = 2
            goto L_0x019b
        L_0x019a:
            r9 = 1
        L_0x019b:
            r0.f374564S = r9
            r1 = r72
            r0.f374551F = r1
            j$.time.Duration r1 = p3186j$.time.Duration.ofMillis(r25)
            r0.f374568W = r1
            r1 = r42
            r3.f375104a = r1
            r3.f375105b = r4
            r0.f374582ak = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.C137711an.<init>(android.content.Context, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, com.google.android.libraries.search.logging.appflows.startup.a.e, java.util.concurrent.atomic.AtomicReference, long, com.google.apps.tiktok.account.AccountId, com.google.android.apps.search.googleapp.search.srp.a, com.google.android.libraries.f.a, com.google.android.apps.search.googleapp.startup.appinteractive.b, com.google.android.apps.search.googleapp.startup.appinteractive.f, com.google.android.libraries.web.contrib.errorpage.a.c, com.google.android.apps.search.googleapp.search.srp.external.h, com.google.android.libraries.search.k.h, com.google.apps.tiktok.concurrent.futuresmixin.e, com.google.android.apps.search.googleapp.search.h.b, com.google.android.apps.search.googleapp.o.c, com.google.android.apps.search.googleapp.search.h.d, com.google.android.apps.search.googleapp.search.srp.e.aa, com.google.android.apps.search.googleapp.search.srp.d.a, com.google.android.apps.search.googleapp.search.srp.g.a, com.google.android.apps.search.googleapp.search.srp.e.ao, com.google.android.apps.search.googleapp.search.srp.w, com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin, com.google.apps.tiktok.dataservice.cv, com.google.android.apps.search.googleapp.search.j.h, com.google.android.apps.search.googleapp.search.k.e, com.google.android.apps.search.googleapp.search.srp.ab, com.google.android.apps.search.googleapp.search.srp.g.b, com.google.android.apps.search.googleapp.silkpane.a.a, com.google.android.apps.search.googleapp.search.i.ae, com.google.android.apps.search.googleapp.search.srp.h.g, com.google.android.apps.search.googleapp.search.srp.interceptor.a, com.google.android.apps.search.googleapp.search.srp.av, com.google.apps.tiktok.lifecycle.flow.i, com.google.apps.tiktok.dataservice.dp, com.google.android.apps.search.googleapp.search.suggest.a.ab, com.google.android.apps.search.googleapp.aa.d.a, com.google.android.apps.search.googleapp.aa.au, com.google.android.apps.search.googleapp.aa.b.a, com.google.android.apps.search.googleapp.j.e, com.google.android.libraries.logging.ve.ab, com.google.android.apps.search.googleapp.search.voicesearch.c.i, com.google.android.libraries.web.base.m, com.google.android.libraries.web.base.t, com.google.android.libraries.web.shared.a.a, com.google.android.libraries.web.shared.a.a, com.google.android.libraries.web.shared.a.a, com.google.android.libraries.web.coordinator.c, com.google.android.libraries.web.coordinator.c, com.google.android.libraries.web.coordinator.c, com.google.android.libraries.web.c.v):void");
    }

    /* renamed from: c */
    public static C137699ab m223821c(AccountId accountId) {
        C137699ab abVar = new C137699ab();
        C68324h.m98669f(abVar);
        C47247a.m84047b(abVar, accountId);
        return abVar;
    }

    /* renamed from: o */
    private final void m223822o() {
        View view = this.f374601t.getView();
        view.getClass();
        Snackbar.m79660p(view, R.string.search_restriction, -1).mo48343h();
    }

    /* renamed from: a */
    public final C137542d mo113913a() {
        if (this.f374554I) {
            return ((C137543b) this.f374550E.mo5768a()).mo113804a();
        }
        C46370ah a = this.f374555J.mo50378a(C62912at.f169862a);
        return a == null ? C137542d.f374085g : (C137542d) a.f121384a;
    }

    /* renamed from: b */
    public final C137886r mo113914b() {
        return ((C137733c) this.f374601t.getChildFragmentManager().f634a.mo671c("HEADER_FRAGMENT")).mo17754z();
    }

    /* renamed from: d */
    public final C43861g mo113915d() {
        return (C43861g) this.f374601t.getChildFragmentManager().f634a.mo671c("WEB_FRAGMENT");
    }

    /* renamed from: e */
    public final C8575bc mo113916e() {
        C46370ah a = this.f374581aj.mo50378a(C62912at.f169862a);
        if (a == null) {
            return null;
        }
        C8575bc bcVar = ((C56745d) a.f121384a).f151445a;
        return bcVar == null ? C8575bc.f29690g : bcVar;
    }

    /* renamed from: f */
    public final void mo113917f() {
        Fragment fragment;
        if (mo113915d() == null && !this.f374601t.isStateSaved()) {
            C47558bi a = C47831fm.m85006a("SearchResultsFragmentPeer#attachWebFragment");
            try {
                C43861g b = C43864j.m77436b(this.f374583b);
                C43678b a2 = C43679c.m77075a(this.f374583b, R.drawable.googleapp_activity_progress_bar, C43675b.f113958d);
                C0154a aVar = new C0154a(this.f374601t.getChildFragmentManager());
                aVar.mo511h(R.id.googleapp_srp_web_container, b, "WEB_FRAGMENT", 1);
                aVar.mo511h(R.id.googleapp_search_loading_bar_container, a2, "LOADING_BAR", 1);
                aVar.mo509f();
                if (this.f374578ag) {
                    AccountId accountId = this.f374583b;
                    C58974d dVar = C137821t.f374950a;
                    C69664n.m101061g(accountId, "accountId");
                    fragment = new C137813l();
                    C68324h.m98669f(fragment);
                    C47247a.m84047b(fragment, accountId);
                } else {
                    fragment = C137811j.m224036a(this.f374583b);
                }
                C43515c.m76782a(b, fragment);
                mo113919i(b);
                a.close();
                return;
            } catch (Throwable th) {
                C137700ac.m223810a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: g */
    public final boolean mo111224g() {
        C43861g d = mo113915d();
        if (d != null && d.mo17754z().f114326h.mo46864k()) {
            return true;
        }
        boolean g = this.f374548C.mo46338g(Predicate.CC.$default$and(new C137716ao(this.f374551F.mo46468a().f113329b, this.f374602u), new C137701ad(this)));
        if (C133933a.m217248a(this.f374585d) != mo113913a().f374090d) {
            C95883aa.m158983d(f374545a.mo56226d(), "Previous query does not match current theme.", 41033, C38505d.f101864b, 147693284);
        }
        String str = (String) this.f374566U.get();
        if (this.f374574ac.mo110979b()) {
            if (g || str == null) {
                C133118a aVar = this.f374572aa;
                ((C59052c) ((C59052c) C133118a.f362913a.mo56224b()).mo56372aa(41417)).mo56386p("#logSrpBackPress");
                aVar.f362916d++;
            } else {
                if (this.f374577af) {
                    this.f374590i.mo50428h(C46438d.m82810b(this.f374573ab.mo110974c(new C58759qy(str))).f121541a, (Object) null, this.f374562Q);
                }
                this.f374566U.set((Object) null);
                C133118a aVar2 = this.f374572aa;
                aVar2.f362916d++;
                aVar2.mo110981a(C37182a.f97780aL.mo40805c(C62722b.OK));
            }
        }
        return g;
    }

    /* renamed from: h */
    public final void mo113918h(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f374601t.requireView().findViewById(R.id.googleapp_srp_web_container);
        viewGroup.getClass();
        if (z) {
            return;
        }
        if ((!mo113913a().equals(C137542d.f374085g) || this.f374553H) && viewGroup.getVisibility() != 8) {
            viewGroup.setVisibility(8);
            m223822o();
        }
    }

    /* renamed from: i */
    public final void mo113919i(C43861g gVar) {
        C137871g gVar2 = this.f374582ak;
        if (gVar2 != null) {
            ((C44381b) new WebModelProvider((Fragment) gVar).mo47072a(C44381b.class)).f115388b = gVar2;
        }
    }

    /* renamed from: j */
    public final void mo113920j() {
        boolean z;
        if (this.f374553H) {
            z = ((C137536j) this.f374549D.mo5768a()).mo113803b();
        } else {
            z = ((Boolean) this.f374559N.orElse(true)).booleanValue();
        }
        if (z) {
            ViewGroup viewGroup = (ViewGroup) this.f374601t.requireView().findViewById(R.id.googleapp_srp_web_container);
            if (viewGroup.getVisibility() != 0) {
                viewGroup.setVisibility(0);
                this.f374591j.mo113750a(C37182a.f98047fN.mo40779c());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if ((r0.f373769a & 1) != 0) goto L_0x0014;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113921k(com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d r14) {
        /*
            r13 = this;
            boolean r0 = r13.f374552G
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x0014
            com.google.android.apps.search.googleapp.search.e.g r0 = r14.f374092f
            if (r0 != 0) goto L_0x000f
            com.google.android.apps.search.googleapp.search.e.g r0 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
        L_0x000f:
            int r0 = r0.f373769a
            r0 = r0 & r1
            if (r0 == 0) goto L_0x001c
        L_0x0014:
            com.google.android.apps.search.googleapp.search.e.g r0 = r14.f374092f
            if (r0 != 0) goto L_0x001a
            com.google.android.apps.search.googleapp.search.e.g r0 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
        L_0x001a:
            java.lang.String r0 = r0.f373770b
        L_0x001c:
            com.google.android.apps.search.googleapp.search.i.ae r0 = r13.f374570Y
            com.google.android.apps.search.googleapp.search.e.g r3 = r14.f374092f
            if (r3 != 0) goto L_0x0025
            com.google.android.apps.search.googleapp.search.e.g r4 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
            goto L_0x0026
        L_0x0025:
            r4 = r3
        L_0x0026:
            java.lang.String r4 = r4.f373770b
            if (r3 != 0) goto L_0x002c
            com.google.android.apps.search.googleapp.search.e.g r3 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
        L_0x002c:
            java.lang.String r3 = r3.f373771c
            boolean r0 = r0.mo113782d(r4, r3)
            boolean r3 = r13.f374579ah
            r4 = 8
            r11 = 0
            if (r3 == 0) goto L_0x0093
            com.google.android.apps.search.googleapp.search.srp.h.g r3 = r13.f374582ak
            if (r3 == 0) goto L_0x0093
            j$.util.Optional r3 = r13.f374559N
            java.lang.Object r3 = r3.orElse(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0093
            int r3 = r14.f374088b
            int r5 = com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137540b.m223424a(r3)
            if (r5 != 0) goto L_0x0054
            goto L_0x0059
        L_0x0054:
            r6 = 11
            if (r5 != r6) goto L_0x0059
            goto L_0x0093
        L_0x0059:
            int r5 = com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137540b.m223424a(r3)
            if (r5 != 0) goto L_0x0060
            goto L_0x0063
        L_0x0060:
            if (r5 != r4) goto L_0x0063
            goto L_0x0093
        L_0x0063:
            int r3 = com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137540b.m223424a(r3)
            if (r3 != 0) goto L_0x006a
            goto L_0x006e
        L_0x006a:
            r5 = 5
            if (r3 != r5) goto L_0x006e
            goto L_0x0093
        L_0x006e:
            com.google.android.libraries.web.coordinator.c r3 = r13.f374576ae
            java.lang.Object r3 = r3.mo5768a()
            r9 = r3
            com.google.android.apps.search.googleapp.search.srp.z r9 = (com.google.android.apps.search.googleapp.search.srp.C137903z) r9
            com.google.android.apps.search.googleapp.search.srp.e.aa r6 = r13.f374594m
            java.lang.String r3 = "searchQuery"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r3)
            java.lang.String r3 = "loadUrlParamsCreator"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r3)
            kotlinx.coroutines.aw r3 = r9.f375223d
            com.google.android.apps.search.googleapp.search.srp.y r12 = new com.google.android.apps.search.googleapp.search.srp.y
            r10 = 0
            r5 = r12
            r7 = r14
            r8 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r5 = 3
            kotlinx.coroutines.be r11 = kotlinx.coroutines.C71803m.m105042c(r3, r11, r11, r12, r5)
        L_0x0093:
            boolean r3 = r13.f374553H
            r5 = 0
            if (r3 == 0) goto L_0x012e
            com.google.android.apps.search.googleapp.search.h.d r0 = r13.f374593l
            r0.mo113762c(r14, r5)
            com.google.android.apps.search.googleapp.search.h.b r0 = r13.f374591j
            r0.mo113755f(r14, r5)
            r13.mo113917f()
            com.google.android.apps.search.googleapp.search.srp.w r0 = r13.f374597p
            java.lang.String r1 = "query"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r1)
            com.google.android.apps.search.googleapp.search.j.j r1 = r0.mo114035a()
            r1.mo113802a()
            com.google.android.apps.search.googleapp.search.j.j r1 = r0.mo114035a()
            boolean r1 = r1.mo113803b()
            if (r1 != 0) goto L_0x00d9
            com.google.android.libraries.web.base.m r14 = r0.f375200a
            com.google.android.libraries.web.base.b.d r14 = (com.google.android.libraries.web.base.p3348b.C43251d) r14
            android.support.v4.app.Fragment r14 = r14.f113024a
            com.google.android.libraries.web.coordinator.internal.fragment.WebCoordinatorInternal r14 = com.google.android.libraries.web.coordinator.internal.fragment.C43756o.m77265a(r14)
            android.support.v4.app.Fragment r14 = r14.f114092a
            android.view.View r14 = r14.requireView()
            r0 = 2132092165(0x7f152505, float:1.9824719E38)
            r1 = -1
            com.google.android.material.snackbar.Snackbar r14 = com.google.android.material.snackbar.Snackbar.m79660p(r14, r0, r1)
            r14.mo48343h()
            return
        L_0x00d9:
            boolean r1 = r0.f375205f
            if (r1 == 0) goto L_0x00e9
            com.google.android.libraries.web.coordinator.c r1 = r0.f375209j
            java.lang.Object r1 = r1.mo5768a()
            com.google.android.apps.search.googleapp.search.k.b r1 = (com.google.android.apps.search.googleapp.search.p10420k.C137543b) r1
            r1.mo113805b(r14)
            goto L_0x00f0
        L_0x00e9:
            com.google.apps.tiktok.cache.p r1 = r0.f375207h
            com.google.protobuf.at r2 = com.google.protobuf.C62912at.f169862a
            r1.mo50381d(r2, r14)
        L_0x00f0:
            com.google.android.apps.search.googleapp.search.i.ae r1 = r0.f375202c
            com.google.android.apps.search.googleapp.search.e.g r2 = r14.f374092f
            if (r2 != 0) goto L_0x00f9
            com.google.android.apps.search.googleapp.search.e.g r3 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
            goto L_0x00fa
        L_0x00f9:
            r3 = r2
        L_0x00fa:
            java.lang.String r3 = r3.f373770b
            if (r2 != 0) goto L_0x0100
            com.google.android.apps.search.googleapp.search.e.g r2 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
        L_0x0100:
            java.lang.String r2 = r2.f373771c
            boolean r1 = r1.mo113782d(r3, r2)
            com.google.apps.tiktok.cache.p r2 = r0.f375208i
            r2.mo50380c()
            r0.mo114037c(r14, r1, r11)
            com.google.android.apps.search.googleapp.search.suggest.a.ab r1 = r0.f375203d
            com.google.android.apps.search.googleapp.search.e.g r14 = r14.f374092f
            if (r14 != 0) goto L_0x0116
            com.google.android.apps.search.googleapp.search.e.g r14 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
        L_0x0116:
            java.lang.String r14 = r14.f373770b
            com.google.android.libraries.f.a r2 = r0.f375204e
            long r2 = r2.mo26870b()
            r1.mo114048d(r14, r2)
            com.google.android.apps.search.googleapp.search.suggest.a.ab r14 = r0.f375203d
            r14.mo114046b()
            com.google.android.apps.search.googleapp.search.suggest.a.ab r14 = r0.f375203d
            j$.time.Duration r0 = r0.f375206g
            r14.mo114045a(r0)
            return
        L_0x012e:
            com.google.apps.tiktok.dataservice.cv r3 = r13.f374569X
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60866ct.f164955a
            com.google.apps.tiktok.tracing.contrib.b.f r6 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r6)
            com.google.android.apps.search.googleapp.search.j.h r7 = r13.f374599r
            com.google.apps.tiktok.dataservice.ag r7 = r7.mo113800a()
            com.google.apps.tiktok.dataservice.bc r7 = (com.google.apps.tiktok.dataservice.C46719bc) r7
            java.lang.Object r7 = r7.f122035b
            r3.mo50787a(r6, r7)
            com.google.android.apps.search.googleapp.search.h.d r3 = r13.f374593l
            r3.mo113762c(r14, r5)
            com.google.android.apps.search.googleapp.search.h.b r3 = r13.f374591j
            r3.mo113755f(r14, r5)
            r13.mo113917f()
            boolean r3 = r13.f374554I
            if (r3 == 0) goto L_0x0160
            com.google.android.libraries.web.coordinator.c r3 = r13.f374550E
            java.lang.Object r3 = r3.mo5768a()
            com.google.android.apps.search.googleapp.search.k.b r3 = (com.google.android.apps.search.googleapp.search.p10420k.C137543b) r3
            r3.mo113805b(r14)
            goto L_0x0167
        L_0x0160:
            com.google.apps.tiktok.cache.p r3 = r13.f374555J
            com.google.protobuf.at r5 = com.google.protobuf.C62912at.f169862a
            r3.mo50381d(r5, r14)
        L_0x0167:
            boolean r3 = r13.f374579ah
            if (r3 == 0) goto L_0x016c
            goto L_0x0182
        L_0x016c:
            com.google.android.apps.search.googleapp.search.i.ae r0 = r13.f374570Y
            com.google.android.apps.search.googleapp.search.e.g r3 = r14.f374092f
            if (r3 != 0) goto L_0x0175
            com.google.android.apps.search.googleapp.search.e.g r5 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
            goto L_0x0176
        L_0x0175:
            r5 = r3
        L_0x0176:
            java.lang.String r5 = r5.f373770b
            if (r3 != 0) goto L_0x017c
            com.google.android.apps.search.googleapp.search.e.g r3 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
        L_0x017c:
            java.lang.String r3 = r3.f373771c
            boolean r0 = r0.mo113782d(r5, r3)
        L_0x0182:
            com.google.android.apps.search.googleapp.search.srp.r r3 = r13.mo113914b()
            com.google.android.apps.search.googleapp.search.e.g r5 = r14.f374092f
            if (r5 != 0) goto L_0x018c
            com.google.android.apps.search.googleapp.search.e.g r5 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
        L_0x018c:
            int r5 = r5.f373774f
            int r5 = com.google.android.apps.search.googleapp.search.p10409e.C137415d.m223276a(r5)
            if (r5 != 0) goto L_0x0195
            goto L_0x0196
        L_0x0195:
            r1 = r5
        L_0x0196:
            r3.mo114024i(r1)
            j$.util.Optional r1 = r13.f374559N
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x01b8
            com.google.common.f.a.d r1 = f374545a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r3 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b
            r5 = 145005885(0x8a49d3d, float:9.9073575E-34)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Taking too long to fetch search permission"
            r7 = 41029(0xa045, float:5.7494E-41)
            com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa.m158983d(r1, r6, r7, r3, r5)
        L_0x01b8:
            com.google.android.apps.search.googleapp.search.srp.ab r1 = r13.f374601t
            android.view.View r1 = r1.getView()
            r1.getClass()
            r3 = 2131431941(0x7f0b1205, float:1.8485625E38)
            android.view.View r1 = r1.findViewById(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            j$.util.Optional r3 = r13.f374559N
            java.lang.Object r2 = r3.orElse(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x01df
            r1.setVisibility(r4)
            r13.m223822o()
            goto L_0x01f6
        L_0x01df:
            com.google.apps.tiktok.cache.p r2 = r13.f374581aj
            r2.mo50380c()
            r2 = 4
            r1.setVisibility(r2)
            com.google.android.apps.search.googleapp.search.h.b r1 = r13.f374591j
            r1.mo113756g()
            com.google.android.apps.search.googleapp.search.k.a.d r1 = r13.mo113913a()
            com.google.android.apps.search.googleapp.search.srp.w r2 = r13.f374597p
            r2.mo114037c(r1, r0, r11)
        L_0x01f6:
            com.google.android.apps.search.googleapp.search.suggest.a.ab r0 = r13.f374571Z
            com.google.android.apps.search.googleapp.search.e.g r14 = r14.f374092f
            if (r14 != 0) goto L_0x01fe
            com.google.android.apps.search.googleapp.search.e.g r14 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
        L_0x01fe:
            java.lang.String r14 = r14.f373770b
            com.google.android.libraries.f.a r1 = r13.f374567V
            long r1 = r1.mo26870b()
            r0.mo114048d(r14, r1)
            com.google.android.apps.search.googleapp.search.suggest.a.ab r14 = r13.f374571Z
            r14.mo114046b()
            com.google.android.apps.search.googleapp.search.suggest.a.ab r14 = r13.f374571Z
            j$.time.Duration r0 = r13.f374568W
            r14.mo114045a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.C137711an.mo113921k(com.google.android.apps.search.googleapp.search.k.a.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r0 = com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137540b.m223424a(r0.f374088b);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo113922l() {
        /*
            r2 = this;
            com.google.android.apps.search.googleapp.search.k.a.d r0 = r2.mo113913a()
            com.google.android.apps.search.googleapp.search.e.g r1 = r0.f374092f
            if (r1 != 0) goto L_0x000a
            com.google.android.apps.search.googleapp.search.e.g r1 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
        L_0x000a:
            java.lang.String r1 = r1.f373770b
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0025
            int r0 = r0.f374088b
            int r0 = com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137540b.m223424a(r0)
            if (r0 != 0) goto L_0x001f
            goto L_0x0025
        L_0x001f:
            r1 = 8
            if (r0 != r1) goto L_0x0025
            r0 = 1
            return r0
        L_0x0025:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.C137711an.mo113922l():boolean");
    }

    /* renamed from: m */
    public final boolean mo113923m() {
        C137418g gVar = mo113913a().f374092f;
        if (gVar == null) {
            gVar = C137418g.f373767r;
        }
        if (!gVar.f373770b.isEmpty()) {
            return true;
        }
        C137418g gVar2 = mo113913a().f374092f;
        if (gVar2 == null) {
            gVar2 = C137418g.f373767r;
        }
        return !gVar2.f373775g.isEmpty();
    }

    /* renamed from: n */
    public final boolean mo113924n(String str, Map map, C137770au auVar) {
        C137483ac acVar;
        boolean z = false;
        if (!this.f374580ai) {
            return false;
        }
        C137546e eVar = this.f374600s;
        boolean a = C133933a.m217248a(this.f374585d);
        C137418g gVar = mo113913a().f374092f;
        if (gVar == null) {
            gVar = C137418g.f373767r;
        }
        C137542d b = eVar.mo113807b(str, a, gVar.f373771c, 2, map);
        C137418g gVar2 = b.f374092f;
        if (gVar2 == null) {
            gVar2 = C137418g.f373767r;
        }
        if (!gVar2.f373770b.trim().isEmpty()) {
            C137485ae aeVar = this.f374570Y;
            C137418g gVar3 = b.f374092f;
            String str2 = (gVar3 == null ? C137418g.f373767r : gVar3).f373770b;
            if (gVar3 == null) {
                gVar3 = C137418g.f373767r;
            }
            C137484ad c = C137484ad.m223375c(str2, gVar3.f373771c);
            C137750aa aaVar = this.f374594m;
            C69664n.m101061g(b, "query");
            C69664n.m101061g(auVar, "srpPrefetchType");
            C60870cx a2 = C71663i.m104688a(C71803m.m105042c(aaVar.f374714a, (C69585o) null, (C71424ay) null, new C137801z(aaVar, b, auVar, (C69577g) null), 3));
            Profile d = this.f374575ad.mo46386d();
            synchronized (aeVar.f373939b) {
                if (aeVar.mo113781c(c)) {
                    C60870cx a3 = aeVar.f373941d.mo111320a();
                    z = true;
                    aeVar.f373946i.add(new C137483ac(aeVar, c, auVar, new C60817ay(C60856cj.m92895d(a3, a2).mo57334a(C47810es.m84978r(new C137522x(a2, a3)), C60826bg.f164896a)).mo57273f(C47810es.m84968h(new C137523y(aeVar, d)), C60826bg.f164896a)));
                    aeVar.f373947j = aeVar.f373942e.mo26871c();
                    if (aeVar.f373946i.size() > 1 && (acVar = (C137483ac) aeVar.f373946i.poll()) != null) {
                        acVar.mo113776a();
                    }
                }
            }
        }
        return z;
    }
}
