package com.google.android.apps.search.googleapp.stampviewer.p10487a;

import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139393c;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139395e;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.a.g */
/* compiled from: PG */
public final class C139312g implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ Map f378898a;

    public C139312g(Map map) {
        this.f378898a = map;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C139393c cVar = (C139393c) ((C139395e) obj).toBuilder();
        Map map = this.f378898a;
        cVar.copyOnWrite();
        C139395e eVar = (C139395e) cVar.instance;
        C62995dn dnVar = eVar.f379044a;
        if (!dnVar.f170058b) {
            eVar.f379044a = dnVar.mo58980a();
        }
        eVar.f379044a.putAll(map);
        return (C139395e) cVar.build();
    }
}
