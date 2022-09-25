package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.assistant.p3861at.C50182np;
import com.google.assistant.p3861at.C50183nq;
import com.google.assistant.p3861at.C50192nz;
import com.google.assistant.p3861at.C50194oa;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.gn */
/* compiled from: PG */
final class C108722gn extends C83869ac {

    /* renamed from: a */
    final /* synthetic */ C108724gp f302350a;

    /* renamed from: b */
    private final String f302351b;

    public C108722gn(C108724gp gpVar, String str) {
        this.f302350a = gpVar;
        this.f302351b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        C58976aa aaVar = C58975e.f156826a;
        return !C58837ba.m90859h(this.f302351b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        C108617cq cqVar = this.f302350a.f302356b;
        String str = this.f302351b;
        str.getClass();
        C58976aa aaVar = C58975e.f156826a;
        C50182np npVar = (C50182np) C50183nq.f130455e.createBuilder();
        npVar.copyOnWrite();
        C50183nq nqVar = (C50183nq) npVar.instance;
        nqVar.f130457a |= 1;
        nqVar.f130458b = str;
        C50192nz nzVar = (C50192nz) C50194oa.f130485d.createBuilder();
        nzVar.mo53382a((C50183nq) npVar.build());
        return this.f302350a.f302358d.mo77487a(cqVar.mo97030e((C50194oa) nzVar.build()), C108721gm.f302349a);
    }
}
