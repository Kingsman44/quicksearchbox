package com.google.android.apps.gsa.staticplugins.nga.p8051e;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p5129p.p5131b.C65811co;
import com.google.protos.p5129p.p5131b.C65819cw;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.e.f */
/* compiled from: PG */
public final /* synthetic */ class C103027f implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C103028g f287622a;

    /* renamed from: b */
    public final /* synthetic */ C65811co f287623b;

    /* renamed from: c */
    public final /* synthetic */ String f287624c;

    public /* synthetic */ C103027f(C103028g gVar, C65811co coVar, String str) {
        this.f287622a = gVar;
        this.f287623b = coVar;
        this.f287624c = str;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C103028g gVar = this.f287622a;
        C65811co coVar = this.f287623b;
        String str = this.f287624c;
        Account a = gVar.f287626b.mo79668a();
        if (a == null) {
            return C60856cj.m92900i(C65819cw.f178926i);
        }
        return gVar.f287625a.mo28210j(gVar.f287625a.mo28210j(gVar.f287625a.mo28209i(gVar.f287626b.mo79671e("oauth2:https://www.googleapis.com/auth/webhistory", a, new C91032p()), "[NGA] DeeplinkGrpcHelper.getDeeplink.getToken", C103023b.f287616a), "[NGA] DeeplinkGrpcHelper.getDeeplink.getManagedChannel", new C103024c(gVar, str)), "[NGA] DeeplinkGrpcHelper.getDeeplink.getServerResponse", new C103025d(gVar, coVar));
    }
}
