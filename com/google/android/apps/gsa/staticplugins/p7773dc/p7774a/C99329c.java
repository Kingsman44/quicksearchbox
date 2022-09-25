package com.google.android.apps.gsa.staticplugins.p7773dc.p7774a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57937b;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.dc.a.c */
/* compiled from: PG */
public final class C99329c {

    /* renamed from: a */
    private static final C58528ij f277908a = C58528ij.m90015O(Integer.valueOf(C89885b.CRONET_CONNECTION_TIMED_OUT_VALUE), Integer.valueOf(C89885b.CRONET_NET_ERROR_CONNECTION_TIMED_OUT_VALUE), Integer.valueOf(C89885b.CRONET_NET_ERROR_CERT_COMMON_NAME_INVALID_VALUE), Integer.valueOf(C89885b.CRONET_NET_ERROR_CERT_AUTHORITY_INVALID_VALUE), Integer.valueOf(C89885b.CRONET_NET_ERROR_SSL_PROTOCOL_ERROR_VALUE), Integer.valueOf(C89885b.CRONET_NET_ERROR_CERT_INVALID_VALUE), new Integer[0]);

    /* renamed from: b */
    private static final C59071e f277909b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dc.a.c");

    /* renamed from: a */
    static C60870cx m164736a(Throwable th, C68283d dVar) {
        Throwable th2 = (Throwable) C57937b.m88572b(th, ExecutionException.class).mo56107c();
        if (th2 instanceof C90456c) {
            if (f277908a.contains(Integer.valueOf(((C90456c) th2).mo79843a()))) {
                return dVar.mo60297gq();
            }
        }
        return C60856cj.m92900i(false);
    }

    /* renamed from: b */
    static C60870cx m164737b(C89037bh bhVar) {
        return bhVar.mo27378c();
    }

    /* renamed from: c */
    static C60870cx m164738c(C68282c cVar, Throwable th, C89062r rVar) {
        if (!C57940c.m88582i(cVar) || !((Boolean) cVar.mo60292a()).booleanValue()) {
            return C60856cj.m92899h(th);
        }
        int i = rVar.f241373e;
        return C60856cj.m92899h(new C90457d(th, i == 1 ? C89885b.HTTP_CAPTIVE_PORTAL_DETECTED_WIFI_VALUE : i == 0 ? C89885b.HTTP_CAPTIVE_PORTAL_DETECTED_CELL_VALUE : C89885b.HTTP_CAPTIVE_PORTAL_DETECTED_OTHER_VALUE));
    }

    /* renamed from: d */
    static boolean m164739d(C89057m mVar) {
        try {
            return mVar.mo82999g().f241279a != 204;
        } catch (C90457d e) {
            C59104x d = f277909b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CaptivePortalChecker");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(32586)).mo56386p("Captive portal check failed.");
            return false;
        }
    }

    /* renamed from: e */
    static C89018ap m164740e(C86124t tVar) {
        String x = tVar.mo79758x(C90110fh.f250714t);
        int a = ((int) tVar.mo79743a(C90110fh.f250713s)) * 1000;
        C89019aq c = C89020ar.m144758c();
        C89020ar.m144761h(a);
        c.f241246l = a;
        C89020ar.m144761h(a);
        c.f241247m = a;
        c.mo82994f(x);
        c.f241245k = 31;
        c.f241239e = false;
        c.f241244j = false;
        return new C89018ap(c.mo82989a(), C89009ag.f241207b);
    }
}
