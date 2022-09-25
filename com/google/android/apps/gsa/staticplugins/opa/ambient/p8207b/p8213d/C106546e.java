package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106595g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106532f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106537k;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8223j.C106570d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8223j.C106571e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8224k.C106575b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8224k.C106577d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8266b.C107044a;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e */
/* compiled from: PG */
public abstract class C106546e {

    /* renamed from: a */
    public static final C106546e f297118a;

    /* renamed from: b */
    public static final C106546e f297119b;

    /* renamed from: c */
    public static final C106546e f297120c;

    /* renamed from: d */
    public static final C58495hd f297121d;

    /* renamed from: e */
    private static final C58495hd f297122e;

    static {
        C106518a aVar = new C106518a(C106526d.HEADSET_STATE, C106532f.class, C106532f.f297078g.getParserForType(), new C106537k());
        f297118a = aVar;
        C106518a aVar2 = new C106518a(C106526d.RESET, C106575b.class, C106575b.f297162e.getParserForType(), new C106577d());
        f297119b = aVar2;
        C106518a aVar3 = new C106518a(C106526d.PCP_EVENT, C106570d.class, C106570d.f297154c.getParserForType(), new C106571e());
        f297120c = aVar3;
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C106526d.HEADSET_STATE, aVar);
        gzVar.mo55429h(C106526d.RESET, aVar2);
        gzVar.mo55429h(C106526d.PCP_EVENT, aVar3);
        f297121d = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C106526d.HEADSET_STATE, C106595g.HEADSET_STATE);
        gzVar2.mo55429h(C106526d.RESET, C106595g.RESET);
        gzVar2.mo55429h(C106526d.PCP_EVENT, C106595g.PCP_EVENT);
        f297122e = gzVar2.mo55427f(false);
    }

    /* renamed from: a */
    public abstract C106526d mo95556a();

    /* renamed from: b */
    public abstract C107044a mo95557b();

    /* renamed from: c */
    public abstract C63010eb mo95558c();

    /* renamed from: d */
    public abstract Class mo95559d();

    /* renamed from: e */
    public final C106595g mo95573e() {
        C58495hd hdVar = f297122e;
        if (hdVar.containsKey(mo95556a())) {
            return (C106595g) hdVar.get(mo95556a());
        }
        return C106595g.UNSPECIFIED;
    }
}
