package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59071e;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.o */
/* compiled from: PG */
final class C96612o extends C96588ct {

    /* renamed from: a */
    public static final C59071e f270278a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.o");

    /* renamed from: b */
    public final Map f270279b;

    /* renamed from: c */
    public int f270280c;

    /* renamed from: d */
    public final C58800sl f270281d;

    /* renamed from: e */
    public final C96586cr f270282e = new C96611n(this);

    public C96612o(C22871g gVar, C22871g gVar2, C96579ck ckVar, C21370a aVar, C95355bf bfVar, C124721s sVar, C124629av avVar, Collection collection) {
        super(gVar, gVar2, ckVar, aVar, bfVar, sVar, avVar);
        this.f270281d = C58528ij.m90006F(collection).iterator();
        this.f270279b = new HashMap();
    }

    /* renamed from: a */
    public final String mo90248a() {
        return "DeviceStateOtaTask";
    }

    /* renamed from: b */
    public final void mo90249b() {
        mo90265m();
        synchronized (this) {
            if (!this.f270281d.hasNext()) {
                mo90261i(this.f270279b);
                return;
            }
            int intValue = ((Integer) this.f270281d.next()).intValue();
            this.f270280c = intValue;
            mo90274c(intValue);
        }
    }

    /* renamed from: c */
    public final void mo90274c(int i) {
        this.f270197i.mo28207g("get_headset_state", new C96610m(this, i));
    }
}
