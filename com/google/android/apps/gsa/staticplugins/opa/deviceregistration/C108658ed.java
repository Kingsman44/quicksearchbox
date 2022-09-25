package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ed */
/* compiled from: PG */
final class C108658ed extends C84036z {

    /* renamed from: a */
    final /* synthetic */ C108660ef f302211a;

    /* renamed from: b */
    private final C60870cx f302212b;

    /* renamed from: c */
    private final String f302213c;

    public C108658ed(C108660ef efVar, C60870cx cxVar, String str) {
        this.f302211a = efVar;
        this.f302212b = cxVar;
        this.f302213c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (!this.f302212b.isDone() || this.f302212b.isCancelled()) {
            ((C59052c) ((C59052c) C108660ef.f302215a.mo56225c()).mo56372aa(24195)).mo56386p("Send auth code request fails. Show error screen.");
            this.f302211a.f302222h = 4;
            return C58485gu.m89846n(C83875ai.m133537b(new C108634dg()));
        }
        try {
            String str = new String(((C89057m) C90877ak.m148472f(this.f302212b)).mo83036f());
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("errorCode")) {
                if (jSONObject.optInt("errorCode") == 0) {
                    C108617cq cqVar = this.f302211a.f302217c;
                    String str2 = this.f302213c;
                    C49875cf cfVar = C49875cf.ASSISTANT_SDK;
                    C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
                    cnVar.copyOnWrite();
                    C49891cv cvVar = (C49891cv) cnVar.instance;
                    cvVar.f129685x = 0;
                    cvVar.f129664b |= 2;
                    C60870cx b = cqVar.mo97027b(str2, cfVar, (C49891cv) cnVar.build());
                    this.f302211a.f302221g.mo97061e();
                    return C58485gu.m89847o(this.f302211a.f302218d.mo77487a(b, C108657ec.f302210a), new C108659ee(b));
                }
            }
            ((C59052c) ((C59052c) C108660ef.f302215a.mo56225c()).mo56372aa(24197)).mo56389s("Assistant device HTTP returned error: %s", str);
            this.f302211a.f302222h = 4;
            return C58485gu.m89846n(C83875ai.m133537b(new C108634dg()));
        } catch (Exception e) {
            ((C59052c) ((C59052c) C108660ef.f302215a.mo56225c()).mo56372aa(24198)).mo56389s("HandleOemDeviceResponse exception: %s", e.getMessage());
            this.f302211a.f302222h = 4;
            return C58485gu.m89846n(C83875ai.m133537b(new C108634dg()));
        }
    }
}
