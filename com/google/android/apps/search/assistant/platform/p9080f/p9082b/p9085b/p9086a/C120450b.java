package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.b */
/* compiled from: PG */
final class C120450b implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C120464l f335007a;

    public C120450b(C120464l lVar) {
        this.f335007a = lVar;
    }

    public final /* synthetic */ void accept(Object obj) {
        Optional optional = (Optional) obj;
        C69664n.m101061g(optional, "interactionRef");
        if (!optional.isPresent()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f335007a.mo104762b();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
