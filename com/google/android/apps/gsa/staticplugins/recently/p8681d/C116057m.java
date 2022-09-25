package com.google.android.apps.gsa.staticplugins.recently.p8681d;

import com.google.android.apps.gsa.staticplugins.p7611bv.C97280c;
import com.google.android.libraries.gsa.p1875j.C22831b;
import com.google.android.libraries.gsa.p1875j.C22840k;
import com.google.android.libraries.gsa.p1875j.C22844o;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4575r.C60761r;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.m */
/* compiled from: PG */
public final /* synthetic */ class C116057m implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C116070z f321810a;

    /* renamed from: b */
    public final /* synthetic */ String f321811b;

    /* renamed from: c */
    public final /* synthetic */ C97280c f321812c;

    public /* synthetic */ C116057m(C116070z zVar, String str, C97280c cVar) {
        this.f321810a = zVar;
        this.f321811b = str;
        this.f321812c = cVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C116070z zVar = this.f321810a;
        String str = this.f321811b;
        C97280c cVar = this.f321812c;
        C22831b bVar = (C22831b) zVar.f321845f.get(str);
        boolean z = false;
        if (bVar == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        String str2 = cVar.f271693b;
        if (str2 != null) {
            for (C22845p pVar : bVar.f62862a) {
                int a = C22840k.m42693a(pVar.f62894c);
                if (a != 0 && a == 2) {
                    C22844o oVar = pVar.f62897f;
                    if (oVar == null) {
                        oVar = C22844o.f62884e;
                    }
                    if (str2.equalsIgnoreCase(oVar.f62887b)) {
                        arrayList.add(Long.valueOf(pVar.f62893b));
                    }
                }
            }
        }
        long[] g = C60761r.m92761g(arrayList);
        int n = C116070z.m192422n(bVar, g);
        int length = g.length;
        C116070z.m192423w(4, 3, length, n);
        zVar.mo102438h(g, str);
        if (length > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
