package com.google.android.apps.gsa.staticplugins.opa.p8365h.p8366a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8215b.C106522a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.a.x */
/* compiled from: PG */
public final /* synthetic */ class C109168x implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C109144ac f303980a;

    public /* synthetic */ C109168x(C109144ac acVar) {
        this.f303980a = acVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C109144ac acVar = this.f303980a;
        C60870cx cxVar = C118826c.f331423b;
        try {
            acVar.f303933b.unregisterReceiver(acVar);
        } catch (RuntimeException unused) {
            ((C58970a) ((C58970a) acVar.f303932a.mo56224b()).mo56372aa(23895)).mo56386p("disconnectInternal(): unregisterReceiver failed");
        }
        acVar.f303935d.mo97658c();
        if (acVar.f303938g.mo85405j(C90017bw.f247872N)) {
            cxVar = C47638k.m84750a((Iterable) Collection.EL.stream((C58528ij) acVar.f303936e.mo6453a()).peek(new C109160p(acVar)).map(C109162r.f303973a).collect(C58370cn.f155946a)).mo51520a(C109163s.f303974a, acVar.f303939h);
            if (acVar.f303937f.isPresent()) {
                ((C106522a) acVar.f303937f.get()).mo95565b();
            }
        }
        return cxVar;
    }
}
