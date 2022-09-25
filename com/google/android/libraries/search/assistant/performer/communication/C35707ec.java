package com.google.android.libraries.search.assistant.performer.communication;

import com.google.assistant.p3897e.p3921j.C52632yy;
import com.google.assistant.p3897e.p3921j.C52633yz;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ec */
/* compiled from: PG */
public final /* synthetic */ class C35707ec implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C52632yy f93610a;

    public /* synthetic */ C35707ec(C52632yy yyVar) {
        this.f93610a = yyVar;
    }

    public final void accept(Object obj) {
        C52632yy yyVar = this.f93610a;
        String str = (String) obj;
        yyVar.copyOnWrite();
        C52633yz yzVar = (C52633yz) yyVar.instance;
        C52633yz yzVar2 = C52633yz.f138192f;
        str.getClass();
        yzVar.f138194a |= 2;
        yzVar.f138196c = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
