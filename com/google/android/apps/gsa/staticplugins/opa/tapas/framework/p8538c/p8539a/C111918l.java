package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.l */
/* compiled from: PG */
public final /* synthetic */ class C111918l implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111890ab f310944a;

    /* renamed from: b */
    public final /* synthetic */ String f310945b;

    public /* synthetic */ C111918l(C111890ab abVar, String str) {
        this.f310944a = abVar;
        this.f310945b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111890ab abVar = this.f310944a;
        String str = this.f310945b;
        C111889aa aaVar = (C111889aa) obj;
        C111915i iVar = abVar.f310912e;
        Duration c = abVar.mo99292c();
        C111917k kVar = aaVar.f310906a;
        C58485gu guVar = aaVar.f310907b;
        String c2 = kVar.mo99296c();
        int i = 0;
        while (i < guVar.size()) {
            if (c == null) {
                throw new NullPointerException("Null predictionTime");
            } else if (str == null) {
                throw new NullPointerException("Null modelName");
            } else if (c2 != null) {
                C111888a aVar = new C111888a(c, str, c2, i);
                List list = (List) Map.EL.computeIfAbsent(iVar.f310943a, C113190cu.m187216d(C58890d.m90988c((String) guVar.get(i))), C111911e.f310940a);
                synchronized (list) {
                    list.add(aVar);
                }
                i++;
            } else {
                throw new NullPointerException("Null modelConfig");
            }
        }
        return aaVar.f310907b;
    }
}
