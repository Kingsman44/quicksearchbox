package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a;

import android.os.Bundle;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33500a;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.a.m */
/* compiled from: PG */
final class C120028m implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C33500a f334182a;

    public C120028m(C33500a aVar) {
        this.f334182a = aVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Bundle bundle = (Bundle) obj;
        C69664n.m101061g(bundle, "data");
        this.f334182a.mo38911a(bundle);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
