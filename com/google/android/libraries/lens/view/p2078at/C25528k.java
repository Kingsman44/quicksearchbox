package com.google.android.libraries.lens.view.p2078at;

import android.util.Base64;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.C60789b;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58130a;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58131b;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.lens.view.at.k */
/* compiled from: PG */
public final class C25528k {

    /* renamed from: a */
    private static final C58974d f69514a = C58974d.m91135i("XClientDataProvider");

    /* renamed from: b */
    private final C26244b f69515b;

    public C25528k(C26244b bVar) {
        this.f69515b = bVar;
    }

    /* renamed from: a */
    public final C58833ax mo30585a() {
        C58485gu c = this.f69515b.mo31457c();
        C58485gu d = this.f69515b.mo31458d();
        ((C58970a) ((C58970a) f69514a.mo56224b()).mo56372aa(50132)).mo56393w("getClientDataHeader(): num of clientExperimentIds: [%d], num of serverExperimentIds: [%d]", c.size(), d.size());
        if (c.isEmpty() && d.isEmpty()) {
            return C58836b.f156633a;
        }
        C58130a aVar = (C58130a) C58131b.f155403h.createBuilder();
        aVar.mo54672a(c);
        aVar.mo54673b(d);
        byte[] byteArray = ((C58131b) aVar.build()).toByteArray();
        C58130a aVar2 = (C58130a) C58131b.f155403h.createBuilder();
        C63088z A = C63088z.m96139A(C60789b.m92791a(byteArray, byteArray.length));
        aVar2.copyOnWrite();
        C58131b bVar = (C58131b) aVar2.instance;
        bVar.f155405a |= 1;
        bVar.f155406b = A;
        return C58833ax.m90834k(Base64.encodeToString(((C58131b) aVar2.build()).toByteArray(), 10));
    }
}
