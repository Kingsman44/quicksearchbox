package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60321oe;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ee */
/* compiled from: PG */
final class C108659ee extends C84036z {

    /* renamed from: a */
    private final C60870cx f302214a;

    public C108659ee(C60870cx cxVar) {
        this.f302214a = cxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (!this.f302214a.isDone() || (((C60873d) this.f302214a).value instanceof C60873d.C60875b)) {
            ((C59052c) ((C59052c) C108660ef.f302215a.mo56225c()).mo56372aa(24199)).mo56386p("Failed to mark device as linked.");
            return C58485gu.m89845m();
        }
        C89949q.m146525j(C108607cg.m180627a(13), (C60321oe) null, (C63196b) null, (String) null);
        return C58485gu.m89845m();
    }
}
