package com.google.android.libraries.search.assistant.fluidactions.p2554e;

import com.google.assistant.p3897e.p3921j.C52628yu;
import com.google.assistant.p3897e.p3921j.C52629yv;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.e.i */
/* compiled from: PG */
public final /* synthetic */ class C33153i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C52628yu f88696a;

    public /* synthetic */ C33153i(C52628yu yuVar) {
        this.f88696a = yuVar;
    }

    public final void accept(Object obj) {
        C52628yu yuVar = this.f88696a;
        String str = (String) obj;
        yuVar.copyOnWrite();
        C52629yv yvVar = (C52629yv) yuVar.instance;
        C52629yv yvVar2 = C52629yv.f138180g;
        str.getClass();
        yvVar.f138182a |= 8;
        yvVar.f138186e = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
