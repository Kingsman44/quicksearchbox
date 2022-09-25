package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78276a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78568w;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81572o;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.common.p4552o.p4566l.C60214n;
import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a.m */
/* compiled from: PG */
public final /* synthetic */ class C78324m implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C78335x f215639a;

    public /* synthetic */ C78324m(C78335x xVar) {
        this.f215639a = xVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        Optional empty;
        C78335x xVar = this.f215639a;
        C78288aj ajVar = xVar.f215659c;
        C78276a c = ajVar.f215574c.mo73300c();
        C58495hd l = C58495hd.m89898l((Map) Collection.EL.stream(((Map) Collection.EL.stream((C58485gu) Collection.EL.stream(c.mo73275c()).filter(C78287ai.f215571a).collect(C58370cn.f155946a)).collect(Collectors.partitioningBy(C78282ad.f215566a))).entrySet()).collect(Collectors.toMap(C78283ae.f215567a, C78284af.f215568a)));
        C58485gu guVar = (C58485gu) l.getOrDefault(false, C58485gu.m89845m());
        C58485gu guVar2 = (C58485gu) l.getOrDefault(true, C58485gu.m89845m());
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C80590x xVar2 = C80590x.ESCAPE_HATCH;
            C80590x a = C80590x.m128211a(((C80581o) guVar.get(i)).f221191a);
            if (a == null) {
                a = C80590x.UNRECOGNIZED;
            }
            if (xVar2.equals(a)) {
                C28292j jVar = new C28292j(92675);
                jVar.mo33795i(5);
                jVar.mo33794h(3);
                aqp aqp = jVar.f76974b;
                aqp.copyOnWrite();
                aqs aqs = (aqs) aqp.instance;
                aqs aqs2 = aqs.f159780k;
                aqs.f159782a |= 2;
                aqs.f159784c = 0;
                C28292j jVar2 = new C28292j(99961);
                jVar2.mo33795i(5);
                jVar2.mo33794h(3);
                aqp aqp2 = jVar2.f76974b;
                aqp2.copyOnWrite();
                aqs aqs3 = (aqs) aqp2.instance;
                aqs3.f159782a |= 2;
                aqs3.f159784c = 0;
                C28293k e = C28293k.m52908e(jVar, C28293k.m52908e(jVar2, new C28293k[0]));
                Iterator it = C28295m.m52917c().entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        empty = Optional.empty();
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((C60214n) ((C28292j) entry.getValue()).f76973a.instance).f162918c == 92781) {
                        empty = Optional.m71637of((C28292j) entry.getValue());
                        break;
                    }
                }
                if (empty.isPresent()) {
                    Optional ofNullable = Optional.ofNullable(C28285c.m52877d(e, (C28292j) empty.get()));
                    C81572o oVar = ajVar.f215575d;
                    Objects.requireNonNull(oVar);
                    ofNullable.ifPresent(new C78285ag(oVar));
                }
            }
        }
        ajVar.f215573b.c(guVar2);
        ajVar.f215572a = C78276a.m125757a(c.mo73274b(), guVar2);
        C78568w wVar = (C78568w) xVar.f215659c.f215572a;
        return C78276a.m125757a(wVar.f216317b, xVar.mo73309a(wVar.f216318c));
    }
}
