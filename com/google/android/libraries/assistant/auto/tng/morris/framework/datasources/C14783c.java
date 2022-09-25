package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14220bd;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14299eb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14531mr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14532ms;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.c */
/* compiled from: PG */
public final class C14783c {
    /* renamed from: a */
    public static C14221be m31117a(C14299eb ebVar) {
        C14220bd bdVar = (C14220bd) C14221be.f43041c.createBuilder();
        bdVar.copyOnWrite();
        C14221be beVar = (C14221be) bdVar.instance;
        ebVar.getClass();
        beVar.f43044b = ebVar;
        beVar.f43043a = 9;
        return (C14221be) bdVar.build();
    }

    /* renamed from: b */
    public static C14221be m31118b(C14342fr frVar) {
        C14220bd bdVar = (C14220bd) C14221be.f43041c.createBuilder();
        bdVar.copyOnWrite();
        C14221be beVar = (C14221be) bdVar.instance;
        frVar.getClass();
        beVar.f43044b = frVar;
        beVar.f43043a = 2;
        return (C14221be) bdVar.build();
    }

    /* renamed from: c */
    public static C14221be m31119c(Iterable iterable) {
        C14220bd bdVar = (C14220bd) C14221be.f43041c.createBuilder();
        C14531mr mrVar = (C14531mr) C14532ms.f43919b.createBuilder();
        mrVar.copyOnWrite();
        C14532ms msVar = (C14532ms) mrVar.instance;
        C62971cq cqVar = msVar.f43921a;
        if (!cqVar.mo58948c()) {
            msVar.f43921a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) msVar.f43921a);
        bdVar.copyOnWrite();
        C14221be beVar = (C14221be) bdVar.instance;
        C14532ms msVar2 = (C14532ms) mrVar.build();
        msVar2.getClass();
        beVar.f43044b = msVar2;
        beVar.f43043a = 11;
        return (C14221be) bdVar.build();
    }
}
