package com.google.android.apps.search.assistant.platform.p9141h.p9162h;

import com.google.android.apps.search.assistant.platform.p9141h.p9162h.p9164b.C121123a;
import com.google.android.apps.search.assistant.platform.p9141h.p9162h.p9164b.C121124b;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.h.h.e */
/* compiled from: PG */
public final /* synthetic */ class C121127e implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C121127e f336572a = new C121127e();

    private /* synthetic */ C121127e() {
    }

    public final Object apply(Object obj) {
        Optional map = Collection.EL.stream((C58485gu) obj).filter(C121129g.f336574a).findFirst().map(C121130h.f336575a);
        C121123a aVar = (C121123a) C121124b.f336563c.createBuilder();
        boolean booleanValue = ((Boolean) map.orElse(true)).booleanValue();
        aVar.copyOnWrite();
        C121124b bVar = (C121124b) aVar.instance;
        bVar.f336565a = 1 | bVar.f336565a;
        bVar.f336566b = booleanValue;
        return (C121124b) aVar.build();
    }
}
