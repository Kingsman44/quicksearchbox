package com.google.android.apps.gsa.staticplugins.p7850dq.p7852b;

import android.accounts.Account;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p7066m.C90125fw;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.assistant.p3897e.p3921j.C52582xb;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.gsa.staticplugins.dq.b.a */
/* compiled from: PG */
public final /* synthetic */ class C99953a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C86054o f279600a;

    /* renamed from: b */
    public final /* synthetic */ C86124t f279601b;

    /* renamed from: c */
    public final /* synthetic */ C89012aj f279602c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f279603d;

    /* renamed from: e */
    public final /* synthetic */ String f279604e;

    public /* synthetic */ C99953a(C86054o oVar, C86124t tVar, C89012aj ajVar, C60870cx cxVar, String str) {
        this.f279600a = oVar;
        this.f279601b = tVar;
        this.f279602c = ajVar;
        this.f279603d = cxVar;
        this.f279604e = str;
    }

    public final Object apply(Object obj) {
        C60870cx cxVar;
        C86054o oVar = this.f279600a;
        C86124t tVar = this.f279601b;
        C89012aj ajVar = this.f279602c;
        C60870cx cxVar2 = this.f279603d;
        String str = this.f279604e;
        C52582xb xbVar = (C52582xb) obj;
        if (!tVar.mo79746e(C90125fw.f250893J) || C99958f.m165629a(tVar, xbVar).mo56113h()) {
            cxVar = C60856cj.m92900i(BuildConfig.FLAVOR);
        } else {
            Account a = oVar.mo79668a();
            if (a == null) {
                cxVar = C60856cj.m92899h(new C70761fa(Status.f186909g, (C70334de) null, true));
            } else {
                cxVar = C60922j.m93045h(oVar.mo79671e("oauth2:https://www.googleapis.com/auth/speakr", a, new C91032p()), C99955c.f279607a, C60826bg.f164896a);
                C90476a aVar = C91018d.f254254a;
            }
        }
        C60870cx cxVar3 = cxVar;
        C60870cx e = ajVar.mo27494e(tVar.mo79758x(C90125fw.f250905V), (int) tVar.mo79743a(C90125fw.f250906W), 83);
        return C60856cj.m92893b(cxVar3, e, cxVar2).mo57334a(new C99956d(xbVar, e, cxVar3, str, cxVar2, tVar), C60826bg.f164896a);
    }
}
