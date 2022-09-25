package com.google.android.libraries.geller.p1818f;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p5129p.p5131b.C65743aa;
import com.google.protos.p5129p.p5131b.C65818cv;
import com.google.protos.p5129p.p5131b.C65819cw;
import com.google.protos.p5129p.p5131b.C65857z;
import java.util.List;

/* renamed from: com.google.android.libraries.geller.f.bh */
/* compiled from: PG */
public final /* synthetic */ class C21825bh implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C65743aa f60215a;

    /* renamed from: b */
    public final /* synthetic */ C65819cw f60216b;

    public /* synthetic */ C21825bh(C65743aa aaVar, C65819cw cwVar) {
        this.f60215a = aaVar;
        this.f60216b = cwVar;
    }

    public final Object apply(Object obj) {
        C65743aa aaVar = this.f60215a;
        C65819cw cwVar = this.f60216b;
        C58485gu guVar = (C58485gu) obj;
        C65857z zVar = (C65857z) aaVar.toBuilder();
        C65818cv cvVar = (C65818cv) cwVar.toBuilder();
        cvVar.copyOnWrite();
        ((C65819cw) cvVar.instance).f178932e = C65819cw.emptyProtobufList();
        cvVar.copyOnWrite();
        C65819cw cwVar2 = (C65819cw) cvVar.instance;
        C62971cq cqVar = cwVar2.f178932e;
        if (!cqVar.mo58948c()) {
            cwVar2.f178932e = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) cwVar2.f178932e);
        C65819cw cwVar3 = (C65819cw) cvVar.build();
        zVar.copyOnWrite();
        C65743aa aaVar2 = (C65743aa) zVar.instance;
        cwVar3.getClass();
        aaVar2.f178600b = cwVar3;
        aaVar2.f178599a = 2;
        return (C65743aa) zVar.build();
    }
}
