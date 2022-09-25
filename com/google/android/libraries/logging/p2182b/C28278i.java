package com.google.android.libraries.logging.p2182b;

import android.os.StrictMode;
import com.google.android.libraries.logging.p2185ve.p2193e.p2197d.p2198a.C28410b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.logging.b.i */
/* compiled from: PG */
public final class C28278i {

    /* renamed from: a */
    public final C60887da f76955a;

    /* renamed from: b */
    public final C28273d f76956b;

    /* renamed from: c */
    private final C69464a f76957c;

    /* renamed from: d */
    private final Set f76958d;

    /* renamed from: e */
    private final C21370a f76959e;

    /* renamed from: f */
    private final Executor f76960f;

    /* renamed from: g */
    private volatile C58495hd f76961g;

    public C28278i(C60887da daVar, C69464a aVar, Set set, C28273d dVar, C21370a aVar2) {
        this.f76955a = daVar;
        this.f76957c = aVar;
        this.f76958d = set;
        this.f76956b = dVar;
        this.f76959e = aVar2;
        this.f76960f = new C60904dr(daVar);
        C58838bb.m90884s(!set.isEmpty(), "No logging result handlers provided.");
    }

    /* renamed from: a */
    public static C60870cx m52864a(C28282m mVar, C28279j jVar) {
        try {
            return jVar.mo33778a(mVar);
        } catch (Throwable th) {
            return C60856cj.m92899h(th);
        }
    }

    /* renamed from: d */
    private final void m52865d(C60870cx cxVar) {
        for (C28410b bVar : this.f76958d) {
            C60856cj.m92911t(cxVar, new C28284o(), C60826bg.f164896a);
        }
    }

    /* renamed from: b */
    public final List mo33776b(Class cls) {
        C58495hd hdVar = this.f76961g;
        if (hdVar == null) {
            synchronized (this) {
                hdVar = this.f76961g;
                if (hdVar == null) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (C28279j jVar : (Set) this.f76957c.mo17428b()) {
                        if (jVar.mo33779b().isEmpty()) {
                            arrayList.add(jVar);
                        } else {
                            for (Class cls2 : jVar.mo33779b()) {
                                List list = (List) hashMap.get(cls2);
                                if (list == null) {
                                    list = new ArrayList();
                                    hashMap.put(cls2, list);
                                }
                                list.add(jVar);
                            }
                        }
                    }
                    hashMap.put(C28280k.class, arrayList);
                    hdVar = C58495hd.m89898l(hashMap);
                    this.f76961g = hdVar;
                }
            }
        }
        return (List) hdVar.getOrDefault(cls, C58485gu.m89845m());
    }

    /* renamed from: c */
    public final void mo33777c(C28277h hVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).detectAll().build());
        try {
            long e = this.f76959e.mo26873e();
            C28281l lVar = new C28281l();
            List a = hVar.mo33775a();
            if (a != null && !a.isEmpty()) {
                SettableFuture settableFuture = new SettableFuture();
                m52865d(C60922j.m93045h(C60856cj.m92904m(C47810es.m84978r(new C28275f(this, a)), this.f76960f), C47810es.m84966f(new C28276g(this, settableFuture, lVar)), this.f76960f));
                settableFuture.mo57356n(Long.valueOf(this.f76959e.mo26873e() - e));
            }
        } catch (Throwable th) {
            C60870cx h = C60856cj.m92899h(th);
            C60856cj.m92899h(th);
            m52865d(h);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
