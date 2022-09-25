package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import com.google.assistant.p3861at.C50265qr;
import com.google.assistant.p3861at.C50266qs;
import com.google.assistant.p3861at.C50286rl;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.ce */
/* compiled from: PG */
public final /* synthetic */ class C9949ce implements Function {

    /* renamed from: a */
    public final /* synthetic */ C9958cn f34087a;

    public /* synthetic */ C9949ce(C9958cn cnVar) {
        this.f34087a = cnVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C9958cn cnVar = this.f34087a;
        C50265qr qrVar = (C50265qr) C50266qs.f130716c.createBuilder();
        qrVar.copyOnWrite();
        C50266qs qsVar = (C50266qs) qrVar.instance;
        qsVar.f130719b = Integer.valueOf(((C50286rl) obj).f130864aL);
        qsVar.f130718a = 1;
        return cnVar.mo18154b((C50266qs) qrVar.build());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
