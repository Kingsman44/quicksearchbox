package com.google.android.libraries.assistant.p1363c.p1371b.p1377e.p1378a;

import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58670nq;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.b.e.a.h */
/* compiled from: PG */
public final /* synthetic */ class C17103h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Optional f49771a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f49772b;

    public /* synthetic */ C17103h(Optional optional, C58528ij ijVar) {
        this.f49771a = optional;
        this.f49772b = ijVar;
    }

    public final Object apply(Object obj) {
        Optional optional = this.f49771a;
        C58528ij ijVar = this.f49772b;
        C58485gu guVar = (C58485gu) Collection.EL.stream((C58528ij) obj).filter(new C17100e(optional)).collect(C58370cn.f155946a);
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(ijVar).filter(new C17101f(optional)).collect(C58370cn.f155946a);
        if (guVar2.isEmpty()) {
            return Optional.empty();
        }
        C10882h hVar = (C10882h) Collection.EL.stream(guVar2).collect(C58670nq.f156403c);
        if (guVar.isEmpty()) {
            return Optional.m71637of(new C17105j(hVar));
        }
        if (optional.isPresent()) {
            return Optional.empty();
        }
        if (hVar.mo19282a() > ((C10882h) Collection.EL.stream(guVar).collect(C58670nq.f156403c)).mo19282a()) {
            return Optional.m71637of(new C17105j(hVar));
        }
        return Optional.empty();
    }
}
