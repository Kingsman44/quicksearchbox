package com.google.android.apps.search.assistant.platform.p9080f.p9092d.p9093a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9017b.p9019b.C119695a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9017b.p9021d.C119704d;
import com.google.android.apps.search.assistant.platform.p9005b.p9041d.C120013b;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.assistant.p2703l.C34793g;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.d.a.g */
/* compiled from: PG */
public final class C120538g implements C120013b {

    /* renamed from: a */
    private static final C59071e f335212a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.f.d.a.g");

    /* renamed from: b */
    private final C119704d f335213b;

    public C120538g(C119704d dVar) {
        this.f335213b = dVar;
    }

    /* renamed from: a */
    public final C51809dy mo104623a(C51809dy dyVar) {
        ((C59052c) ((C59052c) f335212a.mo56224b()).mo56372aa(35483)).mo56386p("Enhancing client op.");
        C119704d dVar = this.f335213b;
        C69664n.m101061g(dyVar, "clientOp");
        if (!C69664n.m101066l(dyVar.f135936b, "mic.UPDATE")) {
            C59052c cVar = (C59052c) C119704d.f333516a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "ConvEngine.DynamicServices");
            cVar.mo56379ah(new C59094n(34564));
            cVar.mo56386p("Wrong client op.");
            return dyVar;
        }
        C51808dx dxVar = (C51808dx) dyVar.toBuilder();
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        C33480d dVar2 = C119695a.f333509a;
        Object a = dVar.f333519d.mo5768a();
        C69664n.m101060f(a, "<get-endpoint>(...)");
        dvVar.mo53733c(dVar2.mo38881b((C34793g) a));
        dxVar.mo53736a((C51807dw) dvVar.build());
        C62942bv build = dxVar.build();
        C69664n.m101060f(build, "clientOp\n      .toBuilde…()\n      )\n      .build()");
        return (C51809dy) build;
    }
}
