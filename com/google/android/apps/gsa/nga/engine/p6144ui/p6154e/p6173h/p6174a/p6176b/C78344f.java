package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6176b;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80724cz;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80726da;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80727db;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.b.f */
/* compiled from: PG */
public final /* synthetic */ class C78344f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80726da f215692a;

    public /* synthetic */ C78344f(C80726da daVar) {
        this.f215692a = daVar;
    }

    public final void accept(Object obj) {
        C80726da daVar = this.f215692a;
        C80724cz czVar = (C80724cz) obj;
        daVar.copyOnWrite();
        C80727db dbVar = (C80727db) daVar.instance;
        C80727db dbVar2 = C80727db.f221610d;
        czVar.getClass();
        dbVar.f221614c = czVar;
        dbVar.f221612a |= 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
