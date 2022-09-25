package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1174a.p1175a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16380p;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16382r;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16383s;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4189b.p4190a.C55876h;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C15789c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f47022a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f47023b;

    public /* synthetic */ C15789c(C60870cx cxVar, C60870cx cxVar2) {
        this.f47022a = cxVar;
        this.f47023b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f47022a;
        C60870cx cxVar2 = this.f47023b;
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar);
        C58833ax axVar2 = (C58833ax) C60856cj.m92909r(cxVar2);
        C16380p pVar = (C16380p) C16383s.f48219e.createBuilder();
        if (axVar2.mo56113h()) {
            if (((C55876h) axVar2.mo56107c()).f148689a == 1) {
                pVar.copyOnWrite();
                C16383s sVar = (C16383s) pVar.instance;
                sVar.f48222b = 1;
                sVar.f48221a = 1 | sVar.f48221a;
            } else if (((C55876h) axVar2.mo56107c()).f148689a == 2) {
                pVar.copyOnWrite();
                C16383s sVar2 = (C16383s) pVar.instance;
                sVar2.f48222b = 2;
                sVar2.f48221a = 1 | sVar2.f48221a;
            } else {
                pVar.copyOnWrite();
                C16383s sVar3 = (C16383s) pVar.instance;
                sVar3.f48222b = 0;
                sVar3.f48221a = 1 | sVar3.f48221a;
            }
            C55876h hVar = (C55876h) axVar2.mo56107c();
            pVar.copyOnWrite();
            C16383s sVar4 = (C16383s) pVar.instance;
            hVar.getClass();
            sVar4.f48224d = hVar;
            sVar4.f48221a |= 4;
        }
        if (axVar.mo56113h()) {
            C16382r rVar = (C16382r) axVar.mo56107c();
            pVar.copyOnWrite();
            C16383s sVar5 = (C16383s) pVar.instance;
            rVar.getClass();
            sVar5.f48223c = rVar;
            sVar5.f48221a |= 2;
        }
        C16383s sVar6 = (C16383s) pVar.build();
        C59104x b = C15790d.f47024a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MapsContext");
        ((C59052c) ((C59052c) b).mo56372aa(46434)).mo56389s("Map context is %s.", sVar6);
        return sVar6;
    }
}
