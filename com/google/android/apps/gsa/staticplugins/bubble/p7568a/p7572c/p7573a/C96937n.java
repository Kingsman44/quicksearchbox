package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7572c.p7573a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.p7585a.C96971a;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.p7585a.C96972b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.c.a.n */
/* compiled from: PG */
public final /* synthetic */ class C96937n implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C96940q f270946a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f270947b;

    public /* synthetic */ C96937n(C96940q qVar, C58528ij ijVar) {
        this.f270946a = qVar;
        this.f270947b = ijVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C96940q qVar = this.f270946a;
        C58528ij ijVar = this.f270947b;
        C96929f fVar = qVar.f270952c;
        long longValue = ((Long) obj).longValue();
        C96971a aVar = (C96971a) C96972b.f271009d.createBuilder();
        aVar.copyOnWrite();
        C96972b bVar = (C96972b) aVar.instance;
        C62971cq cqVar = bVar.f271012b;
        if (!cqVar.mo58948c()) {
            bVar.f271012b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) ijVar, (List) bVar.f271012b);
        aVar.copyOnWrite();
        C96972b bVar2 = (C96972b) aVar.instance;
        bVar2.f271011a |= 1;
        bVar2.f271013c = longValue;
        C22871g gVar = fVar.f270930a;
        C60870cx a = fVar.f270934e.mo90399a(fVar.f270932c.mo90398d((C96972b) aVar.build()));
        Objects.requireNonNull(fVar.f270933d);
        C60870cx i = gVar.mo28209i(a, "AutoBubbleExtract", new C96926c());
        C22871g gVar2 = fVar.f270931b;
        C96934k kVar = fVar.f270935f;
        Objects.requireNonNull(kVar);
        C90873ag agVar = new C90873ag(i, gVar2, "ScheduledBubbleFetchComplete", new C96927d(kVar));
        Objects.requireNonNull(fVar.f270935f);
        agVar.mo85223a(new C96928e());
        return C118826c.f331422a;
    }
}
