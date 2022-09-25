package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119937f;
import com.google.android.libraries.search.assistant.p2585i.p2586a.C33477a;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.amf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62974ct;
import com.google.speech.p5208h.C66626cx;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.v */
/* compiled from: PG */
public final /* synthetic */ class C120380v implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C120382x f334880a;

    public /* synthetic */ C120380v(C120382x xVar) {
        this.f334880a = xVar;
    }

    public final Object call() {
        C66626cx cxVar;
        C120382x xVar = this.f334880a;
        C119937f fVar = (C119937f) C60856cj.m92909r(xVar.f334885c);
        Optional optional = (Optional) C60856cj.m92909r(xVar.f334884b);
        C66626cx cxVar2 = C66626cx.PHONE;
        try {
            C51715bm bmVar = (C51715bm) C33477a.f89593b.mo38882c(fVar.mo104571a().f136712a);
            amf amf = bmVar.f135667d;
            if (amf == null) {
                amf = amf.f135365e;
            }
            if ((amf.f135367a & 2) != 0) {
                amf amf2 = bmVar.f135667d;
                if (amf2 == null) {
                    amf2 = amf.f135365e;
                }
                cxVar = C120382x.m199405b(amf2.f135369c);
            } else {
                if ((bmVar.f135664a & 2) != 0) {
                    cxVar = C120382x.m199405b(bmVar.f135666c);
                }
                C59104x b = C120382x.f334883a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
                ((C59052c) ((C59052c) b).mo56372aa(34677)).mo56389s("#createMutator: building cloud arbitration request. Device type is: %s", cxVar2);
                return new C120381w(optional, cxVar2);
            }
            cxVar2 = cxVar;
            C59104x b2 = C120382x.f334883a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
            ((C59052c) ((C59052c) b2).mo56372aa(34677)).mo56389s("#createMutator: building cloud arbitration request. Device type is: %s", cxVar2);
        } catch (C62974ct e) {
            C59104x c = C120382x.f334883a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(34678)).mo56386p("#createMutator: failed to parse DeviceCapabilities");
        }
        return new C120381w(optional, cxVar2);
    }
}
