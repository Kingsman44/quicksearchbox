package com.google.android.libraries.search.p3005i;

import android.text.TextUtils;
import com.google.android.libraries.search.assistant.p2822w.p2823a.C36781b;
import com.google.android.libraries.search.p3005i.C38411ab;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.i.u */
/* compiled from: PG */
public final /* synthetic */ class C38477u implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38411ab f101819a;

    public /* synthetic */ C38477u(C38411ab abVar) {
        this.f101819a = abVar;
    }

    public final C60870cx apply(Object obj) {
        C38411ab abVar = this.f101819a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C46108a aVar : (List) obj) {
            String e = abVar.f101679k.mo50217e(aVar.mo50210b());
            if (!TextUtils.isEmpty(e)) {
                Map jp = ((C38411ab.C38412a) C47245e.m84045a(abVar.f101670b, C38411ab.C38412a.class, aVar.mo50209a())).mo41415jp();
                if (jp.containsKey(C65753ak.PORTABLE_PROVIDER)) {
                    arrayList2.add(e);
                    arrayList.add(((C36781b) jp.get(C65753ak.PORTABLE_PROVIDER)).mo40394a());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return C60856cj.m92900i(C58729pv.f156485a);
        }
        return C47638k.m84752c(arrayList).mo51520a(new C38482z(arrayList2, new HashMap(), arrayList), abVar.f101678j);
    }
}
