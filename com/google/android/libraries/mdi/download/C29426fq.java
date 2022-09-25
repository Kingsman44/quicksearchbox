package com.google.android.libraries.mdi.download;

import com.google.android.libraries.mdi.download.p2236d.C29183hq;
import com.google.android.libraries.mdi.download.p2236d.C29211ir;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.fq */
/* compiled from: PG */
public final /* synthetic */ class C29426fq implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C29647hr f79773a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f79774b;

    /* renamed from: c */
    public final /* synthetic */ C28809cx f79775c;

    /* renamed from: d */
    public final /* synthetic */ C58480gp f79776d;

    public /* synthetic */ C29426fq(C29647hr hrVar, C29392ep epVar, C28809cx cxVar, C58480gp gpVar) {
        this.f79773a = hrVar;
        this.f79774b = epVar;
        this.f79775c = cxVar;
        this.f79776d = gpVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C29647hr hrVar = this.f79773a;
        C29392ep epVar = this.f79774b;
        C28809cx cxVar = this.f79775c;
        C58480gp gpVar = this.f79776d;
        C29211ir irVar = hrVar.f80297c;
        long a = cxVar.mo34476a();
        String g = cxVar.mo34482g();
        C58485gu f = gpVar.mo55394f();
        C58495hd e = cxVar.mo34480e();
        C58833ax c = cxVar.mo34478c();
        C60931s sVar = hrVar.f80304j;
        C29045l.m53932d("%s: importFiles %s %s", "MDDManager", epVar.f79682b, epVar.f79683c);
        C60870cx h = irVar.mo34632h();
        C29183hq hqVar = new C29183hq(irVar, epVar, a, g, f, e, c, sVar);
        return C60922j.m93045h(h, C47810es.m84966f(hqVar), irVar.f79204n);
    }
}
