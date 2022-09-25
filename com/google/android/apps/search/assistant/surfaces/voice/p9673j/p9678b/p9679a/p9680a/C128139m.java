package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9680a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.m */
/* compiled from: PG */
public final /* synthetic */ class C128139m implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C70862aj f352528a;

    public /* synthetic */ C128139m(C70862aj ajVar) {
        this.f352528a = ajVar;
    }

    public final void accept(Object obj) {
        C70862aj ajVar = this.f352528a;
        Throwable th = (Throwable) obj;
        C59104x d = C128148v.f352539a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "FreSuggestionsSrv");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(37772)).mo56386p("Failed to record impressions.");
        ajVar.mo20122b(th);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
