package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9306a;

import com.google.common.base.C58817ah;
import com.google.protos.p4985f.p5030q.C65297k;
import com.google.protos.p4985f.p5030q.C65298l;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.a.a */
/* compiled from: PG */
public final /* synthetic */ class C123186a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C123186a f340876a = new C123186a();

    private /* synthetic */ C123186a() {
    }

    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        int i = C123188c.f340878a;
        if (optional.isEmpty()) {
            return C65298l.f176620c;
        }
        C65297k kVar = (C65297k) C65298l.f176620c.createBuilder();
        String str = (String) optional.get();
        kVar.copyOnWrite();
        C65298l lVar = (C65298l) kVar.instance;
        str.getClass();
        lVar.f176622a |= 1;
        lVar.f176623b = str;
        return (C65298l) kVar.build();
    }
}
