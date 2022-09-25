package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import com.google.android.apps.gsa.p8839t.p8842c.C118348a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85492i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3994s.p3995a.C53119cb;
import com.google.assistant.p3994s.p3995a.C53121cd;
import com.google.assistant.p3994s.p3995a.C53122ce;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59326i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57017i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.y */
/* compiled from: PG */
public final /* synthetic */ class C110932y implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110512ac f309032a;

    /* renamed from: b */
    public final /* synthetic */ C53121cd f309033b;

    /* renamed from: c */
    public final /* synthetic */ boolean f309034c;

    /* renamed from: d */
    public final /* synthetic */ C57017i f309035d;

    public /* synthetic */ C110932y(C110512ac acVar, C53121cd cdVar, boolean z, C57017i iVar) {
        this.f309032a = acVar;
        this.f309033b = cdVar;
        this.f309034c = z;
        this.f309035d = iVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110512ac acVar = this.f309032a;
        C53121cd cdVar = this.f309033b;
        boolean z = this.f309034c;
        C57017i iVar = this.f309035d;
        Optional optional = (Optional) obj;
        if (optional.isPresent() && !((Boolean) optional.get()).booleanValue()) {
            C59104x d = C110512ac.f308097a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
            ((C59052c) ((C59052c) d).mo56372aa(26468)).mo56386p("personal data is disabled, not starting request");
            if (cdVar.equals(C53121cd.FLIGHT_STATUS)) {
                acVar.f308106i.mo109871G("PERSONAL_RESULT_DISABLED");
            }
            return C118826c.f331423b;
        } else if (!cdVar.equals(C53121cd.FLIGHT_STATUS) || (acVar.f308105h.f256848d.mo86756l() && (!acVar.f308101d.mo77180s() || acVar.f308102e.mo77068c()))) {
            C58833ax axVar = acVar.f308100c;
            if (!acVar.f308107j.mo78071P() || !axVar.mo56113h() || !cdVar.equals(C53121cd.WEATHER)) {
                String x = ((C86124t) acVar.f308103f.mo27525b()).mo79758x(C90014bt.f247365fl);
                if (!x.isEmpty()) {
                    try {
                        return acVar.mo98748a(C60856cj.m92900i(C58833ax.m90834k((C53422nh) C62942bv.parseFrom((C62942bv) C53422nh.f140182m, C59326i.f157517e.mo56826f().mo56836k(x), C62921ba.m95368a()))), cdVar, iVar);
                    } catch (C62974ct e) {
                        C59104x c = C110512ac.f308097a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
                        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(26466)).mo56386p("Invalid ZeroStateClientResponse proto bytes");
                    }
                }
                C85492i iVar2 = acVar.f308099b;
                C53119cb cbVar = (C53119cb) C53122ce.f139215b.createBuilder();
                cbVar.mo53961a(cdVar);
                return acVar.mo98748a(iVar2.mo79002g(((C53122ce) cbVar.build()).toByteArray(), z, true), cdVar, iVar);
            }
            C58976aa aaVar = C58975e.f156826a;
            C60870cx b = ((C118348a) acVar.f308100c.mo56107c()).mo90804b(C53306j.OPA_SMARTSPACE, Optional.m71637of(new C58759qy(7)), C123777f.f341922a, z);
            C60856cj.m92893b(b).mo57334a(new C110933z(b), C60826bg.f164896a);
            return C118826c.f331423b;
        } else {
            C59104x d2 = C110512ac.f308097a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
            ((C59052c) ((C59052c) d2).mo56372aa(26467)).mo56386p("Not a valid condition to start refresh");
            if (cdVar.equals(C53121cd.FLIGHT_STATUS)) {
                acVar.f308106i.mo109871G("NOT_VALID_CONDITION_TO_REFRESH");
            }
            return C118826c.f331423b;
        }
    }
}
