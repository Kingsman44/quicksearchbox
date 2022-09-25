package com.google.android.libraries.assistant.p1363c.p1364a.p1368b.p1369a;

import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16984h;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16989m;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16990n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.c.a.b.a.e */
/* compiled from: PG */
public final /* synthetic */ class C16955e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C16972v f49543a;

    /* renamed from: b */
    public final /* synthetic */ List f49544b;

    /* renamed from: c */
    public final /* synthetic */ C16984h f49545c;

    public /* synthetic */ C16955e(C16972v vVar, List list, C16984h hVar) {
        this.f49543a = vVar;
        this.f49544b = list;
        this.f49545c = hVar;
    }

    public final void run() {
        C16972v vVar = this.f49543a;
        List list = this.f49544b;
        C16984h hVar = this.f49545c;
        vVar.f49576g.mo6468am(list);
        if (!vVar.f49580k.mo23124j()) {
            vVar.f49576g.mo6017x();
        }
        C16989m mVar = (C16989m) C16990n.f49632b.createBuilder();
        C62971cq cqVar = hVar.f49617a;
        mVar.copyOnWrite();
        C16990n nVar = (C16990n) mVar.instance;
        C62971cq cqVar2 = nVar.f49634a;
        if (!cqVar2.mo58948c()) {
            nVar.f49634a = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) nVar.f49634a);
        vVar.f49582m = (C16990n) mVar.build();
        vVar.f49581l.mo23102l(vVar.f49582m);
    }
}
