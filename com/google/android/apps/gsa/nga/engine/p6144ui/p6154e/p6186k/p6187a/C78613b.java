package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6186k.p6187a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80753ea;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80754eb;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.k.a.b */
/* compiled from: PG */
public final /* synthetic */ class C78613b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80753ea f216432a;

    public /* synthetic */ C78613b(C80753ea eaVar) {
        this.f216432a = eaVar;
    }

    public final void accept(Object obj) {
        C80753ea eaVar = this.f216432a;
        long longValue = ((Long) obj).longValue();
        eaVar.copyOnWrite();
        C80754eb ebVar = C80754eb.f221656c;
        ((C80754eb) eaVar.instance).f221659b = longValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
