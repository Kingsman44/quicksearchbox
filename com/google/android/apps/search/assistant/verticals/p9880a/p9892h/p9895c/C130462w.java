package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9895c;

import com.google.assistant.p3825an.p3830c.p3831a.C49272ar;
import com.google.assistant.p3825an.p3830c.p3831a.C49273as;
import com.google.assistant.p3825an.p3830c.p3831a.C49334k;
import com.google.assistant.p3825an.p3830c.p3831a.C49335l;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.c.w */
/* compiled from: PG */
public final /* synthetic */ class C130462w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49334k f357426a;

    public /* synthetic */ C130462w(C49334k kVar) {
        this.f357426a = kVar;
    }

    public final void accept(Object obj) {
        C49334k kVar = this.f357426a;
        C58148f fVar = (C58148f) obj;
        C49272ar arVar = (C49272ar) C49273as.f127366d.createBuilder();
        Optional a = C130440ai.m212874a(fVar, "email");
        Objects.requireNonNull(arVar);
        a.ifPresent(new C130464y(arVar));
        Optional a2 = C130440ai.m212874a(fVar, "name");
        Objects.requireNonNull(arVar);
        a2.ifPresent(new C130465z(arVar));
        kVar.copyOnWrite();
        C49335l lVar = (C49335l) kVar.instance;
        C49273as asVar = (C49273as) arVar.build();
        C49335l lVar2 = C49335l.f127511o;
        asVar.getClass();
        lVar.f127524l = asVar;
        lVar.f127513a |= 1024;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
