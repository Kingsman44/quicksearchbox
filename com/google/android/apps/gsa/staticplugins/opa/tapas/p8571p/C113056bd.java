package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48716bx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.bd */
/* compiled from: PG */
public final /* synthetic */ class C113056bd implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C113071bs f313265a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f313266b;

    public /* synthetic */ C113056bd(C113071bs bsVar, C60870cx cxVar) {
        this.f313265a = bsVar;
        this.f313266b = cxVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C113071bs bsVar = this.f313265a;
        C60870cx cxVar = this.f313266b;
        Optional optional = (Optional) obj;
        if (bsVar.f313289d.mo79746e(C90063do.f249332bY)) {
            long longValue = ((Long) C60856cj.m92909r(cxVar)).longValue();
            if (!optional.isEmpty()) {
                String F = bsVar.f313294i.mo79659F();
                if (F == null) {
                    C58976aa aaVar = C58975e.f156826a;
                } else {
                    C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
                    C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
                    cVar.copyOnWrite();
                    C65139d dVar = (C65139d) cVar.instance;
                    dVar.f176309a |= 1;
                    dVar.f176310b = longValue;
                    ayVar.copyOnWrite();
                    C65768az azVar = (C65768az) ayVar.instance;
                    C65139d dVar2 = (C65139d) cVar.build();
                    dVar2.getClass();
                    azVar.f178796b = dVar2;
                    azVar.f178795a |= 1;
                    C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
                    gVar.copyOnWrite();
                    ((C63070h) gVar.instance).f170217a = "type.googleapis.com/android.apps.gsa.staticplugins.opa.tapas.userprofile.TapasUserProfileProto.TapasOnDeviceUserProfileLogEntry";
                    C63088z byteString = ((C48716bx) optional.get()).toByteString();
                    gVar.copyOnWrite();
                    byteString.getClass();
                    ((C63070h) gVar.instance).f170218b = byteString;
                    ayVar.copyOnWrite();
                    C65768az azVar2 = (C65768az) ayVar.instance;
                    C63070h hVar = (C63070h) gVar.build();
                    hVar.getClass();
                    azVar2.f178799e = hVar;
                    azVar2.f178795a |= 8;
                    C121537f fVar = C113071bs.f313287b;
                    C60870cx d = bsVar.f313295j.d(F, C113071bs.f313288c, (C65768az) ayVar.build(), false);
                    fVar.mo105244m("writeUserProfileToGeller", d);
                    C90875ai.m148465b(C113060bh.f313271a, d, bsVar.f313290e, "Writing TapasUserProfile to Geller").mo85223a(C113061bi.f313272a);
                }
            }
            bsVar.mo99839j(Optional.empty());
            return null;
        }
        bsVar.mo99839j(optional);
        return null;
    }
}
