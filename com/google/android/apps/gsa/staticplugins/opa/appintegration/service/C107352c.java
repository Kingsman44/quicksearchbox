package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.assistant.p1467d.p1471b.C17834t;
import com.google.android.libraries.assistant.p1467d.p1471b.C17835u;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17839b;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17849l;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17882al;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17900bc;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17908j;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17909k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.c */
/* compiled from: PG */
final class C107352c extends C17839b {

    /* renamed from: a */
    final /* synthetic */ C107359j f298764a;

    public C107352c(C107359j jVar) {
        this.f298764a = jVar;
    }

    /* renamed from: a */
    public final void mo23477a(byte[] bArr) {
        Object obj;
        int a;
        if (Binder.getCallingUid() == Process.myUid()) {
            try {
                C17909k kVar = (C17909k) C62942bv.parseFrom((C62942bv) C17909k.f51314c, bArr, C62921ba.m95368a());
                C58976aa aaVar = C58975e.f156826a;
                C17908j a2 = C17908j.m35107a(kVar.f51317b);
                if (a2 == null) {
                    a2 = C17908j.UNKNOWN;
                }
                a2.name();
                C17908j a3 = C17908j.m35107a(kVar.f51317b);
                if (a3 == null) {
                    a3 = C17908j.UNKNOWN;
                }
                int ordinal = a3.ordinal();
                if (ordinal == 3) {
                    C62940bt r1 = C62942bv.checkIsLite(C17900bc.f51289a);
                    kVar.mo58887l(r1);
                    if (kVar.f169962ag.mo58857o(r1.f169971d)) {
                        C62940bt r12 = C62942bv.checkIsLite(C17900bc.f51289a);
                        kVar.mo58887l(r12);
                        Object l = kVar.f169962ag.mo58854l(r12.f169971d);
                        if (l == null) {
                            obj = r12.f169969b;
                        } else {
                            obj = r12.mo58889c(l);
                        }
                        int i = ((C17835u) obj).f51171b;
                        int a4 = C17834t.m35075a(i);
                        if (a4 == 0 || a4 == 1 || ((a = C17834t.m35075a(i)) != 0 && a == 4)) {
                            this.f298764a.f298787j = C58836b.f156633a;
                        } else {
                            this.f298764a.f298787j = C58833ax.m90834k(bArr);
                        }
                        this.f298764a.mo95973b();
                    }
                } else if (ordinal == 10) {
                    this.f298764a.mo95976e();
                    C107359j jVar = this.f298764a;
                    jVar.f298787j = C58836b.f156633a;
                    jVar.mo95973b();
                    return;
                }
                if (this.f298764a.f298792o.mo85405j(C90014bt.f247039D)) {
                    C107374y yVar = this.f298764a.f298793p;
                    if (yVar.f298844b.mo56113h()) {
                        ((C107372w) yVar.f298844b.mo56107c()).mo95991b(bArr);
                        return;
                    }
                    return;
                }
                C17849l lVar = this.f298764a.f298783f;
                if (lVar != null) {
                    lVar.mo23472a(bArr);
                }
            } catch (C62974ct unused) {
                C59104x d = C107359j.f298778a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
                ((C59052c) ((C59052c) d).mo56372aa(23705)).mo56386p("#forwardCallbackEvent(): failed to parse bytes to AppIntegrationCallbackEvent.");
            }
        } else {
            C59104x c = C107359j.f298778a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
            ((C59052c) ((C59052c) c).mo56372aa(23741)).mo56386p("Must be called from AGSA only");
            throw new RemoteException();
        }
    }

    /* renamed from: b */
    public final void mo23478b(IBinder iBinder) {
        C58976aa aaVar = C58975e.f156826a;
        this.f298764a.mo95976e();
        C107359j jVar = this.f298764a;
        jVar.f298789l = C58833ax.m90834k(new C107353d(jVar, iBinder, 2));
        try {
            iBinder.linkToDeath((IBinder.DeathRecipient) this.f298764a.f298789l.mo56107c(), 0);
            C107359j jVar2 = this.f298764a;
            if (!jVar2.f298786i.isEmpty()) {
                C17882al alVar = (C17882al) C17883am.f51242f.createBuilder();
                List list = jVar2.f298786i;
                alVar.copyOnWrite();
                C17883am amVar = (C17883am) alVar.instance;
                C62971cq cqVar = amVar.f51248e;
                if (!cqVar.mo58948c()) {
                    amVar.f51248e = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) list, (List) amVar.f51248e);
                jVar2.mo95978g((C17883am) alVar.build());
                jVar2.f298786i.clear();
            }
        } catch (RemoteException e) {
            C59104x d = C107359j.f298778a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(23707)).mo56386p("#registerDeathRecipient(): search process is already dead.");
            C107359j jVar3 = this.f298764a;
            jVar3.f298789l = C58836b.f156633a;
            jVar3.mo95974c();
        }
    }
}
