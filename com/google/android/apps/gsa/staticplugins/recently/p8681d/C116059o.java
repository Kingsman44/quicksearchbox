package com.google.android.apps.gsa.staticplugins.recently.p8681d;

import com.google.android.apps.gsa.staticplugins.p7611bv.C97278ah;
import com.google.android.libraries.gsa.p1875j.C22831b;
import com.google.android.libraries.gsa.p1875j.C22840k;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4575r.C60761r;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.o */
/* compiled from: PG */
public final /* synthetic */ class C116059o implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C116070z f321816a;

    /* renamed from: b */
    public final /* synthetic */ String f321817b;

    /* renamed from: c */
    public final /* synthetic */ C97278ah f321818c;

    public /* synthetic */ C116059o(C116070z zVar, String str, C97278ah ahVar) {
        this.f321816a = zVar;
        this.f321817b = str;
        this.f321818c = ahVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C116070z zVar = this.f321816a;
        String str = this.f321817b;
        C97278ah ahVar = this.f321818c;
        C22831b bVar = (C22831b) zVar.f321845f.get(str);
        boolean z = false;
        if (bVar == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        String str2 = ahVar.f271689b;
        if (str2 != null) {
            for (C22845p pVar : bVar.f62862a) {
                int a = C22840k.m42693a(pVar.f62894c);
                if (a == 0) {
                    a = 1;
                }
                if ((a == 1 || a == 13 || a == 11) && str2.equalsIgnoreCase(pVar.f62896e)) {
                    arrayList.add(Long.valueOf(pVar.f62893b));
                }
            }
        }
        long[] g = C60761r.m92761g(arrayList);
        int n = C116070z.m192422n(bVar, g);
        int length = g.length;
        C116070z.m192423w(4, 2, length, n);
        zVar.mo102438h(g, str);
        if (length > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
