package com.google.android.apps.gsa.sidekick.main.p7200c;

import android.accounts.Account;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.p6427o.C83559c;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86293ai;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7009b.C89336a;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.p7066m.C90011bq;
import com.google.android.apps.gsa.shared.p7066m.C90084ei;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.sidekick.shared.C91651c;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.android.sidekick.shared.renderingcontext.DeviceCapabilityContext;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7732hx;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.c.g */
/* compiled from: PG */
public final class C91282g implements C91283h {

    /* renamed from: a */
    private static final C59071e f254755a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.c.g");

    /* renamed from: b */
    private final C91276a f254756b;

    /* renamed from: c */
    private final C91651c f254757c;

    /* renamed from: d */
    private final C90743b f254758d;

    /* renamed from: e */
    private final C68214a f254759e;

    /* renamed from: f */
    private final C68214a f254760f;

    /* renamed from: g */
    private final C68214a f254761g;

    /* renamed from: h */
    private final C68214a f254762h;

    /* renamed from: i */
    private final C68214a f254763i;

    /* renamed from: j */
    private final C83559c f254764j;

    /* renamed from: k */
    private final C89336a f254765k;

    public C91282g(C91276a aVar, C91651c cVar, C90743b bVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C83559c cVar2, C89336a aVar7) {
        this.f254756b = aVar;
        this.f254757c = cVar;
        this.f254758d = bVar;
        this.f254759e = aVar2;
        this.f254760f = aVar3;
        this.f254761g = aVar4;
        this.f254762h = aVar5;
        this.f254763i = aVar6;
        this.f254764j = cVar2;
        this.f254765k = aVar7;
    }

    /* renamed from: d */
    private final long m149213d() {
        try {
            return Long.parseLong(((C86124t) this.f254759e.mo27525b()).mo79758x(C90010bp.f246960ac));
        } catch (NumberFormatException unused) {
            return 1514000000;
        }
    }

    /* renamed from: a */
    public final void mo85556a(CardRenderingContext cardRenderingContext, List list, List list2) {
        mo85557b(cardRenderingContext, list);
        mo85558c(cardRenderingContext, list2);
    }

    /* renamed from: b */
    public final void mo85557b(CardRenderingContext cardRenderingContext, List list) {
        boolean z;
        C91277b bVar = this.f254756b.f254749b;
        DeviceCapabilityContext deviceCapabilityContext = (DeviceCapabilityContext) cardRenderingContext.mo49307c(DeviceCapabilityContext.f118463a, new DeviceCapabilityContext());
        if (deviceCapabilityContext != null) {
            deviceCapabilityContext.f118464b.set(bVar.f254751a.mo85391c());
        }
        Iterator it = list.iterator();
        while (true) {
            boolean z2 = true;
            if (it.hasNext()) {
                C7732hx hxVar = (C7732hx) it.next();
                if (hxVar == C7732hx.NOTIFICATION_BRANDING) {
                    synchronized (cardRenderingContext.f118456b) {
                        cardRenderingContext.f118457c.putBoolean("NOTIFICATION_BRANDING_KEY", true);
                    }
                }
                if (hxVar == C7732hx.ASSISTANT_NOTIFICATION_BRANDING) {
                    synchronized (cardRenderingContext.f118456b) {
                        cardRenderingContext.f118457c.putBoolean("ASSISTANT_NOTIFICATION_ENABLE_KEY", true);
                    }
                }
            } else {
                boolean c = this.f254758d.mo85090c();
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("TALKBACK_ENABLED_KEY", c);
                }
                C86338r rVar = (C86338r) this.f254760f.mo27525b();
                boolean z3 = rVar.getBoolean("use_custom_tabs", true) && rVar.getInt("amp_custom_tabs_private_api_version", 0) >= 7;
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("AMP_VIEWER_SUPPORTED_KEY", z3);
                }
                if (((C86124t) this.f254759e.mo27525b()).mo79746e(C90084ei.f250094a)) {
                    z = this.f254764j.mo76893d(this.f254765k.mo79659F()) ? this.f254764j.f227865c.mo76896a() : ((C86338r) this.f254760f.mo27525b()).getBoolean("use_custom_tabs", true);
                } else {
                    z = false;
                }
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("STAMP_VIEWER_SUPPORTED_KEY", z);
                }
                boolean z4 = ((C86338r) this.f254760f.mo27525b()).getBoolean("use_custom_tabs", true) && ((C86338r) this.f254760f.mo27525b()).getBoolean("use_recently", true);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("FEED_IN_RECENT_ENABLED_KEY", z4);
                }
                boolean e = ((C86124t) this.f254759e.mo27525b()).mo79746e(C90010bp.f247007s);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("ENABLE_E2ELOGGING_ENTRY_METADATA_MODULE", e);
                }
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("HQ_USE_FEED_V1P5_KEY", true);
                }
                int i = ((C86293ai) this.f254761g.mo27525b()).mo79997a().f29729e;
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putInt("AUTOPLAY_VIDEO_SETTING", i);
                }
                int a = (int) ((C86124t) this.f254759e.mo27525b()).mo79743a(C90010bp.f246959ab);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putInt("MIN_PERCENT_SHOWN_FOR_VISIBLE", a);
                }
                if (((C86124t) this.f254759e.mo27525b()).mo79746e(C90010bp.f246946aO)) {
                    cardRenderingContext.mo49310e(true);
                } else {
                    try {
                        int i2 = this.f254756b.f254750c.getPackageManager().getPackageInfo("com.google.android.youtube", 0).versionCode;
                        if (((long) i2) < m149213d()) {
                            C59104x d = f254755a.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "RenderingContextPop");
                            ((C59052c) ((C59052c) d).mo56372aa(11526)).mo56387q("YouTube version %d on device is lower than minimum-version", i2);
                            z2 = false;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        C59104x d2 = f254755a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "RenderingContextPop");
                        ((C59052c) ((C59052c) d2).mo56372aa(11527)).mo56386p("YouTube is not installed on the phone");
                    }
                    cardRenderingContext.mo49310e(z2);
                }
                long d3 = m149213d();
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putLong("MINIMUM_REQUIRED_YOUTUBE_VERSION", d3);
                }
                boolean e2 = ((C86124t) this.f254759e.mo27525b()).mo79746e(C90010bp.f246929Y);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("INLINE_VIDEO_PLAY_ON_SCROLL", e2);
                }
                boolean e3 = ((C86124t) this.f254759e.mo27525b()).mo79746e(C90010bp.f246979av);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("PREVENT_INLINE_VIDEO_LOAD_TIMEOUT_FLAG", e3);
                }
                String x = ((C86124t) this.f254759e.mo27525b()).mo79758x(C90010bp.f246915K);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putString("SNOWMAN_TOOLTIP_MESSAGE_KEY", x);
                }
                int a2 = (int) ((C86124t) this.f254759e.mo27525b()).mo79743a(C90010bp.f246916L);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putInt("SNOWMAN_TOOLTIP_TIMES_TO_SHOW", a2);
                }
                boolean e4 = ((C86124t) this.f254759e.mo27525b()).mo79746e(C90011bq.f247015a);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("ENABLE_URL_SHORTENING", e4);
                }
                boolean e5 = ((C86124t) this.f254759e.mo27525b()).mo79746e(C90010bp.f246939aH);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("REMOVE_YOUTUBE_FRAGMENTS_BEFORE_ONE_TAP", e5);
                }
                int a3 = (int) ((C86124t) this.f254759e.mo27525b()).mo79743a(C90010bp.f246920P);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putInt("INCREASE_VIDEO_AUTOPLAY_LATENCY_MS", a3);
                }
                boolean e6 = ((C86124t) this.f254759e.mo27525b()).mo79746e(C90010bp.f246938aG);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("REMOVE_INLINE_VIDEO_PLAYER_WHEN_FEED_HIDE", e6);
                }
                boolean e7 = ((C86124t) this.f254759e.mo27525b()).mo79746e(C90010bp.f246918N);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("ENABLE_GESTALT_NO_HEADERS_UI_KEY", e7);
                }
                boolean e8 = ((C86124t) this.f254759e.mo27525b()).mo79746e(C90010bp.f246917M);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("ENABLE_GESTALT_NO_HEADERS_A11Y", e8);
                }
                boolean e9 = ((C86124t) this.f254759e.mo27525b()).mo79746e(C90010bp.f246989be);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("ENABLE_VIDEO_BUFFER_SMALL_SPINNER", e9);
                }
                boolean e10 = ((C86124t) this.f254759e.mo27525b()).mo79746e(C90010bp.f246946aO);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("RUN_YOUTUBE_APP_MINIMUM_VERSION_CHECK_ON_SERVER", e10);
                }
                boolean e11 = ((C86124t) this.f254759e.mo27525b()).mo79746e(C90010bp.f246953aV);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("SHOULD_REUSE_ONE_YOUTUBE_FRAGMENT", e11);
                }
                boolean e12 = ((C86124t) this.f254759e.mo27525b()).mo79746e(C90010bp.f246905A);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("ENABLE_THIRD_PARTY_PLAYER_PRELOADING_FOR_STAMP", e12);
                }
                Account a4 = ((C86054o) this.f254762h.mo27525b()).mo79668a();
                if (a4 != null) {
                    String str = a4.name;
                    synchronized (cardRenderingContext.f118456b) {
                        cardRenderingContext.f118457c.putString("ACCOUNT_NAME", str);
                    }
                }
                boolean x2 = ((C85651bb) this.f254763i.mo27525b()).mo79161x(a4);
                synchronized (cardRenderingContext.f118456b) {
                    cardRenderingContext.f118457c.putBoolean("USER_IS_OPTED_IN", x2);
                }
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo85558c(CardRenderingContext cardRenderingContext, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m149214e(cardRenderingContext, (C7726hr) it.next());
        }
    }

    /* renamed from: e */
    private final void m149214e(CardRenderingContext cardRenderingContext, C7726hr hrVar) {
        if ((hrVar.f27010a & 2) != 0) {
            C91651c cVar = this.f254757c;
            C7718hj hjVar = hrVar.f27015f;
            if (hjVar == null) {
                hjVar = C7718hj.f26927af;
            }
            C91278c cVar2 = (C91278c) cVar.mo85798k(hjVar, hrVar.f27013d);
            if (cVar2 != null) {
                cVar2.mo85553a(cardRenderingContext, this.f254756b);
            }
        } else if (hrVar.f27013d.size() > 0) {
            for (C7718hj j : hrVar.f27013d) {
                C91278c cVar3 = (C91278c) this.f254757c.mo85797j(j);
                if (cVar3 != null) {
                    cVar3.mo85553a(cardRenderingContext, this.f254756b);
                }
            }
        } else if (hrVar.f27012c.size() > 0) {
            for (C7726hr e : hrVar.f27012c) {
                m149214e(cardRenderingContext, e);
            }
        }
    }
}
