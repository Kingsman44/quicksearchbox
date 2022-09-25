package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.engine.au.f;
import com.google.android.apps.gsa.nga.engine.au.g;
import com.google.android.apps.gsa.nga.engine.understanding.p6241h.C79142a;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80052af;
import com.google.android.apps.gsa.nga.shared.p6274a.C80053ag;
import com.google.android.apps.gsa.nga.shared.p6274a.C80078x;
import com.google.knowledge.p4661a.p4662a.C61761w;
import com.google.knowledge.p4661a.p4662a.C61762x;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.z */
/* compiled from: PG */
public final /* synthetic */ class C79328z implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79142a f217838a;

    public /* synthetic */ C79328z(C79142a aVar) {
        this.f217838a = aVar;
    }

    public final void accept(Object obj) {
        C79142a aVar = this.f217838a;
        String str = (String) obj;
        C61761w wVar = (C61761w) C61762x.f166835e.createBuilder();
        C62940bt btVar = g.c;
        f createBuilder = g.b.createBuilder();
        C80078x xVar = (C80078x) C80047aa.f219655i.createBuilder();
        C80052af afVar = (C80052af) C80053ag.f219675f.createBuilder();
        afVar.copyOnWrite();
        str.getClass();
        ((C80053ag) afVar.instance).f219677a = str;
        xVar.copyOnWrite();
        C80047aa aaVar = (C80047aa) xVar.instance;
        C80053ag agVar = (C80053ag) afVar.build();
        agVar.getClass();
        aaVar.f219658b = agVar;
        aaVar.f219657a = 10;
        createBuilder.copyOnWrite();
        g gVar = createBuilder.instance;
        C80047aa aaVar2 = (C80047aa) xVar.build();
        aaVar2.getClass();
        C62971cq cqVar = gVar.a;
        if (!cqVar.mo58948c()) {
            gVar.a = C62942bv.mutableCopy(cqVar);
        }
        gVar.a.add(aaVar2);
        wVar.mo58885m(btVar, createBuilder.build());
        aVar.mo73814d("entity", str, (C61762x) wVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
