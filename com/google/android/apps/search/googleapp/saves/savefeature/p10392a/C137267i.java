package com.google.android.apps.search.googleapp.saves.savefeature.p10392a;

import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137255m;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137256n;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57637d;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.i */
/* compiled from: PG */
public final /* synthetic */ class C137267i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C57637d f373440a;

    public /* synthetic */ C137267i(C57637d dVar) {
        this.f373440a = dVar;
    }

    public final Object apply(Object obj) {
        C57637d dVar = this.f373440a;
        Void voidR = (Void) obj;
        C59071e eVar = C137274p.f373449a;
        C62971cq cqVar = dVar.f153938a;
        C57578av avVar = dVar.f153939b;
        if (avVar == null) {
            avVar = C57578av.f153822h;
        }
        C137255m mVar = (C137255m) C137256n.f373416c.createBuilder();
        mVar.copyOnWrite();
        avVar.getClass();
        ((C137256n) mVar.instance).f373418a = avVar;
        if (!cqVar.isEmpty()) {
            C57569am amVar = (C57569am) cqVar.get(0);
            mVar.copyOnWrite();
            amVar.getClass();
            ((C137256n) mVar.instance).f373419b = amVar;
            if (cqVar.size() != 1) {
                ((C59052c) ((C59052c) C137274p.f373449a.mo56226d()).mo56372aa(40946)).mo56386p("Multiple items returned in save response, expected 1.");
            }
        }
        return (C137256n) mVar.build();
    }
}
