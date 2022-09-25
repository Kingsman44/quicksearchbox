package com.google.frameworks.client.data.android.server.tiktok;

import com.google.android.libraries.p3340w.C43210b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58557jl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Executor;
import p5488io.grpc.C70293cv;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.binder.C70230j;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.p */
/* compiled from: PG */
public final class C61601p implements C61592g {

    /* renamed from: a */
    static final C70293cv f166465a;

    /* renamed from: b */
    public static final C70297cz f166466b = C70230j.m102380b("account-id-bin", AccountId.CREATOR);

    /* renamed from: c */
    static final C70297cz f166467c = C70297cz.m102495c("tiktok-account-selector-context-bin", C70850d.m103696b(C61603r.f166472a));
    @Deprecated

    /* renamed from: d */
    static final C70297cz f166468d;

    /* renamed from: e */
    public final C46175b f166469e;

    /* renamed from: f */
    public final C46128f f166470f;

    /* renamed from: g */
    private final Executor f166471g;

    static {
        C61600o oVar = new C61600o();
        f166465a = oVar;
        f166468d = C70297cz.m102495c("account-name-bin", oVar);
    }

    public C61601p(C46175b bVar, C46128f fVar, Executor executor) {
        this.f166469e = bVar;
        this.f166470f = fVar;
        this.f166471g = executor;
    }

    /* renamed from: b */
    static Object m94386b(C70334de deVar, C70297cz czVar) {
        Iterable a = deVar.mo62026a(czVar);
        if (a == null) {
            return null;
        }
        return C58557jl.m90133n(a);
    }

    /* renamed from: a */
    public final C60870cx mo20126a(C61591f fVar) {
        Object obj;
        C70334de deVar = ((C61573a) fVar).f166417a;
        try {
            AccountId accountId = (AccountId) m94386b(deVar, f166466b);
            if (accountId != null) {
                return C60856cj.m92900i(accountId);
            }
            C43210b.m76196a();
            C61603r rVar = (C61603r) m94386b(deVar, f166467c);
            C61589d dVar = null;
            if (rVar != null) {
                C62940bt r2 = C62942bv.checkIsLite(C61590e.f166450a);
                rVar.mo58887l(r2);
                if (rVar.f169962ag.mo58857o(r2.f169971d)) {
                    C62940bt r1 = C62942bv.checkIsLite(C61590e.f166450a);
                    rVar.mo58887l(r1);
                    Object l = rVar.f169962ag.mo58854l(r1.f169971d);
                    if (l == null) {
                        obj = r1.f169969b;
                    } else {
                        obj = r1.mo58889c(l);
                    }
                    dVar = (C61589d) obj;
                } else {
                    throw new C70761fa(Status.f186910h.withDescription("Sent account context without an extension"), (C70334de) null, true);
                }
            }
            String str = (String) m94386b(deVar, f166468d);
            if (dVar == null) {
                if (str == null) {
                    return C60856cj.m92899h(Status.f186910h.withDescription("Did not provide AccountId or account name. You may need to use RemoteAccountScopedServices.").asException());
                }
            }
            C60870cx e = this.f166469e.mo50248e();
            C61599n nVar = new C61599n(this, dVar, str);
            return C60922j.m93045h(e, C47810es.m84966f(nVar), this.f166471g);
        } catch (IllegalArgumentException e2) {
            return C60856cj.m92899h(Status.f186906d.mo61678e(e2).withDescription("Provided multiple account identifiers").asException());
        }
    }
}
