package com.google.android.libraries.p1975k.p1979d;

import android.util.Log;
import com.google.android.gms.libs.p10836d.p10839c.C144859a;
import com.google.android.gms.libs.p10836d.p10839c.C144860b;
import com.google.android.gms.phenotype.C145738p;
import com.google.android.gms.phenotype.C145748z;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.p1975k.C23977a;
import com.google.android.libraries.p1975k.C23995c;
import com.google.android.libraries.p1975k.C24014g;
import com.google.android.libraries.p1975k.p1980e.C24003a;
import com.google.android.libraries.p1975k.p1981f.C24013a;
import com.google.common.base.C58833ax;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.android.libraries.k.d.d */
/* compiled from: PG */
public final class C24001d {

    /* renamed from: a */
    public static boolean f65605a = false;

    /* renamed from: b */
    public static final Object f65606b = new Object();

    /* renamed from: c */
    private static final String[] f65607c = {"COLLECTION_BASIS_VERIFIER"};

    /* renamed from: a */
    public static void m44591a(C23995c cVar, C24003a aVar) {
        Executor executor;
        C23977a aVar2 = (C23977a) cVar;
        C145748z b = C145738p.m237003b(aVar2.f65576a);
        String concat = "com.google.android.libraries.consentverifier#".concat(String.valueOf(aVar2.f65576a.getPackageName()));
        C146006ab e = b.mo121905e(concat, aVar.mo29404a(aVar2.f65576a), f65607c, (byte[]) null);
        C58833ax axVar = aVar2.f65579d;
        if (C24014g.m44611a(aVar2.f65576a)) {
            C144859a aVar3 = C144860b.f391709a;
            executor = C144859a.m235445a(10, Executors.defaultThreadFactory());
        } else {
            executor = C24013a.m44610a();
        }
        try {
            e.mo122495n(executor, new C23999b(b, concat, executor));
            e.mo122494m(executor, new C24000c(concat));
        } catch (RejectedExecutionException e2) {
            Log.w("CBVerifier", String.format("Execution failure when updating phenotypeflags for %s. %s", new Object[]{concat, e2}));
        }
    }
}
