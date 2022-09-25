package com.google.apps.tiktok.p3644h.p3647b;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.p4632a.C61333a;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import java.util.concurrent.ExecutionException;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: com.google.apps.tiktok.h.b.b */
/* compiled from: PG */
final class C47119b implements C61485f {

    /* renamed from: a */
    final /* synthetic */ C47124g f122721a;

    /* renamed from: b */
    final /* synthetic */ AccountId f122722b;

    /* renamed from: c */
    private C60870cx f122723c;

    public C47119b(C47124g gVar, AccountId accountId) {
        this.f122721a = gVar;
        this.f122722b = accountId;
    }

    /* renamed from: a */
    public final C61479al mo39483a(C61481b bVar) {
        try {
            return C61479al.m94191d(bVar.f166236b.mo62569e(C61333a.f165865a, (C61333a) C60856cj.m92909r(this.f122723c)));
        } catch (ExecutionException e) {
            return C61479al.m94189b(Status.m102099c(Status.Code.UNAUTHENTICATED).mo61678e(e).withDescription("Cannot get auth token for account id: ".concat(String.valueOf(String.valueOf(this.f122722b)))), new C70334de());
        }
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        C58838bb.m90884s(bVar.f166236b.mo62571g(C61333a.f165865a) == null, "xrpc AuthContext should not be set on a TikTok RPC stub");
        C60870cx b = this.f122721a.f122730a.mo50395b();
        this.f122723c = b;
        return C61479al.m94190c(b);
    }

    /* renamed from: c */
    public final /* synthetic */ C61480am mo39485c(C61467a aVar) {
        return C61480am.f166232a;
    }

    /* renamed from: d */
    public final /* synthetic */ C61480am mo39486d(C61483d dVar) {
        return C61480am.f166232a;
    }

    /* renamed from: e */
    public final /* synthetic */ C61479al mo39487e() {
        return C61479al.f166225a;
    }

    /* renamed from: f */
    public final /* synthetic */ C61479al mo39488f() {
        return C61479al.f166225a;
    }

    /* renamed from: g */
    public final /* synthetic */ C61480am mo39489g() {
        return C61480am.f166232a;
    }
}
