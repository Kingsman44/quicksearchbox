package com.google.android.apps.gsa.staticplugins.p8834z.p8838d;

import com.google.android.apps.gsa.staticplugins.p8834z.p8835a.C118291a;
import com.google.android.apps.gsa.staticplugins.p8834z.p8835a.C118292b;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.z.d.a */
/* compiled from: PG */
public final /* synthetic */ class C118296a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f328370a;

    public /* synthetic */ C118296a(C58485gu guVar) {
        this.f328370a = guVar;
    }

    public final Object apply(Object obj) {
        C58485gu guVar = this.f328370a;
        C118291a aVar = (C118291a) ((C118292b) obj).toBuilder();
        aVar.copyOnWrite();
        ((C118292b) aVar.instance).f328368a = C118292b.emptyIntList();
        aVar.copyOnWrite();
        C118292b bVar = (C118292b) aVar.instance;
        C62961ch chVar = bVar.f328368a;
        if (!chVar.mo58948c()) {
            bVar.f328368a = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll((Iterable) guVar, (List) bVar.f328368a);
        return (C118292b) aVar.build();
    }
}
