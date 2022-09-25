package com.google.android.apps.search.assistant.platform.appintegration.p9001g;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119632n;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.p9150b.C121023g;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.g.a */
/* compiled from: PG */
public final class C119545a extends C119632n {

    /* renamed from: a */
    private static final C59071e f333184a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.g.a");

    /* renamed from: b */
    private final C119555f f333185b;

    /* renamed from: c */
    private final AccountId f333186c;

    public C119545a(AccountId accountId, C119555f fVar) {
        this.f333186c = accountId;
        this.f333185b = fVar;
    }

    /* renamed from: b */
    public final C70862aj mo104426b(C70862aj ajVar) {
        C59104x b = f333184a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ApaKarajanImpl");
        ((C59052c) ((C59052c) b).mo56372aa(34523)).mo56389s("startAssistantSession: accountId=%s", this.f333186c);
        C119555f fVar = this.f333185b;
        C119548ac acVar = new C119548ac(ajVar);
        String str = (String) fVar.f333208a.mo17428b();
        str.getClass();
        String str2 = (String) fVar.f333209b.mo17428b();
        str2.getClass();
        C119562m mVar = (C119562m) fVar.f333210c.mo17428b();
        mVar.getClass();
        C60888db dbVar = (C60888db) fVar.f333211d.mo17428b();
        dbVar.getClass();
        Context context = (Context) fVar.f333212e.mo17428b();
        context.getClass();
        C121023g gVar = (C121023g) fVar.f333213f.mo17428b();
        gVar.getClass();
        C119547ab abVar = (C119547ab) fVar.f333214g.mo17428b();
        abVar.getClass();
        return new C119554e(str, str2, mVar, dbVar, context, gVar, abVar, acVar);
    }
}
