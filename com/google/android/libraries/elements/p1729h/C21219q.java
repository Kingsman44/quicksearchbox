package com.google.android.libraries.elements.p1729h;

import androidx.core.p097i.C1970e;
import com.google.common.p4522b.C58733pz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.elements.h.q */
/* compiled from: PG */
public final class C21219q {

    /* renamed from: a */
    public final C21203af f59539a;

    /* renamed from: b */
    public final Executor f59540b;

    /* renamed from: c */
    public final String f59541c;

    public C21219q(C21203af afVar, Executor executor) {
        this.f59539a = afVar;
        this.f59540b = executor;
        String b = afVar.mo26243b();
        this.f59541c = b;
        afVar.mo26244c(b);
    }

    /* renamed from: a */
    public static List m39918a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1970e eVar = (C1970e) it.next();
            if (!(eVar.f5888a == null || eVar.f5889b == null)) {
                C21197a aVar = new C21197a();
                aVar.mo26220b(C21199ab.NATIVE_LIBRARY_CHECK.f59483m);
                aVar.f59466c = Long.valueOf(((Long) eVar.f5889b).longValue() / 1000);
                C21228z k = C21198aa.m39840k();
                k.mo26252c(C58733pz.f156496a);
                C21205c cVar = (C21205c) k;
                cVar.f59498b = (String) eVar.f5888a;
                cVar.f59497a = new C21225w(false, 0);
                aVar.f59467d = k.mo26250a();
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
