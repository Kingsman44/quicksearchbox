package com.google.android.apps.gsa.search.core.p6820r.p6834f;

import com.google.android.apps.gsa.search.core.p6816p.C86211au;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58887cx;
import java.net.MalformedURLException;

/* renamed from: com.google.android.apps.gsa.search.core.r.f.a */
/* compiled from: PG */
public final class C86430a {
    /* renamed from: a */
    static C89020ar m139223a(UriRequest uriRequest, C58833ax axVar, int i) {
        C89019aq aqVar;
        try {
            if (uriRequest.mo81503c()) {
                aqVar = C89020ar.m144759d();
            } else {
                aqVar = C89020ar.m144758c();
            }
            if (axVar.mo56113h()) {
                aqVar.f241249o = ((Integer) axVar.mo56107c()).intValue();
            }
            aqVar.mo82994f(uriRequest.f236331a.toString());
            aqVar.mo82991c(uriRequest.mo81502a());
            aqVar.f241239e = true;
            aqVar.f241245k = i;
            aqVar.f241244j = true;
            return aqVar.mo82989a();
        } catch (MalformedURLException e) {
            throw new C90457d((Throwable) e, (int) C89885b.HTTP_MALFORMED_URL_VALUE);
        }
    }

    /* renamed from: b */
    public static void m139224b(Throwable th, C86211au auVar) {
        auVar.mo79594b(th);
        C58887cx.m90979f(th, Exception.class);
        C58887cx.m90980g(th);
        throw new RuntimeException(th);
    }
}
