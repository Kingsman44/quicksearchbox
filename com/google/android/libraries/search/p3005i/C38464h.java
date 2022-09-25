package com.google.android.libraries.search.p3005i;

import android.text.TextUtils;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.function.BiFunction;

/* renamed from: com.google.android.libraries.search.i.h */
/* compiled from: PG */
public final /* synthetic */ class C38464h implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f101793a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f101794b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f101795c;

    /* renamed from: d */
    public final /* synthetic */ BiFunction f101796d;

    public /* synthetic */ C38464h(C60870cx cxVar, C65753ak akVar, C60870cx cxVar2, BiFunction biFunction) {
        this.f101793a = cxVar;
        this.f101794b = akVar;
        this.f101795c = cxVar2;
        this.f101796d = biFunction;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar = this.f101793a;
        C65753ak akVar = this.f101794b;
        C60870cx cxVar2 = this.f101795c;
        BiFunction biFunction = this.f101796d;
        String str = (String) C60856cj.m92909r(cxVar);
        if (!TextUtils.isEmpty(str) || TextUtils.indexOf(akVar.name(), "GDD") == 0) {
            return (C60870cx) biFunction.apply((Geller) C60856cj.m92909r(cxVar2), C58837ba.m90858g(str));
        }
        return C60856cj.m92899h(new GellerException(C62722b.INVALID_ARGUMENT, "Account name is null."));
    }
}
