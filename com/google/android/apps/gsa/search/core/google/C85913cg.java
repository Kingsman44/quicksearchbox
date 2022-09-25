package com.google.android.apps.gsa.search.core.google;

import android.net.Uri;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.search.core.google.cg */
/* compiled from: PG */
final class C85913cg extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C58881cr f232260a;

    /* renamed from: b */
    final /* synthetic */ C85919cm f232261b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85913cg(C85919cm cmVar, C58881cr crVar) {
        super("logResultClick", 2, 12);
        this.f232261b = cmVar;
        this.f232260a = crVar;
    }

    public final void run() {
        C85919cm cmVar = this.f232261b;
        UriRequest uriRequest = (UriRequest) this.f232260a.mo6453a();
        Uri uri = uriRequest.f236331a;
        String queryParameter = uri.getQueryParameter("sa");
        if (queryParameter == null) {
            uri = uri.buildUpon().appendQueryParameter("sa", "T").build();
        } else if (!queryParameter.equals("T")) {
            Uri.Builder clearQuery = uri.buildUpon().clearQuery();
            for (String next : uri.getQueryParameterNames()) {
                if (!next.equals("sa")) {
                    for (String appendQueryParameter : uri.getQueryParameters(next)) {
                        clearQuery.appendQueryParameter(next, appendQueryParameter);
                    }
                }
            }
            clearQuery.appendQueryParameter("sa", "T");
            uri = clearQuery.build();
        }
        cmVar.mo79543b(uri, uriRequest.mo81502a());
    }
}
