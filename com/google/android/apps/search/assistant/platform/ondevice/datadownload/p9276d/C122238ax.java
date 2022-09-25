package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17077v;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17078w;
import com.google.android.libraries.mdi.download.C28716av;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p5488io.grpc.p5533i.C70883v;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.ax */
/* compiled from: PG */
public final /* synthetic */ class C122238ax implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122261bt f338977a;

    /* renamed from: b */
    public final /* synthetic */ C17078w f338978b;

    public /* synthetic */ C122238ax(C122261bt btVar, C17078w wVar) {
        this.f338977a = btVar;
        this.f338978b = wVar;
    }

    public final C60870cx apply(Object obj) {
        C58833ax axVar;
        C60870cx cxVar;
        C122261bt btVar = this.f338977a;
        C17078w wVar = this.f338978b;
        C58485gu j = C58485gu.m89842j((C58485gu) obj);
        C70883v vVar = btVar.f339022e;
        C47633f h = C47633f.m84733g(C60856cj.m92896e((Iterable) Collection.EL.stream(j).map(C122244bc.f338985a).collect(C58370cn.f155946a))).mo51513e(Exception.class, new C122245bd(wVar, j), btVar.f339020c).mo51515h(new C122246be(vVar, j), btVar.f339020c);
        if (wVar.f49720f) {
            C122247bf bfVar = C122247bf.f338990a;
            return C60922j.m93045h(h, C47810es.m84966f(bfVar), btVar.f339020c);
        }
        if ((wVar.f49715a & 1) != 0) {
            C28716av avVar = wVar.f49718d;
            if (avVar == null) {
                avVar = C28716av.f78018d;
            }
            axVar = C58833ax.m90834k(avVar);
        } else {
            axVar = C58836b.f156633a;
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(j).map(new C122248bg(btVar, h, axVar, vVar, j)).collect(C58370cn.f155946a);
        C60870cx e = C60856cj.m92896e(guVar);
        C122251bj bjVar = new C122251bj(vVar, j);
        C60856cj.m92911t(e, C47810es.m84974n(bjVar), btVar.f339020c);
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).map(new C122223ai(btVar)).collect(C58370cn.f155946a);
        int a = C17077v.m34239a(wVar.f49719e);
        if (a != 0 && a == 2) {
            cxVar = C60856cj.m92896e(guVar2);
        } else {
            cxVar = C60856cj.m92906o(guVar2);
        }
        C122224aj ajVar = new C122224aj(guVar2, j, vVar);
        C47633f g = C47633f.m84733g(cxVar);
        Objects.requireNonNull(ajVar);
        C47633f h2 = g.mo51515h(new C122225ak(ajVar), btVar.f339020c);
        Objects.requireNonNull(ajVar);
        return h2.mo51513e(Throwable.class, new C122226al(ajVar), btVar.f339020c);
    }
}
