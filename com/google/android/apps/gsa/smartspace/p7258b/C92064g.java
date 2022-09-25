package com.google.android.apps.gsa.smartspace.p7258b;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b;
import com.google.protobuf.MessageLite;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.smartspace.b.g */
/* compiled from: PG */
public final /* synthetic */ class C92064g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C92070m f256667a;

    /* renamed from: b */
    public final /* synthetic */ String f256668b;

    /* renamed from: c */
    public final /* synthetic */ MessageLite f256669c;

    public /* synthetic */ C92064g(C92070m mVar, String str, MessageLite messageLite) {
        this.f256667a = mVar;
        this.f256668b = str;
        this.f256669c = messageLite;
    }

    public final void accept(Object obj) {
        C92070m mVar = this.f256667a;
        String str = this.f256668b;
        C131177b bVar = (C131177b) obj;
        mVar.mo86736i(bVar, str, this.f256669c.getSerializedSize());
        mVar.mo86735h(bVar, str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
