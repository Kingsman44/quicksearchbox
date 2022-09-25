package com.google.apps.tiktok.dataservice;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60801ai;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.dataservice.ao */
/* compiled from: PG */
public final /* synthetic */ class C46697ao implements C60801ai {

    /* renamed from: a */
    public final /* synthetic */ C46723bg f121984a;

    /* renamed from: b */
    public final /* synthetic */ C46788de f121985b;

    /* renamed from: c */
    public final /* synthetic */ long f121986c;

    /* renamed from: d */
    public final /* synthetic */ C46689ag f121987d;

    public /* synthetic */ C46697ao(C46723bg bgVar, C46788de deVar, long j, C46689ag agVar) {
        this.f121984a = bgVar;
        this.f121985b = deVar;
        this.f121986c = j;
        this.f121987d = agVar;
    }

    /* renamed from: a */
    public final C60817ay mo20982a(C60812at atVar, Object obj) {
        C46723bg bgVar = this.f121984a;
        C46788de deVar = this.f121985b;
        long j = this.f121986c;
        C46689ag agVar = this.f121987d;
        C46688af afVar = (C46688af) obj;
        if (C46723bg.m83266d(afVar, deVar, j)) {
            return new C60817ay(C60856cj.m92900i(afVar.mo50739f()));
        }
        C47558bi a = C47831fm.m85006a("getDataAsFuture fetch");
        try {
            C60870cx b = agVar.mo18087b();
            a.mo51417a(b);
            a.close();
            bgVar.f122042a.mo50787a(b, agVar.mo18088c());
            return new C46463o(new C60817ay(b).mo57273f(C47810es.m84968h(new C46695am(agVar)), C60826bg.f164896a)).f121591a.mo57272e(C47810es.m84970j(new C46696an(deVar, j)), C60826bg.f164896a);
        } catch (Throwable th) {
            C46694al.m83218a(th, th);
        }
        throw th;
    }
}
