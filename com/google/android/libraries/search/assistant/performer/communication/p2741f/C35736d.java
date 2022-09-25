package com.google.android.libraries.search.assistant.performer.communication.p2741f;

import com.google.assistant.p3897e.p3921j.C52628yu;
import com.google.assistant.p3897e.p3921j.C52629yv;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.f.d */
/* compiled from: PG */
public final /* synthetic */ class C35736d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C52628yu f93663a;

    public /* synthetic */ C35736d(C52628yu yuVar) {
        this.f93663a = yuVar;
    }

    public final void accept(Object obj) {
        C52628yu yuVar = this.f93663a;
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
