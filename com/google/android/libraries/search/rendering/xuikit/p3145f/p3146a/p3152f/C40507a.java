package com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3152f;

import com.google.android.libraries.search.p3090o.C39838p;
import com.google.android.libraries.silk.p3205a.p3209ac.C41712a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4204d.p4205a.p4209d.C56016b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4293ac.C56630b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.a.f.a */
/* compiled from: PG */
public final class C40507a implements C41712a {

    /* renamed from: a */
    private final C39838p f106281a;

    public C40507a(C39838p pVar) {
        this.f106281a = pVar;
    }

    /* renamed from: a */
    public final C60870cx mo42478a(C56630b bVar) {
        C69664n.m101061g(bVar, "request");
        if ((bVar.f151197a & 1) == 0) {
            return C60866ct.f164955a;
        }
        if (bVar.f151198b) {
            C60870cx b = this.f106281a.mo42022b(C56016b.CELSIUS);
            C69664n.m101060f(b, "temperatureUnitStore.set(TemperatureUnit.CELSIUS)");
            return b;
        }
        C60870cx b2 = this.f106281a.mo42022b(C56016b.FAHRENHEIT);
        C69664n.m101060f(b2, "temperatureUnitStore.set…mperatureUnit.FAHRENHEIT)");
        return b2;
    }
}
