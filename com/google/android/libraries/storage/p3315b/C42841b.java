package com.google.android.libraries.storage.p3315b;

import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60801ai;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60871cy;

/* renamed from: com.google.android.libraries.storage.b.b */
/* compiled from: PG */
public final /* synthetic */ class C42841b implements C60801ai {
    /* renamed from: a */
    public final C60817ay mo20982a(C60812at atVar, Object obj) {
        C42862q qVar = (C42862q) obj;
        C47558bi s = C47831fm.m85024s("ExecSQL: VACUUM");
        try {
            C42855j jVar = new C42855j(qVar);
            qVar.mo45948b();
            C60871cy cyVar = new C60871cy(C47810es.m84978r(new C42856k(qVar, jVar)));
            qVar.f112163b.execute(cyVar);
            s.mo51417a(cyVar);
            s.close();
            return new C60817ay(cyVar);
        } catch (Throwable th) {
            C42853h.m75709a(th, th);
        }
        throw th;
    }
}
