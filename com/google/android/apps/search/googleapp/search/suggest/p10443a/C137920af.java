package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.concurrent.C46464p;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.af */
/* compiled from: PG */
public final /* synthetic */ class C137920af implements C46464p {

    /* renamed from: a */
    public final /* synthetic */ C137929ao f375250a;

    /* renamed from: b */
    public final /* synthetic */ C138133o f375251b;

    public /* synthetic */ C137920af(C137929ao aoVar, C138133o oVar) {
        this.f375250a = aoVar;
        this.f375251b = oVar;
    }

    /* renamed from: a */
    public final C46463o mo18057a() {
        C60870cx cxVar;
        C60870cx cxVar2;
        C137929ao aoVar = this.f375250a;
        C138133o oVar = this.f375251b;
        if (oVar.f375826c != aoVar.f375265g.getAndSet(oVar.f375826c)) {
            cxVar = C47638k.m84750a((List) Collection.EL.stream(aoVar.f375261c).map(C137925ak.f375256a).collect(Collectors.toCollection(C137922ah.f375253a))).mo51520a(C137926al.f375257a, aoVar.f375262d);
        } else {
            cxVar = C60866ct.f164955a;
        }
        C47558bi a = C47831fm.m85006a("DataService getSuggestions");
        try {
            C138001s sVar = aoVar.f375260b;
            String str = oVar.f375825b;
            if (oVar.f375833j && str.isEmpty()) {
                C60870cx d = sVar.f375440l.mo46042d();
                C137989g gVar = new C137989g(sVar, oVar);
                cxVar2 = C60922j.m93045h(d, C47810es.m84966f(gVar), sVar.f375431c);
            } else {
                cxVar2 = sVar.mo114072a(oVar);
            }
            C47633f i = C47633f.m84733g(cxVar).mo51516i(new C137919ae(cxVar2), aoVar.f375262d);
            a.mo51417a(i);
            a.close();
            return new C46463o(new C60817ay(i));
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
