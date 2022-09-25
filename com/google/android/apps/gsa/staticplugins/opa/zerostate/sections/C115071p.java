package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.p8174ab.p8177c.C105988a;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114841ck;
import com.google.assistant.p3897e.p3921j.C52429rk;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.assistant.p3897e.p3921j.C52432rn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64279a;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64300as;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64301at;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64302au;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64308b;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64330f;
import com.google.protos.p4985f.p5048z.p5053c.p5054a.C65403a;
import com.google.protos.p4985f.p5048z.p5053c.p5054a.C65405c;
import com.google.protos.p4985f.p5048z.p5053c.p5054a.C65406d;
import com.google.protos.p4985f.p5048z.p5053c.p5054a.C65408f;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5058b.C65425a;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5058b.C65426b;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.p */
/* compiled from: PG */
public final /* synthetic */ class C115071p implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115077v f319410a;

    /* renamed from: b */
    public final /* synthetic */ C64330f f319411b;

    public /* synthetic */ C115071p(C115077v vVar, C64330f fVar) {
        this.f319410a = vVar;
        this.f319411b = fVar;
    }

    public final void onClick(View view) {
        C115077v vVar = this.f319410a;
        C64330f fVar = this.f319411b;
        C114841ck ckVar = vVar.f319422b;
        C64300as asVar = fVar.f173920d;
        if (asVar == null) {
            asVar = C64300as.f173850b;
        }
        C115072q qVar = new C115072q(vVar);
        if (!ckVar.f318622c.mo56113h()) {
            C59104x d = C114841ck.f318620a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ZSHAutUtils");
            ((C59052c) ((C59052c) d).mo56372aa(29578)).mo56386p("HomeAutomation execution entry is missing.");
            return;
        }
        C64279a aVar = (C64279a) C64308b.f173874c.createBuilder();
        C64301at atVar = (C64301at) C64302au.f173853h.createBuilder();
        C62971cq cqVar = asVar.f173852a;
        atVar.copyOnWrite();
        C64302au auVar = (C64302au) atVar.instance;
        auVar.mo59270a();
        C62947c.addAll((Iterable) cqVar, (List) auVar.f173856b);
        C65425a aVar2 = (C65425a) C65426b.f177860c.createBuilder();
        C52429rk rkVar = (C52429rk) C52432rn.f137634c.createBuilder();
        C52431rm rmVar = C52431rm.OPA_AGSA;
        rkVar.copyOnWrite();
        C52432rn rnVar = (C52432rn) rkVar.instance;
        rnVar.f137637b = rmVar.f137633ah;
        rnVar.f137636a |= 1;
        aVar2.copyOnWrite();
        C65426b bVar = (C65426b) aVar2.instance;
        C52432rn rnVar2 = (C52432rn) rkVar.build();
        rnVar2.getClass();
        bVar.f177863b = rnVar2;
        bVar.f177862a |= 1;
        atVar.copyOnWrite();
        C64302au auVar2 = (C64302au) atVar.instance;
        C65426b bVar2 = (C65426b) aVar2.build();
        bVar2.getClass();
        auVar2.f173859e = bVar2;
        auVar2.f173855a |= 64;
        C65403a aVar3 = (C65403a) C65405c.f177820c.createBuilder();
        aVar3.copyOnWrite();
        C65405c cVar = (C65405c) aVar3.instance;
        cVar.f177823b = 3;
        cVar.f177822a |= 1;
        atVar.copyOnWrite();
        C64302au auVar3 = (C64302au) atVar.instance;
        C65405c cVar2 = (C65405c) aVar3.build();
        cVar2.getClass();
        auVar3.f173860f = cVar2;
        auVar3.f173855a |= 1024;
        C65406d dVar = (C65406d) C65408f.f177826c.createBuilder();
        dVar.copyOnWrite();
        C65408f fVar2 = (C65408f) dVar.instance;
        fVar2.f177829b = 3;
        fVar2.f177828a |= 1;
        atVar.copyOnWrite();
        C64302au auVar4 = (C64302au) atVar.instance;
        C65408f fVar3 = (C65408f) dVar.build();
        fVar3.getClass();
        auVar4.f173861g = fVar3;
        auVar4.f173855a |= 2048;
        aVar.copyOnWrite();
        C64308b bVar3 = (C64308b) aVar.instance;
        C64302au auVar5 = (C64302au) atVar.build();
        auVar5.getClass();
        bVar3.f173877b = auVar5;
        bVar3.f173876a = 2;
        ((C105988a) ((C68214a) ckVar.f318622c.mo56107c()).mo27525b()).mo95204a((C64308b) aVar.build(), qVar).mo95206a();
    }
}
