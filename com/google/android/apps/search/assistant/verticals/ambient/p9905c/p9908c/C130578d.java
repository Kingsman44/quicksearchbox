package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9908c;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b;
import com.google.protobuf.MessageLite;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.c.d */
/* compiled from: PG */
public final /* synthetic */ class C130578d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C130582h f357649a;

    /* renamed from: b */
    public final /* synthetic */ String f357650b;

    /* renamed from: c */
    public final /* synthetic */ MessageLite f357651c;

    public /* synthetic */ C130578d(C130582h hVar, String str, MessageLite messageLite) {
        this.f357649a = hVar;
        this.f357650b = str;
        this.f357651c = messageLite;
    }

    public final void accept(Object obj) {
        C130582h hVar = this.f357649a;
        String str = this.f357650b;
        C131177b bVar = (C131177b) obj;
        hVar.mo109734d(bVar, str, this.f357651c.getSerializedSize());
        hVar.mo109733c(bVar, str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
