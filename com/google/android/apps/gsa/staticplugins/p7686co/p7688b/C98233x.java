package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.android.apps.gsa.store.C118314e;
import com.google.android.apps.gsa.store.C118332u;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7752iq;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.x */
/* compiled from: PG */
public final /* synthetic */ class C98233x implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C98233x f274269a = new C98233x();

    private /* synthetic */ C98233x() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C118314e eVar = (C118314e) obj;
        C59071e eVar2 = C98211bl.f274214e;
        try {
            ArrayList arrayList = new ArrayList(eVar.mo91753a());
            while (eVar.hasNext()) {
                C118332u uVar = (C118332u) eVar.next();
                if (uVar.mo103670a()) {
                    byte[] b = uVar.mo103671b();
                    arrayList.add((C7752iq) C62942bv.parseFrom((C62942bv) C7752iq.f27124E, b, C62921ba.m95368a()));
                }
            }
            if (eVar != null) {
                eVar.mo91755c().mo91751b();
            }
            return arrayList;
        } catch (C62974ct e) {
            C59104x c = C98211bl.f274214e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EuaStore");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30580)).mo56386p("Could not deserialize ExecutedUserAction");
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C62974ct) {
                C59104x c2 = C98211bl.f274214e.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "EuaStore");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(30581)).mo56386p("Could not deserialize ExecutedUserAction");
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
}
