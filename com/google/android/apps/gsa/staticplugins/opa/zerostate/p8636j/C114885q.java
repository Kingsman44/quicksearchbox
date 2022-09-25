package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.assistant.p3994s.p3995a.C53171e;
import com.google.assistant.p3994s.p3995a.C53198f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58879cp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p422e.p423a.p424a.p425a.p426a.C8603c;
import com.google.p395al.p422e.p423a.p424a.p425a.p426a.C8604d;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4387a.p4388a.p4389a.C57683a;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4387a.p4388a.p4389a.C57684b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.q */
/* compiled from: PG */
public final class C114885q {

    /* renamed from: a */
    private static final C59071e f318753a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.j.q");

    /* renamed from: b */
    private final C21232ab f318754b;

    public C114885q(C21232ab abVar) {
        this.f318754b = abVar;
    }

    /* renamed from: b */
    public static boolean m190445b(C53198f fVar) {
        int a = C53171e.m86782a(fVar.f139426b);
        return (a == 0 || a == 1 || C58879cp.m90962d(fVar.f139427c)) ? false : true;
    }

    /* renamed from: d */
    private final C58833ax m190446d(String str) {
        C58833ax axVar = (C58833ax) this.f318754b.mo26139b(str).mo61655o();
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        try {
            C62921ba a = C62921ba.m95368a();
            return C58833ax.m90834k((C8604d) C62942bv.parseFrom((C62942bv) C8604d.f29830d, (byte[]) axVar.mo56107c(), a));
        } catch (C62974ct e) {
            C59104x b = f318753a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ZSCardOperationUtils");
            ((C59052c) ((C59052c) ((C59052c) b).mo56382g(e)).mo56372aa(29521)).mo56386p("#getStateInfo(): Failed to parse StateInfo protobuf.");
            return C58836b.f156633a;
        }
    }

    /* renamed from: e */
    private static String m190447e(C53198f fVar, String str) {
        String str2 = fVar.f139427c;
        return (!C58837ba.m90859h(str2) || str == null) ? str2 : str.concat("/state_info");
    }

    /* renamed from: a */
    public final void mo101685a(String str, byte[] bArr) {
        if (!C58837ba.m90859h(str)) {
            this.f318754b.mo26140c(str, bArr);
        }
    }

    /* renamed from: c */
    public final void mo101686c(C53198f fVar, String str) {
        C58833ax axVar;
        int a = C53171e.m86782a(fVar.f139426b);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            String e = m190447e(fVar, str);
            C58833ax d = m190446d(e);
            if (!d.mo56113h()) {
                C58833ax axVar2 = (C58833ax) this.f318754b.mo26139b(e).mo61655o();
                if (!axVar2.mo56113h()) {
                    axVar = C58836b.f156633a;
                } else {
                    try {
                        axVar = C58833ax.m90834k((C57684b) C62942bv.parseFrom((C62942bv) C57684b.f154072c, (byte[]) axVar2.mo56107c(), C62921ba.m95368a()));
                    } catch (C62974ct e2) {
                        C59104x d2 = f318753a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "ZSCardOperationUtils");
                        ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(29520)).mo56386p("#getStateInfo(): Failed to parse StateInfo protobuf.");
                        axVar = C58836b.f156633a;
                    }
                }
                if (!axVar.mo56113h()) {
                    C59104x d3 = f318753a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "ZSCardOperationUtils");
                    ((C59052c) ((C59052c) d3).mo56372aa(29523)).mo56389s("Couldn't find StateInfo entity for key: %s", e);
                    return;
                }
                C57683a aVar = (C57683a) ((C57684b) axVar.mo56107c()).toBuilder();
                aVar.copyOnWrite();
                C57684b bVar = (C57684b) aVar.instance;
                bVar.f154074a |= 2;
                bVar.f154075b = true;
                mo101685a(e, ((C57684b) aVar.build()).toByteArray());
                return;
            }
            C8603c cVar = (C8603c) ((C8604d) d.mo56107c()).toBuilder();
            cVar.copyOnWrite();
            C8604d dVar = (C8604d) cVar.instance;
            dVar.f29832a |= 1;
            dVar.f29833b = true;
            mo101685a(e, ((C8604d) cVar.build()).toByteArray());
        } else if (i == 2 || i == 3) {
            String e3 = m190447e(fVar, str);
            C58833ax d4 = m190446d(e3);
            if (!d4.mo56113h()) {
                C59104x d5 = f318753a.mo56226d();
                d5.mo56378ag(C58975e.f156826a, "ZSCardOperationUtils");
                ((C59052c) ((C59052c) d5).mo56372aa(29524)).mo56389s("Couldn't find StateInfo entity for key: %s", e3);
                return;
            }
            C8603c cVar2 = (C8603c) ((C8604d) d4.mo56107c()).toBuilder();
            int a2 = C53171e.m86782a(fVar.f139426b);
            if (a2 == 0 || a2 != 3) {
                z = false;
            }
            cVar2.copyOnWrite();
            C8604d dVar2 = (C8604d) cVar2.instance;
            dVar2.f29832a |= 8;
            dVar2.f29834c = z;
            mo101685a(e3, ((C8604d) cVar2.build()).toByteArray());
        } else {
            C59104x d6 = f318753a.mo56226d();
            d6.mo56378ag(C58975e.f156826a, "ZSCardOperationUtils");
            ((C59052c) ((C59052c) d6).mo56372aa(29522)).mo56386p("#handleCardOperation(): unknown operation type.");
        }
    }
}
