package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.libraries.assistant.pcp.p1546d.C18577e;
import java.util.Map;
import java.util.Set;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.pcp.b.s */
/* compiled from: PG */
public final /* synthetic */ class C18548s implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Set f52553a;

    /* renamed from: b */
    public final /* synthetic */ Map f52554b;

    public /* synthetic */ C18548s(Set set, Map map) {
        this.f52553a = set;
        this.f52554b = map;
    }

    public final void accept(Object obj) {
        Set set = this.f52553a;
        Map map = this.f52554b;
        C18577e eVar = (C18577e) obj;
        set.add(eVar.mo24063a());
        eVar.mo24066d().ifPresent(new C18542m(map, eVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
