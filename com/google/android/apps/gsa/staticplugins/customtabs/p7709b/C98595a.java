package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.libraries.p1703d.C20670z;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.a */
/* compiled from: PG */
public final class C98595a {

    /* renamed from: a */
    public final C86124t f275369a;

    /* renamed from: b */
    private final Uri f275370b = Uri.parse("https://www.google.com");

    /* renamed from: c */
    private final C84474e f275371c;

    public C98595a(C86124t tVar, C84474e eVar) {
        this.f275369a = tVar;
        this.f275371c = eVar;
    }

    /* renamed from: a */
    public static Uri m163340a(Uri uri) {
        if (uri.getQueryParameter("amp_url") == null) {
            return uri;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String next : uri.getQueryParameterNames()) {
            if (!next.equals("amp_url")) {
                for (String appendQueryParameter : uri.getQueryParameters(next)) {
                    clearQuery.appendQueryParameter(next, appendQueryParameter);
                }
            }
        }
        return clearQuery.build();
    }

    /* renamed from: d */
    public static Uri m163341d(Uri uri, int i) {
        int i2 = i - 1;
        String str = i2 != 2 ? i2 != 3 ? null : "21" : "20";
        return str != null ? uri.buildUpon().appendQueryParameter("ri", str).build() : uri;
    }

    /* renamed from: b */
    public final void mo91203b(Intent intent, Uri uri) {
        intent.putExtra("android.support.customtabs.PARALLEL_REQUEST_URL", uri);
        intent.putExtra("android.support.customtabs.PARALLEL_REQUEST_REFERRER", this.f275370b);
        intent.putExtra("android.support.customtabs.PARALLEL_REQUEST_REFERRER_POLICY", 4);
    }

    /* renamed from: c */
    public final boolean mo91204c(C20670z zVar) {
        C58485gu c = this.f275369a.mo79745c(C90110fh.f250598W);
        int size = c.size();
        for (int i = 0; i < size; i++) {
            zVar.mo25664c(Uri.parse((String) c.get(i)));
        }
        if (!this.f275369a.mo79746e(C90110fh.f250592Q)) {
            return false;
        }
        zVar.mo25664c(this.f275370b);
        return zVar.mo25666e();
    }

    /* renamed from: e */
    public final int mo91205e(C98642y yVar) {
        if (!this.f275369a.mo79746e(C90110fh.f250592Q) || this.f275371c.mo78134w()) {
            return 2;
        }
        if (yVar == null) {
            return 3;
        }
        return !yVar.f275509n ? 4 : 1;
    }
}
