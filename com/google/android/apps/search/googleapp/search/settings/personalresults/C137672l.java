package com.google.android.apps.search.googleapp.search.settings.personalresults;

import android.net.Uri;
import com.google.android.libraries.web.contrib.requestblock.C43721h;
import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.personalresults.l */
/* compiled from: PG */
public final /* synthetic */ class C137672l implements C43721h {

    /* renamed from: a */
    public static final /* synthetic */ C137672l f374466a = new C137672l();

    private /* synthetic */ C137672l() {
    }

    /* renamed from: a */
    public final boolean mo30517a(C43367l lVar) {
        Uri parse = Uri.parse(lVar.f113296b);
        String authority = parse.getAuthority();
        String scheme = parse.getScheme();
        String path = parse.getPath();
        if (authority == null || !"https".equals(scheme)) {
            return false;
        }
        if ("accounts.google.com".equals(authority) || ("www.google.com".equals(authority) && "/setting/search/privateresults/".equals(path))) {
            return true;
        }
        return false;
    }
}
