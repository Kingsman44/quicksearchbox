package com.google.android.apps.search.assistant.libraries.p8966e.p8969c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9023a.C119705a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9023a.C119706b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9024b.C119707a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9025c.C119709b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9025c.C119712e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9025c.C119715h;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9025c.C119716i;
import com.google.android.libraries.assistant.p1363c.p1394f.C17275a;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.assistant.p2703l.C34790d;
import com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36110b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62974ct;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5533i.C70852a;
import p5488io.grpc.p5533i.C70876o;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.libraries.performer.opahandover.OpaHandoverPerformer$performStreamingHandover$1", mo61344c = "OpaHandoverPerformer.kt", mo61345d = "invokeSuspend", mo61346e = {143})
/* renamed from: com.google.android.apps.search.assistant.libraries.e.c.j */
/* compiled from: PG */
final class C119353j extends C69572j implements C69630p {

    /* renamed from: a */
    int f332766a;

    /* renamed from: b */
    final /* synthetic */ C119354k f332767b;

    /* renamed from: c */
    final /* synthetic */ C36110b f332768c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119353j(C119354k kVar, C36110b bVar, C69577g gVar) {
        super(2, gVar);
        this.f332767b = kVar;
        this.f332768c = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119353j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Optional optional;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f332766a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C119354k kVar = this.f332767b;
            C119706b bVar = kVar.f332775g;
            C51809dy dyVar = kVar.f332773e;
            try {
                C33480d dVar = C119707a.f333524a;
                C51807dw dwVar = dyVar.f135938d;
                if (dwVar == null) {
                    dwVar = C51807dw.f135930b;
                }
                optional = dVar.mo38884e(dwVar.f135932a);
            } catch (C62974ct e) {
                C59104x c = C119706b.f333522a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OpaHandoverStreamClient");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(34565)).mo56386p("Unable to parse dynamic service endpoint");
                optional = Optional.empty();
            }
            C34790d dVar2 = bVar.f333523b;
            Objects.requireNonNull(dVar2);
            Optional map = optional.map(new C119705a(dVar2));
            if (!map.isPresent()) {
                C52070ec c2 = C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "Channel not present");
                C69664n.m101060f(c2, "error(Status.INVALID_ARG…T, \"Channel not present\")");
                return c2;
            }
            C17275a a = this.f332767b.f332774f.mo23266a(C39191a.m68622a(this.f332768c.f94444a));
            C119715h hVar = (C119715h) C70852a.m103707c(new C119712e(), (C70888j) map.get(), C70851i.f189015a);
            C70876o.m103763d(hVar.f189039a.mo39510a(C119716i.m198629a(), hVar.f189040b), C119709b.f333525a, C47686k.m84827a(new C119352i(a)), true);
            C119354k kVar2 = this.f332767b;
            C69664n.m101060f(a, "handoverSession");
            this.f332766a = 1;
            obj = kVar2.mo104301c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C119353j(this.f332767b, this.f332768c, gVar);
    }
}
