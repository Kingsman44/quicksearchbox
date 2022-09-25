package com.google.android.apps.gsa.staticplugins.save.p8694a;

import android.net.Uri;
import com.google.C54649b;
import com.google.android.apps.gsa.search.core.p6519al.p6662co.C85167c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58759qy;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.ap */
/* compiled from: PG */
public final /* synthetic */ class C116385ap implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C116388as f322745a;

    /* renamed from: b */
    public final /* synthetic */ Uri f322746b;

    public /* synthetic */ C116385ap(C116388as asVar, Uri uri) {
        this.f322745a = asVar;
        this.f322746b = uri;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C116388as asVar = this.f322745a;
        Uri uri = this.f322746b;
        String F = asVar.f322753b.mo79659F();
        if (F != null) {
            long b = asVar.f322754c.mo26870b();
            if (b - asVar.f322755f.f322702a.getLong("account-updated-ms:".concat(F), 0) >= 86400000 && asVar.f322755f.mo102663a(F) != 0) {
                asVar.f322756g.mo28211k(((C85167c) asVar.f322757h.mo27525b()).mo78754i(new C58759qy(C57665z.WEB_PAGE), F), "Search items callback", new C116386aq(asVar, F, b));
            }
        }
        String a = C54649b.m87519a(uri.toString());
        String F2 = asVar.f322753b.mo79659F();
        boolean z = false;
        if (F2 != null && asVar.f322755f.mo102664b(F2).contains(a)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
