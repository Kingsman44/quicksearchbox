package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.C28812d;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.download.d.be */
/* compiled from: PG */
public final /* synthetic */ class C28890be implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78465a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f78466b;

    /* renamed from: c */
    public final /* synthetic */ C29392ep f78467c;

    public /* synthetic */ C28890be(C29117fe feVar, AtomicReference atomicReference, C29392ep epVar) {
        this.f78465a = feVar;
        this.f78466b = atomicReference;
        this.f78467c = epVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78465a;
        AtomicReference atomicReference = this.f78466b;
        C29392ep epVar = this.f78467c;
        Exception exc = (Exception) obj;
        C29334dr drVar = (C29334dr) atomicReference.get();
        if (drVar == null) {
            drVar = C29334dr.f79497w;
        }
        C60870cx cxVar = C60866ct.f164955a;
        if (exc instanceof C28738bp) {
            C29045l.m53930b("%s: Logging DownloadException", "FileGroupManager");
            C29004du duVar = new C29004du(feVar, epVar, (C28738bp) exc, drVar);
            cxVar = C60922j.m93045h(cxVar, C47810es.m84966f(duVar), feVar.f78980i);
        } else if (exc instanceof C28812d) {
            C29045l.m53930b("%s: Logging AggregateException", "FileGroupManager");
            C58485gu guVar = ((C28812d) exc).f78281a;
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                Throwable th = (Throwable) guVar.get(i);
                if (!(th instanceof C28738bp)) {
                    C29045l.m53935g("%s: Expecting DownloadException's in AggregateException", "FileGroupManager");
                } else {
                    C29006dw dwVar = new C29006dw(feVar, epVar, (C28738bp) th, drVar);
                    cxVar = C60922j.m93045h(cxVar, C47810es.m84966f(dwVar), feVar.f78980i);
                }
            }
        }
        C29007dx dxVar = new C29007dx(exc);
        return C60922j.m93045h(cxVar, C47810es.m84966f(dxVar), feVar.f78980i);
    }
}
