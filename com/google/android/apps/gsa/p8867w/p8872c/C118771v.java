package com.google.android.apps.gsa.p8867w.p8872c;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1341b.C16890c;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1341b.C16891d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.w.c.v */
/* compiled from: PG */
public final /* synthetic */ class C118771v implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C118744ab f331292a;

    /* renamed from: b */
    public final /* synthetic */ C16890c f331293b;

    /* renamed from: c */
    public final /* synthetic */ String f331294c;

    public /* synthetic */ C118771v(C118744ab abVar, C16890c cVar, String str) {
        this.f331292a = abVar;
        this.f331293b = cVar;
        this.f331294c = str;
    }

    public final void accept(Object obj) {
        C118744ab abVar = this.f331292a;
        C16890c cVar = this.f331293b;
        boolean z = ((C86338r) abVar.f331220b.mo17428b()).getBoolean(((C118750ah) obj).mo103945a(this.f331294c), true);
        cVar.copyOnWrite();
        C16891d dVar = (C16891d) cVar.instance;
        C16891d dVar2 = C16891d.f49387g;
        dVar.f49389a |= 1;
        dVar.f49390b = z;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
