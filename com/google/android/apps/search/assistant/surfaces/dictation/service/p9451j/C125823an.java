package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119279ao;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Consumer;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.an */
/* compiled from: PG */
public final /* synthetic */ class C125823an implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C70862aj f346749a;

    public /* synthetic */ C125823an(C70862aj ajVar) {
        this.f346749a = ajVar;
    }

    public final void accept(Object obj) {
        C70862aj ajVar = this.f346749a;
        ((C59052c) ((C59052c) ((C59052c) C125826aq.f346751a.mo56226d()).mo56382g((Throwable) obj)).mo56372aa(36699)).mo56386p("Stopping dictation failed. [SD]");
        ajVar.mo20123c(C119279ao.f332627a);
        ajVar.mo20121a();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
