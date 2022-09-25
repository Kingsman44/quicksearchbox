package com.google.android.apps.search.assistant.surfaces.dictation.service.endpoint.p9435a;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.endpoint.accountselector.PseudonymousAccountSelector$getSelection$1", mo61344c = "PseudonymousAccountSelector.kt", mo61345d = "invokeSuspend", mo61346e = {37, 38})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.endpoint.a.a */
/* compiled from: PG */
final class C125424a extends C69572j implements C69630p {

    /* renamed from: a */
    Object f345901a;

    /* renamed from: b */
    int f345902b;

    /* renamed from: c */
    final /* synthetic */ C125425b f345903c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125424a(C125425b bVar, C69577g gVar) {
        super(2, gVar);
        this.f345903c = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125424a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f345902b;
        if (i == 0) {
            C69714l.m101134b(obj);
            C60870cx a = this.f345903c.f345905b.mo50254a();
            this.f345902b = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            Object obj2 = this.f345901a;
            try {
                C69714l.m101134b(obj);
                return obj2;
            } catch (Exception e) {
                C70761fa faVar = new C70761fa(Status.f186915m.mo61678e(e).withDescription("Failed to select/enable the pseudonymous Account."), (C70334de) null, true);
                C59052c cVar = (C59052c) ((C59052c) C125425b.f345904a.mo56226d()).mo56382g(faVar);
                cVar.mo56379ah(new C59094n(36552));
                cVar.mo56386p("Failed to select/enable the pseudonymous Account. [SD]");
                throw faVar;
            }
        } else {
            C69714l.m101134b(obj);
        }
        AccountId accountId = (AccountId) obj;
        C60870cx b = this.f345903c.f345906c.mo50282b(accountId);
        C69664n.m101060f(b, "accountManager.enable(accountId)");
        this.f345901a = accountId;
        this.f345902b = 2;
        return C71663i.m104690c(b, this) != aVar ? accountId : aVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125424a(this.f345903c, gVar);
    }
}
