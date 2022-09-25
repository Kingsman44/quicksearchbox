package com.google.android.apps.search.googleapp.search.voicesearch;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1745d;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p098j.C2043bi;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.search.p10410f.C137447w;
import com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher.C138803a;
import com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher.C138804b;
import com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher.C138805c;
import com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher.C138806d;
import com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher.C138807e;
import com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher.C138809g;
import com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher.VoiceSearchLanguageSwitcherSpinner;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.LogoView;
import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138716b;
import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138717c;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138767d;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138772i;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y;
import com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a.C138880n;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139684f;
import com.google.android.apps.search.googleapp.startup.p10514a.C139676e;
import com.google.android.apps.search.soundsearch.p10653b.C141639a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.r */
/* compiled from: PG */
public final class C138859r {

    /* renamed from: a */
    public static final C59071e f377691a = C59071e.m91332i("com.google.android.apps.search.googleapp.search.voicesearch.r");

    /* renamed from: A */
    public String f377692A;

    /* renamed from: B */
    public boolean f377693B = false;

    /* renamed from: C */
    public C138716b f377694C;

    /* renamed from: D */
    public C138809g f377695D;

    /* renamed from: E */
    final C46792di f377696E = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C138716b bVar = (C138716b) obj;
            C138859r rVar = C138859r.this;
            rVar.f377694C = bVar;
            if (rVar.f377723y) {
                if (!bVar.mo114496a().isEmpty()) {
                    C138859r rVar2 = C138859r.this;
                    if (rVar2.mo114603a() != null) {
                        C138859r.m225589c((ConstraintLayout) rVar2.f377709k.requireView());
                        if (rVar2.f377695D == null) {
                            rVar2.f377695D = new C138809g(rVar2.f377709k.requireContext(), rVar2.f377720v);
                        }
                        VoiceSearchLanguageSwitcherSpinner a = rVar2.mo114603a();
                        C138809g gVar = rVar2.f377695D;
                        a.setAdapter((SpinnerAdapter) gVar);
                        gVar.f377569e = a;
                        C2043bi.m5526T(a, new C138807e(gVar));
                        String c = rVar2.f377694C.mo114498c();
                        C58485gu a2 = rVar2.f377694C.mo114496a();
                        TreeSet treeSet = new TreeSet();
                        treeSet.add(c);
                        treeSet.addAll(a2);
                        gVar.f377566b.clear();
                        gVar.f377566b.addAll(treeSet);
                        gVar.f377568d.clear();
                        gVar.f377568d = (List) Collection.EL.stream(gVar.f377566b).map(new C138805c((Map) Collection.EL.stream(gVar.f377566b).collect(Collectors.groupingBy(C138803a.f377559a, C138804b.f377560a, Collectors.counting())))).collect(Collectors.toCollection(C138806d.f377562a));
                        if (gVar.f377567c) {
                            gVar.f377568d.add(gVar.f377565a.getString(R.string.googleapp_language_switcher_auto_option));
                        }
                        gVar.notifyDataSetChanged();
                        if (gVar.f377567c && gVar.f377570f) {
                            gVar.f377569e.setSelection(gVar.f377568d.size() - 1, false);
                        } else if (gVar.mo114539a(c) != gVar.f377569e.getSelectedItemPosition()) {
                            gVar.f377569e.setSelection(gVar.mo114539a(c), false);
                        }
                        rVar2.mo114603a().setOnItemSelectedListener(new C138914v(rVar2));
                        rVar2.mo114603a().f377557f = rVar2.f377698G;
                        rVar2.mo114603a().setVisibility(0);
                        View view = rVar2.f377709k.getView();
                        view.getClass();
                        view.findViewById(R.id.googleapp_assistant_logo).setVisibility(8);
                        return;
                    }
                    return;
                }
                C138859r rVar3 = C138859r.this;
                rVar3.f377724z = false;
                View view2 = rVar3.f377709k.getView();
                view2.getClass();
                LogoView logoView = (LogoView) view2.findViewById(R.id.googleapp_logo_view);
                C1745d dVar = (C1745d) logoView.getLayoutParams();
                dVar.setMargins(0, 150, 0, 0);
                logoView.setLayoutParams(dVar);
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: F */
    final C46792di f377697F = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            Boolean bool = (Boolean) obj;
            C138859r rVar = C138859r.this;
            if (rVar.f377695D == null) {
                rVar.f377695D = new C138809g(C138859r.this.f377709k.requireContext(), C138859r.this.f377720v);
            }
            C138859r.this.f377695D.f377570f = bool.booleanValue();
            C138859r.this.f377716r.f377451d = bool.booleanValue();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: G */
    final C138858q f377698G = new C138858q(this);

    /* renamed from: H */
    private final boolean f377699H;

    /* renamed from: b */
    public final C138717c f377700b;

    /* renamed from: c */
    public final C89859i f377701c;

    /* renamed from: d */
    public final C139680b f377702d;

    /* renamed from: e */
    public final C139684f f377703e;

    /* renamed from: f */
    public final C46723bg f377704f;

    /* renamed from: g */
    public final C139676e f377705g;

    /* renamed from: h */
    public final C141639a f377706h;

    /* renamed from: i */
    public final C28443m f377707i;

    /* renamed from: j */
    public final C68214a f377708j;

    /* renamed from: k */
    public final C138789d f377709k;

    /* renamed from: l */
    public final C46778cv f377710l;

    /* renamed from: m */
    public final C137447w f377711m;

    /* renamed from: n */
    public final C38802e f377712n;

    /* renamed from: o */
    public final C46801dp f377713o;

    /* renamed from: p */
    public final C47770dh f377714p;

    /* renamed from: q */
    public final C28306ab f377715q;

    /* renamed from: r */
    public final C138767d f377716r;

    /* renamed from: s */
    public final C138772i f377717s;

    /* renamed from: t */
    public final C139708c f377718t;

    /* renamed from: u */
    public final C138880n f377719u;

    /* renamed from: v */
    public final boolean f377720v;

    /* renamed from: w */
    public final boolean f377721w;

    /* renamed from: x */
    public final boolean f377722x;

    /* renamed from: y */
    public final boolean f377723y;

    /* renamed from: z */
    public boolean f377724z;

    /* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.r$a */
    /* compiled from: PG */
    final class C138862a implements C46792di {
        public C138862a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C138859r.f377691a.mo56226d()).mo56382g(th)).mo56372aa(41284)).mo56386p("Failed to get phase 2 UI state update.");
            C138859r.this.f377701c.mo83702b(C89849ae.TNG_VOICE_SEARCH_FAILURE);
            C138859r.this.mo114608i(0);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C138788y yVar = (C138788y) obj;
            C138859r.this.f377711m.f373842b.mo113717a(yVar);
            View view = C138859r.this.f377709k.getView();
            if (view != null) {
                if ((yVar.f377533a & 1) != 0 && !yVar.f377538f.equals(C138859r.this.f377692A) && !C138859r.m225590g(yVar)) {
                    C138859r.this.mo114605d(yVar.f377538f);
                    C138859r.this.f377692A = yVar.f377538f;
                }
                LogoView logoView = (LogoView) view.findViewById(R.id.googleapp_logo_view);
                String str = yVar.f377535c;
                if (!str.isEmpty()) {
                    ((TextView) view.findViewById(R.id.googleapp_voice_results_text)).setText(str);
                    C138859r.this.f377693B = true;
                } else if (C138859r.this.f377722x) {
                    TextView textView = (TextView) view.findViewById(R.id.googleapp_voice_results_text);
                    if (textView.getText().toString().equals(C138859r.this.f377709k.getResources().getString(R.string.googleapp_show_waiting_text))) {
                        textView.setText(R.string.listening_text);
                    }
                }
                if (yVar.f377537e) {
                    C138859r rVar = C138859r.this;
                    if (rVar.f377724z && !rVar.f377723y) {
                        View view2 = rVar.f377709k.getView();
                        if (view2 == null) {
                            ((C59052c) ((C59052c) C138859r.f377691a.mo56226d()).mo56372aa(41285)).mo56386p("#showAssistantBranding failed, no root view");
                        } else {
                            ((ImageView) view2.findViewById(R.id.googleapp_assistant_logo)).setVisibility(0);
                        }
                    }
                }
                if (C138859r.m225590g(yVar)) {
                    C138859r.this.mo114605d((String) null);
                }
                int b = C138787x.m225440b(yVar.f377534b);
                if (b == 0) {
                    b = 1;
                }
                switch (b - 2) {
                    case 1:
                        C138859r.this.mo114606e();
                        logoView.mo114549f(1);
                        return;
                    case 2:
                        C138859r.this.mo114606e();
                        logoView.mo114549f(2);
                        return;
                    case 3:
                        if (C138859r.this.f377722x) {
                            if (str.isEmpty()) {
                                ((TextView) view.findViewById(R.id.googleapp_voice_results_text)).setText(R.string.googleapp_show_waiting_text);
                            }
                            logoView.mo114549f(4);
                            C138859r.this.mo114607f();
                            return;
                        }
                        break;
                    case 4:
                        C138859r.this.mo114607f();
                        if (!str.isEmpty()) {
                            C138859r.this.f377701c.mo83702b(C89849ae.TNG_VOICE_SEARCH_COMMIT);
                            C138859r.this.f377718t.mo115178e();
                            return;
                        }
                        C138859r.this.mo114608i(0);
                        return;
                    case 5:
                        C138859r.this.mo114607f();
                        C138859r.this.f377701c.mo83702b(C89849ae.TNG_VOICE_SEARCH_ASSISTANT_HANDOFF);
                        return;
                    case 6:
                        break;
                    case 7:
                        C138859r.this.f377716r.f377450c = null;
                        C138859r.this.mo114608i(0);
                        return;
                    case 8:
                        C138859r.this.mo114607f();
                        return;
                    case 9:
                        C138859r.this.mo114608i(0);
                        return;
                    default:
                        return;
                }
                C138859r.this.mo114606e();
                logoView.mo114549f(4);
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C138859r(boolean z, C89859i iVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C38802e eVar, C138717c cVar, C139680b bVar, C139684f fVar, C46723bg bgVar, C139676e eVar2, C141639a aVar, C28443m mVar, C68214a aVar2, C138789d dVar, C46778cv cvVar, C137447w wVar, C46801dp dpVar, C47770dh dhVar, C28306ab abVar, C138767d dVar2, C138772i iVar2, C139708c cVar2, C138880n nVar) {
        this.f377700b = cVar;
        this.f377701c = iVar;
        this.f377720v = z4;
        this.f377702d = bVar;
        this.f377703e = fVar;
        this.f377704f = bgVar;
        this.f377724z = z2;
        this.f377721w = z;
        this.f377699H = z3;
        this.f377722x = z6;
        this.f377705g = eVar2;
        this.f377709k = dVar;
        this.f377707i = mVar;
        this.f377723y = z5;
        this.f377710l = cvVar;
        this.f377711m = wVar;
        this.f377706h = aVar;
        this.f377712n = eVar;
        this.f377708j = aVar2;
        this.f377713o = dpVar;
        this.f377714p = dhVar;
        this.f377715q = abVar;
        this.f377716r = dVar2;
        this.f377717s = iVar2;
        this.f377718t = cVar2;
        this.f377719u = nVar;
    }

    /* renamed from: c */
    public static void m225589c(ConstraintLayout constraintLayout) {
        C1756o oVar = new C1756o();
        oVar.mo4889i(constraintLayout);
        oVar.mo4891k(R.id.googleapp_logo_view, 3, R.id.googleapp_voice_search_language_switcher, 4);
        oVar.mo4888h(constraintLayout);
    }

    /* renamed from: g */
    public static boolean m225590g(C138788y yVar) {
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

    /* renamed from: h */
    public static boolean m225591h(Resources resources) {
        return resources.getConfiguration().orientation == 1;
    }

    /* renamed from: j */
    private static boolean m225592j(View view) {
        return view.findViewById(R.id.googleapp_voice_search_speaking_gif_animation) != null && view.findViewById(R.id.googleapp_voice_search_speaking_gif_stub) == null;
    }

    /* renamed from: a */
    public final VoiceSearchLanguageSwitcherSpinner mo114603a() {
        if (this.f377709k.getView() != null) {
            return (VoiceSearchLanguageSwitcherSpinner) this.f377709k.getView().findViewById(R.id.googleapp_voice_search_language_switcher);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo114604b() {
        if (this.f377717s.mo114526e()) {
            this.f377716r.mo114518a();
        } else {
            mo114608i(1);
        }
    }

    /* renamed from: d */
    public final void mo114605d(String str) {
        View view = this.f377709k.getView();
        View findViewById = view.findViewById(R.id.googleapp_search_a_song);
        View findViewById2 = view.findViewById(R.id.googleapp_logo_view);
        C28306ab.m52929e(findViewById);
        C28306ab.m52929e(findViewById2);
        if (str != null) {
            C28306ab abVar = this.f377715q;
            C28313c a = abVar.f76990a.mo33805a(C28427h.m53115a(125789));
            a.mo33858f(C138686a.m225249a(str));
            abVar.mo33801b(findViewById, a);
            C28306ab abVar2 = this.f377715q;
            C28313c a2 = abVar2.f76990a.mo33805a(C28427h.m53115a(96087));
            a2.mo33858f(C138686a.m225249a(str));
            abVar2.mo33801b(findViewById2, a2);
            return;
        }
        C28306ab abVar3 = this.f377715q;
        abVar3.mo33801b(findViewById, abVar3.f76990a.mo33805a(C28427h.m53115a(125789)));
        C28306ab abVar4 = this.f377715q;
        abVar4.mo33801b(findViewById2, abVar4.f76990a.mo33805a(C28427h.m53115a(96087)));
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo114606e() {
        /*
            r4 = this;
            boolean r0 = r4.f377699H
            if (r0 == 0) goto L_0x005f
            com.google.android.apps.search.googleapp.search.voicesearch.d r0 = r4.f377709k
            android.content.res.Resources r0 = r0.getResources()
            boolean r0 = m225591h(r0)
            if (r0 == 0) goto L_0x005f
            com.google.android.apps.search.googleapp.search.voicesearch.d r0 = r4.f377709k
            android.view.View r0 = r0.getView()
            if (r0 != 0) goto L_0x0027
            com.google.common.f.e r0 = f377691a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "#startSpeakingGif failed, no root view"
            r2 = 41286(0xa146, float:5.7854E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            return
        L_0x0027:
            r1 = 2131432091(0x7f0b129b, float:1.848593E38)
            android.view.View r2 = r0.findViewById(r1)
            com.airbnb.lottie.LottieAnimationView r2 = (com.airbnb.lottie.LottieAnimationView) r2
            boolean r3 = m225592j(r0)
            if (r3 == 0) goto L_0x0037
            goto L_0x0050
        L_0x0037:
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
        L_0x0050:
            int r0 = r2.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x005f
            r2.mo9695f()
            r0 = 0
            r2.setVisibility(r0)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.C138859r.mo114606e():void");
    }

    /* renamed from: f */
    public final void mo114607f() {
        View view = this.f377709k.getView();
        if (view == null) {
            ((C59052c) ((C59052c) f377691a.mo56226d()).mo56372aa(41287)).mo56386p("#stopSpeakingGif failed, no root view");
        } else if (m225592j(view)) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.googleapp_voice_search_speaking_gif_animation);
            if (lottieAnimationView.getVisibility() != 8) {
                lottieAnimationView.mo9692c();
                lottieAnimationView.setVisibility(8);
            }
        }
    }

    /* renamed from: i */
    public final void mo114608i(int i) {
        this.f377716r.mo114521d(i);
        mo114607f();
        View view = this.f377709k.getView();
        view.getClass();
        ((LogoView) view.findViewById(R.id.googleapp_logo_view)).mo114549f(7);
        View view2 = this.f377709k.getView();
        view2.getClass();
        TextView textView = (TextView) view2.findViewById(R.id.googleapp_voice_results_text);
        textView.setMaxLines(3);
        textView.setText(R.string.error_no_match_text);
        this.f377693B = false;
    }
}
