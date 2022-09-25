package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80421am;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80431k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80432l;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.o */
/* compiled from: PG */
public final /* synthetic */ class C79032o implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80431k f217334a;

    public /* synthetic */ C79032o(C80431k kVar) {
        this.f217334a = kVar;
    }

    public final void accept(Object obj) {
        C80431k kVar = this.f217334a;
        C80421am amVar = (C80421am) obj;
        kVar.copyOnWrite();
        C80432l lVar = (C80432l) kVar.instance;
        C80432l lVar2 = C80432l.f220749e;
        amVar.getClass();
        lVar.f220754d = amVar;
        lVar.f220751a |= 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
