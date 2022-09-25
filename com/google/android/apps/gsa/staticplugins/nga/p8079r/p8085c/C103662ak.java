package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.assistant.shared.appactions.h.s;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80153cb;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80154cc;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.protobuf.C62971cq;
import java.util.HashSet;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.ak */
/* compiled from: PG */
public final /* synthetic */ class C103662ak implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C103669ar f288745a;

    /* renamed from: b */
    public final /* synthetic */ C80275dd f288746b;

    public /* synthetic */ C103662ak(C103669ar arVar, C80275dd ddVar) {
        this.f288745a = arVar;
        this.f288746b = ddVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C80154cc ccVar;
        C103669ar arVar = this.f288745a;
        C80275dd ddVar = this.f288746b;
        C58495hd hdVar = (C58495hd) obj;
        C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
        C80153cb cbVar = (C80153cb) C80154cc.f219951b.createBuilder();
        if (ddVar.f220290a == 8) {
            ccVar = (C80154cc) ddVar.f220291b;
        } else {
            ccVar = C80154cc.f219951b;
        }
        C62971cq cqVar = ccVar.f219953a;
        C91142g gVar = arVar.f288758e;
        cbVar.mo74286a((C58485gu) Collection.EL.stream(cqVar).map(new s(hdVar, new HashSet(), gVar)).collect(C58370cn.f155946a));
        buVar.copyOnWrite();
        C80275dd ddVar2 = (C80275dd) buVar.instance;
        C80154cc ccVar2 = (C80154cc) cbVar.build();
        ccVar2.getClass();
        ddVar2.f220291b = ccVar2;
        ddVar2.f220290a = 8;
        return (C80275dd) buVar.build();
    }
}
