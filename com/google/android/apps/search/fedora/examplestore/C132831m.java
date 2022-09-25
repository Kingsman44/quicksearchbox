package com.google.android.apps.search.fedora.examplestore;

import com.google.android.apps.search.fedora.p10093b.C132722c;
import com.google.android.gms.learning.internal.C144772d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.fedora.examplestore.m */
/* compiled from: PG */
public final /* synthetic */ class C132831m implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ FedoraExampleStoreService f362430a;

    /* renamed from: b */
    public final /* synthetic */ String f362431b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f362432c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f362433d;

    /* renamed from: e */
    public final /* synthetic */ C144772d f362434e;

    public /* synthetic */ C132831m(FedoraExampleStoreService fedoraExampleStoreService, String str, byte[] bArr, byte[] bArr2, C144772d dVar) {
        this.f362430a = fedoraExampleStoreService;
        this.f362431b = str;
        this.f362432c = bArr;
        this.f362433d = bArr2;
        this.f362434e = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        FedoraExampleStoreService fedoraExampleStoreService = this.f362430a;
        String str = this.f362431b;
        C144772d dVar = this.f362434e;
        C132826h hVar = fedoraExampleStoreService.f362404c;
        C59104x b = C132826h.f362419a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedExampleStoreDel");
        ((C59052c) ((C59052c) b).mo56372aa(39829)).mo56386p("startQuery()");
        C132722c a = C132722c.m215732a(new C132823e(hVar, str, dVar), hVar.f362422d);
        C132824f fVar = C132824f.f362417a;
        C60856cj.m92911t(a.f362147a.f164926b, C47810es.m84974n(fVar), hVar.f362422d);
        return a.f362147a;
    }
}
