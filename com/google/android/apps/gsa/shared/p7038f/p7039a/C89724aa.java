package com.google.android.apps.gsa.shared.p7038f.p7039a;

import com.google.assistant.p3825an.p3830c.p3831a.C49272ar;
import com.google.assistant.p3825an.p3830c.p3831a.C49273as;
import com.google.assistant.p3825an.p3830c.p3831a.C49334k;
import com.google.assistant.p3825an.p3830c.p3831a.C49335l;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.shared.f.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C89724aa implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49334k f242900a;

    public /* synthetic */ C89724aa(C49334k kVar) {
        this.f242900a = kVar;
    }

    public final void accept(Object obj) {
        C49334k kVar = this.f242900a;
        C58148f fVar = (C58148f) obj;
        C49272ar arVar = (C49272ar) C49273as.f127366d.createBuilder();
        Optional a = C89730ag.m146122a(fVar, "email");
        Objects.requireNonNull(arVar);
        a.ifPresent(new C89726ac(arVar));
        Optional a2 = C89730ag.m146122a(fVar, "name");
        Objects.requireNonNull(arVar);
        a2.ifPresent(new C89727ad(arVar));
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
