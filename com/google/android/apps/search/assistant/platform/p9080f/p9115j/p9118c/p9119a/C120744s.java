package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120391a;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120507d;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h;
import com.google.android.libraries.search.p3055n.C39360bi;
import com.google.android.libraries.search.p3055n.C39361bj;
import com.google.android.libraries.search.p3055n.C39363bl;
import com.google.android.libraries.search.p3055n.C39669cw;
import com.google.android.libraries.search.p3055n.C39670cx;
import com.google.android.libraries.search.p3055n.C39672cz;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.speech.p5218j.C66958fu;
import com.google.speech.p5218j.C67170o;
import com.google.speech.p5218j.C67171p;
import com.google.speech.p5218j.C67172q;
import com.google.speech.p5218j.C67175t;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71389v;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.ondevice.streaming.impl.SodaSession$sendAudio$2$consume$1", mo61344c = "SodaSession.kt", mo61345d = "invokeSuspend", mo61346e = {117})
/* renamed from: com.google.android.apps.search.assistant.platform.f.j.c.a.s */
/* compiled from: PG */
final class C120744s extends C69572j implements C69630p {

    /* renamed from: a */
    int f335837a;

    /* renamed from: b */
    final /* synthetic */ C120749x f335838b;

    /* renamed from: c */
    final /* synthetic */ C120391a f335839c;

    /* renamed from: d */
    final /* synthetic */ C120511h f335840d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120744s(C120749x xVar, C120391a aVar, C120511h hVar, C69577g gVar) {
        super(2, gVar);
        this.f335838b = xVar;
        this.f335839c = aVar;
        this.f335840d = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120744s) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335837a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71389v vVar = this.f335838b.f335855f;
            C120391a aVar2 = this.f335839c;
            C120507d a = this.f335840d.mo104768a();
            C69664n.m101060f(a, "audioInputSession.config()");
            C69664n.m101061g(aVar2, "audioChunk");
            C69664n.m101061g(a, "audioConfig");
            C39669cw cwVar = (C39669cw) C39670cx.f104424a.createBuilder();
            C69664n.m101060f(cwVar, "newBuilder()");
            C39672cz a2 = C69664n.m101061g(cwVar, "builder");
            C62940bt btVar = C39361bj.f103655d;
            C69664n.m101060f(btVar, "requestId");
            C39360bi biVar = (C39360bi) C39361bj.f103654c.createBuilder();
            C69664n.m101060f(biVar, "newBuilder()");
            C39363bl a3 = C69664n.m101061g(biVar, "builder");
            C67170o oVar = (C67170o) C67171p.f182575e.createBuilder();
            C69664n.m101060f(oVar, "newBuilder()");
            C69664n.m101061g(oVar, "builder");
            C63088z a4 = aVar2.mo104738a();
            C69664n.m101060f(a4, "audioChunk.data()");
            C69664n.m101061g(a4, "value");
            oVar.copyOnWrite();
            C67171p pVar = (C67171p) oVar.instance;
            a4.getClass();
            pVar.f182577a |= 1;
            pVar.f182578b = a4;
            C67172q qVar = (C67172q) C67175t.f182588e.createBuilder();
            C69664n.m101060f(qVar, "newBuilder()");
            C66958fu a5 = C69664n.m101061g(qVar, "builder");
            int b = a.mo104781b();
            C67172q qVar2 = a5.f182008a;
            qVar2.copyOnWrite();
            C67175t tVar = (C67175t) qVar2.instance;
            tVar.f182590a |= 2;
            tVar.f182592c = b;
            int a6 = a.mo104780a();
            C67172q qVar3 = a5.f182008a;
            qVar3.copyOnWrite();
            C67175t tVar2 = (C67175t) qVar3.instance;
            tVar2.f182590a |= 4;
            tVar2.f182593d = a6;
            C67175t a7 = a5.mo59754a();
            C69664n.m101061g(a7, "value");
            oVar.copyOnWrite();
            C67171p pVar2 = (C67171p) oVar.instance;
            a7.getClass();
            pVar2.f182579c = a7;
            pVar2.f182577a |= 2;
            C62942bv build = oVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C67171p pVar3 = (C67171p) build;
            C69664n.m101061g(pVar3, "value");
            C39360bi biVar2 = a3.f103659a;
            biVar2.copyOnWrite();
            C39361bj bjVar = (C39361bj) biVar2.instance;
            pVar3.getClass();
            bjVar.f103658b = pVar3;
            bjVar.f103657a = 1;
            a2.mo41983b(btVar, a3.mo41785a());
            C39670cx a8 = a2.mo41982a();
            this.f335837a = 1;
            if (vVar.mo62729v(a8, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120744s(this.f335838b, this.f335839c, this.f335840d, gVar);
    }
}
