package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90062dn;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.aq */
/* compiled from: PG */
public final /* synthetic */ class C110467aq implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C110473aw f307962a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f307963b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f307964c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f307965d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f307966e;

    public /* synthetic */ C110467aq(C110473aw awVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4) {
        this.f307962a = awVar;
        this.f307963b = cxVar;
        this.f307964c = cxVar2;
        this.f307965d = cxVar3;
        this.f307966e = cxVar4;
    }

    public final Object call() {
        C110473aw awVar = this.f307962a;
        C60870cx cxVar = this.f307963b;
        C60870cx cxVar2 = this.f307964c;
        C60870cx cxVar3 = this.f307965d;
        C60870cx cxVar4 = this.f307966e;
        boolean z = true;
        awVar.f307983l.mo98678d(((C86124t) awVar.f307976e.mo27525b()).mo79746e(C90062dn.f249202a) && ((Boolean) C60856cj.m92909r(cxVar)).booleanValue());
        if (!((Boolean) C60856cj.m92909r(cxVar2)).booleanValue() || !((Boolean) C60856cj.m92909r(cxVar3)).booleanValue() || !((Boolean) C60856cj.m92909r(cxVar4)).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
