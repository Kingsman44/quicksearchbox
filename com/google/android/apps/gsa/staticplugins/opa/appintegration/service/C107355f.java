package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.settings.shared.i.a;
import com.google.android.apps.gsa.assistant.shared.be;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.search.assistant.platform.appintegration.p8991c.C119521a;
import com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119533b;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17842e;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17846i;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17849l;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17882al;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.f */
/* compiled from: PG */
final class C107355f extends C17842e {

    /* renamed from: a */
    final /* synthetic */ C107359j f298769a;

    public C107355f(C107359j jVar) {
        this.f298769a = jVar;
    }

    /* renamed from: a */
    public final C17846i mo23479a(String str, C17849l lVar) {
        C107357h hVar;
        C107359j jVar;
        C17849l lVar2;
        C58976aa aaVar = C58975e.f156826a;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C107359j jVar2 = this.f298769a;
        int callingUid = Binder.getCallingUid();
        int callingPid = Binder.getCallingPid();
        if (!C119521a.m198385a(jVar2.f298792o.mo85403h(C90014bt.f247848x), str, Integer.MAX_VALUE)) {
            C59104x b = C107359j.f298778a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
            ((C59052c) ((C59052c) b).mo56372aa(23744)).mo56386p("Caller is not allowed to use bound service");
        } else if (!jVar2.f298795r.mo119085d(callingUid)) {
            C59104x d = C107359j.f298778a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
            ((C59052c) ((C59052c) d).mo56372aa(23743)).mo56359L("Caller signature verification failed: uid=%d, pid=%d, packageName=%s", Integer.valueOf(callingUid), Integer.valueOf(callingPid), str);
        } else if (this.f298769a.f298792o.mo85405j(C90014bt.f247039D)) {
            C107374y yVar = this.f298769a.f298793p;
            C107375z zVar = yVar.f298847e;
            str.getClass();
            lVar.getClass();
            C107367r rVar = (C107367r) zVar.f298850a.mo17428b();
            rVar.getClass();
            C107374y yVar2 = (C107374y) zVar.f298851b.mo17428b();
            yVar2.getClass();
            C119533b bVar = (C119533b) zVar.f298852c.mo17428b();
            bVar.getClass();
            C107372w wVar = new C107372w(str, lVar, rVar, yVar2, bVar);
            IBinder asBinder = lVar.asBinder();
            try {
                asBinder.linkToDeath(new C107373x(yVar, wVar, asBinder), 0);
                synchronized (yVar.f298846d) {
                    yVar.f298846d.add(wVar);
                    yVar.mo95994b();
                }
                if (yVar.f298845c.mo56113h()) {
                    try {
                        lVar.mo23472a((byte[]) yVar.f298845c.mo56107c());
                    } catch (RemoteException e) {
                        ((C59052c) ((C59052c) ((C59052c) C107374y.f298843a.mo56225c()).mo56382g(e)).mo56372aa(23775)).mo56386p("#createSession(): failed to send last voice plate state changed event.");
                    }
                }
                return wVar.f298834f;
            } catch (RemoteException e2) {
                ((C59052c) ((C59052c) ((C59052c) C107374y.f298843a.mo56226d()).mo56382g(e2)).mo56372aa(23776)).mo56386p("New client is already dead.");
                return null;
            }
        } else {
            this.f298769a.mo95977f();
            IBinder asBinder2 = lVar.asBinder();
            C107359j jVar3 = this.f298769a;
            jVar3.f298788k = C58833ax.m90834k(new C107353d(jVar3, asBinder2, 1));
            try {
                asBinder2.linkToDeath((IBinder.DeathRecipient) this.f298769a.f298788k.mo56107c(), 0);
                synchronized (this.f298769a.f298785h) {
                    C107359j jVar4 = this.f298769a;
                    jVar4.f298781d = new C107357h(jVar4, str);
                    C107359j jVar5 = this.f298769a;
                    jVar5.f298783f = lVar;
                    if (jVar5.f298787j.mo56113h() && (lVar2 = jVar.f298783f) != null) {
                        try {
                            lVar2.mo23472a((byte[]) (jVar = this.f298769a).f298787j.mo56107c());
                        } catch (RemoteException e3) {
                            C59104x d2 = C107359j.f298778a.mo56226d();
                            d2.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
                            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e3)).mo56372aa(23712)).mo56386p("Sending last voice plate state failed");
                        }
                    }
                    C107359j jVar6 = this.f298769a;
                    if (a.b(jVar6.f298797t.getApplicationContext()) && be.b.contains(str)) {
                        jVar6.f298791n = new C107364o(jVar6.f298797t.getApplicationContext(), jVar6.f298779b);
                        jVar6.f298798u = new C107354e(jVar6);
                        C107364o oVar = jVar6.f298791n;
                        oVar.f298809e.post(new C107361l(oVar, jVar6.f298798u));
                    }
                    C107359j jVar7 = this.f298769a;
                    C17882al alVar = (C17882al) C17883am.f51242f.createBuilder();
                    alVar.copyOnWrite();
                    C17883am amVar = (C17883am) alVar.instance;
                    amVar.f51245b = 4;
                    amVar.f51246c = true;
                    alVar.copyOnWrite();
                    C17883am amVar2 = (C17883am) alVar.instance;
                    str.getClass();
                    amVar2.f51244a |= 1;
                    amVar2.f51247d = str;
                    jVar7.mo95978g((C17883am) alVar.build());
                    hVar = this.f298769a.f298781d;
                }
                return hVar;
            } catch (RemoteException e4) {
                C59104x d3 = C107359j.f298778a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
                ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e4)).mo56372aa(23713)).mo56386p("New client is already dead.");
                this.f298769a.f298788k = C58836b.f156633a;
                return null;
            }
        }
        C59104x d4 = C107359j.f298778a.mo56226d();
        d4.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
        ((C59052c) ((C59052c) d4).mo56372aa(23714)).mo56395y("Can't verify caller: uid=%d, packageName=%s", Binder.getCallingUid(), str);
        return null;
    }
}
