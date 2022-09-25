package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c;

import com.google.frameworks.client.data.android.C61367ai;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.network.apas3client.impl.ApaS3ConnectionImpl$run$collector$1$1", mo61344c = "ApaS3ConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.assistant.c.e.a.c.k */
/* compiled from: PG */
final class C17246k extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f50008a;

    public C17246k(C69577g gVar) {
        super(2, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C17246k) mo5194c((C66611ci) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C66611ci ciVar = (C66611ci) this.f50008a;
        C66610ch a = C66610ch.m97260a(ciVar.f181209b);
        if (a == null) {
            a = C66610ch.IN_PROGRESS;
        }
        if (a != C66610ch.DONE_ERROR) {
            return C69788q.f186170a;
        }
        Status b = C61367ai.m93876b(C61367ai.m93875a(ciVar.f181210c)).mo61684b();
        int i = ciVar.f181210c;
        throw new C70761fa(b.withDescription("HTTP status code " + i), (C70334de) null, true);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C17246k kVar = new C17246k(gVar);
        kVar.f50008a = obj;
        return kVar;
    }
}
