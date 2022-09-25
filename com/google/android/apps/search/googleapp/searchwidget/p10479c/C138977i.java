package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import androidx.work.C4634o;
import androidx.work.WorkerParameters;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.i */
/* compiled from: PG */
public final class C138977i implements C46575i {

    /* renamed from: a */
    public static final C59071e f377958a = C59071e.m91332i("com.google.android.apps.search.googleapp.searchwidget.c.i");

    /* renamed from: b */
    public static final C62910ar f377959b = C62948a.m95460k(10);

    /* renamed from: c */
    public static final C62910ar f377960c = C62948a.m95457h(4);

    /* renamed from: d */
    public static final C62910ar f377961d = C62948a.m95457h(2);

    /* renamed from: e */
    public final C42876ab f377962e;

    /* renamed from: f */
    public final C46578l f377963f;

    /* renamed from: g */
    public final C60887da f377964g;

    /* renamed from: h */
    public final C60887da f377965h;

    /* renamed from: i */
    public final C138990v f377966i;

    /* renamed from: j */
    public final long f377967j;

    /* renamed from: k */
    private final C138970bm f377968k;

    public C138977i(C138970bm bmVar, C138990v vVar, C42876ab abVar, C46578l lVar, C60887da daVar, C60887da daVar2, long j) {
        this.f377968k = bmVar;
        this.f377962e = abVar;
        this.f377966i = vVar;
        this.f377967j = j;
        this.f377964g = daVar2;
        this.f377965h = daVar;
        this.f377963f = lVar;
    }

    /* renamed from: a */
    public static C46586t m225787a(C62910ar arVar) {
        C46582p j = C46586t.m83063j(C138977i.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(new C46574h("com.google.android.apps.search.googleapp.searchwidget.doodle.SearchWidgetDoodleContentDownloadWorker", C4634o.REPLACE));
        dVar.f121754c = new C46573g(C62948a.m95453d(arVar), TimeUnit.MILLISECONDS);
        return j.mo50561a();
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        C60870cx d = this.f377962e.mo46042d();
        C60870cx a = this.f377968k.mo114645a();
        return C47638k.m84753d(d, a).mo51521b(new C138974f(this, d, a), this.f377964g);
    }

    /* renamed from: c */
    public final C60870cx mo114647c() {
        C60870cx a = this.f377966i.mo114648a();
        C58817ah c = C47810es.m84963c(C138975g.f377956a);
        return C60922j.m93044g(a, C47810es.m84963c(c), this.f377964g);
    }
}
