package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9210j.p9213c;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121219ad;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121220ae;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121254r;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121255s;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121256t;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121258v;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9210j.p9213c.p9214a.C121393a;
import com.google.assistant.p3781ad.p3789d.p3791b.C48714bv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.j.c.a */
/* compiled from: PG */
public final /* synthetic */ class C121392a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C121394b f337029a;

    public /* synthetic */ C121392a(C121394b bVar) {
        this.f337029a = bVar;
    }

    public final Object call() {
        C121394b bVar = this.f337029a;
        C58976aa aaVar = C58975e.f156826a;
        C121393a aVar = bVar.f337031b;
        Map a = aVar.mo105121a(aVar.mo105122b(3));
        C121256t tVar = (C121256t) C121258v.f336821b.createBuilder();
        for (Map.Entry entry : a.entrySet()) {
            C121254r rVar = (C121254r) C121255s.f336817b.createBuilder();
            rVar.mo105098a((Iterable) entry.getValue());
            tVar.mo105099a((String) entry.getKey(), (C121255s) rVar.build());
        }
        C121219ad adVar = (C121219ad) C121220ae.f336741f.createBuilder();
        long epochMilli = bVar.f337030a.mo57444a().toEpochMilli();
        adVar.copyOnWrite();
        C121220ae aeVar = (C121220ae) adVar.instance;
        aeVar.f336743a |= 1;
        aeVar.f336746d = epochMilli;
        C48714bv bvVar = C48714bv.APP_DYNAMIC_SHORTCUT_SIGNAL;
        adVar.copyOnWrite();
        C121220ae aeVar2 = (C121220ae) adVar.instance;
        aeVar2.f336747e = bvVar.f126042j;
        aeVar2.f336743a |= 2;
        adVar.copyOnWrite();
        C121220ae aeVar3 = (C121220ae) adVar.instance;
        C121258v vVar = (C121258v) tVar.build();
        vVar.getClass();
        aeVar3.f336745c = vVar;
        aeVar3.f336744b = 9;
        return (C121220ae) adVar.build();
    }
}
