package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import android.content.Context;
import android.provider.Settings;
import com.google.android.apps.gsa.notificationlistener.C83395k;
import com.google.android.apps.gsa.search.core.p6491a.C84347af;
import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.search.core.p6519al.p6598bl.C84885a;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90361a;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90373g;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90374h;
import com.google.android.apps.gsa.shared.notificationlistening.p7120a.C90359a;
import com.google.android.apps.gsa.shared.p6974ae.C89092a;
import com.google.android.apps.gsa.shared.p6974ae.C89097f;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.accl.p7337g.C92843f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.conversation.clientop.C22407c;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.aet;
import com.google.assistant.p3897e.p3921j.aeu;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ajy;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import dagger.C68214a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.l */
/* compiled from: PG */
public final class C93173l extends C22538o {

    /* renamed from: g */
    private static final C59071e f259858g = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.h.l");

    /* renamed from: h */
    private static final C89097f f259859h;

    /* renamed from: a */
    public final C84885a f259860a;

    /* renamed from: b */
    public final C22871g f259861b;

    /* renamed from: c */
    public final C90374h f259862c;

    /* renamed from: d */
    public final C86124t f259863d;

    /* renamed from: e */
    public final C84347af f259864e;

    /* renamed from: f */
    public final C37215b f259865f;

    /* renamed from: i */
    private final Context f259866i;

    /* renamed from: j */
    private final C92843f f259867j;

    /* renamed from: k */
    private final C68214a f259868k;

    /* renamed from: l */
    private final int f259869l;

    /* renamed from: m */
    private final C89097f f259870m;

    /* renamed from: o */
    private final String f259871o;

    /* renamed from: p */
    private final C85005h f259872p;

    static {
        C89092a aVar = new C89092a();
        aVar.mo83061c();
        aVar.mo83060b();
        aVar.mo83063e();
        aVar.mo83062d();
        f259859h = aVar.mo83059a();
    }

    public C93173l(Context context, C84885a aVar, C22871g gVar, C90374h hVar, C92843f fVar, C68214a aVar2, C86124t tVar, int i, C58833ax axVar, C84347af afVar, String str, C85005h hVar2, C37215b bVar) {
        this.f259866i = context;
        this.f259860a = aVar;
        this.f259861b = gVar;
        this.f259862c = hVar;
        this.f259867j = fVar;
        this.f259868k = aVar2;
        this.f259863d = tVar;
        this.f259869l = i;
        this.f259870m = (C89097f) axVar.mo56109e(f259859h);
        this.f259864e = afVar;
        this.f259871o = str;
        this.f259872p = hVar2;
        this.f259865f = bVar;
    }

    /* renamed from: b */
    public static C52070ec m153240b(String str) {
        return C22402a.m41822b(C52235kf.INTERNAL, "Active notifications are not fetched successfully. Error: ".concat(String.valueOf(str)));
    }

    /* renamed from: c */
    public static C52070ec m153241c() {
        return C22402a.m41822b(C52235kf.PERMISSION_DENIED, "Permission is not granted to fetch active notifications");
    }

    /* renamed from: f */
    private final boolean m153242f() {
        int i = this.f259869l;
        return i == 5 || i == 6;
    }

    /* renamed from: g */
    private final boolean m153243g() {
        return this.f259869l == 8;
    }

    /* renamed from: h */
    private final boolean m153244h() {
        return this.f259869l == 2;
    }

    /* renamed from: i */
    private static boolean m153245i(C84349ah ahVar) {
        Query query;
        if (ahVar == null || (query = ahVar.f229566a) == null) {
            return false;
        }
        return query.mo84404ck() || query.mo84363bw("android.opa.extra.MINI_PLATE_ENABLED");
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C37258g gVar;
        C60870cx cxVar;
        String str;
        C60870cx cxVar2;
        C86775r rVar;
        if (dyVar.f135936b.equals("notification.FETCH")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            aeu aeu = (aeu) m41992m(dwVar, "notification_fetch_args", aeu.f134959h.getParserForType());
            C37215b bVar = this.f259865f;
            aet a = aet.m86300a(aeu.f134963c);
            if (a == null) {
                a = aet.DEFAULT;
            }
            if (a == aet.DEFAULT) {
                gVar = C37176a.f96816N;
            } else {
                gVar = C37176a.f96817O;
            }
            bVar.mo19974a(gVar.mo40815i(C62722b.OK));
            aet a2 = aet.m86300a(aeu.f134963c);
            if (a2 == null) {
                a2 = aet.DEFAULT;
            }
            if (a2 == aet.DEFAULT && aeu.f134962b) {
                C83395k.m132734e(this.f259866i, this.f259871o);
                if (!C36619a.m65148d(this.f259866i)) {
                    this.f259865f.mo19974a(C37176a.f96818P.mo40805c(C62722b.PERMISSION_DENIED));
                    C22407c cVar = (C22407c) eVar;
                    C84349ah ahVar = cVar.f61902d.mo56113h() ? (C84349ah) ((C22585l) cVar.f61902d.mo56107c()).f62228b.mo56111f() : null;
                    if (m153244h() || m153242f() || m153243g() || m153245i(ahVar)) {
                        str = this.f259866i.getString(this.f259870m.mo83067d());
                    } else {
                        str = this.f259866i.getString(R.string.permission_tts);
                    }
                    try {
                        cxVar2 = C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(this.f259867j.mo87471a(C60856cj.m92900i(C58836b.f156633a), new TtsRequest(str, false), ahVar).mo27547b()), new C93172k(), C60826bg.f164896a), Exception.class, C93169h.f259853a, C60826bg.f164896a);
                    } catch (IOException e) {
                        C59104x d = f259858g.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "NotifFetchPerformer");
                        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(13372)).mo56386p("Exception in playing TTS for permission request.");
                        cxVar2 = C60856cj.m92900i(m153241c());
                    }
                    if (m153244h() || m153242f() || m153243g() || m153245i(ahVar) || (rVar = ((C86610af) this.f259868k.mo27525b()).f233977l) == null) {
                        C58976aa aaVar = C58975e.f156826a;
                        if (m153242f()) {
                            aas a3 = C90359a.m146922a(this.f259866i, this.f259870m);
                            if (a3 != null) {
                                this.f259872p.mo78617M(23, 224, a3, ajy.CLIENT_GENERATED);
                            } else {
                                C59104x d2 = f259858g.mo56226d();
                                d2.mo56378ag(C58975e.f156826a, "NotifFetchPerformer");
                                ((C59052c) ((C59052c) d2).mo56372aa(13374)).mo56386p("Unable to post notification");
                            }
                        } else {
                            this.f259860a.mo78573q(this.f259866i);
                        }
                    } else {
                        rVar.f234383e.mo80379b(new C87684al(C88244um.OPEN_ANDROID_NOTIFICATION_SETTINGS).mo81964a());
                    }
                    return cxVar2;
                }
            }
            if (aeu.f134965e) {
                C59104x b = f259858g.mo56224b();
                b.mo56378ag(C58975e.f156826a, "NotifFetchPerformer");
                ((C59052c) ((C59052c) b).mo56372aa(13371)).mo56386p("fetching message notifications from reply cache.");
                C90374h hVar = this.f259862c;
                Duration ofSeconds = Duration.ofSeconds(this.f259863d.mo79743a(C90025cd.f248141E));
                C60870cx cxVar3 = hVar.f252405a;
                if (cxVar3 == null) {
                    cxVar = C60856cj.m92900i(new ArrayList());
                } else {
                    cxVar = C60922j.m93044g(cxVar3, new C90361a(hVar, ofSeconds), C60826bg.f164896a);
                }
            } else {
                aet a4 = aet.m86300a(aeu.f134963c);
                if (a4 == null) {
                    a4 = aet.DEFAULT;
                }
                if (a4 == aet.ALTERNATIVE) {
                    cxVar = this.f259860a.mo78562e();
                } else {
                    cxVar = this.f259860a.mo78559a();
                }
                C90374h hVar2 = this.f259862c;
                boolean z = aeu.f134966f;
                cxVar.getClass();
                hVar2.f252405a = cxVar;
                hVar2.f252407c.clear();
                if (hVar2.f252410f.mo79746e(C90086ek.f250280aE)) {
                    C60922j.m93045h(hVar2.f252409e.mo20297a(), new C90373g(hVar2, z, cxVar), C60826bg.f164896a);
                }
            }
            C60870cx e2 = C90877ak.m148471e(cxVar, this.f259863d.mo79743a(C90014bt.f247505iS), TimeUnit.SECONDS, this.f259861b);
            if (aeu.f134967g) {
                return C60846c.m92878g(C60922j.m93045h(C60838bs.m92859i(e2), new C93166e(this), C60826bg.f164896a), Exception.class, new C93167f(this), C60826bg.f164896a);
            }
            return C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(e2), new C93171j(this, aeu), C60826bg.f164896a), Exception.class, new C93168g(this), C60826bg.f164896a);
        }
        throw new C22428d(dyVar);
    }

    /* renamed from: d */
    public final boolean mo87560d() {
        int i = Settings.Secure.getInt(this.f259866i.getContentResolver(), "lock_screen_allow_private_notifications", -1);
        C59071e eVar = f259858g;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NotifFetchPerformer");
        ((C59052c) ((C59052c) b).mo56372aa(13375)).mo56387q("sensitiveNotificationsEnabled: %d", i);
        if (i > 0) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "NotifFetchPerformer");
            ((C59052c) ((C59052c) b2).mo56372aa(13377)).mo56386p("sensitiveNotificationsEnabled: true");
            return true;
        }
        C59104x b3 = eVar.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "NotifFetchPerformer");
        ((C59052c) ((C59052c) b3).mo56372aa(13376)).mo56386p("sensitiveNotificationsEnabled: false");
        return false;
    }

    /* renamed from: e */
    public final int mo87561e() {
        int i = Settings.Secure.getInt(this.f259866i.getContentResolver(), "lock_screen_show_notifications", -1);
        C59104x b = f259858g.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NotifFetchPerformer");
        ((C59052c) ((C59052c) b).mo56372aa(13370)).mo56387q("showAll: %d", i);
        return i > 0 ? 1 : 2;
    }
}
