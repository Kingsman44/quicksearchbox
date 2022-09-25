package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import android.net.ConnectivityManager;
import androidx.work.WorkerParameters;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10448e.C137984d;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.contrib.work.C46513b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.HashMap;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.cb */
/* compiled from: PG */
public final class C138454cb implements C46513b {

    /* renamed from: a */
    public static final C58974d f376610a = C58974d.m91134h("CompleteServerZpWorker");

    /* renamed from: b */
    public static final C138133o f376611b = C138133o.f375822o;

    /* renamed from: c */
    public final ConnectivityManager f376612c;

    /* renamed from: d */
    public final C60888db f376613d;

    /* renamed from: e */
    public final C60887da f376614e;

    /* renamed from: f */
    public final boolean f376615f;

    /* renamed from: g */
    public final C138475e f376616g;

    /* renamed from: h */
    public final C138473cu f376617h;

    /* renamed from: i */
    public final long f376618i;

    /* renamed from: j */
    private final C138476f f376619j;

    /* renamed from: k */
    private final Set f376620k;

    /* renamed from: l */
    private final C138396ar f376621l;

    /* renamed from: m */
    private final C137984d f376622m;

    public C138454cb(C60888db dbVar, C60887da daVar, ConnectivityManager connectivityManager, C138476f fVar, Set set, C137984d dVar, C138396ar arVar, C138473cu cuVar, long j, boolean z, C138475e eVar) {
        this.f376613d = dbVar;
        this.f376614e = daVar;
        this.f376612c = connectivityManager;
        this.f376619j = fVar;
        this.f376620k = set;
        this.f376621l = arVar;
        this.f376618i = j;
        this.f376622m = dVar;
        this.f376615f = z;
        this.f376616g = eVar;
        this.f376617h = cuVar;
    }

    /* renamed from: a */
    public final C60870cx mo114286a() {
        C60870cx a = this.f376622m.mo114069a();
        C138453ca caVar = new C138453ca(this);
        return C60922j.m93045h(a, C47810es.m84966f(caVar), this.f376614e);
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        return mo114287c(2);
    }

    /* renamed from: c */
    public final C60870cx mo114287c(int i) {
        C60870cx a = mo114286a();
        C138451bz bzVar = new C138451bz(this);
        C60922j.m93045h(a, C47810es.m84966f(bzVar), this.f376614e);
        C138476f fVar = this.f376619j;
        C138133o oVar = f376611b;
        HashMap hashMap = new HashMap();
        Collection.EL.stream(this.f376620k).forEach(new C138446bu(hashMap));
        if (i == 2) {
            hashMap.put("gs_pcr", C42181t.f110467a);
        }
        return C47633f.m84733g(this.f376621l.mo114273e(fVar.mo114290a(oVar, C58495hd.m89898l(hashMap)), i)).mo51515h(C138449bx.f376606a, this.f376614e).mo51513e(Exception.class, C138450by.f376607a, this.f376614e);
    }
}
