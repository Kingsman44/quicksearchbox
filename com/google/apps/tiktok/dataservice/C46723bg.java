package com.google.apps.tiktok.dataservice;

import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.concurrent.C46466r;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58819aj;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.dataservice.bg */
/* compiled from: PG */
public final class C46723bg {

    /* renamed from: a */
    public final C46780cx f122042a;

    /* renamed from: b */
    public final C21370a f122043b;

    public C46723bg(C46780cx cxVar, C21370a aVar) {
        this.f122042a = cxVar;
        this.f122043b = aVar;
    }

    /* renamed from: a */
    public static C46689ag m83265a(C46689ag agVar, C46689ag agVar2, C46466r rVar, Executor executor) {
        return new C46702at(agVar, agVar2, new C46699aq(rVar), executor);
    }

    /* renamed from: d */
    public static boolean m83266d(C46688af afVar, C46788de deVar, long j) {
        return afVar.f121977b.f121974b && afVar.mo50740g() && afVar.mo50736a() > j - deVar.f122159k;
    }

    /* renamed from: e */
    public static final C46463o m83267e(C46689ag agVar, String str) {
        C47558bi a = C47831fm.m85006a(str);
        try {
            C60817ay ayVar = agVar.mo18086a().f121591a;
            a.mo51417a(ayVar.mo57276h());
            C46463o oVar = new C46463o(ayVar);
            a.close();
            return oVar;
        } catch (Throwable th) {
            C46694al.m83218a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final C60870cx mo50749b(C46689ag agVar) {
        C60870cx b = agVar.mo18087b();
        this.f122042a.mo50787a(b, agVar.mo18088c());
        return C60922j.m93044g(b, new C58819aj((Object) null), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo50750c(C46689ag agVar, C46788de deVar) {
        C47558bi a = C47831fm.m85006a("getDataAsFuture");
        try {
            C60817ay f = m83267e(agVar, "First load").f121591a.mo57273f(C47810es.m84968h(new C46697ao(this, deVar, this.f122043b.mo26870b(), agVar)), C60826bg.f164896a);
            a.mo51417a(f.mo57276h());
            C60838bs g = f.mo57272e(C46698ap.f121988a, C60826bg.f164896a).mo57275g();
            a.close();
            return g;
        } catch (Throwable th) {
            C46694al.m83218a(th, th);
        }
        throw th;
    }
}
