package com.google.android.libraries.silk.p3240c;

import com.google.protobuf.MessageLite;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.silk.c.a */
/* compiled from: PG */
public final /* synthetic */ class C41750a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C41871q f109098a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f109099b;

    public /* synthetic */ C41750a(C41871q qVar, MessageLite messageLite) {
        this.f109098a = qVar;
        this.f109099b = messageLite;
    }

    public final void accept(Object obj) {
        C41871q qVar = this.f109098a;
        MessageLite messageLite = this.f109099b;
        qVar.f109264b.mo26140c((String) obj, messageLite.toByteArray());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
