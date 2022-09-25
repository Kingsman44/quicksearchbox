package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p386ak.C8396l;
import com.google.p386ak.C8398n;
import com.google.p386ak.C8404t;
import java.util.Iterator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.m */
/* compiled from: PG */
public final class C106057m {
    /* renamed from: a */
    public static Optional m176671a(C8398n nVar) {
        if (!(nVar instanceof C8396l)) {
            return Optional.empty();
        }
        C58480gp e = C58485gu.m89837e();
        Iterator it = nVar.mo17160f().iterator();
        while (it.hasNext()) {
            C8398n nVar2 = (C8398n) it.next();
            if ((nVar2 instanceof C8404t) && (nVar2.mo17162h().f29256a instanceof String)) {
                e.mo55395g(nVar2.mo17154d());
            }
        }
        return Optional.m71637of(e.mo55394f());
    }
}
