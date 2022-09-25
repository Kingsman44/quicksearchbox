package com.google.android.apps.gsa.nga.engine.understanding.p6238e;

import com.google.android.apps.gsa.nga.engine.p5913am.p5933n.C74945h;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.understanding.C78981ah;
import com.google.android.apps.gsa.nga.engine.understanding.C79004ba;
import com.google.android.apps.gsa.nga.engine.understanding.C79162t;
import com.google.android.apps.gsa.nga.engine.understanding.C79329u;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.e.v */
/* compiled from: PG */
public final /* synthetic */ class C79108v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C79086ak f217495a;

    /* renamed from: b */
    public final /* synthetic */ C79162t f217496b;

    /* renamed from: c */
    public final /* synthetic */ C74965n f217497c;

    /* renamed from: d */
    public final /* synthetic */ C74945h f217498d;

    /* renamed from: e */
    public final /* synthetic */ C79004ba f217499e;

    public /* synthetic */ C79108v(C79086ak akVar, C79162t tVar, C74965n nVar, C74945h hVar, C79004ba baVar) {
        this.f217495a = akVar;
        this.f217496b = tVar;
        this.f217497c = nVar;
        this.f217498d = hVar;
        this.f217499e = baVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C79086ak akVar = this.f217495a;
        C79162t tVar = this.f217496b;
        C74965n nVar = this.f217497c;
        C74945h hVar = this.f217498d;
        C79004ba baVar = this.f217499e;
        C78981ah ahVar = (C78981ah) obj;
        if (akVar.f217448d.mo71991b(ahVar.mo73741a().mo71152e().mo71141c().mo71146c(), tVar.mo73713a(), ahVar.mo73741a().mo71150c().c())) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        try {
            cxVar = tVar.mo73714b(ahVar.mo73741a().mo71152e().mo71141c().mo71146c(), (List) ahVar.mo73741a().mo71158k().orElse(C58485gu.m89845m()), nVar, hVar);
        } catch (C79329u e) {
            cxVar = C60856cj.m92899h(e);
        }
        C60870cx i = akVar.f217445a.mo28209i(cxVar, "[NGA] UnderstandingAsyncImpl.createUnderstandingResult", new C79075a(akVar, ahVar));
        baVar.mo73763b(i, tVar.mo73713a());
        return i;
    }
}
