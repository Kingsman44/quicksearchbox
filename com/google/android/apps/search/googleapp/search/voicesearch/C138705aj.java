package com.google.android.apps.search.googleapp.search.voicesearch;

import android.content.Context;
import android.os.PowerManager;
import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.search.p10410f.C137447w;
import com.google.android.apps.search.googleapp.search.srp.C137733c;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.LogoView;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138728b;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138767d;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138772i;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.android.apps.search.googleapp.startup.p10514a.C139676e;
import com.google.android.apps.search.soundsearch.p10653b.C141639a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.aj */
/* compiled from: PG */
public final class C138705aj {

    /* renamed from: a */
    public static final C59071e f377236a = C59071e.m91332i("com.google.android.apps.search.googleapp.search.voicesearch.aj");

    /* renamed from: b */
    public final AccountId f377237b;

    /* renamed from: c */
    public final C89859i f377238c;

    /* renamed from: d */
    public final Context f377239d;

    /* renamed from: e */
    public final C139680b f377240e;

    /* renamed from: f */
    public final C139676e f377241f;

    /* renamed from: g */
    public final C141639a f377242g;

    /* renamed from: h */
    public final C28443m f377243h;

    /* renamed from: i */
    public final PowerManager f377244i;

    /* renamed from: j */
    public final C138916x f377245j;

    /* renamed from: k */
    public final C137447w f377246k;

    /* renamed from: l */
    public final C46801dp f377247l;

    /* renamed from: m */
    public final C47770dh f377248m;

    /* renamed from: n */
    public final C138728b f377249n;

    /* renamed from: o */
    public final C28306ab f377250o;

    /* renamed from: p */
    public final C138767d f377251p;

    /* renamed from: q */
    public final C138772i f377252q;

    /* renamed from: r */
    public final C139708c f377253r;

    /* renamed from: s */
    public final boolean f377254s;

    /* renamed from: t */
    public final boolean f377255t;

    /* renamed from: u */
    public String f377256u;

    /* renamed from: v */
    public boolean f377257v = false;

    /* renamed from: w */
    private final boolean f377258w;

    /* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.aj$a */
    /* compiled from: PG */
    final class C138706a implements C46792di {
        public C138706a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C138705aj.f377236a.mo56226d()).mo56382g(th)).mo56372aa(41288)).mo56386p("Failed to get phase 2 UI state update.");
            C138705aj.this.f377238c.mo83702b(C89849ae.TNG_VOICE_SEARCH_FAILURE);
            C138705aj.this.mo114482h(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
            r3 = r8.f377259a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0113, code lost:
            r9 = r8.f377259a;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ void mo18078b(java.lang.Object r9) {
            /*
                r8 = this;
                com.google.android.apps.search.googleapp.search.voicesearch.c.y r9 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r9
                com.google.android.apps.search.googleapp.search.voicesearch.aj r0 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                com.google.android.apps.search.googleapp.search.f.w r0 = r0.f377246k
                com.google.android.apps.search.googleapp.search.f.ab r0 = r0.f373842b
                r0.mo113717a(r9)
                com.google.android.apps.search.googleapp.search.voicesearch.aj r0 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                com.google.android.apps.search.googleapp.search.voicesearch.x r0 = r0.f377245j
                android.view.View r0 = r0.getView()
                if (r0 != 0) goto L_0x0017
                goto L_0x0153
            L_0x0017:
                int r1 = r9.f377533a
                r2 = 1
                r1 = r1 & r2
                if (r1 == 0) goto L_0x003c
                java.lang.String r1 = r9.f377538f
                com.google.android.apps.search.googleapp.search.voicesearch.aj r3 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                java.lang.String r3 = r3.f377256u
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L_0x003c
                boolean r1 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.m225263g(r9)
                if (r1 != 0) goto L_0x003c
                com.google.android.apps.search.googleapp.search.voicesearch.aj r1 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                java.lang.String r3 = r9.f377538f
                r1.mo114478c(r3)
                com.google.android.apps.search.googleapp.search.voicesearch.aj r1 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                java.lang.String r3 = r9.f377538f
                r1.f377256u = r3
            L_0x003c:
                r1 = 2131431691(0x7f0b110b, float:1.8485118E38)
                android.view.View r0 = r0.findViewById(r1)
                com.google.android.apps.search.googleapp.search.voicesearch.logoview.LogoView r0 = (com.google.android.apps.search.googleapp.search.voicesearch.logoview.LogoView) r0
                java.lang.String r1 = r9.f377535c
                boolean r3 = r1.isEmpty()
                if (r3 != 0) goto L_0x0099
                com.google.android.apps.search.googleapp.search.voicesearch.aj r3 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                com.google.android.apps.search.googleapp.search.srp.c r4 = r3.mo114476a()
                if (r4 != 0) goto L_0x0056
                goto L_0x0099
            L_0x0056:
                com.google.android.apps.search.googleapp.search.srp.r r5 = r4.mo17754z()
                android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.START
                com.google.android.apps.search.googleapp.search.srp.f.c r5 = r5.mo114017b()
                r5.getClass()
                com.google.android.apps.search.googleapp.search.srp.f.g r5 = r5.mo17754z()
                android.widget.TextView r5 = r5.mo113997a()
                r5.getClass()
                r5.setEllipsize(r6)
                com.google.android.apps.search.googleapp.search.srp.r r5 = r4.mo17754z()
                r5.mo114020e(r1)
                com.google.android.apps.search.googleapp.search.srp.r r5 = r4.mo17754z()
                android.content.Context r6 = r3.f377239d
                android.content.res.Resources r6 = r6.getResources()
                r7 = 2131102117(0x7f0609a5, float:1.7816663E38)
                int r6 = r6.getColor(r7)
                r5.mo114021f(r6)
                com.google.android.apps.search.googleapp.search.srp.r r4 = r4.mo17754z()
                int r5 = r1.length()
                r4.mo114019d(r5)
                r3.f377257v = r2
            L_0x0099:
                boolean r3 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.m225263g(r9)
                r4 = 0
                if (r3 == 0) goto L_0x00a5
                com.google.android.apps.search.googleapp.search.voicesearch.aj r3 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                r3.mo114478c(r4)
            L_0x00a5:
                int r9 = r9.f377534b
                int r9 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x.m225440b(r9)
                if (r9 != 0) goto L_0x00ae
                r9 = 1
            L_0x00ae:
                int r9 = r9 + -2
                r3 = 4
                r5 = 0
                switch(r9) {
                    case 1: goto L_0x014b;
                    case 2: goto L_0x0141;
                    case 3: goto L_0x0107;
                    case 4: goto L_0x00de;
                    case 5: goto L_0x00cf;
                    case 6: goto L_0x0138;
                    case 7: goto L_0x00c3;
                    case 8: goto L_0x00bd;
                    case 9: goto L_0x00b7;
                    default: goto L_0x00b5;
                }
            L_0x00b5:
                goto L_0x0153
            L_0x00b7:
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                r9.mo114482h(r5)
                return
            L_0x00bd:
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                r9.mo114481f()
                return
            L_0x00c3:
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                com.google.android.apps.search.googleapp.search.voicesearch.c.d r9 = r9.f377251p
                r9.f377450c = r4
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                r9.mo114482h(r5)
                return
            L_0x00cf:
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                r9.mo114481f()
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                com.google.android.apps.gsa.shared.logger.b.i r9 = r9.f377238c
                com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TNG_VOICE_SEARCH_ASSISTANT_HANDOFF
                r9.mo83702b(r0)
                return
            L_0x00de:
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                r9.mo114481f()
                boolean r9 = r1.isEmpty()
                if (r9 != 0) goto L_0x0101
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                com.google.android.apps.gsa.shared.logger.b.i r9 = r9.f377238c
                com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TNG_VOICE_SEARCH_COMMIT
                r9.mo83702b(r0)
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                com.google.android.apps.search.googleapp.t.f.c r9 = r9.f377253r
                r9.mo115178e()
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                com.google.android.apps.search.googleapp.search.voicesearch.c.b r9 = r9.f377249n
                r9.mo114503a()
                return
            L_0x0101:
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                r9.mo114482h(r5)
                return
            L_0x0107:
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                boolean r9 = r9.f377255t
                if (r9 == 0) goto L_0x0138
                boolean r9 = r1.isEmpty()
                if (r9 == 0) goto L_0x012f
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                com.google.android.apps.search.googleapp.search.srp.c r1 = r9.mo114476a()
                if (r1 == 0) goto L_0x012f
                com.google.android.apps.search.googleapp.search.srp.r r1 = r1.mo17754z()
                android.content.Context r9 = r9.f377239d
                android.content.res.Resources r9 = r9.getResources()
                r2 = 2132087734(0x7f1513b6, float:1.9815732E38)
                java.lang.String r9 = r9.getString(r2)
                r1.mo114020e(r9)
            L_0x012f:
                r0.mo114549f(r3)
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                r9.mo114481f()
                return
            L_0x0138:
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                r9.mo114480e()
                r0.mo114549f(r3)
                return
            L_0x0141:
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                r9.mo114480e()
                r9 = 2
                r0.mo114549f(r9)
                return
            L_0x014b:
                com.google.android.apps.search.googleapp.search.voicesearch.aj r9 = com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.this
                r9.mo114480e()
                r0.mo114549f(r2)
            L_0x0153:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.C138706a.mo18078b(java.lang.Object):void");
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C138705aj(Context context, boolean z, C89859i iVar, boolean z2, boolean z3, AccountId accountId, C139680b bVar, C139676e eVar, C141639a aVar, C28443m mVar, PowerManager powerManager, C138916x xVar, C137447w wVar, C46801dp dpVar, C47770dh dhVar, C138728b bVar2, C28306ab abVar, C138767d dVar, C138772i iVar2, C139708c cVar) {
        this.f377237b = accountId;
        this.f377238c = iVar;
        this.f377239d = context;
        this.f377240e = bVar;
        this.f377254s = z;
        this.f377258w = z2;
        this.f377255t = z3;
        this.f377241f = eVar;
        this.f377245j = xVar;
        this.f377243h = mVar;
        this.f377244i = powerManager;
        this.f377246k = wVar;
        this.f377242g = aVar;
        this.f377247l = dpVar;
        this.f377248m = dhVar;
        this.f377249n = bVar2;
        this.f377250o = abVar;
        this.f377251p = dVar;
        this.f377252q = iVar2;
        this.f377253r = cVar;
    }

    /* renamed from: g */
    public static boolean m225263g(C138788y yVar) {
        int b = C138787x.m225440b(yVar.f377534b);
        if (b == 0) {
            b = 1;
        }
        switch (b - 2) {
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: j */
    private static boolean m225264j(View view) {
        return view.findViewById(R.id.googleapp_voice_search_speaking_gif_animation) != null && view.findViewById(R.id.googleapp_voice_search_speaking_gif_stub) == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C137733c mo114476a() {
        return (C137733c) this.f377245j.getChildFragmentManager().f634a.mo671c("VOICE_HEADER_FRAGMENT");
    }

    /* renamed from: b */
    public final void mo114477b() {
        if (this.f377252q.mo114526e()) {
            this.f377251p.mo114518a();
        } else {
            mo114482h(1);
        }
    }

    /* renamed from: c */
    public final void mo114478c(String str) {
        View view = this.f377245j.getView();
        View findViewById = view.findViewById(R.id.googleapp_search_a_song);
        View findViewById2 = view.findViewById(R.id.googleapp_logo_view);
        C28306ab.m52929e(findViewById);
        C28306ab.m52929e(findViewById2);
        if (str != null) {
            C28306ab abVar = this.f377250o;
            C28313c a = abVar.f76990a.mo33805a(C28427h.m53115a(125789));
            a.mo33858f(C138686a.m225249a(str));
            abVar.mo33801b(findViewById, a);
            C28306ab abVar2 = this.f377250o;
            C28313c a2 = abVar2.f76990a.mo33805a(C28427h.m53115a(96087));
            a2.mo33858f(C138686a.m225249a(str));
            abVar2.mo33801b(findViewById2, a2);
            return;
        }
        C28306ab abVar3 = this.f377250o;
        abVar3.mo33801b(findViewById, abVar3.f76990a.mo33805a(C28427h.m53115a(125789)));
        C28306ab abVar4 = this.f377250o;
        abVar4.mo33801b(findViewById2, abVar4.f76990a.mo33805a(C28427h.m53115a(96087)));
    }

    /* renamed from: d */
    public final void mo114479d() {
        C137733c a = mo114476a();
        if (a != null) {
            a.mo17754z().mo114020e(this.f377239d.getResources().getString(R.string.listening_text));
            a.mo17754z().mo114021f(this.f377239d.getResources().getColor(R.color.googleapp_unstable_grey));
            a.mo17754z().mo114019d(0);
            this.f377257v = false;
        }
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo114480e() {
        /*
            r4 = this;
            boolean r0 = r4.f377258w
            if (r0 == 0) goto L_0x006a
            com.google.android.apps.search.googleapp.search.voicesearch.x r0 = r4.f377245j
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r1 = 1
            if (r0 != r1) goto L_0x006a
            com.google.android.apps.search.googleapp.search.voicesearch.x r0 = r4.f377245j
            android.view.View r0 = r0.getView()
            if (r0 != 0) goto L_0x002a
            com.google.common.f.e r0 = f377236a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "#startSpeakingGif failed, no root view"
            r2 = 41289(0xa149, float:5.7858E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            return
        L_0x002a:
            r1 = 2131432091(0x7f0b129b, float:1.848593E38)
            android.view.View r2 = r0.findViewById(r1)
            com.airbnb.lottie.LottieAnimationView r2 = (com.airbnb.lottie.LottieAnimationView) r2
            boolean r3 = m225264j(r0)
            if (r3 == 0) goto L_0x003a
            goto L_0x0053
        L_0x003a:
            r2 = 2131432092(0x7f0b129c, float:1.8485932E38)
            android.view.View r2 = r0.findViewById(r2)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r2.inflate()
            android.view.View r0 = r0.findViewById(r1)
            r2 = r0
            com.airbnb.lottie.LottieAnimationView r2 = (com.airbnb.lottie.LottieAnimationView) r2
            com.airbnb.lottie.ac r0 = r2.f15138d
            r1 = 0
            r0.mo9773j(r1)
        L_0x0053:
            int r0 = r2.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x005f
            r0 = 0
            r2.setVisibility(r0)
        L_0x005f:
            com.airbnb.lottie.ac r0 = r2.f15138d
            boolean r0 = r0.mo9774k()
            if (r0 != 0) goto L_0x006a
            r2.mo9695f()
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.C138705aj.mo114480e():void");
    }

    /* renamed from: f */
    public final void mo114481f() {
        View view = this.f377245j.getView();
        if (view == null) {
            ((C59052c) ((C59052c) f377236a.mo56226d()).mo56372aa(41290)).mo56386p("#stopSpeakingGif failed, no root view");
        } else if (m225264j(view)) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.googleapp_voice_search_speaking_gif_animation);
            if (lottieAnimationView.getVisibility() != 8) {
                lottieAnimationView.mo9692c();
                lottieAnimationView.setVisibility(8);
            }
        }
    }

    /* renamed from: h */
    public final void mo114482h(int i) {
        mo114483i(i);
        View view = this.f377245j.getView();
        view.getClass();
        ((LogoView) view.findViewById(R.id.googleapp_logo_view)).mo114549f(8);
        View view2 = this.f377245j.getView();
        view2.getClass();
        ((TextView) view2.findViewById(R.id.googleapp_sbt_error_text)).setVisibility(0);
        C137733c a = mo114476a();
        if (a != null) {
            a.mo17754z().mo114020e(this.f377239d.getResources().getString(R.string.googleapp_tap_mic));
            a.mo17754z().mo114021f(this.f377239d.getResources().getColor(R.color.googleapp_unstable_grey));
            this.f377257v = false;
        }
    }

    /* renamed from: i */
    public final void mo114483i(int i) {
        this.f377251p.mo114521d(i);
        mo114481f();
    }
}
