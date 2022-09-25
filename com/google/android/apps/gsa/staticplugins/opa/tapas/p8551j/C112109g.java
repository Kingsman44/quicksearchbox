package com.google.android.apps.gsa.staticplugins.opa.tapas.p8551j;

import com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a.C79910k;
import com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a.C79912m;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.j.g */
/* compiled from: PG */
public final /* synthetic */ class C112109g implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C112109g f311330a = new C112109g();

    private /* synthetic */ C112109g() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Optional optional = (Optional) obj;
        C121537f fVar = C112110h.f311331a;
        if (optional.isEmpty()) {
            ((C59052c) ((C59052c) C112110h.f311332b.mo56226d()).mo56372aa(27573)).mo56386p("Load no ByteBuffer from MDD.");
            C112110h.f311331a.mo105240i("no_mdd_data");
            return C58729pv.f156485a;
        }
        try {
            C62921ba a = C62921ba.m95368a();
            C79912m mVar = C79912m.f219043b;
            HashMap hashMap = new HashMap();
            for (C79910k kVar : ((C79912m) C62942bv.parseFrom((C62942bv) mVar, (ByteBuffer) optional.get(), a)).f219045a) {
                if ((kVar.f219040a & 2) != 0 && !kVar.f219042c.isEmpty()) {
                    hashMap.put(kVar.f219041b, (C58485gu) Collection.EL.stream(kVar.f219042c).map(C112107e.f311328a).collect(C58370cn.f155946a));
                }
            }
            C112110h.f311331a.mo105240i("mdd_data_load_success");
            return C58495hd.m89898l(hashMap);
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C112110h.f311332b.mo56226d()).mo56382g(e)).mo56372aa(27572)).mo56386p("Error when parsing offline suggestions.");
            C112110h.f311331a.mo105240i("mdd_data_load_fail");
            return C58729pv.f156485a;
        }
    }
}
