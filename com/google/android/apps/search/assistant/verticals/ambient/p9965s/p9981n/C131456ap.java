package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83774q;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83775r;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83776s;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83777t;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83778u;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83781x;
import com.google.assistant.p3994s.p3995a.C53212fn;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4580v.C60945d;
import com.google.protos.p4985f.p5027o.C64971f;
import com.google.protos.p4985f.p5027o.C64973h;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.ap */
/* compiled from: PG */
public final /* synthetic */ class C131456ap implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131465ay f359286a;

    public /* synthetic */ C131456ap(C131465ay ayVar) {
        this.f359286a = ayVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C131465ay ayVar = this.f359286a;
        C53212fn fnVar = (C53212fn) ((Optional) obj).get();
        C64973h hVar = fnVar.f139473d;
        if (hVar == null) {
            hVar = C64973h.f175959b;
        }
        Optional findFirst = Collection.EL.stream(hVar.f175961a).findFirst();
        if (findFirst.isEmpty()) {
            ((C58970a) ((C58970a) ayVar.f359295a.mo56224b()).mo56372aa(39285)).mo56386p("PCP shopping list does not have a logo.");
            return Optional.empty();
        }
        ((C58970a) ((C58970a) ayVar.f359295a.mo56224b()).mo56372aa(39281)).mo56386p("Found a shopping list in the PCP response.");
        String str = fnVar.f139472c;
        String str2 = ((C64971f) findFirst.get()).f175956a;
        C83774q qVar = (C83774q) C83781x.f228356c.createBuilder();
        C83777t tVar = (C83777t) C83778u.f228339k.createBuilder();
        String str3 = fnVar.f139471b;
        tVar.copyOnWrite();
        C83778u uVar = (C83778u) tVar.instance;
        str3.getClass();
        uVar.f228341a |= 1;
        uVar.f228342b = str3;
        tVar.copyOnWrite();
        C83778u uVar2 = (C83778u) tVar.instance;
        uVar2.f228341a |= 4;
        uVar2.f228343c = true;
        tVar.mo77098a(fnVar.f139474e);
        int i = fnVar.f139475f;
        tVar.copyOnWrite();
        C83778u uVar3 = (C83778u) tVar.instance;
        uVar3.f228341a |= 8;
        uVar3.f228345e = i;
        tVar.copyOnWrite();
        C83778u uVar4 = (C83778u) tVar.instance;
        uVar4.f228341a |= 64;
        uVar4.f228348h = "https://".concat(String.valueOf(str));
        long epochMilli = C60945d.m93099d(fnVar.f139470a).toEpochMilli();
        tVar.copyOnWrite();
        C83778u uVar5 = (C83778u) tVar.instance;
        uVar5.f228341a |= 128;
        uVar5.f228349i = epochMilli;
        C83775r rVar = (C83775r) C83776s.f228333e.createBuilder();
        String str4 = ((C64971f) findFirst.get()).f175957b;
        rVar.copyOnWrite();
        C83776s sVar = (C83776s) rVar.instance;
        str4.getClass();
        sVar.f228335a |= 2;
        sVar.f228337c = str4;
        String str5 = ((C64971f) findFirst.get()).f175956a;
        rVar.copyOnWrite();
        C83776s sVar2 = (C83776s) rVar.instance;
        str5.getClass();
        sVar2.f228335a |= 4;
        sVar2.f228338d = str5;
        tVar.copyOnWrite();
        C83778u uVar6 = (C83778u) tVar.instance;
        C83776s sVar3 = (C83776s) rVar.build();
        sVar3.getClass();
        uVar6.f228350j = sVar3;
        uVar6.f228341a |= 256;
        qVar.copyOnWrite();
        C83781x xVar = (C83781x) qVar.instance;
        C83778u uVar7 = (C83778u) tVar.build();
        uVar7.getClass();
        xVar.mo77099a();
        xVar.f228358a.add(uVar7);
        return Optional.m71637of((C83781x) qVar.build());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
