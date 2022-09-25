package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9274c;

import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122186g;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122187h;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.b.c.f */
/* compiled from: PG */
public final /* synthetic */ class C122205f implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C122205f f338908a = new C122205f();

    private /* synthetic */ C122205f() {
    }

    public final Object apply(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        C122186g gVar = (C122186g) C122187h.f338882b.createBuilder();
        gVar.copyOnWrite();
        C122187h hVar = (C122187h) gVar.instance;
        C62971cq cqVar = hVar.f338884a;
        if (!cqVar.mo58948c()) {
            hVar.f338884a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) hVar.f338884a);
        return (C122187h) gVar.build();
    }
}
