package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.libraries.assistant.p1525l.p1526a.p1527a.C18409d;
import com.google.android.libraries.assistant.p1525l.p1526a.p1527a.C18410e;
import com.google.android.libraries.assistant.p1525l.p1526a.p1527a.C18413h;
import com.google.android.libraries.assistant.p1525l.p1526a.p1527a.C18415j;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4535g.C59203do;
import com.google.protobuf.C62911as;
import com.google.protobuf.C62912at;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71471ab;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71506bj;
import kotlinx.coroutines.p5574b.C71521by;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71546cw;
import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71561dk;
import kotlinx.coroutines.p5574b.C71562dl;
import kotlinx.coroutines.p5574b.C71571du;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71590q;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5526f.C70748n;
import p5488io.grpc.p5531h.p5532a.C70850d;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.connection.impl.VoicePlateHubmodeConnectionImpl$connectToHubModeService$1", mo61344c = "VoicePlateHubmodeConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {177})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.cg */
/* compiled from: PG */
final class C128752cg extends C69572j implements C69630p {

    /* renamed from: a */
    int f353937a;

    /* renamed from: b */
    final /* synthetic */ C128782dj f353938b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128752cg(C128782dj djVar, C69577g gVar) {
        super(2, gVar);
        this.f353938b = djVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128752cg) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f353937a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C18415j jVar = this.f353938b.f354005b;
            C62911as asVar = (C62911as) C62912at.f169862a.createBuilder();
            C69664n.m101060f(asVar, "newBuilder()");
            C62912at a = C69664n.m101061g(asVar, "builder").mo58809a();
            C70334de deVar = new C70334de();
            C69664n.m101061g(a, "request");
            C70888j jVar2 = jVar.f189039a;
            C70338di diVar = C18413h.f52256b;
            if (diVar == null) {
                synchronized (C18413h.class) {
                    diVar = C18413h.f52256b;
                    if (diVar == null) {
                        C70335df d = C70338di.m102603d();
                        d.f187487c = C70337dh.SERVER_STREAMING;
                        d.f187488d = C70338di.m102602c("com.google.android.libraries.assistant.hubmode.api.voiceplate.VoicePlateEntrypointService", "SubscribeToAssistantStateUpdates");
                        d.f187489e = true;
                        d.f187485a = C70850d.m103697c(C62912at.f169862a);
                        d.f187486b = C70850d.m103697c(C18410e.f52247d);
                        diVar = d.mo62040a();
                        C18413h.f52256b = diVar;
                    }
                }
            }
            C71587n b = C70748n.m103449b(jVar2, diVar, a, jVar.f189040b, deVar);
            C71422aw awVar = this.f353938b.f354008e;
            int i = C71562dl.f190976a;
            C71553dc b2 = C71521by.m104364b(b, awVar, C71561dk.m104450a(3), 0);
            C128782dj djVar = this.f353938b;
            C128755cj cjVar = new C128755cj(C128782dj.m210148f(b2, 2));
            C71422aw awVar2 = djVar.f354008e;
            C71562dl a2 = C71561dk.m104450a(3);
            C119904w wVar = C119904w.f333909c;
            C69664n.m101060f(wVar, "getDefaultInstance()");
            C71571du d2 = C71521by.m104366d(cjVar, awVar2, a2, wVar);
            C71571du d3 = C71521by.m104366d(new C128761cp(C71536cm.m104385c(new C128758cm(C128782dj.m210148f(b2, 4)), new C58425eo(3), new C128762cq((C69577g) null))), this.f353938b.f354008e, C71561dk.m104450a(3), Double.valueOf(C59203do.f157270a));
            C71571du d4 = C71521by.m104366d(new C128769cx(C128782dj.m210148f(b2, 3)), this.f353938b.f354008e, C71561dk.m104450a(3), BuildConfig.FLAVOR);
            C128782dj djVar2 = this.f353938b;
            C71571du d5 = C71521by.m104366d(C71506bj.m104339e(C71471ab.m104286a(new C128765ct(C128782dj.m210148f(b2, 2))), new C128766cu(djVar2, (C69577g) null)), djVar2.f354008e, C71561dk.m104450a(3), false);
            C128782dj djVar3 = this.f353938b;
            C128776dd ddVar = new C128776dd(C128782dj.m210148f(b2, 5));
            C71422aw awVar3 = djVar3.f354008e;
            C71562dl a3 = C71561dk.m104450a(3);
            C18409d dVar = C18409d.f52243b;
            C69664n.m101060f(dVar, "getDefaultInstance()");
            C71587n c = C71546cw.m104401c(d2, d3, d4, d5, C71521by.m104366d(ddVar, awVar3, a3, dVar), new C128751cf((C69577g) null));
            C71587n b3 = this.f353938b.f354006c.mo108651b(new C128747cb(d2));
            C128782dj djVar4 = this.f353938b;
            C71587n b4 = C71477ah.m104295b(C71471ab.m104286a(new C128750ce(C71471ab.m104286a(C71546cw.m104400b(c, b3, C71521by.m104366d(C71590q.m104504a(new C128773da(djVar4, (C69577g) null)), djVar4.f354008e, C71561dk.m104450a(3), false), new C128741bw((C69577g) null))))), new C128742bx(this.f353938b, (C69577g) null));
            C128743by byVar = new C128743by(this.f353938b);
            this.f353937a = 1;
            if (b4.mo38165mp(byVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C128752cg(this.f353938b, gVar);
    }
}
