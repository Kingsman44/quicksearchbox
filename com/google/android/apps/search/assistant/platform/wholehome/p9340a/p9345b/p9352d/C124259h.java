package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9352d;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124201q;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124203s;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124204t;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9353e.p9354a.C124262b;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.C124294b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3741aa.C48168c;
import com.google.assistant.p3741aa.C48169d;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import p3186j$.util.Map;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.d.h */
/* compiled from: PG */
public final class C124259h extends C124201q {

    /* renamed from: a */
    public static final C59071e f343076a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.wholehome.a.b.d.h");

    /* renamed from: b */
    public final Executor f343077b;

    /* renamed from: c */
    public final C124262b f343078c;

    /* renamed from: d */
    private final C124294b f343079d;

    public C124259h(C124294b bVar, C124262b bVar2, Executor executor) {
        this.f343079d = bVar;
        this.f343078c = bVar2;
        this.f343077b = new C60904dr(executor);
    }

    /* renamed from: b */
    public final void mo106324b(C48169d dVar, C70862aj ajVar) {
        C52076ei eiVar;
        C52076ei eiVar2;
        String str;
        this.f343078c.f343081a.mo19974a(C37176a.f97101fG);
        HashMap hashMap = new HashMap();
        for (C48168c cVar : dVar.f124642f) {
            for (C52083ep epVar : cVar.f124633c) {
                if (epVar.f136692b == 4) {
                    eiVar = (C52076ei) epVar.f136693c;
                } else {
                    eiVar = C52076ei.f136664f;
                }
                if ((eiVar.f136666a & 1) != 0) {
                    if (epVar.f136692b == 4) {
                        eiVar2 = (C52076ei) epVar.f136693c;
                    } else {
                        eiVar2 = C52076ei.f136664f;
                    }
                    C52428rj rjVar = eiVar2.f136667b;
                    if (rjVar == null) {
                        rjVar = C52428rj.f137558m;
                    }
                    if ((rjVar.f137560a & 16) != 0) {
                        str = rjVar.f137564e;
                    } else {
                        str = rjVar.f137568i;
                    }
                    Map.EL.putIfAbsent(hashMap, str, new ArrayList());
                    ((List) hashMap.get(str)).add(Integer.valueOf(epVar.f136694d));
                }
            }
        }
        String uuid = UUID.randomUUID().toString();
        C124203s sVar = (C124203s) C124204t.f342960c.createBuilder();
        sVar.copyOnWrite();
        uuid.getClass();
        ((C124204t) sVar.instance).f342962a = uuid;
        sVar.copyOnWrite();
        ((C124204t) sVar.instance).f342963b = dVar;
        C60870cx a = this.f343079d.mo106360a((C124204t) sVar.build());
        C46459k.m82829b(a, "Usonia manager failed to handle remote execution request.", new Object[0]);
        C124258g gVar = new C124258g(this, uuid, ajVar, C58495hd.m89898l(hashMap));
        C60856cj.m92911t(a, C47810es.m84974n(gVar), this.f343077b);
    }

    /* renamed from: c */
    public final void mo106325c(C70862aj ajVar) {
        C46459k.m82829b(C47633f.m84733g(this.f343079d.mo106361b()).mo51516i(new C124254c(ajVar), this.f343077b).mo51514f(Throwable.class, new C124255d(ajVar), this.f343077b), "Usonia manager failed to handle get remote device state request.", new Object[0]);
    }
}
