package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113188cs;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.h */
/* compiled from: PG */
public final /* synthetic */ class C111404h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111405i f309957a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f309958b;

    public /* synthetic */ C111404h(C111405i iVar, C113405ep epVar) {
        this.f309957a = iVar;
        this.f309958b = epVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111405i iVar = this.f309957a;
        C113408es esVar = (C113408es) obj;
        this.f309958b.mo100033p();
        esVar.mo100053o().size();
        C113407er p = C113408es.m187705p();
        Stream filter = Collection.EL.stream(esVar.mo100053o()).filter(C111400d.f309953a);
        C113188cs csVar = iVar.f309961a;
        Objects.requireNonNull(csVar);
        p.mo100096f(C113339cj.m187495c(C113339cj.m187496d((List) filter.map(new C111401e(csVar)).filter(C111402f.f309955a).map(C111403g.f309956a).collect(C58370cn.f155946a))));
        return p.mo100091a();
    }
}
