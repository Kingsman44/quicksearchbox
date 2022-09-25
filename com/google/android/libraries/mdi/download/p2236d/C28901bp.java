package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.C28812d;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.bp */
/* compiled from: PG */
public final /* synthetic */ class C28901bp implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78500a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78501b;

    /* renamed from: c */
    public final /* synthetic */ long f78502c;

    /* renamed from: d */
    public final /* synthetic */ String f78503d;

    public /* synthetic */ C28901bp(C29117fe feVar, C29392ep epVar, long j, String str) {
        this.f78500a = feVar;
        this.f78501b = epVar;
        this.f78502c = j;
        this.f78503d = str;
    }

    public final C60870cx apply(Object obj) {
        C58485gu guVar;
        int i;
        C29117fe feVar = this.f78500a;
        C29392ep epVar = this.f78501b;
        long j = this.f78502c;
        String str = this.f78503d;
        Exception exc = (Exception) obj;
        C60870cx cxVar = C60866ct.f164955a;
        if (exc instanceof C28738bp) {
            C29045l.m53930b("%s: Logging DownloadException", "FileGroupManager");
            C28903br brVar = new C28903br(feVar, epVar, (C28738bp) exc, j, str);
            cxVar = C60922j.m93045h(cxVar, C47810es.m84966f(brVar), feVar.f78980i);
        } else if (exc instanceof C28812d) {
            C29045l.m53930b("%s: Logging AggregateException", "FileGroupManager");
            C58485gu guVar2 = ((C28812d) exc).f78281a;
            int size = guVar2.size();
            C60870cx cxVar2 = cxVar;
            int i2 = 0;
            while (i2 < size) {
                Throwable th = (Throwable) guVar2.get(i2);
                if (!(th instanceof C28738bp)) {
                    C29045l.m53935g("%s: Expecting DownloadExceptions in AggregateException", "FileGroupManager");
                    i = size;
                    guVar = guVar2;
                } else {
                    i = size;
                    guVar = guVar2;
                    C28904bs bsVar = new C28904bs(feVar, epVar, (C28738bp) th, j, str);
                    cxVar2 = C60922j.m93045h(cxVar2, C47810es.m84966f(bsVar), feVar.f78980i);
                }
                i2++;
                size = i;
                guVar2 = guVar;
            }
            cxVar = cxVar2;
        }
        C28906bu buVar = new C28906bu(exc);
        return C60922j.m93045h(cxVar, C47810es.m84966f(buVar), feVar.f78980i);
    }
}
