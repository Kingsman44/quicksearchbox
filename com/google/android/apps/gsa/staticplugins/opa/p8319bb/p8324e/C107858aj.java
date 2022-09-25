package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e;

import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85491h;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85492i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87694ac;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.util.C113880k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3994s.p3995a.C53268hp;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.aj */
/* compiled from: PG */
public final class C107858aj implements C107874az {

    /* renamed from: a */
    public static final C59071e f300137a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.e.aj");

    /* renamed from: b */
    public final C68214a f300138b;

    /* renamed from: c */
    private final C85492i f300139c;

    /* renamed from: d */
    private final C86124t f300140d;

    /* renamed from: e */
    private final C22871g f300141e;

    /* renamed from: f */
    private final C113880k f300142f;

    public C107858aj(C85492i iVar, C86124t tVar, C22871g gVar, C113880k kVar, C68214a aVar) {
        this.f300139c = iVar;
        this.f300140d = tVar;
        this.f300141e = gVar;
        this.f300142f = kVar;
        this.f300138b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final boolean mo96322b(ClientEventData clientEventData) {
        Object obj;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 139) {
            C58976aa aaVar = C58975e.f156826a;
            C62940bt btVar = C87694ac.f237131a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r0);
            Object l = bwVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            C87696ae aeVar = (C87696ae) obj;
            if ((aeVar.f237134a & 2) != 0) {
                C87695ad adVar = (C87695ad) aeVar.toBuilder();
                C53271hs hsVar = aeVar.f237136c;
                if (hsVar == null) {
                    hsVar = C53271hs.f139650u;
                }
                C53268hp hpVar = (C53268hp) hsVar.toBuilder();
                boolean g = this.f300142f.mo100741g();
                hpVar.copyOnWrite();
                C53271hs hsVar2 = (C53271hs) hpVar.instance;
                hsVar2.f139652a |= 1048576;
                hsVar2.f139671t = !g;
                C53271hs hsVar3 = (C53271hs) hpVar.build();
                adVar.copyOnWrite();
                C87696ae aeVar2 = (C87696ae) adVar.instance;
                hsVar3.getClass();
                aeVar2.f237136c = hsVar3;
                aeVar2.f237134a |= 2;
                aeVar = (C87696ae) adVar.build();
            }
            this.f300139c.mo79001f(aeVar, (C85491h) this.f300138b.mo27525b());
        } else if (ordinal == 184) {
            C58976aa aaVar2 = C58975e.f156826a;
            new C90873ag(this.f300139c.mo78997a(TimeUnit.SECONDS.toMillis(this.f300140d.mo79743a(C90014bt.f247810oF))), this.f300141e, "handle GenericClientEvent REQUEST_ZERO_STATE_RESPONSE", new C107853ae(this)).mo85223a(C107854af.f300129a);
        }
        return true;
    }
}
