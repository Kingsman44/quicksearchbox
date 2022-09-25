package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10214s.C134538ac;
import com.google.android.apps.search.googleapp.discover.p10214s.C134560ay;
import com.google.android.apps.search.googleapp.discover.p10214s.C134587e;
import com.google.android.apps.search.googleapp.discover.p10237t.C134925a;
import java.util.Iterator;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.r */
/* compiled from: PG */
public final class C135361r {
    /* renamed from: a */
    public static final C135362s m219505a(C134925a aVar) {
        Object obj;
        C134587e eVar;
        C69664n.m101061g(aVar, "clientResponse");
        Iterator it = aVar.f367365c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C134560ay ayVar = ((C134538ac) obj).f366380c;
            if (ayVar == null) {
                ayVar = C134560ay.f366453g;
            }
            if (ayVar.f366456b == 18) {
                break;
            }
        }
        C134538ac acVar = (C134538ac) obj;
        if (acVar == null) {
            return new C135362s(aVar.f367365c, (C134587e) null);
        }
        List L = C69540x.m100830L(aVar.f367365c, acVar);
        C134560ay ayVar2 = acVar.f366380c;
        if (ayVar2 == null) {
            ayVar2 = C134560ay.f366453g;
        }
        if (ayVar2.f366456b == 18) {
            eVar = (C134587e) ayVar2.f366457c;
        } else {
            eVar = C134587e.f366522e;
        }
        return new C135362s(L, eVar);
    }
}
