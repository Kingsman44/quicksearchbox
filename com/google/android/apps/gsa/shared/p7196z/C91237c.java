package com.google.android.apps.gsa.shared.p7196z;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.mobstore.C145559g;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3305a.C42715b;
import com.google.android.libraries.storage.p3304a.p3305a.C42716c;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.p3304a.p3305a.C42723j;
import com.google.android.libraries.storage.p3304a.p3305a.C42729p;
import com.google.android.libraries.storage.p3304a.p3313g.C42799b;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.android.libraries.storage.protostore.C42881ag;
import com.google.android.libraries.storage.protostore.C42899ay;
import com.google.android.libraries.storage.protostore.C42929by;
import com.google.android.libraries.storage.protostore.C42957cy;
import com.google.android.libraries.storage.protostore.C42979do;
import com.google.android.libraries.storage.protostore.p3318c.C42932a;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4781a.p4782a.C63132e;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.apps.gsa.shared.z.c */
/* compiled from: PG */
public final class C91237c {
    /* renamed from: a */
    public static C42880af m149152a(Executor executor, C42813k kVar) {
        C42932a aVar = C42932a.f112315a;
        HashMap hashMap = new HashMap();
        C42881ag.m75749a(C42979do.f112413a, hashMap);
        C42881ag.m75749a(C42957cy.f112362a, hashMap);
        C42881ag.m75749a(C42929by.m75799k(), hashMap);
        C42881ag.m75749a(new C42899ay(C42979do.f112413a), hashMap);
        return new C42880af(executor, kVar, aVar, hashMap);
    }

    /* renamed from: c */
    public static C42729p m149154c(Context context) {
        C42718e a = C42719f.m75461a(context);
        a.mo45821b("mobstore_accounts.pb");
        Uri a2 = a.mo45820a();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C42932a aVar = C42932a.f112315a;
        HashMap hashMap = new HashMap();
        C42881ag.m75749a(C42979do.f112413a, hashMap);
        C42880af afVar = new C42880af(newSingleThreadExecutor, new C42813k(Arrays.asList(new C42799b[]{new C42716c(new C42715b(context))})), aVar, hashMap);
        C42877ac i = C42878ad.m75739i();
        i.mo45967d(C63132e.f170478d);
        i.mo45968e(a2);
        return new C42729p(afVar.mo45979a(i.mo45964a()));
    }

    /* renamed from: d */
    public static C42799b m149155d(Context context, C42729p pVar) {
        C42715b bVar = new C42715b(context);
        bVar.f111957b = new C145559g(context);
        bVar.f111959d = pVar;
        return new C42716c(bVar);
    }

    /* renamed from: b */
    public static Set m149153b(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return new C58759qy(new C42723j(context));
        }
        return C58733pz.f156496a;
    }
}
