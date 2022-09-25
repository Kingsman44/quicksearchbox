package com.google.apps.tiktok.account.data.p3611a;

import com.google.android.gms.auth.C142903e;
import com.google.android.gms.auth.C142915o;
import com.google.android.gms.auth.p10737a.p10738a.C142840a;
import com.google.android.libraries.onegoogle.owners.C31012n;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.HashMap;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.account.data.a.v */
/* compiled from: PG */
public final class C46144v {

    /* renamed from: a */
    public static final C59071e f121047a = C59071e.m91332i("com.google.apps.tiktok.account.data.a.v");

    /* renamed from: b */
    public final C142840a f121048b;

    /* renamed from: c */
    public final C60887da f121049c;

    /* renamed from: d */
    public final C60887da f121050d;

    /* renamed from: e */
    public final C31012n f121051e;

    /* renamed from: f */
    public final C69464a f121052f;

    /* renamed from: g */
    public final C142915o f121053g;

    public C46144v(C142915o oVar, C60887da daVar, C60887da daVar2, C31012n nVar, C142840a aVar, C69464a aVar2) {
        this.f121053g = oVar;
        this.f121048b = aVar;
        this.f121050d = daVar;
        this.f121049c = daVar2;
        this.f121051e = nVar;
        this.f121052f = aVar2;
    }

    /* renamed from: b */
    public static void m82371b(String str, C46215j jVar, Map map) {
        if (!map.containsKey(str)) {
            map.put(str, new HashMap());
        } else {
            C58838bb.m90884s(!((Map) map.get(str)).containsKey(jVar.f121161f), "Found 2 accounts with the same account name.");
        }
        ((Map) map.get(str)).put(jVar.f121161f, jVar);
    }

    /* renamed from: a */
    public final C60870cx mo50223a(String str) {
        return C60846c.m92879h(C60856cj.m92905n(C47810es.m84965e(new C46143u(this, str)), this.f121050d), C142903e.class, C47810es.m84966f(new C46131i(this, str)), this.f121050d);
    }
}
