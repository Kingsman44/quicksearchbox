package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.p1223d;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16064a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16169m;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16328ab;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16331ae;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16353b;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16368d;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.c.d.a */
/* compiled from: PG */
public final /* synthetic */ class C15998a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C16353b f47407a;

    public /* synthetic */ C15998a(C16353b bVar) {
        this.f47407a = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C16353b bVar = this.f47407a;
        C16368d dVar = (C16368d) obj;
        C58528ij ijVar = C16001d.f47410a;
        C16333ag agVar = bVar.f48137c;
        if (agVar == null) {
            agVar = C16333ag.f48074n;
        }
        C16330ad adVar = agVar.f48082g;
        if (adVar == null) {
            adVar = C16330ad.f48065f;
        }
        if (!(adVar.f48068b == 3 || (dVar.f48183a & 16) == 0)) {
            C16331ae aeVar = (C16331ae) agVar.toBuilder();
            C16330ad adVar2 = agVar.f48082g;
            if (adVar2 == null) {
                adVar2 = C16330ad.f48065f;
            }
            C16328ab abVar = (C16328ab) adVar2.toBuilder();
            String str = dVar.f48189g;
            abVar.copyOnWrite();
            C16330ad adVar3 = (C16330ad) abVar.instance;
            str.getClass();
            adVar3.f48068b = 2;
            adVar3.f48069c = str;
            C16330ad adVar4 = (C16330ad) abVar.build();
            aeVar.copyOnWrite();
            C16333ag agVar2 = (C16333ag) aeVar.instance;
            adVar4.getClass();
            agVar2.f48082g = adVar4;
            agVar2.f48076a |= 16;
            agVar = (C16333ag) aeVar.build();
        }
        if (dVar.f48188f.size() > 0) {
            C16331ae aeVar2 = (C16331ae) agVar.toBuilder();
            C62971cq cqVar = dVar.f48188f;
            aeVar2.copyOnWrite();
            C16333ag agVar3 = (C16333ag) aeVar2.instance;
            C62971cq cqVar2 = agVar3.f48083h;
            if (!cqVar2.mo58948c()) {
                agVar3.f48083h = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) cqVar, (List) agVar3.f48083h);
            agVar = (C16333ag) aeVar2.build();
        }
        if ((dVar.f48183a & 32) != 0) {
            C16331ae aeVar3 = (C16331ae) agVar.toBuilder();
            C16330ad adVar5 = agVar.f48082g;
            if (adVar5 == null) {
                adVar5 = C16330ad.f48065f;
            }
            C16328ab abVar2 = (C16328ab) adVar5.toBuilder();
            String str2 = dVar.f48190h;
            abVar2.copyOnWrite();
            C16330ad adVar6 = (C16330ad) abVar2.instance;
            str2.getClass();
            adVar6.f48067a |= 128;
            adVar6.f48070d = str2;
            String str3 = dVar.f48185c;
            abVar2.copyOnWrite();
            C16330ad adVar7 = (C16330ad) abVar2.instance;
            str3.getClass();
            adVar7.f48067a |= 512;
            adVar7.f48071e = str3;
            C16330ad adVar8 = (C16330ad) abVar2.build();
            aeVar3.copyOnWrite();
            C16333ag agVar4 = (C16333ag) aeVar3.instance;
            adVar8.getClass();
            agVar4.f48082g = adVar8;
            agVar4.f48076a |= 16;
            agVar = (C16333ag) aeVar3.build();
        }
        String str4 = dVar.f48186d;
        if (str4.isEmpty() || "%1$s".equals(str4) || C16001d.f47410a.contains(bVar.f48135a)) {
            str4 = String.valueOf(dVar.f48184b).concat(String.valueOf(str4));
        }
        C16064a aVar = new C16064a();
        aVar.f47528a = C16170n.m33198i(str4, dVar.f48185c, C16169m.m33196a(bVar.f48136b));
        aVar.mo22676b(dVar.f48186d);
        aVar.f47529b = (dVar.f48183a & 8) != 0 ? dVar.f48187e : null;
        aVar.mo22678d(dVar.f48185c);
        aVar.mo22680f(C16169m.m33196a(bVar.f48136b));
        aVar.mo22679e(agVar);
        return aVar.mo22675a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
