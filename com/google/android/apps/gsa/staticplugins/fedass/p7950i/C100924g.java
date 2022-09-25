package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.search.fedora.p10099e.C132797e;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.speech.p5228m.C67317bu;
import com.google.speech.p5228m.C67318bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.g */
/* compiled from: PG */
public final /* synthetic */ class C100924g implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C100924g f281966a = new C100924g();

    private /* synthetic */ C100924g() {
    }

    public final Object apply(Object obj) {
        C132797e eVar = ((C132798f) obj).f362325i;
        if (eVar == null) {
            eVar = C132797e.f362307g;
        }
        C67317bu buVar = (C67317bu) C67318bv.f182974d.createBuilder();
        String str = eVar.f362310b;
        buVar.copyOnWrite();
        C67318bv bvVar = (C67318bv) buVar.instance;
        str.getClass();
        bvVar.f182976a |= 1;
        bvVar.f182977b = str;
        String str2 = eVar.f362312d;
        buVar.copyOnWrite();
        C67318bv bvVar2 = (C67318bv) buVar.instance;
        str2.getClass();
        C62971cq cqVar = bvVar2.f182978c;
        if (!cqVar.mo58948c()) {
            bvVar2.f182978c = C62942bv.mutableCopy(cqVar);
        }
        bvVar2.f182978c.add(str2);
        return (C67318bv) buVar.build();
    }
}
