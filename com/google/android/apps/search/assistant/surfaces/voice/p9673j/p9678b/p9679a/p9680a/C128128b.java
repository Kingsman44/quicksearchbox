package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9680a;

import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.function.Consumer;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C128128b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C128148v f352508a;

    /* renamed from: b */
    public final /* synthetic */ C70862aj f352509b;

    public /* synthetic */ C128128b(C128148v vVar, C70862aj ajVar) {
        this.f352508a = vVar;
        this.f352509b = ajVar;
    }

    public final void accept(Object obj) {
        C128148v vVar = this.f352508a;
        C70862aj ajVar = this.f352509b;
        Throwable th = (Throwable) obj;
        C59104x d = C128148v.f352539a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "FreSuggestionsSrv");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(37771)).mo56386p("Unexpected error while processing FreSuggestions.");
        vVar.f352542d.mo19974a(C37176a.f96908bZ.mo40805c(C62722b.INTERNAL));
        ajVar.mo20122b(th);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
