package com.google.android.apps.search.assistant.platform.p8988a;

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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.account.AssistantGrpcAccountSelector$getSelection$1", mo61344c = "AssistantGrpcAccountSelector.kt", mo61345d = "invokeSuspend", mo61346e = {28, 29})
/* renamed from: com.google.android.apps.search.assistant.platform.a.i */
/* compiled from: PG */
final class C119507i extends C69572j implements C69630p {

    /* renamed from: a */
    Object f333121a;

    /* renamed from: b */
    int f333122b;

    /* renamed from: c */
    final /* synthetic */ C119508j f333123c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119507i(C119508j jVar, C69577g gVar) {
        super(2, gVar);
        this.f333123c = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119507i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f333122b;
        if (i == 0) {
            C69714l.m101134b(obj);
            C60870cx a = this.f333123c.f333125b.mo104413a();
            this.f333122b = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            Object obj2 = this.f333121a;
            try {
                C69714l.m101134b(obj);
                return obj2;
            } catch (Exception e) {
                C70761fa faVar = new C70761fa(Status.f186915m.mo61678e(e).withDescription("Failed to select/enable assistant preferred account."), (C70334de) null, true);
                C59052c cVar = (C59052c) ((C59052c) C119508j.f333124a.mo56226d()).mo56382g(faVar);
                cVar.mo56379ah(new C59094n(34425));
                cVar.mo56386p("Failed to select/enable assistant preferred account.");
                throw faVar;
            }
        } else {
            C69714l.m101134b(obj);
        }
        AccountId accountId = (AccountId) obj;
        C60870cx b = this.f333123c.f333126c.mo50282b(accountId);
        C69664n.m101060f(b, "accountManager.enable(accountId)");
        this.f333121a = accountId;
        this.f333122b = 2;
        return C71663i.m104690c(b, this) != aVar ? accountId : aVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C119507i(this.f333123c, gVar);
    }
}
