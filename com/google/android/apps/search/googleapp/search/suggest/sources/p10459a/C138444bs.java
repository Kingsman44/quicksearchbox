package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.bs */
/* compiled from: PG */
public final /* synthetic */ class C138444bs implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138445bt f376575a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f376576b;

    /* renamed from: c */
    public final /* synthetic */ C138133o f376577c;

    public /* synthetic */ C138444bs(C138445bt btVar, C60870cx cxVar, C138133o oVar) {
        this.f376575a = btVar;
        this.f376576b = cxVar;
        this.f376577c = oVar;
    }

    public final C60870cx apply(Object obj) {
        C138445bt btVar = this.f376575a;
        C60870cx cxVar = this.f376576b;
        C138133o oVar = this.f376577c;
        Exception exc = (Exception) obj;
        if (!(exc instanceof TimeoutException)) {
            ((C58970a) ((C58970a) ((C58970a) C138445bt.f376578a.mo56226d()).mo56382g(exc)).mo56372aa(41215)).mo56386p("CompleteServer request has failed; will fallback to offline suggestions.");
        }
        return C47633f.m84733g(cxVar).mo51515h(new C138438bm(btVar, oVar), btVar.f376583f);
    }
}
