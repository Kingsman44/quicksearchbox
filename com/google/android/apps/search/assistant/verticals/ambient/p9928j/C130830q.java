package com.google.android.apps.search.assistant.verticals.ambient.p9928j;

import com.google.assistant.p3897e.p3917i.p3918a.C51446i;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3921j.C52397qf;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.j.q */
/* compiled from: PG */
public final /* synthetic */ class C130830q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51446i f358075a;

    public /* synthetic */ C130830q(C51446i iVar) {
        this.f358075a = iVar;
    }

    public final void accept(Object obj) {
        C51446i iVar = this.f358075a;
        C52397qf qfVar = (C52397qf) obj;
        iVar.copyOnWrite();
        C51473j jVar = (C51473j) iVar.instance;
        C51473j jVar2 = C51473j.f134090i;
        qfVar.getClass();
        jVar.f134094c = qfVar;
        jVar.f134093b = 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
