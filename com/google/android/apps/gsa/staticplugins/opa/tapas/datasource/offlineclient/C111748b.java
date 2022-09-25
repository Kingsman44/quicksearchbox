package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.offlineclient;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.offlineclient.b */
/* compiled from: PG */
public final /* synthetic */ class C111748b implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C111748b f310633a = new C111748b();

    private /* synthetic */ C111748b() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58485gu guVar = (C58485gu) Collection.EL.stream((List) obj).map(C111749c.f310634a).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            return C113408es.f314036b;
        }
        C113407er p = C113408es.m187705p();
        p.mo100096f(C113339cj.m187495c(C113339cj.m187496d(guVar)));
        return p.mo100091a();
    }
}
