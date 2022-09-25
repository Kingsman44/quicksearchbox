package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import java.util.Collection;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.jd */
/* compiled from: PG */
public final /* synthetic */ class C109313jd implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C109317jh f304497a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f304498b;

    public /* synthetic */ C109313jd(C109317jh jhVar, C58528ij ijVar) {
        this.f304497a = jhVar;
        this.f304498b = ijVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C109317jh jhVar = this.f304497a;
        C58528ij ijVar = this.f304498b;
        C123746bm bmVar = (C123746bm) obj;
        if (bmVar == null) {
            return C58485gu.m89845m();
        }
        return C58485gu.m89842j((Collection) Collection.EL.stream(bmVar.f341820a).flatMap(new C109300iw(jhVar, ijVar)).filter(new C109301ix(new C109316jg())).collect(C58370cn.f155946a));
    }
}
