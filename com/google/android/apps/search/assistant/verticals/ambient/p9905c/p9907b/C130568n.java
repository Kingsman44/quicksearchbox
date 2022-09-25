package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9907b;

import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50729n;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.b.n */
/* compiled from: PG */
public final /* synthetic */ class C130568n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50790cn f357627a;

    public /* synthetic */ C130568n(C50790cn cnVar) {
        this.f357627a = cnVar;
    }

    public final void accept(Object obj) {
        C50790cn cnVar = this.f357627a;
        C50729n nVar = (C50729n) obj;
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        C50818do doVar2 = C50818do.f132293H;
        nVar.getClass();
        doVar.f132314k = nVar;
        doVar.f132304a |= 512;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
