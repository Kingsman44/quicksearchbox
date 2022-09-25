package com.google.android.libraries.geller.p1818f;

import com.google.android.libraries.geller.p1818f.p1819a.C21789d;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4280bt.C56488d;
import com.google.protos.p5129p.p5131b.C65743aa;
import com.google.protos.p5129p.p5131b.C65744ab;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65821cy;
import com.google.protos.p5129p.p5131b.C65855x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

/* renamed from: com.google.android.libraries.geller.f.ag */
/* compiled from: PG */
public final /* synthetic */ class C21797ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C21826bi f60127a;

    /* renamed from: b */
    public final /* synthetic */ C65855x f60128b;

    public /* synthetic */ C21797ag(C21826bi biVar, C65855x xVar) {
        this.f60127a = biVar;
        this.f60128b = xVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C56488d dVar;
        C56488d dVar2;
        C56488d dVar3;
        C56488d dVar4;
        C56488d dVar5;
        C21826bi biVar = this.f60127a;
        C21875y yVar = new C21875y(C21789d.m40905b(biVar.f60218b), biVar.f60219c, biVar.f60220d, new C21785a(this.f60128b, (C65744ab) obj), biVar.f60225i, biVar.f60223g);
        HashMap hashMap = new HashMap();
        for (C65743aa aaVar : yVar.f60359c.mo27116b().f178607a) {
            C65753ak b = C65753ak.m96797b(aaVar.f178601c);
            if (b == null) {
                b = C65753ak.UNKNOWN;
            }
            C65821cy cyVar = aaVar.f178602d;
            if (cyVar == null) {
                cyVar = C65821cy.f178937c;
            }
            if ((cyVar.f178939a & 1) != 0) {
                if (cyVar.f178940b) {
                    hashMap.put(b, Status.f186902OK);
                } else {
                    ((C59052c) ((C59052c) C21875y.f60357a.mo56226d()).mo56372aa(47978)).mo56389s("Upload failed for corpus:%s", b.name());
                    yVar.mo27167a(b).mo27148b().mo55395g(new C21827bj("Failed to upload data"));
                    hashMap.put(b, aaVar.f178599a == 1 ? Status.fromCodeValue(((C56488d) aaVar.f178600b).f150878a) : Status.f186905c);
                }
            }
            if (aaVar.f178599a == 1) {
                C59052c cVar = (C59052c) ((C59052c) C21875y.f60357a.mo56226d()).mo56372aa(47977);
                String name = b.name();
                if (aaVar.f178599a == 1) {
                    dVar = (C56488d) aaVar.f178600b;
                } else {
                    dVar = C56488d.f150876d;
                }
                String str = dVar.f150879b;
                if (aaVar.f178599a == 1) {
                    dVar2 = (C56488d) aaVar.f178600b;
                } else {
                    dVar2 = C56488d.f150876d;
                }
                cVar.mo56359L("There was an error when syncing corpus: %s. Error message: %s. Error code: %d.", name, str, Integer.valueOf(dVar2.f150878a));
                C21849ce a = yVar.mo27167a(b);
                int i = aaVar.f178599a;
                if (i == 1) {
                    dVar3 = (C56488d) aaVar.f178600b;
                } else {
                    dVar3 = C56488d.f150876d;
                }
                String str2 = dVar3.f150879b;
                if (i == 1) {
                    dVar4 = (C56488d) aaVar.f178600b;
                } else {
                    dVar4 = C56488d.f150876d;
                }
                a.mo27148b().mo55395g(new C21827bj(str2, new StatusException(Status.fromCodeValue(dVar4.f150878a), (C70334de) null)));
                if (aaVar.f178599a == 1) {
                    dVar5 = (C56488d) aaVar.f178600b;
                } else {
                    dVar5 = C56488d.f150876d;
                }
                hashMap.put(b, Status.fromCodeValue(dVar5.f150878a));
            }
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (C65743aa aaVar2 : yVar.f60359c.mo27116b().f178607a) {
            C65753ak b2 = C65753ak.m96797b(aaVar2.f178601c);
            if (b2 == null) {
                b2 = C65753ak.UNKNOWN;
            }
            if (!GellerDatabase.f60556c.contains(b2.name())) {
                if (!((C58759qy) C21875y.f60358b).f156534a.equals(b2)) {
                    cxVar = C60866ct.f164955a;
                } else {
                    cxVar = C60922j.m93044g(C60838bs.m92859i(yVar.f60361e.mo27180g(yVar.f60363g, b2, C58485gu.m89845m(), false)), C47810es.m84963c(new C21872v()), yVar.f60364h);
                }
                arrayList.add(C60846c.m92878g(C60922j.m93044g(C60922j.m93045h(C60838bs.m92859i(cxVar), C47810es.m84966f(new C21860j(yVar, b2, aaVar2)), yVar.f60365i), C47810es.m84963c(new C21861k(yVar, b2, hashSet)), yVar.f60365i), Exception.class, C47810es.m84963c(new C21862l(yVar, b2)), yVar.f60365i));
            }
        }
        return C60922j.m93044g(C60922j.m93045h(C60838bs.m92859i(C60856cj.m92892a(arrayList).mo57334a(C47810es.m84978r(new C21863m(yVar, hashSet)), yVar.f60365i)), C47810es.m84966f(new C21873w(yVar, hashMap)), yVar.f60365i), new C21874x(yVar), yVar.f60365i);
    }
}
