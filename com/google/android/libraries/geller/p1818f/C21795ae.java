package com.google.android.libraries.geller.p1818f;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65810cn;
import com.google.protos.p5129p.p5131b.C65811co;
import com.google.protos.p5129p.p5131b.C65819cw;
import java.util.List;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70769g;

/* renamed from: com.google.android.libraries.geller.f.ae */
/* compiled from: PG */
public final /* synthetic */ class C21795ae implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C21796af f60115a;

    /* renamed from: b */
    public final /* synthetic */ List f60116b;

    /* renamed from: c */
    public final /* synthetic */ C65811co f60117c;

    /* renamed from: d */
    public final /* synthetic */ C70286co f60118d;

    /* renamed from: e */
    public final /* synthetic */ C70769g f60119e;

    public /* synthetic */ C21795ae(C21796af afVar, List list, C65811co coVar, C70286co coVar2, C70769g gVar) {
        this.f60115a = afVar;
        this.f60116b = list;
        this.f60117c = coVar;
        this.f60118d = coVar2;
        this.f60119e = gVar;
    }

    public final C60870cx apply(Object obj) {
        C21796af afVar = this.f60115a;
        List list = this.f60116b;
        C65811co coVar = this.f60117c;
        C70286co coVar2 = this.f60118d;
        C70769g gVar = this.f60119e;
        C65819cw cwVar = (C65819cw) obj;
        list.add(cwVar);
        if ((cwVar.f178928a & 4) == 0 || cwVar.f178931d.isEmpty()) {
            return C60856cj.m92900i(list);
        }
        C65810cn cnVar = (C65810cn) C65811co.f178905g.createBuilder(coVar);
        if ((cwVar.f178928a & 2) != 0) {
            String str = cwVar.f178930c;
            cnVar.copyOnWrite();
            C65811co coVar3 = (C65811co) cnVar.instance;
            str.getClass();
            coVar3.f178907a |= 4;
            coVar3.f178910d = str;
        } else {
            cnVar.copyOnWrite();
            C65811co coVar4 = (C65811co) cnVar.instance;
            coVar4.f178907a &= -5;
            coVar4.f178910d = C65811co.f178905g.f178910d;
        }
        if ((cwVar.f178928a & 4) != 0) {
            String str2 = cwVar.f178931d;
            cnVar.copyOnWrite();
            C65811co coVar5 = (C65811co) cnVar.instance;
            str2.getClass();
            coVar5.f178907a |= 16;
            coVar5.f178912f = str2;
        } else {
            cnVar.copyOnWrite();
            C65811co coVar6 = (C65811co) cnVar.instance;
            coVar6.f178907a &= -17;
            coVar6.f178912f = C65811co.f178905g.f178912f;
        }
        return afVar.mo27120a(coVar2, gVar, (C65811co) cnVar.build(), list);
    }
}
