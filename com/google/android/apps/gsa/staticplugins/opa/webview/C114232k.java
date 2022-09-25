package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6785d.C85762c;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.search.Query;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.k */
/* compiled from: PG */
public final /* synthetic */ class C114232k implements C85762c {

    /* renamed from: a */
    public final /* synthetic */ C114235n f316764a;

    /* renamed from: b */
    public final /* synthetic */ Query f316765b;

    public /* synthetic */ C114232k(C114235n nVar, Query query) {
        this.f316764a = nVar;
        this.f316765b = query;
    }

    /* renamed from: a */
    public final void mo79414a(Uri uri, Uri uri2, long j) {
        C114235n nVar = this.f316764a;
        if (!nVar.f316776d.mo101264a(this.f316765b, uri2.toString(), (String) null)) {
            HashMap hashMap = new HashMap();
            if (uri != null) {
                hashMap.put("Referer", Uri.EMPTY.buildUpon().authority(uri.getAuthority()).scheme(uri2.getScheme()).build().toString());
            }
            nVar.mo101272b(new UriRequest(uri2, hashMap, (Map) null, (byte[]) null), Long.valueOf(j));
        }
    }
}
