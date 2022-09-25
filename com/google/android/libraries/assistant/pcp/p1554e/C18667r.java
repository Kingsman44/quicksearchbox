package com.google.android.libraries.assistant.pcp.p1554e;

import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.assistant.p3803ag.p3809c.C49099gk;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.pcp.e.r */
/* compiled from: PG */
public final /* synthetic */ class C18667r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f52699a;

    /* renamed from: b */
    public final /* synthetic */ C18579g f52700b;

    public /* synthetic */ C18667r(C58528ij ijVar, C18579g gVar) {
        this.f52699a = ijVar;
        this.f52700b = gVar;
    }

    public final Object apply(Object obj) {
        C58528ij ijVar = this.f52699a;
        C49099gk gkVar = (C49099gk) obj;
        return Collection.EL.stream(gkVar.f126988d).filter(new C18644an(ijVar)).filter(new C18645ao(C18650at.m36107c(gkVar, ijVar, new C58759qy(this.f52700b)))).map(C18646ap.f52672a).filter(C18647aq.f52673a).map(C18648ar.f52674a).findFirst();
    }
}
