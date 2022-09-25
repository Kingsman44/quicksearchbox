package com.google.android.apps.gsa.smartspace.p7258b;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b;
import com.google.protobuf.MessageLite;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.smartspace.b.e */
/* compiled from: PG */
public final /* synthetic */ class C92062e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C92070m f256659a;

    /* renamed from: b */
    public final /* synthetic */ String f256660b;

    /* renamed from: c */
    public final /* synthetic */ MessageLite f256661c;

    public /* synthetic */ C92062e(C92070m mVar, String str, MessageLite messageLite) {
        this.f256659a = mVar;
        this.f256660b = str;
        this.f256661c = messageLite;
    }

    public final void accept(Object obj) {
        C92070m mVar = this.f256659a;
        String str = this.f256660b;
        C131177b bVar = (C131177b) obj;
        mVar.mo86736i(bVar, str, this.f256661c.getSerializedSize());
        mVar.mo86735h(bVar, str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
