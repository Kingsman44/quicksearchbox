package com.google.android.libraries.assistant.pcp.p1554e;

import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.assistant.p3803ag.p3809c.C49099gk;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.pcp.e.as */
/* compiled from: PG */
public final /* synthetic */ class C18649as implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C18579g f52675a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f52676b;

    public /* synthetic */ C18649as(C18579g gVar, C58528ij ijVar) {
        this.f52675a = gVar;
        this.f52676b = ijVar;
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream(((C49099gk) obj).f126987c).filter(new C18651b(this.f52675a)).map(new C18652c(this.f52676b)).filter(C18653d.f52684a).findFirst();
    }
}
