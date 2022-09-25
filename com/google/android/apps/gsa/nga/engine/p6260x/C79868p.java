package com.google.android.apps.gsa.nga.engine.p6260x;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80476a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80484i;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.p */
/* compiled from: PG */
public final /* synthetic */ class C79868p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80476a f218933a;

    public /* synthetic */ C79868p(C80476a aVar) {
        this.f218933a = aVar;
    }

    public final void accept(Object obj) {
        C80476a aVar = this.f218933a;
        String str = (String) obj;
        aVar.copyOnWrite();
        C80484i iVar = C80484i.f220937h;
        str.getClass();
        ((C80484i) aVar.instance).f220945g = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
