package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9395c.p9396a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import p3186j$.util.function.Consumer;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.c.a.ak */
/* compiled from: PG */
public final /* synthetic */ class C124565ak implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C124571aq f343648a;

    /* renamed from: b */
    public final /* synthetic */ String f343649b;

    /* renamed from: c */
    public final /* synthetic */ C70862aj f343650c;

    public /* synthetic */ C124565ak(C124571aq aqVar, String str, C70862aj ajVar) {
        this.f343648a = aqVar;
        this.f343649b = str;
        this.f343650c = ajVar;
    }

    public final void accept(Object obj) {
        C124548d dVar = (C124548d) obj;
        this.f343648a.mo106546j(this.f343649b, this.f343650c);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
