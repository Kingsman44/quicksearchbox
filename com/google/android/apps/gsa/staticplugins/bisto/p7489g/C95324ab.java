package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.ab */
/* compiled from: PG */
public final /* synthetic */ class C95324ab implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C95345aw f266708a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f266709b;

    public /* synthetic */ C95324ab(C95345aw awVar, ArrayList arrayList) {
        this.f266708a = awVar;
        this.f266709b = arrayList;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C95345aw awVar = this.f266708a;
        ArrayList arrayList = this.f266709b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C60870cx cxVar = (C60870cx) arrayList.get(i);
            i++;
            if (C90877ak.m148478l(cxVar)) {
                return cxVar;
            }
        }
        awVar.mo89268i();
        return C60866ct.f164955a;
    }
}
