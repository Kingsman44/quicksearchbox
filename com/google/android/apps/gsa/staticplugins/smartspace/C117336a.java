package com.google.android.apps.gsa.staticplugins.smartspace;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83784b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.smartspace.p7259c.C92091g;
import com.google.android.apps.gsa.smartspace.p7259c.C92092h;
import com.google.android.apps.gsa.smartspace.p7259c.C92093i;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8466q.C110907c;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.a */
/* compiled from: PG */
public final class C117336a implements C118549h {

    /* renamed from: a */
    private final C83794j f325704a;

    /* renamed from: b */
    private final C83784b f325705b;

    /* renamed from: c */
    private final C58974d f325706c;

    /* renamed from: d */
    private final C110907c f325707d;

    public C117336a(C83794j jVar, C110907c cVar, C83784b bVar, C83564a aVar) {
        this.f325704a = jVar;
        this.f325707d = cVar;
        this.f325705b = bVar;
        this.f325706c = aVar.mo76900a("SmartspaceExpireTask");
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Object obj;
        C60870cx cxVar;
        C62940bt r0 = C62942bv.checkIsLite(C92093i.f256737a);
        akVar.mo58887l(r0);
        Object l = akVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        int i = ((C92092h) obj).f256735b;
        int a = C92091g.m151125a(i);
        if (a == 0 || a == 2) {
            return this.f325705b.mo77117c();
        }
        int a2 = C92091g.m151125a(i);
        if (a2 == 0 || a2 != 3) {
            return C118826c.f331423b;
        }
        if (this.f325704a.f228394e.mo79746e(C90014bt.f247662lQ)) {
            ((C58970a) ((C58970a) this.f325706c.mo56224b()).mo56372aa(32977)).mo56386p("sending weather request query to Opa-Smartspace");
            cxVar = this.f325707d.mo98927a();
        } else {
            cxVar = C118826c.f331423b;
        }
        C60870cx cxVar2 = C118826c.f331423b;
        if (!this.f325704a.f228394e.mo79746e(C90014bt.f247811oG)) {
            cxVar2 = this.f325705b.mo77115a();
        }
        return C118826c.m197212b(Arrays.asList(new C60870cx[]{cxVar2, cxVar}));
    }
}
