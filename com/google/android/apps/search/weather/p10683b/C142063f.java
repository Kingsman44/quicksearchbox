package com.google.android.apps.search.weather.p10683b;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4060h.p4075e.p4076a.C54263a;
import com.google.p4017at.p4060h.p4075e.p4076a.C54266b;
import com.google.p4184bj.p4204d.p4205a.p4209d.C56016b;

/* renamed from: com.google.android.apps.search.weather.b.f */
/* compiled from: PG */
public final /* synthetic */ class C142063f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C142065h f385440a;

    /* renamed from: b */
    public final /* synthetic */ C54266b f385441b;

    public /* synthetic */ C142063f(C142065h hVar, C54266b bVar) {
        this.f385440a = hVar;
        this.f385441b = bVar;
    }

    public final C60870cx apply(Object obj) {
        C142065h hVar = this.f385440a;
        C54266b bVar = this.f385441b;
        hVar.f385444a = (C56016b) obj;
        C54263a aVar = (C54263a) bVar.toBuilder();
        if (hVar.f385444a != C56016b.UNSPECIFIED_TEMPERATURE_UNIT) {
            boolean z = hVar.f385444a == C56016b.CELSIUS;
            aVar.copyOnWrite();
            C54266b bVar2 = (C54266b) aVar.instance;
            bVar2.f142489a |= 4;
            bVar2.f142492d = z;
        }
        return C47633f.m84733g(hVar.f385446c.f385449c.mo50345e((C54266b) aVar.build())).mo51515h(new C142062e(hVar), hVar.f385446c.f385454h);
    }
}
