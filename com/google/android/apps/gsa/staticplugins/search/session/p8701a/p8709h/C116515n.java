package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import android.net.Uri;
import com.google.android.apps.gsa.p6484r.C84250e;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.search.Query;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.n */
/* compiled from: PG */
final class C116515n extends C84250e {

    /* renamed from: b */
    final /* synthetic */ C116516o f323061b;

    public C116515n(C116516o oVar) {
        this.f323061b = oVar;
    }

    /* renamed from: d */
    public final boolean mo77733d() {
        Query query = this.f323061b.f323065d.f323784p;
        if (query.mo84391cX()) {
            Uri uri = this.f323061b.f323064c.mo79573m(query, true).f236331a;
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.clearQuery();
            for (String next : uri.getQueryParameterNames()) {
                if (!next.equals("tch")) {
                    buildUpon.appendQueryParameter(next, uri.getQueryParameter(next));
                }
            }
            this.f323061b.mo102745c(new UriRequest(buildUpon.build(), (Map) null, (Map) null, (byte[]) null), (Long) null);
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo77734e() {
        return true;
    }
}
