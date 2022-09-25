package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.assistant.p3861at.C49842b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.dx */
/* compiled from: PG */
final class C108651dx extends C84036z {

    /* renamed from: a */
    private final C60870cx f302197a;

    public C108651dx(C60870cx cxVar) {
        this.f302197a = cxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        C58833ax axVar = C58836b.f156633a;
        if (this.f302197a.isDone()) {
            try {
                axVar = (C58833ax) C90877ak.m148472f(this.f302197a);
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) C108660ef.f302215a.mo56226d()).mo56382g(e)).mo56372aa(24188)).mo56386p("Failed to parse AboutMeSettingsUiFuture");
            }
        } else {
            ((C59052c) ((C59052c) C108660ef.f302215a.mo56226d()).mo56372aa(24187)).mo56386p("AboutMeSettingUiFuture not don");
        }
        C108584bp bpVar = new C108584bp();
        Bundle bundle = new Bundle();
        if (axVar.mo56113h()) {
            bundle.putByteArray("about-me", ((C49842b) axVar.mo56107c()).toByteArray());
        }
        return C58485gu.m89846n(C83875ai.m133540e(bpVar, bundle));
    }
}
