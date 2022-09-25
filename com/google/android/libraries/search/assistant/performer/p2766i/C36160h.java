package com.google.android.libraries.search.assistant.performer.p2766i;

import com.google.assistant.p3897e.p3921j.p3924c.C51739j;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.h */
/* compiled from: PG */
public final /* synthetic */ class C36160h implements Function {

    /* renamed from: a */
    public final /* synthetic */ C36167o f94509a;

    public /* synthetic */ C36160h(C36167o oVar) {
        this.f94509a = oVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C36167o oVar = this.f94509a;
        ((C59052c) ((C59052c) C36167o.f94518a.mo56224b()).mo56372aa(52185)).mo56386p("TNG CreateReminderOnDevicePerformer called.");
        return C60922j.m93045h(C60922j.m93044g(C60838bs.m92859i(oVar.f94520c.mo50215b(oVar.f94519b)), C36163k.f94512a, C60826bg.f164896a), new C36164l(oVar, (C51739j) obj), C60826bg.f164896a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
