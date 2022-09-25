package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a;

import com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a.C79916q;
import com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a.C79918s;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.nio.ByteBuffer;
import java.util.HashMap;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C111895ag implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111896ah f310919a;

    public /* synthetic */ C111895ag(C111896ah ahVar) {
        this.f310919a = ahVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111896ah ahVar = this.f310919a;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            ((C59052c) ((C59052c) C111897ai.f310924b.mo56226d()).mo56372aa(27475)).mo56386p("Load no ByteBuffer from MDD.");
            C111897ai.f310923a.mo105240i("no_mdd_data");
            return new C111897ai(C58729pv.f156485a, 0, "no_data");
        }
        try {
            int a = (int) ahVar.f310920a.mo79743a(C90063do.f249547fb);
            C79916q qVar = (C79916q) C62942bv.parseFrom((C62942bv) C79916q.f219049e, (ByteBuffer) optional.get(), C62921ba.m95368a());
            int i = qVar.f219051a;
            if ((i & 1) != 0) {
                int i2 = qVar.f219053c;
                String str = ((i & 2) != 0 ? qVar.f219054d : "unknown_version") + "_top" + a;
                HashMap hashMap = new HashMap();
                for (C79918s sVar : qVar.f219052b) {
                    if ((sVar.f219057a & 1) != 0 && !sVar.f219059c.isEmpty()) {
                        C62971cq cqVar = sVar.f219059c;
                        hashMap.put(sVar.f219058b, C58485gu.m89842j(cqVar.subList(0, Math.min(a, cqVar.size()))));
                    }
                }
                C111897ai.f310923a.mo105240i("mdd_data_load_success");
                ((C59052c) ((C59052c) C111897ai.f310924b.mo56226d()).mo56372aa(27472)).mo56386p("mdd_data_load_success.");
                return new C111897ai(C58495hd.m89898l(hashMap), i2, str);
            }
            ((C59052c) ((C59052c) C111897ai.f310924b.mo56226d()).mo56372aa(27474)).mo56386p("MDD data has no N gram length.");
            C111897ai.f310923a.mo105240i("missing_ngram_length");
            return new C111897ai(C58729pv.f156485a, 0, "no_data");
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C111897ai.f310924b.mo56226d()).mo56382g(e)).mo56372aa(27473)).mo56386p("Error when parsing prefetching global predictions.");
            C111897ai.f310923a.mo105240i("mdd_data_load_fail");
            return new C111897ai(C58729pv.f156485a, 0, "no_data");
        }
    }
}
