package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.gsa.store.C118314e;
import com.google.android.apps.gsa.store.C118332u;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7752iq;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.ai */
/* compiled from: PG */
public final /* synthetic */ class C98181ai implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C7718hj f274157a;

    public /* synthetic */ C98181ai(C7718hj hjVar) {
        this.f274157a = hjVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C7718hj hjVar;
        C7718hj hjVar2 = this.f274157a;
        C118314e eVar = (C118314e) obj;
        C59071e eVar2 = C98211bl.f274214e;
        while (eVar.hasNext()) {
            try {
                C118332u uVar = (C118332u) eVar.next();
                if (uVar.mo103670a()) {
                    C7752iq iqVar = (C7752iq) C62942bv.parseFrom((C62942bv) C7752iq.f27124E, uVar.mo103671b(), C62921ba.m95368a());
                    if (iqVar.f27134d == 2) {
                        hjVar = (C7718hj) iqVar.f27135e;
                    } else {
                        hjVar = C7718hj.f26927af;
                    }
                    if (C91978bb.m150941g(hjVar, hjVar2)) {
                        C58833ax k = C58833ax.m90834k(uVar.f328461b);
                        if (eVar == null) {
                            return k;
                        }
                        eVar.mo91755c().mo91751b();
                        return k;
                    }
                }
            } catch (C62974ct e) {
                C59104x c = C98211bl.f274214e.mo56225c();
                c.mo56378ag(C58975e.f156826a, "EuaStore");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30578)).mo56386p("Failed reading ExecutedUserAction");
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof C62974ct) {
                    C59104x c2 = C98211bl.f274214e.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "EuaStore");
                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(30579)).mo56386p("Failed reading ExecutedUserAction");
                } else {
                    throw e2;
                }
            } catch (Throwable th) {
                if (eVar != null) {
                    eVar.mo91755c().mo91751b();
                }
                throw th;
            }
        }
        if (eVar != null) {
            eVar.mo91755c().mo91751b();
        }
        return C58836b.f156633a;
    }
}
