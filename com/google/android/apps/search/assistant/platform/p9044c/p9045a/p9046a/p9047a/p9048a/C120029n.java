package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33500a;
import java.util.List;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.a.n */
/* compiled from: PG */
final class C120029n implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C33500a f334183a;

    public C120029n(C33500a aVar) {
        this.f334183a = aVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        List list = (List) obj;
        C69664n.m101061g(list, "data");
        this.f334183a.mo38911a(list);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
