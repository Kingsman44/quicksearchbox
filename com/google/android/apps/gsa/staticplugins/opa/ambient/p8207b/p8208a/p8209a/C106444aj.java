package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.assistant.p3886c.p3887a.C50677m;
import com.google.assistant.p3886c.p3887a.C50678n;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C106444aj implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C106447am f296903a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f296904b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f296905c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f296906d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f296907e;

    public /* synthetic */ C106444aj(C106447am amVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4) {
        this.f296903a = amVar;
        this.f296904b = cxVar;
        this.f296905c = cxVar2;
        this.f296906d = cxVar3;
        this.f296907e = cxVar4;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C106447am amVar = this.f296903a;
        C60870cx cxVar = this.f296904b;
        C60870cx cxVar2 = this.f296905c;
        C60870cx cxVar3 = this.f296906d;
        C60870cx cxVar4 = this.f296907e;
        C58485gu guVar = (C58485gu) C60856cj.m92909r(cxVar);
        Boolean bool = (Boolean) C60856cj.m92909r(cxVar3);
        C50677m mVar = (C50677m) ((Optional) C60856cj.m92909r(cxVar2)).map(C106440af.f296898a).orElse((C50677m) C50678n.f131835l.createBuilder());
        long epochMilli = amVar.f296915g.mo57444a().toEpochMilli();
        mVar.copyOnWrite();
        C50678n nVar = (C50678n) mVar.instance;
        nVar.f131837a |= 1;
        nVar.f131839c = epochMilli;
        mVar.copyOnWrite();
        C50678n nVar2 = (C50678n) mVar.instance;
        C62971cq cqVar = nVar2.f131838b;
        if (!cqVar.mo58948c()) {
            nVar2.f131838b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) nVar2.f131838b);
        boolean booleanValue = ((C106446al) C60856cj.m92909r(cxVar4)).mo95535b().booleanValue();
        mVar.copyOnWrite();
        C50678n nVar3 = (C50678n) mVar.instance;
        nVar3.f131837a |= 64;
        nVar3.f131846j = booleanValue;
        C50678n nVar4 = (C50678n) mVar.build();
        ((C58970a) ((C58970a) amVar.f296910b.mo56224b()).mo56372aa(23078)).mo56393w("V0 app suggestions count %d, V1 AppEventSummaries count: %d.", nVar4.f131838b.size(), nVar4.f131840d.size());
        amVar.f296917i.mo109947t(amVar.f296914f.mo79746e(C90017bw.f247885a), amVar.f296916h.mo95540a().isPresent(), bool.booleanValue(), nVar4.f131841e > 0, nVar4.f131845i > 0);
        String F = amVar.f296913e.mo79659F();
        if (F == null) {
            return C60856cj.m92899h(new Exception("User not signed in."));
        }
        if (nVar4.f131838b.size() > 0 || nVar4.f131840d.size() > 0) {
            if (amVar.f296914f.mo79746e(C90017bw.f247885a)) {
                int i = nVar4.f131837a;
            }
            return amVar.f296911c.d(F, C65753ak.SMARTSPACE_HEADPHONE_APP_USAGE_MODEL, amVar.f296912d.b("type.googleapis.com/com.google.android.apps.gsa.staticplugins.opa.ambient.context.headset.appusage.HeadphoneAppUsage", nVar4.toByteString(), String.valueOf(nVar4.f131844h)), false);
        }
        ((C58970a) ((C58970a) amVar.f296910b.mo56224b()).mo56372aa(23081)).mo56386p("Skip saving model, no model data available");
        return C60866ct.f164955a;
    }
}
