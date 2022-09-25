package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8564h;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79937al;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79938am;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.h.a */
/* compiled from: PG */
public final /* synthetic */ class C112599a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C113415ez f312196a;

    /* renamed from: b */
    public final /* synthetic */ Integer f312197b;

    public /* synthetic */ C112599a(C113415ez ezVar, Integer num) {
        this.f312196a = ezVar;
        this.f312197b = num;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C113415ez ezVar = this.f312196a;
        Integer num = this.f312197b;
        C79938am amVar = (C79938am) obj;
        if (!amVar.f219202u.equals(ezVar.mo100058Q())) {
            return amVar;
        }
        C79937al alVar = (C79937al) amVar.toBuilder();
        int intValue = num.intValue();
        alVar.copyOnWrite();
        C79938am amVar2 = (C79938am) alVar.instance;
        amVar2.f219182a |= C89885b.NOW_VALUE;
        amVar2.f219204w = intValue;
        return (C79938am) alVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
