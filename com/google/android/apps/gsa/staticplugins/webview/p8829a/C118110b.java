package com.google.android.apps.gsa.staticplugins.webview.p8829a;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6820r.C86497j;
import com.google.android.apps.gsa.search.core.p6820r.C86567m;
import com.google.android.apps.gsa.search.core.p6820r.p6832d.C86413b;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.a.b */
/* compiled from: PG */
public final class C118110b extends C86413b {

    /* renamed from: a */
    private final C85929cw f327755a;

    /* renamed from: b */
    private final C21370a f327756b;

    public C118110b(C22871g gVar, C85929cw cwVar, C21370a aVar) {
        super(gVar);
        this.f327755a = cwVar;
        this.f327756b = aVar;
    }

    /* renamed from: b */
    public final String mo79837b() {
        return "WebViewResultFakeFetcher";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C86497j mo80171e(Query query) {
        UriRequest uriRequest;
        if (query.mo84373cF()) {
            uriRequest = new UriRequest(Uri.parse(query.f252774m), (Map) null, (Map) null, (byte[]) null);
        } else {
            uriRequest = this.f327755a.mo79573m(query, false);
        }
        return new C86567m(C60856cj.m92900i(C58833ax.m90834k(new C118109a(query, uriRequest, this.f327756b.mo26870b()))));
    }
}
