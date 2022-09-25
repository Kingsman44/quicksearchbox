package com.google.android.apps.search.webglide.p10698a;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.search.webglide.a.e */
/* compiled from: PG */
public final /* synthetic */ class C142166e implements C58817ah {
    public final Object apply(Object obj) {
        int i = C142169h.f385671d;
        C142162a aVar = (C142162a) ((C142164c) obj).toBuilder();
        aVar.copyOnWrite();
        C142164c cVar = (C142164c) aVar.instance;
        C62995dn dnVar = cVar.f385667a;
        if (!dnVar.f170058b) {
            cVar.f385667a = dnVar.mo58980a();
        }
        cVar.f385667a.put("bottomNavNextButton", true);
        return (C142164c) aVar.build();
    }
}
