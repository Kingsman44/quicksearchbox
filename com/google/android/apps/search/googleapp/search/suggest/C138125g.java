package com.google.android.apps.search.googleapp.search.suggest;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.g */
/* compiled from: PG */
public final class C138125g extends C62934bn implements C63001dt {
    public C138125g() {
        super(C138127i.f375805b);
    }

    /* renamed from: a */
    public final void mo114159a(Map map) {
        copyOnWrite();
        C138127i iVar = C138127i.f375805b;
        ((C138127i) this.instance).mo114161a().putAll(map);
    }

    /* renamed from: b */
    public final void mo114160b(String str) {
        str.getClass();
        copyOnWrite();
        C138127i iVar = C138127i.f375805b;
        ((C138127i) this.instance).mo114161a().put("gs_lp", str);
    }
}
