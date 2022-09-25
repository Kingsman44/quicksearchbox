package com.google.android.libraries.mdi.download;

import com.google.android.libraries.mdi.download.p2236d.p2237a.C28816c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.fo */
/* compiled from: PG */
public final /* synthetic */ class C29420fo implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29647hr f79763a;

    /* renamed from: b */
    public final /* synthetic */ C28807cv f79764b;

    public /* synthetic */ C29420fo(C29647hr hrVar, C28807cv cvVar) {
        this.f79763a = hrVar;
        this.f79764b = cvVar;
    }

    public final C60870cx apply(Object obj) {
        C29647hr hrVar = this.f79763a;
        C28807cv cvVar = this.f79764b;
        C60870cx i = C60856cj.m92900i(C58485gu.m89837e());
        for (C28816c giVar : (List) obj) {
            C29455gi giVar2 = new C29455gi(hrVar, giVar, cvVar);
            i = C60922j.m93045h(i, C47810es.m84966f(giVar2), hrVar.f80301g);
        }
        C29456gj gjVar = C29456gj.f79856a;
        return C60922j.m93044g(i, C47810es.m84963c(gjVar), hrVar.f80301g);
    }
}
