package com.google.android.apps.gsa.staticplugins.opaonboarding.p8663g;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83873ag;
import com.google.android.apps.gsa.opaonboarding.C83899be;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.assistant.p3861at.C49875cf;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.g.m */
/* compiled from: PG */
public final class C115895m extends C83873ag {

    /* renamed from: a */
    private final C83899be f321362a;

    public C115895m(C83899be beVar) {
        this.f321362a = beVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo77213a() {
        HashMap hashMap = new HashMap();
        C58485gu b = this.f321362a.mo77295b();
        int size = b.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            String str = (String) b.get(i);
            C58838bb.m90868c(this.f321362a.mo77296c().containsKey(str));
            C49875cf cfVar = (C49875cf) this.f321362a.mo77296c().get(str);
            cfVar.getClass();
            hashMap.put(str, Integer.valueOf(cfVar.f129621v));
        }
        C115892j jVar = (C115892j) C115894l.f321351j.createBuilder();
        boolean h = this.f321362a.mo77301h();
        jVar.copyOnWrite();
        C115894l lVar = (C115894l) jVar.instance;
        lVar.f321353a |= 1;
        lVar.f321354b = h;
        boolean i2 = this.f321362a.mo77302i();
        jVar.copyOnWrite();
        C115894l lVar2 = (C115894l) jVar.instance;
        lVar2.f321353a |= 32;
        lVar2.f321361i = i2;
        jVar.copyOnWrite();
        C115894l lVar3 = (C115894l) jVar.instance;
        C62995dn dnVar = lVar3.f321355c;
        if (!dnVar.f170058b) {
            lVar3.f321355c = dnVar.mo58980a();
        }
        lVar3.f321355c.putAll(hashMap);
        C58485gu b2 = this.f321362a.mo77295b();
        jVar.copyOnWrite();
        C115894l lVar4 = (C115894l) jVar.instance;
        C62971cq cqVar = lVar4.f321356d;
        if (!cqVar.mo58948c()) {
            lVar4.f321356d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) b2, (List) lVar4.f321356d);
        if (this.f321362a.mo77294a() == 1) {
            z = true;
        }
        jVar.copyOnWrite();
        C115894l lVar5 = (C115894l) jVar.instance;
        lVar5.f321353a |= 2;
        lVar5.f321357e = z;
        boolean e = this.f321362a.mo77298e();
        jVar.copyOnWrite();
        C115894l lVar6 = (C115894l) jVar.instance;
        lVar6.f321353a |= 4;
        lVar6.f321358f = e;
        boolean d = this.f321362a.mo77297d();
        jVar.copyOnWrite();
        C115894l lVar7 = (C115894l) jVar.instance;
        lVar7.f321353a |= 8;
        lVar7.f321359g = d;
        boolean f = this.f321362a.mo77299f();
        jVar.copyOnWrite();
        C115894l lVar8 = (C115894l) jVar.instance;
        lVar8.f321353a |= 16;
        lVar8.f321360h = f;
        Bundle bundle = new Bundle();
        bundle.putByteArray("personal_results_args", ((C115894l) jVar.build()).toByteArray());
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C83907bm mo77214j() {
        C83899be beVar = this.f321362a;
        if (!beVar.mo77300g() || beVar.mo77298e()) {
            return new C115891i();
        }
        return new C115904v();
    }
}
