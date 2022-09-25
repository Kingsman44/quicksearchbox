package com.google.android.libraries.search.assistant.invocation.assistdata.p2596b;

import android.graphics.Bitmap;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122050j;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.C34705a;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61541e;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61543g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.assistdata.service.AssistDataGrpcServiceImpl$getScreenshot$2", mo61344c = "AssistDataGrpcServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {37})
/* renamed from: com.google.android.libraries.search.assistant.invocation.assistdata.b.y */
/* compiled from: PG */
final class C33551y extends C69572j implements C69626l {

    /* renamed from: a */
    int f89731a;

    /* renamed from: b */
    final /* synthetic */ C33552z f89732b;

    /* renamed from: c */
    final /* synthetic */ C33540n f89733c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33551y(C33552z zVar, C33540n nVar, C69577g gVar) {
        super(1, gVar);
        this.f89732b = zVar;
        this.f89733c = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33551y(this.f89732b, this.f89733c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f89731a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C122050j jVar = this.f89732b.f89734a;
            String str = this.f89733c.f89709a;
            C69664n.m101060f(str, "request.token");
            C34053bp a = C34705a.m63440a(str);
            this.f89731a = 1;
            obj = jVar.mo105523c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C61541e eVar = C33527ac.f89697b;
        C69664n.m101060f(eVar, "BITMAP_KEYS");
        C61543g.m94280g(eVar, (Bitmap) obj);
        return C69788q.f186170a;
    }
}
