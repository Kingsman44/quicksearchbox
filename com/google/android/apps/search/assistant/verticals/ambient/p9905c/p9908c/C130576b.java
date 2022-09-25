package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9908c;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b;
import com.google.protobuf.MessageLite;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.c.b */
/* compiled from: PG */
public final /* synthetic */ class C130576b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C130582h f357641a;

    /* renamed from: b */
    public final /* synthetic */ String f357642b;

    /* renamed from: c */
    public final /* synthetic */ MessageLite f357643c;

    public /* synthetic */ C130576b(C130582h hVar, String str, MessageLite messageLite) {
        this.f357641a = hVar;
        this.f357642b = str;
        this.f357643c = messageLite;
    }

    public final void accept(Object obj) {
        C130582h hVar = this.f357641a;
        String str = this.f357642b;
        C131177b bVar = (C131177b) obj;
        hVar.mo109734d(bVar, str, this.f357643c.getSerializedSize());
        hVar.mo109733c(bVar, str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
