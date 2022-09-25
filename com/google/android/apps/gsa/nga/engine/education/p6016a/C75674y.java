package com.google.android.apps.gsa.nga.engine.education.p6016a;

import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.d.c;
import com.google.android.apps.gsa.assistant.shared.d.d;
import com.google.android.apps.gsa.assistant.shared.d.e;
import com.google.android.apps.gsa.assistant.shared.d.i;
import com.google.android.apps.gsa.assistant.shared.k.ag;
import com.google.android.apps.gsa.assistant.shared.k.n;
import com.google.android.apps.gsa.assistant.shared.p5810d.C73853f;
import com.google.android.apps.gsa.assistant.shared.p5810d.p5811a.C73851c;
import com.google.android.apps.gsa.assistant.shared.p5810d.p5811a.C73852d;
import com.google.android.apps.gsa.nga.engine.ag.af;
import com.google.android.apps.gsa.nga.engine.p5960as.C75042j;
import com.google.android.apps.gsa.nga.engine.p5994c.p5999c.C75322a;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6243v.C79356f;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6345h.C81251ap;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.assistant.p3781ad.p3789d.p3791b.C48730l;
import com.google.assistant.p3781ad.p3789d.p3791b.C48732n;
import com.google.assistant.p4008y.p4009a.C53556ap;
import com.google.assistant.p4008y.p4009a.C53570bc;
import com.google.assistant.p4008y.p4009a.C53571bd;
import com.google.assistant.p4008y.p4009a.C53573bf;
import com.google.assistant.p4008y.p4009a.C53574bg;
import com.google.assistant.p4008y.p4009a.C53575bh;
import com.google.assistant.p4008y.p4009a.C53577bj;
import com.google.assistant.p4008y.p4009a.C53578bk;
import com.google.assistant.p4008y.p4009a.C53579bl;
import com.google.assistant.p4008y.p4009a.C53580bm;
import com.google.assistant.p4008y.p4009a.C53581bn;
import com.google.assistant.p4008y.p4009a.C53582bo;
import com.google.assistant.p4008y.p4009a.C53583bp;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a.y */
/* compiled from: PG */
public final class C75674y extends C79356f implements C75042j {

    /* renamed from: a */
    public static final C58974d f210044a = C58974d.m91136j();

    /* renamed from: b */
    public final C58485gu f210045b;

    /* renamed from: c */
    public final af f210046c;

    /* renamed from: d */
    public final AtomicReference f210047d = new AtomicReference(C58485gu.m89845m());

    /* renamed from: e */
    public final AtomicReference f210048e = new AtomicReference(C58485gu.m89845m());

    /* renamed from: f */
    public final AtomicReference f210049f = new AtomicReference(Optional.empty());

    /* renamed from: g */
    public final C60950i f210050g;

    /* renamed from: h */
    public final AtomicReference f210051h = new AtomicReference(Optional.empty());

    /* renamed from: i */
    public final Optional f210052i;

    /* renamed from: j */
    public final C60888db f210053j;

    /* renamed from: k */
    public final C79863k f210054k;

    /* renamed from: l */
    private final C58485gu f210055l;

    /* renamed from: m */
    private final C91142g f210056m;

    /* renamed from: n */
    private final C68214a f210057n;

    /* renamed from: o */
    private final C22871g f210058o;

    /* renamed from: p */
    private final C76092h f210059p;

    /* renamed from: q */
    private final C68214a f210060q;

    public C75674y(af afVar, C91142g gVar, C22871g gVar2, C68214a aVar, C76092h hVar, C79359i iVar, C60950i iVar2, C68214a aVar2, Optional optional, C60888db dbVar, C79863k kVar) {
        super(iVar, new C58759qy(Integer.valueOf(C90126fx.f251128cv.f248757a)));
        C75644ac l = C75650ai.m121912l();
        C75654e eVar = (C75654e) l;
        eVar.f209996b = "nga-hs-1";
        eVar.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint_stay_on_top);
        eVar.f209998d = new C75641a(R.string.nga_preloaded_fre_homescreen_suggestion_1);
        l.mo71788e(Locale.ROOT);
        l.mo71786c(C75675z.f210061a);
        eVar.f210001g = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/clock_round_color_48dp.png";
        C75650ai a = l.mo71784a();
        C75644ac l2 = C75650ai.m121912l();
        C75654e eVar2 = (C75654e) l2;
        eVar2.f209996b = "nga-hs-11";
        eVar2.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint_manage_emails);
        eVar2.f209998d = new C75641a(R.string.nga_preloaded_fre_homescreen_suggestion_12);
        l2.mo71788e(Locale.ROOT);
        l2.mo71786c(C75675z.f210061a);
        eVar2.f210001g = (String) C75675z.f210067g.get("com.google.android.gm");
        eVar2.f209999e = Optional.ofNullable("com.google.android.gm");
        C75650ai a2 = l2.mo71784a();
        C75644ac l3 = C75650ai.m121912l();
        C75654e eVar3 = (C75654e) l3;
        eVar3.f209996b = "nga-hs-2";
        eVar3.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint_check_weather);
        eVar3.f209998d = new C75641a(R.string.nga_preloaded_fre_homescreen_suggestion_2);
        l3.mo71788e(Locale.ROOT);
        l3.mo71786c(C75675z.f210061a);
        eVar3.f210001g = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/weather_round_color_48dp.png";
        C75650ai a3 = l3.mo71784a();
        C75644ac l4 = C75650ai.m121912l();
        C75654e eVar4 = (C75654e) l4;
        eVar4.f209996b = "nga-hs-8";
        eVar4.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint);
        eVar4.f209998d = new C75641a(R.string.nga_preloaded_fre_homescreen_suggestion_4);
        l4.mo71788e(Locale.ROOT);
        l4.mo71786c(C75675z.f210061a);
        eVar4.f209999e = Optional.ofNullable("com.google.android.GoogleCamera");
        eVar4.f210001g = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/search_round_color_48dp.png";
        C75650ai a4 = l4.mo71784a();
        C75644ac l5 = C75650ai.m121912l();
        C75654e eVar5 = (C75654e) l5;
        eVar5.f209996b = "nga-hs-12";
        eVar5.f209998d = new C75641a(R.string.nga_preloaded_fre_homescreen_suggestion_13);
        l5.mo71788e(Locale.ROOT);
        l5.mo71786c(C75675z.f210061a);
        eVar5.f210001g = "http://www.gstatic.com/assistant/static/images/warmer_welcome/recap/search_round_color_48dp.png";
        C75650ai a5 = l5.mo71784a();
        C75644ac l6 = C75650ai.m121912l();
        C75654e eVar6 = (C75654e) l6;
        eVar6.f209996b = "nga-hs-4";
        eVar6.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint_plan_ahead);
        eVar6.f209998d = new C75641a(R.string.nga_preloaded_fre_homescreen_suggestion_5);
        l6.mo71788e(Locale.ROOT);
        l6.mo71786c(C75675z.f210061a);
        eVar6.f210001g = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/clock_round_color_48dp.png";
        C75650ai a6 = l6.mo71784a();
        C75644ac l7 = C75650ai.m121912l();
        C75654e eVar7 = (C75654e) l7;
        eVar7.f209996b = "nga-hs-5";
        eVar7.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint_connect_with_people);
        eVar7.f209998d = new C75641a(R.string.nga_preloaded_fre_homescreen_suggestion_6);
        l7.mo71788e(Locale.ROOT);
        l7.mo71786c(C75675z.f210061a);
        eVar7.f210001g = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/dialer_round_color_48dp.png";
        C75650ai a7 = l7.mo71784a();
        C75644ac l8 = C75650ai.m121912l();
        C75654e eVar8 = (C75654e) l8;
        eVar8.f209996b = "nga-hs-13";
        eVar8.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint_find_games);
        eVar8.f209998d = new C75641a(R.string.nga_preloaded_fre_homescreen_suggestion_14);
        l8.mo71788e(Locale.ROOT);
        l8.mo71786c(C75675z.f210061a);
        eVar8.f209999e = Optional.ofNullable("com.android.vending");
        eVar8.f210001g = (String) C75675z.f210067g.get("com.android.vending");
        C75650ai a8 = l8.mo71784a();
        C75644ac l9 = C75650ai.m121912l();
        C75654e eVar9 = (C75654e) l9;
        eVar9.f209996b = "nga-hs-7";
        C75650ai aiVar = a8;
        eVar9.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint_plan_ahead);
        eVar9.f209998d = new C75641a(R.string.nga_preloaded_fre_homescreen_suggestion_8);
        l9.mo71788e(Locale.ROOT);
        l9.mo71786c(C75675z.f210061a);
        eVar9.f210001g = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/myday_round_color_48dp.png";
        C75650ai a9 = l9.mo71784a();
        C75644ac l10 = C75650ai.m121912l();
        C75654e eVar10 = (C75654e) l10;
        eVar10.f209996b = "nga-hs-14";
        C75650ai aiVar2 = a9;
        eVar10.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint_manage_messages);
        eVar10.f209998d = new C75641a(R.string.nga_preloaded_fre_homescreen_suggestion_15);
        l10.mo71788e(Locale.ROOT);
        l10.mo71786c(C75675z.f210061a);
        eVar10.f209999e = Optional.ofNullable("com.google.android.apps.messaging");
        eVar10.f210001g = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/text_round_color_48dp.png";
        C75650ai a10 = l10.mo71784a();
        C75644ac l11 = C75650ai.m121912l();
        C75650ai aiVar3 = a10;
        C75654e eVar11 = (C75654e) l11;
        C75650ai aiVar4 = a7;
        eVar11.f209996b = "nga-hs-10";
        C75650ai aiVar5 = a6;
        eVar11.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint_stay_on_top);
        eVar11.f209998d = new C75641a(R.string.nga_preloaded_fre_homescreen_suggestion_11);
        l11.mo71788e(Locale.ROOT);
        l11.mo71786c(C75675z.f210061a);
        eVar11.f210001g = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/reminder_round_color.png";
        C75650ai a11 = l11.mo71784a();
        C75644ac l12 = C75650ai.m121912l();
        C75654e eVar12 = (C75654e) l12;
        eVar12.f209996b = "nga-ia-1";
        C75650ai aiVar6 = a11;
        eVar12.f209998d = new C75641a(R.string.nga_preloaded_fre_inapp_suggestion_1);
        l12.mo71788e(Locale.ROOT);
        l12.mo71786c(C75675z.f210062b);
        eVar12.f210000f = new C58759qy("com.android.chrome");
        eVar12.f210001g = (String) C75675z.f210067g.get("com.android.chrome");
        C75650ai a12 = l12.mo71784a();
        C75644ac l13 = C75650ai.m121912l();
        C75654e eVar13 = (C75654e) l13;
        C75650ai aiVar7 = a12;
        eVar13.f209996b = "nga-ia-2";
        C75650ai aiVar8 = a5;
        eVar13.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint_connect_with_people);
        eVar13.f209998d = new C75641a(R.string.nga_preloaded_fre_inapp_suggestion_2);
        l13.mo71788e(Locale.ROOT);
        l13.mo71786c(C75675z.f210062b);
        eVar13.f210000f = new C58759qy("com.google.android.dialer");
        eVar13.f210001g = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/dialer_round_color_48dp.png";
        C75644ac l14 = C75650ai.m121912l();
        C75654e eVar14 = (C75654e) l14;
        eVar14.f209996b = "nga-ia-3";
        eVar14.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint);
        eVar14.f209998d = new C75641a(R.string.nga_preloaded_fre_inapp_suggestion_3);
        l14.mo71788e(Locale.ROOT);
        l14.mo71786c(C75675z.f210062b);
        eVar14.f210000f = new C58759qy("com.google.android.GoogleCamera");
        eVar14.f210001g = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/search_round_color_48dp.png";
        C75644ac l15 = C75650ai.m121912l();
        C75654e eVar15 = (C75654e) l15;
        eVar15.f209996b = "nga-ia-4";
        eVar15.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint_manage_photos);
        eVar15.f209998d = new C75641a(R.string.nga_preloaded_fre_inapp_suggestion_4);
        l15.mo71788e(Locale.ROOT);
        l15.mo71786c(C75675z.f210062b);
        eVar15.f210000f = new C58759qy("com.google.android.apps.photos");
        eVar15.f210001g = (String) C75675z.f210067g.get("com.google.android.apps.photos");
        C75644ac l16 = C75650ai.m121912l();
        C75654e eVar16 = (C75654e) l16;
        eVar16.f209996b = "nga-ia-6";
        eVar16.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint_play_videos);
        eVar16.f209998d = new C75641a(R.string.nga_preloaded_fre_inapp_suggestion_6);
        l16.mo71788e(Locale.ROOT);
        l16.mo71786c(C75675z.f210062b);
        eVar16.f210000f = new C58759qy("com.google.android.youtube");
        eVar16.f210001g = (String) C75675z.f210067g.get("com.google.android.youtube");
        C75644ac l17 = C75650ai.m121912l();
        C75654e eVar17 = (C75654e) l17;
        eVar17.f209996b = "nga-ia-7";
        eVar17.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint_connect_with_people);
        eVar17.f209998d = new C75641a(R.string.nga_preloaded_fre_inapp_suggestion_7);
        l17.mo71788e(Locale.ROOT);
        l17.mo71786c(C75675z.f210062b);
        eVar17.f210000f = new C58759qy("com.google.android.apps.messaging");
        eVar17.f210001g = "https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/text_round_color_48dp.png";
        C75644ac l18 = C75650ai.m121912l();
        C75654e eVar18 = (C75654e) l18;
        eVar18.f209996b = "nga-ia-8";
        eVar18.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint_find_games);
        eVar18.f209998d = new C75641a(R.string.nga_preloaded_fre_inapp_suggestion_8);
        l18.mo71788e(Locale.ROOT);
        l18.mo71786c(C75675z.f210062b);
        eVar18.f210000f = new C58759qy("com.android.vending");
        eVar18.f210001g = (String) C75675z.f210067g.get("com.android.vending");
        C75644ac l19 = C75650ai.m121912l();
        C75654e eVar19 = (C75654e) l19;
        eVar19.f209996b = "nga-ia-9";
        eVar19.f209997c = new C75641a(R.string.nga_quick_actions_suggestion_hint_manage_emails);
        eVar19.f209998d = new C75641a(R.string.nga_preloaded_fre_inapp_suggestion_9);
        l19.mo71788e(Locale.ROOT);
        l19.mo71786c(C75675z.f210062b);
        eVar19.f210000f = new C58759qy("com.google.android.gm");
        eVar19.f210001g = (String) C75675z.f210067g.get("com.google.android.gm");
        C75644ac l20 = C75650ai.m121912l();
        C75654e eVar20 = (C75654e) l20;
        eVar20.f209996b = "nga-hf-2";
        eVar20.f209997c = new C75641a(R.string.nga_preloaded_fre_hands_free_suggestion_1);
        eVar20.f209998d = new C75641a(R.string.nga_preloaded_fre_hands_free_suggestion_1);
        l20.mo71788e(Locale.US);
        l20.mo71786c(C75675z.f210063c);
        C53578bk bkVar = (C53578bk) C53579bl.f140625d.createBuilder();
        C53577bj bjVar = C53577bj.PRIORITY_LOW;
        bkVar.copyOnWrite();
        C53579bl blVar = (C53579bl) bkVar.instance;
        blVar.f140628b = bjVar.f140624d;
        blVar.f140627a |= 1;
        C53580bm bmVar = (C53580bm) C53581bn.f140630d.createBuilder();
        C53577bj bjVar2 = C53577bj.PRIORITY_LOW;
        bmVar.copyOnWrite();
        C53581bn bnVar = (C53581bn) bmVar.instance;
        bnVar.f140633b = bjVar2.f140624d;
        bnVar.f140632a |= 1;
        C53574bg bgVar = (C53574bg) C53575bh.f140613e.createBuilder();
        C53573bf bfVar = C53573bf.CONTEXT_KEY_FOREGROUND_APPLICATION;
        bgVar.copyOnWrite();
        C53575bh bhVar = (C53575bh) bgVar.instance;
        bhVar.f140618d = bfVar.f140612d;
        bhVar.f140615a |= 1;
        C53570bc bcVar = (C53570bc) C53571bd.f140604b.createBuilder();
        C53582bo boVar = (C53582bo) C53583bp.f140635c.createBuilder();
        boVar.copyOnWrite();
        C53583bp bpVar = (C53583bp) boVar.instance;
        bpVar.f140637a = 1;
        bpVar.f140638b = "com.google.android.apps.nexuslauncher";
        bcVar.mo53999a(boVar);
        bgVar.copyOnWrite();
        C53575bh bhVar2 = (C53575bh) bgVar.instance;
        C53571bd bdVar = (C53571bd) bcVar.build();
        bdVar.getClass();
        bhVar2.f140617c = bdVar;
        bhVar2.f140616b = 2;
        bmVar.mo54003a(bgVar);
        bkVar.mo54002a(bmVar);
        C53580bm bmVar2 = (C53580bm) C53581bn.f140630d.createBuilder();
        C53577bj bjVar3 = C53577bj.PRIORITY_HIGH;
        bmVar2.copyOnWrite();
        C53581bn bnVar2 = (C53581bn) bmVar2.instance;
        bnVar2.f140633b = bjVar3.f140624d;
        bnVar2.f140632a |= 1;
        C53574bg bgVar2 = (C53574bg) C53575bh.f140613e.createBuilder();
        C53573bf bfVar2 = C53573bf.CONTEXT_KEY_HANDS_FREE;
        bgVar2.copyOnWrite();
        C53575bh bhVar3 = (C53575bh) bgVar2.instance;
        bhVar3.f140618d = bfVar2.f140612d;
        bhVar3.f140615a |= 1;
        C53570bc bcVar2 = (C53570bc) C53571bd.f140604b.createBuilder();
        C53582bo boVar2 = (C53582bo) C53583bp.f140635c.createBuilder();
        boVar2.copyOnWrite();
        C53583bp bpVar2 = (C53583bp) boVar2.instance;
        bpVar2.f140637a = 2;
        bpVar2.f140638b = true;
        bcVar2.mo53999a(boVar2);
        bgVar2.copyOnWrite();
        C53575bh bhVar4 = (C53575bh) bgVar2.instance;
        C53571bd bdVar2 = (C53571bd) bcVar2.build();
        bdVar2.getClass();
        bhVar4.f140617c = bdVar2;
        bhVar4.f140616b = 2;
        bmVar2.mo54003a(bgVar2);
        bkVar.mo54002a(bmVar2);
        eVar20.f209995a = Optional.m71637of((C53579bl) bkVar.build());
        this.f210055l = C58485gu.m89834D(a, a2, a3, a4, aiVar8, aiVar5, aiVar4, aiVar, aiVar2, aiVar3, aiVar6, aiVar7, l13.mo71784a(), l14.mo71784a(), l15.mo71784a(), l16.mo71784a(), l17.mo71784a(), l18.mo71784a(), l19.mo71784a(), l20.mo71784a());
        C75644ac l21 = C75650ai.m121912l();
        C75654e eVar21 = (C75654e) l21;
        eVar21.f209996b = "nga-lpp-1";
        eVar21.f209997c = new C75641a(R.string.nga_preloaded_fre_long_press_power_suggestion_1);
        eVar21.f209998d = new C75641a(R.string.nga_preloaded_fre_long_press_power_suggestion_1);
        l21.mo71788e(Locale.ROOT);
        l21.mo71786c(C75675z.f210061a);
        this.f210045b = C58485gu.m89846n(l21.mo71784a());
        this.f210046c = afVar;
        this.f210058o = gVar2;
        this.f210056m = gVar;
        this.f210057n = aVar;
        this.f210059p = hVar;
        this.f210050g = iVar2;
        this.f210060q = aVar2;
        this.f210052i = optional;
        this.f210053j = dbVar;
        this.f210054k = kVar;
    }

    /* renamed from: b */
    public static C58485gu m121962b(C73853f fVar) {
        Locale locale;
        if (fVar.mo65336b().equals(Locale.US)) {
            locale = Locale.ENGLISH;
        } else {
            locale = fVar.mo65336b();
        }
        fVar.mo65335a().size();
        fVar.mo65336b();
        return (C58485gu) Collection.EL.stream(fVar.mo65335a()).filter(C75670u.f210040a).flatMap(new C75671v(locale)).collect(C58370cn.f155946a);
    }

    /* renamed from: j */
    public static boolean m121963j(Locale locale, Locale locale2) {
        if (locale2.equals(Locale.ROOT)) {
            return true;
        }
        if (TextUtils.isEmpty(locale2.getCountry())) {
            return locale.getLanguage().equals(locale2.getLanguage());
        }
        return locale.equals(locale2);
    }

    /* renamed from: I */
    public final void mo71412I(C81251ap apVar) {
        if (!apVar.equals(C81251ap.CHALKBOARD_PREFERENCES) && !apVar.equals(C81251ap.OVERAPP_DISCOVERY_PREFERENCES)) {
            return;
        }
        if (apVar.equals(C81251ap.OVERAPP_DISCOVERY_PREFERENCES)) {
            C22871g gVar = this.f210058o;
            C60870cx g = C60922j.m93044g(((ag) this.f210060q.mo27525b()).b.mo46042d(), n.a, C60826bg.f164896a);
            C90476a aVar = C91018d.f254254a;
            C80905at.m128763g(gVar.mo28209i(g, "[NGA] Load overapp promise", new C75663n(this)), C75664o.f210030a);
            return;
        }
        mo73917U();
    }

    /* renamed from: a */
    public final C48732n mo71818a(C48730l lVar) {
        if (!mo71821g() || this.f210052i.isEmpty()) {
            return C48732n.f126102b;
        }
        return ((C75322a) this.f210052i.get()).mo71668a(lVar);
    }

    /* renamed from: d */
    public final C58485gu mo71819d(Locale locale, C75647af... afVarArr) {
        if (mo71201gC()) {
            C58485gu e = mo71820e((C58485gu) this.f210047d.get(), locale, afVarArr);
            e.size();
            if (!e.isEmpty()) {
                return e;
            }
        }
        return mo71820e(this.f210055l, locale, afVarArr);
    }

    /* renamed from: e */
    public final C58485gu mo71820e(C58485gu guVar, Locale locale, C75647af... afVarArr) {
        return (C58485gu) Collection.EL.stream(guVar).filter(new C75668s(locale)).filter(new C75669t(this, afVarArr)).collect(C58370cn.f155946a);
    }

    /* renamed from: g */
    public final boolean mo71821g() {
        return this.f210056m.mo85405j(C90126fx.f251033bF) && this.f210056m.mo85405j(C90126fx.f251034bG);
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return this.f210059p.mo72021b().mo72041f() && this.f210056m.mo85405j(C90126fx.f251128cv);
    }

    /* access modifiers changed from: protected */
    /* renamed from: gD */
    public final boolean mo71822gD() {
        return !((Optional) this.f210049f.get()).equals(Optional.m71637of(this.f210059p.mo72021b().mo72039e()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        this.f210049f.set(Optional.m71637of(this.f210059p.mo72021b().mo72039e()));
        C58976aa aaVar = C58975e.f156826a;
        C60870cx a = ((i) this.f210057n.mo27525b()).a("Get chalkboard suggestions for NGA FRE", i.a);
        i iVar = (i) this.f210057n.mo27525b();
        C60870cx g = C60922j.m93044g(((C42876ab) iVar.b.mo27525b()).mo46042d(), new e(), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        C60870cx g2 = C60922j.m93044g(iVar.b(), c.a, C60826bg.f164896a);
        C73851c cVar = new C73851c();
        cVar.f195154a = new HashMap();
        cVar.f195155b = new ArrayList();
        cVar.f195154a.put(C53556ap.TIME_CONTEXT, new C73852d());
        if (iVar.c.mo85405j(C90037cp.f248496bX)) {
            cVar.f195156c = true;
        }
        C60870cx b = C60856cj.m92895d(g, g2).mo57335b(new d(g, cVar, g2), C60826bg.f164896a);
        return C60856cj.m92895d(a, b).mo57335b(new C75667r(this, a, b), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        this.f210047d.set(C58485gu.m89845m());
        this.f210048e.set(C58485gu.m89845m());
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "QuerySuggestions";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 12;
    }
}
