package com.google.android.libraries.appdoctor.p575c;

import android.content.Context;
import com.google.android.gms.libs.p10836d.p10839c.C144859a;
import com.google.android.gms.libs.p10836d.p10839c.C144860b;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3305a.C42715b;
import com.google.android.libraries.storage.p3304a.p3305a.C42716c;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.android.libraries.storage.protostore.C42881ag;
import com.google.android.libraries.storage.protostore.C42979do;
import com.google.android.libraries.storage.protostore.p3318c.C42932a;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.libraries.appdoctor.c.g */
/* compiled from: PG */
public final class C10475g {

    /* renamed from: a */
    private static volatile C42880af f35240a;

    /* renamed from: a */
    public static synchronized C42880af m25447a(Context context) {
        C42880af b;
        synchronized (C10475g.class) {
            C42813k kVar = new C42813k(Collections.singletonList(new C42716c(new C42715b(context))));
            C144859a aVar = C144860b.f391709a;
            b = m25448b(kVar, C144859a.m235445a(4, Executors.defaultThreadFactory()));
        }
        return b;
    }

    /* renamed from: b */
    public static synchronized C42880af m25448b(C42813k kVar, Executor executor) {
        C42880af afVar;
        synchronized (C10475g.class) {
            if (f35240a == null) {
                C42932a aVar = C42932a.f112315a;
                HashMap hashMap = new HashMap();
                C42881ag.m75749a(C42979do.f112413a, hashMap);
                f35240a = new C42880af(executor, kVar, aVar, hashMap);
            }
            afVar = f35240a;
        }
        return afVar;
    }
}
