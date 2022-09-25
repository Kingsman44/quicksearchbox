package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.libraries.assistant.pcp.p1546d.C18577e;
import com.google.android.libraries.assistant.pcp.p1578m.C18981k;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.pcp.b.m */
/* compiled from: PG */
public final /* synthetic */ class C18542m implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Map f52538a;

    /* renamed from: b */
    public final /* synthetic */ C18577e f52539b;

    public /* synthetic */ C18542m(Map map, C18577e eVar) {
        this.f52538a = map;
        this.f52539b = eVar;
    }

    public final void accept(Object obj) {
        ((Set) Map.EL.computeIfAbsent(this.f52538a, (C18981k) obj, C18541l.f52537a)).add(this.f52539b.mo24063a());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
