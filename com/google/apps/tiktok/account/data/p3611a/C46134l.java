package com.google.apps.tiktok.account.data.p3611a;

import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.account.data.a.l */
/* compiled from: PG */
public final /* synthetic */ class C46134l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46144v f121031a;

    public /* synthetic */ C46134l(C46144v vVar) {
        this.f121031a = vVar;
    }

    public final C60870cx apply(Object obj) {
        C46144v vVar = this.f121031a;
        Map map = (Map) obj;
        C58480gp e = C58485gu.m89837e();
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            Map map2 = (Map) map.get(str);
            C58838bb.m90883r(!map2.isEmpty());
            if (map2.size() == 1) {
                e.mo55395g((C46215j) C58557jl.m90133n(map2.values()));
            } else {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return C60856cj.m92900i(e.mo55394f());
        }
        int i = 0;
        boolean z = !((Boolean) ((C58833ax) vVar.f121052f.mo17428b()).mo56109e(false)).booleanValue();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            String str2 = (String) arrayList.get(i);
            Map map3 = (Map) map.get(str2);
            str2.getClass();
            C58838bb.m90868c(!str2.isEmpty());
            C47558bi a = C47831fm.m85006a("getAccountNameFromAccountId");
            try {
                C60870cx n = C60856cj.m92905n(C47810es.m84965e(new C46139q(vVar, str2)), vVar.f121050d);
                a.mo51417a(n);
                a.close();
                arrayList2.add(C60922j.m93044g(n, C47810es.m84963c(new C46140r(map3, z)), vVar.f121049c));
                i++;
            } catch (Throwable th) {
                C46130h.m82367a(th, th);
            }
        }
        return C60856cj.m92894c(arrayList2).mo57334a(C47810es.m84978r(new C46138p(arrayList2, e)), vVar.f121049c);
        throw th;
    }
}
