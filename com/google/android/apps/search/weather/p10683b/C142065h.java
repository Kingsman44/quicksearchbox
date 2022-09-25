package com.google.android.apps.search.weather.p10683b;

import androidx.core.content.C1885k;
import com.google.android.apps.search.weather.p10687f.C142089b;
import com.google.android.apps.search.weather.p10687f.C142090c;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3090o.C39829g;
import com.google.android.libraries.search.p3090o.C39830h;
import com.google.android.libraries.search.p3090o.C39838p;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4017at.p4060h.p4075e.p4076a.C54263a;
import com.google.p4017at.p4060h.p4075e.p4076a.C54266b;
import com.google.p4184bj.p4204d.p4205a.p4209d.C56016b;

/* renamed from: com.google.android.apps.search.weather.b.h */
/* compiled from: PG */
final class C142065h implements C46689ag {

    /* renamed from: a */
    C56016b f385444a = C56016b.UNSPECIFIED_TEMPERATURE_UNIT;

    /* renamed from: b */
    final /* synthetic */ C54266b f385445b;

    /* renamed from: c */
    final /* synthetic */ C142066i f385446c;

    public C142065h(C142066i iVar, C54266b bVar) {
        this.f385446c = iVar;
        this.f385445b = bVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C39838p pVar = this.f385446c.f385453g;
        C47633f h = C47633f.m84733g(pVar.mo42021a()).mo51516i(new C39829g(pVar), pVar.f104743d).mo51515h(C39830h.f104732a, C60826bg.f164896a);
        C142063f fVar = new C142063f(this, this.f385445b);
        return new C46463o(new C60817ay(C60922j.m93045h(h, C47810es.m84966f(fVar), this.f385446c.f385454h)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C60870cx cxVar;
        C54263a aVar = (C54263a) this.f385445b.toBuilder();
        if (this.f385444a != C56016b.UNSPECIFIED_TEMPERATURE_UNIT) {
            boolean z = this.f385444a == C56016b.CELSIUS;
            aVar.copyOnWrite();
            C54266b bVar = (C54266b) aVar.instance;
            bVar.f142489a |= 4;
            bVar.f142492d = z;
        }
        C142066i iVar = this.f385446c;
        if (C1885k.m5142a(iVar.f385448b, "android.permission.ACCESS_COARSE_LOCATION") == 0 || C1885k.m5142a(iVar.f385448b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            C142066i iVar2 = this.f385446c;
            cxVar = C60922j.m93044g(iVar2.f385451e.mo41550d(C39226b.TAG_WEATHER_IMMERSIVE, 2), C47810es.m84963c(new C142060c((C54266b) aVar.build())), iVar2.f385454h);
        } else {
            cxVar = C60856cj.m92900i((C54266b) aVar.build());
        }
        C142090c cVar = this.f385446c.f385450d;
        return C47633f.m84733g(C60922j.m93045h(cxVar, C47810es.m84966f(new C142089b(cVar, ((C54266b) aVar.instance).f142496h)), cVar.f385499b)).mo51516i(new C142064g(this, aVar), this.f385446c.f385454h);
    }

    /* renamed from: c */
    public final Object mo18088c() {
        return C142059b.f385436a;
    }
}
