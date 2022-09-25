package com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a;

import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91907e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.e.a.e */
/* compiled from: PG */
final class C91721e extends C90880an {

    /* renamed from: a */
    final /* synthetic */ String f255814a;

    /* renamed from: b */
    final /* synthetic */ C91725i f255815b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91721e(C91725i iVar, String str) {
        super("createSharableShortUrl", 1, 16);
        this.f255815b = iVar;
        this.f255814a = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C91907e b = this.f255815b.mo86215b();
        if (b != null) {
            try {
                return b.mo85973b(this.f255814a);
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) C91725i.f255821a.mo56225c()).mo56382g(e)).mo56372aa(11875)).mo56386p("Error making createSharableShortUrl request");
            }
        } else {
            ((C59052c) ((C59052c) C91725i.f255821a.mo56225c()).mo56372aa(11874)).mo56386p("skipping createSharableShortUrl, service is null");
            return this.f255814a;
        }
    }
}
