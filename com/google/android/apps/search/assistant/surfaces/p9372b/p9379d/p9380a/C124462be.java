package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.be */
/* compiled from: PG */
public final /* synthetic */ class C124462be implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C124475br f343482a;

    /* renamed from: b */
    public final /* synthetic */ C124477bt f343483b;

    /* renamed from: c */
    public final /* synthetic */ C124484i f343484c;

    public /* synthetic */ C124462be(C124475br brVar, C124477bt btVar, C124484i iVar) {
        this.f343482a = brVar;
        this.f343483b = btVar;
        this.f343484c = iVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C124475br brVar = this.f343482a;
        C124477bt btVar = this.f343483b;
        C124484i iVar = this.f343484c;
        if (brVar.f343508g == null) {
            cVar.mo5439d(new IllegalStateException("RequestObserver not initialized"));
        } else {
            if (brVar.f343506e.containsKey(btVar)) {
                ((C2164c) brVar.f343506e.get(btVar)).mo5438c();
                brVar.f343506e.remove(btVar);
            }
            brVar.f343506e.put(btVar, cVar);
            C70862aj ajVar = brVar.f343508g;
            ajVar.getClass();
            ajVar.mo20123c(iVar);
        }
        return "ApaConversationHelper#makeBlockingServiceRequest_".concat(String.valueOf(btVar.name()));
    }
}
