package com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a;

import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38078c;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38080d;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38082f;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38086j;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38090n;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38091o;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38093q;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.p2973b.C38074b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.microphone.state.impl.MicStateReporterImpl$updateState$2", mo61344c = "MicStateReporterImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.t.c.a.l */
/* compiled from: PG */
final class C38069l extends C69572j implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C38070m f100859a;

    /* renamed from: b */
    final /* synthetic */ C38074b f100860b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38069l(C38070m mVar, C38074b bVar, C69577g gVar) {
        super(1, gVar);
        this.f100859a = mVar;
        this.f100860b = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C38069l(this.f100859a, this.f100860b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C38091o oVar;
        C37514du duVar;
        C37561eb ebVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C38070m mVar = this.f100859a;
        C38074b bVar = this.f100860b;
        if (bVar.f100891b == 2) {
            List list = mVar.f100870j;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C69664n.m101066l(((C38074b) it.next()).f100894e, bVar.f100894e)) {
                            C59052c cVar = (C59052c) C38070m.f100861a.mo56224b();
                            cVar.mo56378ag(C58975e.f156826a, "ALT.MicStateReporter");
                            String str = bVar.f100894e;
                            cVar.mo56379ah(new C59094n(52954));
                            cVar.mo56389s("#audio# skip update(id(%s)), already active", str);
                            C38090n nVar = (C38090n) C38091o.f100920b.createBuilder();
                            C69664n.m101060f(nVar, "newBuilder()");
                            oVar = C69664n.m101061g(nVar, "builder").mo41254a();
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            mVar.f100870j = C69540x.m100832N(mVar.f100870j, bVar);
            C38090n nVar2 = (C38090n) C38091o.f100920b.createBuilder();
            C69664n.m101060f(nVar2, "newBuilder()");
            C38093q a = C69664n.m101061g(nVar2, "builder");
            a.mo41256c();
            C38078c cVar2 = (C38078c) C38080d.f100899f.createBuilder();
            C69664n.m101060f(cVar2, "newBuilder()");
            C38082f a2 = C69664n.m101061g(cVar2, "builder");
            C38086j a3 = C38086j.m67233a(bVar.f100893d);
            if (a3 == null) {
                a3 = C38086j.CLIENT_TYPE_UNKNOWN;
            }
            C69664n.m101060f(a3, "partialUpdate.clientType");
            a2.mo41246b(a3);
            if ((bVar.f100890a & 16) != 0) {
                int i = bVar.f100895f;
                C38078c cVar3 = a2.f100906a;
                cVar3.copyOnWrite();
                C38080d dVar = (C38080d) cVar3.instance;
                dVar.f100901a |= 8;
                dVar.f100905e = i;
            }
            if (bVar.f100891b == 2) {
                ebVar = (C37561eb) bVar.f100892c;
            } else {
                ebVar = C37561eb.f99800c;
            }
            C69664n.m101060f(ebVar, "partialUpdate.openStatus");
            a2.mo41248d(ebVar);
            a.mo41255b(a2.mo41245a());
            oVar = a.mo41254a();
        } else {
            List list2 = mVar.f100870j;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (C69664n.m101066l(((C38074b) it2.next()).f100894e, bVar.f100894e)) {
                        List list3 = mVar.f100870j;
                        ArrayList arrayList = new ArrayList();
                        for (Object next : list3) {
                            if (!C69664n.m101066l(((C38074b) next).f100894e, bVar.f100894e)) {
                                arrayList.add(next);
                            }
                        }
                        mVar.f100870j = arrayList;
                        C38090n nVar3 = (C38090n) C38091o.f100920b.createBuilder();
                        C69664n.m101060f(nVar3, "newBuilder()");
                        C38093q a4 = C69664n.m101061g(nVar3, "builder");
                        a4.mo41256c();
                        C38078c cVar4 = (C38078c) C38080d.f100899f.createBuilder();
                        C69664n.m101060f(cVar4, "newBuilder()");
                        C38082f a5 = C69664n.m101061g(cVar4, "builder");
                        C38086j a6 = C38086j.m67233a(bVar.f100893d);
                        if (a6 == null) {
                            a6 = C38086j.CLIENT_TYPE_UNKNOWN;
                        }
                        C69664n.m101060f(a6, "partialUpdate.clientType");
                        a5.mo41246b(a6);
                        if ((bVar.f100890a & 16) != 0) {
                            int i2 = bVar.f100895f;
                            C38078c cVar5 = a5.f100906a;
                            cVar5.copyOnWrite();
                            C38080d dVar2 = (C38080d) cVar5.instance;
                            dVar2.f100901a |= 8;
                            dVar2.f100905e = i2;
                        }
                        if (bVar.f100891b == 3) {
                            duVar = (C37514du) bVar.f100892c;
                        } else {
                            duVar = C37514du.f99629c;
                        }
                        C69664n.m101060f(duVar, "partialUpdate.closeStatus");
                        a5.mo41247c(duVar);
                        a4.mo41255b(a5.mo41245a());
                        oVar = a4.mo41254a();
                    }
                }
            }
            C59052c cVar6 = (C59052c) C38070m.f100861a.mo56224b();
            cVar6.mo56378ag(C58975e.f156826a, "ALT.MicStateReporter");
            String str2 = bVar.f100894e;
            cVar6.mo56379ah(new C59094n(52953));
            cVar6.mo56389s("#audio# skip update(id(%s)), no active found", str2);
            C38090n nVar4 = (C38090n) C38091o.f100920b.createBuilder();
            C69664n.m101060f(nVar4, "newBuilder()");
            oVar = C69664n.m101061g(nVar4, "builder").mo41254a();
        }
        C62971cq cqVar = oVar.f100922a;
        C69664n.m101060f(cqVar, "micStateUpdateDelta.deltasList");
        if (!cqVar.isEmpty()) {
            C38070m mVar2 = this.f100859a;
            mVar2.mo41236g(mVar2.mo41233d(), oVar);
        }
        return C69788q.f186170a;
    }
}
