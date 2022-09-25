package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a;

import com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a.C79914o;
import com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a.C79918s;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.nio.ByteBuffer;
import java.util.HashMap;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.al */
/* compiled from: PG */
public final /* synthetic */ class C111900al implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C111900al f310929a = new C111900al();

    private /* synthetic */ C111900al() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            ((C59052c) ((C59052c) C111903ao.f310934b.mo56226d()).mo56372aa(27479)).mo56386p("Load no ByteBuffer from MDD.");
            C111903ao.f310933a.mo105240i("no_mdd_data");
            return C58729pv.f156485a;
        }
        try {
            C62921ba a = C62921ba.m95368a();
            C79914o oVar = C79914o.f219046b;
            HashMap hashMap = new HashMap();
            for (C79918s sVar : ((C79914o) C62942bv.parseFrom((C62942bv) oVar, (ByteBuffer) optional.get(), a)).f219048a) {
                if ((sVar.f219057a & 1) != 0 && !sVar.f219059c.isEmpty()) {
                    hashMap.put(sVar.f219058b, (C58485gu) Collection.EL.stream(sVar.f219059c).map(new C111901am(sVar)).collect(C58370cn.f155946a));
                }
            }
            C111903ao.f310933a.mo105240i("mdd_data_load_success");
            return C58495hd.m89898l(hashMap);
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C111903ao.f310934b.mo56226d()).mo56382g(e)).mo56372aa(27478)).mo56386p("Error when parsing prefetching global predictions.");
            C111903ao.f310933a.mo105240i("mdd_data_load_fail");
            return C58729pv.f156485a;
        }
    }
}
