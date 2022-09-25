package com.google.apps.tiktok.account.p3605c;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.p3644h.C47117b;
import com.google.apps.tiktok.p3644h.C47139p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import p5488io.grpc.Status;

/* renamed from: com.google.apps.tiktok.account.c.c */
/* compiled from: PG */
public final class C46069c implements C61485f {

    /* renamed from: a */
    private final C47117b f120928a;

    /* renamed from: b */
    private final AccountId f120929b;

    public C46069c(C47117b bVar, AccountId accountId) {
        this.f120928a = bVar;
        this.f120929b = accountId;
    }

    /* renamed from: a */
    public final /* synthetic */ C61479al mo39483a(C61481b bVar) {
        return C61479al.f166225a;
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        if (bVar.f166236b.mo62571g(C61409d.f166071a) == null) {
            return (((C60870cx) bVar.f166236b.mo62571g(C47139p.f122759a)) != null || this.f120929b.mo50068a() == -1) ? C61479al.f166225a : C61479al.m94191d(bVar.f166236b.mo62569e(C47139p.f122759a, C60922j.m93044g(this.f120928a.mo51025b(this.f120929b), C47810es.m84963c(C46068b.f120927a), C60826bg.f164896a)));
        }
        return C61479al.f166225a;
    }

    /* renamed from: c */
    public final C61480am mo39485c(C61467a aVar) {
        if (aVar.f166174a.getCode() == Status.Code.UNAUTHENTICATED) {
            this.f120928a.mo51024a(this.f120929b);
        }
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
