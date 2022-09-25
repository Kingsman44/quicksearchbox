package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.ap */
/* compiled from: PG */
public final class C113131ap implements Supplier {

    /* renamed from: a */
    public static final C59071e f313439a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.q.ap");

    /* renamed from: b */
    Optional f313440b = Optional.empty();

    /* renamed from: c */
    long f313441c = Long.MIN_VALUE;

    /* renamed from: d */
    final Function f313442d;

    /* renamed from: e */
    final C86124t f313443e;

    /* renamed from: f */
    final C58485gu f313444f;

    public C113131ap(C86124t tVar, Function function, Object... objArr) {
        this.f313443e = tVar;
        this.f313442d = function;
        C58893dc.m90999d(objArr.length > 0, "This class is indended for use with at least one relevant GsaConfigFlag param", new Object[0]);
        this.f313444f = (C58485gu) DesugarArrays.stream((T[]) objArr).map(C113127al.f313430a).collect(C58370cn.f155946a);
    }

    /* renamed from: a */
    private final boolean m187148a() {
        boolean z;
        C58485gu guVar = this.f313444f;
        int size = guVar.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            C113130ao aoVar = (C113130ao) guVar.get(i);
            Object g = aoVar.f313437a.mo99890g(this.f313443e);
            if (g == null) {
                z = aoVar.f313438b != null;
            } else {
                z = !g.equals(aoVar.f313438b);
            }
            if (z) {
                Object obj = aoVar.f313438b;
                aoVar.f313438b = g;
                z2 = true;
            }
        }
        return z2;
    }

    public final synchronized Object get() {
        if (this.f313440b.isEmpty()) {
            this.f313441c = this.f313443e.f232786f.f232745c;
            m187148a();
            Optional ofNullable = Optional.ofNullable(this.f313442d.apply(this.f313443e));
            this.f313440b = ofNullable;
            ofNullable.get();
        } else if (this.f313441c < this.f313443e.f232786f.f232745c) {
            this.f313441c = this.f313443e.f232786f.f232745c;
            if (m187148a()) {
                Optional ofNullable2 = Optional.ofNullable(this.f313442d.apply(this.f313443e));
                this.f313440b = ofNullable2;
                ofNullable2.get();
            }
        }
        return this.f313440b.get();
    }
}
