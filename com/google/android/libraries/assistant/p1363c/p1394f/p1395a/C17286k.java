package com.google.android.libraries.assistant.p1363c.p1394f.p1395a;

import com.google.android.libraries.search.assistant.p2705n.p2706a.C34820a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34829c;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70869h;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.opahandover.impl.HandoverSessionImpl$start$handoverDoneDeferred$1$1$3", mo61344c = "HandoverSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.assistant.c.f.a.k */
/* compiled from: PG */
final class C17286k extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f50086a;

    /* renamed from: b */
    final /* synthetic */ C70868g f50087b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17286k(C70868g gVar, C69577g gVar2) {
        super(3, gVar2);
        this.f50087b = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C17286k kVar = new C17286k(this.f50087b, (C69577g) obj3);
        kVar.f50086a = (Throwable) obj2;
        return kVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C70761fa faVar;
        C70761fa faVar2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f50086a;
        this.f50087b.mo20123c(obj2 == null ? C17280e.f50077a : C17280e.f50078b);
        if (obj2 == null) {
            this.f50087b.mo20121a();
        } else if (obj2 instanceof CancellationException) {
            ((C70869h) this.f50087b).f189042b.mo27480d("Handover request stream was cancelled", (Throwable) null);
        } else {
            C70868g gVar = this.f50087b;
            if (obj2 instanceof C70761fa) {
                faVar = (C70761fa) obj2;
            } else {
                if (obj2 instanceof C34820a) {
                    faVar2 = new C70761fa(Status.m102100d((Throwable) obj2), C34829c.m63592a(((C34820a) obj2).mo23265a()), true);
                } else {
                    faVar2 = new C70761fa(Status.m102100d((Throwable) obj2), (C70334de) null, true);
                }
                faVar = faVar2;
            }
            gVar.mo20122b(faVar);
        }
        return C69788q.f186170a;
    }
}
