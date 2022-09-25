package com.google.android.libraries.lens.ondevice.p2026f;

import com.google.android.libraries.lens.ondevice.p2034k.C24650eg;
import com.google.android.libraries.lens.ondevice.p2034k.C24657en;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63242o;
import java.util.List;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.lens.ondevice.f.c */
/* compiled from: PG */
public final /* synthetic */ class C24474c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C24491t f66988a;

    /* renamed from: b */
    public final /* synthetic */ C24490s f66989b;

    /* renamed from: c */
    public final /* synthetic */ C58495hd f66990c;

    public /* synthetic */ C24474c(C24491t tVar, C24490s sVar, C58495hd hdVar) {
        this.f66988a = tVar;
        this.f66989b = sVar;
        this.f66990c = hdVar;
    }

    public final Object apply(Object obj) {
        C24491t tVar = this.f66988a;
        C24490s sVar = this.f66989b;
        C58495hd hdVar = this.f66990c;
        C58495hd c = tVar.mo29915c(C24491t.m45562e((List) obj, ((C24472b) sVar).f66986b), false);
        C58480gp e = C58485gu.m89837e();
        C58800sl lA = hdVar.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            e.mo55395g(new C24437a((C63242o) Map.EL.getOrDefault(C24657en.f67463a, ((C24650eg) entry.getValue()).getClass(), C63242o.PRIMITIVE_TYPE_UNKNOWN), (C24803n) c.getOrDefault((String) entry.getKey(), C24803n.f67770c)));
        }
        return e.mo55394f();
    }
}
