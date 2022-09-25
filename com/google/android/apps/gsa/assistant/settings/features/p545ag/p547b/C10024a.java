package com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.b.a */
/* compiled from: PG */
public final class C10024a extends C62934bn implements C63001dt {
    public C10024a() {
        super(C10026c.f34231b);
    }

    /* renamed from: a */
    public final void mo18194a(Map map) {
        copyOnWrite();
        C10026c cVar = C10026c.f34231b;
        ((C10026c) this.instance).mo18196a().putAll(map);
    }

    /* renamed from: b */
    public final void mo18195b(int i) {
        copyOnWrite();
        C10026c cVar = C10026c.f34231b;
        ((C10026c) this.instance).mo18196a().put(Integer.valueOf(i), true);
    }
}
