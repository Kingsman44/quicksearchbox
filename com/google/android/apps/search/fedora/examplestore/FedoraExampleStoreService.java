package com.google.android.apps.search.fedora.examplestore;

import com.google.android.apps.search.fedora.p10093b.C132722c;
import com.google.android.gms.learning.internal.C144772d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Executor;

/* compiled from: PG */
public final class FedoraExampleStoreService extends C132833o {

    /* renamed from: a */
    public static final C59071e f362402a = C59071e.m91332i("com.google.android.apps.search.fedora.examplestore.FedoraExampleStoreService");

    /* renamed from: b */
    public Executor f362403b;

    /* renamed from: c */
    public C132826h f362404c;

    /* renamed from: a */
    public final void mo92057a(String str, byte[] bArr, byte[] bArr2, C144772d dVar) {
        C59104x b = f362402a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraExamplesService");
        ((C59052c) ((C59052c) b).mo56372aa(39842)).mo56386p("startQuery()");
        C132722c a = C132722c.m215732a(new C132831m(this, str, bArr, bArr2, dVar), this.f362403b);
        C132832n nVar = new C132832n(str);
        C60856cj.m92911t(a.f362147a.f164926b, C47810es.m84974n(nVar), this.f362403b);
    }

    public final void onCreate() {
        super.onCreate();
        C59104x b = f362402a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraExamplesService");
        ((C59052c) ((C59052c) b).mo56372aa(39841)).mo56386p("onCreate()");
    }
}
