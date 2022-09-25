package com.google.android.libraries.assistant.auto.jumpboost.p668d;

import com.google.android.libraries.assistant.auto.jumpboost.p649a.p650a.C11422a;
import com.google.android.libraries.assistant.auto.jumpboost.p649a.p650a.C11423b;
import com.google.android.libraries.assistant.auto.tng.common.p900c.C13221a;
import com.google.android.libraries.search.assistant.p2828y.p2836f.C36872a;
import com.google.android.libraries.search.assistant.p2828y.p2836f.C36905d;
import com.google.android.libraries.search.assistant.p2828y.p2836f.C36906e;
import com.google.android.libraries.search.assistant.p2828y.p2836f.p2837a.C36886j;
import com.google.common.p4522b.C58479go;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import com.google.protos.p5124m.p5125a.C65603f;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.d.a */
/* compiled from: PG */
public final class C11462a implements C13221a {

    /* renamed from: a */
    private final C11463b f37252a;

    public C11462a(C11463b bVar) {
        this.f37252a = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo20001a() {
        C11422a aVar = (C11422a) this.f37252a;
        C69464a aVar2 = aVar.f37180a;
        C11465d dVar = aVar.f37181b;
        C11423b bVar = aVar.f37182c;
        if (!((Boolean) aVar2.mo17428b()).booleanValue()) {
            return bVar.f37183a.mo76968a();
        }
        C36905d e = C36906e.m65602e();
        C62971cq cqVar = ((C65603f) dVar.f37256c.mo17428b()).f178307a;
        C69664n.m101060f(cqVar, "supportedAlarmAndroidInt…ts.get().getElementList()");
        C36872a aVar3 = (C36872a) e;
        aVar3.f96026a = C58528ij.m90006F(C58479go.m89814f(cqVar));
        C62971cq cqVar2 = ((C65603f) dVar.f37257d.mo17428b()).f178307a;
        C69664n.m101060f(cqVar2, "supportedTimerAndroidInt…ts.get().getElementList()");
        aVar3.f96027b = C58528ij.m90006F(C58479go.m89814f(cqVar2));
        Object b = dVar.f37258e.mo17428b();
        C69664n.m101060f(b, "useClockAppSelectionDataServiceInPortmon.get()");
        e.mo40433b(((Boolean) b).booleanValue());
        C62971cq cqVar3 = ((C65603f) dVar.f37259f.mo17428b()).f178307a;
        C69664n.m101060f(cqVar3, "versionedClockAppsToRead…om.get().getElementList()");
        aVar3.f96028c = C58528ij.m90006F(C58479go.m89814f(cqVar3));
        C36906e a = e.mo40432a();
        C36886j jVar = dVar.f37260g;
        C60870cx b2 = jVar.f96045a.mo40451a(dVar.f37261h, dVar.f37254a, dVar.f37255b).mo40445b(a);
        C69664n.m101060f(b2, "clockContextReaderFactor…ockContext(configuration)");
        return b2;
    }
}
