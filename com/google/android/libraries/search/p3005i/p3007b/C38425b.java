package com.google.android.libraries.search.p3005i.p3007b;

import android.accounts.Account;
import com.google.android.libraries.geller.p1818f.C21836bs;
import com.google.apps.tiktok.p3644h.C47103a;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p5129p.p5131b.C65813cq;

/* renamed from: com.google.android.libraries.search.i.b.b */
/* compiled from: PG */
public final /* synthetic */ class C38425b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C38428e f101708a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f101709b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f101710c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f101711d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f101712e;

    /* renamed from: f */
    public final /* synthetic */ String f101713f;

    /* renamed from: g */
    public final /* synthetic */ C65813cq f101714g;

    public /* synthetic */ C38425b(C38428e eVar, C58528ij ijVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, String str, C65813cq cqVar) {
        this.f101708a = eVar;
        this.f101709b = ijVar;
        this.f101710c = cxVar;
        this.f101711d = cxVar2;
        this.f101712e = cxVar3;
        this.f101713f = str;
        this.f101714g = cqVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C38428e eVar = this.f101708a;
        C58528ij ijVar = this.f101709b;
        C60870cx cxVar = this.f101710c;
        C60870cx cxVar2 = this.f101711d;
        C60870cx cxVar3 = this.f101712e;
        String str = this.f101713f;
        C65813cq cqVar = this.f101714g;
        C58528ij F = C58528ij.m90006F(C58758qx.m90645c(ijVar, eVar.f101718b));
        if (F.isEmpty()) {
            return C60856cj.m92900i(C58729pv.f156485a);
        }
        ((C59052c) ((C59052c) C38428e.f101717a.mo56224b()).mo56372aa(53106)).mo56389s("Attempting to cache the data for enabled corpora %s.", F);
        String str2 = ((C47103a) C60856cj.m92909r(cxVar2)).f122701a;
        return ((C21836bs) C60856cj.m92909r(cxVar3)).mo27141b((Account) C60856cj.m92909r(cxVar), str2, str, F, cqVar, 2, false);
    }
}
