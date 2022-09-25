package com.google.android.libraries.search.p2904c.p2977w.p2979b.p2980a;

import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.C37666hm;
import com.google.android.libraries.search.p2904c.p2977w.p2979b.p2981b.C38150a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.routing.restricted.impl.AudioRouteDisconnectorImpl$disconnectHandoverRoute$1", mo61344c = "AudioRouteDisconnectorImpl.kt", mo61345d = "invokeSuspend", mo61346e = {86})
/* renamed from: com.google.android.libraries.search.c.w.b.a.d */
/* compiled from: PG */
final class C38144d extends C69572j implements C69626l {

    /* renamed from: a */
    int f101064a;

    /* renamed from: b */
    final /* synthetic */ C38148h f101065b;

    /* renamed from: c */
    final /* synthetic */ int f101066c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38144d(C38148h hVar, int i, C69577g gVar) {
        super(1, gVar);
        this.f101065b = hVar;
        this.f101066c = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C38144d(this.f101065b, this.f101066c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f101064a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                obj2 = C69714l.m101133a(th);
            }
        } else {
            C69714l.m101134b(obj);
            C38148h hVar = this.f101065b;
            C60870cx a = hVar.f101078c.mo41103d(this.f101066c, C37565ef.AUDIO_ROUTE_DISCONNECT_CLIENT_REQUESTED).mo41053a();
            C69664n.m101060f(a, "clientsManager\n         …     .stopListeningStatus");
            this.f101064a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        obj2 = ((C37666hm) obj).f100045b;
        if (obj2 == null) {
            obj2 = C37514du.f99629c;
        }
        int i = this.f101066c;
        Throwable a2 = C69702k.m101124a(obj2);
        if (a2 == null) {
            C37514du duVar = (C37514du) obj2;
            C59052c cVar = (C59052c) C38148h.f101076a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "ALT.RouteDisconnector");
            String a3 = C38149i.m67347a(duVar);
            cVar.mo56379ah(new C59094n(52979));
            cVar.mo56395y("#audio# hotword session(token(%d)) stopped with status(%s)", i, a3);
            if (duVar.f99631a == 1) {
                return C38150a.STATUS_SUCCESS;
            }
            return C38150a.STATUS_UNEXPECTED_FAILURE;
        }
        C59052c cVar2 = (C59052c) C38148h.f101076a.mo56226d();
        cVar2.mo56378ag(C58975e.f156826a, "ALT.RouteDisconnector");
        C59052c cVar3 = (C59052c) cVar2.mo56382g(a2);
        cVar3.mo56379ah(new C59094n(52978));
        cVar3.mo56387q("#audio# hotword session(%d) failed to stop", i);
        return C38150a.STATUS_UNEXPECTED_FAILURE;
    }
}
