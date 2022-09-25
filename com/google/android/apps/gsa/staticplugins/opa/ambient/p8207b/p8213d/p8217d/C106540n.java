package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106551f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8218e.C106547a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.n */
/* compiled from: PG */
public final /* synthetic */ class C106540n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C106544r f297091a;

    /* renamed from: b */
    public final /* synthetic */ C106551f f297092b;

    public /* synthetic */ C106540n(C106544r rVar, C106551f fVar) {
        this.f297091a = rVar;
        this.f297092b = fVar;
    }

    public final C60870cx apply(Object obj) {
        C106544r rVar = this.f297091a;
        C106551f fVar = this.f297092b;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            ((C58970a) ((C58970a) rVar.f297097a.mo56224b()).mo56372aa(23107)).mo56386p("Returning HeadsetState for first trigger");
            return ((C106547a) fVar).f297123a.mo95579e((C106532f) optional.get());
        }
        ((C58970a) ((C58970a) rVar.f297097a.mo56226d()).mo56372aa(23106)).mo56386p("Got null HeadsetState for first trigger!?");
        C106527a aVar = (C106527a) C106532f.f297078g.createBuilder();
        C106529c cVar = C106529c.CONNECTED;
        aVar.copyOnWrite();
        C106532f fVar2 = (C106532f) aVar.instance;
        fVar2.f297081b = cVar.f297070d;
        fVar2.f297080a |= 1;
        C106531e eVar = C106531e.UNKNOWN;
        aVar.copyOnWrite();
        C106532f fVar3 = (C106532f) aVar.instance;
        fVar3.f297082c = eVar.f297077e;
        fVar3.f297080a |= 4;
        return ((C106547a) fVar).f297123a.mo95579e((C106532f) aVar.build());
    }
}
