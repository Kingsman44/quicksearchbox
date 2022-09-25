package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9274c;

import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122188i;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122189j;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.b.c.d */
/* compiled from: PG */
public final /* synthetic */ class C122203d implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C122203d f338906a = new C122203d();

    private /* synthetic */ C122203d() {
    }

    public final Object apply(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        C122188i iVar = (C122188i) C122189j.f338885b.createBuilder();
        iVar.copyOnWrite();
        C122189j jVar = (C122189j) iVar.instance;
        C62971cq cqVar = jVar.f338887a;
        if (!cqVar.mo58948c()) {
            jVar.f338887a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) jVar.f338887a);
        return (C122189j) iVar.build();
    }
}
