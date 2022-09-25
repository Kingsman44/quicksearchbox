package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.account.api.controller.bn */
/* compiled from: PG */
public final class C46003bn {

    /* renamed from: a */
    public final C46325t f120842a;

    /* renamed from: b */
    public final Set f120843b;

    /* renamed from: c */
    private final Map f120844c;

    /* renamed from: d */
    private final Map f120845d;

    /* renamed from: e */
    private final Map f120846e;

    /* renamed from: f */
    private final C45966ad f120847f;

    public C46003bn(C46325t tVar, Map map, Map map2, Map map3, Set set, C45966ad adVar) {
        this.f120842a = tVar;
        this.f120844c = map;
        this.f120845d = map2;
        this.f120846e = map3;
        this.f120843b = set;
        this.f120847f = adVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C58485gu mo50136a(List list) {
        if (list == null) {
            return this.f120847f.mo50121e();
        }
        if (list.isEmpty()) {
            return C58485gu.m89845m();
        }
        C58480gp f = C58485gu.m89838f(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            C69464a aVar = (C69464a) this.f120846e.get(cls);
            C58838bb.m90867b(aVar, "No override requirement registered for key: %s", cls);
            f.mo55395g((C45964ab) aVar.mo17428b());
        }
        return f.mo55394f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo50137b(C45981as asVar, List list) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (C45978ap.class.isAssignableFrom(cls)) {
                C58838bb.m90887v(!C45980ar.class.isAssignableFrom(cls), "An account selector should only implement either AutoSelectorKey or InteractiveSelectorKey, but not both. Found %s that implements both keys", cls);
                obj = this.f120844c.get(cls);
            } else if (C45980ar.class.isAssignableFrom(cls)) {
                C58838bb.m90887v(!C45978ap.class.isAssignableFrom(cls), "An account selector should only implement either AutoSelectorKey or InteractiveSelectorKey, but not both. Found %s that implements both keys", cls);
                obj = this.f120845d.get(cls);
            } else {
                throw new IllegalArgumentException("No selector registered for key: ".concat(String.valueOf(String.valueOf(cls))));
            }
            arrayList.add(new C45992bc((C69464a) obj, asVar));
        }
        return C60922j.m93045h(C46017ca.m82210a(arrayList, C46001bl.f120840a, C60826bg.f164896a), C47810es.m84966f(new C46002bm(this)), C60826bg.f164896a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C60870cx mo50138c(AccountId accountId, List list, Intent intent) {
        return C60922j.m93045h(this.f120847f.mo50123g(accountId, mo50136a(list), intent), C47810es.m84966f(new C45995bf(this, accountId)), C60826bg.f164896a);
    }
}
