package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.understanding.C78983aj;
import com.google.android.apps.gsa.nga.engine.understanding.C79330v;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58506ho;
import com.google.common.p4522b.C58512hu;
import com.google.common.p4522b.C58528ij;
import com.google.knowledge.p4661a.p4662a.C61752n;
import java.util.Iterator;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.r */
/* compiled from: PG */
public final class C76524r implements C76530x {

    /* renamed from: a */
    public static final C58528ij f211748a = C58528ij.m90015O(C82831ca.ENABLE_DISABLE, C82831ca.INCREASE_DECREASE, C82831ca.MUTE_UNMUTE, C82831ca.SET_DEVICE_SETTINGS, C82831ca.SHOW_SETTINGS, C82831ca.TOGGLE_SETTINGS, new C82831ca[0]);

    /* renamed from: b */
    public final C76493av f211749b;

    /* renamed from: c */
    public final C91142g f211750c;

    /* renamed from: d */
    private final C58512hu f211751d;

    public C76524r(Set set, C76493av avVar, C91142g gVar) {
        C58506ho hoVar = new C58506ho();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C76591c cVar = (C76591c) it.next();
            C58485gu b = cVar.mo71711a().mo72250b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                hoVar.mo55456j(C79330v.m127277b((String) b.get(i)), cVar);
            }
        }
        this.f211751d = hoVar.mo55453g();
        this.f211749b = avVar;
        this.f211750c = gVar;
    }

    /* renamed from: a */
    public final Stream mo72222a(C78983aj ajVar, C74965n nVar) {
        if (ajVar.mo73747b().isEmpty()) {
            return Stream.CC.empty();
        }
        C61752n nVar2 = ((C80513b) ajVar.mo73747b().get()).f221016a;
        if (nVar2 == null) {
            nVar2 = C61752n.f166808f;
        }
        return Collection.EL.stream(this.f211751d.mo55423a(C79330v.m127277b(nVar2.f166811b))).filter(new C76520n(this, ajVar)).map(new C76521o(this, ajVar, nVar)).peek(C76522p.f211746a).map(C76523q.f211747a);
    }
}
