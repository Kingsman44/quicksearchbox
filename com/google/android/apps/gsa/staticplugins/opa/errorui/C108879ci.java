package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.assistant.p3897e.p3929l.p3930a.C52708bn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65849r;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ci */
/* compiled from: PG */
final class C108879ci extends C83869ac {

    /* renamed from: a */
    final C60870cx f302730a;

    /* renamed from: b */
    Optional f302731b = Optional.empty();

    public C108879ci(C60870cx cxVar) {
        this.f302730a = cxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        C108874cd cdVar = new C108874cd();
        if (this.f302731b.isPresent()) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("opa_android:morris_permissions", ((C52686as) this.f302731b.get()).toByteArray());
            cdVar.setArguments(bundle);
        }
        return C83875ai.m133537b(cdVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        C58485gu guVar;
        C52686as asVar;
        if (!this.f302730a.isDone()) {
            return true;
        }
        try {
            guVar = (C58485gu) C60856cj.m92909r(this.f302730a);
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C108881ck.f302733a.mo56226d()).mo56382g(e)).mo56372aa(24409)).mo56386p("Exception thrown by Future expected to be done");
            guVar = C58485gu.m89845m();
        }
        if (guVar.isEmpty()) {
            return true;
        }
        Optional findFirst = Collection.EL.stream(guVar).findFirst();
        if (!findFirst.isPresent() || ((C65849r) findFirst.get()).f179004a != 10) {
            return true;
        }
        C65849r rVar = (C65849r) findFirst.get();
        if (rVar.f179004a == 10) {
            asVar = (C52686as) rVar.f179005b;
        } else {
            asVar = C52686as.f138291q;
        }
        Optional of = Optional.m71637of(asVar);
        this.f302731b = of;
        C52708bn a = C52708bn.m86698a(((C52686as) of.get()).f138295c);
        if (a == null) {
            a = C52708bn.BT_TRIGGER_DEFAULT;
        }
        return a == C52708bn.BT_TRIGGER_DEFAULT || a == C52708bn.BT_TRIGGER_UNKNOWN_STATE;
    }
}
