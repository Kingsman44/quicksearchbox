package com.google.android.libraries.search.assistant.p2716p.p2723c.p2726b.p2727a;

import com.google.android.libraries.assistant.gallium.framework.p1509c.p1510a.C18230a;
import com.google.protos.p4985f.p5030q.C65123co;
import java.util.Map;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.libraries.search.assistant.p.c.b.a.if */
/* compiled from: PG */
public final /* synthetic */ class C35196if implements C18230a {

    /* renamed from: a */
    public final /* synthetic */ Map f92890a;

    public /* synthetic */ C35196if(Map map) {
        this.f92890a = map;
    }

    /* renamed from: a */
    public final C65123co mo23733a(int i) {
        Map map = this.f92890a;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (C65123co) ((Supplier) map.get(valueOf)).get();
        }
        throw new IllegalArgumentException(String.format("Gallium flag ID %d could not be found in the code-generated flag bindings", new Object[]{valueOf}));
    }
}
