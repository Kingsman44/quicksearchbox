package com.google.android.libraries.search.assistant.performer.p2766i;

import com.google.assistant.p3897e.p3899b.p3901b.C50875b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.ad */
/* compiled from: PG */
public final /* synthetic */ class C36125ad implements Function {

    /* renamed from: a */
    public final /* synthetic */ C36126ae f94463a;

    public /* synthetic */ C36125ad(C36126ae aeVar) {
        this.f94463a = aeVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C36126ae aeVar = this.f94463a;
        C50875b bVar = (C50875b) obj;
        boolean z = true;
        if (1 != (bVar.f132465a & 1)) {
            z = false;
        }
        C36128ag.m64537e(z, "MutateAlarmArgs has no AlarmId");
        return aeVar.f94464a.mo40003a(C36126ae.m64530b(bVar.f132468d, bVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
