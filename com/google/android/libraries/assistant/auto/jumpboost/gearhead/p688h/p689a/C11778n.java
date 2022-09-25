package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13051m;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13052n;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13054p;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.n */
/* compiled from: PG */
public final /* synthetic */ class C11778n implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C11786v f37925a;

    public /* synthetic */ C11778n(C11786v vVar) {
        this.f37925a = vVar;
    }

    public final Object call() {
        C11786v vVar = this.f37925a;
        C13051m mVar = (C13051m) C13052n.f40515d.createBuilder();
        C13054p pVar = vVar.f37938c;
        mVar.copyOnWrite();
        C13052n nVar = (C13052n) mVar.instance;
        nVar.f40518b = pVar.f40526d;
        nVar.f40517a |= 1;
        C12986d dVar = vVar.f37939d;
        if (dVar != null) {
            mVar.copyOnWrite();
            C13052n nVar2 = (C13052n) mVar.instance;
            nVar2.f40519c = dVar;
            nVar2.f40517a |= 2;
        }
        return (C13052n) mVar.build();
    }
}
