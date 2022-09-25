package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8234b;

import com.google.android.libraries.assistant.pcp.p1573k.C18913ab;
import com.google.android.p10897j.p10898a.p10899a.p10900a.p10901a.p10902a.p10903a.p10904a.C146595c;
import com.google.android.p10897j.p10898a.p10899a.p10900a.p10901a.p10902a.p10903a.p10904a.C146597e;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.b.d */
/* compiled from: PG */
public final /* synthetic */ class C106625d implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C106625d f297266a = new C106625d();

    private /* synthetic */ C106625d() {
    }

    public final Object apply(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            C146595c cVar = (C146595c) C146597e.f395952d.createBuilder();
            cVar.copyOnWrite();
            C146597e eVar = (C146597e) cVar.instance;
            eVar.f395955b = 2;
            eVar.f395954a = 1 | eVar.f395954a;
            return (C146597e) cVar.build();
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(((C18913ab) axVar.mo56107c()).mo24150g()).map(C106622a.f297263a).collect(C58370cn.f155946a);
        C146595c cVar2 = (C146595c) C146597e.f395952d.createBuilder();
        cVar2.copyOnWrite();
        C146597e eVar2 = (C146597e) cVar2.instance;
        C62971cq cqVar = eVar2.f395956c;
        if (!cqVar.mo58948c()) {
            eVar2.f395956c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) eVar2.f395956c);
        int i = true != guVar.isEmpty() ? 5 : 4;
        cVar2.copyOnWrite();
        C146597e eVar3 = (C146597e) cVar2.instance;
        eVar3.f395955b = i - 1;
        eVar3.f395954a |= 1;
        return (C146597e) cVar2.build();
    }
}
