package com.google.android.apps.gsa.staticplugins.p7643cc.p7644a;

import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import java.net.MalformedURLException;

/* renamed from: com.google.android.apps.gsa.staticplugins.cc.a.g */
/* compiled from: PG */
public final class C97525g {
    /* renamed from: a */
    static C89020ar m161464a(UriRequest uriRequest, int i) {
        C89019aq c = C89020ar.m144758c();
        try {
            c.mo82994f(uriRequest.f236331a.toString());
            c.mo82991c(uriRequest.mo81502a());
            c.f241245k = i;
            c.f241244j = true;
            return c.mo82989a();
        } catch (MalformedURLException e) {
            throw new C90457d((Throwable) e, (int) C89885b.HTTP_MALFORMED_URL_VALUE);
        }
    }
}
