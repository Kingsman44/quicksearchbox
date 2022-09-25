package com.google.apps.p3589d.p3599j;

import com.google.apps.p3589d.p3592c.C45731g;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45760s;

/* renamed from: com.google.apps.d.j.k */
/* compiled from: PG */
public final /* synthetic */ class C45920k implements C45905ac {

    /* renamed from: a */
    public static final /* synthetic */ C45920k f120701a = new C45920k();

    private /* synthetic */ C45920k() {
    }

    /* renamed from: a */
    public final boolean mo50024a(C45755n nVar) {
        C45917h hVar = C45909ag.f120669a;
        if (!(nVar instanceof C45760s)) {
            return false;
        }
        C45760s sVar = (C45760s) nVar;
        if (!sVar.f120331a) {
            return false;
        }
        Integer c = C45909ag.m81975c(C45731g.m81514l(sVar.f120333i));
        Integer c2 = C45909ag.m81975c(C45731g.m81514l(sVar.f120334j));
        if (c == null || c2 == null) {
            return false;
        }
        int intValue = c.intValue();
        int intValue2 = c2.intValue();
        return intValue > 0 && intValue <= 19 && intValue2 > 0 && intValue2 <= 10;
    }
}
