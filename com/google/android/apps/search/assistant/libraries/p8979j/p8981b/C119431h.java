package com.google.android.apps.search.assistant.libraries.p8979j.p8981b;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.p1533o.C18495m;
import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.libraries.j.b.h */
/* compiled from: PG */
final class C119431h implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C18495m f332946a;

    /* renamed from: b */
    final /* synthetic */ C2164c f332947b;

    /* renamed from: c */
    final /* synthetic */ C119432i f332948c;

    public C119431h(C119432i iVar, C18495m mVar, C2164c cVar) {
        this.f332948c = iVar;
        this.f332946a = mVar;
        this.f332947b = cVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f332948c.f332951c.mo104338b();
        this.f332947b.mo5437b(Optional.m71637of((C18496n) this.f332946a.build()));
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        this.f332948c.f332951c.mo104339c();
        ((C59052c) ((C59052c) ((C59052c) C119432i.f332949a.mo56226d()).mo56382g(th)).mo56372aa(34418)).mo56386p("Error in getting voice search params.");
        this.f332947b.mo5437b(Optional.empty());
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        this.f332946a.mergeFrom((C18496n) obj);
    }
}
