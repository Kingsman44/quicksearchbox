package com.google.apps.tiktok.contrib.work.p3631b;

import androidx.work.WorkerParameters;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46415ab;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.contrib.work.C46577k;
import com.google.apps.tiktok.contrib.work.C46581o;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.contrib.work.C46588v;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.contrib.work.b.az */
/* compiled from: PG */
public final class C46540az implements C46588v {

    /* renamed from: a */
    public final C21370a f121695a;

    /* renamed from: b */
    public final C69464a f121696b;

    /* renamed from: c */
    private final C60888db f121697c;

    /* renamed from: d */
    private final C69464a f121698d;

    public C46540az(C21370a aVar, C60888db dbVar, C69464a aVar2, C69464a aVar3) {
        this.f121695a = aVar;
        this.f121697c = dbVar;
        this.f121696b = aVar2;
        this.f121698d = aVar3;
    }

    /* renamed from: a */
    public final C60870cx mo50535a(C46586t tVar, C60870cx cxVar) {
        return mo50538d(cxVar, new C46538ax(cxVar, tVar), (Set) this.f121696b.mo17428b());
    }

    /* renamed from: b */
    public final C60870cx mo50536b(C60870cx cxVar, String str) {
        return mo50538d(cxVar, new C46536av(cxVar, str), (Set) this.f121696b.mo17428b());
    }

    /* renamed from: c */
    public final C60870cx mo50537c(C60930r rVar, WorkerParameters workerParameters) {
        long c = this.f121695a.mo26871c();
        C58528ij<C46577k> F = C58528ij.m90006F((Collection) this.f121698d.mo17428b());
        C60888db dbVar = this.f121697c;
        HashSet<C46539ay> hashSet = new HashSet<>();
        C47558bi a = C47831fm.m85006a("Reporting Tiktok worker start");
        try {
            for (C46577k kVar : F) {
                hashSet.add(new C46547f(kVar, C60856cj.m92905n(C47810es.m84965e(C47810es.m84965e(new C46530ap(kVar, workerParameters))), dbVar)));
            }
            a.close();
            C60930r e = C47810es.m84965e(rVar);
            C60870cx n = C60856cj.m92905n(C47810es.m84965e(e), C60826bg.f164896a);
            C60870cx a2 = C46415ab.m82767a(n, C47810es.m84978r(new C46533as(this, c)), C60826bg.f164896a);
            C60888db dbVar2 = this.f121697c;
            HashSet hashSet2 = new HashSet();
            for (C46539ay ayVar : hashSet) {
                C60870cx b = C47638k.m84751b(ayVar.mo50534b(), a2, n).mo51521b(new C46535au(ayVar, a2, n, workerParameters), dbVar2);
                C46459k.m82829b(b, "TikTok Client WorkManager Worker Execution Monitor failed", new Object[0]);
                hashSet2.add(b);
            }
            return C47638k.m84751b(n, C60856cj.m92901j(C60856cj.m92908q(C60856cj.m92901j(C60856cj.m92896e(hashSet2)), 10, TimeUnit.SECONDS, this.f121697c))).mo51521b(C47810es.m84965e(new C46534at(n)), C60826bg.f164896a);
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: d */
    public final C60870cx mo50538d(C60870cx cxVar, C60931s sVar, Set set) {
        C60888db dbVar = this.f121697c;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C60870cx n = C60856cj.m92905n(C47810es.m84965e(new C46531aq(sVar, (C46581o) it.next())), dbVar);
            C46459k.m82829b(n, "TikTok Client WorkManager Scheduling Monitor failed", new Object[0]);
            arrayList.add(n);
        }
        return C60856cj.m92893b(cxVar, C60856cj.m92908q(C60856cj.m92901j(C60856cj.m92892a(arrayList).mo57334a(C47810es.m84978r(C46532ar.f121682a), C60826bg.f164896a)), 10, TimeUnit.SECONDS, this.f121697c)).mo57335b(C47810es.m84965e(new C46529ao(cxVar)), C60826bg.f164896a);
    }
}
