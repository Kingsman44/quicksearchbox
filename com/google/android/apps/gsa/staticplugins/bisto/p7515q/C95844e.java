package com.google.android.apps.gsa.staticplugins.bisto.p7515q;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95351bb;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95354be;
import com.google.android.p10712d.C142455fz;
import com.google.android.p10712d.C142461ge;
import com.google.android.p10712d.C142462gf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.q.e */
/* compiled from: PG */
public final /* synthetic */ class C95844e implements C95354be {
    /* renamed from: a */
    public final C58833ax mo89287a(byte[] bArr) {
        try {
            C142462gf gfVar = (C142462gf) C62942bv.parseFrom((C62942bv) C142462gf.f386596c, bArr, C62921ba.m95368a());
            C142455fz a = C142455fz.m231083a(gfVar.f386598a);
            if (a == null) {
                a = C142455fz.OTA_UNKNOWN;
            }
            if (!a.equals(C142455fz.OTA_ACTIVATE_FEATURE)) {
                return C58836b.f156633a;
            }
            C142461ge a2 = C142461ge.m231085a(gfVar.f386599b);
            if (a2 == null) {
                a2 = C142461ge.OTA_STATUS_UNKNOWN;
            }
            if (a2.equals(C142461ge.OTA_SUCCESS)) {
                C58976aa aaVar = C58975e.f156826a;
                return C58833ax.m90834k(C118826c.f331422a);
            }
            throw new C95351bb("hotword model activation failed");
        } catch (C62974ct unused) {
            return C58836b.f156633a;
        }
    }
}
