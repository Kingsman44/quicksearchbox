package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.assistant.p3897e.p3917i.p3918a.C51446i;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import p3186j$.time.ZonedDateTime;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.dh */
/* compiled from: PG */
public final /* synthetic */ class C77236dh implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51446i f213076a;

    public /* synthetic */ C77236dh(C51446i iVar) {
        this.f213076a = iVar;
    }

    public final void accept(Object obj) {
        C51446i iVar = this.f213076a;
        long epochMilli = ((ZonedDateTime) obj).toInstant().toEpochMilli();
        iVar.copyOnWrite();
        C51473j jVar = (C51473j) iVar.instance;
        C51473j jVar2 = C51473j.f134090i;
        jVar.f134092a |= 32;
        jVar.f134098g = epochMilli;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
