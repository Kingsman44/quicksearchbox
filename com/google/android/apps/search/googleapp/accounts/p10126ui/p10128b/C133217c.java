package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b;

import com.google.android.apps.search.googleapp.customtabs.p10151c.C133693o;
import com.google.android.apps.search.googleapp.customtabs.p10151c.C133697s;
import com.google.android.apps.search.googleapp.customtabs.p10151c.C133699u;
import com.google.android.apps.search.googleapp.incognito.education.p10325a.C136252b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.c */
/* compiled from: PG */
public final /* synthetic */ class C133217c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f363090a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f363091b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f363092c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f363093d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f363094e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f363095f;

    /* renamed from: g */
    public final /* synthetic */ C60870cx f363096g;

    /* renamed from: h */
    public final /* synthetic */ C60870cx f363097h;

    public /* synthetic */ C133217c(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, C60870cx cxVar5, C60870cx cxVar6, C60870cx cxVar7, C60870cx cxVar8) {
        this.f363090a = cxVar;
        this.f363091b = cxVar2;
        this.f363092c = cxVar3;
        this.f363093d = cxVar4;
        this.f363094e = cxVar5;
        this.f363095f = cxVar6;
        this.f363096g = cxVar7;
        this.f363097h = cxVar8;
    }

    public final Object call() {
        C60870cx cxVar = this.f363090a;
        C60870cx cxVar2 = this.f363091b;
        C60870cx cxVar3 = this.f363092c;
        C60870cx cxVar4 = this.f363093d;
        C60870cx cxVar5 = this.f363094e;
        C60870cx cxVar6 = this.f363095f;
        C60870cx cxVar7 = this.f363096g;
        C60870cx cxVar8 = this.f363097h;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        C133699u uVar = (C133699u) C60856cj.m92909r(cxVar2);
        C133233p pVar = (C133233p) C60856cj.m92909r(cxVar3);
        C133697s a = C133697s.m216929a(uVar.f364175b);
        if (a == null) {
            a = C133697s.UNKNOWN;
        }
        boolean z = false;
        if (a.equals(C133697s.AVAILABLE)) {
            C133693o oVar = uVar.f364176c;
            if (oVar == null) {
                oVar = C133693o.f364157f;
            }
            if (oVar.f364160b >= 26) {
                z = true;
            }
        }
        C133693o oVar2 = uVar.f364176c;
        if (oVar2 == null) {
            oVar2 = C133693o.f364157f;
        }
        String str = oVar2.f364163e;
        boolean z2 = ((C136252b) C60856cj.m92909r(cxVar4)).f371059b;
        return new C133235r(booleanValue, z, str, !z2, pVar.f363145c, ((Boolean) C60856cj.m92909r(cxVar5)).booleanValue(), ((Boolean) C60856cj.m92909r(cxVar6)).booleanValue(), ((Boolean) C60856cj.m92909r(cxVar7)).booleanValue(), ((Boolean) C60856cj.m92909r(cxVar8)).booleanValue());
    }
}
