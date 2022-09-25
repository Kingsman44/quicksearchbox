package com.google.android.libraries.home.p1948c.p1949a;

import com.google.android.libraries.home.coreui.devicetile.model.C23728c;
import com.google.android.libraries.home.coreui.devicetile.model.C23739n;
import com.google.android.libraries.home.coreui.devicetile.model.C23745t;
import com.google.android.libraries.home.p1940a.p1943c.C23525cz;
import com.google.android.libraries.home.p1940a.p1943c.C23544dr;
import com.google.android.libraries.home.p1940a.p1943c.C23573et;
import com.google.android.libraries.home.p1940a.p1943c.C23574eu;
import com.google.android.libraries.home.p1940a.p1943c.C23583j;
import java.util.Map;

/* renamed from: com.google.android.libraries.home.c.a.c */
/* compiled from: PG */
public final class C23621c {
    /* renamed from: a */
    public static final C23544dr m44098a(C23739n nVar) {
        Map map = C23574eu.f64530a;
        C23574eu a = C23573et.m43993a(nVar.mo29075a());
        if ((nVar instanceof C23728c) && a == C23574eu.ON_OFF) {
            return new C23525cz(true != ((C23728c) nVar).f64909b ? "off" : "on", true);
        } else if (!(nVar instanceof C23745t) || a != C23574eu.BRIGHTNESS) {
            return null;
        } else {
            return new C23583j((int) ((C23745t) nVar).f65096b, true);
        }
    }
}
