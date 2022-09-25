package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9975i;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83731ac;
import com.google.android.apps.gsa.opa.smartspace.C83734af;
import com.google.android.apps.gsa.opa.smartspace.C83737ai;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9956c.C131191i;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50852x;
import com.google.assistant.p3886c.C50853y;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.i.aa */
/* compiled from: PG */
public final /* synthetic */ class C131340aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131342ac f359053a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f359054b;

    public /* synthetic */ C131340aa(C131342ac acVar, C58485gu guVar) {
        this.f359053a = acVar;
        this.f359054b = guVar;
    }

    public final Object apply(Object obj) {
        Optional optional;
        C131342ac acVar = this.f359053a;
        C58485gu guVar = this.f359054b;
        C58485gu guVar2 = (C58485gu) obj;
        ((C58970a) ((C58970a) acVar.f359056a.mo56224b()).mo56372aa(39222)).mo56387q("Found %d loyalty cards.", guVar2.size());
        if (guVar2.isEmpty()) {
            optional = Optional.empty();
        } else {
            C131343b bVar = (C131343b) guVar2.get(0);
            String str = bVar.mo110145a().f393666h;
            if (str == null) {
                ((C58970a) ((C58970a) acVar.f359056a.mo56225c()).mo56372aa(39225)).mo56386p("Pass has no intent.");
                optional = Optional.empty();
            } else {
                Optional a = acVar.mo110150a(str);
                if (a.isEmpty()) {
                    ((C58970a) ((C58970a) acVar.f359056a.mo56225c()).mo56372aa(39224)).mo56386p("Cannot resolve intent.");
                    optional = Optional.empty();
                } else {
                    Bitmap bitmap = bVar.mo110145a().f393667i;
                    if (bitmap == null) {
                        ((C58970a) ((C58970a) acVar.f359056a.mo56225c()).mo56372aa(39223)).mo56386p("Pass has no logo.");
                        optional = Optional.empty();
                    } else {
                        String str2 = (String) C131342ac.m213813b(bVar.mo110145a().f393661c).orElseGet(new C131362u(acVar, bVar));
                        String str3 = (String) C131342ac.m213813b(bVar.mo110145a().f393662d).orElseGet(new C131363v(acVar));
                        C63087y v = C63088z.m96150v();
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, v);
                        C83730ab abVar = (C83730ab) C83739ak.f228230q.createBuilder();
                        abVar.copyOnWrite();
                        C83739ak akVar = (C83739ak) abVar.instance;
                        str2.getClass();
                        akVar.f228232a |= 2;
                        akVar.f228234c = str2;
                        C50794cr crVar = C50794cr.LOYALTY_CARD;
                        abVar.copyOnWrite();
                        C83739ak akVar2 = (C83739ak) abVar.instance;
                        akVar2.f228239h = crVar.f132222T;
                        akVar2.f228232a |= 64;
                        C83731ac acVar2 = (C83731ac) C83734af.f228216e.createBuilder();
                        acVar2.copyOnWrite();
                        C83734af afVar = (C83734af) acVar2.instance;
                        afVar.f228218a |= 1;
                        afVar.f228219b = "https://www.gstatic.com/images/icons/material/system_gm/2x/place_white_24dp.png";
                        acVar2.copyOnWrite();
                        C83734af afVar2 = (C83734af) acVar2.instance;
                        afVar2.f228220c = 2;
                        afVar2.f228218a |= 2;
                        acVar2.copyOnWrite();
                        C83734af afVar3 = (C83734af) acVar2.instance;
                        afVar3.f228218a |= 4;
                        afVar3.f228221d = true;
                        abVar.mo77053a(acVar2);
                        C83731ac acVar3 = (C83731ac) C83734af.f228216e.createBuilder();
                        acVar3.copyOnWrite();
                        C83734af afVar4 = (C83734af) acVar3.instance;
                        afVar4.f228218a |= 1;
                        afVar4.f228219b = "https://www.gstatic.com/images/icons/material/system_gm/2x/place_black_24dp.png";
                        acVar3.copyOnWrite();
                        C83734af afVar5 = (C83734af) acVar3.instance;
                        afVar5.f228220c = 1;
                        afVar5.f228218a |= 2;
                        acVar3.copyOnWrite();
                        C83734af afVar6 = (C83734af) acVar3.instance;
                        afVar6.f228218a |= 4;
                        afVar6.f228221d = true;
                        abVar.mo77053a(acVar3);
                        C63088z b = v.mo59165b();
                        abVar.copyOnWrite();
                        C83739ak akVar3 = (C83739ak) abVar.instance;
                        b.getClass();
                        akVar3.f228232a |= 4096;
                        akVar3.f228245n = b;
                        String str4 = (String) a.get();
                        abVar.copyOnWrite();
                        C83739ak akVar4 = (C83739ak) abVar.instance;
                        str4.getClass();
                        akVar4.f228232a |= 32;
                        akVar4.f228238g = str4;
                        C49156z a2 = acVar.f359062g.mo110159a();
                        abVar.copyOnWrite();
                        C83739ak akVar5 = (C83739ak) abVar.instance;
                        a2.getClass();
                        akVar5.f228240i = a2;
                        akVar5.f228232a |= 128;
                        C83737ai aiVar = (C83737ai) C83738aj.f228226c.createBuilder();
                        C50852x xVar = (C50852x) C50853y.f132421c.createBuilder();
                        xVar.copyOnWrite();
                        C50853y yVar = (C50853y) xVar.instance;
                        str3.getClass();
                        yVar.f132423a |= 1;
                        yVar.f132424b = str3;
                        aiVar.copyOnWrite();
                        C83738aj ajVar = (C83738aj) aiVar.instance;
                        C50853y yVar2 = (C50853y) xVar.build();
                        yVar2.getClass();
                        ajVar.f228229b = yVar2;
                        ajVar.f228228a = 10;
                        abVar.copyOnWrite();
                        C83739ak akVar6 = (C83739ak) abVar.instance;
                        C83738aj ajVar2 = (C83738aj) aiVar.build();
                        ajVar2.getClass();
                        akVar6.f228233b = ajVar2;
                        akVar6.f228232a |= 1;
                        optional = Optional.m71637of((C83739ak) abVar.build());
                    }
                }
            }
        }
        return C131191i.m213694c(optional, guVar);
    }
}
