package com.google.android.libraries.accountlinking.p10979b;

import com.google.android.gms.auth.C142903e;
import com.google.android.gms.auth.C142914n;
import com.google.common.p4526f.p4527a.C58970a;
import java.io.IOException;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.C70898m;
import p5488io.grpc.C70901p;

/* renamed from: com.google.android.libraries.accountlinking.b.a */
/* compiled from: PG */
final class C147397a extends C70901p {

    /* renamed from: a */
    final /* synthetic */ C147398b f397911a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147397a(C147398b bVar, C70898m mVar) {
        super(mVar);
        this.f397911a = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo62589e(C70897l lVar, C70334de deVar) {
        try {
            C147398b bVar = this.f397911a;
            String g = C142914n.m231859g(bVar.f397913b, bVar.f397914c, "oauth2:https://www.googleapis.com/auth/oauth_integrations");
            C70290cs csVar = new C70290cs("Authorization", C70334de.f187481c);
            deVar.mo62033h(csVar, "Bearer " + g);
        } catch (C142903e | IOException e) {
            ((C58970a) ((C58970a) ((C58970a) C147398b.f397912a.mo56226d()).mo56382g(e)).mo56372aa(42240)).mo56386p("Failed to get an auth token via GoogleAuthUtil#getToken()");
        }
        this.f189092b.mo27478a(lVar, deVar);
    }
}
