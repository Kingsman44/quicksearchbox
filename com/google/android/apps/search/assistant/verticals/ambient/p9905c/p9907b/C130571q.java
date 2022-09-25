package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9907b;

import android.content.Intent;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.b.q */
/* compiled from: PG */
public final /* synthetic */ class C130571q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50790cn f357630a;

    public /* synthetic */ C130571q(C50790cn cnVar) {
        this.f357630a = cnVar;
    }

    public final void accept(Object obj) {
        C50790cn cnVar = this.f357630a;
        C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
        C50731p pVar = C50731p.START_ACTIVITY;
        qVar.copyOnWrite();
        C50733r rVar = (C50733r) qVar.instance;
        rVar.f132024b = pVar.f132020d;
        rVar.f132023a |= 1;
        String uri = ((Intent) obj).toUri(1);
        qVar.copyOnWrite();
        C50733r rVar2 = (C50733r) qVar.instance;
        uri.getClass();
        rVar2.f132023a |= 2;
        rVar2.f132025c = uri;
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        C50733r rVar3 = (C50733r) qVar.build();
        C50818do doVar2 = C50818do.f132293H;
        rVar3.getClass();
        doVar.f132316m = rVar3;
        doVar.f132304a |= 2048;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
