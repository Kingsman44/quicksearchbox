package com.google.android.apps.gsa.search.core.p6502ae;

import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21454b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.ae.c */
/* compiled from: PG */
public final class C84462c {

    /* renamed from: c */
    private static final C58495hd f229862c;

    /* renamed from: a */
    public final String f229863a;

    /* renamed from: b */
    public final Map f229864b;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C84417a.f229698a, "suggest-query");
        gzVar.mo55429h(C84417a.f229699b, "gmail");
        gzVar.mo55429h(C84417a.f229700c, "sms");
        f229862c = gzVar.mo55427f(false);
    }

    public C84462c(String str) {
        int i = C84460b.f229861a;
        C58495hd hdVar = f229862c;
        this.f229863a = str;
        this.f229864b = hdVar;
    }

    /* renamed from: a */
    public static String m134798a(String str, String str2) {
        return str + "/" + str2;
    }

    /* renamed from: b */
    public static String m134799b(String str, C21454b bVar) {
        if (str.equals(bVar.f59905a.mo117711g())) {
            return m134798a(str, bVar.f59905a.mo117709e());
        }
        String g = bVar.f59905a.mo117711g();
        return "com.google.android.gms".equals(g) ? "com.google.android.gms/".concat(String.valueOf(bVar.f59905a.mo117709e())) : g;
    }
}
