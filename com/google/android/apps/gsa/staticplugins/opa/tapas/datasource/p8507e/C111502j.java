package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8507e;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113161bs;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.e.j */
/* compiled from: PG */
public final /* synthetic */ class C111502j implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C111506n f310160a;

    /* renamed from: b */
    public final /* synthetic */ String f310161b;

    public /* synthetic */ C111502j(C111506n nVar, String str) {
        this.f310160a = nVar;
        this.f310161b = str;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C111506n nVar = this.f310160a;
        String str = this.f310161b;
        C54228aq aqVar = (C54228aq) obj;
        if (!nVar.f310165a) {
            return true;
        }
        return C113161bs.m187176b(aqVar.f142331b).toLowerCase(Locale.getDefault()).startsWith(str);
    }
}
