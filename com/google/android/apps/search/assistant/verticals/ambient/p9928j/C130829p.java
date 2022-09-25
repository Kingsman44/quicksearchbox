package com.google.android.apps.search.assistant.verticals.ambient.p9928j;

import com.google.assistant.p3897e.p3917i.p3918a.C51446i;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.j.p */
/* compiled from: PG */
public final /* synthetic */ class C130829p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51446i f358074a;

    public /* synthetic */ C130829p(C51446i iVar) {
        this.f358074a = iVar;
    }

    public final void accept(Object obj) {
        C51446i iVar = this.f358074a;
        long longValue = ((Long) obj).longValue();
        iVar.copyOnWrite();
        C51473j jVar = (C51473j) iVar.instance;
        C51473j jVar2 = C51473j.f134090i;
        jVar.f134092a |= 32;
        jVar.f134098g = longValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
