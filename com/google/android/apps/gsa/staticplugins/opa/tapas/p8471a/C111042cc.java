package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.cc */
/* compiled from: PG */
public final /* synthetic */ class C111042cc implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C111053cn f309245a;

    public /* synthetic */ C111042cc(C111053cn cnVar) {
        this.f309245a = cnVar;
    }

    public final C60870cx apply(Object obj) {
        C111053cn cnVar = this.f309245a;
        Stream stream = Collection.EL.stream((List) obj);
        int i = C111050ck.f309257a;
        return C60856cj.m92896e((C58485gu) Collection.EL.stream((C58485gu) stream.filter(new C111048ci(new ConcurrentHashMap())).collect(C58370cn.f155946a)).map(new C111051cl(cnVar)).collect(C58370cn.f155946a));
    }
}
