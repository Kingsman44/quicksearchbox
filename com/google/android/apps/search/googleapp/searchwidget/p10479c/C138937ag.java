package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import androidx.work.WorkerParameters;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.ag */
/* compiled from: PG */
public final class C138937ag implements C46575i {

    /* renamed from: a */
    public static final C59071e f377879a = C59071e.m91332i("com.google.android.apps.search.googleapp.searchwidget.c.ag");

    /* renamed from: b */
    public static final C62910ar f377880b = C62948a.m95460k(10);

    /* renamed from: c */
    public static final C62910ar f377881c = C62948a.m95457h(4);

    /* renamed from: d */
    public final C42876ab f377882d;

    /* renamed from: e */
    public final C46578l f377883e;

    /* renamed from: f */
    public final long f377884f;

    /* renamed from: g */
    public final C60887da f377885g;

    /* renamed from: h */
    public final C60887da f377886h;

    /* renamed from: i */
    private final C138963bf f377887i;

    public C138937ag(C138963bf bfVar, C42876ab abVar, C46578l lVar, C60887da daVar, C60887da daVar2, long j) {
        this.f377887i = bfVar;
        this.f377882d = abVar;
        this.f377884f = j;
        this.f377885g = daVar2;
        this.f377886h = daVar;
        this.f377883e = lVar;
    }

    /* renamed from: a */
    public final C60870cx mo114640a() {
        C60870cx cxVar;
        C138963bf bfVar = this.f377887i;
        if (bfVar.f377928j || bfVar.f377923e.mo114767q().length != 0) {
            bfVar.f377921c.mo114639a(C37182a.f98200iH.mo40813g());
            C60870cx b = bfVar.f377922d.mo114646b();
            C138949as asVar = new C138949as(bfVar);
            cxVar = C60922j.m93045h(b, C47810es.m84966f(asVar), bfVar.f377926h);
        } else {
            cxVar = C60866ct.f164955a;
        }
        C58817ah c = C47810es.m84963c(C138933ac.f377875a);
        C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(c), this.f377885g);
        C138934ad adVar = new C138934ad(this);
        return C60846c.m92879h(g, Throwable.class, C47810es.m84966f(adVar), this.f377885g);
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        return mo114640a();
    }
}
