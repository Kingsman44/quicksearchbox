package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C50173ng;
import com.google.assistant.p3861at.C50174nh;
import com.google.assistant.p3861at.C50175ni;
import com.google.assistant.p3861at.C50189nw;
import com.google.assistant.p3861at.C50192nz;
import com.google.assistant.p3861at.C50194oa;
import com.google.assistant.p3861at.acz;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ba */
/* compiled from: PG */
public final /* synthetic */ class C108569ba implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C108578bj f302020a;

    public /* synthetic */ C108569ba(C108578bj bjVar) {
        this.f302020a = bjVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C108578bj bjVar = this.f302020a;
        C62971cq<C50173ng> cqVar = ((C50189nw) obj).f130475b;
        C58480gp e = C58485gu.m89837e();
        for (C50173ng ngVar : cqVar) {
            if (ngVar.f130428h) {
                C50174nh nhVar = (C50174nh) C50175ni.f130433d.createBuilder();
                String str = ngVar.f130422b;
                nhVar.copyOnWrite();
                C50175ni niVar = (C50175ni) nhVar.instance;
                str.getClass();
                niVar.f130435a |= 1;
                niVar.f130436b = str;
                nhVar.copyOnWrite();
                C50175ni niVar2 = (C50175ni) nhVar.instance;
                niVar2.f130435a |= 64;
                niVar2.f130437c = true;
                e.mo55395g((C50175ni) nhVar.build());
            }
        }
        C58485gu f = e.mo55394f();
        if (f.isEmpty()) {
            C59104x d = C108578bj.f302033a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DeviceDiscoverySeq");
            ((C59052c) ((C59052c) d).mo56372aa(24143)).mo56386p("No Discoverable Devices");
            return C60856cj.m92900i(acz.f129010n);
        }
        C108617cq cqVar2 = bjVar.f302039g;
        C58976aa aaVar = C58975e.f156826a;
        C50192nz nzVar = (C50192nz) C50194oa.f130485d.createBuilder();
        nzVar.copyOnWrite();
        C50194oa oaVar = (C50194oa) nzVar.instance;
        C62971cq cqVar3 = oaVar.f130488b;
        if (!cqVar3.mo58948c()) {
            oaVar.f130488b = C62942bv.mutableCopy(cqVar3);
        }
        C62947c.addAll((Iterable) f, (List) oaVar.f130488b);
        C60870cx e2 = cqVar2.mo97030e((C50194oa) nzVar.build());
        C90877ak.m148481o(e2, "DeviceDiscoverySeq", "OpenPort success", "OpenPort failure");
        return e2;
    }
}
