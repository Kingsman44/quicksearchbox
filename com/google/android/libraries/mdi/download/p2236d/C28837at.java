package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2237a.C28816c;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.at */
/* compiled from: PG */
public final /* synthetic */ class C28837at implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78339a;

    /* renamed from: b */
    public final /* synthetic */ C29334dr f78340b;

    /* renamed from: c */
    public final /* synthetic */ C28816c f78341c;

    public /* synthetic */ C28837at(C29117fe feVar, C29334dr drVar, C28816c cVar) {
        this.f78339a = feVar;
        this.f78340b = drVar;
        this.f78341c = cVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78339a;
        C29334dr drVar = this.f78340b;
        C28816c cVar = this.f78341c;
        C29291lq lqVar = (C29291lq) obj;
        C29045l.m53935g("%s: Missing file. Logging and deleting file group.", "FileGroupManager");
        C29117fe.m54053v(1062, feVar.f78973b, drVar);
        if (!feVar.f78984m.mo34438r()) {
            return C60866ct.f164955a;
        }
        C60870cx i = feVar.f78975d.mo34604i(cVar.mo34484b());
        C29079et etVar = C29079et.f78921a;
        return C60922j.m93045h(i, C47810es.m84966f(etVar), feVar.f78980i);
    }
}
