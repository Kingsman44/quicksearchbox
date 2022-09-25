package com.google.android.libraries.lens.view.p2078at.p2079a;

import android.net.Uri;
import com.google.android.libraries.web.contrib.requestblock.C43721h;
import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.libraries.lens.view.at.a.c */
/* compiled from: PG */
public final /* synthetic */ class C25488c implements C43721h {

    /* renamed from: a */
    public static final /* synthetic */ C25488c f69445a = new C25488c();

    private /* synthetic */ C25488c() {
    }

    /* renamed from: a */
    public final boolean mo30517a(C43367l lVar) {
        Uri.parse(lVar.f113297c);
        Uri parse = Uri.parse(lVar.f113296b);
        if (!lVar.f113298d) {
            return false;
        }
        String path = parse.getPath();
        if ("/blessme".equals(path) || "/uberproxy/loginz".equals(path)) {
            return true;
        }
        return false;
    }
}
