package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import android.content.Context;
import com.google.android.apps.gsa.notificationlistener.C83395k;
import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.search.core.p6491a.C84350ai;
import com.google.android.apps.gsa.search.core.p6519al.p6598bl.C84885a;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.notificationlistening.p7120a.C90359a;
import com.google.android.apps.gsa.shared.p6974ae.C89092a;
import com.google.android.apps.gsa.shared.p6974ae.C89097f;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
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
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.acu;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.ajy;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.at */
/* compiled from: PG */
public final class C92945at extends C22538o {

    /* renamed from: a */
    public static final C59071e f259284a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.c.at");

    /* renamed from: e */
    private static final C89097f f259285e;

    /* renamed from: b */
    public final Context f259286b;

    /* renamed from: c */
    public final C84885a f259287c;

    /* renamed from: d */
    public final C92843f f259288d;

    /* renamed from: f */
    private final int f259289f;

    /* renamed from: g */
    private final C22871g f259290g;

    /* renamed from: h */
    private final C89097f f259291h;

    /* renamed from: i */
    private final C68214a f259292i;

    /* renamed from: j */
    private final C86124t f259293j;

    /* renamed from: k */
    private final C85005h f259294k;

    static {
        C89092a aVar = new C89092a();
        aVar.mo83061c();
        aVar.mo83060b();
        aVar.mo83063e();
        aVar.mo83062d();
        f259285e = aVar.mo83059a();
    }

    public C92945at(Context context, C84885a aVar, int i, C92843f fVar, C68214a aVar2, C58833ax axVar, C86124t tVar, C85005h hVar, C22871g gVar) {
        this.f259286b = context;
        this.f259287c = aVar;
        this.f259290g = gVar;
        this.f259289f = i;
        this.f259288d = fVar;
        this.f259293j = tVar;
        this.f259291h = (C89097f) axVar.mo56109e(f259285e);
        this.f259292i = aVar2;
        this.f259294k = hVar;
    }

    /* renamed from: b */
    public static C52070ec m152981b(String str) {
        return C22402a.m41822b(C52235kf.INTERNAL, "App notification didn't read out successfully. Error: ".concat(str));
    }

    /* renamed from: c */
    public static C52070ec m152982c() {
        return C22402a.m41822b(C52235kf.PERMISSION_DENIED, "Permission is not granted to fetch app notifications");
    }

    /* renamed from: d */
    private final boolean m152983d() {
        int i = this.f259289f;
        return i == 5 || i == 6;
    }

    /* renamed from: e */
    private final boolean m152984e() {
        return this.f259289f == 8;
    }

    /* renamed from: f */
    private final boolean m152985f() {
        return this.f259289f == 2;
    }

    /* renamed from: g */
    private static boolean m152986g(C84349ah ahVar) {
        Query query;
        if (!(ahVar instanceof C84349ah) || (query = ahVar.f229566a) == null) {
            return false;
        }
        if (query.mo84404ck() || query.mo84363bw("android.opa.extra.MINI_PLATE_ENABLED")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        String str;
        C60870cx cxVar;
        if (dyVar.f135936b.equals("notification.READ_OUT")) {
            C83395k.m132733d(this.f259286b);
            if (!C36619a.m65148d(this.f259286b)) {
                C22407c cVar = (C22407c) eVar;
                C84349ah ahVar = cVar.f61902d.mo56113h() ? (C84349ah) ((C22585l) cVar.f61902d.mo56107c()).f62228b.mo56111f() : null;
                if (m152985f() || m152983d() || m152984e() || m152986g(ahVar)) {
                    str = this.f259286b.getString(this.f259291h.mo83067d());
                } else {
                    str = this.f259286b.getString(R.string.permission_tts);
                }
                try {
                    cxVar = C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(this.f259288d.mo87471a(C60856cj.m92900i(C58836b.f156633a), new TtsRequest(str, false), ahVar).mo27547b()), C92938am.f259276a, C60826bg.f164896a), Exception.class, C92939an.f259277a, C60826bg.f164896a);
                } catch (IOException e) {
                    ((C59052c) ((C59052c) ((C59052c) f259284a.mo56226d()).mo56382g(e)).mo56372aa(13270)).mo56386p("Exception in playing TTS for permission request.");
                    cxVar = C60856cj.m92900i(m152982c());
                }
                if (!m152985f() && !m152983d() && !m152984e() && !m152986g(ahVar)) {
                    return C60846c.m92878g(C60922j.m93045h(C60838bs.m92859i(((C84350ai) this.f259292i.mo27525b()).mo77886a(new C87684al(C88244um.OPEN_ANDROID_NOTIFICATION_SETTINGS).mo81964a())), new C92940ao(this, cxVar), C60826bg.f164896a), Exception.class, C92941ap.f259280a, C60826bg.f164896a);
                }
                if (m152983d()) {
                    aas a = C90359a.m146922a(this.f259286b, this.f259291h);
                    if (a != null) {
                        this.f259294k.mo78617M(13, 224, a, ajy.CLIENT_GENERATED);
                        return cxVar;
                    }
                    ((C59052c) ((C59052c) f259284a.mo56226d()).mo56372aa(13272)).mo56386p("Unable to post notification");
                    return cxVar;
                }
                this.f259287c.mo78573q(this.f259286b);
                return cxVar;
            }
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            return C60846c.m92878g(C60846c.m92878g(C60922j.m93045h(C60838bs.m92859i(C90877ak.m148471e(this.f259287c.mo78561c((acu) m41992m(dwVar, "notification_read_out_args", acu.f134850b.getParserForType())), this.f259293j.mo79743a(C90014bt.f247497iK), TimeUnit.SECONDS, this.f259290g)), new C92935aj(this, eVar), C60826bg.f164896a), TimeoutException.class, C92936ak.f259274a, C60826bg.f164896a), Exception.class, C92937al.f259275a, C60826bg.f164896a);
        }
        throw new C22428d(dyVar);
    }
}
