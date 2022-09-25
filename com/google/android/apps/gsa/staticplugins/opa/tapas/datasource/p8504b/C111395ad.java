package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import com.android.launcher3.compat.LauncherActivityInfoCompat;
import com.google.common.base.C58881cr;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.ad */
/* compiled from: PG */
public final /* synthetic */ class C111395ad implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C111396ae f309943a;

    public /* synthetic */ C111395ad(C111396ae aeVar) {
        this.f309943a = aeVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C111396ae aeVar = this.f309943a;
        HashMap hashMap = new HashMap();
        C58881cr crVar = aeVar.f309947d;
        crVar.getClass();
        for (LauncherActivityInfoCompat label : (List) crVar.mo6453a()) {
            String lowerCase = label.getLabel().toString().toLowerCase(Locale.getDefault());
            hashMap.put(lowerCase, C111396ae.f309944a.mo56153g(lowerCase));
        }
        return hashMap;
    }
}
