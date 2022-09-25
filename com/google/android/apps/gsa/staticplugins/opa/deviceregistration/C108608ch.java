package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.accounts.Account;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.assistant.p3861at.C49842b;
import com.google.assistant.p3861at.C49923e;
import com.google.assistant.p3861at.C49950f;
import com.google.assistant.p3861at.C50182np;
import com.google.assistant.p3861at.C50183nq;
import com.google.assistant.p3861at.C50192nz;
import com.google.assistant.p3861at.C50194oa;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ch */
/* compiled from: PG */
public final /* synthetic */ class C108608ch implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C108617cq f302124a;

    /* renamed from: b */
    public final /* synthetic */ String f302125b;

    public /* synthetic */ C108608ch(C108617cq cqVar, String str) {
        this.f302124a = cqVar;
        this.f302125b = str;
    }

    public final C60870cx apply(Object obj) {
        C108617cq cqVar = this.f302124a;
        String str = this.f302125b;
        C50182np npVar = (C50182np) C50183nq.f130455e.createBuilder();
        npVar.copyOnWrite();
        C50183nq nqVar = (C50183nq) npVar.instance;
        nqVar.f130457a |= 4;
        nqVar.f130459c = str;
        C50192nz nzVar = (C50192nz) C50194oa.f130485d.createBuilder();
        nzVar.mo53382a((C50183nq) npVar.build());
        C50194oa oaVar = (C50194oa) nzVar.build();
        acw acw = (acw) acx.f128971H.createBuilder();
        C49923e eVar = (C49923e) C49950f.f129847h.createBuilder();
        boolean z = ((C49842b) ((C58833ax) obj).mo56109e(C49842b.f129519l)).f129529i;
        eVar.copyOnWrite();
        C49950f fVar = (C49950f) eVar.instance;
        fVar.f129849a |= 64;
        fVar.f129852d = z;
        C49950f fVar2 = (C49950f) eVar.build();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        fVar2.getClass();
        acx.f128989f = fVar2;
        acx.f128984a |= 8;
        acw.copyOnWrite();
        acx acx2 = (acx) acw.instance;
        oaVar.getClass();
        acx2.f128990g = oaVar;
        acx2.f128984a |= 16;
        C108616cp e = C108616cp.m180628e();
        cqVar.f302138c.n((Account) ((C83893b) cqVar.f302137b.mo27525b()).mo77278a().mo56107c(), (acx) acw.build(), e, cqVar.getClass().getSimpleName());
        return e.f302134a;
    }
}
