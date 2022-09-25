package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4354e.C57528m;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.ad */
/* compiled from: PG */
public final class C134199ad {

    /* renamed from: a */
    public static final C59071e f365548a = C59071e.m91332i("com.google.android.apps.search.googleapp.discover.d.ad");

    /* renamed from: b */
    public final Object f365549b = new Object();

    /* renamed from: c */
    public final Map f365550c;

    /* renamed from: d */
    public final C58425eo f365551d = new C58425eo(10);

    /* renamed from: e */
    private final C21370a f365552e;

    /* renamed from: f */
    private final C37215b f365553f;

    public C134199ad(C37215b bVar, C21370a aVar) {
        this.f365552e = aVar;
        this.f365553f = bVar;
        this.f365550c = new HashMap();
    }

    /* renamed from: a */
    public final UUID mo111607a(C57528m mVar) {
        return mo111608b(mVar, C37182a.f98033f.mo40779c());
    }

    /* renamed from: b */
    public final UUID mo111608b(C57528m mVar, C37252a aVar) {
        UUID randomUUID;
        synchronized (this.f365549b) {
            randomUUID = UUID.randomUUID();
            C134198ac acVar = new C134198ac(mVar, randomUUID);
            mo111611e(aVar);
            acVar.mo111605a(aVar);
            this.f365550c.put(randomUUID, acVar);
        }
        return randomUUID;
    }

    /* renamed from: c */
    public final void mo111609c(C57528m mVar, Consumer consumer) {
        Map.EL.forEach(this.f365550c, new C134235x(mVar, consumer));
    }

    /* renamed from: d */
    public final void mo111610d(C134198ac acVar) {
        if (acVar.f365546d) {
            C58485gu j = C58485gu.m89842j(acVar.f365543a);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                this.f365553f.mo19974a((C37252a) j.get(i));
            }
            return;
        }
        UUID uuid = acVar.f365545c;
        C57528m mVar = acVar.f365544b;
    }

    /* renamed from: e */
    public final void mo111611e(C37252a aVar) {
        ((C37253b) aVar).mo40791o(this.f365552e.mo26872d());
    }
}
