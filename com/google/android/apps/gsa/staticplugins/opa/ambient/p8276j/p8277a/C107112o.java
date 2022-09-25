package com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.p8277a;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.j.a.o */
/* compiled from: PG */
public final /* synthetic */ class C107112o implements Function {

    /* renamed from: a */
    public final /* synthetic */ C107115r f298184a;

    public /* synthetic */ C107112o(C107115r rVar) {
        this.f298184a = rVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C107115r rVar = this.f298184a;
        C50794cr crVar = (C50794cr) obj;
        ((C58970a) ((C58970a) rVar.f298188b.mo56224b()).mo56372aa(23494)).mo56389s("Removing cards of type: %s ", crVar.name());
        C60870cx j = rVar.f298190d.mo77128j(crVar);
        C80905at.m128763g(j, new C107101d(rVar, crVar));
        return j;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
