package com.google.android.libraries.web.webview.p3471a;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58817ah;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.a.o */
/* compiled from: PG */
final class C44331o implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ AccountId f115269a;

    /* renamed from: b */
    final /* synthetic */ C44333q f115270b;

    public C44331o(AccountId accountId, C44333q qVar) {
        this.f115269a = accountId;
        this.f115270b = qVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C44321e eVar = (C44321e) obj;
        if (eVar.f115247b == this.f115269a.mo50068a()) {
            return eVar;
        }
        this.f115270b.f115282f.mo47222a();
        AccountId accountId = this.f115269a;
        C44320d dVar = (C44320d) C44321e.f115244c.createBuilder();
        C69664n.m101060f(dVar, "newBuilder()");
        C44323g a = C69664n.m101061g(dVar, "builder");
        int a2 = accountId.mo50068a();
        C44320d dVar2 = a.f115248a;
        dVar2.copyOnWrite();
        C44321e eVar2 = (C44321e) dVar2.instance;
        eVar2.f115246a |= 1;
        eVar2.f115247b = a2;
        return a.mo47220a();
    }
}
