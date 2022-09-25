package com.google.android.libraries.lens.view.p2078at.p2079a;

import android.net.Uri;
import com.google.android.libraries.web.contrib.requestblock.C43721h;
import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.libraries.lens.view.at.a.a */
/* compiled from: PG */
public final /* synthetic */ class C25482a implements C43721h {

    /* renamed from: a */
    public final /* synthetic */ boolean f69435a;

    public /* synthetic */ C25482a(boolean z) {
        this.f69435a = z;
    }

    /* renamed from: a */
    public final boolean mo30517a(C43367l lVar) {
        if (!this.f69435a) {
            return false;
        }
        Uri.parse(lVar.f113297c);
        Uri parse = Uri.parse(lVar.f113296b);
        if (!lVar.f113298d) {
            return false;
        }
        String authority = parse.getAuthority();
        if ("accounts.google.com".equals(authority) || "myaccount.google.com".equals(authority)) {
            return true;
        }
        return false;
    }
}
