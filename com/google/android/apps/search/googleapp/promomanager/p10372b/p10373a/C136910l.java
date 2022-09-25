package com.google.android.apps.search.googleapp.promomanager.p10372b.p10373a;

import com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63954r;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b.C63881m;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b.C63882n;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.a.l */
/* compiled from: PG */
public final class C136910l implements C136903e {

    /* renamed from: a */
    private static final C58974d f372621a = C58974d.m91135i("SearchRequestStatePE");

    /* renamed from: a */
    public final C60870cx mo113438a(C63955s sVar, C137009dj djVar) {
        Object obj;
        C58970a aVar = (C58970a) ((C58970a) f372621a.mo56224b()).mo56372aa(40886);
        C63954r a = C63954r.m96325a(sVar.f172968a);
        if (a == null) {
            a = C63954r.TYPE_UNSPECIFIED;
        }
        aVar.mo56389s("Evaluating %s Condition Predicate", a.name());
        C62940bt r0 = C62942bv.checkIsLite(C63882n.f172731d);
        sVar.mo58887l(r0);
        if (sVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C63882n.f172731d);
            sVar.mo58887l(r02);
            Object l = sVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            C63882n nVar = (C63882n) obj;
            if ((nVar.f172733a & 1) != 0) {
                int a2 = C63881m.m96316a(nVar.f172734b);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i = a2 - 1;
                if (i == 1) {
                    return C60856cj.m92900i(Boolean.valueOf(djVar.f372884d));
                }
                if (i != 2) {
                    return C60856cj.m92899h(new IllegalArgumentException("Condition predicate should have request mode but has none"));
                }
                return C60856cj.m92900i(Boolean.valueOf(djVar.f372885e));
            }
        }
        return C60856cj.m92899h(new IllegalArgumentException("Invalid configuration"));
    }
}
