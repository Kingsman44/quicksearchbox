package com.google.android.apps.search.assistant.platform.appintegration.p8989a;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.server.tiktok.C61573a;
import com.google.frameworks.client.data.android.server.tiktok.C61591f;
import com.google.frameworks.client.data.android.server.tiktok.C61592g;
import java.util.concurrent.Executor;
import p5488io.grpc.C70293cv;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.binder.C70230j;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.a.f */
/* compiled from: PG */
public final class C119514f implements C61592g {

    /* renamed from: a */
    static final C70293cv f333129a;

    /* renamed from: b */
    public static final C70297cz f333130b = C70230j.m102380b("account-id-bin", AccountId.CREATOR);

    /* renamed from: c */
    public static final C70297cz f333131c;

    /* renamed from: d */
    private static final C59071e f333132d = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.a.f");

    /* renamed from: e */
    private final C46175b f333133e;

    /* renamed from: f */
    private final Executor f333134f;

    static {
        C119513e eVar = new C119513e();
        f333129a = eVar;
        f333131c = C70297cz.m102495c("account-name-bin", eVar);
        C70297cz.m102495c("account-type-bin", eVar);
    }

    public C119514f(C46175b bVar, Executor executor) {
        this.f333133e = bVar;
        this.f333134f = executor;
    }

    /* renamed from: b */
    static Object m198371b(C70334de deVar, C70297cz czVar) {
        Iterable a = deVar.mo62026a(czVar);
        if (a == null) {
            return null;
        }
        return C58557jl.m90133n(a);
    }

    /* renamed from: a */
    public final C60870cx mo20126a(C61591f fVar) {
        C70334de deVar = ((C61573a) fVar).f166417a;
        try {
            AccountId accountId = (AccountId) m198371b(deVar, f333130b);
            if (accountId != null) {
                return C60856cj.m92900i(accountId);
            }
            String str = (String) m198371b(deVar, f333131c);
            ((C59052c) ((C59052c) f333132d.mo56224b()).mo56372aa(34429)).mo56389s("Couldn't find account id. Try account name: %s", str);
            return C60922j.m93044g(this.f333133e.mo50248e(), C47810es.m84963c(new C119512d(str)), this.f333134f);
        } catch (IllegalArgumentException e) {
            return C60856cj.m92899h(Status.f186906d.mo61678e(e).asException());
        }
    }
}
