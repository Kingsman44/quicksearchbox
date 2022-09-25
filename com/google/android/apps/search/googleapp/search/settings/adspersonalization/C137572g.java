package com.google.android.apps.search.googleapp.search.settings.adspersonalization;

import android.net.Uri;
import com.google.android.libraries.web.contrib.requestblock.C43721h;
import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.adspersonalization.g */
/* compiled from: PG */
public final /* synthetic */ class C137572g implements C43721h {

    /* renamed from: a */
    public static final /* synthetic */ C137572g f374193a = new C137572g();

    private /* synthetic */ C137572g() {
    }

    /* renamed from: a */
    public final boolean mo30517a(C43367l lVar) {
        Uri parse = Uri.parse(lVar.f113296b);
        String authority = parse.getAuthority();
        String scheme = parse.getScheme();
        if (authority == null || !"https".equals(scheme)) {
            return false;
        }
        if ("adssettings.google.com".equals(authority) || "accounts.google.com".equals(authority)) {
            return true;
        }
        return false;
    }
}
