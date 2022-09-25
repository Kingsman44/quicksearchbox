package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.assistant.p3897e.p3917i.p3918a.C51588ng;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.as */
/* compiled from: PG */
public final /* synthetic */ class C77166as implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51588ng f212953a;

    public /* synthetic */ C77166as(C51588ng ngVar) {
        this.f212953a = ngVar;
    }

    public final void accept(Object obj) {
        C51588ng ngVar = this.f212953a;
        String str = (String) obj;
        ngVar.copyOnWrite();
        C51592nk nkVar = (C51592nk) ngVar.instance;
        C51592nk nkVar2 = C51592nk.f134462k;
        str.getClass();
        nkVar.f134464a |= 32;
        nkVar.f134470g = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
