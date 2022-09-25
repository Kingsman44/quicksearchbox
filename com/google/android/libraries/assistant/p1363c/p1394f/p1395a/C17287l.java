package com.google.android.libraries.assistant.p1363c.p1394f.p1395a;

import com.google.android.libraries.search.assistant.p2511d.C32538am;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.p5533i.C70868g;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.opahandover.impl.HandoverSessionImpl$start$handoverDoneDeferred$1$1", mo61344c = "HandoverSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {100})
/* renamed from: com.google.android.libraries.assistant.c.f.a.l */
/* compiled from: PG */
final class C17287l extends C69572j implements C69630p {

    /* renamed from: a */
    int f50088a;

    /* renamed from: b */
    final /* synthetic */ C17291p f50089b;

    /* renamed from: c */
    final /* synthetic */ C70868g f50090c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17287l(C17291p pVar, C70868g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f50089b = pVar;
        this.f50090c = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C17287l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f50088a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n b = C71477ah.m104295b(C71536cm.m104384b(C32538am.m60349a(new C17284i(this.f50089b.f50104e)), new C17285j(this.f50090c, (C69577g) null)), new C17286k(this.f50090c, (C69577g) null));
            this.f50088a = 1;
            if (C71594u.m104514a(b, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C17287l(this.f50089b, this.f50090c, gVar);
    }
}
