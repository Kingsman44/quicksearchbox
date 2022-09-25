package com.google.android.libraries.gsa.actionusermodel;

import com.google.p4184bj.p4193c.p4200e.C55993a;
import com.google.p4184bj.p4193c.p4200e.C55994b;
import com.google.p4184bj.p4193c.p4200e.C55998f;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.ap */
/* compiled from: PG */
public final /* synthetic */ class C22058ap implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C55993a f60785a;

    public /* synthetic */ C22058ap(C55993a aVar) {
        this.f60785a = aVar;
    }

    public final void accept(Object obj) {
        C55993a aVar = this.f60785a;
        aVar.copyOnWrite();
        C55994b bVar = (C55994b) aVar.instance;
        C55994b bVar2 = C55994b.f149106h;
        bVar.f149111d = ((C55998f) obj).f149132g;
        bVar.f149108a |= 8;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
