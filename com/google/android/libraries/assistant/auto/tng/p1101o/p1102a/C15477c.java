package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.c */
/* compiled from: PG */
public final /* synthetic */ class C15477c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C15478d f46424a;

    /* renamed from: b */
    public final /* synthetic */ Long f46425b;

    public /* synthetic */ C15477c(C15478d dVar, Long l) {
        this.f46424a = dVar;
        this.f46425b = l;
    }

    public final Object call() {
        C15478d dVar = this.f46424a;
        Long l = this.f46425b;
        dVar.f46427b.containsKey(l);
        dVar.f46427b.put(l, l);
        return (Long) dVar.f46427b.get(l);
    }
}
