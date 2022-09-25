package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113343cn;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113404eo;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.ah */
/* compiled from: PG */
public final /* synthetic */ class C111817ah implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C111823an f310747a;

    /* renamed from: b */
    public final /* synthetic */ boolean f310748b;

    /* renamed from: c */
    public final /* synthetic */ List f310749c;

    public /* synthetic */ C111817ah(C111823an anVar, boolean z, List list) {
        this.f310747a = anVar;
        this.f310748b = z;
        this.f310749c = list;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C111823an anVar = this.f310747a;
        boolean z = this.f310748b;
        List list = this.f310749c;
        C113408es esVar = (C113408es) obj;
        if (!z) {
            if (((long) esVar.mo100053o().size()) >= C113343cn.m187516a(anVar.f310761d.f310769c, anVar.f310759b)) {
                Collection.EL.stream(list).forEach(C111813ad.f310742a);
                C58976aa aaVar = C58975e.f156826a;
            } else {
                C113404eo e = anVar.f310759b.mo100020e();
                e.mo100004d(esVar);
                C113405ep a = e.mo100001a();
                C113407er b = esVar.mo100119b();
                b.mo100097g((List) Collection.EL.stream(list).map(new C111814ae(anVar, a)).collect(Collectors.toList()));
                esVar = b.mo100091a();
            }
            anVar.mo57358p(C60856cj.m92900i(esVar));
        }
    }
}
