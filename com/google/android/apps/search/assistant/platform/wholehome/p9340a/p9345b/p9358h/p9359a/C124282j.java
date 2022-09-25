package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9359a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124204t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3741aa.C48130a;
import com.google.assistant.p3741aa.C48168c;
import com.google.assistant.p3741aa.C48169d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.HashMap;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.a.j */
/* compiled from: PG */
public final /* synthetic */ class C124282j implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124293u f343108a;

    /* renamed from: b */
    public final /* synthetic */ C124204t f343109b;

    public /* synthetic */ C124282j(C124293u uVar, C124204t tVar) {
        this.f343108a = uVar;
        this.f343109b = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124293u uVar = this.f343108a;
        C124204t tVar = this.f343109b;
        C48169d dVar = tVar.f342963b;
        if (dVar == null) {
            dVar = C48169d.f124635g;
        }
        if (dVar.f124638b) {
            return C60856cj.m92899h(new IllegalArgumentException("Only non-local execution is allowed."));
        }
        HashMap hashMap = new HashMap();
        for (C48168c cVar : dVar.f124642f) {
            C48130a aVar = (C48130a) dVar.toBuilder();
            aVar.copyOnWrite();
            ((C48169d) aVar.instance).f124642f = C48169d.emptyProtobufList();
            aVar.copyOnWrite();
            C48169d dVar2 = (C48169d) aVar.instance;
            dVar2.f124637a |= 2;
            dVar2.f124639c = "temporary_phone_device_id";
            aVar.copyOnWrite();
            C48169d dVar3 = (C48169d) aVar.instance;
            cVar.getClass();
            dVar3.mo53142a();
            dVar3.f124642f.add(cVar);
            C124292t tVar2 = new C124292t(cVar.f124632b);
            C60870cx h = C60922j.m93045h(uVar.f343125d, C47810es.m84966f(new C124278f(tVar2)), uVar.f343126e);
            C60870cx b = C47638k.m84753d(uVar.f343125d, h).mo51521b(new C124279g(uVar, h, (C48169d) aVar.build()), uVar.f343126e);
            b.mo4106b(C47810es.m84977q(new C124280h(uVar, tVar2)), uVar.f343126e);
            hashMap.put(cVar.f124632b, b);
        }
        return C47636i.m84743b(hashMap.values()).mo51519b(new C124281i(tVar, hashMap), uVar.f343126e);
    }
}
