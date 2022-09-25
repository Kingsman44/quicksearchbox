package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1020b;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12973ae;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13020ah;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13023ak;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13648a;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13650b;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13702o;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13703p;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13708u;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1019a.C13660a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.function.Supplier;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.d.b.c */
/* compiled from: PG */
public final class C13665c implements C13663a {

    /* renamed from: a */
    private static final C59071e f41714a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.j.c.d.b.c");

    /* renamed from: b */
    private final C13660a f41715b;

    /* renamed from: c */
    private final C13708u f41716c;

    /* renamed from: d */
    private final C69464a f41717d;

    /* renamed from: e */
    private final Executor f41718e;

    public C13665c(C13660a aVar, C13708u uVar, C69464a aVar2, Executor executor) {
        this.f41715b = aVar;
        this.f41716c = uVar;
        this.f41717d = aVar2;
        this.f41718e = executor;
    }

    /* renamed from: a */
    public final C60870cx mo21206a(C12986d dVar, Supplier supplier) {
        C13020ah ahVar;
        C59071e eVar = f41714a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AapRequestInterceptor");
        ((C59052c) ((C59052c) b).mo56372aa(44915)).mo56386p("#interceptOrPassthrough");
        if (((Boolean) this.f41717d.mo17428b()).booleanValue() && this.f41715b.f41711b.get() && dVar.f40368b == 2) {
            C13023ak akVar = ((C12973ae) dVar.f40369c).f40348b;
            if (akVar == null) {
                akVar = C13023ak.f40447c;
            }
            if (akVar.f40449a == 2) {
                ahVar = (C13020ah) akVar.f40450b;
            } else {
                ahVar = C13020ah.f40439c;
            }
            C51805du duVar = ahVar.f40442b;
            if (duVar == null) {
                duVar = C51805du.f135924e;
            }
            if (duVar.f135927b.equals("message_notification.READ")) {
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "AapRequestInterceptor");
                ((C59052c) ((C59052c) b2).mo56372aa(44917)).mo56389s("Intercepting and delegating request to connected assistant: %s", dVar);
                C13708u uVar = this.f41716c;
                C13648a aVar = (C13648a) C13650b.f41690e.createBuilder();
                C12991i iVar = dVar.f40370d;
                if (iVar == null) {
                    iVar = C12991i.f40380k;
                }
                aVar.copyOnWrite();
                C13650b bVar = (C13650b) aVar.instance;
                iVar.getClass();
                bVar.f41695d = iVar;
                bVar.f41692a |= 1;
                if (dVar.f40368b == 2) {
                    C12973ae aeVar = (C12973ae) dVar.f40369c;
                    aVar.copyOnWrite();
                    C13650b bVar2 = (C13650b) aVar.instance;
                    aeVar.getClass();
                    bVar2.f41694c = aeVar;
                    bVar2.f41693b = 2;
                }
                C13702o oVar = (C13702o) C13703p.f41793f.createBuilder();
                oVar.copyOnWrite();
                C13703p pVar = (C13703p) oVar.instance;
                C13650b bVar3 = (C13650b) aVar.build();
                bVar3.getClass();
                pVar.f41797c = bVar3;
                pVar.f41796b = 7;
                return C60922j.m93044g(uVar.mo21211a((C13703p) oVar.build()), C47810es.m84963c(C13664b.f41713a), this.f41718e);
            }
        }
        C59104x b3 = eVar.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "AapRequestInterceptor");
        ((C59052c) ((C59052c) b3).mo56372aa(44916)).mo56386p("Executing the default action");
        return (C60870cx) supplier.get();
    }
}
