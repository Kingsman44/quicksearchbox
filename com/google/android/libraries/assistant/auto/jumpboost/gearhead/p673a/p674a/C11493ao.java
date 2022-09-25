package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11690au;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11691av;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ao */
/* compiled from: PG */
final class C11493ao implements C58817ah {

    /* renamed from: a */
    public static final C11493ao f37346a = new C11493ao();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        List list = (List) obj;
        C11690au auVar = (C11690au) C11691av.f37700b.createBuilder();
        auVar.copyOnWrite();
        C11691av avVar = (C11691av) auVar.instance;
        C62971cq cqVar = avVar.f37702a;
        if (!cqVar.mo58948c()) {
            avVar.f37702a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) avVar.f37702a);
        return (C11691av) auVar.build();
    }
}
