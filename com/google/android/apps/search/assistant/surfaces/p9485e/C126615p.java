package com.google.android.apps.search.assistant.surfaces.p9485e;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126436e;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.VoiceSearchGrpcImpl$Connection$doVoiceQuery$2", mo61344c = "VoiceSearchGrpcImpl.kt", mo61345d = "invokeSuspend", mo61346e = {171})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.p */
/* compiled from: PG */
final class C126615p extends C69572j implements C69630p {

    /* renamed from: a */
    int f348676a;

    /* renamed from: b */
    final /* synthetic */ C126621v f348677b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126615p(C126621v vVar, C69577g gVar) {
        super(2, gVar);
        this.f348677b = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126615p) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69615a aVar;
        Throwable th;
        C69554a aVar2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f348676a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (CancellationException e) {
                C126621v vVar = this.f348677b;
                vVar.f348696a.mo20122b(e);
                Throwable a = C126624y.f348714a.mo107571a(e);
                if (!(a instanceof C70761fa) || ((C70761fa) a).f188571a.getCode() != Status.Code.CANCELLED) {
                    C59052c cVar = (C59052c) ((C59052c) C126624y.f348717d.mo56225c()).mo56382g(e);
                    cVar.mo56379ah(new C59094n(38882));
                    cVar.mo56386p("VoiceSearch M2 interaction failed with CancellationException.");
                    C126436e eVar = vVar.f348701f;
                    C34834b bVar = C34830d.m63595b(a).f92362c;
                    if (bVar == null) {
                        bVar = C34834b.f92401c;
                    }
                    eVar.mo107611c(C34819a.m63579b(bVar));
                } else {
                    C59052c cVar2 = (C59052c) ((C59052c) C126624y.f348717d.mo56225c()).mo56382g(e);
                    cVar2.mo56379ah(new C59094n(38883));
                    cVar2.mo56386p("VoiceSearch M2 interaction cancelled.");
                    vVar.f348701f.mo107609a(C62722b.CANCELLED);
                }
                aVar = this.f348677b.f348697b;
            } catch (Throwable th2) {
                this.f348677b.f348697b.mo5672a();
                throw th2;
            }
        } else {
            C69714l.m101134b(obj);
            this.f348677b.f348701f.mo107613e(C37176a.f96882b.mo40779c());
            C126621v vVar2 = this.f348677b;
            this.f348676a = 1;
            Object a2 = C71423ax.m104196a(new C126620u(vVar2, (C69577g) null), this);
            if (a2 != C69554a.COROUTINE_SUSPENDED) {
                a2 = C69788q.f186170a;
            }
            if (a2 == aVar2) {
                return aVar2;
            }
        }
        C126621v vVar3 = this.f348677b;
        C59052c cVar3 = (C59052c) C126624y.f348717d.mo56224b();
        cVar3.mo56379ah(new C59094n(38885));
        cVar3.mo56386p("VoiceSearch M2 interaction finished.");
        vVar3.f348701f.mo107609a(C62722b.OK);
        vVar3.f348696a.mo20121a();
        aVar = this.f348677b.f348697b;
        aVar.mo5672a();
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126615p(this.f348677b, gVar);
    }
}
