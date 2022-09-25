package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.C28747by;
import com.google.android.libraries.mdi.download.C28789cd;
import com.google.android.libraries.mdi.download.C28791cf;
import com.google.android.libraries.mdi.download.C28795cj;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65808cl;
import com.google.protos.p5129p.p5131b.C65815cs;
import com.google.protos.p5129p.p5131b.C65855x;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.h.b.n */
/* compiled from: PG */
public final /* synthetic */ class C29567n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29576w f80110a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f80111b;

    /* renamed from: c */
    public final /* synthetic */ C65855x f80112c;

    public /* synthetic */ C29567n(C29576w wVar, C58833ax axVar, C65855x xVar) {
        this.f80110a = wVar;
        this.f80111b = axVar;
        this.f80112c = xVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C58833ax axVar;
        C60870cx cxVar2;
        C28791cf cfVar;
        C29576w wVar = this.f80110a;
        C58833ax axVar2 = this.f80111b;
        C58495hd hdVar = (C58495hd) obj;
        C65808cl clVar = this.f80112c.f179025d;
        if (clVar == null) {
            clVar = C65808cl.f178897d;
        }
        int a = C65815cs.m96813a(clVar.f178901c);
        if (a == 0) {
            a = 2;
        }
        if (a != 4) {
            cxVar = C60856cj.m92900i(C58836b.f156633a);
        } else if (!axVar2.mo56113h()) {
            cxVar = C60856cj.m92899h(new IllegalArgumentException());
        } else {
            cxVar = C60856cj.m92900i(axVar2);
        }
        C60870cx a2 = C28738bp.m53591a(cxVar, C28737bo.GDD_MISSING_ACCOUNT_FOR_PRIVATE_SYNC, "Received gaia-scoped elements but account is unavailable");
        C60870cx a3 = C28738bp.m53591a(C60856cj.m92896e(wVar.mo34771f((List) hdVar.getOrDefault("current-active", new ArrayList()))), C28737bo.GDD_INVALID_CURRENT_ACTIVE_ELEMENT_DATA, "Received invalid data in current-active element");
        C60870cx a4 = C28738bp.m53591a(C60856cj.m92896e(wVar.mo34771f((List) hdVar.getOrDefault("next-pending", new ArrayList()))), C28737bo.GDD_INVALID_NEXT_PENDING_ELEMENT_DATA, "Received invalid data in next-pending element");
        if (hdVar.containsKey("inline-payload")) {
            axVar = C58833ax.m90834k((C65768az) ((List) hdVar.get("inline-payload")).get(0));
        } else {
            axVar = C58836b.f156633a;
        }
        if (!axVar.mo56113h()) {
            cxVar2 = C60856cj.m92900i(C58729pv.f156485a);
        } else {
            try {
                C28795cj b = C29576w.m54561b((C65768az) axVar.mo56107c());
                C58838bb.m90869d(b.f78253a == 2, "MddElement with inline-payload key must contain an InlinePayload");
                if (b.f78253a == 2) {
                    cfVar = (C28791cf) b.f78254b;
                } else {
                    cfVar = C28791cf.f78244b;
                }
                C62971cq<C28789cd> cqVar = cfVar.f78246a;
                C58490gz j = C58495hd.m89896j(cqVar.size());
                for (C28789cd cdVar : cqVar) {
                    int i = cdVar.f78241a;
                    int i2 = i & 1;
                    C58838bb.m90873h((i2 == 0 || (i & 2) == 0) ? false : true, "Invalid format for InlineFile, key: %s", i2 != 0 ? cdVar.f78242b : "UNKNOWN");
                    String str = cdVar.f78242b;
                    C63088z zVar = cdVar.f78243c;
                    zVar.getClass();
                    j.mo55429h(str, new C28747by(zVar));
                }
                cxVar2 = C60856cj.m92900i(j.mo55427f(true));
            } catch (C62974ct | IllegalArgumentException e) {
                cxVar2 = C60856cj.m92899h(e);
            }
        }
        C60870cx a5 = C28738bp.m53591a(cxVar2, C28737bo.GDD_INVALID_INLINE_PAYLOAD_ELEMENT_DATA, "Received invalid data in inline-payload element");
        return C29672d.m54729d(a2, a3, a4, a5).mo34824b(new C29571r(wVar, a2, a5, a3, a4), wVar.f80135a);
    }
}
