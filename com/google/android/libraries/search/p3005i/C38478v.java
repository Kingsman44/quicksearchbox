package com.google.android.libraries.search.p3005i;

import android.content.Context;
import com.google.android.libraries.geller.portable.C21938ad;
import com.google.android.libraries.geller.portable.Geller;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.i.v */
/* compiled from: PG */
public final /* synthetic */ class C38478v implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C38411ab f101820a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f101821b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f101822c;

    public /* synthetic */ C38478v(C38411ab abVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f101820a = abVar;
        this.f101821b = cxVar;
        this.f101822c = cxVar2;
    }

    public final Object call() {
        C38411ab abVar = this.f101820a;
        C60870cx cxVar = this.f101821b;
        C60870cx cxVar2 = this.f101822c;
        Context context = abVar.f101670b;
        C60887da daVar = abVar.f101671c;
        C60887da daVar2 = abVar.f101672d;
        Set set = abVar.f101680l;
        if (set == null) {
            set = C58733pz.f156496a;
        }
        C21938ad adVar = new C21938ad(context, daVar, daVar2, set);
        adVar.f60526e = abVar.f101674f;
        adVar.f60529h = abVar.f101675g;
        adVar.f60535n = abVar.f101681m;
        adVar.f60533l = C58833ax.m90834k((Map) C60856cj.m92909r(cxVar));
        adVar.f60534m = C58833ax.m90834k(new C38475s(abVar));
        Map map = (Map) C60856cj.m92909r(cxVar2);
        if (!map.isEmpty()) {
            adVar.f60531j = C58833ax.m90834k(map);
            adVar.f60532k = C58833ax.m90834k(new C38476t(abVar));
        }
        return new Geller(adVar);
    }
}
