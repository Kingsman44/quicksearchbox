package com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a;

import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.p2432a.C31792b;
import com.google.android.libraries.places.api.p2437b.C31855k;
import com.google.android.libraries.places.p2438b.C31894a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.libraries.places.api.a.a.c.a.b */
/* compiled from: PG */
public final class C31794b extends C31802j {
    public C31794b(C31855k kVar, Locale locale, String str, C31894a aVar) {
        super(kVar, locale, str, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo37387c() {
        return "details/json";
    }

    /* renamed from: d */
    public final Map mo37388d() {
        C31855k kVar = (C31855k) this.f85443a;
        HashMap hashMap = new HashMap();
        m59166e(hashMap, "placeid", kVar.mo37408c());
        m59166e(hashMap, "sessiontoken", kVar.mo37407b());
        m59166e(hashMap, "fields", C31792b.m59156a(kVar.mo37409d()));
        return hashMap;
    }
}
