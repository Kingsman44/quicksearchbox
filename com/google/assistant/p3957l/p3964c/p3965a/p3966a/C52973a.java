package com.google.assistant.p3957l.p3964c.p3965a.p3966a;

import com.google.assistant.p3821al.p3822a.C49221d;
import com.google.assistant.p3821al.p3822a.C49230m;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.assistant.l.c.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C52973a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49221d f138880a;

    public /* synthetic */ C52973a(C49221d dVar) {
        this.f138880a = dVar;
    }

    public final void accept(Object obj) {
        C49221d dVar = this.f138880a;
        String str = (String) obj;
        dVar.copyOnWrite();
        C49230m mVar = (C49230m) dVar.instance;
        C49230m mVar2 = C49230m.f127277e;
        str.getClass();
        mVar.f127279a |= 8;
        mVar.f127282d = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
