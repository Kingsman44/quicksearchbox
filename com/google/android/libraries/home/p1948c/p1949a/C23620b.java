package com.google.android.libraries.home.p1948c.p1949a;

import android.content.Context;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23646h;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23652n;
import com.google.android.libraries.home.p1940a.p1943c.C23404ag;
import com.google.android.libraries.home.p1940a.p1943c.C23574eu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.c.a.b */
/* compiled from: PG */
public final class C23620b implements C23623e {

    /* renamed from: a */
    public static final C23620b f64632a = new C23620b();

    private C23620b() {
    }

    /* renamed from: a */
    public final C23642d mo28939a(Context context, C23404ag agVar) {
        C69664n.m101061g(agVar, "device");
        C23642d c = C23619a.m44093c(context, agVar);
        if (!(c instanceof C23646h)) {
            return c;
        }
        return new C23652n(C23574eu.ON_OFF.f64575as, C23631m.m44111c(context, agVar), (C23646h) c);
    }

    /* renamed from: b */
    public final CharSequence mo28940b(Context context, C23404ag agVar) {
        C69664n.m101061g(agVar, "device");
        return C23631m.f64651a.mo28940b(context, agVar);
    }
}
