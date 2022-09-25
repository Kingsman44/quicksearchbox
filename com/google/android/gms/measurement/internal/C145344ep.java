package com.google.android.gms.measurement.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.ep */
/* compiled from: PG */
public final /* synthetic */ class C145344ep implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C145351ew f392877a;

    /* renamed from: b */
    public final /* synthetic */ String f392878b;

    public /* synthetic */ C145344ep(C145351ew ewVar, String str) {
        this.f392877a = ewVar;
        this.f392878b = str;
    }

    public final Object call() {
        C145351ew ewVar = this.f392877a;
        String str = this.f392878b;
        C145228ah ahVar = ewVar.f393327l.f393355c;
        C145488jy.m236409I(ahVar);
        C145382g f = ahVar.mo120808f(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", str);
        ewVar.f393011w.f392937g.mo120770f();
        hashMap.put("gmp_version", 74009L);
        if (f != null) {
            String o = f.mo121039o();
            if (o != null) {
                hashMap.put("app_version", o);
            }
            hashMap.put("app_version_int", Long.valueOf(f.mo121025a()));
            hashMap.put("dynamite_version", Long.valueOf(f.mo121028d()));
        }
        return hashMap;
    }
}
