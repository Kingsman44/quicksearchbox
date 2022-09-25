package com.google.android.apps.search.assistant.verticals.ambient.p9928j;

import com.google.assistant.p3897e.p3921j.C52402qk;
import com.google.assistant.p3897e.p3921j.C52403ql;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.j.l */
/* compiled from: PG */
public final /* synthetic */ class C130825l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C52402qk f358070a;

    public /* synthetic */ C130825l(C52402qk qkVar) {
        this.f358070a = qkVar;
    }

    public final void accept(Object obj) {
        C52402qk qkVar = this.f358070a;
        int intValue = ((Integer) obj).intValue();
        qkVar.copyOnWrite();
        C52403ql qlVar = (C52403ql) qkVar.instance;
        C52403ql qlVar2 = C52403ql.f137512f;
        qlVar.f137514a |= 1;
        qlVar.f137515b = intValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
