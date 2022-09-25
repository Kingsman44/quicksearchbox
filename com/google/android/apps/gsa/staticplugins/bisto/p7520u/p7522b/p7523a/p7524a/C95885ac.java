package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95352bc;
import com.google.android.apps.gsa.staticplugins.bisto.p7515q.C95848i;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.p10712d.C142413ek;
import com.google.android.p10712d.C142415em;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ac */
/* compiled from: PG */
public final class C95885ac extends C95910e implements C95352bc {

    /* renamed from: c */
    private static final C59071e f268464c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ac");

    /* renamed from: d */
    private final C95346ax f268465d;

    /* renamed from: e */
    private final C96023bs f268466e;

    /* renamed from: f */
    private final C89492cd f268467f;

    public C95885ac(C95346ax axVar, C96023bs bsVar, C89492cd cdVar, C95848i iVar, C95850a aVar) {
        super(axVar, bsVar, "OffHeadStateInteracting", cdVar, iVar, aVar);
        this.f268465d = axVar;
        this.f268466e = bsVar;
        this.f268467f = cdVar;
    }

    /* renamed from: E */
    public final boolean mo89254E(String str, int i, int i2, byte[] bArr) {
        if (!str.equals(this.f268465d.mo89270k())) {
            return false;
        }
        if (i == 0) {
            throw null;
        } else if (i != 5 || i2 != 5) {
            return false;
        } else {
            try {
                C142415em emVar = (C142415em) C62942bv.parseFrom((C62942bv) C142415em.f386437c, bArr, C62921ba.m95368a());
                if ((emVar.f386439a & 1) != 0) {
                    C142413ek a = C142413ek.m231079a(emVar.f386440b);
                    if (a == null) {
                        a = C142413ek.UNKNOWN;
                    }
                    C59104x b = f268464c.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "OffHeadStateInteracting");
                    ((C59052c) ((C59052c) b).mo56372aa(15872)).mo56387q("Received OHD status: %d", a.f386436j);
                    this.f268467f.mo83393ai(str, a);
                    if (!a.equals(C142413ek.OHD_NONE_DETECTED)) {
                        super.mo89847j("DispatchingState", (Intent) null);
                    }
                    return true;
                }
                C59104x d = f268464c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "OffHeadStateInteracting");
                ((C59052c) ((C59052c) d).mo56372aa(15874)).mo56386p("Incomplete OHD info");
                return false;
            } catch (IOException e) {
                C59104x c = f268464c.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OffHeadStateInteracting");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15873)).mo56386p("Error parsing received proto");
                return false;
            }
        }
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268465d.mo89273n(this);
        this.f268466e.mo89837g();
    }

    /* renamed from: i */
    public final void mo89846i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = false;
        this.f268465d.mo89275p(this);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo89847j(String str, Intent intent) {
        super.mo89847j(str, (Intent) null);
    }
}
