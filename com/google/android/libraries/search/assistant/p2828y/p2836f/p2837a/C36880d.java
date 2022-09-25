package com.google.android.libraries.search.assistant.p2828y.p2836f.p2837a;

import com.google.assistant.p3897e.p3917i.p3918a.C51446i;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.y.f.a.d */
/* compiled from: PG */
public final /* synthetic */ class C36880d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51446i f96041a;

    public /* synthetic */ C36880d(C51446i iVar) {
        this.f96041a = iVar;
    }

    public final void accept(Object obj) {
        C51446i iVar = this.f96041a;
        String str = (String) obj;
        iVar.copyOnWrite();
        C51473j jVar = (C51473j) iVar.instance;
        C51473j jVar2 = C51473j.f134090i;
        str.getClass();
        jVar.f134092a |= 64;
        jVar.f134099h = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
