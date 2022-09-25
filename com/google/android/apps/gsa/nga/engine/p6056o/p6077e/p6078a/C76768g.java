package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6078a;

import com.google.android.apps.gsa.nga.engine.c.b;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76584ba;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.appactions.p11035a.C147840h;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63060fy;
import com.google.protobuf.C63063ga;
import com.google.protos.p4850an.p4854c.C63402ac;
import com.google.protos.p4850an.p4854c.C63408ai;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.a.g */
/* compiled from: PG */
public final class C76768g implements C76591c {

    /* renamed from: a */
    private final C76766e f212143a;

    /* renamed from: b */
    private final b f212144b;

    public C76768g(C76766e eVar, b bVar) {
        this.f212143a = eVar;
        this.f212144b = bVar;
    }

    /* renamed from: c */
    private static void m123387c(C63408ai aiVar, String str, C58490gz gzVar) {
        C63060fy fyVar = (C63060fy) C63063ga.f170179c.createBuilder();
        String str2 = aiVar.f171356d;
        fyVar.copyOnWrite();
        C63063ga gaVar = (C63063ga) fyVar.instance;
        str2.getClass();
        gaVar.f170181a = 3;
        gaVar.f170182b = str2;
        gzVar.mo55429h(str.concat(".address"), (C63063ga) fyVar.build());
        C63402ac acVar = aiVar.f171354b;
        if (acVar == null) {
            acVar = C63402ac.f171336b;
        }
        if (acVar.f171338a.size() != 0) {
            C63402ac acVar2 = aiVar.f171354b;
            if (acVar2 == null) {
                acVar2 = C63402ac.f171336b;
            }
            Collection.EL.stream(acVar2.f171338a).limit(1).forEach(new C76767f(gzVar, str));
            return;
        }
        C63060fy fyVar2 = (C63060fy) C63063ga.f170179c.createBuilder();
        String str3 = aiVar.f171356d;
        fyVar2.copyOnWrite();
        C63063ga gaVar2 = (C63063ga) fyVar2.instance;
        str3.getClass();
        gaVar2.f170181a = 3;
        gaVar2.f170182b = str3;
        gzVar.mo55429h(str.concat(".name"), (C63063ga) fyVar2.build());
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.CREATE_TAXI_RESERVATION));
        h.mo72277g("Order_ride", C90126fx.f251079bz);
        h.mo72244c(C58485gu.m89846n("Order_ride"));
        ((C76541a) h).f211766c = 25002;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        Optional optional;
        if (!bgVar.f211838b.mo73901d("Order_ride")) {
            return C81442m.f222851a;
        }
        C76766e eVar = this.f212143a;
        Optional c = eVar.mo72329c(bgVar, "provider", nVar, eVar.mo72330d("actions.intent.CREATE_TAXI_RESERVATION"));
        if (c.isEmpty()) {
            return C81442m.f222851a;
        }
        String str = (String) c.get();
        c.get();
        Optional g = bgVar.mo72265g(C76584ba.f211830a, "pickup_location");
        Optional g2 = bgVar.mo72265g(C76584ba.f211830a, "dropoff_location");
        String str2 = (String) this.f212143a.mo72327a(str, nVar).orElse(null);
        C58490gz gzVar = new C58490gz(4);
        if (g.isPresent()) {
            m123387c((C63408ai) g.get(), "taxiReservation.pickupLocation", gzVar);
        }
        if (g2.isPresent()) {
            m123387c((C63408ai) g2.get(), "taxiReservation.dropoffLocation", gzVar);
        }
        Optional a = this.f212144b.a(str, "actions.intent.CREATE_TAXI_RESERVATION", gzVar.mo55427f(false), str2);
        if (a.isEmpty()) {
            optional = Optional.empty();
        } else {
            C147840h hVar = (C147840h) a.get();
            if (hVar.mo124509d() != 3) {
                optional = Optional.empty();
            } else {
                optional = this.f212143a.mo72331e(nVar, hVar.mo124506a(), str, hVar.mo124508c());
            }
        }
        if (optional.isEmpty()) {
            return C81442m.f222851a;
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        C81442m.m129557s(lVar, (C51809dy) optional.get());
        lVar.mo74319k(74337);
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
