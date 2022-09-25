package com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a;

import android.location.Location;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.p2432a.C31791a;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.p2432a.C31792b;
import com.google.android.libraries.places.api.p2437b.C31861q;
import com.google.android.libraries.places.p2438b.C31894a;
import com.google.common.p4522b.C58485gu;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.libraries.places.api.a.a.c.a.g */
/* compiled from: PG */
public final class C31799g extends C31802j {

    /* renamed from: b */
    private final Location f85418b;

    /* renamed from: c */
    private final C58485gu f85419c;

    public C31799g(C31861q qVar, Location location, C58485gu guVar, Locale locale, String str, C31894a aVar) {
        super(qVar, locale, str, aVar);
        this.f85418b = location;
        this.f85419c = guVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo37387c() {
        return "findplacefromuserlocation/json";
    }

    /* renamed from: d */
    public final Map mo37388d() {
        HashMap hashMap = new HashMap();
        m59166e(hashMap, "location", C31791a.m59149c(this.f85418b));
        m59166e(hashMap, "wifiaccesspoints", C31791a.m59153g(this.f85419c));
        m59166e(hashMap, "precision", C31791a.m59147a(this.f85418b));
        m59166e(hashMap, "timestamp", Long.valueOf(this.f85418b.getTime()));
        m59166e(hashMap, "fields", C31792b.m59156a(((C31861q) this.f85443a).mo37439b()));
        return hashMap;
    }
}
