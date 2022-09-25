package com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a;

import com.google.android.libraries.search.p2904c.C37508do;
import com.google.android.libraries.search.p2904c.C37510dq;
import com.google.android.libraries.search.p2904c.C37513dt;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.C37560ea;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38078c;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38080d;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38082f;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38086j;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38090n;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38091o;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38093q;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.microphone.state.impl.MicStateReporterImpl$LocalPhoneStateListener$onCallStateChanged$1", mo61344c = "MicStateReporterImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.t.c.a.c */
/* compiled from: PG */
final class C38060c extends C69572j implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C38070m f100842a;

    /* renamed from: b */
    final /* synthetic */ int f100843b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38060c(C38070m mVar, int i, C69577g gVar) {
        super(1, gVar);
        this.f100842a = mVar;
        this.f100843b = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C38060c(this.f100842a, this.f100843b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C38091o oVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C38070m mVar = this.f100842a;
        int i = this.f100843b;
        if (i != 0) {
            if (i != 2) {
                C59052c cVar = (C59052c) C38070m.f100861a.mo56224b();
                cVar.mo56378ag(C58975e.f156826a, "ALT.MicStateReporter");
                cVar.mo56379ah(new C59094n(52950));
                cVar.mo56387q("#audio# ignore telephony state(%d) update, neither idle/hook", i);
                C38090n nVar = (C38090n) C38091o.f100920b.createBuilder();
                C69664n.m101060f(nVar, "newBuilder()");
                oVar = C69664n.m101061g(nVar, "builder").mo41254a();
            } else if (mVar.f100869i) {
                C59052c cVar2 = (C59052c) C38070m.f100861a.mo56224b();
                cVar2.mo56378ag(C58975e.f156826a, "ALT.MicStateReporter");
                cVar2.mo56379ah(new C59094n(52952));
                cVar2.mo56386p("#audio# already in telephony call, skip update");
                C38090n nVar2 = (C38090n) C38091o.f100920b.createBuilder();
                C69664n.m101060f(nVar2, "newBuilder()");
                oVar = C69664n.m101061g(nVar2, "builder").mo41254a();
            } else {
                mVar.f100869i = true;
                C38090n nVar3 = (C38090n) C38091o.f100920b.createBuilder();
                C69664n.m101060f(nVar3, "newBuilder()");
                C38093q a = C69664n.m101061g(nVar3, "builder");
                a.mo41256c();
                C38078c cVar3 = (C38078c) C38080d.f100899f.createBuilder();
                C69664n.m101060f(cVar3, "newBuilder()");
                C38082f a2 = C69664n.m101061g(cVar3, "builder");
                a2.mo41246b(C38086j.CLIENT_TYPE_TELEPHONY_CALL);
                C37560ea eaVar = (C37560ea) C37561eb.f99800c.createBuilder();
                C69664n.m101060f(eaVar, "newBuilder()");
                C37510dq a3 = C69664n.m101061g(eaVar, "builder");
                a3.mo40998c(C37563ed.OPENED);
                a2.mo41248d(a3.mo40996a());
                a.mo41255b(a2.mo41245a());
                oVar = a.mo41254a();
            }
        } else if (!mVar.f100869i) {
            C59052c cVar4 = (C59052c) C38070m.f100861a.mo56224b();
            cVar4.mo56378ag(C58975e.f156826a, "ALT.MicStateReporter");
            cVar4.mo56379ah(new C59094n(52951));
            cVar4.mo56386p("#audio# telephony call is already idle, skip update");
            C38090n nVar4 = (C38090n) C38091o.f100920b.createBuilder();
            C69664n.m101060f(nVar4, "newBuilder()");
            oVar = C69664n.m101061g(nVar4, "builder").mo41254a();
        } else {
            mVar.f100869i = false;
            C38090n nVar5 = (C38090n) C38091o.f100920b.createBuilder();
            C69664n.m101060f(nVar5, "newBuilder()");
            C38093q a4 = C69664n.m101061g(nVar5, "builder");
            a4.mo41256c();
            C38078c cVar5 = (C38078c) C38080d.f100899f.createBuilder();
            C69664n.m101060f(cVar5, "newBuilder()");
            C38082f a5 = C69664n.m101061g(cVar5, "builder");
            a5.mo41246b(C38086j.CLIENT_TYPE_TELEPHONY_CALL);
            C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
            C69664n.m101060f(dtVar, "newBuilder()");
            C37508do a6 = C69664n.m101061g(dtVar, "builder");
            a6.mo40995c(C37516dw.CLOSED);
            a5.mo41247c(a6.mo40993a());
            a4.mo41255b(a5.mo41245a());
            oVar = a4.mo41254a();
        }
        C62971cq cqVar = oVar.f100922a;
        C69664n.m101060f(cqVar, "micStateUpdateDelta.deltasList");
        if (!cqVar.isEmpty()) {
            C38070m mVar2 = this.f100842a;
            mVar2.mo41236g(mVar2.mo41233d(), oVar);
        }
        return C69788q.f186170a;
    }
}
