package com.google.android.libraries.gsa.actionusermodel.p1831d;

import com.google.android.libraries.gsa.actionusermodel.C22066ax;
import com.google.android.libraries.gsa.actionusermodel.C22067ay;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22099b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p5129p.p5131b.C65768az;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.d.b */
/* compiled from: PG */
public final /* synthetic */ class C22122b implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C22122b f60961a = new C22122b();

    private /* synthetic */ C22122b() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C22099b bVar = (C22099b) obj;
        C22066ax axVar = (C22066ax) C22067ay.f60801d.createBuilder();
        if ((bVar.f60910a & 1) != 0) {
            C65768az azVar = bVar.f60911b;
            if (azVar == null) {
                azVar = C65768az.f178793f;
            }
            axVar.copyOnWrite();
            C22067ay ayVar = (C22067ay) axVar.instance;
            azVar.getClass();
            ayVar.f60804b = azVar;
            ayVar.f60803a |= 1;
        }
        C62971cq cqVar = bVar.f60912c;
        axVar.copyOnWrite();
        C22067ay ayVar2 = (C22067ay) axVar.instance;
        C62971cq cqVar2 = ayVar2.f60805c;
        if (!cqVar2.mo58948c()) {
            ayVar2.f60805c = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) ayVar2.f60805c);
        return (C22067ay) axVar.build();
    }
}
