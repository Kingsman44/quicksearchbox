package com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d;

import com.google.android.apps.gsa.staticplugins.opa.appactions.C107308i;
import com.google.assistant.p3861at.C49815ab;
import com.google.assistant.p3861at.C49816ac;
import com.google.assistant.p3861at.C49817ad;
import com.google.assistant.p3861at.C49819ae;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.d.h */
/* compiled from: PG */
public final /* synthetic */ class C107284h implements Function {

    /* renamed from: a */
    public final /* synthetic */ C107308i f298593a;

    public /* synthetic */ C107284h(C107308i iVar) {
        this.f298593a = iVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C107308i iVar = this.f298593a;
        String str = (String) obj;
        C49817ad adVar = (C49817ad) C49819ae.f129086e.createBuilder();
        String str2 = (String) iVar.mo95862l().get();
        adVar.copyOnWrite();
        C49819ae aeVar = (C49819ae) adVar.instance;
        str2.getClass();
        aeVar.f129088a |= 1;
        aeVar.f129089b = str2;
        C58800sl lA = iVar.mo95851c().entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            C49815ab abVar = (C49815ab) C49816ac.f128826d.createBuilder();
            String str3 = (String) entry.getKey();
            abVar.copyOnWrite();
            C49816ac acVar = (C49816ac) abVar.instance;
            str3.getClass();
            acVar.f128828a |= 1;
            acVar.f128829b = str3;
            String str4 = (String) entry.getValue();
            abVar.copyOnWrite();
            C49816ac acVar2 = (C49816ac) abVar.instance;
            str4.getClass();
            acVar2.f128828a |= 2;
            acVar2.f128830c = str4;
            C49816ac acVar3 = (C49816ac) abVar.build();
            adVar.copyOnWrite();
            C49819ae aeVar2 = (C49819ae) adVar.instance;
            acVar3.getClass();
            C62971cq cqVar = aeVar2.f129090c;
            if (!cqVar.mo58948c()) {
                aeVar2.f129090c = C62942bv.mutableCopy(cqVar);
            }
            aeVar2.f129090c.add(acVar3);
        }
        return (C49819ae) adVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
