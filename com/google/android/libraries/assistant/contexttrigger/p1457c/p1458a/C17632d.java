package com.google.android.libraries.assistant.contexttrigger.p1457c.p1458a;

import com.google.android.libraries.assistant.contexttrigger.p1457c.C17647k;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17648l;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17651o;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.c.a.d */
/* compiled from: PG */
public final /* synthetic */ class C17632d implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C17632d f50749a = new C17632d();

    private /* synthetic */ C17632d() {
    }

    public final Object apply(Object obj) {
        C58485gu<C17651o> guVar = (C58485gu) Collection.EL.stream((List) obj).filter(C17629a.f50746a).map(C17630b.f50747a).collect(C58370cn.f155946a);
        C17647k kVar = (C17647k) C17648l.f50770c.createBuilder();
        kVar.copyOnWrite();
        C17648l lVar = (C17648l) kVar.instance;
        C62961ch chVar = lVar.f50772a;
        if (!chVar.mo58948c()) {
            lVar.f50772a = C62942bv.mutableCopy(chVar);
        }
        for (C17651o oVar : guVar) {
            lVar.f50772a.mo58916g(oVar.f50777c);
        }
        return (C17648l) kVar.build();
    }
}
