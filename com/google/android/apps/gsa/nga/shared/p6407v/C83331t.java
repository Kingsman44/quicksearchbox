package com.google.android.apps.gsa.nga.shared.p6407v;

import android.util.Base64;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82890ef;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82891eg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.C83045a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.t */
/* compiled from: PG */
public final class C83331t implements C90991b {

    /* renamed from: a */
    public final C82775d f227148a;

    /* renamed from: b */
    public final C83045a f227149b;

    /* renamed from: c */
    private final C83321j f227150c;

    public C83331t(C83321j jVar, C82775d dVar, C83045a aVar) {
        this.f227150c = jVar;
        this.f227148a = dVar;
        this.f227149b = aVar;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("NGA Events");
        C58485gu guVar = (C58485gu) Collection.EL.stream(this.f227150c.mo75541a(e.mo85296v())).filter(new C83323l(this, e)).collect(C58370cn.f155946a);
        e.mo85278b("Last 2 NGA queries").mo85276a(C90752i.m148231e((List) Collection.EL.stream(((Map) Collection.EL.stream(guVar).filter(C83324m.f227141a).collect(Collectors.toMap(C83325n.f227142a, C83326o.f227143a, C83327p.f227144a))).values()).sorted(C83328q.f227145a).map(C83329r.f227146a).filter(C83330s.f227147a).limit(2).collect(Collectors.toList())));
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).map(new C83322k(this, e)).collect(C58370cn.f155946a);
        C82890ef efVar = (C82890ef) C82891eg.f226106b.createBuilder();
        efVar.copyOnWrite();
        C82891eg egVar = (C82891eg) efVar.instance;
        C62971cq cqVar = egVar.f226108a;
        if (!cqVar.mo58948c()) {
            egVar.f226108a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar2, (List) egVar.f226108a);
        e.mo85293t("nga_events_log(%s)", C90752i.m148229c(Base64.encodeToString(((C82891eg) efVar.build()).toByteArray(), 2)));
    }
}
