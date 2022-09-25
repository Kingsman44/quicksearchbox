package com.google.android.apps.gsa.p8867w.p8872c;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1341b.C16890c;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1341b.C16891d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.w.c.y */
/* compiled from: PG */
public final /* synthetic */ class C118774y implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C118744ab f331301a;

    /* renamed from: b */
    public final /* synthetic */ C16890c f331302b;

    /* renamed from: c */
    public final /* synthetic */ String f331303c;

    public /* synthetic */ C118774y(C118744ab abVar, C16890c cVar, String str) {
        this.f331301a = abVar;
        this.f331302b = cVar;
        this.f331303c = str;
    }

    public final void accept(Object obj) {
        C118744ab abVar = this.f331301a;
        C16890c cVar = this.f331302b;
        boolean z = ((C86338r) abVar.f331220b.mo17428b()).getBoolean(((C118750ah) obj).mo103945a(this.f331303c), false);
        cVar.copyOnWrite();
        C16891d dVar = (C16891d) cVar.instance;
        C16891d dVar2 = C16891d.f49387g;
        dVar.f49389a |= 32;
        dVar.f49394f = z;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
