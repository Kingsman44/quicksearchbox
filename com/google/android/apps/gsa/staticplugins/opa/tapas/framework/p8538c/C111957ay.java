package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113343cn;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113404eo;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.ay */
/* compiled from: PG */
public final /* synthetic */ class C111957ay implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111971bl f311028a;

    /* renamed from: b */
    public final /* synthetic */ C111985p f311029b;

    /* renamed from: c */
    public final /* synthetic */ C113405ep f311030c;

    public /* synthetic */ C111957ay(C111971bl blVar, C111985p pVar, C113405ep epVar) {
        this.f311028a = blVar;
        this.f311029b = pVar;
        this.f311030c = epVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C113407er erVar;
        C111971bl blVar = this.f311028a;
        C111985p pVar = this.f311029b;
        C113405ep epVar = this.f311030c;
        C113408es esVar = (C113408es) obj;
        C58485gu b = pVar.mo99312b();
        if (!b.isEmpty()) {
            if (((long) esVar.mo100053o().size()) >= C113343cn.m187516a(blVar.f311058e, epVar)) {
                Collection.EL.stream(b).forEach(C111953au.f311022a);
                C58976aa aaVar = C58975e.f156826a;
                b = C58485gu.m89845m();
            } else {
                C113404eo e = epVar.mo100020e();
                e.mo100004d(esVar);
                b = (C58485gu) Collection.EL.stream(b).map(new C111954av(blVar, e.mo100001a())).collect(C58370cn.f155946a);
            }
        }
        if (b.isEmpty()) {
            erVar = esVar.mo100119b();
        } else {
            erVar = esVar.mo100119b();
            erVar.mo100097g(b);
        }
        erVar.mo100093c(pVar.mo99313c());
        C113408es a = erVar.mo100091a();
        blVar.f311065l.mo99803d(epVar.mo100016a(), C112976k.ON_DEVICE_RANKING);
        return a;
    }
}
