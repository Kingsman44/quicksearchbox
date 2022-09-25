package com.google.android.apps.search.assistant.platform.p9044c.p9052b.p9053a.p9054a;

import com.google.android.libraries.search.assistant.invocation.p2615e.p2616a.C33719m;
import com.google.android.libraries.search.assistant.invocation.p2615e.p2616a.C33720n;
import com.google.android.libraries.search.assistant.invocation.p2615e.p2616a.C33721o;
import com.google.android.libraries.search.assistant.invocation.p2615e.p2616a.C33722p;
import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5462h.p5463a.C69498ao;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.c.b.a.a.y */
/* compiled from: PG */
public final class C120109y extends C120103s implements C33722p {

    /* renamed from: a */
    public static final C59071e f334334a = C59071e.m91331h();

    /* renamed from: b */
    public final Map f334335b = new ConcurrentHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120109y(C69585o oVar) {
        super(oVar);
        C69664n.m101061g(oVar, "lightweightContext");
    }

    /* renamed from: b */
    public final Object mo104667b(C120095k kVar) {
        C33721o oVar;
        Map map = this.f334335b;
        C120100p a = C120100p.m199027a(kVar.f334314a);
        if (a == null) {
            a = C120100p.UNRECOGNIZED;
        }
        C69664n.m101060f(a, "request.settingType");
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            oVar = C33721o.LOCALE;
        } else if (ordinal == 2) {
            oVar = C33721o.ASSISTANT_ENABLED;
        } else {
            String name = a.name();
            throw new IllegalArgumentException("Unknown SettingType: " + name + ".");
        }
        Set<C33719m> set = (Set) map.get(oVar);
        if (set == null) {
            set = C69498ao.f185920a;
        }
        C59052c cVar = (C59052c) f334334a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "INV.SettingsChangeListener");
        int size = set.size();
        cVar.mo56379ah(new C59094n(34653));
        cVar.mo56387q("Starting to notify all %d listeners.", size);
        for (C33719m a2 : set) {
            a2.mo39036a();
        }
        C59052c cVar2 = (C59052c) f334334a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "INV.SettingsChangeListener");
        cVar2.mo56379ah(new C59094n(34654));
        cVar2.mo56386p("Finished notifying all listeners.");
        C120099o oVar2 = C120099o.f334316a;
        C69664n.m101060f(oVar2, "getDefaultInstance()");
        return oVar2;
    }

    /* renamed from: c */
    public final C33720n mo39039c(C33721o oVar, C33719m mVar) {
        C69664n.m101061g(oVar, "setting");
        C59052c cVar = (C59052c) f334334a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "INV.SettingsChangeListener");
        String c = C33914a.m62568c(mVar);
        String name = oVar.name();
        cVar.mo56379ah(new C59094n(34652));
        cVar.mo56354G("Registering a listener (%s) for type %s.", c, name);
        Map.EL.compute(this.f334335b, oVar, new C120106v(mVar));
        return new C120107w(this, oVar, mVar);
    }
}
