package com.google.android.apps.search.fedora.examplestore;

import com.google.android.apps.search.fedora.p10093b.C132721b;
import com.google.android.gms.learning.internal.C144772d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.fedora.examplestore.d */
/* compiled from: PG */
public final /* synthetic */ class C132822d implements C132721b {

    /* renamed from: a */
    public final /* synthetic */ C132826h f362410a;

    /* renamed from: b */
    public final /* synthetic */ String f362411b;

    /* renamed from: c */
    public final /* synthetic */ C132830l f362412c;

    /* renamed from: d */
    public final /* synthetic */ C144772d f362413d;

    public /* synthetic */ C132822d(C132826h hVar, String str, C144772d dVar, C132830l lVar) {
        this.f362410a = hVar;
        this.f362411b = str;
        this.f362413d = dVar;
        this.f362412c = lVar;
    }

    /* renamed from: a */
    public final void mo110893a(Object obj) {
        C132826h hVar = this.f362410a;
        String str = this.f362411b;
        C144772d dVar = this.f362413d;
        C132830l lVar = this.f362412c;
        if (!((Boolean) obj).booleanValue()) {
            C59104x d = C132826h.f362419a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FedExampleStoreDel");
            ((C59052c) ((C59052c) d).mo56372aa(39836)).mo56389s("Failed to initialize example store iterator for collection: %s", str);
            dVar.mo120205b("Adapter init failed");
            hVar.f362421c.mo110911b(str, 3);
            return;
        }
        C59104x b = C132826h.f362419a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedExampleStoreDel");
        ((C59052c) ((C59052c) b).mo56372aa(39835)).mo56389s("Successfully started the query for collection: %s", str);
        dVar.mo120204a(lVar);
        C132819a aVar = hVar.f362421c;
        aVar.f362405a.mo110965c("Fedora.ExampleStore.QueryStart.Status", 1);
        aVar.f362405a.mo110965c(String.format("%s.%s", new Object[]{"Fedora.ExampleStore.QueryStart.Status", C132819a.m215791a(str)}), 1);
    }
}
