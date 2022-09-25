package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.p9084a;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120514k;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.a.a.c */
/* compiled from: PG */
final class C120395c implements Consumer {

    /* renamed from: a */
    final /* synthetic */ Consumer f334895a;

    public C120395c(Consumer consumer) {
        this.f334895a = consumer;
    }

    public final /* synthetic */ void accept(Object obj) {
        C37819l lVar = (C37819l) obj;
        if (lVar.f100343b == 1) {
            this.f334895a.accept(new C120514k(((C37680i) lVar.f100344c).f100074b));
        }
        if (lVar.f100343b == 2) {
            C59052c cVar = (C59052c) C120398f.f334900a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "ConvEngine.Audio");
            cVar.mo56379ah(new C59094n(35442));
            cVar.mo56386p("AudioStream ended");
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
