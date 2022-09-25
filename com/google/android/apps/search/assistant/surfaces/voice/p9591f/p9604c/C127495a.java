package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127418e;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127419f;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127420g;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127422i;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127463a;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127464b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127465c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127467e;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.p9605a.C127496a;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.p9605a.C127499d;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127616c;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127617d;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127619f;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127621h;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127628o;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34065ca;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.entry.dispatcher.DeeplinkEntryPointDispatcher$dispatchDeeplinkEntryRequest$2", mo61344c = "DeeplinkEntryPointDispatcher.kt", mo61345d = "invokeSuspend", mo61346e = {84, 91})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.c.a */
/* compiled from: PG */
public final class C127495a extends C69572j implements C69630p {

    /* renamed from: a */
    int f351016a;

    /* renamed from: b */
    final /* synthetic */ C127505f f351017b;

    /* renamed from: c */
    final /* synthetic */ C127418e f351018c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127495a(C127505f fVar, C127418e eVar, C69577g gVar) {
        super(2, gVar);
        this.f351017b = fVar;
        this.f351018c = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127495a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f351016a;
        if (i == 0) {
            C69714l.m101134b(obj);
            Duration ofNanos = Duration.ofNanos(this.f351017b.f351061d.mo26872d());
            C127418e eVar = this.f351018c;
            if ((eVar.f350851a & 4) != 0) {
                String b = C127499d.m208461b();
                C127499d dVar = this.f351017b.f351066i;
                C127418e eVar2 = this.f351018c;
                C69664n.m101060f(ofNanos, "elapsedRealtime");
                dVar.mo108100a(b, new C127496a(eVar2, ofNanos));
                C127628o oVar = this.f351017b.f351062e;
                C127418e eVar3 = this.f351018c;
                C127616c cVar = (C127616c) C127617d.f351336e.createBuilder();
                C69664n.m101060f(cVar, "newBuilder()");
                C127619f a = C69664n.m101061g(cVar, "builder");
                a.mo108150b(b);
                C34065ca caVar = eVar3.f350856f;
                if (caVar == null) {
                    caVar = C34065ca.f90770i;
                }
                C69664n.m101060f(caVar, "request.requestedSharedResources");
                a.mo108151c(caVar);
                C127617d a2 = a.mo108149a();
                this.f351016a = 1;
                obj = oVar.mo108154b(a2, new C70334de(), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                C127505f fVar = this.f351017b;
                C69664n.m101060f(ofNanos, "elapsedRealtime");
                this.f351016a = 2;
                obj = fVar.mo108103c(eVar, ofNanos, this);
                if (obj == aVar) {
                    return aVar;
                }
                C119834cb cbVar = (C119834cb) obj;
                C127419f fVar2 = (C127419f) C127420g.f350858c.createBuilder();
                C69664n.m101060f(fVar2, "newBuilder()");
                C127422i a3 = C69664n.m101061g(fVar2, "builder");
                C127463a aVar2 = (C127463a) C127465c.f350959c.createBuilder();
                C69664n.m101060f(aVar2, "newBuilder()");
                C127467e a4 = C69664n.m101061g(aVar2, "builder");
                a4.mo108080c(C127464b.SUCCESS);
                a3.mo108056b(a4.mo108078a());
                return a3.mo108055a();
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            C119834cb cbVar2 = (C119834cb) obj;
            C127419f fVar22 = (C127419f) C127420g.f350858c.createBuilder();
            C69664n.m101060f(fVar22, "newBuilder()");
            C127422i a32 = C69664n.m101061g(fVar22, "builder");
            C127463a aVar22 = (C127463a) C127465c.f350959c.createBuilder();
            C69664n.m101060f(aVar22, "newBuilder()");
            C127467e a42 = C69664n.m101061g(aVar22, "builder");
            a42.mo108080c(C127464b.SUCCESS);
            a32.mo108056b(a42.mo108078a());
            return a32.mo108055a();
        } else {
            C69714l.m101134b(obj);
        }
        C127621h hVar = (C127621h) obj;
        C127419f fVar222 = (C127419f) C127420g.f350858c.createBuilder();
        C69664n.m101060f(fVar222, "newBuilder()");
        C127422i a322 = C69664n.m101061g(fVar222, "builder");
        C127463a aVar222 = (C127463a) C127465c.f350959c.createBuilder();
        C69664n.m101060f(aVar222, "newBuilder()");
        C127467e a422 = C69664n.m101061g(aVar222, "builder");
        a422.mo108080c(C127464b.SUCCESS);
        a322.mo108056b(a422.mo108078a());
        return a322.mo108055a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127495a(this.f351017b, this.f351018c, gVar);
    }
}
