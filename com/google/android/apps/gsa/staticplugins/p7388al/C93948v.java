package com.google.android.apps.gsa.staticplugins.p7388al;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83919f;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.gsa.staticplugins.al.v */
/* compiled from: PG */
public final class C93948v extends C84036z {

    /* renamed from: a */
    final C93949w f262365a;

    public C93948v(Bundle bundle) {
        C83919f fVar;
        if (!bundle.containsKey("DeviceScanConfig")) {
            fVar = C83919f.f228563e;
        } else {
            fVar = (C83919f) ProtoParsers.m95522e(bundle, "DeviceScanConfig", C83919f.f228563e, C62921ba.m95368a());
        }
        this.f262365a = C93950x.m154994a(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        return C58485gu.m89846n(this.f262365a);
    }
}
