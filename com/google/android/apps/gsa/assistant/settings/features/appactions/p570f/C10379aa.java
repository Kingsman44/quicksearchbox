package com.google.android.apps.gsa.assistant.settings.features.appactions.p570f;

import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10339az;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10342bb;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10272q;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.f.aa */
/* compiled from: PG */
public final /* synthetic */ class C10379aa implements Function {

    /* renamed from: a */
    public final /* synthetic */ C10339az f35082a;

    public /* synthetic */ C10379aa(C10339az azVar) {
        this.f35082a = azVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C10339az azVar = this.f35082a;
        C10342bb bbVar = (C10342bb) obj;
        int i = C10383ae.f35085a;
        C10272q qVar = (C10272q) C10273r.f34817e.createBuilder();
        C49826ak b = bbVar.mo18443b();
        qVar.copyOnWrite();
        C10273r rVar = (C10273r) qVar.instance;
        b.getClass();
        rVar.f34821c = b;
        rVar.f34819a |= 2;
        C49838aw b2 = azVar.mo18432b();
        qVar.copyOnWrite();
        C10273r rVar2 = (C10273r) qVar.instance;
        b2.getClass();
        rVar2.f34820b = b2;
        rVar2.f34819a |= 1;
        long a = bbVar.mo18442a();
        qVar.copyOnWrite();
        C10273r rVar3 = (C10273r) qVar.instance;
        rVar3.f34819a |= 4;
        rVar3.f34822d = a;
        return (C10273r) qVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
