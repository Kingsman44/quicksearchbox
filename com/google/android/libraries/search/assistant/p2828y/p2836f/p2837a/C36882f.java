package com.google.android.libraries.search.assistant.p2828y.p2836f.p2837a;

import com.google.assistant.p3897e.p3921j.C52402qk;
import com.google.assistant.p3897e.p3921j.C52403ql;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.y.f.a.f */
/* compiled from: PG */
public final /* synthetic */ class C36882f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C52402qk f96043a;

    public /* synthetic */ C36882f(C52402qk qkVar) {
        this.f96043a = qkVar;
    }

    public final void accept(Object obj) {
        C52402qk qkVar = this.f96043a;
        int intValue = ((Integer) obj).intValue();
        qkVar.copyOnWrite();
        C52403ql qlVar = (C52403ql) qkVar.instance;
        C52403ql qlVar2 = C52403ql.f137512f;
        qlVar.f137514a |= 2;
        qlVar.f137516c = intValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
