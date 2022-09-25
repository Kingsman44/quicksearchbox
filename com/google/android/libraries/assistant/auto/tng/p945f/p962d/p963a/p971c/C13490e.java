package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13531g;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13532h;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13512e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13513f;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61886aw;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.e */
/* compiled from: PG */
public final /* synthetic */ class C13490e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C13495j f41385a;

    public /* synthetic */ C13490e(C13495j jVar) {
        this.f41385a = jVar;
    }

    public final Object apply(Object obj) {
        C13512e eVar = (C13512e) obj;
        C58833ax a = this.f41385a.mo21104a();
        if (!a.mo56113h()) {
            return C13532h.f41482d;
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(((C61886aw) a.mo56107c()).mo58325a()).map(C13481c.f41364a).distinct().collect(C58370cn.f155946a);
        C13531g gVar = (C13531g) C13532h.f41482d.createBuilder();
        gVar.copyOnWrite();
        C13532h hVar = (C13532h) gVar.instance;
        C62971cq cqVar = hVar.f41485b;
        if (!cqVar.mo58948c()) {
            hVar.f41485b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) hVar.f41485b);
        int k = eVar.mo21153k();
        if (k != 0) {
            if (k == 8 && eVar.mo21147f().mo56113h()) {
                int a2 = C13513f.m29794a(((Long) eVar.mo21147f().mo56107c()).longValue());
                gVar.copyOnWrite();
                C13532h hVar2 = (C13532h) gVar.instance;
                hVar2.f41484a |= 1;
                hVar2.f41486c = a2;
            }
            return (C13532h) gVar.build();
        }
        throw null;
    }
}
