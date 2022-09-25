package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112037ao;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.C48570ad;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.common.p4552o.p4553a.C59525cv;
import com.google.common.p4552o.p4553a.C59527cx;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.f */
/* compiled from: PG */
public final class C112698f {

    /* renamed from: a */
    private final C112037ao f312428a;

    public C112698f(C112037ao aoVar) {
        this.f312428a = aoVar;
    }

    /* renamed from: a */
    public final C59527cx mo99664a(C113415ez ezVar, int i) {
        C59525cv cvVar = (C59525cv) ezVar.mo100214n().toBuilder();
        cvVar.copyOnWrite();
        C59527cx cxVar = (C59527cx) cvVar.instance;
        cxVar.f157949a |= 8;
        cxVar.f157952d = false;
        cvVar.copyOnWrite();
        C59527cx cxVar2 = (C59527cx) cvVar.instance;
        cxVar2.f157949a |= 2;
        cxVar2.f157951c = i;
        double b = ezVar.mo100202b();
        cvVar.copyOnWrite();
        C59527cx cxVar3 = (C59527cx) cvVar.instance;
        cxVar3.f157949a |= 1024;
        cxVar3.f157958j = b;
        double a = ezVar.mo100201a();
        cvVar.copyOnWrite();
        C59527cx cxVar4 = (C59527cx) cvVar.instance;
        cxVar4.f157949a |= 2048;
        cxVar4.f157959k = a;
        int f = ezVar.mo100206f();
        cvVar.copyOnWrite();
        C59527cx cxVar5 = (C59527cx) cvVar.instance;
        cxVar5.f157949a |= 16;
        cxVar5.f157953e = f;
        C48580an j = ezVar.mo100210j();
        cvVar.copyOnWrite();
        C59527cx cxVar6 = (C59527cx) cvVar.instance;
        cxVar6.f157954f = j.getNumber();
        cxVar6.f157949a |= 32;
        int e = ezVar.mo100205e();
        cvVar.copyOnWrite();
        C59527cx cxVar7 = (C59527cx) cvVar.instance;
        cxVar7.f157949a |= 64;
        cxVar7.f157955g = e;
        int i2 = ezVar.mo100211k().f125915O;
        cvVar.copyOnWrite();
        C59527cx cxVar8 = (C59527cx) cvVar.instance;
        cxVar8.f157949a |= 128;
        cxVar8.f157956h = i2;
        int d = ezVar.mo100204d();
        cvVar.copyOnWrite();
        C59527cx cxVar9 = (C59527cx) cvVar.instance;
        cxVar9.f157949a |= 1;
        cxVar9.f157950b = d;
        Optional P = ezVar.mo100057P();
        if (P.isPresent()) {
            Optional e2 = this.f312428a.mo99348a((C48570ad) P.get()).mo99343e();
            Objects.requireNonNull(cvVar);
            e2.ifPresent(new C112697e(cvVar));
        }
        return (C59527cx) cvVar.build();
    }
}
