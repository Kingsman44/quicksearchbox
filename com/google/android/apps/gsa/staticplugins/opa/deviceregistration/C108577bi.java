package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.assistant.p3861at.C50246pz;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bi */
/* compiled from: PG */
final class C108577bi extends C84036z {

    /* renamed from: a */
    final /* synthetic */ C108578bj f302030a;

    /* renamed from: b */
    private final C50246pz f302031b;

    /* renamed from: c */
    private final C60870cx f302032c;

    public C108577bi(C108578bj bjVar, C50246pz pzVar, C60870cx cxVar) {
        this.f302030a = bjVar;
        this.f302031b = pzVar;
        this.f302032c = cxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (!this.f302032c.isDone() || this.f302032c.isCancelled()) {
            C59104x c = C108578bj.f302033a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DeviceDiscoverySeq");
            ((C59052c) ((C59052c) c).mo56372aa(24135)).mo56386p("Send confirm to oem device request fails. Show error screen.");
            this.f302030a.f302045m = 6;
            return C58485gu.m89846n(C83875ai.m133537b(new C108634dg()));
        }
        try {
            String str = new String(((C89057m) C90877ak.m148472f(this.f302032c)).mo83036f());
            C58976aa aaVar = C58975e.f156826a;
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("errorCode")) {
                if (jSONObject.optInt("errorCode") == 0) {
                    C50246pz pzVar = this.f302031b;
                    C108549ak akVar = new C108549ak();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("confirmation-ui", pzVar.toByteArray());
                    akVar.setArguments(bundle);
                    return C58485gu.m89847o(C83875ai.m133540e(akVar, akVar.getArguments()), new C108574bf(this.f302030a));
                }
            }
            C59104x c2 = C108578bj.f302033a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "DeviceDiscoverySeq");
            ((C59052c) ((C59052c) c2).mo56372aa(24137)).mo56389s("Assistant device HTTP returned error: %s", str);
            this.f302030a.f302045m = 6;
            return C58485gu.m89846n(C83875ai.m133537b(new C108634dg()));
        } catch (Exception e) {
            C59104x c3 = C108578bj.f302033a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "DeviceDiscoverySeq");
            ((C59052c) ((C59052c) c3).mo56372aa(24138)).mo56389s("VerifyOemDeviceResponseSequence exception: %s", e.getMessage());
            this.f302030a.f302045m = 6;
            return C58485gu.m89846n(C83875ai.m133537b(new C108634dg()));
        }
    }
}
